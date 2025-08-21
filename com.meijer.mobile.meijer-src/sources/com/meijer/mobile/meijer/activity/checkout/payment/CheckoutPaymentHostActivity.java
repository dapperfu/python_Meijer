package com.meijer.mobile.meijer.activity.checkout.payment;

import Ki.LocalThemeScope;
import V0.C5489q0;
import V2.CreationExtras;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.view.C6173t;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import com.fullstory.FS;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.activity.checkout.payment.C12019c;
import com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentOptionsActivity;
import e.C13737e;
import hk.EnumC14533a;
import ki.InterfaceC15154X;
import ki.Q0;
import ki.q1;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.t1;
import pv.C16563h;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003R\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012¨\u0006\u001c²\u0006\f\u0010\u001b\u001a\u00020\u001a8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/CheckoutPaymentHostActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "Lcom/meijer/mobile/meijer/activity/checkout/payment/c;", "s", "Lkotlin/Lazy;", "F1", "()Lcom/meijer/mobile/meijer/activity/checkout/payment/c;", "viewModel", "", "t", "Z", "isEditMode", "u", "isOrderReviewFlow", "v", "shouldShowProgressIndicator", "w", "a", "Lcom/meijer/mobile/meijer/activity/checkout/payment/c$a;", "viewState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class CheckoutPaymentHostActivity extends Hilt_CheckoutPaymentHostActivity {

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: x, reason: collision with root package name */
    public static final int f104399x = 8;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new androidx.view.e0(Reflection.b(C12019c.class), new e(this), new d(this), new f(null, this));

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean isEditMode;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private boolean isOrderReviewFlow;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean shouldShowProgressIndicator;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/CheckoutPaymentHostActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "isEditMode", "fromOrderReview", "shouldShowProgressIndicator", "Landroid/content/Intent;", "a", "(Landroid/content/Context;ZZZ)Landroid/content/Intent;", "", "EXTRA_EDIT_MODE", "Ljava/lang/String;", "EXTRA_FROM_ORDER_REVIEW", "EXTRA_SHOULD_SHOW_PROGRESS_INDICATOR", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentHostActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ Intent b(Companion companion, Context context, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            if ((i10 & 4) != 0) {
                z11 = false;
            }
            if ((i10 & 8) != 0) {
                z12 = false;
            }
            return companion.a(context, z10, z11, z12);
        }

        @JvmStatic
        public final Intent a(Context context, boolean isEditMode, boolean fromOrderReview, boolean shouldShowProgressIndicator) {
            Intrinsics.j(context, "context");
            Intent intent = new Intent(context, (Class<?>) CheckoutPaymentHostActivity.class);
            intent.putExtra("com.meijer.mobile.meijer.activity.checkout.payment.intent.extra.EDIT_MODE", isEditMode);
            intent.putExtra("com.meijer.mobile.meijer.activity.checkout.payment.intent.extra.FROM_ORDER_REVIEW", fromOrderReview);
            intent.putExtra("com.meijer.mobile.meijer.activity.checkout.payment.intent.extra.SHOULD_SHOW_PROGRESS_INDICATOR", shouldShowProgressIndicator);
            return intent;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CheckoutPaymentHostActivity f104408a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentHostActivity$c$a$a, reason: collision with other inner class name */
            static final class C1487a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f104409a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ z1<C12019c.CheckoutPaymentHostViewState> f104410b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentHostActivity$c$a$a$a, reason: collision with other inner class name */
                static final class C1488a implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f104411a;

                    C1488a(LocalThemeScope localThemeScope) {
                        this.f104411a = localThemeScope;
                    }

                    public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
                        Intrinsics.j(Assemble, "$this$Assemble");
                        if (ComposerKt.M()) {
                            ComposerKt.U(-813447233, i10, -1, "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentHostActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckoutPaymentHostActivity.kt:86)");
                        }
                        q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
                        Ci.o oVar = Ci.o.f4629a;
                        Ci.m.d(this.f104411a, FullStoryAnnotationsKt.fsUnmask(androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null)), largeLoading, oVar, null, null, null, composer, LocalThemeScope.f17314g | 3072 | (q1.k.Large.f142345f << 6), 56);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15154X interfaceC15154X, Composer composer, Integer num) {
                        a(interfaceC15154X, composer, num.intValue());
                        return Unit.f143329a;
                    }
                }

                C1487a(LocalThemeScope localThemeScope, z1<C12019c.CheckoutPaymentHostViewState> z1Var) {
                    this.f104409a = localThemeScope;
                    this.f104410b = z1Var;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1531989239, i10, -1, "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentHostActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (CheckoutPaymentHostActivity.kt:84)");
                    }
                    if (a.c(this.f104410b).getIsLoading()) {
                        LocalThemeScope localThemeScope = this.f104409a;
                        Ki.Q.e(localThemeScope, Q0.b.f141966a, ComposableLambdaKt.c(-813447233, true, new C1488a(localThemeScope), composer, 54), composer, LocalThemeScope.f17314g | 384 | (Q0.b.f141967b << 3));
                    }
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

            a(CheckoutPaymentHostActivity checkoutPaymentHostActivity) {
                this.f104408a = checkoutPaymentHostActivity;
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
                    ComposerKt.U(1553347021, i11, -1, "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentHostActivity.onCreate.<anonymous>.<anonymous> (CheckoutPaymentHostActivity.kt:79)");
                }
                t1.a(androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null), null, C5489q0.q(AdsTheme.getAdsColors().getAdsColorUIBackground01().getColor(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), 0L, null, 0.0f, ComposableLambdaKt.c(-1531989239, true, new C1487a(AdsTheme, o1.b(this.f104408a.F1().o(), null, composer, 0, 1)), composer, 54), composer, 1572870, 58);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                b(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final C12019c.CheckoutPaymentHostViewState c(z1<C12019c.CheckoutPaymentHostViewState> z1Var) {
                return z1Var.getValue();
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
                ComposerKt.U(-1059118850, i10, -1, "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentHostActivity.onCreate.<anonymous> (CheckoutPaymentHostActivity.kt:78)");
            }
            Ki.K.b(null, ComposableLambdaKt.c(1553347021, true, new a(CheckoutPaymentHostActivity.this), composer, 54), composer, 48, 1);
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f104412f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f104412f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f104412f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f104413f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f104413f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f104413f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f104414f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f104415g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f104414f = function0;
            this.f104415g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f104414f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f104415g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/c$b;", "event", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/checkout/payment/c$b;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.payment.CheckoutPaymentHostActivity$onCreate$1", f = "CheckoutPaymentHostActivity.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<C12019c.b, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f104404a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f104405b;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = CheckoutPaymentHostActivity.this.new b(continuation);
            bVar.f104405b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C12019c.b bVar, Continuation<? super Unit> continuation) {
            return ((b) create(bVar, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Intent intentC;
            IntrinsicsKt.f();
            if (this.f104404a == 0) {
                ResultKt.b(obj);
                C12019c.b bVar = (C12019c.b) this.f104405b;
                if (bVar instanceof C12019c.b.LaunchPaymentScreen) {
                    CheckoutPaymentHostActivity checkoutPaymentHostActivity = CheckoutPaymentHostActivity.this;
                    if (((C12019c.b.LaunchPaymentScreen) bVar).getIsPaymentOptionsAvailable()) {
                        CheckoutPaymentOptionsActivity.Companion companion = CheckoutPaymentOptionsActivity.INSTANCE;
                        CheckoutPaymentHostActivity checkoutPaymentHostActivity2 = CheckoutPaymentHostActivity.this;
                        intentC = companion.a(checkoutPaymentHostActivity2, checkoutPaymentHostActivity2.isEditMode);
                    } else {
                        intentC = Bl.g.c(CheckoutPaymentHostActivity.this.getFeatureEntryPoint(), EnumC14533a.f135774b, false, true, CheckoutPaymentHostActivity.this.isOrderReviewFlow, false, null, 50, null);
                    }
                    checkoutPaymentHostActivity.startActivity(intentC);
                    CheckoutPaymentHostActivity.this.finish();
                    return Unit.f143329a;
                }
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C12019c F1() {
        return (C12019c) this.viewModel.getValue();
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLifecycle().a(F1());
        this.isEditMode = getIntent().getBooleanExtra("com.meijer.mobile.meijer.activity.checkout.payment.intent.extra.EDIT_MODE", false);
        this.isOrderReviewFlow = getIntent().getBooleanExtra("com.meijer.mobile.meijer.activity.checkout.payment.intent.extra.FROM_ORDER_REVIEW", false);
        this.shouldShowProgressIndicator = getIntent().getBooleanExtra("com.meijer.mobile.meijer.activity.checkout.payment.intent.extra.SHOULD_SHOW_PROGRESS_INDICATOR", false);
        C16563h.J(C16563h.O(F1().n(), new b(null)), C6173t.a(this));
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-1059118850, true, new c()), 1, null);
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        FS.page("Checkout | Add Payment Method").start();
    }
}
