package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes6.dex */
final class Xh0 extends AbstractC7193Ph0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    static final Xh0 f72222a = new Xh0();

    private Xh0() {
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7193Ph0, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }
}
