package com.meijer.mobile.meijer.activity.checkout.payment;

import Bm.C3011v;
import Bm.C3013x;
import Gm.EbtBalance;
import Ik.Validation;
import Ki.LocalThemeScope;
import Nn.AbstractC4236g;
import V2.CreationExtras;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.DialogTitle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.view.C6173t;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import bk.AbstractC6392a;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.google.android.material.snackbar.Snackbar;
import com.meijer.mobile.accounts.ux.payments.d;
import com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsActivity;
import com.meijer.mobile.meijer.activity.checkout.payment.Z;
import com.meijer.mobile.meijer.activity.checkout.payment.ebt.r;
import com.meijer.mobile.meijer.activity.checkout.payment.ebt.response.EbtPanResponse;
import com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import e.C13736d;
import hk.EnumC14533a;
import hk.MultiTenderPaymentOption;
import hk.PaymentOption;
import j0.InterfaceC14882C;
import j0.InterfaceC14902f;
import java.util.Iterator;
import java.util.List;
import kotlin.C17957L0;
import kotlin.C17959M0;
import kotlin.C17987a1;
import kotlin.C17993c1;
import kotlin.C18026n1;
import kotlin.C18029o1;
import kotlin.C18032p1;
import kotlin.EnumC17961N0;
import kotlin.InterfaceC18017k1;
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
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import le.C15485b;
import mv.C0;
import mv.C15809k;
import mv.InterfaceC15783O;
import okhttp3.HttpUrl;
import p1.C16338g;
import pv.C16563h;
import pv.InterfaceC16553F;
import r0.C16806i;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 C2\u00020\u0001:\u0001DB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u0003J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\u0003R\u001b\u0010'\u001a\u00020\"8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010$\u001a\u0004\b/\u00100R\u0016\u00104\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010:\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00103R\u0016\u0010<\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00103R\u0018\u0010?\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010B\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006J²\u0006\f\u0010F\u001a\u00020E8\nX\u008a\u0084\u0002²\u0006\f\u0010H\u001a\u00020G8\nX\u008a\u0084\u0002²\u0006\u000e\u0010I\u001a\u00020\t8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/CheckoutPaymentOptionsActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "isSaveSlotAvailable", "h2", "(Z)V", "LGm/a;", "ebtAcculynkResponse", "g2", "(LGm/a;)V", "", "title", "message", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/response/EbtPanResponse;", "ebtResponse", "isEnableRetry", "m2", "(Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/response/EbtPanResponse;Z)V", "u2", "s2", "(Ljava/lang/String;)V", "Lbk/a;", "r2", "(Lbk/a;)V", "k2", "(Lbk/a;Lbk/a;)V", "i2", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z;", "s", "Lkotlin/Lazy;", "e2", "()Lcom/meijer/mobile/meijer/activity/checkout/payment/Z;", "checkoutPaymentOptionsViewModel", "Lcom/meijer/mobile/accounts/ux/payments/d;", "t", "d2", "()Lcom/meijer/mobile/accounts/ux/payments/d;", "addCardAurusViewModel", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r;", "u", "f2", "()Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r;", "ebtPinPadViewModel", "v", "Z", "navigatedToOrderReview", "LNn/g;", "w", "LNn/g;", "binding", "x", "isEditMode", "y", "fromOrderReviewFlow", "z", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/response/EbtPanResponse;", "ebtPanResponse", "A", "LGm/a;", "ebtBalance", "B", "a", "Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$k;", "viewState", "Lcom/meijer/mobile/accounts/ux/payments/d$d;", "addCardViewState", "displayError", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class CheckoutPaymentOptionsActivity extends Hilt_CheckoutPaymentOptionsActivity {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: C, reason: collision with root package name */
    public static final int f104417C = 8;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private EbtBalance ebtBalance;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Lazy checkoutPaymentOptionsViewModel = new androidx.view.e0(Reflection.b(Z.class), new e(this), new d(this), new f(null, this));

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Lazy addCardAurusViewModel = new androidx.view.e0(Reflection.b(com.meijer.mobile.accounts.ux.payments.d.class), new h(this), new g(this), new i(null, this));

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final Lazy ebtPinPadViewModel = new androidx.view.e0(Reflection.b(com.meijer.mobile.meijer.activity.checkout.payment.ebt.r.class), new k(this), new j(this), new l(null, this));

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean navigatedToOrderReview;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private AbstractC4236g binding;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private boolean isEditMode;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private boolean fromOrderReviewFlow;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private EbtPanResponse ebtPanResponse;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/CheckoutPaymentOptionsActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "isEditMode", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Z)Landroid/content/Intent;", "", "EXTRA_PAYMENT_CARD", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ Intent b(Companion companion, Context context, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return companion.a(context, z10);
        }

        @JvmStatic
        public final Intent a(Context context, boolean isEditMode) {
            Intrinsics.j(context, "context");
            Intent intentPutExtra = new Intent(context, (Class<?>) CheckoutPaymentOptionsActivity.class).putExtra("com.meijer.mobile.meijer.activity.checkout.payment.intent.extra.PAYMENT_CARD", isEditMode);
            Intrinsics.i(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CheckoutPaymentOptionsActivity f104428a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f104429b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C17959M0 f104430c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C17993c1 f104431d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsActivity$b$a$a, reason: collision with other inner class name */
            static final class C1489a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f104432a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ CheckoutPaymentOptionsActivity f104433b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Function0<C0> f104434c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ z1<Z.PaymentOptionsViewState> f104435d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ List<PaymentOptionDecorator> f104436e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Function0<C0> f104437f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ z1<d.ViewState> f104438g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<Boolean> f104439h;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsActivity$b$a$a$a, reason: collision with other inner class name */
                /* synthetic */ class C1490a extends FunctionReferenceImpl implements Function1<Z.i, Unit> {
                    C1490a(Object obj) {
                        super(1, obj, Z.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/checkout/payment/CheckoutPaymentOptionsViewModel$PaymentOptionsAction;)V", 0);
                    }

                    public final void a(Z.i p02) {
                        Intrinsics.j(p02, "p0");
                        ((Z) this.receiver).d0(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Z.i iVar) {
                        a(iVar);
                        return Unit.f143329a;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                C1489a(LocalThemeScope localThemeScope, CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity, Function0<? extends C0> function0, z1<Z.PaymentOptionsViewState> z1Var, List<PaymentOptionDecorator> list, Function0<? extends C0> function02, z1<d.ViewState> z1Var2, InterfaceC5872l0<Boolean> interfaceC5872l0) {
                    this.f104432a = localThemeScope;
                    this.f104433b = checkoutPaymentOptionsActivity;
                    this.f104434c = function0;
                    this.f104435d = z1Var;
                    this.f104436e = list;
                    this.f104437f = function02;
                    this.f104438g = z1Var2;
                    this.f104439h = interfaceC5872l0;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit u(CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity, Function0 function0, z1 z1Var, String id2) {
                    Object next;
                    PaymentOption paymentOption;
                    Intrinsics.j(id2, "id");
                    Iterator<T> it = a.l(z1Var).getPaymentOptions().h().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (Intrinsics.e(((PaymentOption) ((Validation) next).e()).getId(), id2)) {
                            break;
                        }
                    }
                    Validation validation = (Validation) next;
                    if (validation != null && (paymentOption = (PaymentOption) validation.e()) != null) {
                        checkoutPaymentOptionsActivity.e2().d0(new Z.i.SetPaymentMethodAction(paymentOption));
                    }
                    checkoutPaymentOptionsActivity.e2().d0(new Z.i.UpdateSelectCardID(id2));
                    function0.invoke();
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit x(CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity, EbtPanResponse ebtResponse) {
                    Intrinsics.j(ebtResponse, "ebtResponse");
                    checkoutPaymentOptionsActivity.ebtPanResponse = ebtResponse;
                    checkoutPaymentOptionsActivity.e2().d0(new Z.i.ShowEbtPinPad(ebtResponse.getToken(), ebtResponse.getCardExpiration(), false));
                    return Unit.f143329a;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
                    s(interfaceC14902f, composer, num.intValue());
                    return Unit.f143329a;
                }

                public final void s(InterfaceC14902f ModalBottomSheetLayout, Composer composer, int i10) {
                    Intrinsics.j(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1503473688, i10, -1, "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (CheckoutPaymentOptionsActivity.kt:152)");
                    }
                    boolean z10 = false;
                    if (a.l(this.f104435d).getAddNewCardClicked()) {
                        composer.startReplaceGroup(2065767848);
                        LocalThemeScope localThemeScope = this.f104432a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        if (this.f104433b.fromOrderReviewFlow && !a.l(this.f104435d).getPaymentOptions().h().isEmpty()) {
                            z10 = true;
                        }
                        HttpUrl aurusUrl = a.o(this.f104438g).getAurusUrl();
                        String accessToken = a.o(this.f104438g).getAccessToken();
                        composer.startReplaceGroup(5004770);
                        boolean zV = composer.V(this.f104434c);
                        final Function0<C0> function0 = this.f104434c;
                        Object objB = composer.B();
                        if (zV || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.s
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CheckoutPaymentOptionsActivity.b.a.C1489a.t(function0);
                                }
                            };
                            composer.t(objB);
                        }
                        Function0 function02 = (Function0) objB;
                        composer.P();
                        composer.startReplaceGroup(-1633490746);
                        boolean zD = composer.D(this.f104433b) | composer.V(this.f104435d);
                        final CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity = this.f104433b;
                        final z1<Z.PaymentOptionsViewState> z1Var = this.f104435d;
                        Object objB2 = composer.B();
                        if (zD || objB2 == Composer.INSTANCE.a()) {
                            objB2 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.z
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CheckoutPaymentOptionsActivity.b.a.C1489a.D(checkoutPaymentOptionsActivity, z1Var, (String) obj);
                                }
                            };
                            composer.t(objB2);
                        }
                        composer.P();
                        Fm.c.b(localThemeScope, companion, true, false, z10, aurusUrl, accessToken, function02, (Function1) objB2, composer, LocalThemeScope.f17314g | 432, 4);
                        composer.P();
                    } else if (a.l(this.f104435d).getChangeCardClicked()) {
                        composer.startReplaceGroup(2066894388);
                        LocalThemeScope localThemeScope2 = this.f104432a;
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        String strC = C16338g.c(com.meijer.mobile.meijer.Y.f101261wb, composer, 0);
                        composer.startReplaceGroup(5004770);
                        boolean zV2 = composer.V(this.f104434c);
                        final Function0<C0> function03 = this.f104434c;
                        Object objB3 = composer.B();
                        if (zV2 || objB3 == Composer.INSTANCE.a()) {
                            objB3 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.A
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CheckoutPaymentOptionsActivity.b.a.C1489a.E(function03);
                                }
                            };
                            composer.t(objB3);
                        }
                        Function0 function04 = (Function0) objB3;
                        composer.P();
                        List<PaymentOptionDecorator> list = this.f104436e;
                        boolean z11 = this.f104433b.isEditMode;
                        boolean zQ = a.q(this.f104439h);
                        composer.startReplaceGroup(5004770);
                        final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f104439h;
                        Object objB4 = composer.B();
                        Composer.Companion companion3 = Composer.INSTANCE;
                        if (objB4 == companion3.a()) {
                            objB4 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.B
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CheckoutPaymentOptionsActivity.b.a.C1489a.F(interfaceC5872l0, ((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB4);
                        }
                        Function1 function1 = (Function1) objB4;
                        composer.P();
                        Z.PaymentOptionsViewState kVarL = a.l(this.f104435d);
                        Z zE2 = this.f104433b.e2();
                        composer.startReplaceGroup(5004770);
                        boolean zD2 = composer.D(zE2);
                        Object objB5 = composer.B();
                        if (zD2 || objB5 == companion3.a()) {
                            objB5 = new C1490a(zE2);
                            composer.t(objB5);
                        }
                        composer.P();
                        Function1 function12 = (Function1) ((KFunction) objB5);
                        composer.startReplaceGroup(-1746271574);
                        boolean zD3 = composer.D(this.f104433b) | composer.V(this.f104435d) | composer.V(this.f104434c);
                        final CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity2 = this.f104433b;
                        final Function0<C0> function05 = this.f104434c;
                        final z1<Z.PaymentOptionsViewState> z1Var2 = this.f104435d;
                        Object objB6 = composer.B();
                        if (zD3 || objB6 == companion3.a()) {
                            objB6 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.C
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CheckoutPaymentOptionsActivity.b.a.C1489a.u(checkoutPaymentOptionsActivity2, function05, z1Var2, (String) obj);
                                }
                            };
                            composer.t(objB6);
                        }
                        Function1 function13 = (Function1) objB6;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zV3 = composer.V(this.f104434c);
                        final Function0<C0> function06 = this.f104434c;
                        Object objB7 = composer.B();
                        if (zV3 || objB7 == companion3.a()) {
                            objB7 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.D
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CheckoutPaymentOptionsActivity.b.a.C1489a.v(function06);
                                }
                            };
                            composer.t(objB7);
                        }
                        Function0 function07 = (Function0) objB7;
                        composer.P();
                        composer.startReplaceGroup(-1746271574);
                        boolean zD4 = composer.D(this.f104433b) | composer.V(this.f104434c) | composer.V(this.f104437f);
                        final CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity3 = this.f104433b;
                        final Function0<C0> function08 = this.f104434c;
                        final Function0<C0> function09 = this.f104437f;
                        Object objB8 = composer.B();
                        if (zD4 || objB8 == companion3.a()) {
                            objB8 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.E
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CheckoutPaymentOptionsActivity.b.a.C1489a.w(checkoutPaymentOptionsActivity3, function08, function09, ((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB8);
                        }
                        Function1 function14 = (Function1) objB8;
                        composer.P();
                        String strJ = a.l(this.f104435d).getCurrentSelectCardID();
                        if (strJ == null) {
                            strJ = "-1";
                        }
                        Fm.A.c(localThemeScope2, companion2, strC, function04, list, z11, zQ, function1, kVarL, function12, function13, function07, function14, strJ, composer, 12582960 | LocalThemeScope.f17314g, 0, 0);
                        composer.P();
                    } else {
                        composer.startReplaceGroup(2069210708);
                        this.f104433b.getWindow().setSoftInputMode(32);
                        this.f104433b.e2().d0(new Z.i.UpdateWebPageLoading(true));
                        LocalThemeScope localThemeScope3 = this.f104432a;
                        boolean zU = a.l(this.f104435d).getIsLoading();
                        EbtPanData ebtPanDataQ = a.l(this.f104435d).getMjrEbtPanData();
                        String strM = a.l(this.f104435d).getEbtCardInputError();
                        composer.startReplaceGroup(5004770);
                        boolean zD5 = composer.D(this.f104433b);
                        final CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity4 = this.f104433b;
                        Object objB9 = composer.B();
                        if (zD5 || objB9 == Composer.INSTANCE.a()) {
                            objB9 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.t
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CheckoutPaymentOptionsActivity.b.a.C1489a.x(checkoutPaymentOptionsActivity4, (EbtPanResponse) obj);
                                }
                            };
                            composer.t(objB9);
                        }
                        Function1 function15 = (Function1) objB9;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD6 = composer.D(this.f104433b);
                        final CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity5 = this.f104433b;
                        Object objB10 = composer.B();
                        if (zD6 || objB10 == Composer.INSTANCE.a()) {
                            objB10 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.u
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CheckoutPaymentOptionsActivity.b.a.C1489a.y(checkoutPaymentOptionsActivity5);
                                }
                            };
                            composer.t(objB10);
                        }
                        Function0 function010 = (Function0) objB10;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD7 = composer.D(this.f104433b);
                        final CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity6 = this.f104433b;
                        Object objB11 = composer.B();
                        if (zD7 || objB11 == Composer.INSTANCE.a()) {
                            objB11 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.v
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CheckoutPaymentOptionsActivity.b.a.C1489a.z(checkoutPaymentOptionsActivity6, (String) obj);
                                }
                            };
                            composer.t(objB11);
                        }
                        Function1 function16 = (Function1) objB11;
                        composer.P();
                        composer.startReplaceGroup(-1633490746);
                        boolean zV4 = composer.V(this.f104434c) | composer.D(this.f104433b);
                        final Function0<C0> function011 = this.f104434c;
                        final CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity7 = this.f104433b;
                        Object objB12 = composer.B();
                        if (zV4 || objB12 == Composer.INSTANCE.a()) {
                            objB12 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.w
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CheckoutPaymentOptionsActivity.b.a.C1489a.A(function011, checkoutPaymentOptionsActivity7);
                                }
                            };
                            composer.t(objB12);
                        }
                        Function0 function012 = (Function0) objB12;
                        composer.P();
                        boolean zW = a.l(this.f104435d).getIsShowPinPad();
                        String strC2 = a.l(this.f104435d).getAcculynkPostBody();
                        composer.startReplaceGroup(5004770);
                        boolean zD8 = composer.D(this.f104433b);
                        final CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity8 = this.f104433b;
                        Object objB13 = composer.B();
                        if (zD8 || objB13 == Composer.INSTANCE.a()) {
                            objB13 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.x
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CheckoutPaymentOptionsActivity.b.a.C1489a.B(checkoutPaymentOptionsActivity8, (String) obj);
                                }
                            };
                            composer.t(objB13);
                        }
                        Function1 function17 = (Function1) objB13;
                        composer.P();
                        boolean zX = a.l(this.f104435d).getIsWebPageLoading();
                        composer.startReplaceGroup(5004770);
                        boolean zD9 = composer.D(this.f104433b);
                        final CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity9 = this.f104433b;
                        Object objB14 = composer.B();
                        if (zD9 || objB14 == Composer.INSTANCE.a()) {
                            objB14 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.y
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CheckoutPaymentOptionsActivity.b.a.C1489a.C(checkoutPaymentOptionsActivity9);
                                }
                            };
                            composer.t(objB14);
                        }
                        composer.P();
                        Im.x.q(localThemeScope3, null, zU, ebtPanDataQ, strM, function15, function010, function16, function012, zW, strC2, function17, zX, (Function0) objB14, composer, LocalThemeScope.f17314g, 0, 1);
                        composer.P();
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit A(Function0 function0, CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity) {
                    function0.invoke();
                    checkoutPaymentOptionsActivity.e2().d0(Z.i.j.f104602a);
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit B(CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity, String str) {
                    checkoutPaymentOptionsActivity.f2().I(str);
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit C(CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity) {
                    checkoutPaymentOptionsActivity.e2().d0(new Z.i.UpdateWebPageLoading(false));
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit D(CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity, z1 z1Var, String str) {
                    checkoutPaymentOptionsActivity.d2().A(new d.a.ProcessAurusIFrameReturn(str, a.l(z1Var).getEbtPaymentOption()));
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit E(Function0 function0) {
                    function0.invoke();
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit F(InterfaceC5872l0 interfaceC5872l0, boolean z10) {
                    a.r(interfaceC5872l0, z10);
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit t(Function0 function0) {
                    function0.invoke();
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit v(Function0 function0) {
                    function0.invoke();
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit w(CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity, Function0 function0, Function0 function02, boolean z10) {
                    checkoutPaymentOptionsActivity.h2(z10);
                    function0.invoke();
                    checkoutPaymentOptionsActivity.e2().d0(Z.i.a.f104589a);
                    function02.invoke();
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit y(CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity) {
                    checkoutPaymentOptionsActivity.e2().d0(Z.i.h.f104598a);
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit z(CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity, String str) {
                    checkoutPaymentOptionsActivity.e2().d0(new Z.i.SetEBTCardInputError(str));
                    checkoutPaymentOptionsActivity.e2().d0(Z.i.e.f104593a);
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsActivity$b$a$b, reason: collision with other inner class name */
            static final class C1491b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C17993c1 f104440a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f104441b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ CheckoutPaymentOptionsActivity f104442c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ List<PaymentOptionDecorator> f104443d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ z1<Z.PaymentOptionsViewState> f104444e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<Boolean> f104445f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ Function0<C0> f104446g;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsActivity$b$a$b$a, reason: collision with other inner class name */
                static final class C1492a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f104447a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ CheckoutPaymentOptionsActivity f104448b;

                    C1492a(LocalThemeScope localThemeScope, CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity) {
                        this.f104447a = localThemeScope;
                        this.f104448b = checkoutPaymentOptionsActivity;
                    }

                    public final void b(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1817373034, i10, -1, "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutPaymentOptionsActivity.kt:280)");
                        }
                        LocalThemeScope localThemeScope = this.f104447a;
                        Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null));
                        Integer numValueOf = this.f104448b.isEditMode ? Integer.valueOf(com.meijer.mobile.meijer.Y.f100403Eb) : null;
                        String strC = C16338g.c(numValueOf != null ? numValueOf.intValue() : com.meijer.mobile.meijer.Y.f101144qe, composer, 0);
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(this.f104448b);
                        final CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity = this.f104448b;
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.F
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CheckoutPaymentOptionsActivity.b.a.C1491b.C1492a.c(checkoutPaymentOptionsActivity);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        C3011v.c(localThemeScope, modifierFsUnmask, strC, (Function0) objB, false, composer, LocalThemeScope.f17314g, 8);
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
                    public static final Unit c(CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity) {
                        checkoutPaymentOptionsActivity.finish();
                        return Unit.f143329a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsActivity$b$a$b$b, reason: collision with other inner class name */
                static final class C1493b implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f104449a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ List<PaymentOptionDecorator> f104450b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ CheckoutPaymentOptionsActivity f104451c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ z1<Z.PaymentOptionsViewState> f104452d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ InterfaceC5872l0<Boolean> f104453e;

                    C1493b(LocalThemeScope localThemeScope, List<PaymentOptionDecorator> list, CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity, z1<Z.PaymentOptionsViewState> z1Var, InterfaceC5872l0<Boolean> interfaceC5872l0) {
                        this.f104449a = localThemeScope;
                        this.f104450b = list;
                        this.f104451c = checkoutPaymentOptionsActivity;
                        this.f104452d = z1Var;
                        this.f104453e = interfaceC5872l0;
                    }

                    public final void b(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(2018958743, i10, -1, "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutPaymentOptionsActivity.kt:290)");
                        }
                        LocalThemeScope localThemeScope = this.f104449a;
                        Modifier modifierH = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.i(Modifier.INSTANCE, H1.h.p(16)), 0.0f, 1, null);
                        composer.startReplaceGroup(-1224400529);
                        boolean zD = composer.D(this.f104450b) | composer.D(this.f104451c) | composer.V(this.f104452d);
                        final List<PaymentOptionDecorator> list = this.f104450b;
                        final CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity = this.f104451c;
                        final z1<Z.PaymentOptionsViewState> z1Var = this.f104452d;
                        final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f104453e;
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.G
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CheckoutPaymentOptionsActivity.b.a.C1491b.C1493b.c(list, checkoutPaymentOptionsActivity, z1Var, interfaceC5872l0);
                                }
                            };
                            composer.t(objB);
                        }
                        Function0 function0 = (Function0) objB;
                        composer.P();
                        Integer numValueOf = this.f104451c.isEditMode ? Integer.valueOf(com.meijer.mobile.meijer.Y.f100619Ph) : null;
                        C3013x.b(localThemeScope, modifierH, function0, C16338g.c(numValueOf != null ? numValueOf.intValue() : com.meijer.mobile.meijer.Y.f100442Gb, composer, 0), true ^ a.l(this.f104452d).getIsLoading(), null, null, false, composer, LocalThemeScope.f17314g | 48, 112);
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
                    public static final Unit c(List list, CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity, z1 z1Var, InterfaceC5872l0 interfaceC5872l0) {
                        if (list.isEmpty()) {
                            checkoutPaymentOptionsActivity.i2();
                        } else if (!a.l(z1Var).getPaymentOptions().k().getIsValid()) {
                            a.r(interfaceC5872l0, true);
                        } else {
                            checkoutPaymentOptionsActivity.e2().d0(Z.i.k.f104603a);
                        }
                        return Unit.f143329a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsActivity$b$a$b$c */
                static final class c implements Function3<C18029o1, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f104454a;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsActivity$b$a$b$c$a, reason: collision with other inner class name */
                    static final class C1494a implements Function3<InterfaceC18017k1, Composer, Integer, Unit> {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ LocalThemeScope f104455a;

                        C1494a(LocalThemeScope localThemeScope) {
                            this.f104455a = localThemeScope;
                        }

                        public final void a(InterfaceC18017k1 data, Composer composer, int i10) {
                            Intrinsics.j(data, "data");
                            if (ComposerKt.M()) {
                                ComposerKt.U(-487765539, i10, -1, "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutPaymentOptionsActivity.kt:271)");
                            }
                            C18032p1.d(data, FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), false, null, this.f104455a.getAdsColors().getAdsColorUIBackground02().getColor(), this.f104455a.getAdsColors().getAdsColorText02().getColor(), 0L, 0.0f, composer, i10 & 14, HttpResponseStatus.SUCCESS_NO_CONTENT);
                            if (ComposerKt.M()) {
                                ComposerKt.T();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC18017k1 interfaceC18017k1, Composer composer, Integer num) {
                            a(interfaceC18017k1, composer, num.intValue());
                            return Unit.f143329a;
                        }
                    }

                    c(LocalThemeScope localThemeScope) {
                        this.f104454a = localThemeScope;
                    }

                    public final void a(C18029o1 it, Composer composer, int i10) {
                        Intrinsics.j(it, "it");
                        if ((i10 & 6) == 0) {
                            i10 |= composer.V(it) ? 4 : 2;
                        }
                        if ((i10 & 19) == 18 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(936503690, i10, -1, "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutPaymentOptionsActivity.kt:270)");
                        }
                        C18026n1.b(it, null, ComposableLambdaKt.c(-487765539, true, new C1494a(this.f104454a), composer, 54), composer, (i10 & 14) | 384, 2);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(C18029o1 c18029o1, Composer composer, Integer num) {
                        a(c18029o1, composer, num.intValue());
                        return Unit.f143329a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsActivity$b$a$b$d */
                static final class d implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ CheckoutPaymentOptionsActivity f104456a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f104457b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ Function0<C0> f104458c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ List<PaymentOptionDecorator> f104459d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ z1<Z.PaymentOptionsViewState> f104460e;

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ InterfaceC5872l0<Boolean> f104461f;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsActivity$b$a$b$d$a, reason: collision with other inner class name */
                    /* synthetic */ class C1495a extends FunctionReferenceImpl implements Function1<Z.i, Unit> {
                        C1495a(Object obj) {
                            super(1, obj, Z.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/checkout/payment/CheckoutPaymentOptionsViewModel$PaymentOptionsAction;)V", 0);
                        }

                        public final void a(Z.i p02) {
                            Intrinsics.j(p02, "p0");
                            ((Z) this.receiver).d0(p02);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Z.i iVar) {
                            a(iVar);
                            return Unit.f143329a;
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    d(CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity, LocalThemeScope localThemeScope, Function0<? extends C0> function0, List<PaymentOptionDecorator> list, z1<Z.PaymentOptionsViewState> z1Var, InterfaceC5872l0<Boolean> interfaceC5872l0) {
                        this.f104456a = checkoutPaymentOptionsActivity;
                        this.f104457b = localThemeScope;
                        this.f104458c = function0;
                        this.f104459d = list;
                        this.f104460e = z1Var;
                        this.f104461f = interfaceC5872l0;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:55:0x019a  */
                    /* JADX WARN: Removed duplicated region for block: B:58:0x01a3  */
                    /* JADX WARN: Removed duplicated region for block: B:62:0x01da  */
                    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void f(j0.InterfaceC14882C r22, androidx.compose.runtime.Composer r23, int r24) {
                        /*
                            Method dump skipped, instructions count: 478
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsActivity.b.a.C1491b.d.f(j0.C, androidx.compose.runtime.Composer, int):void");
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
                        f(interfaceC14882C, composer, num.intValue());
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit g(CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity, Function0 function0) {
                        checkoutPaymentOptionsActivity.e2().d0(new Z.i.ChangeCard(true));
                        function0.invoke();
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit k(CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity, Function0 function0, boolean z10) {
                        checkoutPaymentOptionsActivity.h2(z10);
                        checkoutPaymentOptionsActivity.e2().d0(Z.i.a.f104589a);
                        function0.invoke();
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit l(CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity, Function0 function0) {
                        checkoutPaymentOptionsActivity.e2().d0(new Z.i.ChangeCard(false));
                        function0.invoke();
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit o(InterfaceC5872l0 interfaceC5872l0, boolean z10) {
                        a.r(interfaceC5872l0, z10);
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit p(CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity) {
                        checkoutPaymentOptionsActivity.u2();
                        return Unit.f143329a;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                C1491b(C17993c1 c17993c1, LocalThemeScope localThemeScope, CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity, List<PaymentOptionDecorator> list, z1<Z.PaymentOptionsViewState> z1Var, InterfaceC5872l0<Boolean> interfaceC5872l0, Function0<? extends C0> function0) {
                    this.f104440a = c17993c1;
                    this.f104441b = localThemeScope;
                    this.f104442c = checkoutPaymentOptionsActivity;
                    this.f104443d = list;
                    this.f104444e = z1Var;
                    this.f104445f = interfaceC5872l0;
                    this.f104446g = function0;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(182343377, i10, -1, "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (CheckoutPaymentOptionsActivity.kt:267)");
                    }
                    C17987a1.a(null, this.f104440a, ComposableLambdaKt.c(-1817373034, true, new C1492a(this.f104441b, this.f104442c), composer, 54), ComposableLambdaKt.c(2018958743, true, new C1493b(this.f104441b, this.f104443d, this.f104442c, this.f104444e, this.f104445f), composer, 54), ComposableLambdaKt.c(936503690, true, new c(this.f104441b), composer, 54), null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(903264655, true, new d(this.f104442c, this.f104441b, this.f104446g, this.f104443d, this.f104444e, this.f104445f), composer, 54), composer, 28032, 12582912, 131041);
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

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsActivity$onCreate$2$1$closeSheet$1$1$1", f = "CheckoutPaymentOptionsActivity.kt", l = {138}, m = "invokeSuspend")
            static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f104462a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17959M0 f104463b;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new c(this.f104463b, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(C17959M0 c17959m0, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f104463b = c17959m0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f104462a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C17959M0 c17959m0 = this.f104463b;
                        this.f104462a = 1;
                        if (c17959m0.i(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsActivity$onCreate$2$1$openSheet$1$1$1", f = "CheckoutPaymentOptionsActivity.kt", l = {134}, m = "invokeSuspend")
            static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f104464a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17959M0 f104465b;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new d(this.f104465b, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(C17959M0 c17959m0, Continuation<? super d> continuation) {
                    super(2, continuation);
                    this.f104465b = c17959m0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f104464a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C17959M0 c17959m0 = this.f104465b;
                        this.f104464a = 1;
                        if (c17959m0.l(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            a(CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity, InterfaceC15783O interfaceC15783O, C17959M0 c17959m0, C17993c1 c17993c1) {
                this.f104428a = checkoutPaymentOptionsActivity;
                this.f104429b = interfaceC15783O;
                this.f104430c = c17959m0;
                this.f104431d = c17993c1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final C0 s(InterfaceC15783O interfaceC15783O, C17959M0 c17959m0) {
                return C15809k.d(interfaceC15783O, null, null, new d(c17959m0, null), 3, null);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                k(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }

            public final void k(LocalThemeScope AdsTheme, Composer composer, int i10) {
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
                    ComposerKt.U(-987646358, i11, -1, "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsActivity.onCreate.<anonymous>.<anonymous> (CheckoutPaymentOptionsActivity.kt:122)");
                }
                z1 z1VarB = o1.b(this.f104428a.e2().Z(), null, composer, 0, 1);
                z1 z1VarB2 = o1.b(this.f104428a.d2().x(), null, composer, 0, 1);
                List<PaymentOptionDecorator> listS = l(z1VarB).s();
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                Composer.Companion companion = Composer.INSTANCE;
                if (objB == companion.a()) {
                    objB = t1.e(Boolean.FALSE, null, 2, null);
                    composer.t(objB);
                }
                InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
                composer.P();
                if (!l(z1VarB).getPaymentOptions().h().isEmpty() && this.f104428a.isEditMode) {
                    this.f104428a.isEditMode = false;
                }
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(this.f104429b) | composer.D(this.f104430c);
                final InterfaceC15783O interfaceC15783O = this.f104429b;
                final C17959M0 c17959m0 = this.f104430c;
                Object objB2 = composer.B();
                if (zD || objB2 == companion.a()) {
                    objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.p
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CheckoutPaymentOptionsActivity.b.a.s(interfaceC15783O, c17959m0);
                        }
                    };
                    composer.t(objB2);
                }
                Function0 function0 = (Function0) objB2;
                composer.P();
                composer.startReplaceGroup(-1746271574);
                boolean zD2 = composer.D(this.f104428a) | composer.D(this.f104429b) | composer.D(this.f104430c);
                final CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity = this.f104428a;
                final InterfaceC15783O interfaceC15783O2 = this.f104429b;
                final C17959M0 c17959m02 = this.f104430c;
                Object objB3 = composer.B();
                if (zD2 || objB3 == companion.a()) {
                    objB3 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.q
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CheckoutPaymentOptionsActivity.b.a.t(checkoutPaymentOptionsActivity, interfaceC15783O2, c17959m02);
                        }
                    };
                    composer.t(objB3);
                }
                final Function0 function02 = (Function0) objB3;
                composer.P();
                composer.startReplaceGroup(-1746271574);
                boolean zD3 = composer.D(this.f104430c) | composer.V(function02) | composer.D(this.f104428a);
                final C17959M0 c17959m03 = this.f104430c;
                final CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity2 = this.f104428a;
                Object objB4 = composer.B();
                if (zD3 || objB4 == companion.a()) {
                    objB4 = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.r
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CheckoutPaymentOptionsActivity.b.a.p(c17959m03, function02, checkoutPaymentOptionsActivity2);
                        }
                    };
                    composer.t(objB4);
                }
                composer.P();
                C13736d.a(false, (Function0) objB4, composer, 0, 1);
                float f10 = 10;
                C17957L0.b(ComposableLambdaKt.c(1503473688, true, new C1489a(AdsTheme, this.f104428a, function02, z1VarB, listS, function0, z1VarB2, interfaceC5872l0), composer, 54), null, this.f104430c, false, C16806i.e(H1.h.p(f10), H1.h.p(f10), 0.0f, 0.0f, 12, null), 0.0f, 0L, 0L, 0L, ComposableLambdaKt.c(182343377, true, new C1491b(this.f104431d, AdsTheme, this.f104428a, listS, z1VarB, interfaceC5872l0, function0), composer, 54), composer, (C17959M0.f168297e << 6) | 805306374, 490);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Z.PaymentOptionsViewState l(z1<Z.PaymentOptionsViewState> z1Var) {
                return z1Var.getValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final d.ViewState o(z1<d.ViewState> z1Var) {
                return z1Var.getValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit p(C17959M0 c17959m0, Function0 function0, CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity) {
                if (c17959m0.k()) {
                    function0.invoke();
                } else {
                    checkoutPaymentOptionsActivity.finish();
                }
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean q(InterfaceC5872l0<Boolean> interfaceC5872l0) {
                return interfaceC5872l0.getValue().booleanValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void r(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
                interfaceC5872l0.setValue(Boolean.valueOf(z10));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final C0 t(CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity, InterfaceC15783O interfaceC15783O, C17959M0 c17959m0) {
                Ds.p.d(checkoutPaymentOptionsActivity.getWindow());
                return C15809k.d(interfaceC15783O, null, null, new c(c17959m0, null), 3, null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsActivity$onCreate$2$2$1", f = "CheckoutPaymentOptionsActivity.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsActivity$b$b, reason: collision with other inner class name */
        static final class C1496b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f104466a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f104467b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ CheckoutPaymentOptionsActivity f104468c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1496b(CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity, Continuation<? super C1496b> continuation) {
                super(2, continuation);
                this.f104468c = checkoutPaymentOptionsActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C1496b c1496b = new C1496b(this.f104468c, continuation);
                c1496b.f104467b = obj;
                return c1496b;
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r$h;", "effect", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/r$h;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsActivity$onCreate$2$2$1$1", f = "CheckoutPaymentOptionsActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsActivity$b$b$a */
            static final class a extends SuspendLambda implements Function2<r.h, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f104469a;

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f104470b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ CheckoutPaymentOptionsActivity f104471c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.f104471c = checkoutPaymentOptionsActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    a aVar = new a(this.f104471c, continuation);
                    aVar.f104470b = obj;
                    return aVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final Object invoke(r.h hVar, Continuation<? super Unit> continuation) {
                    return ((a) create(hVar, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f104469a == 0) {
                        ResultKt.b(obj);
                        r.h hVar = (r.h) this.f104470b;
                        if (hVar instanceof r.h.a) {
                            this.f104471c.e2().d0(Z.i.j.f104602a);
                        } else if (hVar instanceof r.h.ShowErrorState) {
                            r.h.ShowErrorState cVar = (r.h.ShowErrorState) hVar;
                            this.f104471c.e2().d0(new Z.i.EBTErrorResponseHandler(cVar.getErrorCode(), cVar.getErrorMessage(), cVar.getEbtBalance()));
                            this.f104471c.e2().d0(Z.i.j.f104602a);
                        } else if (hVar instanceof r.h.HandlePinPadSuccess) {
                            this.f104471c.g2(((r.h.HandlePinPadSuccess) hVar).getEbtBalance());
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
                return ((C1496b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f104466a == 0) {
                    ResultKt.b(obj);
                    C16563h.J(C16563h.O(this.f104468c.f2().G().a(), new a(this.f104468c, null)), (InterfaceC15783O) this.f104467b);
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsActivity$onCreate$2$3$1", f = "CheckoutPaymentOptionsActivity.kt", l = {}, m = "invokeSuspend")
        static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f104472a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17959M0 f104473b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ CheckoutPaymentOptionsActivity f104474c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[EnumC17961N0.values().length];
                    try {
                        iArr[EnumC17961N0.f168314a.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new c(this.f104473b, this.f104474c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C17959M0 c17959m0, CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f104473b = c17959m0;
                this.f104474c = checkoutPaymentOptionsActivity;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f104472a == 0) {
                    ResultKt.b(obj);
                    if (a.$EnumSwitchMapping$0[this.f104473b.e().ordinal()] == 1) {
                        Ds.p.d(this.f104474c.getWindow());
                        this.f104474c.e2().d0(new Z.i.SetEBTCardInputError(null));
                        this.f104474c.e2().d0(Z.i.j.f104602a);
                    }
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsActivity$onCreate$2$4$1", f = "CheckoutPaymentOptionsActivity.kt", l = {HttpResponseStatus.ERROR_UNAUTHORIZED}, m = "invokeSuspend")
        static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f104475a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ CheckoutPaymentOptionsActivity f104476b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity, Continuation<? super d> continuation) {
                super(2, continuation);
                this.f104476b = checkoutPaymentOptionsActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new d(this.f104476b, continuation);
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/accounts/ux/payments/d$c;", "effect", "", "<anonymous>", "(Lcom/meijer/mobile/accounts/ux/payments/d$c;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsActivity$onCreate$2$4$1$1", f = "CheckoutPaymentOptionsActivity.kt", l = {}, m = "invokeSuspend")
            static final class a extends SuspendLambda implements Function2<d.c, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f104477a;

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f104478b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ CheckoutPaymentOptionsActivity f104479c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.f104479c = checkoutPaymentOptionsActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    a aVar = new a(this.f104479c, continuation);
                    aVar.f104478b = obj;
                    return aVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(d.c cVar, Continuation<? super Unit> continuation) {
                    return ((a) create(cVar, continuation)).invokeSuspend(Unit.f143329a);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void k(CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity, DialogInterface dialogInterface, int i10) {
                    dialogInterface.dismiss();
                    checkoutPaymentOptionsActivity.finish();
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f104477a == 0) {
                        ResultKt.b(obj);
                        d.c cVar = (d.c) this.f104478b;
                        if (cVar instanceof d.c.CardAddSuccessful) {
                            CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity = this.f104479c;
                            checkoutPaymentOptionsActivity.startActivity(CheckoutActivity.INSTANCE.a(checkoutPaymentOptionsActivity, ((d.c.CardAddSuccessful) cVar).getMultiTenderPaymentOption()));
                            this.f104479c.finish();
                        } else if (Intrinsics.e(cVar, d.c.a.f95257a)) {
                            C15485b message = new C15485b(this.f104479c).setTitle(com.meijer.mobile.meijer.Y.f100772Y).setMessage(com.meijer.mobile.meijer.Y.f100753X);
                            int i10 = yr.Q.f171761b;
                            final CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity2 = this.f104479c;
                            message.setPositiveButton(i10, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.M
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i11) {
                                    CheckoutPaymentOptionsActivity.b.d.a.k(checkoutPaymentOptionsActivity2, dialogInterface, i11);
                                }
                            }).show();
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
                return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f104475a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16553F<d.c> interfaceC16553FW = this.f104476b.d2().w();
                    a aVar = new a(this.f104476b, null);
                    this.f104475a = 1;
                    if (C16563h.k(interfaceC16553FW, aVar, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsActivity$onCreate$2$5$1", f = "CheckoutPaymentOptionsActivity.kt", l = {}, m = "invokeSuspend")
        static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f104480a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ CheckoutPaymentOptionsActivity f104481b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f104482c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C17959M0 f104483d;

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$j;", "event", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$j;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsActivity$onCreate$2$5$1$1", f = "CheckoutPaymentOptionsActivity.kt", l = {}, m = "invokeSuspend")
            static final class a extends SuspendLambda implements Function2<Z.j, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f104484a;

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f104485b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC15783O f104486c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ CheckoutPaymentOptionsActivity f104487d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ C17959M0 f104488e;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsActivity$onCreate$2$5$1$1$1", f = "CheckoutPaymentOptionsActivity.kt", l = {433}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsActivity$b$e$a$a, reason: collision with other inner class name */
                static final class C1497a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f104489a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ C17959M0 f104490b;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C1497a(this.f104490b, continuation);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1497a(C17959M0 c17959m0, Continuation<? super C1497a> continuation) {
                        super(2, continuation);
                        this.f104490b = c17959m0;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                        return ((C1497a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objF = IntrinsicsKt.f();
                        int i10 = this.f104489a;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                ResultKt.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.b(obj);
                            C17959M0 c17959m0 = this.f104490b;
                            this.f104489a = 1;
                            if (c17959m0.l(this) == objF) {
                                return objF;
                            }
                        }
                        return Unit.f143329a;
                    }
                }

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsActivity$onCreate$2$5$1$1$2", f = "CheckoutPaymentOptionsActivity.kt", l = {439}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsActivity$b$e$a$b, reason: collision with other inner class name */
                static final class C1498b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f104491a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ C17959M0 f104492b;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C1498b(this.f104492b, continuation);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1498b(C17959M0 c17959m0, Continuation<? super C1498b> continuation) {
                        super(2, continuation);
                        this.f104492b = c17959m0;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                        return ((C1498b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objF = IntrinsicsKt.f();
                        int i10 = this.f104491a;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                ResultKt.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.b(obj);
                            C17959M0 c17959m0 = this.f104492b;
                            this.f104491a = 1;
                            if (c17959m0.i(this) == objF) {
                                return objF;
                            }
                        }
                        return Unit.f143329a;
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    a aVar = new a(this.f104486c, this.f104487d, this.f104488e, continuation);
                    aVar.f104485b = obj;
                    return aVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Z.j jVar, Continuation<? super Unit> continuation) {
                    return ((a) create(jVar, continuation)).invokeSuspend(Unit.f143329a);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(InterfaceC15783O interfaceC15783O, CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity, C17959M0 c17959m0, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.f104486c = interfaceC15783O;
                    this.f104487d = checkoutPaymentOptionsActivity;
                    this.f104488e = c17959m0;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void k(CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity, DialogInterface dialogInterface, int i10) {
                    dialogInterface.dismiss();
                    checkoutPaymentOptionsActivity.e2().d0(Z.i.l.f104604a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    String strB;
                    IntrinsicsKt.f();
                    if (this.f104484a == 0) {
                        ResultKt.b(obj);
                        Z.j jVar = (Z.j) this.f104485b;
                        AbstractC4236g abstractC4236g = null;
                        if (jVar instanceof Z.j.e) {
                            C15809k.d(this.f104486c, null, null, new C1497a(this.f104488e, null), 3, null);
                        } else if (jVar instanceof Z.j.c) {
                            C15809k.d(this.f104486c, null, null, new C1498b(this.f104488e, null), 3, null);
                        } else if (jVar instanceof Z.j.PaymentCardRelatedFailedEvent) {
                            this.f104487d.e2().d0(Z.i.n.f104606a);
                            AbstractC4236g abstractC4236g2 = this.f104487d.binding;
                            if (abstractC4236g2 == null) {
                                Intrinsics.x("binding");
                            } else {
                                abstractC4236g = abstractC4236g2;
                            }
                            Snackbar.q0(abstractC4236g.getRoot(), ((Z.j.PaymentCardRelatedFailedEvent) jVar).getMessageId(), 0).c0();
                        } else if (jVar instanceof Z.j.CardFailEvent) {
                            this.f104487d.r2(((Z.j.CardFailEvent) jVar).getFormattedString());
                        } else if (jVar instanceof Z.j.CardErrorEvent) {
                            this.f104487d.s2(((Z.j.CardErrorEvent) jVar).getRetrofitException().c(this.f104487d));
                        } else if (jVar instanceof Z.j.d) {
                            this.f104487d.navigatedToOrderReview = true;
                        } else if (jVar instanceof Z.j.ShowPaymentErrorDialog) {
                            Z.j.ShowPaymentErrorDialog c1502j = (Z.j.ShowPaymentErrorDialog) jVar;
                            C15485b message = new C15485b(this.f104487d).setTitle(c1502j.getTitle()).setMessage(c1502j.getMessage());
                            int iA = c1502j.getButtonText();
                            final CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity = this.f104487d;
                            message.setPositiveButton(iA, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.N
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i10) {
                                    CheckoutPaymentOptionsActivity.b.e.a.k(checkoutPaymentOptionsActivity, dialogInterface, i10);
                                }
                            }).show();
                        } else if (jVar instanceof Z.j.ShowEbtPinPadEvent) {
                            this.f104487d.e2().d0(new Z.i.UpdatePinPadBody(((Z.j.ShowEbtPinPadEvent) jVar).getAcculynkPostBody()));
                        } else if (jVar instanceof Z.j.ShowEBTCheckBalanceLimitReached) {
                            Z.j.ShowEBTCheckBalanceLimitReached gVar = (Z.j.ShowEBTCheckBalanceLimitReached) jVar;
                            this.f104487d.k2(gVar.getErrorTitle(), gVar.getErrorMessage());
                        } else if (jVar instanceof Z.j.h) {
                            CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity2 = this.f104487d;
                            Resources resources = checkoutPaymentOptionsActivity2.getResources();
                            Intrinsics.i(resources, "getResources(...)");
                            String strB2 = ck.d.b(resources, this.f104487d.e2().Z().getValue().getEbtErrorDialogDecorator().getTitle());
                            if (this.f104487d.e2().Z().getValue().getEbtErrorDialogDecorator().getInSufficientBalanceStatus()) {
                                StringBuilder sb2 = new StringBuilder();
                                Resources resources2 = this.f104487d.getResources();
                                Intrinsics.i(resources2, "getResources(...)");
                                sb2.append(ck.d.b(resources2, this.f104487d.e2().Z().getValue().getEbtErrorDialogDecorator().getMessage()));
                                Resources resources3 = this.f104487d.getResources();
                                Intrinsics.i(resources3, "getResources(...)");
                                sb2.append(ck.d.b(resources3, this.f104487d.e2().Z().getValue().getEbtErrorDialogDecorator().getInSufficientMessage()));
                                strB = sb2.toString();
                            } else {
                                Resources resources4 = this.f104487d.getResources();
                                Intrinsics.i(resources4, "getResources(...)");
                                strB = ck.d.b(resources4, this.f104487d.e2().Z().getValue().getEbtErrorDialogDecorator().getMessage());
                            }
                            checkoutPaymentOptionsActivity2.m2(strB2, strB, this.f104487d.ebtPanResponse, Intrinsics.e(this.f104487d.e2().Z().getValue().getEbtErrorDialogDecorator().getErrorCode().getValue(), Hm.a.f13715k.getValue()));
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.f143329a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new e(this.f104481b, this.f104482c, this.f104483d, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity, InterfaceC15783O interfaceC15783O, C17959M0 c17959m0, Continuation<? super e> continuation) {
                super(2, continuation);
                this.f104481b = checkoutPaymentOptionsActivity;
                this.f104482c = interfaceC15783O;
                this.f104483d = c17959m0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f104480a == 0) {
                    ResultKt.b(obj);
                    C16563h.J(C16563h.O(this.f104481b.e2().W().b(), new a(this.f104482c, this.f104481b, this.f104483d, null)), C6173t.a(this.f104481b));
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        b() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-456344357, i10, -1, "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsActivity.onCreate.<anonymous> (CheckoutPaymentOptionsActivity.kt:114)");
            }
            C17993c1 c17993c1G = C17987a1.g(null, null, composer, 0, 3);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = androidx.compose.runtime.J.k(EmptyCoroutineContext.f143553a, composer);
                composer.t(objB);
            }
            InterfaceC15783O interfaceC15783O = (InterfaceC15783O) objB;
            C17959M0 c17959m0J = C17957L0.j(EnumC17961N0.f168314a, null, null, true, composer, 3078, 6);
            Ki.K.b(null, ComposableLambdaKt.c(-987646358, true, new a(CheckoutPaymentOptionsActivity.this, interfaceC15783O, c17959m0J, c17993c1G), composer, 54), composer, 48, 1);
            Boolean bool = Boolean.TRUE;
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(CheckoutPaymentOptionsActivity.this);
            CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity = CheckoutPaymentOptionsActivity.this;
            Object objB2 = composer.B();
            if (zD || objB2 == companion.a()) {
                objB2 = new C1496b(checkoutPaymentOptionsActivity, null);
                composer.t(objB2);
            }
            composer.P();
            androidx.compose.runtime.J.g(bool, (Function2) objB2, composer, 6);
            EnumC17961N0 enumC17961N0E = c17959m0J.e();
            composer.startReplaceGroup(-1633490746);
            boolean zD2 = composer.D(c17959m0J) | composer.D(CheckoutPaymentOptionsActivity.this);
            CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity2 = CheckoutPaymentOptionsActivity.this;
            Object objB3 = composer.B();
            if (zD2 || objB3 == companion.a()) {
                objB3 = new c(c17959m0J, checkoutPaymentOptionsActivity2, null);
                composer.t(objB3);
            }
            composer.P();
            androidx.compose.runtime.J.g(enumC17961N0E, (Function2) objB3, composer, 0);
            Unit unit = Unit.f143329a;
            composer.startReplaceGroup(5004770);
            boolean zD3 = composer.D(CheckoutPaymentOptionsActivity.this);
            CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity3 = CheckoutPaymentOptionsActivity.this;
            Object objB4 = composer.B();
            if (zD3 || objB4 == companion.a()) {
                objB4 = new d(checkoutPaymentOptionsActivity3, null);
                composer.t(objB4);
            }
            composer.P();
            androidx.compose.runtime.J.g(unit, (Function2) objB4, composer, 6);
            InterfaceC16553F<Z.j> interfaceC16553FB = CheckoutPaymentOptionsActivity.this.e2().W().b();
            composer.startReplaceGroup(-1746271574);
            boolean zD4 = composer.D(CheckoutPaymentOptionsActivity.this) | composer.D(interfaceC15783O) | composer.D(c17959m0J);
            CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity4 = CheckoutPaymentOptionsActivity.this;
            Object objB5 = composer.B();
            if (zD4 || objB5 == companion.a()) {
                objB5 = new e(checkoutPaymentOptionsActivity4, interfaceC15783O, c17959m0J, null);
                composer.t(objB5);
            }
            composer.P();
            androidx.compose.runtime.J.g(interfaceC16553FB, (Function2) objB5, composer, 0);
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$k;", "viewState", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/checkout/payment/Z$k;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsActivity$onCreate$3", f = "CheckoutPaymentOptionsActivity.kt", l = {}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<Z.PaymentOptionsViewState, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f104493a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f104494b;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = CheckoutPaymentOptionsActivity.this.new c(continuation);
            cVar.f104494b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Z.PaymentOptionsViewState kVar, Continuation<? super Unit> continuation) {
            return ((c) create(kVar, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f104493a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            Z.PaymentOptionsViewState kVar = (Z.PaymentOptionsViewState) this.f104494b;
            if (kVar.getPaymentOptions().getCompletePayment() && CheckoutPaymentOptionsActivity.this.navigatedToOrderReview) {
                CheckoutPaymentOptionsActivity.this.navigatedToOrderReview = false;
                CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity = CheckoutPaymentOptionsActivity.this;
                CheckoutActivity.Companion aVar = CheckoutActivity.INSTANCE;
                PaymentOption paymentOptionE = kVar.getPaymentOptions().k().e();
                if (paymentOptionE == null) {
                    paymentOptionE = new PaymentOption(null, null, null, null, null, false, null, null, null, null, false, null, null, 8191, null);
                }
                checkoutPaymentOptionsActivity.startActivity(aVar.a(checkoutPaymentOptionsActivity, new MultiTenderPaymentOption(paymentOptionE, kVar.getEbtPaymentOption())));
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f104496f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f104496f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f104496f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f104497f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f104497f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f104497f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f104498f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f104499g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f104498f = function0;
            this.f104499g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f104498f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f104499g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f104500f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f104500f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f104500f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class h extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f104501f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f104501f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f104501f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class i extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f104502f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f104503g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f104502f = function0;
            this.f104503g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f104502f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f104503g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class j extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f104504f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentActivity componentActivity) {
            super(0);
            this.f104504f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f104504f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class k extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f104505f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentActivity componentActivity) {
            super(0);
            this.f104505f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f104505f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class l extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f104506f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f104507g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f104506f = function0;
            this.f104507g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f104506f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f104507g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.meijer.mobile.accounts.ux.payments.d d2() {
        return (com.meijer.mobile.accounts.ux.payments.d) this.addCardAurusViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.meijer.mobile.meijer.activity.checkout.payment.ebt.r f2() {
        return (com.meijer.mobile.meijer.activity.checkout.payment.ebt.r) this.ebtPinPadViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g2(EbtBalance ebtAcculynkResponse) {
        String mask;
        this.ebtBalance = ebtAcculynkResponse;
        e2().d0(new Z.i.SetEbtPaymentOption(this.ebtBalance, this.ebtPanResponse));
        EbtPanResponse ebtPanResponse = this.ebtPanResponse;
        if (ebtPanResponse != null && (mask = ebtPanResponse.getMask()) != null) {
            e2().d0(new Z.i.DisplayEbtBalanceAction(mask, ebtAcculynkResponse, false, 4, null));
        }
        e2().d0(Z.i.c.f104591a);
        e2().d0(Z.i.j.f104602a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i2() {
        new C15485b(this).setCancelable(true).setTitle(com.meijer.mobile.meijer.Y.f100911f0).setMessage(com.meijer.mobile.meijer.Y.f100891e0).setPositiveButton(getString(yr.Q.f171761b), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.m
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                CheckoutPaymentOptionsActivity.j2(dialogInterface, i10);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j2(DialogInterface dialog, int i10) {
        Intrinsics.j(dialog, "dialog");
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k2(AbstractC6392a title, AbstractC6392a message) {
        new C15485b(this).setCancelable(false).setTitle(title.b(this)).setMessage(message.b(this)).setPositiveButton(com.meijer.mobile.meijer.Y.f101214u4, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.l
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                CheckoutPaymentOptionsActivity.l2(this.f104898a, dialogInterface, i10);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m2(String title, String message, final EbtPanResponse ebtResponse, boolean isEnableRetry) {
        FrameLayout frameLayout;
        DialogTitle dialogTitle;
        TextView textView;
        C15485b cancelable = new C15485b(this).setTitle(title).setMessage(message).setCancelable(true);
        Intrinsics.i(cancelable, "setCancelable(...)");
        if (isEnableRetry) {
            cancelable.setNegativeButton(com.meijer.mobile.meijer.Y.f101031l1, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.h
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    CheckoutPaymentOptionsActivity.n2(this.f104856a, dialogInterface, i10);
                }
            }).setPositiveButton(com.meijer.mobile.meijer.Y.f100486Ih, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.i
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    CheckoutPaymentOptionsActivity.o2(this.f104857a, ebtResponse, dialogInterface, i10);
                }
            });
        } else {
            cancelable.setPositiveButton(com.meijer.mobile.meijer.Y.f101031l1, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.j
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    CheckoutPaymentOptionsActivity.p2(this.f104860a, dialogInterface, i10);
                }
            });
        }
        cancelable.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.k
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                CheckoutPaymentOptionsActivity.q2(this.f104862a, dialogInterface);
            }
        });
        androidx.appcompat.app.c cVarShow = cancelable.show();
        if (cVarShow != null && (textView = (TextView) cVarShow.findViewById(R.id.message)) != null) {
        }
        if (cVarShow != null && (dialogTitle = (DialogTitle) cVarShow.findViewById(ce.f.f61696a)) != null) {
        }
        if (cVarShow == null || (frameLayout = (FrameLayout) cVarShow.findViewById(ce.f.f61698b)) == null) {
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s2(String message) {
        new C15485b(this).setCancelable(false).setTitle(com.meijer.mobile.meijer.Y.f100323Ab).setMessage(message).setPositiveButton(getString(yr.Q.f171761b), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                CheckoutPaymentOptionsActivity.t2(dialogInterface, i10);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t2(DialogInterface dialog, int i10) {
        Intrinsics.j(dialog, "dialog");
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u2() {
        new C15485b(this).setTitle(com.meijer.mobile.meijer.Y.f100325Ad).setMessage(com.meijer.mobile.meijer.Y.f101323zd).setNegativeButton(com.meijer.mobile.meijer.Y.f101243vd, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.n
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                CheckoutPaymentOptionsActivity.v2(dialogInterface, i10);
            }
        }).setPositiveButton(com.meijer.mobile.meijer.Y.f101263wd, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.o
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                CheckoutPaymentOptionsActivity.w2(this.f104901a, dialogInterface, i10);
            }
        }).show();
    }

    public final Z e2() {
        return (Z) this.checkoutPaymentOptionsViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h2(boolean isSaveSlotAvailable) {
        EnumC14533a enumC14533a;
        com.meijer.mobile.accounts.ux.payments.d dVarD2 = d2();
        if (isSaveSlotAvailable) {
            enumC14533a = EnumC14533a.f135774b;
        } else {
            enumC14533a = EnumC14533a.f135776d;
        }
        com.meijer.mobile.accounts.ux.payments.d.t(dVarD2, enumC14533a, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l2(CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity, DialogInterface dialogInterface, int i10) {
        checkoutPaymentOptionsActivity.e2().d0(new Z.i.SetIsProcessingEbtPanResponse(false));
        dialogInterface.dismiss();
        checkoutPaymentOptionsActivity.e2().d0(Z.i.c.f104591a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n2(CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        checkoutPaymentOptionsActivity.e2().d0(Z.i.c.f104591a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o2(CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity, EbtPanResponse ebtPanResponse, DialogInterface dialogInterface, int i10) {
        String token;
        dialogInterface.dismiss();
        Z zE2 = checkoutPaymentOptionsActivity.e2();
        String cardExpiration = null;
        if (ebtPanResponse != null) {
            token = ebtPanResponse.getToken();
        } else {
            token = null;
        }
        if (ebtPanResponse != null) {
            cardExpiration = ebtPanResponse.getCardExpiration();
        }
        zE2.d0(new Z.i.ShowEbtPinPad(token, cardExpiration, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p2(CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        checkoutPaymentOptionsActivity.e2().d0(Z.i.c.f104591a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q2(CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity, DialogInterface dialogInterface) {
        checkoutPaymentOptionsActivity.e2().d0(Z.i.c.f104591a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r2(AbstractC6392a message) {
        s2(ck.d.a(this, message));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v2(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w2(CheckoutPaymentOptionsActivity checkoutPaymentOptionsActivity, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        checkoutPaymentOptionsActivity.e2().d0(Z.i.m.f104605a);
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC4236g abstractC4236gM0 = AbstractC4236g.M0(getLayoutInflater());
        this.binding = abstractC4236gM0;
        if (abstractC4236gM0 == null) {
            Intrinsics.x("binding");
            abstractC4236gM0 = null;
        }
        setContentView(Zr.a.j(abstractC4236gM0.getRoot(), false, 1, null));
        getLifecycle().a(e2());
        this.isEditMode = getIntent().getBooleanExtra("com.meijer.mobile.meijer.activity.checkout.payment.intent.extra.PAYMENT_CARD", false);
        boolean booleanExtra = getIntent().getBooleanExtra("com.meijer.mobile.meijer.activity.checkout.payment.intent.extra.PAYMENT_CARD", false);
        this.isEditMode = booleanExtra;
        this.fromOrderReviewFlow = booleanExtra;
        AbstractC4236g abstractC4236g = this.binding;
        if (abstractC4236g == null) {
            Intrinsics.x("binding");
            abstractC4236g = null;
        }
        abstractC4236g.f21959z.setContent(ComposableLambdaKt.composableLambdaInstance(-456344357, true, new b()));
        C16563h.J(C16563h.O(e2().Z(), new c(null)), C6173t.a(this));
    }
}
