package com.google.android.gms.internal.pal;

import Vd.C5517k;
import android.os.Bundle;

/* loaded from: classes6.dex */
final class H5 extends AbstractBinderC11106y5 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C5517k f83480a;

    H5(I5 i52, C5517k c5517k) {
        this.f83480a = c5517k;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC11122z5
    public final void zzb(int i10) {
        this.f83480a.d(new zzgy(i10));
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC11122z5
    public final void zzc(Bundle bundle) {
        this.f83480a.e(bundle.getString("newToken"));
    }
}
