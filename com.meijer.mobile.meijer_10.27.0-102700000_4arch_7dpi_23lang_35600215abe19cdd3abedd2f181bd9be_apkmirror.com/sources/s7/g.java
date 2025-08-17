package s7;

import W7.EndPointInfo;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import k8.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qv.C16648k;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Ls7/g;", "Ls7/e;", "Lx7/b;", "communicationManager", "LO7/a;", "exitReasonProcessor", "LV7/f;", "metricsStorageWorker", "LV7/b;", "metricsCache", "LW7/d;", "eventDatabaseDataSource", "LZ7/h;", "serverConfigurationDataSource", "LZ7/b;", "endPointInfoDataSource", "LW7/a;", "activeEndPoint", "Lqv/O;", "externalScope", "<init>", "(Lx7/b;LO7/a;LV7/f;LV7/b;LW7/d;LZ7/h;LZ7/b;LW7/a;Lqv/O;)V", "Lk8/q;", "serverConfigurationV3", "", "a", "(Lk8/q;)V", "Lx7/b;", "b", "LO7/a;", "c", "LV7/f;", "d", "LV7/b;", "e", "LW7/d;", "f", "LZ7/h;", "g", "LZ7/b;", "h", "LW7/a;", "i", "Lqv/O;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final x7.b communicationManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final O7.a exitReasonProcessor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final V7.f metricsStorageWorker;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final V7.b metricsCache;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final W7.d eventDatabaseDataSource;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Z7.h serverConfigurationDataSource;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Z7.b endPointInfoDataSource;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final EndPointInfo activeEndPoint;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16622O externalScope;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.OneAgentStartupImpl$start$1", f = "OneAgentStartupImpl.kt", l = {51, 53, 68, 69, 70, 71, 74, 76, BinsView.LABEL_WIDTH_DP}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f160363a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ q f160365c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(q qVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f160365c = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return g.this.new a(this.f160365c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:46:0x0142, code lost:
        
            if (r6.c(r5) == r0) goto L47;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0063 A[PHI: r6
          0x0063: PHI (r6v7 java.lang.Object) = (r6v6 java.lang.Object), (r6v0 java.lang.Object) binds: [B:19:0x005f, B:13:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00df  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0105  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0115 A[PHI: r6
          0x0115: PHI (r6v27 java.lang.Object) = (r6v26 java.lang.Object), (r6v0 java.lang.Object) binds: [B:38:0x0112, B:8:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x012a  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0145  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                Method dump skipped, instructions count: 386
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: s7.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public g(x7.b communicationManager, O7.a exitReasonProcessor, V7.f metricsStorageWorker, V7.b metricsCache, W7.d eventDatabaseDataSource, Z7.h serverConfigurationDataSource, Z7.b endPointInfoDataSource, EndPointInfo activeEndPoint, InterfaceC16622O externalScope) {
        Intrinsics.j(communicationManager, "communicationManager");
        Intrinsics.j(exitReasonProcessor, "exitReasonProcessor");
        Intrinsics.j(metricsStorageWorker, "metricsStorageWorker");
        Intrinsics.j(metricsCache, "metricsCache");
        Intrinsics.j(eventDatabaseDataSource, "eventDatabaseDataSource");
        Intrinsics.j(serverConfigurationDataSource, "serverConfigurationDataSource");
        Intrinsics.j(endPointInfoDataSource, "endPointInfoDataSource");
        Intrinsics.j(activeEndPoint, "activeEndPoint");
        Intrinsics.j(externalScope, "externalScope");
        this.communicationManager = communicationManager;
        this.exitReasonProcessor = exitReasonProcessor;
        this.metricsStorageWorker = metricsStorageWorker;
        this.metricsCache = metricsCache;
        this.eventDatabaseDataSource = eventDatabaseDataSource;
        this.serverConfigurationDataSource = serverConfigurationDataSource;
        this.endPointInfoDataSource = endPointInfoDataSource;
        this.activeEndPoint = activeEndPoint;
        this.externalScope = externalScope;
    }

    @Override // s7.e
    public void a(q serverConfigurationV3) {
        Intrinsics.j(serverConfigurationV3, "serverConfigurationV3");
        C16648k.d(this.externalScope, null, null, new a(serverConfigurationV3, null), 3, null);
    }
}
