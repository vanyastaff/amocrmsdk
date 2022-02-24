package com.amocrm.amocrmsdk.objects.auth;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Objects;

@Data
@Accessors(chain = true, fluent = true)
public class AccessToken {

    @SerializedName("token_type")
    private String tokenType;

    @SerializedName("access_token")
    private String accessToken;

    @SerializedName("refresh_token")
    private String refreshToken;

    @SerializedName("created_at")
    private Integer createdAt;

    @SerializedName("expires_in")
    private Integer expiresIn;

    public int hashCode() {
        return Objects.hash(tokenType, accessToken, refreshToken, createdAt, expiresIn);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccessToken other = (AccessToken) o;
        return Objects.equals(tokenType, other.tokenType) &&
                Objects.equals(accessToken, other.accessToken) &&
                Objects.equals(refreshToken, other.refreshToken) &&
                Objects.equals(createdAt, other.createdAt) &&
                Objects.equals(expiresIn, other.expiresIn);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("AccessToken{");
        sb.append("tokenType=").append(tokenType);
        sb.append(", accessToken=").append(accessToken);
        sb.append(", refreshToken=").append(refreshToken);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", expiresIn=").append(expiresIn);
        sb.append('}');
        return sb.toString();
    }
}
