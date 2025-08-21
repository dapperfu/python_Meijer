package Oh;

import Gh.a;
import Ih.o;
import Ki.LocalThemeScope;
import P0.e;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import bk.AbstractC6392a;
import d0.C13590y;
import dk.C13698b;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import ki.ProductCardTags;
import ki.q1;
import kotlin.C17983Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16335d;
import p1.C16338g;
import yr.C18370z;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\r\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\r\u0010\f¨\u0006\u0017²\u0006\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0011\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0012\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0013\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0014\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0016\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "LIh/o$a;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "LGh/a;", "", "onNavigationRequest", "i", "(LKi/M;LIh/o$a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "e", "(LKi/M;LIh/o$a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "g", "", "lastAction", "", "hasOneCard", "isLoading", "showPrimaryCardTag", "showExpiredCardTag", "Lbk/a;", "error", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class j0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f23965a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ o.PaymentsCardViewState f23966b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Oh.j0$a$a, reason: collision with other inner class name */
        /* synthetic */ class C0385a extends AdaptedFunctionReference implements Function1<LocalThemeScope, ProductCardTags> {

            /* renamed from: h, reason: collision with root package name */
            public static final C0385a f23967h = new C0385a();

            C0385a() {
                super(1, ProductCardTags.class, "<init>", "<init>(Lcom/meijer/mobile/android_acres_library/foundations/v2/LocalThemeScope;Lcom/meijer/mobile/android_acres_library/assemblies/TagTemplates$ProductCardTags;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ProductCardTags invoke(LocalThemeScope p02) {
                Intrinsics.j(p02, "p0");
                return new ProductCardTags(p02, null, 2, null);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function3<ProductCardTags, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f23968a;

            b(LocalThemeScope localThemeScope) {
                this.f23968a = localThemeScope;
            }

            public final void a(ProductCardTags Assemble, Composer composer, int i10) {
                int i11;
                Intrinsics.j(Assemble, "$this$Assemble");
                if ((i10 & 6) == 0) {
                    i11 = i10 | ((i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1504231588, i11, -1, "com.meijer.mobile.accounts.ux.composables.payments.PaymentDetailsCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PaymentsOverviewSuccessCard.kt:137)");
                }
                Ii.h.h(this.f23968a, q1.Tag.y(Assemble.getTags().getPickupOnly(), this.f23968a.getAdsColors().getAdsColorBrandPrimary(), q1.Label.y(Assemble.getTags().getPickupOnly().getLabel(), Assemble.getTags().getPickupOnly().getLabel().getModifier().then(androidx.compose.foundation.layout.D.k(C18370z.f(Modifier.INSTANCE, "primary_card_tag", null, 2, null), this.f23968a.getAdsSpacing().getTwo().getDp(), 0.0f, 2, null)), this.f23968a.getAdsColors().getAdsColorInverse(), null, null, 0, false, 0, null, null, 508, null), null, null, 12, null), C16338g.c(Gh.h.f12942n4, composer, 0), null, composer, (q1.Tag.f142423e << 3) | LocalThemeScope.f17314g, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ProductCardTags productCardTags, Composer composer, Integer num) {
                a(productCardTags, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class c extends AdaptedFunctionReference implements Function1<LocalThemeScope, ProductCardTags> {

            /* renamed from: h, reason: collision with root package name */
            public static final c f23969h = new c();

            c() {
                super(1, ProductCardTags.class, "<init>", "<init>(Lcom/meijer/mobile/android_acres_library/foundations/v2/LocalThemeScope;Lcom/meijer/mobile/android_acres_library/assemblies/TagTemplates$ProductCardTags;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ProductCardTags invoke(LocalThemeScope p02) {
                Intrinsics.j(p02, "p0");
                return new ProductCardTags(p02, null, 2, null);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class d implements Function3<ProductCardTags, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f23970a;

            d(LocalThemeScope localThemeScope) {
                this.f23970a = localThemeScope;
            }

            public final void a(ProductCardTags Assemble, Composer composer, int i10) {
                int i11;
                Intrinsics.j(Assemble, "$this$Assemble");
                if ((i10 & 6) == 0) {
                    i11 = i10 | ((i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(127994523, i11, -1, "com.meijer.mobile.accounts.ux.composables.payments.PaymentDetailsCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PaymentsOverviewSuccessCard.kt:156)");
                }
                Ii.h.h(this.f23970a, q1.Tag.y(Assemble.getTags().getPickupOnly(), this.f23970a.getAdsColors().getAdsColorActiveDanger(), q1.Label.y(Assemble.getTags().getPickupOnly().getLabel(), Assemble.getTags().getPickupOnly().getLabel().getModifier().then(androidx.compose.foundation.layout.D.k(C18370z.f(Modifier.INSTANCE, "expired_card_tag", null, 2, null), this.f23970a.getAdsSpacing().getTwo().getDp(), 0.0f, 2, null)), this.f23970a.getAdsColors().getAdsColorInverse(), null, null, 0, false, 0, null, null, 508, null), null, null, 12, null), C16338g.c(Gh.h.f12671B, composer, 0), null, composer, (q1.Tag.f142423e << 3) | LocalThemeScope.f17314g, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ProductCardTags productCardTags, Composer composer, Integer num) {
                a(productCardTags, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        a(LocalThemeScope localThemeScope, o.PaymentsCardViewState paymentsCardViewState) {
            this.f23965a = localThemeScope;
            this.f23966b = paymentsCardViewState;
        }

        public final void a(Composer composer, int i10) {
            int i11;
            Composer composer2 = composer;
            if ((i10 & 3) == 2 && composer2.j()) {
                composer2.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1322735237, i10, -1, "com.meijer.mobile.accounts.ux.composables.payments.PaymentDetailsCard.<anonymous> (PaymentsOverviewSuccessCard.kt:129)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierH = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.i(companion, this.f23965a.getAdsSpacing().getThree().getDp()), 0.0f, 1, null);
            LocalThemeScope localThemeScope = this.f23965a;
            o.PaymentsCardViewState paymentsCardViewState = this.f23966b;
            C5800d c5800d = C5800d.f48779a;
            C5800d.m mVarH = c5800d.h();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion2.k(), composer2, 0);
            int iA = C5859f.a(composer2, 0);
            InterfaceC5884s interfaceC5884sR = composer2.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer2, modifierH);
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
            if (composer2.k() == null) {
                C5859f.c();
            }
            composer2.F();
            if (composer2.h()) {
                composer2.I(function0A);
            } else {
                composer2.s();
            }
            Composer composerA = D1.a(composer2);
            D1.c(composerA, measurePolicyA, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composer2, 0);
            int iA2 = C5859f.a(composer2, 0);
            InterfaceC5884s interfaceC5884sR2 = composer2.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer2, companion);
            Function0<InterfaceC5953g> function0A2 = companion3.a();
            if (composer2.k() == null) {
                C5859f.c();
            }
            composer2.F();
            if (composer2.h()) {
                composer2.I(function0A2);
            } else {
                composer2.s();
            }
            Composer composerA2 = D1.a(composer2);
            D1.c(composerA2, measurePolicyB, companion3.e());
            D1.c(composerA2, interfaceC5884sR2, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.h() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C14889J c14889j = C14889J.f139620a;
            composer2.startReplaceGroup(-1210151421);
            if (paymentsCardViewState.getIsPrimary()) {
                composer2.startReplaceGroup(1849434622);
                Object objB = composer2.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = C0385a.f23967h;
                    composer2.t(objB);
                }
                composer2.P();
                Ki.Q.f(localThemeScope, (Function1) objB, ComposableLambdaKt.c(1504231588, true, new b(localThemeScope), composer2, 54), composer2, LocalThemeScope.f17314g | 432);
            }
            composer2.P();
            composer2.startReplaceGroup(-1210120978);
            if (paymentsCardViewState.getIsExpired()) {
                C14890K.a(androidx.compose.foundation.layout.J.z(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composer2, 0);
                composer2.startReplaceGroup(1849434622);
                Object objB2 = composer2.B();
                if (objB2 == Composer.INSTANCE.a()) {
                    objB2 = c.f23969h;
                    composer2.t(objB2);
                }
                composer2.P();
                Ki.Q.f(localThemeScope, (Function1) objB2, ComposableLambdaKt.c(127994523, true, new d(localThemeScope), composer2, 54), composer2, LocalThemeScope.f17314g | 432);
            }
            composer2.P();
            composer2.v();
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composer2, 0);
            MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.i(), composer2, 48);
            int iA3 = C5859f.a(composer2, 0);
            InterfaceC5884s interfaceC5884sR3 = composer2.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer2, companion);
            Function0<InterfaceC5953g> function0A3 = companion3.a();
            if (composer2.k() == null) {
                C5859f.c();
            }
            composer2.F();
            if (composer2.h()) {
                composer2.I(function0A3);
            } else {
                composer2.s();
            }
            Composer composerA3 = D1.a(composer2);
            D1.c(composerA3, measurePolicyB2, companion3.e());
            D1.c(composerA3, interfaceC5884sR3, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.h() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion3.f());
            Integer cardIcon = paymentsCardViewState.getCardIcon();
            composer2.startReplaceGroup(-194256298);
            if (cardIcon == null) {
                i11 = 0;
            } else {
                i11 = 0;
                C13590y.a(C16335d.c(cardIcon.intValue(), composer2, 0), null, null, null, null, 0.0f, null, composer, 48, 124);
                composer2 = composer;
                Unit unit = Unit.f143329a;
            }
            composer2.P();
            C14890K.a(androidx.compose.foundation.layout.J.z(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composer2, i11);
            si.j.h(localThemeScope, new q1.Label(C18370z.f(companion, "credit_card_description", null, 2, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 382, null), C13698b.a(paymentsCardViewState.getCreditCardDescription(), composer2, AbstractC6392a.f60445b), null, composer2, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
            composer.v();
            composer.v();
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
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f23971a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ o.PaymentsCardViewState f23972b;

        b(LocalThemeScope localThemeScope, o.PaymentsCardViewState paymentsCardViewState) {
            this.f23971a = localThemeScope;
            this.f23972b = paymentsCardViewState;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1228493620, i10, -1, "com.meijer.mobile.accounts.ux.composables.payments.PaymentsOverviewSuccessCard.<anonymous> (PaymentsOverviewSuccessCard.kt:76)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(companion, this.f23971a.getAdsSpacing().getFive().getDp());
            LocalThemeScope localThemeScope = this.f23971a;
            o.PaymentsCardViewState paymentsCardViewState = this.f23972b;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.h()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14903g c14903g = C14903g.f139698a;
            int i11 = LocalThemeScope.f17314g;
            e0.g(localThemeScope, null, composer, i11, 1);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
            C17983Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
            if (paymentsCardViewState.getIsLoading()) {
                composer.startReplaceGroup(-1297212905);
                yr.N.b(localThemeScope, null, composer, i11, 1);
                composer.P();
            } else {
                composer.startReplaceGroup(-1297145542);
                C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getFive().getDp()), composer, 0);
                q1.Label label = new q1.Label(C18370z.f(companion, "card_count_text", null, 2, null), localThemeScope.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 380, null);
                AbstractC6392a creditCardCountMessage = paymentsCardViewState.getCreditCardCountMessage();
                int i12 = AbstractC6392a.f60445b;
                si.j.h(localThemeScope, label, C13698b.a(creditCardCountMessage, composer, i12), null, composer, i11 | (q1.Label.f142335j << 3), 4);
                C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
                j0.e(localThemeScope, paymentsCardViewState, null, composer, i11 | (i12 << 3), 2);
                composer.P();
            }
            composer.v();
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
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final Ki.LocalThemeScope r18, final Ih.o.PaymentsCardViewState r19, androidx.compose.ui.Modifier r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Oh.j0.e(Ki.M, Ih.o$a, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, o.PaymentsCardViewState paymentsCardViewState, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        e(localThemeScope, paymentsCardViewState, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final Ki.LocalThemeScope r17, final Ih.o.PaymentsCardViewState r18, androidx.compose.ui.Modifier r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Oh.j0.g(Ki.M, Ih.o$a, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, o.PaymentsCardViewState paymentsCardViewState, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, paymentsCardViewState, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final Ki.LocalThemeScope r21, final Ih.o.PaymentsCardViewState r22, androidx.compose.ui.Modifier r23, final kotlin.jvm.functions.Function1<? super Gh.a, kotlin.Unit> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Oh.j0.i(Ki.M, Ih.o$a, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(Function1 function1) {
        function1.invoke(new a.Payments(false));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, o.PaymentsCardViewState paymentsCardViewState, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        i(localThemeScope, paymentsCardViewState, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
