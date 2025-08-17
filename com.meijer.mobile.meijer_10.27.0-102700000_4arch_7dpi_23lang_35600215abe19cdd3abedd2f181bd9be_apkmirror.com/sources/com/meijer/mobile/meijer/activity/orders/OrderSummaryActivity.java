package com.meijer.mobile.meijer.activity.orders;

import Ji.LocalThemeScope;
import V2.CreationExtras;
import ak.AbstractC5607a;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.activity.cart.CartActivity;
import com.meijer.mobile.meijer.activity.cart.dialog.CartProductSavingsDialogFragment;
import com.meijer.mobile.meijer.activity.orders.OrderSummaryActivity;
import e.C13589e;
import fn.C13919d;
import g.AbstractC14147c;
import g.C14145a;
import g.InterfaceC14146b;
import gn.C14282c;
import gn.EbtTransactionItemDecorator;
import gn.ReadOnlyProductListDecorator;
import j0.InterfaceC14814f;
import java.util.ArrayList;
import java.util.List;
import je.C14886b;
import kotlin.C17891L0;
import kotlin.C17893M0;
import kotlin.C17921a1;
import kotlin.C17927c1;
import kotlin.C17963o1;
import kotlin.EnumC17895N0;
import kotlin.EnumC17957m1;
import kotlin.EnumC17969q1;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import ln.MockedPromo;
import p1.C16193g;
import qv.C16648k;
import qv.InterfaceC16622O;
import r0.C16692i;
import rn.U;
import uo.OrderOutOfStockItem;
import vo.OrderSubstitutionItem;
import wk.C17829a;
import yl.AbstractC18227f;
import zm.CartProductSavingsDecorator;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 $2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u0019\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0014\u0010\u0003J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006,²\u0006\f\u0010'\u001a\u00020&8\nX\u008a\u0084\u0002²\u0006\u000e\u0010(\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010)\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010*\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010+\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orders/OrderSummaryActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "<init>", "()V", "Lg/a;", "result", "", "N1", "(Lg/a;)V", "K1", "M1", "Lgn/r;", "item", "O1", "(Lgn/r;)V", "J1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "Landroid/view/MenuItem;", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lrn/U;", "s", "Lkotlin/Lazy;", "L1", "()Lrn/U;", "viewModel", "Lg/c;", "Landroid/content/Intent;", "t", "Lg/c;", "clpResultLauncher", "u", "a", "Lrn/U$f;", "viewState", "displayOrderDetailBottomSheet", "displayExtendedRangeInfo", "isDisplayEBTHistoryBottomSheet", "isDisplayCreditCardHistoryBottomSheet", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class OrderSummaryActivity extends Hilt_OrderSummaryActivity {

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: v, reason: collision with root package name */
    public static final int f110354v = 8;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new androidx.view.e0(Reflection.b(rn.U.class), new e(this), new d(this), new f(null, this));

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<Intent> clpResultLauncher = registerForActivityResult(new h.i(), new b());

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orders/OrderSummaryActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "", "Lvo/a;", "orderSubstitutionList", "Luo/a;", "orderOutOfStockList", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Landroid/content/Intent;", "ORDER_ID", "Ljava/lang/String;", "ORDER_SUBSTITUTION_LIST", "ORDER_OUT_OF_STOCK_LIST", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.orders.OrderSummaryActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Intent a(Context context, String orderId, List<OrderSubstitutionItem> orderSubstitutionList, List<OrderOutOfStockItem> orderOutOfStockList) {
            Intrinsics.j(context, "context");
            Intrinsics.j(orderId, "orderId");
            Intrinsics.j(orderSubstitutionList, "orderSubstitutionList");
            Intrinsics.j(orderOutOfStockList, "orderOutOfStockList");
            Intent intent = new Intent(context, (Class<?>) OrderSummaryActivity.class);
            intent.putExtra("orderID", orderId);
            intent.putParcelableArrayListExtra("orderSubstitutionList", new ArrayList<>(orderSubstitutionList));
            intent.putParcelableArrayListExtra("orderOutOfStockList", new ArrayList<>(orderOutOfStockList));
            return intent;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class b implements InterfaceC14146b, FunctionAdapter {
        b() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14146b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, OrderSummaryActivity.this, OrderSummaryActivity.class, "handleClpResult", "handleClpResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14145a p02) {
            Intrinsics.j(p02, "p0");
            OrderSummaryActivity.this.N1(p02);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ OrderSummaryActivity f110359a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.orders.OrderSummaryActivity$c$a$a, reason: collision with other inner class name */
            static final class C1688a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f110360a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC16622O f110361b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C17893M0 f110362c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ OrderSummaryActivity f110363d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<Boolean> f110364e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ z1<U.ViewState> f110365f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<Boolean> f110366g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<Boolean> f110367h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<Boolean> f110368i;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.OrderSummaryActivity$onCreate$1$1$1$1$1$1", f = "OrderSummaryActivity.kt", l = {143}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.meijer.activity.orders.OrderSummaryActivity$c$a$a$a, reason: collision with other inner class name */
                static final class C1689a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f110369a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ C17893M0 f110370b;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C1689a(this.f110370b, continuation);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1689a(C17893M0 c17893m0, Continuation<? super C1689a> continuation) {
                        super(2, continuation);
                        this.f110370b = c17893m0;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                        return ((C1689a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objF = IntrinsicsKt.f();
                        int i10 = this.f110369a;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                ResultKt.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.b(obj);
                            C17893M0 c17893m0 = this.f110370b;
                            this.f110369a = 1;
                            if (c17893m0.i(this) == objF) {
                                return objF;
                            }
                        }
                        return Unit.f142422a;
                    }
                }

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.OrderSummaryActivity$onCreate$1$1$1$3$1$1", f = "OrderSummaryActivity.kt", l = {159}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.meijer.activity.orders.OrderSummaryActivity$c$a$a$b */
                static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f110371a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ C17893M0 f110372b;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new b(this.f110372b, continuation);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    b(C17893M0 c17893m0, Continuation<? super b> continuation) {
                        super(2, continuation);
                        this.f110372b = c17893m0;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                        return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objF = IntrinsicsKt.f();
                        int i10 = this.f110371a;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                ResultKt.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.b(obj);
                            C17893M0 c17893m0 = this.f110372b;
                            this.f110371a = 1;
                            if (c17893m0.i(this) == objF) {
                                return objF;
                            }
                        }
                        return Unit.f142422a;
                    }
                }

                C1688a(LocalThemeScope localThemeScope, InterfaceC16622O interfaceC16622O, C17893M0 c17893m0, OrderSummaryActivity orderSummaryActivity, InterfaceC5730l0<Boolean> interfaceC5730l0, z1<U.ViewState> z1Var, InterfaceC5730l0<Boolean> interfaceC5730l02, InterfaceC5730l0<Boolean> interfaceC5730l03, InterfaceC5730l0<Boolean> interfaceC5730l04) {
                    this.f110360a = localThemeScope;
                    this.f110361b = interfaceC16622O;
                    this.f110362c = c17893m0;
                    this.f110363d = orderSummaryActivity;
                    this.f110364e = interfaceC5730l0;
                    this.f110365f = z1Var;
                    this.f110366g = interfaceC5730l02;
                    this.f110367h = interfaceC5730l03;
                    this.f110368i = interfaceC5730l04;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit e(InterfaceC16622O interfaceC16622O, OrderSummaryActivity orderSummaryActivity, C17893M0 c17893m0) {
                    C16648k.d(interfaceC16622O, null, null, new C1689a(c17893m0, null), 3, null);
                    orderSummaryActivity.J1();
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit g(InterfaceC16622O interfaceC16622O, OrderSummaryActivity orderSummaryActivity, C17893M0 c17893m0) {
                    C16648k.d(interfaceC16622O, null, null, new b(c17893m0, null), 3, null);
                    orderSummaryActivity.J1();
                    return Unit.f142422a;
                }

                public final void d(InterfaceC14814f ModalBottomSheetLayout, Composer composer, int i10) {
                    Intrinsics.j(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1076201906, i10, -1, "com.meijer.mobile.meijer.activity.orders.OrderSummaryActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (OrderSummaryActivity.kt:130)");
                    }
                    if (a.v(this.f110364e)) {
                        composer.startReplaceGroup(-799708369);
                        LocalThemeScope localThemeScope = this.f110360a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        AbstractC5607a bottomSheetHeader = a.q(this.f110365f).getBottomSheetHeader();
                        AbstractC5607a bottomSheetButtonLabel = a.q(this.f110365f).getBottomSheetButtonLabel();
                        boolean showInformation = a.q(this.f110365f).getShowInformation();
                        boolean zX = a.x(this.f110366g);
                        boolean z10 = a.z(this.f110367h);
                        boolean zR = a.r(this.f110368i);
                        List<C14282c> listG = a.q(this.f110365f).getOrderDetailSummaryDecorator().g();
                        if (listG == null) {
                            listG = CollectionsKt.m();
                        }
                        List<EbtTransactionItemDecorator> listL = a.q(this.f110365f).getOrderDetailSummaryDecorator().l();
                        if (listL == null) {
                            listL = CollectionsKt.m();
                        }
                        composer.startReplaceGroup(-1746271574);
                        boolean zD = composer.D(this.f110361b) | composer.D(this.f110362c) | composer.D(this.f110363d);
                        final InterfaceC16622O interfaceC16622O = this.f110361b;
                        final OrderSummaryActivity orderSummaryActivity = this.f110363d;
                        final C17893M0 c17893m0 = this.f110362c;
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.orders.f0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return OrderSummaryActivity.c.a.C1688a.e(interfaceC16622O, orderSummaryActivity, c17893m0);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        int i11 = LocalThemeScope.f15770g | 48;
                        int i12 = AbstractC5607a.f45514b;
                        List<C14282c> list = listG;
                        List<EbtTransactionItemDecorator> list2 = listL;
                        C13919d.d(localThemeScope, companion, bottomSheetHeader, bottomSheetButtonLabel, showInformation, zX, z10, zR, list, list2, (Function0) objB, composer, (i12 << 9) | i11 | (i12 << 6), 0, 0);
                        composer.P();
                    } else {
                        composer.startReplaceGroup(-798535484);
                        LocalThemeScope localThemeScope2 = this.f110360a;
                        MockedPromo mockedPromo = new MockedPromo(ln.m.f148999c, a.q(this.f110365f).p());
                        composer.startReplaceGroup(5004770);
                        boolean zD2 = composer.D(this.f110363d);
                        final OrderSummaryActivity orderSummaryActivity2 = this.f110363d;
                        Object objB2 = composer.B();
                        if (zD2 || objB2 == Composer.INSTANCE.a()) {
                            objB2 = new Function2() { // from class: com.meijer.mobile.meijer.activity.orders.g0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return OrderSummaryActivity.c.a.C1688a.f(orderSummaryActivity2, ((Integer) obj).intValue(), ((Boolean) obj2).booleanValue());
                                }
                            };
                            composer.t(objB2);
                        }
                        Function2 function2 = (Function2) objB2;
                        composer.P();
                        composer.startReplaceGroup(-1746271574);
                        boolean zD3 = composer.D(this.f110361b) | composer.D(this.f110362c) | composer.D(this.f110363d);
                        final InterfaceC16622O interfaceC16622O2 = this.f110361b;
                        final OrderSummaryActivity orderSummaryActivity3 = this.f110363d;
                        final C17893M0 c17893m02 = this.f110362c;
                        Object objB3 = composer.B();
                        if (zD3 || objB3 == Composer.INSTANCE.a()) {
                            objB3 = new Function0() { // from class: com.meijer.mobile.meijer.activity.orders.h0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return OrderSummaryActivity.c.a.C1688a.g(interfaceC16622O2, orderSummaryActivity3, c17893m02);
                                }
                            };
                            composer.t(objB3);
                        }
                        composer.P();
                        ln.i.i(localThemeScope2, mockedPromo, null, function2, (Function0) objB3, composer, LocalThemeScope.f15770g, 2);
                        composer.P();
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
                    d(interfaceC14814f, composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit f(OrderSummaryActivity orderSummaryActivity, int i10, boolean z10) {
                    orderSummaryActivity.L1().G(new U.d.UpdateStackedPromosExpandedView(i10, z10));
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f110373a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ OrderSummaryActivity f110374b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z1<U.ViewState> f110375c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC16622O f110376d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ C17893M0 f110377e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Function0<qv.C0> f110378f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ Function0<qv.C0> f110379g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<Boolean> f110380h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<Boolean> f110381i;

                /* renamed from: j, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<Boolean> f110382j;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.orders.OrderSummaryActivity$c$a$b$a, reason: collision with other inner class name */
                /* synthetic */ class C1690a extends FunctionReferenceImpl implements Function1<U.d, Unit> {
                    C1690a(Object obj) {
                        super(1, obj, rn.U.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/orders/viewmodel/OrderSummaryViewModel$OrderSummaryAction;)V", 0);
                    }

                    public final void a(U.d p02) {
                        Intrinsics.j(p02, "p0");
                        ((rn.U) this.receiver).G(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(U.d dVar) {
                        a(dVar);
                        return Unit.f142422a;
                    }
                }

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.OrderSummaryActivity$onCreate$1$1$2$5$10$1", f = "OrderSummaryActivity.kt", l = {297}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.meijer.activity.orders.OrderSummaryActivity$c$a$b$b, reason: collision with other inner class name */
                static final class C1691b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f110383a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ C17893M0 f110384b;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C1691b(this.f110384b, continuation);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1691b(C17893M0 c17893m0, Continuation<? super C1691b> continuation) {
                        super(2, continuation);
                        this.f110384b = c17893m0;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                        return ((C1691b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objF = IntrinsicsKt.f();
                        int i10 = this.f110383a;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                ResultKt.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.b(obj);
                            C17893M0 c17893m0 = this.f110384b;
                            this.f110383a = 1;
                            if (c17893m0.i(this) == objF) {
                                return objF;
                            }
                        }
                        return Unit.f142422a;
                    }
                }

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.OrderSummaryActivity$onCreate$1$1$2$5$3$1", f = "OrderSummaryActivity.kt", l = {218}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.meijer.activity.orders.OrderSummaryActivity$c$a$b$c, reason: collision with other inner class name */
                static final class C1692c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f110385a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ C17927c1 f110386b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ U.e f110387c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ OrderSummaryActivity f110388d;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.meijer.mobile.meijer.activity.orders.OrderSummaryActivity$c$a$b$c$a, reason: collision with other inner class name */
                    public /* synthetic */ class C1693a {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[EnumC17969q1.values().length];
                            try {
                                iArr[EnumC17969q1.f168637b.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C1692c(this.f110386b, this.f110387c, this.f110388d, continuation);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1692c(C17927c1 c17927c1, U.e eVar, OrderSummaryActivity orderSummaryActivity, Continuation<? super C1692c> continuation) {
                        super(2, continuation);
                        this.f110386b = c17927c1;
                        this.f110387c = eVar;
                        this.f110388d = orderSummaryActivity;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                        return ((C1692c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objF = IntrinsicsKt.f();
                        int i10 = this.f110385a;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                ResultKt.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.b(obj);
                            C17963o1 snackbarHostState = this.f110386b.getSnackbarHostState();
                            String strB = ((U.e.ItemSuccessfullyAdded) this.f110387c).getMessage().b(this.f110388d);
                            String strB2 = ((U.e.ItemSuccessfullyAdded) this.f110387c).getAction().b(this.f110388d);
                            EnumC17957m1 enumC17957m1 = EnumC17957m1.f168342a;
                            this.f110385a = 1;
                            obj = snackbarHostState.d(strB, strB2, enumC17957m1, this);
                            if (obj == objF) {
                                return objF;
                            }
                        }
                        OrderSummaryActivity orderSummaryActivity = this.f110388d;
                        if (C1693a.$EnumSwitchMapping$0[((EnumC17969q1) obj).ordinal()] == 1) {
                            orderSummaryActivity.startActivity(orderSummaryActivity.getFeatureEntryPoint().d());
                        }
                        return Unit.f142422a;
                    }
                }

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.OrderSummaryActivity$onCreate$1$1$2$5$4$1", f = "OrderSummaryActivity.kt", l = {240}, m = "invokeSuspend")
                static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f110389a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ C17927c1 f110390b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ U.e f110391c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ OrderSummaryActivity f110392d;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new d(this.f110390b, this.f110391c, this.f110392d, continuation);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    d(C17927c1 c17927c1, U.e eVar, OrderSummaryActivity orderSummaryActivity, Continuation<? super d> continuation) {
                        super(2, continuation);
                        this.f110390b = c17927c1;
                        this.f110391c = eVar;
                        this.f110392d = orderSummaryActivity;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                        return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objF = IntrinsicsKt.f();
                        int i10 = this.f110389a;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                ResultKt.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.b(obj);
                            C17963o1 snackbarHostState = this.f110390b.getSnackbarHostState();
                            String strB = ((U.e.ItemNotAddedError) this.f110391c).getMessage().b(this.f110392d);
                            EnumC17957m1 enumC17957m1 = EnumC17957m1.f168342a;
                            this.f110389a = 1;
                            if (C17963o1.e(snackbarHostState, strB, null, enumC17957m1, this, 2, null) == objF) {
                                return objF;
                            }
                        }
                        return Unit.f142422a;
                    }
                }

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.OrderSummaryActivity$onCreate$1$1$2$5$9$1", f = "OrderSummaryActivity.kt", l = {295}, m = "invokeSuspend")
                static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f110393a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ C17893M0 f110394b;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new e(this.f110394b, continuation);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    e(C17893M0 c17893m0, Continuation<? super e> continuation) {
                        super(2, continuation);
                        this.f110394b = c17893m0;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                        return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objF = IntrinsicsKt.f();
                        int i10 = this.f110393a;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                ResultKt.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.b(obj);
                            C17893M0 c17893m0 = this.f110394b;
                            this.f110393a = 1;
                            if (c17893m0.l(this) == objF) {
                                return objF;
                            }
                        }
                        return Unit.f142422a;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                b(LocalThemeScope localThemeScope, OrderSummaryActivity orderSummaryActivity, z1<U.ViewState> z1Var, InterfaceC16622O interfaceC16622O, C17893M0 c17893m0, Function0<? extends qv.C0> function0, Function0<? extends qv.C0> function02, InterfaceC5730l0<Boolean> interfaceC5730l0, InterfaceC5730l0<Boolean> interfaceC5730l02, InterfaceC5730l0<Boolean> interfaceC5730l03) {
                    this.f110373a = localThemeScope;
                    this.f110374b = orderSummaryActivity;
                    this.f110375c = z1Var;
                    this.f110376d = interfaceC16622O;
                    this.f110377e = c17893m0;
                    this.f110378f = function0;
                    this.f110379g = function02;
                    this.f110380h = interfaceC5730l0;
                    this.f110381i = interfaceC5730l02;
                    this.f110382j = interfaceC5730l03;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    o(composer, num.intValue());
                    return Unit.f142422a;
                }

                public final void o(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(885000747, i10, -1, "com.meijer.mobile.meijer.activity.orders.OrderSummaryActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (OrderSummaryActivity.kt:165)");
                    }
                    C17927c1 c17927c1G = C17921a1.g(null, null, composer, 0, 3);
                    LocalThemeScope localThemeScope = this.f110373a;
                    U.ViewState viewStateQ = a.q(this.f110375c);
                    String strC = C16193g.c(com.meijer.mobile.meijer.Y.f100375v7, composer, 0);
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f110374b);
                    final OrderSummaryActivity orderSummaryActivity = this.f110374b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.orders.i0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OrderSummaryActivity.c.a.b.p(orderSummaryActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    Function0 function0 = (Function0) objB;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean zD2 = composer.D(this.f110374b);
                    final OrderSummaryActivity orderSummaryActivity2 = this.f110374b;
                    Object objB2 = composer.B();
                    if (zD2 || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.orders.j0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OrderSummaryActivity.c.a.b.w(orderSummaryActivity2);
                            }
                        };
                        composer.t(objB2);
                    }
                    Function0 function02 = (Function0) objB2;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean zD3 = composer.D(this.f110374b);
                    final OrderSummaryActivity orderSummaryActivity3 = this.f110374b;
                    Object objB3 = composer.B();
                    if (zD3 || objB3 == Composer.INSTANCE.a()) {
                        objB3 = new Function0() { // from class: com.meijer.mobile.meijer.activity.orders.k0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OrderSummaryActivity.c.a.b.x(orderSummaryActivity3);
                            }
                        };
                        composer.t(objB3);
                    }
                    Function0 function03 = (Function0) objB3;
                    composer.P();
                    boolean zE = this.f110374b.getFeatureManager().e(AbstractC18227f.U.f170560h);
                    int itemCount = a.q(this.f110375c).getCartDecorator().getItemCount();
                    Object objL1 = this.f110374b.L1();
                    composer.startReplaceGroup(5004770);
                    boolean zD4 = composer.D(objL1);
                    Object objB4 = composer.B();
                    if (zD4 || objB4 == Composer.INSTANCE.a()) {
                        objB4 = new C1690a(objL1);
                        composer.t(objB4);
                    }
                    composer.P();
                    hn.m0.T(localThemeScope, viewStateQ, null, c17927c1G, strC, function0, function02, function03, zE, itemCount, (Function1) ((KFunction) objB4), composer, LocalThemeScope.f15770g, 0, 2);
                    final U.e eVarA = a.q(this.f110375c).k().a();
                    if (eVarA != null) {
                        final OrderSummaryActivity orderSummaryActivity4 = this.f110374b;
                        InterfaceC16622O interfaceC16622O = this.f110376d;
                        C17893M0 c17893m0 = this.f110377e;
                        Function0<qv.C0> function04 = this.f110378f;
                        Function0<qv.C0> function05 = this.f110379g;
                        InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f110380h;
                        InterfaceC5730l0<Boolean> interfaceC5730l02 = this.f110381i;
                        InterfaceC5730l0<Boolean> interfaceC5730l03 = this.f110382j;
                        if (eVarA instanceof U.e.d) {
                            composer.startReplaceGroup(-1866767226);
                            C14886b message = new C14886b(orderSummaryActivity4).setTitle(com.meijer.mobile.meijer.Y.f99806S9).setCancelable(false).setMessage(com.meijer.mobile.meijer.Y.f99787R9);
                            int i11 = yr.Q.f170986b;
                            composer.startReplaceGroup(5004770);
                            boolean zD5 = composer.D(orderSummaryActivity4);
                            Object objB5 = composer.B();
                            if (zD5 || objB5 == Composer.INSTANCE.a()) {
                                objB5 = new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.orders.l0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i12) {
                                        OrderSummaryActivity.c.a.b.v(orderSummaryActivity4, dialogInterface, i12);
                                    }
                                };
                                composer.t(objB5);
                            }
                            composer.P();
                            message.setPositiveButton(i11, (DialogInterface.OnClickListener) objB5).show();
                            composer.P();
                        } else if (eVarA instanceof U.e.a) {
                            composer.startReplaceGroup(-1866072826);
                            C14886b message2 = new C14886b(orderSummaryActivity4).setTitle(com.meijer.mobile.meijer.Y.f100207n).setCancelable(false).setMessage(com.meijer.mobile.meijer.Y.f100187m);
                            int i12 = yr.Q.f170986b;
                            composer.startReplaceGroup(1849434622);
                            Object objB6 = composer.B();
                            if (objB6 == Composer.INSTANCE.a()) {
                                objB6 = new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.orders.m0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i13) {
                                        OrderSummaryActivity.c.a.b.q(dialogInterface, i13);
                                    }
                                };
                                composer.t(objB6);
                            }
                            composer.P();
                            message2.setPositiveButton(i12, (DialogInterface.OnClickListener) objB6).show();
                            composer.P();
                        } else if (eVarA instanceof U.e.GoToSavingsLinkEvent) {
                            composer.startReplaceGroup(-1865452082);
                            composer.P();
                            orderSummaryActivity4.O1(((U.e.GoToSavingsLinkEvent) eVarA).getItem());
                            Unit unit = Unit.f142422a;
                        } else if (eVarA instanceof U.e.GoProductDetailEvent) {
                            composer.startReplaceGroup(-1865292773);
                            composer.P();
                            orderSummaryActivity4.clpResultLauncher.a(Al.g.t(orderSummaryActivity4.getFeatureEntryPoint(), ((U.e.GoProductDetailEvent) eVarA).getProduct(), false, false, null, 12, null));
                            Unit unit2 = Unit.f142422a;
                        } else if (eVarA instanceof U.e.ItemSuccessfullyAdded) {
                            composer.startReplaceGroup(-1864874335);
                            composer.startReplaceGroup(-1746271574);
                            boolean zV = composer.V(c17927c1G) | composer.V(eVarA) | composer.D(orderSummaryActivity4);
                            Object objB7 = composer.B();
                            if (zV || objB7 == Composer.INSTANCE.a()) {
                                objB7 = new C1692c(c17927c1G, eVarA, orderSummaryActivity4, null);
                                composer.t(objB7);
                            }
                            composer.P();
                            C16648k.d(interfaceC16622O, null, null, (Function2) objB7, 3, null);
                            composer.P();
                        } else if (eVarA instanceof U.e.ItemNotAddedError) {
                            composer.startReplaceGroup(-1863718934);
                            composer.startReplaceGroup(-1746271574);
                            boolean zV2 = composer.V(c17927c1G) | composer.V(eVarA) | composer.D(orderSummaryActivity4);
                            Object objB8 = composer.B();
                            if (zV2 || objB8 == Composer.INSTANCE.a()) {
                                objB8 = new d(c17927c1G, eVarA, orderSummaryActivity4, null);
                                composer.t(objB8);
                            }
                            composer.P();
                            C16648k.d(interfaceC16622O, null, null, (Function2) objB8, 3, null);
                            composer.P();
                        } else if (eVarA instanceof U.e.CartLoadingError) {
                            composer.startReplaceGroup(-1863240046);
                            U.e.CartLoadingError cartLoadingError = (U.e.CartLoadingError) eVarA;
                            C14886b message3 = new C14886b(orderSummaryActivity4).setTitle(cartLoadingError.getTitle().b(orderSummaryActivity4)).setMessage(cartLoadingError.getMessage().b(orderSummaryActivity4));
                            String strB = cartLoadingError.getPositiveButtonText().b(orderSummaryActivity4);
                            composer.startReplaceGroup(5004770);
                            boolean zD6 = composer.D(orderSummaryActivity4);
                            Object objB9 = composer.B();
                            if (zD6 || objB9 == Composer.INSTANCE.a()) {
                                objB9 = new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.orders.n0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i13) {
                                        OrderSummaryActivity.c.a.b.r(orderSummaryActivity4, dialogInterface, i13);
                                    }
                                };
                                composer.t(objB9);
                            }
                            composer.P();
                            message3.setPositiveButton(strB, (DialogInterface.OnClickListener) objB9).show();
                            composer.P();
                        } else if (eVarA instanceof U.e.ShowChokingWarningDialogEvent) {
                            composer.startReplaceGroup(-1862433085);
                            U.e.ShowChokingWarningDialogEvent showChokingWarningDialogEvent = (U.e.ShowChokingWarningDialogEvent) eVarA;
                            C14886b message4 = new C14886b(orderSummaryActivity4, Bj.p.f3060d).setTitle(showChokingWarningDialogEvent.a().getTitle()).setIcon(Bj.i.f2666J1).setCancelable(false).setMessage(showChokingWarningDialogEvent.a().getBody());
                            int positiveButtonText = showChokingWarningDialogEvent.a().getPositiveButtonText();
                            composer.startReplaceGroup(-1633490746);
                            boolean zD7 = composer.D(orderSummaryActivity4) | composer.V(eVarA);
                            Object objB10 = composer.B();
                            if (zD7 || objB10 == Composer.INSTANCE.a()) {
                                objB10 = new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.orders.o0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i13) {
                                        OrderSummaryActivity.c.a.b.s(orderSummaryActivity4, eVarA, dialogInterface, i13);
                                    }
                                };
                                composer.t(objB10);
                            }
                            composer.P();
                            C14886b positiveButton = message4.setPositiveButton(positiveButtonText, (DialogInterface.OnClickListener) objB10);
                            int negativeButtonText = showChokingWarningDialogEvent.a().getNegativeButtonText();
                            composer.startReplaceGroup(1849434622);
                            Object objB11 = composer.B();
                            if (objB11 == Composer.INSTANCE.a()) {
                                objB11 = new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.orders.p0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i13) {
                                        OrderSummaryActivity.c.a.b.t(dialogInterface, i13);
                                    }
                                };
                                composer.t(objB11);
                            }
                            composer.P();
                            positiveButton.setNegativeButton(negativeButtonText, (DialogInterface.OnClickListener) objB11).show();
                            composer.P();
                        } else if (eVarA instanceof U.e.OutOfStockDialogEvent) {
                            composer.startReplaceGroup(-1861175570);
                            U.e.OutOfStockDialogEvent outOfStockDialogEvent = (U.e.OutOfStockDialogEvent) eVarA;
                            C14886b message5 = new C14886b(orderSummaryActivity4).setTitle(outOfStockDialogEvent.getTitle().b(orderSummaryActivity4)).setMessage(outOfStockDialogEvent.getMessage().b(orderSummaryActivity4));
                            String strB2 = outOfStockDialogEvent.getPositiveButtonText().b(orderSummaryActivity4);
                            composer.startReplaceGroup(1849434622);
                            Object objB12 = composer.B();
                            if (objB12 == Composer.INSTANCE.a()) {
                                objB12 = new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.orders.q0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i13) {
                                        OrderSummaryActivity.c.a.b.u(dialogInterface, i13);
                                    }
                                };
                                composer.t(objB12);
                            }
                            composer.P();
                            message5.setPositiveButton(strB2, (DialogInterface.OnClickListener) objB12).show();
                            composer.P();
                        } else if (eVarA instanceof U.e.ViewAppliedOfferEvent) {
                            composer.startReplaceGroup(-1860461299);
                            if (((U.e.ViewAppliedOfferEvent) eVarA).getDisplayAppliedOffer()) {
                                composer.startReplaceGroup(-1860403856);
                                composer.startReplaceGroup(5004770);
                                boolean zD8 = composer.D(c17893m0);
                                Object objB13 = composer.B();
                                if (zD8 || objB13 == Composer.INSTANCE.a()) {
                                    objB13 = new e(c17893m0, null);
                                    composer.t(objB13);
                                }
                                composer.P();
                                C16648k.d(interfaceC16622O, null, null, (Function2) objB13, 3, null);
                                composer.P();
                            } else {
                                composer.startReplaceGroup(-1860272912);
                                composer.startReplaceGroup(5004770);
                                boolean zD9 = composer.D(c17893m0);
                                Object objB14 = composer.B();
                                if (zD9 || objB14 == Composer.INSTANCE.a()) {
                                    objB14 = new C1691b(c17893m0, null);
                                    composer.t(objB14);
                                }
                                composer.P();
                                C16648k.d(interfaceC16622O, null, null, (Function2) objB14, 3, null);
                                composer.P();
                            }
                            composer.P();
                        } else if (Intrinsics.e(eVarA, U.e.c.f159387a) || Intrinsics.e(eVarA, U.e.h.f159391a) || Intrinsics.e(eVarA, U.e.l.f159401a)) {
                            composer.startReplaceGroup(-1859972026);
                            composer.P();
                            Unit unit3 = Unit.f142422a;
                        } else if (eVarA instanceof U.e.p) {
                            composer.startReplaceGroup(-1859818297);
                            composer.P();
                            a.y(interfaceC5730l0, false);
                            a.s(interfaceC5730l02, false);
                            a.A(interfaceC5730l03, true);
                            function04.invoke();
                        } else if (eVarA instanceof U.e.g) {
                            composer.startReplaceGroup(-1859469733);
                            composer.P();
                            function05.invoke();
                        } else if (eVarA instanceof U.e.q) {
                            composer.startReplaceGroup(-1859302426);
                            composer.P();
                            a.y(interfaceC5730l0, false);
                            a.A(interfaceC5730l03, false);
                            a.s(interfaceC5730l02, false);
                            function04.invoke();
                        } else if (eVarA instanceof U.e.o) {
                            composer.startReplaceGroup(-1858951289);
                            composer.P();
                            a.s(interfaceC5730l02, false);
                            a.A(interfaceC5730l03, false);
                            a.y(interfaceC5730l0, true);
                            function04.invoke();
                        } else {
                            if (!(eVarA instanceof U.e.n)) {
                                composer.startReplaceGroup(1740903116);
                                composer.P();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer.startReplaceGroup(-1858592185);
                            composer.P();
                            a.y(interfaceC5730l0, false);
                            a.s(interfaceC5730l02, true);
                            a.A(interfaceC5730l03, false);
                            function04.invoke();
                        }
                        Unit unit4 = Unit.f142422a;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit p(OrderSummaryActivity orderSummaryActivity) {
                    orderSummaryActivity.onBackPressed();
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void q(DialogInterface dialogInterface, int i10) {
                    dialogInterface.dismiss();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void r(OrderSummaryActivity orderSummaryActivity, DialogInterface dialogInterface, int i10) {
                    dialogInterface.dismiss();
                    orderSummaryActivity.K1();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void s(OrderSummaryActivity orderSummaryActivity, U.e eVar, DialogInterface dialogInterface, int i10) {
                    dialogInterface.dismiss();
                    orderSummaryActivity.L1().G(new U.d.UserAcceptAddToCartAction(((U.e.ShowChokingWarningDialogEvent) eVar).a().b()));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void t(DialogInterface dialogInterface, int i10) {
                    dialogInterface.dismiss();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void u(DialogInterface dialogInterface, int i10) {
                    dialogInterface.dismiss();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void v(OrderSummaryActivity orderSummaryActivity, DialogInterface dialogInterface, int i10) {
                    dialogInterface.dismiss();
                    orderSummaryActivity.onBackPressed();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit w(OrderSummaryActivity orderSummaryActivity) {
                    orderSummaryActivity.M1();
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit x(OrderSummaryActivity orderSummaryActivity) {
                    orderSummaryActivity.L1().G(U.d.a.f159366a);
                    return Unit.f142422a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.OrderSummaryActivity$onCreate$1$1$closeSheet$1$1$1", f = "OrderSummaryActivity.kt", l = {117}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.meijer.activity.orders.OrderSummaryActivity$c$a$c, reason: collision with other inner class name */
            static final class C1694c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f110395a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17893M0 f110396b;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1694c(this.f110396b, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1694c(C17893M0 c17893m0, Continuation<? super C1694c> continuation) {
                    super(2, continuation);
                    this.f110396b = c17893m0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((C1694c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f110395a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C17893M0 c17893m0 = this.f110396b;
                        this.f110395a = 1;
                        if (c17893m0.i(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f142422a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.OrderSummaryActivity$onCreate$1$1$openSheet$1$1$1", f = "OrderSummaryActivity.kt", l = {121}, m = "invokeSuspend")
            static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f110397a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17893M0 f110398b;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new d(this.f110398b, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(C17893M0 c17893m0, Continuation<? super d> continuation) {
                    super(2, continuation);
                    this.f110398b = c17893m0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f110397a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C17893M0 c17893m0 = this.f110398b;
                        this.f110397a = 1;
                        if (c17893m0.l(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f142422a;
                }
            }

            a(OrderSummaryActivity orderSummaryActivity) {
                this.f110359a = orderSummaryActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final qv.C0 t(InterfaceC16622O interfaceC16622O, InterfaceC5730l0 interfaceC5730l0, C17893M0 c17893m0) {
                w(interfaceC5730l0, false);
                return C16648k.d(interfaceC16622O, null, null, new C1694c(c17893m0, null), 3, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final qv.C0 u(InterfaceC16622O interfaceC16622O, InterfaceC5730l0 interfaceC5730l0, C17893M0 c17893m0) {
                w(interfaceC5730l0, true);
                return C16648k.d(interfaceC16622O, null, null, new d(c17893m0, null), 3, null);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                p(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }

            public final void p(LocalThemeScope AdsTheme, Composer composer, int i10) {
                int i11;
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i11 = i10 | ((i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-370308220, i11, -1, "com.meijer.mobile.meijer.activity.orders.OrderSummaryActivity.onCreate.<anonymous>.<anonymous> (OrderSummaryActivity.kt:102)");
                }
                z1 z1VarB = o1.b(this.f110359a.L1().E(), null, composer, 0, 1);
                final C17893M0 c17893m0J = C17891L0.j(EnumC17895N0.f167226a, null, null, true, composer, 3078, 6);
                Object objB = composer.B();
                Composer.Companion companion = Composer.INSTANCE;
                if (objB == companion.a()) {
                    objB = androidx.compose.runtime.J.k(EmptyCoroutineContext.f142646a, composer);
                    composer.t(objB);
                }
                final InterfaceC16622O interfaceC16622O = (InterfaceC16622O) objB;
                composer.startReplaceGroup(1849434622);
                Object objB2 = composer.B();
                if (objB2 == companion.a()) {
                    objB2 = t1.e(Boolean.FALSE, null, 2, null);
                    composer.t(objB2);
                }
                final InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB2;
                composer.P();
                composer.startReplaceGroup(1849434622);
                Object objB3 = composer.B();
                if (objB3 == companion.a()) {
                    objB3 = t1.e(Boolean.FALSE, null, 2, null);
                    composer.t(objB3);
                }
                InterfaceC5730l0 interfaceC5730l02 = (InterfaceC5730l0) objB3;
                composer.P();
                composer.startReplaceGroup(1849434622);
                Object objB4 = composer.B();
                if (objB4 == companion.a()) {
                    objB4 = t1.e(Boolean.FALSE, null, 2, null);
                    composer.t(objB4);
                }
                InterfaceC5730l0 interfaceC5730l03 = (InterfaceC5730l0) objB4;
                composer.P();
                composer.startReplaceGroup(1849434622);
                Object objB5 = composer.B();
                if (objB5 == companion.a()) {
                    objB5 = t1.e(Boolean.FALSE, null, 2, null);
                    composer.t(objB5);
                }
                InterfaceC5730l0 interfaceC5730l04 = (InterfaceC5730l0) objB5;
                composer.P();
                composer.startReplaceGroup(-1746271574);
                boolean zD = composer.D(interfaceC16622O) | composer.D(c17893m0J);
                Object objB6 = composer.B();
                if (zD || objB6 == companion.a()) {
                    objB6 = new Function0() { // from class: com.meijer.mobile.meijer.activity.orders.d0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OrderSummaryActivity.c.a.t(interfaceC16622O, interfaceC5730l0, c17893m0J);
                        }
                    };
                    composer.t(objB6);
                }
                Function0 function0 = (Function0) objB6;
                composer.P();
                composer.startReplaceGroup(-1746271574);
                boolean zD2 = composer.D(interfaceC16622O) | composer.D(c17893m0J);
                Object objB7 = composer.B();
                if (zD2 || objB7 == companion.a()) {
                    objB7 = new Function0() { // from class: com.meijer.mobile.meijer.activity.orders.e0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OrderSummaryActivity.c.a.u(interfaceC16622O, interfaceC5730l0, c17893m0J);
                        }
                    };
                    composer.t(objB7);
                }
                composer.P();
                float f10 = 10;
                C17891L0.b(ComposableLambdaKt.c(1076201906, true, new C1688a(AdsTheme, interfaceC16622O, c17893m0J, this.f110359a, interfaceC5730l0, z1VarB, interfaceC5730l02, interfaceC5730l03, interfaceC5730l04), composer, 54), FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), c17893m0J, false, C16692i.e(H1.h.p(f10), H1.h.p(f10), 0.0f, 0.0f, 12, null), 0.0f, 0L, 0L, 0L, ComposableLambdaKt.c(885000747, true, new b(AdsTheme, this.f110359a, z1VarB, interfaceC16622O, c17893m0J, (Function0) objB7, function0, interfaceC5730l02, interfaceC5730l04, interfaceC5730l03), composer, 54), composer, (C17893M0.f167209e << 6) | 805306374, 488);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void A(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
                interfaceC5730l0.setValue(Boolean.valueOf(z10));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final U.ViewState q(z1<U.ViewState> z1Var) {
                return z1Var.getValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean r(InterfaceC5730l0<Boolean> interfaceC5730l0) {
                return interfaceC5730l0.getValue().booleanValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void s(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
                interfaceC5730l0.setValue(Boolean.valueOf(z10));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean v(InterfaceC5730l0<Boolean> interfaceC5730l0) {
                return interfaceC5730l0.getValue().booleanValue();
            }

            private static final void w(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
                interfaceC5730l0.setValue(Boolean.valueOf(z10));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean x(InterfaceC5730l0<Boolean> interfaceC5730l0) {
                return interfaceC5730l0.getValue().booleanValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void y(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
                interfaceC5730l0.setValue(Boolean.valueOf(z10));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean z(InterfaceC5730l0<Boolean> interfaceC5730l0) {
                return interfaceC5730l0.getValue().booleanValue();
            }
        }

        c() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1846690379, i10, -1, "com.meijer.mobile.meijer.activity.orders.OrderSummaryActivity.onCreate.<anonymous> (OrderSummaryActivity.kt:101)");
            }
            Ji.K.b(null, ComposableLambdaKt.c(-370308220, true, new a(OrderSummaryActivity.this), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f110399f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f110399f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f110399f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f110400f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f110400f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f110400f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f110401f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f110402g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f110401f = function0;
            this.f110402g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f110401f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f110402g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N1(C14145a result) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final rn.U L1() {
        return (rn.U) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M1() {
        startActivity(new Intent(this, (Class<?>) CartActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O1(ReadOnlyProductListDecorator item) {
        C17829a.f166179a.a(CartProductSavingsDialogFragment.INSTANCE.a(CartProductSavingsDecorator.INSTANCE.a(item)), this, "cart_product_savings_dialog_fragment");
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.j(item, "item");
        finishAfterTransition();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J1() {
        L1().G(new U.d.ViewAppliedOffer(false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K1() {
        List parcelableArrayListExtra;
        List parcelableArrayListExtra2;
        String stringExtra = getIntent().getStringExtra("orderID");
        if (stringExtra != null) {
            rn.U uL1 = L1();
            Intent intent = getIntent();
            Intrinsics.i(intent, "getIntent(...)");
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                parcelableArrayListExtra = intent.getParcelableArrayListExtra("orderSubstitutionList", OrderSubstitutionItem.class);
            } else {
                parcelableArrayListExtra = intent.getParcelableArrayListExtra("orderSubstitutionList");
            }
            if (parcelableArrayListExtra == null) {
                parcelableArrayListExtra = CollectionsKt.m();
            }
            Intent intent2 = getIntent();
            Intrinsics.i(intent2, "getIntent(...)");
            if (i10 >= 33) {
                parcelableArrayListExtra2 = intent2.getParcelableArrayListExtra("orderOutOfStockList", OrderOutOfStockItem.class);
            } else {
                parcelableArrayListExtra2 = intent2.getParcelableArrayListExtra("orderOutOfStockList");
            }
            if (parcelableArrayListExtra2 == null) {
                parcelableArrayListExtra2 = CollectionsKt.m();
            }
            uL1.G(new U.d.FetchDetails(stringExtra, parcelableArrayListExtra, parcelableArrayListExtra2));
            return;
        }
        finish();
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-1846690379, true, new c()), 1, null);
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        K1();
    }
}
