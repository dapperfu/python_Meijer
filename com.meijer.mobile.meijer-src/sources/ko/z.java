package ko;

import androidx.view.c0;
import androidx.view.d0;
import co.AbstractC6530b;
import co.AutoClaimReward;
import co.ClaimReward;
import com.meijer.mobile.mperks.networking.domain.models.AvailableRewardCoupon;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import hi.InterfaceC14523a;
import ii.C14756c;
import ii.TrackingData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimerTask;
import jo.C15056a;
import ko.AbstractC15303a;
import ko.AbstractC15305c;
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
import mv.C15784P;
import mv.C15809k;
import mv.E0;
import mv.InterfaceC15783O;
import pv.C16555H;
import pv.C16563h;
import pv.InterfaceC16548A;
import pv.InterfaceC16549B;
import pv.InterfaceC16553F;
import pv.P;
import pv.S;
import qw.a;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 D2\u00020\u0001:\u0001*B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ+\u0010\u0012\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001f\u0010\nJ\u000f\u0010 \u001a\u00020\bH\u0000¢\u0006\u0004\b \u0010\nJ\u001d\u0010$\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020/0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001d\u00108\u001a\b\u0012\u0004\u0012\u00020/038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020:098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020:0>8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B¨\u0006E"}, d2 = {"Lko/z;", "Landroidx/lifecycle/c0;", "Lfo/e;", "rewardsRepository", "Lhi/a;", "analyticsEngine", "<init>", "(Lfo/e;Lhi/a;)V", "", "y", "()V", "I", "", "enroll", "Lco/b;", "autoClaimType", "", "autoClaimAmount", "w", "(ZLco/b;Ljava/lang/Double;)V", "A", "(Lco/b;Ljava/lang/Double;)V", "shouldShow", "Lco/a;", "autoClaimReward", "J", "(ZLco/a;)V", "Lco/c;", "coupon", "v", "(Lco/c;)V", "x", "D", "", "rewardAction", "rewardId", "K", "(Ljava/lang/String;Ljava/lang/String;)V", "Lko/a;", "action", "E", "(Lko/a;)V", "a", "Lfo/e;", "b", "Lhi/a;", "Lpv/B;", "Lko/d;", "c", "Lpv/B;", "_viewState", "Lpv/P;", "d", "Lpv/P;", "C", "()Lpv/P;", "viewState", "Lpv/A;", "Lko/c;", "e", "Lpv/A;", "_event", "Lpv/F;", "f", "Lpv/F;", "B", "()Lpv/F;", "eventFlow", "g", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class z extends c0 {

    /* renamed from: h, reason: collision with root package name */
    public static final int f143210h = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private fo.e rewardsRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ClaimTabState> _viewState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final P<ClaimTabState> viewState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<AbstractC15305c> _event;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16553F<AbstractC15305c> eventFlow;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.claim.ClaimTabViewModel$buyCoupon$1", f = "ClaimTabViewModel.kt", l = {78, 115}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f143217a;

        /* renamed from: b, reason: collision with root package name */
        Object f143218b;

        /* renamed from: c, reason: collision with root package name */
        Object f143219c;

        /* renamed from: d, reason: collision with root package name */
        int f143220d;

        /* renamed from: e, reason: collision with root package name */
        int f143221e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f143222f;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ClaimReward f143224h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.mperks.ux.claim.ClaimTabViewModel$buyCoupon$1$2$2$1", f = "ClaimTabViewModel.kt", l = {94}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f143225a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z f143226b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ClaimReward f143227c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z zVar, ClaimReward claimReward, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f143226b = zVar;
                this.f143227c = claimReward;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f143226b, this.f143227c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f143225a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16548A interfaceC16548A = this.f143226b._event;
                    AbstractC15305c.ShowClaimSuccessToast showClaimSuccessToast = new AbstractC15305c.ShowClaimSuccessToast(this.f143227c);
                    this.f143225a = 1;
                    if (interfaceC16548A.emit(showClaimSuccessToast, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.mperks.ux.claim.ClaimTabViewModel$buyCoupon$1$2$2$3", f = "ClaimTabViewModel.kt", l = {107}, m = "invokeSuspend")
        /* renamed from: ko.z$b$b, reason: collision with other inner class name */
        static final class C2269b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f143228a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z f143229b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2269b(z zVar, Continuation<? super C2269b> continuation) {
                super(2, continuation);
                this.f143229b = zVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2269b(this.f143229b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((C2269b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f143228a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16548A interfaceC16548A = this.f143229b._event;
                    AbstractC15305c.a aVar = AbstractC15305c.a.f143110a;
                    this.f143228a = 1;
                    if (interfaceC16548A.emit(aVar, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.mperks.ux.claim.ClaimTabViewModel$buyCoupon$1$2$3", f = "ClaimTabViewModel.kt", l = {112}, m = "invokeSuspend")
        static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f143230a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z f143231b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(z zVar, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f143231b = zVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new c(this.f143231b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f143230a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16548A interfaceC16548A = this.f143231b._event;
                    AbstractC15305c.b bVar = AbstractC15305c.b.f143111a;
                    this.f143230a = 1;
                    if (interfaceC16548A.emit(bVar, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"kotlin/concurrent/TimersKt$timerTask$1", "Ljava/util/TimerTask;", "", "run", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class d extends TimerTask {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ z f143232a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ClaimReward f143233b;

            public d(z zVar, ClaimReward claimReward) {
                this.f143232a = zVar;
                this.f143233b = claimReward;
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                Object value;
                C15809k.d(d0.a(this.f143232a), null, null, new a(this.f143232a, this.f143233b, null), 3, null);
                InterfaceC16549B interfaceC16549B = this.f143232a._viewState;
                do {
                    value = interfaceC16549B.getValue();
                } while (!interfaceC16549B.e(value, ClaimTabState.b((ClaimTabState) value, false, false, false, null, null, false, null, false, false, true, 511, null)));
                this.f143232a.y();
                C15809k.d(d0.a(this.f143232a), null, null, new C2269b(this.f143232a, null), 3, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ClaimReward claimReward, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f143224h = claimReward;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = z.this.new b(this.f143224h, continuation);
            bVar.f143222f = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0124  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0175  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x017f  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 430
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ko.z.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.claim.ClaimTabViewModel$enrollInAutoClaim$1", f = "ClaimTabViewModel.kt", l = {218, 263, 265}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f143234a;

        /* renamed from: b, reason: collision with root package name */
        Object f143235b;

        /* renamed from: c, reason: collision with root package name */
        Object f143236c;

        /* renamed from: d, reason: collision with root package name */
        Object f143237d;

        /* renamed from: e, reason: collision with root package name */
        Object f143238e;

        /* renamed from: f, reason: collision with root package name */
        int f143239f;

        /* renamed from: g, reason: collision with root package name */
        int f143240g;

        /* renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f143241h;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f143243j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Double f143244k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ AbstractC6530b f143245l;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.mperks.ux.claim.ClaimTabViewModel$enrollInAutoClaim$1$2$2$1", f = "ClaimTabViewModel.kt", l = {251}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f143246a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z f143247b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z zVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f143247b = zVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f143247b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f143246a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16548A interfaceC16548A = this.f143247b._event;
                    AbstractC15305c.a aVar = AbstractC15305c.a.f143110a;
                    this.f143246a = 1;
                    if (interfaceC16548A.emit(aVar, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"kotlin/concurrent/TimersKt$timerTask$1", "Ljava/util/TimerTask;", "", "run", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class b extends TimerTask {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ z f143248a;

            public b(z zVar) {
                this.f143248a = zVar;
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                Object value;
                C15809k.d(d0.a(this.f143248a), null, null, new a(this.f143248a, null), 3, null);
                InterfaceC16549B interfaceC16549B = this.f143248a._viewState;
                do {
                    value = interfaceC16549B.getValue();
                } while (!interfaceC16549B.e(value, ClaimTabState.b((ClaimTabState) value, false, false, false, null, null, false, null, false, true, false, 767, null)));
                this.f143248a.x();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z10, Double d10, AbstractC6530b abstractC6530b, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f143243j = z10;
            this.f143244k = d10;
            this.f143245l = abstractC6530b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = z.this.new c(this.f143243j, this.f143244k, this.f143245l, continuation);
            cVar.f143241h = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:69:0x027d, code lost:
        
            if (r3.emit(r9, r42) == r2) goto L74;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x0280, code lost:
        
            r3 = r4;
            r2 = r6;
            r0 = r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x02a5, code lost:
        
            if (r3.emit(r9, r42) == r2) goto L74;
         */
        /* JADX WARN: Removed duplicated region for block: B:45:0x012b  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x01c1  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0241  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x02ce  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r43) {
            /*
                Method dump skipped, instructions count: 815
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ko.z.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.claim.ClaimTabViewModel$fetchAutoClaimGetAccountInfo$1", f = "ClaimTabViewModel.kt", l = {292, HttpResponseStatus.REDIRECTION_FOUND}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f143249a;

        /* renamed from: b, reason: collision with root package name */
        Object f143250b;

        /* renamed from: c, reason: collision with root package name */
        Object f143251c;

        /* renamed from: d, reason: collision with root package name */
        int f143252d;

        /* renamed from: e, reason: collision with root package name */
        int f143253e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f143254f;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = z.this.new d(continuation);
            dVar.f143254f = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00fc  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 256
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ko.z.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.claim.ClaimTabViewModel$fetchAvailableRewardCoupons$1", f = "ClaimTabViewModel.kt", l = {BinsView.TOTE_WIDTH_DP}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f143256a;

        /* renamed from: b, reason: collision with root package name */
        int f143257b;

        /* renamed from: c, reason: collision with root package name */
        int f143258c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f143259d;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = z.this.new e(continuation);
            eVar.f143259d = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v12, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r2v15 */
        /* JADX WARN: Type inference failed for: r2v16 */
        /* JADX WARN: Type inference failed for: r2v2, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, mv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            ?? r22;
            Object value;
            Object value2;
            Object value3;
            ClaimTabState claimTabState;
            ArrayList arrayList;
            Object value4;
            Object objG;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f143258c;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    ?? r23 = (InterfaceC15783O) this.f143259d;
                    z zVar = z.this;
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC16549B interfaceC16549B = zVar._viewState;
                    do {
                        value4 = interfaceC16549B.getValue();
                    } while (!interfaceC16549B.e(value4, ClaimTabState.b((ClaimTabState) value4, true, false, false, null, null, false, null, false, false, false, 1018, null)));
                    fo.e eVar = zVar.rewardsRepository;
                    this.f143259d = r23;
                    this.f143256a = r23;
                    this.f143257b = 0;
                    this.f143258c = 1;
                    objG = eVar.g(this);
                    i10 = r23;
                    if (objG == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ?? r24 = (InterfaceC15783O) this.f143259d;
                    ResultKt.b(obj);
                    objG = obj;
                    i10 = r24;
                }
                objB = Result.b((List) objG);
                r22 = i10;
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
                r22 = i10;
            }
            z zVar2 = z.this;
            if (Result.h(objB)) {
                List list = (List) objB;
                if (list.isEmpty()) {
                    qw.a.INSTANCE.z("mperks_available_reward").q("No reward coupons found", new Object[0]);
                    InterfaceC16549B interfaceC16549B2 = zVar2._viewState;
                    do {
                        value2 = interfaceC16549B2.getValue();
                    } while (!interfaceC16549B2.e(value2, ClaimTabState.b((ClaimTabState) value2, false, false, false, null, null, false, null, false, false, false, 510, null)));
                } else {
                    InterfaceC16549B interfaceC16549B3 = zVar2._viewState;
                    do {
                        value3 = interfaceC16549B3.getValue();
                        claimTabState = (ClaimTabState) value3;
                        List list2 = list;
                        arrayList = new ArrayList(CollectionsKt.x(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(C15056a.b((AvailableRewardCoupon) it.next()));
                        }
                    } while (!interfaceC16549B3.e(value3, ClaimTabState.b(claimTabState, false, false, false, arrayList, null, false, null, false, false, false, 118, null)));
                    qw.a.INSTANCE.z("mperks_available_reward").q("Available Reward Coupons: " + list, new Object[0]);
                }
            }
            z zVar3 = z.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                E0.i(r22.getCoroutineContext());
                if (thE instanceof Error) {
                    throw thE;
                }
                qw.a.INSTANCE.f(thE, "Failed to load Mperks Get available reward coupons.", new Object[0]);
                InterfaceC16549B interfaceC16549B4 = zVar3._viewState;
                do {
                    value = interfaceC16549B4.getValue();
                } while (!interfaceC16549B4.e(value, ClaimTabState.b((ClaimTabState) value, false, false, true, null, null, false, null, false, false, false, 1018, null)));
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.claim.ClaimTabViewModel$getAutoClaimOptions$1", f = "ClaimTabViewModel.kt", l = {321}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f143261a;

        /* renamed from: b, reason: collision with root package name */
        int f143262b;

        /* renamed from: c, reason: collision with root package name */
        int f143263c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f143264d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AbstractC6530b f143266f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Double f143267g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(AbstractC6530b abstractC6530b, Double d10, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f143266f = abstractC6530b;
            this.f143267g = d10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            f fVar = z.this.new f(this.f143266f, this.f143267g, continuation);
            fVar.f143264d = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v10, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r2v13 */
        /* JADX WARN: Type inference failed for: r2v14 */
        /* JADX WARN: Type inference failed for: r2v2, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, mv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            ?? r22;
            Object value;
            Object value2;
            Object objF;
            Object objF2 = IntrinsicsKt.f();
            int i10 = this.f143263c;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    ?? r23 = (InterfaceC15783O) this.f143264d;
                    z zVar = z.this;
                    AbstractC6530b abstractC6530b = this.f143266f;
                    Double d10 = this.f143267g;
                    Result.Companion companion = Result.INSTANCE;
                    fo.e eVar = zVar.rewardsRepository;
                    this.f143264d = r23;
                    this.f143261a = r23;
                    this.f143262b = 0;
                    this.f143263c = 1;
                    objF = eVar.f(abstractC6530b, d10, this);
                    i10 = r23;
                    if (objF == objF2) {
                        return objF2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ?? r24 = (InterfaceC15783O) this.f143264d;
                    ResultKt.b(obj);
                    objF = obj;
                    i10 = r24;
                }
                objB = Result.b((List) objF);
                r22 = i10;
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
                r22 = i10;
            }
            AbstractC6530b abstractC6530b2 = this.f143266f;
            Double d11 = this.f143267g;
            z zVar2 = z.this;
            if (Result.h(objB)) {
                List list = (List) objB;
                a.Companion companion3 = qw.a.INSTANCE;
                companion3.z("mperks_auto_claim_list").q("Successful with type: " + abstractC6530b2 + " and amount: " + d11, new Object[0]);
                a.b bVarZ = companion3.z("mperks_auto_claim_list");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Successful with Auto Claim Reward list: ");
                sb2.append(list);
                bVarZ.q(sb2.toString(), new Object[0]);
                if (!list.isEmpty()) {
                    InterfaceC16549B interfaceC16549B = zVar2._viewState;
                    do {
                        value2 = interfaceC16549B.getValue();
                    } while (!interfaceC16549B.e(value2, ClaimTabState.b((ClaimTabState) value2, false, false, false, null, list, false, null, false, false, false, 717, null)));
                }
            }
            z zVar3 = z.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                InterfaceC16549B interfaceC16549B2 = zVar3._viewState;
                do {
                    value = interfaceC16549B2.getValue();
                } while (!interfaceC16549B2.e(value, ClaimTabState.b((ClaimTabState) value, false, false, false, null, null, true, null, false, false, false, 733, null)));
                C15784P.h(r22);
                qw.a.INSTANCE.f(thE, "Error calling getAvailableAutoClaimOptions", new Object[0]);
                if (thE instanceof Error) {
                    throw thE;
                }
            }
            return Unit.f143329a;
        }
    }

    public z(fo.e rewardsRepository, InterfaceC14523a analyticsEngine) {
        Intrinsics.j(rewardsRepository, "rewardsRepository");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        this.rewardsRepository = rewardsRepository;
        this.analyticsEngine = analyticsEngine;
        InterfaceC16549B<ClaimTabState> interfaceC16549BA = S.a(new ClaimTabState(false, false, false, null, null, false, null, false, false, false, 1023, null));
        this._viewState = interfaceC16549BA;
        this.viewState = C16563h.c(interfaceC16549BA);
        InterfaceC16548A<AbstractC15305c> interfaceC16548AB = C16555H.b(0, 0, null, 7, null);
        this._event = interfaceC16548AB;
        this.eventFlow = C16563h.b(interfaceC16548AB);
        y();
        I();
        x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(AbstractC15303a abstractC15303a, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("mPerks 4.0");
        track.o("mPerks: Claim");
        AbstractC15303a.TrackClaimTabSelected trackClaimTabSelected = (AbstractC15303a.TrackClaimTabSelected) abstractC15303a;
        List<String> listA = trackClaimTabSelected.a();
        track.h("redeemableRewards", listA != null ? CollectionsKt.B0(listA, ", ", null, null, 0, null, null, 62, null) : null);
        track.h("previousTrackAction", trackClaimTabSelected.getPreviousTrackAction());
        track.h("mperksPoints", String.valueOf(trackClaimTabSelected.getMperksPoints()));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(AbstractC15303a abstractC15303a, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("mPerks 4.0");
        track.o("mPerks: Claim");
        AbstractC15303a.TrackClaimRewardCardClicked trackClaimRewardCardClicked = (AbstractC15303a.TrackClaimRewardCardClicked) abstractC15303a;
        track.h("rewardID", trackClaimRewardCardClicked.getRewardId());
        track.h("rewardValidThrough", trackClaimRewardCardClicked.getRewardValidThrough());
        track.h("daysLeftToRedeem", trackClaimRewardCardClicked.getDaysLeftToRedeem());
        track.h("rewardStatus", trackClaimRewardCardClicked.getRewardStatus());
        track.h("mperksPoints", String.valueOf(trackClaimRewardCardClicked.getMperksPoints()));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(AbstractC15303a abstractC15303a, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("mPerks 4.0");
        AbstractC15303a.TrackRewardClaimedAction trackRewardClaimedAction = (AbstractC15303a.TrackRewardClaimedAction) abstractC15303a;
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
        return Unit.f143329a;
    }

    private final void I() {
        ClaimTabState value;
        InterfaceC16549B<ClaimTabState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ClaimTabState.b(value, false, true, false, null, null, false, null, false, false, false, 1021, null)));
    }

    private final void J(boolean shouldShow, AutoClaimReward autoClaimReward) {
        ClaimTabState value;
        ClaimTabState claimTabState;
        ArrayList arrayList;
        InterfaceC16549B<ClaimTabState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            claimTabState = value;
            List<AutoClaimReward> listC = claimTabState.c();
            arrayList = new ArrayList(CollectionsKt.x(listC, 10));
            for (AutoClaimReward autoClaimRewardB : listC) {
                if (Intrinsics.e(autoClaimRewardB, autoClaimReward)) {
                    autoClaimRewardB = AutoClaimReward.b(autoClaimRewardB, 0.0d, null, null, null, null, null, false, false, false, shouldShow, 511, null);
                }
                arrayList.add(autoClaimRewardB);
            }
        } while (!interfaceC16549B.e(value, ClaimTabState.b(claimTabState, false, false, false, null, arrayList, false, null, false, false, false, 1007, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(String str, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("mPerks 4.0");
        track.o("cart");
        track.h("rewardID", str);
        return Unit.f143329a;
    }

    public final InterfaceC16553F<AbstractC15305c> B() {
        return this.eventFlow;
    }

    public final P<ClaimTabState> C() {
        return this.viewState;
    }

    public final void D() {
        ClaimTabState value;
        ClaimTabState claimTabState;
        ArrayList arrayList;
        InterfaceC16549B<ClaimTabState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            claimTabState = value;
            List<AutoClaimReward> listC = claimTabState.c();
            arrayList = new ArrayList(CollectionsKt.x(listC, 10));
            Iterator<T> it = listC.iterator();
            while (it.hasNext()) {
                arrayList.add(AutoClaimReward.b((AutoClaimReward) it.next(), 0.0d, null, null, null, null, null, false, false, false, false, 511, null));
            }
        } while (!interfaceC16549B.e(value, ClaimTabState.b(claimTabState, false, false, false, null, arrayList, false, null, false, false, false, 1007, null)));
    }

    public final void E(final AbstractC15303a action) {
        Intrinsics.j(action, "action");
        if (action instanceof AbstractC15303a.BuyReward) {
            v(((AbstractC15303a.BuyReward) action).getClaimReward());
            return;
        }
        if (action instanceof AbstractC15303a.c) {
            y();
            return;
        }
        if (action instanceof AbstractC15303a.AutoClaimAction) {
            AbstractC15303a.AutoClaimAction autoClaimAction = (AbstractC15303a.AutoClaimAction) action;
            w(autoClaimAction.getEnroll(), autoClaimAction.getAutoClaimType(), autoClaimAction.getAutoClaimAmount());
            return;
        }
        if (action instanceof AbstractC15303a.TrackClaimTabSelected) {
            this.analyticsEngine.b(C14756c.h("mPerks:Claim Page"), new Function1() { // from class: ko.w
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return z.F(action, (TrackingData) obj);
                }
            });
            return;
        }
        if (action instanceof AbstractC15303a.TrackClaimRewardCardClicked) {
            this.analyticsEngine.b(C14756c.h("mPerks:Reward Details Page"), new Function1() { // from class: ko.x
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return z.G(action, (TrackingData) obj);
                }
            });
            return;
        }
        if (action instanceof AbstractC15303a.TrackRewardClaimedAction) {
            this.analyticsEngine.b(C14756c.a("mPerks:Reward Claimed"), new Function1() { // from class: ko.y
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return z.H(action, (TrackingData) obj);
                }
            });
        } else {
            if (!(action instanceof AbstractC15303a.ShowSwitchingButtonsAction)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC15303a.ShowSwitchingButtonsAction showSwitchingButtonsAction = (AbstractC15303a.ShowSwitchingButtonsAction) action;
            J(showSwitchingButtonsAction.getIsShowSwitchingButtons(), showSwitchingButtonsAction.getAutoClaimReward());
        }
    }

    public final void K(String rewardAction, final String rewardId) {
        Intrinsics.j(rewardAction, "rewardAction");
        Intrinsics.j(rewardId, "rewardId");
        this.analyticsEngine.b(C14756c.a(rewardAction), new Function1() { // from class: ko.v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z.L(rewardId, (TrackingData) obj);
            }
        });
    }

    public final void v(ClaimReward coupon) {
        Intrinsics.j(coupon, "coupon");
        C15809k.d(d0.a(this), null, null, new b(coupon, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(AbstractC6530b autoClaimType, Double autoClaimAmount) {
        C15809k.d(d0.a(this), null, null, new f(autoClaimType, autoClaimAmount, null), 3, null);
    }

    private final void w(boolean enroll, AbstractC6530b autoClaimType, Double autoClaimAmount) {
        C15809k.d(d0.a(this), null, null, new c(enroll, autoClaimAmount, autoClaimType, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y() {
        C15809k.d(d0.a(this), null, null, new e(null), 3, null);
    }

    public final void x() {
        C15809k.d(d0.a(this), null, null, new d(null), 3, null);
    }
}
