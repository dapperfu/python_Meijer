package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* renamed from: com.google.android.gms.internal.ads.Cj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class BinderC6629Cj extends AbstractBinderC10164zj {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7145Rq f65817a;

    BinderC6629Cj(C6663Dj c6663Dj, C7145Rq c7145Rq) {
        this.f65817a = c7145Rq;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6561Aj
    public final void q5(ParcelFileDescriptor parcelFileDescriptor) {
        this.f65817a.b(parcelFileDescriptor);
    }
}
