package com.google.protobuf;

import java.io.IOException;

/* loaded from: classes8.dex */
public interface P extends Q {

    public interface a extends Q, Cloneable {
        a U0(P p10);

        P build();

        a d1(AbstractC11647h abstractC11647h, C11653n c11653n) throws IOException;

        P h();
    }

    a b();

    int c();

    a d();

    Y<? extends P> f();

    AbstractC11646g g();

    void l(CodedOutputStream codedOutputStream) throws IOException;
}
