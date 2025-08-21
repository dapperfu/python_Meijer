package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public final class UM implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f71442a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f71443b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10213yy0 f71444c;

    public UM(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03, InterfaceC10213yy0 interfaceC10213yy04) {
        this.f71442a = interfaceC10213yy0;
        this.f71443b = interfaceC10213yy02;
        this.f71444c = interfaceC10213yy04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton;
        final String strA = ((C8408i30) this.f71442a).a();
        Context contextA = ((C9990wu) this.f71443b).a();
        Xj0 xj0B = U70.b();
        Map mapZzb = ((C8930my0) this.f71444c).zzb();
        if (((Boolean) Oc.A.c().a(C8784lf.f77039W4)).booleanValue()) {
            C7517Zc c7517Zc = new C7517Zc(new C8140fd(contextA));
            c7517Zc.b(new InterfaceC7484Yc() { // from class: com.google.android.gms.internal.ads.VM
                @Override // com.google.android.gms.internal.ads.InterfaceC7484Yc
                public final void a(C6949Ie c6949Ie) {
                    c6949Ie.x(strA);
                }
            });
            setSingleton = Collections.singleton(new ZF(new XM(c7517Zc, mapZzb), xj0B));
        } else {
            setSingleton = Collections.EMPTY_SET;
        }
        C9358qy0.b(setSingleton);
        return setSingleton;
    }
}
