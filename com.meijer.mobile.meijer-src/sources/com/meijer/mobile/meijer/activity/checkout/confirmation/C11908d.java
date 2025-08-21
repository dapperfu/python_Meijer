package com.meijer.mobile.meijer.activity.checkout.confirmation;

import Ki.C;
import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import bk.AbstractC6392a;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.activity.checkout.confirmation.C11908d;
import com.meijer.mobile.meijer.activity.checkout.review.T1;
import dk.C13698b;
import j0.InterfaceC14888I;
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
import kotlin.jvm.internal.SourceDebugExtension;
import pi.C16453n;
import qi.C16671b;
import r1.C16819m;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a+\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001aW\u0010\u0010\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LKi/M;", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p;", "order", "Lkotlin/Function0;", "", "onPreAuthToolTipClicked", "g", "(LKi/M;Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "LKi/C$g;", "cardIcon", "Lbk/a;", "cardTotal", "cardEndingNumber", "cardBalance", "temporaryHold", "onToolTipClicked", "d", "(LKi/M;LKi/C$g;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.checkout.confirmation.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C11908d {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.confirmation.d$a */
    static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f102992a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C.g f102993b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f102994c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f102995d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f102996e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f102997f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f102998g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f102999h;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.confirmation.d$a$a, reason: collision with other inner class name */
        static final class C1442a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f103000a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC6392a f103001b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC6392a f103002c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ AbstractC6392a f103003d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ AbstractC6392a f103004e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f103005f;

            C1442a(LocalThemeScope localThemeScope, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, AbstractC6392a abstractC6392a3, AbstractC6392a abstractC6392a4, Function0<Unit> function0) {
                this.f103000a = localThemeScope;
                this.f103001b = abstractC6392a;
                this.f103002c = abstractC6392a2;
                this.f103003d = abstractC6392a3;
                this.f103004e = abstractC6392a4;
                this.f103005f = function0;
            }

            public final void a(InterfaceC14902f AdsColumn, Composer composer, int i10) {
                Intrinsics.j(AdsColumn, "$this$AdsColumn");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1827487648, i10, -1, "com.meijer.mobile.meijer.activity.checkout.confirmation.CardSection.<anonymous>.<anonymous> (OrderCardDetailSection.kt:124)");
                }
                LocalThemeScope localThemeScope = this.f103000a;
                Ki.I eight = localThemeScope.getAdsTypography().getHeadings().getEight();
                Ki.T adsColorText01 = this.f103000a.getAdsColors().getAdsColorText01();
                Modifier.Companion companion = Modifier.INSTANCE;
                float f10 = 4;
                q1.Label label = new q1.Label(FullStoryAnnotationsKt.fsMask(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, 0.0f, H1.h.p(f10), 7, null)), adsColorText01, null, null, 0, false, 0, eight, null, 380, null);
                AbstractC6392a abstractC6392a = this.f103001b;
                int i11 = AbstractC6392a.f60445b;
                String strA = C13698b.a(abstractC6392a, composer, i11);
                int i12 = LocalThemeScope.f17314g;
                int i13 = q1.Label.f142335j;
                si.j.h(localThemeScope, label, strA, null, composer, (i13 << 3) | i12, 4);
                LocalThemeScope localThemeScope2 = this.f103000a;
                si.j.h(localThemeScope2, new q1.Label(null, this.f103000a.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getBody().getTwo(), null, 381, null), C13698b.a(this.f103002c, composer, i11), null, composer, i12 | (i13 << 3), 4);
                composer.startReplaceGroup(426015715);
                if (this.f103003d != null) {
                    LocalThemeScope localThemeScope3 = this.f103000a;
                    si.j.h(localThemeScope3, new q1.Label(null, this.f103000a.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope3.getAdsTypography().getBody().getTwo(), null, 381, null), C13698b.a(this.f103003d, composer, i11), null, composer, i12 | (i13 << 3), 4);
                }
                composer.P();
                if (this.f103004e != null) {
                    LocalThemeScope localThemeScope4 = this.f103000a;
                    Modifier modifierM = androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), 0.0f, H1.h.p(f10), 0.0f, 0.0f, 13, null);
                    AbstractC6392a abstractC6392a2 = this.f103004e;
                    Bm.X.b(localThemeScope4, modifierM, null, abstractC6392a2, this.f103005f, abstractC6392a2, composer, i12 | 48 | (i11 << 9) | (i11 << 15), 2);
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

        a(LocalThemeScope localThemeScope, C.g gVar, String str, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, AbstractC6392a abstractC6392a3, AbstractC6392a abstractC6392a4, Function0<Unit> function0) {
            this.f102992a = localThemeScope;
            this.f102993b = gVar;
            this.f102994c = str;
            this.f102995d = abstractC6392a;
            this.f102996e = abstractC6392a2;
            this.f102997f = abstractC6392a3;
            this.f102998g = abstractC6392a4;
            this.f102999h = function0;
        }

        public final void a(InterfaceC14888I AdsRow, Composer composer, int i10) {
            Intrinsics.j(AdsRow, "$this$AdsRow");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(10350826, i10, -1, "com.meijer.mobile.meijer.activity.checkout.confirmation.CardSection.<anonymous> (OrderCardDetailSection.kt:111)");
            }
            LocalThemeScope localThemeScope = this.f102992a;
            q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(this.f102993b, this.f102994c, null, null, 0.0f, null, null, 124, null);
            int i11 = LocalThemeScope.f17314g;
            C16671b.b(localThemeScope, drawableIcon, null, null, composer, i11 | (q1.h.DrawableIcon.f142322h << 3), 6);
            C16453n.e(this.f102992a, new q1.Column(FullStoryAnnotationsKt.fsMask(androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, H1.h.p(8), 0.0f, 0.0f, 0.0f, 14, null)), null, null, 6, null), ComposableLambdaKt.c(-1827487648, true, new C1442a(this.f102992a, this.f102995d, this.f102996e, this.f102997f, this.f102998g, this.f102999h), composer, 54), composer, i11 | 384 | (q1.Column.f142240d << 3));
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
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.confirmation.d$b */
    static final class b implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f103006a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ OrderConfirmationDecorator f103007b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f103008c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.confirmation.d$b$a */
        static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f103009a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ OrderConfirmationDecorator f103010b;

            a(LocalThemeScope localThemeScope, OrderConfirmationDecorator orderConfirmationDecorator) {
                this.f103009a = localThemeScope;
                this.f103010b = orderConfirmationDecorator;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(r1.u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                r1.s.v(semantics);
                return Unit.f143329a;
            }

            public final void b(InterfaceC14888I AdsRow, Composer composer, int i10) {
                Intrinsics.j(AdsRow, "$this$AdsRow");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-191127193, i10, -1, "com.meijer.mobile.meijer.activity.checkout.confirmation.OrderCardDetailSection.<anonymous>.<anonymous> (OrderCardDetailSection.kt:57)");
                }
                LocalThemeScope localThemeScope = this.f103009a;
                Ki.I seven = localThemeScope.getAdsTypography().getHeadings().getSeven();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.confirmation.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C11908d.b.a.c((r1.u) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                q1.Label label = new q1.Label(C16819m.d(companion, false, (Function1) objB, 1, null), null, null, null, 0, false, 0, seven, null, 382, null);
                OrderConfirmationDecorator orderConfirmationDecorator = this.f103010b;
                si.j.h(localThemeScope, label, C13698b.a(orderConfirmationDecorator != null ? orderConfirmationDecorator.getOrderTotalAtCheckout() : null, composer, AbstractC6392a.f60445b), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.confirmation.d$b$b, reason: collision with other inner class name */
        static final class C1443b implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ OrderConfirmationDecorator f103011a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f103012b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f103013c;

            C1443b(OrderConfirmationDecorator orderConfirmationDecorator, LocalThemeScope localThemeScope, Function0<Unit> function0) {
                this.f103011a = orderConfirmationDecorator;
                this.f103012b = localThemeScope;
                this.f103013c = function0;
            }

            public final void a(InterfaceC14902f AdsColumn, Composer composer, int i10) {
                Intrinsics.j(AdsColumn, "$this$AdsColumn");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(589715869, i10, -1, "com.meijer.mobile.meijer.activity.checkout.confirmation.OrderCardDetailSection.<anonymous>.<anonymous> (OrderCardDetailSection.kt:75)");
                }
                composer.startReplaceGroup(-218732181);
                OrderConfirmationDecorator orderConfirmationDecorator = this.f103011a;
                if (orderConfirmationDecorator != null && orderConfirmationDecorator.getIsEBTOrder()) {
                    LocalThemeScope localThemeScope = this.f103012b;
                    C.g.f fVar = C.g.f.f17076e;
                    AbstractC6392a ebtTotal = this.f103011a.getEbtTotal();
                    AbstractC6392a ebtCardEndingNumber = this.f103011a.getEbtCardEndingNumber();
                    AbstractC6392a ebtCardBalance = this.f103011a.getEbtCardBalance();
                    int i11 = LocalThemeScope.f17314g | (C.g.f.f17077f << 3);
                    int i12 = AbstractC6392a.f60445b;
                    C11908d.d(localThemeScope, fVar, ebtTotal, ebtCardEndingNumber, ebtCardBalance, null, null, composer, i11 | (i12 << 6) | (i12 << 9) | (i12 << 12), 48);
                }
                composer.P();
                LocalThemeScope localThemeScope2 = this.f103012b;
                OrderConfirmationDecorator orderConfirmationDecorator2 = this.f103011a;
                C.g gVarB = T1.b(orderConfirmationDecorator2 != null ? orderConfirmationDecorator2.getCreditCardType() : null);
                OrderConfirmationDecorator orderConfirmationDecorator3 = this.f103011a;
                AbstractC6392a creditDebitCardTotal = orderConfirmationDecorator3 != null ? orderConfirmationDecorator3.getCreditDebitCardTotal() : null;
                OrderConfirmationDecorator orderConfirmationDecorator4 = this.f103011a;
                AbstractC6392a cardEndingNumber = orderConfirmationDecorator4 != null ? orderConfirmationDecorator4.getCardEndingNumber() : null;
                OrderConfirmationDecorator orderConfirmationDecorator5 = this.f103011a;
                AbstractC6392a temporaryHold = orderConfirmationDecorator5 != null ? orderConfirmationDecorator5.getTemporaryHold() : null;
                Function0<Unit> function0 = this.f103013c;
                int i13 = LocalThemeScope.f17314g | (C.g.f17069d << 3);
                int i14 = AbstractC6392a.f60445b;
                C11908d.d(localThemeScope2, gVarB, creditDebitCardTotal, cardEndingNumber, null, temporaryHold, function0, composer, i13 | (i14 << 6) | (i14 << 9) | (i14 << 15), 8);
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

        b(LocalThemeScope localThemeScope, OrderConfirmationDecorator orderConfirmationDecorator, Function0<Unit> function0) {
            this.f103006a = localThemeScope;
            this.f103007b = orderConfirmationDecorator;
            this.f103008c = function0;
        }

        public final void a(InterfaceC14902f AdsColumn, Composer composer, int i10) {
            Intrinsics.j(AdsColumn, "$this$AdsColumn");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1941101863, i10, -1, "com.meijer.mobile.meijer.activity.checkout.confirmation.OrderCardDetailSection.<anonymous> (OrderCardDetailSection.kt:48)");
            }
            C17983Z.a(null, this.f103006a.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
            LocalThemeScope localThemeScope = this.f103006a;
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 16;
            q1.Row row = new q1.Row(androidx.compose.foundation.layout.D.m(androidx.compose.foundation.b.d(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), this.f103006a.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null), H1.h.p(f10), H1.h.p(24), 0.0f, H1.h.p(f10), 4, null), null, null, 6, null);
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(-191127193, true, new a(this.f103006a, this.f103007b), composer, 54);
            int i11 = LocalThemeScope.f17314g;
            C16453n.i(localThemeScope, row, composableLambdaC, composer, i11 | 384 | (q1.Row.f142392d << 3));
            C17983Z.a(null, this.f103006a.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
            C16453n.e(this.f103006a, new q1.Column(androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), H1.h.p(f10), 0.0f, H1.h.p(f10), H1.h.p(f10), 2, null), null, null, 6, null), ComposableLambdaKt.c(589715869, true, new C1443b(this.f103007b, this.f103006a, this.f103008c), composer, 54), composer, i11 | 384 | (q1.Column.f142240d << 3));
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

    /* JADX WARN: Removed duplicated region for block: B:101:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final Ki.LocalThemeScope r23, final Ki.C.g r24, final bk.AbstractC6392a r25, final bk.AbstractC6392a r26, bk.AbstractC6392a r27, bk.AbstractC6392a r28, kotlin.jvm.functions.Function0<kotlin.Unit> r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.confirmation.C11908d.d(Ki.M, Ki.C$g, bk.a, bk.a, bk.a, bk.a, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, C.g gVar, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, AbstractC6392a abstractC6392a3, AbstractC6392a abstractC6392a4, Function0 function0, int i10, int i11, Composer composer, int i12) {
        d(localThemeScope, gVar, abstractC6392a, abstractC6392a2, abstractC6392a3, abstractC6392a4, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    public static final void g(final LocalThemeScope localThemeScope, final OrderConfirmationDecorator orderConfirmationDecorator, final Function0<Unit> onPreAuthToolTipClicked, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(onPreAuthToolTipClicked, "onPreAuthToolTipClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(918119645);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(orderConfirmationDecorator) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(onPreAuthToolTipClicked) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(918119645, i11, -1, "com.meijer.mobile.meijer.activity.checkout.confirmation.OrderCardDetailSection (OrderCardDetailSection.kt:40)");
            }
            C16453n.e(localThemeScope, new q1.Column(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), null, null, 6, null), ComposableLambdaKt.c(1941101863, true, new b(localThemeScope, orderConfirmationDecorator, onPreAuthToolTipClicked), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f17314g | 384 | (q1.Column.f142240d << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.checkout.confirmation.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C11908d.h(localThemeScope, orderConfirmationDecorator, onPreAuthToolTipClicked, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, OrderConfirmationDecorator orderConfirmationDecorator, Function0 function0, int i10, Composer composer, int i11) {
        g(localThemeScope, orderConfirmationDecorator, function0, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }
}
