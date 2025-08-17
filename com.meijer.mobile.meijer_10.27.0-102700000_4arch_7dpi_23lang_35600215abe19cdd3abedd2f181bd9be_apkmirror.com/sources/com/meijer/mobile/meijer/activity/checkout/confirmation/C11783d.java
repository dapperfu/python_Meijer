package com.meijer.mobile.meijer.activity.checkout.confirmation;

import Ji.C;
import Ji.LocalThemeScope;
import ak.AbstractC5607a;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import ck.C6408b;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.activity.checkout.confirmation.C11783d;
import com.meijer.mobile.meijer.activity.checkout.review.T1;
import j0.InterfaceC14800I;
import j0.InterfaceC14814f;
import ji.q1;
import kotlin.C17917Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.C16088n;
import pi.C16307b;
import r1.C16705m;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a+\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001aW\u0010\u0010\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LJi/M;", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p;", "order", "Lkotlin/Function0;", "", "onPreAuthToolTipClicked", "g", "(LJi/M;Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "LJi/C$g;", "cardIcon", "Lak/a;", "cardTotal", "cardEndingNumber", "cardBalance", "temporaryHold", "onToolTipClicked", "d", "(LJi/M;LJi/C$g;Lak/a;Lak/a;Lak/a;Lak/a;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.checkout.confirmation.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11783d {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.confirmation.d$a */
    static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f102137a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C.g f102138b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f102139c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f102140d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f102141e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f102142f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f102143g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f102144h;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.confirmation.d$a$a, reason: collision with other inner class name */
        static final class C1433a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f102145a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC5607a f102146b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC5607a f102147c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ AbstractC5607a f102148d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ AbstractC5607a f102149e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f102150f;

            C1433a(LocalThemeScope localThemeScope, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3, AbstractC5607a abstractC5607a4, Function0<Unit> function0) {
                this.f102145a = localThemeScope;
                this.f102146b = abstractC5607a;
                this.f102147c = abstractC5607a2;
                this.f102148d = abstractC5607a3;
                this.f102149e = abstractC5607a4;
                this.f102150f = function0;
            }

            public final void a(InterfaceC14814f AdsColumn, Composer composer, int i10) {
                Intrinsics.j(AdsColumn, "$this$AdsColumn");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1827487648, i10, -1, "com.meijer.mobile.meijer.activity.checkout.confirmation.CardSection.<anonymous>.<anonymous> (OrderCardDetailSection.kt:124)");
                }
                LocalThemeScope localThemeScope = this.f102145a;
                Ji.I eight = localThemeScope.getAdsTypography().getHeadings().getEight();
                Ji.T adsColorText01 = this.f102145a.getAdsColors().getAdsColorText01();
                Modifier.Companion companion = Modifier.INSTANCE;
                float f10 = 4;
                q1.Label label = new q1.Label(FullStoryAnnotationsKt.fsMask(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, 0.0f, H1.h.p(f10), 7, null)), adsColorText01, null, null, 0, false, 0, eight, null, 380, null);
                AbstractC5607a abstractC5607a = this.f102146b;
                int i11 = AbstractC5607a.f45514b;
                String strA = C6408b.a(abstractC5607a, composer, i11);
                int i12 = LocalThemeScope.f15770g;
                int i13 = q1.Label.f140080j;
                ri.j.h(localThemeScope, label, strA, null, composer, (i13 << 3) | i12, 4);
                LocalThemeScope localThemeScope2 = this.f102145a;
                ri.j.h(localThemeScope2, new q1.Label(null, this.f102145a.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getBody().getTwo(), null, 381, null), C6408b.a(this.f102147c, composer, i11), null, composer, i12 | (i13 << 3), 4);
                composer.startReplaceGroup(426015715);
                if (this.f102148d != null) {
                    LocalThemeScope localThemeScope3 = this.f102145a;
                    ri.j.h(localThemeScope3, new q1.Label(null, this.f102145a.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope3.getAdsTypography().getBody().getTwo(), null, 381, null), C6408b.a(this.f102148d, composer, i11), null, composer, i12 | (i13 << 3), 4);
                }
                composer.P();
                if (this.f102149e != null) {
                    LocalThemeScope localThemeScope4 = this.f102145a;
                    Modifier modifierM = androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), 0.0f, H1.h.p(f10), 0.0f, 0.0f, 13, null);
                    AbstractC5607a abstractC5607a2 = this.f102149e;
                    Am.X.b(localThemeScope4, modifierM, null, abstractC5607a2, this.f102150f, abstractC5607a2, composer, i12 | 48 | (i11 << 9) | (i11 << 15), 2);
                }
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

        a(LocalThemeScope localThemeScope, C.g gVar, String str, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3, AbstractC5607a abstractC5607a4, Function0<Unit> function0) {
            this.f102137a = localThemeScope;
            this.f102138b = gVar;
            this.f102139c = str;
            this.f102140d = abstractC5607a;
            this.f102141e = abstractC5607a2;
            this.f102142f = abstractC5607a3;
            this.f102143g = abstractC5607a4;
            this.f102144h = function0;
        }

        public final void a(InterfaceC14800I AdsRow, Composer composer, int i10) {
            Intrinsics.j(AdsRow, "$this$AdsRow");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(10350826, i10, -1, "com.meijer.mobile.meijer.activity.checkout.confirmation.CardSection.<anonymous> (OrderCardDetailSection.kt:111)");
            }
            LocalThemeScope localThemeScope = this.f102137a;
            q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(this.f102138b, this.f102139c, null, null, 0.0f, null, null, 124, null);
            int i11 = LocalThemeScope.f15770g;
            C16307b.b(localThemeScope, drawableIcon, null, null, composer, i11 | (q1.h.DrawableIcon.f140067h << 3), 6);
            C16088n.e(this.f102137a, new q1.Column(FullStoryAnnotationsKt.fsMask(androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, H1.h.p(8), 0.0f, 0.0f, 0.0f, 14, null)), null, null, 6, null), ComposableLambdaKt.c(-1827487648, true, new C1433a(this.f102137a, this.f102140d, this.f102141e, this.f102142f, this.f102143g, this.f102144h), composer, 54), composer, i11 | 384 | (q1.Column.f139985d << 3));
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
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.confirmation.d$b */
    static final class b implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f102151a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ OrderConfirmationDecorator f102152b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f102153c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.confirmation.d$b$a */
        static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f102154a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ OrderConfirmationDecorator f102155b;

            a(LocalThemeScope localThemeScope, OrderConfirmationDecorator orderConfirmationDecorator) {
                this.f102154a = localThemeScope;
                this.f102155b = orderConfirmationDecorator;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(r1.u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                r1.s.v(semantics);
                return Unit.f142422a;
            }

            public final void b(InterfaceC14800I AdsRow, Composer composer, int i10) {
                Intrinsics.j(AdsRow, "$this$AdsRow");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-191127193, i10, -1, "com.meijer.mobile.meijer.activity.checkout.confirmation.OrderCardDetailSection.<anonymous>.<anonymous> (OrderCardDetailSection.kt:57)");
                }
                LocalThemeScope localThemeScope = this.f102154a;
                Ji.I seven = localThemeScope.getAdsTypography().getHeadings().getSeven();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.confirmation.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C11783d.b.a.c((r1.u) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                q1.Label label = new q1.Label(C16705m.d(companion, false, (Function1) objB, 1, null), null, null, null, 0, false, 0, seven, null, 382, null);
                OrderConfirmationDecorator orderConfirmationDecorator = this.f102155b;
                ri.j.h(localThemeScope, label, C6408b.a(orderConfirmationDecorator != null ? orderConfirmationDecorator.getOrderTotalAtCheckout() : null, composer, AbstractC5607a.f45514b), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.confirmation.d$b$b, reason: collision with other inner class name */
        static final class C1434b implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ OrderConfirmationDecorator f102156a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f102157b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f102158c;

            C1434b(OrderConfirmationDecorator orderConfirmationDecorator, LocalThemeScope localThemeScope, Function0<Unit> function0) {
                this.f102156a = orderConfirmationDecorator;
                this.f102157b = localThemeScope;
                this.f102158c = function0;
            }

            public final void a(InterfaceC14814f AdsColumn, Composer composer, int i10) {
                Intrinsics.j(AdsColumn, "$this$AdsColumn");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(589715869, i10, -1, "com.meijer.mobile.meijer.activity.checkout.confirmation.OrderCardDetailSection.<anonymous>.<anonymous> (OrderCardDetailSection.kt:75)");
                }
                composer.startReplaceGroup(-218732181);
                OrderConfirmationDecorator orderConfirmationDecorator = this.f102156a;
                if (orderConfirmationDecorator != null && orderConfirmationDecorator.getIsEBTOrder()) {
                    LocalThemeScope localThemeScope = this.f102157b;
                    C.g.f fVar = C.g.f.f15532e;
                    AbstractC5607a ebtTotal = this.f102156a.getEbtTotal();
                    AbstractC5607a ebtCardEndingNumber = this.f102156a.getEbtCardEndingNumber();
                    AbstractC5607a ebtCardBalance = this.f102156a.getEbtCardBalance();
                    int i11 = LocalThemeScope.f15770g | (C.g.f.f15533f << 3);
                    int i12 = AbstractC5607a.f45514b;
                    C11783d.d(localThemeScope, fVar, ebtTotal, ebtCardEndingNumber, ebtCardBalance, null, null, composer, i11 | (i12 << 6) | (i12 << 9) | (i12 << 12), 48);
                }
                composer.P();
                LocalThemeScope localThemeScope2 = this.f102157b;
                OrderConfirmationDecorator orderConfirmationDecorator2 = this.f102156a;
                C.g gVarB = T1.b(orderConfirmationDecorator2 != null ? orderConfirmationDecorator2.getCreditCardType() : null);
                OrderConfirmationDecorator orderConfirmationDecorator3 = this.f102156a;
                AbstractC5607a creditDebitCardTotal = orderConfirmationDecorator3 != null ? orderConfirmationDecorator3.getCreditDebitCardTotal() : null;
                OrderConfirmationDecorator orderConfirmationDecorator4 = this.f102156a;
                AbstractC5607a cardEndingNumber = orderConfirmationDecorator4 != null ? orderConfirmationDecorator4.getCardEndingNumber() : null;
                OrderConfirmationDecorator orderConfirmationDecorator5 = this.f102156a;
                AbstractC5607a temporaryHold = orderConfirmationDecorator5 != null ? orderConfirmationDecorator5.getTemporaryHold() : null;
                Function0<Unit> function0 = this.f102158c;
                int i13 = LocalThemeScope.f15770g | (C.g.f15525d << 3);
                int i14 = AbstractC5607a.f45514b;
                C11783d.d(localThemeScope2, gVarB, creditDebitCardTotal, cardEndingNumber, null, temporaryHold, function0, composer, i13 | (i14 << 6) | (i14 << 9) | (i14 << 15), 8);
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

        b(LocalThemeScope localThemeScope, OrderConfirmationDecorator orderConfirmationDecorator, Function0<Unit> function0) {
            this.f102151a = localThemeScope;
            this.f102152b = orderConfirmationDecorator;
            this.f102153c = function0;
        }

        public final void a(InterfaceC14814f AdsColumn, Composer composer, int i10) {
            Intrinsics.j(AdsColumn, "$this$AdsColumn");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1941101863, i10, -1, "com.meijer.mobile.meijer.activity.checkout.confirmation.OrderCardDetailSection.<anonymous> (OrderCardDetailSection.kt:48)");
            }
            C17917Z.a(null, this.f102151a.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
            LocalThemeScope localThemeScope = this.f102151a;
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 16;
            q1.Row row = new q1.Row(androidx.compose.foundation.layout.D.m(androidx.compose.foundation.b.d(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), this.f102151a.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null), H1.h.p(f10), H1.h.p(24), 0.0f, H1.h.p(f10), 4, null), null, null, 6, null);
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(-191127193, true, new a(this.f102151a, this.f102152b), composer, 54);
            int i11 = LocalThemeScope.f15770g;
            C16088n.i(localThemeScope, row, composableLambdaC, composer, i11 | 384 | (q1.Row.f140137d << 3));
            C17917Z.a(null, this.f102151a.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
            C16088n.e(this.f102151a, new q1.Column(androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), H1.h.p(f10), 0.0f, H1.h.p(f10), H1.h.p(f10), 2, null), null, null, 6, null), ComposableLambdaKt.c(589715869, true, new C1434b(this.f102152b, this.f102151a, this.f102153c), composer, 54), composer, i11 | 384 | (q1.Column.f139985d << 3));
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
    public static final void d(final Ji.LocalThemeScope r23, final Ji.C.g r24, final ak.AbstractC5607a r25, final ak.AbstractC5607a r26, ak.AbstractC5607a r27, ak.AbstractC5607a r28, kotlin.jvm.functions.Function0<kotlin.Unit> r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.confirmation.C11783d.d(Ji.M, Ji.C$g, ak.a, ak.a, ak.a, ak.a, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, C.g gVar, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3, AbstractC5607a abstractC5607a4, Function0 function0, int i10, int i11, Composer composer, int i12) {
        d(localThemeScope, gVar, abstractC5607a, abstractC5607a2, abstractC5607a3, abstractC5607a4, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
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
            C16088n.e(localThemeScope, new q1.Column(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), null, null, 6, null), ComposableLambdaKt.c(1941101863, true, new b(localThemeScope, orderConfirmationDecorator, onPreAuthToolTipClicked), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f15770g | 384 | (q1.Column.f139985d << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.checkout.confirmation.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C11783d.h(localThemeScope, orderConfirmationDecorator, onPreAuthToolTipClicked, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, OrderConfirmationDecorator orderConfirmationDecorator, Function0 function0, int i10, Composer composer, int i11) {
        g(localThemeScope, orderConfirmationDecorator, function0, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }
}
