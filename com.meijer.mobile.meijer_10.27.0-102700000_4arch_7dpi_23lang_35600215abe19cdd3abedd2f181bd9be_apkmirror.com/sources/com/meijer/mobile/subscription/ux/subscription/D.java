package com.meijer.mobile.subscription.ux.subscription;

import Co.Image;
import Co.ProductFullDetails;
import Tq.SimpleStoreSummary;
import androidx.view.c0;
import androidx.view.d0;
import com.meijer.mobile.subscription.ux.subscription.B;
import com.meijer.mobile.subscription.ux.subscription.j;
import cr.SubscriptionDetails;
import dr.ProductInfoRequest;
import dr.SubscriptionProductRequest;
import ir.C14758a;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16648k;
import qv.InterfaceC16622O;
import tv.C17146H;
import tv.C17154h;
import tv.InterfaceC17139A;
import tv.InterfaceC17140B;
import tv.InterfaceC17144F;
import tv.P;
import tv.S;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\nH\u0000¢\u0006\u0004\b!\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020'0+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\b018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001d\u0010:\u001a\b\u0012\u0004\u0012\u00020\b058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109¨\u0006;"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscription/D;", "Landroidx/lifecycle/c0;", "Lir/a;", "subscriptionRepository", "Lcom/meijer/mobile/subscription/ux/subscription/C;", "staticConfig", "<init>", "(Lir/a;Lcom/meijer/mobile/subscription/ux/subscription/C;)V", "Lcom/meijer/mobile/subscription/ux/subscription/B;", "screen", "", "u", "(Lcom/meijer/mobile/subscription/ux/subscription/B;)V", "", "quantity", "x", "(I)V", "frequency", "w", "Lcom/meijer/mobile/subscription/ux/subscription/x;", "decorator", "A", "(Lcom/meijer/mobile/subscription/ux/subscription/x;)V", "r", "()V", "LCo/h;", "product", "B", "(LCo/h;)V", "Lcom/meijer/mobile/subscription/ux/subscription/j;", "action", "v", "(Lcom/meijer/mobile/subscription/ux/subscription/j;)V", "y", "a", "Lir/a;", "b", "Lcom/meijer/mobile/subscription/ux/subscription/C;", "Ltv/B;", "Lcom/meijer/mobile/subscription/ux/subscription/H;", "c", "Ltv/B;", "_viewState", "Ltv/P;", "d", "Ltv/P;", "t", "()Ltv/P;", "viewState", "Ltv/A;", "e", "Ltv/A;", "_screenFlow", "Ltv/F;", "f", "Ltv/F;", "s", "()Ltv/F;", "screenFlow", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class D extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C14758a subscriptionRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final SubscriptionStaticConfig staticConfig;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<SubscriptionViewState> _viewState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final P<SubscriptionViewState> viewState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17139A<B> _screenFlow;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17144F<B> screenFlow;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.subscription.ux.subscription.SubscriptionViewModel$cancelProductSubscription$2", f = "SubscriptionViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f118917a;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return D.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.f();
            if (this.f118917a == 0) {
                ResultKt.b(obj);
                InterfaceC17140B interfaceC17140B = D.this._viewState;
                do {
                    value = interfaceC17140B.getValue();
                } while (!interfaceC17140B.e(value, SubscriptionViewState.b((SubscriptionViewState) value, false, true, false, null, null, 20, null)));
                D.this.u(B.d.f118900b);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.subscription.ux.subscription.SubscriptionViewModel$navigateTo$1", f = "SubscriptionViewModel.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f118919a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ B f118921c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(B b10, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f118921c = b10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return D.this.new b(this.f118921c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f118919a == 0) {
                ResultKt.b(obj);
                D.this._screenFlow.b(this.f118921c);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.subscription.ux.subscription.SubscriptionViewModel$onAction$1", f = "SubscriptionViewModel.kt", l = {}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f118922a;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return D.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f118922a == 0) {
                ResultKt.b(obj);
                D.this.u(B.b.f118898b);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.subscription.ux.subscription.SubscriptionViewModel$onAction$2", f = "SubscriptionViewModel.kt", l = {}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f118924a;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return D.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f118924a == 0) {
                ResultKt.b(obj);
                D.this.u(B.a.f118897b);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.subscription.ux.subscription.SubscriptionViewModel$onAction$3", f = "SubscriptionViewModel.kt", l = {}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f118926a;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return D.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f118926a == 0) {
                ResultKt.b(obj);
                D.this.u(B.c.f118899b);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.subscription.ux.subscription.SubscriptionViewModel$onAction$4", f = "SubscriptionViewModel.kt", l = {}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f118928a;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return D.this.new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f118928a == 0) {
                ResultKt.b(obj);
                D.this.u(B.e.f118901b);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.subscription.ux.subscription.SubscriptionViewModel$saveSubscription$1", f = "SubscriptionViewModel.kt", l = {154}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class g extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f118930a;

        /* renamed from: b, reason: collision with root package name */
        Object f118931b;

        /* renamed from: c, reason: collision with root package name */
        Object f118932c;

        /* renamed from: d, reason: collision with root package name */
        int f118933d;

        /* renamed from: e, reason: collision with root package name */
        int f118934e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f118935f;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ SubscriptionDecorator f118937h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(SubscriptionDecorator subscriptionDecorator, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f118937h = subscriptionDecorator;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            g gVar = D.this.new g(this.f118937h, continuation);
            gVar.f118935f = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            SubscriptionViewState subscriptionViewState;
            String localizedMessage;
            Object value2;
            Object value3;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f118934e;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f118935f;
                    InterfaceC17140B interfaceC17140B = D.this._viewState;
                    do {
                        value3 = interfaceC17140B.getValue();
                    } while (!interfaceC17140B.e(value3, SubscriptionViewState.b((SubscriptionViewState) value3, true, false, false, null, null, 30, null)));
                    SubscriptionDecorator subscriptionDecoratorC = this.f118937h.c(D.this.staticConfig);
                    SubscriptionProductRequest subscriptionProductRequestA = y.a(subscriptionDecoratorC);
                    D d10 = D.this;
                    Result.Companion companion = Result.INSTANCE;
                    C14758a c14758a = d10.subscriptionRepository;
                    this.f118935f = interfaceC16622O;
                    this.f118930a = subscriptionDecoratorC;
                    this.f118931b = subscriptionProductRequestA;
                    this.f118932c = interfaceC16622O;
                    this.f118933d = 0;
                    this.f118934e = 1;
                    obj = c14758a.a(subscriptionProductRequestA, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b((SubscriptionDetails) obj);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
            }
            D d11 = D.this;
            if (Result.h(objB)) {
                InterfaceC17140B interfaceC17140B2 = d11._viewState;
                do {
                    value2 = interfaceC17140B2.getValue();
                } while (!interfaceC17140B2.e(value2, SubscriptionViewState.b((SubscriptionViewState) value2, false, true, false, null, null, 20, null)));
                d11.u(B.d.f118900b);
            }
            D d12 = D.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                InterfaceC17140B interfaceC17140B3 = d12._viewState;
                do {
                    value = interfaceC17140B3.getValue();
                    subscriptionViewState = (SubscriptionViewState) value;
                    localizedMessage = thE.getLocalizedMessage();
                    if (localizedMessage == null) {
                        localizedMessage = "Something went wrong";
                    }
                } while (!interfaceC17140B3.e(value, SubscriptionViewState.b(subscriptionViewState, false, false, false, localizedMessage, null, 20, null)));
            }
            return Unit.f142422a;
        }
    }

    public D(C14758a subscriptionRepository, SubscriptionStaticConfig staticConfig) {
        Intrinsics.j(subscriptionRepository, "subscriptionRepository");
        Intrinsics.j(staticConfig, "staticConfig");
        this.subscriptionRepository = subscriptionRepository;
        this.staticConfig = staticConfig;
        InterfaceC17140B<SubscriptionViewState> interfaceC17140BA = S.a(new SubscriptionViewState(false, false, false, null, null, 31, null));
        this._viewState = interfaceC17140BA;
        this.viewState = C17154h.c(interfaceC17140BA);
        InterfaceC17139A<B> interfaceC17139AB = C17146H.b(0, 1, null, 5, null);
        this._screenFlow = interfaceC17139AB;
        this.screenFlow = C17154h.b(interfaceC17139AB);
    }

    private final void r() {
        SubscriptionViewState value;
        InterfaceC17140B<SubscriptionViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, SubscriptionViewState.b(value, true, false, false, null, null, 30, null)));
        C16648k.d(d0.a(this), null, null, new a(null), 3, null);
    }

    private final void w(int frequency) {
        SubscriptionViewState value;
        SubscriptionViewState subscriptionViewState;
        InterfaceC17140B<SubscriptionViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
            subscriptionViewState = value;
        } while (!interfaceC17140B.e(value, SubscriptionViewState.b(subscriptionViewState, false, false, false, null, SubscriptionDecorator.b(subscriptionViewState.getSubscriptionDecorator(), null, null, null, frequency, null, null, null, null, null, null, null, null, null, null, 16375, null), 15, null)));
    }

    private final void x(int quantity) {
        SubscriptionViewState value;
        SubscriptionViewState subscriptionViewState;
        SubscriptionDecorator subscriptionDecorator;
        ProductInfoRequest productInfo;
        InterfaceC17140B<SubscriptionViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
            subscriptionViewState = value;
            subscriptionDecorator = subscriptionViewState.getSubscriptionDecorator();
            productInfo = subscriptionViewState.getSubscriptionDecorator().getProductInfo();
        } while (!interfaceC17140B.e(value, SubscriptionViewState.b(subscriptionViewState, false, false, false, null, SubscriptionDecorator.b(subscriptionDecorator, null, null, null, 0, null, null, null, null, productInfo != null ? ProductInfoRequest.b(productInfo, null, null, null, null, quantity, null, 47, null) : null, null, null, null, null, null, 16127, null), 15, null)));
    }

    public final void B(ProductFullDetails product) {
        SubscriptionViewState value;
        SubscriptionViewState subscriptionViewState;
        String code;
        String url;
        Intrinsics.j(product, "product");
        InterfaceC17140B<SubscriptionViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
            subscriptionViewState = value;
            code = product.getCode();
            Image image = (Image) CollectionsKt.v0(product.j(), 0);
            url = image != null ? image.getUrl() : null;
            if (url == null) {
                url = "";
            }
        } while (!interfaceC17140B.e(value, SubscriptionViewState.b(subscriptionViewState, false, false, false, null, SubscriptionDecorator.b(subscriptionViewState.getSubscriptionDecorator(), null, null, null, 0, null, null, null, new SimpleStoreSummary(product.getStoreId(), null, null, 0.0d, 14, null), new ProductInfoRequest(code, url, product.getName(), product.getPrice().getFormattedValue(), 0.0d, product.getUnit()), null, null, null, null, null, 15999, null), 15, null)));
    }

    public final InterfaceC17144F<B> s() {
        return this.screenFlow;
    }

    public final P<SubscriptionViewState> t() {
        return this.viewState;
    }

    public final void v(j action) {
        SubscriptionViewState value;
        Intrinsics.j(action, "action");
        if (action instanceof j.d) {
            C16648k.d(d0.a(this), null, null, new c(null), 3, null);
            return;
        }
        if (action instanceof j.a) {
            r();
            return;
        }
        if (action instanceof j.g) {
            C16648k.d(d0.a(this), null, null, new d(null), 3, null);
            return;
        }
        if (action instanceof j.k) {
            return;
        }
        if (action instanceof j.f) {
            C16648k.d(d0.a(this), null, null, new e(null), 3, null);
            return;
        }
        if (action instanceof j.h) {
            C16648k.d(d0.a(this), null, null, new f(null), 3, null);
            return;
        }
        if (action instanceof j.e) {
            return;
        }
        if (action instanceof j.ChangeFrequency) {
            w(((j.ChangeFrequency) action).getFrequency());
            return;
        }
        if (action instanceof j.ChangeQuantity) {
            x(((j.ChangeQuantity) action).getQuantity());
            return;
        }
        if (action instanceof j.SaveSubscription) {
            A(((j.SaveSubscription) action).getSubscriptionDecorator());
        } else {
            if (!(action instanceof j.C1933j)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC17140B<SubscriptionViewState> interfaceC17140B = this._viewState;
            do {
                value = interfaceC17140B.getValue();
            } while (!interfaceC17140B.e(value, SubscriptionViewState.b(value, false, false, true, null, null, 27, null)));
        }
    }

    public final void y() {
        SubscriptionViewState value;
        InterfaceC17140B<SubscriptionViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, SubscriptionViewState.b(value, false, false, false, null, null, 27, null)));
    }

    private final void A(SubscriptionDecorator decorator) {
        C16648k.d(d0.a(this), null, null, new g(decorator, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(B screen) {
        C16648k.d(d0.a(this), null, null, new b(screen, null), 3, null);
    }
}
