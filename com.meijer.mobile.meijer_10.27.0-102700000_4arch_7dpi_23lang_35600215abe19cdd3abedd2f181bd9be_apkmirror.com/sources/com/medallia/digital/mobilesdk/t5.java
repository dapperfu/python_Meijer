package com.medallia.digital.mobilesdk;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class t5 {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<Component> f93055a;

    protected t5(JSONObject jSONObject) {
        this.f93055a = new ArrayList<>();
        try {
            if (!jSONObject.has("components") || jSONObject.isNull("components")) {
                return;
            }
            this.f93055a = ModelFactory.getInstance().getComponentsArray(jSONObject.getJSONArray("components"));
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }

    protected ArrayList<Component> a() {
        return this.f93055a;
    }
}
