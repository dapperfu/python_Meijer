package tf;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.io.IOException;
import tf.AbstractC17251F;

/* renamed from: tf.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C17253a implements Ef.a {

    /* renamed from: a, reason: collision with root package name */
    public static final Ef.a f162659a = new C17253a();

    /* renamed from: tf.a$a, reason: collision with other inner class name */
    private static final class C2570a implements Df.c<AbstractC17251F.a.AbstractC2552a> {

        /* renamed from: a, reason: collision with root package name */
        static final C2570a f162660a = new C2570a();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f162661b = Df.b.d("arch");

        /* renamed from: c, reason: collision with root package name */
        private static final Df.b f162662c = Df.b.d("libraryName");

        /* renamed from: d, reason: collision with root package name */
        private static final Df.b f162663d = Df.b.d("buildId");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC17251F.a.AbstractC2552a abstractC2552a, Df.d dVar) throws IOException {
            dVar.a(f162661b, abstractC2552a.b());
            dVar.a(f162662c, abstractC2552a.d());
            dVar.a(f162663d, abstractC2552a.c());
        }

        private C2570a() {
        }
    }

    /* renamed from: tf.a$b */
    private static final class b implements Df.c<AbstractC17251F.a> {

        /* renamed from: a, reason: collision with root package name */
        static final b f162664a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f162665b = Df.b.d("pid");

        /* renamed from: c, reason: collision with root package name */
        private static final Df.b f162666c = Df.b.d("processName");

        /* renamed from: d, reason: collision with root package name */
        private static final Df.b f162667d = Df.b.d("reasonCode");

        /* renamed from: e, reason: collision with root package name */
        private static final Df.b f162668e = Df.b.d("importance");

        /* renamed from: f, reason: collision with root package name */
        private static final Df.b f162669f = Df.b.d("pss");

        /* renamed from: g, reason: collision with root package name */
        private static final Df.b f162670g = Df.b.d("rss");

        /* renamed from: h, reason: collision with root package name */
        private static final Df.b f162671h = Df.b.d("timestamp");

        /* renamed from: i, reason: collision with root package name */
        private static final Df.b f162672i = Df.b.d("traceFile");

        /* renamed from: j, reason: collision with root package name */
        private static final Df.b f162673j = Df.b.d("buildIdMappingForArch");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC17251F.a aVar, Df.d dVar) throws IOException {
            dVar.e(f162665b, aVar.d());
            dVar.a(f162666c, aVar.e());
            dVar.e(f162667d, aVar.g());
            dVar.e(f162668e, aVar.c());
            dVar.d(f162669f, aVar.f());
            dVar.d(f162670g, aVar.h());
            dVar.d(f162671h, aVar.i());
            dVar.a(f162672i, aVar.j());
            dVar.a(f162673j, aVar.b());
        }

        private b() {
        }
    }

    /* renamed from: tf.a$c */
    private static final class c implements Df.c<AbstractC17251F.c> {

        /* renamed from: a, reason: collision with root package name */
        static final c f162674a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f162675b = Df.b.d("key");

        /* renamed from: c, reason: collision with root package name */
        private static final Df.b f162676c = Df.b.d("value");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC17251F.c cVar, Df.d dVar) throws IOException {
            dVar.a(f162675b, cVar.b());
            dVar.a(f162676c, cVar.c());
        }

        private c() {
        }
    }

    /* renamed from: tf.a$d */
    private static final class d implements Df.c<AbstractC17251F> {

        /* renamed from: a, reason: collision with root package name */
        static final d f162677a = new d();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f162678b = Df.b.d("sdkVersion");

        /* renamed from: c, reason: collision with root package name */
        private static final Df.b f162679c = Df.b.d("gmpAppId");

        /* renamed from: d, reason: collision with root package name */
        private static final Df.b f162680d = Df.b.d("platform");

        /* renamed from: e, reason: collision with root package name */
        private static final Df.b f162681e = Df.b.d("installationUuid");

        /* renamed from: f, reason: collision with root package name */
        private static final Df.b f162682f = Df.b.d("firebaseInstallationId");

        /* renamed from: g, reason: collision with root package name */
        private static final Df.b f162683g = Df.b.d("firebaseAuthenticationToken");

        /* renamed from: h, reason: collision with root package name */
        private static final Df.b f162684h = Df.b.d("appQualitySessionId");

        /* renamed from: i, reason: collision with root package name */
        private static final Df.b f162685i = Df.b.d("buildVersion");

        /* renamed from: j, reason: collision with root package name */
        private static final Df.b f162686j = Df.b.d("displayVersion");

        /* renamed from: k, reason: collision with root package name */
        private static final Df.b f162687k = Df.b.d("session");

        /* renamed from: l, reason: collision with root package name */
        private static final Df.b f162688l = Df.b.d("ndkPayload");

        /* renamed from: m, reason: collision with root package name */
        private static final Df.b f162689m = Df.b.d("appExitInfo");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC17251F abstractC17251F, Df.d dVar) throws IOException {
            dVar.a(f162678b, abstractC17251F.m());
            dVar.a(f162679c, abstractC17251F.i());
            dVar.e(f162680d, abstractC17251F.l());
            dVar.a(f162681e, abstractC17251F.j());
            dVar.a(f162682f, abstractC17251F.h());
            dVar.a(f162683g, abstractC17251F.g());
            dVar.a(f162684h, abstractC17251F.d());
            dVar.a(f162685i, abstractC17251F.e());
            dVar.a(f162686j, abstractC17251F.f());
            dVar.a(f162687k, abstractC17251F.n());
            dVar.a(f162688l, abstractC17251F.k());
            dVar.a(f162689m, abstractC17251F.c());
        }

        private d() {
        }
    }

    /* renamed from: tf.a$e */
    private static final class e implements Df.c<AbstractC17251F.d> {

        /* renamed from: a, reason: collision with root package name */
        static final e f162690a = new e();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f162691b = Df.b.d("files");

        /* renamed from: c, reason: collision with root package name */
        private static final Df.b f162692c = Df.b.d("orgId");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC17251F.d dVar, Df.d dVar2) throws IOException {
            dVar2.a(f162691b, dVar.b());
            dVar2.a(f162692c, dVar.c());
        }

        private e() {
        }
    }

    /* renamed from: tf.a$f */
    private static final class f implements Df.c<AbstractC17251F.d.b> {

        /* renamed from: a, reason: collision with root package name */
        static final f f162693a = new f();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f162694b = Df.b.d("filename");

        /* renamed from: c, reason: collision with root package name */
        private static final Df.b f162695c = Df.b.d("contents");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC17251F.d.b bVar, Df.d dVar) throws IOException {
            dVar.a(f162694b, bVar.c());
            dVar.a(f162695c, bVar.b());
        }

        private f() {
        }
    }

    /* renamed from: tf.a$g */
    private static final class g implements Df.c<AbstractC17251F.e.a> {

        /* renamed from: a, reason: collision with root package name */
        static final g f162696a = new g();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f162697b = Df.b.d("identifier");

        /* renamed from: c, reason: collision with root package name */
        private static final Df.b f162698c = Df.b.d("version");

        /* renamed from: d, reason: collision with root package name */
        private static final Df.b f162699d = Df.b.d("displayVersion");

        /* renamed from: e, reason: collision with root package name */
        private static final Df.b f162700e = Df.b.d("organization");

        /* renamed from: f, reason: collision with root package name */
        private static final Df.b f162701f = Df.b.d("installationUuid");

        /* renamed from: g, reason: collision with root package name */
        private static final Df.b f162702g = Df.b.d("developmentPlatform");

        /* renamed from: h, reason: collision with root package name */
        private static final Df.b f162703h = Df.b.d("developmentPlatformVersion");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC17251F.e.a aVar, Df.d dVar) throws IOException {
            dVar.a(f162697b, aVar.e());
            dVar.a(f162698c, aVar.h());
            dVar.a(f162699d, aVar.d());
            dVar.a(f162700e, aVar.g());
            dVar.a(f162701f, aVar.f());
            dVar.a(f162702g, aVar.b());
            dVar.a(f162703h, aVar.c());
        }

        private g() {
        }
    }

    /* renamed from: tf.a$h */
    private static final class h implements Df.c<AbstractC17251F.e.a.b> {

        /* renamed from: a, reason: collision with root package name */
        static final h f162704a = new h();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f162705b = Df.b.d("clsId");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC17251F.e.a.b bVar, Df.d dVar) throws IOException {
            dVar.a(f162705b, bVar.a());
        }

        private h() {
        }
    }

    /* renamed from: tf.a$i */
    private static final class i implements Df.c<AbstractC17251F.e.c> {

        /* renamed from: a, reason: collision with root package name */
        static final i f162706a = new i();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f162707b = Df.b.d("arch");

        /* renamed from: c, reason: collision with root package name */
        private static final Df.b f162708c = Df.b.d("model");

        /* renamed from: d, reason: collision with root package name */
        private static final Df.b f162709d = Df.b.d("cores");

        /* renamed from: e, reason: collision with root package name */
        private static final Df.b f162710e = Df.b.d("ram");

        /* renamed from: f, reason: collision with root package name */
        private static final Df.b f162711f = Df.b.d("diskSpace");

        /* renamed from: g, reason: collision with root package name */
        private static final Df.b f162712g = Df.b.d("simulator");

        /* renamed from: h, reason: collision with root package name */
        private static final Df.b f162713h = Df.b.d("state");

        /* renamed from: i, reason: collision with root package name */
        private static final Df.b f162714i = Df.b.d("manufacturer");

        /* renamed from: j, reason: collision with root package name */
        private static final Df.b f162715j = Df.b.d("modelClass");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC17251F.e.c cVar, Df.d dVar) throws IOException {
            dVar.e(f162707b, cVar.b());
            dVar.a(f162708c, cVar.f());
            dVar.e(f162709d, cVar.c());
            dVar.d(f162710e, cVar.h());
            dVar.d(f162711f, cVar.d());
            dVar.c(f162712g, cVar.j());
            dVar.e(f162713h, cVar.i());
            dVar.a(f162714i, cVar.e());
            dVar.a(f162715j, cVar.g());
        }

        private i() {
        }
    }

    /* renamed from: tf.a$j */
    private static final class j implements Df.c<AbstractC17251F.e> {

        /* renamed from: a, reason: collision with root package name */
        static final j f162716a = new j();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f162717b = Df.b.d("generator");

        /* renamed from: c, reason: collision with root package name */
        private static final Df.b f162718c = Df.b.d("identifier");

        /* renamed from: d, reason: collision with root package name */
        private static final Df.b f162719d = Df.b.d("appQualitySessionId");

        /* renamed from: e, reason: collision with root package name */
        private static final Df.b f162720e = Df.b.d("startedAt");

        /* renamed from: f, reason: collision with root package name */
        private static final Df.b f162721f = Df.b.d("endedAt");

        /* renamed from: g, reason: collision with root package name */
        private static final Df.b f162722g = Df.b.d("crashed");

        /* renamed from: h, reason: collision with root package name */
        private static final Df.b f162723h = Df.b.d("app");

        /* renamed from: i, reason: collision with root package name */
        private static final Df.b f162724i = Df.b.d("user");

        /* renamed from: j, reason: collision with root package name */
        private static final Df.b f162725j = Df.b.d("os");

        /* renamed from: k, reason: collision with root package name */
        private static final Df.b f162726k = Df.b.d("device");

        /* renamed from: l, reason: collision with root package name */
        private static final Df.b f162727l = Df.b.d("events");

        /* renamed from: m, reason: collision with root package name */
        private static final Df.b f162728m = Df.b.d("generatorType");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC17251F.e eVar, Df.d dVar) throws IOException {
            dVar.a(f162717b, eVar.g());
            dVar.a(f162718c, eVar.j());
            dVar.a(f162719d, eVar.c());
            dVar.d(f162720e, eVar.l());
            dVar.a(f162721f, eVar.e());
            dVar.c(f162722g, eVar.n());
            dVar.a(f162723h, eVar.b());
            dVar.a(f162724i, eVar.m());
            dVar.a(f162725j, eVar.k());
            dVar.a(f162726k, eVar.d());
            dVar.a(f162727l, eVar.f());
            dVar.e(f162728m, eVar.h());
        }

        private j() {
        }
    }

    /* renamed from: tf.a$k */
    private static final class k implements Df.c<AbstractC17251F.e.d.a> {

        /* renamed from: a, reason: collision with root package name */
        static final k f162729a = new k();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f162730b = Df.b.d("execution");

        /* renamed from: c, reason: collision with root package name */
        private static final Df.b f162731c = Df.b.d("customAttributes");

        /* renamed from: d, reason: collision with root package name */
        private static final Df.b f162732d = Df.b.d("internalKeys");

        /* renamed from: e, reason: collision with root package name */
        private static final Df.b f162733e = Df.b.d("background");

        /* renamed from: f, reason: collision with root package name */
        private static final Df.b f162734f = Df.b.d("currentProcessDetails");

        /* renamed from: g, reason: collision with root package name */
        private static final Df.b f162735g = Df.b.d("appProcessDetails");

        /* renamed from: h, reason: collision with root package name */
        private static final Df.b f162736h = Df.b.d("uiOrientation");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC17251F.e.d.a aVar, Df.d dVar) throws IOException {
            dVar.a(f162730b, aVar.f());
            dVar.a(f162731c, aVar.e());
            dVar.a(f162732d, aVar.g());
            dVar.a(f162733e, aVar.c());
            dVar.a(f162734f, aVar.d());
            dVar.a(f162735g, aVar.b());
            dVar.e(f162736h, aVar.h());
        }

        private k() {
        }
    }

    /* renamed from: tf.a$l */
    private static final class l implements Df.c<AbstractC17251F.e.d.a.b.AbstractC2556a> {

        /* renamed from: a, reason: collision with root package name */
        static final l f162737a = new l();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f162738b = Df.b.d("baseAddress");

        /* renamed from: c, reason: collision with root package name */
        private static final Df.b f162739c = Df.b.d("size");

        /* renamed from: d, reason: collision with root package name */
        private static final Df.b f162740d = Df.b.d("name");

        /* renamed from: e, reason: collision with root package name */
        private static final Df.b f162741e = Df.b.d("uuid");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC17251F.e.d.a.b.AbstractC2556a abstractC2556a, Df.d dVar) throws IOException {
            dVar.d(f162738b, abstractC2556a.b());
            dVar.d(f162739c, abstractC2556a.d());
            dVar.a(f162740d, abstractC2556a.c());
            dVar.a(f162741e, abstractC2556a.f());
        }

        private l() {
        }
    }

    /* renamed from: tf.a$m */
    private static final class m implements Df.c<AbstractC17251F.e.d.a.b> {

        /* renamed from: a, reason: collision with root package name */
        static final m f162742a = new m();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f162743b = Df.b.d("threads");

        /* renamed from: c, reason: collision with root package name */
        private static final Df.b f162744c = Df.b.d("exception");

        /* renamed from: d, reason: collision with root package name */
        private static final Df.b f162745d = Df.b.d("appExitInfo");

        /* renamed from: e, reason: collision with root package name */
        private static final Df.b f162746e = Df.b.d("signal");

        /* renamed from: f, reason: collision with root package name */
        private static final Df.b f162747f = Df.b.d("binaries");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC17251F.e.d.a.b bVar, Df.d dVar) throws IOException {
            dVar.a(f162743b, bVar.f());
            dVar.a(f162744c, bVar.d());
            dVar.a(f162745d, bVar.b());
            dVar.a(f162746e, bVar.e());
            dVar.a(f162747f, bVar.c());
        }

        private m() {
        }
    }

    /* renamed from: tf.a$n */
    private static final class n implements Df.c<AbstractC17251F.e.d.a.b.c> {

        /* renamed from: a, reason: collision with root package name */
        static final n f162748a = new n();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f162749b = Df.b.d("type");

        /* renamed from: c, reason: collision with root package name */
        private static final Df.b f162750c = Df.b.d("reason");

        /* renamed from: d, reason: collision with root package name */
        private static final Df.b f162751d = Df.b.d("frames");

        /* renamed from: e, reason: collision with root package name */
        private static final Df.b f162752e = Df.b.d("causedBy");

        /* renamed from: f, reason: collision with root package name */
        private static final Df.b f162753f = Df.b.d("overflowCount");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC17251F.e.d.a.b.c cVar, Df.d dVar) throws IOException {
            dVar.a(f162749b, cVar.f());
            dVar.a(f162750c, cVar.e());
            dVar.a(f162751d, cVar.c());
            dVar.a(f162752e, cVar.b());
            dVar.e(f162753f, cVar.d());
        }

        private n() {
        }
    }

    /* renamed from: tf.a$o */
    private static final class o implements Df.c<AbstractC17251F.e.d.a.b.AbstractC2560d> {

        /* renamed from: a, reason: collision with root package name */
        static final o f162754a = new o();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f162755b = Df.b.d("name");

        /* renamed from: c, reason: collision with root package name */
        private static final Df.b f162756c = Df.b.d("code");

        /* renamed from: d, reason: collision with root package name */
        private static final Df.b f162757d = Df.b.d(PlaceTypes.ADDRESS);

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC17251F.e.d.a.b.AbstractC2560d abstractC2560d, Df.d dVar) throws IOException {
            dVar.a(f162755b, abstractC2560d.d());
            dVar.a(f162756c, abstractC2560d.c());
            dVar.d(f162757d, abstractC2560d.b());
        }

        private o() {
        }
    }

    /* renamed from: tf.a$p */
    private static final class p implements Df.c<AbstractC17251F.e.d.a.b.AbstractC2562e> {

        /* renamed from: a, reason: collision with root package name */
        static final p f162758a = new p();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f162759b = Df.b.d("name");

        /* renamed from: c, reason: collision with root package name */
        private static final Df.b f162760c = Df.b.d("importance");

        /* renamed from: d, reason: collision with root package name */
        private static final Df.b f162761d = Df.b.d("frames");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC17251F.e.d.a.b.AbstractC2562e abstractC2562e, Df.d dVar) throws IOException {
            dVar.a(f162759b, abstractC2562e.d());
            dVar.e(f162760c, abstractC2562e.c());
            dVar.a(f162761d, abstractC2562e.b());
        }

        private p() {
        }
    }

    /* renamed from: tf.a$q */
    private static final class q implements Df.c<AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b> {

        /* renamed from: a, reason: collision with root package name */
        static final q f162762a = new q();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f162763b = Df.b.d("pc");

        /* renamed from: c, reason: collision with root package name */
        private static final Df.b f162764c = Df.b.d("symbol");

        /* renamed from: d, reason: collision with root package name */
        private static final Df.b f162765d = Df.b.d("file");

        /* renamed from: e, reason: collision with root package name */
        private static final Df.b f162766e = Df.b.d("offset");

        /* renamed from: f, reason: collision with root package name */
        private static final Df.b f162767f = Df.b.d("importance");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b abstractC2564b, Df.d dVar) throws IOException {
            dVar.d(f162763b, abstractC2564b.e());
            dVar.a(f162764c, abstractC2564b.f());
            dVar.a(f162765d, abstractC2564b.b());
            dVar.d(f162766e, abstractC2564b.d());
            dVar.e(f162767f, abstractC2564b.c());
        }

        private q() {
        }
    }

    /* renamed from: tf.a$r */
    private static final class r implements Df.c<AbstractC17251F.e.d.a.c> {

        /* renamed from: a, reason: collision with root package name */
        static final r f162768a = new r();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f162769b = Df.b.d("processName");

        /* renamed from: c, reason: collision with root package name */
        private static final Df.b f162770c = Df.b.d("pid");

        /* renamed from: d, reason: collision with root package name */
        private static final Df.b f162771d = Df.b.d("importance");

        /* renamed from: e, reason: collision with root package name */
        private static final Df.b f162772e = Df.b.d("defaultProcess");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC17251F.e.d.a.c cVar, Df.d dVar) throws IOException {
            dVar.a(f162769b, cVar.d());
            dVar.e(f162770c, cVar.c());
            dVar.e(f162771d, cVar.b());
            dVar.c(f162772e, cVar.e());
        }

        private r() {
        }
    }

    /* renamed from: tf.a$s */
    private static final class s implements Df.c<AbstractC17251F.e.d.c> {

        /* renamed from: a, reason: collision with root package name */
        static final s f162773a = new s();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f162774b = Df.b.d("batteryLevel");

        /* renamed from: c, reason: collision with root package name */
        private static final Df.b f162775c = Df.b.d("batteryVelocity");

        /* renamed from: d, reason: collision with root package name */
        private static final Df.b f162776d = Df.b.d("proximityOn");

        /* renamed from: e, reason: collision with root package name */
        private static final Df.b f162777e = Df.b.d("orientation");

        /* renamed from: f, reason: collision with root package name */
        private static final Df.b f162778f = Df.b.d("ramUsed");

        /* renamed from: g, reason: collision with root package name */
        private static final Df.b f162779g = Df.b.d("diskUsed");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC17251F.e.d.c cVar, Df.d dVar) throws IOException {
            dVar.a(f162774b, cVar.b());
            dVar.e(f162775c, cVar.c());
            dVar.c(f162776d, cVar.g());
            dVar.e(f162777e, cVar.e());
            dVar.d(f162778f, cVar.f());
            dVar.d(f162779g, cVar.d());
        }

        private s() {
        }
    }

    /* renamed from: tf.a$t */
    private static final class t implements Df.c<AbstractC17251F.e.d> {

        /* renamed from: a, reason: collision with root package name */
        static final t f162780a = new t();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f162781b = Df.b.d("timestamp");

        /* renamed from: c, reason: collision with root package name */
        private static final Df.b f162782c = Df.b.d("type");

        /* renamed from: d, reason: collision with root package name */
        private static final Df.b f162783d = Df.b.d("app");

        /* renamed from: e, reason: collision with root package name */
        private static final Df.b f162784e = Df.b.d("device");

        /* renamed from: f, reason: collision with root package name */
        private static final Df.b f162785f = Df.b.d("log");

        /* renamed from: g, reason: collision with root package name */
        private static final Df.b f162786g = Df.b.d("rollouts");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC17251F.e.d dVar, Df.d dVar2) throws IOException {
            dVar2.d(f162781b, dVar.f());
            dVar2.a(f162782c, dVar.g());
            dVar2.a(f162783d, dVar.b());
            dVar2.a(f162784e, dVar.c());
            dVar2.a(f162785f, dVar.d());
            dVar2.a(f162786g, dVar.e());
        }

        private t() {
        }
    }

    /* renamed from: tf.a$u */
    private static final class u implements Df.c<AbstractC17251F.e.d.AbstractC2567d> {

        /* renamed from: a, reason: collision with root package name */
        static final u f162787a = new u();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f162788b = Df.b.d("content");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC17251F.e.d.AbstractC2567d abstractC2567d, Df.d dVar) throws IOException {
            dVar.a(f162788b, abstractC2567d.b());
        }

        private u() {
        }
    }

    /* renamed from: tf.a$v */
    private static final class v implements Df.c<AbstractC17251F.e.d.AbstractC2568e> {

        /* renamed from: a, reason: collision with root package name */
        static final v f162789a = new v();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f162790b = Df.b.d("rolloutVariant");

        /* renamed from: c, reason: collision with root package name */
        private static final Df.b f162791c = Df.b.d("parameterKey");

        /* renamed from: d, reason: collision with root package name */
        private static final Df.b f162792d = Df.b.d("parameterValue");

        /* renamed from: e, reason: collision with root package name */
        private static final Df.b f162793e = Df.b.d("templateVersion");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC17251F.e.d.AbstractC2568e abstractC2568e, Df.d dVar) throws IOException {
            dVar.a(f162790b, abstractC2568e.d());
            dVar.a(f162791c, abstractC2568e.b());
            dVar.a(f162792d, abstractC2568e.c());
            dVar.d(f162793e, abstractC2568e.e());
        }

        private v() {
        }
    }

    /* renamed from: tf.a$w */
    private static final class w implements Df.c<AbstractC17251F.e.d.AbstractC2568e.b> {

        /* renamed from: a, reason: collision with root package name */
        static final w f162794a = new w();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f162795b = Df.b.d("rolloutId");

        /* renamed from: c, reason: collision with root package name */
        private static final Df.b f162796c = Df.b.d("variantId");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC17251F.e.d.AbstractC2568e.b bVar, Df.d dVar) throws IOException {
            dVar.a(f162795b, bVar.b());
            dVar.a(f162796c, bVar.c());
        }

        private w() {
        }
    }

    /* renamed from: tf.a$x */
    private static final class x implements Df.c<AbstractC17251F.e.d.f> {

        /* renamed from: a, reason: collision with root package name */
        static final x f162797a = new x();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f162798b = Df.b.d("assignments");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC17251F.e.d.f fVar, Df.d dVar) throws IOException {
            dVar.a(f162798b, fVar.b());
        }

        private x() {
        }
    }

    /* renamed from: tf.a$y */
    private static final class y implements Df.c<AbstractC17251F.e.AbstractC2569e> {

        /* renamed from: a, reason: collision with root package name */
        static final y f162799a = new y();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f162800b = Df.b.d("platform");

        /* renamed from: c, reason: collision with root package name */
        private static final Df.b f162801c = Df.b.d("version");

        /* renamed from: d, reason: collision with root package name */
        private static final Df.b f162802d = Df.b.d("buildVersion");

        /* renamed from: e, reason: collision with root package name */
        private static final Df.b f162803e = Df.b.d("jailbroken");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC17251F.e.AbstractC2569e abstractC2569e, Df.d dVar) throws IOException {
            dVar.e(f162800b, abstractC2569e.c());
            dVar.a(f162801c, abstractC2569e.d());
            dVar.a(f162802d, abstractC2569e.b());
            dVar.c(f162803e, abstractC2569e.e());
        }

        private y() {
        }
    }

    /* renamed from: tf.a$z */
    private static final class z implements Df.c<AbstractC17251F.e.f> {

        /* renamed from: a, reason: collision with root package name */
        static final z f162804a = new z();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f162805b = Df.b.d("identifier");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC17251F.e.f fVar, Df.d dVar) throws IOException {
            dVar.a(f162805b, fVar.b());
        }

        private z() {
        }
    }

    @Override // Ef.a
    public void a(Ef.b<?> bVar) {
        d dVar = d.f162677a;
        bVar.a(AbstractC17251F.class, dVar);
        bVar.a(C17254b.class, dVar);
        j jVar = j.f162716a;
        bVar.a(AbstractC17251F.e.class, jVar);
        bVar.a(tf.h.class, jVar);
        g gVar = g.f162696a;
        bVar.a(AbstractC17251F.e.a.class, gVar);
        bVar.a(tf.i.class, gVar);
        h hVar = h.f162704a;
        bVar.a(AbstractC17251F.e.a.b.class, hVar);
        bVar.a(tf.j.class, hVar);
        z zVar = z.f162804a;
        bVar.a(AbstractC17251F.e.f.class, zVar);
        bVar.a(C17246A.class, zVar);
        y yVar = y.f162799a;
        bVar.a(AbstractC17251F.e.AbstractC2569e.class, yVar);
        bVar.a(tf.z.class, yVar);
        i iVar = i.f162706a;
        bVar.a(AbstractC17251F.e.c.class, iVar);
        bVar.a(tf.k.class, iVar);
        t tVar = t.f162780a;
        bVar.a(AbstractC17251F.e.d.class, tVar);
        bVar.a(tf.l.class, tVar);
        k kVar = k.f162729a;
        bVar.a(AbstractC17251F.e.d.a.class, kVar);
        bVar.a(tf.m.class, kVar);
        m mVar = m.f162742a;
        bVar.a(AbstractC17251F.e.d.a.b.class, mVar);
        bVar.a(tf.n.class, mVar);
        p pVar = p.f162758a;
        bVar.a(AbstractC17251F.e.d.a.b.AbstractC2562e.class, pVar);
        bVar.a(tf.r.class, pVar);
        q qVar = q.f162762a;
        bVar.a(AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b.class, qVar);
        bVar.a(tf.s.class, qVar);
        n nVar = n.f162748a;
        bVar.a(AbstractC17251F.e.d.a.b.c.class, nVar);
        bVar.a(tf.p.class, nVar);
        b bVar2 = b.f162664a;
        bVar.a(AbstractC17251F.a.class, bVar2);
        bVar.a(C17255c.class, bVar2);
        C2570a c2570a = C2570a.f162660a;
        bVar.a(AbstractC17251F.a.AbstractC2552a.class, c2570a);
        bVar.a(C17256d.class, c2570a);
        o oVar = o.f162754a;
        bVar.a(AbstractC17251F.e.d.a.b.AbstractC2560d.class, oVar);
        bVar.a(tf.q.class, oVar);
        l lVar = l.f162737a;
        bVar.a(AbstractC17251F.e.d.a.b.AbstractC2556a.class, lVar);
        bVar.a(tf.o.class, lVar);
        c cVar = c.f162674a;
        bVar.a(AbstractC17251F.c.class, cVar);
        bVar.a(C17257e.class, cVar);
        r rVar = r.f162768a;
        bVar.a(AbstractC17251F.e.d.a.c.class, rVar);
        bVar.a(tf.t.class, rVar);
        s sVar = s.f162773a;
        bVar.a(AbstractC17251F.e.d.c.class, sVar);
        bVar.a(tf.u.class, sVar);
        u uVar = u.f162787a;
        bVar.a(AbstractC17251F.e.d.AbstractC2567d.class, uVar);
        bVar.a(tf.v.class, uVar);
        x xVar = x.f162797a;
        bVar.a(AbstractC17251F.e.d.f.class, xVar);
        bVar.a(tf.y.class, xVar);
        v vVar = v.f162789a;
        bVar.a(AbstractC17251F.e.d.AbstractC2568e.class, vVar);
        bVar.a(tf.w.class, vVar);
        w wVar = w.f162794a;
        bVar.a(AbstractC17251F.e.d.AbstractC2568e.b.class, wVar);
        bVar.a(tf.x.class, wVar);
        e eVar = e.f162690a;
        bVar.a(AbstractC17251F.d.class, eVar);
        bVar.a(C17258f.class, eVar);
        f fVar = f.f162693a;
        bVar.a(AbstractC17251F.d.b.class, fVar);
        bVar.a(C17259g.class, fVar);
    }

    private C17253a() {
    }
}
