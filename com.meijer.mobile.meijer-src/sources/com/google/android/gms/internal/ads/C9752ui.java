package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ui, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9752ui implements InterfaceC7194Pi {
    C9752ui() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        JSONObject jSONObjectZzb;
        InterfaceC9133ot interfaceC9133ot = (InterfaceC9133ot) obj;
        InterfaceC7055Lg interfaceC7055LgN = interfaceC9133ot.n();
        if (interfaceC7055LgN == null || (jSONObjectZzb = interfaceC7055LgN.zzb()) == null) {
            interfaceC9133ot.j("nativeClickMetaReady", new JSONObject());
        } else {
            interfaceC9133ot.j("nativeClickMetaReady", jSONObjectZzb);
        }
    }
}
