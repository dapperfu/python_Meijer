package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes6.dex */
public final class GZ implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f67233a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f67234b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10088yy0 f67235c;

    public GZ(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03) {
        this.f67233a = interfaceC10088yy0;
        this.f67234b = interfaceC10088yy02;
        this.f67235c = interfaceC10088yy03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Object objZzb = ((FX) this.f67233a).zzb();
        Object obj = (C8008fZ) this.f67234b.zzb();
        if (true == ((List) this.f67235c.zzb()).contains("2")) {
            objZzb = obj;
        }
        C9233qy0.b(objZzb);
        return objZzb;
    }
}
