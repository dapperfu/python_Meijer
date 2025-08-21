package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ti, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9645ti implements InterfaceC7194Pi {
    C9645ti() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        JSONObject jSONObjectZza;
        InterfaceC9133ot interfaceC9133ot = (InterfaceC9133ot) obj;
        InterfaceC7055Lg interfaceC7055LgN = interfaceC9133ot.n();
        if (interfaceC7055LgN == null || (jSONObjectZza = interfaceC7055LgN.zza()) == null) {
            interfaceC9133ot.j("nativeAdViewSignalsReady", new JSONObject());
        } else {
            interfaceC9133ot.j("nativeAdViewSignalsReady", jSONObjectZza);
        }
    }
}
