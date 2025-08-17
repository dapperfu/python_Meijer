package com.google.protobuf;

import com.google.protobuf.r0;
import java.io.IOException;

/* loaded from: classes7.dex */
public class I<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final a<K, V> f90442a;

    /* renamed from: b, reason: collision with root package name */
    private final K f90443b;

    /* renamed from: c, reason: collision with root package name */
    private final V f90444c;

    static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final r0.b f90445a;

        /* renamed from: b, reason: collision with root package name */
        public final K f90446b;

        /* renamed from: c, reason: collision with root package name */
        public final r0.b f90447c;

        /* renamed from: d, reason: collision with root package name */
        public final V f90448d;

        public a(r0.b bVar, K k10, r0.b bVar2, V v10) {
            this.f90445a = bVar;
            this.f90446b = k10;
            this.f90447c = bVar2;
            this.f90448d = v10;
        }
    }

    static <K, V> int b(a<K, V> aVar, K k10, V v10) {
        return C11532s.d(aVar.f90445a, 1, k10) + C11532s.d(aVar.f90447c, 2, v10);
    }

    public static <K, V> I<K, V> d(r0.b bVar, K k10, r0.b bVar2, V v10) {
        return new I<>(bVar, k10, bVar2, v10);
    }

    static <K, V> void e(CodedOutputStream codedOutputStream, a<K, V> aVar, K k10, V v10) throws IOException {
        C11532s.A(codedOutputStream, aVar.f90445a, 1, k10);
        C11532s.A(codedOutputStream, aVar.f90447c, 2, v10);
    }

    a<K, V> c() {
        return this.f90442a;
    }

    private I(r0.b bVar, K k10, r0.b bVar2, V v10) {
        this.f90442a = new a<>(bVar, k10, bVar2, v10);
        this.f90443b = k10;
        this.f90444c = v10;
    }

    public int a(int i10, K k10, V v10) {
        return CodedOutputStream.T(i10) + CodedOutputStream.C(b(this.f90442a, k10, v10));
    }
}
