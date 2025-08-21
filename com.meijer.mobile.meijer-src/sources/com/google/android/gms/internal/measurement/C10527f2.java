package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.f2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10527f2 extends C10485a5 implements L5 {
    private C10527f2() {
        throw null;
    }

    /* synthetic */ C10527f2(byte[] bArr) {
        super(C10536g2.zzu);
    }

    public final String A() {
        return ((C10536g2) this.f82960b).P();
    }

    public final int t() {
        return ((C10536g2) this.f82960b).J();
    }

    public final C10518e2 u(int i10) {
        return ((C10536g2) this.f82960b).K(i10);
    }

    public final List w() {
        return Collections.unmodifiableList(((C10536g2) this.f82960b).L());
    }

    public final List z() {
        return Collections.unmodifiableList(((C10536g2) this.f82960b).O());
    }

    public final C10527f2 v(int i10, C10509d2 c10509d2) {
        m();
        ((C10536g2) this.f82960b).W(i10, (C10518e2) c10509d2.q());
        return this;
    }

    public final C10527f2 x() {
        m();
        ((C10536g2) this.f82960b).X();
        return this;
    }

    public final C10527f2 y() {
        m();
        ((C10536g2) this.f82960b).Y();
        return this;
    }
}
