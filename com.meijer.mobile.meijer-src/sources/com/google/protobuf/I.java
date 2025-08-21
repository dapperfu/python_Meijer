package com.google.protobuf;

import com.google.protobuf.r0;
import java.io.IOException;

/* loaded from: classes8.dex */
public class I<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final a<K, V> f91281a;

    /* renamed from: b, reason: collision with root package name */
    private final K f91282b;

    /* renamed from: c, reason: collision with root package name */
    private final V f91283c;

    static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final r0.b f91284a;

        /* renamed from: b, reason: collision with root package name */
        public final K f91285b;

        /* renamed from: c, reason: collision with root package name */
        public final r0.b f91286c;

        /* renamed from: d, reason: collision with root package name */
        public final V f91287d;

        public a(r0.b bVar, K k10, r0.b bVar2, V v10) {
            this.f91284a = bVar;
            this.f91285b = k10;
            this.f91286c = bVar2;
            this.f91287d = v10;
        }
    }

    static <K, V> int b(a<K, V> aVar, K k10, V v10) {
        return C11657s.d(aVar.f91284a, 1, k10) + C11657s.d(aVar.f91286c, 2, v10);
    }

    public static <K, V> I<K, V> d(r0.b bVar, K k10, r0.b bVar2, V v10) {
        return new I<>(bVar, k10, bVar2, v10);
    }

    static <K, V> void e(CodedOutputStream codedOutputStream, a<K, V> aVar, K k10, V v10) throws IOException {
        C11657s.A(codedOutputStream, aVar.f91284a, 1, k10);
        C11657s.A(codedOutputStream, aVar.f91286c, 2, v10);
    }

    a<K, V> c() {
        return this.f91281a;
    }

    private I(r0.b bVar, K k10, r0.b bVar2, V v10) {
        this.f91281a = new a<>(bVar, k10, bVar2, v10);
        this.f91282b = k10;
        this.f91283c = v10;
    }

    public int a(int i10, K k10, V v10) {
        return CodedOutputStream.T(i10) + CodedOutputStream.C(b(this.f91281a, k10, v10));
    }
}
