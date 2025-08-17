package qo;

import androidx.view.c0;
import androidx.view.d0;
import bo.ClippedReward;
import com.meijer.mobile.mperks.networking.domain.models.EarnedReward;
import com.meijer.mobile.mperks.networking.domain.models.MperksRewardEarnedResponse;
import eo.C13719g;
import gi.InterfaceC14261a;
import hi.C14476c;
import hi.TrackingData;
import java.util.ArrayList;
import java.util.Iterator;
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
import qo.AbstractC16581o;
import qv.C16648k;
import qv.E0;
import qv.InterfaceC16622O;
import tv.C17154h;
import tv.InterfaceC17140B;
import tv.S;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lqo/I;", "Landroidx/lifecycle/c0;", "Leo/g;", "rewardsRepository", "Lgi/a;", "analyticsEngine", "<init>", "(Leo/g;Lgi/a;)V", "", "q", "()V", "Lqo/o;", "action", "s", "(Lqo/o;)V", "a", "Leo/g;", "b", "Lgi/a;", "Ltv/B;", "Lqo/M;", "c", "Ltv/B;", "_rewardsState", "Ltv/P;", "d", "Ltv/P;", "r", "()Ltv/P;", "rewardsState", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qo.I, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C16558I extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C13719g rewardsRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14261a analyticsEngine;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<RewardsViewState> _rewardsState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final tv.P<RewardsViewState> rewardsState;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.rewards.RewardsTabViewModel$getAllClippedRewards$1", f = "RewardsTabViewModel.kt", l = {85}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: qo.I$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f157360a;

        /* renamed from: b, reason: collision with root package name */
        int f157361b;

        /* renamed from: c, reason: collision with root package name */
        int f157362c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f157363d;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = C16558I.this.new a(continuation);
            aVar.f157363d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v13, types: [qv.O] */
        /* JADX WARN: Type inference failed for: r2v16 */
        /* JADX WARN: Type inference failed for: r2v17 */
        /* JADX WARN: Type inference failed for: r2v2, types: [qv.O] */
        /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, qv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            ?? r22;
            Object value;
            Object value2;
            ArrayList arrayList;
            Object value3;
            Object value4;
            Object value5;
            Object objO;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f157362c;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    ?? r23 = (InterfaceC16622O) this.f157363d;
                    C16558I c16558i = C16558I.this;
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC17140B interfaceC17140B = c16558i._rewardsState;
                    do {
                        value5 = interfaceC17140B.getValue();
                    } while (!interfaceC17140B.e(value5, RewardsViewState.b((RewardsViewState) value5, true, null, false, false, false, 30, null)));
                    C13719g c13719g = c16558i.rewardsRepository;
                    this.f157363d = r23;
                    this.f157360a = r23;
                    this.f157361b = 0;
                    this.f157362c = 1;
                    objO = c13719g.o(this);
                    i10 = r23;
                    if (objO == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ?? r24 = (InterfaceC16622O) this.f157363d;
                    ResultKt.b(obj);
                    objO = obj;
                    i10 = r24;
                }
                objB = Result.b((MperksRewardEarnedResponse) objO);
                r22 = i10;
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
                r22 = i10;
            }
            C16558I c16558i2 = C16558I.this;
            if (Result.h(objB)) {
                MperksRewardEarnedResponse mperksRewardEarnedResponse = (MperksRewardEarnedResponse) objB;
                List<EarnedReward> rewards = mperksRewardEarnedResponse.getRewards();
                if (rewards != null) {
                    List<EarnedReward> list = rewards;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(no.e.a((EarnedReward) it.next()));
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : arrayList2) {
                        if (!ClippedReward.h((ClippedReward) obj2, null, 1, null)) {
                            arrayList3.add(obj2);
                        }
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                if (arrayList == null || !(!arrayList.isEmpty())) {
                    InterfaceC17140B interfaceC17140B2 = c16558i2._rewardsState;
                    do {
                        value3 = interfaceC17140B2.getValue();
                    } while (!interfaceC17140B2.e(value3, RewardsViewState.b((RewardsViewState) value3, false, null, true, true, false, 3, null)));
                    uw.a.INSTANCE.x("mPerks_clipped_rewards_coupons_response").q("Clipped Reward Coupons: No clipped rewards found", new Object[0]);
                } else {
                    InterfaceC17140B interfaceC17140B3 = c16558i2._rewardsState;
                    do {
                        value4 = interfaceC17140B3.getValue();
                    } while (!interfaceC17140B3.e(value4, RewardsViewState.b((RewardsViewState) value4, false, arrayList, true, false, false, 1, null)));
                    uw.a.INSTANCE.x("mPerks_clipped_rewards_coupons_response").q("Clipped Reward Coupons: " + mperksRewardEarnedResponse, new Object[0]);
                }
            }
            C16558I c16558i3 = C16558I.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                InterfaceC17140B interfaceC17140B4 = c16558i3._rewardsState;
                do {
                    value2 = interfaceC17140B4.getValue();
                } while (!interfaceC17140B4.e(value2, RewardsViewState.b((RewardsViewState) value2, false, null, false, false, true, 15, null)));
                E0.i(r22.getCoroutineContext());
                if (thE instanceof Error) {
                    throw thE;
                }
                uw.a.INSTANCE.f(thE, "Failed to load Mperks clipped reward coupons.", new Object[0]);
            }
            InterfaceC17140B interfaceC17140B5 = C16558I.this._rewardsState;
            do {
                value = interfaceC17140B5.getValue();
            } while (!interfaceC17140B5.e(value, RewardsViewState.b((RewardsViewState) value, false, null, false, false, false, 30, null)));
            return Unit.f142422a;
        }
    }

    public C16558I(C13719g rewardsRepository, InterfaceC14261a analyticsEngine) {
        Intrinsics.j(rewardsRepository, "rewardsRepository");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        this.rewardsRepository = rewardsRepository;
        this.analyticsEngine = analyticsEngine;
        InterfaceC17140B<RewardsViewState> interfaceC17140BA = S.a(new RewardsViewState(false, null, false, false, false, 31, null));
        this._rewardsState = interfaceC17140BA;
        this.rewardsState = C17154h.c(interfaceC17140BA);
        q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(AbstractC16581o abstractC16581o, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("mPerks 4.0");
        track.o("mPerks: Rewards");
        AbstractC16581o.AnalyticsRewardsAction analyticsRewardsAction = (AbstractC16581o.AnalyticsRewardsAction) abstractC16581o;
        track.h("mperksPoints", String.valueOf(analyticsRewardsAction.getMperksPoints()));
        List<String> listA = analyticsRewardsAction.a();
        track.h("availableRewards", listA != null ? CollectionsKt.B0(listA, ", ", null, null, 0, null, null, 62, null) : null);
        String previousTrackAction = analyticsRewardsAction.getPreviousTrackAction();
        if (previousTrackAction != null && previousTrackAction.length() != 0) {
            track.h("previousTrackAction", analyticsRewardsAction.getPreviousTrackAction());
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(AbstractC16581o abstractC16581o, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("mPerks 4.0");
        track.o("mPerks: Rewards");
        AbstractC16581o.AnalyticsRewardDetailsPage analyticsRewardDetailsPage = (AbstractC16581o.AnalyticsRewardDetailsPage) abstractC16581o;
        track.h("rewardID", analyticsRewardDetailsPage.getRewardId());
        String rewardValidThruDate = analyticsRewardDetailsPage.getRewardValidThruDate();
        if (rewardValidThruDate != null) {
            track.h("rewardValidThroughDate", rewardValidThruDate);
        }
        track.h("daysLeftToApply", analyticsRewardDetailsPage.getDaysLeftToApply());
        track.h("mperksPoints", analyticsRewardDetailsPage.getMperksPoints());
        track.h("previousTrackAction", "Reward clicked");
        return Unit.f142422a;
    }

    public final tv.P<RewardsViewState> r() {
        return this.rewardsState;
    }

    public final void s(final AbstractC16581o action) {
        Intrinsics.j(action, "action");
        if (action instanceof AbstractC16581o.c) {
            q();
        } else if (action instanceof AbstractC16581o.AnalyticsRewardsAction) {
            this.analyticsEngine.h(C14476c.h("mPerks:Rewards Page"), new Function1() { // from class: qo.G
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C16558I.t(action, (TrackingData) obj);
                }
            });
        } else {
            if (!(action instanceof AbstractC16581o.AnalyticsRewardDetailsPage)) {
                throw new NoWhenBranchMatchedException();
            }
            this.analyticsEngine.h(C14476c.h("mPerks:Reward Details Page"), new Function1() { // from class: qo.H
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C16558I.u(action, (TrackingData) obj);
                }
            });
        }
    }

    private final void q() {
        C16648k.d(d0.a(this), null, null, new a(null), 3, null);
    }
}
