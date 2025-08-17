package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.J;
import java.util.Map;

/* loaded from: classes7.dex */
final class M implements L {
    @Override // com.google.crypto.tink.shaded.protobuf.L
    public Object f(Object obj) {
        ((K) obj).k();
        return obj;
    }

    private static <K, V> int i(int i10, Object obj, Object obj2) {
        K k10 = (K) obj;
        J j10 = (J) obj2;
        int iA = 0;
        if (k10.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : k10.entrySet()) {
            iA += j10.a(i10, entry.getKey(), entry.getValue());
        }
        return iA;
    }

    private static <K, V> K<K, V> j(Object obj, Object obj2) {
        K<K, V> kQ = (K) obj;
        K<K, V> k10 = (K) obj2;
        if (!k10.isEmpty()) {
            if (!kQ.j()) {
                kQ = kQ.q();
            }
            kQ.n(k10);
        }
        return kQ;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.L
    public J.a<?, ?> b(Object obj) {
        ((J) obj).c();
        return null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.L
    public Map<?, ?> c(Object obj) {
        return (K) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.L
    public Map<?, ?> e(Object obj) {
        return (K) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.L
    public boolean h(Object obj) {
        return !((K) obj).j();
    }

    M() {
    }

    @Override // com.google.crypto.tink.shaded.protobuf.L
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.L
    public Object d(Object obj) {
        return K.d().q();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.L
    public int g(int i10, Object obj, Object obj2) {
        return i(i10, obj, obj2);
    }
}
