package com.google.android.gms.internal.atv_ads_framework;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.i0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10350i0 implements Comparator {
    C10350i0() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        AbstractC10374q0 abstractC10374q0 = (AbstractC10374q0) obj;
        AbstractC10374q0 abstractC10374q02 = (AbstractC10374q0) obj2;
        C10347h0 c10347h0 = new C10347h0(abstractC10374q0);
        C10347h0 c10347h02 = new C10347h0(abstractC10374q02);
        while (c10347h0.hasNext() && c10347h02.hasNext()) {
            int iCompareTo = Integer.valueOf(c10347h0.zza() & 255).compareTo(Integer.valueOf(c10347h02.zza() & 255));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(abstractC10374q0.f()).compareTo(Integer.valueOf(abstractC10374q02.f()));
    }
}
