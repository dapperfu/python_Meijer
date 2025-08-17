package rf;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.io.IOException;
import rf.AbstractC16777F;

/* renamed from: rf.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C16779a implements Cf.a {

    /* renamed from: a, reason: collision with root package name */
    public static final Cf.a f158213a = new C16779a();

    /* renamed from: rf.a$a, reason: collision with other inner class name */
    private static final class C2464a implements Bf.c<AbstractC16777F.a.AbstractC2446a> {

        /* renamed from: a, reason: collision with root package name */
        static final C2464a f158214a = new C2464a();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f158215b = Bf.b.d("arch");

        /* renamed from: c, reason: collision with root package name */
        private static final Bf.b f158216c = Bf.b.d("libraryName");

        /* renamed from: d, reason: collision with root package name */
        private static final Bf.b f158217d = Bf.b.d("buildId");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC16777F.a.AbstractC2446a abstractC2446a, Bf.d dVar) throws IOException {
            dVar.f(f158215b, abstractC2446a.b());
            dVar.f(f158216c, abstractC2446a.d());
            dVar.f(f158217d, abstractC2446a.c());
        }

        private C2464a() {
        }
    }

    /* renamed from: rf.a$b */
    private static final class b implements Bf.c<AbstractC16777F.a> {

        /* renamed from: a, reason: collision with root package name */
        static final b f158218a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f158219b = Bf.b.d("pid");

        /* renamed from: c, reason: collision with root package name */
        private static final Bf.b f158220c = Bf.b.d("processName");

        /* renamed from: d, reason: collision with root package name */
        private static final Bf.b f158221d = Bf.b.d("reasonCode");

        /* renamed from: e, reason: collision with root package name */
        private static final Bf.b f158222e = Bf.b.d("importance");

        /* renamed from: f, reason: collision with root package name */
        private static final Bf.b f158223f = Bf.b.d("pss");

        /* renamed from: g, reason: collision with root package name */
        private static final Bf.b f158224g = Bf.b.d("rss");

        /* renamed from: h, reason: collision with root package name */
        private static final Bf.b f158225h = Bf.b.d("timestamp");

        /* renamed from: i, reason: collision with root package name */
        private static final Bf.b f158226i = Bf.b.d("traceFile");

        /* renamed from: j, reason: collision with root package name */
        private static final Bf.b f158227j = Bf.b.d("buildIdMappingForArch");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC16777F.a aVar, Bf.d dVar) throws IOException {
            dVar.e(f158219b, aVar.d());
            dVar.f(f158220c, aVar.e());
            dVar.e(f158221d, aVar.g());
            dVar.e(f158222e, aVar.c());
            dVar.d(f158223f, aVar.f());
            dVar.d(f158224g, aVar.h());
            dVar.d(f158225h, aVar.i());
            dVar.f(f158226i, aVar.j());
            dVar.f(f158227j, aVar.b());
        }

        private b() {
        }
    }

    /* renamed from: rf.a$c */
    private static final class c implements Bf.c<AbstractC16777F.c> {

        /* renamed from: a, reason: collision with root package name */
        static final c f158228a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f158229b = Bf.b.d("key");

        /* renamed from: c, reason: collision with root package name */
        private static final Bf.b f158230c = Bf.b.d("value");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC16777F.c cVar, Bf.d dVar) throws IOException {
            dVar.f(f158229b, cVar.b());
            dVar.f(f158230c, cVar.c());
        }

        private c() {
        }
    }

    /* renamed from: rf.a$d */
    private static final class d implements Bf.c<AbstractC16777F> {

        /* renamed from: a, reason: collision with root package name */
        static final d f158231a = new d();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f158232b = Bf.b.d("sdkVersion");

        /* renamed from: c, reason: collision with root package name */
        private static final Bf.b f158233c = Bf.b.d("gmpAppId");

        /* renamed from: d, reason: collision with root package name */
        private static final Bf.b f158234d = Bf.b.d("platform");

        /* renamed from: e, reason: collision with root package name */
        private static final Bf.b f158235e = Bf.b.d("installationUuid");

        /* renamed from: f, reason: collision with root package name */
        private static final Bf.b f158236f = Bf.b.d("firebaseInstallationId");

        /* renamed from: g, reason: collision with root package name */
        private static final Bf.b f158237g = Bf.b.d("firebaseAuthenticationToken");

        /* renamed from: h, reason: collision with root package name */
        private static final Bf.b f158238h = Bf.b.d("appQualitySessionId");

        /* renamed from: i, reason: collision with root package name */
        private static final Bf.b f158239i = Bf.b.d("buildVersion");

        /* renamed from: j, reason: collision with root package name */
        private static final Bf.b f158240j = Bf.b.d("displayVersion");

        /* renamed from: k, reason: collision with root package name */
        private static final Bf.b f158241k = Bf.b.d("session");

        /* renamed from: l, reason: collision with root package name */
        private static final Bf.b f158242l = Bf.b.d("ndkPayload");

        /* renamed from: m, reason: collision with root package name */
        private static final Bf.b f158243m = Bf.b.d("appExitInfo");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC16777F abstractC16777F, Bf.d dVar) throws IOException {
            dVar.f(f158232b, abstractC16777F.m());
            dVar.f(f158233c, abstractC16777F.i());
            dVar.e(f158234d, abstractC16777F.l());
            dVar.f(f158235e, abstractC16777F.j());
            dVar.f(f158236f, abstractC16777F.h());
            dVar.f(f158237g, abstractC16777F.g());
            dVar.f(f158238h, abstractC16777F.d());
            dVar.f(f158239i, abstractC16777F.e());
            dVar.f(f158240j, abstractC16777F.f());
            dVar.f(f158241k, abstractC16777F.n());
            dVar.f(f158242l, abstractC16777F.k());
            dVar.f(f158243m, abstractC16777F.c());
        }

        private d() {
        }
    }

    /* renamed from: rf.a$e */
    private static final class e implements Bf.c<AbstractC16777F.d> {

        /* renamed from: a, reason: collision with root package name */
        static final e f158244a = new e();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f158245b = Bf.b.d("files");

        /* renamed from: c, reason: collision with root package name */
        private static final Bf.b f158246c = Bf.b.d("orgId");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC16777F.d dVar, Bf.d dVar2) throws IOException {
            dVar2.f(f158245b, dVar.b());
            dVar2.f(f158246c, dVar.c());
        }

        private e() {
        }
    }

    /* renamed from: rf.a$f */
    private static final class f implements Bf.c<AbstractC16777F.d.b> {

        /* renamed from: a, reason: collision with root package name */
        static final f f158247a = new f();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f158248b = Bf.b.d("filename");

        /* renamed from: c, reason: collision with root package name */
        private static final Bf.b f158249c = Bf.b.d("contents");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC16777F.d.b bVar, Bf.d dVar) throws IOException {
            dVar.f(f158248b, bVar.c());
            dVar.f(f158249c, bVar.b());
        }

        private f() {
        }
    }

    /* renamed from: rf.a$g */
    private static final class g implements Bf.c<AbstractC16777F.e.a> {

        /* renamed from: a, reason: collision with root package name */
        static final g f158250a = new g();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f158251b = Bf.b.d("identifier");

        /* renamed from: c, reason: collision with root package name */
        private static final Bf.b f158252c = Bf.b.d("version");

        /* renamed from: d, reason: collision with root package name */
        private static final Bf.b f158253d = Bf.b.d("displayVersion");

        /* renamed from: e, reason: collision with root package name */
        private static final Bf.b f158254e = Bf.b.d("organization");

        /* renamed from: f, reason: collision with root package name */
        private static final Bf.b f158255f = Bf.b.d("installationUuid");

        /* renamed from: g, reason: collision with root package name */
        private static final Bf.b f158256g = Bf.b.d("developmentPlatform");

        /* renamed from: h, reason: collision with root package name */
        private static final Bf.b f158257h = Bf.b.d("developmentPlatformVersion");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC16777F.e.a aVar, Bf.d dVar) throws IOException {
            dVar.f(f158251b, aVar.e());
            dVar.f(f158252c, aVar.h());
            dVar.f(f158253d, aVar.d());
            dVar.f(f158254e, aVar.g());
            dVar.f(f158255f, aVar.f());
            dVar.f(f158256g, aVar.b());
            dVar.f(f158257h, aVar.c());
        }

        private g() {
        }
    }

    /* renamed from: rf.a$h */
    private static final class h implements Bf.c<AbstractC16777F.e.a.b> {

        /* renamed from: a, reason: collision with root package name */
        static final h f158258a = new h();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f158259b = Bf.b.d("clsId");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC16777F.e.a.b bVar, Bf.d dVar) throws IOException {
            dVar.f(f158259b, bVar.a());
        }

        private h() {
        }
    }

    /* renamed from: rf.a$i */
    private static final class i implements Bf.c<AbstractC16777F.e.c> {

        /* renamed from: a, reason: collision with root package name */
        static final i f158260a = new i();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f158261b = Bf.b.d("arch");

        /* renamed from: c, reason: collision with root package name */
        private static final Bf.b f158262c = Bf.b.d("model");

        /* renamed from: d, reason: collision with root package name */
        private static final Bf.b f158263d = Bf.b.d("cores");

        /* renamed from: e, reason: collision with root package name */
        private static final Bf.b f158264e = Bf.b.d("ram");

        /* renamed from: f, reason: collision with root package name */
        private static final Bf.b f158265f = Bf.b.d("diskSpace");

        /* renamed from: g, reason: collision with root package name */
        private static final Bf.b f158266g = Bf.b.d("simulator");

        /* renamed from: h, reason: collision with root package name */
        private static final Bf.b f158267h = Bf.b.d("state");

        /* renamed from: i, reason: collision with root package name */
        private static final Bf.b f158268i = Bf.b.d("manufacturer");

        /* renamed from: j, reason: collision with root package name */
        private static final Bf.b f158269j = Bf.b.d("modelClass");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC16777F.e.c cVar, Bf.d dVar) throws IOException {
            dVar.e(f158261b, cVar.b());
            dVar.f(f158262c, cVar.f());
            dVar.e(f158263d, cVar.c());
            dVar.d(f158264e, cVar.h());
            dVar.d(f158265f, cVar.d());
            dVar.b(f158266g, cVar.j());
            dVar.e(f158267h, cVar.i());
            dVar.f(f158268i, cVar.e());
            dVar.f(f158269j, cVar.g());
        }

        private i() {
        }
    }

    /* renamed from: rf.a$j */
    private static final class j implements Bf.c<AbstractC16777F.e> {

        /* renamed from: a, reason: collision with root package name */
        static final j f158270a = new j();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f158271b = Bf.b.d("generator");

        /* renamed from: c, reason: collision with root package name */
        private static final Bf.b f158272c = Bf.b.d("identifier");

        /* renamed from: d, reason: collision with root package name */
        private static final Bf.b f158273d = Bf.b.d("appQualitySessionId");

        /* renamed from: e, reason: collision with root package name */
        private static final Bf.b f158274e = Bf.b.d("startedAt");

        /* renamed from: f, reason: collision with root package name */
        private static final Bf.b f158275f = Bf.b.d("endedAt");

        /* renamed from: g, reason: collision with root package name */
        private static final Bf.b f158276g = Bf.b.d("crashed");

        /* renamed from: h, reason: collision with root package name */
        private static final Bf.b f158277h = Bf.b.d("app");

        /* renamed from: i, reason: collision with root package name */
        private static final Bf.b f158278i = Bf.b.d("user");

        /* renamed from: j, reason: collision with root package name */
        private static final Bf.b f158279j = Bf.b.d("os");

        /* renamed from: k, reason: collision with root package name */
        private static final Bf.b f158280k = Bf.b.d("device");

        /* renamed from: l, reason: collision with root package name */
        private static final Bf.b f158281l = Bf.b.d("events");

        /* renamed from: m, reason: collision with root package name */
        private static final Bf.b f158282m = Bf.b.d("generatorType");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC16777F.e eVar, Bf.d dVar) throws IOException {
            dVar.f(f158271b, eVar.g());
            dVar.f(f158272c, eVar.j());
            dVar.f(f158273d, eVar.c());
            dVar.d(f158274e, eVar.l());
            dVar.f(f158275f, eVar.e());
            dVar.b(f158276g, eVar.n());
            dVar.f(f158277h, eVar.b());
            dVar.f(f158278i, eVar.m());
            dVar.f(f158279j, eVar.k());
            dVar.f(f158280k, eVar.d());
            dVar.f(f158281l, eVar.f());
            dVar.e(f158282m, eVar.h());
        }

        private j() {
        }
    }

    /* renamed from: rf.a$k */
    private static final class k implements Bf.c<AbstractC16777F.e.d.a> {

        /* renamed from: a, reason: collision with root package name */
        static final k f158283a = new k();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f158284b = Bf.b.d("execution");

        /* renamed from: c, reason: collision with root package name */
        private static final Bf.b f158285c = Bf.b.d("customAttributes");

        /* renamed from: d, reason: collision with root package name */
        private static final Bf.b f158286d = Bf.b.d("internalKeys");

        /* renamed from: e, reason: collision with root package name */
        private static final Bf.b f158287e = Bf.b.d("background");

        /* renamed from: f, reason: collision with root package name */
        private static final Bf.b f158288f = Bf.b.d("currentProcessDetails");

        /* renamed from: g, reason: collision with root package name */
        private static final Bf.b f158289g = Bf.b.d("appProcessDetails");

        /* renamed from: h, reason: collision with root package name */
        private static final Bf.b f158290h = Bf.b.d("uiOrientation");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC16777F.e.d.a aVar, Bf.d dVar) throws IOException {
            dVar.f(f158284b, aVar.f());
            dVar.f(f158285c, aVar.e());
            dVar.f(f158286d, aVar.g());
            dVar.f(f158287e, aVar.c());
            dVar.f(f158288f, aVar.d());
            dVar.f(f158289g, aVar.b());
            dVar.e(f158290h, aVar.h());
        }

        private k() {
        }
    }

    /* renamed from: rf.a$l */
    private static final class l implements Bf.c<AbstractC16777F.e.d.a.b.AbstractC2450a> {

        /* renamed from: a, reason: collision with root package name */
        static final l f158291a = new l();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f158292b = Bf.b.d("baseAddress");

        /* renamed from: c, reason: collision with root package name */
        private static final Bf.b f158293c = Bf.b.d("size");

        /* renamed from: d, reason: collision with root package name */
        private static final Bf.b f158294d = Bf.b.d("name");

        /* renamed from: e, reason: collision with root package name */
        private static final Bf.b f158295e = Bf.b.d("uuid");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC16777F.e.d.a.b.AbstractC2450a abstractC2450a, Bf.d dVar) throws IOException {
            dVar.d(f158292b, abstractC2450a.b());
            dVar.d(f158293c, abstractC2450a.d());
            dVar.f(f158294d, abstractC2450a.c());
            dVar.f(f158295e, abstractC2450a.f());
        }

        private l() {
        }
    }

    /* renamed from: rf.a$m */
    private static final class m implements Bf.c<AbstractC16777F.e.d.a.b> {

        /* renamed from: a, reason: collision with root package name */
        static final m f158296a = new m();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f158297b = Bf.b.d("threads");

        /* renamed from: c, reason: collision with root package name */
        private static final Bf.b f158298c = Bf.b.d("exception");

        /* renamed from: d, reason: collision with root package name */
        private static final Bf.b f158299d = Bf.b.d("appExitInfo");

        /* renamed from: e, reason: collision with root package name */
        private static final Bf.b f158300e = Bf.b.d("signal");

        /* renamed from: f, reason: collision with root package name */
        private static final Bf.b f158301f = Bf.b.d("binaries");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC16777F.e.d.a.b bVar, Bf.d dVar) throws IOException {
            dVar.f(f158297b, bVar.f());
            dVar.f(f158298c, bVar.d());
            dVar.f(f158299d, bVar.b());
            dVar.f(f158300e, bVar.e());
            dVar.f(f158301f, bVar.c());
        }

        private m() {
        }
    }

    /* renamed from: rf.a$n */
    private static final class n implements Bf.c<AbstractC16777F.e.d.a.b.c> {

        /* renamed from: a, reason: collision with root package name */
        static final n f158302a = new n();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f158303b = Bf.b.d("type");

        /* renamed from: c, reason: collision with root package name */
        private static final Bf.b f158304c = Bf.b.d("reason");

        /* renamed from: d, reason: collision with root package name */
        private static final Bf.b f158305d = Bf.b.d("frames");

        /* renamed from: e, reason: collision with root package name */
        private static final Bf.b f158306e = Bf.b.d("causedBy");

        /* renamed from: f, reason: collision with root package name */
        private static final Bf.b f158307f = Bf.b.d("overflowCount");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC16777F.e.d.a.b.c cVar, Bf.d dVar) throws IOException {
            dVar.f(f158303b, cVar.f());
            dVar.f(f158304c, cVar.e());
            dVar.f(f158305d, cVar.c());
            dVar.f(f158306e, cVar.b());
            dVar.e(f158307f, cVar.d());
        }

        private n() {
        }
    }

    /* renamed from: rf.a$o */
    private static final class o implements Bf.c<AbstractC16777F.e.d.a.b.AbstractC2454d> {

        /* renamed from: a, reason: collision with root package name */
        static final o f158308a = new o();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f158309b = Bf.b.d("name");

        /* renamed from: c, reason: collision with root package name */
        private static final Bf.b f158310c = Bf.b.d("code");

        /* renamed from: d, reason: collision with root package name */
        private static final Bf.b f158311d = Bf.b.d(PlaceTypes.ADDRESS);

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC16777F.e.d.a.b.AbstractC2454d abstractC2454d, Bf.d dVar) throws IOException {
            dVar.f(f158309b, abstractC2454d.d());
            dVar.f(f158310c, abstractC2454d.c());
            dVar.d(f158311d, abstractC2454d.b());
        }

        private o() {
        }
    }

    /* renamed from: rf.a$p */
    private static final class p implements Bf.c<AbstractC16777F.e.d.a.b.AbstractC2456e> {

        /* renamed from: a, reason: collision with root package name */
        static final p f158312a = new p();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f158313b = Bf.b.d("name");

        /* renamed from: c, reason: collision with root package name */
        private static final Bf.b f158314c = Bf.b.d("importance");

        /* renamed from: d, reason: collision with root package name */
        private static final Bf.b f158315d = Bf.b.d("frames");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC16777F.e.d.a.b.AbstractC2456e abstractC2456e, Bf.d dVar) throws IOException {
            dVar.f(f158313b, abstractC2456e.d());
            dVar.e(f158314c, abstractC2456e.c());
            dVar.f(f158315d, abstractC2456e.b());
        }

        private p() {
        }
    }

    /* renamed from: rf.a$q */
    private static final class q implements Bf.c<AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b> {

        /* renamed from: a, reason: collision with root package name */
        static final q f158316a = new q();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f158317b = Bf.b.d("pc");

        /* renamed from: c, reason: collision with root package name */
        private static final Bf.b f158318c = Bf.b.d("symbol");

        /* renamed from: d, reason: collision with root package name */
        private static final Bf.b f158319d = Bf.b.d("file");

        /* renamed from: e, reason: collision with root package name */
        private static final Bf.b f158320e = Bf.b.d("offset");

        /* renamed from: f, reason: collision with root package name */
        private static final Bf.b f158321f = Bf.b.d("importance");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b abstractC2458b, Bf.d dVar) throws IOException {
            dVar.d(f158317b, abstractC2458b.e());
            dVar.f(f158318c, abstractC2458b.f());
            dVar.f(f158319d, abstractC2458b.b());
            dVar.d(f158320e, abstractC2458b.d());
            dVar.e(f158321f, abstractC2458b.c());
        }

        private q() {
        }
    }

    /* renamed from: rf.a$r */
    private static final class r implements Bf.c<AbstractC16777F.e.d.a.c> {

        /* renamed from: a, reason: collision with root package name */
        static final r f158322a = new r();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f158323b = Bf.b.d("processName");

        /* renamed from: c, reason: collision with root package name */
        private static final Bf.b f158324c = Bf.b.d("pid");

        /* renamed from: d, reason: collision with root package name */
        private static final Bf.b f158325d = Bf.b.d("importance");

        /* renamed from: e, reason: collision with root package name */
        private static final Bf.b f158326e = Bf.b.d("defaultProcess");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC16777F.e.d.a.c cVar, Bf.d dVar) throws IOException {
            dVar.f(f158323b, cVar.d());
            dVar.e(f158324c, cVar.c());
            dVar.e(f158325d, cVar.b());
            dVar.b(f158326e, cVar.e());
        }

        private r() {
        }
    }

    /* renamed from: rf.a$s */
    private static final class s implements Bf.c<AbstractC16777F.e.d.c> {

        /* renamed from: a, reason: collision with root package name */
        static final s f158327a = new s();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f158328b = Bf.b.d("batteryLevel");

        /* renamed from: c, reason: collision with root package name */
        private static final Bf.b f158329c = Bf.b.d("batteryVelocity");

        /* renamed from: d, reason: collision with root package name */
        private static final Bf.b f158330d = Bf.b.d("proximityOn");

        /* renamed from: e, reason: collision with root package name */
        private static final Bf.b f158331e = Bf.b.d("orientation");

        /* renamed from: f, reason: collision with root package name */
        private static final Bf.b f158332f = Bf.b.d("ramUsed");

        /* renamed from: g, reason: collision with root package name */
        private static final Bf.b f158333g = Bf.b.d("diskUsed");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC16777F.e.d.c cVar, Bf.d dVar) throws IOException {
            dVar.f(f158328b, cVar.b());
            dVar.e(f158329c, cVar.c());
            dVar.b(f158330d, cVar.g());
            dVar.e(f158331e, cVar.e());
            dVar.d(f158332f, cVar.f());
            dVar.d(f158333g, cVar.d());
        }

        private s() {
        }
    }

    /* renamed from: rf.a$t */
    private static final class t implements Bf.c<AbstractC16777F.e.d> {

        /* renamed from: a, reason: collision with root package name */
        static final t f158334a = new t();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f158335b = Bf.b.d("timestamp");

        /* renamed from: c, reason: collision with root package name */
        private static final Bf.b f158336c = Bf.b.d("type");

        /* renamed from: d, reason: collision with root package name */
        private static final Bf.b f158337d = Bf.b.d("app");

        /* renamed from: e, reason: collision with root package name */
        private static final Bf.b f158338e = Bf.b.d("device");

        /* renamed from: f, reason: collision with root package name */
        private static final Bf.b f158339f = Bf.b.d("log");

        /* renamed from: g, reason: collision with root package name */
        private static final Bf.b f158340g = Bf.b.d("rollouts");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC16777F.e.d dVar, Bf.d dVar2) throws IOException {
            dVar2.d(f158335b, dVar.f());
            dVar2.f(f158336c, dVar.g());
            dVar2.f(f158337d, dVar.b());
            dVar2.f(f158338e, dVar.c());
            dVar2.f(f158339f, dVar.d());
            dVar2.f(f158340g, dVar.e());
        }

        private t() {
        }
    }

    /* renamed from: rf.a$u */
    private static final class u implements Bf.c<AbstractC16777F.e.d.AbstractC2461d> {

        /* renamed from: a, reason: collision with root package name */
        static final u f158341a = new u();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f158342b = Bf.b.d("content");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC16777F.e.d.AbstractC2461d abstractC2461d, Bf.d dVar) throws IOException {
            dVar.f(f158342b, abstractC2461d.b());
        }

        private u() {
        }
    }

    /* renamed from: rf.a$v */
    private static final class v implements Bf.c<AbstractC16777F.e.d.AbstractC2462e> {

        /* renamed from: a, reason: collision with root package name */
        static final v f158343a = new v();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f158344b = Bf.b.d("rolloutVariant");

        /* renamed from: c, reason: collision with root package name */
        private static final Bf.b f158345c = Bf.b.d("parameterKey");

        /* renamed from: d, reason: collision with root package name */
        private static final Bf.b f158346d = Bf.b.d("parameterValue");

        /* renamed from: e, reason: collision with root package name */
        private static final Bf.b f158347e = Bf.b.d("templateVersion");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC16777F.e.d.AbstractC2462e abstractC2462e, Bf.d dVar) throws IOException {
            dVar.f(f158344b, abstractC2462e.d());
            dVar.f(f158345c, abstractC2462e.b());
            dVar.f(f158346d, abstractC2462e.c());
            dVar.d(f158347e, abstractC2462e.e());
        }

        private v() {
        }
    }

    /* renamed from: rf.a$w */
    private static final class w implements Bf.c<AbstractC16777F.e.d.AbstractC2462e.b> {

        /* renamed from: a, reason: collision with root package name */
        static final w f158348a = new w();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f158349b = Bf.b.d("rolloutId");

        /* renamed from: c, reason: collision with root package name */
        private static final Bf.b f158350c = Bf.b.d("variantId");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC16777F.e.d.AbstractC2462e.b bVar, Bf.d dVar) throws IOException {
            dVar.f(f158349b, bVar.b());
            dVar.f(f158350c, bVar.c());
        }

        private w() {
        }
    }

    /* renamed from: rf.a$x */
    private static final class x implements Bf.c<AbstractC16777F.e.d.f> {

        /* renamed from: a, reason: collision with root package name */
        static final x f158351a = new x();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f158352b = Bf.b.d("assignments");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC16777F.e.d.f fVar, Bf.d dVar) throws IOException {
            dVar.f(f158352b, fVar.b());
        }

        private x() {
        }
    }

    /* renamed from: rf.a$y */
    private static final class y implements Bf.c<AbstractC16777F.e.AbstractC2463e> {

        /* renamed from: a, reason: collision with root package name */
        static final y f158353a = new y();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f158354b = Bf.b.d("platform");

        /* renamed from: c, reason: collision with root package name */
        private static final Bf.b f158355c = Bf.b.d("version");

        /* renamed from: d, reason: collision with root package name */
        private static final Bf.b f158356d = Bf.b.d("buildVersion");

        /* renamed from: e, reason: collision with root package name */
        private static final Bf.b f158357e = Bf.b.d("jailbroken");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC16777F.e.AbstractC2463e abstractC2463e, Bf.d dVar) throws IOException {
            dVar.e(f158354b, abstractC2463e.c());
            dVar.f(f158355c, abstractC2463e.d());
            dVar.f(f158356d, abstractC2463e.b());
            dVar.b(f158357e, abstractC2463e.e());
        }

        private y() {
        }
    }

    /* renamed from: rf.a$z */
    private static final class z implements Bf.c<AbstractC16777F.e.f> {

        /* renamed from: a, reason: collision with root package name */
        static final z f158358a = new z();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f158359b = Bf.b.d("identifier");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC16777F.e.f fVar, Bf.d dVar) throws IOException {
            dVar.f(f158359b, fVar.b());
        }

        private z() {
        }
    }

    @Override // Cf.a
    public void a(Cf.b<?> bVar) {
        d dVar = d.f158231a;
        bVar.a(AbstractC16777F.class, dVar);
        bVar.a(C16780b.class, dVar);
        j jVar = j.f158270a;
        bVar.a(AbstractC16777F.e.class, jVar);
        bVar.a(rf.h.class, jVar);
        g gVar = g.f158250a;
        bVar.a(AbstractC16777F.e.a.class, gVar);
        bVar.a(rf.i.class, gVar);
        h hVar = h.f158258a;
        bVar.a(AbstractC16777F.e.a.b.class, hVar);
        bVar.a(rf.j.class, hVar);
        z zVar = z.f158358a;
        bVar.a(AbstractC16777F.e.f.class, zVar);
        bVar.a(C16772A.class, zVar);
        y yVar = y.f158353a;
        bVar.a(AbstractC16777F.e.AbstractC2463e.class, yVar);
        bVar.a(rf.z.class, yVar);
        i iVar = i.f158260a;
        bVar.a(AbstractC16777F.e.c.class, iVar);
        bVar.a(rf.k.class, iVar);
        t tVar = t.f158334a;
        bVar.a(AbstractC16777F.e.d.class, tVar);
        bVar.a(rf.l.class, tVar);
        k kVar = k.f158283a;
        bVar.a(AbstractC16777F.e.d.a.class, kVar);
        bVar.a(rf.m.class, kVar);
        m mVar = m.f158296a;
        bVar.a(AbstractC16777F.e.d.a.b.class, mVar);
        bVar.a(rf.n.class, mVar);
        p pVar = p.f158312a;
        bVar.a(AbstractC16777F.e.d.a.b.AbstractC2456e.class, pVar);
        bVar.a(rf.r.class, pVar);
        q qVar = q.f158316a;
        bVar.a(AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b.class, qVar);
        bVar.a(rf.s.class, qVar);
        n nVar = n.f158302a;
        bVar.a(AbstractC16777F.e.d.a.b.c.class, nVar);
        bVar.a(rf.p.class, nVar);
        b bVar2 = b.f158218a;
        bVar.a(AbstractC16777F.a.class, bVar2);
        bVar.a(C16781c.class, bVar2);
        C2464a c2464a = C2464a.f158214a;
        bVar.a(AbstractC16777F.a.AbstractC2446a.class, c2464a);
        bVar.a(C16782d.class, c2464a);
        o oVar = o.f158308a;
        bVar.a(AbstractC16777F.e.d.a.b.AbstractC2454d.class, oVar);
        bVar.a(rf.q.class, oVar);
        l lVar = l.f158291a;
        bVar.a(AbstractC16777F.e.d.a.b.AbstractC2450a.class, lVar);
        bVar.a(rf.o.class, lVar);
        c cVar = c.f158228a;
        bVar.a(AbstractC16777F.c.class, cVar);
        bVar.a(C16783e.class, cVar);
        r rVar = r.f158322a;
        bVar.a(AbstractC16777F.e.d.a.c.class, rVar);
        bVar.a(rf.t.class, rVar);
        s sVar = s.f158327a;
        bVar.a(AbstractC16777F.e.d.c.class, sVar);
        bVar.a(rf.u.class, sVar);
        u uVar = u.f158341a;
        bVar.a(AbstractC16777F.e.d.AbstractC2461d.class, uVar);
        bVar.a(rf.v.class, uVar);
        x xVar = x.f158351a;
        bVar.a(AbstractC16777F.e.d.f.class, xVar);
        bVar.a(rf.y.class, xVar);
        v vVar = v.f158343a;
        bVar.a(AbstractC16777F.e.d.AbstractC2462e.class, vVar);
        bVar.a(rf.w.class, vVar);
        w wVar = w.f158348a;
        bVar.a(AbstractC16777F.e.d.AbstractC2462e.b.class, wVar);
        bVar.a(rf.x.class, wVar);
        e eVar = e.f158244a;
        bVar.a(AbstractC16777F.d.class, eVar);
        bVar.a(C16784f.class, eVar);
        f fVar = f.f158247a;
        bVar.a(AbstractC16777F.d.b.class, fVar);
        bVar.a(C16785g.class, fVar);
    }

    private C16779a() {
    }
}
