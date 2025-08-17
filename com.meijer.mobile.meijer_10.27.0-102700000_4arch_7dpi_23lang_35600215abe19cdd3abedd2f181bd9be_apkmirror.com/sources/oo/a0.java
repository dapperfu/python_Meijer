package oo;

import androidx.view.InterfaceC6015f;
import bo.EarnReward;
import com.meijer.mobile.mperks.networking.domain.models.MperksAvailableReward;
import eo.C13719g;
import fi.C13904e;
import fi.EnumC13905f;
import gi.InterfaceC14261a;
import hi.C14476c;
import hi.TrackingData;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import oo.e0;
import qv.C16648k;
import qv.E0;
import qv.InterfaceC16622O;
import tv.C17154h;
import tv.InterfaceC17140B;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020$0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001cR\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020$0\u001e8\u0006¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"¨\u0006*"}, d2 = {"Loo/a0;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "Leo/g;", "rewardsRepository", "Lgi/a;", "analyticsEngine", "Lyo/k;", "userManager", "<init>", "(Leo/g;Lgi/a;Lyo/k;)V", "Loo/e0;", "action", "", "w", "(Loo/e0;)V", "s", "()V", "t", "a", "Leo/g;", "b", "Lgi/a;", "c", "Lyo/k;", "Ltv/B;", "Loo/o;", "d", "Ltv/B;", "_earnAvailableStateFlow", "Ltv/P;", "e", "Ltv/P;", "u", "()Ltv/P;", "earnAvailableStateFlow", "Loo/v;", "f", "_earnInProgressStateFlow", "g", "v", "earnInProgressStateFlow", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class a0 extends androidx.view.c0 implements InterfaceC6015f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C13719g rewardsRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14261a analyticsEngine;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<EarnAvailableViewState> _earnAvailableStateFlow;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final tv.P<EarnAvailableViewState> earnAvailableStateFlow;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<EarnInProgressState> _earnInProgressStateFlow;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final tv.P<EarnInProgressState> earnInProgressStateFlow;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.earn.EarnTabViewModel$fetchAvailableRewards$1", f = "EarnTabViewModel.kt", l = {144}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f154616a;

        /* renamed from: b, reason: collision with root package name */
        int f154617b;

        /* renamed from: c, reason: collision with root package name */
        int f154618c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f154619d;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = a0.this.new b(continuation);
            bVar.f154619d = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, qv.O] */
        /* JADX WARN: Type inference failed for: r1v15, types: [qv.O] */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v2, types: [qv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            ?? r12;
            Object value;
            Object value2;
            Object value3;
            EarnAvailableViewState earnAvailableViewState;
            ArrayList arrayList;
            Object value4;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f154618c;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ?? r13 = (InterfaceC16622O) this.f154619d;
                        ResultKt.b(obj);
                        i10 = r13;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    ?? r14 = (InterfaceC16622O) this.f154619d;
                    a0 a0Var = a0.this;
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC17140B interfaceC17140B = a0Var._earnAvailableStateFlow;
                    do {
                        value4 = interfaceC17140B.getValue();
                    } while (!interfaceC17140B.e(value4, EarnAvailableViewState.b((EarnAvailableViewState) value4, true, null, false, null, 14, null)));
                    C13719g c13719g = a0Var.rewardsRepository;
                    this.f154619d = r14;
                    this.f154616a = r14;
                    this.f154617b = 0;
                    this.f154618c = 1;
                    obj = c13719g.j(this);
                    i10 = r14;
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b((List) obj);
                r12 = i10;
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
                r12 = i10;
            }
            a0 a0Var2 = a0.this;
            if (Result.h(objB)) {
                List list = (List) objB;
                InterfaceC17140B interfaceC17140B2 = a0Var2._earnAvailableStateFlow;
                do {
                    value3 = interfaceC17140B2.getValue();
                    earnAvailableViewState = (EarnAvailableViewState) value3;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        if (!StringsKt.I(((MperksAvailableReward) obj2).getRewardProgram(), "booster", false, 2, null)) {
                            arrayList2.add(obj2);
                        }
                    }
                    arrayList = new ArrayList(CollectionsKt.x(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((MperksAvailableReward) it.next()).toEarnReward());
                    }
                } while (!interfaceC17140B2.e(value3, EarnAvailableViewState.b(earnAvailableViewState, false, arrayList, false, null, 13, null)));
            }
            a0 a0Var3 = a0.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                E0.i(r12.getCoroutineContext());
                if (!(thE instanceof Error)) {
                    InterfaceC17140B interfaceC17140B3 = a0Var3._earnAvailableStateFlow;
                    do {
                        value2 = interfaceC17140B3.getValue();
                    } while (!interfaceC17140B3.e(value2, EarnAvailableViewState.b((EarnAvailableViewState) value2, false, null, true, null, 11, null)));
                    uw.a.INSTANCE.f(thE, "Failed to load Mperks Get available rewards.", new Object[0]);
                } else {
                    throw thE;
                }
            }
            InterfaceC17140B interfaceC17140B4 = a0.this._earnAvailableStateFlow;
            do {
                value = interfaceC17140B4.getValue();
            } while (!interfaceC17140B4.e(value, EarnAvailableViewState.b((EarnAvailableViewState) value, false, null, false, null, 14, null)));
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.earn.EarnTabViewModel$fetchInProgressRewards$1", f = "EarnTabViewModel.kt", l = {168}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f154621a;

        /* renamed from: b, reason: collision with root package name */
        int f154622b;

        /* renamed from: c, reason: collision with root package name */
        int f154623c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f154624d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return ComparisonsKt.d(((EarnReward) t10).getEndAt(), ((EarnReward) t11).getEndAt());
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = a0.this.new c(continuation);
            cVar.f154624d = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, qv.O] */
        /* JADX WARN: Type inference failed for: r1v15, types: [qv.O] */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v2, types: [qv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            ?? r12;
            Object value;
            Object value2;
            Object value3;
            Object value4;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f154623c;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ?? r13 = (InterfaceC16622O) this.f154624d;
                        ResultKt.b(obj);
                        i10 = r13;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    ?? r14 = (InterfaceC16622O) this.f154624d;
                    a0 a0Var = a0.this;
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC17140B interfaceC17140B = a0Var._earnInProgressStateFlow;
                    do {
                        value4 = interfaceC17140B.getValue();
                    } while (!interfaceC17140B.e(value4, EarnInProgressState.b((EarnInProgressState) value4, true, null, null, false, 14, null)));
                    C13719g c13719g = a0Var.rewardsRepository;
                    this.f154624d = r14;
                    this.f154621a = r14;
                    this.f154622b = 0;
                    this.f154623c = 1;
                    obj = c13719g.l(this);
                    i10 = r14;
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b((List) obj);
                r12 = i10;
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
                r12 = i10;
            }
            a0 a0Var2 = a0.this;
            if (Result.h(objB)) {
                List list = (List) objB;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((EarnReward) obj2).getRewardProgramType() == bo.k.f60600a) {
                        arrayList.add(obj2);
                    }
                }
                List listZ0 = CollectionsKt.Z0(arrayList, new a());
                InterfaceC17140B interfaceC17140B2 = a0Var2._earnInProgressStateFlow;
                do {
                    value3 = interfaceC17140B2.getValue();
                } while (!interfaceC17140B2.e(value3, EarnInProgressState.b((EarnInProgressState) value3, false, list, listZ0, false, 9, null)));
            }
            a0 a0Var3 = a0.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                E0.i(r12.getCoroutineContext());
                if (!(thE instanceof Error)) {
                    InterfaceC17140B interfaceC17140B3 = a0Var3._earnInProgressStateFlow;
                    do {
                        value2 = interfaceC17140B3.getValue();
                    } while (!interfaceC17140B3.e(value2, EarnInProgressState.b((EarnInProgressState) value2, false, null, null, true, 7, null)));
                    uw.a.INSTANCE.f(thE, "Failed to load Mperks Get in progress rewards.", new Object[0]);
                } else {
                    throw thE;
                }
            }
            InterfaceC17140B interfaceC17140B4 = a0.this._earnInProgressStateFlow;
            do {
                value = interfaceC17140B4.getValue();
            } while (!interfaceC17140B4.e(value, EarnInProgressState.b((EarnInProgressState) value, false, null, null, false, 14, null)));
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[bo.e.values().length];
            try {
                iArr[bo.e.f60514a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[bo.e.f60515b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[bo.e.f60516c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a0(C13719g rewardsRepository, InterfaceC14261a analyticsEngine, yo.k userManager) {
        Intrinsics.j(rewardsRepository, "rewardsRepository");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        Intrinsics.j(userManager, "userManager");
        this.rewardsRepository = rewardsRepository;
        this.analyticsEngine = analyticsEngine;
        this.userManager = userManager;
        InterfaceC17140B<EarnAvailableViewState> interfaceC17140BA = tv.S.a(new EarnAvailableViewState(false, null, false, null, 15, null));
        this._earnAvailableStateFlow = interfaceC17140BA;
        this.earnAvailableStateFlow = C17154h.c(interfaceC17140BA);
        InterfaceC17140B<EarnInProgressState> interfaceC17140BA2 = tv.S.a(new EarnInProgressState(false, null, null, false, 15, null));
        this._earnInProgressStateFlow = interfaceC17140BA2;
        this.earnInProgressStateFlow = C17154h.c(interfaceC17140BA2);
        s();
        t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(e0 e0Var, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("mPerks 4.0");
        track.o("mPerks: Earn");
        e0.TrackInProgressRewardCardClicked trackInProgressRewardCardClicked = (e0.TrackInProgressRewardCardClicked) e0Var;
        track.h("rewardID", trackInProgressRewardCardClicked.getRewardId());
        track.h("rewardStatus", trackInProgressRewardCardClicked.getRewardStatus());
        track.h("rewardEarnThrough", trackInProgressRewardCardClicked.getRewardEarnThrough());
        track.h("daysLeftToEarn", String.valueOf(trackInProgressRewardCardClicked.getDaysLeftToEarn()));
        track.h("mperksPoints", String.valueOf(trackInProgressRewardCardClicked.getMperksPoints()));
        track.h("boosterReward", String.valueOf(trackInProgressRewardCardClicked.getBoosterReward()));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(e0 e0Var, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("mPerks 4.0");
        track.o("mPerks: Earn");
        e0.TrackAvailableRewardCardClicked trackAvailableRewardCardClicked = (e0.TrackAvailableRewardCardClicked) e0Var;
        track.h("rewardID", trackAvailableRewardCardClicked.getRewardId());
        track.h("rewardStatus", trackAvailableRewardCardClicked.getRewardStatus());
        track.h("rewardEarnThrough", trackAvailableRewardCardClicked.getRewardEarnThrough());
        track.h("daysLeftToEarn", String.valueOf(trackAvailableRewardCardClicked.getDaysLeftToEarn()));
        track.h("mperksPoints", String.valueOf(trackAvailableRewardCardClicked.getMperksPoints()));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(e0 e0Var, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("mPerks 4.0");
        e0.TrackEarnPillsSelected trackEarnPillsSelected = (e0.TrackEarnPillsSelected) e0Var;
        track.h("mperksPoints", String.valueOf(trackEarnPillsSelected.getMperksPoints()));
        track.h("previousTrackAction", trackEarnPillsSelected.getPreviousTrackAction());
        int i10 = a.$EnumSwitchMapping$0[trackEarnPillsSelected.getEarnPills().ordinal()];
        if (i10 == 1) {
            track.o("mPerks Earn: All");
            track.h("inProgressRewards", trackEarnPillsSelected.getRewardsInProgress());
            track.h("availableRewards", trackEarnPillsSelected.getRewardsAvailable());
        } else if (i10 == 2) {
            track.o("mPerks Earn: In Progress");
            track.h("inProgressRewards", trackEarnPillsSelected.getRewardsInProgress());
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            track.o("mPerks Earn: Available");
            track.h("availableRewards", trackEarnPillsSelected.getRewardsAvailable());
        }
        return Unit.f142422a;
    }

    public final tv.P<EarnAvailableViewState> u() {
        return this.earnAvailableStateFlow;
    }

    public final tv.P<EarnInProgressState> v() {
        return this.earnInProgressStateFlow;
    }

    public final void w(final e0 action) {
        EarnAvailableViewState value;
        Intrinsics.j(action, "action");
        if (action instanceof e0.TrackAvailableRewardCardClicked) {
            this.analyticsEngine.h(C14476c.h("mPerks:Reward Details Page"), new Function1() { // from class: oo.X
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return a0.x(action, (TrackingData) obj);
                }
            });
            return;
        }
        if (action instanceof e0.TrackEarnPillsSelected) {
            this.analyticsEngine.h(C14476c.h("mPerks:Earn Page"), new Function1() { // from class: oo.Y
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return a0.y(action, (TrackingData) obj);
                }
            });
            return;
        }
        if (action instanceof e0.TrackInProgressRewardCardClicked) {
            this.analyticsEngine.h(C14476c.h("mPerks:Reward Details Page"), new Function1() { // from class: oo.Z
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return a0.A(action, (TrackingData) obj);
                }
            });
        } else {
            if (!(action instanceof e0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC17140B<EarnAvailableViewState> interfaceC17140B = this._earnAvailableStateFlow;
            do {
                value = interfaceC17140B.getValue();
            } while (!interfaceC17140B.e(value, EarnAvailableViewState.b(value, false, null, false, C13904e.b(C13904e.f131155a, EnumC13905f.f131157e, "mperks", true, null, this.userManager.y(), null, 40, null), 7, null)));
        }
    }

    public final void s() {
        C16648k.d(androidx.view.d0.a(this), null, null, new b(null), 3, null);
    }

    public final void t() {
        C16648k.d(androidx.view.d0.a(this), null, null, new c(null), 3, null);
    }
}
