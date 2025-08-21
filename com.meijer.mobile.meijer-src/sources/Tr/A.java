package Tr;

import Fq.ShoppingListItem;
import Pk.Coupon;
import Tr.CouponsListChange;
import android.content.Intent;
import com.meijer.mobile.core.models.coupon.CouponAd;
import com.meijer.mobile.core.networking.exceptions.RetrofitException;
import com.meijer.mobile.coupons.api.models.ClipUnclipCouponResponse;
import com.meijer.mobile.coupons.api.models.CouponsRequest;
import com.meijer.mobile.coupons.api.models.GetAdsResponse;
import com.meijer.mobile.coupons.domain.models.CouponException;
import dl.C13702d;
import el.CouponsResponse;
import ev.C13889a;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mv.AbstractC15779K;
import mv.InterfaceC15783O;
import retrofit2.Response;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001BB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001d\u0010\u0018J\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0012H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\"H\u0002¢\u0006\u0004\b'\u0010$J\u000f\u0010(\u001a\u00020\u0012H\u0002¢\u0006\u0004\b(\u0010&J\u000f\u0010)\u001a\u00020\u0012H\u0002¢\u0006\u0004\b)\u0010&J\u0017\u0010,\u001a\u00020\u00122\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u00122\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b0\u00101J\u0015\u00104\u001a\u00020\u00122\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\u0012¢\u0006\u0004\b6\u0010&J\r\u00107\u001a\u00020\u0012¢\u0006\u0004\b7\u0010&J\u001b\u0010;\u001a\u00020\u00122\f\u0010:\u001a\b\u0012\u0004\u0012\u00020908¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\u0012¢\u0006\u0004\b=\u0010&J\u0015\u0010>\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b>\u0010!J\u0015\u0010?\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b?\u0010!J\u0015\u0010@\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b@\u0010!J\r\u0010A\u001a\u00020\u0012¢\u0006\u0004\bA\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010Q\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010U\u001a\u00020R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010X\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010^\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010a\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`¨\u0006b"}, d2 = {"LTr/A;", "", "LDk/b;", "rxJavaBus", "", "requiresSpecialOffersUrl", "LEq/b;", "shoppingListRepository", "Ldl/d;", "couponsRepository", "Landroid/content/Intent;", "actionIntent", "Lmv/K;", "ioDispatcher", "<init>", "(LDk/b;ZLEq/b;Ldl/d;Landroid/content/Intent;Lmv/K;)V", "Lcom/meijer/mobile/coupons/api/models/GetAdsResponse;", "response", "", "V", "(Lcom/meijer/mobile/coupons/api/models/GetAdsResponse;)V", "", "exception", "U", "(Ljava/lang/Throwable;)V", "Lel/a;", "data", "R", "(Lel/a;)V", "Q", "LPk/a;", "coupon", "M", "(LPk/a;)V", "Lcom/meijer/mobile/coupons/domain/models/CouponException;", "L", "(Lcom/meijer/mobile/coupons/domain/models/CouponException;)V", "X", "()V", "W", "O", "N", "LTr/B;", "change", "P", "(LTr/B;)V", "LTr/A$a;", "listener", "n0", "(LTr/A$a;)V", "Lcom/meijer/mobile/coupons/api/models/CouponsRequest;", "request", "d0", "(Lcom/meijer/mobile/coupons/api/models/CouponsRequest;)V", "Y", "i0", "", "LFq/c;", "shoppingList", "T", "(Ljava/util/List;)V", "S", "A", "o0", "F", "z", "a", "LDk/b;", "b", "Z", "c", "LEq/b;", "d", "Ldl/d;", "e", "Landroid/content/Intent;", "f", "Lmv/K;", "LJu/b;", "g", "LJu/b;", "shoppingListDisposable", "", "h", "I", "executing", "i", "Lcom/meijer/mobile/coupons/api/models/CouponsRequest;", "loadRequest", "j", "LTr/A$a;", "LJu/a;", "k", "LJu/a;", "disposables", "K", "()Z", "isBusy", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Dk.b rxJavaBus;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean requiresSpecialOffersUrl;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Eq.b shoppingListRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C13702d couponsRepository;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Intent actionIntent;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Ju.b shoppingListDisposable;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int executing;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private CouponsRequest loadRequest;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private a listener;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Ju.a disposables;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0002H&¢\u0006\u0004\b\u0012\u0010\u0007J\u001f\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0005H&¢\u0006\u0004\b\u001f\u0010 ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, d2 = {"LTr/A$a;", "", "", "Lcom/meijer/mobile/core/models/coupon/CouponAd;", "ads", "", "f", "(Ljava/util/List;)V", "Lel/a;", "couponsResponse", "E", "(Lel/a;)V", "Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "exception", "I", "(Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;)V", "LFq/c;", "shoppingList", "d", "", "messageResId", "LTr/B;", "change", "F", "(ILTr/B;)V", "s", "(Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;LTr/B;)V", "LPk/a;", "coupon", "A", "(LPk/a;)V", "G", "()V", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {
        void A(Coupon coupon);

        void E(CouponsResponse couponsResponse);

        void F(int messageResId, CouponsListChange change);

        void G();

        void I(RetrofitException exception);

        void d(List<ShoppingListItem> shoppingList);

        void f(List<CouponAd> ads);

        void s(RetrofitException exception, CouponsListChange change);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "LFq/c;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.ui.coupon.legacy.CouponsCommandManager$refreshShoppingList$1", f = "CouponsCommandManager.kt", l = {98}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends ShoppingListItem>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f36740a;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends ShoppingListItem>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super List<ShoppingListItem>>) continuation);
        }

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return A.this.new b(continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<ShoppingListItem>> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f36740a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            Eq.b bVar = A.this.shoppingListRepository;
            this.f36740a = 1;
            Object objG = Eq.b.g(bVar, false, this, 1, null);
            if (objG == objF) {
                return objF;
            }
            return objG;
        }
    }

    private final void Q(Throwable exception) {
        this.loadRequest = null;
        a aVar = this.listener;
        if (aVar != null) {
            aVar.I(com.meijer.mobile.core.networking.exceptions.a.a(exception));
        }
    }

    private final void R(CouponsResponse data) {
        this.loadRequest = null;
        a aVar = this.listener;
        if (aVar != null) {
            aVar.E(data);
        }
    }

    public final void S() {
        this.shoppingListDisposable = null;
    }

    public A(Dk.b rxJavaBus, boolean z10, Eq.b shoppingListRepository, C13702d couponsRepository, Intent actionIntent, AbstractC15779K ioDispatcher) {
        Intrinsics.j(rxJavaBus, "rxJavaBus");
        Intrinsics.j(shoppingListRepository, "shoppingListRepository");
        Intrinsics.j(couponsRepository, "couponsRepository");
        Intrinsics.j(actionIntent, "actionIntent");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.rxJavaBus = rxJavaBus;
        this.requiresSpecialOffersUrl = z10;
        this.shoppingListRepository = shoppingListRepository;
        this.couponsRepository = couponsRepository;
        this.actionIntent = actionIntent;
        this.ioDispatcher = ioDispatcher;
        this.disposables = new Ju.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(A a10, Coupon coupon, Throwable throwable) {
        Intrinsics.j(throwable, "throwable");
        a10.L(new CouponException(throwable, coupon));
        return Unit.f143329a;
    }

    private final boolean K() {
        return this.executing > 0;
    }

    private final void N() {
        int i10 = this.executing - 1;
        this.executing = i10;
        CouponsRequest couponsRequest = this.loadRequest;
        if (couponsRequest == null || i10 != 0) {
            return;
        }
        Intrinsics.g(couponsRequest);
        d0(couponsRequest);
    }

    private final void O() {
        this.executing++;
    }

    private final void U(Throwable exception) {
        qw.a.INSTANCE.f(exception, "Error loading coupon ads", new Object[0]);
    }

    private final void V(GetAdsResponse response) {
        a aVar = this.listener;
        if (aVar != null) {
            aVar.f(response.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(A a10, GetAdsResponse response) {
        Intrinsics.j(response, "response");
        a10.V(response);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b0(A a10, Throwable exception) {
        Intrinsics.j(exception, "exception");
        a10.U(exception);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e0(A a10, CouponsResponse couponResponse) {
        Intrinsics.j(couponResponse, "couponResponse");
        a10.R(couponResponse);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g0(A a10, Throwable exception) {
        Intrinsics.j(exception, "exception");
        a10.Q(exception);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l0(A a10, List shoppingList) {
        Intrinsics.j(shoppingList, "shoppingList");
        a10.T(shoppingList);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r0(A a10, Coupon coupon, Throwable throwable) {
        Intrinsics.j(throwable, "throwable");
        a10.W(new CouponException(throwable, coupon));
        return Unit.f143329a;
    }

    public final void A(final Coupon coupon) {
        Intrinsics.j(coupon, "coupon");
        io.reactivex.u<ClipUnclipCouponResponse> uVarK = this.couponsRepository.h(coupon).q(C13889a.b()).k(Iu.a.a());
        final Function1 function1 = new Function1() { // from class: Tr.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return A.B(this.f36780a, coupon, (ClipUnclipCouponResponse) obj);
            }
        };
        Lu.g<? super ClipUnclipCouponResponse> gVar = new Lu.g() { // from class: Tr.v
            @Override // Lu.g
            public final void accept(Object obj) {
                A.C(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: Tr.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return A.D(this.f36783a, coupon, (Throwable) obj);
            }
        };
        Ju.b bVarO = uVarK.o(gVar, new Lu.g() { // from class: Tr.x
            @Override // Lu.g
            public final void accept(Object obj) {
                A.E(function12, obj);
            }
        });
        Intrinsics.i(bVarO, "subscribe(...)");
        this.disposables.b(bVarO);
        O();
    }

    public final void F(Coupon coupon) {
        Intrinsics.j(coupon, "coupon");
        O();
        coupon.J(true);
        final CouponsListChange couponsListChange = new CouponsListChange(CouponsListChange.a.f36746c, coupon);
        io.reactivex.u<Response<Unit>> uVarK = this.couponsRepository.w(coupon).q(C13889a.b()).k(Iu.a.a());
        final Function1 function1 = new Function1() { // from class: Tr.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return A.G(this.f36786a, (Response) obj);
            }
        };
        Lu.g<? super Response<Unit>> gVar = new Lu.g() { // from class: Tr.z
            @Override // Lu.g
            public final void accept(Object obj) {
                A.H(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: Tr.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return A.I(this.f36761a, couponsListChange, (Throwable) obj);
            }
        };
        Ju.b bVarO = uVarK.o(gVar, new Lu.g() { // from class: Tr.e
            @Override // Lu.g
            public final void accept(Object obj) {
                A.J(function12, obj);
            }
        });
        Intrinsics.i(bVarO, "subscribe(...)");
        this.disposables.b(bVarO);
    }

    public final void T(List<ShoppingListItem> shoppingList) {
        Intrinsics.j(shoppingList, "shoppingList");
        this.shoppingListDisposable = null;
        a aVar = this.listener;
        if (aVar != null) {
            aVar.d(shoppingList);
        }
    }

    public final void Y() {
        io.reactivex.u<GetAdsResponse> uVarK = this.couponsRepository.n().q(C13889a.b()).k(Iu.a.a());
        final Function1 function1 = new Function1() { // from class: Tr.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return A.Z(this.f36774a, (GetAdsResponse) obj);
            }
        };
        Lu.g<? super GetAdsResponse> gVar = new Lu.g() { // from class: Tr.p
            @Override // Lu.g
            public final void accept(Object obj) {
                A.a0(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: Tr.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return A.b0(this.f36776a, (Throwable) obj);
            }
        };
        Ju.b bVarO = uVarK.o(gVar, new Lu.g() { // from class: Tr.r
            @Override // Lu.g
            public final void accept(Object obj) {
                A.c0(function12, obj);
            }
        });
        Intrinsics.i(bVarO, "subscribe(...)");
        this.disposables.b(bVarO);
    }

    public final void d0(CouponsRequest request) {
        Intrinsics.j(request, "request");
        if (K()) {
            this.loadRequest = request;
            return;
        }
        Ju.a aVar = this.disposables;
        io.reactivex.u<CouponsResponse> uVarK = this.couponsRepository.A(request, this.requiresSpecialOffersUrl).k(Iu.a.a());
        final Function1 function1 = new Function1() { // from class: Tr.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return A.e0(this.f36769a, (CouponsResponse) obj);
            }
        };
        Lu.g<? super CouponsResponse> gVar = new Lu.g() { // from class: Tr.k
            @Override // Lu.g
            public final void accept(Object obj) {
                A.f0(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: Tr.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return A.g0(this.f36771a, (Throwable) obj);
            }
        };
        aVar.b(uVarK.o(gVar, new Lu.g() { // from class: Tr.m
            @Override // Lu.g
            public final void accept(Object obj) {
                A.h0(function12, obj);
            }
        }));
    }

    public final void i0() {
        if (this.shoppingListDisposable == null) {
            io.reactivex.u uVarK = tv.n.b(this.ioDispatcher, new b(null)).q(C13889a.b()).k(Iu.a.a());
            final Function1 function1 = new Function1() { // from class: Tr.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return A.l0(this.f36760a, (List) obj);
                }
            };
            Lu.g gVar = new Lu.g() { // from class: Tr.n
                @Override // Lu.g
                public final void accept(Object obj) {
                    A.m0(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: Tr.s
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return A.j0(this.f36778a, (Throwable) obj);
                }
            };
            this.shoppingListDisposable = uVarK.o(gVar, new Lu.g() { // from class: Tr.t
                @Override // Lu.g
                public final void accept(Object obj) {
                    A.k0(function12, obj);
                }
            });
        }
    }

    public final void n0(a listener) {
        this.listener = listener;
    }

    public final void o0(final Coupon coupon) {
        Intrinsics.j(coupon, "coupon");
        io.reactivex.u<ClipUnclipCouponResponse> uVarK = this.couponsRepository.F(coupon).q(C13889a.b()).k(Iu.a.a());
        final Function1 function1 = new Function1() { // from class: Tr.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return A.p0(this.f36764a, (ClipUnclipCouponResponse) obj);
            }
        };
        Lu.g<? super ClipUnclipCouponResponse> gVar = new Lu.g() { // from class: Tr.g
            @Override // Lu.g
            public final void accept(Object obj) {
                A.q0(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: Tr.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return A.r0(this.f36766a, coupon, (Throwable) obj);
            }
        };
        Ju.b bVarO = uVarK.o(gVar, new Lu.g() { // from class: Tr.i
            @Override // Lu.g
            public final void accept(Object obj) {
                A.s0(function12, obj);
            }
        });
        Intrinsics.i(bVarO, "subscribe(...)");
        this.disposables.b(bVarO);
        O();
    }

    public final void z() {
        this.disposables.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(A a10, Coupon coupon, ClipUnclipCouponResponse clipUnclipCouponResponse) {
        a10.M(coupon);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(A a10, Response response) {
        a10.N();
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(A a10, CouponsListChange couponsListChange, Throwable th2) {
        a10.P(couponsListChange);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void L(CouponException exception) {
        Coupon coupon = exception.getCoupon();
        coupon.I(false);
        N();
        if (this.listener != null) {
            if (exception.getErrorType() != null) {
                sk.b errorType = exception.getErrorType();
                Intrinsics.g(errorType);
                if (errorType.getResultCode() > 30) {
                    a aVar = this.listener;
                    if (aVar != null) {
                        aVar.F(Nr.g.f22712s, new CouponsListChange(CouponsListChange.a.f36745b, coupon));
                        return;
                    }
                    return;
                }
            }
            a aVar2 = this.listener;
            if (aVar2 != null) {
                aVar2.s(exception, new CouponsListChange(CouponsListChange.a.f36745b, coupon));
                return;
            }
            return;
        }
        this.rxJavaBus.a(new CouponActionEvent(Nr.g.f22722x, Nr.g.f22712s, this.actionIntent));
    }

    private final void M(Coupon coupon) {
        N();
        a aVar = this.listener;
        if (aVar != null) {
            aVar.A(coupon);
        }
        a aVar2 = this.listener;
        if (aVar2 != null) {
            aVar2.G();
        }
    }

    private final void P(CouponsListChange change) {
        N();
        a aVar = this.listener;
        if (aVar != null) {
            aVar.F(qk.f.f158513k, change);
        }
    }

    private final void W(CouponException exception) {
        Coupon coupon = exception.getCoupon();
        coupon.I(true);
        N();
        a aVar = this.listener;
        if (aVar != null) {
            if (aVar != null) {
                aVar.F(Nr.g.f22653E, new CouponsListChange(CouponsListChange.a.f36744a, coupon));
                return;
            }
            return;
        }
        this.rxJavaBus.a(new CouponActionEvent(Nr.g.f22722x, Nr.g.f22653E, this.actionIntent));
    }

    private final void X() {
        N();
        a aVar = this.listener;
        if (aVar != null) {
            aVar.G();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j0(A a10, Throwable th2) {
        a10.S();
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p0(A a10, ClipUnclipCouponResponse clipUnclipCouponResponse) {
        a10.X();
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
