package com.meijer.mobile.meijer.activity.cart;

import Ki.LocalThemeScope;
import V2.CreationExtras;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.view.C6173t;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import com.meijer.mobile.meijer.activity.cart.ChangeFulfillmentPreviewActivity;
import com.meijer.mobile.meijer.activity.cart.S0;
import e.C13737e;
import fj.CartChanges;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import pv.C16563h;
import yr.C18370z;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0013²\u0006\f\u0010\u0012\u001a\u00020\u00118\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/ChangeFulfillmentPreviewActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/meijer/mobile/meijer/activity/cart/S0;", "s", "Lkotlin/Lazy;", "D1", "()Lcom/meijer/mobile/meijer/activity/cart/S0;", "changeFulfillmentViewModel", "t", "a", "Lcom/meijer/mobile/meijer/activity/cart/S0$d;", "viewState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class ChangeFulfillmentPreviewActivity extends Hilt_ChangeFulfillmentPreviewActivity {

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: u, reason: collision with root package name */
    public static final int f101959u = 8;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Lazy changeFulfillmentViewModel = new androidx.view.e0(Reflection.b(S0.class), new e(this), new d(this), new f(null, this));

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/ChangeFulfillmentPreviewActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lfj/e;", "cartChanges", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Lfj/e;)Landroid/content/Intent;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.cart.ChangeFulfillmentPreviewActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Intent a(Context context, CartChanges cartChanges) {
            Intrinsics.j(context, "context");
            Intrinsics.j(cartChanges, "cartChanges");
            Intent intentPutExtra = new Intent(context, (Class<?>) ChangeFulfillmentPreviewActivity.class).putExtra("com.meijer.mobile.meijer.activity.cart.CART_CHANGES", cartChanges);
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
            final /* synthetic */ ChangeFulfillmentPreviewActivity f101962a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z1<S0.ViewState> f101963b;

            a(ChangeFulfillmentPreviewActivity changeFulfillmentPreviewActivity, z1<S0.ViewState> z1Var) {
                this.f101962a = changeFulfillmentPreviewActivity;
                this.f101963b = z1Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(ChangeFulfillmentPreviewActivity changeFulfillmentPreviewActivity, nk.f product) {
                Intrinsics.j(product, "product");
                changeFulfillmentPreviewActivity.startActivity(Bl.g.t(changeFulfillmentPreviewActivity.getFeatureEntryPoint(), product, true, false, "PDP accessed from Fulfillment Change Preview", 4, null));
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(ChangeFulfillmentPreviewActivity changeFulfillmentPreviewActivity) {
                changeFulfillmentPreviewActivity.setResult(-3132);
                changeFulfillmentPreviewActivity.finish();
                return Unit.f143329a;
            }

            public final void d(LocalThemeScope AdsTheme, Composer composer, int i10) {
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(887315497, i10, -1, "com.meijer.mobile.meijer.activity.cart.ChangeFulfillmentPreviewActivity.onCreate.<anonymous>.<anonymous> (ChangeFulfillmentPreviewActivity.kt:56)");
                }
                Modifier modifierB = C18370z.b(Modifier.INSTANCE, true);
                S0.ViewState viewStateC = b.c(this.f101963b);
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(this.f101962a);
                final ChangeFulfillmentPreviewActivity changeFulfillmentPreviewActivity = this.f101962a;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.cart.J0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ChangeFulfillmentPreviewActivity.b.a.e(changeFulfillmentPreviewActivity, (nk.f) obj);
                        }
                    };
                    composer.t(objB);
                }
                Function1 function1 = (Function1) objB;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zD2 = composer.D(this.f101962a);
                final ChangeFulfillmentPreviewActivity changeFulfillmentPreviewActivity2 = this.f101962a;
                Object objB2 = composer.B();
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.cart.K0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ChangeFulfillmentPreviewActivity.b.a.f(changeFulfillmentPreviewActivity2);
                        }
                    };
                    composer.t(objB2);
                }
                Function0 function0 = (Function0) objB2;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zD3 = composer.D(this.f101962a);
                final ChangeFulfillmentPreviewActivity changeFulfillmentPreviewActivity3 = this.f101962a;
                Object objB3 = composer.B();
                if (zD3 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function0() { // from class: com.meijer.mobile.meijer.activity.cart.L0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ChangeFulfillmentPreviewActivity.b.a.g(changeFulfillmentPreviewActivity3);
                        }
                    };
                    composer.t(objB3);
                }
                composer.P();
                zm.m.l(AdsTheme, modifierB, viewStateC, function1, function0, (Function0) objB3, composer, LocalThemeScope.f17314g | (i10 & 14));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                d(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(ChangeFulfillmentPreviewActivity changeFulfillmentPreviewActivity) {
                changeFulfillmentPreviewActivity.D1().y(S0.a.c.f102508a);
                changeFulfillmentPreviewActivity.setResult(3132);
                changeFulfillmentPreviewActivity.finish();
                return Unit.f143329a;
            }
        }

        b() {
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1068473446, i10, -1, "com.meijer.mobile.meijer.activity.cart.ChangeFulfillmentPreviewActivity.onCreate.<anonymous> (ChangeFulfillmentPreviewActivity.kt:54)");
            }
            Ki.K.b(null, ComposableLambdaKt.c(887315497, true, new a(ChangeFulfillmentPreviewActivity.this, S2.a.c(ChangeFulfillmentPreviewActivity.this.D1().x(), null, null, null, composer, 0, 7)), composer, 54), composer, 48, 1);
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
        public static final S0.ViewState c(z1<S0.ViewState> z1Var) {
            return z1Var.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f101967f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f101967f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f101967f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f101968f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f101968f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f101968f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f101969f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f101970g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f101969f = function0;
            this.f101970g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f101969f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f101970g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/S0$c;", "event", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/cart/S0$c;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.cart.ChangeFulfillmentPreviewActivity$onCreate$4", f = "ChangeFulfillmentPreviewActivity.kt", l = {}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<S0.c, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f101964a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f101965b;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = ChangeFulfillmentPreviewActivity.this.new c(continuation);
            cVar.f101965b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(S0.c cVar, Continuation<? super Unit> continuation) {
            return ((c) create(cVar, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f101964a == 0) {
                ResultKt.b(obj);
                S0.c cVar = (S0.c) this.f101965b;
                if (cVar instanceof S0.c.InitialLoad) {
                    qw.a.INSTANCE.a(ChangeFulfillmentPreviewActivity.this.getText(((S0.c.InitialLoad) cVar).getInitialLoadMsg()).toString(), new Object[0]);
                    return Unit.f143329a;
                }
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final S0 D1() {
        return (S0) this.changeFulfillmentViewModel.getValue();
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Parcelable parcelable;
        super.onCreate(savedInstanceState);
        String stringExtra = getIntent().getStringExtra("fulfillmentType");
        if (stringExtra != null) {
            Intent intent = getIntent();
            Intrinsics.i(intent, "getIntent(...)");
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) intent.getParcelableExtra("com.meijer.mobile.meijer.activity.cart.CART_CHANGES", CartChanges.class);
            } else {
                Parcelable parcelableExtra = intent.getParcelableExtra("com.meijer.mobile.meijer.activity.cart.CART_CHANGES");
                if (!(parcelableExtra instanceof CartChanges)) {
                    parcelableExtra = null;
                }
                parcelable = (CartChanges) parcelableExtra;
            }
            S0.a.CartChangesFromOrderOptions cartChangesFromOrderOptions = new S0.a.CartChangesFromOrderOptions((CartChanges) parcelable, stringExtra);
            D1().y(cartChangesFromOrderOptions);
            D1().y(new S0.a.GetCartId(cartChangesFromOrderOptions.getCartChanges(), cartChangesFromOrderOptions.getFulfillmentMode()));
        }
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-1068473446, true, new b()), 1, null);
        C16563h.J(C16563h.O(D1().getEvents(), new c(null)), C6173t.a(this));
    }
}
