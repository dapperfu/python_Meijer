package com.google.android.gms.internal.pal;

import java.util.Comparator;

/* loaded from: classes6.dex */
final class pf implements Comparator {
    pf() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }
}
