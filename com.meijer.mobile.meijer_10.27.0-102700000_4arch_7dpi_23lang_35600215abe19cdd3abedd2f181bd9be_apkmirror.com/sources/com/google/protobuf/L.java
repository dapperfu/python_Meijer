package com.google.protobuf;

import com.google.protobuf.I;
import java.util.Map;

/* loaded from: classes7.dex */
class L implements K {
    @Override // com.google.protobuf.K
    public Object f(Object obj) {
        ((J) obj).k();
        return obj;
    }

    private static <K, V> int i(int i10, Object obj, Object obj2) {
        J j10 = (J) obj;
        I i11 = (I) obj2;
        int iA = 0;
        if (j10.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : j10.entrySet()) {
            iA += i11.a(i10, entry.getKey(), entry.getValue());
        }
        return iA;
    }

    private static <K, V> J<K, V> j(Object obj, Object obj2) {
        J<K, V> jQ = (J) obj;
        J<K, V> j10 = (J) obj2;
        if (!j10.isEmpty()) {
            if (!jQ.j()) {
                jQ = jQ.q();
            }
            jQ.n(j10);
        }
        return jQ;
    }

    @Override // com.google.protobuf.K
    public I.a<?, ?> b(Object obj) {
        return ((I) obj).c();
    }

    @Override // com.google.protobuf.K
    public Map<?, ?> c(Object obj) {
        return (J) obj;
    }

    @Override // com.google.protobuf.K
    public Map<?, ?> e(Object obj) {
        return (J) obj;
    }

    @Override // com.google.protobuf.K
    public boolean h(Object obj) {
        return !((J) obj).j();
    }

    L() {
    }

    @Override // com.google.protobuf.K
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // com.google.protobuf.K
    public Object d(Object obj) {
        return J.d().q();
    }

    @Override // com.google.protobuf.K
    public int g(int i10, Object obj, Object obj2) {
        return i(i10, obj, obj2);
    }
}
