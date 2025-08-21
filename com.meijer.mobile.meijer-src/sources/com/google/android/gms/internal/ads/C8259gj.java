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
public final class C8259gj implements InterfaceC7194Pi {

    /* renamed from: a, reason: collision with root package name */
    private final Object f75212a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Map f75213b = new HashMap();

    @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
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
        synchronized (this.f75212a) {
            try {
                InterfaceC8152fj interfaceC8152fj = (InterfaceC8152fj) this.f75213b.remove(str);
                if (interfaceC8152fj == null) {
                    Sc.p.g("Received result for unexpected method invocation: " + str);
                    return;
                }
                if (!TextUtils.isEmpty(str2)) {
                    interfaceC8152fj.zza(str3 + strConcat);
                    return;
                }
                if (str5 == null) {
                    interfaceC8152fj.a(null);
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (Rc.p0.m()) {
                        Rc.p0.k("Result GMSG: " + jSONObject.toString(2));
                    }
                    interfaceC8152fj.a(jSONObject);
                } catch (JSONException e10) {
                    interfaceC8152fj.zza(e10.getMessage());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final com.google.common.util.concurrent.q b(InterfaceC9542sk interfaceC9542sk, String str, JSONObject jSONObject) throws JSONException {
        C7270Rq c7270Rq = new C7270Rq();
        Nc.v.t();
        String string = UUID.randomUUID().toString();
        c(string, new C8045ej(this, c7270Rq));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(PreferencesHelper.PREF_ID, string);
            jSONObject2.put("args", jSONObject);
            interfaceC9542sk.R0(str, jSONObject2);
            return c7270Rq;
        } catch (Exception e10) {
            c7270Rq.c(e10);
            return c7270Rq;
        }
    }

    public final void c(String str, InterfaceC8152fj interfaceC8152fj) {
        synchronized (this.f75212a) {
            this.f75213b.put(str, interfaceC8152fj);
        }
    }
}
