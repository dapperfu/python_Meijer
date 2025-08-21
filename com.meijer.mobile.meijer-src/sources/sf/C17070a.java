package sf;

import java.io.IOException;

/* renamed from: sf.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C17070a implements Ef.a {

    /* renamed from: a, reason: collision with root package name */
    public static final Ef.a f160323a = new C17070a();

    /* renamed from: sf.a$a, reason: collision with other inner class name */
    private static final class C2501a implements Df.c<j> {

        /* renamed from: a, reason: collision with root package name */
        static final C2501a f160324a = new C2501a();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f160325b = Df.b.d("rolloutId");

        /* renamed from: c, reason: collision with root package name */
        private static final Df.b f160326c = Df.b.d("parameterKey");

        /* renamed from: d, reason: collision with root package name */
        private static final Df.b f160327d = Df.b.d("parameterValue");

        /* renamed from: e, reason: collision with root package name */
        private static final Df.b f160328e = Df.b.d("variantId");

        /* renamed from: f, reason: collision with root package name */
        private static final Df.b f160329f = Df.b.d("templateVersion");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(j jVar, Df.d dVar) throws IOException {
            dVar.a(f160325b, jVar.e());
            dVar.a(f160326c, jVar.c());
            dVar.a(f160327d, jVar.d());
            dVar.a(f160328e, jVar.g());
            dVar.d(f160329f, jVar.f());
        }

        private C2501a() {
        }
    }

    @Override // Ef.a
    public void a(Ef.b<?> bVar) {
        C2501a c2501a = C2501a.f160324a;
        bVar.a(j.class, c2501a);
        bVar.a(C17071b.class, c2501a);
    }

    private C17070a() {
    }
}
