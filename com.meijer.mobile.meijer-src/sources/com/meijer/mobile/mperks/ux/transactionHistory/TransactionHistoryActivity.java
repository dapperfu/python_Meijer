package com.meijer.mobile.mperks.ux.transactionHistory;

import Ki.LocalThemeScope;
import V2.CreationExtras;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import co.AbstractC6536h;
import co.AbstractC6537i;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.mperks.ux.transactionHistory.AbstractC12810b;
import com.meijer.mobile.mperks.ux.transactionHistory.TransactionHistoryActivity;
import e.C13737e;
import j0.C14903g;
import j0.InterfaceC14882C;
import kotlin.C17987a1;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0013²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0012\u001a\u00020\u00118\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/mperks/ux/transactionHistory/TransactionHistoryActivity;", "Lcom/meijer/mobile/mperks/ux/MperksFeatureActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/meijer/mobile/mperks/ux/transactionHistory/D;", "D", "Lkotlin/Lazy;", "y1", "()Lcom/meijer/mobile/mperks/ux/transactionHistory/D;", "transactionHistoryViewModel", "Lcom/meijer/mobile/mperks/ux/transactionHistory/H;", "transactionState", "Lcom/meijer/mobile/mperks/ux/transactionHistory/a;", "pointBalanceState", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class TransactionHistoryActivity extends Hilt_TransactionHistoryActivity {

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final Lazy transactionHistoryViewModel = new e0(Reflection.b(D.class), new c(this), new b(this), new d(null, this));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.mperks.ux.transactionHistory.TransactionHistoryActivity$a$a, reason: collision with other inner class name */
        static final class C1826a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ TransactionHistoryActivity f115661a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.mperks.ux.transactionHistory.TransactionHistoryActivity$a$a$a, reason: collision with other inner class name */
            static final class C1827a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f115662a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ TransactionHistoryActivity f115663b;

                C1827a(LocalThemeScope localThemeScope, TransactionHistoryActivity transactionHistoryActivity) {
                    this.f115662a = localThemeScope;
                    this.f115663b = transactionHistoryActivity;
                }

                public final void b(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1512718342, i10, -1, "com.meijer.mobile.mperks.ux.transactionHistory.TransactionHistoryActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (TransactionHistoryActivity.kt:38)");
                    }
                    LocalThemeScope localThemeScope = this.f115662a;
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f115663b);
                    final TransactionHistoryActivity transactionHistoryActivity = this.f115663b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.mperks.ux.transactionHistory.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return TransactionHistoryActivity.a.C1826a.C1827a.c(transactionHistoryActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    z.K(localThemeScope, null, (Function0) objB, composer, LocalThemeScope.f17314g, 1);
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
                public static final Unit c(TransactionHistoryActivity transactionHistoryActivity) {
                    transactionHistoryActivity.finish();
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.mperks.ux.transactionHistory.TransactionHistoryActivity$a$a$b */
            static final class b implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ TransactionHistoryActivity f115664a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f115665b;

                b(TransactionHistoryActivity transactionHistoryActivity, LocalThemeScope localThemeScope) {
                    this.f115664a = transactionHistoryActivity;
                    this.f115665b = localThemeScope;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit f(TransactionHistoryActivity transactionHistoryActivity, AbstractC6536h mPerksNavigationRequest) {
                    String orderNumber;
                    Intrinsics.j(mPerksNavigationRequest, "mPerksNavigationRequest");
                    if ((mPerksNavigationRequest instanceof AbstractC6536h.OnNavigateToOrderDetail) && (orderNumber = ((AbstractC6536h.OnNavigateToOrderDetail) mPerksNavigationRequest).getOrderNumber()) != null) {
                        transactionHistoryActivity.startActivity(Bl.l.b(Bl.l.f3131a, transactionHistoryActivity, orderNumber, null, null, 12, null));
                    }
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit g(TransactionHistoryActivity transactionHistoryActivity, AbstractC6537i action) {
                    Intrinsics.j(action, "action");
                    if (action instanceof AbstractC6537i.OnLoadMoreButtonClick) {
                        transactionHistoryActivity.y1().w(new AbstractC12810b.FetchTransactions(20, ((AbstractC6537i.OnLoadMoreButtonClick) action).getContinuationToken(), Boolean.TRUE));
                    } else if (action instanceof AbstractC6537i.c) {
                        transactionHistoryActivity.u1().l(false);
                    } else if (action instanceof AbstractC6537i.h) {
                        transactionHistoryActivity.startActivity(transactionHistoryActivity.t1().p(transactionHistoryActivity, true));
                    }
                    return Unit.f143329a;
                }

                public final void c(InterfaceC14882C paddingValues, Composer composer, int i10) throws Resources.NotFoundException {
                    Intrinsics.j(paddingValues, "paddingValues");
                    if ((i10 & 6) == 0) {
                        i10 |= composer.V(paddingValues) ? 4 : 2;
                    }
                    if ((i10 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1999245171, i10, -1, "com.meijer.mobile.mperks.ux.transactionHistory.TransactionHistoryActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (TransactionHistoryActivity.kt:41)");
                    }
                    z1 z1VarB = o1.b(this.f115664a.y1().v(), null, composer, 0, 1);
                    z1 z1VarB2 = o1.b(this.f115664a.y1().r(), null, composer, 0, 1);
                    Modifier modifierF = androidx.compose.foundation.layout.J.f(androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, paddingValues), 0.0f, 1, null);
                    LocalThemeScope localThemeScope = this.f115665b;
                    final TransactionHistoryActivity transactionHistoryActivity = this.f115664a;
                    MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
                    int iA = C5859f.a(composer, 0);
                    InterfaceC5884s interfaceC5884sR = composer.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composer, modifierF);
                    InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
                    Function0<InterfaceC5953g> function0A = companion.a();
                    if (composer.k() == null) {
                        C5859f.c();
                    }
                    composer.F();
                    if (composer.h()) {
                        composer.I(function0A);
                    } else {
                        composer.s();
                    }
                    Composer composerA = D1.a(composer);
                    D1.c(composerA, measurePolicyA, companion.e());
                    D1.c(composerA, interfaceC5884sR, companion.g());
                    Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
                    if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                        composerA.t(Integer.valueOf(iA));
                        composerA.n(Integer.valueOf(iA), function2B);
                    }
                    D1.c(composerA, modifierE, companion.f());
                    C14903g c14903g = C14903g.f139698a;
                    AbstractC12809a abstractC12809aE = e(z1VarB2);
                    int i11 = LocalThemeScope.f17314g;
                    z.w(localThemeScope, abstractC12809aE, composer, i11);
                    H hD = d(z1VarB);
                    boolean zH = transactionHistoryActivity.u1().H();
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(transactionHistoryActivity);
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: com.meijer.mobile.mperks.ux.transactionHistory.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TransactionHistoryActivity.a.C1826a.b.f(transactionHistoryActivity, (AbstractC6536h) obj);
                            }
                        };
                        composer.t(objB);
                    }
                    Function1 function1 = (Function1) objB;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean zD2 = composer.D(transactionHistoryActivity);
                    Object objB2 = composer.B();
                    if (zD2 || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function1() { // from class: com.meijer.mobile.mperks.ux.transactionHistory.e
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TransactionHistoryActivity.a.C1826a.b.g(transactionHistoryActivity, (AbstractC6537i) obj);
                            }
                        };
                        composer.t(objB2);
                    }
                    composer.P();
                    z.y(localThemeScope, hD, zH, function1, (Function1) objB2, composer, i11);
                    composer.v();
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) throws Resources.NotFoundException {
                    c(interfaceC14882C, composer, num.intValue());
                    return Unit.f143329a;
                }

                private static final H d(z1<? extends H> z1Var) {
                    return z1Var.getValue();
                }

                private static final AbstractC12809a e(z1<? extends AbstractC12809a> z1Var) {
                    return z1Var.getValue();
                }
            }

            C1826a(TransactionHistoryActivity transactionHistoryActivity) {
                this.f115661a = transactionHistoryActivity;
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
                    ComposerKt.U(-971395659, i11, -1, "com.meijer.mobile.mperks.ux.transactionHistory.TransactionHistoryActivity.onCreate.<anonymous>.<anonymous> (TransactionHistoryActivity.kt:36)");
                }
                C17987a1.a(FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), null, ComposableLambdaKt.c(-1512718342, true, new C1827a(AdsTheme, this.f115661a), composer, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(1999245171, true, new b(this.f115661a, AdsTheme), composer, 54), composer, 384, 12582912, 131066);
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

        a() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(315495846, i10, -1, "com.meijer.mobile.mperks.ux.transactionHistory.TransactionHistoryActivity.onCreate.<anonymous> (TransactionHistoryActivity.kt:35)");
            }
            Ki.K.b(null, ComposableLambdaKt.c(-971395659, true, new C1826a(TransactionHistoryActivity.this), composer, 54), composer, 48, 1);
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
        final /* synthetic */ ComponentActivity f115666f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f115666f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f115666f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f115667f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f115667f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f115667f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f115668f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f115669g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f115668f = function0;
            this.f115669g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f115668f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f115669g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final D y1() {
        return (D) this.transactionHistoryViewModel.getValue();
    }

    @Override // com.meijer.mobile.mperks.ux.Hilt_MperksFeatureActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(315495846, true, new a()), 1, null);
    }
}
