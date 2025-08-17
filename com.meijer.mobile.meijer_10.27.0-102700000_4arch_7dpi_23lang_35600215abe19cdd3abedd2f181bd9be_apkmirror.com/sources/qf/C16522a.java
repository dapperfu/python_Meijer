package qf;

import java.io.IOException;

/* renamed from: qf.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C16522a implements Cf.a {

    /* renamed from: a, reason: collision with root package name */
    public static final Cf.a f157208a = new C16522a();

    /* renamed from: qf.a$a, reason: collision with other inner class name */
    private static final class C2436a implements Bf.c<j> {

        /* renamed from: a, reason: collision with root package name */
        static final C2436a f157209a = new C2436a();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f157210b = Bf.b.d("rolloutId");

        /* renamed from: c, reason: collision with root package name */
        private static final Bf.b f157211c = Bf.b.d("parameterKey");

        /* renamed from: d, reason: collision with root package name */
        private static final Bf.b f157212d = Bf.b.d("parameterValue");

        /* renamed from: e, reason: collision with root package name */
        private static final Bf.b f157213e = Bf.b.d("variantId");

        /* renamed from: f, reason: collision with root package name */
        private static final Bf.b f157214f = Bf.b.d("templateVersion");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(j jVar, Bf.d dVar) throws IOException {
            dVar.f(f157210b, jVar.e());
            dVar.f(f157211c, jVar.c());
            dVar.f(f157212d, jVar.d());
            dVar.f(f157213e, jVar.g());
            dVar.d(f157214f, jVar.f());
        }

        private C2436a() {
        }
    }

    @Override // Cf.a
    public void a(Cf.b<?> bVar) {
        C2436a c2436a = C2436a.f157209a;
        bVar.a(j.class, c2436a);
        bVar.a(C16523b.class, c2436a);
    }

    private C16522a() {
    }
}
