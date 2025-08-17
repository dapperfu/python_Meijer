package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import java.io.Serializable;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class BannerData implements Serializable {
    private static final int HASH_CODE_MULT = 31;
    private String acceptButtonBackgroundColor;
    private String acceptButtonText;
    private String acceptButtonTextColor;
    private String backgroundColor;
    private String buttonsDisplay;
    private String closeButtonColor;
    private String font;
    private String handleTextColor;
    private String invitationBody;
    private String invitationTimeout;
    private String invitationTitle;
    private String isPartial;
    private String isSticky;
    private String position;
    private String textColor;
    private String themeName;

    BannerData(JSONObject jSONObject) {
        try {
            if (jSONObject.has("invitationTitle") && !jSONObject.isNull("invitationTitle")) {
                this.invitationTitle = jSONObject.getString("invitationTitle");
            }
            if (jSONObject.has("invitationBody") && !jSONObject.isNull("invitationBody")) {
                this.invitationBody = jSONObject.getString("invitationBody");
            }
            if (jSONObject.has("textColor") && !jSONObject.isNull("textColor")) {
                this.textColor = jSONObject.getString("textColor");
            }
            if (jSONObject.has("handleTextColor") && !jSONObject.isNull("handleTextColor")) {
                this.handleTextColor = jSONObject.getString("handleTextColor");
            }
            if (jSONObject.has("backgroundColor") && !jSONObject.isNull("backgroundColor")) {
                this.backgroundColor = jSONObject.getString("backgroundColor");
            }
            if (jSONObject.has("font") && !jSONObject.isNull("font")) {
                this.font = jSONObject.getString("font");
            }
            if (jSONObject.has("position") && !jSONObject.isNull("position")) {
                this.position = jSONObject.getString("position");
            }
            if (jSONObject.has("invitationTimeout") && !jSONObject.isNull("invitationTimeout")) {
                this.invitationTimeout = jSONObject.getString("invitationTimeout");
            }
            if (jSONObject.has("buttonsDisplay") && !jSONObject.isNull("buttonsDisplay")) {
                this.buttonsDisplay = jSONObject.getString("buttonsDisplay");
            }
            if (jSONObject.has("acceptButtonText") && !jSONObject.isNull("acceptButtonText")) {
                this.acceptButtonText = jSONObject.getString("acceptButtonText");
            }
            if (jSONObject.has("acceptButtonTextColor") && !jSONObject.isNull("acceptButtonTextColor")) {
                this.acceptButtonTextColor = jSONObject.getString("acceptButtonTextColor");
            }
            if (jSONObject.has("acceptButtonBackgroundColor") && !jSONObject.isNull("acceptButtonBackgroundColor")) {
                this.acceptButtonBackgroundColor = jSONObject.getString("acceptButtonBackgroundColor");
            }
            if (jSONObject.has("closeButtonColor") && !jSONObject.isNull("closeButtonColor")) {
                this.closeButtonColor = jSONObject.getString("closeButtonColor");
            }
            if (jSONObject.has("isSticky") && !jSONObject.isNull("isSticky")) {
                this.isSticky = jSONObject.getString("isSticky");
            }
            if (jSONObject.has("isPartial") && !jSONObject.isNull("isPartial")) {
                this.isPartial = jSONObject.getString("isPartial");
            }
            if (!jSONObject.has("selectedTheme") || jSONObject.isNull("selectedTheme")) {
                return;
            }
            this.themeName = jSONObject.getString("selectedTheme");
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            BannerData bannerData = (BannerData) obj;
            String str = this.invitationTitle;
            if (str == null ? bannerData.invitationTitle != null : !str.equals(bannerData.invitationTitle)) {
                return false;
            }
            String str2 = this.invitationBody;
            if (str2 == null ? bannerData.invitationBody != null : !str2.equals(bannerData.invitationBody)) {
                return false;
            }
            String str3 = this.textColor;
            if (str3 == null ? bannerData.textColor != null : !str3.equals(bannerData.textColor)) {
                return false;
            }
            String str4 = this.handleTextColor;
            if (str4 == null ? bannerData.handleTextColor != null : !str4.equals(bannerData.handleTextColor)) {
                return false;
            }
            String str5 = this.backgroundColor;
            if (str5 == null ? bannerData.backgroundColor != null : !str5.equals(bannerData.backgroundColor)) {
                return false;
            }
            String str6 = this.font;
            if (str6 == null ? bannerData.font != null : !str6.equals(bannerData.font)) {
                return false;
            }
            String str7 = this.position;
            if (str7 == null ? bannerData.position != null : !str7.equals(bannerData.position)) {
                return false;
            }
            String str8 = this.buttonsDisplay;
            if (str8 == null ? bannerData.buttonsDisplay != null : !str8.equals(bannerData.buttonsDisplay)) {
                return false;
            }
            String str9 = this.acceptButtonText;
            if (str9 == null ? bannerData.acceptButtonText != null : !str9.equals(bannerData.acceptButtonText)) {
                return false;
            }
            String str10 = this.acceptButtonBackgroundColor;
            if (str10 == null ? bannerData.acceptButtonBackgroundColor != null : !str10.equals(bannerData.acceptButtonBackgroundColor)) {
                return false;
            }
            String str11 = this.acceptButtonTextColor;
            if (str11 == null ? bannerData.acceptButtonTextColor != null : !str11.equals(bannerData.acceptButtonTextColor)) {
                return false;
            }
            String str12 = this.closeButtonColor;
            if (str12 == null ? bannerData.closeButtonColor != null : !str12.equals(bannerData.closeButtonColor)) {
                return false;
            }
            String str13 = this.isSticky;
            if (str13 == null ? bannerData.isSticky != null : !str13.equals(bannerData.isSticky)) {
                return false;
            }
            String str14 = this.isPartial;
            if (str14 == null ? bannerData.isPartial != null : !str14.equals(bannerData.isPartial)) {
                return false;
            }
            String str15 = this.themeName;
            if (str15 == null ? bannerData.themeName != null : !str15.equals(bannerData.themeName)) {
                return false;
            }
            String str16 = this.invitationTimeout;
            String str17 = bannerData.invitationTimeout;
            if (str16 != null) {
                return str16.equals(str17);
            }
            if (str17 == null) {
                return true;
            }
        }
        return false;
    }

    protected String getAcceptButtonBackgroundColor() {
        return this.acceptButtonBackgroundColor;
    }

    protected String getAcceptButtonText() {
        return this.acceptButtonText;
    }

    protected String getAcceptButtonTextColor() {
        return this.acceptButtonTextColor;
    }

    protected String getBackgroundColor() {
        return this.backgroundColor;
    }

    protected String getCloseButtonColor() {
        return this.closeButtonColor;
    }

    protected String getFont() {
        return this.font;
    }

    protected String getHandleTextColor() {
        return this.handleTextColor;
    }

    protected String getInvitationBody() {
        return this.invitationBody;
    }

    protected Long getInvitationTimeout() {
        String str = this.invitationTimeout;
        return Long.valueOf(str != null ? Long.parseLong(str) : 0L);
    }

    protected String getInvitationTitle() {
        return this.invitationTitle;
    }

    public String getPosition() {
        return this.position;
    }

    protected String getTextColor() {
        return this.textColor;
    }

    public String getThemeName() {
        return this.themeName;
    }

    public int hashCode() {
        String str = this.invitationTitle;
        int iHashCode = (str != null ? str.hashCode() : 0) * HASH_CODE_MULT;
        String str2 = this.invitationBody;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * HASH_CODE_MULT;
        String str3 = this.textColor;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * HASH_CODE_MULT;
        String str4 = this.handleTextColor;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * HASH_CODE_MULT;
        String str5 = this.backgroundColor;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * HASH_CODE_MULT;
        String str6 = this.font;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * HASH_CODE_MULT;
        String str7 = this.position;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * HASH_CODE_MULT;
        String str8 = this.invitationTimeout;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * HASH_CODE_MULT;
        String str9 = this.buttonsDisplay;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * HASH_CODE_MULT;
        String str10 = this.acceptButtonText;
        int iHashCode10 = (iHashCode9 + (str10 != null ? str10.hashCode() : 0)) * HASH_CODE_MULT;
        String str11 = this.acceptButtonTextColor;
        int iHashCode11 = (iHashCode10 + (str11 != null ? str11.hashCode() : 0)) * HASH_CODE_MULT;
        String str12 = this.acceptButtonBackgroundColor;
        int iHashCode12 = (iHashCode11 + (str12 != null ? str12.hashCode() : 0)) * HASH_CODE_MULT;
        String str13 = this.closeButtonColor;
        int iHashCode13 = (iHashCode12 + (str13 != null ? str13.hashCode() : 0)) * HASH_CODE_MULT;
        String str14 = this.isSticky;
        int iHashCode14 = (iHashCode13 + (str14 != null ? str14.hashCode() : 0)) * HASH_CODE_MULT;
        String str15 = this.isPartial;
        int iHashCode15 = (iHashCode14 + (str15 != null ? str15.hashCode() : 0)) * HASH_CODE_MULT;
        String str16 = this.themeName;
        return iHashCode15 + (str16 != null ? str16.hashCode() : 0);
    }

    protected boolean isButtonsDisplay() {
        if (TextUtils.isEmpty(this.buttonsDisplay)) {
            return false;
        }
        return Boolean.parseBoolean(this.buttonsDisplay);
    }

    protected boolean isPartial() {
        if (TextUtils.isEmpty(this.isPartial)) {
            return false;
        }
        return Boolean.parseBoolean(this.isPartial);
    }

    protected boolean isSticky() {
        if (TextUtils.isEmpty(this.isSticky)) {
            return false;
        }
        return Boolean.parseBoolean(this.isSticky);
    }

    public String toJsonString() {
        try {
            return "{\"invitationTitle\":" + l3.d(this.invitationTitle) + ",\"invitationBody\":" + l3.d(this.invitationBody) + ",\"textColor\":" + l3.c(this.textColor) + ",\"handleTextColor\":" + l3.c(this.handleTextColor) + ",\"backgroundColor\":" + l3.c(this.backgroundColor) + ",\"font\":" + l3.c(this.font) + ",\"position\":" + l3.c(this.position) + ",\"invitationTimeout\":" + l3.c(this.invitationTimeout) + ",\"buttonsDisplay\":" + l3.c(this.buttonsDisplay) + ",\"acceptButtonText\":" + l3.c(this.acceptButtonText) + ",\"acceptButtonTextColor\":" + l3.c(this.acceptButtonTextColor) + ",\"acceptButtonBackgroundColor\":" + l3.c(this.acceptButtonBackgroundColor) + ",\"closeButtonColor\":" + l3.c(this.closeButtonColor) + ",\"isSticky\":" + l3.c(this.isSticky) + ",\"isPartial\":" + l3.c(this.isPartial) + ",\"selectedTheme\":" + l3.c(this.themeName) + "}";
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }
}
