package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* loaded from: classes.dex */
public interface P extends Q {

    public interface a extends Q, Cloneable {
        a T(P p10);

        P build();

        P h();

        a j1(AbstractC6084h abstractC6084h, C6090n c6090n) throws IOException;
    }

    a b();

    int c();

    a d();

    Y<? extends P> f();

    AbstractC6083g g();

    void i(CodedOutputStream codedOutputStream) throws IOException;
}
