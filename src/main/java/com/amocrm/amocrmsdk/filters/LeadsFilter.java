package com.amocrm.amocrmsdk.filters;

import com.amocrm.amocrmsdk.client.AbstractFilter;
import com.amocrm.amocrmsdk.collections.LeadsCollection;
import com.amocrm.amocrmsdk.objects.base.FilterValue;
import com.amocrm.amocrmsdk.objects.base.filter_values.IntegerArrayFilterValue;
import com.amocrm.amocrmsdk.objects.base.filter_values.ObjectArrayFilterValue;
import com.amocrm.amocrmsdk.objects.base.filter_values.RangeFilterValue;
import com.amocrm.amocrmsdk.objects.base.filter_values.StringArrayFilterValue;
import com.google.gson.annotations.SerializedName;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

@Accessors(fluent = true, chain = true)
public class LeadsFilter extends AbstractFilter<LeadsFilter, LeadsCollection> {

    @SerializedName("id")
    private IntegerArrayFilterValue id;

    @SerializedName("name")
    private StringArrayFilterValue name;

    @SerializedName("price")
    private RangeFilterValue price;

    @SerializedName("statuses")
    private ObjectArrayFilterValue statuses;

    @SerializedName("pipeline_id")
    private IntegerArrayFilterValue pipelineId;

    @SerializedName("created_by")
    private IntegerArrayFilterValue createdBy;

    @SerializedName("updated_by")
    private IntegerArrayFilterValue updatedBy;

    @SerializedName("created_at")
    private RangeFilterValue createdAt;

    @SerializedName("updated_at")
    private RangeFilterValue updatedAt;

    @SerializedName("closed_at")
    private RangeFilterValue closedAt;

    @SerializedName("closest_task_at")
    private RangeFilterValue closestTaskAt;

    @SerializedName("custom_fields_value")
    private Collection<FilterValue> customFieldsValue;

    public LeadsFilter id(Integer value) {
        id = new IntegerArrayFilterValue(value);
        return this;
    }
    public LeadsFilter id(ArrayList<Integer> value) {
        id = new IntegerArrayFilterValue(value);
        return this;
    }

    public LeadsFilter id(IntegerArrayFilterValue value) {
        id = value;
        return this;
    }

    public Collection<Integer> id() {
        return id.getProperty();
    }

    public  LeadsFilter name(String value) {
        name = new StringArrayFilterValue(value);
        return this;
    }

    public  LeadsFilter name(ArrayList<String> value) {
        name = new StringArrayFilterValue(value);
        return this;
    }

    public  LeadsFilter name(StringArrayFilterValue value) {
        name = value;
        return this;
    }

    public Collection<String> name() {
        return name.getProperty();
    }

    public  LeadsFilter price(Integer from, Integer to) {
        price = new RangeFilterValue(from, to);
        return this;
    }

    public  LeadsFilter price(Map<String, Integer> value) {
        price = new RangeFilterValue(value);
        return this;
    }

    public LeadsFilter price(RangeFilterValue value) {
        price = value;
        return this;
    }

    public Map<String, Integer> price() {
        return price.getProperty();
    }

    public LeadsFilter statuses(Collection<Map<String, Object>> value) {
        statuses = new ObjectArrayFilterValue(value);
        return this;
    }

    public LeadsFilter statuses(Map<String, Object> value) {
        statuses = new ObjectArrayFilterValue(value);
        return this;
    }

    public LeadsFilter statuses(ObjectArrayFilterValue value) {
        statuses = value;
        return this;
    }

    public LeadsFilter pipelineId(ArrayList<Integer> value) {
        pipelineId = new IntegerArrayFilterValue(value);
        return this;
    }

    public LeadsFilter pipelineId(Integer value) {
        pipelineId = new IntegerArrayFilterValue(value);
        return this;
    }

    public LeadsFilter pipelineId(IntegerArrayFilterValue value) {
        pipelineId = value;
        return this;
    }

    public Collection<Integer> pipelineId() {
        return pipelineId.getProperty();
    }

    public LeadsFilter createdBy(Integer value) {
        createdBy = new IntegerArrayFilterValue(value);
        return this;
    }

    public LeadsFilter createdBy(Collection<Integer> value) {
        createdBy = new IntegerArrayFilterValue(value);
        return this;
    }

    public LeadsFilter createdBy(IntegerArrayFilterValue value) {
        createdBy = value;
        return this;
    }

    public Collection<Integer> createdBy() {
        return createdBy.getProperty();
    }

    public LeadsFilter updatedBy(Integer value) {
        updatedBy = new IntegerArrayFilterValue(value);
        return this;
    }

    public LeadsFilter updatedBy(Collection<Integer> value) {
        updatedBy = new IntegerArrayFilterValue(value);
        return this;
    }

    public LeadsFilter updatedBy(IntegerArrayFilterValue value) {
        updatedBy = value;
        return this;
    }

    public Collection<Integer> updatedBy() {
        return updatedBy.getProperty();
    }

    public LeadsFilter createdAt(Integer from, Integer to) {
        createdAt = new RangeFilterValue(from, to);
        return this;
    }

    public LeadsFilter createdAt(Map<String, Integer> value) {
        createdAt = new RangeFilterValue(value);
        return this;
    }

    public LeadsFilter createdAt(RangeFilterValue value) {
        createdAt = value;
        return this;
    }

    public Map<String, Integer> createdAt() {
        return createdAt.getProperty();
    }

    public LeadsFilter updatedAt(Integer from, Integer to) {
        updatedAt = new RangeFilterValue(from, to);
        return this;
    }

    public LeadsFilter updatedAt(Map<String, Integer> value) {
        updatedAt = new RangeFilterValue(value);
        return this;
    }

    public LeadsFilter updatedAt(RangeFilterValue value) {
        updatedAt = value;
        return this;
    }

    public Map<String, Integer> updatedAt() {
        return updatedAt.getProperty();
    }

    public LeadsFilter closedAt(Integer from, Integer to) {
        closedAt = new RangeFilterValue(from, to);
        return this;
    }

    public LeadsFilter closedAt(Map<String, Integer> value) {
        closedAt = new RangeFilterValue(value);
        return this;
    }

    public LeadsFilter closedAt(RangeFilterValue value) {
        closedAt = value;
        return this;
    }

    public Map<String, Integer> closedAt() {
        return closedAt.getProperty();
    }

    public LeadsFilter closestTaskAt(Integer from, Integer to) {
        closestTaskAt = new RangeFilterValue(from, to);
        return this;
    }

    public LeadsFilter closestTaskAt(Map<String, Integer> value) {
        closestTaskAt = new RangeFilterValue(value);
        return this;
    }

    public LeadsFilter closestTaskAt(RangeFilterValue value) {
        closestTaskAt = value;
        return this;
    }

    public Map<String, Integer> closestTaskAt() {
        return closestTaskAt.getProperty();
    }

    public LeadsFilter customFieldsValue(Collection<Object> value) {
        customFieldsValue = value.stream().map(item -> new FilterValue(item)).collect(Collectors.toList());
        return this;
    }

    public Collection<Object> customFieldsValue() {
        return customFieldsValue.stream().map(item -> item.getProperty()).collect(Collectors.toList());
    }
}
