package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes6.dex */
public final class RA0 {

    /* renamed from: a, reason: collision with root package name */
    private final C9608tG0 f70640a;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray f70641b;

    public final int a(int i10) {
        return this.f70640a.a(i10);
    }

    public final int b() {
        return this.f70640a.b();
    }

    public final QA0 c(int i10) {
        QA0 qa0 = (QA0) this.f70641b.get(i10);
        qa0.getClass();
        return qa0;
    }

    public final boolean d(int i10) {
        return this.f70640a.c(i10);
    }

    public RA0(C9608tG0 c9608tG0, SparseArray sparseArray) {
        this.f70640a = c9608tG0;
        SparseArray sparseArray2 = new SparseArray(c9608tG0.b());
        for (int i10 = 0; i10 < c9608tG0.b(); i10++) {
            int iA = c9608tG0.a(i10);
            QA0 qa0 = (QA0) sparseArray.get(iA);
            qa0.getClass();
            sparseArray2.append(iA, qa0);
        }
        this.f70641b = sparseArray2;
    }
}
