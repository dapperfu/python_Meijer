package gg;

import java.io.IOException;

/* renamed from: gg.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C14254a implements Cf.a {

    /* renamed from: a, reason: collision with root package name */
    public static final Cf.a f133358a = new C14254a();

    /* renamed from: gg.a$a, reason: collision with other inner class name */
    private static final class C2095a implements Bf.c<AbstractC14257d> {

        /* renamed from: a, reason: collision with root package name */
        static final C2095a f133359a = new C2095a();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f133360b = Bf.b.d("rolloutId");

        /* renamed from: c, reason: collision with root package name */
        private static final Bf.b f133361c = Bf.b.d("variantId");

        /* renamed from: d, reason: collision with root package name */
        private static final Bf.b f133362d = Bf.b.d("parameterKey");

        /* renamed from: e, reason: collision with root package name */
        private static final Bf.b f133363e = Bf.b.d("parameterValue");

        /* renamed from: f, reason: collision with root package name */
        private static final Bf.b f133364f = Bf.b.d("templateVersion");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC14257d abstractC14257d, Bf.d dVar) throws IOException {
            dVar.f(f133360b, abstractC14257d.d());
            dVar.f(f133361c, abstractC14257d.f());
            dVar.f(f133362d, abstractC14257d.b());
            dVar.f(f133363e, abstractC14257d.c());
            dVar.d(f133364f, abstractC14257d.e());
        }

        private C2095a() {
        }
    }

    @Override // Cf.a
    public void a(Cf.b<?> bVar) {
        C2095a c2095a = C2095a.f133359a;
        bVar.a(AbstractC14257d.class, c2095a);
        bVar.a(C14255b.class, c2095a);
    }

    private C14254a() {
    }
}
