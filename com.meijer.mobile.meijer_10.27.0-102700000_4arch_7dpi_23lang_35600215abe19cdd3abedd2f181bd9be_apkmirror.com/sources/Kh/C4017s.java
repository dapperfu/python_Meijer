package Kh;

import Fh.a;
import Hh.A;
import Hh.C3668a;
import Hh.OrdersCardViewState;
import Hh.e;
import Hh.o;
import Hh.s;
import Ji.C;
import Ji.LocalThemeScope;
import Kh.C4017s;
import ak.AbstractC5607a;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import bi.SubscriptionCardViewState;
import com.meijer.mobile.accounts.ux.basescreen.p;
import j0.InterfaceC14794C;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16193g;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0081\u0001\u0010\u001a\u001a\u00020\u0018*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016H\u0007¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001f²\u0006\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001e\u001a\u00020\u001c8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Lcom/meijer/mobile/accounts/ux/basescreen/p$a;", "accountOverviewViewState", "LHh/s$b;", "profileCardViewState", "LHh/a$a;", "addressesCardViewState", "LHh/o$a;", "paymentsCardViewState", "LHh/e$a;", "communicationsCardViewState", "LHh/A$a;", "yourMeijerStoreCardViewState", "LHh/n;", "ordersCardViewState", "Lbi/a;", "subscriptionCardViewState", "", "isAccountsBetaEnabled", "isProductSubscriptionFlagEnabled", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "LFh/a;", "", "onNavigationRequest", "b", "(LJi/M;Lcom/meijer/mobile/accounts/ux/basescreen/p$a;LHh/s$b;LHh/a$a;LHh/o$a;LHh/e$a;LHh/A$a;LHh/n;Lbi/a;ZZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "", "lastAction", "state", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Kh.s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4017s {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Kh.s$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f16974a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Fh.a, Unit> f16975b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Kh.s$a$a, reason: collision with other inner class name */
        static final class C0287a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f16976a;

            C0287a(LocalThemeScope localThemeScope) {
                this.f16976a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(265690231, i10, -1, "com.meijer.mobile.accounts.ux.composables.basescreen.AccountOverviewScreen.<anonymous>.<anonymous> (AccountOverviewScreen.kt:64)");
                }
                Dr.g.g(this.f16976a, C16193g.c(Fh.h.f10626V5, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f15770g, 126);
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

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1465899319, i10, -1, "com.meijer.mobile.accounts.ux.composables.basescreen.AccountOverviewScreen.<anonymous> (AccountOverviewScreen.kt:62)");
            }
            AbstractC5607a abstractC5607aD = AbstractC5607a.INSTANCE.d(Fh.h.f10781s, new Object[0]);
            C.f.d dVar = C.f.d.f15507e;
            LocalThemeScope localThemeScope = this.f16974a;
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(265690231, true, new C0287a(localThemeScope), composer, 54);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f16975b);
            final Function1<Fh.a, Unit> function1 = this.f16975b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Kh.r
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4017s.a.c(function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Dr.g.f(localThemeScope, null, null, null, composableLambdaC, (Function0) objB, dVar, 0.0f, false, abstractC5607aD, composer, LocalThemeScope.f15770g | 24576 | (C.f.d.f15508f << 18) | (AbstractC5607a.f45514b << 27), 199);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, Function1<? super Fh.a, Unit> function1) {
            this.f16974a = localThemeScope;
            this.f16975b = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(a.k.f10423a);
            return Unit.f142422a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Kh.s$b */
    static final class b implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f16977a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p.AccountOverviewViewState f16978b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ s.ProfileCardViewState f16979c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3668a.AddressesCardViewState f16980d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ o.PaymentsCardViewState f16981e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ e.CommunicationsCardViewState f16982f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ A.YourMeijerStoreCardViewState f16983g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ OrdersCardViewState f16984h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ SubscriptionCardViewState f16985i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f16986j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f16987k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function1<Fh.a, Unit> f16988l;

        /* JADX WARN: Multi-variable type inference failed */
        b(LocalThemeScope localThemeScope, p.AccountOverviewViewState aVar, s.ProfileCardViewState profileCardViewState, C3668a.AddressesCardViewState addressesCardViewState, o.PaymentsCardViewState paymentsCardViewState, e.CommunicationsCardViewState communicationsCardViewState, A.YourMeijerStoreCardViewState yourMeijerStoreCardViewState, OrdersCardViewState ordersCardViewState, SubscriptionCardViewState subscriptionCardViewState, boolean z10, boolean z11, Function1<? super Fh.a, Unit> function1) {
            this.f16977a = localThemeScope;
            this.f16978b = aVar;
            this.f16979c = profileCardViewState;
            this.f16980d = addressesCardViewState;
            this.f16981e = paymentsCardViewState;
            this.f16982f = communicationsCardViewState;
            this.f16983g = yourMeijerStoreCardViewState;
            this.f16984h = ordersCardViewState;
            this.f16985i = subscriptionCardViewState;
            this.f16986j = z10;
            this.f16987k = z11;
            this.f16988l = function1;
        }

        public final void a(InterfaceC14794C padding, Composer composer, int i10) {
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
            LocalThemeScope localThemeScope = this.f16977a;
            p.AccountOverviewViewState aVar = this.f16978b;
            s.ProfileCardViewState profileCardViewState = this.f16979c;
            C3668a.AddressesCardViewState addressesCardViewState = this.f16980d;
            o.PaymentsCardViewState paymentsCardViewState = this.f16981e;
            e.CommunicationsCardViewState communicationsCardViewState = this.f16982f;
            A.YourMeijerStoreCardViewState yourMeijerStoreCardViewState = this.f16983g;
            OrdersCardViewState ordersCardViewState = this.f16984h;
            SubscriptionCardViewState subscriptionCardViewState = this.f16985i;
            boolean z10 = this.f16986j;
            boolean z11 = this.f16987k;
            Function1<Fh.a, Unit> function1 = this.f16988l;
            int i12 = LocalThemeScope.f15770g;
            int i13 = AbstractC5607a.f45514b;
            C4012p.c(localThemeScope, aVar, profileCardViewState, addressesCardViewState, paymentsCardViewState, communicationsCardViewState, yourMeijerStoreCardViewState, ordersCardViewState, subscriptionCardViewState, z10, z11, modifierH, function1, composer, i12 | (i13 << 6) | (i13 << 9) | (i13 << 12) | (i13 << 15), 0, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) {
            a(interfaceC14794C, composer, num.intValue());
            return Unit.f142422a;
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
    public static final void b(final Ji.LocalThemeScope r44, final com.meijer.mobile.accounts.ux.basescreen.p.AccountOverviewViewState r45, final Hh.s.ProfileCardViewState r46, final Hh.C3668a.AddressesCardViewState r47, final Hh.o.PaymentsCardViewState r48, final Hh.e.CommunicationsCardViewState r49, final Hh.A.YourMeijerStoreCardViewState r50, final Hh.OrdersCardViewState r51, final bi.SubscriptionCardViewState r52, final boolean r53, final boolean r54, androidx.compose.ui.Modifier r55, final kotlin.jvm.functions.Function1<? super Fh.a, kotlin.Unit> r56, androidx.compose.runtime.Composer r57, final int r58, final int r59, final int r60) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Kh.C4017s.b(Ji.M, com.meijer.mobile.accounts.ux.basescreen.p$a, Hh.s$b, Hh.a$a, Hh.o$a, Hh.e$a, Hh.A$a, Hh.n, bi.a, boolean, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, p.AccountOverviewViewState aVar, s.ProfileCardViewState profileCardViewState, C3668a.AddressesCardViewState addressesCardViewState, o.PaymentsCardViewState paymentsCardViewState, e.CommunicationsCardViewState communicationsCardViewState, A.YourMeijerStoreCardViewState yourMeijerStoreCardViewState, OrdersCardViewState ordersCardViewState, SubscriptionCardViewState subscriptionCardViewState, boolean z10, boolean z11, Modifier modifier, Function1 function1, int i10, int i11, int i12, Composer composer, int i13) {
        b(localThemeScope, aVar, profileCardViewState, addressesCardViewState, paymentsCardViewState, communicationsCardViewState, yourMeijerStoreCardViewState, ordersCardViewState, subscriptionCardViewState, z10, z11, modifier, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), androidx.compose.runtime.J0.a(i11), i12);
        return Unit.f142422a;
    }
}
