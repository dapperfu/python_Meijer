package Nh;

import Fh.a;
import Ji.LocalThemeScope;
import Nh.s0;
import Vh.MperksQuickIDFooterDecorator;
import ak.AbstractC5607a;
import ak.C5608b;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.meijer.mobile.accounts.ux.payments.k;
import com.meijer.mobile.accounts.ux.payments.s;
import j0.C14802K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.InterfaceC15343c;
import yr.C18284j;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\u001aM\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aM\u0010\r\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\r\u0010\f\u001aY\u0010\u0010\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a]\u0010\u0019\u001a\u00020\u0007*\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0017H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a1\u0010\u001b\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006%²\u0006\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010 \u001a\u00020\u001f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010!\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\"\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010#\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010$\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Lcom/meijer/mobile/accounts/ux/payments/s$a;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "LFh/a;", "", "onNavigationRequest", "Lcom/meijer/mobile/accounts/ux/payments/k;", "onResourceAction", "p", "(LJi/M;Lcom/meijer/mobile/accounts/ux/payments/s$a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "l", "Lak/a;", "header", "i", "(LJi/M;Lcom/meijer/mobile/accounts/ux/payments/s$a;Landroidx/compose/ui/Modifier;Lak/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LVh/a;", "mperksQuickIDFooterDecorator", "", "isWicEnabled", "isLegacyPreWic", "Lkotlin/Function0;", "onAddCard", "n", "(LJi/M;LVh/a;Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "s", "(LJi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "", "paymentCards", "showWicSection", "showQuickIdEnabled", "showSuccessNotification", "showErrorCard", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class s0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f21797a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ s.PaymentsScreenViewState f21798b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.payments.k, Unit> f21799c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Fh.a, Unit> f21800d;

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, s.PaymentsScreenViewState paymentsScreenViewState, Function1<? super com.meijer.mobile.accounts.ux.payments.k, Unit> function1, Function1<? super Fh.a, Unit> function12) {
            this.f21797a = localThemeScope;
            this.f21798b = paymentsScreenViewState;
            this.f21799c = function1;
            this.f21800d = function12;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1743654030, i10, -1, "com.meijer.mobile.accounts.ux.composables.payments.PaymentCardsSection.<anonymous> (PaymentsScreenContent.kt:161)");
            }
            s0.i(this.f21797a, this.f21798b, null, AbstractC5607a.INSTANCE.d(Fh.h.f10596R3, new Object[0]), this.f21799c, this.f21800d, composer, LocalThemeScope.f15770g | (AbstractC5607a.f45514b << 9), 2);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f21801a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MperksQuickIDFooterDecorator f21802b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f21803c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Fh.a, Unit> f21804d;

        /* JADX WARN: Multi-variable type inference failed */
        b(boolean z10, MperksQuickIDFooterDecorator mperksQuickIDFooterDecorator, LocalThemeScope localThemeScope, Function1<? super Fh.a, Unit> function1) {
            this.f21801a = z10;
            this.f21802b = mperksQuickIDFooterDecorator;
            this.f21803c = localThemeScope;
            this.f21804d = function1;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2144339692, i10, -1, "com.meijer.mobile.accounts.ux.composables.payments.PaymentsEmptyStateCard.<anonymous> (PaymentsScreenContent.kt:278)");
            }
            if (!this.f21801a && this.f21802b != null) {
                C14802K.a(androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, this.f21803c.getAdsSpacing().getFive().getDp()), composer, 0);
                X.j(this.f21803c, this.f21802b, null, false, this.f21804d, composer, LocalThemeScope.f15770g | 3072 | (AbstractC5607a.f45514b << 3), 2);
            }
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f21805a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.payments.k, Unit> f21806b;

        /* JADX WARN: Multi-variable type inference failed */
        c(LocalThemeScope localThemeScope, Function1<? super com.meijer.mobile.accounts.ux.payments.k, Unit> function1) {
            this.f21805a = localThemeScope;
            this.f21806b = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(k.i.f94465a);
            return Unit.f142422a;
        }

        public final void b(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1812362451, i10, -1, "com.meijer.mobile.accounts.ux.composables.payments.PaymentsScreenContent.<anonymous>.<anonymous>.<anonymous> (PaymentsScreenContent.kt:76)");
            }
            C14802K.a(androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, this.f21805a.getAdsSpacing().getFive().getDp()), composer, 0);
            LocalThemeScope localThemeScope = this.f21805a;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f21806b);
            final Function1<com.meijer.mobile.accounts.ux.payments.k, Unit> function1 = this.f21806b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Nh.t0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return s0.c.c(function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Ph.J.b(localThemeScope, null, (Function0) objB, composer, LocalThemeScope.f15770g, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            b(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class d implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ s.PaymentsScreenViewState f21807a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f21808b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Fh.a, Unit> f21809c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.payments.k, Unit> f21810d;

        /* JADX WARN: Multi-variable type inference failed */
        d(s.PaymentsScreenViewState paymentsScreenViewState, LocalThemeScope localThemeScope, Function1<? super Fh.a, Unit> function1, Function1<? super com.meijer.mobile.accounts.ux.payments.k, Unit> function12) {
            this.f21807a = paymentsScreenViewState;
            this.f21808b = localThemeScope;
            this.f21809c = function1;
            this.f21810d = function12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(Function1 function1) {
            function1.invoke(k.a.f94457a);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Function1 function1) {
            function1.invoke(new k.FetchAllPaymentOptions(false));
            return Unit.f142422a;
        }

        public final void c(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2136115304, i10, -1, "com.meijer.mobile.accounts.ux.composables.payments.PaymentsScreenContent.<anonymous>.<anonymous>.<anonymous> (PaymentsScreenContent.kt:83)");
            }
            if (this.f21807a.k().isEmpty() && C5608b.a(this.f21807a.getErrorMessage())) {
                composer.startReplaceGroup(-1519237020);
                LocalThemeScope localThemeScope = this.f21808b;
                MperksQuickIDFooterDecorator mperksQuickIDFooterDecorator = this.f21807a.getMperksQuickIDFooterDecorator();
                boolean isWicSectionEnabled = this.f21807a.getIsWicSectionEnabled();
                Function1<Fh.a, Unit> function1 = this.f21809c;
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f21810d);
                final Function1<com.meijer.mobile.accounts.ux.payments.k, Unit> function12 = this.f21810d;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Nh.u0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return s0.d.d(function12);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                s0.n(localThemeScope, mperksQuickIDFooterDecorator, null, isWicSectionEnabled, false, function1, (Function0) objB, composer, LocalThemeScope.f15770g | (AbstractC5607a.f45514b << 3), 10);
                composer.P();
            } else if (!C5608b.a(this.f21807a.getErrorMessage())) {
                composer.startReplaceGroup(-1518743128);
                AbstractC5607a errorMessage = this.f21807a.getErrorMessage();
                LocalThemeScope localThemeScope2 = this.f21808b;
                composer.startReplaceGroup(5004770);
                boolean zV2 = composer.V(this.f21810d);
                final Function1<com.meijer.mobile.accounts.ux.payments.k, Unit> function13 = this.f21810d;
                Object objB2 = composer.B();
                if (zV2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: Nh.v0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return s0.d.e(function13);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                C18284j.b(localThemeScope2, null, 0, null, 0, errorMessage, null, 0, null, null, null, null, null, "payments_credit_debit_error_button", (Function0) objB2, composer, 1572864 | LocalThemeScope.f15770g | (AbstractC5607a.f45514b << 15), 3072, 4047);
                composer.P();
            } else if (this.f21807a.getIsLegacyPreWic()) {
                composer.startReplaceGroup(-1518064259);
                s0.i(this.f21808b, this.f21807a, null, null, this.f21810d, this.f21809c, composer, LocalThemeScope.f15770g, 6);
                composer.P();
            } else {
                composer.startReplaceGroup(-1517723910);
                s0.l(this.f21808b, this.f21807a, null, this.f21810d, this.f21809c, composer, LocalThemeScope.f15770g, 2);
                composer.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            c(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f21811a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Fh.a, Unit> f21812b;

        /* JADX WARN: Multi-variable type inference failed */
        e(LocalThemeScope localThemeScope, Function1<? super Fh.a, Unit> function1) {
            this.f21811a = localThemeScope;
            this.f21812b = function1;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1058358614, i10, -1, "com.meijer.mobile.accounts.ux.composables.payments.PaymentsScreenContent.<anonymous>.<anonymous>.<anonymous> (PaymentsScreenContent.kt:131)");
            }
            s0.s(this.f21811a, null, this.f21812b, composer, LocalThemeScope.f15770g, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f21813a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ s.PaymentsScreenViewState f21814b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Fh.a, Unit> f21815c;

        /* JADX WARN: Multi-variable type inference failed */
        f(LocalThemeScope localThemeScope, s.PaymentsScreenViewState paymentsScreenViewState, Function1<? super Fh.a, Unit> function1) {
            this.f21813a = localThemeScope;
            this.f21814b = paymentsScreenViewState;
            this.f21815c = function1;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1269571763, i10, -1, "com.meijer.mobile.accounts.ux.composables.payments.PaymentsScreenContent.<anonymous>.<anonymous>.<anonymous> (PaymentsScreenContent.kt:136)");
            }
            X.j(this.f21813a, this.f21814b.getMperksQuickIDFooterDecorator(), null, true, this.f21815c, composer, LocalThemeScope.f15770g | 3072 | (AbstractC5607a.f45514b << 3), 2);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0285 A[LOOP:0: B:121:0x027c->B:123:0x0285, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final Ji.LocalThemeScope r32, final com.meijer.mobile.accounts.ux.payments.s.PaymentsScreenViewState r33, androidx.compose.ui.Modifier r34, ak.AbstractC5607a r35, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.payments.k, kotlin.Unit> r36, final kotlin.jvm.functions.Function1<? super Fh.a, kotlin.Unit> r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Nh.s0.i(Ji.M, com.meijer.mobile.accounts.ux.payments.s$a, androidx.compose.ui.Modifier, ak.a, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(Function1 function1) {
        function1.invoke(k.a.f94457a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, s.PaymentsScreenViewState paymentsScreenViewState, Modifier modifier, AbstractC5607a abstractC5607a, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        i(localThemeScope, paymentsScreenViewState, modifier, abstractC5607a, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(final Ji.LocalThemeScope r19, final com.meijer.mobile.accounts.ux.payments.s.PaymentsScreenViewState r20, androidx.compose.ui.Modifier r21, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.payments.k, kotlin.Unit> r22, final kotlin.jvm.functions.Function1<? super Fh.a, kotlin.Unit> r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Nh.s0.l(Ji.M, com.meijer.mobile.accounts.ux.payments.s$a, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(LocalThemeScope localThemeScope, s.PaymentsScreenViewState paymentsScreenViewState, Modifier modifier, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        l(localThemeScope, paymentsScreenViewState, modifier, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(final Ji.LocalThemeScope r21, final Vh.MperksQuickIDFooterDecorator r22, androidx.compose.ui.Modifier r23, boolean r24, boolean r25, final kotlin.jvm.functions.Function1<? super Fh.a, kotlin.Unit> r26, final kotlin.jvm.functions.Function0<kotlin.Unit> r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Nh.s0.n(Ji.M, Vh.a, androidx.compose.ui.Modifier, boolean, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(LocalThemeScope localThemeScope, MperksQuickIDFooterDecorator mperksQuickIDFooterDecorator, Modifier modifier, boolean z10, boolean z11, Function1 function1, Function0 function0, int i10, int i11, Composer composer, int i12) {
        n(localThemeScope, mperksQuickIDFooterDecorator, modifier, z10, z11, function1, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(final Ji.LocalThemeScope r21, final com.meijer.mobile.accounts.ux.payments.s.PaymentsScreenViewState r22, androidx.compose.ui.Modifier r23, final kotlin.jvm.functions.Function1<? super Fh.a, kotlin.Unit> r24, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.payments.k, kotlin.Unit> r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Nh.s0.p(Ji.M, com.meijer.mobile.accounts.ux.payments.s$a, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(s.PaymentsScreenViewState paymentsScreenViewState, LocalThemeScope localThemeScope, Function1 function1, Function1 function12, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        if (paymentsScreenViewState.getShowSuccessNotification()) {
            l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1812362451, true, new c(localThemeScope, function1)), 3, null);
        }
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(2136115304, true, new d(paymentsScreenViewState, localThemeScope, function12, function1)), 3, null);
        if (paymentsScreenViewState.getIsWicSectionEnabled()) {
            l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1058358614, true, new e(localThemeScope, function12)), 3, null);
        } else if (paymentsScreenViewState.getIsLegacyPreWic() && paymentsScreenViewState.getMperksQuickIDFooterDecorator() != null) {
            l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1269571763, true, new f(localThemeScope, paymentsScreenViewState, function12)), 3, null);
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(LocalThemeScope localThemeScope, s.PaymentsScreenViewState paymentsScreenViewState, Modifier modifier, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        p(localThemeScope, paymentsScreenViewState, modifier, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void s(final Ji.LocalThemeScope r22, androidx.compose.ui.Modifier r23, final kotlin.jvm.functions.Function1<? super Fh.a, kotlin.Unit> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Nh.s0.s(Ji.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Function1 function1) {
        function1.invoke(a.j.f10422a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(LocalThemeScope localThemeScope, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        s(localThemeScope, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
