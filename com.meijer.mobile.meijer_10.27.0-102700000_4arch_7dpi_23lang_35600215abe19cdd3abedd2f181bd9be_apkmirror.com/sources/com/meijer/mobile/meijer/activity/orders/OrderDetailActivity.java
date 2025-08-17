package com.meijer.mobile.meijer.activity.orders;

import Ji.LocalThemeScope;
import Pj.DialogEvent;
import V0.C5346q0;
import V2.CreationExtras;
import ak.AbstractC5607a;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
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
import com.meijer.mobile.meijer.activity.home.HomeFragment;
import com.meijer.mobile.meijer.activity.orders.OrderDetailActivity;
import e.C13588d;
import e.C13589e;
import es.AbstractC13757b;
import fn.C13919d;
import gn.C14282c;
import gn.EbtTransactionItemDecorator;
import hn.C14534g;
import j0.InterfaceC14794C;
import j0.InterfaceC14814f;
import java.io.IOException;
import java.util.List;
import je.C14886b;
import ji.q1;
import kotlin.C17889K0;
import kotlin.C17891L0;
import kotlin.C17893M0;
import kotlin.C17921a1;
import kotlin.C17927c1;
import kotlin.Deprecated;
import kotlin.EnumC17895N0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15339A;
import l0.C15340B;
import on.C16105b;
import qv.C16648k;
import qv.InterfaceC16622O;
import r0.C16692i;
import r0.RoundedCornerShape;
import rn.L;
import tp.Builder;
import tp.EnumC17127a;
import uo.OrderOutOfStockItem;
import vo.OrderSubstitutionItem;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 T2\u00020\u0001:\u0001UB\u0007¢\u0006\u0004\b\u0002\u0010\u0003JH\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0003J#\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\n\u0010\u0017\u001a\u00060\u0014j\u0002`\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001b\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u0003J+\u0010\"\u001a\u00020\u000b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001dH\u0002¢\u0006\u0004\b\"\u0010#JK\u0010*\u001a\u00020\u000b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u00142\f\u0010)\u001a\b\u0012\u0004\u0012\u00020 0\u001dH\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u000bH\u0002¢\u0006\u0004\b,\u0010\u0003J\u001f\u00101\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u001f\u00104\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\u000b2\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020:H\u0002¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020:H\u0002¢\u0006\u0004\b>\u0010<J\u0017\u0010?\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020:H\u0002¢\u0006\u0004\b?\u0010<J\u0017\u0010@\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020:H\u0002¢\u0006\u0004\b@\u0010<J\u0017\u0010A\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020:H\u0002¢\u0006\u0004\bA\u0010<J\u0017\u0010B\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020:H\u0002¢\u0006\u0004\bB\u0010<J\u0017\u0010C\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020:H\u0002¢\u0006\u0004\bC\u0010<J\u0017\u0010D\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020:H\u0002¢\u0006\u0004\bD\u0010<J\u001f\u0010E\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u00072\u0006\u0010=\u001a\u00020:H\u0002¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020:H\u0002¢\u0006\u0004\bG\u0010<J\u0019\u0010J\u001a\u00020\u000b2\b\u0010I\u001a\u0004\u0018\u00010HH\u0014¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\u000bH\u0014¢\u0006\u0004\bL\u0010\u0003J\u000f\u0010M\u001a\u00020\u000bH\u0017¢\u0006\u0004\bM\u0010\u0003R\u001b\u0010S\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R¨\u0006Y²\u0006\f\u0010W\u001a\u00020V8\nX\u008a\u0084\u0002²\u0006\u000e\u0010X\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orders/OrderDetailActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "<init>", "()V", "Lrn/L$g;", "event", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "showInformationSheet", "", "onOpenBottomSheet", "Lkotlin/Function0;", "onCloseBottomSheet", "i2", "(Lrn/L$g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "l2", "k2", "n2", "", "orderType", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "g2", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "j2", "f2", "W2", "", "Lvo/a;", "orderSubstitutionList", "Luo/a;", "orderOutOfStockList", "Z2", "(Ljava/util/List;Ljava/util/List;)V", "listSubstitutedItems", "Lvo/b;", "screenType", "isOnMyWayClicked", "pickupPersonName", "listOutOfStockItems", "Y2", "(Ljava/util/List;Lvo/b;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "X2", "Ltp/b;", "rateAndTip", "Ltp/a;", "flowType", "a3", "(Ltp/b;Ltp/a;)V", "startDestination", "V2", "(Ljava/lang/String;Ljava/lang/String;)V", "", "storeId", "m2", "(I)V", "LPj/b;", "y2", "(LPj/b;)V", "dialogEvent", "r2", "o2", "E2", "K2", "H2", "B2", "R2", "O2", "(ZLPj/b;)V", "v2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onBackPressed", "Lrn/L;", "s", "Lkotlin/Lazy;", "h2", "()Lrn/L;", "viewModel", "t", "a", "Lrn/L$h;", "viewState", "displayInformationSheet", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class OrderDetailActivity extends Hilt_OrderDetailActivity {

    /* renamed from: u, reason: collision with root package name */
    public static final int f110286u = 8;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new androidx.view.e0(Reflection.b(rn.L.class), new d(this), new c(this), new e(null, this));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.OrderDetailActivity$onCreate$1$1$1$1", f = "OrderDetailActivity.kt", l = {133}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f110289a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17893M0 f110290b;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f110290b, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C17893M0 c17893m0, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f110290b = c17893m0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f110289a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17893M0 c17893m0 = this.f110290b;
                    this.f110289a = 1;
                    if (c17893m0.i(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.orders.OrderDetailActivity$b$b, reason: collision with other inner class name */
        static final class C1682b implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C17893M0 f110291a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f110292b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ OrderDetailActivity f110293c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ z1<L.OrderDetailsViewState> f110294d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f110295e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C17927c1 f110296f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C15339A f110297g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function0<qv.C0> f110298h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Function0<qv.C0> f110299i;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.orders.OrderDetailActivity$b$b$a */
            static final class a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f110300a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ OrderDetailActivity f110301b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z1<L.OrderDetailsViewState> f110302c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<Boolean> f110303d;

                a(LocalThemeScope localThemeScope, OrderDetailActivity orderDetailActivity, z1<L.OrderDetailsViewState> z1Var, InterfaceC5730l0<Boolean> interfaceC5730l0) {
                    this.f110300a = localThemeScope;
                    this.f110301b = orderDetailActivity;
                    this.f110302c = z1Var;
                    this.f110303d = interfaceC5730l0;
                }

                public final void b(InterfaceC14814f ModalBottomSheetLayout, Composer composer, int i10) {
                    Intrinsics.j(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-893957356, i10, -1, "com.meijer.mobile.meijer.activity.orders.OrderDetailActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (OrderDetailActivity.kt:141)");
                    }
                    AbstractC5607a bottomSheetHeader = b.k(this.f110302c).getBottomSheetHeader();
                    AbstractC5607a bottomSheetButtonLabel = b.k(this.f110302c).getBottomSheetButtonLabel();
                    boolean showPreAuthMessage = b.k(this.f110302c).getShowPreAuthMessage();
                    boolean zL = b.l(this.f110303d);
                    List<EbtTransactionItemDecorator> listI = b.k(this.f110302c).i();
                    boolean showEBTBottomSheet = b.k(this.f110302c).getShowEBTBottomSheet();
                    boolean showCreditCardBottomSheet = b.k(this.f110302c).getShowCreditCardBottomSheet();
                    List<C14282c> listG = b.k(this.f110302c).g();
                    LocalThemeScope localThemeScope = this.f110300a;
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f110301b);
                    final OrderDetailActivity orderDetailActivity = this.f110301b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.orders.E
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OrderDetailActivity.b.C1682b.a.c(orderDetailActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    Function0 function0 = (Function0) objB;
                    composer.P();
                    int i11 = LocalThemeScope.f15770g;
                    int i12 = AbstractC5607a.f45514b;
                    C13919d.d(localThemeScope, null, bottomSheetHeader, bottomSheetButtonLabel, showPreAuthMessage, zL, showEBTBottomSheet, showCreditCardBottomSheet, listG, listI, function0, composer, (i12 << 9) | i11 | (i12 << 6), 0, 1);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
                    b(interfaceC14814f, composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(OrderDetailActivity orderDetailActivity) {
                    orderDetailActivity.h2().M0(L.f.k.f159152a);
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.orders.OrderDetailActivity$b$b$b, reason: collision with other inner class name */
            static final class C1683b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C17927c1 f110304a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f110305b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ OrderDetailActivity f110306c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ z1<L.OrderDetailsViewState> f110307d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ C15339A f110308e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Function0<qv.C0> f110309f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ Function0<qv.C0> f110310g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<Boolean> f110311h;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.orders.OrderDetailActivity$b$b$b$a */
                static final class a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f110312a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ OrderDetailActivity f110313b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ z1<L.OrderDetailsViewState> f110314c;

                    a(LocalThemeScope localThemeScope, OrderDetailActivity orderDetailActivity, z1<L.OrderDetailsViewState> z1Var) {
                        this.f110312a = localThemeScope;
                        this.f110313b = orderDetailActivity;
                        this.f110314c = z1Var;
                    }

                    public final void c(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-2121225838, i10, -1, "com.meijer.mobile.meijer.activity.orders.OrderDetailActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderDetailActivity.kt:164)");
                        }
                        LocalThemeScope localThemeScope = this.f110312a;
                        String strG2 = this.f110313b.g2(b.k(this.f110314c).getOrderType(), b.k(this.f110314c).getOrderId());
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(this.f110313b);
                        final OrderDetailActivity orderDetailActivity = this.f110313b;
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.orders.H
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return OrderDetailActivity.b.C1682b.C1683b.a.d(orderDetailActivity);
                                }
                            };
                            composer.t(objB);
                        }
                        Function0 function0 = (Function0) objB;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD2 = composer.D(this.f110313b);
                        final OrderDetailActivity orderDetailActivity2 = this.f110313b;
                        Object objB2 = composer.B();
                        if (zD2 || objB2 == Composer.INSTANCE.a()) {
                            objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.orders.I
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return OrderDetailActivity.b.C1682b.C1683b.a.e(orderDetailActivity2);
                                }
                            };
                            composer.t(objB2);
                        }
                        composer.P();
                        C14534g.b(localThemeScope, null, strG2, false, function0, (Function0) objB2, b.k(this.f110314c).getCartDecorator().getItemCount(), composer, LocalThemeScope.f15770g, 5);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        c(composer, num.intValue());
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit d(OrderDetailActivity orderDetailActivity) {
                        orderDetailActivity.onBackPressed();
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit e(OrderDetailActivity orderDetailActivity) {
                        orderDetailActivity.l2();
                        return Unit.f142422a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.orders.OrderDetailActivity$b$b$b$b, reason: collision with other inner class name */
                static final class C1684b implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f110315a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ OrderDetailActivity f110316b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ z1<L.OrderDetailsViewState> f110317c;

                    C1684b(LocalThemeScope localThemeScope, OrderDetailActivity orderDetailActivity, z1<L.OrderDetailsViewState> z1Var) {
                        this.f110315a = localThemeScope;
                        this.f110316b = orderDetailActivity;
                        this.f110317c = z1Var;
                    }

                    public final void b(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(458142867, i10, -1, "com.meijer.mobile.meijer.activity.orders.OrderDetailActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderDetailActivity.kt:175)");
                        }
                        if (Intrinsics.e(b.k(this.f110317c).getIsOrderEditable(), Boolean.TRUE) && !b.k(this.f110317c).getProgressIsVisible()) {
                            LocalThemeScope localThemeScope = this.f110315a;
                            composer.startReplaceGroup(5004770);
                            boolean zD = composer.D(this.f110316b);
                            final OrderDetailActivity orderDetailActivity = this.f110316b;
                            Object objB = composer.B();
                            if (zD || objB == Composer.INSTANCE.a()) {
                                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.orders.J
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return OrderDetailActivity.b.C1682b.C1683b.C1684b.c(orderDetailActivity);
                                    }
                                };
                                composer.t(objB);
                            }
                            composer.P();
                            on.d.b(localThemeScope, null, (Function0) objB, composer, LocalThemeScope.f15770g, 1);
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        b(composer, num.intValue());
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit c(OrderDetailActivity orderDetailActivity) {
                        orderDetailActivity.h2().M0(L.f.h.f159147a);
                        return Unit.f142422a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.orders.OrderDetailActivity$b$b$b$c */
                static final class c implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f110318a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ C15339A f110319b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ OrderDetailActivity f110320c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ z1<L.OrderDetailsViewState> f110321d;

                    c(LocalThemeScope localThemeScope, C15339A c15339a, OrderDetailActivity orderDetailActivity, z1<L.OrderDetailsViewState> z1Var) {
                        this.f110318a = localThemeScope;
                        this.f110319b = c15339a;
                        this.f110320c = orderDetailActivity;
                        this.f110321d = z1Var;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit c(OrderDetailActivity orderDetailActivity, L.f action) {
                        Intrinsics.j(action, "action");
                        orderDetailActivity.h2().M0(action);
                        if (action instanceof L.f.x) {
                            orderDetailActivity.j2();
                        } else if (action instanceof L.f.ShowStoreInfo) {
                            orderDetailActivity.m2(((L.f.ShowStoreInfo) action).getStoreId());
                        }
                        return Unit.f142422a;
                    }

                    public final void b(InterfaceC14794C padding, Composer composer, int i10) {
                        int i11;
                        Intrinsics.j(padding, "padding");
                        if ((i10 & 6) == 0) {
                            i11 = i10 | (composer.V(padding) ? 4 : 2);
                        } else {
                            i11 = i10;
                        }
                        if ((i11 & 19) == 18 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1300000907, i11, -1, "com.meijer.mobile.meijer.activity.orders.OrderDetailActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderDetailActivity.kt:182)");
                        }
                        LocalThemeScope localThemeScope = this.f110318a;
                        Modifier modifierF = androidx.compose.foundation.layout.J.f(androidx.compose.foundation.b.d(androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, padding), 0.0f, 0.0f, 0.0f, H1.h.p(8), 7, null), this.f110318a.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null), 0.0f, 1, null);
                        C15339A c15339a = this.f110319b;
                        List<AbstractC13757b> listH = b.k(this.f110321d).h();
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(this.f110320c);
                        final OrderDetailActivity orderDetailActivity = this.f110320c;
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.orders.K
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return OrderDetailActivity.b.C1682b.C1683b.c.c(orderDetailActivity, (L.f) obj);
                                }
                            };
                            composer.t(objB);
                        }
                        Function1 function1 = (Function1) objB;
                        composer.P();
                        L.OrderDetailsViewState orderDetailsViewStateK = b.k(this.f110321d);
                        int i12 = LocalThemeScope.f15770g;
                        on.h.d(localThemeScope, modifierF, c15339a, listH, function1, orderDetailsViewStateK, composer, i12, 0);
                        C16105b.b(this.f110318a, b.k(this.f110321d).getProgressIsVisible(), composer, i12);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) {
                        b(interfaceC14794C, composer, num.intValue());
                        return Unit.f142422a;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                C1683b(C17927c1 c17927c1, LocalThemeScope localThemeScope, OrderDetailActivity orderDetailActivity, z1<L.OrderDetailsViewState> z1Var, C15339A c15339a, Function0<? extends qv.C0> function0, Function0<? extends qv.C0> function02, InterfaceC5730l0<Boolean> interfaceC5730l0) {
                    this.f110304a = c17927c1;
                    this.f110305b = localThemeScope;
                    this.f110306c = orderDetailActivity;
                    this.f110307d = z1Var;
                    this.f110308e = c15339a;
                    this.f110309f = function0;
                    this.f110310g = function02;
                    this.f110311h = interfaceC5730l0;
                }

                public final void c(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1229351475, i10, -1, "com.meijer.mobile.meijer.activity.orders.OrderDetailActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (OrderDetailActivity.kt:160)");
                    }
                    C17921a1.a(q1.h.c.f140075a.getModifier(), this.f110304a, ComposableLambdaKt.c(-2121225838, true, new a(this.f110305b, this.f110306c, this.f110307d), composer, 54), ComposableLambdaKt.c(458142867, true, new C1684b(this.f110305b, this.f110306c, this.f110307d), composer, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(1300000907, true, new c(this.f110305b, this.f110308e, this.f110306c, this.f110307d), composer, 54), composer, 3456, 12582912, 131056);
                    L.g gVarA = b.k(this.f110307d).k().a();
                    if (gVarA != null) {
                        OrderDetailActivity orderDetailActivity = this.f110306c;
                        final Function0<qv.C0> function0 = this.f110309f;
                        final Function0<qv.C0> function02 = this.f110310g;
                        final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f110311h;
                        composer.startReplaceGroup(-1633490746);
                        boolean zV = composer.V(function0);
                        Object objB = composer.B();
                        if (zV || objB == Composer.INSTANCE.a()) {
                            objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.orders.F
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return OrderDetailActivity.b.C1682b.C1683b.d(function0, interfaceC5730l0, ((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB);
                        }
                        Function1 function1 = (Function1) objB;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zV2 = composer.V(function02);
                        Object objB2 = composer.B();
                        if (zV2 || objB2 == Composer.INSTANCE.a()) {
                            objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.orders.G
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return OrderDetailActivity.b.C1682b.C1683b.e(function02);
                                }
                            };
                            composer.t(objB2);
                        }
                        composer.P();
                        orderDetailActivity.i2(gVarA, function1, (Function0) objB2);
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    c(composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit d(Function0 function0, InterfaceC5730l0 interfaceC5730l0, boolean z10) {
                    b.o(interfaceC5730l0, z10);
                    function0.invoke();
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit e(Function0 function0) {
                    function0.invoke();
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C1682b(C17893M0 c17893m0, boolean z10, OrderDetailActivity orderDetailActivity, z1<L.OrderDetailsViewState> z1Var, InterfaceC5730l0<Boolean> interfaceC5730l0, C17927c1 c17927c1, C15339A c15339a, Function0<? extends qv.C0> function0, Function0<? extends qv.C0> function02) {
                this.f110291a = c17893m0;
                this.f110292b = z10;
                this.f110293c = orderDetailActivity;
                this.f110294d = z1Var;
                this.f110295e = interfaceC5730l0;
                this.f110296f = c17927c1;
                this.f110297g = c15339a;
                this.f110298h = function0;
                this.f110299i = function02;
            }

            public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
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
                    ComposerKt.U(869898598, i11, -1, "com.meijer.mobile.meijer.activity.orders.OrderDetailActivity.onCreate.<anonymous>.<anonymous> (OrderDetailActivity.kt:137)");
                }
                float f10 = 10;
                RoundedCornerShape roundedCornerShapeE = C16692i.e(H1.h.p(f10), H1.h.p(f10), 0.0f, 0.0f, 12, null);
                composer.startReplaceGroup(-1546030186);
                long jC = (this.f110291a.k() || this.f110292b) ? C17889K0.f167100a.c(composer, C17889K0.f167103d) : C5346q0.INSTANCE.i();
                composer.P();
                C17891L0.b(ComposableLambdaKt.c(-893957356, true, new a(AdsTheme, this.f110293c, this.f110294d, this.f110295e), composer, 54), null, this.f110291a, false, roundedCornerShapeE, 0.0f, 0L, 0L, jC, ComposableLambdaKt.c(-1229351475, true, new C1683b(this.f110296f, AdsTheme, this.f110293c, this.f110294d, this.f110297g, this.f110298h, this.f110299i, this.f110295e), composer, 54), composer, (C17893M0.f167209e << 6) | 805306374, 234);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.OrderDetailActivity$onCreate$1$closeSheet$1$1$1", f = "OrderDetailActivity.kt", l = {116}, m = "invokeSuspend")
        static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f110322a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17893M0 f110323b;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new c(this.f110323b, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C17893M0 c17893m0, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f110323b = c17893m0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f110322a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17893M0 c17893m0 = this.f110323b;
                    this.f110322a = 1;
                    if (c17893m0.i(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.OrderDetailActivity$onCreate$1$openSheet$1$1$1", f = "OrderDetailActivity.kt", l = {119}, m = "invokeSuspend")
        static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f110324a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17893M0 f110325b;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new d(this.f110325b, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(C17893M0 c17893m0, Continuation<? super d> continuation) {
                super(2, continuation);
                this.f110325b = c17893m0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f110324a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17893M0 c17893m0 = this.f110325b;
                    this.f110324a = 1;
                    if (c17893m0.l(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final qv.C0 p(InterfaceC16622O interfaceC16622O, C17893M0 c17893m0) {
            return C16648k.d(interfaceC16622O, null, null, new c(c17893m0, null), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final qv.C0 q(InterfaceC16622O interfaceC16622O, C17893M0 c17893m0) {
            return C16648k.d(interfaceC16622O, null, null, new d(c17893m0, null), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit r(InterfaceC16622O interfaceC16622O, C17893M0 c17893m0) {
            C16648k.d(interfaceC16622O, null, null, new a(c17893m0, null), 3, null);
            return Unit.f142422a;
        }

        public final void g(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-34429993, i10, -1, "com.meijer.mobile.meijer.activity.orders.OrderDetailActivity.onCreate.<anonymous> (OrderDetailActivity.kt:105)");
            }
            z1 z1VarB = o1.b(OrderDetailActivity.this.h2().E0(), null, composer, 0, 1);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = androidx.compose.runtime.J.k(EmptyCoroutineContext.f142646a, composer);
                composer.t(objB);
            }
            final InterfaceC16622O interfaceC16622O = (InterfaceC16622O) objB;
            final C17893M0 c17893m0J = C17891L0.j(EnumC17895N0.f167226a, null, null, true, composer, 3078, 6);
            composer.startReplaceGroup(1849434622);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = t1.e(Boolean.FALSE, null, 2, null);
                composer.t(objB2);
            }
            InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB2;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(interfaceC16622O) | composer.D(c17893m0J);
            Object objB3 = composer.B();
            if (zD || objB3 == companion.a()) {
                objB3 = new Function0() { // from class: com.meijer.mobile.meijer.activity.orders.B
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OrderDetailActivity.b.p(interfaceC16622O, c17893m0J);
                    }
                };
                composer.t(objB3);
            }
            Function0 function0 = (Function0) objB3;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zD2 = composer.D(interfaceC16622O) | composer.D(c17893m0J);
            Object objB4 = composer.B();
            if (zD2 || objB4 == companion.a()) {
                objB4 = new Function0() { // from class: com.meijer.mobile.meijer.activity.orders.C
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OrderDetailActivity.b.q(interfaceC16622O, c17893m0J);
                    }
                };
                composer.t(objB4);
            }
            Function0 function02 = (Function0) objB4;
            composer.P();
            boolean z10 = c17893m0J.e() != c17893m0J.g();
            C15339A c15339aB = C15340B.b(0, 0, composer, 0, 3);
            boolean zK = c17893m0J.k();
            composer.startReplaceGroup(-1633490746);
            boolean zD3 = composer.D(interfaceC16622O) | composer.D(c17893m0J);
            Object objB5 = composer.B();
            if (zD3 || objB5 == companion.a()) {
                objB5 = new Function0() { // from class: com.meijer.mobile.meijer.activity.orders.D
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OrderDetailActivity.b.r(interfaceC16622O, c17893m0J);
                    }
                };
                composer.t(objB5);
            }
            composer.P();
            C13588d.a(zK, (Function0) objB5, composer, 0, 0);
            Ji.K.b(null, ComposableLambdaKt.c(869898598, true, new C1682b(c17893m0J, z10, OrderDetailActivity.this, z1VarB, interfaceC5730l0, C17921a1.g(null, null, composer, 0, 3), c15339aB, function02, function0), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            g(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final L.OrderDetailsViewState k(z1<L.OrderDetailsViewState> z1Var) {
            return z1Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean l(InterfaceC5730l0<Boolean> interfaceC5730l0) {
            return interfaceC5730l0.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void o(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
            interfaceC5730l0.setValue(Boolean.valueOf(z10));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f110326f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f110326f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f110326f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f110327f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f110327f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f110327f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f110328f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f110329g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f110328f = function0;
            this.f110329g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f110328f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f110329g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    private final void B2(DialogEvent dialogEvent) {
        Pj.c.a(dialogEvent, this, new Function2() { // from class: com.meijer.mobile.meijer.activity.orders.w
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return OrderDetailActivity.C2((C14886b) obj, (DialogEvent) obj2);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C2(C14886b toBuilder, DialogEvent event) {
        Intrinsics.j(toBuilder, "$this$toBuilder");
        Intrinsics.j(event, "event");
        toBuilder.setCancelable(false);
        bk.j.c(toBuilder, event.getPositiveButtonText(), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.orders.s
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                OrderDetailActivity.D2(dialogInterface, i10);
            }
        });
        return Unit.f142422a;
    }

    private final void E2(DialogEvent dialogEvent) {
        Pj.c.a(dialogEvent, this, new Function2() { // from class: com.meijer.mobile.meijer.activity.orders.e
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return OrderDetailActivity.F2(this.f110524a, (C14886b) obj, (DialogEvent) obj2);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F2(final OrderDetailActivity orderDetailActivity, C14886b toBuilder, DialogEvent it) {
        Intrinsics.j(toBuilder, "$this$toBuilder");
        Intrinsics.j(it, "it");
        toBuilder.setCancelable(false);
        bk.j.c(toBuilder, it.getPositiveButtonText(), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.orders.j
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) throws IOException {
                OrderDetailActivity.G2(this.f110543a, dialogInterface, i10);
            }
        });
        return Unit.f142422a;
    }

    private final void H2(DialogEvent dialogEvent) {
        Pj.c.a(dialogEvent, this, new Function2() { // from class: com.meijer.mobile.meijer.activity.orders.y
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return OrderDetailActivity.I2(this.f110566a, (C14886b) obj, (DialogEvent) obj2);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I2(final OrderDetailActivity orderDetailActivity, C14886b toBuilder, DialogEvent it) {
        Intrinsics.j(toBuilder, "$this$toBuilder");
        Intrinsics.j(it, "it");
        toBuilder.setCancelable(false);
        bk.j.c(toBuilder, it.getPositiveButtonText(), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.orders.k
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) throws IOException {
                OrderDetailActivity.J2(this.f110545a, dialogInterface, i10);
            }
        });
        return Unit.f142422a;
    }

    private final void K2(DialogEvent dialogEvent) {
        Pj.c.a(dialogEvent, this, new Function2() { // from class: com.meijer.mobile.meijer.activity.orders.v
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return OrderDetailActivity.L2(this.f110564a, (C14886b) obj, (DialogEvent) obj2);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L2(final OrderDetailActivity orderDetailActivity, C14886b toBuilder, DialogEvent event) {
        Intrinsics.j(toBuilder, "$this$toBuilder");
        Intrinsics.j(event, "event");
        toBuilder.setCancelable(false);
        bk.j.c(toBuilder, event.getPositiveButtonText(), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.orders.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                OrderDetailActivity.M2(this.f110530a, dialogInterface, i10);
            }
        });
        AbstractC5607a negativeButtonText = event.getNegativeButtonText();
        if (negativeButtonText != null) {
            bk.j.b(toBuilder, negativeButtonText, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.orders.g
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    OrderDetailActivity.N2(this.f110534a, dialogInterface, i10);
                }
            });
        }
        return Unit.f142422a;
    }

    private final void O2(final boolean isOnMyWayClicked, DialogEvent dialogEvent) {
        Pj.c.a(dialogEvent, this, new Function2() { // from class: com.meijer.mobile.meijer.activity.orders.u
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return OrderDetailActivity.P2(this.f110561a, isOnMyWayClicked, (C14886b) obj, (DialogEvent) obj2);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P2(final OrderDetailActivity orderDetailActivity, final boolean z10, C14886b toBuilder, DialogEvent event) {
        Intrinsics.j(toBuilder, "$this$toBuilder");
        Intrinsics.j(event, "event");
        toBuilder.setCancelable(false);
        bk.j.c(toBuilder, event.getPositiveButtonText(), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.orders.i
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                OrderDetailActivity.Q2(this.f110540a, z10, dialogInterface, i10);
            }
        });
        return Unit.f142422a;
    }

    private final void R2(DialogEvent dialogEvent) {
        Pj.c.a(dialogEvent, this, new Function2() { // from class: com.meijer.mobile.meijer.activity.orders.z
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return OrderDetailActivity.S2(this.f110572a, (C14886b) obj, (DialogEvent) obj2);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S2(final OrderDetailActivity orderDetailActivity, C14886b toBuilder, DialogEvent event) {
        Intrinsics.j(toBuilder, "$this$toBuilder");
        Intrinsics.j(event, "event");
        toBuilder.setCancelable(false);
        bk.j.c(toBuilder, event.getPositiveButtonText(), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.orders.o
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                OrderDetailActivity.T2(this.f110552a, dialogInterface, i10);
            }
        });
        AbstractC5607a negativeButtonText = event.getNegativeButtonText();
        if (negativeButtonText != null) {
            bk.j.b(toBuilder, negativeButtonText, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.orders.q
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    OrderDetailActivity.U2(this.f110556a, dialogInterface, i10);
                }
            });
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final rn.L h2() {
        return (rn.L) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i2(L.g event, Function1<? super Boolean, Unit> onOpenBottomSheet, Function0<Unit> onCloseBottomSheet) {
        if (event instanceof L.g.f) {
            W2();
            return;
        }
        if (event instanceof L.g.AnimateProgressBarEvent) {
            L.g.AnimateProgressBarEvent animateProgressBarEvent = (L.g.AnimateProgressBarEvent) event;
            h2().M0(new L.f.UpdateProgressIndicator(Float.valueOf(animateProgressBarEvent.getProgress()), Integer.valueOf((int) animateProgressBarEvent.getDuration()), animateProgressBarEvent.getProgressColor()));
            return;
        }
        if (event instanceof L.g.UpdateProgressBarWithOutAnimation) {
            h2().M0(new L.f.UpdateProgressIndicator(Float.valueOf(r8.getProgress()), null, ((L.g.UpdateProgressBarWithOutAnimation) event).getProgressColor(), 2, null));
            return;
        }
        if (event instanceof L.g.RateShopperEvent) {
            L.g.RateShopperEvent rateShopperEvent = (L.g.RateShopperEvent) event;
            a3(rateShopperEvent.getRateAndTip(), rateShopperEvent.getFlowType());
            return;
        }
        if (event instanceof L.g.OrderSummaryEvent) {
            L.g.OrderSummaryEvent orderSummaryEvent = (L.g.OrderSummaryEvent) event;
            Z2(orderSummaryEvent.b(), orderSummaryEvent.a());
            return;
        }
        if (event instanceof L.g.C2471g) {
            X2();
            return;
        }
        if (event instanceof L.g.CustomerCheckInEvent) {
            L.g.CustomerCheckInEvent customerCheckInEvent = (L.g.CustomerCheckInEvent) event;
            V2(customerCheckInEvent.getRoute(), customerCheckInEvent.getOrderType());
            return;
        }
        if (event instanceof L.g.NullOrderFailureDialogEvent) {
            y2(((L.g.NullOrderFailureDialogEvent) event).getDialogEvent());
            return;
        }
        if (event instanceof L.g.FailureDialogEvent) {
            y2(((L.g.FailureDialogEvent) event).getDialogEvent());
            return;
        }
        if (event instanceof L.g.CancelOrderWarningDialogEvent) {
            r2(((L.g.CancelOrderWarningDialogEvent) event).getDialogEvent());
            return;
        }
        if (event instanceof L.g.CancelOrderSuccessDialogEvent) {
            o2(((L.g.CancelOrderSuccessDialogEvent) event).getDialogEvent());
            return;
        }
        if (event instanceof L.g.OrderNotCancelableDialogEvent) {
            E2(((L.g.OrderNotCancelableDialogEvent) event).getDialogEvent());
            return;
        }
        if (event instanceof L.g.OrderNotEditableDialogEvent) {
            H2(((L.g.OrderNotEditableDialogEvent) event).getDialogEvent());
            return;
        }
        if (event instanceof L.g.MultiOrderUnderModificationDialogEvent) {
            B2(((L.g.MultiOrderUnderModificationDialogEvent) event).getDialogEvent());
            return;
        }
        if (event instanceof L.g.ReplaceCurrentCartWarningDialogEvent) {
            R2(((L.g.ReplaceCurrentCartWarningDialogEvent) event).getDialogEvent());
            return;
        }
        if (event instanceof L.g.CustomerArrivedDialogEvent) {
            v2(((L.g.CustomerArrivedDialogEvent) event).getDialogEvent());
            return;
        }
        if (event instanceof L.g.OrderUnderModificationNotCancelableDialogEvent) {
            K2(((L.g.OrderUnderModificationNotCancelableDialogEvent) event).getDialogEvent());
            return;
        }
        if (event instanceof L.g.PickupOutsideOfStoreHoursDialogEvent) {
            L.g.PickupOutsideOfStoreHoursDialogEvent pickupOutsideOfStoreHoursDialogEvent = (L.g.PickupOutsideOfStoreHoursDialogEvent) event;
            O2(pickupOutsideOfStoreHoursDialogEvent.getIsOnMyWayClicked(), pickupOutsideOfStoreHoursDialogEvent.getDialogEvent());
            return;
        }
        if (event instanceof L.g.OrderSubstitutionEvent) {
            L.g.OrderSubstitutionEvent orderSubstitutionEvent = (L.g.OrderSubstitutionEvent) event;
            List<OrderSubstitutionItem> listB = orderSubstitutionEvent.b();
            vo.b substitutionScreenType = orderSubstitutionEvent.getSubstitutionScreenType();
            boolean isOnMyWayClicked = orderSubstitutionEvent.getIsOnMyWayClicked();
            String orderType = orderSubstitutionEvent.getOrderType();
            if (orderType == null) {
                orderType = "";
            }
            Y2(listB, substitutionScreenType, isOnMyWayClicked, orderType, orderSubstitutionEvent.getPickupPersonName(), orderSubstitutionEvent.a());
            return;
        }
        if (event instanceof L.g.j) {
            k2();
            return;
        }
        if (event instanceof L.g.v) {
            onOpenBottomSheet.invoke(Boolean.FALSE);
            return;
        }
        if (event instanceof L.g.i) {
            onCloseBottomSheet.invoke();
            return;
        }
        if (event instanceof L.g.x) {
            onOpenBottomSheet.invoke(Boolean.FALSE);
        } else if (event instanceof L.g.w) {
            onOpenBottomSheet.invoke(Boolean.TRUE);
        } else {
            if (!(event instanceof L.g.u)) {
                throw new NoWhenBranchMatchedException();
            }
            onOpenBottomSheet.invoke(Boolean.FALSE);
        }
    }

    private final void k2() {
        startActivity(OrdersActivity.INSTANCE.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m2(int storeId) {
        startActivity(Al.s.f693a.b(this, storeId, ok.i.f153985c, false));
    }

    private final void o2(DialogEvent dialogEvent) {
        Pj.c.a(dialogEvent, this, new Function2() { // from class: com.meijer.mobile.meijer.activity.orders.t
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return OrderDetailActivity.p2(this.f110559a, (C14886b) obj, (DialogEvent) obj2);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p2(final OrderDetailActivity orderDetailActivity, C14886b toBuilder, DialogEvent it) {
        Intrinsics.j(toBuilder, "$this$toBuilder");
        Intrinsics.j(it, "it");
        toBuilder.setCancelable(false);
        bk.j.c(toBuilder, it.getPositiveButtonText(), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.orders.h
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                OrderDetailActivity.q2(this.f110536a, dialogInterface, i10);
            }
        });
        return Unit.f142422a;
    }

    private final void r2(DialogEvent dialogEvent) {
        Pj.c.a(dialogEvent, this, new Function2() { // from class: com.meijer.mobile.meijer.activity.orders.p
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return OrderDetailActivity.s2(this.f110555a, (C14886b) obj, (DialogEvent) obj2);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s2(final OrderDetailActivity orderDetailActivity, C14886b toBuilder, DialogEvent event) {
        Intrinsics.j(toBuilder, "$this$toBuilder");
        Intrinsics.j(event, "event");
        toBuilder.setCancelable(false);
        bk.j.c(toBuilder, event.getPositiveButtonText(), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.orders.m
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                OrderDetailActivity.t2(this.f110549a, dialogInterface, i10);
            }
        });
        AbstractC5607a negativeButtonText = event.getNegativeButtonText();
        if (negativeButtonText != null) {
            bk.j.b(toBuilder, negativeButtonText, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.orders.n
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    OrderDetailActivity.u2(this.f110550a, dialogInterface, i10);
                }
            });
        }
        return Unit.f142422a;
    }

    private final void v2(DialogEvent dialogEvent) {
        Pj.c.a(dialogEvent, this, new Function2() { // from class: com.meijer.mobile.meijer.activity.orders.A
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return OrderDetailActivity.w2(this.f110151a, (C14886b) obj, (DialogEvent) obj2);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w2(final OrderDetailActivity orderDetailActivity, C14886b toBuilder, DialogEvent event) {
        Intrinsics.j(toBuilder, "$this$toBuilder");
        Intrinsics.j(event, "event");
        toBuilder.setCancelable(false);
        bk.j.c(toBuilder, event.getPositiveButtonText(), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.orders.r
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                OrderDetailActivity.x2(this.f110557a, dialogInterface, i10);
            }
        });
        return Unit.f142422a;
    }

    private final void y2(DialogEvent event) {
        Pj.c.a(event, this, new Function2() { // from class: com.meijer.mobile.meijer.activity.orders.x
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return OrderDetailActivity.z2(this.f110565a, (C14886b) obj, (DialogEvent) obj2);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z2(final OrderDetailActivity orderDetailActivity, C14886b toBuilder, DialogEvent it) {
        Intrinsics.j(toBuilder, "$this$toBuilder");
        Intrinsics.j(it, "it");
        toBuilder.setCancelable(false);
        bk.j.c(toBuilder, it.getPositiveButtonText(), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.orders.l
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                OrderDetailActivity.A2(this.f110547a, dialogInterface, i10);
            }
        });
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A2(OrderDetailActivity orderDetailActivity, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        orderDetailActivity.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D2(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G2(OrderDetailActivity orderDetailActivity, DialogInterface dialogInterface, int i10) throws IOException {
        dialogInterface.dismiss();
        orderDetailActivity.f2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(OrderDetailActivity orderDetailActivity, DialogInterface dialogInterface, int i10) throws IOException {
        dialogInterface.dismiss();
        orderDetailActivity.f2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M2(OrderDetailActivity orderDetailActivity, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        orderDetailActivity.startActivity(orderDetailActivity.getFeatureEntryPoint().d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N2(OrderDetailActivity orderDetailActivity, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        orderDetailActivity.h2().M0(L.f.c.f159142a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q2(OrderDetailActivity orderDetailActivity, boolean z10, DialogInterface dialogInterface, int i10) {
        L.f fVar;
        dialogInterface.dismiss();
        rn.L lH2 = orderDetailActivity.h2();
        if (z10) {
            fVar = L.f.e.f159144a;
        } else {
            fVar = L.f.d.f159143a;
        }
        lH2.M0(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T2(OrderDetailActivity orderDetailActivity, DialogInterface dialogInterface, int i10) {
        orderDetailActivity.h2().M0(L.f.q.f159158a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U2(OrderDetailActivity orderDetailActivity, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        orderDetailActivity.h2().M0(L.f.c.f159142a);
    }

    private final void V2(String startDestination, String orderType) {
        String stringExtra = getIntent().getStringExtra("orderID");
        if (stringExtra != null) {
            startActivity(FlyBuyActivity.INSTANCE.a(this, startDestination, stringExtra, orderType, h2().E0().getValue().getCheckInStoreDetails()));
        }
    }

    private final void W2() {
        startActivity(getFeatureEntryPoint().d());
    }

    private final void X2() {
        String stringExtra = getIntent().getStringExtra("orderID");
        if (stringExtra != null) {
            startActivity(EditPhoneNumberActivity.INSTANCE.a(this, stringExtra));
        }
    }

    private final void Y2(List<OrderSubstitutionItem> listSubstitutedItems, vo.b screenType, boolean isOnMyWayClicked, String orderType, String pickupPersonName, List<OrderOutOfStockItem> listOutOfStockItems) {
        finish();
        String stringExtra = getIntent().getStringExtra("orderID");
        if (stringExtra != null) {
            startActivity(Al.l.f673a.d(this, listSubstitutedItems, stringExtra, screenType, isOnMyWayClicked, orderType, pickupPersonName, listOutOfStockItems));
        } else {
            finish();
        }
    }

    private final void Z2(List<OrderSubstitutionItem> orderSubstitutionList, List<OrderOutOfStockItem> orderOutOfStockList) {
        String stringExtra = getIntent().getStringExtra("orderID");
        if (stringExtra != null) {
            startActivity(OrderSummaryActivity.INSTANCE.a(this, stringExtra, orderSubstitutionList, orderOutOfStockList));
        } else {
            finish();
        }
    }

    private final void a3(Builder rateAndTip, EnumC17127a flowType) {
        if (getIntent().getStringExtra("orderID") != null) {
            startActivity(getFeatureEntryPoint().v(rateAndTip, flowType));
        }
    }

    private final void f2() throws IOException {
        String string;
        String stringExtra = getIntent().getStringExtra("previousTrackAction");
        String stringExtra2 = getIntent().getStringExtra("shortCode");
        if (stringExtra2 != null) {
            StringBuilder sb2 = new StringBuilder();
            int length = stringExtra2.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = stringExtra2.charAt(i10);
                if (!String.valueOf(cCharAt).contentEquals("SHORTENER")) {
                    sb2.append(cCharAt);
                }
            }
            string = sb2.toString();
        } else {
            string = null;
        }
        String stringExtra3 = getIntent().getStringExtra("orderID");
        if (stringExtra3 != null) {
            rn.L lH2 = h2();
            if (stringExtra == null) {
                stringExtra = "";
            }
            if (string == null) {
                string = "";
            }
            lH2.M0(new L.f.FetchDetails(stringExtra3, stringExtra, string));
            return;
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String g2(String orderType, String orderId) {
        if (orderId.length() == 0) {
            orderId = getIntent().getStringExtra("orderID");
            Intrinsics.g(orderId);
        }
        String string = getString(com.meijer.mobile.meijer.Y.f99598Ha, orderType, orderId);
        Intrinsics.i(string, "getString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j2() {
        startActivity(getMeijerIntent().w(this));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l2() {
        startActivity(getFeatureEntryPoint().d());
    }

    private final void n2() {
        String stringExtra = getIntent().getStringExtra("previousTrackAction");
        if (stringExtra != null && stringExtra.length() != 0) {
            setResult(-1, new Intent().putExtra(HomeFragment.ORDER_DETAILS_BACK, "Order Details: Back: New home screen"));
        }
        String stringExtra2 = getIntent().getStringExtra("shortCode");
        if (stringExtra2 != null && stringExtra2.length() != 0) {
            if (Intrinsics.e("ebt_not_verified", stringExtra2)) {
                Intent intentA = OrdersActivity.INSTANCE.a(this);
                intentA.putExtra("arrivedFlag", true);
                intentA.setFlags(268468224);
                startActivity(intentA);
                return;
            }
            k2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q2(OrderDetailActivity orderDetailActivity, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        orderDetailActivity.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t2(OrderDetailActivity orderDetailActivity, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        orderDetailActivity.h2().M0(L.f.a.f159140a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u2(OrderDetailActivity orderDetailActivity, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        orderDetailActivity.h2().M0(L.f.c.f159142a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x2(OrderDetailActivity orderDetailActivity, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        orderDetailActivity.V2("check_in", "pickup");
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    @Deprecated
    public void onBackPressed() {
        n2();
        finishAfterTransition();
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getIntent().getBooleanExtra("arrivedFlag", false)) {
            h2().M0(L.f.m.f159154a);
        }
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-34429993, true, new b()), 1, null);
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() throws IOException {
        super.onResume();
        f2();
    }
}
