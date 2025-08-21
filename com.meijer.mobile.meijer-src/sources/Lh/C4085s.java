package Lh;

import Gh.a;
import Ih.A;
import Ih.C3834a;
import Ih.OrdersCardViewState;
import Ih.e;
import Ih.o;
import Ih.s;
import Ki.C;
import Ki.LocalThemeScope;
import Lh.C4085s;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import bk.AbstractC6392a;
import ci.SubscriptionCardViewState;
import com.meijer.mobile.accounts.ux.basescreen.p;
import j0.InterfaceC14882C;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16338g;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0081\u0001\u0010\u001a\u001a\u00020\u0018*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016H\u0007¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001f²\u0006\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001e\u001a\u00020\u001c8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Lcom/meijer/mobile/accounts/ux/basescreen/p$a;", "accountOverviewViewState", "LIh/s$b;", "profileCardViewState", "LIh/a$a;", "addressesCardViewState", "LIh/o$a;", "paymentsCardViewState", "LIh/e$a;", "communicationsCardViewState", "LIh/A$a;", "yourMeijerStoreCardViewState", "LIh/n;", "ordersCardViewState", "Lci/a;", "subscriptionCardViewState", "", "isAccountsBetaEnabled", "isProductSubscriptionFlagEnabled", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "LGh/a;", "", "onNavigationRequest", "b", "(LKi/M;Lcom/meijer/mobile/accounts/ux/basescreen/p$a;LIh/s$b;LIh/a$a;LIh/o$a;LIh/e$a;LIh/A$a;LIh/n;Lci/a;ZZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "", "lastAction", "state", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Lh.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4085s {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Lh.s$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f18852a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Gh.a, Unit> f18853b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Lh.s$a$a, reason: collision with other inner class name */
        static final class C0333a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f18854a;

            C0333a(LocalThemeScope localThemeScope) {
                this.f18854a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(265690231, i10, -1, "com.meijer.mobile.accounts.ux.composables.basescreen.AccountOverviewScreen.<anonymous>.<anonymous> (AccountOverviewScreen.kt:64)");
                }
                Dr.g.g(this.f18854a, C16338g.c(Gh.h.f12817V5, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
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

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1465899319, i10, -1, "com.meijer.mobile.accounts.ux.composables.basescreen.AccountOverviewScreen.<anonymous> (AccountOverviewScreen.kt:62)");
            }
            AbstractC6392a abstractC6392aD = AbstractC6392a.INSTANCE.d(Gh.h.f12972s, new Object[0]);
            C.f.d dVar = C.f.d.f17051e;
            LocalThemeScope localThemeScope = this.f18852a;
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(265690231, true, new C0333a(localThemeScope), composer, 54);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f18853b);
            final Function1<Gh.a, Unit> function1 = this.f18853b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Lh.r
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4085s.a.c(function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Dr.g.f(localThemeScope, null, null, null, composableLambdaC, (Function0) objB, dVar, 0.0f, false, abstractC6392aD, composer, LocalThemeScope.f17314g | 24576 | (C.f.d.f17052f << 18) | (AbstractC6392a.f60445b << 27), 199);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, Function1<? super Gh.a, Unit> function1) {
            this.f18852a = localThemeScope;
            this.f18853b = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(a.k.f12614a);
            return Unit.f143329a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Lh.s$b */
    static final class b implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f18855a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p.AccountOverviewViewState f18856b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ s.ProfileCardViewState f18857c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3834a.AddressesCardViewState f18858d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ o.PaymentsCardViewState f18859e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ e.CommunicationsCardViewState f18860f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ A.YourMeijerStoreCardViewState f18861g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ OrdersCardViewState f18862h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ SubscriptionCardViewState f18863i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f18864j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f18865k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function1<Gh.a, Unit> f18866l;

        /* JADX WARN: Multi-variable type inference failed */
        b(LocalThemeScope localThemeScope, p.AccountOverviewViewState aVar, s.ProfileCardViewState profileCardViewState, C3834a.AddressesCardViewState addressesCardViewState, o.PaymentsCardViewState paymentsCardViewState, e.CommunicationsCardViewState communicationsCardViewState, A.YourMeijerStoreCardViewState yourMeijerStoreCardViewState, OrdersCardViewState ordersCardViewState, SubscriptionCardViewState subscriptionCardViewState, boolean z10, boolean z11, Function1<? super Gh.a, Unit> function1) {
            this.f18855a = localThemeScope;
            this.f18856b = aVar;
            this.f18857c = profileCardViewState;
            this.f18858d = addressesCardViewState;
            this.f18859e = paymentsCardViewState;
            this.f18860f = communicationsCardViewState;
            this.f18861g = yourMeijerStoreCardViewState;
            this.f18862h = ordersCardViewState;
            this.f18863i = subscriptionCardViewState;
            this.f18864j = z10;
            this.f18865k = z11;
            this.f18866l = function1;
        }

        public final void a(InterfaceC14882C padding, Composer composer, int i10) {
            int i11;
            Intrinsics.j(padding, "padding");
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer.V(padding) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-109507746, i11, -1, "com.meijer.mobile.accounts.ux.composables.basescreen.AccountOverviewScreen.<anonymous> (AccountOverviewScreen.kt:74)");
            }
            Modifier modifierH = androidx.compose.foundation.layout.D.h(d0.T.g(androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null), d0.T.c(0, composer, 0, 1), false, null, false, 14, null), padding);
            LocalThemeScope localThemeScope = this.f18855a;
            p.AccountOverviewViewState aVar = this.f18856b;
            s.ProfileCardViewState profileCardViewState = this.f18857c;
            C3834a.AddressesCardViewState addressesCardViewState = this.f18858d;
            o.PaymentsCardViewState paymentsCardViewState = this.f18859e;
            e.CommunicationsCardViewState communicationsCardViewState = this.f18860f;
            A.YourMeijerStoreCardViewState yourMeijerStoreCardViewState = this.f18861g;
            OrdersCardViewState ordersCardViewState = this.f18862h;
            SubscriptionCardViewState subscriptionCardViewState = this.f18863i;
            boolean z10 = this.f18864j;
            boolean z11 = this.f18865k;
            Function1<Gh.a, Unit> function1 = this.f18866l;
            int i12 = LocalThemeScope.f17314g;
            int i13 = AbstractC6392a.f60445b;
            C4080p.c(localThemeScope, aVar, profileCardViewState, addressesCardViewState, paymentsCardViewState, communicationsCardViewState, yourMeijerStoreCardViewState, ordersCardViewState, subscriptionCardViewState, z10, z11, modifierH, function1, composer, i12 | (i13 << 6) | (i13 << 9) | (i13 << 12) | (i13 << 15), 0, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
            a(interfaceC14882C, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ki.LocalThemeScope r44, final com.meijer.mobile.accounts.ux.basescreen.p.AccountOverviewViewState r45, final Ih.s.ProfileCardViewState r46, final Ih.C3834a.AddressesCardViewState r47, final Ih.o.PaymentsCardViewState r48, final Ih.e.CommunicationsCardViewState r49, final Ih.A.YourMeijerStoreCardViewState r50, final Ih.OrdersCardViewState r51, final ci.SubscriptionCardViewState r52, final boolean r53, final boolean r54, androidx.compose.ui.Modifier r55, final kotlin.jvm.functions.Function1<? super Gh.a, kotlin.Unit> r56, androidx.compose.runtime.Composer r57, final int r58, final int r59, final int r60) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.C4085s.b(Ki.M, com.meijer.mobile.accounts.ux.basescreen.p$a, Ih.s$b, Ih.a$a, Ih.o$a, Ih.e$a, Ih.A$a, Ih.n, ci.a, boolean, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, p.AccountOverviewViewState aVar, s.ProfileCardViewState profileCardViewState, C3834a.AddressesCardViewState addressesCardViewState, o.PaymentsCardViewState paymentsCardViewState, e.CommunicationsCardViewState communicationsCardViewState, A.YourMeijerStoreCardViewState yourMeijerStoreCardViewState, OrdersCardViewState ordersCardViewState, SubscriptionCardViewState subscriptionCardViewState, boolean z10, boolean z11, Modifier modifier, Function1 function1, int i10, int i11, int i12, Composer composer, int i13) {
        b(localThemeScope, aVar, profileCardViewState, addressesCardViewState, paymentsCardViewState, communicationsCardViewState, yourMeijerStoreCardViewState, ordersCardViewState, subscriptionCardViewState, z10, z11, modifier, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), androidx.compose.runtime.J0.a(i11), i12);
        return Unit.f143329a;
    }
}
