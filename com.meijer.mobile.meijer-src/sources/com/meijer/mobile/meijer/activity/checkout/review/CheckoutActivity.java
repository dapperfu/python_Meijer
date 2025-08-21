package com.meijer.mobile.meijer.activity.checkout.review;

import Bm.C2985b0;
import Bm.C3011v;
import Bm.C3013x;
import Hm.f;
import Ki.LocalThemeScope;
import V2.CreationExtras;
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
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import bk.AbstractC6392a;
import com.fullstory.FS;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.core.networking.exceptions.RetrofitException;
import com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationActivity;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.FulfillmentSlotsActivity;
import com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentHostActivity;
import com.meijer.mobile.meijer.activity.checkout.payment.ebt.r;
import com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity;
import com.meijer.mobile.meijer.activity.checkout.review.z1;
import dk.C13698b;
import e.C13736d;
import e.C13737e;
import hj.OrderDetail;
import hk.MultiTenderPaymentOption;
import j0.InterfaceC14882C;
import j0.InterfaceC14902f;
import java.io.IOException;
import kotlin.C17957L0;
import kotlin.C17959M0;
import kotlin.C17987a1;
import kotlin.EnumC17961N0;
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
import le.C15485b;
import mv.C15809k;
import mv.InterfaceC15783O;
import p1.C16338g;
import pv.C16563h;
import r0.C16806i;
import xs.EnumC18220b;

@Metadata(d1 = {"\u0000\u007f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001C\b\u0001\u0018\u0000 O2\u00020\u00012\u00020\u0002:\u0001PB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J?\u0010\u000e\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0004J\u001f\u0010\u0015\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u001b\u0010\u0004J\u0017\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0005H\u0016¢\u0006\u0004\b \u0010\u0004J\u0017\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\"\u0010#R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001b\u0010=\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010:\u001a\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER+\u0010N\u001a\u0002042\u0006\u0010G\u001a\u0002048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010M¨\u0006X²\u0006\f\u0010R\u001a\u00020Q8\nX\u008a\u0084\u0002²\u0006\u000e\u0010S\u001a\u0002048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010T\u001a\u0002048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010U\u001a\u0002048\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010W\u001a\u0004\u0018\u00010V8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/CheckoutActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "LHm/f$a;", "<init>", "()V", "", "d2", "Z1", "", "title", "message", "positiveButtonText", "Lkotlin/Function0;", "onPositiveButtonClick", "h2", "(IIILkotlin/jvm/functions/Function0;)V", "Y1", "a2", "b2", "j2", "", "e2", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "Q", "timerString", "D0", "(Ljava/lang/String;)V", "Lzl/k;", "s", "Lzl/k;", "getFeaturemanager", "()Lzl/k;", "setFeaturemanager", "(Lzl/k;)V", "featuremanager", "LHm/f;", "t", "LHm/f;", "V1", "()LHm/f;", "setEbtTimer", "(LHm/f;)V", "ebtTimer", "", "u", "Z", "cardSet", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1;", "v", "Lkotlin/Lazy;", "X1", "()Lcom/meijer/mobile/meijer/activity/checkout/review/z1;", "viewModel", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r;", "w", "U1", "()Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r;", "ebtPinPadViewModel", "com/meijer/mobile/meijer/activity/checkout/review/CheckoutActivity$c", "x", "Lcom/meijer/mobile/meijer/activity/checkout/review/CheckoutActivity$c;", "orderProcessingBackPressedCallback", "<set-?>", "y", "Lkotlin/properties/ReadWriteProperty;", "W1", "()Z", "c2", "(Z)V", "orderSubmitted", "z", "a", "Lcom/meijer/mobile/meijer/activity/checkout/review/D1;", "viewState", "displayAdjustEbtSheet", "displayExtendedRangeInformationSheet", "displayEBTPinPadScreen", "LIj/d;", "modalToShow", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class CheckoutActivity extends Hilt_CheckoutActivity implements f.a {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public zl.k featuremanager;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public Hm.f ebtTimer;

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
    static final /* synthetic */ KProperty<Object>[] f105217A = {Reflection.f(new MutablePropertyReference1Impl(CheckoutActivity.class, "orderSubmitted", "getOrderSubmitted()Z", 0))};

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: B, reason: collision with root package name */
    public static final int f105218B = 8;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/CheckoutActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lhk/e;", "paymentOption", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Lhk/e;)Landroid/content/Intent;", "", "EXTRA_PAYMENT_OPTION", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
            final /* synthetic */ C17959M0 f105228a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<mv.C0> f105229b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ CheckoutActivity f105230c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f105231d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f105232e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.z1<CheckoutViewState> f105233f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f105234g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f105235h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f105236i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ Function0<mv.C0> f105237j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Ij.d> f105238k;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity$b$a$a, reason: collision with other inner class name */
            static final class C1517a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f105239a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Function0<mv.C0> f105240b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ CheckoutActivity f105241c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<Boolean> f105242d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<Boolean> f105243e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ androidx.compose.runtime.z1<CheckoutViewState> f105244f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<Boolean> f105245g;

                public final void l(InterfaceC14902f ModalBottomSheetLayout, Composer composer, int i10) {
                    Intrinsics.j(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1604097879, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (CheckoutActivity.kt:150)");
                    }
                    if (b.t(this.f105242d)) {
                        composer.startReplaceGroup(-1873694477);
                        String strC = C16338g.c(com.meijer.mobile.meijer.Y.f101255w5, composer, 0);
                        String strC2 = C16338g.c(com.meijer.mobile.meijer.Y.f101235v5, composer, 0);
                        LocalThemeScope localThemeScope = this.f105239a;
                        composer.startReplaceGroup(-1633490746);
                        boolean zV = composer.V(this.f105240b);
                        final Function0<mv.C0> function0 = this.f105240b;
                        final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f105242d;
                        Object objB = composer.B();
                        if (zV || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.D
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CheckoutActivity.b.a.C1517a.o(function0, interfaceC5872l0);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        C2985b0.g(localThemeScope, null, strC, strC2, null, (Function0) objB, composer, LocalThemeScope.f17314g, 9);
                        composer.P();
                    } else if (b.C(this.f105243e)) {
                        composer.startReplaceGroup(-1873137965);
                        LocalThemeScope localThemeScope2 = this.f105239a;
                        AdjustEbtPaymentDecorator adjustEbtPaymentDecorator = b.s(this.f105244f).getAdjustEbtPaymentDecorator();
                        composer.startReplaceGroup(-1633490746);
                        boolean zV2 = composer.V(this.f105240b);
                        final Function0<mv.C0> function02 = this.f105240b;
                        final InterfaceC5872l0<Boolean> interfaceC5872l02 = this.f105243e;
                        Object objB2 = composer.B();
                        if (zV2 || objB2 == Composer.INSTANCE.a()) {
                            objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.E
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CheckoutActivity.b.a.C1517a.s(function02, interfaceC5872l02);
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
                                    return CheckoutActivity.b.a.C1517a.t();
                                }
                            };
                            composer.t(objB3);
                        }
                        Function0 function04 = (Function0) objB3;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(this.f105241c);
                        final CheckoutActivity checkoutActivity = this.f105241c;
                        Object objB4 = composer.B();
                        if (zD || objB4 == companion.a()) {
                            objB4 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.review.G
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CheckoutActivity.b.a.C1517a.u(checkoutActivity, ((Double) obj).doubleValue());
                                }
                            };
                            composer.t(objB4);
                        }
                        composer.P();
                        C12078f.c(localThemeScope2, null, adjustEbtPaymentDecorator, function03, function04, (Function1) objB4, composer, LocalThemeScope.f17314g | 24576 | (AbstractC6392a.f60445b << 6), 1);
                        composer.P();
                    } else if (b.v(this.f105245g)) {
                        composer.startReplaceGroup(-1872257534);
                        String acculynkPostBody = b.s(this.f105244f).getAcculynkPostBody();
                        if (acculynkPostBody == null || acculynkPostBody.length() == 0) {
                            this.f105240b.invoke();
                        } else {
                            LocalThemeScope localThemeScope3 = this.f105239a;
                            String ebtTimerText = b.s(this.f105244f).getEbtTimerText();
                            boolean isLoading = b.s(this.f105244f).getLoadingState().getIsLoading();
                            composer.startReplaceGroup(5004770);
                            boolean zD2 = composer.D(this.f105241c);
                            final CheckoutActivity checkoutActivity2 = this.f105241c;
                            Object objB5 = composer.B();
                            if (zD2 || objB5 == Composer.INSTANCE.a()) {
                                objB5 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.H
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CheckoutActivity.b.a.C1517a.v(checkoutActivity2);
                                    }
                                };
                                composer.t(objB5);
                            }
                            Function0 function05 = (Function0) objB5;
                            composer.P();
                            composer.startReplaceGroup(5004770);
                            boolean zD3 = composer.D(this.f105241c);
                            final CheckoutActivity checkoutActivity3 = this.f105241c;
                            Object objB6 = composer.B();
                            if (zD3 || objB6 == Composer.INSTANCE.a()) {
                                objB6 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.review.I
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return CheckoutActivity.b.a.C1517a.p(checkoutActivity3, (String) obj);
                                    }
                                };
                                composer.t(objB6);
                            }
                            Function1 function1 = (Function1) objB6;
                            composer.P();
                            String acculynkPostBody2 = b.s(this.f105244f).getAcculynkPostBody();
                            Intrinsics.g(acculynkPostBody2);
                            composer.startReplaceGroup(-1633490746);
                            boolean zV3 = composer.V(this.f105240b) | composer.D(this.f105241c);
                            final Function0<mv.C0> function06 = this.f105240b;
                            final CheckoutActivity checkoutActivity4 = this.f105241c;
                            Object objB7 = composer.B();
                            if (zV3 || objB7 == Composer.INSTANCE.a()) {
                                objB7 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.J
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CheckoutActivity.b.a.C1517a.q(function06, checkoutActivity4);
                                    }
                                };
                                composer.t(objB7);
                            }
                            composer.P();
                            Im.h.e(localThemeScope3, null, true, ebtTimerText, isLoading, function05, function1, acculynkPostBody2, (Function0) objB7, composer, LocalThemeScope.f17314g | 384, 1);
                            Unit unit = Unit.f143329a;
                        }
                        composer.P();
                    } else {
                        composer.startReplaceGroup(-1870953519);
                        String strC3 = C16338g.c(com.meijer.mobile.meijer.Y.f101288xi, composer, 0);
                        String strC4 = C16338g.c(com.meijer.mobile.meijer.Y.f101266wg, composer, 0);
                        String strC5 = C16338g.c(com.meijer.mobile.meijer.Y.f101286xg, composer, 0);
                        LocalThemeScope localThemeScope4 = this.f105239a;
                        composer.startReplaceGroup(5004770);
                        boolean zV4 = composer.V(this.f105240b);
                        final Function0<mv.C0> function07 = this.f105240b;
                        Object objB8 = composer.B();
                        if (zV4 || objB8 == Composer.INSTANCE.a()) {
                            objB8 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.K
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CheckoutActivity.b.a.C1517a.r(function07);
                                }
                            };
                            composer.t(objB8);
                        }
                        composer.P();
                        C2985b0.g(localThemeScope4, null, strC3, strC4, strC5, (Function0) objB8, composer, LocalThemeScope.f17314g, 1);
                        composer.P();
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                C1517a(LocalThemeScope localThemeScope, Function0<? extends mv.C0> function0, CheckoutActivity checkoutActivity, InterfaceC5872l0<Boolean> interfaceC5872l0, InterfaceC5872l0<Boolean> interfaceC5872l02, androidx.compose.runtime.z1<CheckoutViewState> z1Var, InterfaceC5872l0<Boolean> interfaceC5872l03) {
                    this.f105239a = localThemeScope;
                    this.f105240b = function0;
                    this.f105241c = checkoutActivity;
                    this.f105242d = interfaceC5872l0;
                    this.f105243e = interfaceC5872l02;
                    this.f105244f = z1Var;
                    this.f105245g = interfaceC5872l03;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit t() {
                    return Unit.f143329a;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
                    l(interfaceC14902f, composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit o(Function0 function0, InterfaceC5872l0 interfaceC5872l0) {
                    function0.invoke();
                    b.u(interfaceC5872l0, false);
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit p(CheckoutActivity checkoutActivity, String str) {
                    checkoutActivity.U1().I(str);
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit q(Function0 function0, CheckoutActivity checkoutActivity) throws IOException {
                    function0.invoke();
                    checkoutActivity.X1().r0(z1.h.C1539h.f105976a);
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit r(Function0 function0) {
                    function0.invoke();
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit s(Function0 function0, InterfaceC5872l0 interfaceC5872l0) {
                    function0.invoke();
                    b.D(interfaceC5872l0, false);
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit u(CheckoutActivity checkoutActivity, double d10) throws IOException {
                    checkoutActivity.X1().r0(new z1.h.UpdateEbtApprovedAmount(d10));
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit v(CheckoutActivity checkoutActivity) throws IOException {
                    checkoutActivity.X1().r0(z1.h.j.f105978a);
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity$b$a$b, reason: collision with other inner class name */
            static final class C1518b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<Boolean> f105246a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f105247b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ androidx.compose.runtime.z1<CheckoutViewState> f105248c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ CheckoutActivity f105249d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<Boolean> f105250e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Function0<mv.C0> f105251f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ Function0<mv.C0> f105252g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<Ij.d> f105253h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<Boolean> f105254i;

                /* renamed from: j, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<Boolean> f105255j;

                /* renamed from: k, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<Boolean> f105256k;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity$b$a$b$a, reason: collision with other inner class name */
                static final class C1519a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ InterfaceC5872l0<Boolean> f105257a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f105258b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.runtime.z1<CheckoutViewState> f105259c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ CheckoutActivity f105260d;

                    C1519a(InterfaceC5872l0<Boolean> interfaceC5872l0, LocalThemeScope localThemeScope, androidx.compose.runtime.z1<CheckoutViewState> z1Var, CheckoutActivity checkoutActivity) {
                        this.f105257a = interfaceC5872l0;
                        this.f105258b = localThemeScope;
                        this.f105259c = z1Var;
                        this.f105260d = checkoutActivity;
                    }

                    public final void b(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-102854293, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutActivity.kt:211)");
                        }
                        if (this.f105257a.getValue().booleanValue() || b.s(this.f105259c).getEbtTimerText() != null) {
                            LocalThemeScope localThemeScope = this.f105258b;
                            Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
                            String strC = C16338g.c(com.meijer.mobile.meijer.Y.f100409Eh, composer, 0);
                            composer.startReplaceGroup(-1633490746);
                            boolean zV = composer.V(this.f105259c) | composer.D(this.f105260d);
                            final CheckoutActivity checkoutActivity = this.f105260d;
                            final androidx.compose.runtime.z1<CheckoutViewState> z1Var = this.f105259c;
                            Object objB = composer.B();
                            if (zV || objB == Composer.INSTANCE.a()) {
                                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.L
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CheckoutActivity.b.a.C1518b.C1519a.c(checkoutActivity, z1Var);
                                    }
                                };
                                composer.t(objB);
                            }
                            composer.P();
                            C3011v.c(localThemeScope, modifierH, strC, (Function0) objB, false, composer, LocalThemeScope.f17314g | 48, 8);
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        b(composer, num.intValue());
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit c(CheckoutActivity checkoutActivity, androidx.compose.runtime.z1 z1Var) throws IOException {
                        if (b.s(z1Var).getIsEbtPinPadProcessing()) {
                            checkoutActivity.X1().r0(z1.h.x.f105995a);
                        } else {
                            checkoutActivity.finish();
                        }
                        return Unit.f143329a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity$b$a$b$b, reason: collision with other inner class name */
                static final class C1520b implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ InterfaceC5872l0<Boolean> f105261a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f105262b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ CheckoutActivity f105263c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.runtime.z1<CheckoutViewState> f105264d;

                    C1520b(InterfaceC5872l0<Boolean> interfaceC5872l0, LocalThemeScope localThemeScope, CheckoutActivity checkoutActivity, androidx.compose.runtime.z1<CheckoutViewState> z1Var) {
                        this.f105261a = interfaceC5872l0;
                        this.f105262b = localThemeScope;
                        this.f105263c = checkoutActivity;
                        this.f105264d = z1Var;
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
                        if (this.f105261a.getValue().booleanValue() || b.s(this.f105264d).getEbtTimerText() != null) {
                            LocalThemeScope localThemeScope = this.f105262b;
                            Modifier modifierH = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, H1.h.p(16)), 0.0f, 1, null);
                            composer.startReplaceGroup(-1633490746);
                            boolean zD = composer.D(this.f105263c);
                            final CheckoutActivity checkoutActivity = this.f105263c;
                            final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f105261a;
                            Object objB = composer.B();
                            if (zD || objB == Composer.INSTANCE.a()) {
                                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.M
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CheckoutActivity.b.a.C1518b.C1520b.c(checkoutActivity, interfaceC5872l0);
                                    }
                                };
                                composer.t(objB);
                            }
                            Function0 function0 = (Function0) objB;
                            composer.P();
                            composer.startReplaceGroup(-1870257881);
                            if (this.f105263c.W1()) {
                                string = this.f105263c.getResources().getString(com.meijer.mobile.meijer.Y.f101054m4);
                                Intrinsics.g(string);
                            } else {
                                string = C13698b.a(b.s(this.f105264d).getPlaceOrderButtonText(), composer, AbstractC6392a.f60445b);
                            }
                            String str = string;
                            composer.P();
                            C3013x.b(localThemeScope, modifierH, function0, str, true, null, null, false, composer, LocalThemeScope.f17314g | 24624, 112);
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
                        b(composer, num.intValue());
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit c(CheckoutActivity checkoutActivity, InterfaceC5872l0 interfaceC5872l0) throws IOException {
                        if (!checkoutActivity.W1()) {
                            checkoutActivity.c2(true);
                            interfaceC5872l0.setValue(Boolean.FALSE);
                            checkoutActivity.X1().r0(new z1.h.SubmitOrderAction(true));
                        } else {
                            checkoutActivity.X1().r0(z1.h.v.f105993a);
                        }
                        return Unit.f143329a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity$b$a$b$c */
                static final class c implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f105265a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ CheckoutActivity f105266b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ InterfaceC5872l0<Boolean> f105267c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ InterfaceC5872l0<Boolean> f105268d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ Function0<mv.C0> f105269e;

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ Function0<mv.C0> f105270f;

                    /* renamed from: g, reason: collision with root package name */
                    final /* synthetic */ InterfaceC5872l0<Ij.d> f105271g;

                    /* renamed from: h, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.runtime.z1<CheckoutViewState> f105272h;

                    /* renamed from: i, reason: collision with root package name */
                    final /* synthetic */ InterfaceC5872l0<Boolean> f105273i;

                    /* renamed from: j, reason: collision with root package name */
                    final /* synthetic */ InterfaceC5872l0<Boolean> f105274j;

                    /* renamed from: k, reason: collision with root package name */
                    final /* synthetic */ InterfaceC5872l0<Boolean> f105275k;

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
                    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity$onCreate$1$1$2$3$10$1", f = "CheckoutActivity.kt", l = {}, m = "invokeSuspend")
                    /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity$b$a$b$c$a, reason: collision with other inner class name */
                    static final class C1521a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                        /* renamed from: a, reason: collision with root package name */
                        int f105276a;

                        /* renamed from: b, reason: collision with root package name */
                        private /* synthetic */ Object f105277b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ CheckoutActivity f105278c;

                        /* renamed from: d, reason: collision with root package name */
                        final /* synthetic */ Function0<mv.C0> f105279d;

                        /* renamed from: e, reason: collision with root package name */
                        final /* synthetic */ InterfaceC5872l0<Boolean> f105280e;

                        /* renamed from: f, reason: collision with root package name */
                        final /* synthetic */ InterfaceC5872l0<Boolean> f105281f;

                        /* renamed from: g, reason: collision with root package name */
                        final /* synthetic */ InterfaceC5872l0<Boolean> f105282g;

                        /* renamed from: h, reason: collision with root package name */
                        final /* synthetic */ InterfaceC5872l0<Boolean> f105283h;

                        /* renamed from: i, reason: collision with root package name */
                        final /* synthetic */ InterfaceC5872l0<Boolean> f105284i;

                        /* renamed from: j, reason: collision with root package name */
                        final /* synthetic */ InterfaceC5872l0<Ij.d> f105285j;

                        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/z1$j;", "event", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/checkout/review/z1$j;)V"}, k = 3, mv = {2, 1, 0})
                        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity$onCreate$1$1$2$3$10$1$1", f = "CheckoutActivity.kt", l = {}, m = "invokeSuspend")
                        /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity$b$a$b$c$a$a, reason: collision with other inner class name */
                        static final class C1522a extends SuspendLambda implements Function2<z1.j, Continuation<? super Unit>, Object> {

                            /* renamed from: a, reason: collision with root package name */
                            int f105286a;

                            /* renamed from: b, reason: collision with root package name */
                            /* synthetic */ Object f105287b;

                            /* renamed from: c, reason: collision with root package name */
                            final /* synthetic */ CheckoutActivity f105288c;

                            /* renamed from: d, reason: collision with root package name */
                            final /* synthetic */ Function0<mv.C0> f105289d;

                            /* renamed from: e, reason: collision with root package name */
                            final /* synthetic */ InterfaceC5872l0<Boolean> f105290e;

                            /* renamed from: f, reason: collision with root package name */
                            final /* synthetic */ InterfaceC5872l0<Boolean> f105291f;

                            /* renamed from: g, reason: collision with root package name */
                            final /* synthetic */ InterfaceC5872l0<Boolean> f105292g;

                            /* renamed from: h, reason: collision with root package name */
                            final /* synthetic */ InterfaceC5872l0<Boolean> f105293h;

                            /* renamed from: i, reason: collision with root package name */
                            final /* synthetic */ InterfaceC5872l0<Boolean> f105294i;

                            /* renamed from: j, reason: collision with root package name */
                            final /* synthetic */ InterfaceC5872l0<Ij.d> f105295j;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            C1522a(CheckoutActivity checkoutActivity, Function0<? extends mv.C0> function0, InterfaceC5872l0<Boolean> interfaceC5872l0, InterfaceC5872l0<Boolean> interfaceC5872l02, InterfaceC5872l0<Boolean> interfaceC5872l03, InterfaceC5872l0<Boolean> interfaceC5872l04, InterfaceC5872l0<Boolean> interfaceC5872l05, InterfaceC5872l0<Ij.d> interfaceC5872l06, Continuation<? super C1522a> continuation) {
                                super(2, continuation);
                                this.f105288c = checkoutActivity;
                                this.f105289d = function0;
                                this.f105290e = interfaceC5872l0;
                                this.f105291f = interfaceC5872l02;
                                this.f105292g = interfaceC5872l03;
                                this.f105293h = interfaceC5872l04;
                                this.f105294i = interfaceC5872l05;
                                this.f105295j = interfaceC5872l06;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit r(InterfaceC5872l0 interfaceC5872l0) {
                                b.y(interfaceC5872l0, null);
                                return Unit.f143329a;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit s(InterfaceC5872l0 interfaceC5872l0) {
                                b.y(interfaceC5872l0, null);
                                return Unit.f143329a;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                C1522a c1522a = new C1522a(this.f105288c, this.f105289d, this.f105290e, this.f105291f, this.f105292g, this.f105293h, this.f105294i, this.f105295j, continuation);
                                c1522a.f105287b = obj;
                                return c1522a;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            /* renamed from: q, reason: merged with bridge method [inline-methods] */
                            public final Object invoke(z1.j jVar, Continuation<? super Unit> continuation) {
                                return ((C1522a) create(jVar, continuation)).invokeSuspend(Unit.f143329a);
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final void t(InterfaceC5872l0 interfaceC5872l0, CheckoutActivity checkoutActivity, DialogInterface dialogInterface, int i10) throws IOException {
                                interfaceC5872l0.setValue(Boolean.FALSE);
                                dialogInterface.dismiss();
                                checkoutActivity.X1().r0(new z1.h.SendAdobeActionTag(true));
                                checkoutActivity.X1().r0(new z1.h.SubmitOrderAction(false));
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) throws IOException {
                                String strA;
                                IntrinsicsKt.f();
                                if (this.f105286a != 0) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.b(obj);
                                z1.j jVar = (z1.j) this.f105287b;
                                if (jVar instanceof z1.j.ShowEBTPinPadEvent) {
                                    this.f105288c.orderProcessingBackPressedCallback.setEnabled(false);
                                    b.D(this.f105292g, false);
                                    b.u(this.f105293h, false);
                                    b.w(this.f105294i, true);
                                    this.f105289d.invoke();
                                    if (!this.f105288c.V1().getTimerRunningStatus()) {
                                        this.f105288c.V1().l(115L);
                                    }
                                    this.f105288c.V1().k(this.f105288c);
                                } else if (jVar instanceof z1.j.NavigateToOrderConfirmationEvent) {
                                    CheckoutActivity checkoutActivity = this.f105288c;
                                    OrderConfirmationActivity.Companion companion = OrderConfirmationActivity.INSTANCE;
                                    z1.j.NavigateToOrderConfirmationEvent navigateToOrderConfirmationEvent = (z1.j.NavigateToOrderConfirmationEvent) jVar;
                                    String orderId = navigateToOrderConfirmationEvent.getOrderId();
                                    checkoutActivity.startActivity(companion.a(checkoutActivity, orderId == null ? "" : orderId, navigateToOrderConfirmationEvent.getInformation(), navigateToOrderConfirmationEvent.getIsBopasEligibleCart(), navigateToOrderConfirmationEvent.getSendPreTipAnalytics()));
                                    this.f105288c.finish();
                                } else if (jVar instanceof z1.j.OrderSubmittedSuccessEvent) {
                                    this.f105290e.setValue(Boxing.a(false));
                                    this.f105291f.setValue(Boxing.a(true));
                                    z1 z1VarX1 = this.f105288c.X1();
                                    z1.j.OrderSubmittedSuccessEvent orderSubmittedSuccessEvent = (z1.j.OrderSubmittedSuccessEvent) jVar;
                                    int i10 = !orderSubmittedSuccessEvent.getDisplayEbtPinPad() ? Cj.n.f5004c : Cj.n.f5002a;
                                    OrderDetail orderDetail = orderSubmittedSuccessEvent.getOrderDetail();
                                    z1VarX1.r0(new z1.h.SetCheckoutAnimations(true, new CheckoutAnimations(i10, null, false, false, orderDetail != null ? orderDetail.getCode() : null, orderSubmittedSuccessEvent.getInformation(), orderSubmittedSuccessEvent.getDisplayEbtPinPad(), 14, null)));
                                    this.f105288c.getFirebasePerformanceEngine().b("cart_checkout_trace");
                                } else if (jVar instanceof z1.j.SubmitOrderErrorEvent) {
                                    this.f105290e.setValue(Boxing.a(false));
                                    this.f105291f.setValue(Boxing.a(true));
                                    z1.j.SubmitOrderErrorEvent submitOrderErrorEvent = (z1.j.SubmitOrderErrorEvent) jVar;
                                    this.f105288c.X1().r0(new z1.h.SetCheckoutAnimations(true, new CheckoutAnimations(Cj.n.f5003b, submitOrderErrorEvent.getButtonText(), submitOrderErrorEvent.getIsTimeSlotError(), true, null, null, false, 112, null)));
                                    this.f105288c.c2(false);
                                    this.f105288c.getFirebasePerformanceEngine().b("cart_checkout_trace");
                                } else if (jVar instanceof z1.j.a) {
                                    this.f105288c.a2();
                                } else if (jVar instanceof z1.j.ShowErrorDialogEvent) {
                                    this.f105288c.c2(false);
                                    this.f105290e.setValue(Boxing.a(true));
                                    CheckoutErrorDialogDecorator checkoutErrorDialogDecorator = ((z1.j.ShowErrorDialogEvent) jVar).getCheckoutErrorDialogDecorator();
                                    this.f105288c.h2(checkoutErrorDialogDecorator.getTitle(), checkoutErrorDialogDecorator.getMessage(), checkoutErrorDialogDecorator.getButtonText(), checkoutErrorDialogDecorator.c());
                                } else if (jVar instanceof z1.j.ShowAgeRestrictedDialog) {
                                    z1.j.ShowAgeRestrictedDialog showAgeRestrictedDialog = (z1.j.ShowAgeRestrictedDialog) jVar;
                                    RetrofitException retrofitException = showAgeRestrictedDialog.getRetrofitException();
                                    if (retrofitException == null || (strA = retrofitException.c(this.f105288c)) == null) {
                                        strA = ck.d.a(this.f105288c, showAgeRestrictedDialog.getMessage());
                                    }
                                    String str = strA;
                                    InterfaceC5872l0<Ij.d> interfaceC5872l0 = this.f105295j;
                                    String strA2 = ck.d.a(this.f105288c, showAgeRestrictedDialog.getTitle());
                                    String strA3 = ck.d.a(this.f105288c, showAgeRestrictedDialog.getButtonText());
                                    final InterfaceC5872l0<Ij.d> interfaceC5872l02 = this.f105295j;
                                    Function0 function0 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.U
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return CheckoutActivity.b.a.C1518b.c.C1521a.C1522a.r(interfaceC5872l02);
                                        }
                                    };
                                    final InterfaceC5872l0<Ij.d> interfaceC5872l03 = this.f105295j;
                                    b.y(interfaceC5872l0, new Ij.d(strA2, str, strA3, function0, new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.V
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return CheckoutActivity.b.a.C1518b.c.C1521a.C1522a.s(interfaceC5872l03);
                                        }
                                    }, null, null, null, 224, null));
                                } else if (jVar instanceof z1.j.ShowFutureTimeslotAlert) {
                                    this.f105290e.setValue(Boxing.a(true));
                                    z1.j.ShowFutureTimeslotAlert showFutureTimeslotAlert = (z1.j.ShowFutureTimeslotAlert) jVar;
                                    C15485b message = new C15485b(this.f105288c).setTitle(ck.d.a(this.f105288c, showFutureTimeslotAlert.getAlertTitle())).setCancelable(false).setMessage(ck.d.a(this.f105288c, showFutureTimeslotAlert.getAlertMessage()));
                                    int i11 = com.meijer.mobile.meijer.Y.f100622Q1;
                                    final InterfaceC5872l0<Boolean> interfaceC5872l04 = this.f105290e;
                                    final CheckoutActivity checkoutActivity2 = this.f105288c;
                                    C15485b positiveButton = message.setPositiveButton(i11, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.checkout.review.W
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i12) throws IOException {
                                            CheckoutActivity.b.a.C1518b.c.C1521a.C1522a.t(interfaceC5872l04, checkoutActivity2, dialogInterface, i12);
                                        }
                                    });
                                    int i12 = com.meijer.mobile.meijer.Y.f100716V0;
                                    final CheckoutActivity checkoutActivity3 = this.f105288c;
                                    positiveButton.setNegativeButton(i12, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.checkout.review.X
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i13) throws IOException {
                                            CheckoutActivity.b.a.C1518b.c.C1521a.C1522a.u(checkoutActivity3, dialogInterface, i13);
                                        }
                                    }).show();
                                } else if (jVar instanceof z1.j.NavigateToOrderDetailEvent) {
                                    CheckoutActivity checkoutActivity4 = this.f105288c;
                                    Bl.l lVar = Bl.l.f3131a;
                                    z1.j.NavigateToOrderDetailEvent navigateToOrderDetailEvent = (z1.j.NavigateToOrderDetailEvent) jVar;
                                    String orderId2 = navigateToOrderDetailEvent.getOrderId();
                                    checkoutActivity4.startActivity(Bl.l.b(lVar, checkoutActivity4, orderId2 == null ? "" : orderId2, null, navigateToOrderDetailEvent.getShortCode(), 4, null));
                                    this.f105288c.finish();
                                } else if (jVar instanceof z1.j.h) {
                                    C15485b message2 = new C15485b(this.f105288c).setTitle(com.meijer.mobile.meijer.Y.f101303yd).setMessage(com.meijer.mobile.meijer.Y.f101283xd);
                                    int i13 = com.meijer.mobile.meijer.Y.f101263wd;
                                    final CheckoutActivity checkoutActivity5 = this.f105288c;
                                    message2.setNegativeButton(i13, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.checkout.review.Y
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i14) throws IOException {
                                            CheckoutActivity.b.a.C1518b.c.C1521a.C1522a.v(checkoutActivity5, dialogInterface, i14);
                                        }
                                    }).setPositiveButton(com.meijer.mobile.meijer.Y.f101031l1, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.checkout.review.Z
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i14) {
                                            CheckoutActivity.b.a.C1518b.c.C1521a.C1522a.x(dialogInterface, i14);
                                        }
                                    }).show();
                                } else {
                                    if (!(jVar instanceof z1.j.d)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    this.f105288c.Z1();
                                }
                                return Unit.f143329a;
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
                                checkoutActivity.X1().r0(z1.h.p.f105986a);
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final void x(DialogInterface dialogInterface, int i10) {
                                dialogInterface.dismiss();
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        C1521a(CheckoutActivity checkoutActivity, Function0<? extends mv.C0> function0, InterfaceC5872l0<Boolean> interfaceC5872l0, InterfaceC5872l0<Boolean> interfaceC5872l02, InterfaceC5872l0<Boolean> interfaceC5872l03, InterfaceC5872l0<Boolean> interfaceC5872l04, InterfaceC5872l0<Boolean> interfaceC5872l05, InterfaceC5872l0<Ij.d> interfaceC5872l06, Continuation<? super C1521a> continuation) {
                            super(2, continuation);
                            this.f105278c = checkoutActivity;
                            this.f105279d = function0;
                            this.f105280e = interfaceC5872l0;
                            this.f105281f = interfaceC5872l02;
                            this.f105282g = interfaceC5872l03;
                            this.f105283h = interfaceC5872l04;
                            this.f105284i = interfaceC5872l05;
                            this.f105285j = interfaceC5872l06;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C1521a c1521a = new C1521a(this.f105278c, this.f105279d, this.f105280e, this.f105281f, this.f105282g, this.f105283h, this.f105284i, this.f105285j, continuation);
                            c1521a.f105277b = obj;
                            return c1521a;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                            return ((C1521a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.f();
                            if (this.f105276a == 0) {
                                ResultKt.b(obj);
                                C16563h.J(C16563h.O(this.f105278c.X1().g0().b(), new C1522a(this.f105278c, this.f105279d, this.f105280e, this.f105281f, this.f105282g, this.f105283h, this.f105284i, this.f105285j, null)), (InterfaceC15783O) this.f105277b);
                                return Unit.f143329a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
                    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity$onCreate$1$1$2$3$11$1", f = "CheckoutActivity.kt", l = {}, m = "invokeSuspend")
                    /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity$b$a$b$c$b, reason: collision with other inner class name */
                    static final class C1523b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                        /* renamed from: a, reason: collision with root package name */
                        int f105296a;

                        /* renamed from: b, reason: collision with root package name */
                        private /* synthetic */ Object f105297b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ CheckoutActivity f105298c;

                        /* renamed from: d, reason: collision with root package name */
                        final /* synthetic */ Function0<mv.C0> f105299d;

                        /* renamed from: e, reason: collision with root package name */
                        final /* synthetic */ InterfaceC5872l0<Boolean> f105300e;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        C1523b(CheckoutActivity checkoutActivity, Function0<? extends mv.C0> function0, InterfaceC5872l0<Boolean> interfaceC5872l0, Continuation<? super C1523b> continuation) {
                            super(2, continuation);
                            this.f105298c = checkoutActivity;
                            this.f105299d = function0;
                            this.f105300e = interfaceC5872l0;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C1523b c1523b = new C1523b(this.f105298c, this.f105299d, this.f105300e, continuation);
                            c1523b.f105297b = obj;
                            return c1523b;
                        }

                        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r$h;", "effect", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r$h;)V"}, k = 3, mv = {2, 1, 0})
                        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity$onCreate$1$1$2$3$11$1$1", f = "CheckoutActivity.kt", l = {}, m = "invokeSuspend")
                        /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity$b$a$b$c$b$a, reason: collision with other inner class name */
                        static final class C1524a extends SuspendLambda implements Function2<r.h, Continuation<? super Unit>, Object> {

                            /* renamed from: a, reason: collision with root package name */
                            int f105301a;

                            /* renamed from: b, reason: collision with root package name */
                            /* synthetic */ Object f105302b;

                            /* renamed from: c, reason: collision with root package name */
                            final /* synthetic */ Function0<mv.C0> f105303c;

                            /* renamed from: d, reason: collision with root package name */
                            final /* synthetic */ CheckoutActivity f105304d;

                            /* renamed from: e, reason: collision with root package name */
                            final /* synthetic */ InterfaceC5872l0<Boolean> f105305e;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            C1524a(Function0<? extends mv.C0> function0, CheckoutActivity checkoutActivity, InterfaceC5872l0<Boolean> interfaceC5872l0, Continuation<? super C1524a> continuation) {
                                super(2, continuation);
                                this.f105303c = function0;
                                this.f105304d = checkoutActivity;
                                this.f105305e = interfaceC5872l0;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                C1524a c1524a = new C1524a(this.f105303c, this.f105304d, this.f105305e, continuation);
                                c1524a.f105302b = obj;
                                return c1524a;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            /* renamed from: d, reason: merged with bridge method [inline-methods] */
                            public final Object invoke(r.h hVar, Continuation<? super Unit> continuation) {
                                return ((C1524a) create(hVar, continuation)).invokeSuspend(Unit.f143329a);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) throws Resources.NotFoundException, IOException {
                                IntrinsicsKt.f();
                                if (this.f105301a == 0) {
                                    ResultKt.b(obj);
                                    r.h hVar = (r.h) this.f105302b;
                                    if (hVar instanceof r.h.a) {
                                        this.f105303c.invoke();
                                        b.w(this.f105305e, false);
                                        this.f105304d.X1().r0(z1.h.e.f105973a);
                                    } else if (hVar instanceof r.h.ShowErrorState) {
                                        this.f105304d.X1().r0(z1.h.C1539h.f105976a);
                                        r.h.ShowErrorState showErrorState = (r.h.ShowErrorState) hVar;
                                        String errorCode = showErrorState.getErrorCode();
                                        if (errorCode != null && errorCode.length() != 0) {
                                            String errorMessage = showErrorState.getErrorMessage();
                                            if (errorMessage != null) {
                                                this.f105304d.X1().r0(new z1.h.TrackEBTErrorAnalytics(errorMessage));
                                            }
                                            Hm.a aVarA = Hm.a.INSTANCE.a(showErrorState.getErrorCode());
                                            CheckoutActivity checkoutActivity = this.f105304d;
                                            String string = checkoutActivity.getResources().getString(aVarA.getHeaderResourceId());
                                            Intrinsics.i(string, "getString(...)");
                                            String string2 = this.f105304d.getResources().getString(aVarA.getMessageResourceId());
                                            Intrinsics.i(string2, "getString(...)");
                                            checkoutActivity.e2(string, string2);
                                        } else if (!this.f105304d.V1().getTimerRunningStatus()) {
                                            this.f105304d.j2();
                                        }
                                    } else if (hVar instanceof r.h.HandlePinPadSuccess) {
                                        this.f105304d.V1().g();
                                        this.f105304d.X1().r0(z1.h.i.f105977a);
                                    } else {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f143329a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                            return ((C1523b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.f();
                            if (this.f105296a == 0) {
                                ResultKt.b(obj);
                                C16563h.J(C16563h.O(this.f105298c.U1().G().a(), new C1524a(this.f105299d, this.f105298c, this.f105300e, null)), (InterfaceC15783O) this.f105297b);
                                return Unit.f143329a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity$b$a$b$c$c, reason: collision with other inner class name */
                    /* synthetic */ class C1525c extends FunctionReferenceImpl implements Function1<z1.h, Unit> {
                        C1525c(Object obj) {
                            super(1, obj, z1.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/checkout/review/CheckoutViewModel$Action;)V", 0);
                        }

                        public final void a(z1.h p02) throws IOException {
                            Intrinsics.j(p02, "p0");
                            ((z1) this.receiver).r0(p02);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(z1.h hVar) throws IOException {
                            a(hVar);
                            return Unit.f143329a;
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
                            ((z1) this.receiver).y0(p02);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(z1.m mVar) {
                            a(mVar);
                            return Unit.f143329a;
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit l(Function0 function0, InterfaceC5872l0 interfaceC5872l0) {
                        b.u(interfaceC5872l0, true);
                        function0.invoke();
                        return Unit.f143329a;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    c(LocalThemeScope localThemeScope, CheckoutActivity checkoutActivity, InterfaceC5872l0<Boolean> interfaceC5872l0, InterfaceC5872l0<Boolean> interfaceC5872l02, Function0<? extends mv.C0> function0, Function0<? extends mv.C0> function02, InterfaceC5872l0<Ij.d> interfaceC5872l03, androidx.compose.runtime.z1<CheckoutViewState> z1Var, InterfaceC5872l0<Boolean> interfaceC5872l04, InterfaceC5872l0<Boolean> interfaceC5872l05, InterfaceC5872l0<Boolean> interfaceC5872l06) {
                        this.f105265a = localThemeScope;
                        this.f105266b = checkoutActivity;
                        this.f105267c = interfaceC5872l0;
                        this.f105268d = interfaceC5872l02;
                        this.f105269e = function0;
                        this.f105270f = function02;
                        this.f105271g = interfaceC5872l03;
                        this.f105272h = z1Var;
                        this.f105273i = interfaceC5872l04;
                        this.f105274j = interfaceC5872l05;
                        this.f105275k = interfaceC5872l06;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit p(CheckoutActivity checkoutActivity, EnumC18220b tipOption) {
                        Intrinsics.j(tipOption, "tipOption");
                        checkoutActivity.X1().y0(new z1.m.SetSelectedTipOption(tipOption));
                        return Unit.f143329a;
                    }

                    public final void g(InterfaceC14882C paddingValues, Composer composer, int i10) {
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
                        Ij.d dVarX = b.x(this.f105271g);
                        composer.startReplaceGroup(1944492177);
                        if (dVarX != null) {
                            Ij.g.b(this.f105265a, dVarX, composer, LocalThemeScope.f17314g | (Ij.d.f14809i << 3));
                            Unit unit = Unit.f143329a;
                        }
                        composer.P();
                        LocalThemeScope localThemeScope = this.f105265a;
                        Modifier modifierH = androidx.compose.foundation.layout.D.h(androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null), paddingValues);
                        CheckoutViewState checkoutViewStateS = b.s(this.f105272h);
                        boolean z10 = this.f105266b.cardSet;
                        InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f105267c;
                        InterfaceC5872l0<Boolean> interfaceC5872l02 = this.f105268d;
                        z1 z1VarX1 = this.f105266b.X1();
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(z1VarX1);
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new C1525c(z1VarX1);
                            composer.t(objB);
                        }
                        composer.P();
                        Function1 function1 = (Function1) ((KFunction) objB);
                        z1 z1VarX12 = this.f105266b.X1();
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
                        boolean zD3 = composer.D(this.f105266b);
                        final CheckoutActivity checkoutActivity = this.f105266b;
                        Object objB3 = composer.B();
                        if (zD3 || objB3 == Composer.INSTANCE.a()) {
                            objB3 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.review.N
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CheckoutActivity.b.a.C1518b.c.p(checkoutActivity, (EnumC18220b) obj);
                                }
                            };
                            composer.t(objB3);
                        }
                        Function1 function13 = (Function1) objB3;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD4 = composer.D(this.f105266b);
                        final CheckoutActivity checkoutActivity2 = this.f105266b;
                        Object objB4 = composer.B();
                        if (zD4 || objB4 == Composer.INSTANCE.a()) {
                            objB4 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.review.O
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CheckoutActivity.b.a.C1518b.c.q(checkoutActivity2, ((Double) obj).doubleValue());
                                }
                            };
                            composer.t(objB4);
                        }
                        Function1 function14 = (Function1) objB4;
                        composer.P();
                        composer.startReplaceGroup(-1746271574);
                        boolean zV = composer.V(this.f105269e) | composer.D(this.f105266b);
                        final CheckoutActivity checkoutActivity3 = this.f105266b;
                        final Function0<mv.C0> function0 = this.f105269e;
                        final InterfaceC5872l0<Boolean> interfaceC5872l03 = this.f105273i;
                        Object objB5 = composer.B();
                        if (zV || objB5 == Composer.INSTANCE.a()) {
                            objB5 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.P
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CheckoutActivity.b.a.C1518b.c.r(checkoutActivity3, function0, interfaceC5872l03);
                                }
                            };
                            composer.t(objB5);
                        }
                        Function0 function02 = (Function0) objB5;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zV2 = composer.V(this.f105269e);
                        final Function0<mv.C0> function03 = this.f105269e;
                        Object objB6 = composer.B();
                        if (zV2 || objB6 == Composer.INSTANCE.a()) {
                            objB6 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.Q
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CheckoutActivity.b.a.C1518b.c.k(function03);
                                }
                            };
                            composer.t(objB6);
                        }
                        Function0 function04 = (Function0) objB6;
                        composer.P();
                        composer.startReplaceGroup(-1633490746);
                        boolean zV3 = composer.V(this.f105269e);
                        final Function0<mv.C0> function05 = this.f105269e;
                        final InterfaceC5872l0<Boolean> interfaceC5872l04 = this.f105274j;
                        Object objB7 = composer.B();
                        if (zV3 || objB7 == Composer.INSTANCE.a()) {
                            objB7 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.S
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CheckoutActivity.b.a.C1518b.c.l(function05, interfaceC5872l04);
                                }
                            };
                            composer.t(objB7);
                        }
                        Function0 function06 = (Function0) objB7;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD5 = composer.D(this.f105266b);
                        final CheckoutActivity checkoutActivity4 = this.f105266b;
                        Object objB8 = composer.B();
                        if (zD5 || objB8 == Composer.INSTANCE.a()) {
                            objB8 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.T
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CheckoutActivity.b.a.C1518b.c.o(checkoutActivity4);
                                }
                            };
                            composer.t(objB8);
                        }
                        composer.P();
                        Z0.i0(localThemeScope, modifierH, checkoutViewStateS, z10, interfaceC5872l0, interfaceC5872l02, function1, function12, function13, function14, function02, function04, function06, (Function0) objB8, composer, LocalThemeScope.f17314g | 221184, 0, 0);
                        Unit unit2 = Unit.f143329a;
                        composer.startReplaceGroup(-1224400529);
                        boolean zD6 = composer.D(this.f105266b) | composer.V(this.f105269e);
                        CheckoutActivity checkoutActivity5 = this.f105266b;
                        Function0<mv.C0> function07 = this.f105269e;
                        InterfaceC5872l0<Boolean> interfaceC5872l05 = this.f105267c;
                        InterfaceC5872l0<Boolean> interfaceC5872l06 = this.f105268d;
                        InterfaceC5872l0<Boolean> interfaceC5872l07 = this.f105273i;
                        InterfaceC5872l0<Boolean> interfaceC5872l08 = this.f105274j;
                        InterfaceC5872l0<Boolean> interfaceC5872l09 = this.f105275k;
                        InterfaceC5872l0<Ij.d> interfaceC5872l010 = this.f105271g;
                        Object objB9 = composer.B();
                        if (zD6 || objB9 == Composer.INSTANCE.a()) {
                            objB9 = new C1521a(checkoutActivity5, function07, interfaceC5872l05, interfaceC5872l06, interfaceC5872l07, interfaceC5872l08, interfaceC5872l09, interfaceC5872l010, null);
                            composer.t(objB9);
                        }
                        composer.P();
                        androidx.compose.runtime.J.g(unit2, (Function2) objB9, composer, 6);
                        Boolean bool = Boolean.TRUE;
                        composer.startReplaceGroup(-1746271574);
                        boolean zD7 = composer.D(this.f105266b) | composer.V(this.f105270f);
                        CheckoutActivity checkoutActivity6 = this.f105266b;
                        Function0<mv.C0> function08 = this.f105270f;
                        InterfaceC5872l0<Boolean> interfaceC5872l011 = this.f105275k;
                        Object objB10 = composer.B();
                        if (zD7 || objB10 == Composer.INSTANCE.a()) {
                            objB10 = new C1523b(checkoutActivity6, function08, interfaceC5872l011, null);
                            composer.t(objB10);
                        }
                        composer.P();
                        androidx.compose.runtime.J.g(bool, (Function2) objB10, composer, 6);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
                        g(interfaceC14882C, composer, num.intValue());
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit k(Function0 function0) {
                        function0.invoke();
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit o(CheckoutActivity checkoutActivity) {
                        checkoutActivity.b2();
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit q(CheckoutActivity checkoutActivity, double d10) {
                        checkoutActivity.X1().y0(new z1.m.SetCustomTipAmount(d10));
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit r(CheckoutActivity checkoutActivity, Function0 function0, InterfaceC5872l0 interfaceC5872l0) throws IOException {
                        checkoutActivity.X1().r0(z1.h.C12140a.f105969a);
                        b.D(interfaceC5872l0, true);
                        function0.invoke();
                        return Unit.f143329a;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                C1518b(InterfaceC5872l0<Boolean> interfaceC5872l0, LocalThemeScope localThemeScope, androidx.compose.runtime.z1<CheckoutViewState> z1Var, CheckoutActivity checkoutActivity, InterfaceC5872l0<Boolean> interfaceC5872l02, Function0<? extends mv.C0> function0, Function0<? extends mv.C0> function02, InterfaceC5872l0<Ij.d> interfaceC5872l03, InterfaceC5872l0<Boolean> interfaceC5872l04, InterfaceC5872l0<Boolean> interfaceC5872l05, InterfaceC5872l0<Boolean> interfaceC5872l06) {
                    this.f105246a = interfaceC5872l0;
                    this.f105247b = localThemeScope;
                    this.f105248c = z1Var;
                    this.f105249d = checkoutActivity;
                    this.f105250e = interfaceC5872l02;
                    this.f105251f = function0;
                    this.f105252g = function02;
                    this.f105253h = interfaceC5872l03;
                    this.f105254i = interfaceC5872l04;
                    this.f105255j = interfaceC5872l05;
                    this.f105256k = interfaceC5872l06;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1058600784, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (CheckoutActivity.kt:208)");
                    }
                    C17987a1.a(FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), null, ComposableLambdaKt.c(-102854293, true, new C1519a(this.f105246a, this.f105247b, this.f105248c, this.f105249d), composer, 54), ComposableLambdaKt.c(610343626, true, new C1520b(this.f105246a, this.f105247b, this.f105249d, this.f105248c), composer, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(2089171922, true, new c(this.f105247b, this.f105249d, this.f105246a, this.f105250e, this.f105251f, this.f105252g, this.f105253h, this.f105248c, this.f105254i, this.f105255j, this.f105256k), composer, 54), composer, 3456, 12582912, 131058);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    a(composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(C17959M0 c17959m0, Function0<? extends mv.C0> function0, CheckoutActivity checkoutActivity, InterfaceC5872l0<Boolean> interfaceC5872l0, InterfaceC5872l0<Boolean> interfaceC5872l02, androidx.compose.runtime.z1<CheckoutViewState> z1Var, InterfaceC5872l0<Boolean> interfaceC5872l03, InterfaceC5872l0<Boolean> interfaceC5872l04, InterfaceC5872l0<Boolean> interfaceC5872l05, Function0<? extends mv.C0> function02, InterfaceC5872l0<Ij.d> interfaceC5872l06) {
                this.f105228a = c17959m0;
                this.f105229b = function0;
                this.f105230c = checkoutActivity;
                this.f105231d = interfaceC5872l0;
                this.f105232e = interfaceC5872l02;
                this.f105233f = z1Var;
                this.f105234g = interfaceC5872l03;
                this.f105235h = interfaceC5872l04;
                this.f105236i = interfaceC5872l05;
                this.f105237j = function02;
                this.f105238k = interfaceC5872l06;
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
                C17957L0.b(ComposableLambdaKt.c(-1604097879, true, new C1517a(AdsTheme, this.f105229b, this.f105230c, this.f105231d, this.f105232e, this.f105233f, this.f105234g), composer, 54), null, this.f105228a, false, C16806i.e(H1.h.p(f10), H1.h.p(f10), 0.0f, 0.0f, 12, null), 0.0f, 0L, 0L, 0L, ComposableLambdaKt.c(1058600784, true, new C1518b(this.f105235h, AdsTheme, this.f105233f, this.f105230c, this.f105236i, this.f105237j, this.f105229b, this.f105238k, this.f105232e, this.f105231d, this.f105234g), composer, 54), composer, (C17959M0.f168297e << 6) | 805306374, 490);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity$onCreate$1$closeSheet$1$1$1", f = "CheckoutActivity.kt", l = {136}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity$b$b, reason: collision with other inner class name */
        static final class C1526b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f105306a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17959M0 f105307b;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1526b(this.f105307b, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1526b(C17959M0 c17959m0, Continuation<? super C1526b> continuation) {
                super(2, continuation);
                this.f105307b = c17959m0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((C1526b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f105306a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17959M0 c17959m0 = this.f105307b;
                    this.f105306a = 1;
                    if (c17959m0.i(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity$onCreate$1$openSheet$1$1$1", f = "CheckoutActivity.kt", l = {133}, m = "invokeSuspend")
        static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f105308a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17959M0 f105309b;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new c(this.f105309b, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C17959M0 c17959m0, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f105309b = c17959m0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f105308a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17959M0 c17959m0 = this.f105309b;
                    this.f105308a = 1;
                    if (c17959m0.l(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mv.C0 A(InterfaceC15783O interfaceC15783O, C17959M0 c17959m0) {
            return C15809k.d(interfaceC15783O, null, null, new c(c17959m0, null), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mv.C0 B(InterfaceC15783O interfaceC15783O, C17959M0 c17959m0) {
            return C15809k.d(interfaceC15783O, null, null, new C1526b(c17959m0, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            r(composer, num.intValue());
            return Unit.f143329a;
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
            InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = androidx.compose.runtime.t1.e(Boolean.FALSE, null, 2, null);
                composer.t(objB2);
            }
            InterfaceC5872l0 interfaceC5872l02 = (InterfaceC5872l0) objB2;
            composer.P();
            final C17959M0 c17959m0J = C17957L0.j(EnumC17961N0.f168314a, null, null, true, composer, 3078, 6);
            Object objB3 = composer.B();
            if (objB3 == companion.a()) {
                objB3 = androidx.compose.runtime.J.k(EmptyCoroutineContext.f143553a, composer);
                composer.t(objB3);
            }
            final InterfaceC15783O interfaceC15783O = (InterfaceC15783O) objB3;
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(interfaceC15783O) | composer.D(c17959m0J);
            Object objB4 = composer.B();
            if (zD || objB4 == companion.a()) {
                objB4 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.A
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CheckoutActivity.b.A(interfaceC15783O, c17959m0J);
                    }
                };
                composer.t(objB4);
            }
            Function0 function0 = (Function0) objB4;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zD2 = composer.D(interfaceC15783O) | composer.D(c17959m0J);
            Object objB5 = composer.B();
            if (zD2 || objB5 == companion.a()) {
                objB5 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.B
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CheckoutActivity.b.B(interfaceC15783O, c17959m0J);
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
            InterfaceC5872l0 interfaceC5872l03 = (InterfaceC5872l0) objB6;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB7 = composer.B();
            if (objB7 == companion.a()) {
                objB7 = androidx.compose.runtime.t1.e(Boolean.FALSE, null, 2, null);
                composer.t(objB7);
            }
            InterfaceC5872l0 interfaceC5872l04 = (InterfaceC5872l0) objB7;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB8 = composer.B();
            if (objB8 == companion.a()) {
                objB8 = androidx.compose.runtime.t1.e(Boolean.FALSE, null, 2, null);
                composer.t(objB8);
            }
            InterfaceC5872l0 interfaceC5872l05 = (InterfaceC5872l0) objB8;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB9 = composer.B();
            if (objB9 == companion.a()) {
                objB9 = androidx.compose.runtime.t1.e(null, null, 2, null);
                composer.t(objB9);
            }
            composer.P();
            Ki.K.b(null, ComposableLambdaKt.c(798728471, true, new a(c17959m0J, function02, CheckoutActivity.this, interfaceC5872l04, interfaceC5872l03, z1VarB, interfaceC5872l05, interfaceC5872l0, interfaceC5872l02, function0, (InterfaceC5872l0) objB9), composer, 54), composer, 48, 1);
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
            C13736d.a(false, (Function0) objB10, composer, 0, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean C(InterfaceC5872l0<Boolean> interfaceC5872l0) {
            return interfaceC5872l0.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void D(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
            interfaceC5872l0.setValue(Boolean.valueOf(z10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CheckoutViewState s(androidx.compose.runtime.z1<CheckoutViewState> z1Var) {
            return z1Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean t(InterfaceC5872l0<Boolean> interfaceC5872l0) {
            return interfaceC5872l0.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void u(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
            interfaceC5872l0.setValue(Boolean.valueOf(z10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean v(InterfaceC5872l0<Boolean> interfaceC5872l0) {
            return interfaceC5872l0.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void w(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
            interfaceC5872l0.setValue(Boolean.valueOf(z10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Ij.d x(InterfaceC5872l0<Ij.d> interfaceC5872l0) {
            return interfaceC5872l0.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void y(InterfaceC5872l0<Ij.d> interfaceC5872l0, Ij.d dVar) {
            interfaceC5872l0.setValue(dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit z(CheckoutActivity checkoutActivity, androidx.compose.runtime.z1 z1Var) throws IOException {
            if (s(z1Var).getIsEbtPinPadProcessing()) {
                checkoutActivity.X1().r0(z1.h.x.f105995a);
            } else {
                checkoutActivity.finish();
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/meijer/mobile/meijer/activity/checkout/review/CheckoutActivity$c", "Landroidx/activity/F;", "", "handleOnBackPressed", "()V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends androidx.view.F {
        c() {
            super(false);
        }

        @Override // androidx.view.F
        public void handleOnBackPressed() {
            new C15485b(CheckoutActivity.this).setTitle(com.meijer.mobile.meijer.Y.f100923fc).setCancelable(false).setMessage(com.meijer.mobile.meijer.Y.f100903ec).setNegativeButton(yr.Q.f171761b, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.checkout.review.a0
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
        final /* synthetic */ CheckoutActivity f105311b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Object obj, CheckoutActivity checkoutActivity) {
            super(obj);
            this.f105311b = checkoutActivity;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty<?> property, Boolean oldValue, Boolean newValue) {
            Intrinsics.j(property, "property");
            boolean zBooleanValue = newValue.booleanValue();
            oldValue.getClass();
            this.f105311b.orderProcessingBackPressedCallback.setEnabled(zBooleanValue);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f105312f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f105312f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f105312f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f105313f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f105313f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f105313f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f105314f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f105315g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f105314f = function0;
            this.f105315g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f105314f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f105315g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class h extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f105316f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f105316f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f105316f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class i extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f105317f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f105317f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f105317f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class j extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f105318f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f105319g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f105318f = function0;
            this.f105319g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f105318f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f105319g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.meijer.mobile.meijer.activity.checkout.payment.ebt.r U1() {
        return (com.meijer.mobile.meijer.activity.checkout.payment.ebt.r) this.ebtPinPadViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean W1() {
        return ((Boolean) this.orderSubmitted.getValue(this, f105217A[0])).booleanValue();
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
        this.orderSubmitted.setValue(this, f105217A[0], Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e2(String title, String message) {
        FrameLayout frameLayout;
        DialogTitle dialogTitle;
        TextView textView;
        androidx.appcompat.app.c cVarShow = new C15485b(this).setTitle(title).setMessage(message).setNegativeButton(com.meijer.mobile.meijer.Y.f101031l1, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.checkout.review.x
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                CheckoutActivity.f2(dialogInterface, i10);
            }
        }).setPositiveButton(com.meijer.mobile.meijer.Y.f100486Ih, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.checkout.review.y
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) throws IOException {
                CheckoutActivity.g2(this.f105914a, dialogInterface, i10);
            }
        }).show();
        if (cVarShow != null && (textView = (TextView) cVarShow.findViewById(R.id.message)) != null) {
        }
        if (cVarShow != null && (dialogTitle = (DialogTitle) cVarShow.findViewById(ce.f.f61696a)) != null) {
        }
        if (cVarShow == null || (frameLayout = (FrameLayout) cVarShow.findViewById(ce.f.f61698b)) == null) {
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h2(int title, int message, int positiveButtonText, final Function0<Unit> onPositiveButtonClick) {
        new C15485b(this).setTitle(title).setMessage(message).setPositiveButton(positiveButtonText, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.checkout.review.z
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
        new C15485b(this).setTitle(com.meijer.mobile.meijer.Y.f101194t4).setMessage(com.meijer.mobile.meijer.Y.f101174s4).setPositiveButton(com.meijer.mobile.meijer.Y.f101031l1, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.checkout.review.v
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) throws IOException {
                CheckoutActivity.k2(this.f105896a, dialogInterface, i10);
            }
        }).setCancelable(true).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.meijer.mobile.meijer.activity.checkout.review.w
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) throws IOException {
                CheckoutActivity.l2(this.f105904a, dialogInterface);
            }
        }).show();
    }

    @Override // Hm.f.a
    public void D0(String timerString) {
        Intrinsics.j(timerString, "timerString");
        X1().c1(timerString);
    }

    public final Hm.f V1() {
        Hm.f fVar = this.ebtTimer;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.x("ebtTimer");
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

    public CheckoutActivity() {
        Delegates delegates = Delegates.f143781a;
        this.orderSubmitted = new d(Boolean.FALSE, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a2() {
        startActivity(getMeijerIntent().p(this, false));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b2() {
        Dl.e meijerIntent = getMeijerIntent();
        String string = getString(com.meijer.mobile.meijer.Y.f101137q7);
        Intrinsics.i(string, "getString(...)");
        meijerIntent.e0(this, string);
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
        X1().r0(z1.h.c.f105971a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f2(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g2(CheckoutActivity checkoutActivity, DialogInterface dialogInterface, int i10) throws IOException {
        dialogInterface.dismiss();
        checkoutActivity.X1().r0(z1.h.g.f105975a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k2(CheckoutActivity checkoutActivity, DialogInterface dialogInterface, int i10) throws IOException {
        dialogInterface.dismiss();
        checkoutActivity.X1().r0(z1.h.f.f105974a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l2(CheckoutActivity checkoutActivity, DialogInterface dialogInterface) throws IOException {
        dialogInterface.dismiss();
        checkoutActivity.X1().r0(z1.h.f.f105974a);
    }

    @Override // Hm.f.a
    public void Q() {
        j2();
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws IOException {
        super.onCreate(savedInstanceState);
        d2();
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-2019445498, true, new b()), 1, null);
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() throws IOException {
        super.onResume();
        X1().r0(z1.h.r.f105988a);
        FS.page("Checkout | Review Page").start();
    }
}
