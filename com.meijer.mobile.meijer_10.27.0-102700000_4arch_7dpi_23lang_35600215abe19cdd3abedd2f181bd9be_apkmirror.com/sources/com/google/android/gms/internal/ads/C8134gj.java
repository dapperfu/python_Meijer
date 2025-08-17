package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import io.constructor.data.local.PreferencesHelper;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.gj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8134gj implements InterfaceC7069Pi {

    /* renamed from: a, reason: collision with root package name */
    private final Object f74372a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Map f74373b = new HashMap();

    @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
    public final void a(Object obj, Map map) {
        String str = (String) map.get(PreferencesHelper.PREF_ID);
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String strConcat = TextUtils.isEmpty(str4) ? "" : "\n".concat(String.valueOf(str4));
        synchronized (this.f74372a) {
            try {
                InterfaceC8027fj interfaceC8027fj = (InterfaceC8027fj) this.f74373b.remove(str);
                if (interfaceC8027fj == null) {
                    Qc.p.g("Received result for unexpected method invocation: " + str);
                    return;
                }
                if (!TextUtils.isEmpty(str2)) {
                    interfaceC8027fj.zza(str3 + strConcat);
                    return;
                }
                if (str5 == null) {
                    interfaceC8027fj.a(null);
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (Pc.p0.m()) {
                        Pc.p0.k("Result GMSG: " + jSONObject.toString(2));
                    }
                    interfaceC8027fj.a(jSONObject);
                } catch (JSONException e10) {
                    interfaceC8027fj.zza(e10.getMessage());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final com.google.common.util.concurrent.q b(InterfaceC9417sk interfaceC9417sk, String str, JSONObject jSONObject) throws JSONException {
        C7145Rq c7145Rq = new C7145Rq();
        Lc.v.t();
        String string = UUID.randomUUID().toString();
        c(string, new C7920ej(this, c7145Rq));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(PreferencesHelper.PREF_ID, string);
            jSONObject2.put("args", jSONObject);
            interfaceC9417sk.R0(str, jSONObject2);
            return c7145Rq;
        } catch (Exception e10) {
            c7145Rq.c(e10);
            return c7145Rq;
        }
    }

    public final void c(String str, InterfaceC8027fj interfaceC8027fj) {
        synchronized (this.f74372a) {
            this.f74373b.put(str, interfaceC8027fj);
        }
    }
}
