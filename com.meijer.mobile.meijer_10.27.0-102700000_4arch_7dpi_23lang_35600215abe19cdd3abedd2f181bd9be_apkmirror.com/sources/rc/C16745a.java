package rc;

import java.io.IOException;
import uc.C17239a;
import uc.C17240b;

/* renamed from: rc.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16745a implements Cf.a {

    /* renamed from: a, reason: collision with root package name */
    public static final Cf.a f157907a = new C16745a();

    /* renamed from: rc.a$a, reason: collision with other inner class name */
    private static final class C2444a implements Bf.c<C17239a> {

        /* renamed from: a, reason: collision with root package name */
        static final C2444a f157908a = new C2444a();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f157909b = Bf.b.a("window").b(Ef.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final Bf.b f157910c = Bf.b.a("logSourceMetrics").b(Ef.a.b().c(2).a()).a();

        /* renamed from: d, reason: collision with root package name */
        private static final Bf.b f157911d = Bf.b.a("globalMetrics").b(Ef.a.b().c(3).a()).a();

        /* renamed from: e, reason: collision with root package name */
        private static final Bf.b f157912e = Bf.b.a("appNamespace").b(Ef.a.b().c(4).a()).a();

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C17239a c17239a, Bf.d dVar) throws IOException {
            dVar.f(f157909b, c17239a.d());
            dVar.f(f157910c, c17239a.c());
            dVar.f(f157911d, c17239a.b());
            dVar.f(f157912e, c17239a.a());
        }

        private C2444a() {
        }
    }

    /* renamed from: rc.a$b */
    private static final class b implements Bf.c<C17240b> {

        /* renamed from: a, reason: collision with root package name */
        static final b f157913a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f157914b = Bf.b.a("storageMetrics").b(Ef.a.b().c(1).a()).a();

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C17240b c17240b, Bf.d dVar) throws IOException {
            dVar.f(f157914b, c17240b.a());
        }

        private b() {
        }
    }

    /* renamed from: rc.a$c */
    private static final class c implements Bf.c<uc.c> {

        /* renamed from: a, reason: collision with root package name */
        static final c f157915a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f157916b = Bf.b.a("eventsDroppedCount").b(Ef.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final Bf.b f157917c = Bf.b.a("reason").b(Ef.a.b().c(3).a()).a();

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(uc.c cVar, Bf.d dVar) throws IOException {
            dVar.d(f157916b, cVar.a());
            dVar.f(f157917c, cVar.b());
        }

        private c() {
        }
    }

    /* renamed from: rc.a$d */
    private static final class d implements Bf.c<uc.d> {

        /* renamed from: a, reason: collision with root package name */
        static final d f157918a = new d();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f157919b = Bf.b.a("logSource").b(Ef.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final Bf.b f157920c = Bf.b.a("logEventDropped").b(Ef.a.b().c(2).a()).a();

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(uc.d dVar, Bf.d dVar2) throws IOException {
            dVar2.f(f157919b, dVar.b());
            dVar2.f(f157920c, dVar.a());
        }

        private d() {
        }
    }

    /* renamed from: rc.a$e */
    private static final class e implements Bf.c<m> {

        /* renamed from: a, reason: collision with root package name */
        static final e f157921a = new e();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f157922b = Bf.b.d("clientMetrics");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(m mVar, Bf.d dVar) throws IOException {
            dVar.f(f157922b, mVar.b());
        }

        private e() {
        }
    }

    /* renamed from: rc.a$f */
    private static final class f implements Bf.c<uc.e> {

        /* renamed from: a, reason: collision with root package name */
        static final f f157923a = new f();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f157924b = Bf.b.a("currentCacheSizeBytes").b(Ef.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final Bf.b f157925c = Bf.b.a("maxCacheSizeBytes").b(Ef.a.b().c(2).a()).a();

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(uc.e eVar, Bf.d dVar) throws IOException {
            dVar.d(f157924b, eVar.a());
            dVar.d(f157925c, eVar.b());
        }

        private f() {
        }
    }

    /* renamed from: rc.a$g */
    private static final class g implements Bf.c<uc.f> {

        /* renamed from: a, reason: collision with root package name */
        static final g f157926a = new g();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f157927b = Bf.b.a("startMs").b(Ef.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final Bf.b f157928c = Bf.b.a("endMs").b(Ef.a.b().c(2).a()).a();

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(uc.f fVar, Bf.d dVar) throws IOException {
            dVar.d(f157927b, fVar.b());
            dVar.d(f157928c, fVar.a());
        }

        private g() {
        }
    }

    @Override // Cf.a
    public void a(Cf.b<?> bVar) {
        bVar.a(m.class, e.f157921a);
        bVar.a(C17239a.class, C2444a.f157908a);
        bVar.a(uc.f.class, g.f157926a);
        bVar.a(uc.d.class, d.f157918a);
        bVar.a(uc.c.class, c.f157915a);
        bVar.a(C17240b.class, b.f157913a);
        bVar.a(uc.e.class, f.f157923a);
    }

    private C16745a() {
    }
}
