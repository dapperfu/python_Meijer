package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.f2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10402f2 extends C10360a5 implements L5 {
    private C10402f2() {
        throw null;
    }

    /* synthetic */ C10402f2(byte[] bArr) {
        super(C10411g2.zzu);
    }

    public final String A() {
        return ((C10411g2) this.f82120b).P();
    }

    public final int t() {
        return ((C10411g2) this.f82120b).J();
    }

    public final C10393e2 u(int i10) {
        return ((C10411g2) this.f82120b).K(i10);
    }

    public final List w() {
        return Collections.unmodifiableList(((C10411g2) this.f82120b).L());
    }

    public final List z() {
        return Collections.unmodifiableList(((C10411g2) this.f82120b).O());
    }

    public final C10402f2 v(int i10, C10384d2 c10384d2) {
        m();
        ((C10411g2) this.f82120b).W(i10, (C10393e2) c10384d2.q());
        return this;
    }

    public final C10402f2 x() {
        m();
        ((C10411g2) this.f82120b).X();
        return this;
    }

    public final C10402f2 y() {
        m();
        ((C10411g2) this.f82120b).Y();
        return this;
    }
}
