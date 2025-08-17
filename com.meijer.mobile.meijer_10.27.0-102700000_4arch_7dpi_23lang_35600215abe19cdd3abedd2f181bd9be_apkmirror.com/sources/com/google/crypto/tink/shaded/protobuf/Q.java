package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* loaded from: classes7.dex */
public interface Q extends S {

    public interface a extends S, Cloneable {
        a M2(Q q10);

        Q build();

        Q h();

        a l2(AbstractC11313i abstractC11313i, C11319o c11319o) throws IOException;
    }

    a b();

    int c();

    a d();

    Z<? extends Q> f();

    AbstractC11312h g();

    void i(CodedOutputStream codedOutputStream) throws IOException;
}
