package defpackage;

import Co.ProductFullDetails;
import Ki.C;
import Ki.I;
import Ki.LocalThemeScope;
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
import j0.C14890K;
import j0.InterfaceC14888I;
import ki.q1;
import kotlin.C4107g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kr.C15410d;
import oi.N;
import oi.P0;
import p1.C16338g;
import pi.C16453n;
import pr.EnumC16491b;
import pr.SubscriptionSummaryDecorator;
import qi.C16671b;
import si.j;
import wk.C17898a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aG\u0010\u000b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\bH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u00020\u0006*\u00020\u0000H\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\u000e\u0010\u0010\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Lpr/c;", "subscriptionSummary", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onShowMoreInfo", "Lkotlin/Function1;", "Lpr/a;", "onAction", "f", "(LKi/M;Lpr/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "d", "(LKi/M;Landroidx/compose/runtime/Composer;I)V", "", "lastAction", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class p {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155934a;

        a(LocalThemeScope localThemeScope) {
            this.f155934a = localThemeScope;
        }

        public final void a(InterfaceC14888I AdsRow, Composer composer, int i10) {
            Intrinsics.j(AdsRow, "$this$AdsRow");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-693551024, i10, -1, "InformationalContent.<anonymous> (ProductSubscription.kt:274)");
            }
            LocalThemeScope localThemeScope = this.f155934a;
            q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.b.h.c.f17008e, null, null, null, 0.0f, null, null, 126, null);
            int i11 = LocalThemeScope.f17314g;
            C16671b.b(localThemeScope, drawableIcon, null, null, composer, i11 | (q1.h.DrawableIcon.f142322h << 3), 6);
            C14890K.a(J.z(Modifier.INSTANCE, this.f155934a.getAdsSpacing().getThree().getDp()), composer, 0);
            j.h(this.f155934a, new q1.Label(null, null, null, null, 0, false, 0, this.f155934a.getAdsTypography().getBody().getOne(), null, 383, null), C16338g.c(C15410d.f148753K, composer, 0), null, composer, i11 | (q1.Label.f142335j << 3), 4);
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
    static final class b implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155936a;

        b(LocalThemeScope localThemeScope) {
            this.f155936a = localThemeScope;
        }

        public final void a(InterfaceC14888I AdsRow, Composer composer, int i10) {
            Intrinsics.j(AdsRow, "$this$AdsRow");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-611658617, i10, -1, "InformationalContent.<anonymous> (ProductSubscription.kt:287)");
            }
            LocalThemeScope localThemeScope = this.f155936a;
            q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.a.C3923i.f16889e, null, null, null, 0.0f, null, null, 126, null);
            int i11 = LocalThemeScope.f17314g;
            C16671b.b(localThemeScope, drawableIcon, null, null, composer, i11 | (q1.h.DrawableIcon.f142322h << 3), 6);
            C14890K.a(J.z(Modifier.INSTANCE, this.f155936a.getAdsSpacing().getThree().getDp()), composer, 0);
            j.h(this.f155936a, new q1.Label(null, null, null, null, 0, false, 0, this.f155936a.getAdsTypography().getBody().getOne(), null, 383, null), C16338g.c(C15410d.f148801p0, composer, 0), null, composer, i11 | (q1.Label.f142335j << 3), 4);
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
    static final class c implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155950a;

        c(LocalThemeScope localThemeScope) {
            this.f155950a = localThemeScope;
        }

        public final void a(InterfaceC14888I AdsRow, Composer composer, int i10) {
            Intrinsics.j(AdsRow, "$this$AdsRow");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1242686920, i10, -1, "InformationalContent.<anonymous> (ProductSubscription.kt:300)");
            }
            LocalThemeScope localThemeScope = this.f155950a;
            q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.a.C3927m.f16894e, null, null, null, 0.0f, null, null, 126, null);
            int i11 = LocalThemeScope.f17314g;
            C16671b.b(localThemeScope, drawableIcon, null, null, composer, i11 | (q1.h.DrawableIcon.f142322h << 3), 6);
            C14890K.a(J.z(Modifier.INSTANCE, this.f155950a.getAdsSpacing().getThree().getDp()), composer, 0);
            j.h(this.f155950a, new q1.Label(null, null, null, null, 0, false, 0, this.f155950a.getAdsTypography().getBody().getOne(), null, 383, null), C16338g.c(C15410d.f148740D0, composer, 0), null, composer, i11 | (q1.Label.f142335j << 3), 4);
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
    static final class d implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155951a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ EnumC16491b f155952b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f155953c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ProductFullDetails f155954d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f155955e;

        d(LocalThemeScope localThemeScope, EnumC16491b enumC16491b, String str, ProductFullDetails productFullDetails, Function0<Unit> function0) {
            this.f155951a = localThemeScope;
            this.f155952b = enumC16491b;
            this.f155953c = str;
            this.f155954d = productFullDetails;
            this.f155955e = function0;
        }

        public final void a(InterfaceC14888I AdsRow, Composer composer, int i10) {
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
            LocalThemeScope localThemeScope = this.f155951a;
            I six = localThemeScope.getAdsTypography().getHeadings().getSix();
            Modifier.Companion companion = Modifier.INSTANCE;
            q1.Label label = new q1.Label(InterfaceC14888I.b(AdsRow, companion, 1.0f, false, 2, null), null, null, null, 0, false, 2, six, null, 318, null);
            String name = this.f155952b == EnumC16491b.f157069d ? this.f155953c : this.f155954d.getName();
            int i12 = LocalThemeScope.f17314g;
            j.h(localThemeScope, label, name, null, composer, i12 | (q1.Label.f142335j << 3), 4);
            P0.i(this.f155951a, N.f153988a, this.f155955e, C.i.h.f17101d, C16338g.c(C15410d.f148763T, composer, 0), AdsRow.d(companion, P0.e.INSTANCE.l()), false, false, 0L, composer, (N.f153989b << 3) | i12 | (C.i.h.f17102e << 9), 224);
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
    static final class e implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ EnumC16491b f155956a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155957b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f155958c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ SubscriptionDetails f155959d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f155960e;

        e(EnumC16491b enumC16491b, LocalThemeScope localThemeScope, String str, SubscriptionDetails subscriptionDetails, Function0<Unit> function0) {
            this.f155956a = enumC16491b;
            this.f155957b = localThemeScope;
            this.f155958c = str;
            this.f155959d = subscriptionDetails;
            this.f155960e = function0;
        }

        public final void a(InterfaceC14888I AdsRow, Composer composer, int i10) {
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
            EnumC16491b enumC16491b = this.f155956a;
            EnumC16491b enumC16491b2 = EnumC16491b.f157069d;
            if (enumC16491b == enumC16491b2) {
                C16671b.b(this.f155957b, new q1.h.DrawableIcon(C.i.b.f17093d, null, null, null, 0.0f, null, null, 126, null), null, null, composer, LocalThemeScope.f17314g | (q1.h.DrawableIcon.f142322h << 3), 6);
                composer2 = composer;
                C14890K.a(D.m(Modifier.INSTANCE, 0.0f, 0.0f, this.f155957b.getAdsSpacing().getThree().getDp(), 0.0f, 11, null), composer2, 0);
            } else {
                composer2 = composer;
            }
            composer2.P();
            LocalThemeScope localThemeScope = this.f155957b;
            I six = localThemeScope.getAdsTypography().getHeadings().getSix();
            Modifier.Companion companion = Modifier.INSTANCE;
            q1.Label label = new q1.Label(InterfaceC14888I.b(AdsRow, companion, 1.0f, false, 2, null), null, null, null, 0, false, 2, six, null, 318, null);
            if (this.f155956a == enumC16491b2) {
                productName = this.f155958c;
            } else {
                productName = this.f155959d.getProductInfo().getProductName();
                if (productName == null) {
                    productName = "";
                }
            }
            String str = productName;
            int i12 = LocalThemeScope.f17314g;
            Composer composer3 = composer2;
            j.h(localThemeScope, label, str, null, composer3, i12 | (q1.Label.f142335j << 3), 4);
            P0.i(this.f155957b, N.f153988a, this.f155960e, C.i.h.f17101d, C16338g.c(C15410d.f148763T, composer3, 0), AdsRow.d(companion, P0.e.INSTANCE.l()), false, false, 0L, composer, (N.f153989b << 3) | i12 | (C.i.h.f17102e << 9), 224);
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
    static final class f implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ SubscriptionDetails f155961a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ProductFullDetails f155962b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155963c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ EnumC16491b f155964d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f155965e;

        f(SubscriptionDetails subscriptionDetails, ProductFullDetails productFullDetails, LocalThemeScope localThemeScope, EnumC16491b enumC16491b, String str) {
            this.f155961a = subscriptionDetails;
            this.f155962b = productFullDetails;
            this.f155963c = localThemeScope;
            this.f155964d = enumC16491b;
            this.f155965e = str;
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
            boolean zV = composer.V(this.f155961a) | composer.V(this.f155962b);
            SubscriptionDetails subscriptionDetails = this.f155961a;
            ProductFullDetails productFullDetails = this.f155962b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                if (subscriptionDetails == null || (productInfo = subscriptionDetails.getProductInfo()) == null || (formattedValue = productInfo.getProductPrice()) == null) {
                    formattedValue = productFullDetails.getPrice().getFormattedValue();
                }
                objB = formattedValue;
                composer.t(objB);
            }
            composer.P();
            LocalThemeScope localThemeScope = this.f155963c;
            q1.Label label = new q1.Label(null, this.f155963c.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getValues().getTwo(), null, 381, null);
            int i11 = LocalThemeScope.f17314g;
            int i12 = q1.Label.f142335j;
            j.h(localThemeScope, label, (String) objB, null, composer, i11 | (i12 << 3), 4);
            EnumC16491b enumC16491b = this.f155964d;
            if (enumC16491b == EnumC16491b.f157067b || enumC16491b == EnumC16491b.f157069d) {
                C14890K.a(J.z(Modifier.INSTANCE, this.f155963c.getAdsSpacing().getFour().getDp()), composer, 0);
                LocalThemeScope localThemeScope2 = this.f155963c;
                j.h(localThemeScope2, new q1.Label(null, this.f155963c.getAdsColors().getAdsColorText01(), null, F1.j.h(F1.j.INSTANCE.a()), 0, false, 0, localThemeScope2.getAdsTypography().getBody().getOne(), null, 373, null), this.f155965e, null, composer, i11 | (i12 << 3), 4);
            }
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155966a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SubscriptionDetails f155967b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f155968a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ SubscriptionDetails f155969b;

            a(LocalThemeScope localThemeScope, SubscriptionDetails subscriptionDetails) {
                this.f155968a = localThemeScope;
                this.f155969b = subscriptionDetails;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(739289288, i10, -1, "ProductSubscription.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductSubscription.kt:208)");
                }
                LocalThemeScope localThemeScope = this.f155968a;
                q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, this.f155968a.getAdsTypography().getBody().getOne(), null, 383, null);
                String str = this.f155969b.getNextOrderDate().format(C17898a.f167225a.o());
                Intrinsics.i(str, "format(...)");
                j.h(localThemeScope, label, str, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

        g(LocalThemeScope localThemeScope, SubscriptionDetails subscriptionDetails) {
            this.f155966a = localThemeScope;
            this.f155967b = subscriptionDetails;
        }

        public final void a(InterfaceC14888I AdsRow, Composer composer, int i10) {
            Intrinsics.j(AdsRow, "$this$AdsRow");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1341437276, i10, -1, "ProductSubscription.<anonymous>.<anonymous>.<anonymous> (ProductSubscription.kt:202)");
            }
            j.h(this.f155966a, new q1.Label(null, null, null, null, 0, false, 0, this.f155966a.getAdsTypography().getHeadings().getSeven(), null, 383, null), C16338g.c(C15410d.f148771a0, composer, 0), null, composer, (q1.Label.f142335j << 3) | LocalThemeScope.f17314g, 4);
            C14890K.a(J.z(Modifier.INSTANCE, this.f155966a.getAdsSpacing().getThree().getDp()), composer, 0);
            C4107g.e(null, 0.0f, ComposableLambdaKt.c(739289288, true, new a(this.f155966a, this.f155967b), composer, 54), composer, 384, 3);
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
    /* loaded from: classes8.dex */
    static final class h implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155970a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SubscriptionDetails f155971b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f155972a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ SubscriptionDetails f155973b;

            a(LocalThemeScope localThemeScope, SubscriptionDetails subscriptionDetails) {
                this.f155972a = localThemeScope;
                this.f155973b = subscriptionDetails;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(267152255, i10, -1, "ProductSubscription.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductSubscription.kt:224)");
                }
                j.h(this.f155972a, new q1.Label(null, null, null, null, 0, false, 0, this.f155972a.getAdsTypography().getBody().getOne(), null, 383, null), C16338g.d(C15410d.f148749I, new Object[]{Integer.valueOf(this.f155973b.getDeliveryFrequency()), this.f155973b.getDeliveryFrequencyUnit()}, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

        h(LocalThemeScope localThemeScope, SubscriptionDetails subscriptionDetails) {
            this.f155970a = localThemeScope;
            this.f155971b = subscriptionDetails;
        }

        public final void a(InterfaceC14888I AdsRow, Composer composer, int i10) {
            Intrinsics.j(AdsRow, "$this$AdsRow");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-889216237, i10, -1, "ProductSubscription.<anonymous>.<anonymous>.<anonymous> (ProductSubscription.kt:218)");
            }
            j.h(this.f155970a, new q1.Label(null, null, null, null, 0, false, 0, this.f155970a.getAdsTypography().getHeadings().getSeven(), null, 383, null), C16338g.c(C15410d.f148747H, composer, 0), null, composer, (q1.Label.f142335j << 3) | LocalThemeScope.f17314g, 4);
            C14890K.a(J.z(Modifier.INSTANCE, this.f155970a.getAdsSpacing().getThree().getDp()), composer, 0);
            C4107g.e(null, 0.0f, ComposableLambdaKt.c(267152255, true, new a(this.f155970a, this.f155971b), composer, 54), composer, 384, 3);
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
    /* loaded from: classes10.dex */
    static final class i implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155974a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SubscriptionDetails f155975b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f155976a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ SubscriptionDetails f155977b;

            a(LocalThemeScope localThemeScope, SubscriptionDetails subscriptionDetails) {
                this.f155976a = localThemeScope;
                this.f155977b = subscriptionDetails;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-797814976, i10, -1, "ProductSubscription.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductSubscription.kt:242)");
                }
                j.h(this.f155976a, new q1.Label(null, null, null, null, 0, false, 0, this.f155976a.getAdsTypography().getBody().getOne(), null, 383, null), String.valueOf(this.f155977b.getProductInfo().getProductQty()), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

        i(LocalThemeScope localThemeScope, SubscriptionDetails subscriptionDetails) {
            this.f155974a = localThemeScope;
            this.f155975b = subscriptionDetails;
        }

        public final void a(InterfaceC14888I AdsRow, Composer composer, int i10) {
            Intrinsics.j(AdsRow, "$this$AdsRow");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1954183468, i10, -1, "ProductSubscription.<anonymous>.<anonymous>.<anonymous> (ProductSubscription.kt:236)");
            }
            j.h(this.f155974a, new q1.Label(null, null, null, null, 0, false, 0, this.f155974a.getAdsTypography().getHeadings().getSeven(), null, 383, null), C16338g.c(C15410d.f148791k0, composer, 0), null, composer, (q1.Label.f142335j << 3) | LocalThemeScope.f17314g, 4);
            C14890K.a(J.z(Modifier.INSTANCE, this.f155974a.getAdsSpacing().getFive().getDp()), composer, 0);
            C4107g.e(null, 0.0f, ComposableLambdaKt.c(-797814976, true, new a(this.f155974a, this.f155975b), composer, 54), composer, 384, 3);
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
    public static final void f(final Ki.LocalThemeScope r34, final pr.SubscriptionSummaryDecorator r35, androidx.compose.ui.Modifier r36, final kotlin.jvm.functions.Function0<kotlin.Unit> r37, final kotlin.jvm.functions.Function1<? super pr.AbstractC16490a, kotlin.Unit> r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 1399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p.f(Ki.M, pr.c, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
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
            int i12 = LocalThemeScope.f17314g;
            int i13 = i11 & 14;
            int i14 = q1.Row.f142392d;
            C16453n.i(localThemeScope, row, composableLambdaC, composerStartRestartGroup, i12 | 384 | i13 | (i14 << 3));
            Modifier.Companion companion = Modifier.INSTANCE;
            C14890K.a(J.i(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composerStartRestartGroup, 0);
            C16453n.i(localThemeScope, new q1.Row(null, null, null, 7, null), ComposableLambdaKt.c(-611658617, true, new b(localThemeScope), composerStartRestartGroup, 54), composerStartRestartGroup, i12 | 384 | i13 | (i14 << 3));
            C14890K.a(J.i(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composerStartRestartGroup, 0);
            C16453n.i(localThemeScope, new q1.Row(null, null, null, 7, null), ComposableLambdaKt.c(1242686920, true, new c(localThemeScope), composerStartRestartGroup, 54), composerStartRestartGroup, i13 | i12 | 384 | (i14 << 3));
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
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, SubscriptionSummaryDecorator subscriptionSummaryDecorator, Modifier modifier, Function0 function0, Function1 function1, int i10, int i11, Composer composer, int i12) {
        f(localThemeScope, subscriptionSummaryDecorator, modifier, function0, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(Function1 function1, SubscriptionSummaryDecorator subscriptionSummaryDecorator) {
        function1.invoke(subscriptionSummaryDecorator.getAction());
        return Unit.f143329a;
    }
}
