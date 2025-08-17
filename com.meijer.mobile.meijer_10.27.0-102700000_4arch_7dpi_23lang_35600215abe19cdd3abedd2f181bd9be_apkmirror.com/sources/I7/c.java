package I7;

import W7.EndPointInfo;
import a8.InterfaceC5585a;
import android.app.Application;
import f8.C13858b;
import j8.InterfaceC14874a;
import j8.InterfaceC14875b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.d;
import qv.C16623P;
import qv.C16639f0;
import qv.InterfaceC16622O;
import s7.C16911c;
import s7.OneAgentConfiguration;
import s8.InterfaceC16913a;
import t7.C17069a;
import t7.C17070b;
import t7.C17071c;
import t7.C17072d;
import v7.C17518c;
import v7.InterfaceC17517b;
import w7.InterfaceC17801a;
import w8.InterfaceC17802a;
import z7.C18401a;

@Metadata(d1 = {"\u0000\u009e\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u0091\u00012\u00020\u0001:\u0001\u0014B=\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0017\u0010F\u001a\u00020C8\u0006¢\u0006\f\n\u0004\b\u0011\u0010D\u001a\u0004\b0\u0010ER\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010V\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\"\u0010]\u001a\u00020W8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\b,\u0010Z\"\u0004\b[\u0010\\R\u0017\u0010b\u001a\u00020^8\u0006¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\b@\u0010aR\u0017\u0010h\u001a\u00020c8\u0006¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u0014\u0010l\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010p\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010t\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0017\u0010y\u001a\u00020u8\u0006¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\b8\u0010xR\u0017\u0010~\u001a\u00020z8\u0006¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b(\u0010}R\u0017\u0010\u0082\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001c\u0010\u0087\u0001\u001a\u00030\u0083\u00018\u0006¢\u0006\u000f\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0005\b4\u0010\u0086\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001c\u0010\u0090\u0001\u001a\u00030\u008c\u00018\u0006¢\u0006\u000f\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0005\b<\u0010\u008f\u0001¨\u0006\u0092\u0001"}, d2 = {"LI7/c;", "", "Ls7/a;", "oneAgentConfiguration", "Lw7/a;", "timeProvider", "Lj8/b;", "legacyServerConfigurationListener", "Lokhttp3/d$a;", "httpFactory", "Landroid/app/Application;", "applicationContext", "LI7/h;", "secondGenServiceLocator", "<init>", "(Ls7/a;Lw7/a;Lj8/b;Lokhttp3/d$a;Landroid/app/Application;LI7/h;)V", "", "m", "()V", "Lqv/O;", "a", "Lqv/O;", "coreCoroutineScope", "LX7/a;", "b", "LX7/a;", "storageModule", "Lv7/b;", "c", "Lv7/b;", "connectivityChecker", "LW7/d;", "d", "LW7/d;", "databaseDataSource", "LZ7/h;", "e", "LZ7/h;", "serverConfigurationDataSource", "LZ7/b;", "f", "LZ7/b;", "endPointInfoDataSource", "LW7/a;", "g", "LW7/a;", "activeEndPointInfo", "LY7/a;", "h", "LY7/a;", "dynamicConfigDataSource", "Lx7/b;", "i", "Lx7/b;", "communicationManager", "LJ7/a;", "j", "LJ7/a;", "eventFlowGovernor", "Lf8/b;", "k", "Lf8/b;", "viewContextManager", "LI7/j;", "l", "LI7/j;", "sessionInformationProvider", "Lt7/b;", "Lt7/b;", "()Lt7/b;", "oneAgentFacade", "LS7/d;", "n", "LS7/d;", "viewTracker", "LJ7/c;", "o", "LJ7/c;", "eventThrottler", "LZ7/g;", "p", "LZ7/g;", "metricsRepository", "LI7/f;", "q", "LI7/f;", "metricsModule", "LV7/b;", "r", "LV7/b;", "()LV7/b;", "setMetricsCache", "(LV7/b;)V", "metricsCache", "Ls7/h;", "s", "Ls7/h;", "()Ls7/h;", "rumEventDispatcher", "Ls7/f;", "t", "Ls7/f;", "getOneAgentStartupEventDispatcher", "()Ls7/f;", "oneAgentStartupEventDispatcher", "LQ7/a;", "u", "LQ7/a;", "exitReasonModule", "LO7/a;", "v", "LO7/a;", "exitReasonProcessor", "LV7/f;", "w", "LV7/f;", "metricsStorageWorker", "Ls7/e;", "x", "Ls7/e;", "()Ls7/e;", "oneAgentStartup", "Lj8/a;", "y", "Lj8/a;", "()Lj8/a;", "communicationManagerBridge", "LR7/c;", "z", "LR7/c;", "lifecycleManager", "Ls8/a;", "A", "Ls8/a;", "()Ls8/a;", "oneAgentLifecycleManagerBridge", "La8/a;", "B", "La8/a;", "userInteractionManager", "Lw8/a;", "C", "Lw8/a;", "()Lw8/a;", "oneAgentUserInteractionManagerBridge", "D", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: E, reason: collision with root package name */
    private static c f13672E;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16913a oneAgentLifecycleManagerBridge;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5585a userInteractionManager;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17802a oneAgentUserInteractionManagerBridge;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16622O coreCoroutineScope;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final X7.a storageModule;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17517b connectivityChecker;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final W7.d databaseDataSource;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Z7.h serverConfigurationDataSource;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Z7.b endPointInfoDataSource;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final EndPointInfo activeEndPointInfo;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Y7.a dynamicConfigDataSource;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final x7.b communicationManager;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final J7.a eventFlowGovernor;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final C13858b viewContextManager;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final j sessionInformationProvider;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final C17070b oneAgentFacade;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final S7.d viewTracker;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final J7.c eventThrottler;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Z7.g metricsRepository;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final f metricsModule;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private V7.b metricsCache;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final s7.h rumEventDispatcher;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final s7.f oneAgentStartupEventDispatcher;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final Q7.a exitReasonModule;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final O7.a exitReasonProcessor;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final V7.f metricsStorageWorker;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final s7.e oneAgentStartup;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14874a communicationManagerBridge;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final R7.c lifecycleManager;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0003R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LI7/c$a;", "", "<init>", "()V", "Ls7/a;", "oneAgentConfiguration", "Lw7/a;", "timeProvider", "Lj8/b;", "legacyServerConfigurationListener", "Lokhttp3/d$a;", "httpFactory", "Landroid/app/Application;", "applicationContext", "LI7/h;", "secondGenServiceLocator", "", "b", "(Ls7/a;Lw7/a;Lj8/b;Lokhttp3/d$a;Landroid/app/Application;LI7/h;)V", "LI7/c;", "a", "()LI7/c;", "c", "instance", "LI7/c;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: I7.c$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void b(OneAgentConfiguration oneAgentConfiguration, InterfaceC17801a timeProvider, InterfaceC14875b legacyServerConfigurationListener, d.a httpFactory, Application applicationContext, h secondGenServiceLocator) {
            Intrinsics.j(oneAgentConfiguration, "oneAgentConfiguration");
            Intrinsics.j(timeProvider, "timeProvider");
            Intrinsics.j(legacyServerConfigurationListener, "legacyServerConfigurationListener");
            Intrinsics.j(applicationContext, "applicationContext");
            Intrinsics.j(secondGenServiceLocator, "secondGenServiceLocator");
            if (c.f13672E == null) {
                c.f13672E = new c(oneAgentConfiguration, timeProvider, legacyServerConfigurationListener, httpFactory, applicationContext, secondGenServiceLocator, null);
            }
        }

        public final void c() {
            x8.f.a("dtxStartStop", "tearDown OneAgent");
            try {
                c cVar = c.f13672E;
                if (cVar != null) {
                    cVar.m();
                }
                c.f13672E = null;
            } catch (Exception e10) {
                c.f13672E = null;
                x8.f.b("dtxStartStop", "tearDown OneAgent with exception", e10);
            }
        }

        public final c a() {
            return c.f13672E;
        }
    }

    public /* synthetic */ c(OneAgentConfiguration oneAgentConfiguration, InterfaceC17801a interfaceC17801a, InterfaceC14875b interfaceC14875b, d.a aVar, Application application, h hVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(oneAgentConfiguration, interfaceC17801a, interfaceC14875b, aVar, application, hVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private c(final OneAgentConfiguration oneAgentConfiguration, InterfaceC17801a interfaceC17801a, InterfaceC14875b interfaceC14875b, d.a aVar, Application application, final h hVar) {
        InterfaceC16622O interfaceC16622OA = C16623P.a(C16639f0.b());
        this.coreCoroutineScope = interfaceC16622OA;
        X7.a aVar2 = new X7.a(application, interfaceC16622OA);
        this.storageModule = aVar2;
        C17518c c17518c = new C17518c(application);
        this.connectivityChecker = c17518c;
        W7.d dVarC = aVar2.c();
        this.databaseDataSource = dVarC;
        Z7.h hVarF = aVar2.f();
        this.serverConfigurationDataSource = hVarF;
        Z7.b bVarG = aVar2.g();
        this.endPointInfoDataSource = bVarG;
        EndPointInfo endPointInfo = new EndPointInfo(oneAgentConfiguration.getApplicationId(), oneAgentConfiguration.getBeaconUrl());
        this.activeEndPointInfo = endPointInfo;
        Y7.a aVarB = aVar2.b();
        this.dynamicConfigDataSource = aVarB;
        x7.b bVarA = new C18401a(aVar, interfaceC17801a, oneAgentConfiguration.getVersion(), dVarC, endPointInfo, new t7.e(interfaceC14875b, hVarF, aVarB), interfaceC16622OA, c17518c).a();
        this.communicationManager = bVarA;
        J7.a aVar3 = new J7.a(null, interfaceC16622OA, 1, 0 == true ? 1 : 0);
        this.eventFlowGovernor = aVar3;
        C13858b c13858b = new C13858b(aVar3);
        this.viewContextManager = c13858b;
        j jVarA = hVar.a();
        this.sessionInformationProvider = jVarA;
        C17070b c17070b = new C17070b(jVarA, c13858b);
        this.oneAgentFacade = c17070b;
        S7.d dVar = new S7.d(c17070b, application, oneAgentConfiguration);
        this.viewTracker = dVar;
        J7.c cVar = new J7.c(interfaceC17801a, oneAgentConfiguration.getEventThrottlingLimit(), 60, 60, interfaceC16622OA, new Function1() { // from class: I7.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c.e(hVar, oneAgentConfiguration, ((Integer) obj).intValue());
            }
        });
        this.eventThrottler = cVar;
        Z7.g gVarE = aVar2.e();
        this.metricsRepository = gVarE;
        f fVar = new f(application, hVar, gVarE, interfaceC16622OA);
        this.metricsModule = fVar;
        V7.b bVarA2 = fVar.a();
        this.metricsCache = bVarA2;
        C16911c c16911c = new C16911c(oneAgentConfiguration, interfaceC17801a, dVarC, bVarA2, interfaceC16622OA, c13858b, hVarF, aVarB, cVar, aVar3);
        this.rumEventDispatcher = c16911c;
        s7.f fVar2 = new s7.f(10000L, oneAgentConfiguration, interfaceC16622OA, c16911c);
        this.oneAgentStartupEventDispatcher = fVar2;
        Q7.a aVar4 = new Q7.a(application, interfaceC17801a, 0L, c16911c, jVarA, gVarE, aVar2.d(), oneAgentConfiguration.getNativeCrashReporting(), oneAgentConfiguration.getAnrReporting(), 4, null);
        this.exitReasonModule = aVar4;
        O7.a aVarA = aVar4.a();
        this.exitReasonProcessor = aVarA;
        V7.f fVarB = fVar.b();
        this.metricsStorageWorker = fVarB;
        this.oneAgentStartup = new s7.g(bVarA, aVarA, fVarB, this.metricsCache, dVarC, hVarF, bVarG, endPointInfo, interfaceC16622OA);
        this.communicationManagerBridge = new C17069a(bVarA);
        R7.c cVarB = new e(interfaceC17801a, application, c16911c, fVar2, jVarA).b();
        this.lifecycleManager = cVarB;
        this.oneAgentLifecycleManagerBridge = new C17071c(cVarB);
        InterfaceC5585a interfaceC5585aA = new k(interfaceC16622OA, interfaceC17801a, c16911c, jVarA).a();
        this.userInteractionManager = interfaceC5585aA;
        this.oneAgentUserInteractionManagerBridge = new C17072d(interfaceC5585aA);
        dVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        this.viewTracker.b();
        this.communicationManager.b();
        this.storageModule.h();
        C16623P.f(this.coreCoroutineScope, null, 1, null);
    }

    /* renamed from: f, reason: from getter */
    public final InterfaceC14874a getCommunicationManagerBridge() {
        return this.communicationManagerBridge;
    }

    /* renamed from: g, reason: from getter */
    public final V7.b getMetricsCache() {
        return this.metricsCache;
    }

    /* renamed from: h, reason: from getter */
    public final C17070b getOneAgentFacade() {
        return this.oneAgentFacade;
    }

    /* renamed from: i, reason: from getter */
    public final InterfaceC16913a getOneAgentLifecycleManagerBridge() {
        return this.oneAgentLifecycleManagerBridge;
    }

    /* renamed from: j, reason: from getter */
    public final s7.e getOneAgentStartup() {
        return this.oneAgentStartup;
    }

    /* renamed from: k, reason: from getter */
    public final InterfaceC17802a getOneAgentUserInteractionManagerBridge() {
        return this.oneAgentUserInteractionManagerBridge;
    }

    /* renamed from: l, reason: from getter */
    public final s7.h getRumEventDispatcher() {
        return this.rumEventDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(h hVar, OneAgentConfiguration oneAgentConfiguration, int i10) {
        hVar.b().a("EventThrottlingGrail", "Dropped " + i10 + " events, current limit: " + oneAgentConfiguration.getEventThrottlingLimit());
        return Unit.f142422a;
    }
}
