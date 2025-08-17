package com.medallia.digital.mobilesdk;

import org.json.JSONObject;

/* loaded from: classes7.dex */
abstract class EngagementContract extends e0 {
    private InviteData inviteData;
    private String name;
    private JSONObject triggerData;

    EngagementContract() {
    }

    public InviteData getInviteData() {
        return this.inviteData;
    }

    public String getName() {
        return this.name;
    }

    JSONObject getTriggerData() {
        return this.triggerData;
    }

    EngagementContract(String str, InviteData inviteData, JSONObject jSONObject) {
        this.name = str;
        this.inviteData = inviteData;
        this.triggerData = jSONObject;
    }

    EngagementContract(JSONObject jSONObject) {
        try {
            if (jSONObject.has("name") && !jSONObject.isNull("name")) {
                this.name = jSONObject.getString("name");
            }
            if (jSONObject.has("inviteData") && !jSONObject.isNull("inviteData")) {
                this.inviteData = new InviteData(jSONObject.getJSONObject("inviteData"));
            }
            if (!jSONObject.has("triggerData") || jSONObject.isNull("triggerData")) {
                return;
            }
            this.triggerData = jSONObject.getJSONObject("triggerData");
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }
}
