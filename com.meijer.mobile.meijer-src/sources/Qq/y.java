package Qq;

import Bm.X;
import Ki.C;
import Ki.LocalThemeScope;
import L1.A;
import L1.C;
import L1.C4010g;
import L1.D;
import L1.n;
import L1.x;
import Qq.o;
import Qq.z;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import bk.AbstractC6392a;
import com.meijer.mobile.meijer.activity.checkout.review.CheckoutViewState;
import com.meijer.mobile.meijer.activity.checkout.review.CreditCardChargesDecorator;
import com.meijer.mobile.meijer.activity.checkout.review.DeliveryInstructionsDecorator;
import com.meijer.mobile.meijer.activity.checkout.review.EbtCardChargesDecorator;
import com.meijer.mobile.meijer.activity.checkout.review.PreTipDecorator;
import com.meijer.mobile.meijer.activity.checkout.review.W1;
import dk.C13698b;
import j0.InterfaceC14902f;
import ki.q1;
import kotlin.C17983Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.A0;
import oi.P0;
import pi.C16453n;
import qi.C16671b;
import xs.EnumC18220b;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a9\u0010\t\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0004\b\t\u0010\n\u001am\u0010\u0015\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u001e²\u0006\u000e\u0010\u0018\u001a\u00020\u00178\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0019\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001a\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001c\u001a\u00020\u001b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0019\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001a\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001d\u001a\u00020\u001b8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/meijer/mobile/meijer/activity/checkout/review/D1;", "viewState", "Lkotlin/Function1;", "LQq/o;", "", "onAction", "j", "(LKi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/review/D1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/checkout/review/V1;", "preTipDecorator", "Lcom/meijer/mobile/meijer/activity/checkout/review/M1;", "deliveryInstructions", "LQq/z;", "onPreTipAction", "Lxs/b;", "setSelectedTipOption", "", "setCustomTipAmount", "r", "(LKi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/review/V1;Lcom/meijer/mobile/meijer/activity/checkout/review/M1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "shouldShowNoTipError", "selectedTipOption", "customTipAmount", "", "tipStatus", "actionTriggered", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class y {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f31377a = new a();

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }

        a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f31378a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f31379b;

        b(L1.h hVar, LocalThemeScope localThemeScope) {
            this.f31378a = hVar;
            this.f31379b = localThemeScope;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getStart(), this.f31378a.getEnd(), this.f31379b.getAdsSpacing().getThree().getDp(), 0.0f, 4, null);
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            constrainAs.r(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f31380a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ EbtCardChargesDecorator f31381b;

        c(LocalThemeScope localThemeScope, EbtCardChargesDecorator ebtCardChargesDecorator) {
            this.f31380a = localThemeScope;
            this.f31381b = ebtCardChargesDecorator;
        }

        public final void a(InterfaceC14902f AdsColumn, Composer composer, int i10) {
            Intrinsics.j(AdsColumn, "$this$AdsColumn");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-974726190, i10, -1, "com.meijer.mobile.singlepagecheckout.orderSummary.OrderSummaryCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderSummaryCard.kt:325)");
            }
            LocalThemeScope localThemeScope = this.f31380a;
            q1.Label label = new q1.Label(null, this.f31380a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getValues().getThree(), null, 381, null);
            AbstractC6392a amountToChargeCard = this.f31381b.getAmountToChargeCard();
            int i11 = AbstractC6392a.f60445b;
            String strA = C13698b.a(amountToChargeCard, composer, i11);
            int i12 = LocalThemeScope.f17314g;
            int i13 = q1.Label.f142335j;
            si.j.h(localThemeScope, label, strA, null, composer, i12 | (i13 << 3), 4);
            LocalThemeScope localThemeScope2 = this.f31380a;
            si.j.h(localThemeScope2, new q1.Label(null, this.f31380a.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getBodyCompact().getOne(), null, 381, null), C13698b.a(this.f31381b.getCardType(), composer, i11), null, composer, i12 | (i13 << 3), 4);
            LocalThemeScope localThemeScope3 = this.f31380a;
            si.j.h(localThemeScope3, new q1.Label(null, this.f31380a.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope3.getAdsTypography().getBody().getTwo(), null, 381, null), C13698b.a(this.f31381b.getAvailableBalance(), composer, i11), null, composer, i12 | (i13 << 3), 4);
            C17983Z.a(androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, 0.0f, this.f31380a.getAdsSpacing().getFour().getDp(), 0.0f, this.f31380a.getAdsSpacing().getTwo().getDp(), 5, null), this.f31380a.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 12);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
            a(interfaceC14902f, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f31382a = new d();

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }

        d() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<o, Unit> f31383a;

        /* JADX WARN: Multi-variable type inference failed */
        e(Function1<? super o, Unit> function1) {
            this.f31383a = function1;
        }

        public final void a() {
            this.f31383a.invoke(o.a.f31349a);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f31384a = new f();

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }

        f() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f31385a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f31386b;

        g(L1.h hVar, LocalThemeScope localThemeScope) {
            this.f31385a = hVar;
            this.f31386b = localThemeScope;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getStart(), this.f31385a.getEnd(), this.f31386b.getAdsSpacing().getThree().getDp(), 0.0f, 4, null);
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            constrainAs.r(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class h implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f31387a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CheckoutViewState f31388b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CreditCardChargesDecorator f31389c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<o, Unit> f31390d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<o, Unit> f31391a;

            /* JADX WARN: Multi-variable type inference failed */
            a(Function1<? super o, Unit> function1) {
                this.f31391a = function1;
            }

            public final void a() {
                this.f31391a.invoke(o.b.f31350a);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        h(LocalThemeScope localThemeScope, CheckoutViewState checkoutViewState, CreditCardChargesDecorator creditCardChargesDecorator, Function1<? super o, Unit> function1) {
            this.f31387a = localThemeScope;
            this.f31388b = checkoutViewState;
            this.f31389c = creditCardChargesDecorator;
            this.f31390d = function1;
        }

        public final void a(InterfaceC14902f AdsColumn, Composer composer, int i10) {
            Intrinsics.j(AdsColumn, "$this$AdsColumn");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(612230192, i10, -1, "com.meijer.mobile.singlepagecheckout.orderSummary.OrderSummaryCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderSummaryCard.kt:412)");
            }
            LocalThemeScope localThemeScope = this.f31387a;
            q1.Label label = new q1.Label(null, this.f31387a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getValues().getThree(), null, 381, null);
            AbstractC6392a abstractC6392aM = this.f31388b.m();
            int i11 = AbstractC6392a.f60445b;
            String strA = C13698b.a(abstractC6392aM, composer, i11);
            int i12 = LocalThemeScope.f17314g;
            int i13 = q1.Label.f142335j;
            si.j.h(localThemeScope, label, strA, null, composer, i12 | (i13 << 3), 4);
            LocalThemeScope localThemeScope2 = this.f31387a;
            si.j.h(localThemeScope2, new q1.Label(null, this.f31387a.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getBodyCompact().getOne(), null, 381, null), C13698b.a(this.f31389c.getCardType(), composer, i11), null, composer, i12 | (i13 << 3), 4);
            AbstractC6392a ebtNote = this.f31389c.getEbtNote();
            composer.startReplaceGroup(-57278407);
            if (ebtNote != null) {
                LocalThemeScope localThemeScope3 = this.f31387a;
                si.j.h(localThemeScope3, new q1.Label(null, localThemeScope3.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope3.getAdsTypography().getDetail().getOne(), null, 381, null), C13698b.a(ebtNote, composer, i11), null, composer, i12 | (i13 << 3), 4);
            }
            composer.P();
            AbstractC6392a preAuthAmount = this.f31389c.getPreAuthAmount();
            if (preAuthAmount != null) {
                LocalThemeScope localThemeScope4 = this.f31387a;
                Function1<o, Unit> function1 = this.f31390d;
                Modifier modifierM = androidx.compose.foundation.layout.D.m(J.h(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, localThemeScope4.getAdsSpacing().getOne().getDp(), 0.0f, 0.0f, 13, null);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(function1);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new a(function1);
                    composer.t(objB);
                }
                composer.P();
                X.b(localThemeScope4, modifierM, null, preAuthAmount, (Function0) objB, null, composer, i12 | (i11 << 9), 18);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
            a(interfaceC14902f, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class i extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ A f31392f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(A a10) {
            super(1);
            this.f31392f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            C.a(semantics, this.f31392f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class j extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f31393f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f31394g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f31395h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ EbtCardChargesDecorator f31396i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f31397j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function1 f31398k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(L1.n nVar, int i10, Function0 function0, EbtCardChargesDecorator ebtCardChargesDecorator, LocalThemeScope localThemeScope, Function1 function1) {
            super(2);
            this.f31394g = nVar;
            this.f31395h = function0;
            this.f31396i = ebtCardChargesDecorator;
            this.f31397j = localThemeScope;
            this.f31398k = function1;
            this.f31393f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f31394g.getHelpersHashCode();
            this.f31394g.i();
            L1.n nVar = this.f31394g;
            composer.startReplaceGroup(1668267468);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            L1.h hVarD = bVarM.d();
            composer.startReplaceGroup(-500370963);
            C.g cardIcon = this.f31396i.getCardIcon();
            LocalThemeScope localThemeScope = this.f31397j;
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB == companion2.a()) {
                objB = a.f31377a;
                composer.t(objB);
            }
            composer.P();
            q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(cardIcon, null, null, null, 0.0f, null, nVar.k(companion, hVarA, (Function1) objB), 60, null);
            int i11 = LocalThemeScope.f17314g;
            C16671b.b(localThemeScope, drawableIcon, null, null, composer, i11 | (q1.h.DrawableIcon.f142322h << 3), 6);
            LocalThemeScope localThemeScope2 = this.f31397j;
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(hVarA) | composer.D(this.f31397j);
            Object objB2 = composer.B();
            if (zV || objB2 == companion2.a()) {
                objB2 = new b(hVarA, this.f31397j);
                composer.t(objB2);
            }
            composer.P();
            C16453n.e(localThemeScope2, new q1.Column(nVar.k(companion, hVarC, (Function1) objB2), null, null, 6, null), ComposableLambdaKt.c(-974726190, true, new c(this.f31397j, this.f31396i), composer, 54), composer, i11 | 384 | (q1.Column.f142240d << 3));
            composer.startReplaceGroup(1849434622);
            Object objB3 = composer.B();
            if (objB3 == companion2.a()) {
                objB3 = d.f31382a;
                composer.t(objB3);
            }
            composer.P();
            Modifier modifierK = nVar.k(companion, hVarD, (Function1) objB3);
            A0 a02 = A0.f153872a;
            String strA = C13698b.a(this.f31396i.getAdjustAmount(), composer, AbstractC6392a.f60445b);
            LocalThemeScope localThemeScope3 = this.f31397j;
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(this.f31398k);
            Object objB4 = composer.B();
            if (zV2 || objB4 == companion2.a()) {
                objB4 = new e(this.f31398k);
                composer.t(objB4);
            }
            composer.P();
            P0.k(localThemeScope3, a02, strA, (Function0) objB4, modifierK, null, false, 0L, false, composer, i11 | (A0.f153873b << 3), 240);
            composer.P();
            composer.P();
            if (this.f31394g.getHelpersHashCode() != helpersHashCode) {
                this.f31395h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class k extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ A f31399f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(A a10) {
            super(1);
            this.f31399f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f31399f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class l extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f31400f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f31401g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f31402h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ CreditCardChargesDecorator f31403i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f31404j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ CheckoutViewState f31405k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function1 f31406l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(L1.n nVar, int i10, Function0 function0, CreditCardChargesDecorator creditCardChargesDecorator, LocalThemeScope localThemeScope, CheckoutViewState checkoutViewState, Function1 function1) {
            super(2);
            this.f31401g = nVar;
            this.f31402h = function0;
            this.f31403i = creditCardChargesDecorator;
            this.f31404j = localThemeScope;
            this.f31405k = checkoutViewState;
            this.f31406l = function1;
            this.f31400f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f31401g.getHelpersHashCode();
            this.f31401g.i();
            L1.n nVar = this.f31401g;
            composer.startReplaceGroup(1330147414);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            C.g cardIcon = this.f31403i.getCardIcon();
            composer.startReplaceGroup(42908559);
            if (cardIcon != null) {
                String strA = C13698b.a(this.f31403i.getFormattedCreditCardDescription(), composer, AbstractC6392a.f60445b);
                LocalThemeScope localThemeScope = this.f31404j;
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = f.f31384a;
                    composer.t(objB);
                }
                composer.P();
                C16671b.b(localThemeScope, new q1.h.DrawableIcon(cardIcon, strA, null, null, 0.0f, null, nVar.k(companion, hVarA, (Function1) objB), 60, null), null, null, composer, LocalThemeScope.f17314g | (q1.h.DrawableIcon.f142322h << 3), 6);
            }
            composer.P();
            LocalThemeScope localThemeScope2 = this.f31404j;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(hVarA) | composer.D(this.f31404j);
            Object objB2 = composer.B();
            if (zV || objB2 == Composer.INSTANCE.a()) {
                objB2 = new g(hVarA, this.f31404j);
                composer.t(objB2);
            }
            composer.P();
            C16453n.e(localThemeScope2, new q1.Column(nVar.k(companion2, hVarC, (Function1) objB2), null, null, 6, null), ComposableLambdaKt.c(612230192, true, new h(this.f31404j, this.f31405k, this.f31403i, this.f31406l), composer, 54), composer, LocalThemeScope.f17314g | 384 | (q1.Column.f142240d << 3));
            composer.P();
            if (this.f31401g.getHelpersHashCode() != helpersHashCode) {
                this.f31402h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x083d  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0843  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x08d2  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x08d4  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x08db  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x08e3  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x08f7  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x08f9  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0908  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x091c  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x091e  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x092d  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0a1c  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0a1f  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0aff  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0b20  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0b3b  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0b55  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0cb4  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0cbf  */
    /* JADX WARN: Removed duplicated region for block: B:259:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final Ki.LocalThemeScope r60, androidx.compose.ui.Modifier r61, final com.meijer.mobile.meijer.activity.checkout.review.CheckoutViewState r62, final kotlin.jvm.functions.Function1<? super Qq.o, kotlin.Unit> r63, androidx.compose.runtime.Composer r64, final int r65, final int r66) {
        /*
            Method dump skipped, instructions count: 3281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Qq.y.j(Ki.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.review.D1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(Function1 function1, InterfaceC5872l0 interfaceC5872l0) {
        t(interfaceC5872l0, false);
        function1.invoke(new z.SetPreTipStatus(W1.f105517a));
        return Unit.f143329a;
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class m {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[W1.values().length];
            try {
                iArr[W1.f105519c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[W1.f105518b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, X0.f drawBehind) {
        Intrinsics.j(drawBehind, "$this$drawBehind");
        float fI1 = drawBehind.I1(H1.h.p(1));
        long color = localThemeScope.getAdsColors().getAdsColorUIBorder02().getColor();
        X0.f.O0(drawBehind, color, U0.f.e((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), U0.f.e((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.b() >> 32))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), fI1, 0, null, 0.0f, null, 0, 496, null);
        long jE = U0.f.e((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.b() & 4294967295L));
        X0.f.O0(drawBehind, color, jE, U0.f.e((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L)), fI1, 0, null, 0.0f, null, 0, 496, null);
        long jE2 = U0.f.e((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.b() >> 32))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawBehind.b() >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (drawBehind.b() & 4294967295L));
        X0.f.O0(drawBehind, color, jE2, U0.f.e((Float.floatToRawIntBits(fIntBitsToFloat3) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32)), fI1, 0, null, 0.0f, null, 0, 496, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(Function1 function1, z preTipAction) {
        Intrinsics.j(preTipAction, "preTipAction");
        function1.invoke(new o.PreTip(preTipAction));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(Function1 function1, EnumC18220b tipOption) {
        Intrinsics.j(tipOption, "tipOption");
        function1.invoke(new o.SetTipOption(tipOption));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(Function1 function1, double d10) {
        function1.invoke(new o.SetCustomTip(d10));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(Function1 function1) {
        function1.invoke(o.f.f31354a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(LocalThemeScope localThemeScope, Modifier modifier, CheckoutViewState checkoutViewState, Function1 function1, int i10, int i11, Composer composer, int i12) {
        j(localThemeScope, modifier, checkoutViewState, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void r(final Ki.LocalThemeScope r51, androidx.compose.ui.Modifier r52, final com.meijer.mobile.meijer.activity.checkout.review.PreTipDecorator r53, com.meijer.mobile.meijer.activity.checkout.review.DeliveryInstructionsDecorator r54, final kotlin.jvm.functions.Function1<? super Qq.z, kotlin.Unit> r55, final kotlin.jvm.functions.Function1<? super xs.EnumC18220b, kotlin.Unit> r56, final kotlin.jvm.functions.Function1<? super java.lang.Double, kotlin.Unit> r57, androidx.compose.runtime.Composer r58, final int r59, final int r60) {
        /*
            Method dump skipped, instructions count: 1611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Qq.y.r(Ki.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.review.V1, com.meijer.mobile.meijer.activity.checkout.review.M1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(LocalThemeScope localThemeScope, Modifier modifier, PreTipDecorator preTipDecorator, DeliveryInstructionsDecorator deliveryInstructionsDecorator, Function1 function1, Function1 function12, Function1 function13, int i10, int i11, Composer composer, int i12) {
        r(localThemeScope, modifier, preTipDecorator, deliveryInstructionsDecorator, function1, function12, function13, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    private static final boolean s(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    private static final void t(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }
}
