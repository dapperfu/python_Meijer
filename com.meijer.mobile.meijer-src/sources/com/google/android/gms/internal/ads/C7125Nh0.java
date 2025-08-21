package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.ads.Nh0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7125Nh0 extends AbstractC7193Ph0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    static final C7125Nh0 f69778a = new C7125Nh0();

    private C7125Nh0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7193Ph0
    public final AbstractC7193Ph0 a() {
        return Xh0.f72222a;
    }

    public final String toString() {
        return "Ordering.natural()";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7193Ph0, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }
}
