package com.meijer.mobile.meijer.activity.checkout.review;

import Am.C2893i;
import Ji.LocalThemeScope;
import P0.e;
import ak.AbstractC5607a;
import ak.C5608b;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.text.C5693z;
import androidx.compose.foundation.text.InterfaceC5692y;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.InterfaceC5772o;
import androidx.compose.ui.text.input.KeyboardType;
import ck.C6408b;
import com.meijer.mobile.meijer.activity.checkout.review.C11953f;
import j0.InterfaceC14794C;
import j0.InterfaceC14800I;
import j0.InterfaceC14814f;
import ji.DefaultTextInputs;
import ji.InterfaceC14919W;
import ji.InterfaceC14971y;
import ji.q1;
import kotlin.C17871B0;
import kotlin.C17917Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import oi.C16088n;
import p1.C16193g;
import qi.C16531d;
import ws.C17855a;
import xk.C18066d;
import zi.C18504m0;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aW\u0010\f\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\tH\u0001¢\u0006\u0004\b\f\u0010\r\u001a5\u0010\u0010\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u001a²\u0006\u000e\u0010\u0013\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00148\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0016\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0017\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00128\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0019\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00128\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/meijer/mobile/meijer/activity/checkout/review/p;", "adjustEbtPaymentDecorator", "Lkotlin/Function0;", "", "onClose", "onCheckBalance", "Lkotlin/Function1;", "", "onSaveChanges", "c", "(LJi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/review/p;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "enableSaveChangesButton", "m", "(LJi/M;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "desiredAmount", "Lak/a;", "errorMessage", "displayInputField", "isSaveButtonEnabled", "lastAction", "isEnableSave", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.checkout.review.f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11953f {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.f$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f104887a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdjustEbtPaymentDecorator f104888b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Double, Unit> f104889c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f104890d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5772o f104891e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<AbstractC5607a> f104892f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f104893g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<String> f104894h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f104895i;

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(898644313, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.AdjustEbtPaymentContent.<anonymous> (AdjustEbtPaymentContent.kt:91)");
            }
            LocalThemeScope localThemeScope = this.f104887a;
            Modifier.Companion companion = Modifier.INSTANCE;
            boolean z10 = C11953f.i(this.f104892f) == null && C11953f.e(this.f104893g);
            composer.startReplaceGroup(-1224400529);
            boolean zD = composer.D(this.f104888b) | composer.V(this.f104889c) | composer.V(this.f104890d) | composer.D(this.f104891e);
            final AdjustEbtPaymentDecorator adjustEbtPaymentDecorator = this.f104888b;
            final Function1<Double, Unit> function1 = this.f104889c;
            final Function0<Unit> function0 = this.f104890d;
            final InterfaceC5772o interfaceC5772o = this.f104891e;
            final InterfaceC5730l0<String> interfaceC5730l0 = this.f104894h;
            final InterfaceC5730l0<AbstractC5607a> interfaceC5730l02 = this.f104892f;
            final InterfaceC5730l0<Boolean> interfaceC5730l03 = this.f104895i;
            final InterfaceC5730l0<Boolean> interfaceC5730l04 = this.f104893g;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C11953f.a.c(adjustEbtPaymentDecorator, function1, function0, interfaceC5772o, interfaceC5730l0, interfaceC5730l02, interfaceC5730l03, interfaceC5730l04);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C11953f.m(localThemeScope, companion, z10, (Function0) objB, composer, LocalThemeScope.f15770g | 48, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, Function1<? super Double, Unit> function1, Function0<Unit> function0, InterfaceC5772o interfaceC5772o, InterfaceC5730l0<AbstractC5607a> interfaceC5730l0, InterfaceC5730l0<Boolean> interfaceC5730l02, InterfaceC5730l0<String> interfaceC5730l03, InterfaceC5730l0<Boolean> interfaceC5730l04) {
            this.f104887a = localThemeScope;
            this.f104888b = adjustEbtPaymentDecorator;
            this.f104889c = function1;
            this.f104890d = function0;
            this.f104891e = interfaceC5772o;
            this.f104892f = interfaceC5730l0;
            this.f104893g = interfaceC5730l02;
            this.f104894h = interfaceC5730l03;
            this.f104895i = interfaceC5730l04;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, Function1 function1, Function0 function0, InterfaceC5772o interfaceC5772o, InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, InterfaceC5730l0 interfaceC5730l03, InterfaceC5730l0 interfaceC5730l04) {
            double dDoubleValue;
            Double dT = StringsKt.t(C11953f.d(interfaceC5730l0));
            if (dT != null) {
                dDoubleValue = dT.doubleValue() / 100;
            } else {
                dDoubleValue = 0.0d;
            }
            AbstractC5607a minEbtAmountErrorMessage = null;
            if (dDoubleValue < 0.01d) {
                if (adjustEbtPaymentDecorator != null) {
                    minEbtAmountErrorMessage = adjustEbtPaymentDecorator.getMinEbtAmountErrorMessage();
                }
                C11953f.j(interfaceC5730l02, minEbtAmountErrorMessage);
            } else {
                function1.invoke(Double.valueOf(dDoubleValue));
                function0.invoke();
                C11953f.l(interfaceC5730l03, false);
                C11953f.f(interfaceC5730l04, false);
                InterfaceC5772o.l(interfaceC5772o, false, 1, null);
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.f$b */
    static final class b implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f104896a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f104897b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AdjustEbtPaymentDecorator f104898c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f104899d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f104900e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5772o f104901f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<String> f104902g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<AbstractC5607a> f104903h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f104904i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.f$b$a */
        static final class a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f104905a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f104906b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AdjustEbtPaymentDecorator f104907c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f104908d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f104909e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC5772o f104910f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<String> f104911g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<AbstractC5607a> f104912h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f104913i;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.f$b$a$a, reason: collision with other inner class name */
            static final class C1523a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f104914a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ AdjustEbtPaymentDecorator f104915b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Function0<Unit> f104916c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.f$b$a$a$a, reason: collision with other inner class name */
                static final class C1524a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f104917a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ AdjustEbtPaymentDecorator f104918b;

                    C1524a(LocalThemeScope localThemeScope, AdjustEbtPaymentDecorator adjustEbtPaymentDecorator) {
                        this.f104917a = localThemeScope;
                        this.f104918b = adjustEbtPaymentDecorator;
                    }

                    public final void a(InterfaceC14814f AdsColumn, Composer composer, int i10) {
                        Intrinsics.j(AdsColumn, "$this$AdsColumn");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-564441563, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.AdjustEbtPaymentContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdjustEbtPaymentContent.kt:128)");
                        }
                        LocalThemeScope localThemeScope = this.f104917a;
                        q1.Label label = new q1.Label(null, this.f104917a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getValues().getThree(), null, 381, null);
                        String strC = C16193g.c(com.meijer.mobile.meijer.Y.f99725O4, composer, 0);
                        int i11 = LocalThemeScope.f15770g;
                        int i12 = q1.Label.f140080j;
                        ri.j.h(localThemeScope, label, strC, null, composer, i11 | (i12 << 3), 4);
                        LocalThemeScope localThemeScope2 = this.f104917a;
                        q1.Label label2 = new q1.Label(null, this.f104917a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getBody().getOne(), null, 381, null);
                        AdjustEbtPaymentDecorator adjustEbtPaymentDecorator = this.f104918b;
                        AbstractC5607a currentEbtCardBalance = adjustEbtPaymentDecorator != null ? adjustEbtPaymentDecorator.getCurrentEbtCardBalance() : null;
                        composer.startReplaceGroup(-1262441292);
                        String strA = currentEbtCardBalance != null ? C6408b.a(currentEbtCardBalance, composer, AbstractC5607a.f45514b) : null;
                        composer.P();
                        composer.startReplaceGroup(-1262442781);
                        if (strA == null) {
                            strA = C16193g.c(com.meijer.mobile.meijer.Y.f99896X4, composer, 0);
                        }
                        composer.P();
                        ri.j.h(localThemeScope2, label2, strA, null, composer, i11 | (i12 << 3), 4);
                        LocalThemeScope localThemeScope3 = this.f104917a;
                        ri.j.h(localThemeScope3, new q1.Label(null, this.f104917a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope3.getAdsTypography().getDetail().getOne(), null, 381, null), C16193g.c(com.meijer.mobile.meijer.Y.f99858V4, composer, 0), null, composer, i11 | (i12 << 3), 4);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
                        a(interfaceC14814f, composer, num.intValue());
                        return Unit.f142422a;
                    }
                }

                C1523a(LocalThemeScope localThemeScope, AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, Function0<Unit> function0) {
                    this.f104914a = localThemeScope;
                    this.f104915b = adjustEbtPaymentDecorator;
                    this.f104916c = function0;
                }

                public final void b(InterfaceC14800I AdsRow, Composer composer, int i10) {
                    Intrinsics.j(AdsRow, "$this$AdsRow");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(491641819, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.AdjustEbtPaymentContent.<anonymous>.<anonymous>.<anonymous> (AdjustEbtPaymentContent.kt:127)");
                    }
                    LocalThemeScope localThemeScope = this.f104914a;
                    Modifier modifierD = Modifier.INSTANCE;
                    q1.Column column = new q1.Column(modifierD, null, null, 6, null);
                    boolean z10 = true;
                    ComposableLambda composableLambdaC = ComposableLambdaKt.c(-564441563, true, new C1524a(this.f104914a, this.f104915b), composer, 54);
                    int i11 = LocalThemeScope.f15770g;
                    C16088n.e(localThemeScope, column, composableLambdaC, composer, i11 | 384 | (q1.Column.f139985d << 3));
                    AdjustEbtPaymentDecorator adjustEbtPaymentDecorator = this.f104915b;
                    if (!C5608b.a(adjustEbtPaymentDecorator != null ? adjustEbtPaymentDecorator.getCurrentEbtCardBalance() : null)) {
                        AdjustEbtPaymentDecorator adjustEbtPaymentDecorator2 = this.f104915b;
                        if (!Intrinsics.e(adjustEbtPaymentDecorator2 != null ? adjustEbtPaymentDecorator2.getCurrentEbtCardBalance() : null, AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f99896X4, new Object[0]))) {
                            z10 = false;
                        }
                    }
                    LocalThemeScope localThemeScope2 = this.f104914a;
                    Ji.I eight = localThemeScope2.getAdsTypography().getHeadings().getEight();
                    Ji.T adsColorLink = z10 ? this.f104914a.getAdsColors().getAdsColorLink() : this.f104914a.getAdsColors().getAdsColorsDisabled();
                    composer.startReplaceGroup(21448670);
                    if (z10) {
                        composer.startReplaceGroup(5004770);
                        boolean zV = composer.V(this.f104916c);
                        final Function0<Unit> function0 = this.f104916c;
                        Object objB = composer.B();
                        if (zV || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.h
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return C11953f.b.a.C1523a.c(function0);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        modifierD = ClickableKt.d(modifierD, false, null, null, (Function0) objB, 7, null);
                    }
                    composer.P();
                    ri.j.h(localThemeScope2, new q1.Label(modifierD, adsColorLink, null, null, 0, false, 0, eight, null, 380, null), C16193g.c(com.meijer.mobile.meijer.Y.f99687M4, composer, 0), null, composer, (q1.Label.f140080j << 3) | i11, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                    b(interfaceC14800I, composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(Function0 function0) {
                    function0.invoke();
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.f$b$a$b, reason: collision with other inner class name */
            static final class C1525b implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f104919a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ AdjustEbtPaymentDecorator f104920b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<Boolean> f104921c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.f$b$a$b$a, reason: collision with other inner class name */
                static final class C1526a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f104922a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ AdjustEbtPaymentDecorator f104923b;

                    C1526a(LocalThemeScope localThemeScope, AdjustEbtPaymentDecorator adjustEbtPaymentDecorator) {
                        this.f104922a = localThemeScope;
                        this.f104923b = adjustEbtPaymentDecorator;
                    }

                    public final void a(InterfaceC14814f AdsColumn, Composer composer, int i10) {
                        Intrinsics.j(AdsColumn, "$this$AdsColumn");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1172216398, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.AdjustEbtPaymentContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdjustEbtPaymentContent.kt:217)");
                        }
                        LocalThemeScope localThemeScope = this.f104922a;
                        q1.Label label = new q1.Label(null, this.f104922a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getValues().getThree(), null, 381, null);
                        String strC = C16193g.c(com.meijer.mobile.meijer.Y.f99706N4, composer, 0);
                        int i11 = LocalThemeScope.f15770g;
                        int i12 = q1.Label.f140080j;
                        ri.j.h(localThemeScope, label, strC, null, composer, i11 | (i12 << 3), 4);
                        LocalThemeScope localThemeScope2 = this.f104922a;
                        q1.Label label2 = new q1.Label(null, this.f104922a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getBody().getOne(), null, 381, null);
                        AdjustEbtPaymentDecorator adjustEbtPaymentDecorator = this.f104923b;
                        ri.j.h(localThemeScope2, label2, C6408b.a(adjustEbtPaymentDecorator != null ? adjustEbtPaymentDecorator.getEbtApprovedAmount() : null, composer, AbstractC5607a.f45514b), null, composer, i11 | (i12 << 3), 4);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
                        a(interfaceC14814f, composer, num.intValue());
                        return Unit.f142422a;
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(InterfaceC5730l0 interfaceC5730l0) {
                    C11953f.l(interfaceC5730l0, true);
                    return Unit.f142422a;
                }

                C1525b(LocalThemeScope localThemeScope, AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, InterfaceC5730l0<Boolean> interfaceC5730l0) {
                    this.f104919a = localThemeScope;
                    this.f104920b = adjustEbtPaymentDecorator;
                    this.f104921c = interfaceC5730l0;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v13, types: [androidx.compose.ui.Modifier] */
                public final void b(InterfaceC14800I AdsRow, Composer composer, int i10) {
                    AbstractC5607a currentEbtCardBalance;
                    Intrinsics.j(AdsRow, "$this$AdsRow");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1838902652, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.AdjustEbtPaymentContent.<anonymous>.<anonymous>.<anonymous> (AdjustEbtPaymentContent.kt:216)");
                    }
                    LocalThemeScope localThemeScope = this.f104919a;
                    q1.Column column = new q1.Column(null, null, null, 7, null);
                    ComposableLambda composableLambdaC = ComposableLambdaKt.c(1172216398, true, new C1526a(this.f104919a, this.f104920b), composer, 54);
                    int i11 = LocalThemeScope.f15770g;
                    C16088n.e(localThemeScope, column, composableLambdaC, composer, i11 | 384 | (q1.Column.f139985d << 3));
                    if (!C11953f.k(this.f104921c)) {
                        AdjustEbtPaymentDecorator adjustEbtPaymentDecorator = this.f104920b;
                        boolean z10 = (adjustEbtPaymentDecorator == null || (currentEbtCardBalance = adjustEbtPaymentDecorator.getCurrentEbtCardBalance()) == null || !(Intrinsics.e(currentEbtCardBalance, AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f99896X4, new Object[0])) ^ true)) ? false : true;
                        LocalThemeScope localThemeScope2 = this.f104919a;
                        Ji.I eight = localThemeScope2.getAdsTypography().getHeadings().getEight();
                        Ji.T adsColorLink = this.f104919a.getAdsColors().getAdsColorLink();
                        if (!z10) {
                            adsColorLink = null;
                        }
                        if (adsColorLink == null) {
                            adsColorLink = this.f104919a.getAdsColors().getAdsColorsDisabled();
                        }
                        Ji.T t10 = adsColorLink;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        composer.startReplaceGroup(5004770);
                        final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f104921c;
                        Object objB = composer.B();
                        if (objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.i
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return C11953f.b.a.C1525b.c(interfaceC5730l0);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        Modifier.Companion companionD = z10 ? ClickableKt.d(companion, false, null, null, (Function0) objB, 7, null) : null;
                        ri.j.h(localThemeScope2, new q1.Label(companionD == null ? companion : companionD, t10, null, null, 0, false, 0, eight, null, 380, null), C16193g.c(com.meijer.mobile.meijer.Y.f99668L4, composer, 0), null, composer, i11 | (q1.Label.f140080j << 3), 4);
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                    b(interfaceC14800I, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.f$b$a$c */
            static final class c implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f104924a;

                c(LocalThemeScope localThemeScope) {
                    this.f104924a = localThemeScope;
                }

                public final void a(InterfaceC14800I AdsRow, Composer composer, int i10) {
                    Intrinsics.j(AdsRow, "$this$AdsRow");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1853685472, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.AdjustEbtPaymentContent.<anonymous>.<anonymous>.<anonymous> (AdjustEbtPaymentContent.kt:266)");
                    }
                    LocalThemeScope localThemeScope = this.f104924a;
                    q1.Label label = new q1.Label(null, this.f104924a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getTwo(), null, 381, null);
                    String strC = C16193g.c(com.meijer.mobile.meijer.Y.f99763Q4, composer, 0);
                    int i11 = LocalThemeScope.f15770g;
                    int i12 = q1.Label.f140080j;
                    ri.j.h(localThemeScope, label, strC, null, composer, i11 | (i12 << 3), 4);
                    LocalThemeScope localThemeScope2 = this.f104924a;
                    Ji.I one = localThemeScope2.getAdsTypography().getDetail().getOne();
                    ri.j.h(localThemeScope2, new q1.Label(androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, this.f104924a.getAdsSpacing().getTwo().getDp(), 0.0f, 0.0f, 0.0f, 14, null), this.f104924a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, one, null, 380, null), C16193g.c(com.meijer.mobile.meijer.Y.f99820T4, composer, 0), null, composer, i11 | (i12 << 3), 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                    a(interfaceC14800I, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.f$b$a$d */
            static final class d implements Function3<InterfaceC14919W, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f104925a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC5772o f104926b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ AdjustEbtPaymentDecorator f104927c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<String> f104928d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<AbstractC5607a> f104929e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<Boolean> f104930f;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.f$b$a$d$a, reason: collision with other inner class name */
                static final class C1527a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f104931a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ InterfaceC14919W f104932b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ AbstractC5607a f104933c;

                    C1527a(LocalThemeScope localThemeScope, InterfaceC14919W interfaceC14919W, AbstractC5607a abstractC5607a) {
                        this.f104931a = localThemeScope;
                        this.f104932b = interfaceC14919W;
                        this.f104933c = abstractC5607a;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1345385744, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.AdjustEbtPaymentContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdjustEbtPaymentContent.kt:336)");
                        }
                        ri.j.h(this.f104931a, this.f104932b.getLabels().getInfoBlockMessage(), C6408b.a(this.f104933c, composer, AbstractC5607a.f45514b), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

                d(LocalThemeScope localThemeScope, InterfaceC5772o interfaceC5772o, AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, InterfaceC5730l0<String> interfaceC5730l0, InterfaceC5730l0<AbstractC5607a> interfaceC5730l02, InterfaceC5730l0<Boolean> interfaceC5730l03) {
                    this.f104925a = localThemeScope;
                    this.f104926b = interfaceC5772o;
                    this.f104927c = adjustEbtPaymentDecorator;
                    this.f104928d = interfaceC5730l0;
                    this.f104929e = interfaceC5730l02;
                    this.f104930f = interfaceC5730l03;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final q1.f.TextInput k(LocalThemeScope localThemeScope, final InterfaceC5772o interfaceC5772o, q1.f.TextInput template) {
                    Intrinsics.j(template, "template");
                    KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, KeyboardType.INSTANCE.b(), 0, null, null, null, 123, null);
                    C5693z c5693z = new C5693z(new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.review.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C11953f.b.a.d.l(interfaceC5772o, (InterfaceC5692y) obj);
                        }
                    }, null, null, null, null, null, 62, null);
                    return q1.f.TextInput.y(template, null, false, null, localThemeScope.getAdsTypography().getBodyCompact().getOne(), new C17855a(null, 0, 3, null), keyboardOptions, c5693z, false, 0, null, null, null, 3975, null);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit l(InterfaceC5772o interfaceC5772o, InterfaceC5692y KeyboardActions) {
                    Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
                    InterfaceC5772o.l(interfaceC5772o, false, 1, null);
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit o(AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, InterfaceC5730l0 interfaceC5730l03, String amount) {
                    String str;
                    Double maxEbtPaymentAllowed;
                    Intrinsics.j(amount, "amount");
                    AbstractC5607a minEbtAmountErrorMessage = null;
                    if (amount.length() == 0 || StringsKt.W(amount, ".", false, 2, null)) {
                        C11953f.h(interfaceC5730l0, "");
                        C11953f.f(interfaceC5730l02, false);
                        str = amount;
                    } else {
                        str = amount;
                        C11953f.h(interfaceC5730l0, StringsKt.Q(str, ".", "", false, 4, null));
                        C11953f.f(interfaceC5730l02, true);
                    }
                    if (C11953f.d(interfaceC5730l0).length() != 0 && C18066d.b(StringsKt.v(C11953f.d(interfaceC5730l0)), new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.l
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(C11953f.b.a.d.p());
                        }
                    }) >= 1) {
                        if (C18066d.b(StringsKt.v(str), new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.m
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(C11953f.b.a.d.q());
                            }
                        }) > C18066d.b((adjustEbtPaymentDecorator == null || (maxEbtPaymentAllowed = adjustEbtPaymentDecorator.getMaxEbtPaymentAllowed()) == null) ? null : Integer.valueOf((int) (maxEbtPaymentAllowed.doubleValue() * 100)), new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.n
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(C11953f.b.a.d.r());
                            }
                        }) && adjustEbtPaymentDecorator != null) {
                            minEbtAmountErrorMessage = adjustEbtPaymentDecorator.getMaxEbtAmountErrorMessage();
                        }
                    } else if (adjustEbtPaymentDecorator != null) {
                        minEbtAmountErrorMessage = adjustEbtPaymentDecorator.getMinEbtAmountErrorMessage();
                    }
                    C11953f.j(interfaceC5730l03, minEbtAmountErrorMessage);
                    return Unit.f142422a;
                }

                public final void g(InterfaceC14919W Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if (ComposerKt.M()) {
                        ComposerKt.U(16449611, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.AdjustEbtPaymentContent.<anonymous>.<anonymous>.<anonymous> (AdjustEbtPaymentContent.kt:284)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierD = C17871B0.d(androidx.compose.foundation.layout.D.k(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), this.f104925a.getAdsSpacing().getFive().getDp(), 0.0f, 2, null));
                    String strD = C11953f.d(this.f104928d);
                    DefaultTextInputs defaultTextInputsC = Assemble.getInputFields();
                    boolean z10 = C11953f.i(this.f104929e) != null;
                    composer.startReplaceGroup(-1633490746);
                    boolean zD = composer.D(this.f104926b) | composer.D(this.f104925a);
                    final LocalThemeScope localThemeScope = this.f104925a;
                    final InterfaceC5772o interfaceC5772o = this.f104926b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.review.j
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C11953f.b.a.d.k(localThemeScope, interfaceC5772o, (q1.f.TextInput) obj);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    q1.f.TextInput textInputF = Cr.f.f(defaultTextInputsC, z10, false, false, (Function1) objB, 6, null);
                    LocalThemeScope localThemeScope2 = this.f104925a;
                    composer.startReplaceGroup(-1224400529);
                    boolean zD2 = composer.D(this.f104927c);
                    final AdjustEbtPaymentDecorator adjustEbtPaymentDecorator = this.f104927c;
                    final InterfaceC5730l0<String> interfaceC5730l0 = this.f104928d;
                    final InterfaceC5730l0<Boolean> interfaceC5730l02 = this.f104930f;
                    final InterfaceC5730l0<AbstractC5607a> interfaceC5730l03 = this.f104929e;
                    Object objB2 = composer.B();
                    if (zD2 || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.review.k
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C11953f.b.a.d.o(adjustEbtPaymentDecorator, interfaceC5730l0, interfaceC5730l02, interfaceC5730l03, (String) obj);
                            }
                        };
                        composer.t(objB2);
                    }
                    Function1 function1 = (Function1) objB2;
                    composer.P();
                    int i11 = LocalThemeScope.f15770g;
                    C18504m0.i(localThemeScope2, strD, textInputF, modifierD, function1, null, composer, i11 | (q1.f.TextInput.f140038m << 6), 16);
                    AbstractC5607a abstractC5607aI = C11953f.i(this.f104929e);
                    if (abstractC5607aI != null) {
                        LocalThemeScope localThemeScope3 = this.f104925a;
                        C16531d.e(localThemeScope3, q1.InfoBlock.y(Assemble.getInfoBlocks().getErrorBlock(), androidx.compose.foundation.layout.D.m(companion, localThemeScope3.getAdsSpacing().getFive().getDp(), localThemeScope3.getAdsSpacing().getTwo().getDp(), localThemeScope3.getAdsSpacing().getFive().getDp(), 0.0f, 8, null), null, 2, null), ComposableLambdaKt.c(-1345385744, true, new C1527a(localThemeScope3, Assemble, abstractC5607aI), composer, 54), composer, i11 | 384 | (q1.InfoBlock.f140077c << 3));
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14919W interfaceC14919W, Composer composer, Integer num) {
                    g(interfaceC14919W, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            a(LocalThemeScope localThemeScope, Function0<Unit> function0, AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, Function0<Unit> function02, InterfaceC5730l0<Boolean> interfaceC5730l0, InterfaceC5772o interfaceC5772o, InterfaceC5730l0<String> interfaceC5730l02, InterfaceC5730l0<AbstractC5607a> interfaceC5730l03, InterfaceC5730l0<Boolean> interfaceC5730l04) {
                this.f104905a = localThemeScope;
                this.f104906b = function0;
                this.f104907c = adjustEbtPaymentDecorator;
                this.f104908d = function02;
                this.f104909e = interfaceC5730l0;
                this.f104910f = interfaceC5772o;
                this.f104911g = interfaceC5730l02;
                this.f104912h = interfaceC5730l03;
                this.f104913i = interfaceC5730l04;
            }

            public final void b(InterfaceC14814f AdsColumn, Composer composer, int i10) {
                Intrinsics.j(AdsColumn, "$this$AdsColumn");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1472751717, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.AdjustEbtPaymentContent.<anonymous>.<anonymous> (AdjustEbtPaymentContent.kt:110)");
                }
                LocalThemeScope localThemeScope = this.f104905a;
                String strC = C16193g.c(com.meijer.mobile.meijer.Y.f99877W4, composer, 0);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f104906b);
                final Function0<Unit> function0 = this.f104906b;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.review.g
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C11953f.b.a.c(function0);
                        }
                    };
                    composer.t(objB);
                }
                Function0 function02 = (Function0) objB;
                composer.P();
                int i11 = LocalThemeScope.f15770g;
                C2893i.c(localThemeScope, null, strC, function02, composer, i11, 1);
                LocalThemeScope localThemeScope2 = this.f104905a;
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierM = androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), this.f104905a.getAdsSpacing().getFive().getDp(), this.f104905a.getAdsSpacing().getFive().getDp(), this.f104905a.getAdsSpacing().getFive().getDp(), 0.0f, 8, null);
                e.Companion companion2 = P0.e.INSTANCE;
                e.c cVarI = companion2.i();
                C5658d c5658d = C5658d.f48555a;
                q1.Row row = new q1.Row(modifierM, c5658d.e(), cVarI);
                ComposableLambda composableLambdaC = ComposableLambdaKt.c(491641819, true, new C1523a(this.f104905a, this.f104907c, this.f104908d), composer, 54);
                int i12 = q1.Row.f140137d;
                C16088n.i(localThemeScope2, row, composableLambdaC, composer, i11 | 384 | (i12 << 3));
                C17917Z.a(androidx.compose.foundation.layout.D.j(companion, this.f104905a.getAdsSpacing().getFive().getDp(), this.f104905a.getAdsSpacing().getFive().getDp()), this.f104905a.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 12);
                LocalThemeScope localThemeScope3 = this.f104905a;
                q1.Label label = new q1.Label(androidx.compose.foundation.layout.D.m(companion, this.f104905a.getAdsSpacing().getFive().getDp(), 0.0f, 0.0f, 0.0f, 14, null), this.f104905a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope3.getAdsTypography().getValues().getThree(), null, 380, null);
                String strC2 = C16193g.c(com.meijer.mobile.meijer.Y.f99744P4, composer, 0);
                int i13 = q1.Label.f140080j;
                ri.j.h(localThemeScope3, label, strC2, null, composer, i11 | (i13 << 3), 4);
                LocalThemeScope localThemeScope4 = this.f104905a;
                q1.Label label2 = new q1.Label(androidx.compose.foundation.layout.D.m(companion, this.f104905a.getAdsSpacing().getFive().getDp(), 0.0f, 0.0f, 0.0f, 14, null), this.f104905a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope4.getAdsTypography().getBody().getOne(), null, 380, null);
                AdjustEbtPaymentDecorator adjustEbtPaymentDecorator = this.f104907c;
                ri.j.h(localThemeScope4, label2, C6408b.a(adjustEbtPaymentDecorator != null ? adjustEbtPaymentDecorator.getEligibleEbtItemTotal() : null, composer, AbstractC5607a.f45514b), null, composer, i11 | (i13 << 3), 4);
                C17917Z.a(androidx.compose.foundation.layout.D.j(companion, this.f104905a.getAdsSpacing().getFive().getDp(), this.f104905a.getAdsSpacing().getFive().getDp()), this.f104905a.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 12);
                C16088n.i(this.f104905a, new q1.Row(androidx.compose.foundation.layout.D.k(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), this.f104905a.getAdsSpacing().getFive().getDp(), 0.0f, 2, null), c5658d.e(), companion2.i()), ComposableLambdaKt.c(-1838902652, true, new C1525b(this.f104905a, this.f104907c, this.f104909e), composer, 54), composer, i11 | 384 | (i12 << 3));
                if (C11953f.k(this.f104909e)) {
                    C16088n.i(this.f104905a, new q1.Row(androidx.compose.foundation.layout.D.m(companion, this.f104905a.getAdsSpacing().getFive().getDp(), this.f104905a.getAdsSpacing().getThree().getDp(), 0.0f, this.f104905a.getAdsSpacing().getThree().getDp(), 4, null), null, companion2.i(), 2, null), ComposableLambdaKt.c(1853685472, true, new c(this.f104905a), composer, 54), composer, i11 | 384 | (i12 << 3));
                    LocalThemeScope localThemeScope5 = this.f104905a;
                    Ji.Q.e(localThemeScope5, ji.L0.f139675a, ComposableLambdaKt.c(16449611, true, new d(localThemeScope5, this.f104910f, this.f104907c, this.f104911g, this.f104912h, this.f104913i), composer, 54), composer, i11 | 384 | (ji.L0.f139676b << 3));
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
                b(interfaceC14814f, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function0 function0) {
                function0.invoke();
                return Unit.f142422a;
            }
        }

        b(LocalThemeScope localThemeScope, Function0<Unit> function0, AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, Function0<Unit> function02, InterfaceC5730l0<Boolean> interfaceC5730l0, InterfaceC5772o interfaceC5772o, InterfaceC5730l0<String> interfaceC5730l02, InterfaceC5730l0<AbstractC5607a> interfaceC5730l03, InterfaceC5730l0<Boolean> interfaceC5730l04) {
            this.f104896a = localThemeScope;
            this.f104897b = function0;
            this.f104898c = adjustEbtPaymentDecorator;
            this.f104899d = function02;
            this.f104900e = interfaceC5730l0;
            this.f104901f = interfaceC5772o;
            this.f104902g = interfaceC5730l02;
            this.f104903h = interfaceC5730l03;
            this.f104904i = interfaceC5730l04;
        }

        public final void a(InterfaceC14794C contentPadding, Composer composer, int i10) {
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
            C16088n.e(this.f104896a, new q1.Column(androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, contentPadding), null, null, 6, null), ComposableLambdaKt.c(-1472751717, true, new a(this.f104896a, this.f104897b, this.f104898c, this.f104899d, this.f104900e, this.f104901f, this.f104902g, this.f104903h, this.f104904i), composer, 54), composer, LocalThemeScope.f15770g | 384 | (q1.Column.f139985d << 3));
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.f$c */
    static final class c implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f104934a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f104935b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f104936c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.f$c$a */
        static final class a implements Function3<ji.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f104937a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f104938b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f104939c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.f$c$a$a, reason: collision with other inner class name */
            static final class C1528a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f104940a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ji.j1 f104941b;

                C1528a(LocalThemeScope localThemeScope, ji.j1 j1Var) {
                    this.f104940a = localThemeScope;
                    this.f104941b = j1Var;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(205535922, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.ButtonSection.<anonymous>.<anonymous>.<anonymous> (AdjustEbtPaymentContent.kt:369)");
                    }
                    ri.j.h(this.f104940a, this.f104941b.getLabels().getEnabledLabel(), C16193g.c(com.meijer.mobile.meijer.Y.f99839U4, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                    a(interfaceC14800I, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            a(LocalThemeScope localThemeScope, boolean z10, Function0<Unit> function0) {
                this.f104937a = localThemeScope;
                this.f104938b = z10;
                this.f104939c = function0;
            }

            public final void a(ji.j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-798508545, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.ButtonSection.<anonymous>.<anonymous> (AdjustEbtPaymentContent.kt:361)");
                }
                ni.E0.b(this.f104937a, q1.d.StandardButton.y(!this.f104938b ? Assemble.getButtons().getDisabledButton() : Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, androidx.compose.foundation.layout.D.k(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), this.f104937a.getAdsSpacing().getFive().getDp(), 0.0f, 2, null), false, null, 895, null), this.f104939c, ComposableLambdaKt.c(205535922, true, new C1528a(this.f104937a, Assemble), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ji.j1 j1Var, Composer composer, Integer num) {
                a(j1Var, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        c(LocalThemeScope localThemeScope, boolean z10, Function0<Unit> function0) {
            this.f104934a = localThemeScope;
            this.f104935b = z10;
            this.f104936c = function0;
        }

        public final void a(InterfaceC14814f AdsColumn, Composer composer, int i10) {
            Intrinsics.j(AdsColumn, "$this$AdsColumn");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(920376291, i10, -1, "com.meijer.mobile.meijer.activity.checkout.review.ButtonSection.<anonymous> (AdjustEbtPaymentContent.kt:355)");
            }
            C17917Z.a(androidx.compose.foundation.layout.D.k(Modifier.INSTANCE, 0.0f, this.f104934a.getAdsSpacing().getFive().getDp(), 1, null), this.f104934a.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 12);
            LocalThemeScope localThemeScope = this.f104934a;
            Ji.Q.e(localThemeScope, InterfaceC14971y.a.d.f140292a, ComposableLambdaKt.c(-798508545, true, new a(localThemeScope, this.f104935b, this.f104936c), composer, 54), composer, LocalThemeScope.f15770g | 384 | (InterfaceC14971y.a.d.f140293b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
            a(interfaceC14814f, composer, num.intValue());
            return Unit.f142422a;
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
    public static final void c(final Ji.LocalThemeScope r39, androidx.compose.ui.Modifier r40, final com.meijer.mobile.meijer.activity.checkout.review.AdjustEbtPaymentDecorator r41, final kotlin.jvm.functions.Function0<kotlin.Unit> r42, final kotlin.jvm.functions.Function0<kotlin.Unit> r43, final kotlin.jvm.functions.Function1<? super java.lang.Double, kotlin.Unit> r44, androidx.compose.runtime.Composer r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.C11953f.c(Ji.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.review.p, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, Modifier modifier, AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, Function0 function0, Function0 function02, Function1 function1, int i10, int i11, Composer composer, int i12) {
        c(localThemeScope, modifier, adjustEbtPaymentDecorator, function0, function02, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
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
    public static final void m(final Ji.LocalThemeScope r17, androidx.compose.ui.Modifier r18, boolean r19, final kotlin.jvm.functions.Function0<kotlin.Unit> r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.C11953f.m(Ji.M, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, Modifier modifier, boolean z10, Function0 function0, int i10, int i11, Composer composer, int i12) {
        m(localThemeScope, modifier, z10, function0, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(InterfaceC5730l0<String> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(InterfaceC5730l0<String> interfaceC5730l0, String str) {
        interfaceC5730l0.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC5607a i(InterfaceC5730l0<AbstractC5607a> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(InterfaceC5730l0<AbstractC5607a> interfaceC5730l0, AbstractC5607a abstractC5607a) {
        interfaceC5730l0.setValue(abstractC5607a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }
}
