package com.meijer.mobile.accounts.ux.payments;

import Fh.a;
import Ji.K;
import Ji.LocalThemeScope;
import Nh.x0;
import V2.CreationExtras;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import com.meijer.mobile.accounts.ux.payments.d;
import com.meijer.mobile.accounts.ux.payments.s;
import e.C13589e;
import gk.EnumC14271a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
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

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0019\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\u0003R\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001e²\u0006\f\u0010\u001b\u001a\u00020\u001a8\nX\u008a\u0084\u0002²\u0006\f\u0010\u001d\u001a\u00020\u001c8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/accounts/ux/payments/PaymentsScreenActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "LFh/a;", "accountNavigationRequest", "", "s1", "(LFh/a;)V", "p1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "Lcom/meijer/mobile/accounts/ux/payments/d;", "v", "Lkotlin/Lazy;", "q1", "()Lcom/meijer/mobile/accounts/ux/payments/d;", "aurusViewModel", "Lcom/meijer/mobile/accounts/ux/payments/s;", "w", "r1", "()Lcom/meijer/mobile/accounts/ux/payments/s;", "viewModel", "Lcom/meijer/mobile/accounts/ux/payments/s$a;", "paymentsScreenViewState", "Lcom/meijer/mobile/accounts/ux/payments/d$d;", "aurusViewState", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class PaymentsScreenActivity extends Hilt_PaymentsScreenActivity {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Lazy aurusViewModel = new e0(Reflection.b(com.meijer.mobile.accounts.ux.payments.d.class), new c(this), new b(this), new d(null, this));

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e0(Reflection.b(s.class), new f(this), new e(this), new g(null, this));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.accounts.ux.payments.PaymentsScreenActivity$a$a, reason: collision with other inner class name */
        static final class C1331a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PaymentsScreenActivity f94391a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z1<s.PaymentsScreenViewState> f94392b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.accounts.ux.payments.PaymentsScreenActivity$a$a$a, reason: collision with other inner class name */
            /* synthetic */ class C1332a extends FunctionReferenceImpl implements Function1<Fh.a, Unit> {
                C1332a(Object obj) {
                    super(1, obj, PaymentsScreenActivity.class, "onNavigationRequest", "onNavigationRequest(Lcom/meijer/mobile/accounts/ux/AccountNavigationRequest;)V", 0);
                }

                public final void a(Fh.a p02) {
                    Intrinsics.j(p02, "p0");
                    ((PaymentsScreenActivity) this.receiver).s1(p02);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Fh.a aVar) {
                    a(aVar);
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.accounts.ux.payments.PaymentsScreenActivity$a$a$b */
            /* synthetic */ class b extends FunctionReferenceImpl implements Function1<k, Unit> {
                b(Object obj) {
                    super(1, obj, s.class, "onAction", "onAction(Lcom/meijer/mobile/accounts/ux/payments/PaymentsResourceAction;)V", 0);
                }

                public final void a(k p02) {
                    Intrinsics.j(p02, "p0");
                    ((s) this.receiver).J(p02);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(k kVar) {
                    a(kVar);
                    return Unit.f142422a;
                }
            }

            C1331a(PaymentsScreenActivity paymentsScreenActivity, z1<s.PaymentsScreenViewState> z1Var) {
                this.f94391a = paymentsScreenActivity;
                this.f94392b = z1Var;
            }

            public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(2071278704, i10, -1, "com.meijer.mobile.accounts.ux.payments.PaymentsScreenActivity.onCreate.<anonymous>.<anonymous> (PaymentsScreenActivity.kt:45)");
                }
                z1 z1VarB = o1.b(this.f94391a.q1().x(), null, composer, 0, 1);
                if (a.c(this.f94392b).getShouldStartAurus()) {
                    this.f94391a.q1().s(EnumC14271a.f133707a, a.c(this.f94392b).getIsMperksCardLinkingEnabled());
                } else {
                    this.f94391a.q1().C();
                }
                s.PaymentsScreenViewState paymentsScreenViewStateC = a.c(this.f94392b);
                d.ViewState viewStateB = b(z1VarB);
                PaymentsScreenActivity paymentsScreenActivity = this.f94391a;
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(paymentsScreenActivity);
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new C1332a(paymentsScreenActivity);
                    composer.t(objB);
                }
                composer.P();
                Function1 function1 = (Function1) ((KFunction) objB);
                s sVarR1 = this.f94391a.r1();
                composer.startReplaceGroup(5004770);
                boolean zD2 = composer.D(sVarR1);
                Object objB2 = composer.B();
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new b(sVarR1);
                    composer.t(objB2);
                }
                composer.P();
                x0.b(AdsTheme, paymentsScreenViewStateC, viewStateB, null, function1, (Function1) ((KFunction) objB2), composer, LocalThemeScope.f15770g | (i10 & 14), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }

            private static final d.ViewState b(z1<d.ViewState> z1Var) {
                return z1Var.getValue();
            }
        }

        a() {
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(607231585, i10, -1, "com.meijer.mobile.accounts.ux.payments.PaymentsScreenActivity.onCreate.<anonymous> (PaymentsScreenActivity.kt:43)");
            }
            K.b(null, ComposableLambdaKt.c(2071278704, true, new C1331a(PaymentsScreenActivity.this, o1.b(PaymentsScreenActivity.this.r1().I(), null, composer, 0, 1)), composer, 54), composer, 48, 1);
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
        public static final s.PaymentsScreenViewState c(z1<s.PaymentsScreenViewState> z1Var) {
            return z1Var.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class b extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f94393f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f94393f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f94393f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f94394f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f94394f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f94394f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f94395f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f94396g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f94395f = function0;
            this.f94396g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f94395f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f94396g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f94397f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f94397f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f94397f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f94398f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f94398f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f94398f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f94399f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f94400g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f94399f = function0;
            this.f94400g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f94399f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f94400g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.meijer.mobile.accounts.ux.payments.d q1() {
        return (com.meijer.mobile.accounts.ux.payments.d) this.aurusViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s r1() {
        return (s) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s1(Fh.a accountNavigationRequest) {
        if (Intrinsics.e(accountNavigationRequest, a.k.f10423a)) {
            p1();
            return;
        }
        if (accountNavigationRequest instanceof a.Profile) {
            startActivity(Al.a.e(Al.a.f661a, this, true, false, 4, null));
            bk.c.b(this, 0, Fh.c.f10438a, Al.m.f674a, 0, 8, null);
        } else if (accountNavigationRequest instanceof a.j) {
            startActivity(Al.a.f661a.j(this));
        }
    }

    private final void p1() {
        finish();
        bk.c.b(this, 1, Bj.d.f2592a, Bj.d.f2595d, 0, 8, null);
    }

    @Override // com.meijer.mobile.accounts.ux.payments.Hilt_PaymentsScreenActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(607231585, true, new a()), 1, null);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        s.F(r1(), false, 1, null);
    }
}
