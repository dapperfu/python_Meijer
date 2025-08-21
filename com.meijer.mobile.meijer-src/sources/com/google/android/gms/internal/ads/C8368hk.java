package com.google.android.gms.internal.ads;

import Oc.C4447y;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.hk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C8368hk {
    public static void c(InterfaceC8474ik interfaceC8474ik, String str, String str2) {
        interfaceC8474ik.zza(str + "(" + str2 + ");");
    }

    public static void a(InterfaceC8474ik interfaceC8474ik, String str, Map map) {
        try {
            interfaceC8474ik.j(str, C4447y.b().l(map));
        } catch (JSONException unused) {
            Sc.p.g("Could not convert parameters to JSON.");
        }
    }

    public static void b(InterfaceC8474ik interfaceC8474ik, String str, JSONObject jSONObject) {
        String string = jSONObject.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb2.append(str);
        sb2.append("',");
        sb2.append(string);
        sb2.append(");");
        Sc.p.b("Dispatching AFMA event: ".concat(sb2.toString()));
        interfaceC8474ik.zza(sb2.toString());
    }

    public static void d(InterfaceC8474ik interfaceC8474ik, String str, JSONObject jSONObject) {
        interfaceC8474ik.a(str, jSONObject.toString());
    }
}
