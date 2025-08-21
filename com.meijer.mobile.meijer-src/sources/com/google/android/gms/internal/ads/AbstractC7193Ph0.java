package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.Ph0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7193Ph0 implements Comparator {
    protected AbstractC7193Ph0() {
    }

    public static AbstractC7193Ph0 c() {
        return C7125Nh0.f69778a;
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public static AbstractC7193Ph0 b(Comparator comparator) {
        return new C7157Og0(comparator);
    }

    public AbstractC7193Ph0 a() {
        return new Yh0(this);
    }
}
