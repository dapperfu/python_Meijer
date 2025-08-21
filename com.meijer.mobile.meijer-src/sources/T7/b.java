package T7;

import K7.j;
import V7.AppStartupPhaseWithTiming;
import X7.SessionInformationMetrics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONException;
import org.json.JSONObject;
import y7.InterfaceC18294a;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\"R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010#R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010+\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001b0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010'¨\u0006/"}, d2 = {"LT7/b;", "LT7/a;", "Ly7/a;", "timeProvider", "LW7/a;", "appStartupLogger", "Lu7/f;", "rumEventDispatcher", "LK7/j;", "sessionInformationProvider", "Lkotlin/Function0;", "LV7/d;", "visibilityStatusProvider", "<init>", "(Ly7/a;LW7/a;Lu7/f;LK7/j;Lkotlin/jvm/functions/Function0;)V", "", "b", "()Z", "LV7/c;", "c", "()LV7/c;", "", "e", "()V", "appStartupType", "d", "(LV7/c;)V", "LV7/a;", "startupPhase", "a", "(LV7/a;)V", "Ly7/a;", "LW7/a;", "Lu7/f;", "LK7/j;", "Lkotlin/jvm/functions/Function0;", "", "LV7/b;", "f", "Ljava/util/List;", "phases", "g", "Z", "isProcessingStartup", "", "h", "phasesOrder", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class b implements T7.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC18294a timeProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final W7.a appStartupLogger;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final u7.f rumEventDispatcher;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final j sessionInformationProvider;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Function0<V7.d> visibilityStatusProvider;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<AppStartupPhaseWithTiming> phases;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isProcessingStartup;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<V7.a> phasesOrder;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[V7.a.values().length];
            try {
                iArr[V7.a.f39801b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[V7.a.f39802c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[V7.a.f39803d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[V7.a.f39804e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(InterfaceC18294a timeProvider, W7.a appStartupLogger, u7.f rumEventDispatcher, j sessionInformationProvider, Function0<? extends V7.d> visibilityStatusProvider) {
        Intrinsics.j(timeProvider, "timeProvider");
        Intrinsics.j(appStartupLogger, "appStartupLogger");
        Intrinsics.j(rumEventDispatcher, "rumEventDispatcher");
        Intrinsics.j(sessionInformationProvider, "sessionInformationProvider");
        Intrinsics.j(visibilityStatusProvider, "visibilityStatusProvider");
        this.timeProvider = timeProvider;
        this.appStartupLogger = appStartupLogger;
        this.rumEventDispatcher = rumEventDispatcher;
        this.sessionInformationProvider = sessionInformationProvider;
        this.visibilityStatusProvider = visibilityStatusProvider;
        this.phases = new ArrayList();
        this.phasesOrder = CollectionsKt.p(V7.a.f39801b, V7.a.f39802c, V7.a.f39803d, V7.a.f39804e);
    }

    private final boolean b() {
        if (this.visibilityStatusProvider.invoke() == V7.d.f39817c) {
            this.isProcessingStartup = true;
        }
        return this.isProcessingStartup;
    }

    private final V7.c c() {
        int i10 = a.$EnumSwitchMapping$0[((AppStartupPhaseWithTiming) CollectionsKt.s0(this.phases)).getPhase().ordinal()];
        if (i10 == 1) {
            return V7.c.f39810b;
        }
        if (i10 == 2) {
            return V7.c.f39811c;
        }
        if (i10 == 3) {
            return V7.c.f39812d;
        }
        if (i10 == 4) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void d(V7.c appStartupType) throws JSONException {
        SessionInformationMetrics sessionInformationMetricsA = this.sessionInformationProvider.a();
        if (!sessionInformationMetricsA.getIsGrailEventsCanBeCaptured()) {
            z8.f.a("dtxLifecycle", "startup event cannot be tracked, isGrailEventsCanBeCaptured == false");
            this.phases.clear();
            return;
        }
        if (!sessionInformationMetricsA.getSessionActive()) {
            z8.f.a("dtxLifecycle", "startup event cannot be tracked, session is disabled");
            this.phases.clear();
            return;
        }
        long start = ((AppStartupPhaseWithTiming) CollectionsKt.s0(this.phases)).getStart();
        long start2 = ((AppStartupPhaseWithTiming) CollectionsKt.D0(this.phases)).getStart();
        this.appStartupLogger.a(appStartupType, start, start2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("characteristics.has_app_start", true);
        jSONObject.put("app_start.type", appStartupType.getValue());
        int i10 = 0;
        for (Object obj : this.phases) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.w();
            }
            AppStartupPhaseWithTiming appStartupPhaseWithTiming = (AppStartupPhaseWithTiming) obj;
            AppStartupPhaseWithTiming appStartupPhaseWithTiming2 = (AppStartupPhaseWithTiming) CollectionsKt.v0(this.phases, i11);
            if (appStartupPhaseWithTiming2 != null) {
                long start3 = appStartupPhaseWithTiming2.getStart();
                if (appStartupPhaseWithTiming.getPhase() != V7.a.f39804e) {
                    jSONObject.put("app_start." + appStartupPhaseWithTiming.getPhase().getValue() + ".start_time", appStartupPhaseWithTiming.getStart() - start);
                    jSONObject.put("app_start." + appStartupPhaseWithTiming.getPhase().getValue() + ".end_time", start3 - start);
                }
            }
            i10 = i11;
        }
        this.rumEventDispatcher.f(jSONObject, start, start2 - start, sessionInformationMetricsA);
        this.phases.clear();
    }

    @Override // T7.a
    public void a(V7.a startupPhase) throws JSONException {
        int iIndexOf;
        Intrinsics.j(startupPhase, "startupPhase");
        if (b()) {
            if (!this.phases.isEmpty() && (iIndexOf = this.phasesOrder.indexOf(((AppStartupPhaseWithTiming) CollectionsKt.D0(this.phases)).getPhase())) != CollectionsKt.o(this.phasesOrder) && this.phasesOrder.get(iIndexOf + 1) != startupPhase) {
                V7.c cVarC = c();
                if (cVarC != null) {
                    this.appStartupLogger.c(cVarC);
                }
                this.phases.clear();
            }
            this.phases.add(new AppStartupPhaseWithTiming(startupPhase, this.timeProvider.a()));
            e();
        }
    }

    private final void e() throws JSONException {
        V7.c cVarC = c();
        if (cVarC != null) {
            if (this.phases.size() == 1) {
                this.appStartupLogger.b(cVarC, ((AppStartupPhaseWithTiming) CollectionsKt.s0(this.phases)).getStart());
                return;
            }
            if (this.phases.size() > 1) {
                this.appStartupLogger.d(cVarC, this.phases.get(r0.size() - 2).getPhase(), this.phases.get(r0.size() - 2).getStart(), ((AppStartupPhaseWithTiming) CollectionsKt.D0(this.phases)).getStart());
                if (((AppStartupPhaseWithTiming) CollectionsKt.D0(this.phases)).getPhase() == V7.a.f39804e) {
                    this.isProcessingStartup = false;
                    d(cVarC);
                }
            }
        }
    }
}
