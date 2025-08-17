package com.google.android.gms.internal.atv_ads_framework;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.i0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10225i0 implements Comparator {
    C10225i0() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        AbstractC10249q0 abstractC10249q0 = (AbstractC10249q0) obj;
        AbstractC10249q0 abstractC10249q02 = (AbstractC10249q0) obj2;
        C10222h0 c10222h0 = new C10222h0(abstractC10249q0);
        C10222h0 c10222h02 = new C10222h0(abstractC10249q02);
        while (c10222h0.hasNext() && c10222h02.hasNext()) {
            int iCompareTo = Integer.valueOf(c10222h0.zza() & 255).compareTo(Integer.valueOf(c10222h02.zza() & 255));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(abstractC10249q0.f()).compareTo(Integer.valueOf(abstractC10249q02.f()));
    }
}
