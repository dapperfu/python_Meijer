package com.google.firebase.remoteconfig.internal;

import android.os.Bundle;
import bf.InterfaceC6375a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    private final Kf.b<InterfaceC6375a> f90177a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, String> f90178b = Collections.synchronizedMap(new HashMap());

    public void a(String str, g gVar) {
        JSONObject jSONObjectOptJSONObject;
        InterfaceC6375a interfaceC6375a = this.f90177a.get();
        if (interfaceC6375a == null) {
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
            synchronized (this.f90178b) {
                try {
                    if (strOptString.equals(this.f90178b.get(str))) {
                        return;
                    }
                    this.f90178b.put(str, strOptString);
                    Bundle bundle = new Bundle();
                    bundle.putString("arm_key", str);
                    bundle.putString("arm_value", jSONObjectG.optString(str));
                    bundle.putString("personalization_id", jSONObjectOptJSONObject.optString("personalizationId"));
                    bundle.putInt("arm_index", jSONObjectOptJSONObject.optInt("armIndex", -1));
                    bundle.putString("group", jSONObjectOptJSONObject.optString("group"));
                    interfaceC6375a.a("fp", "personalization_assignment", bundle);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_fpid", strOptString);
                    interfaceC6375a.a("fp", "_fpc", bundle2);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public x(Kf.b<InterfaceC6375a> bVar) {
        this.f90177a = bVar;
    }
}
