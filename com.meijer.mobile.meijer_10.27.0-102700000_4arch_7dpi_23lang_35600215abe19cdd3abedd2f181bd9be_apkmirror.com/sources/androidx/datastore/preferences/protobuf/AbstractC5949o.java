package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C5952s;
import androidx.datastore.preferences.protobuf.C5952s.b;
import java.io.IOException;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC5949o<T extends C5952s.b<T>> {
    abstract int a(Map.Entry<?, ?> entry);

    abstract Object b(C5948n c5948n, P p10, int i10);

    abstract C5952s<T> c(Object obj);

    abstract C5952s<T> d(Object obj);

    abstract boolean e(P p10);

    abstract void f(Object obj);

    abstract <UT, UB> UB g(Object obj, e0 e0Var, Object obj2, C5948n c5948n, C5952s<T> c5952s, UB ub2, l0<UT, UB> l0Var) throws IOException;

    abstract void h(e0 e0Var, Object obj, C5948n c5948n, C5952s<T> c5952s) throws IOException;

    abstract void i(AbstractC5941g abstractC5941g, Object obj, C5948n c5948n, C5952s<T> c5952s) throws IOException;

    abstract void j(r0 r0Var, Map.Entry<?, ?> entry) throws IOException;

    AbstractC5949o() {
    }
}
