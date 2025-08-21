package jg;

import java.io.IOException;

/* renamed from: jg.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C15009c implements Ef.a {

    /* renamed from: a, reason: collision with root package name */
    public static final Ef.a f140552a = new C15009c();

    /* renamed from: jg.c$a */
    private static final class a implements Df.c<AndroidApplicationInfo> {

        /* renamed from: a, reason: collision with root package name */
        static final a f140553a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f140554b = Df.b.d("packageName");

        /* renamed from: c, reason: collision with root package name */
        private static final Df.b f140555c = Df.b.d("versionName");

        /* renamed from: d, reason: collision with root package name */
        private static final Df.b f140556d = Df.b.d("appBuildVersion");

        /* renamed from: e, reason: collision with root package name */
        private static final Df.b f140557e = Df.b.d("deviceManufacturer");

        /* renamed from: f, reason: collision with root package name */
        private static final Df.b f140558f = Df.b.d("currentProcessDetails");

        /* renamed from: g, reason: collision with root package name */
        private static final Df.b f140559g = Df.b.d("appProcessDetails");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AndroidApplicationInfo androidApplicationInfo, Df.d dVar) throws IOException {
            dVar.a(f140554b, androidApplicationInfo.getPackageName());
            dVar.a(f140555c, androidApplicationInfo.getVersionName());
            dVar.a(f140556d, androidApplicationInfo.getAppBuildVersion());
            dVar.a(f140557e, androidApplicationInfo.getDeviceManufacturer());
            dVar.a(f140558f, androidApplicationInfo.getCurrentProcessDetails());
            dVar.a(f140559g, androidApplicationInfo.b());
        }

        private a() {
        }
    }

    /* renamed from: jg.c$b */
    private static final class b implements Df.c<ApplicationInfo> {

        /* renamed from: a, reason: collision with root package name */
        static final b f140560a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f140561b = Df.b.d("appId");

        /* renamed from: c, reason: collision with root package name */
        private static final Df.b f140562c = Df.b.d("deviceModel");

        /* renamed from: d, reason: collision with root package name */
        private static final Df.b f140563d = Df.b.d("sessionSdkVersion");

        /* renamed from: e, reason: collision with root package name */
        private static final Df.b f140564e = Df.b.d("osVersion");

        /* renamed from: f, reason: collision with root package name */
        private static final Df.b f140565f = Df.b.d("logEnvironment");

        /* renamed from: g, reason: collision with root package name */
        private static final Df.b f140566g = Df.b.d("androidAppInfo");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ApplicationInfo applicationInfo, Df.d dVar) throws IOException {
            dVar.a(f140561b, applicationInfo.getAppId());
            dVar.a(f140562c, applicationInfo.getDeviceModel());
            dVar.a(f140563d, applicationInfo.getSessionSdkVersion());
            dVar.a(f140564e, applicationInfo.getOsVersion());
            dVar.a(f140565f, applicationInfo.getLogEnvironment());
            dVar.a(f140566g, applicationInfo.getAndroidAppInfo());
        }

        private b() {
        }
    }

    /* renamed from: jg.c$c, reason: collision with other inner class name */
    private static final class C2224c implements Df.c<DataCollectionStatus> {

        /* renamed from: a, reason: collision with root package name */
        static final C2224c f140567a = new C2224c();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f140568b = Df.b.d("performance");

        /* renamed from: c, reason: collision with root package name */
        private static final Df.b f140569c = Df.b.d("crashlytics");

        /* renamed from: d, reason: collision with root package name */
        private static final Df.b f140570d = Df.b.d("sessionSamplingRate");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(DataCollectionStatus dataCollectionStatus, Df.d dVar) throws IOException {
            dVar.a(f140568b, dataCollectionStatus.getPerformance());
            dVar.a(f140569c, dataCollectionStatus.getCrashlytics());
            dVar.f(f140570d, dataCollectionStatus.getSessionSamplingRate());
        }

        private C2224c() {
        }
    }

    /* renamed from: jg.c$d */
    private static final class d implements Df.c<ProcessDetails> {

        /* renamed from: a, reason: collision with root package name */
        static final d f140571a = new d();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f140572b = Df.b.d("processName");

        /* renamed from: c, reason: collision with root package name */
        private static final Df.b f140573c = Df.b.d("pid");

        /* renamed from: d, reason: collision with root package name */
        private static final Df.b f140574d = Df.b.d("importance");

        /* renamed from: e, reason: collision with root package name */
        private static final Df.b f140575e = Df.b.d("defaultProcess");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ProcessDetails processDetails, Df.d dVar) throws IOException {
            dVar.a(f140572b, processDetails.getProcessName());
            dVar.e(f140573c, processDetails.getPid());
            dVar.e(f140574d, processDetails.getImportance());
            dVar.c(f140575e, processDetails.getIsDefaultProcess());
        }

        private d() {
        }
    }

    /* renamed from: jg.c$e */
    private static final class e implements Df.c<SessionEvent> {

        /* renamed from: a, reason: collision with root package name */
        static final e f140576a = new e();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f140577b = Df.b.d("eventType");

        /* renamed from: c, reason: collision with root package name */
        private static final Df.b f140578c = Df.b.d("sessionData");

        /* renamed from: d, reason: collision with root package name */
        private static final Df.b f140579d = Df.b.d("applicationInfo");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(SessionEvent sessionEvent, Df.d dVar) throws IOException {
            dVar.a(f140577b, sessionEvent.getEventType());
            dVar.a(f140578c, sessionEvent.getSessionData());
            dVar.a(f140579d, sessionEvent.getApplicationInfo());
        }

        private e() {
        }
    }

    /* renamed from: jg.c$f */
    private static final class f implements Df.c<SessionInfo> {

        /* renamed from: a, reason: collision with root package name */
        static final f f140580a = new f();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f140581b = Df.b.d("sessionId");

        /* renamed from: c, reason: collision with root package name */
        private static final Df.b f140582c = Df.b.d("firstSessionId");

        /* renamed from: d, reason: collision with root package name */
        private static final Df.b f140583d = Df.b.d("sessionIndex");

        /* renamed from: e, reason: collision with root package name */
        private static final Df.b f140584e = Df.b.d("eventTimestampUs");

        /* renamed from: f, reason: collision with root package name */
        private static final Df.b f140585f = Df.b.d("dataCollectionStatus");

        /* renamed from: g, reason: collision with root package name */
        private static final Df.b f140586g = Df.b.d("firebaseInstallationId");

        /* renamed from: h, reason: collision with root package name */
        private static final Df.b f140587h = Df.b.d("firebaseAuthenticationToken");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(SessionInfo sessionInfo, Df.d dVar) throws IOException {
            dVar.a(f140581b, sessionInfo.getSessionId());
            dVar.a(f140582c, sessionInfo.getFirstSessionId());
            dVar.e(f140583d, sessionInfo.getSessionIndex());
            dVar.d(f140584e, sessionInfo.getEventTimestampUs());
            dVar.a(f140585f, sessionInfo.getDataCollectionStatus());
            dVar.a(f140586g, sessionInfo.getFirebaseInstallationId());
            dVar.a(f140587h, sessionInfo.getFirebaseAuthenticationToken());
        }

        private f() {
        }
    }

    @Override // Ef.a
    public void a(Ef.b<?> bVar) {
        bVar.a(SessionEvent.class, e.f140576a);
        bVar.a(SessionInfo.class, f.f140580a);
        bVar.a(DataCollectionStatus.class, C2224c.f140567a);
        bVar.a(ApplicationInfo.class, b.f140560a);
        bVar.a(AndroidApplicationInfo.class, a.f140553a);
        bVar.a(ProcessDetails.class, d.f140571a);
    }

    private C15009c() {
    }
}
