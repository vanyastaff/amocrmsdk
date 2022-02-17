package com.amocrm.amocrmsdk.constants;

public enum NoteType {
    AMOMAIL_MESSAGE("amomail_message"),
    ATTACHMENT("attachment"),
    BILL_PAID("bill_paid"),
    CALL("call"),
    CALL_IN("call_in"),
    CALL_OUT("call_out"),
    COMMON("common"),
    LEAD("lead_created"),
    LEAD_STATUS_CHANGED("lead_status_changed"),
    COMPANY_CREATED("company_created"),
    CONTACT_CREATED("contact_created"),
    CUSTOMER_CREATED("customer_created"),
    CUSTOMER_STATUS_CHANGED("customer_status_changed"),
    DP_TAGS_ADDED("dp_tags_added"),
    DP_TAGS_REMOVED("dp_tags_removed"),
    EXTENDED_SERVICE_MESSAGE("extended_service_message"),
    EXTERNAL_ATTACH("external_attach"),
    FOLLOWED_LINK("followed_link"),
    GEOLOCATION("geolocation"),
    INVOICE_PAID("invoice_paid"),
    KEY_ACTION_COMPLETED("key_action_completed"),
    LEAD_AUTO_CREATED("lead_auto_created"),
    MAIL_MESSAGE("mail_message"),
    MAIL_MESSAGE_ATTACHMENT("mail_message_attachment"),
    MAIN_USER_CHANGED("main_user_changed"),
    MAX_SYSTEM("max_system"),
    MESSAGE_CACHIER("message_cashier"),
    SERVICE_MESSAGE("service_message"),
    SITE_VISIT("site_visit"),
    SMS_IN("sms_in"),
    SMS_OUT("sms_out"),
    TARGETING_IN("targeting_in"),
    TARGETING_OUT("targeting_out"),
    TASK_RESULT("task_result"),
    TRANSACTION("transaction"),
    ZOOM_MEETING("zoom_meeting");

    private String noteTypeName;


    NoteType(String noteTypeName) {
        this.noteTypeName = noteTypeName;
    }
}
