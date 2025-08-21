package qo;

import androidx.view.c0;
import androidx.view.d0;
import co.ClippedReward;
import com.meijer.mobile.mperks.networking.domain.models.MperksRewardEarnedDetail;
import hi.InterfaceC14523a;
import ii.C14756c;
import ii.TrackingData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import pv.C16563h;
import pv.InterfaceC16549B;
import pv.S;
import qo.AbstractC16740o;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lqo/I;", "Landroidx/lifecycle/c0;", "Lfo/e;", "rewardsRepository", "Lhi/a;", "analyticsEngine", "<init>", "(Lfo/e;Lhi/a;)V", "", "q", "()V", "Lqo/o;", "action", "s", "(Lqo/o;)V", "a", "Lfo/e;", "b", "Lhi/a;", "Lpv/B;", "Lqo/M;", "c", "Lpv/B;", "_rewardsState", "Lpv/P;", "d", "Lpv/P;", "r", "()Lpv/P;", "rewardsState", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qo.I, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C16717I extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final fo.e rewardsRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<RewardsViewState> _rewardsState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final pv.P<RewardsViewState> rewardsState;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.rewards.RewardsTabViewModel$getAllClippedRewards$1", f = "RewardsTabViewModel.kt", l = {84}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: qo.I$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f158797a;

        /* renamed from: b, reason: collision with root package name */
        int f158798b;

        /* renamed from: c, reason: collision with root package name */
        int f158799c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f158800d;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = C16717I.this.new a(continuation);
            aVar.f158800d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v11, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v2, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, mv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            ?? r12;
            Object value;
            Object value2;
            Object value3;
            Object value4;
            Object value5;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f158799c;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ?? r13 = (InterfaceC15783O) this.f158800d;
                        ResultKt.b(obj);
                        i10 = r13;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    ?? r14 = (InterfaceC15783O) this.f158800d;
                    C16717I c16717i = C16717I.this;
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC16549B interfaceC16549B = c16717i._rewardsState;
                    do {
                        value5 = interfaceC16549B.getValue();
                    } while (!interfaceC16549B.e(value5, RewardsViewState.b((RewardsViewState) value5, true, null, false, false, false, 30, null)));
                    fo.e eVar = c16717i.rewardsRepository;
                    this.f158800d = r14;
                    this.f158797a = r14;
                    this.f158798b = 0;
                    this.f158799c = 1;
                    obj = eVar.k(this);
                    i10 = r14;
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b((MperksRewardEarnedDetail) obj);
                r12 = i10;
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
                r12 = i10;
            }
            C16717I c16717i2 = C16717I.this;
            if (Result.h(objB)) {
                MperksRewardEarnedDetail mperksRewardEarnedDetail = (MperksRewardEarnedDetail) objB;
                List<ClippedReward> rewards = mperksRewardEarnedDetail.getRewards();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : rewards) {
                    if (!ClippedReward.h((ClippedReward) obj2, null, 1, null)) {
                        arrayList.add(obj2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    InterfaceC16549B interfaceC16549B2 = c16717i2._rewardsState;
                    do {
                        value4 = interfaceC16549B2.getValue();
                    } while (!interfaceC16549B2.e(value4, RewardsViewState.b((RewardsViewState) value4, false, arrayList, true, false, false, 1, null)));
                    qw.a.INSTANCE.z("mperks_clipped_rewards").q("Clipped Reward Coupons: " + mperksRewardEarnedDetail, new Object[0]);
                } else {
                    InterfaceC16549B interfaceC16549B3 = c16717i2._rewardsState;
                    do {
                        value3 = interfaceC16549B3.getValue();
                    } while (!interfaceC16549B3.e(value3, RewardsViewState.b((RewardsViewState) value3, false, null, true, true, false, 3, null)));
                    qw.a.INSTANCE.z("mperks_clipped_rewards").q("Clipped Reward Coupons: No clipped rewards found", new Object[0]);
                }
            }
            C16717I c16717i3 = C16717I.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                InterfaceC16549B interfaceC16549B4 = c16717i3._rewardsState;
                do {
                    value2 = interfaceC16549B4.getValue();
                } while (!interfaceC16549B4.e(value2, RewardsViewState.b((RewardsViewState) value2, false, null, false, false, true, 15, null)));
                E0.i(r12.getCoroutineContext());
                if (!(thE instanceof Error)) {
                    qw.a.INSTANCE.f(thE, "Failed to load Mperks clipped reward coupons.", new Object[0]);
                } else {
                    throw thE;
                }
            }
            InterfaceC16549B interfaceC16549B5 = C16717I.this._rewardsState;
            do {
                value = interfaceC16549B5.getValue();
            } while (!interfaceC16549B5.e(value, RewardsViewState.b((RewardsViewState) value, false, null, false, false, false, 30, null)));
            return Unit.f143329a;
        }
    }

    public C16717I(fo.e rewardsRepository, InterfaceC14523a analyticsEngine) {
        Intrinsics.j(rewardsRepository, "rewardsRepository");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        this.rewardsRepository = rewardsRepository;
        this.analyticsEngine = analyticsEngine;
        InterfaceC16549B<RewardsViewState> interfaceC16549BA = S.a(new RewardsViewState(false, null, false, false, false, 31, null));
        this._rewardsState = interfaceC16549BA;
        this.rewardsState = C16563h.c(interfaceC16549BA);
        q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(AbstractC16740o abstractC16740o, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("mPerks 4.0");
        track.o("mPerks: Rewards");
        AbstractC16740o.AnalyticsRewardsAction analyticsRewardsAction = (AbstractC16740o.AnalyticsRewardsAction) abstractC16740o;
        track.h("mperksPoints", String.valueOf(analyticsRewardsAction.getMperksPoints()));
        List<String> listA = analyticsRewardsAction.a();
        track.h("availableRewards", listA != null ? CollectionsKt.B0(listA, ", ", null, null, 0, null, null, 62, null) : null);
        String previousTrackAction = analyticsRewardsAction.getPreviousTrackAction();
        if (previousTrackAction != null && previousTrackAction.length() != 0) {
            track.h("previousTrackAction", analyticsRewardsAction.getPreviousTrackAction());
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(AbstractC16740o abstractC16740o, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("mPerks 4.0");
        track.o("mPerks: Rewards");
        AbstractC16740o.AnalyticsRewardDetailsPage analyticsRewardDetailsPage = (AbstractC16740o.AnalyticsRewardDetailsPage) abstractC16740o;
        track.h("rewardID", analyticsRewardDetailsPage.getRewardId());
        String rewardValidThruDate = analyticsRewardDetailsPage.getRewardValidThruDate();
        if (rewardValidThruDate != null) {
            track.h("rewardValidThroughDate", rewardValidThruDate);
        }
        track.h("daysLeftToApply", analyticsRewardDetailsPage.getDaysLeftToApply());
        track.h("mperksPoints", analyticsRewardDetailsPage.getMperksPoints());
        track.h("previousTrackAction", "Reward clicked");
        return Unit.f143329a;
    }

    public final pv.P<RewardsViewState> r() {
        return this.rewardsState;
    }

    public final void s(final AbstractC16740o action) {
        Intrinsics.j(action, "action");
        if (action instanceof AbstractC16740o.c) {
            q();
        } else if (action instanceof AbstractC16740o.AnalyticsRewardsAction) {
            this.analyticsEngine.b(C14756c.h("mPerks:Rewards Page"), new Function1() { // from class: qo.G
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C16717I.t(action, (TrackingData) obj);
                }
            });
        } else {
            if (!(action instanceof AbstractC16740o.AnalyticsRewardDetailsPage)) {
                throw new NoWhenBranchMatchedException();
            }
            this.analyticsEngine.b(C14756c.h("mPerks:Reward Details Page"), new Function1() { // from class: qo.H
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C16717I.u(action, (TrackingData) obj);
                }
            });
        }
    }

    private final void q() {
        C15809k.d(d0.a(this), null, null, new a(null), 3, null);
    }
}
