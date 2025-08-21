package com.meijer.mobile.accounts.ux.basescreen;

import Gh.a;
import Ih.A;
import Ih.C3834a;
import Ih.OrdersCardViewState;
import Ih.e;
import Ih.o;
import Ih.s;
import Ki.LocalThemeScope;
import Lh.C4085s;
import V2.CreationExtras;
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
import bk.AbstractC6392a;
import ci.SubscriptionCardViewState;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.accounts.ux.basescreen.p;
import e.C13737e;
import hi.InterfaceC14523a;
import ii.C14756c;
import ii.TrackingData;
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
import le.C15485b;
import yr.C18370z;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J#\u0010\u0010\u001a\u00020\u00062\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001e\u0010\u001bJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010\u0003J\u000f\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\u0003J\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\"\u0010#J\u0019\u0010&\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010$H\u0014¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0006H\u0014¢\u0006\u0004\b(\u0010\u0003R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001b\u0010F\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001b\u0010K\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010C\u001a\u0004\bI\u0010JR\u001b\u0010P\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010C\u001a\u0004\bN\u0010OR\u001b\u0010U\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010C\u001a\u0004\bS\u0010TR\u001b\u0010Z\u001a\u00020V8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010C\u001a\u0004\bX\u0010YR\u001b\u0010_\u001a\u00020[8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010C\u001a\u0004\b]\u0010^R\u001b\u0010d\u001a\u00020`8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u0010C\u001a\u0004\bb\u0010cR\u001b\u0010i\u001a\u00020e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010C\u001a\u0004\bg\u0010h¨\u0006z²\u0006\f\u0010k\u001a\u00020j8\nX\u008a\u0084\u0002²\u0006\f\u0010m\u001a\u00020l8\nX\u008a\u0084\u0002²\u0006\f\u0010o\u001a\u00020n8\nX\u008a\u0084\u0002²\u0006\f\u0010q\u001a\u00020p8\nX\u008a\u0084\u0002²\u0006\f\u0010s\u001a\u00020r8\nX\u008a\u0084\u0002²\u0006\f\u0010u\u001a\u00020t8\nX\u008a\u0084\u0002²\u0006\f\u0010w\u001a\u00020v8\nX\u008a\u0084\u0002²\u0006\f\u0010y\u001a\u00020x8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/accounts/ux/basescreen/AccountOverviewActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "LGh/a;", "accountNavigationRequest", "", "a2", "(LGh/a;)V", "n2", "m2", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "", "storeName", "q2", "(ILjava/lang/String;)V", "orderId", "o2", "(Ljava/lang/String;)V", "", "isChip", "isEditBasicInfo", "h2", "(ZZ)V", "f2", "(Z)V", "b2", "d2", "S1", "k2", "X1", "U1", "R1", "(Z)Ljava/lang/String;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "Lhi/a;", "v", "Lhi/a;", "getAnalyticsEngine", "()Lhi/a;", "setAnalyticsEngine", "(Lhi/a;)V", "analyticsEngine", "Lzl/k;", "w", "Lzl/k;", "getFeatureManager", "()Lzl/k;", "setFeatureManager", "(Lzl/k;)V", "featureManager", "LDl/e;", "x", "LDl/e;", "K1", "()LDl/e;", "setMeijerDeepLinkParser", "(LDl/e;)V", "meijerDeepLinkParser", "Lcom/meijer/mobile/accounts/ux/basescreen/p;", "y", "Lkotlin/Lazy;", "P1", "()Lcom/meijer/mobile/accounts/ux/basescreen/p;", "viewModel", "LIh/s;", "z", "N1", "()LIh/s;", "profileCardViewModel", "LIh/a;", "A", "I1", "()LIh/a;", "addressesCardViewModel", "LIh/o;", "B", "M1", "()LIh/o;", "paymentsCardViewModel", "LIh/e;", "C", "J1", "()LIh/e;", "communicationsCardViewModel", "LIh/A;", "D", "Q1", "()LIh/A;", "yourMeijerStoreCardViewModel", "LIh/i;", "E", "L1", "()LIh/i;", "ordersCardViewModel", "LIh/w;", "F", "O1", "()LIh/w;", "subscriptionCardViewModel", "Lcom/meijer/mobile/accounts/ux/basescreen/p$a;", "accountOverviewViewState", "LIh/s$b;", "profileCardViewState", "LIh/a$a;", "addressesCardViewState", "LIh/o$a;", "paymentsCardViewState", "LIh/e$a;", "communicationsCardViewState", "LIh/A$a;", "yourMeijerStoreCardViewState", "LIh/n;", "ordersCardViewState", "Lci/a;", "subscriptionCardViewState", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class AccountOverviewActivity extends Hilt_AccountOverviewActivity {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public InterfaceC14523a analyticsEngine;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public zl.k featureManager;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public Dl.e meijerDeepLinkParser;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e0(Reflection.b(com.meijer.mobile.accounts.ux.basescreen.p.class), new r(this), new l(this), new s(null, this));

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final Lazy profileCardViewModel = new e0(Reflection.b(Ih.s.class), new u(this), new t(this), new v(null, this));

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final Lazy addressesCardViewModel = new e0(Reflection.b(C3834a.class), new x(this), new w(this), new y(null, this));

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final Lazy paymentsCardViewModel = new e0(Reflection.b(Ih.o.class), new c(this), new b(this), new d(null, this));

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final Lazy communicationsCardViewModel = new e0(Reflection.b(Ih.e.class), new f(this), new e(this), new g(null, this));

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final Lazy yourMeijerStoreCardViewModel = new e0(Reflection.b(Ih.A.class), new i(this), new h(this), new j(null, this));

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final Lazy ordersCardViewModel = new e0(Reflection.b(Ih.i.class), new m(this), new k(this), new n(null, this));

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final Lazy subscriptionCardViewModel = new e0(Reflection.b(Ih.w.class), new p(this), new o(this), new q(null, this));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.accounts.ux.basescreen.AccountOverviewActivity$a$a, reason: collision with other inner class name */
        static final class C1330a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AccountOverviewActivity f95053a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.accounts.ux.basescreen.AccountOverviewActivity$a$a$a, reason: collision with other inner class name */
            /* synthetic */ class C1331a extends FunctionReferenceImpl implements Function1<Gh.a, Unit> {
                C1331a(Object obj) {
                    super(1, obj, AccountOverviewActivity.class, "onNavigationRequest", "onNavigationRequest(Lcom/meijer/mobile/accounts/ux/AccountNavigationRequest;)V", 0);
                }

                public final void a(Gh.a p02) {
                    Intrinsics.j(p02, "p0");
                    ((AccountOverviewActivity) this.receiver).a2(p02);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Gh.a aVar) {
                    a(aVar);
                    return Unit.f143329a;
                }
            }

            C1330a(AccountOverviewActivity accountOverviewActivity) {
                this.f95053a = accountOverviewActivity;
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
                z1 z1VarC = S2.a.c(this.f95053a.P1().m(), null, null, null, composer, 0, 7);
                z1 z1VarC2 = S2.a.c(this.f95053a.N1().r(), null, null, null, composer, 0, 7);
                z1 z1VarC3 = S2.a.c(this.f95053a.I1().r(), null, null, null, composer, 0, 7);
                z1 z1VarC4 = S2.a.c(this.f95053a.M1().r(), null, null, null, composer, 0, 7);
                z1 z1VarC5 = S2.a.c(this.f95053a.J1().p(), null, null, null, composer, 0, 7);
                z1 z1VarC6 = S2.a.c(this.f95053a.Q1().r(), null, null, null, composer, 0, 7);
                z1 z1VarC7 = S2.a.c(this.f95053a.L1().u(), null, null, null, composer, 0, 7);
                z1 z1VarC8 = S2.a.c(this.f95053a.O1().r(), null, null, null, composer, 0, 7);
                p.AccountOverviewViewState accountOverviewViewStateB = b(z1VarC);
                s.ProfileCardViewState profileCardViewStateC = c(z1VarC2);
                C3834a.AddressesCardViewState addressesCardViewStateD = d(z1VarC3);
                o.PaymentsCardViewState paymentsCardViewStateE = e(z1VarC4);
                e.CommunicationsCardViewState communicationsCardViewStateF = f(z1VarC5);
                OrdersCardViewState ordersCardViewStateK = k(z1VarC7);
                A.YourMeijerStoreCardViewState yourMeijerStoreCardViewStateG = g(z1VarC6);
                SubscriptionCardViewState subscriptionCardViewStateL = l(z1VarC8);
                boolean zE = this.f95053a.getFeatureManager().e(AbstractC18503f.C18505b.f172868h);
                boolean zE2 = this.f95053a.getFeatureManager().e(AbstractC18503f.Z.f172865h);
                Modifier modifierC = C18370z.c(FullStoryAnnotationsKt.fsUnmask(androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null)), false, 1, null);
                AccountOverviewActivity accountOverviewActivity = this.f95053a;
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(accountOverviewActivity);
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new C1331a(accountOverviewActivity);
                    composer.t(objB);
                }
                composer.P();
                int i12 = LocalThemeScope.f17314g | (i11 & 14);
                int i13 = AbstractC6392a.f60445b;
                C4085s.b(AdsTheme, accountOverviewViewStateB, profileCardViewStateC, addressesCardViewStateD, paymentsCardViewStateE, communicationsCardViewStateF, yourMeijerStoreCardViewStateG, ordersCardViewStateK, subscriptionCardViewStateL, zE, zE2, modifierC, (Function1) ((KFunction) objB), composer, i12 | (i13 << 6) | (i13 << 9) | (i13 << 12) | (i13 << 15), 0, 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }

            private static final p.AccountOverviewViewState b(z1<p.AccountOverviewViewState> z1Var) {
                return z1Var.getValue();
            }

            private static final s.ProfileCardViewState c(z1<s.ProfileCardViewState> z1Var) {
                return z1Var.getValue();
            }

            private static final C3834a.AddressesCardViewState d(z1<C3834a.AddressesCardViewState> z1Var) {
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
            Ki.K.b(null, ComposableLambdaKt.c(2052810908, true, new C1330a(AccountOverviewActivity.this), composer, 54), composer, 48, 1);
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
    public static final class b extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f95054f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f95054f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f95054f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f95055f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f95055f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f95055f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f95056f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f95057g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f95056f = function0;
            this.f95057g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f95056f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f95057g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f95058f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f95058f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f95058f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f95059f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f95059f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f95059f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f95060f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f95061g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f95060f = function0;
            this.f95061g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f95060f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f95061g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class h extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f95062f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f95062f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f95062f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class i extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f95063f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f95063f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f95063f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class j extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f95064f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f95065g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f95064f = function0;
            this.f95065g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f95064f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f95065g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class k extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f95066f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentActivity componentActivity) {
            super(0);
            this.f95066f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f95066f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class l extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f95067f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentActivity componentActivity) {
            super(0);
            this.f95067f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f95067f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class m extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f95068f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentActivity componentActivity) {
            super(0);
            this.f95068f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f95068f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class n extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f95069f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f95070g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f95069f = function0;
            this.f95070g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f95069f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f95070g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class o extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f95071f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ComponentActivity componentActivity) {
            super(0);
            this.f95071f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f95071f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class p extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f95072f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ComponentActivity componentActivity) {
            super(0);
            this.f95072f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f95072f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class q extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f95073f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f95074g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f95073f = function0;
            this.f95074g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f95073f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f95074g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class r extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f95075f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(ComponentActivity componentActivity) {
            super(0);
            this.f95075f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f95075f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class s extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f95076f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f95077g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f95076f = function0;
            this.f95077g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f95076f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f95077g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class t extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f95078f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(ComponentActivity componentActivity) {
            super(0);
            this.f95078f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f95078f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class u extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f95079f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(ComponentActivity componentActivity) {
            super(0);
            this.f95079f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f95079f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class v extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f95080f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f95081g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f95080f = function0;
            this.f95081g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f95080f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f95081g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class w extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f95082f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(ComponentActivity componentActivity) {
            super(0);
            this.f95082f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f95082f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class x extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f95083f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(ComponentActivity componentActivity) {
            super(0);
            this.f95083f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f95083f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class y extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f95084f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f95085g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f95084f = function0;
            this.f95085g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f95084f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f95085g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C3834a I1() {
        return (C3834a) this.addressesCardViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Ih.e J1() {
        return (Ih.e) this.communicationsCardViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Ih.i L1() {
        return (Ih.i) this.ordersCardViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Ih.o M1() {
        return (Ih.o) this.paymentsCardViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Ih.s N1() {
        return (Ih.s) this.profileCardViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Ih.w O1() {
        return (Ih.w) this.subscriptionCardViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.meijer.mobile.accounts.ux.basescreen.p P1() {
        return (com.meijer.mobile.accounts.ux.basescreen.p) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Ih.A Q1() {
        return (Ih.A) this.yourMeijerStoreCardViewModel.getValue();
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
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V1(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        track.n("Account Overview");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z1(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        track.n("Account Overview");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a2(Gh.a accountNavigationRequest) {
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
        if (Intrinsics.e(accountNavigationRequest, a.g.f12609a)) {
            m2();
            return;
        }
        if (Intrinsics.e(accountNavigationRequest, a.t.f12624a)) {
            k2();
            return;
        }
        if (Intrinsics.e(accountNavigationRequest, a.b.f12604a)) {
            U1();
        } else if (Intrinsics.e(accountNavigationRequest, a.f.f12608a)) {
            X1();
        } else if (Intrinsics.e(accountNavigationRequest, a.k.f12614a)) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c2(AccountOverviewActivity accountOverviewActivity, boolean z10, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        track.n("Account Overview");
        track.p(accountOverviewActivity.R1(z10));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e2(AccountOverviewActivity accountOverviewActivity, boolean z10, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        track.n("Account Overview");
        track.p(accountOverviewActivity.R1(z10));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g2(AccountOverviewActivity accountOverviewActivity, boolean z10, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        track.n("Account Overview");
        track.p(accountOverviewActivity.R1(z10));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i2(AccountOverviewActivity accountOverviewActivity, boolean z10, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        track.n("Account Overview");
        track.p(accountOverviewActivity.R1(z10));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j2(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        track.n("Account Overview");
        track.m(TrackingData.a.b.f137705a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l2(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        track.n("Account Overview");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p2(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        track.n("Account Overview");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r2(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        track.n("Account Overview");
        return Unit.f143329a;
    }

    public final Dl.e K1() {
        Dl.e eVar = this.meijerDeepLinkParser;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.x("meijerDeepLinkParser");
        return null;
    }

    public final InterfaceC14523a getAnalyticsEngine() {
        InterfaceC14523a interfaceC14523a = this.analyticsEngine;
        if (interfaceC14523a != null) {
            return interfaceC14523a;
        }
        Intrinsics.x("analyticsEngine");
        return null;
    }

    public final zl.k getFeatureManager() {
        zl.k kVar = this.featureManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.x("featureManager");
        return null;
    }

    private final void S1(final boolean isChip) {
        getAnalyticsEngine().b(C14756c.a("account: account overview: view addresses"), new Function1() { // from class: com.meijer.mobile.accounts.ux.basescreen.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountOverviewActivity.T1(this.f95137a, isChip, (TrackingData) obj);
            }
        });
        startActivity(Bl.a.f3119a.a(this));
        ck.c.b(this, 0, Gh.c.f12629a, Bl.m.f3132a, 0, 8, null);
    }

    private final void U1() {
        try {
            getAnalyticsEngine().b(C14756c.a("account: account overview: customer care phone link"), new Function1() { // from class: com.meijer.mobile.accounts.ux.basescreen.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AccountOverviewActivity.V1((TrackingData) obj);
                }
            });
            Dl.e eVarK1 = K1();
            String string = getString(Gh.h.f12760N4);
            Intrinsics.i(string, "getString(...)");
            startActivity(eVarK1.N(string));
        } catch (ActivityNotFoundException unused) {
            new C15485b(this, Cj.p.f5102a).setCancelable(false).setMessage(Gh.h.f12911j1).setPositiveButton(getString(Gh.h.f13017y2), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.accounts.ux.basescreen.j
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
            getAnalyticsEngine().b(C14756c.a("account: account overview: customer care email link"), new Function1() { // from class: com.meijer.mobile.accounts.ux.basescreen.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AccountOverviewActivity.Z1((TrackingData) obj);
                }
            });
            startActivity(K1().J(this));
        } catch (ActivityNotFoundException unused) {
            new C15485b(this, Cj.p.f5102a).setCancelable(false).setMessage(Gh.h.f12904i1).setPositiveButton(getString(Gh.h.f13017y2), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.accounts.ux.basescreen.f
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
        getAnalyticsEngine().b(C14756c.a("account: account overview: view orders"), new Function1() { // from class: com.meijer.mobile.accounts.ux.basescreen.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountOverviewActivity.c2(this.f95135a, isChip, (TrackingData) obj);
            }
        });
        startActivity(Bl.l.f(Bl.l.f3131a, this, false, 2, null));
    }

    private final void d2(final boolean isChip) {
        getAnalyticsEngine().b(C14756c.a("account: account overview: view payment methods"), new Function1() { // from class: com.meijer.mobile.accounts.ux.basescreen.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountOverviewActivity.e2(this.f95131a, isChip, (TrackingData) obj);
            }
        });
        startActivity(Bl.a.f3119a.b(this));
    }

    private final void f2(final boolean isChip) {
        getAnalyticsEngine().b(C14756c.a("account: account overview: view communications"), new Function1() { // from class: com.meijer.mobile.accounts.ux.basescreen.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountOverviewActivity.g2(this.f95139a, isChip, (TrackingData) obj);
            }
        });
        startActivity(Bl.a.f3119a.i(this));
        ck.c.b(this, 0, Gh.c.f12629a, Bl.m.f3132a, 0, 8, null);
    }

    private final void h2(final boolean isChip, boolean isEditBasicInfo) {
        getAnalyticsEngine().b(C14756c.a("account: account overview: view profile"), new Function1() { // from class: com.meijer.mobile.accounts.ux.basescreen.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountOverviewActivity.i2(this.f95133a, isChip, (TrackingData) obj);
            }
        });
        startActivity(Bl.a.e(Bl.a.f3119a, this, false, isEditBasicInfo, 2, null));
        ck.c.b(this, 0, Gh.c.f12629a, Bl.m.f3132a, 0, 8, null);
    }

    private final void k2() {
        getAnalyticsEngine().b(C14756c.a("account: account overview: sign out"), new Function1() { // from class: com.meijer.mobile.accounts.ux.basescreen.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountOverviewActivity.l2((TrackingData) obj);
            }
        });
        startActivity(Bl.k.f(Bl.k.f3130a, this, false, 2, null));
    }

    private final void m2() {
        startActivity(K1().p(this, true));
    }

    private final void n2() {
        startActivity(K1().H());
    }

    private final void o2(String orderId) {
        getAnalyticsEngine().b(C14756c.a("account: account overview: view active order"), new Function1() { // from class: com.meijer.mobile.accounts.ux.basescreen.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountOverviewActivity.p2((TrackingData) obj);
            }
        });
        startActivity(Bl.l.b(Bl.l.f3131a, this, orderId, null, null, 12, null));
    }

    private final void q2(int storeId, String storeName) {
        getAnalyticsEngine().b(C14756c.a("account: account overview: view store details"), new Function1() { // from class: com.meijer.mobile.accounts.ux.basescreen.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountOverviewActivity.r2((TrackingData) obj);
            }
        });
        startActivity(Bl.s.d(this, storeId, storeName, pk.i.f156744b, false, 16, null));
    }

    @Override // com.meijer.mobile.accounts.ux.basescreen.Hilt_AccountOverviewActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(973042189, true, new a()), 1, null);
    }

    @Override // android.app.Activity
    protected void onResume() {
        boolean z10;
        super.onResume();
        getAnalyticsEngine().b(C14756c.h("account: overview"), new Function1() { // from class: com.meijer.mobile.accounts.ux.basescreen.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountOverviewActivity.j2((TrackingData) obj);
            }
        });
        N1().q();
        I1().p();
        M1().p();
        Ih.e eVarJ1 = J1();
        if (Z1.b.a(this, "android.permission.POST_NOTIFICATIONS") == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        eVarJ1.o(z10);
        if (getFeatureManager().e(AbstractC18503f.Z.f172865h)) {
            O1().q();
        }
        if (getFeatureManager().e(AbstractC18503f.C18505b.f172868h)) {
            Q1().q();
            L1().t();
        }
    }
}
