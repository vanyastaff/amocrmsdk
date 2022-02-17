package com.amocrm.amocrmsdk.objects.lead;

import com.amocrm.amocrmsdk.objects.base.CatalogElementDTO;
import com.amocrm.amocrmsdk.objects.base.LossReasonDTO;
import com.amocrm.amocrmsdk.objects.tag.Tag;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class LeadEmbedded {

    @SerializedName("tags")
    public ArrayList<Tag> tags;

    @SerializedName("catalog_elements")
    public ArrayList<CatalogElementDTO> catalogElements;

    @SerializedName("loss_reason")
    public LossReasonDTO lossReason;

}
