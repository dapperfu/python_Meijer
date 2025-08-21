package ig;

import java.io.IOException;

/* renamed from: ig.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C14728a implements Ef.a {

    /* renamed from: a, reason: collision with root package name */
    public static final Ef.a f137568a = new C14728a();

    /* renamed from: ig.a$a, reason: collision with other inner class name */
    private static final class C2168a implements Df.c<AbstractC14731d> {

        /* renamed from: a, reason: collision with root package name */
        static final C2168a f137569a = new C2168a();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f137570b = Df.b.d("rolloutId");

        /* renamed from: c, reason: collision with root package name */
        private static final Df.b f137571c = Df.b.d("variantId");

        /* renamed from: d, reason: collision with root package name */
        private static final Df.b f137572d = Df.b.d("parameterKey");

        /* renamed from: e, reason: collision with root package name */
        private static final Df.b f137573e = Df.b.d("parameterValue");

        /* renamed from: f, reason: collision with root package name */
        private static final Df.b f137574f = Df.b.d("templateVersion");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC14731d abstractC14731d, Df.d dVar) throws IOException {
            dVar.a(f137570b, abstractC14731d.d());
            dVar.a(f137571c, abstractC14731d.f());
            dVar.a(f137572d, abstractC14731d.b());
            dVar.a(f137573e, abstractC14731d.c());
            dVar.d(f137574f, abstractC14731d.e());
        }

        private C2168a() {
        }
    }

    @Override // Ef.a
    public void a(Ef.b<?> bVar) {
        C2168a c2168a = C2168a.f137569a;
        bVar.a(AbstractC14731d.class, c2168a);
        bVar.a(C14729b.class, c2168a);
    }

    private C14728a() {
    }
}
