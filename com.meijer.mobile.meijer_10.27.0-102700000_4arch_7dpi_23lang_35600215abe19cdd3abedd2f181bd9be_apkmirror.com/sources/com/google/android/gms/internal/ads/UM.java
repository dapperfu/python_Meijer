package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public final class UM implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f70602a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f70603b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10088yy0 f70604c;

    public UM(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03, InterfaceC10088yy0 interfaceC10088yy04) {
        this.f70602a = interfaceC10088yy0;
        this.f70603b = interfaceC10088yy02;
        this.f70604c = interfaceC10088yy04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton;
        final String strA = ((C8283i30) this.f70602a).a();
        Context contextA = ((C9865wu) this.f70603b).a();
        Xj0 xj0B = U70.b();
        Map mapZzb = ((C8805my0) this.f70604c).zzb();
        if (((Boolean) Mc.A.c().a(C8659lf.f76199W4)).booleanValue()) {
            C7392Zc c7392Zc = new C7392Zc(new C8015fd(contextA));
            c7392Zc.b(new InterfaceC7359Yc() { // from class: com.google.android.gms.internal.ads.VM
                @Override // com.google.android.gms.internal.ads.InterfaceC7359Yc
                public final void a(C6824Ie c6824Ie) {
                    c6824Ie.x(strA);
                }
            });
            setSingleton = Collections.singleton(new ZF(new XM(c7392Zc, mapZzb), xj0B));
        } else {
            setSingleton = Collections.EMPTY_SET;
        }
        C9233qy0.b(setSingleton);
        return setSingleton;
    }
}
