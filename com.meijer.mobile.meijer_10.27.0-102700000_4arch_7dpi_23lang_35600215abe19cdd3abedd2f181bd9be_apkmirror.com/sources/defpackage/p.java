package defpackage;

import Co.ProductFullDetails;
import Ji.C;
import Ji.I;
import Ji.LocalThemeScope;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import cr.ProductInfo;
import cr.SubscriptionDetails;
import j0.C14802K;
import j0.InterfaceC14800I;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kr.C15307d;
import ni.N;
import ni.P0;
import oi.C16088n;
import p1.C16193g;
import pi.C16307b;
import pr.EnumC16365b;
import pr.SubscriptionSummaryDecorator;
import ri.j;
import vk.C17590a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aG\u0010\u000b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\bH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u00020\u0006*\u00020\u0000H\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\u000e\u0010\u0010\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Lpr/c;", "subscriptionSummary", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onShowMoreInfo", "Lkotlin/Function1;", "Lpr/a;", "onAction", "f", "(LJi/M;Lpr/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "d", "(LJi/M;Landroidx/compose/runtime/Composer;I)V", "", "lastAction", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class p {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155260a;

        a(LocalThemeScope localThemeScope) {
            this.f155260a = localThemeScope;
        }

        public final void a(InterfaceC14800I AdsRow, Composer composer, int i10) {
            Intrinsics.j(AdsRow, "$this$AdsRow");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-693551024, i10, -1, "InformationalContent.<anonymous> (ProductSubscription.kt:274)");
            }
            LocalThemeScope localThemeScope = this.f155260a;
            q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.b.h.c.f15464e, null, null, null, 0.0f, null, null, 126, null);
            int i11 = LocalThemeScope.f15770g;
            C16307b.b(localThemeScope, drawableIcon, null, null, composer, i11 | (q1.h.DrawableIcon.f140067h << 3), 6);
            C14802K.a(J.z(Modifier.INSTANCE, this.f155260a.getAdsSpacing().getThree().getDp()), composer, 0);
            j.h(this.f155260a, new q1.Label(null, null, null, null, 0, false, 0, this.f155260a.getAdsTypography().getBody().getOne(), null, 383, null), C16193g.c(C15307d.f147844K, composer, 0), null, composer, i11 | (q1.Label.f140080j << 3), 4);
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
    static final class b implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155262a;

        b(LocalThemeScope localThemeScope) {
            this.f155262a = localThemeScope;
        }

        public final void a(InterfaceC14800I AdsRow, Composer composer, int i10) {
            Intrinsics.j(AdsRow, "$this$AdsRow");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-611658617, i10, -1, "InformationalContent.<anonymous> (ProductSubscription.kt:287)");
            }
            LocalThemeScope localThemeScope = this.f155262a;
            q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.a.C3837i.f15345e, null, null, null, 0.0f, null, null, 126, null);
            int i11 = LocalThemeScope.f15770g;
            C16307b.b(localThemeScope, drawableIcon, null, null, composer, i11 | (q1.h.DrawableIcon.f140067h << 3), 6);
            C14802K.a(J.z(Modifier.INSTANCE, this.f155262a.getAdsSpacing().getThree().getDp()), composer, 0);
            j.h(this.f155262a, new q1.Label(null, null, null, null, 0, false, 0, this.f155262a.getAdsTypography().getBody().getOne(), null, 383, null), C16193g.c(C15307d.f147891p0, composer, 0), null, composer, i11 | (q1.Label.f140080j << 3), 4);
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
    static final class c implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155276a;

        c(LocalThemeScope localThemeScope) {
            this.f155276a = localThemeScope;
        }

        public final void a(InterfaceC14800I AdsRow, Composer composer, int i10) {
            Intrinsics.j(AdsRow, "$this$AdsRow");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1242686920, i10, -1, "InformationalContent.<anonymous> (ProductSubscription.kt:300)");
            }
            LocalThemeScope localThemeScope = this.f155276a;
            q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.a.C3841m.f15350e, null, null, null, 0.0f, null, null, 126, null);
            int i11 = LocalThemeScope.f15770g;
            C16307b.b(localThemeScope, drawableIcon, null, null, composer, i11 | (q1.h.DrawableIcon.f140067h << 3), 6);
            C14802K.a(J.z(Modifier.INSTANCE, this.f155276a.getAdsSpacing().getThree().getDp()), composer, 0);
            j.h(this.f155276a, new q1.Label(null, null, null, null, 0, false, 0, this.f155276a.getAdsTypography().getBody().getOne(), null, 383, null), C16193g.c(C15307d.f147828B0, composer, 0), null, composer, i11 | (q1.Label.f140080j << 3), 4);
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
    static final class d implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155277a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ EnumC16365b f155278b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f155279c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ProductFullDetails f155280d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f155281e;

        d(LocalThemeScope localThemeScope, EnumC16365b enumC16365b, String str, ProductFullDetails productFullDetails, Function0<Unit> function0) {
            this.f155277a = localThemeScope;
            this.f155278b = enumC16365b;
            this.f155279c = str;
            this.f155280d = productFullDetails;
            this.f155281e = function0;
        }

        public final void a(InterfaceC14800I AdsRow, Composer composer, int i10) {
            int i11;
            Intrinsics.j(AdsRow, "$this$AdsRow");
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer.V(AdsRow) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1873095516, i11, -1, "ProductSubscription.<anonymous>.<anonymous>.<anonymous> (ProductSubscription.kt:99)");
            }
            LocalThemeScope localThemeScope = this.f155277a;
            I six = localThemeScope.getAdsTypography().getHeadings().getSix();
            Modifier.Companion companion = Modifier.INSTANCE;
            q1.Label label = new q1.Label(InterfaceC14800I.b(AdsRow, companion, 1.0f, false, 2, null), null, null, null, 0, false, 2, six, null, 318, null);
            String name = this.f155278b == EnumC16365b.f156296d ? this.f155279c : this.f155280d.getName();
            int i12 = LocalThemeScope.f15770g;
            j.h(localThemeScope, label, name, null, composer, i12 | (q1.Label.f140080j << 3), 4);
            P0.i(this.f155277a, N.f151529a, this.f155281e, C.i.h.f15557d, C16193g.c(C15307d.f147853T, composer, 0), AdsRow.d(companion, P0.e.INSTANCE.l()), false, false, 0L, composer, (N.f151530b << 3) | i12 | (C.i.h.f15558e << 9), 224);
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
    static final class e implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ EnumC16365b f155282a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155283b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f155284c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ SubscriptionDetails f155285d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f155286e;

        e(EnumC16365b enumC16365b, LocalThemeScope localThemeScope, String str, SubscriptionDetails subscriptionDetails, Function0<Unit> function0) {
            this.f155282a = enumC16365b;
            this.f155283b = localThemeScope;
            this.f155284c = str;
            this.f155285d = subscriptionDetails;
            this.f155286e = function0;
        }

        public final void a(InterfaceC14800I AdsRow, Composer composer, int i10) {
            int i11;
            Composer composer2;
            String productName;
            Intrinsics.j(AdsRow, "$this$AdsRow");
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer.V(AdsRow) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-353832603, i11, -1, "ProductSubscription.<anonymous>.<anonymous>.<anonymous> (ProductSubscription.kt:127)");
            }
            composer.startReplaceGroup(-730713839);
            EnumC16365b enumC16365b = this.f155282a;
            EnumC16365b enumC16365b2 = EnumC16365b.f156296d;
            if (enumC16365b == enumC16365b2) {
                C16307b.b(this.f155283b, new q1.h.DrawableIcon(C.i.b.f15549d, null, null, null, 0.0f, null, null, 126, null), null, null, composer, LocalThemeScope.f15770g | (q1.h.DrawableIcon.f140067h << 3), 6);
                composer2 = composer;
                C14802K.a(D.m(Modifier.INSTANCE, 0.0f, 0.0f, this.f155283b.getAdsSpacing().getThree().getDp(), 0.0f, 11, null), composer2, 0);
            } else {
                composer2 = composer;
            }
            composer2.P();
            LocalThemeScope localThemeScope = this.f155283b;
            I six = localThemeScope.getAdsTypography().getHeadings().getSix();
            Modifier.Companion companion = Modifier.INSTANCE;
            q1.Label label = new q1.Label(InterfaceC14800I.b(AdsRow, companion, 1.0f, false, 2, null), null, null, null, 0, false, 2, six, null, 318, null);
            if (this.f155282a == enumC16365b2) {
                productName = this.f155284c;
            } else {
                productName = this.f155285d.getProductInfo().getProductName();
                if (productName == null) {
                    productName = "";
                }
            }
            String str = productName;
            int i12 = LocalThemeScope.f15770g;
            Composer composer3 = composer2;
            j.h(localThemeScope, label, str, null, composer3, i12 | (q1.Label.f140080j << 3), 4);
            P0.i(this.f155283b, N.f151529a, this.f155286e, C.i.h.f15557d, C16193g.c(C15307d.f147853T, composer3, 0), AdsRow.d(companion, P0.e.INSTANCE.l()), false, false, 0L, composer, (N.f151530b << 3) | i12 | (C.i.h.f15558e << 9), 224);
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
    static final class f implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ SubscriptionDetails f155287a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ProductFullDetails f155288b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155289c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ EnumC16365b f155290d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f155291e;

        f(SubscriptionDetails subscriptionDetails, ProductFullDetails productFullDetails, LocalThemeScope localThemeScope, EnumC16365b enumC16365b, String str) {
            this.f155287a = subscriptionDetails;
            this.f155288b = productFullDetails;
            this.f155289c = localThemeScope;
            this.f155290d = enumC16365b;
            this.f155291e = str;
        }

        public final void a(Composer composer, int i10) {
            String formattedValue;
            ProductInfo productInfo;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-553730760, i10, -1, "ProductSubscription.<anonymous>.<anonymous>.<anonymous> (ProductSubscription.kt:162)");
            }
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f155287a) | composer.V(this.f155288b);
            SubscriptionDetails subscriptionDetails = this.f155287a;
            ProductFullDetails productFullDetails = this.f155288b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                if (subscriptionDetails == null || (productInfo = subscriptionDetails.getProductInfo()) == null || (formattedValue = productInfo.getProductPrice()) == null) {
                    formattedValue = productFullDetails.getPrice().getFormattedValue();
                }
                objB = formattedValue;
                composer.t(objB);
            }
            composer.P();
            LocalThemeScope localThemeScope = this.f155289c;
            q1.Label label = new q1.Label(null, this.f155289c.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getValues().getTwo(), null, 381, null);
            int i11 = LocalThemeScope.f15770g;
            int i12 = q1.Label.f140080j;
            j.h(localThemeScope, label, (String) objB, null, composer, i11 | (i12 << 3), 4);
            EnumC16365b enumC16365b = this.f155290d;
            if (enumC16365b == EnumC16365b.f156294b || enumC16365b == EnumC16365b.f156296d) {
                C14802K.a(J.z(Modifier.INSTANCE, this.f155289c.getAdsSpacing().getFour().getDp()), composer, 0);
                LocalThemeScope localThemeScope2 = this.f155289c;
                j.h(localThemeScope2, new q1.Label(null, this.f155289c.getAdsColors().getAdsColorText01(), null, F1.j.h(F1.j.INSTANCE.a()), 0, false, 0, localThemeScope2.getAdsTypography().getBody().getOne(), null, 373, null), this.f155291e, null, composer, i11 | (i12 << 3), 4);
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
    static final class g implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155292a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SubscriptionDetails f155293b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f155294a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ SubscriptionDetails f155295b;

            a(LocalThemeScope localThemeScope, SubscriptionDetails subscriptionDetails) {
                this.f155294a = localThemeScope;
                this.f155295b = subscriptionDetails;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(739289288, i10, -1, "ProductSubscription.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductSubscription.kt:208)");
                }
                LocalThemeScope localThemeScope = this.f155294a;
                q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, this.f155294a.getAdsTypography().getBody().getOne(), null, 383, null);
                String str = this.f155295b.getNextOrderDate().format(C17590a.f164803a.o());
                Intrinsics.i(str, "format(...)");
                j.h(localThemeScope, label, str, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

        g(LocalThemeScope localThemeScope, SubscriptionDetails subscriptionDetails) {
            this.f155292a = localThemeScope;
            this.f155293b = subscriptionDetails;
        }

        public final void a(InterfaceC14800I AdsRow, Composer composer, int i10) {
            Intrinsics.j(AdsRow, "$this$AdsRow");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1341437276, i10, -1, "ProductSubscription.<anonymous>.<anonymous>.<anonymous> (ProductSubscription.kt:202)");
            }
            j.h(this.f155292a, new q1.Label(null, null, null, null, 0, false, 0, this.f155292a.getAdsTypography().getHeadings().getSeven(), null, 383, null), C16193g.c(C15307d.f147861a0, composer, 0), null, composer, (q1.Label.f140080j << 3) | LocalThemeScope.f15770g, 4);
            C14802K.a(J.z(Modifier.INSTANCE, this.f155292a.getAdsSpacing().getThree().getDp()), composer, 0);
            kotlin.g.e(null, 0.0f, ComposableLambdaKt.c(739289288, true, new a(this.f155292a, this.f155293b), composer, 54), composer, 384, 3);
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
    static final class h implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155296a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SubscriptionDetails f155297b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f155298a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ SubscriptionDetails f155299b;

            a(LocalThemeScope localThemeScope, SubscriptionDetails subscriptionDetails) {
                this.f155298a = localThemeScope;
                this.f155299b = subscriptionDetails;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(267152255, i10, -1, "ProductSubscription.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductSubscription.kt:224)");
                }
                j.h(this.f155298a, new q1.Label(null, null, null, null, 0, false, 0, this.f155298a.getAdsTypography().getBody().getOne(), null, 383, null), C16193g.d(C15307d.f147841I, new Object[]{Integer.valueOf(this.f155299b.getDeliveryFrequency()), this.f155299b.getDeliveryFrequencyUnit()}, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

        h(LocalThemeScope localThemeScope, SubscriptionDetails subscriptionDetails) {
            this.f155296a = localThemeScope;
            this.f155297b = subscriptionDetails;
        }

        public final void a(InterfaceC14800I AdsRow, Composer composer, int i10) {
            Intrinsics.j(AdsRow, "$this$AdsRow");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-889216237, i10, -1, "ProductSubscription.<anonymous>.<anonymous>.<anonymous> (ProductSubscription.kt:218)");
            }
            j.h(this.f155296a, new q1.Label(null, null, null, null, 0, false, 0, this.f155296a.getAdsTypography().getHeadings().getSeven(), null, 383, null), C16193g.c(C15307d.f147839H, composer, 0), null, composer, (q1.Label.f140080j << 3) | LocalThemeScope.f15770g, 4);
            C14802K.a(J.z(Modifier.INSTANCE, this.f155296a.getAdsSpacing().getThree().getDp()), composer, 0);
            kotlin.g.e(null, 0.0f, ComposableLambdaKt.c(267152255, true, new a(this.f155296a, this.f155297b), composer, 54), composer, 384, 3);
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
    static final class i implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155300a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SubscriptionDetails f155301b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f155302a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ SubscriptionDetails f155303b;

            a(LocalThemeScope localThemeScope, SubscriptionDetails subscriptionDetails) {
                this.f155302a = localThemeScope;
                this.f155303b = subscriptionDetails;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-797814976, i10, -1, "ProductSubscription.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductSubscription.kt:242)");
                }
                j.h(this.f155302a, new q1.Label(null, null, null, null, 0, false, 0, this.f155302a.getAdsTypography().getBody().getOne(), null, 383, null), String.valueOf(this.f155303b.getProductInfo().getProductQty()), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

        i(LocalThemeScope localThemeScope, SubscriptionDetails subscriptionDetails) {
            this.f155300a = localThemeScope;
            this.f155301b = subscriptionDetails;
        }

        public final void a(InterfaceC14800I AdsRow, Composer composer, int i10) {
            Intrinsics.j(AdsRow, "$this$AdsRow");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1954183468, i10, -1, "ProductSubscription.<anonymous>.<anonymous>.<anonymous> (ProductSubscription.kt:236)");
            }
            j.h(this.f155300a, new q1.Label(null, null, null, null, 0, false, 0, this.f155300a.getAdsTypography().getHeadings().getSeven(), null, 383, null), C16193g.c(C15307d.f147881k0, composer, 0), null, composer, (q1.Label.f140080j << 3) | LocalThemeScope.f15770g, 4);
            C14802K.a(J.z(Modifier.INSTANCE, this.f155300a.getAdsSpacing().getFive().getDp()), composer, 0);
            kotlin.g.e(null, 0.0f, ComposableLambdaKt.c(-797814976, true, new a(this.f155300a, this.f155301b), composer, 54), composer, 384, 3);
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

    /* JADX WARN: Removed duplicated region for block: B:100:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x028f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final Ji.LocalThemeScope r34, final pr.SubscriptionSummaryDecorator r35, androidx.compose.ui.Modifier r36, final kotlin.jvm.functions.Function0<kotlin.Unit> r37, final kotlin.jvm.functions.Function1<? super pr.AbstractC16364a, kotlin.Unit> r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 1399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p.f(Ji.M, pr.c, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final void d(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-478147440);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-478147440, i11, -1, "InformationalContent (ProductSubscription.kt:272)");
            }
            q1.Row row = new q1.Row(null, null, null, 7, null);
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(-693551024, true, new a(localThemeScope), composerStartRestartGroup, 54);
            int i12 = LocalThemeScope.f15770g;
            int i13 = i11 & 14;
            int i14 = q1.Row.f140137d;
            C16088n.i(localThemeScope, row, composableLambdaC, composerStartRestartGroup, i12 | 384 | i13 | (i14 << 3));
            Modifier.Companion companion = Modifier.INSTANCE;
            C14802K.a(J.i(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composerStartRestartGroup, 0);
            C16088n.i(localThemeScope, new q1.Row(null, null, null, 7, null), ComposableLambdaKt.c(-611658617, true, new b(localThemeScope), composerStartRestartGroup, 54), composerStartRestartGroup, i12 | 384 | i13 | (i14 << 3));
            C14802K.a(J.i(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composerStartRestartGroup, 0);
            C16088n.i(localThemeScope, new q1.Row(null, null, null, 7, null), ComposableLambdaKt.c(1242686920, true, new c(localThemeScope), composerStartRestartGroup, 54), composerStartRestartGroup, i13 | i12 | 384 | (i14 << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return p.e(localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        d(localThemeScope, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, SubscriptionSummaryDecorator subscriptionSummaryDecorator, Modifier modifier, Function0 function0, Function1 function1, int i10, int i11, Composer composer, int i12) {
        f(localThemeScope, subscriptionSummaryDecorator, modifier, function0, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(Function1 function1, SubscriptionSummaryDecorator subscriptionSummaryDecorator) {
        function1.invoke(subscriptionSummaryDecorator.getAction());
        return Unit.f142422a;
    }
}
