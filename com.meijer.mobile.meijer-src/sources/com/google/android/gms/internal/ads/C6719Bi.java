package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Bi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6719Bi implements InterfaceC7194Pi {
    C6719Bi() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC9133ot interfaceC9133ot = (InterfaceC9133ot) obj;
        try {
            C7287Sd0.k(interfaceC9133ot.getContext()).l();
            C7321Td0.j(interfaceC9133ot.getContext()).k();
            C7355Ud0.a(interfaceC9133ot.getContext()).b(null);
        } catch (IOException e10) {
            Nc.v.s().x(e10, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
