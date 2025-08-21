package oo;

import androidx.view.InterfaceC6157f;
import co.EarnReward;
import co.EnumC6534f;
import co.EnumC6541m;
import gi.C14377e;
import gi.EnumC14378f;
import hi.InterfaceC14523a;
import ii.C14756c;
import ii.TrackingData;
import java.util.ArrayList;
import java.util.Comparator;
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
import mv.C15809k;
import mv.E0;
import mv.InterfaceC15783O;
import oo.e0;
import pv.C16563h;
import pv.InterfaceC16549B;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020$0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001cR\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020$0\u001e8\u0006¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"¨\u0006*"}, d2 = {"Loo/a0;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "Lfo/e;", "rewardsRepository", "Lhi/a;", "analyticsEngine", "Lyo/k;", "userManager", "<init>", "(Lfo/e;Lhi/a;Lyo/k;)V", "Loo/e0;", "action", "", "w", "(Loo/e0;)V", "s", "()V", "t", "a", "Lfo/e;", "b", "Lhi/a;", "c", "Lyo/k;", "Lpv/B;", "Loo/o;", "d", "Lpv/B;", "_earnAvailableStateFlow", "Lpv/P;", "e", "Lpv/P;", "u", "()Lpv/P;", "earnAvailableStateFlow", "Loo/v;", "f", "_earnInProgressStateFlow", "g", "v", "earnInProgressStateFlow", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class a0 extends androidx.view.c0 implements InterfaceC6157f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final fo.e rewardsRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<EarnAvailableViewState> _earnAvailableStateFlow;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final pv.P<EarnAvailableViewState> earnAvailableStateFlow;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<EarnInProgressState> _earnInProgressStateFlow;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final pv.P<EarnInProgressState> earnInProgressStateFlow;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.earn.EarnTabViewModel$fetchAvailableRewards$1", f = "EarnTabViewModel.kt", l = {144}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f155189a;

        /* renamed from: b, reason: collision with root package name */
        int f155190b;

        /* renamed from: c, reason: collision with root package name */
        int f155191c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f155192d;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = a0.this.new b(continuation);
            bVar.f155192d = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, mv.O] */
        /* JADX WARN: Type inference failed for: r1v15, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v2, types: [mv.O] */
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
            int i10 = this.f155191c;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ?? r13 = (InterfaceC15783O) this.f155192d;
                        ResultKt.b(obj);
                        i10 = r13;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    ?? r14 = (InterfaceC15783O) this.f155192d;
                    a0 a0Var = a0.this;
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC16549B interfaceC16549B = a0Var._earnAvailableStateFlow;
                    do {
                        value4 = interfaceC16549B.getValue();
                    } while (!interfaceC16549B.e(value4, EarnAvailableViewState.b((EarnAvailableViewState) value4, true, null, false, null, 14, null)));
                    fo.e eVar = a0Var.rewardsRepository;
                    this.f155192d = r14;
                    this.f155189a = r14;
                    this.f155190b = 0;
                    this.f155191c = 1;
                    obj = eVar.h(this);
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
                InterfaceC16549B interfaceC16549B2 = a0Var2._earnAvailableStateFlow;
                do {
                    value3 = interfaceC16549B2.getValue();
                    earnAvailableViewState = (EarnAvailableViewState) value3;
                    arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (((EarnReward) obj2).getRewardProgram() != EnumC6541m.f62801a) {
                            arrayList.add(obj2);
                        }
                    }
                } while (!interfaceC16549B2.e(value3, EarnAvailableViewState.b(earnAvailableViewState, false, arrayList, false, null, 13, null)));
            }
            a0 a0Var3 = a0.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                E0.i(r12.getCoroutineContext());
                if (!(thE instanceof Error)) {
                    InterfaceC16549B interfaceC16549B3 = a0Var3._earnAvailableStateFlow;
                    do {
                        value2 = interfaceC16549B3.getValue();
                    } while (!interfaceC16549B3.e(value2, EarnAvailableViewState.b((EarnAvailableViewState) value2, false, null, true, null, 11, null)));
                    qw.a.INSTANCE.f(thE, "Failed to load Mperks Get available rewards.", new Object[0]);
                } else {
                    throw thE;
                }
            }
            InterfaceC16549B interfaceC16549B4 = a0.this._earnAvailableStateFlow;
            do {
                value = interfaceC16549B4.getValue();
            } while (!interfaceC16549B4.e(value, EarnAvailableViewState.b((EarnAvailableViewState) value, false, null, false, null, 14, null)));
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.earn.EarnTabViewModel$fetchInProgressRewards$1", f = "EarnTabViewModel.kt", l = {168}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f155194a;

        /* renamed from: b, reason: collision with root package name */
        int f155195b;

        /* renamed from: c, reason: collision with root package name */
        int f155196c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f155197d;

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
            cVar.f155197d = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, mv.O] */
        /* JADX WARN: Type inference failed for: r1v15, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v2, types: [mv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            ?? r12;
            Object value;
            Object value2;
            Object value3;
            Object value4;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f155196c;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ?? r13 = (InterfaceC15783O) this.f155197d;
                        ResultKt.b(obj);
                        i10 = r13;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    ?? r14 = (InterfaceC15783O) this.f155197d;
                    a0 a0Var = a0.this;
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC16549B interfaceC16549B = a0Var._earnInProgressStateFlow;
                    do {
                        value4 = interfaceC16549B.getValue();
                    } while (!interfaceC16549B.e(value4, EarnInProgressState.b((EarnInProgressState) value4, true, null, null, false, 14, null)));
                    fo.e eVar = a0Var.rewardsRepository;
                    this.f155197d = r14;
                    this.f155194a = r14;
                    this.f155195b = 0;
                    this.f155196c = 1;
                    obj = eVar.i(this);
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
                    if (((EarnReward) obj2).getRewardProgram() == EnumC6541m.f62801a) {
                        arrayList.add(obj2);
                    }
                }
                List listZ0 = CollectionsKt.Z0(arrayList, new a());
                InterfaceC16549B interfaceC16549B2 = a0Var2._earnInProgressStateFlow;
                do {
                    value3 = interfaceC16549B2.getValue();
                } while (!interfaceC16549B2.e(value3, EarnInProgressState.b((EarnInProgressState) value3, false, list, listZ0, false, 9, null)));
            }
            a0 a0Var3 = a0.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                E0.i(r12.getCoroutineContext());
                if (!(thE instanceof Error)) {
                    InterfaceC16549B interfaceC16549B3 = a0Var3._earnInProgressStateFlow;
                    do {
                        value2 = interfaceC16549B3.getValue();
                    } while (!interfaceC16549B3.e(value2, EarnInProgressState.b((EarnInProgressState) value2, false, null, null, true, 7, null)));
                    qw.a.INSTANCE.f(thE, "Failed to load Mperks Get in progress rewards.", new Object[0]);
                } else {
                    throw thE;
                }
            }
            InterfaceC16549B interfaceC16549B4 = a0.this._earnInProgressStateFlow;
            do {
                value = interfaceC16549B4.getValue();
            } while (!interfaceC16549B4.e(value, EarnInProgressState.b((EarnInProgressState) value, false, null, null, false, 14, null)));
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC6534f.values().length];
            try {
                iArr[EnumC6534f.f62714a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6534f.f62715b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6534f.f62716c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a0(fo.e rewardsRepository, InterfaceC14523a analyticsEngine, yo.k userManager) {
        Intrinsics.j(rewardsRepository, "rewardsRepository");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        Intrinsics.j(userManager, "userManager");
        this.rewardsRepository = rewardsRepository;
        this.analyticsEngine = analyticsEngine;
        this.userManager = userManager;
        InterfaceC16549B<EarnAvailableViewState> interfaceC16549BA = pv.S.a(new EarnAvailableViewState(false, null, false, null, 15, null));
        this._earnAvailableStateFlow = interfaceC16549BA;
        this.earnAvailableStateFlow = C16563h.c(interfaceC16549BA);
        InterfaceC16549B<EarnInProgressState> interfaceC16549BA2 = pv.S.a(new EarnInProgressState(false, null, null, false, 15, null));
        this._earnInProgressStateFlow = interfaceC16549BA2;
        this.earnInProgressStateFlow = C16563h.c(interfaceC16549BA2);
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
        return Unit.f143329a;
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
        return Unit.f143329a;
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
        return Unit.f143329a;
    }

    public final pv.P<EarnAvailableViewState> u() {
        return this.earnAvailableStateFlow;
    }

    public final pv.P<EarnInProgressState> v() {
        return this.earnInProgressStateFlow;
    }

    public final void w(final e0 action) {
        EarnAvailableViewState value;
        Intrinsics.j(action, "action");
        if (action instanceof e0.TrackAvailableRewardCardClicked) {
            this.analyticsEngine.b(C14756c.h("mPerks:Reward Details Page"), new Function1() { // from class: oo.X
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return a0.x(action, (TrackingData) obj);
                }
            });
            return;
        }
        if (action instanceof e0.TrackEarnPillsSelected) {
            this.analyticsEngine.b(C14756c.h("mPerks:Earn Page"), new Function1() { // from class: oo.Y
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return a0.y(action, (TrackingData) obj);
                }
            });
            return;
        }
        if (action instanceof e0.TrackInProgressRewardCardClicked) {
            this.analyticsEngine.b(C14756c.h("mPerks:Reward Details Page"), new Function1() { // from class: oo.Z
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return a0.A(action, (TrackingData) obj);
                }
            });
        } else {
            if (!(action instanceof e0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC16549B<EarnAvailableViewState> interfaceC16549B = this._earnAvailableStateFlow;
            do {
                value = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value, EarnAvailableViewState.b(value, false, null, false, C14377e.b(C14377e.f134254a, EnumC14378f.f134256e, "mperks", true, null, this.userManager.y(), null, 40, null), 7, null)));
        }
    }

    public final void s() {
        C15809k.d(androidx.view.d0.a(this), null, null, new b(null), 3, null);
    }

    public final void t() {
        C15809k.d(androidx.view.d0.a(this), null, null, new c(null), 3, null);
    }
}
