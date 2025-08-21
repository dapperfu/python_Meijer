package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.vj0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC9862vj0 extends AbstractC8793lj0 {

    /* renamed from: p, reason: collision with root package name */
    private List f79954p;

    AbstractC9862vj0(AbstractC7526Zg0 abstractC7526Zg0, boolean z10) {
        super(abstractC7526Zg0, z10, true);
        List listA = abstractC7526Zg0.isEmpty() ? Collections.EMPTY_LIST : C9858vh0.a(abstractC7526Zg0.size());
        for (int i10 = 0; i10 < abstractC7526Zg0.size(); i10++) {
            listA.add(null);
        }
        this.f79954p = listA;
    }

    abstract Object X(List list);

    @Override // com.google.android.gms.internal.ads.AbstractC8793lj0
    final void R(int i10, Object obj) {
        List list = this.f79954p;
        if (list != null) {
            list.set(i10, new C9755uj0(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8793lj0
    final void S() {
        List list = this.f79954p;
        if (list != null) {
            g(X(list));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8793lj0
    final void W(int i10) {
        super.W(i10);
        this.f79954p = null;
    }
}
