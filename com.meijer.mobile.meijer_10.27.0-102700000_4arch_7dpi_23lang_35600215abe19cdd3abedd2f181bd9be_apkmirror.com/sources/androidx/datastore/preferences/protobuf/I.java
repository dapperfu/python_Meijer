package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.q0;
import java.io.IOException;

/* loaded from: classes.dex */
public class I<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final a<K, V> f54169a;

    /* renamed from: b, reason: collision with root package name */
    private final K f54170b;

    /* renamed from: c, reason: collision with root package name */
    private final V f54171c;

    static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final q0.b f54172a;

        /* renamed from: b, reason: collision with root package name */
        public final K f54173b;

        /* renamed from: c, reason: collision with root package name */
        public final q0.b f54174c;

        /* renamed from: d, reason: collision with root package name */
        public final V f54175d;

        public a(q0.b bVar, K k10, q0.b bVar2, V v10) {
            this.f54172a = bVar;
            this.f54173b = k10;
            this.f54174c = bVar2;
            this.f54175d = v10;
        }
    }

    static <K, V> int b(a<K, V> aVar, K k10, V v10) {
        return C5952s.d(aVar.f54172a, 1, k10) + C5952s.d(aVar.f54174c, 2, v10);
    }

    public static <K, V> I<K, V> d(q0.b bVar, K k10, q0.b bVar2, V v10) {
        return new I<>(bVar, k10, bVar2, v10);
    }

    static <K, V> void e(CodedOutputStream codedOutputStream, a<K, V> aVar, K k10, V v10) throws IOException {
        C5952s.A(codedOutputStream, aVar.f54172a, 1, k10);
        C5952s.A(codedOutputStream, aVar.f54174c, 2, v10);
    }

    a<K, V> c() {
        return this.f54169a;
    }

    private I(q0.b bVar, K k10, q0.b bVar2, V v10) {
        this.f54169a = new a<>(bVar, k10, bVar2, v10);
        this.f54170b = k10;
        this.f54171c = v10;
    }

    public int a(int i10, K k10, V v10) {
        return CodedOutputStream.U(i10) + CodedOutputStream.C(b(this.f54169a, k10, v10));
    }
}
