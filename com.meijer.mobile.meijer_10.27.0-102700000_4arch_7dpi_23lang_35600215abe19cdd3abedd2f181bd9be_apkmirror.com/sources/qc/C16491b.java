package qc;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.io.IOException;

/* renamed from: qc.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16491b implements Cf.a {

    /* renamed from: a, reason: collision with root package name */
    public static final Cf.a f156999a = new C16491b();

    /* renamed from: qc.b$a */
    private static final class a implements Bf.c<AbstractC16490a> {

        /* renamed from: a, reason: collision with root package name */
        static final a f157000a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f157001b = Bf.b.d("sdkVersion");

        /* renamed from: c, reason: collision with root package name */
        private static final Bf.b f157002c = Bf.b.d("model");

        /* renamed from: d, reason: collision with root package name */
        private static final Bf.b f157003d = Bf.b.d("hardware");

        /* renamed from: e, reason: collision with root package name */
        private static final Bf.b f157004e = Bf.b.d("device");

        /* renamed from: f, reason: collision with root package name */
        private static final Bf.b f157005f = Bf.b.d("product");

        /* renamed from: g, reason: collision with root package name */
        private static final Bf.b f157006g = Bf.b.d("osBuild");

        /* renamed from: h, reason: collision with root package name */
        private static final Bf.b f157007h = Bf.b.d("manufacturer");

        /* renamed from: i, reason: collision with root package name */
        private static final Bf.b f157008i = Bf.b.d("fingerprint");

        /* renamed from: j, reason: collision with root package name */
        private static final Bf.b f157009j = Bf.b.d("locale");

        /* renamed from: k, reason: collision with root package name */
        private static final Bf.b f157010k = Bf.b.d(PlaceTypes.COUNTRY);

        /* renamed from: l, reason: collision with root package name */
        private static final Bf.b f157011l = Bf.b.d("mccMnc");

        /* renamed from: m, reason: collision with root package name */
        private static final Bf.b f157012m = Bf.b.d("applicationBuild");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC16490a abstractC16490a, Bf.d dVar) throws IOException {
            dVar.f(f157001b, abstractC16490a.m());
            dVar.f(f157002c, abstractC16490a.j());
            dVar.f(f157003d, abstractC16490a.f());
            dVar.f(f157004e, abstractC16490a.d());
            dVar.f(f157005f, abstractC16490a.l());
            dVar.f(f157006g, abstractC16490a.k());
            dVar.f(f157007h, abstractC16490a.h());
            dVar.f(f157008i, abstractC16490a.e());
            dVar.f(f157009j, abstractC16490a.g());
            dVar.f(f157010k, abstractC16490a.c());
            dVar.f(f157011l, abstractC16490a.i());
            dVar.f(f157012m, abstractC16490a.b());
        }

        private a() {
        }
    }

    /* renamed from: qc.b$b, reason: collision with other inner class name */
    private static final class C2435b implements Bf.c<AbstractC16503n> {

        /* renamed from: a, reason: collision with root package name */
        static final C2435b f157013a = new C2435b();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f157014b = Bf.b.d("logRequest");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC16503n abstractC16503n, Bf.d dVar) throws IOException {
            dVar.f(f157014b, abstractC16503n.c());
        }

        private C2435b() {
        }
    }

    /* renamed from: qc.b$c */
    private static final class c implements Bf.c<AbstractC16504o> {

        /* renamed from: a, reason: collision with root package name */
        static final c f157015a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f157016b = Bf.b.d("clientType");

        /* renamed from: c, reason: collision with root package name */
        private static final Bf.b f157017c = Bf.b.d("androidClientInfo");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC16504o abstractC16504o, Bf.d dVar) throws IOException {
            dVar.f(f157016b, abstractC16504o.c());
            dVar.f(f157017c, abstractC16504o.b());
        }

        private c() {
        }
    }

    /* renamed from: qc.b$d */
    private static final class d implements Bf.c<AbstractC16505p> {

        /* renamed from: a, reason: collision with root package name */
        static final d f157018a = new d();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f157019b = Bf.b.d("privacyContext");

        /* renamed from: c, reason: collision with root package name */
        private static final Bf.b f157020c = Bf.b.d("productIdOrigin");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC16505p abstractC16505p, Bf.d dVar) throws IOException {
            dVar.f(f157019b, abstractC16505p.b());
            dVar.f(f157020c, abstractC16505p.c());
        }

        private d() {
        }
    }

    /* renamed from: qc.b$e */
    private static final class e implements Bf.c<AbstractC16506q> {

        /* renamed from: a, reason: collision with root package name */
        static final e f157021a = new e();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f157022b = Bf.b.d("clearBlob");

        /* renamed from: c, reason: collision with root package name */
        private static final Bf.b f157023c = Bf.b.d("encryptedBlob");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC16506q abstractC16506q, Bf.d dVar) throws IOException {
            dVar.f(f157022b, abstractC16506q.b());
            dVar.f(f157023c, abstractC16506q.c());
        }

        private e() {
        }
    }

    /* renamed from: qc.b$f */
    private static final class f implements Bf.c<AbstractC16507r> {

        /* renamed from: a, reason: collision with root package name */
        static final f f157024a = new f();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f157025b = Bf.b.d("originAssociatedProductId");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC16507r abstractC16507r, Bf.d dVar) throws IOException {
            dVar.f(f157025b, abstractC16507r.b());
        }

        private f() {
        }
    }

    /* renamed from: qc.b$g */
    private static final class g implements Bf.c<AbstractC16508s> {

        /* renamed from: a, reason: collision with root package name */
        static final g f157026a = new g();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f157027b = Bf.b.d("prequest");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC16508s abstractC16508s, Bf.d dVar) throws IOException {
            dVar.f(f157027b, abstractC16508s.b());
        }

        private g() {
        }
    }

    /* renamed from: qc.b$h */
    private static final class h implements Bf.c<AbstractC16509t> {

        /* renamed from: a, reason: collision with root package name */
        static final h f157028a = new h();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f157029b = Bf.b.d("eventTimeMs");

        /* renamed from: c, reason: collision with root package name */
        private static final Bf.b f157030c = Bf.b.d("eventCode");

        /* renamed from: d, reason: collision with root package name */
        private static final Bf.b f157031d = Bf.b.d("complianceData");

        /* renamed from: e, reason: collision with root package name */
        private static final Bf.b f157032e = Bf.b.d("eventUptimeMs");

        /* renamed from: f, reason: collision with root package name */
        private static final Bf.b f157033f = Bf.b.d("sourceExtension");

        /* renamed from: g, reason: collision with root package name */
        private static final Bf.b f157034g = Bf.b.d("sourceExtensionJsonProto3");

        /* renamed from: h, reason: collision with root package name */
        private static final Bf.b f157035h = Bf.b.d("timezoneOffsetSeconds");

        /* renamed from: i, reason: collision with root package name */
        private static final Bf.b f157036i = Bf.b.d("networkConnectionInfo");

        /* renamed from: j, reason: collision with root package name */
        private static final Bf.b f157037j = Bf.b.d("experimentIds");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC16509t abstractC16509t, Bf.d dVar) throws IOException {
            dVar.d(f157029b, abstractC16509t.d());
            dVar.f(f157030c, abstractC16509t.c());
            dVar.f(f157031d, abstractC16509t.b());
            dVar.d(f157032e, abstractC16509t.e());
            dVar.f(f157033f, abstractC16509t.h());
            dVar.f(f157034g, abstractC16509t.i());
            dVar.d(f157035h, abstractC16509t.j());
            dVar.f(f157036i, abstractC16509t.g());
            dVar.f(f157037j, abstractC16509t.f());
        }

        private h() {
        }
    }

    /* renamed from: qc.b$i */
    private static final class i implements Bf.c<AbstractC16510u> {

        /* renamed from: a, reason: collision with root package name */
        static final i f157038a = new i();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f157039b = Bf.b.d("requestTimeMs");

        /* renamed from: c, reason: collision with root package name */
        private static final Bf.b f157040c = Bf.b.d("requestUptimeMs");

        /* renamed from: d, reason: collision with root package name */
        private static final Bf.b f157041d = Bf.b.d("clientInfo");

        /* renamed from: e, reason: collision with root package name */
        private static final Bf.b f157042e = Bf.b.d("logSource");

        /* renamed from: f, reason: collision with root package name */
        private static final Bf.b f157043f = Bf.b.d("logSourceName");

        /* renamed from: g, reason: collision with root package name */
        private static final Bf.b f157044g = Bf.b.d("logEvent");

        /* renamed from: h, reason: collision with root package name */
        private static final Bf.b f157045h = Bf.b.d("qosTier");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC16510u abstractC16510u, Bf.d dVar) throws IOException {
            dVar.d(f157039b, abstractC16510u.g());
            dVar.d(f157040c, abstractC16510u.h());
            dVar.f(f157041d, abstractC16510u.b());
            dVar.f(f157042e, abstractC16510u.d());
            dVar.f(f157043f, abstractC16510u.e());
            dVar.f(f157044g, abstractC16510u.c());
            dVar.f(f157045h, abstractC16510u.f());
        }

        private i() {
        }
    }

    /* renamed from: qc.b$j */
    private static final class j implements Bf.c<AbstractC16512w> {

        /* renamed from: a, reason: collision with root package name */
        static final j f157046a = new j();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f157047b = Bf.b.d("networkType");

        /* renamed from: c, reason: collision with root package name */
        private static final Bf.b f157048c = Bf.b.d("mobileSubtype");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC16512w abstractC16512w, Bf.d dVar) throws IOException {
            dVar.f(f157047b, abstractC16512w.c());
            dVar.f(f157048c, abstractC16512w.b());
        }

        private j() {
        }
    }

    @Override // Cf.a
    public void a(Cf.b<?> bVar) {
        C2435b c2435b = C2435b.f157013a;
        bVar.a(AbstractC16503n.class, c2435b);
        bVar.a(C16493d.class, c2435b);
        i iVar = i.f157038a;
        bVar.a(AbstractC16510u.class, iVar);
        bVar.a(C16500k.class, iVar);
        c cVar = c.f157015a;
        bVar.a(AbstractC16504o.class, cVar);
        bVar.a(C16494e.class, cVar);
        a aVar = a.f157000a;
        bVar.a(AbstractC16490a.class, aVar);
        bVar.a(C16492c.class, aVar);
        h hVar = h.f157028a;
        bVar.a(AbstractC16509t.class, hVar);
        bVar.a(C16499j.class, hVar);
        d dVar = d.f157018a;
        bVar.a(AbstractC16505p.class, dVar);
        bVar.a(C16495f.class, dVar);
        g gVar = g.f157026a;
        bVar.a(AbstractC16508s.class, gVar);
        bVar.a(C16498i.class, gVar);
        f fVar = f.f157024a;
        bVar.a(AbstractC16507r.class, fVar);
        bVar.a(C16497h.class, fVar);
        j jVar = j.f157046a;
        bVar.a(AbstractC16512w.class, jVar);
        bVar.a(C16502m.class, jVar);
        e eVar = e.f157021a;
        bVar.a(AbstractC16506q.class, eVar);
        bVar.a(C16496g.class, eVar);
    }

    private C16491b() {
    }
}
