package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ti, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9520ti implements InterfaceC7069Pi {
    C9520ti() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        JSONObject jSONObjectZza;
        InterfaceC9008ot interfaceC9008ot = (InterfaceC9008ot) obj;
        InterfaceC6930Lg interfaceC6930LgN = interfaceC9008ot.n();
        if (interfaceC6930LgN == null || (jSONObjectZza = interfaceC6930LgN.zza()) == null) {
            interfaceC9008ot.j("nativeAdViewSignalsReady", new JSONObject());
        } else {
            interfaceC9008ot.j("nativeAdViewSignalsReady", jSONObjectZza);
        }
    }
}
