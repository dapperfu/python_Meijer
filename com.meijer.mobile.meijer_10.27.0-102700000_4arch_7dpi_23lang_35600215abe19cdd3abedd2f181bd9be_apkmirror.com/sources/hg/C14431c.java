package hg;

import java.io.IOException;

/* renamed from: hg.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C14431c implements Cf.a {

    /* renamed from: a, reason: collision with root package name */
    public static final Cf.a f134857a = new C14431c();

    /* renamed from: hg.c$a */
    private static final class a implements Bf.c<AndroidApplicationInfo> {

        /* renamed from: a, reason: collision with root package name */
        static final a f134858a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f134859b = Bf.b.d("packageName");

        /* renamed from: c, reason: collision with root package name */
        private static final Bf.b f134860c = Bf.b.d("versionName");

        /* renamed from: d, reason: collision with root package name */
        private static final Bf.b f134861d = Bf.b.d("appBuildVersion");

        /* renamed from: e, reason: collision with root package name */
        private static final Bf.b f134862e = Bf.b.d("deviceManufacturer");

        /* renamed from: f, reason: collision with root package name */
        private static final Bf.b f134863f = Bf.b.d("currentProcessDetails");

        /* renamed from: g, reason: collision with root package name */
        private static final Bf.b f134864g = Bf.b.d("appProcessDetails");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AndroidApplicationInfo androidApplicationInfo, Bf.d dVar) throws IOException {
            dVar.f(f134859b, androidApplicationInfo.getPackageName());
            dVar.f(f134860c, androidApplicationInfo.getVersionName());
            dVar.f(f134861d, androidApplicationInfo.getAppBuildVersion());
            dVar.f(f134862e, androidApplicationInfo.getDeviceManufacturer());
            dVar.f(f134863f, androidApplicationInfo.getCurrentProcessDetails());
            dVar.f(f134864g, androidApplicationInfo.b());
        }

        private a() {
        }
    }

    /* renamed from: hg.c$b */
    private static final class b implements Bf.c<ApplicationInfo> {

        /* renamed from: a, reason: collision with root package name */
        static final b f134865a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f134866b = Bf.b.d("appId");

        /* renamed from: c, reason: collision with root package name */
        private static final Bf.b f134867c = Bf.b.d("deviceModel");

        /* renamed from: d, reason: collision with root package name */
        private static final Bf.b f134868d = Bf.b.d("sessionSdkVersion");

        /* renamed from: e, reason: collision with root package name */
        private static final Bf.b f134869e = Bf.b.d("osVersion");

        /* renamed from: f, reason: collision with root package name */
        private static final Bf.b f134870f = Bf.b.d("logEnvironment");

        /* renamed from: g, reason: collision with root package name */
        private static final Bf.b f134871g = Bf.b.d("androidAppInfo");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ApplicationInfo applicationInfo, Bf.d dVar) throws IOException {
            dVar.f(f134866b, applicationInfo.getAppId());
            dVar.f(f134867c, applicationInfo.getDeviceModel());
            dVar.f(f134868d, applicationInfo.getSessionSdkVersion());
            dVar.f(f134869e, applicationInfo.getOsVersion());
            dVar.f(f134870f, applicationInfo.getLogEnvironment());
            dVar.f(f134871g, applicationInfo.getAndroidAppInfo());
        }

        private b() {
        }
    }

    /* renamed from: hg.c$c, reason: collision with other inner class name */
    private static final class C2125c implements Bf.c<DataCollectionStatus> {

        /* renamed from: a, reason: collision with root package name */
        static final C2125c f134872a = new C2125c();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f134873b = Bf.b.d("performance");

        /* renamed from: c, reason: collision with root package name */
        private static final Bf.b f134874c = Bf.b.d("crashlytics");

        /* renamed from: d, reason: collision with root package name */
        private static final Bf.b f134875d = Bf.b.d("sessionSamplingRate");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(DataCollectionStatus dataCollectionStatus, Bf.d dVar) throws IOException {
            dVar.f(f134873b, dataCollectionStatus.getPerformance());
            dVar.f(f134874c, dataCollectionStatus.getCrashlytics());
            dVar.c(f134875d, dataCollectionStatus.getSessionSamplingRate());
        }

        private C2125c() {
        }
    }

    /* renamed from: hg.c$d */
    private static final class d implements Bf.c<ProcessDetails> {

        /* renamed from: a, reason: collision with root package name */
        static final d f134876a = new d();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f134877b = Bf.b.d("processName");

        /* renamed from: c, reason: collision with root package name */
        private static final Bf.b f134878c = Bf.b.d("pid");

        /* renamed from: d, reason: collision with root package name */
        private static final Bf.b f134879d = Bf.b.d("importance");

        /* renamed from: e, reason: collision with root package name */
        private static final Bf.b f134880e = Bf.b.d("defaultProcess");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ProcessDetails processDetails, Bf.d dVar) throws IOException {
            dVar.f(f134877b, processDetails.getProcessName());
            dVar.e(f134878c, processDetails.getPid());
            dVar.e(f134879d, processDetails.getImportance());
            dVar.b(f134880e, processDetails.getIsDefaultProcess());
        }

        private d() {
        }
    }

    /* renamed from: hg.c$e */
    private static final class e implements Bf.c<SessionEvent> {

        /* renamed from: a, reason: collision with root package name */
        static final e f134881a = new e();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f134882b = Bf.b.d("eventType");

        /* renamed from: c, reason: collision with root package name */
        private static final Bf.b f134883c = Bf.b.d("sessionData");

        /* renamed from: d, reason: collision with root package name */
        private static final Bf.b f134884d = Bf.b.d("applicationInfo");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(SessionEvent sessionEvent, Bf.d dVar) throws IOException {
            dVar.f(f134882b, sessionEvent.getEventType());
            dVar.f(f134883c, sessionEvent.getSessionData());
            dVar.f(f134884d, sessionEvent.getApplicationInfo());
        }

        private e() {
        }
    }

    /* renamed from: hg.c$f */
    private static final class f implements Bf.c<SessionInfo> {

        /* renamed from: a, reason: collision with root package name */
        static final f f134885a = new f();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f134886b = Bf.b.d("sessionId");

        /* renamed from: c, reason: collision with root package name */
        private static final Bf.b f134887c = Bf.b.d("firstSessionId");

        /* renamed from: d, reason: collision with root package name */
        private static final Bf.b f134888d = Bf.b.d("sessionIndex");

        /* renamed from: e, reason: collision with root package name */
        private static final Bf.b f134889e = Bf.b.d("eventTimestampUs");

        /* renamed from: f, reason: collision with root package name */
        private static final Bf.b f134890f = Bf.b.d("dataCollectionStatus");

        /* renamed from: g, reason: collision with root package name */
        private static final Bf.b f134891g = Bf.b.d("firebaseInstallationId");

        /* renamed from: h, reason: collision with root package name */
        private static final Bf.b f134892h = Bf.b.d("firebaseAuthenticationToken");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(SessionInfo sessionInfo, Bf.d dVar) throws IOException {
            dVar.f(f134886b, sessionInfo.getSessionId());
            dVar.f(f134887c, sessionInfo.getFirstSessionId());
            dVar.e(f134888d, sessionInfo.getSessionIndex());
            dVar.d(f134889e, sessionInfo.getEventTimestampUs());
            dVar.f(f134890f, sessionInfo.getDataCollectionStatus());
            dVar.f(f134891g, sessionInfo.getFirebaseInstallationId());
            dVar.f(f134892h, sessionInfo.getFirebaseAuthenticationToken());
        }

        private f() {
        }
    }

    @Override // Cf.a
    public void a(Cf.b<?> bVar) {
        bVar.a(SessionEvent.class, e.f134881a);
        bVar.a(SessionInfo.class, f.f134885a);
        bVar.a(DataCollectionStatus.class, C2125c.f134872a);
        bVar.a(ApplicationInfo.class, b.f134865a);
        bVar.a(AndroidApplicationInfo.class, a.f134858a);
        bVar.a(ProcessDetails.class, d.f134876a);
    }

    private C14431c() {
    }
}
