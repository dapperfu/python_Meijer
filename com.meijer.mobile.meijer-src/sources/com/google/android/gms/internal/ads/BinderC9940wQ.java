package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* renamed from: com.google.android.gms.internal.ads.wQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC9940wQ extends AbstractBinderC9016no {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC10154yQ f80322a;

    protected BinderC9940wQ(AbstractC10154yQ abstractC10154yQ) {
        this.f80322a = abstractC10154yQ;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9123oo
    public final void D7(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        AbstractC10154yQ abstractC10154yQ = this.f80322a;
        abstractC10154yQ.f81057a.b(new OQ(autoCloseInputStream, abstractC10154yQ.f81061e));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9123oo
    public final void E4(Rc.C c10) {
        this.f80322a.f81057a.c(c10.B());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9123oo
    public final void R4(ParcelFileDescriptor parcelFileDescriptor, C9978wo c9978wo) {
        this.f80322a.f81057a.b(new OQ(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), c9978wo));
    }
}
