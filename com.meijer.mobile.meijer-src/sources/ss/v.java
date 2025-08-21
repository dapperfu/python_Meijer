package ss;

import Gp.ProductRatings;
import Ho.SponsoredData;
import Hr.ClippableCouponDecorator;
import Ki.LocalThemeScope;
import Ki.Q;
import L1.A;
import L1.C;
import L1.C4010g;
import L1.D;
import L1.n;
import L1.x;
import P0.e;
import android.content.res.Resources;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.AnimatedGradientTextView;
import dk.C13698b;
import ek.C13806b;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14888I;
import j0.InterfaceC14902f;
import ki.C15134C;
import ki.RegularPrice;
import ki.j1;
import ki.q1;
import kotlin.C18051y;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.E0;
import p1.C16338g;
import pi.C16453n;
import r0.C16806i;
import r0.RoundedCornerShape;
import r1.C16819m;
import ss.InterfaceC17146a;
import ss.v;
import ts.ProductCardDecorator;
import yr.C18370z;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001a¡\u0002\u0010$\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\t2\b\b\u0002\u0010!\u001a\u00020\t2\u0014\b\u0002\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b$\u0010%\u001a)\u0010&\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\rH\u0003¢\u0006\u0004\b&\u0010'\u001a\u001b\u0010)\u001a\u00020\u0007*\u00020\u00002\u0006\u0010(\u001a\u00020\tH\u0003¢\u0006\u0004\b)\u0010*\u001a\u0013\u0010+\u001a\u00020\u0007*\u00020\u0000H\u0003¢\u0006\u0004\b+\u0010,\u001a\u001d\u0010/\u001a\u00020\u0007*\u00020\u00002\b\u0010.\u001a\u0004\u0018\u00010-H\u0003¢\u0006\u0004\b/\u00100\u001a\u001d\u00102\u001a\u00020\u0007*\u00020\u00002\b\u00101\u001a\u0004\u0018\u00010-H\u0003¢\u0006\u0004\b2\u00100\u001a#\u00107\u001a\u00020\u0007*\u00020\u00002\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0003¢\u0006\u0004\b7\u00108\u001a\u001d\u0010:\u001a\u00020\u0007*\u00020\u00002\b\u00109\u001a\u0004\u0018\u00010-H\u0003¢\u0006\u0004\b:\u00100\u001au\u0010C\u001a\u00020\u0007*\u00020\u00002\u0006\u0010 \u001a\u00020\t2\u0006\u0010;\u001a\u00020\t2\u0006\u0010<\u001a\u00020\t2\b\u0010=\u001a\u0004\u0018\u00010-2\b\u0010>\u001a\u0004\u0018\u00010-2\b\u0010?\u001a\u0004\u0018\u00010-2\b\u0010@\u001a\u0004\u0018\u00010-2\b\b\u0002\u00106\u001a\u0002052\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u0011H\u0003¢\u0006\u0004\bC\u0010D\u001a1\u0010E\u001a\u00020\u0007*\u00020\u00002\b\u0010A\u001a\u0004\u0018\u00010\u00112\b\u0010B\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u00106\u001a\u000205H\u0003¢\u0006\u0004\bE\u0010F\u001aI\u0010K\u001a\u00020\u0007*\u00020\u00002\u0006\u0010H\u001a\u00020G2\b\u0010=\u001a\u0004\u0018\u00010-2\b\u0010>\u001a\u0004\u0018\u00010-2\u0006\u0010I\u001a\u0002032\u0006\u0010J\u001a\u0002032\b\b\u0002\u00106\u001a\u000205H\u0003¢\u0006\u0004\bK\u0010L\u001a7\u0010M\u001a\u00020\u0007*\u00020\u00002\u0006\u0010H\u001a\u00020G2\b\u0010=\u001a\u0004\u0018\u00010-2\u0006\u0010I\u001a\u0002032\b\b\u0002\u00106\u001a\u000205H\u0003¢\u0006\u0004\bM\u0010N\u001a'\u0010Q\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u00106\u001a\u0002052\b\u0010P\u001a\u0004\u0018\u00010OH\u0007¢\u0006\u0004\bQ\u0010R\u001a2\u0010V\u001a\u000205*\u0002052\u0006\u0010S\u001a\u00020\t2\u0017\u0010U\u001a\u0013\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u0002050\u0005¢\u0006\u0002\bT¢\u0006\u0004\bV\u0010W\u001a;\u0010Z\u001a\u00020\t2\b\u0010X\u001a\u0004\u0018\u00010\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\t2\u0006\u0010;\u001a\u00020\t2\u0006\u0010Y\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tH\u0002¢\u0006\u0004\bZ\u0010[¨\u0006\\"}, d2 = {"LKi/M;", "Lts/a;", "item", "", "position", "Lkotlin/Function1;", "Lss/a;", "", "productCardAction", "", "showClippableCoupon", "LHr/a;", "couponCountDownStateDecorator", "Lkotlin/Function0;", "clippableCouponAction", "viewCouponDetail", "onCollapseQtyStepper", "", "maxAllowedQty", "showFindSimilarButton", "findSimilarAction", "onExpandQtyStepper", "LPp/b;", "searchType", "radioButtonSelected", "isEligibleForSubstitution", "isSponsored", "shouldEnableRatings", "showQuantityRequested", "quantityRequested", "isSponsoredProductBuyAgainEnabled", "isSponsoredProductFavOnSaleEnabled", "isMirakl3PMEnabled", "isUserLoggedIn", "LHo/c;", "onClickBeaconsAction", "C", "(LKi/M;Lts/a;ILkotlin/jvm/functions/Function1;ZLHr/a;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;DZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LPp/b;ZZZZZIZZZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;IIII)V", "A", "(LKi/M;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "isBopas", "y", "(LKi/M;ZLandroidx/compose/runtime/Composer;I)V", "X", "(LKi/M;Landroidx/compose/runtime/Composer;I)V", "Lbk/a;", "complexPromo", "w", "(LKi/M;Lbk/a;Landroidx/compose/runtime/Composer;I)V", "weightUnitSizeAndPrice", "Z", "", "name", "Landroidx/compose/ui/Modifier;", "modifier", "P", "(LKi/M;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "amountSaved", "u", "isOnSale", "isThirdPartyProduct", "currentPrice", "regularPrice", "currentPriceDescription", "regularPriceDescription", "itemPriceExcludingShipping", "minShippingPrice", "N", "(LKi/M;ZZZLbk/a;Lbk/a;Lbk/a;Lbk/a;Landroidx/compose/ui/Modifier;Ljava/lang/Double;Ljava/lang/Double;Landroidx/compose/runtime/Composer;III)V", "H", "(LKi/M;Ljava/lang/Double;Ljava/lang/Double;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lki/q1$j;", "finalPrice", "currentPriceContentDescription", "regularPriceContentDescription", "J", "(LKi/M;Lki/q1$j;Lbk/a;Lbk/a;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "R", "(LKi/M;Lki/q1$j;Lbk/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LGp/c;", "productRatings", "U", "(LKi/M;Landroidx/compose/ui/Modifier;LGp/c;Landroidx/compose/runtime/Composer;II)V", "condition", "Lkotlin/ExtensionFunctionType;", "then", "n0", "(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "isCarouselEnabled", "isSponsoredProductBuyAgain", "o0", "(Ljava/lang/Boolean;Ljava/lang/Boolean;ZZZ)Z", "productcard_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class v {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends AdaptedFunctionReference implements Function1<LocalThemeScope, RegularPrice> {

        /* renamed from: h, reason: collision with root package name */
        public static final a f161861h = new a();

        a() {
            super(1, RegularPrice.class, "<init>", "<init>(Lcom/meijer/mobile/android_acres_library/foundations/v2/LocalThemeScope;Lcom/meijer/mobile/android_acres_library/assemblies/ProductCard$Labels;Lcom/meijer/mobile/android_acres_library/assemblies/TagTemplates$ProductCardTags;Lcom/meijer/mobile/android_acres_library/assemblies/ProductCard$DefaultContainers;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RegularPrice invoke(LocalThemeScope p02) {
            Intrinsics.j(p02, "p0");
            return new RegularPrice(p02, null, null, null, 14, null);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function3<RegularPrice, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f161862a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f161863b;

        b(LocalThemeScope localThemeScope, AbstractC6392a abstractC6392a) {
            this.f161862a = localThemeScope;
            this.f161863b = abstractC6392a;
        }

        public final void a(RegularPrice Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(811089367, i10, -1, "com.meijer.mobile.ui.productcard.AmountSaved.<anonymous> (ProductCard.kt:610)");
            }
            C14890K.a(D.m(Modifier.INSTANCE, 0.0f, this.f161862a.getAdsSpacing().getTwo().getDp(), 0.0f, 0.0f, 13, null), composer, 0);
            si.j.h(this.f161862a, Assemble.getLabels().getSavingsAmount(), C13698b.a(this.f161863b, composer, AbstractC6392a.f60445b), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RegularPrice regularPrice, Composer composer, Integer num) {
            a(regularPrice, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class c extends AdaptedFunctionReference implements Function1<LocalThemeScope, RegularPrice> {

        /* renamed from: h, reason: collision with root package name */
        public static final c f161864h = new c();

        c() {
            super(1, RegularPrice.class, "<init>", "<init>(Lcom/meijer/mobile/android_acres_library/foundations/v2/LocalThemeScope;Lcom/meijer/mobile/android_acres_library/assemblies/ProductCard$Labels;Lcom/meijer/mobile/android_acres_library/assemblies/TagTemplates$ProductCardTags;Lcom/meijer/mobile/android_acres_library/assemblies/ProductCard$DefaultContainers;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RegularPrice invoke(LocalThemeScope p02) {
            Intrinsics.j(p02, "p0");
            return new RegularPrice(p02, null, null, null, 14, null);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function3<RegularPrice, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f161865a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f161866b;

        d(LocalThemeScope localThemeScope, AbstractC6392a abstractC6392a) {
            this.f161865a = localThemeScope;
            this.f161866b = abstractC6392a;
        }

        public final void a(RegularPrice Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1824731559, i10, -1, "com.meijer.mobile.ui.productcard.ComplexPromo.<anonymous> (ProductCard.kt:556)");
            }
            Ii.h.h(this.f161865a, Assemble.getTags().getComplexPromo(), C13698b.a(this.f161866b, composer, AbstractC6392a.f60445b), null, composer, LocalThemeScope.f17314g | (q1.Tag.f142423e << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RegularPrice regularPrice, Composer composer, Integer num) {
            a(regularPrice, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class e implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f161867a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f161868b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f161869a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j1 f161870b;

            a(LocalThemeScope localThemeScope, j1 j1Var) {
                this.f161869a = localThemeScope;
                this.f161870b = j1Var;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(392970217, i10, -1, "com.meijer.mobile.ui.productcard.FindSimilarButton.<anonymous>.<anonymous> (ProductCard.kt:510)");
                }
                si.j.h(this.f161869a, this.f161870b.getLabels().getEnabledLabel(), C16338g.c(x.f162138d, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

        e(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f161867a = localThemeScope;
            this.f161868b = function0;
        }

        public final void a(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-986855364, i10, -1, "com.meijer.mobile.ui.productcard.FindSimilarButton.<anonymous> (ProductCard.kt:502)");
            }
            E0.b(this.f161867a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, D.m(J.h(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, H1.h.p(12), H1.h.p(4), 0.0f, 9, null), false, null, 895, null), this.f161868b, ComposableLambdaKt.c(392970217, true, new a(this.f161867a, Assemble), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            a(j1Var, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class f extends AdaptedFunctionReference implements Function1<LocalThemeScope, RegularPrice> {

        /* renamed from: h, reason: collision with root package name */
        public static final f f161871h = new f();

        f() {
            super(1, RegularPrice.class, "<init>", "<init>(Lcom/meijer/mobile/android_acres_library/foundations/v2/LocalThemeScope;Lcom/meijer/mobile/android_acres_library/assemblies/ProductCard$Labels;Lcom/meijer/mobile/android_acres_library/assemblies/TagTemplates$ProductCardTags;Lcom/meijer/mobile/android_acres_library/assemblies/ProductCard$DefaultContainers;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RegularPrice invoke(LocalThemeScope p02) {
            Intrinsics.j(p02, "p0");
            return new RegularPrice(p02, null, null, null, 14, null);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class g implements Function3<RegularPrice, Composer, Integer, Unit> {

        /* renamed from: A, reason: collision with root package name */
        final /* synthetic */ double f161872A;

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f161873a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f161874b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f161875c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f161876d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f161877e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<InterfaceC17146a, Unit> f161878f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ProductCardDecorator f161879g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f161880h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f161881i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f161882j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f161883k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f161884l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f161885m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f161886n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f161887o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f161888p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ boolean f161889q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ boolean f161890r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f161891s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f161892t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ ClippableCouponDecorator f161893u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f161894v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ boolean f161895w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f161896x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f161897y;

        /* renamed from: z, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f161898z;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: A, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f161899A;

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ double f161900B;

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f161901a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f161902b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ RegularPrice f161903c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f161904d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f161905e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function1<InterfaceC17146a, Unit> f161906f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ ProductCardDecorator f161907g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f161908h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ boolean f161909i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ int f161910j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ float f161911k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ boolean f161912l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ boolean f161913m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ boolean f161914n;

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ boolean f161915o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ boolean f161916p;

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ boolean f161917q;

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ boolean f161918r;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f161919s;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f161920t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ boolean f161921u;

            /* renamed from: v, reason: collision with root package name */
            final /* synthetic */ ClippableCouponDecorator f161922v;

            /* renamed from: w, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f161923w;

            /* renamed from: x, reason: collision with root package name */
            final /* synthetic */ boolean f161924x;

            /* renamed from: y, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f161925y;

            /* renamed from: z, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f161926z;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: ss.v$g$a$a, reason: collision with other inner class name */
            static final class C2531a implements Function1<C4010g, Unit> {

                /* renamed from: a, reason: collision with root package name */
                public static final C2531a f161927a = new C2531a();

                public final void a(C4010g constrainAs) {
                    Intrinsics.j(constrainAs, "$this$constrainAs");
                    D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                    x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                    x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                    a(c4010g);
                    return Unit.f143329a;
                }

                C2531a() {
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class b implements Function1<Boolean, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Function1<InterfaceC17146a, Unit> f161928a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ProductCardDecorator f161929b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ int f161930c;

                /* JADX WARN: Multi-variable type inference failed */
                b(Function1<? super InterfaceC17146a, Unit> function1, ProductCardDecorator productCardDecorator, int i10) {
                    this.f161928a = function1;
                    this.f161929b = productCardDecorator;
                    this.f161930c = i10;
                }

                public final void a(boolean z10) {
                    Function1<InterfaceC17146a, Unit> function1 = this.f161928a;
                    if (function1 != null) {
                        function1.invoke(new InterfaceC17146a.ProductItemClicked(this.f161929b, this.f161930c));
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    a(bool.booleanValue());
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class c implements Function1<C4010g, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ L1.h f161931a;

                c(L1.h hVar) {
                    this.f161931a = hVar;
                }

                public final void a(C4010g constrainAs) {
                    Intrinsics.j(constrainAs, "$this$constrainAs");
                    x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                    D.a.a(constrainAs.getStart(), this.f161931a.getEnd(), 0.0f, 0.0f, 6, null);
                    D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                    a(c4010g);
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class d implements Function1<C4010g, Unit> {

                /* renamed from: a, reason: collision with root package name */
                public static final d f161932a = new d();

                public final void a(C4010g constrainAs) {
                    Intrinsics.j(constrainAs, "$this$constrainAs");
                    x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                    D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
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
            @SourceDebugExtension
            static final class e implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

                /* renamed from: A, reason: collision with root package name */
                final /* synthetic */ double f161933A;

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f161934a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ RegularPrice f161935b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ ProductCardDecorator f161936c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ boolean f161937d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ int f161938e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ float f161939f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ boolean f161940g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ boolean f161941h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ boolean f161942i;

                /* renamed from: j, reason: collision with root package name */
                final /* synthetic */ boolean f161943j;

                /* renamed from: k, reason: collision with root package name */
                final /* synthetic */ boolean f161944k;

                /* renamed from: l, reason: collision with root package name */
                final /* synthetic */ boolean f161945l;

                /* renamed from: m, reason: collision with root package name */
                final /* synthetic */ boolean f161946m;

                /* renamed from: n, reason: collision with root package name */
                final /* synthetic */ boolean f161947n;

                /* renamed from: o, reason: collision with root package name */
                final /* synthetic */ boolean f161948o;

                /* renamed from: p, reason: collision with root package name */
                final /* synthetic */ Function0<Unit> f161949p;

                /* renamed from: q, reason: collision with root package name */
                final /* synthetic */ Function0<Unit> f161950q;

                /* renamed from: r, reason: collision with root package name */
                final /* synthetic */ boolean f161951r;

                /* renamed from: s, reason: collision with root package name */
                final /* synthetic */ ClippableCouponDecorator f161952s;

                /* renamed from: t, reason: collision with root package name */
                final /* synthetic */ Function1<InterfaceC17146a, Unit> f161953t;

                /* renamed from: u, reason: collision with root package name */
                final /* synthetic */ int f161954u;

                /* renamed from: v, reason: collision with root package name */
                final /* synthetic */ Function0<Unit> f161955v;

                /* renamed from: w, reason: collision with root package name */
                final /* synthetic */ boolean f161956w;

                /* renamed from: x, reason: collision with root package name */
                final /* synthetic */ Function0<Unit> f161957x;

                /* renamed from: y, reason: collision with root package name */
                final /* synthetic */ Function0<Unit> f161958y;

                /* renamed from: z, reason: collision with root package name */
                final /* synthetic */ Function0<Unit> f161959z;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: ss.v$g$a$e$a, reason: collision with other inner class name */
                static final class C2532a implements Function1<Modifier, Modifier> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ float f161960a;

                    C2532a(float f10) {
                        this.f161960a = f10;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Modifier invoke(Modifier modifier) {
                        Intrinsics.j(modifier, "$this$if");
                        return T0.a.a(modifier, this.f161960a);
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                static final class b implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ boolean f161961a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ boolean f161962b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ boolean f161963c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ ProductCardDecorator f161964d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ boolean f161965e;

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f161966f;

                    b(boolean z10, boolean z11, boolean z12, ProductCardDecorator productCardDecorator, boolean z13, LocalThemeScope localThemeScope) {
                        this.f161961a = z10;
                        this.f161962b = z11;
                        this.f161963c = z12;
                        this.f161964d = productCardDecorator;
                        this.f161965e = z13;
                        this.f161966f = localThemeScope;
                    }

                    public final void a(InterfaceC14888I AdsRow, Composer composer, int i10) {
                        boolean zO0;
                        Intrinsics.j(AdsRow, "$this$AdsRow");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(230880418, i10, -1, "com.meijer.mobile.ui.productcard.HorizontalProductCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductCard.kt:203)");
                        }
                        boolean z10 = this.f161961a || this.f161962b;
                        Modifier modifierM = androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, H1.h.p(this.f161963c ? 4 : 0), 7, null);
                        boolean isOutOfStock = this.f161964d.getIsOutOfStock();
                        boolean isLowStock = this.f161964d.getIsLowStock();
                        boolean isAgeRestricted = this.f161964d.getProduct().getIsAgeRestricted();
                        if (z10 && this.f161964d.getProduct().getIsSponsoredCriteo()) {
                            zO0 = v.o0(Boolean.valueOf(this.f161964d.getIsBuyAgain()), Boolean.valueOf(this.f161964d.getProduct().getIsSponsoredCriteo()), this.f161964d.getIsOnSale(), this.f161961a, this.f161962b);
                        } else {
                            zO0 = this.f161965e;
                        }
                        Mj.g.l(this.f161966f, modifierM, isOutOfStock, isLowStock, this.f161964d.getIsBuyAgain(), isAgeRestricted, this.f161964d.getHasMPerksOffers(), false, this.f161964d.getIsInStoreOnly(), false, zO0, null, null, null, null, null, null, null, null, null, composer, LocalThemeScope.f17314g, 0, 523584);
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
                static final class c implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f161967a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ RegularPrice f161968b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ boolean f161969c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ ProductCardDecorator f161970d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ boolean f161971e;

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ boolean f161972f;

                    /* renamed from: g, reason: collision with root package name */
                    final /* synthetic */ float f161973g;

                    /* renamed from: h, reason: collision with root package name */
                    final /* synthetic */ boolean f161974h;

                    /* renamed from: i, reason: collision with root package name */
                    final /* synthetic */ boolean f161975i;

                    /* renamed from: j, reason: collision with root package name */
                    final /* synthetic */ Function0<Unit> f161976j;

                    /* renamed from: k, reason: collision with root package name */
                    final /* synthetic */ Function0<Unit> f161977k;

                    /* renamed from: l, reason: collision with root package name */
                    final /* synthetic */ boolean f161978l;

                    /* renamed from: m, reason: collision with root package name */
                    final /* synthetic */ ClippableCouponDecorator f161979m;

                    /* renamed from: n, reason: collision with root package name */
                    final /* synthetic */ Function1<InterfaceC17146a, Unit> f161980n;

                    /* renamed from: o, reason: collision with root package name */
                    final /* synthetic */ int f161981o;

                    /* renamed from: p, reason: collision with root package name */
                    final /* synthetic */ Function0<Unit> f161982p;

                    /* renamed from: q, reason: collision with root package name */
                    final /* synthetic */ boolean f161983q;

                    /* renamed from: r, reason: collision with root package name */
                    final /* synthetic */ Function0<Unit> f161984r;

                    /* renamed from: s, reason: collision with root package name */
                    final /* synthetic */ Function0<Unit> f161985s;

                    /* renamed from: t, reason: collision with root package name */
                    final /* synthetic */ Function0<Unit> f161986t;

                    /* renamed from: u, reason: collision with root package name */
                    final /* synthetic */ double f161987u;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: ss.v$g$a$e$c$a, reason: collision with other inner class name */
                    static final class C2533a implements Function1<C4010g, Unit> {

                        /* renamed from: a, reason: collision with root package name */
                        public static final C2533a f161988a = new C2533a();

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

                        C2533a() {
                        }
                    }

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @SourceDebugExtension
                    static final class b implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ ProductCardDecorator f161989a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ boolean f161990b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ boolean f161991c;

                        /* renamed from: d, reason: collision with root package name */
                        final /* synthetic */ float f161992d;

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        /* renamed from: ss.v$g$a$e$c$b$a, reason: collision with other inner class name */
                        static final class C2534a implements Function1<Modifier, Modifier> {

                            /* renamed from: a, reason: collision with root package name */
                            final /* synthetic */ float f161993a;

                            C2534a(float f10) {
                                this.f161993a = f10;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            /* renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Modifier invoke(Modifier modifier) {
                                Intrinsics.j(modifier, "$this$if");
                                return T0.a.a(modifier, this.f161993a);
                            }
                        }

                        b(ProductCardDecorator productCardDecorator, boolean z10, boolean z11, float f10) {
                            this.f161989a = productCardDecorator;
                            this.f161990b = z10;
                            this.f161991c = z11;
                            this.f161992d = f10;
                        }

                        public final void a(InterfaceC14902f AdsColumn, Composer composer, int i10) {
                            Intrinsics.j(AdsColumn, "$this$AdsColumn");
                            if ((i10 & 17) == 16 && composer.j()) {
                                composer.K();
                                return;
                            }
                            if (ComposerKt.M()) {
                                ComposerKt.U(-1458505062, i10, -1, "com.meijer.mobile.ui.productcard.HorizontalProductCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductCard.kt:248)");
                            }
                            String strC = C16338g.c(x.f162140f, composer, 0);
                            String thumbnailUrl = this.f161989a.getThumbnailUrl();
                            String thumbnailUrl2 = this.f161989a.getThumbnailUrl();
                            Modifier modifierV = J.v(Modifier.INSTANCE, H1.h.p(96));
                            boolean z10 = (this.f161990b && !this.f161991c) || this.f161989a.getIsStepperExpanded();
                            composer.startReplaceGroup(5004770);
                            float f10 = this.f161992d;
                            Object objB = composer.B();
                            if (objB == Composer.INSTANCE.a()) {
                                objB = new C2534a(f10);
                                composer.t(objB);
                            }
                            composer.P();
                            C13806b.b(v.n0(modifierV, z10, (Function1) objB), thumbnailUrl, strC, thumbnailUrl2, null, false, null, null, 0.0f, composer, 0, 496);
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
                    /* renamed from: ss.v$g$a$e$c$c, reason: collision with other inner class name */
                    /* synthetic */ class C2535c extends AdaptedFunctionReference implements Function1<LocalThemeScope, RegularPrice> {

                        /* renamed from: h, reason: collision with root package name */
                        public static final C2535c f161994h = new C2535c();

                        C2535c() {
                            super(1, RegularPrice.class, "<init>", "<init>(Lcom/meijer/mobile/android_acres_library/foundations/v2/LocalThemeScope;Lcom/meijer/mobile/android_acres_library/assemblies/ProductCard$Labels;Lcom/meijer/mobile/android_acres_library/assemblies/TagTemplates$ProductCardTags;Lcom/meijer/mobile/android_acres_library/assemblies/ProductCard$DefaultContainers;)V", 0);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final RegularPrice invoke(LocalThemeScope p02) {
                            Intrinsics.j(p02, "p0");
                            return new RegularPrice(p02, null, null, null, 14, null);
                        }
                    }

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @SourceDebugExtension
                    static final class d implements Function3<RegularPrice, Composer, Integer, Unit> {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ LocalThemeScope f161995a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ L1.n f161996b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ L1.h f161997c;

                        /* renamed from: d, reason: collision with root package name */
                        final /* synthetic */ L1.h f161998d;

                        /* renamed from: e, reason: collision with root package name */
                        final /* synthetic */ L1.h f161999e;

                        /* renamed from: f, reason: collision with root package name */
                        final /* synthetic */ ProductCardDecorator f162000f;

                        /* renamed from: g, reason: collision with root package name */
                        final /* synthetic */ L1.h f162001g;

                        /* renamed from: h, reason: collision with root package name */
                        final /* synthetic */ float f162002h;

                        /* renamed from: i, reason: collision with root package name */
                        final /* synthetic */ boolean f162003i;

                        /* renamed from: j, reason: collision with root package name */
                        final /* synthetic */ boolean f162004j;

                        /* renamed from: k, reason: collision with root package name */
                        final /* synthetic */ Function0<Unit> f162005k;

                        /* renamed from: l, reason: collision with root package name */
                        final /* synthetic */ Function0<Unit> f162006l;

                        /* renamed from: m, reason: collision with root package name */
                        final /* synthetic */ boolean f162007m;

                        /* renamed from: n, reason: collision with root package name */
                        final /* synthetic */ ClippableCouponDecorator f162008n;

                        /* renamed from: o, reason: collision with root package name */
                        final /* synthetic */ Function1<InterfaceC17146a, Unit> f162009o;

                        /* renamed from: p, reason: collision with root package name */
                        final /* synthetic */ int f162010p;

                        /* renamed from: q, reason: collision with root package name */
                        final /* synthetic */ Function0<Unit> f162011q;

                        /* renamed from: r, reason: collision with root package name */
                        final /* synthetic */ boolean f162012r;

                        /* renamed from: s, reason: collision with root package name */
                        final /* synthetic */ Function0<Unit> f162013s;

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        /* renamed from: ss.v$g$a$e$c$d$a, reason: collision with other inner class name */
                        static final class C2536a implements Function1<C4010g, Unit> {

                            /* renamed from: a, reason: collision with root package name */
                            final /* synthetic */ L1.h f162014a;

                            C2536a(L1.h hVar) {
                                this.f162014a = hVar;
                            }

                            public final void a(C4010g constrainAs) {
                                Intrinsics.j(constrainAs, "$this$constrainAs");
                                D.a.a(constrainAs.getStart(), this.f162014a.getEnd(), 0.0f, 0.0f, 6, null);
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
                        static final class b implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

                            /* renamed from: a, reason: collision with root package name */
                            final /* synthetic */ LocalThemeScope f162015a;

                            /* renamed from: b, reason: collision with root package name */
                            final /* synthetic */ ProductCardDecorator f162016b;

                            /* renamed from: c, reason: collision with root package name */
                            final /* synthetic */ float f162017c;

                            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                            /* renamed from: ss.v$g$a$e$c$d$b$a, reason: collision with other inner class name */
                            static final class C2537a implements Function1<Modifier, Modifier> {

                                /* renamed from: a, reason: collision with root package name */
                                final /* synthetic */ float f162018a;

                                C2537a(float f10) {
                                    this.f162018a = f10;
                                }

                                @Override // kotlin.jvm.functions.Function1
                                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Modifier invoke(Modifier modifier) {
                                    Intrinsics.j(modifier, "$this$if");
                                    return T0.a.a(modifier, this.f162018a);
                                }
                            }

                            b(LocalThemeScope localThemeScope, ProductCardDecorator productCardDecorator, float f10) {
                                this.f162015a = localThemeScope;
                                this.f162016b = productCardDecorator;
                                this.f162017c = f10;
                            }

                            public final void a(InterfaceC14902f AdsColumn, Composer composer, int i10) {
                                Intrinsics.j(AdsColumn, "$this$AdsColumn");
                                if ((i10 & 17) == 16 && composer.j()) {
                                    composer.K();
                                    return;
                                }
                                if (ComposerKt.M()) {
                                    ComposerKt.U(-1133621165, i10, -1, "com.meijer.mobile.ui.productcard.HorizontalProductCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductCard.kt:280)");
                                }
                                LocalThemeScope localThemeScope = this.f162015a;
                                String name = this.f162016b.getProduct().getName();
                                Modifier.Companion companion = Modifier.INSTANCE;
                                boolean isStepperExpanded = this.f162016b.getIsStepperExpanded();
                                composer.startReplaceGroup(5004770);
                                float f10 = this.f162017c;
                                Object objB = composer.B();
                                if (objB == Composer.INSTANCE.a()) {
                                    objB = new C2537a(f10);
                                    composer.t(objB);
                                }
                                composer.P();
                                v.P(localThemeScope, name, v.n0(companion, isStepperExpanded, (Function1) objB), composer, LocalThemeScope.f17314g);
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
                        /* renamed from: ss.v$g$a$e$c$d$c, reason: collision with other inner class name */
                        static final class C2538c implements Function1<C4010g, Unit> {

                            /* renamed from: a, reason: collision with root package name */
                            final /* synthetic */ L1.h f162019a;

                            /* renamed from: b, reason: collision with root package name */
                            final /* synthetic */ ProductCardDecorator f162020b;

                            /* renamed from: c, reason: collision with root package name */
                            final /* synthetic */ L1.h f162021c;

                            C2538c(L1.h hVar, ProductCardDecorator productCardDecorator, L1.h hVar2) {
                                this.f162019a = hVar;
                                this.f162020b = productCardDecorator;
                                this.f162021c = hVar2;
                            }

                            public final void a(C4010g constrainAs) {
                                Intrinsics.j(constrainAs, "$this$constrainAs");
                                D.a.a(constrainAs.getStart(), this.f162019a.getStart(), 0.0f, 0.0f, 6, null);
                                x.a.a(constrainAs.getTop(), this.f162019a.getBottom(), 0.0f, 0.0f, 6, null);
                                if (this.f162020b.getIsEligibleForCart()) {
                                    D.a.a(constrainAs.getEnd(), this.f162021c.getStart(), 0.0f, 0.0f, 6, null);
                                } else {
                                    D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                }
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
                        /* renamed from: ss.v$g$a$e$c$d$d, reason: collision with other inner class name */
                        static final class C2539d implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

                            /* renamed from: a, reason: collision with root package name */
                            final /* synthetic */ ProductCardDecorator f162022a;

                            /* renamed from: b, reason: collision with root package name */
                            final /* synthetic */ float f162023b;

                            /* renamed from: c, reason: collision with root package name */
                            final /* synthetic */ LocalThemeScope f162024c;

                            /* renamed from: d, reason: collision with root package name */
                            final /* synthetic */ boolean f162025d;

                            /* renamed from: e, reason: collision with root package name */
                            final /* synthetic */ boolean f162026e;

                            /* renamed from: f, reason: collision with root package name */
                            final /* synthetic */ Function0<Unit> f162027f;

                            /* renamed from: g, reason: collision with root package name */
                            final /* synthetic */ Function0<Unit> f162028g;

                            /* renamed from: h, reason: collision with root package name */
                            final /* synthetic */ boolean f162029h;

                            /* renamed from: i, reason: collision with root package name */
                            final /* synthetic */ ClippableCouponDecorator f162030i;

                            /* renamed from: j, reason: collision with root package name */
                            final /* synthetic */ Function1<InterfaceC17146a, Unit> f162031j;

                            /* renamed from: k, reason: collision with root package name */
                            final /* synthetic */ int f162032k;

                            /* renamed from: l, reason: collision with root package name */
                            final /* synthetic */ Function0<Unit> f162033l;

                            /* renamed from: m, reason: collision with root package name */
                            final /* synthetic */ boolean f162034m;

                            /* renamed from: n, reason: collision with root package name */
                            final /* synthetic */ Function0<Unit> f162035n;

                            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                            /* renamed from: ss.v$g$a$e$c$d$d$a, reason: collision with other inner class name */
                            static final class C2540a implements Function1<Modifier, Modifier> {

                                /* renamed from: a, reason: collision with root package name */
                                final /* synthetic */ float f162036a;

                                C2540a(float f10) {
                                    this.f162036a = f10;
                                }

                                @Override // kotlin.jvm.functions.Function1
                                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Modifier invoke(Modifier modifier) {
                                    Intrinsics.j(modifier, "$this$if");
                                    return T0.a.a(modifier, this.f162036a);
                                }
                            }

                            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                            /* renamed from: ss.v$g$a$e$c$d$d$b */
                            static final class b implements Function1<r1.u, Unit> {

                                /* renamed from: a, reason: collision with root package name */
                                final /* synthetic */ String f162037a;

                                b(String str) {
                                    this.f162037a = str;
                                }

                                public final void a(r1.u semantics) {
                                    Intrinsics.j(semantics, "$this$semantics");
                                    r1.s.g0(semantics, this.f162037a);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
                                    a(uVar);
                                    return Unit.f143329a;
                                }
                            }

                            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                            /* renamed from: ss.v$g$a$e$c$d$d$c, reason: collision with other inner class name */
                            static final class C2541c implements Function0<Unit> {

                                /* renamed from: a, reason: collision with root package name */
                                final /* synthetic */ Function1<InterfaceC17146a, Unit> f162038a;

                                /* renamed from: b, reason: collision with root package name */
                                final /* synthetic */ ProductCardDecorator f162039b;

                                /* renamed from: c, reason: collision with root package name */
                                final /* synthetic */ int f162040c;

                                /* JADX WARN: Multi-variable type inference failed */
                                C2541c(Function1<? super InterfaceC17146a, Unit> function1, ProductCardDecorator productCardDecorator, int i10) {
                                    this.f162038a = function1;
                                    this.f162039b = productCardDecorator;
                                    this.f162040c = i10;
                                }

                                public final void a() {
                                    Function1<InterfaceC17146a, Unit> function1 = this.f162038a;
                                    if (function1 != null) {
                                        function1.invoke(new InterfaceC17146a.ProductItemClicked(this.f162039b, this.f162040c));
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    a();
                                    return Unit.f143329a;
                                }
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            C2539d(ProductCardDecorator productCardDecorator, float f10, LocalThemeScope localThemeScope, boolean z10, boolean z11, Function0<Unit> function0, Function0<Unit> function02, boolean z12, ClippableCouponDecorator clippableCouponDecorator, Function1<? super InterfaceC17146a, Unit> function1, int i10, Function0<Unit> function03, boolean z13, Function0<Unit> function04) {
                                this.f162022a = productCardDecorator;
                                this.f162023b = f10;
                                this.f162024c = localThemeScope;
                                this.f162025d = z10;
                                this.f162026e = z11;
                                this.f162027f = function0;
                                this.f162028g = function02;
                                this.f162029h = z12;
                                this.f162030i = clippableCouponDecorator;
                                this.f162031j = function1;
                                this.f162032k = i10;
                                this.f162033l = function03;
                                this.f162034m = z13;
                                this.f162035n = function04;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:77:0x0320  */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void a(j0.InterfaceC14902f r35, androidx.compose.runtime.Composer r36, int r37) {
                                /*
                                    Method dump skipped, instructions count: 848
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: ss.v.g.a.e.c.d.C2539d.a(j0.f, androidx.compose.runtime.Composer, int):void");
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
                                a(interfaceC14902f, composer, num.intValue());
                                return Unit.f143329a;
                            }
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        d(LocalThemeScope localThemeScope, L1.n nVar, L1.h hVar, L1.h hVar2, L1.h hVar3, ProductCardDecorator productCardDecorator, L1.h hVar4, float f10, boolean z10, boolean z11, Function0<Unit> function0, Function0<Unit> function02, boolean z12, ClippableCouponDecorator clippableCouponDecorator, Function1<? super InterfaceC17146a, Unit> function1, int i10, Function0<Unit> function03, boolean z13, Function0<Unit> function04) {
                            this.f161995a = localThemeScope;
                            this.f161996b = nVar;
                            this.f161997c = hVar;
                            this.f161998d = hVar2;
                            this.f161999e = hVar3;
                            this.f162000f = productCardDecorator;
                            this.f162001g = hVar4;
                            this.f162002h = f10;
                            this.f162003i = z10;
                            this.f162004j = z11;
                            this.f162005k = function0;
                            this.f162006l = function02;
                            this.f162007m = z12;
                            this.f162008n = clippableCouponDecorator;
                            this.f162009o = function1;
                            this.f162010p = i10;
                            this.f162011q = function03;
                            this.f162012r = z13;
                            this.f162013s = function04;
                        }

                        public final void a(RegularPrice Assemble, Composer composer, int i10) {
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
                                ComposerKt.U(-490004727, i11, -1, "com.meijer.mobile.ui.productcard.HorizontalProductCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductCard.kt:267)");
                            }
                            LocalThemeScope localThemeScope = this.f161995a;
                            q1.Column productColumn = Assemble.getContainers().getProductColumn();
                            Modifier modifier = Assemble.getContainers().getProductColumn().getModifier();
                            L1.n nVar = this.f161996b;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            L1.h hVar = this.f161997c;
                            composer.startReplaceGroup(5004770);
                            boolean zV = composer.V(this.f161998d);
                            L1.h hVar2 = this.f161998d;
                            Object objB = composer.B();
                            if (zV || objB == Composer.INSTANCE.a()) {
                                objB = new C2536a(hVar2);
                                composer.t(objB);
                            }
                            composer.P();
                            q1.Column columnY = q1.Column.y(productColumn, modifier.then(nVar.k(companion, hVar, (Function1) objB)), null, null, 6, null);
                            ComposableLambda composableLambdaC = ComposableLambdaKt.c(-1133621165, true, new b(this.f161995a, this.f162000f, this.f162002h), composer, 54);
                            int i12 = LocalThemeScope.f17314g;
                            int i13 = q1.Column.f142240d;
                            C16453n.e(localThemeScope, columnY, composableLambdaC, composer, i12 | 384 | (i13 << 3));
                            LocalThemeScope localThemeScope2 = this.f161995a;
                            q1.Column productColumn2 = Assemble.getContainers().getProductColumn();
                            Modifier modifier2 = Assemble.getContainers().getProductColumn().getModifier();
                            L1.n nVar2 = this.f161996b;
                            float f10 = 0;
                            Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, 0.0f, H1.h.p(f10), 0.0f, H1.h.p(f10), 5, null);
                            L1.h hVar3 = this.f161999e;
                            composer.startReplaceGroup(-1746271574);
                            boolean zV2 = composer.V(this.f161997c) | composer.D(this.f162000f) | composer.V(this.f162001g);
                            L1.h hVar4 = this.f161997c;
                            ProductCardDecorator productCardDecorator = this.f162000f;
                            L1.h hVar5 = this.f162001g;
                            Object objB2 = composer.B();
                            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                                objB2 = new C2538c(hVar4, productCardDecorator, hVar5);
                                composer.t(objB2);
                            }
                            composer.P();
                            C16453n.e(localThemeScope2, q1.Column.y(productColumn2, modifier2.then(nVar2.k(modifierM, hVar3, (Function1) objB2)), null, null, 6, null), ComposableLambdaKt.c(-95800118, true, new C2539d(this.f162000f, this.f162002h, this.f161995a, this.f162003i, this.f162004j, this.f162005k, this.f162006l, this.f162007m, this.f162008n, this.f162009o, this.f162010p, this.f162011q, this.f162012r, this.f162013s), composer, 54), composer, i12 | 384 | (i13 << 3));
                            if (ComposerKt.M()) {
                                ComposerKt.T();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RegularPrice regularPrice, Composer composer, Integer num) {
                            a(regularPrice, composer, num.intValue());
                            return Unit.f143329a;
                        }
                    }

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: ss.v$g$a$e$c$e, reason: collision with other inner class name */
                    static final class C2542e implements Function1<C4010g, Unit> {

                        /* renamed from: a, reason: collision with root package name */
                        public static final C2542e f162041a = new C2542e();

                        public final void a(C4010g constrainAs) {
                            Intrinsics.j(constrainAs, "$this$constrainAs");
                            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                            a(c4010g);
                            return Unit.f143329a;
                        }

                        C2542e() {
                        }
                    }

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    static final class f implements Function1<Modifier, Modifier> {

                        /* renamed from: a, reason: collision with root package name */
                        public static final f f162042a = new f();

                        @Override // kotlin.jvm.functions.Function1
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Modifier invoke(Modifier modifier) {
                            Intrinsics.j(modifier, "$this$if");
                            return T0.a.a(modifier, 0.0f);
                        }

                        f() {
                        }
                    }

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: ss.v$g$a$e$c$g, reason: collision with other inner class name */
                    static final class C2543g implements Function2<Double, Double, Unit> {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ Function1<InterfaceC17146a, Unit> f162043a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ ProductCardDecorator f162044b;

                        /* JADX WARN: Multi-variable type inference failed */
                        C2543g(Function1<? super InterfaceC17146a, Unit> function1, ProductCardDecorator productCardDecorator) {
                            this.f162043a = function1;
                            this.f162044b = productCardDecorator;
                        }

                        public final void a(double d10, double d11) {
                            Function1<InterfaceC17146a, Unit> function1 = this.f162043a;
                            if (function1 != null) {
                                function1.invoke(new InterfaceC17146a.UpdateEntry(this.f162044b.getProduct(), d10));
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Double d10, Double d11) {
                            a(d10.doubleValue(), d11.doubleValue());
                            return Unit.f143329a;
                        }
                    }

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    static final class h implements Function0<Unit> {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ Function0<Unit> f162045a;

                        h(Function0<Unit> function0) {
                            this.f162045a = function0;
                        }

                        public final void a() {
                            this.f162045a.invoke();
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            a();
                            return Unit.f143329a;
                        }
                    }

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    static final class i implements Function1<C4010g, Unit> {

                        /* renamed from: a, reason: collision with root package name */
                        public static final i f162046a = new i();

                        public final void a(C4010g constrainAs) {
                            Intrinsics.j(constrainAs, "$this$constrainAs");
                            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                            a(c4010g);
                            return Unit.f143329a;
                        }

                        i() {
                        }
                    }

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    static final class j implements Function2<Double, Double, Unit> {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ Function1<InterfaceC17146a, Unit> f162047a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ ProductCardDecorator f162048b;

                        /* JADX WARN: Multi-variable type inference failed */
                        j(Function1<? super InterfaceC17146a, Unit> function1, ProductCardDecorator productCardDecorator) {
                            this.f162047a = function1;
                            this.f162048b = productCardDecorator;
                        }

                        public final void a(double d10, double d11) {
                            Function1<InterfaceC17146a, Unit> function1 = this.f162047a;
                            if (function1 != null) {
                                function1.invoke(new InterfaceC17146a.UpdateEntry(this.f162048b.getProduct(), d10));
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Double d10, Double d11) {
                            a(d10.doubleValue(), d11.doubleValue());
                            return Unit.f143329a;
                        }
                    }

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    public static final class k extends Lambda implements Function1<r1.u, Unit> {

                        /* renamed from: f, reason: collision with root package name */
                        final /* synthetic */ A f162049f;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public k(A a10) {
                            super(1);
                            this.f162049f = a10;
                        }

                        public final void a(r1.u semantics) {
                            Intrinsics.j(semantics, "$this$semantics");
                            C.a(semantics, this.f162049f);
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

                        /* renamed from: A, reason: collision with root package name */
                        final /* synthetic */ Function0 f162050A;

                        /* renamed from: B, reason: collision with root package name */
                        final /* synthetic */ Function0 f162051B;

                        /* renamed from: C, reason: collision with root package name */
                        final /* synthetic */ double f162052C;

                        /* renamed from: f, reason: collision with root package name */
                        final /* synthetic */ int f162053f;

                        /* renamed from: g, reason: collision with root package name */
                        final /* synthetic */ L1.n f162054g;

                        /* renamed from: h, reason: collision with root package name */
                        final /* synthetic */ Function0 f162055h;

                        /* renamed from: i, reason: collision with root package name */
                        final /* synthetic */ LocalThemeScope f162056i;

                        /* renamed from: j, reason: collision with root package name */
                        final /* synthetic */ RegularPrice f162057j;

                        /* renamed from: k, reason: collision with root package name */
                        final /* synthetic */ boolean f162058k;

                        /* renamed from: l, reason: collision with root package name */
                        final /* synthetic */ ProductCardDecorator f162059l;

                        /* renamed from: m, reason: collision with root package name */
                        final /* synthetic */ boolean f162060m;

                        /* renamed from: n, reason: collision with root package name */
                        final /* synthetic */ boolean f162061n;

                        /* renamed from: o, reason: collision with root package name */
                        final /* synthetic */ float f162062o;

                        /* renamed from: p, reason: collision with root package name */
                        final /* synthetic */ boolean f162063p;

                        /* renamed from: q, reason: collision with root package name */
                        final /* synthetic */ boolean f162064q;

                        /* renamed from: r, reason: collision with root package name */
                        final /* synthetic */ Function0 f162065r;

                        /* renamed from: s, reason: collision with root package name */
                        final /* synthetic */ Function0 f162066s;

                        /* renamed from: t, reason: collision with root package name */
                        final /* synthetic */ boolean f162067t;

                        /* renamed from: u, reason: collision with root package name */
                        final /* synthetic */ ClippableCouponDecorator f162068u;

                        /* renamed from: v, reason: collision with root package name */
                        final /* synthetic */ Function1 f162069v;

                        /* renamed from: w, reason: collision with root package name */
                        final /* synthetic */ int f162070w;

                        /* renamed from: x, reason: collision with root package name */
                        final /* synthetic */ Function0 f162071x;

                        /* renamed from: y, reason: collision with root package name */
                        final /* synthetic */ boolean f162072y;

                        /* renamed from: z, reason: collision with root package name */
                        final /* synthetic */ Function0 f162073z;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public l(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, RegularPrice regularPrice, boolean z10, ProductCardDecorator productCardDecorator, boolean z11, boolean z12, float f10, boolean z13, boolean z14, Function0 function02, Function0 function03, boolean z15, ClippableCouponDecorator clippableCouponDecorator, Function1 function1, int i11, Function0 function04, boolean z16, Function0 function05, Function0 function06, Function0 function07, double d10) {
                            super(2);
                            this.f162054g = nVar;
                            this.f162055h = function0;
                            this.f162056i = localThemeScope;
                            this.f162057j = regularPrice;
                            this.f162058k = z10;
                            this.f162059l = productCardDecorator;
                            this.f162060m = z11;
                            this.f162061n = z12;
                            this.f162062o = f10;
                            this.f162063p = z13;
                            this.f162064q = z14;
                            this.f162065r = function02;
                            this.f162066s = function03;
                            this.f162067t = z15;
                            this.f162068u = clippableCouponDecorator;
                            this.f162069v = function1;
                            this.f162070w = i11;
                            this.f162071x = function04;
                            this.f162072y = z16;
                            this.f162073z = function05;
                            this.f162050A = function06;
                            this.f162051B = function07;
                            this.f162052C = d10;
                            this.f162053f = i10;
                        }

                        public final void a(Composer composer, int i10) {
                            int i11;
                            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                                composer.K();
                                return;
                            }
                            int helpersHashCode = this.f162054g.getHelpersHashCode();
                            this.f162054g.i();
                            L1.n nVar = this.f162054g;
                            composer.startReplaceGroup(-1393999004);
                            n.b bVarM = nVar.m();
                            L1.h hVarA = bVarM.a();
                            L1.h hVarC = bVarM.c();
                            L1.h hVarD = bVarM.d();
                            L1.h hVarE = bVarM.e();
                            L1.h hVarF = bVarM.f();
                            LocalThemeScope localThemeScope = this.f162056i;
                            q1.Column imgColumn = this.f162057j.getContainers().getImgColumn();
                            Modifier modifier = this.f162057j.getContainers().getImgColumn().getModifier();
                            Modifier.Companion companion = Modifier.INSTANCE;
                            composer.startReplaceGroup(1849434622);
                            Object objB = composer.B();
                            Composer.Companion companion2 = Composer.INSTANCE;
                            if (objB == companion2.a()) {
                                objB = C2533a.f161988a;
                                composer.t(objB);
                            }
                            composer.P();
                            q1.Column columnY = q1.Column.y(imgColumn, modifier.then(nVar.k(companion, hVarA, (Function1) objB)), null, null, 6, null);
                            ComposableLambda composableLambdaC = ComposableLambdaKt.c(-1458505062, true, new b(this.f162059l, this.f162058k, this.f162061n, this.f162062o), composer, 54);
                            int i12 = LocalThemeScope.f17314g;
                            C16453n.e(localThemeScope, columnY, composableLambdaC, composer, i12 | 384 | (q1.Column.f142240d << 3));
                            LocalThemeScope localThemeScope2 = this.f162056i;
                            composer.startReplaceGroup(1849434622);
                            Object objB2 = composer.B();
                            if (objB2 == companion2.a()) {
                                objB2 = C2535c.f161994h;
                                composer.t(objB2);
                            }
                            composer.P();
                            Q.f(localThemeScope2, (Function1) objB2, ComposableLambdaKt.c(-490004727, true, new d(this.f162056i, nVar, hVarF, hVarA, hVarC, this.f162059l, hVarD, this.f162062o, this.f162063p, this.f162064q, this.f162065r, this.f162066s, this.f162067t, this.f162068u, this.f162069v, this.f162070w, this.f162071x, this.f162072y, this.f162073z), composer, 54), composer, i12 | 432);
                            composer.startReplaceGroup(925176932);
                            if (!this.f162058k && this.f162059l.getIsEligibleForCart() && this.f162060m) {
                                composer.startReplaceGroup(1849434622);
                                Object objB3 = composer.B();
                                if (objB3 == companion2.a()) {
                                    objB3 = C2542e.f162041a;
                                    composer.t(objB3);
                                }
                                composer.P();
                                Modifier modifierK = nVar.k(companion, hVarD, (Function1) objB3);
                                boolean isStepperExpanded = this.f162059l.getIsStepperExpanded();
                                composer.startReplaceGroup(1849434622);
                                Object objB4 = composer.B();
                                if (objB4 == companion2.a()) {
                                    objB4 = f.f162042a;
                                    composer.t(objB4);
                                }
                                composer.P();
                                Modifier modifierF = C18370z.f(androidx.compose.foundation.layout.D.m(v.n0(modifierK, isStepperExpanded, (Function1) objB4), H1.h.p(4), 0.0f, 0.0f, 0.0f, 14, null), "quantityStepper", null, 2, null);
                                C5800d c5800d = C5800d.f48779a;
                                C5800d.m mVarH = c5800d.h();
                                e.Companion companion3 = P0.e.INSTANCE;
                                MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion3.k(), composer, 0);
                                int iA = C5859f.a(composer, 0);
                                InterfaceC5884s interfaceC5884sR = composer.r();
                                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierF);
                                InterfaceC5953g.Companion companion4 = InterfaceC5953g.INSTANCE;
                                Function0<InterfaceC5953g> function0A = companion4.a();
                                if (composer.k() == null) {
                                    C5859f.c();
                                }
                                composer.F();
                                if (composer.getInserting()) {
                                    composer.I(function0A);
                                } else {
                                    composer.s();
                                }
                                Composer composerA = D1.a(composer);
                                D1.c(composerA, measurePolicyA, companion4.e());
                                D1.c(composerA, interfaceC5884sR, companion4.g());
                                Function2<InterfaceC5953g, Integer, Unit> function2B = companion4.b();
                                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                                    composerA.t(Integer.valueOf(iA));
                                    composerA.n(Integer.valueOf(iA), function2B);
                                }
                                D1.c(composerA, modifierE, companion4.f());
                                C14903g c14903g = C14903g.f139698a;
                                double actualQuantity = this.f162059l.getActualQuantity();
                                double qtyIncrement = this.f162059l.getQtyIncrement();
                                String strC = C16338g.c(Cj.o.f5007B, composer, 0);
                                String strC2 = C16338g.c(Cj.o.f5092v, composer, 0);
                                String strC3 = C16338g.c(Cj.o.f5034O0, composer, 0);
                                LocalThemeScope localThemeScope3 = this.f162056i;
                                composer.startReplaceGroup(-1633490746);
                                boolean zD = composer.D(this.f162059l) | composer.V(this.f162069v);
                                Object objB5 = composer.B();
                                if (zD || objB5 == companion2.a()) {
                                    objB5 = new C2543g(this.f162069v, this.f162059l);
                                    composer.t(objB5);
                                }
                                Function2 function2 = (Function2) objB5;
                                composer.P();
                                composer.startReplaceGroup(5004770);
                                boolean zV = composer.V(this.f162050A);
                                Object objB6 = composer.B();
                                if (zV || objB6 == companion2.a()) {
                                    objB6 = new h(this.f162050A);
                                    composer.t(objB6);
                                }
                                composer.P();
                                i11 = helpersHashCode;
                                Lj.k.n(localThemeScope3, actualQuantity, function2, false, (Function0) objB6, this.f162051B, qtyIncrement, this.f162052C, AnimatedGradientTextView.ANIMATION_DURATION, strC, strC2, null, strC3, null, false, null, composer, i12 | 100666368, 0, 29696);
                                composer.v();
                                if (this.f162059l.getIsStepperExpanded()) {
                                    composer.startReplaceGroup(1849434622);
                                    Object objB7 = composer.B();
                                    if (objB7 == companion2.a()) {
                                        objB7 = i.f162046a;
                                        composer.t(objB7);
                                    }
                                    composer.P();
                                    Modifier modifierK2 = nVar.k(companion, hVarE, (Function1) objB7);
                                    MeasurePolicy measurePolicyA2 = C5807k.a(c5800d.h(), companion3.k(), composer, 0);
                                    int iA2 = C5859f.a(composer, 0);
                                    InterfaceC5884s interfaceC5884sR2 = composer.r();
                                    Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierK2);
                                    Function0<InterfaceC5953g> function0A2 = companion4.a();
                                    if (composer.k() == null) {
                                        C5859f.c();
                                    }
                                    composer.F();
                                    if (composer.getInserting()) {
                                        composer.I(function0A2);
                                    } else {
                                        composer.s();
                                    }
                                    Composer composerA2 = D1.a(composer);
                                    D1.c(composerA2, measurePolicyA2, companion4.e());
                                    D1.c(composerA2, interfaceC5884sR2, companion4.g());
                                    Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion4.b();
                                    if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                                        composerA2.t(Integer.valueOf(iA2));
                                        composerA2.n(Integer.valueOf(iA2), function2B2);
                                    }
                                    D1.c(composerA2, modifierE2, companion4.f());
                                    double actualQuantity2 = this.f162059l.getActualQuantity();
                                    boolean isStepperExpanded2 = this.f162059l.getIsStepperExpanded();
                                    double qtyIncrement2 = this.f162059l.getQtyIncrement();
                                    String strC4 = C16338g.c(Cj.o.f5007B, composer, 0);
                                    String strC5 = C16338g.c(Cj.o.f5092v, composer, 0);
                                    String strC6 = C16338g.c(Cj.o.f5034O0, composer, 0);
                                    LocalThemeScope localThemeScope4 = this.f162056i;
                                    composer.startReplaceGroup(-1633490746);
                                    boolean zV2 = composer.V(this.f162069v) | composer.D(this.f162059l);
                                    Object objB8 = composer.B();
                                    if (zV2 || objB8 == companion2.a()) {
                                        objB8 = new j(this.f162069v, this.f162059l);
                                        composer.t(objB8);
                                    }
                                    composer.P();
                                    Lj.k.n(localThemeScope4, actualQuantity2, (Function2) objB8, isStepperExpanded2, this.f162050A, this.f162051B, qtyIncrement2, this.f162052C, AnimatedGradientTextView.ANIMATION_DURATION, strC4, strC5, null, strC6, null, false, null, composer, i12 | 100663296, 0, 29696);
                                    composer.v();
                                }
                            } else {
                                i11 = helpersHashCode;
                            }
                            composer.P();
                            composer.P();
                            if (this.f162054g.getHelpersHashCode() != i11) {
                                this.f162055h.invoke();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            a(composer, num.intValue());
                            return Unit.f143329a;
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    c(LocalThemeScope localThemeScope, RegularPrice regularPrice, boolean z10, ProductCardDecorator productCardDecorator, boolean z11, boolean z12, float f10, boolean z13, boolean z14, Function0<Unit> function0, Function0<Unit> function02, boolean z15, ClippableCouponDecorator clippableCouponDecorator, Function1<? super InterfaceC17146a, Unit> function1, int i10, Function0<Unit> function03, boolean z16, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, double d10) {
                        this.f161967a = localThemeScope;
                        this.f161968b = regularPrice;
                        this.f161969c = z10;
                        this.f161970d = productCardDecorator;
                        this.f161971e = z11;
                        this.f161972f = z12;
                        this.f161973g = f10;
                        this.f161974h = z13;
                        this.f161975i = z14;
                        this.f161976j = function0;
                        this.f161977k = function02;
                        this.f161978l = z15;
                        this.f161979m = clippableCouponDecorator;
                        this.f161980n = function1;
                        this.f161981o = i10;
                        this.f161982p = function03;
                        this.f161983q = z16;
                        this.f161984r = function04;
                        this.f161985s = function05;
                        this.f161986t = function06;
                        this.f161987u = d10;
                    }

                    public final void a(InterfaceC14888I AdsRow, Composer composer, int i10) {
                        L1.n nVar;
                        Intrinsics.j(AdsRow, "$this$AdsRow");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-841564327, i10, -1, "com.meijer.mobile.ui.productcard.HorizontalProductCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductCard.kt:237)");
                        }
                        Modifier modifierF = J.f(Modifier.INSTANCE, 0.0f, 1, null);
                        LocalThemeScope localThemeScope = this.f161967a;
                        RegularPrice regularPrice = this.f161968b;
                        boolean z10 = this.f161969c;
                        ProductCardDecorator productCardDecorator = this.f161970d;
                        boolean z11 = this.f161971e;
                        boolean z12 = this.f161972f;
                        float f10 = this.f161973g;
                        boolean z13 = this.f161974h;
                        boolean z14 = this.f161975i;
                        Function0<Unit> function0 = this.f161976j;
                        Function0<Unit> function02 = this.f161977k;
                        boolean z15 = this.f161978l;
                        ClippableCouponDecorator clippableCouponDecorator = this.f161979m;
                        Function1<InterfaceC17146a, Unit> function1 = this.f161980n;
                        int i11 = this.f161981o;
                        Function0<Unit> function03 = this.f161982p;
                        boolean z16 = this.f161983q;
                        Function0<Unit> function04 = this.f161984r;
                        Function0<Unit> function05 = this.f161985s;
                        Function0<Unit> function06 = this.f161986t;
                        double d10 = this.f161987u;
                        composer.startReplaceableGroup(-270267587);
                        composer.startReplaceableGroup(-3687241);
                        Object objB = composer.B();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objB == companion.a()) {
                            objB = new A();
                            composer.t(objB);
                        }
                        composer.U();
                        A a10 = (A) objB;
                        composer.startReplaceableGroup(-3687241);
                        Object objB2 = composer.B();
                        if (objB2 == companion.a()) {
                            objB2 = new L1.n();
                            composer.t(objB2);
                        }
                        composer.U();
                        L1.n nVar2 = (L1.n) objB2;
                        composer.startReplaceableGroup(-3687241);
                        Object objB3 = composer.B();
                        if (objB3 == companion.a()) {
                            nVar = nVar2;
                            objB3 = t1.e(Boolean.FALSE, null, 2, null);
                            composer.t(objB3);
                        } else {
                            nVar = nVar2;
                        }
                        composer.U();
                        Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5872l0) objB3, a10, composer, 4544);
                        androidx.compose.ui.layout.A.a(C16819m.d(modifierF, false, new k(a10), 1, null), ComposableLambdaKt.composableLambda(composer, -819894182, true, new l(nVar, 6, pairH.b(), localThemeScope, regularPrice, z10, productCardDecorator, z11, z12, f10, z13, z14, function0, function02, z15, clippableCouponDecorator, function1, i11, function03, z16, function04, function05, function06, d10)), pairH.a(), composer, 48, 0);
                        composer.U();
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

                /* JADX WARN: Multi-variable type inference failed */
                e(LocalThemeScope localThemeScope, RegularPrice regularPrice, ProductCardDecorator productCardDecorator, boolean z10, int i10, float f10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, Function0<Unit> function0, Function0<Unit> function02, boolean z20, ClippableCouponDecorator clippableCouponDecorator, Function1<? super InterfaceC17146a, Unit> function1, int i11, Function0<Unit> function03, boolean z21, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, double d10) {
                    this.f161934a = localThemeScope;
                    this.f161935b = regularPrice;
                    this.f161936c = productCardDecorator;
                    this.f161937d = z10;
                    this.f161938e = i10;
                    this.f161939f = f10;
                    this.f161940g = z11;
                    this.f161941h = z12;
                    this.f161942i = z13;
                    this.f161943j = z14;
                    this.f161944k = z15;
                    this.f161945l = z16;
                    this.f161946m = z17;
                    this.f161947n = z18;
                    this.f161948o = z19;
                    this.f161949p = function0;
                    this.f161950q = function02;
                    this.f161951r = z20;
                    this.f161952s = clippableCouponDecorator;
                    this.f161953t = function1;
                    this.f161954u = i11;
                    this.f161955v = function03;
                    this.f161956w = z21;
                    this.f161957x = function04;
                    this.f161958y = function05;
                    this.f161959z = function06;
                    this.f161933A = d10;
                }

                public final void a(InterfaceC14902f AdsColumn, Composer composer, int i10) {
                    int i11;
                    Intrinsics.j(AdsColumn, "$this$AdsColumn");
                    if ((i10 & 6) == 0) {
                        i11 = i10 | (composer.V(AdsColumn) ? 4 : 2);
                    } else {
                        i11 = i10;
                    }
                    if ((i11 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1223368930, i11, -1, "com.meijer.mobile.ui.productcard.HorizontalProductCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductCard.kt:188)");
                    }
                    LocalThemeScope localThemeScope = this.f161934a;
                    q1.Row tagRow = this.f161935b.getContainers().getTagRow();
                    Modifier modifier = this.f161935b.getContainers().getTagRow().getModifier();
                    Modifier.Companion companion = Modifier.INSTANCE;
                    float f10 = 4;
                    float f11 = 8;
                    Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, H1.h.p(f10), H1.h.p(16), H1.h.p(f11), 0.0f, 8, null);
                    boolean isStepperExpanded = this.f161936c.getIsStepperExpanded();
                    composer.startReplaceGroup(5004770);
                    float f12 = this.f161939f;
                    Object objB = composer.B();
                    if (objB == Composer.INSTANCE.a()) {
                        objB = new C2532a(f12);
                        composer.t(objB);
                    }
                    composer.P();
                    q1.Row rowY = q1.Row.y(tagRow, modifier.then(v.n0(modifierM, isStepperExpanded, (Function1) objB)), null, null, 6, null);
                    ComposableLambda composableLambdaC = ComposableLambdaKt.c(230880418, true, new b(this.f161940g, this.f161941h, this.f161942i, this.f161936c, this.f161943j, this.f161934a), composer, 54);
                    int i12 = LocalThemeScope.f17314g;
                    int i13 = q1.Row.f142392d;
                    C16453n.i(localThemeScope, rowY, composableLambdaC, composer, i12 | 384 | (i13 << 3));
                    C16453n.i(this.f161934a, q1.Row.y(this.f161935b.getContainers().getBodyRow(), androidx.compose.foundation.layout.D.l(companion, H1.h.p(f11), H1.h.p(0), H1.h.p(f11), H1.h.p(f11)), null, null, 6, null), ComposableLambdaKt.c(-841564327, true, new c(this.f161934a, this.f161935b, this.f161944k, this.f161936c, this.f161945l, this.f161946m, this.f161939f, this.f161947n, this.f161948o, this.f161949p, this.f161950q, this.f161951r, this.f161952s, this.f161953t, this.f161954u, this.f161955v, this.f161956w, this.f161957x, this.f161958y, this.f161959z, this.f161933A), composer, 54), composer, i12 | 384 | (i13 << 3));
                    if (this.f161937d) {
                        C14890K.a(J.i(companion, this.f161934a.getAdsSpacing().getFive().getDp()), composer, 0);
                        LocalThemeScope localThemeScope2 = this.f161934a;
                        si.j.h(localThemeScope2, new q1.Label(androidx.compose.foundation.layout.D.k(androidx.compose.foundation.b.c(AdsColumn.c(companion, P0.e.INSTANCE.j()), this.f161934a.getAdsColors().l().l().getColor(), C16806i.c(H1.h.p(f10))), this.f161934a.getAdsSpacing().getTwo().getDp(), 0.0f, 2, null), this.f161934a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getHeadings().getNine(), null, 380, null), C13698b.a(AbstractC6392a.INSTANCE.d(Cj.o.f5091u0, Integer.valueOf(this.f161938e)), composer, AbstractC6392a.f60445b), null, composer, i12 | (q1.Label.f142335j << 3), 4);
                        C14890K.a(J.i(companion, this.f161934a.getAdsSpacing().getFive().getDp()), composer, 0);
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
            public static final class f extends Lambda implements Function1<r1.u, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ A f162074f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public f(A a10) {
                    super(1);
                    this.f162074f = a10;
                }

                public final void a(r1.u semantics) {
                    Intrinsics.j(semantics, "$this$semantics");
                    C.a(semantics, this.f162074f);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
                    a(uVar);
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: ss.v$g$a$g, reason: collision with other inner class name */
            public static final class C2544g extends Lambda implements Function2<Composer, Integer, Unit> {

                /* renamed from: A, reason: collision with root package name */
                final /* synthetic */ Function0 f162075A;

                /* renamed from: B, reason: collision with root package name */
                final /* synthetic */ Function0 f162076B;

                /* renamed from: C, reason: collision with root package name */
                final /* synthetic */ boolean f162077C;

                /* renamed from: D, reason: collision with root package name */
                final /* synthetic */ ClippableCouponDecorator f162078D;

                /* renamed from: E, reason: collision with root package name */
                final /* synthetic */ Function0 f162079E;

                /* renamed from: F, reason: collision with root package name */
                final /* synthetic */ boolean f162080F;

                /* renamed from: G, reason: collision with root package name */
                final /* synthetic */ Function0 f162081G;

                /* renamed from: H, reason: collision with root package name */
                final /* synthetic */ Function0 f162082H;

                /* renamed from: I, reason: collision with root package name */
                final /* synthetic */ Function0 f162083I;

                /* renamed from: J, reason: collision with root package name */
                final /* synthetic */ double f162084J;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ int f162085f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ L1.n f162086g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ Function0 f162087h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ boolean f162088i;

                /* renamed from: j, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f162089j;

                /* renamed from: k, reason: collision with root package name */
                final /* synthetic */ RegularPrice f162090k;

                /* renamed from: l, reason: collision with root package name */
                final /* synthetic */ boolean f162091l;

                /* renamed from: m, reason: collision with root package name */
                final /* synthetic */ boolean f162092m;

                /* renamed from: n, reason: collision with root package name */
                final /* synthetic */ Function1 f162093n;

                /* renamed from: o, reason: collision with root package name */
                final /* synthetic */ ProductCardDecorator f162094o;

                /* renamed from: p, reason: collision with root package name */
                final /* synthetic */ int f162095p;

                /* renamed from: q, reason: collision with root package name */
                final /* synthetic */ boolean f162096q;

                /* renamed from: r, reason: collision with root package name */
                final /* synthetic */ int f162097r;

                /* renamed from: s, reason: collision with root package name */
                final /* synthetic */ float f162098s;

                /* renamed from: t, reason: collision with root package name */
                final /* synthetic */ boolean f162099t;

                /* renamed from: u, reason: collision with root package name */
                final /* synthetic */ boolean f162100u;

                /* renamed from: v, reason: collision with root package name */
                final /* synthetic */ boolean f162101v;

                /* renamed from: w, reason: collision with root package name */
                final /* synthetic */ boolean f162102w;

                /* renamed from: x, reason: collision with root package name */
                final /* synthetic */ boolean f162103x;

                /* renamed from: y, reason: collision with root package name */
                final /* synthetic */ boolean f162104y;

                /* renamed from: z, reason: collision with root package name */
                final /* synthetic */ boolean f162105z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2544g(L1.n nVar, int i10, Function0 function0, boolean z10, LocalThemeScope localThemeScope, RegularPrice regularPrice, boolean z11, boolean z12, Function1 function1, ProductCardDecorator productCardDecorator, int i11, boolean z13, int i12, float f10, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, Function0 function02, Function0 function03, boolean z21, ClippableCouponDecorator clippableCouponDecorator, Function0 function04, boolean z22, Function0 function05, Function0 function06, Function0 function07, double d10) {
                    super(2);
                    this.f162086g = nVar;
                    this.f162087h = function0;
                    this.f162088i = z10;
                    this.f162089j = localThemeScope;
                    this.f162090k = regularPrice;
                    this.f162091l = z11;
                    this.f162092m = z12;
                    this.f162093n = function1;
                    this.f162094o = productCardDecorator;
                    this.f162095p = i11;
                    this.f162096q = z13;
                    this.f162097r = i12;
                    this.f162098s = f10;
                    this.f162099t = z14;
                    this.f162100u = z15;
                    this.f162101v = z16;
                    this.f162102w = z17;
                    this.f162103x = z18;
                    this.f162104y = z19;
                    this.f162105z = z20;
                    this.f162075A = function02;
                    this.f162076B = function03;
                    this.f162077C = z21;
                    this.f162078D = clippableCouponDecorator;
                    this.f162079E = function04;
                    this.f162080F = z22;
                    this.f162081G = function05;
                    this.f162082H = function06;
                    this.f162083I = function07;
                    this.f162084J = d10;
                    this.f162085f = i10;
                }

                public final void a(Composer composer, int i10) {
                    Modifier modifierM;
                    if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                        composer.K();
                        return;
                    }
                    int helpersHashCode = this.f162086g.getHelpersHashCode();
                    this.f162086g.i();
                    L1.n nVar = this.f162086g;
                    composer.startReplaceGroup(587053290);
                    n.b bVarM = nVar.m();
                    L1.h hVarA = bVarM.a();
                    L1.h hVarC = bVarM.c();
                    composer.startReplaceGroup(-1920743189);
                    if (this.f162088i) {
                        Modifier modifierM2 = androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, this.f162089j.getAdsSpacing().getFive().getDp(), 0.0f, 0.0f, 0.0f, 14, null);
                        composer.startReplaceGroup(1849434622);
                        Object objB = composer.B();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objB == companion.a()) {
                            objB = C2531a.f161927a;
                            composer.t(objB);
                        }
                        composer.P();
                        Modifier modifierK = nVar.k(modifierM2, hVarA, (Function1) objB);
                        MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
                        int iA = C5859f.a(composer, 0);
                        InterfaceC5884s interfaceC5884sR = composer.r();
                        Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
                        InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                        Function0<InterfaceC5953g> function0A = companion2.a();
                        if (composer.k() == null) {
                            C5859f.c();
                        }
                        composer.F();
                        if (composer.getInserting()) {
                            composer.I(function0A);
                        } else {
                            composer.s();
                        }
                        Composer composerA = D1.a(composer);
                        D1.c(composerA, measurePolicyA, companion2.e());
                        D1.c(composerA, interfaceC5884sR, companion2.g());
                        Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        D1.c(composerA, modifierE, companion2.f());
                        C14903g c14903g = C14903g.f139698a;
                        LocalThemeScope localThemeScope = this.f162089j;
                        boolean z10 = this.f162091l;
                        boolean z11 = this.f162092m;
                        composer.startReplaceGroup(-1746271574);
                        boolean zV = composer.V(this.f162093n) | composer.D(this.f162094o) | composer.d(this.f162095p);
                        Object objB2 = composer.B();
                        if (zV || objB2 == companion.a()) {
                            objB2 = new b(this.f162093n, this.f162094o, this.f162095p);
                            composer.t(objB2);
                        }
                        composer.P();
                        Kj.b.b(localThemeScope, z10, null, z11, (Function1) objB2, composer, LocalThemeScope.f17314g, 2);
                        composer.v();
                    }
                    composer.P();
                    LocalThemeScope localThemeScope2 = this.f162089j;
                    q1.Column horizontalContainer = this.f162090k.getContainers().getHorizontalContainer();
                    Modifier modifier = this.f162090k.getContainers().getHorizontalContainer().getModifier();
                    if (this.f162088i) {
                        composer.startReplaceGroup(587727539);
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        composer.startReplaceGroup(5004770);
                        boolean zV2 = composer.V(hVarA);
                        Object objB3 = composer.B();
                        if (zV2 || objB3 == Composer.INSTANCE.a()) {
                            objB3 = new c(hVarA);
                            composer.t(objB3);
                        }
                        composer.P();
                        modifierM = androidx.compose.foundation.layout.D.k(nVar.k(companion3, hVarC, (Function1) objB3), this.f162089j.getAdsSpacing().getFive().getDp(), 0.0f, 2, null);
                        composer.P();
                    } else {
                        composer.startReplaceGroup(588180542);
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        composer.startReplaceGroup(1849434622);
                        Object objB4 = composer.B();
                        if (objB4 == Composer.INSTANCE.a()) {
                            objB4 = d.f161932a;
                            composer.t(objB4);
                        }
                        composer.P();
                        modifierM = androidx.compose.foundation.layout.D.m(nVar.k(companion4, hVarC, (Function1) objB4), 0.0f, 0.0f, this.f162089j.getAdsSpacing().getTwo().getDp(), 0.0f, 11, null);
                        composer.P();
                    }
                    C16453n.e(localThemeScope2, q1.Column.y(horizontalContainer, modifier.then(modifierM), null, null, 6, null), ComposableLambdaKt.c(1223368930, true, new e(this.f162089j, this.f162090k, this.f162094o, this.f162096q, this.f162097r, this.f162098s, this.f162099t, this.f162100u, this.f162101v, this.f162102w, this.f162088i, this.f162103x, this.f162092m, this.f162104y, this.f162105z, this.f162075A, this.f162076B, this.f162077C, this.f162078D, this.f162093n, this.f162095p, this.f162079E, this.f162080F, this.f162081G, this.f162082H, this.f162083I, this.f162084J), composer, 54), composer, LocalThemeScope.f17314g | 384 | (q1.Column.f142240d << 3));
                    composer.P();
                    if (this.f162086g.getHelpersHashCode() != helpersHashCode) {
                        this.f162087h.invoke();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    a(composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(boolean z10, LocalThemeScope localThemeScope, RegularPrice regularPrice, boolean z11, boolean z12, Function1<? super InterfaceC17146a, Unit> function1, ProductCardDecorator productCardDecorator, int i10, boolean z13, int i11, float f10, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, Function0<Unit> function0, Function0<Unit> function02, boolean z21, ClippableCouponDecorator clippableCouponDecorator, Function0<Unit> function03, boolean z22, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, double d10) {
                this.f161901a = z10;
                this.f161902b = localThemeScope;
                this.f161903c = regularPrice;
                this.f161904d = z11;
                this.f161905e = z12;
                this.f161906f = function1;
                this.f161907g = productCardDecorator;
                this.f161908h = i10;
                this.f161909i = z13;
                this.f161910j = i11;
                this.f161911k = f10;
                this.f161912l = z14;
                this.f161913m = z15;
                this.f161914n = z16;
                this.f161915o = z17;
                this.f161916p = z18;
                this.f161917q = z19;
                this.f161918r = z20;
                this.f161919s = function0;
                this.f161920t = function02;
                this.f161921u = z21;
                this.f161922v = clippableCouponDecorator;
                this.f161923w = function03;
                this.f161924x = z22;
                this.f161925y = function04;
                this.f161926z = function05;
                this.f161899A = function06;
                this.f161900B = d10;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1769509729, i10, -1, "com.meijer.mobile.ui.productcard.HorizontalProductCard.<anonymous>.<anonymous> (ProductCard.kt:138)");
                }
                Modifier modifierD = J.d(Modifier.INSTANCE, 0.0f, 1, null);
                boolean z10 = this.f161901a;
                LocalThemeScope localThemeScope = this.f161902b;
                RegularPrice regularPrice = this.f161903c;
                boolean z11 = this.f161904d;
                boolean z12 = this.f161905e;
                Function1<InterfaceC17146a, Unit> function1 = this.f161906f;
                ProductCardDecorator productCardDecorator = this.f161907g;
                int i11 = this.f161908h;
                boolean z13 = this.f161909i;
                int i12 = this.f161910j;
                float f10 = this.f161911k;
                boolean z14 = this.f161912l;
                boolean z15 = this.f161913m;
                boolean z16 = this.f161914n;
                boolean z17 = this.f161915o;
                boolean z18 = this.f161916p;
                boolean z19 = this.f161917q;
                boolean z20 = this.f161918r;
                Function0<Unit> function0 = this.f161919s;
                Function0<Unit> function02 = this.f161920t;
                boolean z21 = this.f161921u;
                ClippableCouponDecorator clippableCouponDecorator = this.f161922v;
                Function0<Unit> function03 = this.f161923w;
                boolean z22 = this.f161924x;
                Function0<Unit> function04 = this.f161925y;
                Function0<Unit> function05 = this.f161926z;
                Function0<Unit> function06 = this.f161899A;
                double d10 = this.f161900B;
                composer.startReplaceableGroup(-270267587);
                composer.startReplaceableGroup(-3687241);
                Object objB = composer.B();
                Composer.Companion companion = Composer.INSTANCE;
                if (objB == companion.a()) {
                    objB = new A();
                    composer.t(objB);
                }
                composer.U();
                A a10 = (A) objB;
                composer.startReplaceableGroup(-3687241);
                Object objB2 = composer.B();
                if (objB2 == companion.a()) {
                    objB2 = new L1.n();
                    composer.t(objB2);
                }
                composer.U();
                L1.n nVar = (L1.n) objB2;
                composer.startReplaceableGroup(-3687241);
                Object objB3 = composer.B();
                if (objB3 == companion.a()) {
                    objB3 = t1.e(Boolean.FALSE, null, 2, null);
                    composer.t(objB3);
                }
                composer.U();
                Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5872l0) objB3, a10, composer, 4544);
                androidx.compose.ui.layout.A.a(C16819m.d(modifierD, false, new f(a10), 1, null), ComposableLambdaKt.composableLambda(composer, -819894182, true, new C2544g(nVar, 6, pairH.b(), z10, localThemeScope, regularPrice, z11, z12, function1, productCardDecorator, i11, z13, i12, f10, z14, z15, z16, z17, z18, z19, z20, function0, function02, z21, clippableCouponDecorator, function03, z22, function04, function05, function06, d10)), pairH.a(), composer, 48, 0);
                composer.U();
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

        /* JADX WARN: Multi-variable type inference failed */
        g(Function0<Unit> function0, boolean z10, LocalThemeScope localThemeScope, boolean z11, boolean z12, Function1<? super InterfaceC17146a, Unit> function1, ProductCardDecorator productCardDecorator, int i10, boolean z13, int i11, float f10, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, Function0<Unit> function02, boolean z21, ClippableCouponDecorator clippableCouponDecorator, Function0<Unit> function03, boolean z22, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, double d10) {
            this.f161873a = function0;
            this.f161874b = z10;
            this.f161875c = localThemeScope;
            this.f161876d = z11;
            this.f161877e = z12;
            this.f161878f = function1;
            this.f161879g = productCardDecorator;
            this.f161880h = i10;
            this.f161881i = z13;
            this.f161882j = i11;
            this.f161883k = f10;
            this.f161884l = z14;
            this.f161885m = z15;
            this.f161886n = z16;
            this.f161887o = z17;
            this.f161888p = z18;
            this.f161889q = z19;
            this.f161890r = z20;
            this.f161891s = function02;
            this.f161892t = z21;
            this.f161893u = clippableCouponDecorator;
            this.f161894v = function03;
            this.f161895w = z22;
            this.f161896x = function04;
            this.f161897y = function05;
            this.f161898z = function06;
            this.f161872A = d10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            return Unit.f143329a;
        }

        public final void b(RegularPrice Assemble, Composer composer, int i10) {
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
                ComposerKt.U(1070526727, i11, -1, "com.meijer.mobile.ui.productcard.HorizontalProductCard.<anonymous> (ProductCard.kt:130)");
            }
            float f10 = 0;
            RoundedCornerShape roundedCornerShapeC = C16806i.c(H1.h.p(f10));
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: ss.w
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return v.g.c((r1.u) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Modifier modifierF = C18370z.f(androidx.compose.foundation.layout.D.i(C16819m.c(companion, true, (Function1) objB), H1.h.p(f10)), "productCard", null, 2, null);
            Function0<Unit> function0 = this.f161873a;
            C18051y.b(function0, modifierF, false, roundedCornerShapeC, 0L, 0L, null, 0.0f, null, ComposableLambdaKt.c(1769509729, true, new a(this.f161874b, this.f161875c, Assemble, this.f161876d, this.f161877e, this.f161878f, this.f161879g, this.f161880h, this.f161881i, this.f161882j, this.f161883k, this.f161884l, this.f161885m, this.f161886n, this.f161887o, this.f161888p, this.f161889q, this.f161890r, function0, this.f161891s, this.f161892t, this.f161893u, this.f161894v, this.f161895w, this.f161896x, this.f161897y, this.f161898z, this.f161872A), composer, 54), composer, 805306368, HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RegularPrice regularPrice, Composer composer, Integer num) {
            b(regularPrice, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class h extends AdaptedFunctionReference implements Function1<LocalThemeScope, RegularPrice> {

        /* renamed from: h, reason: collision with root package name */
        public static final h f162106h = new h();

        h() {
            super(1, RegularPrice.class, "<init>", "<init>(Lcom/meijer/mobile/android_acres_library/foundations/v2/LocalThemeScope;Lcom/meijer/mobile/android_acres_library/assemblies/ProductCard$Labels;Lcom/meijer/mobile/android_acres_library/assemblies/TagTemplates$ProductCardTags;Lcom/meijer/mobile/android_acres_library/assemblies/ProductCard$DefaultContainers;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RegularPrice invoke(LocalThemeScope p02) {
            Intrinsics.j(p02, "p0");
            return new RegularPrice(p02, null, null, null, 14, null);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class i implements Function3<RegularPrice, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f162107a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f162108b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f162109c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f162110d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f162111e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Double f162112f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Double f162113g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f162114h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f162115i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f162116j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f162117k;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC6392a f162118a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f162119b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f162120c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f162121d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Double f162122e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Double f162123f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ boolean f162124g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ AbstractC6392a f162125h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ RegularPrice f162126i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ AbstractC6392a f162127j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ AbstractC6392a f162128k;

            a(AbstractC6392a abstractC6392a, boolean z10, boolean z11, LocalThemeScope localThemeScope, Double d10, Double d11, boolean z12, AbstractC6392a abstractC6392a2, RegularPrice regularPrice, AbstractC6392a abstractC6392a3, AbstractC6392a abstractC6392a4) {
                this.f162118a = abstractC6392a;
                this.f162119b = z10;
                this.f162120c = z11;
                this.f162121d = localThemeScope;
                this.f162122e = d10;
                this.f162123f = d11;
                this.f162124g = z12;
                this.f162125h = abstractC6392a2;
                this.f162126i = regularPrice;
                this.f162127j = abstractC6392a3;
                this.f162128k = abstractC6392a4;
            }

            public final void a(InterfaceC14888I AdsRow, Composer composer, int i10) throws Resources.NotFoundException {
                Intrinsics.j(AdsRow, "$this$AdsRow");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(941742460, i10, -1, "com.meijer.mobile.ui.productcard.Price.<anonymous>.<anonymous> (ProductCard.kt:650)");
                }
                AbstractC6392a abstractC6392a = this.f162118a;
                int i11 = AbstractC6392a.f60445b;
                String strA = C13698b.a(abstractC6392a, composer, i11);
                if (this.f162119b && this.f162120c) {
                    composer.startReplaceGroup(723422114);
                    v.H(this.f162121d, this.f162122e, this.f162123f, null, composer, LocalThemeScope.f17314g, 4);
                    composer.P();
                } else if (this.f162124g) {
                    composer.startReplaceGroup(723560436);
                    v.J(this.f162121d, this.f162126i.getLabels().getFinalPrice(), this.f162127j, this.f162128k, strA, C13698b.a(this.f162125h, composer, i11), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3) | (i11 << 6) | (i11 << 9), 32);
                    composer.P();
                } else {
                    composer.startReplaceGroup(723978440);
                    v.R(this.f162121d, this.f162126i.getLabels().getFinalPrice(), this.f162127j, strA, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3) | (i11 << 6), 8);
                    composer.P();
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) throws Resources.NotFoundException {
                a(interfaceC14888I, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        i(LocalThemeScope localThemeScope, Modifier modifier, AbstractC6392a abstractC6392a, boolean z10, boolean z11, Double d10, Double d11, boolean z12, AbstractC6392a abstractC6392a2, AbstractC6392a abstractC6392a3, AbstractC6392a abstractC6392a4) {
            this.f162107a = localThemeScope;
            this.f162108b = modifier;
            this.f162109c = abstractC6392a;
            this.f162110d = z10;
            this.f162111e = z11;
            this.f162112f = d10;
            this.f162113g = d11;
            this.f162114h = z12;
            this.f162115i = abstractC6392a2;
            this.f162116j = abstractC6392a3;
            this.f162117k = abstractC6392a4;
        }

        public final void a(RegularPrice Assemble, Composer composer, int i10) {
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
                ComposerKt.U(205743548, i11, -1, "com.meijer.mobile.ui.productcard.Price.<anonymous> (ProductCard.kt:641)");
            }
            C16453n.i(this.f162107a, q1.Row.y(Assemble.getContainers().getPriceRow(), Assemble.getContainers().getPriceRow().getModifier().then(androidx.compose.foundation.layout.D.m(this.f162108b, 0.0f, this.f162107a.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 13, null)), null, null, 6, null), ComposableLambdaKt.c(941742460, true, new a(this.f162109c, this.f162110d, this.f162111e, this.f162107a, this.f162112f, this.f162113g, this.f162114h, this.f162115i, Assemble, this.f162116j, this.f162117k), composer, 54), composer, LocalThemeScope.f17314g | 384 | (q1.Row.f142392d << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RegularPrice regularPrice, Composer composer, Integer num) {
            a(regularPrice, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class j extends AdaptedFunctionReference implements Function1<LocalThemeScope, RegularPrice> {

        /* renamed from: h, reason: collision with root package name */
        public static final j f162129h = new j();

        j() {
            super(1, RegularPrice.class, "<init>", "<init>(Lcom/meijer/mobile/android_acres_library/foundations/v2/LocalThemeScope;Lcom/meijer/mobile/android_acres_library/assemblies/ProductCard$Labels;Lcom/meijer/mobile/android_acres_library/assemblies/TagTemplates$ProductCardTags;Lcom/meijer/mobile/android_acres_library/assemblies/ProductCard$DefaultContainers;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RegularPrice invoke(LocalThemeScope p02) {
            Intrinsics.j(p02, "p0");
            return new RegularPrice(p02, null, null, null, 14, null);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class k implements Function3<RegularPrice, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f162130a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f162131b;

        k(LocalThemeScope localThemeScope, String str) {
            this.f162130a = localThemeScope;
            this.f162131b = str;
        }

        public final void a(RegularPrice Assemble, Composer composer, int i10) {
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
                ComposerKt.U(-981139838, i11, -1, "com.meijer.mobile.ui.productcard.ProductName.<anonymous>.<anonymous> (ProductCard.kt:591)");
            }
            si.j.h(this.f162130a, q1.Label.y(Assemble.getLabels().getProductHeading(), C18370z.f(Modifier.INSTANCE, "productName", null, 2, null), null, null, null, F1.t.INSTANCE.b(), false, 3, this.f162130a.getAdsTypography().getBodyCompact().getTwo(), null, HttpResponseStatus.REDIRECTION_FOUND, null), this.f162131b, null, composer, (q1.Label.f142335j << 3) | LocalThemeScope.f17314g, 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RegularPrice regularPrice, Composer composer, Integer num) {
            a(regularPrice, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class l extends AdaptedFunctionReference implements Function1<LocalThemeScope, RegularPrice> {

        /* renamed from: h, reason: collision with root package name */
        public static final l f162132h = new l();

        l() {
            super(1, RegularPrice.class, "<init>", "<init>(Lcom/meijer/mobile/android_acres_library/foundations/v2/LocalThemeScope;Lcom/meijer/mobile/android_acres_library/assemblies/ProductCard$Labels;Lcom/meijer/mobile/android_acres_library/assemblies/TagTemplates$ProductCardTags;Lcom/meijer/mobile/android_acres_library/assemblies/ProductCard$DefaultContainers;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RegularPrice invoke(LocalThemeScope p02) {
            Intrinsics.j(p02, "p0");
            return new RegularPrice(p02, null, null, null, 14, null);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class m implements Function3<RegularPrice, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f162133a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f162134b;

        m(LocalThemeScope localThemeScope, AbstractC6392a abstractC6392a) {
            this.f162133a = localThemeScope;
            this.f162134b = abstractC6392a;
        }

        public final void a(RegularPrice Assemble, Composer composer, int i10) {
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
                ComposerKt.U(1283033400, i11, -1, "com.meijer.mobile.ui.productcard.WeightSizePrice.<anonymous> (ProductCard.kt:570)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            C14890K.a(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, 0.0f, this.f162133a.getAdsSpacing().getTwo().getDp(), 7, null), composer, 0);
            LocalThemeScope localThemeScope = this.f162133a;
            q1.Label pricePerUnit = Assemble.getLabels().getPricePerUnit();
            String strA = C13698b.a(this.f162134b, composer, AbstractC6392a.f60445b);
            int i12 = LocalThemeScope.f17314g;
            int i13 = q1.Label.f142335j;
            si.j.h(localThemeScope, pricePerUnit, strA, null, composer, i12 | (i13 << 3), 4);
            si.j.h(this.f162133a, new q1.Label(null, null, null, null, 0, false, 0, this.f162133a.getAdsTypography().getDetail().getOne(), null, 383, null), C16338g.c(yr.Q.f171789w, composer, 0), null, composer, i12 | (i13 << 3), 4);
            C14890K.a(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, 0.0f, this.f162133a.getAdsSpacing().getTwo().getDp(), 7, null), composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RegularPrice regularPrice, Composer composer, Integer num) {
            a(regularPrice, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:365:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void C(Ki.LocalThemeScope r36, final ts.ProductCardDecorator r37, final int r38, kotlin.jvm.functions.Function1<? super ss.InterfaceC17146a, kotlin.Unit> r39, final boolean r40, final Hr.ClippableCouponDecorator r41, final kotlin.jvm.functions.Function0<kotlin.Unit> r42, final kotlin.jvm.functions.Function0<kotlin.Unit> r43, final kotlin.jvm.functions.Function0<kotlin.Unit> r44, final double r45, final boolean r47, final kotlin.jvm.functions.Function0<kotlin.Unit> r48, final kotlin.jvm.functions.Function0<kotlin.Unit> r49, Pp.b r50, boolean r51, boolean r52, boolean r53, final boolean r54, boolean r55, int r56, final boolean r57, final boolean r58, boolean r59, boolean r60, kotlin.jvm.functions.Function1<? super Ho.SponsoredData, kotlin.Unit> r61, androidx.compose.runtime.Composer r62, final int r63, final int r64, final int r65, final int r66) {
        /*
            Method dump skipped, instructions count: 1381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ss.v.C(Ki.M, ts.a, int, kotlin.jvm.functions.Function1, boolean, Hr.a, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, double, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, Pp.b, boolean, boolean, boolean, boolean, boolean, int, boolean, boolean, boolean, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(LocalThemeScope localThemeScope, ProductCardDecorator productCardDecorator, int i10, Function1 function1, boolean z10, ClippableCouponDecorator clippableCouponDecorator, Function0 function0, Function0 function02, Function0 function03, double d10, boolean z11, Function0 function04, Function0 function05, Pp.b bVar, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i11, boolean z17, boolean z18, boolean z19, boolean z20, Function1 function12, int i12, int i13, int i14, int i15, Composer composer, int i16) {
        C(localThemeScope, productCardDecorator, i10, function1, z10, clippableCouponDecorator, function0, function02, function03, d10, z11, function04, function05, bVar, z12, z13, z14, z15, z16, i11, z17, z18, z19, z20, function12, composer, J0.a(i12 | 1), J0.a(i13), J0.a(i14), i15);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void N(Ki.LocalThemeScope r22, final boolean r23, final boolean r24, final boolean r25, final bk.AbstractC6392a r26, final bk.AbstractC6392a r27, final bk.AbstractC6392a r28, final bk.AbstractC6392a r29, androidx.compose.ui.Modifier r30, java.lang.Double r31, java.lang.Double r32, androidx.compose.runtime.Composer r33, final int r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ss.v.N(Ki.M, boolean, boolean, boolean, bk.a, bk.a, bk.a, bk.a, androidx.compose.ui.Modifier, java.lang.Double, java.lang.Double, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(LocalThemeScope localThemeScope, boolean z10, Function0 function0, int i10, Composer composer, int i11) {
        A(localThemeScope, z10, function0, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(SponsoredData it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void H(final Ki.LocalThemeScope r32, final java.lang.Double r33, final java.lang.Double r34, androidx.compose.ui.Modifier r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ss.v.H(Ki.M, java.lang.Double, java.lang.Double, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(LocalThemeScope localThemeScope, Double d10, Double d11, Modifier modifier, int i10, int i11, Composer composer, int i12) throws Resources.NotFoundException {
        H(localThemeScope, d10, d11, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(final LocalThemeScope localThemeScope, final q1.Label label, final AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, final String str, String str2, Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        final String str3;
        Composer composer2;
        final Modifier modifier2;
        AbstractC6392a abstractC6392a3 = abstractC6392a2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1994885077);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 1) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= (i10 & 64) == 0 ? composerStartRestartGroup.V(label) : composerStartRestartGroup.D(label) ? 32 : 16;
        }
        if ((i11 & 2) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= (i10 & 512) == 0 ? composerStartRestartGroup.V(abstractC6392a) : composerStartRestartGroup.D(abstractC6392a) ? 256 : 128;
        }
        if ((i11 & 4) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) == 0 ? composerStartRestartGroup.V(abstractC6392a3) : composerStartRestartGroup.D(abstractC6392a3) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i11 & 8) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            i12 |= composerStartRestartGroup.V(str) ? 16384 : 8192;
        }
        if ((i11 & 16) != 0) {
            i12 |= 196608;
        } else if ((i10 & 196608) == 0) {
            i12 |= composerStartRestartGroup.V(str2) ? 131072 : 65536;
        }
        if ((74899 & i12) == 74898 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier2 = modifier;
            str3 = str2;
            composer2 = composerStartRestartGroup;
        } else {
            Modifier modifier3 = (i11 & 32) != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(-1994885077, i12, -1, "com.meijer.mobile.ui.productcard.OnSalePrice (ProductCard.kt:708)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z10 = (57344 & i12) == 16384;
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: ss.j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return v.K(str, (r1.u) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            int i13 = i12;
            str3 = str2;
            q1.Label labelY = q1.Label.y(label, C16819m.d(companion, false, (Function1) objB, 1, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getValues().getThree().d(localThemeScope.getAdsColors().getAdsColorSavings()), null, 382, null);
            int i14 = AbstractC6392a.f60445b;
            String strA = C13698b.a(abstractC6392a, composerStartRestartGroup, ((i13 >> 6) & 14) | i14);
            int i15 = LocalThemeScope.f17314g;
            int i16 = i13 & 14;
            int i17 = q1.Label.f142335j;
            composer2 = composerStartRestartGroup;
            si.j.h(localThemeScope, labelY, strA, null, composer2, i15 | i16 | (i17 << 3), 4);
            q1.Label label2 = new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getValues().getFive(), null, 383, null);
            Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, localThemeScope.getAdsSpacing().getTwo().getDp(), 0.0f, 0.0f, 0.0f, 14, null);
            composer2.startReplaceGroup(5004770);
            boolean z11 = (i13 & 458752) == 131072;
            Object objB2 = composer2.B();
            if (z11 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: ss.k
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return v.L(str3, (r1.u) obj);
                    }
                };
                composer2.t(objB2);
            }
            composer2.P();
            abstractC6392a3 = abstractC6392a2;
            si.j.h(localThemeScope, q1.Label.y(label2, C16819m.d(modifierM, false, (Function1) objB2, 1, null), null, null, null, 0, false, 0, null, null, 510, null), C13698b.a(abstractC6392a3, composer2, ((i13 >> 9) & 14) | i14), null, composer2, i15 | i16 | (i17 << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier2 = modifier3;
        }
        T0 t0L = composer2.l();
        if (t0L != null) {
            final AbstractC6392a abstractC6392a4 = abstractC6392a3;
            final String str4 = str3;
            t0L.a(new Function2() { // from class: ss.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return v.M(localThemeScope, label, abstractC6392a, abstractC6392a4, str, str4, modifier2, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(String str, r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.g0(semantics, str);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(String str, r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.g0(semantics, str);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(LocalThemeScope localThemeScope, q1.Label label, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, String str, String str2, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        J(localThemeScope, label, abstractC6392a, abstractC6392a2, str, str2, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(LocalThemeScope localThemeScope, boolean z10, boolean z11, boolean z12, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, AbstractC6392a abstractC6392a3, AbstractC6392a abstractC6392a4, Modifier modifier, Double d10, Double d11, int i10, int i11, int i12, Composer composer, int i13) {
        N(localThemeScope, z10, z11, z12, abstractC6392a, abstractC6392a2, abstractC6392a3, abstractC6392a4, modifier, d10, d11, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q(LocalThemeScope localThemeScope, String str, Modifier modifier, int i10, Composer composer, int i11) {
        P(localThemeScope, str, modifier, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(final LocalThemeScope localThemeScope, final q1.Label label, final AbstractC6392a abstractC6392a, final String str, Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        Composer composer2;
        int i13;
        q1.Label labelY;
        Composer composer3;
        final Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-301829927);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 1) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= (i10 & 64) == 0 ? composerStartRestartGroup.V(label) : composerStartRestartGroup.D(label) ? 32 : 16;
        }
        if ((i11 & 2) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= (i10 & 512) == 0 ? composerStartRestartGroup.V(abstractC6392a) : composerStartRestartGroup.D(abstractC6392a) ? 256 : 128;
        }
        if ((i11 & 4) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.V(str) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier2 = modifier;
            composer3 = composerStartRestartGroup;
        } else {
            Modifier modifier3 = (i11 & 8) != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(-301829927, i12, -1, "com.meijer.mobile.ui.productcard.RegularPrice (ProductCard.kt:740)");
            }
            composerStartRestartGroup.startReplaceGroup(1999224850);
            int i14 = AbstractC6392a.f60445b;
            int i15 = (i12 >> 6) & 14;
            if (Intrinsics.e(C13698b.a(abstractC6392a, composerStartRestartGroup, i14 | i15), C16338g.c(x.f162143i, composerStartRestartGroup, 0))) {
                i13 = i12;
                composer2 = composerStartRestartGroup;
                labelY = q1.Label.y(label, null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getValues().getThree().d(localThemeScope.getAdsColors().getAdsColorSavings()), null, 383, null);
            } else {
                composer2 = composerStartRestartGroup;
                i13 = i12;
                Modifier modifier4 = label.getModifier();
                composer2.startReplaceGroup(5004770);
                boolean z10 = (i13 & 7168) == 2048;
                Object objB = composer2.B();
                if (z10 || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: ss.h
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return v.S(str, (r1.u) obj);
                        }
                    };
                    composer2.t(objB);
                }
                composer2.P();
                labelY = q1.Label.y(label, C16819m.d(modifier4, false, (Function1) objB, 1, null), null, null, null, 0, false, 0, null, null, 510, null);
            }
            q1.Label label2 = labelY;
            composer2.P();
            Composer composer4 = composer2;
            si.j.h(localThemeScope, label2, C13698b.a(abstractC6392a, composer2, i14 | i15), null, composer4, LocalThemeScope.f17314g | (i13 & 14) | (q1.Label.f142335j << 3), 4);
            composer3 = composer4;
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier2 = modifier3;
        }
        T0 t0L = composer3.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: ss.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return v.T(localThemeScope, label, abstractC6392a, str, modifier2, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(String str, r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.g0(semantics, str);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T(LocalThemeScope localThemeScope, q1.Label label, AbstractC6392a abstractC6392a, String str, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        R(localThemeScope, label, abstractC6392a, str, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void U(final Ki.LocalThemeScope r30, androidx.compose.ui.Modifier r31, final Gp.ProductRatings r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ss.v.U(Ki.M, androidx.compose.ui.Modifier, Gp.c, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V(String str, r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.g0(semantics, str);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W(LocalThemeScope localThemeScope, Modifier modifier, ProductRatings productRatings, int i10, int i11, Composer composer, int i12) {
        U(localThemeScope, modifier, productRatings, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-998080175);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-998080175, i11, -1, "com.meijer.mobile.ui.productcard.ThirdPartyProduct (ProductCard.kt:542)");
            }
            C14890K.a(J.i(Modifier.INSTANCE, localThemeScope.getAdsSpacing().getThree().getDp()), composerStartRestartGroup, 0);
            si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getNine(), null, 383, null), C16338g.c(x.f162145k, composerStartRestartGroup, 0), null, composerStartRestartGroup, (q1.Label.f142335j << 3) | (i11 & 14) | LocalThemeScope.f17314g, 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: ss.s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return v.Y(localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y(LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        X(localThemeScope, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a0(LocalThemeScope localThemeScope, AbstractC6392a abstractC6392a, int i10, Composer composer, int i11) {
        Z(localThemeScope, abstractC6392a, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    public static final Modifier n0(Modifier modifier, boolean z10, Function1<? super Modifier, ? extends Modifier> then) {
        Intrinsics.j(modifier, "<this>");
        Intrinsics.j(then, "then");
        return z10 ? then.invoke(modifier) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o0(Boolean bool, Boolean bool2, boolean z10, boolean z11, boolean z12) {
        if (z11) {
            Boolean bool3 = Boolean.TRUE;
            if (Intrinsics.e(bool2, bool3) && Intrinsics.e(bool, bool3)) {
                return true;
            }
        }
        return z12 && z10 && Intrinsics.e(bool2, Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(LocalThemeScope localThemeScope, AbstractC6392a abstractC6392a, int i10, Composer composer, int i11) {
        u(localThemeScope, abstractC6392a, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(LocalThemeScope localThemeScope, AbstractC6392a abstractC6392a, int i10, Composer composer, int i11) {
        w(localThemeScope, abstractC6392a, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(LocalThemeScope localThemeScope, final boolean z10, Composer composer, final int i10) {
        int i11;
        final LocalThemeScope localThemeScope2 = localThemeScope;
        Composer composerStartRestartGroup = composer.startRestartGroup(308506214);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope2) : composerStartRestartGroup.D(localThemeScope2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.a(z10) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(308506214, i11, -1, "com.meijer.mobile.ui.productcard.ExpressPickUpText (ProductCard.kt:520)");
            }
            if (z10) {
                Modifier.Companion companion = Modifier.INSTANCE;
                float f10 = 4;
                C14890K.a(J.i(companion, H1.h.p(f10)), composerStartRestartGroup, 6);
                MeasurePolicy measurePolicyB = G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composerStartRestartGroup, 0);
                int iA = C5859f.a(composerStartRestartGroup, 0);
                InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
                Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, companion);
                InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion2.a();
                if (composerStartRestartGroup.k() == null) {
                    C5859f.c();
                }
                composerStartRestartGroup.F();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.I(function0A);
                } else {
                    composerStartRestartGroup.s();
                }
                Composer composerA = D1.a(composerStartRestartGroup);
                D1.c(composerA, measurePolicyB, companion2.e());
                D1.c(composerA, interfaceC5884sR, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14889J c14889j = C14889J.f139620a;
                q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, localThemeScope2.getAdsTypography().getHeadings().getNine(), null, 383, null);
                String strC = C16338g.c(x.f162139e, composerStartRestartGroup, 0);
                int i12 = LocalThemeScope.f17314g;
                int i13 = i11 & 14;
                int i14 = q1.Label.f142335j;
                si.j.h(localThemeScope2, label, strC, null, composerStartRestartGroup, i12 | i13 | (i14 << 3), 4);
                si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getNine(), null, 383, null), C16338g.c(x.f162136b, composerStartRestartGroup, 0), null, composerStartRestartGroup, i12 | i13 | (i14 << 3), 4);
                C14890K.a(J.z(companion, H1.h.p(f10)), composerStartRestartGroup, 6);
                localThemeScope2 = localThemeScope;
                si.j.h(localThemeScope2, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getDetail().getOne(), null, 383, null), C16338g.c(x.f162135a, composerStartRestartGroup, 0), null, composerStartRestartGroup, i12 | i13 | (i14 << 3), 4);
                composerStartRestartGroup.v();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: ss.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return v.z(localThemeScope2, z10, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(LocalThemeScope localThemeScope, boolean z10, int i10, Composer composer, int i11) {
        y(localThemeScope, z10, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(final LocalThemeScope localThemeScope, final boolean z10, final Function0<Unit> function0, Composer composer, final int i10) {
        int i11;
        int i12;
        int i13;
        boolean zD;
        int i14;
        Composer composerStartRestartGroup = composer.startRestartGroup(869524093);
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD = composerStartRestartGroup.D(localThemeScope);
            }
            if (zD) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.a(z10)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.D(function0)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(869524093, i11, -1, "com.meijer.mobile.ui.productcard.FindSimilarButton (ProductCard.kt:499)");
            }
            if (z10) {
                Q.e(localThemeScope, C15134C.f141860a, ComposableLambdaKt.c(-986855364, true, new e(localThemeScope, function0), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f17314g | 384 | (C15134C.f141861b << 3));
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: ss.u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return v.B(localThemeScope, z10, function0, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(ProductCardDecorator productCardDecorator, Function1 function1, Function1 function12, int i10) {
        if (productCardDecorator.getProduct().getIsSponsoredCriteo()) {
            function1.invoke(productCardDecorator.getProduct().getBeaconInfo());
        }
        if (function12 != null) {
            function12.invoke(new InterfaceC17146a.ProductItemClicked(productCardDecorator, i10));
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(final LocalThemeScope localThemeScope, final String str, final Modifier modifier, Composer composer, final int i10) {
        int i11;
        int i12;
        int i13;
        boolean zD;
        int i14;
        Composer composerStartRestartGroup = composer.startRestartGroup(-473145263);
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD = composerStartRestartGroup.D(localThemeScope);
            }
            if (zD) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.V(str)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-473145263, i11, -1, "com.meijer.mobile.ui.productcard.ProductName (ProductCard.kt:588)");
            }
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composerStartRestartGroup, 0);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifier);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyA, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14903g c14903g = C14903g.f139698a;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = j.f162129h;
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            Q.f(localThemeScope, (Function1) objB, ComposableLambdaKt.c(-981139838, true, new k(localThemeScope, str), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f17314g | 432);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: ss.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return v.Q(localThemeScope, str, modifier, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(final LocalThemeScope localThemeScope, final AbstractC6392a abstractC6392a, Composer composer, final int i10) {
        int i11;
        boolean z10;
        boolean zD;
        int i12;
        boolean zD2;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(-652000414);
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD2 = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD2 = composerStartRestartGroup.D(localThemeScope);
            }
            if (zD2) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i10 & 64) == 0) {
                zD = composerStartRestartGroup.V(abstractC6392a);
            } else {
                zD = composerStartRestartGroup.D(abstractC6392a);
            }
            if (zD) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-652000414, i11, -1, "com.meijer.mobile.ui.productcard.WeightSizePrice (ProductCard.kt:567)");
            }
            if (C13698b.a(abstractC6392a, composerStartRestartGroup, AbstractC6392a.f60445b | ((i11 >> 3) & 14)).length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objB = composerStartRestartGroup.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = l.f162132h;
                    composerStartRestartGroup.t(objB);
                }
                composerStartRestartGroup.P();
                Q.f(localThemeScope, (Function1) objB, ComposableLambdaKt.c(1283033400, true, new m(localThemeScope, abstractC6392a), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f17314g | 432);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: ss.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return v.a0(localThemeScope, abstractC6392a, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(final LocalThemeScope localThemeScope, final AbstractC6392a abstractC6392a, Composer composer, final int i10) {
        int i11;
        boolean z10;
        boolean zD;
        int i12;
        boolean zD2;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(2021235969);
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD2 = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD2 = composerStartRestartGroup.D(localThemeScope);
            }
            if (zD2) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i10 & 64) == 0) {
                zD = composerStartRestartGroup.V(abstractC6392a);
            } else {
                zD = composerStartRestartGroup.D(abstractC6392a);
            }
            if (zD) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(2021235969, i11, -1, "com.meijer.mobile.ui.productcard.AmountSaved (ProductCard.kt:607)");
            }
            if (C13698b.a(abstractC6392a, composerStartRestartGroup, AbstractC6392a.f60445b | ((i11 >> 3) & 14)).length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objB = composerStartRestartGroup.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = a.f161861h;
                    composerStartRestartGroup.t(objB);
                }
                composerStartRestartGroup.P();
                Q.f(localThemeScope, (Function1) objB, ComposableLambdaKt.c(811089367, true, new b(localThemeScope, abstractC6392a), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f17314g | 432);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: ss.t
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return v.v(localThemeScope, abstractC6392a, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(final LocalThemeScope localThemeScope, final AbstractC6392a abstractC6392a, Composer composer, final int i10) {
        int i11;
        boolean z10;
        boolean zD;
        int i12;
        boolean zD2;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(684570557);
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD2 = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD2 = composerStartRestartGroup.D(localThemeScope);
            }
            if (zD2) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i10 & 64) == 0) {
                zD = composerStartRestartGroup.V(abstractC6392a);
            } else {
                zD = composerStartRestartGroup.D(abstractC6392a);
            }
            if (zD) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(684570557, i11, -1, "com.meijer.mobile.ui.productcard.ComplexPromo (ProductCard.kt:553)");
            }
            if (C13698b.a(abstractC6392a, composerStartRestartGroup, AbstractC6392a.f60445b | ((i11 >> 3) & 14)).length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objB = composerStartRestartGroup.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = c.f161864h;
                    composerStartRestartGroup.t(objB);
                }
                composerStartRestartGroup.P();
                Q.f(localThemeScope, (Function1) objB, ComposableLambdaKt.c(1824731559, true, new d(localThemeScope, abstractC6392a), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f17314g | 432);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: ss.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return v.x(localThemeScope, abstractC6392a, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
