package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* renamed from: com.google.android.gms.internal.ads.xQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC9922xQ extends AbstractBinderC8891no {

    /* renamed from: a, reason: collision with root package name */
    private final C7145Rq f79785a;

    /* renamed from: b, reason: collision with root package name */
    private final C9853wo f79786b;

    @Override // com.google.android.gms.internal.ads.InterfaceC8998oo
    public final void G4(ParcelFileDescriptor parcelFileDescriptor, C9853wo c9853wo) {
        this.f79785a.b(new OQ(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), c9853wo));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8998oo
    public final void k4(Pc.C c10) {
        this.f79785a.c(c10.B());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8998oo
    public final void z7(ParcelFileDescriptor parcelFileDescriptor) {
        this.f79785a.b(new OQ(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.f79786b));
    }

    BinderC9922xQ(C7145Rq c7145Rq, C9853wo c9853wo) {
        this.f79785a = c7145Rq;
        this.f79786b = c9853wo;
    }
}
