package com.medallia.digital.mobilesdk;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
final class e2 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f92702a = "CSAT";

    e2() {
    }

    protected static JSONObject a(JSONObject jSONObject, FormConfigurations formConfigurations) throws JSONException {
        if (formConfigurations == null || formConfigurations.getFeedbackPayloadExcludedTypes() == null || formConfigurations.getFeedbackPayloadExcludedTypes().isEmpty()) {
            return new JSONObject();
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("components");
            JSONArray jSONArray2 = new JSONArray();
            ArrayList<String> feedbackPayloadExcludedTypes = formConfigurations.getFeedbackPayloadExcludedTypes();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                if (jSONObject2.has("type") && !feedbackPayloadExcludedTypes.contains(jSONObject2.getString("type"))) {
                    jSONObject2.put("isCsat", jSONObject2.has("role") && f92702a.equals(jSONObject2.getString("role")));
                    jSONArray2.put(jSONObject2);
                }
            }
            jSONObject.put("components", jSONArray2);
            return jSONObject;
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return null;
        }
    }
}
