package com.meijer.mobile.meijer.activity.checkout.review;

import Am.C2880b0;
import Am.C2906v;
import Am.C2908x;
import Gm.f;
import Ji.LocalThemeScope;
import V2.CreationExtras;
import ak.AbstractC5607a;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.DialogTitle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import ck.C6408b;
import com.fullstory.FS;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.core.networking.exceptions.RetrofitException;
import com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationActivity;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsActivity;
import com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentHostActivity;
import com.meijer.mobile.meijer.activity.checkout.payment.ebt.r;
import com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity;
import com.meijer.mobile.meijer.activity.checkout.review.z1;
import e.C13588d;
import e.C13589e;
import gj.OrderDetail;
import gk.MultiTenderPaymentOption;
import j0.InterfaceC14794C;
import j0.InterfaceC14814f;
import java.io.IOException;
import je.C14886b;
import kotlin.C17891L0;
import kotlin.C17893M0;
import kotlin.C17921a1;
import kotlin.EnumC17895N0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import p1.C16193g;
import qv.C16648k;
import qv.InterfaceC16622O;
import r0.C16692i;
import tv.C17154h;
import xs.EnumC18092b;

@Metadata(d1 = {"\u0000\u007f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001C\b\u0001\u0018\u0000 O2\u00020\u00012\u00020\u0002:\u0001PB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J?\u0010\u000e\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0004J\u001f\u0010\u0015\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u001b\u0010\u0004J\u0017\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0005H\u0016¢\u0006\u0004\b \u0010\u0004J\u0017\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\"\u0010#R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001b\u0010=\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010:\u001a\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER+\u0010N\u001a\u0002042\u0006\u0010G\u001a\u0002048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010M¨\u0006X²\u0006\f\u0010R\u001a\u00020Q8\nX\u008a\u0084\u0002²\u0006\u000e\u0010S\u001a\u0002048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010T\u001a\u0002048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010U\u001a\u0002048\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010W\u001a\u0004\u0018\u00010V8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/CheckoutActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "LGm/f$a;", "<init>", "()V", "", "d2", "Z1", "", "title", "message", "positiveButtonText", "Lkotlin/Function0;", "onPositiveButtonClick", "h2", "(IIILkotlin/jvm/functions/Function0;)V", "Y1", "a2", "b2", "j2", "", "e2", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "P", "timerString", "z0", "(Ljava/lang/String;)V", "Lyl/k;", "s", "Lyl/k;", "getFeaturemanager", "()Lyl/k;", "setFeaturemanager", "(Lyl/k;)V", "featuremanager", "LGm/f;", "t", "LGm/f;", "V1", "()LGm/f;", "setEbtTimer", "(LGm/f;)V", "ebtTimer", "", "u", "Z", "cardSet", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1;", "v", "Lkotlin/Lazy;", "X1", "()Lcom/meijer/mobile/meijer/activity/checkout/review/z1;", "viewModel", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r;", "w", "U1", "()Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r;", "ebtPinPadViewModel", "com/meijer/mobile/meijer/activity/checkout/review/CheckoutActivity$c", "x", "Lcom/meijer/mobile/meijer/activity/checkout/review/CheckoutActivity$c;", "orderProcessingBackPressedCallback", "<set-?>", "y", "Lkotlin/properties/ReadWriteProperty;", "W1", "()Z", "c2", "(Z)V", "orderSubmitted", "z", "a", "Lcom/meijer/mobile/meijer/activity/checkout/review/D1;", "viewState", "displayAdjustEbtSheet", "displayExtendedRangeInformationSheet", "displayEBTPinPadScreen", "LHj/d;", "modalToShow", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class CheckoutActivity extends Hilt_CheckoutActivity implements f.a {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public yl.k featuremanager;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public Gm.f ebtTimer;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private boolean cardSet;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new androidx.view.e0(Reflection.b(z1.class), new f(this), new e(this), new g(null, this));

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Lazy ebtPinPadViewModel = new androidx.view.e0(Reflection.b(com.meijer.mobile.meijer.activity.checkout.payment.ebt.r.class), new i(this), new h(this), new j(null, this));

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final c orderProcessingBackPressedCallback = new c();

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final ReadWriteProperty orderSubmitted;

    /* renamed from: A, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f104362A = {Reflection.f(new MutablePropertyReference1Impl(CheckoutActivity.class, "orderSubmitted", "getOrderSubmitted()Z", 0))};

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: B, reason: collision with root package name */
    public static final int f104363B = 8;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/CheckoutActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lgk/e;", "paymentOption", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Lgk/e;)Landroid/content/Intent;", "", "EXTRA_PAYMENT_OPTION", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ Intent b(Companion companion, Context context, MultiTenderPaymentOption multiTenderPaymentOption, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                multiTenderPaymentOption = null;
            }
            return companion.a(context, multiTenderPaymentOption);
        }

        @JvmStatic
        public final Intent a(Context context, MultiTenderPaymentOption paymentOption) {
            Intrinsics.j(context, "context");
            Intent intent = new Intent(context, (Class<?>) CheckoutActivity.class);
            if (paymentOption != null) {
                intent.putExtra("paymentOption", paymentOption);
            }
            intent.addFlags(67108864);
            return intent;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C17893M0 f104373a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<qv.C0> f104374b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ CheckoutActivity f104375c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f104376d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f104377e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.z1<CheckoutViewState> f104378f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f104379g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f104380h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f104381i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ Function0<qv.C0> f104382j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Hj.d> f104383k;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity$b$a$a, reason: collision with other inner class name */
            static final class C1508a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f104384a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Function0<qv.C0> f104385b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ CheckoutActivity f104386c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<Boolean> f104387d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<Boolean> f104388e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ androidx.compose.runtime.z1<CheckoutViewState> f104389f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<Boolean> f104390g;

                public final void l(InterfaceC14814f ModalBottomSheetLayout, Composer composer, int i10) {
                    Intrinsics.j(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1604097879, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (CheckoutActivity.kt:150)");
                    }
                    if (b.t(this.f104387d)) {
                        composer.startReplaceGroup(-1873694477);
                        String strC = C16193g.c(com.meijer.mobile.meijer.Y.f100393w5, composer, 0);
                        String strC2 = C16193g.c(com.meijer.mobile.meijer.Y.f100373v5, composer, 0);
                        LocalThemeScope localThemeScope = this.f104384a;
                        composer.startReplaceGroup(-1633490746);
                        boolean zV = composer.V(this.f104385b);
                        final Function0<qv.C0> function0 = this.f104385b;
                        final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f104387d;
                        Object objB = composer.B();
                        if (zV || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.D
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CheckoutActivity.b.a.C1508a.o(function0, interfaceC5730l0);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        C2880b0.g(localThemeScope, null, strC, strC2, null, (Function0) objB, composer, LocalThemeScope.f15770g, 9);
                        composer.P();
                    } else if (b.C(this.f104388e)) {
                        composer.startReplaceGroup(-1873137965);
                        LocalThemeScope localThemeScope2 = this.f104384a;
                        AdjustEbtPaymentDecorator adjustEbtPaymentDecorator = b.s(this.f104389f).getAdjustEbtPaymentDecorator();
                        composer.startReplaceGroup(-1633490746);
                        boolean zV2 = composer.V(this.f104385b);
                        final Function0<qv.C0> function02 = this.f104385b;
                        final InterfaceC5730l0<Boolean> interfaceC5730l02 = this.f104388e;
                        Object objB2 = composer.B();
                        if (zV2 || objB2 == Composer.INSTANCE.a()) {
                            objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.E
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CheckoutActivity.b.a.C1508a.s(function02, interfaceC5730l02);
                                }
                            };
                            composer.t(objB2);
                        }
                        Function0 function03 = (Function0) objB2;
                        composer.P();
                        composer.startReplaceGroup(1849434622);
                        Object objB3 = composer.B();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objB3 == companion.a()) {
                            objB3 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.F
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CheckoutActivity.b.a.C1508a.t();
                                }
                            };
                            composer.t(objB3);
                        }
                        Function0 function04 = (Function0) objB3;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(this.f104386c);
                        final CheckoutActivity checkoutActivity = this.f104386c;
                        Object objB4 = composer.B();
                        if (zD || objB4 == companion.a()) {
                            objB4 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.review.G
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CheckoutActivity.b.a.C1508a.u(checkoutActivity, ((Double) obj).doubleValue());
                                }
                            };
                            composer.t(objB4);
                        }
                        composer.P();
                        C11953f.c(localThemeScope2, null, adjustEbtPaymentDecorator, function03, function04, (Function1) objB4, composer, LocalThemeScope.f15770g | 24576 | (AbstractC5607a.f45514b << 6), 1);
                        composer.P();
                    } else if (b.v(this.f104390g)) {
                        composer.startReplaceGroup(-1872257534);
                        String acculynkPostBody = b.s(this.f104389f).getAcculynkPostBody();
                        if (acculynkPostBody == null || acculynkPostBody.length() == 0) {
                            this.f104385b.invoke();
                        } else {
                            LocalThemeScope localThemeScope3 = this.f104384a;
                            String ebtTimerText = b.s(this.f104389f).getEbtTimerText();
                            boolean isLoading = b.s(this.f104389f).getLoadingState().getIsLoading();
                            composer.startReplaceGroup(5004770);
                            boolean zD2 = composer.D(this.f104386c);
                            final CheckoutActivity checkoutActivity2 = this.f104386c;
                            Object objB5 = composer.B();
                            if (zD2 || objB5 == Composer.INSTANCE.a()) {
                                objB5 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.H
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CheckoutActivity.b.a.C1508a.v(checkoutActivity2);
                                    }
                                };
                                composer.t(objB5);
                            }
                            Function0 function05 = (Function0) objB5;
                            composer.P();
                            composer.startReplaceGroup(5004770);
                            boolean zD3 = composer.D(this.f104386c);
                            final CheckoutActivity checkoutActivity3 = this.f104386c;
                            Object objB6 = composer.B();
                            if (zD3 || objB6 == Composer.INSTANCE.a()) {
                                objB6 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.review.I
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return CheckoutActivity.b.a.C1508a.p(checkoutActivity3, (String) obj);
                                    }
                                };
                                composer.t(objB6);
                            }
                            Function1 function1 = (Function1) objB6;
                            composer.P();
                            String acculynkPostBody2 = b.s(this.f104389f).getAcculynkPostBody();
                            Intrinsics.g(acculynkPostBody2);
                            composer.startReplaceGroup(-1633490746);
                            boolean zV3 = composer.V(this.f104385b) | composer.D(this.f104386c);
                            final Function0<qv.C0> function06 = this.f104385b;
                            final CheckoutActivity checkoutActivity4 = this.f104386c;
                            Object objB7 = composer.B();
                            if (zV3 || objB7 == Composer.INSTANCE.a()) {
                                objB7 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.J
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CheckoutActivity.b.a.C1508a.q(function06, checkoutActivity4);
                                    }
                                };
                                composer.t(objB7);
                            }
                            composer.P();
                            Hm.h.e(localThemeScope3, null, true, ebtTimerText, isLoading, function05, function1, acculynkPostBody2, (Function0) objB7, composer, LocalThemeScope.f15770g | 384, 1);
                            Unit unit = Unit.f142422a;
                        }
                        composer.P();
                    } else {
                        composer.startReplaceGroup(-1870953519);
                        String strC3 = C16193g.c(com.meijer.mobile.meijer.Y.f100326si, composer, 0);
                        String strC4 = C16193g.c(com.meijer.mobile.meijer.Y.f100344tg, composer, 0);
                        String strC5 = C16193g.c(com.meijer.mobile.meijer.Y.f100364ug, composer, 0);
                        LocalThemeScope localThemeScope4 = this.f104384a;
                        composer.startReplaceGroup(5004770);
                        boolean zV4 = composer.V(this.f104385b);
                        final Function0<qv.C0> function07 = this.f104385b;
                        Object objB8 = composer.B();
                        if (zV4 || objB8 == Composer.INSTANCE.a()) {
                            objB8 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.K
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CheckoutActivity.b.a.C1508a.r(function07);
                                }
                            };
                            composer.t(objB8);
                        }
                        composer.P();
                        C2880b0.g(localThemeScope4, null, strC3, strC4, strC5, (Function0) objB8, composer, LocalThemeScope.f15770g, 1);
                        composer.P();
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                C1508a(LocalThemeScope localThemeScope, Function0<? extends qv.C0> function0, CheckoutActivity checkoutActivity, InterfaceC5730l0<Boolean> interfaceC5730l0, InterfaceC5730l0<Boolean> interfaceC5730l02, androidx.compose.runtime.z1<CheckoutViewState> z1Var, InterfaceC5730l0<Boolean> interfaceC5730l03) {
                    this.f104384a = localThemeScope;
                    this.f104385b = function0;
                    this.f104386c = checkoutActivity;
                    this.f104387d = interfaceC5730l0;
                    this.f104388e = interfaceC5730l02;
                    this.f104389f = z1Var;
                    this.f104390g = interfaceC5730l03;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit t() {
                    return Unit.f142422a;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
                    l(interfaceC14814f, composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit o(Function0 function0, InterfaceC5730l0 interfaceC5730l0) {
                    function0.invoke();
                    b.u(interfaceC5730l0, false);
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit p(CheckoutActivity checkoutActivity, String str) {
                    checkoutActivity.U1().I(str);
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit q(Function0 function0, CheckoutActivity checkoutActivity) throws IOException {
                    function0.invoke();
                    checkoutActivity.X1().r0(z1.h.C1530h.f105121a);
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit r(Function0 function0) {
                    function0.invoke();
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit s(Function0 function0, InterfaceC5730l0 interfaceC5730l0) {
                    function0.invoke();
                    b.D(interfaceC5730l0, false);
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit u(CheckoutActivity checkoutActivity, double d10) throws IOException {
                    checkoutActivity.X1().r0(new z1.h.UpdateEbtApprovedAmount(d10));
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit v(CheckoutActivity checkoutActivity) throws IOException {
                    checkoutActivity.X1().r0(z1.h.j.f105123a);
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity$b$a$b, reason: collision with other inner class name */
            static final class C1509b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<Boolean> f104391a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f104392b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ androidx.compose.runtime.z1<CheckoutViewState> f104393c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ CheckoutActivity f104394d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<Boolean> f104395e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Function0<qv.C0> f104396f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ Function0<qv.C0> f104397g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<Hj.d> f104398h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<Boolean> f104399i;

                /* renamed from: j, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<Boolean> f104400j;

                /* renamed from: k, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<Boolean> f104401k;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity$b$a$b$a, reason: collision with other inner class name */
                static final class C1510a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ InterfaceC5730l0<Boolean> f104402a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f104403b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.runtime.z1<CheckoutViewState> f104404c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ CheckoutActivity f104405d;

                    C1510a(InterfaceC5730l0<Boolean> interfaceC5730l0, LocalThemeScope localThemeScope, androidx.compose.runtime.z1<CheckoutViewState> z1Var, CheckoutActivity checkoutActivity) {
                        this.f104402a = interfaceC5730l0;
                        this.f104403b = localThemeScope;
                        this.f104404c = z1Var;
                        this.f104405d = checkoutActivity;
                    }

                    public final void b(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-102854293, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutActivity.kt:211)");
                        }
                        if (this.f104402a.getValue().booleanValue() || b.s(this.f104404c).getEbtTimerText() != null) {
                            LocalThemeScope localThemeScope = this.f104403b;
                            Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
                            String strC = C16193g.c(com.meijer.mobile.meijer.Y.f100465zh, composer, 0);
                            composer.startReplaceGroup(-1633490746);
                            boolean zV = composer.V(this.f104404c) | composer.D(this.f104405d);
                            final CheckoutActivity checkoutActivity = this.f104405d;
                            final androidx.compose.runtime.z1<CheckoutViewState> z1Var = this.f104404c;
                            Object objB = composer.B();
                            if (zV || objB == Composer.INSTANCE.a()) {
                                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.L
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CheckoutActivity.b.a.C1509b.C1510a.c(checkoutActivity, z1Var);
                                    }
                                };
                                composer.t(objB);
                            }
                            composer.P();
                            C2906v.c(localThemeScope, modifierH, strC, (Function0) objB, false, composer, LocalThemeScope.f15770g | 48, 8);
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
                    public static final Unit c(CheckoutActivity checkoutActivity, androidx.compose.runtime.z1 z1Var) throws IOException {
                        if (b.s(z1Var).getIsEbtPinPadProcessing()) {
                            checkoutActivity.X1().r0(z1.h.x.f105140a);
                        } else {
                            checkoutActivity.finish();
                        }
                        return Unit.f142422a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity$b$a$b$b, reason: collision with other inner class name */
                static final class C1511b implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ InterfaceC5730l0<Boolean> f104406a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f104407b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ CheckoutActivity f104408c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.runtime.z1<CheckoutViewState> f104409d;

                    C1511b(InterfaceC5730l0<Boolean> interfaceC5730l0, LocalThemeScope localThemeScope, CheckoutActivity checkoutActivity, androidx.compose.runtime.z1<CheckoutViewState> z1Var) {
                        this.f104406a = interfaceC5730l0;
                        this.f104407b = localThemeScope;
                        this.f104408c = checkoutActivity;
                        this.f104409d = z1Var;
                    }

                    public final void b(Composer composer, int i10) throws Resources.NotFoundException {
                        String string;
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(610343626, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutActivity.kt:226)");
                        }
                        if (this.f104406a.getValue().booleanValue() || b.s(this.f104409d).getEbtTimerText() != null) {
                            LocalThemeScope localThemeScope = this.f104407b;
                            Modifier modifierH = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, H1.h.p(16)), 0.0f, 1, null);
                            composer.startReplaceGroup(-1633490746);
                            boolean zD = composer.D(this.f104408c);
                            final CheckoutActivity checkoutActivity = this.f104408c;
                            final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f104406a;
                            Object objB = composer.B();
                            if (zD || objB == Composer.INSTANCE.a()) {
                                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.M
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CheckoutActivity.b.a.C1509b.C1511b.c(checkoutActivity, interfaceC5730l0);
                                    }
                                };
                                composer.t(objB);
                            }
                            Function0 function0 = (Function0) objB;
                            composer.P();
                            composer.startReplaceGroup(-1870257881);
                            if (this.f104408c.W1()) {
                                string = this.f104408c.getResources().getString(com.meijer.mobile.meijer.Y.f100192m4);
                                Intrinsics.g(string);
                            } else {
                                string = C6408b.a(b.s(this.f104409d).getPlaceOrderButtonText(), composer, AbstractC5607a.f45514b);
                            }
                            String str = string;
                            composer.P();
                            C2908x.b(localThemeScope, modifierH, function0, str, true, null, null, false, composer, LocalThemeScope.f15770g | 24624, 112);
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
                        b(composer, num.intValue());
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit c(CheckoutActivity checkoutActivity, InterfaceC5730l0 interfaceC5730l0) throws IOException {
                        if (!checkoutActivity.W1()) {
                            checkoutActivity.c2(true);
                            interfaceC5730l0.setValue(Boolean.FALSE);
                            checkoutActivity.X1().r0(new z1.h.SubmitOrderAction(true));
                        } else {
                            checkoutActivity.X1().r0(z1.h.v.f105138a);
                        }
                        return Unit.f142422a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity$b$a$b$c */
                static final class c implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f104410a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ CheckoutActivity f104411b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ InterfaceC5730l0<Boolean> f104412c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ InterfaceC5730l0<Boolean> f104413d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ Function0<qv.C0> f104414e;

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ Function0<qv.C0> f104415f;

                    /* renamed from: g, reason: collision with root package name */
                    final /* synthetic */ InterfaceC5730l0<Hj.d> f104416g;

                    /* renamed from: h, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.runtime.z1<CheckoutViewState> f104417h;

                    /* renamed from: i, reason: collision with root package name */
                    final /* synthetic */ InterfaceC5730l0<Boolean> f104418i;

                    /* renamed from: j, reason: collision with root package name */
                    final /* synthetic */ InterfaceC5730l0<Boolean> f104419j;

                    /* renamed from: k, reason: collision with root package name */
                    final /* synthetic */ InterfaceC5730l0<Boolean> f104420k;

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity$onCreate$1$1$2$3$10$1", f = "CheckoutActivity.kt", l = {}, m = "invokeSuspend")
                    /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity$b$a$b$c$a, reason: collision with other inner class name */
                    static final class C1512a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                        /* renamed from: a, reason: collision with root package name */
                        int f104421a;

                        /* renamed from: b, reason: collision with root package name */
                        private /* synthetic */ Object f104422b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ CheckoutActivity f104423c;

                        /* renamed from: d, reason: collision with root package name */
                        final /* synthetic */ Function0<qv.C0> f104424d;

                        /* renamed from: e, reason: collision with root package name */
                        final /* synthetic */ InterfaceC5730l0<Boolean> f104425e;

                        /* renamed from: f, reason: collision with root package name */
                        final /* synthetic */ InterfaceC5730l0<Boolean> f104426f;

                        /* renamed from: g, reason: collision with root package name */
                        final /* synthetic */ InterfaceC5730l0<Boolean> f104427g;

                        /* renamed from: h, reason: collision with root package name */
                        final /* synthetic */ InterfaceC5730l0<Boolean> f104428h;

                        /* renamed from: i, reason: collision with root package name */
                        final /* synthetic */ InterfaceC5730l0<Boolean> f104429i;

                        /* renamed from: j, reason: collision with root package name */
                        final /* synthetic */ InterfaceC5730l0<Hj.d> f104430j;

                        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$j;", "event", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/checkout/review/z1$j;)V"}, k = 3, mv = {2, 1, 0})
                        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity$onCreate$1$1$2$3$10$1$1", f = "CheckoutActivity.kt", l = {}, m = "invokeSuspend")
                        /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity$b$a$b$c$a$a, reason: collision with other inner class name */
                        static final class C1513a extends SuspendLambda implements Function2<z1.j, Continuation<? super Unit>, Object> {

                            /* renamed from: a, reason: collision with root package name */
                            int f104431a;

                            /* renamed from: b, reason: collision with root package name */
                            /* synthetic */ Object f104432b;

                            /* renamed from: c, reason: collision with root package name */
                            final /* synthetic */ CheckoutActivity f104433c;

                            /* renamed from: d, reason: collision with root package name */
                            final /* synthetic */ Function0<qv.C0> f104434d;

                            /* renamed from: e, reason: collision with root package name */
                            final /* synthetic */ InterfaceC5730l0<Boolean> f104435e;

                            /* renamed from: f, reason: collision with root package name */
                            final /* synthetic */ InterfaceC5730l0<Boolean> f104436f;

                            /* renamed from: g, reason: collision with root package name */
                            final /* synthetic */ InterfaceC5730l0<Boolean> f104437g;

                            /* renamed from: h, reason: collision with root package name */
                            final /* synthetic */ InterfaceC5730l0<Boolean> f104438h;

                            /* renamed from: i, reason: collision with root package name */
                            final /* synthetic */ InterfaceC5730l0<Boolean> f104439i;

                            /* renamed from: j, reason: collision with root package name */
                            final /* synthetic */ InterfaceC5730l0<Hj.d> f104440j;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            C1513a(CheckoutActivity checkoutActivity, Function0<? extends qv.C0> function0, InterfaceC5730l0<Boolean> interfaceC5730l0, InterfaceC5730l0<Boolean> interfaceC5730l02, InterfaceC5730l0<Boolean> interfaceC5730l03, InterfaceC5730l0<Boolean> interfaceC5730l04, InterfaceC5730l0<Boolean> interfaceC5730l05, InterfaceC5730l0<Hj.d> interfaceC5730l06, Continuation<? super C1513a> continuation) {
                                super(2, continuation);
                                this.f104433c = checkoutActivity;
                                this.f104434d = function0;
                                this.f104435e = interfaceC5730l0;
                                this.f104436f = interfaceC5730l02;
                                this.f104437g = interfaceC5730l03;
                                this.f104438h = interfaceC5730l04;
                                this.f104439i = interfaceC5730l05;
                                this.f104440j = interfaceC5730l06;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit r(InterfaceC5730l0 interfaceC5730l0) {
                                b.y(interfaceC5730l0, null);
                                return Unit.f142422a;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit s(InterfaceC5730l0 interfaceC5730l0) {
                                b.y(interfaceC5730l0, null);
                                return Unit.f142422a;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                C1513a c1513a = new C1513a(this.f104433c, this.f104434d, this.f104435e, this.f104436f, this.f104437g, this.f104438h, this.f104439i, this.f104440j, continuation);
                                c1513a.f104432b = obj;
                                return c1513a;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            /* renamed from: q, reason: merged with bridge method [inline-methods] */
                            public final Object invoke(z1.j jVar, Continuation<? super Unit> continuation) {
                                return ((C1513a) create(jVar, continuation)).invokeSuspend(Unit.f142422a);
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final void t(InterfaceC5730l0 interfaceC5730l0, CheckoutActivity checkoutActivity, DialogInterface dialogInterface, int i10) throws IOException {
                                interfaceC5730l0.setValue(Boolean.FALSE);
                                dialogInterface.dismiss();
                                checkoutActivity.X1().r0(new z1.h.SendAdobeActionTag(true));
                                checkoutActivity.X1().r0(new z1.h.SubmitOrderAction(false));
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) throws IOException {
                                String strA;
                                IntrinsicsKt.f();
                                if (this.f104431a != 0) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.b(obj);
                                z1.j jVar = (z1.j) this.f104432b;
                                if (jVar instanceof z1.j.ShowEBTPinPadEvent) {
                                    this.f104433c.orderProcessingBackPressedCallback.setEnabled(false);
                                    b.D(this.f104437g, false);
                                    b.u(this.f104438h, false);
                                    b.w(this.f104439i, true);
                                    this.f104434d.invoke();
                                    if (!this.f104433c.V1().getTimerRunningStatus()) {
                                        this.f104433c.V1().l(115L);
                                    }
                                    this.f104433c.V1().k(this.f104433c);
                                } else if (jVar instanceof z1.j.NavigateToOrderConfirmationEvent) {
                                    CheckoutActivity checkoutActivity = this.f104433c;
                                    OrderConfirmationActivity.Companion companion = OrderConfirmationActivity.INSTANCE;
                                    z1.j.NavigateToOrderConfirmationEvent navigateToOrderConfirmationEvent = (z1.j.NavigateToOrderConfirmationEvent) jVar;
                                    String orderId = navigateToOrderConfirmationEvent.getOrderId();
                                    checkoutActivity.startActivity(companion.a(checkoutActivity, orderId == null ? "" : orderId, navigateToOrderConfirmationEvent.getInformation(), navigateToOrderConfirmationEvent.getIsBopasEligibleCart(), navigateToOrderConfirmationEvent.getSendPreTipAnalytics()));
                                    this.f104433c.finish();
                                } else if (jVar instanceof z1.j.OrderSubmittedSuccessEvent) {
                                    this.f104435e.setValue(Boxing.a(false));
                                    this.f104436f.setValue(Boxing.a(true));
                                    z1 z1VarX1 = this.f104433c.X1();
                                    z1.j.OrderSubmittedSuccessEvent orderSubmittedSuccessEvent = (z1.j.OrderSubmittedSuccessEvent) jVar;
                                    int i10 = !orderSubmittedSuccessEvent.getDisplayEbtPinPad() ? Bj.n.f2959c : Bj.n.f2957a;
                                    OrderDetail orderDetail = orderSubmittedSuccessEvent.getOrderDetail();
                                    z1VarX1.r0(new z1.h.SetCheckoutAnimations(true, new CheckoutAnimations(i10, null, false, false, orderDetail != null ? orderDetail.getCode() : null, orderSubmittedSuccessEvent.getInformation(), orderSubmittedSuccessEvent.getDisplayEbtPinPad(), 14, null)));
                                    this.f104433c.getFirebasePerformanceEngine().b("cart_checkout_trace");
                                } else if (jVar instanceof z1.j.SubmitOrderErrorEvent) {
                                    this.f104435e.setValue(Boxing.a(false));
                                    this.f104436f.setValue(Boxing.a(true));
                                    z1.j.SubmitOrderErrorEvent submitOrderErrorEvent = (z1.j.SubmitOrderErrorEvent) jVar;
                                    this.f104433c.X1().r0(new z1.h.SetCheckoutAnimations(true, new CheckoutAnimations(Bj.n.f2958b, submitOrderErrorEvent.getButtonText(), submitOrderErrorEvent.getIsTimeSlotError(), true, null, null, false, 112, null)));
                                    this.f104433c.c2(false);
                                    this.f104433c.getFirebasePerformanceEngine().b("cart_checkout_trace");
                                } else if (jVar instanceof z1.j.a) {
                                    this.f104433c.a2();
                                } else if (jVar instanceof z1.j.ShowErrorDialogEvent) {
                                    this.f104433c.c2(false);
                                    this.f104435e.setValue(Boxing.a(true));
                                    CheckoutErrorDialogDecorator checkoutErrorDialogDecorator = ((z1.j.ShowErrorDialogEvent) jVar).getCheckoutErrorDialogDecorator();
                                    this.f104433c.h2(checkoutErrorDialogDecorator.getTitle(), checkoutErrorDialogDecorator.getMessage(), checkoutErrorDialogDecorator.getButtonText(), checkoutErrorDialogDecorator.c());
                                } else if (jVar instanceof z1.j.ShowAgeRestrictedDialog) {
                                    z1.j.ShowAgeRestrictedDialog showAgeRestrictedDialog = (z1.j.ShowAgeRestrictedDialog) jVar;
                                    RetrofitException retrofitException = showAgeRestrictedDialog.getRetrofitException();
                                    if (retrofitException == null || (strA = retrofitException.c(this.f104433c)) == null) {
                                        strA = bk.d.a(this.f104433c, showAgeRestrictedDialog.getMessage());
                                    }
                                    String str = strA;
                                    InterfaceC5730l0<Hj.d> interfaceC5730l0 = this.f104440j;
                                    String strA2 = bk.d.a(this.f104433c, showAgeRestrictedDialog.getTitle());
                                    String strA3 = bk.d.a(this.f104433c, showAgeRestrictedDialog.getButtonText());
                                    final InterfaceC5730l0<Hj.d> interfaceC5730l02 = this.f104440j;
                                    Function0 function0 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.U
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return CheckoutActivity.b.a.C1509b.c.C1512a.C1513a.r(interfaceC5730l02);
                                        }
                                    };
                                    final InterfaceC5730l0<Hj.d> interfaceC5730l03 = this.f104440j;
                                    b.y(interfaceC5730l0, new Hj.d(strA2, str, strA3, function0, new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.V
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return CheckoutActivity.b.a.C1509b.c.C1512a.C1513a.s(interfaceC5730l03);
                                        }
                                    }, null, null, null, 224, null));
                                } else if (jVar instanceof z1.j.ShowFutureTimeslotAlert) {
                                    this.f104435e.setValue(Boxing.a(true));
                                    z1.j.ShowFutureTimeslotAlert showFutureTimeslotAlert = (z1.j.ShowFutureTimeslotAlert) jVar;
                                    C14886b message = new C14886b(this.f104433c).setTitle(bk.d.a(this.f104433c, showFutureTimeslotAlert.getAlertTitle())).setCancelable(false).setMessage(bk.d.a(this.f104433c, showFutureTimeslotAlert.getAlertMessage()));
                                    int i11 = com.meijer.mobile.meijer.Y.f99760Q1;
                                    final InterfaceC5730l0<Boolean> interfaceC5730l04 = this.f104435e;
                                    final CheckoutActivity checkoutActivity2 = this.f104433c;
                                    C14886b positiveButton = message.setPositiveButton(i11, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.checkout.review.W
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i12) throws IOException {
                                            CheckoutActivity.b.a.C1509b.c.C1512a.C1513a.t(interfaceC5730l04, checkoutActivity2, dialogInterface, i12);
                                        }
                                    });
                                    int i12 = com.meijer.mobile.meijer.Y.f99854V0;
                                    final CheckoutActivity checkoutActivity3 = this.f104433c;
                                    positiveButton.setNegativeButton(i12, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.checkout.review.X
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i13) throws IOException {
                                            CheckoutActivity.b.a.C1509b.c.C1512a.C1513a.u(checkoutActivity3, dialogInterface, i13);
                                        }
                                    }).show();
                                } else if (jVar instanceof z1.j.NavigateToOrderDetailEvent) {
                                    CheckoutActivity checkoutActivity4 = this.f104433c;
                                    Al.l lVar = Al.l.f673a;
                                    z1.j.NavigateToOrderDetailEvent navigateToOrderDetailEvent = (z1.j.NavigateToOrderDetailEvent) jVar;
                                    String orderId2 = navigateToOrderDetailEvent.getOrderId();
                                    checkoutActivity4.startActivity(Al.l.b(lVar, checkoutActivity4, orderId2 == null ? "" : orderId2, null, navigateToOrderDetailEvent.getShortCode(), 4, null));
                                    this.f104433c.finish();
                                } else if (jVar instanceof z1.j.h) {
                                    C14886b message2 = new C14886b(this.f104433c).setTitle(com.meijer.mobile.meijer.Y.f100381vd).setMessage(com.meijer.mobile.meijer.Y.f100361ud);
                                    int i13 = com.meijer.mobile.meijer.Y.f100341td;
                                    final CheckoutActivity checkoutActivity5 = this.f104433c;
                                    message2.setNegativeButton(i13, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.checkout.review.Y
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i14) throws IOException {
                                            CheckoutActivity.b.a.C1509b.c.C1512a.C1513a.v(checkoutActivity5, dialogInterface, i14);
                                        }
                                    }).setPositiveButton(com.meijer.mobile.meijer.Y.f100169l1, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.checkout.review.Z
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i14) {
                                            CheckoutActivity.b.a.C1509b.c.C1512a.C1513a.x(dialogInterface, i14);
                                        }
                                    }).show();
                                } else {
                                    if (!(jVar instanceof z1.j.d)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    this.f104433c.Z1();
                                }
                                return Unit.f142422a;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final void u(CheckoutActivity checkoutActivity, DialogInterface dialogInterface, int i10) throws IOException {
                                checkoutActivity.X1().r0(new z1.h.SendAdobeActionTag(false));
                                checkoutActivity.c2(false);
                                checkoutActivity.Y1();
                                dialogInterface.dismiss();
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final void v(CheckoutActivity checkoutActivity, DialogInterface dialogInterface, int i10) throws IOException {
                                dialogInterface.dismiss();
                                checkoutActivity.X1().r0(z1.h.p.f105131a);
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final void x(DialogInterface dialogInterface, int i10) {
                                dialogInterface.dismiss();
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        C1512a(CheckoutActivity checkoutActivity, Function0<? extends qv.C0> function0, InterfaceC5730l0<Boolean> interfaceC5730l0, InterfaceC5730l0<Boolean> interfaceC5730l02, InterfaceC5730l0<Boolean> interfaceC5730l03, InterfaceC5730l0<Boolean> interfaceC5730l04, InterfaceC5730l0<Boolean> interfaceC5730l05, InterfaceC5730l0<Hj.d> interfaceC5730l06, Continuation<? super C1512a> continuation) {
                            super(2, continuation);
                            this.f104423c = checkoutActivity;
                            this.f104424d = function0;
                            this.f104425e = interfaceC5730l0;
                            this.f104426f = interfaceC5730l02;
                            this.f104427g = interfaceC5730l03;
                            this.f104428h = interfaceC5730l04;
                            this.f104429i = interfaceC5730l05;
                            this.f104430j = interfaceC5730l06;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C1512a c1512a = new C1512a(this.f104423c, this.f104424d, this.f104425e, this.f104426f, this.f104427g, this.f104428h, this.f104429i, this.f104430j, continuation);
                            c1512a.f104422b = obj;
                            return c1512a;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                            return ((C1512a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.f();
                            if (this.f104421a == 0) {
                                ResultKt.b(obj);
                                C17154h.J(C17154h.O(this.f104423c.X1().g0().b(), new C1513a(this.f104423c, this.f104424d, this.f104425e, this.f104426f, this.f104427g, this.f104428h, this.f104429i, this.f104430j, null)), (InterfaceC16622O) this.f104422b);
                                return Unit.f142422a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity$onCreate$1$1$2$3$11$1", f = "CheckoutActivity.kt", l = {}, m = "invokeSuspend")
                    /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity$b$a$b$c$b, reason: collision with other inner class name */
                    static final class C1514b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                        /* renamed from: a, reason: collision with root package name */
                        int f104441a;

                        /* renamed from: b, reason: collision with root package name */
                        private /* synthetic */ Object f104442b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ CheckoutActivity f104443c;

                        /* renamed from: d, reason: collision with root package name */
                        final /* synthetic */ Function0<qv.C0> f104444d;

                        /* renamed from: e, reason: collision with root package name */
                        final /* synthetic */ InterfaceC5730l0<Boolean> f104445e;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        C1514b(CheckoutActivity checkoutActivity, Function0<? extends qv.C0> function0, InterfaceC5730l0<Boolean> interfaceC5730l0, Continuation<? super C1514b> continuation) {
                            super(2, continuation);
                            this.f104443c = checkoutActivity;
                            this.f104444d = function0;
                            this.f104445e = interfaceC5730l0;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C1514b c1514b = new C1514b(this.f104443c, this.f104444d, this.f104445e, continuation);
                            c1514b.f104442b = obj;
                            return c1514b;
                        }

                        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r$h;", "effect", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r$h;)V"}, k = 3, mv = {2, 1, 0})
                        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity$onCreate$1$1$2$3$11$1$1", f = "CheckoutActivity.kt", l = {}, m = "invokeSuspend")
                        /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity$b$a$b$c$b$a, reason: collision with other inner class name */
                        static final class C1515a extends SuspendLambda implements Function2<r.h, Continuation<? super Unit>, Object> {

                            /* renamed from: a, reason: collision with root package name */
                            int f104446a;

                            /* renamed from: b, reason: collision with root package name */
                            /* synthetic */ Object f104447b;

                            /* renamed from: c, reason: collision with root package name */
                            final /* synthetic */ Function0<qv.C0> f104448c;

                            /* renamed from: d, reason: collision with root package name */
                            final /* synthetic */ CheckoutActivity f104449d;

                            /* renamed from: e, reason: collision with root package name */
                            final /* synthetic */ InterfaceC5730l0<Boolean> f104450e;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            C1515a(Function0<? extends qv.C0> function0, CheckoutActivity checkoutActivity, InterfaceC5730l0<Boolean> interfaceC5730l0, Continuation<? super C1515a> continuation) {
                                super(2, continuation);
                                this.f104448c = function0;
                                this.f104449d = checkoutActivity;
                                this.f104450e = interfaceC5730l0;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                C1515a c1515a = new C1515a(this.f104448c, this.f104449d, this.f104450e, continuation);
                                c1515a.f104447b = obj;
                                return c1515a;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            /* renamed from: d, reason: merged with bridge method [inline-methods] */
                            public final Object invoke(r.h hVar, Continuation<? super Unit> continuation) {
                                return ((C1515a) create(hVar, continuation)).invokeSuspend(Unit.f142422a);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) throws Resources.NotFoundException, IOException {
                                IntrinsicsKt.f();
                                if (this.f104446a == 0) {
                                    ResultKt.b(obj);
                                    r.h hVar = (r.h) this.f104447b;
                                    if (hVar instanceof r.h.a) {
                                        this.f104448c.invoke();
                                        b.w(this.f104450e, false);
                                        this.f104449d.X1().r0(z1.h.e.f105118a);
                                    } else if (hVar instanceof r.h.ShowErrorState) {
                                        this.f104449d.X1().r0(z1.h.C1530h.f105121a);
                                        r.h.ShowErrorState showErrorState = (r.h.ShowErrorState) hVar;
                                        String errorCode = showErrorState.getErrorCode();
                                        if (errorCode != null && errorCode.length() != 0) {
                                            String errorMessage = showErrorState.getErrorMessage();
                                            if (errorMessage != null) {
                                                this.f104449d.X1().r0(new z1.h.TrackEBTErrorAnalytics(errorMessage));
                                            }
                                            Gm.a aVarA = Gm.a.INSTANCE.a(showErrorState.getErrorCode());
                                            CheckoutActivity checkoutActivity = this.f104449d;
                                            String string = checkoutActivity.getResources().getString(aVarA.getHeaderResourceId());
                                            Intrinsics.i(string, "getString(...)");
                                            String string2 = this.f104449d.getResources().getString(aVarA.getMessageResourceId());
                                            Intrinsics.i(string2, "getString(...)");
                                            checkoutActivity.e2(string, string2);
                                        } else if (!this.f104449d.V1().getTimerRunningStatus()) {
                                            this.f104449d.j2();
                                        }
                                    } else if (hVar instanceof r.h.HandlePinPadSuccess) {
                                        this.f104449d.V1().g();
                                        this.f104449d.X1().r0(z1.h.i.f105122a);
                                    } else {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f142422a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                            return ((C1514b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.f();
                            if (this.f104441a == 0) {
                                ResultKt.b(obj);
                                C17154h.J(C17154h.O(this.f104443c.U1().G().a(), new C1515a(this.f104444d, this.f104443c, this.f104445e, null)), (InterfaceC16622O) this.f104442b);
                                return Unit.f142422a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity$b$a$b$c$c, reason: collision with other inner class name */
                    /* synthetic */ class C1516c extends FunctionReferenceImpl implements Function1<z1.h, Unit> {
                        C1516c(Object obj) {
                            super(1, obj, z1.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/checkout/review/CheckoutViewModel$Action;)V", 0);
                        }

                        public final void a(z1.h p02) throws IOException {
                            Intrinsics.j(p02, "p0");
                            ((z1) this.receiver).r0(p02);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(z1.h hVar) throws IOException {
                            a(hVar);
                            return Unit.f142422a;
                        }
                    }

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity$b$a$b$c$d */
                    /* synthetic */ class d extends FunctionReferenceImpl implements Function1<z1.m, Unit> {
                        d(Object obj) {
                            super(1, obj, z1.class, "onPreTipAction", "onPreTipAction(Lcom/meijer/mobile/meijer/activity/checkout/review/CheckoutViewModel$PreTipAction;)V", 0);
                        }

                        public final void a(z1.m p02) {
                            Intrinsics.j(p02, "p0");
                            ((z1) this.receiver).z0(p02);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(z1.m mVar) {
                            a(mVar);
                            return Unit.f142422a;
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit l(Function0 function0, InterfaceC5730l0 interfaceC5730l0) {
                        b.u(interfaceC5730l0, true);
                        function0.invoke();
                        return Unit.f142422a;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    c(LocalThemeScope localThemeScope, CheckoutActivity checkoutActivity, InterfaceC5730l0<Boolean> interfaceC5730l0, InterfaceC5730l0<Boolean> interfaceC5730l02, Function0<? extends qv.C0> function0, Function0<? extends qv.C0> function02, InterfaceC5730l0<Hj.d> interfaceC5730l03, androidx.compose.runtime.z1<CheckoutViewState> z1Var, InterfaceC5730l0<Boolean> interfaceC5730l04, InterfaceC5730l0<Boolean> interfaceC5730l05, InterfaceC5730l0<Boolean> interfaceC5730l06) {
                        this.f104410a = localThemeScope;
                        this.f104411b = checkoutActivity;
                        this.f104412c = interfaceC5730l0;
                        this.f104413d = interfaceC5730l02;
                        this.f104414e = function0;
                        this.f104415f = function02;
                        this.f104416g = interfaceC5730l03;
                        this.f104417h = z1Var;
                        this.f104418i = interfaceC5730l04;
                        this.f104419j = interfaceC5730l05;
                        this.f104420k = interfaceC5730l06;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit p(CheckoutActivity checkoutActivity, EnumC18092b tipOption) {
                        Intrinsics.j(tipOption, "tipOption");
                        checkoutActivity.X1().z0(new z1.m.SetSelectedTipOption(tipOption));
                        return Unit.f142422a;
                    }

                    public final void g(InterfaceC14794C paddingValues, Composer composer, int i10) {
                        int i11;
                        Intrinsics.j(paddingValues, "paddingValues");
                        if ((i10 & 6) == 0) {
                            i11 = i10 | (composer.V(paddingValues) ? 4 : 2);
                        } else {
                            i11 = i10;
                        }
                        if ((i11 & 19) == 18 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(2089171922, i11, -1, "com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutActivity.kt:253)");
                        }
                        Hj.d dVarX = b.x(this.f104416g);
                        composer.startReplaceGroup(1944492177);
                        if (dVarX != null) {
                            Hj.g.b(this.f104410a, dVarX, composer, LocalThemeScope.f15770g | (Hj.d.f12658i << 3));
                            Unit unit = Unit.f142422a;
                        }
                        composer.P();
                        LocalThemeScope localThemeScope = this.f104410a;
                        Modifier modifierH = androidx.compose.foundation.layout.D.h(androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null), paddingValues);
                        CheckoutViewState checkoutViewStateS = b.s(this.f104417h);
                        boolean z10 = this.f104411b.cardSet;
                        InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f104412c;
                        InterfaceC5730l0<Boolean> interfaceC5730l02 = this.f104413d;
                        z1 z1VarX1 = this.f104411b.X1();
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(z1VarX1);
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new C1516c(z1VarX1);
                            composer.t(objB);
                        }
                        composer.P();
                        Function1 function1 = (Function1) ((KFunction) objB);
                        z1 z1VarX12 = this.f104411b.X1();
                        composer.startReplaceGroup(5004770);
                        boolean zD2 = composer.D(z1VarX12);
                        Object objB2 = composer.B();
                        if (zD2 || objB2 == Composer.INSTANCE.a()) {
                            objB2 = new d(z1VarX12);
                            composer.t(objB2);
                        }
                        composer.P();
                        Function1 function12 = (Function1) ((KFunction) objB2);
                        composer.startReplaceGroup(5004770);
                        boolean zD3 = composer.D(this.f104411b);
                        final CheckoutActivity checkoutActivity = this.f104411b;
                        Object objB3 = composer.B();
                        if (zD3 || objB3 == Composer.INSTANCE.a()) {
                            objB3 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.review.N
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CheckoutActivity.b.a.C1509b.c.p(checkoutActivity, (EnumC18092b) obj);
                                }
                            };
                            composer.t(objB3);
                        }
                        Function1 function13 = (Function1) objB3;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD4 = composer.D(this.f104411b);
                        final CheckoutActivity checkoutActivity2 = this.f104411b;
                        Object objB4 = composer.B();
                        if (zD4 || objB4 == Composer.INSTANCE.a()) {
                            objB4 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.review.O
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CheckoutActivity.b.a.C1509b.c.q(checkoutActivity2, ((Double) obj).doubleValue());
                                }
                            };
                            composer.t(objB4);
                        }
                        Function1 function14 = (Function1) objB4;
                        composer.P();
                        composer.startReplaceGroup(-1746271574);
                        boolean zV = composer.V(this.f104414e) | composer.D(this.f104411b);
                        final CheckoutActivity checkoutActivity3 = this.f104411b;
                        final Function0<qv.C0> function0 = this.f104414e;
                        final InterfaceC5730l0<Boolean> interfaceC5730l03 = this.f104418i;
                        Object objB5 = composer.B();
                        if (zV || objB5 == Composer.INSTANCE.a()) {
                            objB5 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.P
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CheckoutActivity.b.a.C1509b.c.r(checkoutActivity3, function0, interfaceC5730l03);
                                }
                            };
                            composer.t(objB5);
                        }
                        Function0 function02 = (Function0) objB5;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zV2 = composer.V(this.f104414e);
                        final Function0<qv.C0> function03 = this.f104414e;
                        Object objB6 = composer.B();
                        if (zV2 || objB6 == Composer.INSTANCE.a()) {
                            objB6 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.Q
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CheckoutActivity.b.a.C1509b.c.k(function03);
                                }
                            };
                            composer.t(objB6);
                        }
                        Function0 function04 = (Function0) objB6;
                        composer.P();
                        composer.startReplaceGroup(-1633490746);
                        boolean zV3 = composer.V(this.f104414e);
                        final Function0<qv.C0> function05 = this.f104414e;
                        final InterfaceC5730l0<Boolean> interfaceC5730l04 = this.f104419j;
                        Object objB7 = composer.B();
                        if (zV3 || objB7 == Composer.INSTANCE.a()) {
                            objB7 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.S
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CheckoutActivity.b.a.C1509b.c.l(function05, interfaceC5730l04);
                                }
                            };
                            composer.t(objB7);
                        }
                        Function0 function06 = (Function0) objB7;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD5 = composer.D(this.f104411b);
                        final CheckoutActivity checkoutActivity4 = this.f104411b;
                        Object objB8 = composer.B();
                        if (zD5 || objB8 == Composer.INSTANCE.a()) {
                            objB8 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.T
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CheckoutActivity.b.a.C1509b.c.o(checkoutActivity4);
                                }
                            };
                            composer.t(objB8);
                        }
                        composer.P();
                        Z0.i0(localThemeScope, modifierH, checkoutViewStateS, z10, interfaceC5730l0, interfaceC5730l02, function1, function12, function13, function14, function02, function04, function06, (Function0) objB8, composer, LocalThemeScope.f15770g | 221184, 0, 0);
                        Unit unit2 = Unit.f142422a;
                        composer.startReplaceGroup(-1224400529);
                        boolean zD6 = composer.D(this.f104411b) | composer.V(this.f104414e);
                        CheckoutActivity checkoutActivity5 = this.f104411b;
                        Function0<qv.C0> function07 = this.f104414e;
                        InterfaceC5730l0<Boolean> interfaceC5730l05 = this.f104412c;
                        InterfaceC5730l0<Boolean> interfaceC5730l06 = this.f104413d;
                        InterfaceC5730l0<Boolean> interfaceC5730l07 = this.f104418i;
                        InterfaceC5730l0<Boolean> interfaceC5730l08 = this.f104419j;
                        InterfaceC5730l0<Boolean> interfaceC5730l09 = this.f104420k;
                        InterfaceC5730l0<Hj.d> interfaceC5730l010 = this.f104416g;
                        Object objB9 = composer.B();
                        if (zD6 || objB9 == Composer.INSTANCE.a()) {
                            objB9 = new C1512a(checkoutActivity5, function07, interfaceC5730l05, interfaceC5730l06, interfaceC5730l07, interfaceC5730l08, interfaceC5730l09, interfaceC5730l010, null);
                            composer.t(objB9);
                        }
                        composer.P();
                        androidx.compose.runtime.J.g(unit2, (Function2) objB9, composer, 6);
                        Boolean bool = Boolean.TRUE;
                        composer.startReplaceGroup(-1746271574);
                        boolean zD7 = composer.D(this.f104411b) | composer.V(this.f104415f);
                        CheckoutActivity checkoutActivity6 = this.f104411b;
                        Function0<qv.C0> function08 = this.f104415f;
                        InterfaceC5730l0<Boolean> interfaceC5730l011 = this.f104420k;
                        Object objB10 = composer.B();
                        if (zD7 || objB10 == Composer.INSTANCE.a()) {
                            objB10 = new C1514b(checkoutActivity6, function08, interfaceC5730l011, null);
                            composer.t(objB10);
                        }
                        composer.P();
                        androidx.compose.runtime.J.g(bool, (Function2) objB10, composer, 6);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) {
                        g(interfaceC14794C, composer, num.intValue());
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit k(Function0 function0) {
                        function0.invoke();
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit o(CheckoutActivity checkoutActivity) {
                        checkoutActivity.b2();
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit q(CheckoutActivity checkoutActivity, double d10) {
                        checkoutActivity.X1().z0(new z1.m.SetCustomTipAmount(d10));
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit r(CheckoutActivity checkoutActivity, Function0 function0, InterfaceC5730l0 interfaceC5730l0) throws IOException {
                        checkoutActivity.X1().r0(z1.h.C12015a.f105114a);
                        b.D(interfaceC5730l0, true);
                        function0.invoke();
                        return Unit.f142422a;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                C1509b(InterfaceC5730l0<Boolean> interfaceC5730l0, LocalThemeScope localThemeScope, androidx.compose.runtime.z1<CheckoutViewState> z1Var, CheckoutActivity checkoutActivity, InterfaceC5730l0<Boolean> interfaceC5730l02, Function0<? extends qv.C0> function0, Function0<? extends qv.C0> function02, InterfaceC5730l0<Hj.d> interfaceC5730l03, InterfaceC5730l0<Boolean> interfaceC5730l04, InterfaceC5730l0<Boolean> interfaceC5730l05, InterfaceC5730l0<Boolean> interfaceC5730l06) {
                    this.f104391a = interfaceC5730l0;
                    this.f104392b = localThemeScope;
                    this.f104393c = z1Var;
                    this.f104394d = checkoutActivity;
                    this.f104395e = interfaceC5730l02;
                    this.f104396f = function0;
                    this.f104397g = function02;
                    this.f104398h = interfaceC5730l03;
                    this.f104399i = interfaceC5730l04;
                    this.f104400j = interfaceC5730l05;
                    this.f104401k = interfaceC5730l06;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1058600784, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (CheckoutActivity.kt:208)");
                    }
                    C17921a1.a(FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), null, ComposableLambdaKt.c(-102854293, true, new C1510a(this.f104391a, this.f104392b, this.f104393c, this.f104394d), composer, 54), ComposableLambdaKt.c(610343626, true, new C1511b(this.f104391a, this.f104392b, this.f104394d, this.f104393c), composer, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(2089171922, true, new c(this.f104392b, this.f104394d, this.f104391a, this.f104395e, this.f104396f, this.f104397g, this.f104398h, this.f104393c, this.f104399i, this.f104400j, this.f104401k), composer, 54), composer, 3456, 12582912, 131058);
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

            /* JADX WARN: Multi-variable type inference failed */
            a(C17893M0 c17893m0, Function0<? extends qv.C0> function0, CheckoutActivity checkoutActivity, InterfaceC5730l0<Boolean> interfaceC5730l0, InterfaceC5730l0<Boolean> interfaceC5730l02, androidx.compose.runtime.z1<CheckoutViewState> z1Var, InterfaceC5730l0<Boolean> interfaceC5730l03, InterfaceC5730l0<Boolean> interfaceC5730l04, InterfaceC5730l0<Boolean> interfaceC5730l05, Function0<? extends qv.C0> function02, InterfaceC5730l0<Hj.d> interfaceC5730l06) {
                this.f104373a = c17893m0;
                this.f104374b = function0;
                this.f104375c = checkoutActivity;
                this.f104376d = interfaceC5730l0;
                this.f104377e = interfaceC5730l02;
                this.f104378f = z1Var;
                this.f104379g = interfaceC5730l03;
                this.f104380h = interfaceC5730l04;
                this.f104381i = interfaceC5730l05;
                this.f104382j = function02;
                this.f104383k = interfaceC5730l06;
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
                    ComposerKt.U(798728471, i11, -1, "com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity.onCreate.<anonymous>.<anonymous> (CheckoutActivity.kt:146)");
                }
                float f10 = 10;
                C17891L0.b(ComposableLambdaKt.c(-1604097879, true, new C1508a(AdsTheme, this.f104374b, this.f104375c, this.f104376d, this.f104377e, this.f104378f, this.f104379g), composer, 54), null, this.f104373a, false, C16692i.e(H1.h.p(f10), H1.h.p(f10), 0.0f, 0.0f, 12, null), 0.0f, 0L, 0L, 0L, ComposableLambdaKt.c(1058600784, true, new C1509b(this.f104380h, AdsTheme, this.f104378f, this.f104375c, this.f104381i, this.f104382j, this.f104374b, this.f104383k, this.f104377e, this.f104376d, this.f104379g), composer, 54), composer, (C17893M0.f167209e << 6) | 805306374, 490);
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
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity$onCreate$1$closeSheet$1$1$1", f = "CheckoutActivity.kt", l = {136}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity$b$b, reason: collision with other inner class name */
        static final class C1517b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f104451a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17893M0 f104452b;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1517b(this.f104452b, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1517b(C17893M0 c17893m0, Continuation<? super C1517b> continuation) {
                super(2, continuation);
                this.f104452b = c17893m0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((C1517b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f104451a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17893M0 c17893m0 = this.f104452b;
                    this.f104451a = 1;
                    if (c17893m0.i(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity$onCreate$1$openSheet$1$1$1", f = "CheckoutActivity.kt", l = {133}, m = "invokeSuspend")
        static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f104453a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17893M0 f104454b;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new c(this.f104454b, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C17893M0 c17893m0, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f104454b = c17893m0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f104453a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17893M0 c17893m0 = this.f104454b;
                    this.f104453a = 1;
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
        public static final qv.C0 A(InterfaceC16622O interfaceC16622O, C17893M0 c17893m0) {
            return C16648k.d(interfaceC16622O, null, null, new c(c17893m0, null), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final qv.C0 B(InterfaceC16622O interfaceC16622O, C17893M0 c17893m0) {
            return C16648k.d(interfaceC16622O, null, null, new C1517b(c17893m0, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            r(composer, num.intValue());
            return Unit.f142422a;
        }

        public final void r(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2019445498, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity.onCreate.<anonymous> (CheckoutActivity.kt:122)");
            }
            final androidx.compose.runtime.z1 z1VarB = androidx.compose.runtime.o1.b(CheckoutActivity.this.X1().g0().c(), null, composer, 0, 1);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = androidx.compose.runtime.t1.e(Boolean.TRUE, null, 2, null);
                composer.t(objB);
            }
            InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = androidx.compose.runtime.t1.e(Boolean.FALSE, null, 2, null);
                composer.t(objB2);
            }
            InterfaceC5730l0 interfaceC5730l02 = (InterfaceC5730l0) objB2;
            composer.P();
            final C17893M0 c17893m0J = C17891L0.j(EnumC17895N0.f167226a, null, null, true, composer, 3078, 6);
            Object objB3 = composer.B();
            if (objB3 == companion.a()) {
                objB3 = androidx.compose.runtime.J.k(EmptyCoroutineContext.f142646a, composer);
                composer.t(objB3);
            }
            final InterfaceC16622O interfaceC16622O = (InterfaceC16622O) objB3;
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(interfaceC16622O) | composer.D(c17893m0J);
            Object objB4 = composer.B();
            if (zD || objB4 == companion.a()) {
                objB4 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.A
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CheckoutActivity.b.A(interfaceC16622O, c17893m0J);
                    }
                };
                composer.t(objB4);
            }
            Function0 function0 = (Function0) objB4;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zD2 = composer.D(interfaceC16622O) | composer.D(c17893m0J);
            Object objB5 = composer.B();
            if (zD2 || objB5 == companion.a()) {
                objB5 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.B
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CheckoutActivity.b.B(interfaceC16622O, c17893m0J);
                    }
                };
                composer.t(objB5);
            }
            Function0 function02 = (Function0) objB5;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB6 = composer.B();
            if (objB6 == companion.a()) {
                objB6 = androidx.compose.runtime.t1.e(Boolean.FALSE, null, 2, null);
                composer.t(objB6);
            }
            InterfaceC5730l0 interfaceC5730l03 = (InterfaceC5730l0) objB6;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB7 = composer.B();
            if (objB7 == companion.a()) {
                objB7 = androidx.compose.runtime.t1.e(Boolean.FALSE, null, 2, null);
                composer.t(objB7);
            }
            InterfaceC5730l0 interfaceC5730l04 = (InterfaceC5730l0) objB7;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB8 = composer.B();
            if (objB8 == companion.a()) {
                objB8 = androidx.compose.runtime.t1.e(Boolean.FALSE, null, 2, null);
                composer.t(objB8);
            }
            InterfaceC5730l0 interfaceC5730l05 = (InterfaceC5730l0) objB8;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB9 = composer.B();
            if (objB9 == companion.a()) {
                objB9 = androidx.compose.runtime.t1.e(null, null, 2, null);
                composer.t(objB9);
            }
            composer.P();
            Ji.K.b(null, ComposableLambdaKt.c(798728471, true, new a(c17893m0J, function02, CheckoutActivity.this, interfaceC5730l04, interfaceC5730l03, z1VarB, interfaceC5730l05, interfaceC5730l0, interfaceC5730l02, function0, (InterfaceC5730l0) objB9), composer, 54), composer, 48, 1);
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(z1VarB) | composer.D(CheckoutActivity.this);
            final CheckoutActivity checkoutActivity = CheckoutActivity.this;
            Object objB10 = composer.B();
            if (zV || objB10 == companion.a()) {
                objB10 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.C
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CheckoutActivity.b.z(checkoutActivity, z1VarB);
                    }
                };
                composer.t(objB10);
            }
            composer.P();
            C13588d.a(false, (Function0) objB10, composer, 0, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean C(InterfaceC5730l0<Boolean> interfaceC5730l0) {
            return interfaceC5730l0.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void D(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
            interfaceC5730l0.setValue(Boolean.valueOf(z10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CheckoutViewState s(androidx.compose.runtime.z1<CheckoutViewState> z1Var) {
            return z1Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean t(InterfaceC5730l0<Boolean> interfaceC5730l0) {
            return interfaceC5730l0.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void u(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
            interfaceC5730l0.setValue(Boolean.valueOf(z10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean v(InterfaceC5730l0<Boolean> interfaceC5730l0) {
            return interfaceC5730l0.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void w(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
            interfaceC5730l0.setValue(Boolean.valueOf(z10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Hj.d x(InterfaceC5730l0<Hj.d> interfaceC5730l0) {
            return interfaceC5730l0.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void y(InterfaceC5730l0<Hj.d> interfaceC5730l0, Hj.d dVar) {
            interfaceC5730l0.setValue(dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit z(CheckoutActivity checkoutActivity, androidx.compose.runtime.z1 z1Var) throws IOException {
            if (s(z1Var).getIsEbtPinPadProcessing()) {
                checkoutActivity.X1().r0(z1.h.x.f105140a);
            } else {
                checkoutActivity.finish();
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/meijer/mobile/meijer/activity/checkout/review/CheckoutActivity$c", "Landroidx/activity/F;", "", "handleOnBackPressed", "()V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends androidx.view.F {
        c() {
            super(false);
        }

        @Override // androidx.view.F
        public void handleOnBackPressed() {
            new C14886b(CheckoutActivity.this).setTitle(com.meijer.mobile.meijer.Y.f100001cc).setCancelable(false).setMessage(com.meijer.mobile.meijer.Y.f99981bc).setNegativeButton(yr.Q.f170986b, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.checkout.review.a0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    CheckoutActivity.c.b(dialogInterface, i10);
                }
            }).show();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "Lkotlin/reflect/KProperty;", "property", "oldValue", "newValue", "", "afterChange", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class d extends ObservableProperty<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CheckoutActivity f104456b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Object obj, CheckoutActivity checkoutActivity) {
            super(obj);
            this.f104456b = checkoutActivity;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty<?> property, Boolean oldValue, Boolean newValue) {
            Intrinsics.j(property, "property");
            boolean zBooleanValue = newValue.booleanValue();
            oldValue.getClass();
            this.f104456b.orderProcessingBackPressedCallback.setEnabled(zBooleanValue);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f104457f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f104457f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f104457f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f104458f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f104458f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f104458f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f104459f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f104460g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f104459f = function0;
            this.f104460g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f104459f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f104460g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class h extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f104461f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f104461f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f104461f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class i extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f104462f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f104462f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f104462f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class j extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f104463f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f104464g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f104463f = function0;
            this.f104464g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f104463f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f104464g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.meijer.mobile.meijer.activity.checkout.payment.ebt.r U1() {
        return (com.meijer.mobile.meijer.activity.checkout.payment.ebt.r) this.ebtPinPadViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean W1() {
        return ((Boolean) this.orderSubmitted.getValue(this, f104362A[0])).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z1 X1() {
        return (z1) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y1() {
        startActivity(FulfillmentSlotsActivity.INSTANCE.a(this, new FulfillmentSlotsActivity.FulfillmentSlotsActivityExtras(true, true)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z1() {
        startActivity(CheckoutPaymentHostActivity.Companion.b(CheckoutPaymentHostActivity.INSTANCE, this, true, true, false, 8, null));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c2(boolean z10) {
        this.orderSubmitted.setValue(this, f104362A[0], Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e2(String title, String message) {
        FrameLayout frameLayout;
        DialogTitle dialogTitle;
        TextView textView;
        androidx.appcompat.app.c cVarShow = new C14886b(this).setTitle(title).setMessage(message).setNegativeButton(com.meijer.mobile.meijer.Y.f100169l1, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.checkout.review.x
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                CheckoutActivity.f2(dialogInterface, i10);
            }
        }).setPositiveButton(com.meijer.mobile.meijer.Y.f99529Dh, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.checkout.review.y
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) throws IOException {
                CheckoutActivity.g2(this.f105059a, dialogInterface, i10);
            }
        }).show();
        if (cVarShow != null && (textView = (TextView) cVarShow.findViewById(R.id.message)) != null) {
        }
        if (cVarShow != null && (dialogTitle = (DialogTitle) cVarShow.findViewById(ae.f.f44681a)) != null) {
        }
        if (cVarShow == null || (frameLayout = (FrameLayout) cVarShow.findViewById(ae.f.f44683b)) == null) {
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h2(int title, int message, int positiveButtonText, final Function0<Unit> onPositiveButtonClick) {
        new C14886b(this).setTitle(title).setMessage(message).setPositiveButton(positiveButtonText, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.checkout.review.z
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                CheckoutActivity.i2(onPositiveButtonClick, dialogInterface, i10);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i2(Function0 function0, DialogInterface dialogInterface, int i10) {
        if (function0 != null) {
            function0.invoke();
        }
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j2() {
        new C14886b(this).setTitle(com.meijer.mobile.meijer.Y.f100332t4).setMessage(com.meijer.mobile.meijer.Y.f100312s4).setPositiveButton(com.meijer.mobile.meijer.Y.f100169l1, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.checkout.review.v
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) throws IOException {
                CheckoutActivity.k2(this.f105041a, dialogInterface, i10);
            }
        }).setCancelable(true).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.meijer.mobile.meijer.activity.checkout.review.w
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) throws IOException {
                CheckoutActivity.l2(this.f105049a, dialogInterface);
            }
        }).show();
    }

    public final Gm.f V1() {
        Gm.f fVar = this.ebtTimer;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.y("ebtTimer");
        return null;
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) throws IOException {
        Parcelable parcelable;
        Intrinsics.j(intent, "intent");
        if (intent.hasExtra("paymentOption")) {
            setIntent(intent);
            this.cardSet = false;
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) intent.getParcelableExtra("paymentOption", MultiTenderPaymentOption.class);
            } else {
                Parcelable parcelableExtra = intent.getParcelableExtra("paymentOption");
                if (!(parcelableExtra instanceof MultiTenderPaymentOption)) {
                    parcelableExtra = null;
                }
                parcelable = (MultiTenderPaymentOption) parcelableExtra;
            }
            X1().r0(new z1.h.UpdatePaymentDetails((MultiTenderPaymentOption) parcelable));
        }
        super.onNewIntent(intent);
    }

    @Override // Gm.f.a
    public void z0(String timerString) {
        Intrinsics.j(timerString, "timerString");
        X1().c1(timerString);
    }

    public CheckoutActivity() {
        Delegates delegates = Delegates.f142874a;
        this.orderSubmitted = new d(Boolean.FALSE, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a2() {
        startActivity(getMeijerIntent().p(this, false));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b2() {
        Cl.e meijerIntent = getMeijerIntent();
        String string = getString(com.meijer.mobile.meijer.Y.f100215n7);
        Intrinsics.i(string, "getString(...)");
        meijerIntent.d0(this, string);
    }

    private final void d2() throws IOException {
        Parcelable parcelable;
        V1().k(this);
        getOnBackPressedDispatcher().h(this.orderProcessingBackPressedCallback);
        if (getIntent().hasExtra("paymentOption") & (!this.cardSet)) {
            this.cardSet = true;
            Intent intent = getIntent();
            Intrinsics.i(intent, "getIntent(...)");
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) intent.getParcelableExtra("paymentOption", MultiTenderPaymentOption.class);
            } else {
                Parcelable parcelableExtra = intent.getParcelableExtra("paymentOption");
                if (!(parcelableExtra instanceof MultiTenderPaymentOption)) {
                    parcelableExtra = null;
                }
                parcelable = (MultiTenderPaymentOption) parcelableExtra;
            }
            X1().r0(new z1.h.UpdatePaymentDetails((MultiTenderPaymentOption) parcelable));
        }
        X1().r0(z1.h.c.f105116a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f2(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g2(CheckoutActivity checkoutActivity, DialogInterface dialogInterface, int i10) throws IOException {
        dialogInterface.dismiss();
        checkoutActivity.X1().r0(z1.h.g.f105120a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k2(CheckoutActivity checkoutActivity, DialogInterface dialogInterface, int i10) throws IOException {
        dialogInterface.dismiss();
        checkoutActivity.X1().r0(z1.h.f.f105119a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l2(CheckoutActivity checkoutActivity, DialogInterface dialogInterface) throws IOException {
        dialogInterface.dismiss();
        checkoutActivity.X1().r0(z1.h.f.f105119a);
    }

    @Override // Gm.f.a
    public void P() {
        j2();
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws IOException {
        super.onCreate(savedInstanceState);
        d2();
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-2019445498, true, new b()), 1, null);
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() throws IOException {
        super.onResume();
        X1().r0(z1.h.r.f105133a);
        FS.page("Checkout | Review Page").start();
    }
}
