package com.meijer.mobile.meijer.activity.orders;

import Ji.LocalThemeScope;
import V2.CreationExtras;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.view.C6031t;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import com.meijer.mobile.meijer.activity.orders.FlyBuyActivity;
import com.meijer.mobile.meijer.activity.orders.OrderSubstitutionsActivity;
import gn.OrderOutOfStockListDecorator;
import gn.OrderSubstitutionsListDecorator;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import je.C14886b;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import rn.o0;
import tv.C17154h;
import uo.OrderOutOfStockItem;
import vo.OrderSubstitutionItem;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\u0003J/\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u001b\u0010\u0017\u001a\u00020\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u0003J\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010 R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010/\u001a\u00060\u0015j\u0002`,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orders/OrderSubstitutionsActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "", "title", "message", "positiveButton", "negativeButton", "d2", "(IIII)V", "a2", "(III)V", "Y1", "V1", "", "orderType", "g2", "(Ljava/lang/String;)V", "Lvo/b;", "substitutionScreenType", "T1", "(Lvo/b;)V", "S1", "itemId", "W1", "(I)V", "X1", "Lrn/o0;", "s", "Lkotlin/Lazy;", "U1", "()Lrn/o0;", "viewModel", "LMn/A;", "t", "LMn/A;", "binding", "Lcom/meijer/mobile/core/model/common/ResourceId;", "u", "Ljava/lang/String;", "orderId", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class OrderSubstitutionsActivity extends Hilt_OrderSubstitutionsActivity {

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Mn.A binding;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new androidx.view.e0(Reflection.b(rn.o0.class), new c(this), new b(this), new d(null, this));

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private String orderId = new String();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrn/o0$e;", "viewState", "", "<anonymous>", "(Lrn/o0$e;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.OrderSubstitutionsActivity$onCreate$1", f = "OrderSubstitutionsActivity.kt", l = {}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<o0.ViewState, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f110333a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f110334b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ vo.b f110336d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f110337e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f110338f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.orders.OrderSubstitutionsActivity$a$a, reason: collision with other inner class name */
        static final class C1685a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ OrderSubstitutionsActivity f110339a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ o0.ViewState f110340b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ vo.b f110341c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f110342d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f110343e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.orders.OrderSubstitutionsActivity$a$a$a, reason: collision with other inner class name */
            static final class C1686a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ OrderSubstitutionsActivity f110344a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ o0.ViewState f110345b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ vo.b f110346c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ boolean f110347d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ String f110348e;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.orders.OrderSubstitutionsActivity$a$a$a$a, reason: collision with other inner class name */
                /* synthetic */ class C1687a extends FunctionReferenceImpl implements Function0<Unit> {
                    C1687a(Object obj) {
                        super(0, obj, OrderSubstitutionsActivity.class, "onBackPressed", "onBackPressed()V", 0);
                    }

                    public final void a() {
                        ((OrderSubstitutionsActivity) this.receiver).onBackPressed();
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        a();
                        return Unit.f142422a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.orders.OrderSubstitutionsActivity$a$a$a$b */
                /* synthetic */ class b extends FunctionReferenceImpl implements Function0<Unit> {
                    b(Object obj) {
                        super(0, obj, OrderSubstitutionsActivity.class, "navigateToOrderDetailsActivity", "navigateToOrderDetailsActivity()V", 0);
                    }

                    public final void a() {
                        ((OrderSubstitutionsActivity) this.receiver).V1();
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        a();
                        return Unit.f142422a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.orders.OrderSubstitutionsActivity$a$a$a$c */
                /* synthetic */ class c extends FunctionReferenceImpl implements Function1<Integer, Unit> {
                    c(Object obj) {
                        super(1, obj, OrderSubstitutionsActivity.class, "onAcceptButtonClicked", "onAcceptButtonClicked(I)V", 0);
                    }

                    public final void a(int i10) {
                        ((OrderSubstitutionsActivity) this.receiver).W1(i10);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                        a(num.intValue());
                        return Unit.f142422a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.orders.OrderSubstitutionsActivity$a$a$a$d */
                /* synthetic */ class d extends FunctionReferenceImpl implements Function1<Integer, Unit> {
                    d(Object obj) {
                        super(1, obj, OrderSubstitutionsActivity.class, "onRejectButtonClicked", "onRejectButtonClicked(I)V", 0);
                    }

                    public final void a(int i10) {
                        ((OrderSubstitutionsActivity) this.receiver).X1(i10);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                        a(num.intValue());
                        return Unit.f142422a;
                    }
                }

                C1686a(OrderSubstitutionsActivity orderSubstitutionsActivity, o0.ViewState viewState, vo.b bVar, boolean z10, String str) {
                    this.f110344a = orderSubstitutionsActivity;
                    this.f110345b = viewState;
                    this.f110346c = bVar;
                    this.f110347d = z10;
                    this.f110348e = str;
                }

                public final void b(LocalThemeScope AdsTheme, Composer composer, int i10) {
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
                        ComposerKt.U(-328569293, i11, -1, "com.meijer.mobile.meijer.activity.orders.OrderSubstitutionsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (OrderSubstitutionsActivity.kt:77)");
                    }
                    int i12 = i11;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    String str = this.f110344a.orderId;
                    OrderSubstitutionsActivity orderSubstitutionsActivity = this.f110344a;
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(orderSubstitutionsActivity);
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new C1687a(orderSubstitutionsActivity);
                        composer.t(objB);
                    }
                    KFunction kFunction = (KFunction) objB;
                    composer.P();
                    List<OrderSubstitutionsListDecorator> listD = this.f110345b.d();
                    List<OrderOutOfStockListDecorator> listC = this.f110345b.c();
                    OrderSubstitutionsActivity orderSubstitutionsActivity2 = this.f110344a;
                    composer.startReplaceGroup(5004770);
                    boolean zD2 = composer.D(orderSubstitutionsActivity2);
                    Object objB2 = composer.B();
                    if (zD2 || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new b(orderSubstitutionsActivity2);
                        composer.t(objB2);
                    }
                    KFunction kFunction2 = (KFunction) objB2;
                    composer.P();
                    OrderSubstitutionsActivity orderSubstitutionsActivity3 = this.f110344a;
                    composer.startReplaceGroup(5004770);
                    boolean zD3 = composer.D(orderSubstitutionsActivity3);
                    Object objB3 = composer.B();
                    if (zD3 || objB3 == Composer.INSTANCE.a()) {
                        objB3 = new c(orderSubstitutionsActivity3);
                        composer.t(objB3);
                    }
                    KFunction kFunction3 = (KFunction) objB3;
                    composer.P();
                    OrderSubstitutionsActivity orderSubstitutionsActivity4 = this.f110344a;
                    composer.startReplaceGroup(5004770);
                    boolean zD4 = composer.D(orderSubstitutionsActivity4);
                    Object objB4 = composer.B();
                    if (zD4 || objB4 == Composer.INSTANCE.a()) {
                        objB4 = new d(orderSubstitutionsActivity4);
                        composer.t(objB4);
                    }
                    KFunction kFunction4 = (KFunction) objB4;
                    composer.P();
                    Function0 function0 = (Function0) kFunction;
                    composer.startReplaceGroup(-1224400529);
                    boolean zD5 = composer.D(this.f110344a) | composer.d(this.f110346c.ordinal()) | composer.a(this.f110347d) | composer.V(this.f110348e);
                    final OrderSubstitutionsActivity orderSubstitutionsActivity5 = this.f110344a;
                    final vo.b bVar = this.f110346c;
                    final boolean z10 = this.f110347d;
                    final String str2 = this.f110348e;
                    Object objB5 = composer.B();
                    if (zD5 || objB5 == Composer.INSTANCE.a()) {
                        objB5 = new Function0() { // from class: com.meijer.mobile.meijer.activity.orders.b0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OrderSubstitutionsActivity.a.C1685a.C1686a.c(orderSubstitutionsActivity5, bVar, z10, str2);
                            }
                        };
                        composer.t(objB5);
                    }
                    composer.P();
                    U.o(AdsTheme, companion, str, function0, (Function0) objB5, (Function0) kFunction2, listD, listC, this.f110346c, (Function1) kFunction3, (Function1) kFunction4, composer, LocalThemeScope.f15770g | 48 | (i12 & 14), 0, 0);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                    b(localThemeScope, composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(OrderSubstitutionsActivity orderSubstitutionsActivity, vo.b bVar, boolean z10, String str) {
                    orderSubstitutionsActivity.U1().G(new o0.c.OnClickConfirmAction(orderSubstitutionsActivity.orderId, bVar, z10, str));
                    return Unit.f142422a;
                }
            }

            C1685a(OrderSubstitutionsActivity orderSubstitutionsActivity, o0.ViewState viewState, vo.b bVar, boolean z10, String str) {
                this.f110339a = orderSubstitutionsActivity;
                this.f110340b = viewState;
                this.f110341c = bVar;
                this.f110342d = z10;
                this.f110343e = str;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-744042972, i10, -1, "com.meijer.mobile.meijer.activity.orders.OrderSubstitutionsActivity.onCreate.<anonymous>.<anonymous> (OrderSubstitutionsActivity.kt:76)");
                }
                Ji.K.b(null, ComposableLambdaKt.c(-328569293, true, new C1686a(this.f110339a, this.f110340b, this.f110341c, this.f110342d, this.f110343e), composer, 54), composer, 48, 1);
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = OrderSubstitutionsActivity.this.new a(this.f110336d, this.f110337e, this.f110338f, continuation);
            aVar.f110334b = obj;
            return aVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(vo.b bVar, boolean z10, String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f110336d = bVar;
            this.f110337e = z10;
            this.f110338f = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0.ViewState viewState, Continuation<? super Unit> continuation) {
            return ((a) create(viewState, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f110333a == 0) {
                ResultKt.b(obj);
                o0.ViewState viewState = (o0.ViewState) this.f110334b;
                OrderSubstitutionsActivity.this.T1(this.f110336d);
                Mn.A a10 = OrderSubstitutionsActivity.this.binding;
                if (a10 == null) {
                    Intrinsics.y("binding");
                    a10 = null;
                }
                a10.f19878z.setContent(ComposableLambdaKt.composableLambdaInstance(-744042972, true, new C1685a(OrderSubstitutionsActivity.this, viewState, this.f110336d, this.f110337e, this.f110338f)));
                o0.d dVarA = viewState.f().a();
                if (dVarA != null) {
                    OrderSubstitutionsActivity orderSubstitutionsActivity = OrderSubstitutionsActivity.this;
                    if (dVarA instanceof o0.d.SuccessDialogEvent) {
                        o0.d.SuccessDialogEvent successDialogEvent = (o0.d.SuccessDialogEvent) dVarA;
                        orderSubstitutionsActivity.d2(successDialogEvent.getTitle(), successDialogEvent.getMessage(), successDialogEvent.getPositiveButton(), successDialogEvent.getNegativeButton());
                    } else if (dVarA instanceof o0.d.FailureDialogEvent) {
                        o0.d.FailureDialogEvent failureDialogEvent = (o0.d.FailureDialogEvent) dVarA;
                        orderSubstitutionsActivity.Y1(failureDialogEvent.getTitle(), failureDialogEvent.getMessage(), failureDialogEvent.getPositiveButton());
                    } else if (dVarA instanceof o0.d.FailureSubstitutionDialogEvent) {
                        o0.d.FailureSubstitutionDialogEvent failureSubstitutionDialogEvent = (o0.d.FailureSubstitutionDialogEvent) dVarA;
                        orderSubstitutionsActivity.a2(failureSubstitutionDialogEvent.getTitle(), failureSubstitutionDialogEvent.getPositiveButton(), failureSubstitutionDialogEvent.getNegativeButton());
                    } else if (dVarA instanceof o0.d.c) {
                        orderSubstitutionsActivity.V1();
                    } else if (dVarA instanceof o0.d.NavigateToCheckIn) {
                        orderSubstitutionsActivity.g2(((o0.d.NavigateToCheckIn) dVarA).getOrderType());
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class b extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f110349f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f110349f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f110349f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f110350f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f110350f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f110350f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f110351f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f110352g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f110351f = function0;
            this.f110352g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f110351f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f110352g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final rn.o0 U1() {
        return (rn.o0) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V1() {
        startActivity(Al.l.b(Al.l.f673a, this, this.orderId, "", null, 8, null));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y1(int title, int message, int positiveButton) {
        new C14886b(this).setTitle(title).setCancelable(false).setMessage(message).setPositiveButton(positiveButton, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.orders.Y
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                OrderSubstitutionsActivity.Z1(this.f110514a, dialogInterface, i10);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a2(int title, int positiveButton, int negativeButton) {
        new C14886b(this).setTitle(title).setCancelable(false).setPositiveButton(positiveButton, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.orders.Z
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                OrderSubstitutionsActivity.b2(dialogInterface, i10);
            }
        }).setNegativeButton(negativeButton, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.orders.a0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                OrderSubstitutionsActivity.c2(this.f110515a, dialogInterface, i10);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d2(int title, int message, int positiveButton, int negativeButton) {
        new C14886b(this).setTitle(title).setCancelable(false).setMessage(message).setPositiveButton(positiveButton, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.orders.W
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                OrderSubstitutionsActivity.e2(this.f110513a, dialogInterface, i10);
            }
        }).setNegativeButton(negativeButton, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.orders.X
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                OrderSubstitutionsActivity.f2(dialogInterface, i10);
            }
        }).show();
    }

    private final void S1() {
        U1().G(o0.c.d.f159693a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T1(vo.b substitutionScreenType) {
        ArrayList parcelableArrayListExtra;
        List parcelableArrayListExtra2;
        Intent intent = getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            parcelableArrayListExtra = intent.getParcelableArrayListExtra("substitutedItems", OrderSubstitutionItem.class);
        } else {
            parcelableArrayListExtra = intent.getParcelableArrayListExtra("substitutedItems");
        }
        if (parcelableArrayListExtra != null) {
            rn.o0 o0VarU1 = U1();
            Intent intent2 = getIntent();
            Intrinsics.i(intent2, "getIntent(...)");
            if (i10 >= 33) {
                parcelableArrayListExtra2 = intent2.getParcelableArrayListExtra("oosItems", OrderOutOfStockItem.class);
            } else {
                parcelableArrayListExtra2 = intent2.getParcelableArrayListExtra("oosItems");
            }
            if (parcelableArrayListExtra2 == null) {
                parcelableArrayListExtra2 = CollectionsKt.m();
            }
            o0VarU1.G(new o0.c.BuildSubstitutionViewAction(parcelableArrayListExtra, parcelableArrayListExtra2, substitutionScreenType));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W1(int itemId) {
        U1().G(new o0.c.OnAcceptedSubstitutionAction(itemId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X1(int itemId) {
        U1().G(new o0.c.OnRejectedSubstitutionAction(itemId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z1(OrderSubstitutionsActivity orderSubstitutionsActivity, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        orderSubstitutionsActivity.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b2(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c2(OrderSubstitutionsActivity orderSubstitutionsActivity, DialogInterface dialogInterface, int i10) {
        orderSubstitutionsActivity.V1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e2(OrderSubstitutionsActivity orderSubstitutionsActivity, DialogInterface dialogInterface, int i10) {
        orderSubstitutionsActivity.U1().G(new o0.c.ConfirmSubstitutionAction(orderSubstitutionsActivity.orderId));
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f2(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g2(String orderType) {
        if (getIntent().getStringExtra("orderId") != null) {
            FlyBuyActivity.Companion companion = FlyBuyActivity.INSTANCE;
            String str = this.orderId;
            if (orderType == null) {
                orderType = "";
            }
            startActivity(companion.a(this, "im_here", str, orderType, U1().E().getValue().getStoreInfo()));
        }
        finish();
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    @Deprecated
    public void onBackPressed() {
        super.onBackPressed();
        S1();
        V1();
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Object serializableExtra;
        String str;
        super.onCreate(savedInstanceState);
        Mn.A aK0 = Mn.A.K0(getLayoutInflater());
        this.binding = aK0;
        Serializable serializable = null;
        if (aK0 == null) {
            Intrinsics.y("binding");
            aK0 = null;
        }
        setContentView(Zr.a.j(aK0.getRoot(), false, 1, null));
        String stringExtra = getIntent().getStringExtra("orderId");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.orderId = stringExtra;
        boolean booleanExtra = getIntent().getBooleanExtra("isOnMyWayClicked", false);
        Intent intent = getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            serializableExtra = intent.getSerializableExtra("substitutionScreenType", vo.b.class);
        } else {
            Serializable serializableExtra2 = intent.getSerializableExtra("substitutionScreenType");
            if (serializableExtra2 instanceof vo.b) {
                serializable = serializableExtra2;
            }
            serializableExtra = (vo.b) serializable;
        }
        Intrinsics.g(serializableExtra);
        vo.b bVar = (vo.b) serializableExtra;
        String stringExtra2 = getIntent().getStringExtra("orderType");
        if (stringExtra2 == null) {
            str = "";
        } else {
            str = stringExtra2;
        }
        if (booleanExtra) {
            a2(com.meijer.mobile.meijer.Y.f100313s5, yr.Q.f170986b, Bj.o.f3039r);
        }
        C17154h.J(C17154h.O(U1().E(), new a(bVar, booleanExtra, str, null)), C6031t.a(this));
    }
}
