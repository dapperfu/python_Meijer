package K7;

import Y7.EndPointInfo;
import a8.InterfaceC5667a;
import android.app.Application;
import b8.InterfaceC6338b;
import c8.InterfaceC6491a;
import h8.C14488b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l8.InterfaceC15473a;
import l8.InterfaceC15474b;
import mv.C15784P;
import mv.C15800f0;
import mv.InterfaceC15783O;
import okhttp3.d;
import u7.C17358c;
import u7.OneAgentConfiguration;
import u8.InterfaceC17360a;
import v7.C17644a;
import v7.C17645b;
import v7.C17646c;
import v7.C17647d;
import x7.C18130c;
import x7.InterfaceC18129b;
import y7.InterfaceC18294a;
import y8.InterfaceC18295a;
import z7.InterfaceC18459b;

@Metadata(d1 = {"\u0000\u009e\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u0091\u00012\u00020\u0001:\u0001\u0014B=\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0017\u0010F\u001a\u00020C8\u0006¢\u0006\f\n\u0004\b\u0011\u0010D\u001a\u0004\b0\u0010ER\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010V\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\"\u0010]\u001a\u00020W8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\b,\u0010Z\"\u0004\b[\u0010\\R\u0017\u0010b\u001a\u00020^8\u0006¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\b@\u0010aR\u0017\u0010h\u001a\u00020c8\u0006¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u0014\u0010l\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010p\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010t\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0017\u0010y\u001a\u00020u8\u0006¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\b8\u0010xR\u0017\u0010~\u001a\u00020z8\u0006¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b(\u0010}R\u0017\u0010\u0082\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001c\u0010\u0087\u0001\u001a\u00030\u0083\u00018\u0006¢\u0006\u000f\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0005\b4\u0010\u0086\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001c\u0010\u0090\u0001\u001a\u00030\u008c\u00018\u0006¢\u0006\u000f\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0005\b<\u0010\u008f\u0001¨\u0006\u0092\u0001"}, d2 = {"LK7/c;", "", "Lu7/a;", "oneAgentConfiguration", "Ly7/a;", "timeProvider", "Ll8/b;", "legacyServerConfigurationListener", "Lokhttp3/d$a;", "httpFactory", "Landroid/app/Application;", "applicationContext", "LK7/h;", "secondGenServiceLocator", "<init>", "(Lu7/a;Ly7/a;Ll8/b;Lokhttp3/d$a;Landroid/app/Application;LK7/h;)V", "", "m", "()V", "Lmv/O;", "a", "Lmv/O;", "coreCoroutineScope", "LZ7/b;", "b", "LZ7/b;", "storageModule", "Lx7/b;", "c", "Lx7/b;", "connectivityChecker", "LY7/d;", "d", "LY7/d;", "databaseDataSource", "Lb8/h;", "e", "Lb8/h;", "serverConfigurationDataSource", "Lb8/b;", "f", "Lb8/b;", "endPointInfoDataSource", "LY7/a;", "g", "LY7/a;", "activeEndPointInfo", "La8/a;", "h", "La8/a;", "dynamicConfigDataSource", "Lz7/b;", "i", "Lz7/b;", "communicationManager", "LL7/a;", "j", "LL7/a;", "eventFlowGovernor", "Lh8/b;", "k", "Lh8/b;", "viewContextManager", "LK7/j;", "l", "LK7/j;", "sessionInformationProvider", "Lv7/b;", "Lv7/b;", "()Lv7/b;", "oneAgentFacade", "LU7/d;", "n", "LU7/d;", "viewTracker", "LL7/c;", "o", "LL7/c;", "eventThrottler", "Lb8/g;", "p", "Lb8/g;", "metricsRepository", "LK7/f;", "q", "LK7/f;", "metricsModule", "LX7/b;", "r", "LX7/b;", "()LX7/b;", "setMetricsCache", "(LX7/b;)V", "metricsCache", "Lu7/h;", "s", "Lu7/h;", "()Lu7/h;", "rumEventDispatcher", "Lu7/f;", "t", "Lu7/f;", "getOneAgentStartupEventDispatcher", "()Lu7/f;", "oneAgentStartupEventDispatcher", "LS7/a;", "u", "LS7/a;", "exitReasonModule", "LQ7/a;", "v", "LQ7/a;", "exitReasonProcessor", "LX7/f;", "w", "LX7/f;", "metricsStorageWorker", "Lu7/e;", "x", "Lu7/e;", "()Lu7/e;", "oneAgentStartup", "Ll8/a;", "y", "Ll8/a;", "()Ll8/a;", "communicationManagerBridge", "LT7/c;", "z", "LT7/c;", "lifecycleManager", "Lu8/a;", "A", "Lu8/a;", "()Lu8/a;", "oneAgentLifecycleManagerBridge", "Lc8/a;", "B", "Lc8/a;", "userInteractionManager", "Ly8/a;", "C", "Ly8/a;", "()Ly8/a;", "oneAgentUserInteractionManagerBridge", "D", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: E, reason: collision with root package name */
    private static c f16418E;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17360a oneAgentLifecycleManagerBridge;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6491a userInteractionManager;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC18295a oneAgentUserInteractionManagerBridge;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15783O coreCoroutineScope;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Z7.b storageModule;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC18129b connectivityChecker;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Y7.d databaseDataSource;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final b8.h serverConfigurationDataSource;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6338b endPointInfoDataSource;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final EndPointInfo activeEndPointInfo;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5667a dynamicConfigDataSource;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC18459b communicationManager;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final L7.a eventFlowGovernor;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final C14488b viewContextManager;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final j sessionInformationProvider;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final C17645b oneAgentFacade;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final U7.d viewTracker;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final L7.c eventThrottler;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final b8.g metricsRepository;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final f metricsModule;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private X7.b metricsCache;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final u7.h rumEventDispatcher;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final u7.f oneAgentStartupEventDispatcher;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final S7.a exitReasonModule;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Q7.a exitReasonProcessor;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final X7.f metricsStorageWorker;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final u7.e oneAgentStartup;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15473a communicationManagerBridge;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final T7.c lifecycleManager;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0003R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LK7/c$a;", "", "<init>", "()V", "Lu7/a;", "oneAgentConfiguration", "Ly7/a;", "timeProvider", "Ll8/b;", "legacyServerConfigurationListener", "Lokhttp3/d$a;", "httpFactory", "Landroid/app/Application;", "applicationContext", "LK7/h;", "secondGenServiceLocator", "", "b", "(Lu7/a;Ly7/a;Ll8/b;Lokhttp3/d$a;Landroid/app/Application;LK7/h;)V", "LK7/c;", "a", "()LK7/c;", "c", "instance", "LK7/c;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: K7.c$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void b(OneAgentConfiguration oneAgentConfiguration, InterfaceC18294a timeProvider, InterfaceC15474b legacyServerConfigurationListener, d.a httpFactory, Application applicationContext, h secondGenServiceLocator) {
            Intrinsics.j(oneAgentConfiguration, "oneAgentConfiguration");
            Intrinsics.j(timeProvider, "timeProvider");
            Intrinsics.j(legacyServerConfigurationListener, "legacyServerConfigurationListener");
            Intrinsics.j(applicationContext, "applicationContext");
            Intrinsics.j(secondGenServiceLocator, "secondGenServiceLocator");
            if (c.f16418E == null) {
                c.f16418E = new c(oneAgentConfiguration, timeProvider, legacyServerConfigurationListener, httpFactory, applicationContext, secondGenServiceLocator, null);
            }
        }

        public final void c() {
            z8.f.a("dtxStartStop", "tearDown OneAgent");
            try {
                c cVar = c.f16418E;
                if (cVar != null) {
                    cVar.m();
                }
                c.f16418E = null;
            } catch (Exception e10) {
                c.f16418E = null;
                z8.f.b("dtxStartStop", "tearDown OneAgent with exception", e10);
            }
        }

        public final c a() {
            return c.f16418E;
        }
    }

    public /* synthetic */ c(OneAgentConfiguration oneAgentConfiguration, InterfaceC18294a interfaceC18294a, InterfaceC15474b interfaceC15474b, d.a aVar, Application application, h hVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(oneAgentConfiguration, interfaceC18294a, interfaceC15474b, aVar, application, hVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private c(final OneAgentConfiguration oneAgentConfiguration, InterfaceC18294a interfaceC18294a, InterfaceC15474b interfaceC15474b, d.a aVar, Application application, final h hVar) {
        InterfaceC15783O interfaceC15783OA = C15784P.a(C15800f0.b());
        this.coreCoroutineScope = interfaceC15783OA;
        Z7.b bVar = new Z7.b(application, interfaceC15783OA);
        this.storageModule = bVar;
        C18130c c18130c = new C18130c(application);
        this.connectivityChecker = c18130c;
        Y7.d dVarE = bVar.e();
        this.databaseDataSource = dVarE;
        b8.h hVarH = bVar.h();
        this.serverConfigurationDataSource = hVarH;
        InterfaceC6338b interfaceC6338bI = bVar.i();
        this.endPointInfoDataSource = interfaceC6338bI;
        EndPointInfo endPointInfo = new EndPointInfo(oneAgentConfiguration.getApplicationId(), oneAgentConfiguration.getBeaconUrl());
        this.activeEndPointInfo = endPointInfo;
        InterfaceC5667a interfaceC5667aD = bVar.d();
        this.dynamicConfigDataSource = interfaceC5667aD;
        InterfaceC18459b interfaceC18459bA = new B7.a(aVar, interfaceC18294a, oneAgentConfiguration.getVersion(), dVarE, endPointInfo, new v7.e(interfaceC15474b, hVarH, interfaceC5667aD), interfaceC15783OA, c18130c).a();
        this.communicationManager = interfaceC18459bA;
        L7.a aVar2 = new L7.a(null, interfaceC15783OA, 1, 0 == true ? 1 : 0);
        this.eventFlowGovernor = aVar2;
        C14488b c14488b = new C14488b(aVar2);
        this.viewContextManager = c14488b;
        j jVarA = hVar.a();
        this.sessionInformationProvider = jVarA;
        C17645b c17645b = new C17645b(jVarA, c14488b);
        this.oneAgentFacade = c17645b;
        U7.d dVar = new U7.d(c17645b, application, oneAgentConfiguration);
        this.viewTracker = dVar;
        L7.c cVar = new L7.c(interfaceC18294a, oneAgentConfiguration.getEventThrottlingLimit(), 60, 60, interfaceC15783OA, new Function1() { // from class: K7.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c.e(hVar, oneAgentConfiguration, ((Integer) obj).intValue());
            }
        });
        this.eventThrottler = cVar;
        b8.g gVarG = bVar.g();
        this.metricsRepository = gVarG;
        f fVar = new f(application, hVar, gVarG, interfaceC15783OA);
        this.metricsModule = fVar;
        X7.b bVarA = fVar.a();
        this.metricsCache = bVarA;
        C17358c c17358c = new C17358c(oneAgentConfiguration, interfaceC18294a, dVarE, bVarA, interfaceC15783OA, c14488b, hVarH, interfaceC5667aD, cVar, aVar2);
        this.rumEventDispatcher = c17358c;
        u7.f fVar2 = new u7.f(10000L, oneAgentConfiguration, interfaceC15783OA, c17358c);
        this.oneAgentStartupEventDispatcher = fVar2;
        S7.a aVar3 = new S7.a(application, interfaceC18294a, 0L, c17358c, jVarA, gVarG, bVar.f(), oneAgentConfiguration.getNativeCrashReporting(), oneAgentConfiguration.getAnrReporting(), 4, null);
        this.exitReasonModule = aVar3;
        Q7.a aVarA = aVar3.a();
        this.exitReasonProcessor = aVarA;
        X7.f fVarB = fVar.b();
        this.metricsStorageWorker = fVarB;
        this.oneAgentStartup = new u7.g(interfaceC18459bA, aVarA, fVarB, this.metricsCache, dVarE, hVarH, interfaceC6338bI, endPointInfo, interfaceC15783OA);
        this.communicationManagerBridge = new C17644a(interfaceC18459bA);
        T7.c cVarB = new e(interfaceC18294a, application, c17358c, fVar2, jVarA).b();
        this.lifecycleManager = cVarB;
        this.oneAgentLifecycleManagerBridge = new C17646c(cVarB);
        InterfaceC6491a interfaceC6491aA = new k(interfaceC15783OA, interfaceC18294a, c17358c, jVarA).a();
        this.userInteractionManager = interfaceC6491aA;
        this.oneAgentUserInteractionManagerBridge = new C17647d(interfaceC6491aA);
        dVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        this.viewTracker.b();
        this.communicationManager.b();
        this.storageModule.j();
        C15784P.f(this.coreCoroutineScope, null, 1, null);
    }

    /* renamed from: f, reason: from getter */
    public final InterfaceC15473a getCommunicationManagerBridge() {
        return this.communicationManagerBridge;
    }

    /* renamed from: g, reason: from getter */
    public final X7.b getMetricsCache() {
        return this.metricsCache;
    }

    /* renamed from: h, reason: from getter */
    public final C17645b getOneAgentFacade() {
        return this.oneAgentFacade;
    }

    /* renamed from: i, reason: from getter */
    public final InterfaceC17360a getOneAgentLifecycleManagerBridge() {
        return this.oneAgentLifecycleManagerBridge;
    }

    /* renamed from: j, reason: from getter */
    public final u7.e getOneAgentStartup() {
        return this.oneAgentStartup;
    }

    /* renamed from: k, reason: from getter */
    public final InterfaceC18295a getOneAgentUserInteractionManagerBridge() {
        return this.oneAgentUserInteractionManagerBridge;
    }

    /* renamed from: l, reason: from getter */
    public final u7.h getRumEventDispatcher() {
        return this.rumEventDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(h hVar, OneAgentConfiguration oneAgentConfiguration, int i10) {
        hVar.b().a("EventThrottlingGrail", "Dropped " + i10 + " events, current limit: " + oneAgentConfiguration.getEventThrottlingLimit());
        return Unit.f143329a;
    }
}
