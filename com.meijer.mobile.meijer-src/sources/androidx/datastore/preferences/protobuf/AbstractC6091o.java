package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C6094s;
import androidx.datastore.preferences.protobuf.C6094s.b;
import java.io.IOException;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC6091o<T extends C6094s.b<T>> {
    abstract int a(Map.Entry<?, ?> entry);

    abstract Object b(C6090n c6090n, P p10, int i10);

    abstract C6094s<T> c(Object obj);

    abstract C6094s<T> d(Object obj);

    abstract boolean e(P p10);

    abstract void f(Object obj);

    abstract <UT, UB> UB g(Object obj, e0 e0Var, Object obj2, C6090n c6090n, C6094s<T> c6094s, UB ub2, l0<UT, UB> l0Var) throws IOException;

    abstract void h(e0 e0Var, Object obj, C6090n c6090n, C6094s<T> c6094s) throws IOException;

    abstract void i(AbstractC6083g abstractC6083g, Object obj, C6090n c6090n, C6094s<T> c6094s) throws IOException;

    abstract void j(r0 r0Var, Map.Entry<?, ?> entry) throws IOException;

    AbstractC6091o() {
    }
}
