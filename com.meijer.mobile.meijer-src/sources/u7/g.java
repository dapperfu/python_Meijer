package u7;

import Y7.EndPointInfo;
import b8.InterfaceC6338b;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m8.q;
import mv.C15809k;
import mv.InterfaceC15783O;
import z7.InterfaceC18459b;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lu7/g;", "Lu7/e;", "Lz7/b;", "communicationManager", "LQ7/a;", "exitReasonProcessor", "LX7/f;", "metricsStorageWorker", "LX7/b;", "metricsCache", "LY7/d;", "eventDatabaseDataSource", "Lb8/h;", "serverConfigurationDataSource", "Lb8/b;", "endPointInfoDataSource", "LY7/a;", "activeEndPoint", "Lmv/O;", "externalScope", "<init>", "(Lz7/b;LQ7/a;LX7/f;LX7/b;LY7/d;Lb8/h;Lb8/b;LY7/a;Lmv/O;)V", "Lm8/q;", "serverConfigurationV3", "", "a", "(Lm8/q;)V", "Lz7/b;", "b", "LQ7/a;", "c", "LX7/f;", "d", "LX7/b;", "e", "LY7/d;", "f", "Lb8/h;", "g", "Lb8/b;", "h", "LY7/a;", "i", "Lmv/O;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC18459b communicationManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Q7.a exitReasonProcessor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final X7.f metricsStorageWorker;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final X7.b metricsCache;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Y7.d eventDatabaseDataSource;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final b8.h serverConfigurationDataSource;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6338b endPointInfoDataSource;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final EndPointInfo activeEndPoint;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15783O externalScope;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.OneAgentStartupImpl$start$1", f = "OneAgentStartupImpl.kt", l = {51, 53, 68, 69, 70, 71, 74, 76, BinsView.LABEL_WIDTH_DP}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f163849a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ q f163851c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(q qVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f163851c = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return g.this.new a(this.f163851c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
            throw new UnsupportedOperationException("Method not decompiled: u7.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public g(InterfaceC18459b communicationManager, Q7.a exitReasonProcessor, X7.f metricsStorageWorker, X7.b metricsCache, Y7.d eventDatabaseDataSource, b8.h serverConfigurationDataSource, InterfaceC6338b endPointInfoDataSource, EndPointInfo activeEndPoint, InterfaceC15783O externalScope) {
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

    @Override // u7.e
    public void a(q serverConfigurationV3) {
        Intrinsics.j(serverConfigurationV3, "serverConfigurationV3");
        C15809k.d(this.externalScope, null, null, new a(serverConfigurationV3, null), 3, null);
    }
}
