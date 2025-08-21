package kl;

import ev.C13889a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import qw.a;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lkl/d;", "", "Lkl/t;", "checkoutRepository", "Lkl/f;", "initialState", "<init>", "(Lkl/t;Lkl/f;)V", "(Lkl/t;)V", "Lkl/v;", "checkoutState", "", "h", "(Lkl/v;)V", "LJu/a;", "a", "LJu/a;", "disposables", "LEk/n;", "b", "LEk/n;", "checkoutFlowStore", "Lio/reactivex/l;", "c", "Lio/reactivex/l;", "g", "()Lio/reactivex/l;", "checkoutFlowState", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ju.a disposables;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Ek.n<CheckoutFlowState> checkoutFlowStore;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final io.reactivex.l<CheckoutFlowState> checkoutFlowState;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<CheckoutState, Unit> {
        a(Object obj) {
            super(1, obj, d.class, "updateCheckoutFlowState", "updateCheckoutFlowState(Lcom/meijer/mobile/digitalshopping/api/checkout/CheckoutState;)V", 0);
        }

        public final void a(CheckoutState p02) {
            Intrinsics.j(p02, "p0");
            ((d) this.receiver).h(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CheckoutState checkoutState) {
            a(checkoutState);
            return Unit.f143329a;
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
            return Unit.f143329a;
        }
    }

    public d(t checkoutRepository, CheckoutFlowState initialState) {
        Intrinsics.j(checkoutRepository, "checkoutRepository");
        Intrinsics.j(initialState, "initialState");
        Ju.a aVar = new Ju.a();
        this.disposables = aVar;
        Ek.n<CheckoutFlowState> nVar = new Ek.n<>(initialState);
        this.checkoutFlowStore = nVar;
        this.checkoutFlowState = nVar.t();
        io.reactivex.l<CheckoutState> lVarSubscribeOn = checkoutRepository.s().distinctUntilChanged().subscribeOn(C13889a.b());
        final a aVar2 = new a(this);
        Lu.g<? super CheckoutState> gVar = new Lu.g() { // from class: kl.a
            @Override // Lu.g
            public final void accept(Object obj) {
                d.d(aVar2, obj);
            }
        };
        final b bVar = new b(qw.a.INSTANCE);
        Dk.a.a(lVarSubscribeOn.subscribe(gVar, new Lu.g() { // from class: kl.b
            @Override // Lu.g
            public final void accept(Object obj) {
                d.e(bVar, obj);
            }
        }), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(final CheckoutState checkoutState) {
        this.checkoutFlowStore.a(new Function1() { // from class: kl.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d.i(checkoutState, (CheckoutFlowState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckoutFlowState i(CheckoutState checkoutState, CheckoutFlowState it) {
        Intrinsics.j(it, "it");
        return CheckoutFlowState.INSTANCE.a(checkoutState);
    }

    public final io.reactivex.l<CheckoutFlowState> g() {
        return this.checkoutFlowState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(t checkoutRepository) {
        this(checkoutRepository, new CheckoutFlowState(0, null, 3, null));
        Intrinsics.j(checkoutRepository, "checkoutRepository");
    }
}
