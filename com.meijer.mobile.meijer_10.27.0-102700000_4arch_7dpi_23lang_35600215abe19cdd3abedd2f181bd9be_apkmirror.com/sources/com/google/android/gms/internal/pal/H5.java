package com.google.android.gms.internal.pal;

import Td.C5233k;
import android.os.Bundle;

/* loaded from: classes6.dex */
final class H5 extends AbstractBinderC10981y5 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C5233k f82640a;

    H5(I5 i52, C5233k c5233k) {
        this.f82640a = c5233k;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10997z5
    public final void zzb(int i10) {
        this.f82640a.d(new zzgy(i10));
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10997z5
    public final void zzc(Bundle bundle) {
        this.f82640a.e(bundle.getString("newToken"));
    }
}
