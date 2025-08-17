package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class V2 extends C10360a5 implements L5 {
    private V2() {
        throw null;
    }

    /* synthetic */ V2(byte[] bArr) {
        super(Y2.zzh);
    }

    public final String A() {
        return ((Y2) this.f82120b).I();
    }

    public final List t() {
        return Collections.unmodifiableList(((Y2) this.f82120b).E());
    }

    public final int u() {
        return ((Y2) this.f82120b).F();
    }

    public final C10358a3 v(int i10) {
        return ((Y2) this.f82120b).G(i10);
    }

    public final V2 C(String str) {
        m();
        ((Y2) this.f82120b).R(str);
        return this;
    }

    public final V2 D(String str) {
        m();
        ((Y2) this.f82120b).S(str);
        return this;
    }

    public final V2 w(int i10, Z2 z22) {
        m();
        ((Y2) this.f82120b).N(i10, (C10358a3) z22.q());
        return this;
    }

    public final V2 x(Z2 z22) {
        m();
        ((Y2) this.f82120b).O((C10358a3) z22.q());
        return this;
    }

    public final V2 y(Iterable iterable) {
        m();
        ((Y2) this.f82120b).P(iterable);
        return this;
    }

    public final V2 z() {
        m();
        ((Y2) this.f82120b).Q();
        return this;
    }
}
