package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* loaded from: classes.dex */
public interface P extends Q {

    public interface a extends Q, Cloneable {
        a T(P p10);

        P build();

        P h();

        a i1(AbstractC5942h abstractC5942h, C5948n c5948n) throws IOException;
    }

    a b();

    int c();

    a d();

    Y<? extends P> f();

    AbstractC5941g g();

    void i(CodedOutputStream codedOutputStream) throws IOException;
}
