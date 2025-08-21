package sc;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.io.IOException;

/* renamed from: sc.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17039b implements Ef.a {

    /* renamed from: a, reason: collision with root package name */
    public static final Ef.a f160114a = new C17039b();

    /* renamed from: sc.b$a */
    private static final class a implements Df.c<AbstractC17038a> {

        /* renamed from: a, reason: collision with root package name */
        static final a f160115a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f160116b = Df.b.d("sdkVersion");

        /* renamed from: c, reason: collision with root package name */
        private static final Df.b f160117c = Df.b.d("model");

        /* renamed from: d, reason: collision with root package name */
        private static final Df.b f160118d = Df.b.d("hardware");

        /* renamed from: e, reason: collision with root package name */
        private static final Df.b f160119e = Df.b.d("device");

        /* renamed from: f, reason: collision with root package name */
        private static final Df.b f160120f = Df.b.d("product");

        /* renamed from: g, reason: collision with root package name */
        private static final Df.b f160121g = Df.b.d("osBuild");

        /* renamed from: h, reason: collision with root package name */
        private static final Df.b f160122h = Df.b.d("manufacturer");

        /* renamed from: i, reason: collision with root package name */
        private static final Df.b f160123i = Df.b.d("fingerprint");

        /* renamed from: j, reason: collision with root package name */
        private static final Df.b f160124j = Df.b.d("locale");

        /* renamed from: k, reason: collision with root package name */
        private static final Df.b f160125k = Df.b.d(PlaceTypes.COUNTRY);

        /* renamed from: l, reason: collision with root package name */
        private static final Df.b f160126l = Df.b.d("mccMnc");

        /* renamed from: m, reason: collision with root package name */
        private static final Df.b f160127m = Df.b.d("applicationBuild");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC17038a abstractC17038a, Df.d dVar) throws IOException {
            dVar.a(f160116b, abstractC17038a.m());
            dVar.a(f160117c, abstractC17038a.j());
            dVar.a(f160118d, abstractC17038a.f());
            dVar.a(f160119e, abstractC17038a.d());
            dVar.a(f160120f, abstractC17038a.l());
            dVar.a(f160121g, abstractC17038a.k());
            dVar.a(f160122h, abstractC17038a.h());
            dVar.a(f160123i, abstractC17038a.e());
            dVar.a(f160124j, abstractC17038a.g());
            dVar.a(f160125k, abstractC17038a.c());
            dVar.a(f160126l, abstractC17038a.i());
            dVar.a(f160127m, abstractC17038a.b());
        }

        private a() {
        }
    }

    /* renamed from: sc.b$b, reason: collision with other inner class name */
    private static final class C2500b implements Df.c<AbstractC17051n> {

        /* renamed from: a, reason: collision with root package name */
        static final C2500b f160128a = new C2500b();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f160129b = Df.b.d("logRequest");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC17051n abstractC17051n, Df.d dVar) throws IOException {
            dVar.a(f160129b, abstractC17051n.c());
        }

        private C2500b() {
        }
    }

    /* renamed from: sc.b$c */
    private static final class c implements Df.c<AbstractC17052o> {

        /* renamed from: a, reason: collision with root package name */
        static final c f160130a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f160131b = Df.b.d("clientType");

        /* renamed from: c, reason: collision with root package name */
        private static final Df.b f160132c = Df.b.d("androidClientInfo");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC17052o abstractC17052o, Df.d dVar) throws IOException {
            dVar.a(f160131b, abstractC17052o.c());
            dVar.a(f160132c, abstractC17052o.b());
        }

        private c() {
        }
    }

    /* renamed from: sc.b$d */
    private static final class d implements Df.c<AbstractC17053p> {

        /* renamed from: a, reason: collision with root package name */
        static final d f160133a = new d();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f160134b = Df.b.d("privacyContext");

        /* renamed from: c, reason: collision with root package name */
        private static final Df.b f160135c = Df.b.d("productIdOrigin");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC17053p abstractC17053p, Df.d dVar) throws IOException {
            dVar.a(f160134b, abstractC17053p.b());
            dVar.a(f160135c, abstractC17053p.c());
        }

        private d() {
        }
    }

    /* renamed from: sc.b$e */
    private static final class e implements Df.c<AbstractC17054q> {

        /* renamed from: a, reason: collision with root package name */
        static final e f160136a = new e();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f160137b = Df.b.d("clearBlob");

        /* renamed from: c, reason: collision with root package name */
        private static final Df.b f160138c = Df.b.d("encryptedBlob");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC17054q abstractC17054q, Df.d dVar) throws IOException {
            dVar.a(f160137b, abstractC17054q.b());
            dVar.a(f160138c, abstractC17054q.c());
        }

        private e() {
        }
    }

    /* renamed from: sc.b$f */
    private static final class f implements Df.c<AbstractC17055r> {

        /* renamed from: a, reason: collision with root package name */
        static final f f160139a = new f();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f160140b = Df.b.d("originAssociatedProductId");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC17055r abstractC17055r, Df.d dVar) throws IOException {
            dVar.a(f160140b, abstractC17055r.b());
        }

        private f() {
        }
    }

    /* renamed from: sc.b$g */
    private static final class g implements Df.c<AbstractC17056s> {

        /* renamed from: a, reason: collision with root package name */
        static final g f160141a = new g();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f160142b = Df.b.d("prequest");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC17056s abstractC17056s, Df.d dVar) throws IOException {
            dVar.a(f160142b, abstractC17056s.b());
        }

        private g() {
        }
    }

    /* renamed from: sc.b$h */
    private static final class h implements Df.c<AbstractC17057t> {

        /* renamed from: a, reason: collision with root package name */
        static final h f160143a = new h();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f160144b = Df.b.d("eventTimeMs");

        /* renamed from: c, reason: collision with root package name */
        private static final Df.b f160145c = Df.b.d("eventCode");

        /* renamed from: d, reason: collision with root package name */
        private static final Df.b f160146d = Df.b.d("complianceData");

        /* renamed from: e, reason: collision with root package name */
        private static final Df.b f160147e = Df.b.d("eventUptimeMs");

        /* renamed from: f, reason: collision with root package name */
        private static final Df.b f160148f = Df.b.d("sourceExtension");

        /* renamed from: g, reason: collision with root package name */
        private static final Df.b f160149g = Df.b.d("sourceExtensionJsonProto3");

        /* renamed from: h, reason: collision with root package name */
        private static final Df.b f160150h = Df.b.d("timezoneOffsetSeconds");

        /* renamed from: i, reason: collision with root package name */
        private static final Df.b f160151i = Df.b.d("networkConnectionInfo");

        /* renamed from: j, reason: collision with root package name */
        private static final Df.b f160152j = Df.b.d("experimentIds");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC17057t abstractC17057t, Df.d dVar) throws IOException {
            dVar.d(f160144b, abstractC17057t.d());
            dVar.a(f160145c, abstractC17057t.c());
            dVar.a(f160146d, abstractC17057t.b());
            dVar.d(f160147e, abstractC17057t.e());
            dVar.a(f160148f, abstractC17057t.h());
            dVar.a(f160149g, abstractC17057t.i());
            dVar.d(f160150h, abstractC17057t.j());
            dVar.a(f160151i, abstractC17057t.g());
            dVar.a(f160152j, abstractC17057t.f());
        }

        private h() {
        }
    }

    /* renamed from: sc.b$i */
    private static final class i implements Df.c<AbstractC17058u> {

        /* renamed from: a, reason: collision with root package name */
        static final i f160153a = new i();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f160154b = Df.b.d("requestTimeMs");

        /* renamed from: c, reason: collision with root package name */
        private static final Df.b f160155c = Df.b.d("requestUptimeMs");

        /* renamed from: d, reason: collision with root package name */
        private static final Df.b f160156d = Df.b.d("clientInfo");

        /* renamed from: e, reason: collision with root package name */
        private static final Df.b f160157e = Df.b.d("logSource");

        /* renamed from: f, reason: collision with root package name */
        private static final Df.b f160158f = Df.b.d("logSourceName");

        /* renamed from: g, reason: collision with root package name */
        private static final Df.b f160159g = Df.b.d("logEvent");

        /* renamed from: h, reason: collision with root package name */
        private static final Df.b f160160h = Df.b.d("qosTier");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC17058u abstractC17058u, Df.d dVar) throws IOException {
            dVar.d(f160154b, abstractC17058u.g());
            dVar.d(f160155c, abstractC17058u.h());
            dVar.a(f160156d, abstractC17058u.b());
            dVar.a(f160157e, abstractC17058u.d());
            dVar.a(f160158f, abstractC17058u.e());
            dVar.a(f160159g, abstractC17058u.c());
            dVar.a(f160160h, abstractC17058u.f());
        }

        private i() {
        }
    }

    /* renamed from: sc.b$j */
    private static final class j implements Df.c<AbstractC17060w> {

        /* renamed from: a, reason: collision with root package name */
        static final j f160161a = new j();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f160162b = Df.b.d("networkType");

        /* renamed from: c, reason: collision with root package name */
        private static final Df.b f160163c = Df.b.d("mobileSubtype");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC17060w abstractC17060w, Df.d dVar) throws IOException {
            dVar.a(f160162b, abstractC17060w.c());
            dVar.a(f160163c, abstractC17060w.b());
        }

        private j() {
        }
    }

    @Override // Ef.a
    public void a(Ef.b<?> bVar) {
        C2500b c2500b = C2500b.f160128a;
        bVar.a(AbstractC17051n.class, c2500b);
        bVar.a(C17041d.class, c2500b);
        i iVar = i.f160153a;
        bVar.a(AbstractC17058u.class, iVar);
        bVar.a(C17048k.class, iVar);
        c cVar = c.f160130a;
        bVar.a(AbstractC17052o.class, cVar);
        bVar.a(C17042e.class, cVar);
        a aVar = a.f160115a;
        bVar.a(AbstractC17038a.class, aVar);
        bVar.a(C17040c.class, aVar);
        h hVar = h.f160143a;
        bVar.a(AbstractC17057t.class, hVar);
        bVar.a(C17047j.class, hVar);
        d dVar = d.f160133a;
        bVar.a(AbstractC17053p.class, dVar);
        bVar.a(C17043f.class, dVar);
        g gVar = g.f160141a;
        bVar.a(AbstractC17056s.class, gVar);
        bVar.a(C17046i.class, gVar);
        f fVar = f.f160139a;
        bVar.a(AbstractC17055r.class, fVar);
        bVar.a(C17045h.class, fVar);
        j jVar = j.f160161a;
        bVar.a(AbstractC17060w.class, jVar);
        bVar.a(C17050m.class, jVar);
        e eVar = e.f160136a;
        bVar.a(AbstractC17054q.class, eVar);
        bVar.a(C17044g.class, eVar);
    }

    private C17039b() {
    }
}
