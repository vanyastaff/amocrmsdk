package com.amocrm.amocrmsdk.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.*;

public class URLBuilder {


    /**
     * Build URL string from Map of params. Nested Map and Collection is also supported
     *
     * @param params   Map of params for constructing the URL Query String
     * @param encoding encoding type. If not set the "UTF-8" is selected by default
     * @return String of type key=value&...key=value
     * @throws java.io.UnsupportedEncodingException if encoding isnot supported
     */
    public static String httpBuildQuery(Map<String, Object> params, String encoding) {
        if (isEmpty(encoding)) {
            encoding = "UTF-8";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Object> entry : params.entrySet()) {
            if (sb.length() > 0) {
                sb.append('&');
            }

            String name = entry.getKey();
            Object value = entry.getValue();


            if (value instanceof Map) {
                List<String> baseParam = new ArrayList<String>();
                baseParam.add(name);
                String str = buildUrlFromMap(baseParam, (Map) value, encoding);
                sb.append(str);

            } else if (value instanceof Collection) {
                List<String> baseParam = new ArrayList<String>();
                baseParam.add(name);
                String str = buildUrlFromCollection(baseParam, (Collection) value, encoding);
                sb.append(str);

            } else {
                sb.append(encodeParam(name));
                sb.append("=");
                sb.append(encodeParam(value));
            }


        }
        return sb.toString();
    }

    private static String buildUrlFromMap(List<String> baseParam, Map<Object, Object> map, String encoding) {
        StringBuilder sb = new StringBuilder();
        String token;

        //Build string of first level - related with params of provided Map
        for (Map.Entry<Object, Object> entry : map.entrySet()) {

            if (sb.length() > 0) {
                sb.append('&');
            }

            String name = String.valueOf(entry.getKey());
            Object value = entry.getValue();
            if (value instanceof Map) {
                List<String> baseParam2 = new ArrayList<String>(baseParam);
                baseParam2.add(name);
                String str = buildUrlFromMap(baseParam2, (Map) value, encoding);
                sb.append(str);

            } else if (value instanceof List) {
                List<String> baseParam2 = new ArrayList<String>(baseParam);
                baseParam2.add(name);
                String str = buildUrlFromCollection(baseParam2, (List) value, encoding);
                sb.append(str);
            } else {
                token = getBaseParamString(baseParam) + "[" + name + "]=" + encodeParam(value);
                sb.append(token);
            }
        }

        return sb.toString();
    }

    private static String buildUrlFromCollection(List<String> baseParam, Collection coll, String encoding) {
        StringBuilder sb = new StringBuilder();
        String token;
        if (!(coll instanceof List)) {
            coll = new ArrayList(coll);
        }
        List arrColl = (List) coll;

        //Build string of first level - related with params of provided Map
        for (int i = 0; i < arrColl.size(); i++) {

            if (sb.length() > 0) {
                sb.append('&');
            }

            Object value = (Object) arrColl.get(i);
            if (value instanceof Map) {
                List<String> baseParam2 = new ArrayList<String>(baseParam);
                baseParam2.add(String.valueOf(i));
                String str = buildUrlFromMap(baseParam2, (Map) value, encoding);
                sb.append(str);

            } else if (value instanceof List) {
                List<String> baseParam2 = new ArrayList<String>(baseParam);
                baseParam2.add(String.valueOf(i));
                String str = buildUrlFromCollection(baseParam2, (List) value, encoding);
                sb.append(str);
            } else {
                token = getBaseParamString(baseParam) + "[" + i + "]=" + encodeParam(value);
                sb.append(token);
            }
        }

        return sb.toString();
    }


    private static String getBaseParamString(List<String> baseParam) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < baseParam.size(); i++) {
            String s = baseParam.get(i);
            if (i == 0) {
                sb.append(s);
            } else {
                sb.append("[" + s + "]");
            }
        }
        return sb.toString();
    }

    /**
     * Check if String is either empty or null
     *
     * @param str string to check
     * @return true if string is empty. Else return false
     */
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }


    private static String encodeParam(Object param) {
        try {
            return URLEncoder.encode(String.valueOf(param), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            return URLEncoder.encode(String.valueOf(param));
        }
    }
}