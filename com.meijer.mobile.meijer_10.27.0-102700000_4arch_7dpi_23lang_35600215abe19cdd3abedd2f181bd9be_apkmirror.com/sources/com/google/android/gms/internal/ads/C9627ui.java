package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ui, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9627ui implements InterfaceC7069Pi {
    C9627ui() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        JSONObject jSONObjectZzb;
        InterfaceC9008ot interfaceC9008ot = (InterfaceC9008ot) obj;
        InterfaceC6930Lg interfaceC6930LgN = interfaceC9008ot.n();
        if (interfaceC6930LgN == null || (jSONObjectZzb = interfaceC6930LgN.zzb()) == null) {
            interfaceC9008ot.j("nativeClickMetaReady", new JSONObject());
        } else {
            interfaceC9008ot.j("nativeClickMetaReady", jSONObjectZzb);
        }
    }
}
