package jl;

import Hk.Validation;
import Hk.c;
import android.telephony.PhoneNumberUtils;
import com.meijer.mobile.onlineshopping.errors.DigitalShoppingApiError;
import com.meijer.mobile.onlineshopping.errors.DigitalShoppingApiException;
import com.meijer.mobile.onlineshopping.errors.ValidationErrors;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import ej.ShoppingCart;
import ej.SubstitutePreference;
import fj.ContactInformation;
import fj.PickupPerson;
import gk.MultiTenderPaymentOption;
import ij.FulfillmentSlot;
import iv.C14764a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import uw.a;

@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 c2\u00020\u0001:\u0001SB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00102\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001c¢\u0006\u0004\b!\u0010\u001fJ\u0017\u0010$\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00102\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)J!\u0010-\u001a\u00020\u00102\b\u0010+\u001a\u0004\u0018\u00010*2\b\u0010,\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u00102\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u00102\b\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b5\u00106J\u0018\u00109\u001a\u00020\u00102\u0006\u00108\u001a\u000207H\u0086@¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020\u00102\b\u0010<\u001a\u0004\u0018\u00010;¢\u0006\u0004\b=\u0010>J\u001d\u0010A\u001a\u00020/2\u000e\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0?¢\u0006\u0004\bA\u0010BJ(\u0010H\u001a\u00020G2\u0006\u0010C\u001a\u00020\u001c2\u0006\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020DH\u0086@¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u00020GH\u0086@¢\u0006\u0004\bJ\u0010KJ(\u0010M\u001a\b\u0012\u0004\u0012\u00020\"0?2\b\b\u0002\u0010L\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\"H\u0086@¢\u0006\u0004\bM\u0010NR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010X\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020\b0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u001d\u0010b\u001a\b\u0012\u0004\u0012\u00020\b0]8\u0006¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a¨\u0006d"}, d2 = {"Ljl/t;", "", "Lhl/m;", "cartRepository", "Lsl/h;", "timeSlotRepository", "Lcom/meijer/mobile/digitalshopping/api/orders/a;", "ordersRepository", "Ljl/v;", "initialState", "<init>", "(Lhl/m;Lsl/h;Lcom/meijer/mobile/digitalshopping/api/orders/a;Ljl/v;)V", "(Lhl/m;Lsl/h;Lcom/meijer/mobile/digitalshopping/api/orders/a;)V", "Ltk/c;", "Lej/C;", "resource", "", "I", "(Ltk/c;)V", "", "", "LHk/c;", "H", "(Ljava/lang/Throwable;)Ljava/util/List;", "Lfj/b;", "pickUpPerson", "S", "(Lfj/b;)V", "", "earlyDelivery", "v", "(Z)V", "dialogShown", "O", "Lgk/e;", "multiTenderPaymentOption", "Q", "(Lgk/e;)V", "Lfj/a;", "contactInformation", "K", "(Lfj/a;)V", "Lij/c;", "fulfillmentSlot", "isExpressPickUp", "y", "(Lij/c;Ljava/lang/Boolean;)V", "", "instructions", "t", "(Ljava/lang/String;)V", "Lej/D;", "substitutePreference", "C", "(Lej/D;)V", "Lej/n;", "mode", "x", "(Lej/n;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmk/b;", "ebtApprovedAmount", "M", "(Lmk/b;)V", "LHk/b;", "phoneNumber", "r", "(LHk/b;)Ljava/lang/String;", "isPercentage", "", "value", "tipAmount", "Lgj/c;", "E", "(ZDDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "G", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshCart", "A", "(ZLgk/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lhl/m;", "b", "Lsl/h;", "c", "Lcom/meijer/mobile/digitalshopping/api/orders/a;", "LNu/a;", "d", "LNu/a;", "disposables", "LDk/n;", "e", "LDk/n;", "checkoutStore", "Lio/reactivex/l;", "f", "Lio/reactivex/l;", "s", "()Lio/reactivex/l;", "checkoutState", "g", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final hl.m cartRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final sl.h timeSlotRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final com.meijer.mobile.digitalshopping.api.orders.a ordersRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Nu.a disposables;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Dk.n<CheckoutState> checkoutStore;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final io.reactivex.l<CheckoutState> checkoutState;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<tk.c<ShoppingCart>, Unit> {
        a(Object obj) {
            super(1, obj, t.class, "updateCart", "updateCart(Lcom/meijer/mobile/core/util/content/Resource;)V", 0);
        }

        public final void a(tk.c<ShoppingCart> p02) {
            Intrinsics.j(p02, "p0");
            ((t) this.receiver).I(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(tk.c<ShoppingCart> cVar) {
            a(cVar);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.checkout.CheckoutRepository", f = "CheckoutRepository.kt", l = {181}, m = "setFulfillmentMode")
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f140364a;

        /* renamed from: b, reason: collision with root package name */
        Object f140365b;

        /* renamed from: c, reason: collision with root package name */
        int f140366c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f140367d;

        /* renamed from: f, reason: collision with root package name */
        int f140369f;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f140367d = obj;
            this.f140369f |= Integer.MIN_VALUE;
            return t.this.x(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.checkout.CheckoutRepository", f = "CheckoutRepository.kt", l = {287, HttpResponseStatus.SUCCESS_UNKNOWN}, m = "setPaymentDetails")
    static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        boolean f140370a;

        /* renamed from: b, reason: collision with root package name */
        Object f140371b;

        /* renamed from: c, reason: collision with root package name */
        Object f140372c;

        /* renamed from: d, reason: collision with root package name */
        Object f140373d;

        /* renamed from: e, reason: collision with root package name */
        Object f140374e;

        /* renamed from: f, reason: collision with root package name */
        Object f140375f;

        /* renamed from: g, reason: collision with root package name */
        Object f140376g;

        /* renamed from: h, reason: collision with root package name */
        int f140377h;

        /* renamed from: i, reason: collision with root package name */
        int f140378i;

        /* renamed from: j, reason: collision with root package name */
        int f140379j;

        /* renamed from: k, reason: collision with root package name */
        int f140380k;

        /* renamed from: l, reason: collision with root package name */
        int f140381l;

        /* renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f140382m;

        /* renamed from: o, reason: collision with root package name */
        int f140384o;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f140382m = obj;
            this.f140384o |= Integer.MIN_VALUE;
            return t.this.A(false, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.checkout.CheckoutRepository", f = "CheckoutRepository.kt", l = {222, 224, 235, 249, 251}, m = "submitOrder")
    static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        boolean f140385a;

        /* renamed from: b, reason: collision with root package name */
        double f140386b;

        /* renamed from: c, reason: collision with root package name */
        double f140387c;

        /* renamed from: d, reason: collision with root package name */
        Object f140388d;

        /* renamed from: e, reason: collision with root package name */
        Object f140389e;

        /* renamed from: f, reason: collision with root package name */
        Object f140390f;

        /* renamed from: g, reason: collision with root package name */
        Object f140391g;

        /* renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f140392h;

        /* renamed from: j, reason: collision with root package name */
        int f140394j;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f140392h = obj;
            this.f140394j |= Integer.MIN_VALUE;
            return t.this.E(false, 0.0d, 0.0d, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.checkout.CheckoutRepository", f = "CheckoutRepository.kt", l = {264, 265, 271, 272}, m = "submitUpdatedOrder")
    static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f140395a;

        /* renamed from: b, reason: collision with root package name */
        Object f140396b;

        /* renamed from: c, reason: collision with root package name */
        int f140397c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f140398d;

        /* renamed from: f, reason: collision with root package name */
        int f140400f;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f140398d = obj;
            this.f140400f |= Integer.MIN_VALUE;
            return t.this.G(this);
        }
    }

    public t(hl.m cartRepository, sl.h timeSlotRepository, com.meijer.mobile.digitalshopping.api.orders.a ordersRepository, CheckoutState initialState) {
        Intrinsics.j(cartRepository, "cartRepository");
        Intrinsics.j(timeSlotRepository, "timeSlotRepository");
        Intrinsics.j(ordersRepository, "ordersRepository");
        Intrinsics.j(initialState, "initialState");
        this.cartRepository = cartRepository;
        this.timeSlotRepository = timeSlotRepository;
        this.ordersRepository = ordersRepository;
        Nu.a aVar = new Nu.a();
        this.disposables = aVar;
        Dk.n<CheckoutState> nVar = new Dk.n<>(initialState);
        this.checkoutStore = nVar;
        this.checkoutState = nVar.t();
        io.reactivex.l<tk.c<ShoppingCart>> lVarSubscribeOn = cartRepository.c().distinctUntilChanged().subscribeOn(C14764a.b());
        final a aVar2 = new a(this);
        Pu.g<? super tk.c<ShoppingCart>> gVar = new Pu.g() { // from class: jl.k
            @Override // Pu.g
            public final void accept(Object obj) {
                t.n(aVar2, obj);
            }
        };
        final b bVar = new b(uw.a.INSTANCE);
        Ck.a.a(lVarSubscribeOn.subscribe(gVar, new Pu.g() { // from class: jl.l
            @Override // Pu.g
            public final void accept(Object obj) {
                t.o(bVar, obj);
            }
        }), aVar);
    }

    public static /* synthetic */ Object B(t tVar, boolean z10, MultiTenderPaymentOption multiTenderPaymentOption, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return tVar.A(z10, multiTenderPaymentOption, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckoutState D(SubstitutePreference substitutePreference, CheckoutState oldState) {
        Intrinsics.j(oldState, "oldState");
        return CheckoutState.g(oldState, null, null, null, null, null, null, null, null, null, null, null, new Validation(substitutePreference, null, 2, null), null, null, false, false, null, 129023, null).z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double F() {
        return 0.0d;
    }

    private final List<Hk.c> H(Throwable th2) {
        if (!(th2 instanceof ValidationErrors)) {
            if (!(th2 instanceof DigitalShoppingApiException)) {
                String message = th2.getMessage();
                if (message == null) {
                    message = "failed";
                }
                return CollectionsKt.e(new c.Invalid("Card", "failed", message));
            }
            DigitalShoppingApiException digitalShoppingApiException = (DigitalShoppingApiException) th2;
            String subject = digitalShoppingApiException.getSubject();
            String str = subject != null ? subject : "Card";
            String reason = digitalShoppingApiException.getReason();
            return CollectionsKt.e(new c.Invalid(str, reason != null ? reason : "invalid", digitalShoppingApiException.getMessage()));
        }
        List<DigitalShoppingApiError> listA = ((ValidationErrors) th2).a();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listA, 10));
        for (DigitalShoppingApiError digitalShoppingApiError : listA) {
            String subject2 = digitalShoppingApiError.getSubject();
            if (subject2 == null) {
                subject2 = "Card";
            }
            String reason2 = digitalShoppingApiError.getReason();
            if (reason2 == null) {
                reason2 = "invalid";
            }
            arrayList.add(new c.Invalid(subject2, reason2, digitalShoppingApiError.getMessage()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(final tk.c<ShoppingCart> resource) {
        this.checkoutStore.a(new Function1() { // from class: jl.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t.J(resource, (CheckoutState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckoutState J(tk.c cVar, CheckoutState oldState) {
        Intrinsics.j(oldState, "oldState");
        ShoppingCart shoppingCartE = oldState.i().e();
        String code = shoppingCartE != null ? shoppingCartE.getCode() : null;
        ShoppingCart shoppingCart = (ShoppingCart) cVar.a();
        return (Intrinsics.e(code, shoppingCart != null ? shoppingCart.getCode() : null) ? oldState.B((ShoppingCart) cVar.a()) : new CheckoutState(null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, 131071, null).B((ShoppingCart) cVar.a())).z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckoutState L(ContactInformation contactInformation, CheckoutState oldState) {
        Intrinsics.j(oldState, "oldState");
        return CheckoutState.g(oldState, null, null, null, null, null, null, null, null, null, null, null, null, null, new Validation(contactInformation, null, 2, null), false, false, null, 122879, null).z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckoutState N(mk.b bVar, CheckoutState oldState) {
        Intrinsics.j(oldState, "oldState");
        return CheckoutState.g(oldState, null, null, null, null, null, null, null, null, bVar, null, null, null, null, null, false, false, null, 130815, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckoutState P(boolean z10, CheckoutState oldState) {
        Intrinsics.j(oldState, "oldState");
        return CheckoutState.g(oldState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, z10, false, null, 114687, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckoutState R(MultiTenderPaymentOption multiTenderPaymentOption, CheckoutState oldState) {
        Intrinsics.j(oldState, "oldState");
        return CheckoutState.g(oldState, null, null, null, null, null, null, new Validation(multiTenderPaymentOption != null ? multiTenderPaymentOption.getCreditDebitPaymentOption() : null, null, 2, null), new Validation(multiTenderPaymentOption != null ? multiTenderPaymentOption.getEbtPaymentOption() : null, null, 2, null), null, null, null, null, null, null, false, false, null, 130879, null).z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckoutState T(PickupPerson pickupPerson, CheckoutState oldState) {
        Intrinsics.j(oldState, "oldState");
        return CheckoutState.g(oldState, null, null, null, null, null, null, null, null, null, null, null, null, new Validation(pickupPerson, null, 2, null), null, false, false, null, 126975, null).z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckoutState u(String str, CheckoutState oldState) {
        Intrinsics.j(oldState, "oldState");
        return CheckoutState.g(oldState, null, null, null, null, null, str, null, null, null, null, null, null, null, null, false, false, null, 131039, null).z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckoutState w(boolean z10, CheckoutState it) {
        Intrinsics.j(it, "it");
        return CheckoutState.g(it, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, z10, null, 98303, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckoutState z(FulfillmentSlot fulfillmentSlot, Boolean bool, CheckoutState oldState) {
        Intrinsics.j(oldState, "oldState");
        return CheckoutState.g(oldState, null, null, null, null, null, null, null, null, null, new Validation(fulfillmentSlot, null, 2, null), bool, null, null, null, false, false, null, 129535, null).z();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ba A[Catch: Exception -> 0x0082, TryCatch #3 {Exception -> 0x0082, blocks: (B:35:0x00e5, B:36:0x00e8, B:20:0x0077, B:29:0x00b6, B:31:0x00ba), top: B:60:0x0077 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(boolean r18, gk.MultiTenderPaymentOption r19, kotlin.coroutines.Continuation<? super Hk.Validation<gk.MultiTenderPaymentOption>> r20) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jl.t.A(boolean, gk.e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void C(final SubstitutePreference substitutePreference) {
        this.checkoutStore.a(new Function1() { // from class: jl.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t.D(substitutePreference, (CheckoutState) obj);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(boolean r133, double r134, double r136, kotlin.coroutines.Continuation<? super gj.OrderDetail> r138) throws android.security.keystore.UserNotAuthenticatedException {
        /*
            Method dump skipped, instructions count: 785
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jl.t.E(boolean, double, double, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(kotlin.coroutines.Continuation<? super gj.OrderDetail> r26) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jl.t.G(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void K(final ContactInformation contactInformation) {
        this.checkoutStore.a(new Function1() { // from class: jl.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t.L(contactInformation, (CheckoutState) obj);
            }
        });
    }

    public final void M(final mk.b ebtApprovedAmount) {
        this.checkoutStore.a(new Function1() { // from class: jl.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t.N(ebtApprovedAmount, (CheckoutState) obj);
            }
        });
    }

    public final void O(final boolean dialogShown) {
        this.checkoutStore.a(new Function1() { // from class: jl.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t.P(dialogShown, (CheckoutState) obj);
            }
        });
    }

    public final void Q(final MultiTenderPaymentOption multiTenderPaymentOption) {
        this.checkoutStore.a(new Function1() { // from class: jl.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t.R(multiTenderPaymentOption, (CheckoutState) obj);
            }
        });
    }

    public final void S(final PickupPerson pickUpPerson) {
        this.checkoutStore.a(new Function1() { // from class: jl.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t.T(pickUpPerson, (CheckoutState) obj);
            }
        });
    }

    public final String r(Validation<String> phoneNumber) {
        Intrinsics.j(phoneNumber, "phoneNumber");
        String strE = phoneNumber.e();
        if (strE == null) {
            strE = "";
        }
        String strStripSeparators = PhoneNumberUtils.stripSeparators(strE);
        Intrinsics.i(strStripSeparators, "stripSeparators(...)");
        return strStripSeparators;
    }

    public final io.reactivex.l<CheckoutState> s() {
        return this.checkoutState;
    }

    public final void t(final String instructions) {
        this.checkoutStore.a(new Function1() { // from class: jl.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t.u(instructions, (CheckoutState) obj);
            }
        });
    }

    public final void v(final boolean earlyDelivery) {
        this.checkoutStore.a(new Function1() { // from class: jl.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t.w(earlyDelivery, (CheckoutState) obj);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(ej.n r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof jl.t.d
            if (r0 == 0) goto L13
            r0 = r7
            jl.t$d r0 = (jl.t.d) r0
            int r1 = r0.f140369f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f140369f = r1
            goto L18
        L13:
            jl.t$d r0 = new jl.t$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f140367d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f140369f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.f140365b
            jl.t r6 = (jl.t) r6
            java.lang.Object r6 = r0.f140364a
            ej.n r6 = (ej.n) r6
            kotlin.ResultKt.b(r7)     // Catch: java.lang.Throwable -> L32
            goto L52
        L32:
            r6 = move-exception
            goto L59
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            kotlin.ResultKt.b(r7)
            kotlin.Result$Companion r7 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L32
            hl.m r7 = r5.cartRepository     // Catch: java.lang.Throwable -> L32
            r0.f140364a = r6     // Catch: java.lang.Throwable -> L32
            r0.f140365b = r5     // Catch: java.lang.Throwable -> L32
            r0.f140366c = r4     // Catch: java.lang.Throwable -> L32
            r0.f140369f = r3     // Catch: java.lang.Throwable -> L32
            java.lang.Object r7 = r7.D(r6, r0)     // Catch: java.lang.Throwable -> L32
            if (r7 != r1) goto L52
            return r1
        L52:
            tk.c r7 = (tk.c) r7     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = kotlin.Result.b(r7)     // Catch: java.lang.Throwable -> L32
            goto L63
        L59:
            kotlin.Result$Companion r7 = kotlin.Result.INSTANCE
            java.lang.Object r6 = kotlin.ResultKt.a(r6)
            java.lang.Object r6 = kotlin.Result.b(r6)
        L63:
            boolean r7 = kotlin.Result.h(r6)
            if (r7 == 0) goto L84
            r7 = r6
            tk.c r7 = (tk.c) r7
            uw.a$a r1 = uw.a.INSTANCE
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Successfully set "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r1.a(r7, r2)
        L84:
            java.lang.Throwable r6 = kotlin.Result.e(r6)
            if (r6 == 0) goto La0
            kotlin.coroutines.CoroutineContext r7 = r0.getContext()
            qv.E0.i(r7)
            boolean r7 = r6 instanceof java.lang.Error
            if (r7 != 0) goto L9f
            uw.a$a r7 = uw.a.INSTANCE
            java.lang.String r0 = "SetFulfillmentMode failed"
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r7.f(r6, r0, r1)
            goto La0
        L9f:
            throw r6
        La0:
            kotlin.Unit r6 = kotlin.Unit.f142422a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jl.t.x(ej.n, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void y(final FulfillmentSlot fulfillmentSlot, final Boolean isExpressPickUp) {
        this.checkoutStore.a(new Function1() { // from class: jl.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t.z(fulfillmentSlot, isExpressPickUp, (CheckoutState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(hl.m cartRepository, sl.h timeSlotRepository, com.meijer.mobile.digitalshopping.api.orders.a ordersRepository) {
        this(cartRepository, timeSlotRepository, ordersRepository, new CheckoutState(null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, 131071, null));
        Intrinsics.j(cartRepository, "cartRepository");
        Intrinsics.j(timeSlotRepository, "timeSlotRepository");
        Intrinsics.j(ordersRepository, "ordersRepository");
    }
}
