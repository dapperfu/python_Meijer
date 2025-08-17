package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Bi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6594Bi implements InterfaceC7069Pi {
    C6594Bi() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC9008ot interfaceC9008ot = (InterfaceC9008ot) obj;
        try {
            C7162Sd0.k(interfaceC9008ot.getContext()).l();
            C7196Td0.j(interfaceC9008ot.getContext()).k();
            C7230Ud0.a(interfaceC9008ot.getContext()).b(null);
        } catch (IOException e10) {
            Lc.v.s().x(e10, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
