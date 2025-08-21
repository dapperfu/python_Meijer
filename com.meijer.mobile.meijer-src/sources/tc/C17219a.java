package tc;

import java.io.IOException;
import wc.C17856a;
import wc.C17857b;

/* renamed from: tc.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17219a implements Ef.a {

    /* renamed from: a, reason: collision with root package name */
    public static final Ef.a f162397a = new C17219a();

    /* renamed from: tc.a$a, reason: collision with other inner class name */
    private static final class C2550a implements Df.c<C17856a> {

        /* renamed from: a, reason: collision with root package name */
        static final C2550a f162398a = new C2550a();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f162399b = Df.b.a("window").b(Gf.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final Df.b f162400c = Df.b.a("logSourceMetrics").b(Gf.a.b().c(2).a()).a();

        /* renamed from: d, reason: collision with root package name */
        private static final Df.b f162401d = Df.b.a("globalMetrics").b(Gf.a.b().c(3).a()).a();

        /* renamed from: e, reason: collision with root package name */
        private static final Df.b f162402e = Df.b.a("appNamespace").b(Gf.a.b().c(4).a()).a();

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C17856a c17856a, Df.d dVar) throws IOException {
            dVar.a(f162399b, c17856a.d());
            dVar.a(f162400c, c17856a.c());
            dVar.a(f162401d, c17856a.b());
            dVar.a(f162402e, c17856a.a());
        }

        private C2550a() {
        }
    }

    /* renamed from: tc.a$b */
    private static final class b implements Df.c<C17857b> {

        /* renamed from: a, reason: collision with root package name */
        static final b f162403a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f162404b = Df.b.a("storageMetrics").b(Gf.a.b().c(1).a()).a();

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C17857b c17857b, Df.d dVar) throws IOException {
            dVar.a(f162404b, c17857b.a());
        }

        private b() {
        }
    }

    /* renamed from: tc.a$c */
    private static final class c implements Df.c<wc.c> {

        /* renamed from: a, reason: collision with root package name */
        static final c f162405a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f162406b = Df.b.a("eventsDroppedCount").b(Gf.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final Df.b f162407c = Df.b.a("reason").b(Gf.a.b().c(3).a()).a();

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(wc.c cVar, Df.d dVar) throws IOException {
            dVar.d(f162406b, cVar.a());
            dVar.a(f162407c, cVar.b());
        }

        private c() {
        }
    }

    /* renamed from: tc.a$d */
    private static final class d implements Df.c<wc.d> {

        /* renamed from: a, reason: collision with root package name */
        static final d f162408a = new d();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f162409b = Df.b.a("logSource").b(Gf.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final Df.b f162410c = Df.b.a("logEventDropped").b(Gf.a.b().c(2).a()).a();

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(wc.d dVar, Df.d dVar2) throws IOException {
            dVar2.a(f162409b, dVar.b());
            dVar2.a(f162410c, dVar.a());
        }

        private d() {
        }
    }

    /* renamed from: tc.a$e */
    private static final class e implements Df.c<m> {

        /* renamed from: a, reason: collision with root package name */
        static final e f162411a = new e();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f162412b = Df.b.d("clientMetrics");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(m mVar, Df.d dVar) throws IOException {
            dVar.a(f162412b, mVar.b());
        }

        private e() {
        }
    }

    /* renamed from: tc.a$f */
    private static final class f implements Df.c<wc.e> {

        /* renamed from: a, reason: collision with root package name */
        static final f f162413a = new f();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f162414b = Df.b.a("currentCacheSizeBytes").b(Gf.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final Df.b f162415c = Df.b.a("maxCacheSizeBytes").b(Gf.a.b().c(2).a()).a();

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(wc.e eVar, Df.d dVar) throws IOException {
            dVar.d(f162414b, eVar.a());
            dVar.d(f162415c, eVar.b());
        }

        private f() {
        }
    }

    /* renamed from: tc.a$g */
    private static final class g implements Df.c<wc.f> {

        /* renamed from: a, reason: collision with root package name */
        static final g f162416a = new g();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f162417b = Df.b.a("startMs").b(Gf.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final Df.b f162418c = Df.b.a("endMs").b(Gf.a.b().c(2).a()).a();

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(wc.f fVar, Df.d dVar) throws IOException {
            dVar.d(f162417b, fVar.b());
            dVar.d(f162418c, fVar.a());
        }

        private g() {
        }
    }

    @Override // Ef.a
    public void a(Ef.b<?> bVar) {
        bVar.a(m.class, e.f162411a);
        bVar.a(C17856a.class, C2550a.f162398a);
        bVar.a(wc.f.class, g.f162416a);
        bVar.a(wc.d.class, d.f162408a);
        bVar.a(wc.c.class, c.f162405a);
        bVar.a(C17857b.class, b.f162403a);
        bVar.a(wc.e.class, f.f162413a);
    }

    private C17219a() {
    }
}
