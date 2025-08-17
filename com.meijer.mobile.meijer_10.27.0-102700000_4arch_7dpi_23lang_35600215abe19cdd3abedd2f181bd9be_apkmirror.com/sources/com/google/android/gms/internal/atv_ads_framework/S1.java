package com.google.android.gms.internal.atv_ads_framework;

import java.io.IOException;

/* loaded from: classes6.dex */
final class S1 extends Q1 {
    S1() {
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.Q1
    final /* synthetic */ void g(Object obj, i2 i2Var) throws IOException {
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.Q1
    final /* synthetic */ int a(Object obj) {
        return ((R1) obj).a();
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.Q1
    final /* synthetic */ int b(Object obj) {
        return ((R1) obj).b();
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.Q1
    final /* synthetic */ Object c(Object obj) {
        return ((K0) obj).zzc;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.Q1
    final void e(Object obj) {
        ((K0) obj).zzc.f();
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.Q1
    final /* synthetic */ void f(Object obj, Object obj2) {
        ((K0) obj).zzc = (R1) obj2;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.Q1
    final /* bridge */ /* synthetic */ Object d(Object obj, Object obj2) {
        if (!R1.c().equals(obj2)) {
            if (R1.c().equals(obj)) {
                return R1.e((R1) obj, (R1) obj2);
            }
            ((R1) obj).d((R1) obj2);
        }
        return obj;
    }
}
