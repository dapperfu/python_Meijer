package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* loaded from: classes7.dex */
public class J<K, V> {

    static class a<K, V> {
    }

    static <K, V> int b(a<K, V> aVar, K k10, V v10) {
        throw null;
    }

    static <K, V> void d(CodedOutputStream codedOutputStream, a<K, V> aVar, K k10, V v10) throws IOException {
        throw null;
    }

    a<K, V> c() {
        return null;
    }

    public int a(int i10, K k10, V v10) {
        return CodedOutputStream.T(i10) + CodedOutputStream.C(b(null, k10, v10));
    }
}
