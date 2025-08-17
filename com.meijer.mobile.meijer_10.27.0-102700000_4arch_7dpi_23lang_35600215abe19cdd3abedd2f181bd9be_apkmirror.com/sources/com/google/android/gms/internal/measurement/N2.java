package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class N2 extends C10360a5 implements L5 {
    private N2() {
        throw null;
    }

    /* synthetic */ N2(byte[] bArr) {
        super(O2.zzj);
    }

    public final String E() {
        return ((O2) this.f82120b).H();
    }

    public final boolean G() {
        return ((O2) this.f82120b).I();
    }

    public final long H() {
        return ((O2) this.f82120b).J();
    }

    public final long J() {
        return ((O2) this.f82120b).L();
    }

    public final List t() {
        return Collections.unmodifiableList(((O2) this.f82120b).E());
    }

    public final int u() {
        return ((O2) this.f82120b).F();
    }

    public final S2 v(int i10) {
        return ((O2) this.f82120b).G(i10);
    }

    public final N2 A(Iterable iterable) {
        m();
        ((O2) this.f82120b).R(iterable);
        return this;
    }

    public final N2 C() {
        m();
        ((O2) this.f82120b).S();
        return this;
    }

    public final N2 D(int i10) {
        m();
        ((O2) this.f82120b).T(i10);
        return this;
    }

    public final N2 F(String str) {
        m();
        ((O2) this.f82120b).U(str);
        return this;
    }

    public final N2 I(long j10) {
        m();
        ((O2) this.f82120b).V(j10);
        return this;
    }

    public final N2 K(long j10) {
        m();
        ((O2) this.f82120b).W(j10);
        return this;
    }

    public final N2 L(long j10) {
        m();
        ((O2) this.f82120b).X(j10);
        return this;
    }

    public final N2 w(int i10, S2 s22) {
        m();
        ((O2) this.f82120b).P(i10, s22);
        return this;
    }

    public final N2 x(int i10, R2 r22) {
        m();
        ((O2) this.f82120b).P(i10, (S2) r22.q());
        return this;
    }

    public final N2 y(S2 s22) {
        m();
        ((O2) this.f82120b).Q(s22);
        return this;
    }

    public final N2 z(R2 r22) {
        m();
        ((O2) this.f82120b).Q((S2) r22.q());
        return this;
    }
}
