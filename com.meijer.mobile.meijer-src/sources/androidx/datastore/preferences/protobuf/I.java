package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.q0;
import java.io.IOException;

/* loaded from: classes.dex */
public class I<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final a<K, V> f54393a;

    /* renamed from: b, reason: collision with root package name */
    private final K f54394b;

    /* renamed from: c, reason: collision with root package name */
    private final V f54395c;

    static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final q0.b f54396a;

        /* renamed from: b, reason: collision with root package name */
        public final K f54397b;

        /* renamed from: c, reason: collision with root package name */
        public final q0.b f54398c;

        /* renamed from: d, reason: collision with root package name */
        public final V f54399d;

        public a(q0.b bVar, K k10, q0.b bVar2, V v10) {
            this.f54396a = bVar;
            this.f54397b = k10;
            this.f54398c = bVar2;
            this.f54399d = v10;
        }
    }

    static <K, V> int b(a<K, V> aVar, K k10, V v10) {
        return C6094s.d(aVar.f54396a, 1, k10) + C6094s.d(aVar.f54398c, 2, v10);
    }

    public static <K, V> I<K, V> d(q0.b bVar, K k10, q0.b bVar2, V v10) {
        return new I<>(bVar, k10, bVar2, v10);
    }

    static <K, V> void e(CodedOutputStream codedOutputStream, a<K, V> aVar, K k10, V v10) throws IOException {
        C6094s.A(codedOutputStream, aVar.f54396a, 1, k10);
        C6094s.A(codedOutputStream, aVar.f54398c, 2, v10);
    }

    a<K, V> c() {
        return this.f54393a;
    }

    private I(q0.b bVar, K k10, q0.b bVar2, V v10) {
        this.f54393a = new a<>(bVar, k10, bVar2, v10);
        this.f54394b = k10;
        this.f54395c = v10;
    }

    public int a(int i10, K k10, V v10) {
        return CodedOutputStream.U(i10) + CodedOutputStream.C(b(this.f54393a, k10, v10));
    }
}
