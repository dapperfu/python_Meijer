package ko;

import androidx.view.c0;
import androidx.view.d0;
import bo.AutoClaimReward;
import bo.ClaimReward;
import com.meijer.mobile.mperks.networking.domain.models.AvailableRewardCoupon;
import com.meijer.mobile.mperks.networking.domain.models.MperksAvailableRewardCouponsResponse;
import com.meijer.mobile.mperks.ux.j0;
import eo.C13719g;
import gi.InterfaceC14261a;
import hi.C14476c;
import hi.TrackingData;
import io.C14749d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimerTask;
import ko.AbstractC15200a;
import ko.AbstractC15202c;
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
import qv.C16623P;
import qv.C16648k;
import qv.E0;
import qv.InterfaceC16622O;
import tv.C17146H;
import tv.C17154h;
import tv.InterfaceC17139A;
import tv.InterfaceC17140B;
import tv.InterfaceC17144F;
import tv.P;
import tv.S;
import uw.a;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 C2\u00020\u0001:\u0001)B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ+\u0010\u0012\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001f\u0010\nJ\u000f\u0010 \u001a\u00020\bH\u0000¢\u0006\u0004\b \u0010\nJ\u001d\u0010#\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020.0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001d\u00107\u001a\b\u0012\u0004\u0012\u00020.028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u000209088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001d\u0010B\u001a\b\u0012\u0004\u0012\u0002090=8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A¨\u0006D"}, d2 = {"Lko/z;", "Landroidx/lifecycle/c0;", "Leo/g;", "rewardsRepository", "Lgi/a;", "analyticsEngine", "<init>", "(Leo/g;Lgi/a;)V", "", "y", "()V", "I", "", "enroll", "", "autoClaimType", "", "autoClaimAmount", "w", "(ZLjava/lang/String;Ljava/lang/Double;)V", "A", "(Ljava/lang/String;Ljava/lang/Double;)V", "shouldShow", "Lbo/a;", "autoClaimReward", "J", "(ZLbo/a;)V", "Lbo/b;", "coupon", "v", "(Lbo/b;)V", "x", "D", "rewardAction", "rewardId", "K", "(Ljava/lang/String;Ljava/lang/String;)V", "Lko/a;", "action", "E", "(Lko/a;)V", "a", "Leo/g;", "b", "Lgi/a;", "Ltv/B;", "Lko/d;", "c", "Ltv/B;", "_viewState", "Ltv/P;", "d", "Ltv/P;", "C", "()Ltv/P;", "viewState", "Ltv/A;", "Lko/c;", "e", "Ltv/A;", "_event", "Ltv/F;", "f", "Ltv/F;", "B", "()Ltv/F;", "eventFlow", "g", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class z extends c0 {

    /* renamed from: h, reason: collision with root package name */
    public static final int f142301h = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private C13719g rewardsRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14261a analyticsEngine;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<ClaimTabState> _viewState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final P<ClaimTabState> viewState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17139A<AbstractC15202c> _event;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17144F<AbstractC15202c> eventFlow;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.claim.ClaimTabViewModel$buyCoupon$1", f = "ClaimTabViewModel.kt", l = {76, 131}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f142308a;

        /* renamed from: b, reason: collision with root package name */
        Object f142309b;

        /* renamed from: c, reason: collision with root package name */
        Object f142310c;

        /* renamed from: d, reason: collision with root package name */
        int f142311d;

        /* renamed from: e, reason: collision with root package name */
        int f142312e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f142313f;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ClaimReward f142315h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.mperks.ux.claim.ClaimTabViewModel$buyCoupon$1$2$2$1", f = "ClaimTabViewModel.kt", l = {93}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f142316a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z f142317b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ClaimReward f142318c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z zVar, ClaimReward claimReward, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f142317b = zVar;
                this.f142318c = claimReward;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f142317b, this.f142318c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f142316a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17139A interfaceC17139A = this.f142317b._event;
                    AbstractC15202c.ShowClaimSuccessToast showClaimSuccessToast = new AbstractC15202c.ShowClaimSuccessToast(this.f142318c);
                    this.f142316a = 1;
                    if (interfaceC17139A.emit(showClaimSuccessToast, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.mperks.ux.claim.ClaimTabViewModel$buyCoupon$1$2$2$3", f = "ClaimTabViewModel.kt", l = {106}, m = "invokeSuspend")
        /* renamed from: ko.z$b$b, reason: collision with other inner class name */
        static final class C2260b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f142319a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z f142320b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2260b(z zVar, Continuation<? super C2260b> continuation) {
                super(2, continuation);
                this.f142320b = zVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2260b(this.f142320b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((C2260b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f142319a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17139A interfaceC17139A = this.f142320b._event;
                    AbstractC15202c.a aVar = AbstractC15202c.a.f142201a;
                    this.f142319a = 1;
                    if (interfaceC17139A.emit(aVar, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.mperks.ux.claim.ClaimTabViewModel$buyCoupon$1$2$3", f = "ClaimTabViewModel.kt", l = {111}, m = "invokeSuspend")
        static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f142321a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z f142322b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(z zVar, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f142322b = zVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new c(this.f142322b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f142321a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17139A interfaceC17139A = this.f142322b._event;
                    AbstractC15202c.b bVar = AbstractC15202c.b.f142202a;
                    this.f142321a = 1;
                    if (interfaceC17139A.emit(bVar, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.mperks.ux.claim.ClaimTabViewModel$buyCoupon$1$2$4", f = "ClaimTabViewModel.kt", l = {115}, m = "invokeSuspend")
        static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f142323a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z f142324b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(z zVar, Continuation<? super d> continuation) {
                super(2, continuation);
                this.f142324b = zVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new d(this.f142324b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f142323a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17139A interfaceC17139A = this.f142324b._event;
                    AbstractC15202c.ShowErrorToast showErrorToast = new AbstractC15202c.ShowErrorToast(j0.f114113C);
                    this.f142323a = 1;
                    if (interfaceC17139A.emit(showErrorToast, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"kotlin/concurrent/TimersKt$timerTask$1", "Ljava/util/TimerTask;", "", "run", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class e extends TimerTask {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ z f142325a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ClaimReward f142326b;

            public e(z zVar, ClaimReward claimReward) {
                this.f142325a = zVar;
                this.f142326b = claimReward;
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                Object value;
                C16648k.d(d0.a(this.f142325a), null, null, new a(this.f142325a, this.f142326b, null), 3, null);
                InterfaceC17140B interfaceC17140B = this.f142325a._viewState;
                do {
                    value = interfaceC17140B.getValue();
                } while (!interfaceC17140B.e(value, ClaimTabState.b((ClaimTabState) value, false, false, false, null, null, false, null, false, false, true, 511, null)));
                this.f142325a.y();
                C16648k.d(d0.a(this.f142325a), null, null, new C2260b(this.f142325a, null), 3, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ClaimReward claimReward, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f142315h = claimReward;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = z.this.new b(this.f142315h, continuation);
            bVar.f142313f = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x018c  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x01dd  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x01e7  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 534
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ko.z.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.claim.ClaimTabViewModel$enrollInAutoClaim$1", f = "ClaimTabViewModel.kt", l = {235, 279, 281}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f142327a;

        /* renamed from: b, reason: collision with root package name */
        Object f142328b;

        /* renamed from: c, reason: collision with root package name */
        Object f142329c;

        /* renamed from: d, reason: collision with root package name */
        Object f142330d;

        /* renamed from: e, reason: collision with root package name */
        Object f142331e;

        /* renamed from: f, reason: collision with root package name */
        int f142332f;

        /* renamed from: g, reason: collision with root package name */
        int f142333g;

        /* renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f142334h;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f142336j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Double f142337k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f142338l;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.mperks.ux.claim.ClaimTabViewModel$enrollInAutoClaim$1$2$2$1", f = "ClaimTabViewModel.kt", l = {267}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f142339a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z f142340b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z zVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f142340b = zVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f142340b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f142339a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17139A interfaceC17139A = this.f142340b._event;
                    AbstractC15202c.a aVar = AbstractC15202c.a.f142201a;
                    this.f142339a = 1;
                    if (interfaceC17139A.emit(aVar, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"kotlin/concurrent/TimersKt$timerTask$1", "Ljava/util/TimerTask;", "", "run", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class b extends TimerTask {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ z f142341a;

            public b(z zVar) {
                this.f142341a = zVar;
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                Object value;
                C16648k.d(d0.a(this.f142341a), null, null, new a(this.f142341a, null), 3, null);
                InterfaceC17140B interfaceC17140B = this.f142341a._viewState;
                do {
                    value = interfaceC17140B.getValue();
                } while (!interfaceC17140B.e(value, ClaimTabState.b((ClaimTabState) value, false, false, false, null, null, false, null, false, true, false, 767, null)));
                this.f142341a.x();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z10, Double d10, String str, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f142336j = z10;
            this.f142337k = d10;
            this.f142338l = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = z.this.new c(this.f142336j, this.f142337k, this.f142338l, continuation);
            cVar.f142334h = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:62:0x027a, code lost:
        
            if (r3.emit(r9, r42) == r2) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x027d, code lost:
        
            r3 = r4;
            r2 = r6;
            r0 = r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x02a2, code lost:
        
            if (r3.emit(r9, r42) == r2) goto L67;
         */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0123  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x023e  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x02cb  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r43) {
            /*
                Method dump skipped, instructions count: 800
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ko.z.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.claim.ClaimTabViewModel$fetchAutoClaimGetAccountInfo$1", f = "ClaimTabViewModel.kt", l = {308, 317}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f142342a;

        /* renamed from: b, reason: collision with root package name */
        Object f142343b;

        /* renamed from: c, reason: collision with root package name */
        Object f142344c;

        /* renamed from: d, reason: collision with root package name */
        int f142345d;

        /* renamed from: e, reason: collision with root package name */
        int f142346e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f142347f;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = z.this.new d(continuation);
            dVar.f142347f = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00fb  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 255
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ko.z.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.claim.ClaimTabViewModel$fetchAvailableRewardCoupons$1", f = "ClaimTabViewModel.kt", l = {166}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f142349a;

        /* renamed from: b, reason: collision with root package name */
        int f142350b;

        /* renamed from: c, reason: collision with root package name */
        int f142351c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f142352d;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = z.this.new e(continuation);
            eVar.f142352d = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v12, types: [qv.O] */
        /* JADX WARN: Type inference failed for: r2v15 */
        /* JADX WARN: Type inference failed for: r2v16 */
        /* JADX WARN: Type inference failed for: r2v2, types: [qv.O] */
        /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, qv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            ?? r22;
            Object value;
            Object value2;
            Object value3;
            Object value4;
            Object objI;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f142351c;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    ?? r23 = (InterfaceC16622O) this.f142352d;
                    z zVar = z.this;
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC17140B interfaceC17140B = zVar._viewState;
                    do {
                        value4 = interfaceC17140B.getValue();
                    } while (!interfaceC17140B.e(value4, ClaimTabState.b((ClaimTabState) value4, true, false, false, null, null, false, null, false, false, false, 1018, null)));
                    C13719g c13719g = zVar.rewardsRepository;
                    this.f142352d = r23;
                    this.f142349a = r23;
                    this.f142350b = 0;
                    this.f142351c = 1;
                    objI = c13719g.i(this);
                    i10 = r23;
                    if (objI == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ?? r24 = (InterfaceC16622O) this.f142352d;
                    ResultKt.b(obj);
                    objI = obj;
                    i10 = r24;
                }
                objB = Result.b((MperksAvailableRewardCouponsResponse) objI);
                r22 = i10;
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
                r22 = i10;
            }
            z zVar2 = z.this;
            if (Result.h(objB)) {
                MperksAvailableRewardCouponsResponse mperksAvailableRewardCouponsResponse = (MperksAvailableRewardCouponsResponse) objB;
                if (mperksAvailableRewardCouponsResponse.getAvailableRewardCoupons().isEmpty()) {
                    uw.a.INSTANCE.x("mPerks_available_reward_coupons_response").q("No reward coupons found", new Object[0]);
                    InterfaceC17140B interfaceC17140B2 = zVar2._viewState;
                    do {
                        value2 = interfaceC17140B2.getValue();
                    } while (!interfaceC17140B2.e(value2, ClaimTabState.b((ClaimTabState) value2, false, false, false, null, null, false, null, false, false, false, 510, null)));
                } else {
                    List<AvailableRewardCoupon> availableRewardCoupons = mperksAvailableRewardCouponsResponse.getAvailableRewardCoupons();
                    ArrayList arrayList = new ArrayList(CollectionsKt.x(availableRewardCoupons, 10));
                    Iterator it = availableRewardCoupons.iterator();
                    while (it.hasNext()) {
                        arrayList.add(C14749d.b((AvailableRewardCoupon) it.next()));
                    }
                    InterfaceC17140B interfaceC17140B3 = zVar2._viewState;
                    do {
                        value3 = interfaceC17140B3.getValue();
                    } while (!interfaceC17140B3.e(value3, ClaimTabState.b((ClaimTabState) value3, false, false, false, arrayList, null, false, null, false, false, false, 118, null)));
                    uw.a.INSTANCE.x("mPerks_available_reward_coupons_response").q("Available Reward Coupons: " + mperksAvailableRewardCouponsResponse, new Object[0]);
                }
            }
            z zVar3 = z.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                E0.i(r22.getCoroutineContext());
                if (thE instanceof Error) {
                    throw thE;
                }
                uw.a.INSTANCE.f(thE, "Failed to load Mperks Get available reward coupons.", new Object[0]);
                InterfaceC17140B interfaceC17140B4 = zVar3._viewState;
                do {
                    value = interfaceC17140B4.getValue();
                } while (!interfaceC17140B4.e(value, ClaimTabState.b((ClaimTabState) value, false, false, true, null, null, false, null, false, false, false, 1018, null)));
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.claim.ClaimTabViewModel$getAutoClaimOptions$1", f = "ClaimTabViewModel.kt", l = {333}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f142354a;

        /* renamed from: b, reason: collision with root package name */
        int f142355b;

        /* renamed from: c, reason: collision with root package name */
        int f142356c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f142357d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f142359f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Double f142360g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, Double d10, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f142359f = str;
            this.f142360g = d10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            f fVar = z.this.new f(this.f142359f, this.f142360g, continuation);
            fVar.f142357d = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v10, types: [qv.O] */
        /* JADX WARN: Type inference failed for: r2v13 */
        /* JADX WARN: Type inference failed for: r2v14 */
        /* JADX WARN: Type inference failed for: r2v2, types: [qv.O] */
        /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, qv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            ?? r22;
            Object value;
            Object value2;
            Object objH;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f142356c;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    ?? r23 = (InterfaceC16622O) this.f142357d;
                    z zVar = z.this;
                    String str = this.f142359f;
                    Double d10 = this.f142360g;
                    Result.Companion companion = Result.INSTANCE;
                    C13719g c13719g = zVar.rewardsRepository;
                    this.f142357d = r23;
                    this.f142354a = r23;
                    this.f142355b = 0;
                    this.f142356c = 1;
                    objH = c13719g.h(str, d10, this);
                    i10 = r23;
                    if (objH == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ?? r24 = (InterfaceC16622O) this.f142357d;
                    ResultKt.b(obj);
                    objH = obj;
                    i10 = r24;
                }
                objB = Result.b((List) objH);
                r22 = i10;
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
                r22 = i10;
            }
            String str2 = this.f142359f;
            Double d11 = this.f142360g;
            z zVar2 = z.this;
            if (Result.h(objB)) {
                List list = (List) objB;
                a.Companion companion3 = uw.a.INSTANCE;
                companion3.x("Successfully called getAvailableAutoClaimOptions with type: " + str2 + " and amount: " + d11);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Successful getAvailableAutoClaimOptions list:: ");
                sb2.append(list);
                companion3.x(sb2.toString());
                if (!list.isEmpty()) {
                    InterfaceC17140B interfaceC17140B = zVar2._viewState;
                    do {
                        value2 = interfaceC17140B.getValue();
                    } while (!interfaceC17140B.e(value2, ClaimTabState.b((ClaimTabState) value2, false, false, false, null, list, false, null, false, false, false, 717, null)));
                }
            }
            z zVar3 = z.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                InterfaceC17140B interfaceC17140B2 = zVar3._viewState;
                do {
                    value = interfaceC17140B2.getValue();
                } while (!interfaceC17140B2.e(value, ClaimTabState.b((ClaimTabState) value, false, false, false, null, null, true, null, false, false, false, 733, null)));
                C16623P.h(r22);
                uw.a.INSTANCE.f(thE, "Error calling getAvailableAutoClaimOptions", new Object[0]);
                if (thE instanceof Error) {
                    throw thE;
                }
            }
            return Unit.f142422a;
        }
    }

    public z(C13719g rewardsRepository, InterfaceC14261a analyticsEngine) {
        Intrinsics.j(rewardsRepository, "rewardsRepository");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        this.rewardsRepository = rewardsRepository;
        this.analyticsEngine = analyticsEngine;
        InterfaceC17140B<ClaimTabState> interfaceC17140BA = S.a(new ClaimTabState(false, false, false, null, null, false, null, false, false, false, 1023, null));
        this._viewState = interfaceC17140BA;
        this.viewState = C17154h.c(interfaceC17140BA);
        InterfaceC17139A<AbstractC15202c> interfaceC17139AB = C17146H.b(0, 0, null, 7, null);
        this._event = interfaceC17139AB;
        this.eventFlow = C17154h.b(interfaceC17139AB);
        y();
        I();
        x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(AbstractC15200a abstractC15200a, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("mPerks 4.0");
        track.o("mPerks: Claim");
        AbstractC15200a.TrackClaimTabSelected trackClaimTabSelected = (AbstractC15200a.TrackClaimTabSelected) abstractC15200a;
        List<String> listA = trackClaimTabSelected.a();
        track.h("redeemableRewards", listA != null ? CollectionsKt.B0(listA, ", ", null, null, 0, null, null, 62, null) : null);
        track.h("previousTrackAction", trackClaimTabSelected.getPreviousTrackAction());
        track.h("mperksPoints", String.valueOf(trackClaimTabSelected.getMperksPoints()));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(AbstractC15200a abstractC15200a, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("mPerks 4.0");
        track.o("mPerks: Claim");
        AbstractC15200a.TrackClaimRewardCardClicked trackClaimRewardCardClicked = (AbstractC15200a.TrackClaimRewardCardClicked) abstractC15200a;
        track.h("rewardID", trackClaimRewardCardClicked.getRewardId());
        track.h("rewardValidThrough", trackClaimRewardCardClicked.getRewardValidThrough());
        track.h("daysLeftToRedeem", trackClaimRewardCardClicked.getDaysLeftToRedeem());
        track.h("rewardStatus", trackClaimRewardCardClicked.getRewardStatus());
        track.h("mperksPoints", String.valueOf(trackClaimRewardCardClicked.getMperksPoints()));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(AbstractC15200a abstractC15200a, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("mPerks 4.0");
        AbstractC15200a.TrackRewardClaimedAction trackRewardClaimedAction = (AbstractC15200a.TrackRewardClaimedAction) abstractC15200a;
        track.o(Intrinsics.e(trackRewardClaimedAction.getRewardLocation(), "Cart Page:Claim rewards modal") ? "cart" : "mPerks: Claim");
        String rewardId = trackRewardClaimedAction.getRewardId();
        if (rewardId != null) {
            track.h("rewardID", rewardId);
        }
        track.h("rewardValidThrough", trackRewardClaimedAction.getRewardValidThrough());
        track.h("daysLeftToRedeem", trackRewardClaimedAction.getDaysLeftToRedeem());
        track.h("rewardLocation", trackRewardClaimedAction.getRewardLocation());
        track.h("pointsUsed", String.valueOf(trackRewardClaimedAction.getPointsUsed()));
        track.h("mperksPoints", String.valueOf(trackRewardClaimedAction.getMperksPoints()));
        return Unit.f142422a;
    }

    private final void I() {
        ClaimTabState value;
        InterfaceC17140B<ClaimTabState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, ClaimTabState.b(value, false, true, false, null, null, false, null, false, false, false, 1021, null)));
    }

    private final void J(boolean shouldShow, AutoClaimReward autoClaimReward) {
        ClaimTabState value;
        ClaimTabState claimTabState;
        ArrayList arrayList;
        InterfaceC17140B<ClaimTabState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
            claimTabState = value;
            List<AutoClaimReward> listC = claimTabState.c();
            arrayList = new ArrayList(CollectionsKt.x(listC, 10));
            for (AutoClaimReward autoClaimRewardB : listC) {
                if (Intrinsics.e(autoClaimRewardB, autoClaimReward)) {
                    autoClaimRewardB = AutoClaimReward.b(autoClaimRewardB, 0.0d, null, null, null, null, null, false, false, false, shouldShow, 511, null);
                }
                arrayList.add(autoClaimRewardB);
            }
        } while (!interfaceC17140B.e(value, ClaimTabState.b(claimTabState, false, false, false, null, arrayList, false, null, false, false, false, 1007, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(String str, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("mPerks 4.0");
        track.o("cart");
        track.h("rewardID", str);
        return Unit.f142422a;
    }

    public final InterfaceC17144F<AbstractC15202c> B() {
        return this.eventFlow;
    }

    public final P<ClaimTabState> C() {
        return this.viewState;
    }

    public final void D() {
        ClaimTabState value;
        ClaimTabState claimTabState;
        ArrayList arrayList;
        InterfaceC17140B<ClaimTabState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
            claimTabState = value;
            List<AutoClaimReward> listC = claimTabState.c();
            arrayList = new ArrayList(CollectionsKt.x(listC, 10));
            Iterator<T> it = listC.iterator();
            while (it.hasNext()) {
                arrayList.add(AutoClaimReward.b((AutoClaimReward) it.next(), 0.0d, null, null, null, null, null, false, false, false, false, 511, null));
            }
        } while (!interfaceC17140B.e(value, ClaimTabState.b(claimTabState, false, false, false, null, arrayList, false, null, false, false, false, 1007, null)));
    }

    public final void E(final AbstractC15200a action) {
        Intrinsics.j(action, "action");
        if (action instanceof AbstractC15200a.BuyReward) {
            v(((AbstractC15200a.BuyReward) action).getClaimReward());
            return;
        }
        if (action instanceof AbstractC15200a.c) {
            y();
            return;
        }
        if (action instanceof AbstractC15200a.AutoClaimAction) {
            AbstractC15200a.AutoClaimAction autoClaimAction = (AbstractC15200a.AutoClaimAction) action;
            w(autoClaimAction.getEnroll(), autoClaimAction.getAutoClaimType(), autoClaimAction.getAutoClaimAmount());
            return;
        }
        if (action instanceof AbstractC15200a.TrackClaimTabSelected) {
            this.analyticsEngine.h(C14476c.h("mPerks:Claim Page"), new Function1() { // from class: ko.w
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return z.F(action, (TrackingData) obj);
                }
            });
            return;
        }
        if (action instanceof AbstractC15200a.TrackClaimRewardCardClicked) {
            this.analyticsEngine.h(C14476c.h("mPerks:Reward Details Page"), new Function1() { // from class: ko.x
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return z.G(action, (TrackingData) obj);
                }
            });
            return;
        }
        if (action instanceof AbstractC15200a.TrackRewardClaimedAction) {
            this.analyticsEngine.h(C14476c.a("mPerks:Reward Claimed"), new Function1() { // from class: ko.y
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return z.H(action, (TrackingData) obj);
                }
            });
        } else {
            if (!(action instanceof AbstractC15200a.ShowSwitchingButtonsAction)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC15200a.ShowSwitchingButtonsAction showSwitchingButtonsAction = (AbstractC15200a.ShowSwitchingButtonsAction) action;
            J(showSwitchingButtonsAction.getIsShowSwitchingButtons(), showSwitchingButtonsAction.getAutoClaimReward());
        }
    }

    public final void K(String rewardAction, final String rewardId) {
        Intrinsics.j(rewardAction, "rewardAction");
        Intrinsics.j(rewardId, "rewardId");
        this.analyticsEngine.h(C14476c.a(rewardAction), new Function1() { // from class: ko.v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z.L(rewardId, (TrackingData) obj);
            }
        });
    }

    public final void v(ClaimReward coupon) {
        Intrinsics.j(coupon, "coupon");
        C16648k.d(d0.a(this), null, null, new b(coupon, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(String autoClaimType, Double autoClaimAmount) {
        C16648k.d(d0.a(this), null, null, new f(autoClaimType, autoClaimAmount, null), 3, null);
    }

    private final void w(boolean enroll, String autoClaimType, Double autoClaimAmount) {
        C16648k.d(d0.a(this), null, null, new c(enroll, autoClaimAmount, autoClaimType, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y() {
        C16648k.d(d0.a(this), null, null, new e(null), 3, null);
    }

    public final void x() {
        C16648k.d(d0.a(this), null, null, new d(null), 3, null);
    }
}
