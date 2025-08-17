package th;

import Hk.Validation;
import Pu.o;
import gk.PaymentOption;
import io.reactivex.l;
import iv.C14764a;
import java.util.Comparator;
import jl.CheckoutState;
import jl.t;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16648k;
import qv.InterfaceC16622O;
import tv.C17154h;
import tv.InterfaceC17140B;
import tv.P;
import tv.S;
import uw.a;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB+\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020\b0-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lth/f;", "", "Lyo/k;", "userManager", "Ljl/t;", "checkoutRepository", "Lth/k;", "paymentsRepository", "Lth/a;", "initialState", "Lqv/O;", "coroutineScope", "<init>", "(Lyo/k;Ljl/t;Lth/k;Lth/a;Lqv/O;)V", "(Lyo/k;Ljl/t;Lth/k;Lqv/O;)V", "LHk/b;", "Lgk/f;", "paymentOption", "", "n", "(LHk/b;)V", "Luh/b;", "accountCreditCardResponse", "m", "(Luh/b;)V", "", "throwable", "l", "(Ljava/lang/Throwable;)V", "j", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lyo/k;", "b", "Lth/k;", "c", "Lqv/O;", "LNu/a;", "d", "LNu/a;", "disposables", "Ltv/B;", "e", "Ltv/B;", "paymentOptionsStore", "Ltv/P;", "f", "Ltv/P;", "k", "()Ltv/P;", "paymentOptionsState", "payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k paymentsRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16622O coroutineScope;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Nu.a disposables;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<PaymentOptions> paymentOptionsStore;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final P<PaymentOptions> paymentOptionsState;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Validation<PaymentOption>, Unit> {
        a(Object obj) {
            super(1, obj, f.class, "onCartPayment", "onCartPayment(Lcom/meijer/mobile/core/util/validations/Validation;)V", 0);
        }

        public final void a(Validation<PaymentOption> p02) {
            Intrinsics.j(p02, "p0");
            ((f) this.receiver).n(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Validation<PaymentOption> validation) {
            a(validation);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class b extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        b(Object obj) {
            super(1, obj, a.Companion.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable th2) {
            ((a.Companion) this.receiver).e(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.payments.api.PaymentOptionsRepository$4", f = "PaymentOptionsRepository.kt", l = {64}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f161666a;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return f.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f161666a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                f fVar = f.this;
                this.f161666a = 1;
                if (fVar.j(this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.payments.api.PaymentOptionsRepository", f = "PaymentOptionsRepository.kt", l = {69}, m = "fetchSavedPaymentOptions")
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f161668a;

        /* renamed from: b, reason: collision with root package name */
        int f161669b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f161670c;

        /* renamed from: e, reason: collision with root package name */
        int f161672e;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f161670c = obj;
            this.f161672e |= Integer.MIN_VALUE;
            return f.this.j(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return ComparisonsKt.d(Boolean.valueOf(((PaymentOption) ((Validation) t11).e()).getDefaultPayment()), Boolean.valueOf(((PaymentOption) ((Validation) t10).e()).getDefaultPayment()));
        }
    }

    public f(yo.k userManager, t checkoutRepository, k paymentsRepository, PaymentOptions initialState, InterfaceC16622O coroutineScope) {
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(checkoutRepository, "checkoutRepository");
        Intrinsics.j(paymentsRepository, "paymentsRepository");
        Intrinsics.j(initialState, "initialState");
        Intrinsics.j(coroutineScope, "coroutineScope");
        this.userManager = userManager;
        this.paymentsRepository = paymentsRepository;
        this.coroutineScope = coroutineScope;
        Nu.a aVar = new Nu.a();
        this.disposables = aVar;
        InterfaceC17140B<PaymentOptions> interfaceC17140BA = S.a(initialState);
        this.paymentOptionsStore = interfaceC17140BA;
        this.paymentOptionsState = C17154h.c(interfaceC17140BA);
        l<CheckoutState> lVarS = checkoutRepository.s();
        final Function1 function1 = new Function1() { // from class: th.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f.e((CheckoutState) obj);
            }
        };
        l lVarSubscribeOn = lVarS.map(new o() { // from class: th.c
            @Override // Pu.o
            public final Object apply(Object obj) {
                return f.f(function1, obj);
            }
        }).distinctUntilChanged().subscribeOn(C14764a.b());
        final a aVar2 = new a(this);
        Pu.g gVar = new Pu.g() { // from class: th.d
            @Override // Pu.g
            public final void accept(Object obj) {
                f.g(aVar2, obj);
            }
        };
        final b bVar = new b(uw.a.INSTANCE);
        Ck.a.a(lVarSubscribeOn.subscribe(gVar, new Pu.g() { // from class: th.e
            @Override // Pu.g
            public final void accept(Object obj) {
                f.h(bVar, obj);
            }
        }), aVar);
        C16648k.d(coroutineScope, null, null, new c(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Validation e(CheckoutState it) {
        Intrinsics.j(it, "it");
        return it.t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Validation f(Function1 function1, Object p02) {
        Intrinsics.j(p02, "p0");
        return (Validation) function1.invoke(p02);
    }

    private final void l(Throwable throwable) {
        PaymentOptions value;
        InterfaceC17140B<PaymentOptions> interfaceC17140B = this.paymentOptionsStore;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, PaymentOptions.f(value, null, null, null, false, throwable.getMessage(), 15, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(Validation<PaymentOption> paymentOption) {
        InterfaceC17140B<PaymentOptions> interfaceC17140B = this.paymentOptionsStore;
        while (true) {
            PaymentOptions value = interfaceC17140B.getValue();
            Validation<PaymentOption> validation = paymentOption;
            if (interfaceC17140B.e(value, PaymentOptions.f(value, null, null, validation, false, null, 11, null))) {
                return;
            } else {
                paymentOption = validation;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(kotlin.coroutines.Continuation<? super kotlin.Unit> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof th.f.d
            if (r0 == 0) goto L13
            r0 = r5
            th.f$d r0 = (th.f.d) r0
            int r1 = r0.f161672e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f161672e = r1
            goto L18
        L13:
            th.f$d r0 = new th.f$d
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f161670c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f161672e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r1 = r0.f161668a
            th.f r1 = (th.f) r1
            kotlin.ResultKt.b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L4c
        L2d:
            r5 = move-exception
            goto L53
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            kotlin.ResultKt.b(r5)
            kotlin.Result$Companion r5 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L2d
            th.k r5 = r4.paymentsRepository     // Catch: java.lang.Throwable -> L2d
            r0.f161668a = r4     // Catch: java.lang.Throwable -> L2d
            r2 = 0
            r0.f161669b = r2     // Catch: java.lang.Throwable -> L2d
            r0.f161672e = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r5 = r5.h(r0)     // Catch: java.lang.Throwable -> L2d
            if (r5 != r1) goto L4c
            return r1
        L4c:
            uh.b r5 = (uh.AccountCreditCardResponse) r5     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r5 = kotlin.Result.b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L5d
        L53:
            kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
            java.lang.Object r5 = kotlin.ResultKt.a(r5)
            java.lang.Object r5 = kotlin.Result.b(r5)
        L5d:
            boolean r1 = kotlin.Result.h(r5)
            if (r1 == 0) goto L69
            r1 = r5
            uh.b r1 = (uh.AccountCreditCardResponse) r1
            r4.m(r1)
        L69:
            java.lang.Throwable r5 = kotlin.Result.e(r5)
            if (r5 == 0) goto L7f
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            qv.E0.i(r0)
            boolean r0 = r5 instanceof java.lang.Error
            if (r0 != 0) goto L7e
            r4.l(r5)
            goto L7f
        L7e:
            throw r5
        L7f:
            kotlin.Unit r5 = kotlin.Unit.f142422a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: th.f.j(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final P<PaymentOptions> k() {
        return this.paymentOptionsState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0106 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m(uh.AccountCreditCardResponse r13) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: th.f.m(uh.b):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(yo.k userManager, t checkoutRepository, k paymentsRepository, InterfaceC16622O coroutineScope) {
        this(userManager, checkoutRepository, paymentsRepository, new PaymentOptions(null, null, null, false, null, 31, null), coroutineScope);
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(checkoutRepository, "checkoutRepository");
        Intrinsics.j(paymentsRepository, "paymentsRepository");
        Intrinsics.j(coroutineScope, "coroutineScope");
    }
}
