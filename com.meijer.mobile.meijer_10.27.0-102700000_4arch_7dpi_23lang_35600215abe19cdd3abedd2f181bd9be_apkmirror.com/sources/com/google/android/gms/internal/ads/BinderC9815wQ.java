package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* renamed from: com.google.android.gms.internal.ads.wQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC9815wQ extends AbstractBinderC8891no {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC10029yQ f79482a;

    protected BinderC9815wQ(AbstractC10029yQ abstractC10029yQ) {
        this.f79482a = abstractC10029yQ;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8998oo
    public final void G4(ParcelFileDescriptor parcelFileDescriptor, C9853wo c9853wo) {
        this.f79482a.f80217a.b(new OQ(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), c9853wo));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8998oo
    public final void k4(Pc.C c10) {
        this.f79482a.f80217a.c(c10.B());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8998oo
    public final void z7(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        AbstractC10029yQ abstractC10029yQ = this.f79482a;
        abstractC10029yQ.f80217a.b(new OQ(autoCloseInputStream, abstractC10029yQ.f80221e));
    }
}
