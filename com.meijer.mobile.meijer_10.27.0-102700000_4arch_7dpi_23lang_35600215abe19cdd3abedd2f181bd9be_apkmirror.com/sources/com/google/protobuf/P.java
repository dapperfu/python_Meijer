package com.google.protobuf;

import java.io.IOException;

/* loaded from: classes7.dex */
public interface P extends Q {

    public interface a extends Q, Cloneable {
        a W0(P p10);

        P build();

        a d1(AbstractC11522h abstractC11522h, C11528n c11528n) throws IOException;

        P h();
    }

    a b();

    int c();

    a d();

    Y<? extends P> f();

    AbstractC11521g g();

    void l(CodedOutputStream codedOutputStream) throws IOException;
}
