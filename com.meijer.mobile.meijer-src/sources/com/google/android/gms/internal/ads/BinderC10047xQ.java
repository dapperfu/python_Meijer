package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* renamed from: com.google.android.gms.internal.ads.xQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC10047xQ extends AbstractBinderC9016no {

    /* renamed from: a, reason: collision with root package name */
    private final C7270Rq f80625a;

    /* renamed from: b, reason: collision with root package name */
    private final C9978wo f80626b;

    @Override // com.google.android.gms.internal.ads.InterfaceC9123oo
    public final void D7(ParcelFileDescriptor parcelFileDescriptor) {
        this.f80625a.b(new OQ(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.f80626b));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9123oo
    public final void E4(Rc.C c10) {
        this.f80625a.c(c10.B());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9123oo
    public final void R4(ParcelFileDescriptor parcelFileDescriptor, C9978wo c9978wo) {
        this.f80625a.b(new OQ(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), c9978wo));
    }

    BinderC10047xQ(C7270Rq c7270Rq, C9978wo c9978wo) {
        this.f80625a = c7270Rq;
        this.f80626b = c9978wo;
    }
}
