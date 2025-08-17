package com.google.firebase.remoteconfig.internal;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    private final If.b<Ze.a> f89335a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, String> f89336b = Collections.synchronizedMap(new HashMap());

    public void a(String str, g gVar) {
        JSONObject jSONObjectOptJSONObject;
        Ze.a aVar = this.f89335a.get();
        if (aVar == null) {
            return;
        }
        JSONObject jSONObjectI = gVar.i();
        if (jSONObjectI.length() < 1) {
            return;
        }
        JSONObject jSONObjectG = gVar.g();
        if (jSONObjectG.length() >= 1 && (jSONObjectOptJSONObject = jSONObjectI.optJSONObject(str)) != null) {
            String strOptString = jSONObjectOptJSONObject.optString("choiceId");
            if (strOptString.isEmpty()) {
                return;
            }
            synchronized (this.f89336b) {
                try {
                    if (strOptString.equals(this.f89336b.get(str))) {
                        return;
                    }
                    this.f89336b.put(str, strOptString);
                    Bundle bundle = new Bundle();
                    bundle.putString("arm_key", str);
                    bundle.putString("arm_value", jSONObjectG.optString(str));
                    bundle.putString("personalization_id", jSONObjectOptJSONObject.optString("personalizationId"));
                    bundle.putInt("arm_index", jSONObjectOptJSONObject.optInt("armIndex", -1));
                    bundle.putString("group", jSONObjectOptJSONObject.optString("group"));
                    aVar.a("fp", "personalization_assignment", bundle);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_fpid", strOptString);
                    aVar.a("fp", "_fpc", bundle2);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public x(If.b<Ze.a> bVar) {
        this.f89335a = bVar;
    }
}
