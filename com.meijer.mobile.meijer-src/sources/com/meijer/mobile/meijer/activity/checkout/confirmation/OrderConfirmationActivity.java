package com.meijer.mobile.meijer.activity.checkout.confirmation;

import V2.CreationExtras;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import com.fullstory.FS;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationActivity;
import com.meijer.mobile.meijer.activity.checkout.confirmation.Y;
import com.meijer.mobile.meijer.activity.checkout.review.z1;
import e.C13737e;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 $2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\u0003R\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0016\u001a\u00060\u0011j\u0002`\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010#\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\r\u001a\u0004\b\"\u0010\u001f¨\u0006(²\u0006\f\u0010'\u001a\u00020&8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/confirmation/OrderConfirmationActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "<init>", "()V", "", "U1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/Y;", "s", "Lkotlin/Lazy;", "Q1", "()Lcom/meijer/mobile/meijer/activity/checkout/confirmation/Y;", "viewModel", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "t", "O1", "()Ljava/lang/String;", "orderId", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$k;", "u", "N1", "()Lcom/meijer/mobile/meijer/activity/checkout/review/z1$k;", "information", "", "v", "S1", "()Z", "isBopasEligibleCart", "w", "P1", "sendPreTipAnalytics", "x", "a", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/Y$b;", "viewState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class OrderConfirmationActivity extends Hilt_OrderConfirmationActivity {

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: y, reason: collision with root package name */
    public static final int f102921y = 8;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new androidx.view.e0(Reflection.b(Y.class), new d(this), new c(this), new e(null, this));

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Lazy orderId = LazyKt.b(new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.confirmation.f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OrderConfirmationActivity.W1(this.f103020a);
        }
    });

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final Lazy information = LazyKt.b(new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.confirmation.g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OrderConfirmationActivity.R1(this.f103022a);
        }
    });

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Lazy isBopasEligibleCart = LazyKt.b(new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.confirmation.h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(OrderConfirmationActivity.T1(this.f103025a));
        }
    });

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Lazy sendPreTipAnalytics = LazyKt.b(new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.confirmation.i
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(OrderConfirmationActivity.X1(this.f103029a));
        }
    });

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/confirmation/OrderConfirmationActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$k;", "information", "", "isBopasEligibleCart", "sendPreTipAnalytics", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Ljava/lang/String;Lcom/meijer/mobile/meijer/activity/checkout/review/z1$k;Ljava/lang/Boolean;Z)Landroid/content/Intent;", "EXTRA_ORDER_ID", "Ljava/lang/String;", "EXTRA_INFORMATION", "EXTRA_IS_BOPAS_ELIGIBLE_CART", "EXTRA_SEND_PRE_TIP_ANALYTICS", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ Intent b(Companion companion, Context context, String str, z1.OrderConfirmationInfo orderConfirmationInfo, Boolean bool, boolean z10, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                orderConfirmationInfo = null;
            }
            if ((i10 & 8) != 0) {
                bool = null;
            }
            if ((i10 & 16) != 0) {
                z10 = false;
            }
            return companion.a(context, str, orderConfirmationInfo, bool, z10);
        }

        @JvmStatic
        public final Intent a(Context context, String orderId, z1.OrderConfirmationInfo information, Boolean isBopasEligibleCart, boolean sendPreTipAnalytics) {
            Intrinsics.j(context, "context");
            Intrinsics.j(orderId, "orderId");
            Intent intentPutExtra = new Intent(context, (Class<?>) OrderConfirmationActivity.class).putExtra("com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationActivity.ORDER_ID", orderId).putExtra("com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationActivity.INFORMATION", information).putExtra("com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationActivity.IS_BOPAS_ELIGIBLE_CAR", isBopasEligibleCart).putExtra("com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationActivity.SEND_PRE_TIP_ANALYTICS", sendPreTipAnalytics);
            Intrinsics.i(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Y.a, Unit> {
            a(Object obj) {
                super(1, obj, Y.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/checkout/confirmation/OrderConfirmationViewModel$Action;)V", 0);
            }

            public final void a(Y.a p02) {
                Intrinsics.j(p02, "p0");
                ((Y) this.receiver).w(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Y.a aVar) {
                a(aVar);
                return Unit.f143329a;
            }
        }

        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(OrderConfirmationActivity orderConfirmationActivity, String orderNumber) {
            Intrinsics.j(orderNumber, "orderNumber");
            orderConfirmationActivity.startActivity(Bl.l.b(Bl.l.f3131a, orderConfirmationActivity, orderNumber, null, null, 12, null));
            return Unit.f143329a;
        }

        public final void d(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1716638943, i10, -1, "com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationActivity.onCreate.<anonymous> (OrderConfirmationActivity.kt:54)");
            }
            composer.startReplaceGroup(1849434622);
            OrderConfirmationActivity orderConfirmationActivity = OrderConfirmationActivity.this;
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = orderConfirmationActivity.Q1().u();
                composer.t(objB);
            }
            composer.P();
            androidx.compose.runtime.z1 z1VarC = S2.a.c((pv.P) objB, null, null, null, composer, 0, 7);
            Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE);
            Y.ViewState viewStateE = e(z1VarC);
            Y yQ1 = OrderConfirmationActivity.this.Q1();
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(yQ1);
            Object objB2 = composer.B();
            if (zD || objB2 == companion.a()) {
                objB2 = new a(yQ1);
                composer.t(objB2);
            }
            composer.P();
            boolean zV = OrderConfirmationActivity.this.Q1().v();
            Function1 function1 = (Function1) ((KFunction) objB2);
            composer.startReplaceGroup(5004770);
            boolean zD2 = composer.D(OrderConfirmationActivity.this);
            final OrderConfirmationActivity orderConfirmationActivity2 = OrderConfirmationActivity.this;
            Object objB3 = composer.B();
            if (zD2 || objB3 == companion.a()) {
                objB3 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.confirmation.k
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OrderConfirmationActivity.b.f(orderConfirmationActivity2);
                    }
                };
                composer.t(objB3);
            }
            Function0 function0 = (Function0) objB3;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zD3 = composer.D(OrderConfirmationActivity.this);
            final OrderConfirmationActivity orderConfirmationActivity3 = OrderConfirmationActivity.this;
            Object objB4 = composer.B();
            if (zD3 || objB4 == companion.a()) {
                objB4 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.confirmation.l
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OrderConfirmationActivity.b.g(orderConfirmationActivity3);
                    }
                };
                composer.t(objB4);
            }
            Function0 function02 = (Function0) objB4;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zD4 = composer.D(OrderConfirmationActivity.this);
            final OrderConfirmationActivity orderConfirmationActivity4 = OrderConfirmationActivity.this;
            Object objB5 = composer.B();
            if (zD4 || objB5 == companion.a()) {
                objB5 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.confirmation.m
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OrderConfirmationActivity.b.k(orderConfirmationActivity4, (String) obj);
                    }
                };
                composer.t(objB5);
            }
            composer.P();
            M.v(modifierFsUnmask, viewStateE, zV, function1, function0, function02, (Function1) objB5, composer, 0, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            d(composer, num.intValue());
            return Unit.f143329a;
        }

        private static final Y.ViewState e(androidx.compose.runtime.z1<Y.ViewState> z1Var) {
            return z1Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(OrderConfirmationActivity orderConfirmationActivity) {
            orderConfirmationActivity.U1();
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(OrderConfirmationActivity orderConfirmationActivity) {
            orderConfirmationActivity.Q1().w(new Y.a.LoadOrderDetail(orderConfirmationActivity.O1(), orderConfirmationActivity.N1(), orderConfirmationActivity.S1(), orderConfirmationActivity.P1()));
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f102928f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f102928f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f102928f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f102929f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f102929f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f102929f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f102930f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f102931g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f102930f = function0;
            this.f102931g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f102930f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f102931g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z1.OrderConfirmationInfo N1() {
        return (z1.OrderConfirmationInfo) this.information.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String O1() {
        return (String) this.orderId.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean P1() {
        return ((Boolean) this.sendPreTipAnalytics.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Y Q1() {
        return (Y) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean S1() {
        return ((Boolean) this.isBopasEligibleCart.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V1(OrderConfirmationActivity orderConfirmationActivity, androidx.view.F addCallback) {
        Intrinsics.j(addCallback, "$this$addCallback");
        orderConfirmationActivity.U1();
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z1.OrderConfirmationInfo R1(OrderConfirmationActivity orderConfirmationActivity) {
        Parcelable parcelable;
        Intent intent = orderConfirmationActivity.getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) intent.getParcelableExtra("com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationActivity.INFORMATION", z1.OrderConfirmationInfo.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationActivity.INFORMATION");
            if (!(parcelableExtra instanceof z1.OrderConfirmationInfo)) {
                parcelableExtra = null;
            }
            parcelable = (z1.OrderConfirmationInfo) parcelableExtra;
        }
        return (z1.OrderConfirmationInfo) parcelable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean T1(OrderConfirmationActivity orderConfirmationActivity) {
        return orderConfirmationActivity.getIntent().getBooleanExtra("com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationActivity.IS_BOPAS_ELIGIBLE_CAR", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U1() {
        startActivity(getMeijerIntent().p(this, false));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String W1(OrderConfirmationActivity orderConfirmationActivity) {
        String stringExtra = orderConfirmationActivity.getIntent().getStringExtra("com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationActivity.ORDER_ID");
        if (stringExtra == null) {
            return "";
        }
        return stringExtra;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean X1(OrderConfirmationActivity orderConfirmationActivity) {
        return orderConfirmationActivity.getIntent().getBooleanExtra("com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationActivity.SEND_PRE_TIP_ANALYTICS", false);
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Q1().w(Y.a.b.f102956a);
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-1716638943, true, new b()), 1, null);
        androidx.view.I.b(getOnBackPressedDispatcher(), null, false, new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.confirmation.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderConfirmationActivity.V1(this.f103030a, (androidx.view.F) obj);
            }
        }, 3, null);
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        FS.page("Checkout | Order Confirmation").start();
    }
}
