package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* loaded from: classes8.dex */
public interface Q extends S {

    public interface a extends S, Cloneable {
        a L2(Q q10);

        Q build();

        Q h();

        a j2(AbstractC11438i abstractC11438i, C11444o c11444o) throws IOException;
    }

    a b();

    int c();

    a d();

    Z<? extends Q> f();

    AbstractC11437h g();

    void i(CodedOutputStream codedOutputStream) throws IOException;
}
