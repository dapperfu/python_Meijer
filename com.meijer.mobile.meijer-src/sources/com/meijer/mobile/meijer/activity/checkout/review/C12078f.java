package com.meijer.mobile.meijer.activity.checkout.review;

import Ai.C2832m0;
import Bm.C2998i;
import Ki.LocalThemeScope;
import P0.e;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.text.C5835z;
import androidx.compose.foundation.text.InterfaceC5834y;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.InterfaceC5914o;
import androidx.compose.ui.text.input.KeyboardType;
import bk.AbstractC6392a;
import bk.C6393b;
import com.meijer.mobile.meijer.activity.checkout.review.C12078f;
import dk.C13698b;
import j0.InterfaceC14882C;
import j0.InterfaceC14888I;
import j0.InterfaceC14902f;
import ki.DefaultTextInputs;
import ki.InterfaceC15153W;
import ki.InterfaceC15205y;
import ki.q1;
import kotlin.C17937B0;
import kotlin.C17983Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p1.C16338g;
import pi.C16453n;
import ri.C16912d;
import ws.C17917a;
import yk.C18328d;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aW\u0010\f\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\tH\u0001¢\u0006\u0004\b\f\u0010\r\u001a5\u0010\u0010\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u001a²\u0006\u000e\u0010\u0013\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00148\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0016\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0017\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00128\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0019\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00128\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/meijer/mobile/meijer/activity/checkout/review/p;", "adjustEbtPaymentDecorator", "Lkotlin/Function0;", "", "onClose", "onCheckBalance", "Lkotlin/Function1;", "", "onSaveChanges", "c", "(LKi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/review/p;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "enableSaveChangesButton", "m", "(LKi/M;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "desiredAmount", "Lbk/a;", "errorMessage", "displayInputField", "isSaveButtonEnabled", "lastAction", "isEnableSave", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.checkout.review.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C12078f {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.f$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f105742a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdjustEbtPaymentDecorator f105743b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Double, Unit> f105744c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f105745d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5914o f105746e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<AbstractC6392a> f105747f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f105748g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<String> f105749h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f105750i;

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(898644313, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.AdjustEbtPaymentContent.<anonymous> (AdjustEbtPaymentContent.kt:91)");
            }
            LocalThemeScope localThemeScope = this.f105742a;
            Modifier.Companion companion = Modifier.INSTANCE;
            boolean z10 = C12078f.i(this.f105747f) == null && C12078f.e(this.f105748g);
            composer.startReplaceGroup(-1224400529);
            boolean zD = composer.D(this.f105743b) | composer.V(this.f105744c) | composer.V(this.f105745d) | composer.D(this.f105746e);
            final AdjustEbtPaymentDecorator adjustEbtPaymentDecorator = this.f105743b;
            final Function1<Double, Unit> function1 = this.f105744c;
            final Function0<Unit> function0 = this.f105745d;
            final InterfaceC5914o interfaceC5914o = this.f105746e;
            final InterfaceC5872l0<String> interfaceC5872l0 = this.f105749h;
            final InterfaceC5872l0<AbstractC6392a> interfaceC5872l02 = this.f105747f;
            final InterfaceC5872l0<Boolean> interfaceC5872l03 = this.f105750i;
            final InterfaceC5872l0<Boolean> interfaceC5872l04 = this.f105748g;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12078f.a.c(adjustEbtPaymentDecorator, function1, function0, interfaceC5914o, interfaceC5872l0, interfaceC5872l02, interfaceC5872l03, interfaceC5872l04);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C12078f.m(localThemeScope, companion, z10, (Function0) objB, composer, LocalThemeScope.f17314g | 48, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, Function1<? super Double, Unit> function1, Function0<Unit> function0, InterfaceC5914o interfaceC5914o, InterfaceC5872l0<AbstractC6392a> interfaceC5872l0, InterfaceC5872l0<Boolean> interfaceC5872l02, InterfaceC5872l0<String> interfaceC5872l03, InterfaceC5872l0<Boolean> interfaceC5872l04) {
            this.f105742a = localThemeScope;
            this.f105743b = adjustEbtPaymentDecorator;
            this.f105744c = function1;
            this.f105745d = function0;
            this.f105746e = interfaceC5914o;
            this.f105747f = interfaceC5872l0;
            this.f105748g = interfaceC5872l02;
            this.f105749h = interfaceC5872l03;
            this.f105750i = interfaceC5872l04;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, Function1 function1, Function0 function0, InterfaceC5914o interfaceC5914o, InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, InterfaceC5872l0 interfaceC5872l03, InterfaceC5872l0 interfaceC5872l04) {
            double dDoubleValue;
            Double dT = StringsKt.t(C12078f.d(interfaceC5872l0));
            if (dT != null) {
                dDoubleValue = dT.doubleValue() / 100;
            } else {
                dDoubleValue = 0.0d;
            }
            AbstractC6392a minEbtAmountErrorMessage = null;
            if (dDoubleValue < 0.01d) {
                if (adjustEbtPaymentDecorator != null) {
                    minEbtAmountErrorMessage = adjustEbtPaymentDecorator.getMinEbtAmountErrorMessage();
                }
                C12078f.j(interfaceC5872l02, minEbtAmountErrorMessage);
            } else {
                function1.invoke(Double.valueOf(dDoubleValue));
                function0.invoke();
                C12078f.l(interfaceC5872l03, false);
                C12078f.f(interfaceC5872l04, false);
                InterfaceC5914o.l(interfaceC5914o, false, 1, null);
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.f$b */
    static final class b implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f105751a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f105752b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AdjustEbtPaymentDecorator f105753c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f105754d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f105755e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5914o f105756f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<String> f105757g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<AbstractC6392a> f105758h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f105759i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.f$b$a */
        static final class a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f105760a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f105761b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AdjustEbtPaymentDecorator f105762c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f105763d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f105764e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC5914o f105765f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<String> f105766g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<AbstractC6392a> f105767h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f105768i;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.f$b$a$a, reason: collision with other inner class name */
            static final class C1532a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f105769a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ AdjustEbtPaymentDecorator f105770b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Function0<Unit> f105771c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.f$b$a$a$a, reason: collision with other inner class name */
                static final class C1533a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f105772a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ AdjustEbtPaymentDecorator f105773b;

                    C1533a(LocalThemeScope localThemeScope, AdjustEbtPaymentDecorator adjustEbtPaymentDecorator) {
                        this.f105772a = localThemeScope;
                        this.f105773b = adjustEbtPaymentDecorator;
                    }

                    public final void a(InterfaceC14902f AdsColumn, Composer composer, int i10) {
                        Intrinsics.j(AdsColumn, "$this$AdsColumn");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-564441563, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.AdjustEbtPaymentContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdjustEbtPaymentContent.kt:128)");
                        }
                        LocalThemeScope localThemeScope = this.f105772a;
                        q1.Label label = new q1.Label(null, this.f105772a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getValues().getThree(), null, 381, null);
                        String strC = C16338g.c(com.meijer.mobile.meijer.Y.f100587O4, composer, 0);
                        int i11 = LocalThemeScope.f17314g;
                        int i12 = q1.Label.f142335j;
                        si.j.h(localThemeScope, label, strC, null, composer, i11 | (i12 << 3), 4);
                        LocalThemeScope localThemeScope2 = this.f105772a;
                        q1.Label label2 = new q1.Label(null, this.f105772a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getBody().getOne(), null, 381, null);
                        AdjustEbtPaymentDecorator adjustEbtPaymentDecorator = this.f105773b;
                        AbstractC6392a currentEbtCardBalance = adjustEbtPaymentDecorator != null ? adjustEbtPaymentDecorator.getCurrentEbtCardBalance() : null;
                        composer.startReplaceGroup(-1262441292);
                        String strA = currentEbtCardBalance != null ? C13698b.a(currentEbtCardBalance, composer, AbstractC6392a.f60445b) : null;
                        composer.P();
                        composer.startReplaceGroup(-1262442781);
                        if (strA == null) {
                            strA = C16338g.c(com.meijer.mobile.meijer.Y.f100758X4, composer, 0);
                        }
                        composer.P();
                        si.j.h(localThemeScope2, label2, strA, null, composer, i11 | (i12 << 3), 4);
                        LocalThemeScope localThemeScope3 = this.f105772a;
                        si.j.h(localThemeScope3, new q1.Label(null, this.f105772a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope3.getAdsTypography().getDetail().getOne(), null, 381, null), C16338g.c(com.meijer.mobile.meijer.Y.f100720V4, composer, 0), null, composer, i11 | (i12 << 3), 4);
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

                C1532a(LocalThemeScope localThemeScope, AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, Function0<Unit> function0) {
                    this.f105769a = localThemeScope;
                    this.f105770b = adjustEbtPaymentDecorator;
                    this.f105771c = function0;
                }

                public final void b(InterfaceC14888I AdsRow, Composer composer, int i10) {
                    Intrinsics.j(AdsRow, "$this$AdsRow");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(491641819, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.AdjustEbtPaymentContent.<anonymous>.<anonymous>.<anonymous> (AdjustEbtPaymentContent.kt:127)");
                    }
                    LocalThemeScope localThemeScope = this.f105769a;
                    Modifier modifierD = Modifier.INSTANCE;
                    q1.Column column = new q1.Column(modifierD, null, null, 6, null);
                    boolean z10 = true;
                    ComposableLambda composableLambdaC = ComposableLambdaKt.c(-564441563, true, new C1533a(this.f105769a, this.f105770b), composer, 54);
                    int i11 = LocalThemeScope.f17314g;
                    C16453n.e(localThemeScope, column, composableLambdaC, composer, i11 | 384 | (q1.Column.f142240d << 3));
                    AdjustEbtPaymentDecorator adjustEbtPaymentDecorator = this.f105770b;
                    if (!C6393b.a(adjustEbtPaymentDecorator != null ? adjustEbtPaymentDecorator.getCurrentEbtCardBalance() : null)) {
                        AdjustEbtPaymentDecorator adjustEbtPaymentDecorator2 = this.f105770b;
                        if (!Intrinsics.e(adjustEbtPaymentDecorator2 != null ? adjustEbtPaymentDecorator2.getCurrentEbtCardBalance() : null, AbstractC6392a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100758X4, new Object[0]))) {
                            z10 = false;
                        }
                    }
                    LocalThemeScope localThemeScope2 = this.f105769a;
                    Ki.I eight = localThemeScope2.getAdsTypography().getHeadings().getEight();
                    Ki.T adsColorLink = z10 ? this.f105769a.getAdsColors().getAdsColorLink() : this.f105769a.getAdsColors().getAdsColorsDisabled();
                    composer.startReplaceGroup(21448670);
                    if (z10) {
                        composer.startReplaceGroup(5004770);
                        boolean zV = composer.V(this.f105771c);
                        final Function0<Unit> function0 = this.f105771c;
                        Object objB = composer.B();
                        if (zV || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.h
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return C12078f.b.a.C1532a.c(function0);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        modifierD = ClickableKt.d(modifierD, false, null, null, (Function0) objB, 7, null);
                    }
                    composer.P();
                    si.j.h(localThemeScope2, new q1.Label(modifierD, adsColorLink, null, null, 0, false, 0, eight, null, 380, null), C16338g.c(com.meijer.mobile.meijer.Y.f100549M4, composer, 0), null, composer, (q1.Label.f142335j << 3) | i11, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                    b(interfaceC14888I, composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(Function0 function0) {
                    function0.invoke();
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.f$b$a$b, reason: collision with other inner class name */
            static final class C1534b implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f105774a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ AdjustEbtPaymentDecorator f105775b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<Boolean> f105776c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.f$b$a$b$a, reason: collision with other inner class name */
                static final class C1535a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f105777a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ AdjustEbtPaymentDecorator f105778b;

                    C1535a(LocalThemeScope localThemeScope, AdjustEbtPaymentDecorator adjustEbtPaymentDecorator) {
                        this.f105777a = localThemeScope;
                        this.f105778b = adjustEbtPaymentDecorator;
                    }

                    public final void a(InterfaceC14902f AdsColumn, Composer composer, int i10) {
                        Intrinsics.j(AdsColumn, "$this$AdsColumn");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1172216398, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.AdjustEbtPaymentContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdjustEbtPaymentContent.kt:217)");
                        }
                        LocalThemeScope localThemeScope = this.f105777a;
                        q1.Label label = new q1.Label(null, this.f105777a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getValues().getThree(), null, 381, null);
                        String strC = C16338g.c(com.meijer.mobile.meijer.Y.f100568N4, composer, 0);
                        int i11 = LocalThemeScope.f17314g;
                        int i12 = q1.Label.f142335j;
                        si.j.h(localThemeScope, label, strC, null, composer, i11 | (i12 << 3), 4);
                        LocalThemeScope localThemeScope2 = this.f105777a;
                        q1.Label label2 = new q1.Label(null, this.f105777a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getBody().getOne(), null, 381, null);
                        AdjustEbtPaymentDecorator adjustEbtPaymentDecorator = this.f105778b;
                        si.j.h(localThemeScope2, label2, C13698b.a(adjustEbtPaymentDecorator != null ? adjustEbtPaymentDecorator.getEbtApprovedAmount() : null, composer, AbstractC6392a.f60445b), null, composer, i11 | (i12 << 3), 4);
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

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(InterfaceC5872l0 interfaceC5872l0) {
                    C12078f.l(interfaceC5872l0, true);
                    return Unit.f143329a;
                }

                C1534b(LocalThemeScope localThemeScope, AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, InterfaceC5872l0<Boolean> interfaceC5872l0) {
                    this.f105774a = localThemeScope;
                    this.f105775b = adjustEbtPaymentDecorator;
                    this.f105776c = interfaceC5872l0;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v13, types: [androidx.compose.ui.Modifier] */
                public final void b(InterfaceC14888I AdsRow, Composer composer, int i10) {
                    AbstractC6392a currentEbtCardBalance;
                    Intrinsics.j(AdsRow, "$this$AdsRow");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1838902652, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.AdjustEbtPaymentContent.<anonymous>.<anonymous>.<anonymous> (AdjustEbtPaymentContent.kt:216)");
                    }
                    LocalThemeScope localThemeScope = this.f105774a;
                    q1.Column column = new q1.Column(null, null, null, 7, null);
                    ComposableLambda composableLambdaC = ComposableLambdaKt.c(1172216398, true, new C1535a(this.f105774a, this.f105775b), composer, 54);
                    int i11 = LocalThemeScope.f17314g;
                    C16453n.e(localThemeScope, column, composableLambdaC, composer, i11 | 384 | (q1.Column.f142240d << 3));
                    if (!C12078f.k(this.f105776c)) {
                        AdjustEbtPaymentDecorator adjustEbtPaymentDecorator = this.f105775b;
                        boolean z10 = (adjustEbtPaymentDecorator == null || (currentEbtCardBalance = adjustEbtPaymentDecorator.getCurrentEbtCardBalance()) == null || !(Intrinsics.e(currentEbtCardBalance, AbstractC6392a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100758X4, new Object[0])) ^ true)) ? false : true;
                        LocalThemeScope localThemeScope2 = this.f105774a;
                        Ki.I eight = localThemeScope2.getAdsTypography().getHeadings().getEight();
                        Ki.T adsColorLink = this.f105774a.getAdsColors().getAdsColorLink();
                        if (!z10) {
                            adsColorLink = null;
                        }
                        if (adsColorLink == null) {
                            adsColorLink = this.f105774a.getAdsColors().getAdsColorsDisabled();
                        }
                        Ki.T t10 = adsColorLink;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        composer.startReplaceGroup(5004770);
                        final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f105776c;
                        Object objB = composer.B();
                        if (objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.i
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return C12078f.b.a.C1534b.c(interfaceC5872l0);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        Modifier.Companion companionD = z10 ? ClickableKt.d(companion, false, null, null, (Function0) objB, 7, null) : null;
                        si.j.h(localThemeScope2, new q1.Label(companionD == null ? companion : companionD, t10, null, null, 0, false, 0, eight, null, 380, null), C16338g.c(com.meijer.mobile.meijer.Y.f100530L4, composer, 0), null, composer, i11 | (q1.Label.f142335j << 3), 4);
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                    b(interfaceC14888I, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.f$b$a$c */
            static final class c implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f105779a;

                c(LocalThemeScope localThemeScope) {
                    this.f105779a = localThemeScope;
                }

                public final void a(InterfaceC14888I AdsRow, Composer composer, int i10) {
                    Intrinsics.j(AdsRow, "$this$AdsRow");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1853685472, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.AdjustEbtPaymentContent.<anonymous>.<anonymous>.<anonymous> (AdjustEbtPaymentContent.kt:266)");
                    }
                    LocalThemeScope localThemeScope = this.f105779a;
                    q1.Label label = new q1.Label(null, this.f105779a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getTwo(), null, 381, null);
                    String strC = C16338g.c(com.meijer.mobile.meijer.Y.f100625Q4, composer, 0);
                    int i11 = LocalThemeScope.f17314g;
                    int i12 = q1.Label.f142335j;
                    si.j.h(localThemeScope, label, strC, null, composer, i11 | (i12 << 3), 4);
                    LocalThemeScope localThemeScope2 = this.f105779a;
                    Ki.I one = localThemeScope2.getAdsTypography().getDetail().getOne();
                    si.j.h(localThemeScope2, new q1.Label(androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, this.f105779a.getAdsSpacing().getTwo().getDp(), 0.0f, 0.0f, 0.0f, 14, null), this.f105779a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, one, null, 380, null), C16338g.c(com.meijer.mobile.meijer.Y.f100682T4, composer, 0), null, composer, i11 | (i12 << 3), 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                    a(interfaceC14888I, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.f$b$a$d */
            static final class d implements Function3<InterfaceC15153W, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f105780a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC5914o f105781b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ AdjustEbtPaymentDecorator f105782c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<String> f105783d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<AbstractC6392a> f105784e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<Boolean> f105785f;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.f$b$a$d$a, reason: collision with other inner class name */
                static final class C1536a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f105786a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ InterfaceC15153W f105787b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ AbstractC6392a f105788c;

                    C1536a(LocalThemeScope localThemeScope, InterfaceC15153W interfaceC15153W, AbstractC6392a abstractC6392a) {
                        this.f105786a = localThemeScope;
                        this.f105787b = interfaceC15153W;
                        this.f105788c = abstractC6392a;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1345385744, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.AdjustEbtPaymentContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdjustEbtPaymentContent.kt:336)");
                        }
                        si.j.h(this.f105786a, this.f105787b.getLabels().getInfoBlockMessage(), C13698b.a(this.f105788c, composer, AbstractC6392a.f60445b), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

                /* JADX INFO: Access modifiers changed from: private */
                public static final int p() {
                    return 0;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final int q() {
                    return 0;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final int r() {
                    return 0;
                }

                d(LocalThemeScope localThemeScope, InterfaceC5914o interfaceC5914o, AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, InterfaceC5872l0<String> interfaceC5872l0, InterfaceC5872l0<AbstractC6392a> interfaceC5872l02, InterfaceC5872l0<Boolean> interfaceC5872l03) {
                    this.f105780a = localThemeScope;
                    this.f105781b = interfaceC5914o;
                    this.f105782c = adjustEbtPaymentDecorator;
                    this.f105783d = interfaceC5872l0;
                    this.f105784e = interfaceC5872l02;
                    this.f105785f = interfaceC5872l03;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final q1.f.TextInput k(LocalThemeScope localThemeScope, final InterfaceC5914o interfaceC5914o, q1.f.TextInput template) {
                    Intrinsics.j(template, "template");
                    KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, KeyboardType.INSTANCE.b(), 0, null, null, null, 123, null);
                    C5835z c5835z = new C5835z(new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.review.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C12078f.b.a.d.l(interfaceC5914o, (InterfaceC5834y) obj);
                        }
                    }, null, null, null, null, null, 62, null);
                    return q1.f.TextInput.y(template, null, false, null, localThemeScope.getAdsTypography().getBodyCompact().getOne(), new C17917a(null, 0, 3, null), keyboardOptions, c5835z, false, 0, null, null, null, 3975, null);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit l(InterfaceC5914o interfaceC5914o, InterfaceC5834y KeyboardActions) {
                    Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
                    InterfaceC5914o.l(interfaceC5914o, false, 1, null);
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit o(AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, InterfaceC5872l0 interfaceC5872l03, String amount) {
                    String str;
                    Double maxEbtPaymentAllowed;
                    Intrinsics.j(amount, "amount");
                    AbstractC6392a minEbtAmountErrorMessage = null;
                    if (amount.length() == 0 || StringsKt.W(amount, ".", false, 2, null)) {
                        C12078f.h(interfaceC5872l0, "");
                        C12078f.f(interfaceC5872l02, false);
                        str = amount;
                    } else {
                        str = amount;
                        C12078f.h(interfaceC5872l0, StringsKt.Q(str, ".", "", false, 4, null));
                        C12078f.f(interfaceC5872l02, true);
                    }
                    if (C12078f.d(interfaceC5872l0).length() != 0 && C18328d.b(StringsKt.v(C12078f.d(interfaceC5872l0)), new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.l
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(C12078f.b.a.d.p());
                        }
                    }) >= 1) {
                        if (C18328d.b(StringsKt.v(str), new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.m
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(C12078f.b.a.d.q());
                            }
                        }) > C18328d.b((adjustEbtPaymentDecorator == null || (maxEbtPaymentAllowed = adjustEbtPaymentDecorator.getMaxEbtPaymentAllowed()) == null) ? null : Integer.valueOf((int) (maxEbtPaymentAllowed.doubleValue() * 100)), new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.n
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(C12078f.b.a.d.r());
                            }
                        }) && adjustEbtPaymentDecorator != null) {
                            minEbtAmountErrorMessage = adjustEbtPaymentDecorator.getMaxEbtAmountErrorMessage();
                        }
                    } else if (adjustEbtPaymentDecorator != null) {
                        minEbtAmountErrorMessage = adjustEbtPaymentDecorator.getMinEbtAmountErrorMessage();
                    }
                    C12078f.j(interfaceC5872l03, minEbtAmountErrorMessage);
                    return Unit.f143329a;
                }

                public final void g(InterfaceC15153W Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if (ComposerKt.M()) {
                        ComposerKt.U(16449611, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.AdjustEbtPaymentContent.<anonymous>.<anonymous>.<anonymous> (AdjustEbtPaymentContent.kt:284)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierD = C17937B0.d(androidx.compose.foundation.layout.D.k(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), this.f105780a.getAdsSpacing().getFive().getDp(), 0.0f, 2, null));
                    String strD = C12078f.d(this.f105783d);
                    DefaultTextInputs defaultTextInputsC = Assemble.getInputFields();
                    boolean z10 = C12078f.i(this.f105784e) != null;
                    composer.startReplaceGroup(-1633490746);
                    boolean zD = composer.D(this.f105781b) | composer.D(this.f105780a);
                    final LocalThemeScope localThemeScope = this.f105780a;
                    final InterfaceC5914o interfaceC5914o = this.f105781b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.review.j
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C12078f.b.a.d.k(localThemeScope, interfaceC5914o, (q1.f.TextInput) obj);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    q1.f.TextInput textInputF = Cr.f.f(defaultTextInputsC, z10, false, false, (Function1) objB, 6, null);
                    LocalThemeScope localThemeScope2 = this.f105780a;
                    composer.startReplaceGroup(-1224400529);
                    boolean zD2 = composer.D(this.f105782c);
                    final AdjustEbtPaymentDecorator adjustEbtPaymentDecorator = this.f105782c;
                    final InterfaceC5872l0<String> interfaceC5872l0 = this.f105783d;
                    final InterfaceC5872l0<Boolean> interfaceC5872l02 = this.f105785f;
                    final InterfaceC5872l0<AbstractC6392a> interfaceC5872l03 = this.f105784e;
                    Object objB2 = composer.B();
                    if (zD2 || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.review.k
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C12078f.b.a.d.o(adjustEbtPaymentDecorator, interfaceC5872l0, interfaceC5872l02, interfaceC5872l03, (String) obj);
                            }
                        };
                        composer.t(objB2);
                    }
                    Function1 function1 = (Function1) objB2;
                    composer.P();
                    int i11 = LocalThemeScope.f17314g;
                    C2832m0.i(localThemeScope2, strD, textInputF, modifierD, function1, null, composer, i11 | (q1.f.TextInput.f142293m << 6), 16);
                    AbstractC6392a abstractC6392aI = C12078f.i(this.f105784e);
                    if (abstractC6392aI != null) {
                        LocalThemeScope localThemeScope3 = this.f105780a;
                        C16912d.e(localThemeScope3, q1.InfoBlock.y(Assemble.getInfoBlocks().getErrorBlock(), androidx.compose.foundation.layout.D.m(companion, localThemeScope3.getAdsSpacing().getFive().getDp(), localThemeScope3.getAdsSpacing().getTwo().getDp(), localThemeScope3.getAdsSpacing().getFive().getDp(), 0.0f, 8, null), null, 2, null), ComposableLambdaKt.c(-1345385744, true, new C1536a(localThemeScope3, Assemble, abstractC6392aI), composer, 54), composer, i11 | 384 | (q1.InfoBlock.f142332c << 3));
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15153W interfaceC15153W, Composer composer, Integer num) {
                    g(interfaceC15153W, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            a(LocalThemeScope localThemeScope, Function0<Unit> function0, AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, Function0<Unit> function02, InterfaceC5872l0<Boolean> interfaceC5872l0, InterfaceC5914o interfaceC5914o, InterfaceC5872l0<String> interfaceC5872l02, InterfaceC5872l0<AbstractC6392a> interfaceC5872l03, InterfaceC5872l0<Boolean> interfaceC5872l04) {
                this.f105760a = localThemeScope;
                this.f105761b = function0;
                this.f105762c = adjustEbtPaymentDecorator;
                this.f105763d = function02;
                this.f105764e = interfaceC5872l0;
                this.f105765f = interfaceC5914o;
                this.f105766g = interfaceC5872l02;
                this.f105767h = interfaceC5872l03;
                this.f105768i = interfaceC5872l04;
            }

            public final void b(InterfaceC14902f AdsColumn, Composer composer, int i10) {
                Intrinsics.j(AdsColumn, "$this$AdsColumn");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1472751717, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.AdjustEbtPaymentContent.<anonymous>.<anonymous> (AdjustEbtPaymentContent.kt:110)");
                }
                LocalThemeScope localThemeScope = this.f105760a;
                String strC = C16338g.c(com.meijer.mobile.meijer.Y.f100739W4, composer, 0);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f105761b);
                final Function0<Unit> function0 = this.f105761b;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.g
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C12078f.b.a.c(function0);
                        }
                    };
                    composer.t(objB);
                }
                Function0 function02 = (Function0) objB;
                composer.P();
                int i11 = LocalThemeScope.f17314g;
                C2998i.c(localThemeScope, null, strC, function02, composer, i11, 1);
                LocalThemeScope localThemeScope2 = this.f105760a;
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierM = androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), this.f105760a.getAdsSpacing().getFive().getDp(), this.f105760a.getAdsSpacing().getFive().getDp(), this.f105760a.getAdsSpacing().getFive().getDp(), 0.0f, 8, null);
                e.Companion companion2 = P0.e.INSTANCE;
                e.c cVarI = companion2.i();
                C5800d c5800d = C5800d.f48779a;
                q1.Row row = new q1.Row(modifierM, c5800d.e(), cVarI);
                ComposableLambda composableLambdaC = ComposableLambdaKt.c(491641819, true, new C1532a(this.f105760a, this.f105762c, this.f105763d), composer, 54);
                int i12 = q1.Row.f142392d;
                C16453n.i(localThemeScope2, row, composableLambdaC, composer, i11 | 384 | (i12 << 3));
                C17983Z.a(androidx.compose.foundation.layout.D.j(companion, this.f105760a.getAdsSpacing().getFive().getDp(), this.f105760a.getAdsSpacing().getFive().getDp()), this.f105760a.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 12);
                LocalThemeScope localThemeScope3 = this.f105760a;
                q1.Label label = new q1.Label(androidx.compose.foundation.layout.D.m(companion, this.f105760a.getAdsSpacing().getFive().getDp(), 0.0f, 0.0f, 0.0f, 14, null), this.f105760a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope3.getAdsTypography().getValues().getThree(), null, 380, null);
                String strC2 = C16338g.c(com.meijer.mobile.meijer.Y.f100606P4, composer, 0);
                int i13 = q1.Label.f142335j;
                si.j.h(localThemeScope3, label, strC2, null, composer, i11 | (i13 << 3), 4);
                LocalThemeScope localThemeScope4 = this.f105760a;
                q1.Label label2 = new q1.Label(androidx.compose.foundation.layout.D.m(companion, this.f105760a.getAdsSpacing().getFive().getDp(), 0.0f, 0.0f, 0.0f, 14, null), this.f105760a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope4.getAdsTypography().getBody().getOne(), null, 380, null);
                AdjustEbtPaymentDecorator adjustEbtPaymentDecorator = this.f105762c;
                si.j.h(localThemeScope4, label2, C13698b.a(adjustEbtPaymentDecorator != null ? adjustEbtPaymentDecorator.getEligibleEbtItemTotal() : null, composer, AbstractC6392a.f60445b), null, composer, i11 | (i13 << 3), 4);
                C17983Z.a(androidx.compose.foundation.layout.D.j(companion, this.f105760a.getAdsSpacing().getFive().getDp(), this.f105760a.getAdsSpacing().getFive().getDp()), this.f105760a.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 12);
                C16453n.i(this.f105760a, new q1.Row(androidx.compose.foundation.layout.D.k(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), this.f105760a.getAdsSpacing().getFive().getDp(), 0.0f, 2, null), c5800d.e(), companion2.i()), ComposableLambdaKt.c(-1838902652, true, new C1534b(this.f105760a, this.f105762c, this.f105764e), composer, 54), composer, i11 | 384 | (i12 << 3));
                if (C12078f.k(this.f105764e)) {
                    C16453n.i(this.f105760a, new q1.Row(androidx.compose.foundation.layout.D.m(companion, this.f105760a.getAdsSpacing().getFive().getDp(), this.f105760a.getAdsSpacing().getThree().getDp(), 0.0f, this.f105760a.getAdsSpacing().getThree().getDp(), 4, null), null, companion2.i(), 2, null), ComposableLambdaKt.c(1853685472, true, new c(this.f105760a), composer, 54), composer, i11 | 384 | (i12 << 3));
                    LocalThemeScope localThemeScope5 = this.f105760a;
                    Ki.Q.e(localThemeScope5, ki.L0.f141930a, ComposableLambdaKt.c(16449611, true, new d(localThemeScope5, this.f105765f, this.f105762c, this.f105766g, this.f105767h, this.f105768i), composer, 54), composer, i11 | 384 | (ki.L0.f141931b << 3));
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
                b(interfaceC14902f, composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function0 function0) {
                function0.invoke();
                return Unit.f143329a;
            }
        }

        b(LocalThemeScope localThemeScope, Function0<Unit> function0, AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, Function0<Unit> function02, InterfaceC5872l0<Boolean> interfaceC5872l0, InterfaceC5914o interfaceC5914o, InterfaceC5872l0<String> interfaceC5872l02, InterfaceC5872l0<AbstractC6392a> interfaceC5872l03, InterfaceC5872l0<Boolean> interfaceC5872l04) {
            this.f105751a = localThemeScope;
            this.f105752b = function0;
            this.f105753c = adjustEbtPaymentDecorator;
            this.f105754d = function02;
            this.f105755e = interfaceC5872l0;
            this.f105756f = interfaceC5914o;
            this.f105757g = interfaceC5872l02;
            this.f105758h = interfaceC5872l03;
            this.f105759i = interfaceC5872l04;
        }

        public final void a(InterfaceC14882C contentPadding, Composer composer, int i10) {
            Intrinsics.j(contentPadding, "contentPadding");
            if ((i10 & 6) == 0) {
                i10 |= composer.V(contentPadding) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(31146833, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.AdjustEbtPaymentContent.<anonymous> (AdjustEbtPaymentContent.kt:109)");
            }
            C16453n.e(this.f105751a, new q1.Column(androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, contentPadding), null, null, 6, null), ComposableLambdaKt.c(-1472751717, true, new a(this.f105751a, this.f105752b, this.f105753c, this.f105754d, this.f105755e, this.f105756f, this.f105757g, this.f105758h, this.f105759i), composer, 54), composer, LocalThemeScope.f17314g | 384 | (q1.Column.f142240d << 3));
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.f$c */
    static final class c implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f105789a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f105790b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f105791c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.f$c$a */
        static final class a implements Function3<ki.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f105792a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f105793b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f105794c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.f$c$a$a, reason: collision with other inner class name */
            static final class C1537a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f105795a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ki.j1 f105796b;

                C1537a(LocalThemeScope localThemeScope, ki.j1 j1Var) {
                    this.f105795a = localThemeScope;
                    this.f105796b = j1Var;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(205535922, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.ButtonSection.<anonymous>.<anonymous>.<anonymous> (AdjustEbtPaymentContent.kt:369)");
                    }
                    si.j.h(this.f105795a, this.f105796b.getLabels().getEnabledLabel(), C16338g.c(com.meijer.mobile.meijer.Y.f100701U4, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                    a(interfaceC14888I, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            a(LocalThemeScope localThemeScope, boolean z10, Function0<Unit> function0) {
                this.f105792a = localThemeScope;
                this.f105793b = z10;
                this.f105794c = function0;
            }

            public final void a(ki.j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-798508545, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.ButtonSection.<anonymous>.<anonymous> (AdjustEbtPaymentContent.kt:361)");
                }
                oi.E0.b(this.f105792a, q1.d.StandardButton.y(!this.f105793b ? Assemble.getButtons().getDisabledButton() : Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, androidx.compose.foundation.layout.D.k(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), this.f105792a.getAdsSpacing().getFive().getDp(), 0.0f, 2, null), false, null, 895, null), this.f105794c, ComposableLambdaKt.c(205535922, true, new C1537a(this.f105792a, Assemble), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ki.j1 j1Var, Composer composer, Integer num) {
                a(j1Var, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        c(LocalThemeScope localThemeScope, boolean z10, Function0<Unit> function0) {
            this.f105789a = localThemeScope;
            this.f105790b = z10;
            this.f105791c = function0;
        }

        public final void a(InterfaceC14902f AdsColumn, Composer composer, int i10) {
            Intrinsics.j(AdsColumn, "$this$AdsColumn");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(920376291, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.ButtonSection.<anonymous> (AdjustEbtPaymentContent.kt:355)");
            }
            C17983Z.a(androidx.compose.foundation.layout.D.k(Modifier.INSTANCE, 0.0f, this.f105789a.getAdsSpacing().getFive().getDp(), 1, null), this.f105789a.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 12);
            LocalThemeScope localThemeScope = this.f105789a;
            Ki.Q.e(localThemeScope, InterfaceC15205y.a.d.f142547a, ComposableLambdaKt.c(-798508545, true, new a(localThemeScope, this.f105790b, this.f105791c), composer, 54), composer, LocalThemeScope.f17314g | 384 | (InterfaceC15205y.a.d.f142548b << 3));
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

    /* JADX WARN: Removed duplicated region for block: B:100:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0160  */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34, types: [P0.e$c, java.lang.Object, x0.e0, x0.o1] */
    /* JADX WARN: Type inference failed for: r9v37 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final Ki.LocalThemeScope r39, androidx.compose.ui.Modifier r40, final com.meijer.mobile.meijer.activity.checkout.review.AdjustEbtPaymentDecorator r41, final kotlin.jvm.functions.Function0<kotlin.Unit> r42, final kotlin.jvm.functions.Function0<kotlin.Unit> r43, final kotlin.jvm.functions.Function1<? super java.lang.Double, kotlin.Unit> r44, androidx.compose.runtime.Composer r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.C12078f.c(Ki.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.review.p, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, Modifier modifier, AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, Function0 function0, Function0 function02, Function1 function1, int i10, int i11, Composer composer, int i12) {
        c(localThemeScope, modifier, adjustEbtPaymentDecorator, function0, function02, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(final Ki.LocalThemeScope r17, androidx.compose.ui.Modifier r18, boolean r19, final kotlin.jvm.functions.Function0<kotlin.Unit> r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.C12078f.m(Ki.M, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, Modifier modifier, boolean z10, Function0 function0, int i10, int i11, Composer composer, int i12) {
        m(localThemeScope, modifier, z10, function0, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(InterfaceC5872l0<String> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(InterfaceC5872l0<String> interfaceC5872l0, String str) {
        interfaceC5872l0.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC6392a i(InterfaceC5872l0<AbstractC6392a> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(InterfaceC5872l0<AbstractC6392a> interfaceC5872l0, AbstractC6392a abstractC6392a) {
        interfaceC5872l0.setValue(abstractC6392a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }
}
