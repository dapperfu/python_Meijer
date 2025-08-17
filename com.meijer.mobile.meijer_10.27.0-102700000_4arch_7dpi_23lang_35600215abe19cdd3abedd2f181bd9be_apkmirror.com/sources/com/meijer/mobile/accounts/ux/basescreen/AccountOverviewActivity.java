package com.meijer.mobile.accounts.ux.basescreen;

import Fh.a;
import Hh.A;
import Hh.C3668a;
import Hh.OrdersCardViewState;
import Hh.e;
import Hh.o;
import Hh.s;
import Ji.LocalThemeScope;
import Kh.C4017s;
import V2.CreationExtras;
import ak.AbstractC5607a;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import bi.SubscriptionCardViewState;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.accounts.ux.basescreen.p;
import e.C13589e;
import gi.InterfaceC14261a;
import hi.C14476c;
import hi.TrackingData;
import je.C14886b;
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
import yl.AbstractC18227f;
import yr.C18299z;

@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J#\u0010\u0010\u001a\u00020\u00062\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001e\u0010\u001bJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010\u0003J\u000f\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\u0003J\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\"\u0010#J\u0019\u0010&\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010$H\u0014¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0006H\u0014¢\u0006\u0004\b(\u0010\u0003R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001b\u0010F\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001b\u0010K\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010C\u001a\u0004\bI\u0010JR\u001b\u0010P\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010C\u001a\u0004\bN\u0010OR\u001b\u0010U\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010C\u001a\u0004\bS\u0010TR\u001b\u0010Z\u001a\u00020V8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010C\u001a\u0004\bX\u0010YR\u001b\u0010_\u001a\u00020[8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010C\u001a\u0004\b]\u0010^R\u001b\u0010d\u001a\u00020`8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u0010C\u001a\u0004\bb\u0010cR\u001b\u0010i\u001a\u00020e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010C\u001a\u0004\bg\u0010h¨\u0006z²\u0006\f\u0010k\u001a\u00020j8\nX\u008a\u0084\u0002²\u0006\f\u0010m\u001a\u00020l8\nX\u008a\u0084\u0002²\u0006\f\u0010o\u001a\u00020n8\nX\u008a\u0084\u0002²\u0006\f\u0010q\u001a\u00020p8\nX\u008a\u0084\u0002²\u0006\f\u0010s\u001a\u00020r8\nX\u008a\u0084\u0002²\u0006\f\u0010u\u001a\u00020t8\nX\u008a\u0084\u0002²\u0006\f\u0010w\u001a\u00020v8\nX\u008a\u0084\u0002²\u0006\f\u0010y\u001a\u00020x8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/accounts/ux/basescreen/AccountOverviewActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "LFh/a;", "accountNavigationRequest", "", "a2", "(LFh/a;)V", "n2", "m2", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "", "storeName", "q2", "(ILjava/lang/String;)V", "orderId", "o2", "(Ljava/lang/String;)V", "", "isChip", "isEditBasicInfo", "h2", "(ZZ)V", "f2", "(Z)V", "b2", "d2", "S1", "k2", "X1", "U1", "R1", "(Z)Ljava/lang/String;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "Lgi/a;", "v", "Lgi/a;", "getAnalyticsEngine", "()Lgi/a;", "setAnalyticsEngine", "(Lgi/a;)V", "analyticsEngine", "Lyl/k;", "w", "Lyl/k;", "getFeatureManager", "()Lyl/k;", "setFeatureManager", "(Lyl/k;)V", "featureManager", "LCl/e;", "x", "LCl/e;", "K1", "()LCl/e;", "setMeijerDeepLinkParser", "(LCl/e;)V", "meijerDeepLinkParser", "Lcom/meijer/mobile/accounts/ux/basescreen/p;", "y", "Lkotlin/Lazy;", "P1", "()Lcom/meijer/mobile/accounts/ux/basescreen/p;", "viewModel", "LHh/s;", "z", "N1", "()LHh/s;", "profileCardViewModel", "LHh/a;", "A", "I1", "()LHh/a;", "addressesCardViewModel", "LHh/o;", "B", "M1", "()LHh/o;", "paymentsCardViewModel", "LHh/e;", "C", "J1", "()LHh/e;", "communicationsCardViewModel", "LHh/A;", "D", "Q1", "()LHh/A;", "yourMeijerStoreCardViewModel", "LHh/i;", "E", "L1", "()LHh/i;", "ordersCardViewModel", "LHh/w;", "F", "O1", "()LHh/w;", "subscriptionCardViewModel", "Lcom/meijer/mobile/accounts/ux/basescreen/p$a;", "accountOverviewViewState", "LHh/s$b;", "profileCardViewState", "LHh/a$a;", "addressesCardViewState", "LHh/o$a;", "paymentsCardViewState", "LHh/e$a;", "communicationsCardViewState", "LHh/A$a;", "yourMeijerStoreCardViewState", "LHh/n;", "ordersCardViewState", "Lbi/a;", "subscriptionCardViewState", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AccountOverviewActivity extends Hilt_AccountOverviewActivity {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public InterfaceC14261a analyticsEngine;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public yl.k featureManager;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public Cl.e meijerDeepLinkParser;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e0(Reflection.b(com.meijer.mobile.accounts.ux.basescreen.p.class), new r(this), new l(this), new s(null, this));

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final Lazy profileCardViewModel = new e0(Reflection.b(Hh.s.class), new u(this), new t(this), new v(null, this));

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final Lazy addressesCardViewModel = new e0(Reflection.b(C3668a.class), new x(this), new w(this), new y(null, this));

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final Lazy paymentsCardViewModel = new e0(Reflection.b(Hh.o.class), new c(this), new b(this), new d(null, this));

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final Lazy communicationsCardViewModel = new e0(Reflection.b(Hh.e.class), new f(this), new e(this), new g(null, this));

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final Lazy yourMeijerStoreCardViewModel = new e0(Reflection.b(Hh.A.class), new i(this), new h(this), new j(null, this));

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final Lazy ordersCardViewModel = new e0(Reflection.b(Hh.i.class), new m(this), new k(this), new n(null, this));

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final Lazy subscriptionCardViewModel = new e0(Reflection.b(Hh.w.class), new p(this), new o(this), new q(null, this));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.accounts.ux.basescreen.AccountOverviewActivity$a$a, reason: collision with other inner class name */
        static final class C1321a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AccountOverviewActivity f94208a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.accounts.ux.basescreen.AccountOverviewActivity$a$a$a, reason: collision with other inner class name */
            /* synthetic */ class C1322a extends FunctionReferenceImpl implements Function1<Fh.a, Unit> {
                C1322a(Object obj) {
                    super(1, obj, AccountOverviewActivity.class, "onNavigationRequest", "onNavigationRequest(Lcom/meijer/mobile/accounts/ux/AccountNavigationRequest;)V", 0);
                }

                public final void a(Fh.a p02) {
                    Intrinsics.j(p02, "p0");
                    ((AccountOverviewActivity) this.receiver).a2(p02);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Fh.a aVar) {
                    a(aVar);
                    return Unit.f142422a;
                }
            }

            C1321a(AccountOverviewActivity accountOverviewActivity) {
                this.f94208a = accountOverviewActivity;
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
                    ComposerKt.U(2052810908, i11, -1, "com.meijer.mobile.accounts.ux.basescreen.AccountOverviewActivity.onCreate.<anonymous>.<anonymous> (AccountOverviewActivity.kt:106)");
                }
                z1 z1VarC = S2.a.c(this.f94208a.P1().m(), null, null, null, composer, 0, 7);
                z1 z1VarC2 = S2.a.c(this.f94208a.N1().r(), null, null, null, composer, 0, 7);
                z1 z1VarC3 = S2.a.c(this.f94208a.I1().r(), null, null, null, composer, 0, 7);
                z1 z1VarC4 = S2.a.c(this.f94208a.M1().r(), null, null, null, composer, 0, 7);
                z1 z1VarC5 = S2.a.c(this.f94208a.J1().p(), null, null, null, composer, 0, 7);
                z1 z1VarC6 = S2.a.c(this.f94208a.Q1().r(), null, null, null, composer, 0, 7);
                z1 z1VarC7 = S2.a.c(this.f94208a.L1().u(), null, null, null, composer, 0, 7);
                z1 z1VarC8 = S2.a.c(this.f94208a.O1().r(), null, null, null, composer, 0, 7);
                p.AccountOverviewViewState accountOverviewViewStateB = b(z1VarC);
                s.ProfileCardViewState profileCardViewStateC = c(z1VarC2);
                C3668a.AddressesCardViewState addressesCardViewStateD = d(z1VarC3);
                o.PaymentsCardViewState paymentsCardViewStateE = e(z1VarC4);
                e.CommunicationsCardViewState communicationsCardViewStateF = f(z1VarC5);
                OrdersCardViewState ordersCardViewStateK = k(z1VarC7);
                A.YourMeijerStoreCardViewState yourMeijerStoreCardViewStateG = g(z1VarC6);
                SubscriptionCardViewState subscriptionCardViewStateL = l(z1VarC8);
                boolean zE = this.f94208a.getFeatureManager().e(AbstractC18227f.C18229b.f170568h);
                boolean zE2 = this.f94208a.getFeatureManager().e(AbstractC18227f.Z.f170565h);
                Modifier modifierC = C18299z.c(FullStoryAnnotationsKt.fsUnmask(androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null)), false, 1, null);
                AccountOverviewActivity accountOverviewActivity = this.f94208a;
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(accountOverviewActivity);
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new C1322a(accountOverviewActivity);
                    composer.t(objB);
                }
                composer.P();
                int i12 = LocalThemeScope.f15770g | (i11 & 14);
                int i13 = AbstractC5607a.f45514b;
                C4017s.b(AdsTheme, accountOverviewViewStateB, profileCardViewStateC, addressesCardViewStateD, paymentsCardViewStateE, communicationsCardViewStateF, yourMeijerStoreCardViewStateG, ordersCardViewStateK, subscriptionCardViewStateL, zE, zE2, modifierC, (Function1) ((KFunction) objB), composer, i12 | (i13 << 6) | (i13 << 9) | (i13 << 12) | (i13 << 15), 0, 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }

            private static final p.AccountOverviewViewState b(z1<p.AccountOverviewViewState> z1Var) {
                return z1Var.getValue();
            }

            private static final s.ProfileCardViewState c(z1<s.ProfileCardViewState> z1Var) {
                return z1Var.getValue();
            }

            private static final C3668a.AddressesCardViewState d(z1<C3668a.AddressesCardViewState> z1Var) {
                return z1Var.getValue();
            }

            private static final o.PaymentsCardViewState e(z1<o.PaymentsCardViewState> z1Var) {
                return z1Var.getValue();
            }

            private static final e.CommunicationsCardViewState f(z1<e.CommunicationsCardViewState> z1Var) {
                return z1Var.getValue();
            }

            private static final A.YourMeijerStoreCardViewState g(z1<A.YourMeijerStoreCardViewState> z1Var) {
                return z1Var.getValue();
            }

            private static final OrdersCardViewState k(z1<OrdersCardViewState> z1Var) {
                return z1Var.getValue();
            }

            private static final SubscriptionCardViewState l(z1<SubscriptionCardViewState> z1Var) {
                return z1Var.getValue();
            }
        }

        a() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(973042189, i10, -1, "com.meijer.mobile.accounts.ux.basescreen.AccountOverviewActivity.onCreate.<anonymous> (AccountOverviewActivity.kt:105)");
            }
            Ji.K.b(null, ComposableLambdaKt.c(2052810908, true, new C1321a(AccountOverviewActivity.this), composer, 54), composer, 48, 1);
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
    public static final class b extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f94209f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f94209f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f94209f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f94210f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f94210f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f94210f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f94211f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f94212g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f94211f = function0;
            this.f94212g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f94211f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f94212g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f94213f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f94213f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f94213f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f94214f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f94214f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f94214f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f94215f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f94216g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f94215f = function0;
            this.f94216g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f94215f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f94216g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class h extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f94217f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f94217f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f94217f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class i extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f94218f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f94218f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f94218f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class j extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f94219f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f94220g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f94219f = function0;
            this.f94220g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f94219f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f94220g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class k extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f94221f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentActivity componentActivity) {
            super(0);
            this.f94221f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f94221f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class l extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f94222f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentActivity componentActivity) {
            super(0);
            this.f94222f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f94222f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class m extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f94223f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentActivity componentActivity) {
            super(0);
            this.f94223f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f94223f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class n extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f94224f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f94225g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f94224f = function0;
            this.f94225g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f94224f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f94225g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class o extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f94226f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ComponentActivity componentActivity) {
            super(0);
            this.f94226f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f94226f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class p extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f94227f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ComponentActivity componentActivity) {
            super(0);
            this.f94227f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f94227f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class q extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f94228f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f94229g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f94228f = function0;
            this.f94229g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f94228f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f94229g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class r extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f94230f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(ComponentActivity componentActivity) {
            super(0);
            this.f94230f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f94230f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class s extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f94231f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f94232g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f94231f = function0;
            this.f94232g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f94231f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f94232g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class t extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f94233f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(ComponentActivity componentActivity) {
            super(0);
            this.f94233f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f94233f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class u extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f94234f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(ComponentActivity componentActivity) {
            super(0);
            this.f94234f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f94234f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class v extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f94235f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f94236g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f94235f = function0;
            this.f94236g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f94235f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f94236g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class w extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f94237f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(ComponentActivity componentActivity) {
            super(0);
            this.f94237f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f94237f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class x extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f94238f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(ComponentActivity componentActivity) {
            super(0);
            this.f94238f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f94238f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class y extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f94239f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f94240g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f94239f = function0;
            this.f94240g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f94239f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f94240g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C3668a I1() {
        return (C3668a) this.addressesCardViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Hh.e J1() {
        return (Hh.e) this.communicationsCardViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Hh.i L1() {
        return (Hh.i) this.ordersCardViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Hh.o M1() {
        return (Hh.o) this.paymentsCardViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Hh.s N1() {
        return (Hh.s) this.profileCardViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Hh.w O1() {
        return (Hh.w) this.subscriptionCardViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.meijer.mobile.accounts.ux.basescreen.p P1() {
        return (com.meijer.mobile.accounts.ux.basescreen.p) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Hh.A Q1() {
        return (Hh.A) this.yourMeijerStoreCardViewModel.getValue();
    }

    private final String R1(boolean isChip) {
        return isChip ? "accounts:carousel" : "accounts:cards";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T1(AccountOverviewActivity accountOverviewActivity, boolean z10, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        track.n("Account Overview");
        track.p(accountOverviewActivity.R1(z10));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V1(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        track.n("Account Overview");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z1(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        track.n("Account Overview");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a2(Fh.a accountNavigationRequest) {
        if (accountNavigationRequest instanceof a.q) {
            onResume();
            return;
        }
        if (accountNavigationRequest instanceof a.Profile) {
            a.Profile profile = (a.Profile) accountNavigationRequest;
            h2(profile.getIsChip(), profile.getIsEditBasicInfo());
            return;
        }
        if (accountNavigationRequest instanceof a.Preferences) {
            f2(((a.Preferences) accountNavigationRequest).getIsChip());
            return;
        }
        if (accountNavigationRequest instanceof a.Orders) {
            b2(((a.Orders) accountNavigationRequest).getIsChip());
            return;
        }
        if (accountNavigationRequest instanceof a.Payments) {
            d2(((a.Payments) accountNavigationRequest).getIsChip());
            return;
        }
        if (accountNavigationRequest instanceof a.Addresses) {
            S1(((a.Addresses) accountNavigationRequest).getIsChip());
            return;
        }
        if (accountNavigationRequest instanceof a.NavigateToStoreDetails) {
            a.NavigateToStoreDetails navigateToStoreDetails = (a.NavigateToStoreDetails) accountNavigationRequest;
            q2(navigateToStoreDetails.getStoreId(), navigateToStoreDetails.getStoreName());
            return;
        }
        if (accountNavigationRequest instanceof a.NavigateToOrderDetails) {
            o2(((a.NavigateToOrderDetails) accountNavigationRequest).getOrderId());
            return;
        }
        if (accountNavigationRequest instanceof a.v) {
            n2();
            return;
        }
        if (Intrinsics.e(accountNavigationRequest, a.g.f10418a)) {
            m2();
            return;
        }
        if (Intrinsics.e(accountNavigationRequest, a.t.f10433a)) {
            k2();
            return;
        }
        if (Intrinsics.e(accountNavigationRequest, a.b.f10413a)) {
            U1();
        } else if (Intrinsics.e(accountNavigationRequest, a.f.f10417a)) {
            X1();
        } else if (Intrinsics.e(accountNavigationRequest, a.k.f10423a)) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c2(AccountOverviewActivity accountOverviewActivity, boolean z10, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        track.n("Account Overview");
        track.p(accountOverviewActivity.R1(z10));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e2(AccountOverviewActivity accountOverviewActivity, boolean z10, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        track.n("Account Overview");
        track.p(accountOverviewActivity.R1(z10));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g2(AccountOverviewActivity accountOverviewActivity, boolean z10, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        track.n("Account Overview");
        track.p(accountOverviewActivity.R1(z10));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i2(AccountOverviewActivity accountOverviewActivity, boolean z10, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        track.n("Account Overview");
        track.p(accountOverviewActivity.R1(z10));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j2(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        track.n("Account Overview");
        track.m(TrackingData.a.b.f135065a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l2(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        track.n("Account Overview");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p2(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        track.n("Account Overview");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r2(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        track.n("Account Overview");
        return Unit.f142422a;
    }

    public final Cl.e K1() {
        Cl.e eVar = this.meijerDeepLinkParser;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.y("meijerDeepLinkParser");
        return null;
    }

    public final InterfaceC14261a getAnalyticsEngine() {
        InterfaceC14261a interfaceC14261a = this.analyticsEngine;
        if (interfaceC14261a != null) {
            return interfaceC14261a;
        }
        Intrinsics.y("analyticsEngine");
        return null;
    }

    public final yl.k getFeatureManager() {
        yl.k kVar = this.featureManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.y("featureManager");
        return null;
    }

    private final void S1(final boolean isChip) {
        getAnalyticsEngine().h(C14476c.a("account: account overview: view addresses"), new Function1() { // from class: com.meijer.mobile.accounts.ux.basescreen.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountOverviewActivity.T1(this.f94292a, isChip, (TrackingData) obj);
            }
        });
        startActivity(Al.a.f661a.a(this));
        bk.c.b(this, 0, Fh.c.f10438a, Al.m.f674a, 0, 8, null);
    }

    private final void U1() {
        try {
            getAnalyticsEngine().h(C14476c.a("account: account overview: customer care phone link"), new Function1() { // from class: com.meijer.mobile.accounts.ux.basescreen.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AccountOverviewActivity.V1((TrackingData) obj);
                }
            });
            Cl.e eVarK1 = K1();
            String string = getString(Fh.h.f10569N4);
            Intrinsics.i(string, "getString(...)");
            startActivity(eVarK1.N(string));
        } catch (ActivityNotFoundException unused) {
            new C14886b(this, Bj.p.f3057a).setCancelable(false).setMessage(Fh.h.f10720j1).setPositiveButton(getString(Fh.h.f10826y2), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.accounts.ux.basescreen.j
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    AccountOverviewActivity.W1(dialogInterface, i10);
                }
            }).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W1(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    private final void X1() {
        try {
            getAnalyticsEngine().h(C14476c.a("account: account overview: customer care email link"), new Function1() { // from class: com.meijer.mobile.accounts.ux.basescreen.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AccountOverviewActivity.Z1((TrackingData) obj);
                }
            });
            startActivity(K1().J(this));
        } catch (ActivityNotFoundException unused) {
            new C14886b(this, Bj.p.f3057a).setCancelable(false).setMessage(Fh.h.f10713i1).setPositiveButton(getString(Fh.h.f10826y2), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.accounts.ux.basescreen.f
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    AccountOverviewActivity.Y1(dialogInterface, i10);
                }
            }).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y1(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    private final void b2(final boolean isChip) {
        getAnalyticsEngine().h(C14476c.a("account: account overview: view orders"), new Function1() { // from class: com.meijer.mobile.accounts.ux.basescreen.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountOverviewActivity.c2(this.f94290a, isChip, (TrackingData) obj);
            }
        });
        startActivity(Al.l.f(Al.l.f673a, this, false, 2, null));
    }

    private final void d2(final boolean isChip) {
        getAnalyticsEngine().h(C14476c.a("account: account overview: view payment methods"), new Function1() { // from class: com.meijer.mobile.accounts.ux.basescreen.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountOverviewActivity.e2(this.f94286a, isChip, (TrackingData) obj);
            }
        });
        startActivity(Al.a.f661a.b(this));
    }

    private final void f2(final boolean isChip) {
        getAnalyticsEngine().h(C14476c.a("account: account overview: view communications"), new Function1() { // from class: com.meijer.mobile.accounts.ux.basescreen.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountOverviewActivity.g2(this.f94294a, isChip, (TrackingData) obj);
            }
        });
        startActivity(Al.a.f661a.i(this));
        bk.c.b(this, 0, Fh.c.f10438a, Al.m.f674a, 0, 8, null);
    }

    private final void h2(final boolean isChip, boolean isEditBasicInfo) {
        getAnalyticsEngine().h(C14476c.a("account: account overview: view profile"), new Function1() { // from class: com.meijer.mobile.accounts.ux.basescreen.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountOverviewActivity.i2(this.f94288a, isChip, (TrackingData) obj);
            }
        });
        startActivity(Al.a.e(Al.a.f661a, this, false, isEditBasicInfo, 2, null));
        bk.c.b(this, 0, Fh.c.f10438a, Al.m.f674a, 0, 8, null);
    }

    private final void k2() {
        getAnalyticsEngine().h(C14476c.a("account: account overview: sign out"), new Function1() { // from class: com.meijer.mobile.accounts.ux.basescreen.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountOverviewActivity.l2((TrackingData) obj);
            }
        });
        startActivity(Al.k.f(Al.k.f672a, this, false, 2, null));
    }

    private final void m2() {
        startActivity(K1().p(this, true));
    }

    private final void n2() {
        startActivity(K1().H());
    }

    private final void o2(String orderId) {
        getAnalyticsEngine().h(C14476c.a("account: account overview: view active order"), new Function1() { // from class: com.meijer.mobile.accounts.ux.basescreen.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountOverviewActivity.p2((TrackingData) obj);
            }
        });
        startActivity(Al.l.b(Al.l.f673a, this, orderId, null, null, 12, null));
    }

    private final void q2(int storeId, String storeName) {
        getAnalyticsEngine().h(C14476c.a("account: account overview: view store details"), new Function1() { // from class: com.meijer.mobile.accounts.ux.basescreen.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountOverviewActivity.r2((TrackingData) obj);
            }
        });
        startActivity(Al.s.d(this, storeId, storeName, ok.i.f153984b, false, 16, null));
    }

    @Override // com.meijer.mobile.accounts.ux.basescreen.Hilt_AccountOverviewActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(973042189, true, new a()), 1, null);
    }

    @Override // android.app.Activity
    protected void onResume() {
        boolean z10;
        super.onResume();
        getAnalyticsEngine().h(C14476c.h("account: overview"), new Function1() { // from class: com.meijer.mobile.accounts.ux.basescreen.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountOverviewActivity.j2((TrackingData) obj);
            }
        });
        N1().q();
        I1().p();
        M1().p();
        Hh.e eVarJ1 = J1();
        if (Z1.b.a(this, "android.permission.POST_NOTIFICATIONS") == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        eVarJ1.o(z10);
        if (getFeatureManager().e(AbstractC18227f.Z.f170565h)) {
            O1().q();
        }
        if (getFeatureManager().e(AbstractC18227f.C18229b.f170568h)) {
            Q1().q();
            L1().t();
        }
    }
}
