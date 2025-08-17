package com.google.android.gms.internal.pal;

import java.util.Comparator;

/* loaded from: classes6.dex */
final class T implements Comparator {
    T() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        AbstractC10605b0 abstractC10605b0 = (AbstractC10605b0) obj;
        AbstractC10605b0 abstractC10605b02 = (AbstractC10605b0) obj2;
        S s10 = new S(abstractC10605b0);
        S s11 = new S(abstractC10605b02);
        while (s10.hasNext() && s11.hasNext()) {
            int iCompareTo = Integer.valueOf(s10.zza() & 255).compareTo(Integer.valueOf(s11.zza() & 255));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(abstractC10605b0.f()).compareTo(Integer.valueOf(abstractC10605b02.f()));
    }
}
