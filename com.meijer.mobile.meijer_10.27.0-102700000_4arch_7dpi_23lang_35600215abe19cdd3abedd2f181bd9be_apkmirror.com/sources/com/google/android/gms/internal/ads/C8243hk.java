package com.google.android.gms.internal.ads;

import Mc.C4169y;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.hk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C8243hk {
    public static void c(InterfaceC8349ik interfaceC8349ik, String str, String str2) {
        interfaceC8349ik.zza(str + "(" + str2 + ");");
    }

    public static void a(InterfaceC8349ik interfaceC8349ik, String str, Map map) {
        try {
            interfaceC8349ik.j(str, C4169y.b().l(map));
        } catch (JSONException unused) {
            Qc.p.g("Could not convert parameters to JSON.");
        }
    }

    public static void b(InterfaceC8349ik interfaceC8349ik, String str, JSONObject jSONObject) {
        String string = jSONObject.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb2.append(str);
        sb2.append("',");
        sb2.append(string);
        sb2.append(");");
        Qc.p.b("Dispatching AFMA event: ".concat(sb2.toString()));
        interfaceC8349ik.zza(sb2.toString());
    }

    public static void d(InterfaceC8349ik interfaceC8349ik, String str, JSONObject jSONObject) {
        interfaceC8349ik.a(str, jSONObject.toString());
    }
}
