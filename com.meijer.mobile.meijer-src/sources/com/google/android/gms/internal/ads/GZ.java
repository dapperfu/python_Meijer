package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes6.dex */
public final class GZ implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f68073a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f68074b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10213yy0 f68075c;

    public GZ(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03) {
        this.f68073a = interfaceC10213yy0;
        this.f68074b = interfaceC10213yy02;
        this.f68075c = interfaceC10213yy03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Object objZzb = ((FX) this.f68073a).zzb();
        Object obj = (C8133fZ) this.f68074b.zzb();
        if (true == ((List) this.f68075c.zzb()).contains("2")) {
            objZzb = obj;
        }
        C9358qy0.b(objZzb);
        return objZzb;
    }
}
