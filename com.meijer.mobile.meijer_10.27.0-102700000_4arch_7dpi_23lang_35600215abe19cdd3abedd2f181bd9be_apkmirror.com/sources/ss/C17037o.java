package ss;

import Gp.ProductRatings;
import Ho.SponsoredData;
import Hr.ClippableCouponDecorator;
import Ji.LocalThemeScope;
import Ji.Q;
import L1.A;
import L1.C;
import L1.C4039g;
import L1.D;
import L1.n;
import L1.v;
import L1.x;
import P0.e;
import ak.AbstractC5607a;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.recyclerview.widget.RecyclerView;
import ck.C6408b;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.AnimatedGradientTextView;
import dk.C13530b;
import j0.C14801J;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14800I;
import j0.InterfaceC14814f;
import ji.C14900C;
import ji.RegularPrice;
import ji.j1;
import ji.q1;
import kotlin.C17985y;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import ni.E0;
import oi.C16088n;
import p1.C16193g;
import r0.C16692i;
import r0.RoundedCornerShape;
import r1.C16705m;
import r1.u;
import ss.C17037o;
import ss.InterfaceC17023a;
import ts.ProductCardDecorator;
import yi.EnumC18214a;
import yr.C18299z;
import yr.e0;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0097\u0002\u0010#\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\t2\u0014\b\u0002\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b#\u0010$\u001a)\u0010%\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\rH\u0003¢\u0006\u0004\b%\u0010&\u001a\u001b\u0010(\u001a\u00020\u0007*\u00020\u00002\u0006\u0010'\u001a\u00020\tH\u0003¢\u0006\u0004\b(\u0010)\u001a\u001d\u0010,\u001a\u00020\u0007*\u00020\u00002\b\u0010+\u001a\u0004\u0018\u00010*H\u0003¢\u0006\u0004\b,\u0010-\u001a\u001d\u0010/\u001a\u00020\u0007*\u00020\u00002\b\u0010.\u001a\u0004\u0018\u00010*H\u0003¢\u0006\u0004\b/\u0010-\u001a#\u00104\u001a\u00020\u0007*\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0003¢\u0006\u0004\b4\u00105\u001a\u001d\u00107\u001a\u00020\u0007*\u00020\u00002\b\u00106\u001a\u0004\u0018\u00010*H\u0003¢\u0006\u0004\b7\u0010-\u001aC\u0010=\u001a\u00020\u0007*\u00020\u00002\u0006\u00108\u001a\u00020\t2\b\u00109\u001a\u0004\u0018\u00010*2\b\u0010:\u001a\u0004\u0018\u00010*2\b\u0010;\u001a\u0004\u0018\u00010*2\b\u0010<\u001a\u0004\u0018\u00010*H\u0003¢\u0006\u0004\b=\u0010>\u001a'\u0010A\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u00103\u001a\u0002022\b\u0010@\u001a\u0004\u0018\u00010?H\u0007¢\u0006\u0004\bA\u0010B\u001a2\u0010F\u001a\u000202*\u0002022\u0006\u0010C\u001a\u00020\t2\u0017\u0010E\u001a\u0013\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u0002020\u0005¢\u0006\u0002\bD¢\u0006\u0004\bF\u0010G\u001a;\u0010J\u001a\u00020\t2\b\u0010H\u001a\u0004\u0018\u00010\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\t2\u0006\u00108\u001a\u00020\t2\u0006\u0010I\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tH\u0002¢\u0006\u0004\bJ\u0010K¨\u0006L"}, d2 = {"LJi/M;", "Lts/a;", "item", "", "position", "Lkotlin/Function1;", "Lss/a;", "", "productCardAction", "", "showClippableCoupon", "LHr/a;", "couponCountDownStateDecorator", "Lkotlin/Function0;", "clippableCouponAction", "viewCouponDetail", "onCollapseQtyStepper", "", "maxAllowedQty", "showFindSimilarButton", "findSimilarAction", "onExpandQtyStepper", "LPp/b;", "searchType", "radioButtonSelected", "isEligibleForSubstitution", "isSponsored", "shouldEnableRatings", "showQuantityRequested", "quantityRequested", "isSponsoredProductBuyAgainEnabled", "isSponsoredProductFavOnSaleEnabled", "isUserLoggedIn", "LHo/c;", "onClickBeaconsAction", "v", "(LJi/M;Lts/a;ILkotlin/jvm/functions/Function1;ZLHr/a;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;DZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LPp/b;ZZZZZIZZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;IIII)V", "t", "(LJi/M;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "isBopas", "r", "(LJi/M;ZLandroidx/compose/runtime/Composer;I)V", "Lak/a;", "complexPromo", "p", "(LJi/M;Lak/a;Landroidx/compose/runtime/Composer;I)V", "weightUnitSizeAndPrice", "H", "", "name", "Landroidx/compose/ui/Modifier;", "modifier", "C", "(LJi/M;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "amountSaved", "n", "isOnSale", "currentPrice", "regularPrice", "currentPriceDescription", "regularPriceDescription", "A", "(LJi/M;ZLak/a;Lak/a;Lak/a;Lak/a;Landroidx/compose/runtime/Composer;I)V", "LGp/c;", "productRatings", "E", "(LJi/M;Landroidx/compose/ui/Modifier;LGp/c;Landroidx/compose/runtime/Composer;II)V", "condition", "Lkotlin/ExtensionFunctionType;", "then", "R", "(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "isCarouselEnabled", "isSponsoredProductBuyAgain", "S", "(Ljava/lang/Boolean;Ljava/lang/Boolean;ZZZ)Z", "productcard_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: ss.o, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C17037o {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ss.o$a */
    /* synthetic */ class a extends AdaptedFunctionReference implements Function1<LocalThemeScope, RegularPrice> {

        /* renamed from: h, reason: collision with root package name */
        public static final a f160969h = new a();

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
    /* renamed from: ss.o$b */
    static final class b implements Function3<RegularPrice, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f160970a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f160971b;

        b(LocalThemeScope localThemeScope, AbstractC5607a abstractC5607a) {
            this.f160970a = localThemeScope;
            this.f160971b = abstractC5607a;
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
                ComposerKt.U(811089367, i10, -1, "com.meijer.mobile.ui.productcard.AmountSaved.<anonymous> (ProductCard.kt:594)");
            }
            C14802K.a(D.m(Modifier.INSTANCE, 0.0f, this.f160970a.getAdsSpacing().getTwo().getDp(), 0.0f, 0.0f, 13, null), composer, 0);
            ri.j.h(this.f160970a, Assemble.getLabels().getSavingsAmount(), C6408b.a(this.f160971b, composer, AbstractC5607a.f45514b), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RegularPrice regularPrice, Composer composer, Integer num) {
            a(regularPrice, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ss.o$c */
    /* synthetic */ class c extends AdaptedFunctionReference implements Function1<LocalThemeScope, RegularPrice> {

        /* renamed from: h, reason: collision with root package name */
        public static final c f160972h = new c();

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
    /* renamed from: ss.o$d */
    static final class d implements Function3<RegularPrice, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f160973a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f160974b;

        d(LocalThemeScope localThemeScope, AbstractC5607a abstractC5607a) {
            this.f160973a = localThemeScope;
            this.f160974b = abstractC5607a;
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
                ComposerKt.U(1824731559, i10, -1, "com.meijer.mobile.ui.productcard.ComplexPromo.<anonymous> (ProductCard.kt:540)");
            }
            Hi.h.h(this.f160973a, Assemble.getTags().getComplexPromo(), C6408b.a(this.f160974b, composer, AbstractC5607a.f45514b), null, composer, LocalThemeScope.f15770g | (q1.Tag.f140168e << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RegularPrice regularPrice, Composer composer, Integer num) {
            a(regularPrice, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: ss.o$e */
    static final class e implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f160975a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f160976b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ss.o$e$a */
        static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f160977a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j1 f160978b;

            a(LocalThemeScope localThemeScope, j1 j1Var) {
                this.f160977a = localThemeScope;
                this.f160978b = j1Var;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(392970217, i10, -1, "com.meijer.mobile.ui.productcard.FindSimilarButton.<anonymous>.<anonymous> (ProductCard.kt:503)");
                }
                ri.j.h(this.f160977a, this.f160978b.getLabels().getEnabledLabel(), C16193g.c(C17042t.f161231c, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

        e(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f160975a = localThemeScope;
            this.f160976b = function0;
        }

        public final void a(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-986855364, i10, -1, "com.meijer.mobile.ui.productcard.FindSimilarButton.<anonymous> (ProductCard.kt:495)");
            }
            E0.b(this.f160975a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, D.m(J.h(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, H1.h.p(12), H1.h.p(4), 0.0f, 9, null), false, null, 895, null), this.f160976b, ComposableLambdaKt.c(392970217, true, new a(this.f160975a, Assemble), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            a(j1Var, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ss.o$f */
    /* synthetic */ class f extends AdaptedFunctionReference implements Function1<LocalThemeScope, RegularPrice> {

        /* renamed from: h, reason: collision with root package name */
        public static final f f160979h = new f();

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
    /* renamed from: ss.o$g */
    static final class g implements Function3<RegularPrice, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f160980a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f160981b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f160982c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f160983d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f160984e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<InterfaceC17023a, Unit> f160985f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ProductCardDecorator f160986g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f160987h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f160988i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f160989j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f160990k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f160991l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f160992m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f160993n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f160994o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f160995p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ boolean f160996q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f160997r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f160998s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ ClippableCouponDecorator f160999t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f161000u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ boolean f161001v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f161002w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f161003x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f161004y;

        /* renamed from: z, reason: collision with root package name */
        final /* synthetic */ double f161005z;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: ss.o$g$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: A, reason: collision with root package name */
            final /* synthetic */ double f161006A;

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f161007a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f161008b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ RegularPrice f161009c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f161010d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f161011e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function1<InterfaceC17023a, Unit> f161012f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ ProductCardDecorator f161013g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f161014h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ boolean f161015i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ int f161016j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ float f161017k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ boolean f161018l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ boolean f161019m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ boolean f161020n;

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ boolean f161021o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ boolean f161022p;

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ boolean f161023q;

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f161024r;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f161025s;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ boolean f161026t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ ClippableCouponDecorator f161027u;

            /* renamed from: v, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f161028v;

            /* renamed from: w, reason: collision with root package name */
            final /* synthetic */ boolean f161029w;

            /* renamed from: x, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f161030x;

            /* renamed from: y, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f161031y;

            /* renamed from: z, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f161032z;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: ss.o$g$a$a, reason: collision with other inner class name */
            static final class C2513a implements Function1<C4039g, Unit> {

                /* renamed from: a, reason: collision with root package name */
                public static final C2513a f161033a = new C2513a();

                public final void a(C4039g constrainAs) {
                    Intrinsics.j(constrainAs, "$this$constrainAs");
                    D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                    x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                    x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                    a(c4039g);
                    return Unit.f142422a;
                }

                C2513a() {
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: ss.o$g$a$b */
            static final class b implements Function1<Boolean, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Function1<InterfaceC17023a, Unit> f161034a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ProductCardDecorator f161035b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ int f161036c;

                /* JADX WARN: Multi-variable type inference failed */
                b(Function1<? super InterfaceC17023a, Unit> function1, ProductCardDecorator productCardDecorator, int i10) {
                    this.f161034a = function1;
                    this.f161035b = productCardDecorator;
                    this.f161036c = i10;
                }

                public final void a(boolean z10) {
                    Function1<InterfaceC17023a, Unit> function1 = this.f161034a;
                    if (function1 != null) {
                        function1.invoke(new InterfaceC17023a.ProductItemClicked(this.f161035b, this.f161036c));
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    a(bool.booleanValue());
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: ss.o$g$a$c */
            static final class c implements Function1<C4039g, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ L1.h f161037a;

                c(L1.h hVar) {
                    this.f161037a = hVar;
                }

                public final void a(C4039g constrainAs) {
                    Intrinsics.j(constrainAs, "$this$constrainAs");
                    x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                    D.a.a(constrainAs.getStart(), this.f161037a.getEnd(), 0.0f, 0.0f, 6, null);
                    D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                    a(c4039g);
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: ss.o$g$a$d */
            static final class d implements Function1<C4039g, Unit> {

                /* renamed from: a, reason: collision with root package name */
                public static final d f161038a = new d();

                public final void a(C4039g constrainAs) {
                    Intrinsics.j(constrainAs, "$this$constrainAs");
                    x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                    D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                    D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                    a(c4039g);
                    return Unit.f142422a;
                }

                d() {
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: ss.o$g$a$e */
            static final class e implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f161039a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ RegularPrice f161040b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ ProductCardDecorator f161041c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ boolean f161042d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ int f161043e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ float f161044f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ boolean f161045g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ boolean f161046h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ boolean f161047i;

                /* renamed from: j, reason: collision with root package name */
                final /* synthetic */ boolean f161048j;

                /* renamed from: k, reason: collision with root package name */
                final /* synthetic */ boolean f161049k;

                /* renamed from: l, reason: collision with root package name */
                final /* synthetic */ boolean f161050l;

                /* renamed from: m, reason: collision with root package name */
                final /* synthetic */ boolean f161051m;

                /* renamed from: n, reason: collision with root package name */
                final /* synthetic */ boolean f161052n;

                /* renamed from: o, reason: collision with root package name */
                final /* synthetic */ Function0<Unit> f161053o;

                /* renamed from: p, reason: collision with root package name */
                final /* synthetic */ Function0<Unit> f161054p;

                /* renamed from: q, reason: collision with root package name */
                final /* synthetic */ boolean f161055q;

                /* renamed from: r, reason: collision with root package name */
                final /* synthetic */ ClippableCouponDecorator f161056r;

                /* renamed from: s, reason: collision with root package name */
                final /* synthetic */ Function1<InterfaceC17023a, Unit> f161057s;

                /* renamed from: t, reason: collision with root package name */
                final /* synthetic */ int f161058t;

                /* renamed from: u, reason: collision with root package name */
                final /* synthetic */ Function0<Unit> f161059u;

                /* renamed from: v, reason: collision with root package name */
                final /* synthetic */ boolean f161060v;

                /* renamed from: w, reason: collision with root package name */
                final /* synthetic */ Function0<Unit> f161061w;

                /* renamed from: x, reason: collision with root package name */
                final /* synthetic */ Function0<Unit> f161062x;

                /* renamed from: y, reason: collision with root package name */
                final /* synthetic */ Function0<Unit> f161063y;

                /* renamed from: z, reason: collision with root package name */
                final /* synthetic */ double f161064z;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: ss.o$g$a$e$a, reason: collision with other inner class name */
                static final class C2514a implements Function1<Modifier, Modifier> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ float f161065a;

                    C2514a(float f10) {
                        this.f161065a = f10;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Modifier invoke(Modifier modifier) {
                        Intrinsics.j(modifier, "$this$if");
                        return T0.a.a(modifier, this.f161065a);
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: ss.o$g$a$e$b */
                static final class b implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ boolean f161066a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ boolean f161067b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ boolean f161068c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ ProductCardDecorator f161069d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ boolean f161070e;

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f161071f;

                    b(boolean z10, boolean z11, boolean z12, ProductCardDecorator productCardDecorator, boolean z13, LocalThemeScope localThemeScope) {
                        this.f161066a = z10;
                        this.f161067b = z11;
                        this.f161068c = z12;
                        this.f161069d = productCardDecorator;
                        this.f161070e = z13;
                        this.f161071f = localThemeScope;
                    }

                    public final void a(InterfaceC14800I AdsRow, Composer composer, int i10) {
                        boolean zS;
                        Intrinsics.j(AdsRow, "$this$AdsRow");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1065444282, i10, -1, "com.meijer.mobile.ui.productcard.HorizontalProductCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductCard.kt:202)");
                        }
                        boolean z10 = this.f161066a || this.f161067b;
                        Modifier modifierM = androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, H1.h.p(this.f161068c ? 4 : 0), 7, null);
                        boolean isOutOfStock = this.f161069d.getIsOutOfStock();
                        boolean isLowStock = this.f161069d.getIsLowStock();
                        boolean isAgeRestricted = this.f161069d.getProduct().getIsAgeRestricted();
                        if (z10 && this.f161069d.getProduct().getIsSponsoredCriteo()) {
                            zS = C17037o.S(Boolean.valueOf(this.f161069d.getIsBuyAgain()), Boolean.valueOf(this.f161069d.getProduct().getIsSponsoredCriteo()), this.f161069d.getIsOnSale(), this.f161066a, this.f161067b);
                        } else {
                            zS = this.f161070e;
                        }
                        Lj.g.l(this.f161071f, modifierM, isOutOfStock, isLowStock, this.f161069d.getIsBuyAgain(), isAgeRestricted, this.f161069d.getHasMPerksOffers(), false, this.f161069d.getIsInStoreOnly(), false, zS, null, null, null, null, null, null, null, null, null, composer, LocalThemeScope.f15770g, 0, 523584);
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
                /* renamed from: ss.o$g$a$e$c */
                static final class c implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f161072a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ RegularPrice f161073b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ boolean f161074c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ ProductCardDecorator f161075d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ boolean f161076e;

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ boolean f161077f;

                    /* renamed from: g, reason: collision with root package name */
                    final /* synthetic */ float f161078g;

                    /* renamed from: h, reason: collision with root package name */
                    final /* synthetic */ boolean f161079h;

                    /* renamed from: i, reason: collision with root package name */
                    final /* synthetic */ Function0<Unit> f161080i;

                    /* renamed from: j, reason: collision with root package name */
                    final /* synthetic */ Function0<Unit> f161081j;

                    /* renamed from: k, reason: collision with root package name */
                    final /* synthetic */ boolean f161082k;

                    /* renamed from: l, reason: collision with root package name */
                    final /* synthetic */ ClippableCouponDecorator f161083l;

                    /* renamed from: m, reason: collision with root package name */
                    final /* synthetic */ Function1<InterfaceC17023a, Unit> f161084m;

                    /* renamed from: n, reason: collision with root package name */
                    final /* synthetic */ int f161085n;

                    /* renamed from: o, reason: collision with root package name */
                    final /* synthetic */ Function0<Unit> f161086o;

                    /* renamed from: p, reason: collision with root package name */
                    final /* synthetic */ boolean f161087p;

                    /* renamed from: q, reason: collision with root package name */
                    final /* synthetic */ Function0<Unit> f161088q;

                    /* renamed from: r, reason: collision with root package name */
                    final /* synthetic */ Function0<Unit> f161089r;

                    /* renamed from: s, reason: collision with root package name */
                    final /* synthetic */ Function0<Unit> f161090s;

                    /* renamed from: t, reason: collision with root package name */
                    final /* synthetic */ double f161091t;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: ss.o$g$a$e$c$a, reason: collision with other inner class name */
                    static final class C2515a implements Function1<C4039g, Unit> {

                        /* renamed from: a, reason: collision with root package name */
                        public static final C2515a f161092a = new C2515a();

                        public final void a(C4039g constrainAs) {
                            Intrinsics.j(constrainAs, "$this$constrainAs");
                            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                            a(c4039g);
                            return Unit.f142422a;
                        }

                        C2515a() {
                        }
                    }

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @SourceDebugExtension
                    /* renamed from: ss.o$g$a$e$c$b */
                    static final class b implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ ProductCardDecorator f161093a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ boolean f161094b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ boolean f161095c;

                        /* renamed from: d, reason: collision with root package name */
                        final /* synthetic */ float f161096d;

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        /* renamed from: ss.o$g$a$e$c$b$a, reason: collision with other inner class name */
                        static final class C2516a implements Function1<Modifier, Modifier> {

                            /* renamed from: a, reason: collision with root package name */
                            final /* synthetic */ float f161097a;

                            C2516a(float f10) {
                                this.f161097a = f10;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            /* renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Modifier invoke(Modifier modifier) {
                                Intrinsics.j(modifier, "$this$if");
                                return T0.a.a(modifier, this.f161097a);
                            }
                        }

                        b(ProductCardDecorator productCardDecorator, boolean z10, boolean z11, float f10) {
                            this.f161093a = productCardDecorator;
                            this.f161094b = z10;
                            this.f161095c = z11;
                            this.f161096d = f10;
                        }

                        public final void a(InterfaceC14814f AdsColumn, Composer composer, int i10) {
                            Intrinsics.j(AdsColumn, "$this$AdsColumn");
                            if ((i10 & 17) == 16 && composer.j()) {
                                composer.K();
                                return;
                            }
                            if (ComposerKt.M()) {
                                ComposerKt.U(-1907484098, i10, -1, "com.meijer.mobile.ui.productcard.HorizontalProductCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductCard.kt:247)");
                            }
                            String strC = C16193g.c(C17042t.f161233e, composer, 0);
                            String thumbnailUrl = this.f161093a.getThumbnailUrl();
                            String thumbnailUrl2 = this.f161093a.getThumbnailUrl();
                            Modifier modifierV = J.v(Modifier.INSTANCE, H1.h.p(96));
                            boolean z10 = (this.f161094b && !this.f161095c) || this.f161093a.getIsStepperExpanded();
                            composer.startReplaceGroup(5004770);
                            float f10 = this.f161096d;
                            Object objB = composer.B();
                            if (objB == Composer.INSTANCE.a()) {
                                objB = new C2516a(f10);
                                composer.t(objB);
                            }
                            composer.P();
                            C13530b.b(C17037o.R(modifierV, z10, (Function1) objB), thumbnailUrl, strC, thumbnailUrl2, null, false, null, null, 0.0f, composer, 0, 496);
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

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: ss.o$g$a$e$c$c, reason: collision with other inner class name */
                    /* synthetic */ class C2517c extends AdaptedFunctionReference implements Function1<LocalThemeScope, RegularPrice> {

                        /* renamed from: h, reason: collision with root package name */
                        public static final C2517c f161098h = new C2517c();

                        C2517c() {
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
                    /* renamed from: ss.o$g$a$e$c$d */
                    static final class d implements Function3<RegularPrice, Composer, Integer, Unit> {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ LocalThemeScope f161099a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ L1.n f161100b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ L1.h f161101c;

                        /* renamed from: d, reason: collision with root package name */
                        final /* synthetic */ L1.h f161102d;

                        /* renamed from: e, reason: collision with root package name */
                        final /* synthetic */ L1.h f161103e;

                        /* renamed from: f, reason: collision with root package name */
                        final /* synthetic */ ProductCardDecorator f161104f;

                        /* renamed from: g, reason: collision with root package name */
                        final /* synthetic */ L1.h f161105g;

                        /* renamed from: h, reason: collision with root package name */
                        final /* synthetic */ float f161106h;

                        /* renamed from: i, reason: collision with root package name */
                        final /* synthetic */ boolean f161107i;

                        /* renamed from: j, reason: collision with root package name */
                        final /* synthetic */ Function0<Unit> f161108j;

                        /* renamed from: k, reason: collision with root package name */
                        final /* synthetic */ Function0<Unit> f161109k;

                        /* renamed from: l, reason: collision with root package name */
                        final /* synthetic */ boolean f161110l;

                        /* renamed from: m, reason: collision with root package name */
                        final /* synthetic */ ClippableCouponDecorator f161111m;

                        /* renamed from: n, reason: collision with root package name */
                        final /* synthetic */ Function1<InterfaceC17023a, Unit> f161112n;

                        /* renamed from: o, reason: collision with root package name */
                        final /* synthetic */ int f161113o;

                        /* renamed from: p, reason: collision with root package name */
                        final /* synthetic */ Function0<Unit> f161114p;

                        /* renamed from: q, reason: collision with root package name */
                        final /* synthetic */ boolean f161115q;

                        /* renamed from: r, reason: collision with root package name */
                        final /* synthetic */ Function0<Unit> f161116r;

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        /* renamed from: ss.o$g$a$e$c$d$a, reason: collision with other inner class name */
                        static final class C2518a implements Function1<C4039g, Unit> {

                            /* renamed from: a, reason: collision with root package name */
                            final /* synthetic */ L1.h f161117a;

                            C2518a(L1.h hVar) {
                                this.f161117a = hVar;
                            }

                            public final void a(C4039g constrainAs) {
                                Intrinsics.j(constrainAs, "$this$constrainAs");
                                D.a.a(constrainAs.getStart(), this.f161117a.getEnd(), 0.0f, 0.0f, 6, null);
                                x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                                D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                constrainAs.r(v.INSTANCE.a());
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                                a(c4039g);
                                return Unit.f142422a;
                            }
                        }

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        @SourceDebugExtension
                        /* renamed from: ss.o$g$a$e$c$d$b */
                        static final class b implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

                            /* renamed from: a, reason: collision with root package name */
                            final /* synthetic */ LocalThemeScope f161118a;

                            /* renamed from: b, reason: collision with root package name */
                            final /* synthetic */ ProductCardDecorator f161119b;

                            /* renamed from: c, reason: collision with root package name */
                            final /* synthetic */ float f161120c;

                            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                            /* renamed from: ss.o$g$a$e$c$d$b$a, reason: collision with other inner class name */
                            static final class C2519a implements Function1<Modifier, Modifier> {

                                /* renamed from: a, reason: collision with root package name */
                                final /* synthetic */ float f161121a;

                                C2519a(float f10) {
                                    this.f161121a = f10;
                                }

                                @Override // kotlin.jvm.functions.Function1
                                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Modifier invoke(Modifier modifier) {
                                    Intrinsics.j(modifier, "$this$if");
                                    return T0.a.a(modifier, this.f161121a);
                                }
                            }

                            b(LocalThemeScope localThemeScope, ProductCardDecorator productCardDecorator, float f10) {
                                this.f161118a = localThemeScope;
                                this.f161119b = productCardDecorator;
                                this.f161120c = f10;
                            }

                            public final void a(InterfaceC14814f AdsColumn, Composer composer, int i10) {
                                Intrinsics.j(AdsColumn, "$this$AdsColumn");
                                if ((i10 & 17) == 16 && composer.j()) {
                                    composer.K();
                                    return;
                                }
                                if (ComposerKt.M()) {
                                    ComposerKt.U(1312110839, i10, -1, "com.meijer.mobile.ui.productcard.HorizontalProductCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductCard.kt:279)");
                                }
                                LocalThemeScope localThemeScope = this.f161118a;
                                String name = this.f161119b.getProduct().getName();
                                Modifier.Companion companion = Modifier.INSTANCE;
                                boolean isStepperExpanded = this.f161119b.getIsStepperExpanded();
                                composer.startReplaceGroup(5004770);
                                float f10 = this.f161120c;
                                Object objB = composer.B();
                                if (objB == Composer.INSTANCE.a()) {
                                    objB = new C2519a(f10);
                                    composer.t(objB);
                                }
                                composer.P();
                                C17037o.C(localThemeScope, name, C17037o.R(companion, isStepperExpanded, (Function1) objB), composer, LocalThemeScope.f15770g);
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

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        /* renamed from: ss.o$g$a$e$c$d$c, reason: collision with other inner class name */
                        static final class C2520c implements Function1<C4039g, Unit> {

                            /* renamed from: a, reason: collision with root package name */
                            final /* synthetic */ L1.h f161122a;

                            /* renamed from: b, reason: collision with root package name */
                            final /* synthetic */ ProductCardDecorator f161123b;

                            /* renamed from: c, reason: collision with root package name */
                            final /* synthetic */ L1.h f161124c;

                            C2520c(L1.h hVar, ProductCardDecorator productCardDecorator, L1.h hVar2) {
                                this.f161122a = hVar;
                                this.f161123b = productCardDecorator;
                                this.f161124c = hVar2;
                            }

                            public final void a(C4039g constrainAs) {
                                Intrinsics.j(constrainAs, "$this$constrainAs");
                                D.a.a(constrainAs.getStart(), this.f161122a.getStart(), 0.0f, 0.0f, 6, null);
                                x.a.a(constrainAs.getTop(), this.f161122a.getBottom(), 0.0f, 0.0f, 6, null);
                                if (this.f161123b.getIsEligibleForCart()) {
                                    D.a.a(constrainAs.getEnd(), this.f161124c.getStart(), 0.0f, 0.0f, 6, null);
                                } else {
                                    D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                }
                                constrainAs.r(v.INSTANCE.a());
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                                a(c4039g);
                                return Unit.f142422a;
                            }
                        }

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        @SourceDebugExtension
                        /* renamed from: ss.o$g$a$e$c$d$d, reason: collision with other inner class name */
                        static final class C2521d implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

                            /* renamed from: a, reason: collision with root package name */
                            final /* synthetic */ ProductCardDecorator f161125a;

                            /* renamed from: b, reason: collision with root package name */
                            final /* synthetic */ float f161126b;

                            /* renamed from: c, reason: collision with root package name */
                            final /* synthetic */ LocalThemeScope f161127c;

                            /* renamed from: d, reason: collision with root package name */
                            final /* synthetic */ boolean f161128d;

                            /* renamed from: e, reason: collision with root package name */
                            final /* synthetic */ Function0<Unit> f161129e;

                            /* renamed from: f, reason: collision with root package name */
                            final /* synthetic */ Function0<Unit> f161130f;

                            /* renamed from: g, reason: collision with root package name */
                            final /* synthetic */ boolean f161131g;

                            /* renamed from: h, reason: collision with root package name */
                            final /* synthetic */ ClippableCouponDecorator f161132h;

                            /* renamed from: i, reason: collision with root package name */
                            final /* synthetic */ Function1<InterfaceC17023a, Unit> f161133i;

                            /* renamed from: j, reason: collision with root package name */
                            final /* synthetic */ int f161134j;

                            /* renamed from: k, reason: collision with root package name */
                            final /* synthetic */ Function0<Unit> f161135k;

                            /* renamed from: l, reason: collision with root package name */
                            final /* synthetic */ boolean f161136l;

                            /* renamed from: m, reason: collision with root package name */
                            final /* synthetic */ Function0<Unit> f161137m;

                            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                            /* renamed from: ss.o$g$a$e$c$d$d$a, reason: collision with other inner class name */
                            static final class C2522a implements Function1<Modifier, Modifier> {

                                /* renamed from: a, reason: collision with root package name */
                                final /* synthetic */ float f161138a;

                                C2522a(float f10) {
                                    this.f161138a = f10;
                                }

                                @Override // kotlin.jvm.functions.Function1
                                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Modifier invoke(Modifier modifier) {
                                    Intrinsics.j(modifier, "$this$if");
                                    return T0.a.a(modifier, this.f161138a);
                                }
                            }

                            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                            /* renamed from: ss.o$g$a$e$c$d$d$b */
                            static final class b implements Function1<u, Unit> {

                                /* renamed from: a, reason: collision with root package name */
                                final /* synthetic */ String f161139a;

                                b(String str) {
                                    this.f161139a = str;
                                }

                                public final void a(u semantics) {
                                    Intrinsics.j(semantics, "$this$semantics");
                                    r1.s.g0(semantics, this.f161139a);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(u uVar) {
                                    a(uVar);
                                    return Unit.f142422a;
                                }
                            }

                            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                            /* renamed from: ss.o$g$a$e$c$d$d$c, reason: collision with other inner class name */
                            static final class C2523c implements Function0<Unit> {

                                /* renamed from: a, reason: collision with root package name */
                                final /* synthetic */ Function1<InterfaceC17023a, Unit> f161140a;

                                /* renamed from: b, reason: collision with root package name */
                                final /* synthetic */ ProductCardDecorator f161141b;

                                /* renamed from: c, reason: collision with root package name */
                                final /* synthetic */ int f161142c;

                                /* JADX WARN: Multi-variable type inference failed */
                                C2523c(Function1<? super InterfaceC17023a, Unit> function1, ProductCardDecorator productCardDecorator, int i10) {
                                    this.f161140a = function1;
                                    this.f161141b = productCardDecorator;
                                    this.f161142c = i10;
                                }

                                public final void a() {
                                    Function1<InterfaceC17023a, Unit> function1 = this.f161140a;
                                    if (function1 != null) {
                                        function1.invoke(new InterfaceC17023a.ProductItemClicked(this.f161141b, this.f161142c));
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    a();
                                    return Unit.f142422a;
                                }
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            C2521d(ProductCardDecorator productCardDecorator, float f10, LocalThemeScope localThemeScope, boolean z10, Function0<Unit> function0, Function0<Unit> function02, boolean z11, ClippableCouponDecorator clippableCouponDecorator, Function1<? super InterfaceC17023a, Unit> function1, int i10, Function0<Unit> function03, boolean z12, Function0<Unit> function04) {
                                this.f161125a = productCardDecorator;
                                this.f161126b = f10;
                                this.f161127c = localThemeScope;
                                this.f161128d = z10;
                                this.f161129e = function0;
                                this.f161130f = function02;
                                this.f161131g = z11;
                                this.f161132h = clippableCouponDecorator;
                                this.f161133i = function1;
                                this.f161134j = i10;
                                this.f161135k = function03;
                                this.f161136l = z12;
                                this.f161137m = function04;
                            }

                            public final void a(InterfaceC14814f AdsColumn, Composer composer, int i10) {
                                int i11;
                                int i12;
                                boolean z10;
                                Function0<Unit> function0;
                                EnumC18214a enumC18214a;
                                int i13;
                                int i14;
                                Function0<Unit> function02;
                                Function0<Unit> function03;
                                Function0<Unit> function04;
                                InterfaceC5730l0<EnumC18214a> interfaceC5730l0A;
                                Intrinsics.j(AdsColumn, "$this$AdsColumn");
                                if ((i10 & 17) == 16 && composer.j()) {
                                    composer.K();
                                    return;
                                }
                                if (ComposerKt.M()) {
                                    ComposerKt.U(180126830, i10, -1, "com.meijer.mobile.ui.productcard.HorizontalProductCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductCard.kt:301)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                boolean isStepperExpanded = this.f161125a.getIsStepperExpanded();
                                composer.startReplaceGroup(5004770);
                                float f10 = this.f161126b;
                                Object objB = composer.B();
                                Composer.Companion companion2 = Composer.INSTANCE;
                                if (objB == companion2.a()) {
                                    objB = new C2522a(f10);
                                    composer.t(objB);
                                }
                                composer.P();
                                Modifier modifierR = C17037o.R(companion, isStepperExpanded, (Function1) objB);
                                LocalThemeScope localThemeScope = this.f161127c;
                                ProductCardDecorator productCardDecorator = this.f161125a;
                                boolean z11 = this.f161128d;
                                Function0<Unit> function05 = this.f161129e;
                                Function0<Unit> function06 = this.f161130f;
                                boolean z12 = this.f161131g;
                                ClippableCouponDecorator clippableCouponDecorator = this.f161132h;
                                Function1<InterfaceC17023a, Unit> function1 = this.f161133i;
                                int i15 = this.f161134j;
                                Function0<Unit> function07 = this.f161135k;
                                boolean z13 = this.f161136l;
                                Function0<Unit> function08 = this.f161137m;
                                C5658d c5658d = C5658d.f48555a;
                                C5658d.m mVarH = c5658d.h();
                                e.Companion companion3 = P0.e.INSTANCE;
                                MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion3.k(), composer, 0);
                                int iA = C5717f.a(composer, 0);
                                InterfaceC5742s interfaceC5742sR = composer.r();
                                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierR);
                                InterfaceC5811g.Companion companion4 = InterfaceC5811g.INSTANCE;
                                Function0<InterfaceC5811g> function0A = companion4.a();
                                if (composer.k() == null) {
                                    C5717f.c();
                                }
                                composer.F();
                                if (composer.getInserting()) {
                                    composer.I(function0A);
                                } else {
                                    composer.s();
                                }
                                Composer composerA = D1.a(composer);
                                D1.c(composerA, measurePolicyA, companion4.e());
                                D1.c(composerA, interfaceC5742sR, companion4.g());
                                Function2<InterfaceC5811g, Integer, Unit> function2B = companion4.b();
                                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                                    composerA.t(Integer.valueOf(iA));
                                    composerA.n(Integer.valueOf(iA), function2B);
                                }
                                D1.c(composerA, modifierE, companion4.f());
                                C14815g c14815g = C14815g.f139108a;
                                MeasurePolicy measurePolicyA2 = C5665k.a(c5658d.h(), companion3.k(), composer, 0);
                                int iA2 = C5717f.a(composer, 0);
                                InterfaceC5742s interfaceC5742sR2 = composer.r();
                                Modifier modifierE2 = androidx.compose.ui.b.e(composer, companion);
                                Function0<InterfaceC5811g> function0A2 = companion4.a();
                                if (composer.k() == null) {
                                    C5717f.c();
                                }
                                composer.F();
                                if (composer.getInserting()) {
                                    composer.I(function0A2);
                                } else {
                                    composer.s();
                                }
                                Composer composerA2 = D1.a(composer);
                                D1.c(composerA2, measurePolicyA2, companion4.e());
                                D1.c(composerA2, interfaceC5742sR2, companion4.g());
                                Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion4.b();
                                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                                    composerA2.t(Integer.valueOf(iA2));
                                    composerA2.n(Integer.valueOf(iA2), function2B2);
                                }
                                D1.c(composerA2, modifierE2, companion4.f());
                                boolean isOnSale = productCardDecorator.getIsOnSale();
                                AbstractC5607a currentPrice = productCardDecorator.getCurrentPrice();
                                AbstractC5607a regularPrice = productCardDecorator.getRegularPrice();
                                AbstractC5607a currentPriceDescription = productCardDecorator.getCurrentPriceDescription();
                                AbstractC5607a regularPriceDescription = productCardDecorator.getRegularPriceDescription();
                                int i16 = LocalThemeScope.f15770g;
                                int i17 = AbstractC5607a.f45514b;
                                C17037o.A(localThemeScope, isOnSale, currentPrice, regularPrice, currentPriceDescription, regularPriceDescription, composer, i16 | (i17 << 6) | (i17 << 9) | (i17 << 12) | (i17 << 15));
                                C17037o.H(localThemeScope, productCardDecorator.getWeightUnitSizeAndPrice(), composer, (i17 << 3) | i16);
                                composer.startReplaceGroup(152396550);
                                if (!Intrinsics.e(C6408b.a(productCardDecorator.getCurrentPrice(), composer, i17), C16193g.c(C17042t.f161236h, composer, 0))) {
                                    C17037o.n(localThemeScope, productCardDecorator.getAmountSaved(), composer, (i17 << 3) | i16);
                                }
                                composer.P();
                                composer.startReplaceGroup(152408750);
                                if (z11) {
                                    String strA = C6408b.a(productCardDecorator.getProductRatingDescription(), composer, i17);
                                    composer.startReplaceGroup(5004770);
                                    boolean zV = composer.V(strA);
                                    Object objB2 = composer.B();
                                    if (zV || objB2 == companion2.a()) {
                                        objB2 = new b(strA);
                                        composer.t(objB2);
                                    }
                                    composer.P();
                                    i12 = 0;
                                    i11 = i16;
                                    C17037o.E(localThemeScope, C16705m.d(companion, false, (Function1) objB2, 1, null), productCardDecorator.getProductRating(), composer, i11, 0);
                                } else {
                                    i11 = i16;
                                    i12 = 0;
                                }
                                composer.P();
                                C17037o.r(localThemeScope, productCardDecorator.getIsBopas(), composer, i11);
                                composer.startReplaceGroup(152434086);
                                if (C6408b.a(productCardDecorator.getAmountSaved(), composer, i17).length() > 0) {
                                    function02 = function06;
                                    enumC18214a = null;
                                    function0 = function07;
                                    i14 = i17;
                                    i13 = i12;
                                    function03 = function08;
                                    z10 = z13;
                                    C14802K.a(androidx.compose.foundation.layout.D.m(companion, 0.0f, H1.h.p(12), 0.0f, 0.0f, 13, null), composer, 6);
                                } else {
                                    z10 = z13;
                                    function0 = function07;
                                    enumC18214a = null;
                                    i13 = i12;
                                    i14 = i17;
                                    function02 = function06;
                                    function03 = function08;
                                }
                                composer.P();
                                C17037o.p(localThemeScope, productCardDecorator.getComplexPromo(), composer, (i14 << 3) | i11);
                                if (!productCardDecorator.getIsStepperExpanded()) {
                                    function05 = function02;
                                }
                                composer.startReplaceGroup(152461479);
                                if (z12) {
                                    Hr.d.c(localThemeScope, clippableCouponDecorator, function05, composer, (ClippableCouponDecorator.f13160c << 3) | i11);
                                    if (ArraysKt.Y(new EnumC18214a[]{EnumC18214a.f170499c, EnumC18214a.f170498b, EnumC18214a.f170501e}, (clippableCouponDecorator == null || (interfaceC5730l0A = clippableCouponDecorator.a()) == null) ? enumC18214a : interfaceC5730l0A.getValue())) {
                                        composer.startReplaceGroup(152495863);
                                        if (productCardDecorator.getIsStepperExpanded()) {
                                            composer.startReplaceGroup(-1746271574);
                                            boolean zV2 = composer.V(function1) | composer.D(productCardDecorator) | composer.d(i15);
                                            Object objB3 = composer.B();
                                            if (zV2 || objB3 == companion2.a()) {
                                                objB3 = new C2523c(function1, productCardDecorator, i15);
                                                composer.t(objB3);
                                            }
                                            function04 = (Function0) objB3;
                                            composer.P();
                                        } else {
                                            function04 = function0;
                                        }
                                        composer.P();
                                        e0.b(localThemeScope, C16193g.c(C17042t.f161237i, composer, i13), function04, composer, i11);
                                    }
                                }
                                composer.P();
                                C17037o.t(localThemeScope, z10, function03, composer, i11);
                                composer.v();
                                composer.v();
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

                        /* JADX WARN: Multi-variable type inference failed */
                        d(LocalThemeScope localThemeScope, L1.n nVar, L1.h hVar, L1.h hVar2, L1.h hVar3, ProductCardDecorator productCardDecorator, L1.h hVar4, float f10, boolean z10, Function0<Unit> function0, Function0<Unit> function02, boolean z11, ClippableCouponDecorator clippableCouponDecorator, Function1<? super InterfaceC17023a, Unit> function1, int i10, Function0<Unit> function03, boolean z12, Function0<Unit> function04) {
                            this.f161099a = localThemeScope;
                            this.f161100b = nVar;
                            this.f161101c = hVar;
                            this.f161102d = hVar2;
                            this.f161103e = hVar3;
                            this.f161104f = productCardDecorator;
                            this.f161105g = hVar4;
                            this.f161106h = f10;
                            this.f161107i = z10;
                            this.f161108j = function0;
                            this.f161109k = function02;
                            this.f161110l = z11;
                            this.f161111m = clippableCouponDecorator;
                            this.f161112n = function1;
                            this.f161113o = i10;
                            this.f161114p = function03;
                            this.f161115q = z12;
                            this.f161116r = function04;
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
                                ComposerKt.U(34545069, i11, -1, "com.meijer.mobile.ui.productcard.HorizontalProductCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductCard.kt:266)");
                            }
                            LocalThemeScope localThemeScope = this.f161099a;
                            q1.Column productColumn = Assemble.getContainers().getProductColumn();
                            Modifier modifier = Assemble.getContainers().getProductColumn().getModifier();
                            L1.n nVar = this.f161100b;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            L1.h hVar = this.f161101c;
                            composer.startReplaceGroup(5004770);
                            boolean zV = composer.V(this.f161102d);
                            L1.h hVar2 = this.f161102d;
                            Object objB = composer.B();
                            if (zV || objB == Composer.INSTANCE.a()) {
                                objB = new C2518a(hVar2);
                                composer.t(objB);
                            }
                            composer.P();
                            q1.Column columnY = q1.Column.y(productColumn, modifier.then(nVar.k(companion, hVar, (Function1) objB)), null, null, 6, null);
                            ComposableLambda composableLambdaC = ComposableLambdaKt.c(1312110839, true, new b(this.f161099a, this.f161104f, this.f161106h), composer, 54);
                            int i12 = LocalThemeScope.f15770g;
                            int i13 = q1.Column.f139985d;
                            C16088n.e(localThemeScope, columnY, composableLambdaC, composer, i12 | 384 | (i13 << 3));
                            LocalThemeScope localThemeScope2 = this.f161099a;
                            q1.Column productColumn2 = Assemble.getContainers().getProductColumn();
                            Modifier modifier2 = Assemble.getContainers().getProductColumn().getModifier();
                            L1.n nVar2 = this.f161100b;
                            float f10 = 0;
                            Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, 0.0f, H1.h.p(f10), 0.0f, H1.h.p(f10), 5, null);
                            L1.h hVar3 = this.f161103e;
                            composer.startReplaceGroup(-1746271574);
                            boolean zV2 = composer.V(this.f161101c) | composer.D(this.f161104f) | composer.V(this.f161105g);
                            L1.h hVar4 = this.f161101c;
                            ProductCardDecorator productCardDecorator = this.f161104f;
                            L1.h hVar5 = this.f161105g;
                            Object objB2 = composer.B();
                            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                                objB2 = new C2520c(hVar4, productCardDecorator, hVar5);
                                composer.t(objB2);
                            }
                            composer.P();
                            C16088n.e(localThemeScope2, q1.Column.y(productColumn2, modifier2.then(nVar2.k(modifierM, hVar3, (Function1) objB2)), null, null, 6, null), ComposableLambdaKt.c(180126830, true, new C2521d(this.f161104f, this.f161106h, this.f161099a, this.f161107i, this.f161108j, this.f161109k, this.f161110l, this.f161111m, this.f161112n, this.f161113o, this.f161114p, this.f161115q, this.f161116r), composer, 54), composer, i12 | 384 | (i13 << 3));
                            if (ComposerKt.M()) {
                                ComposerKt.T();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RegularPrice regularPrice, Composer composer, Integer num) {
                            a(regularPrice, composer, num.intValue());
                            return Unit.f142422a;
                        }
                    }

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: ss.o$g$a$e$c$e, reason: collision with other inner class name */
                    static final class C2524e implements Function1<C4039g, Unit> {

                        /* renamed from: a, reason: collision with root package name */
                        public static final C2524e f161143a = new C2524e();

                        public final void a(C4039g constrainAs) {
                            Intrinsics.j(constrainAs, "$this$constrainAs");
                            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                            a(c4039g);
                            return Unit.f142422a;
                        }

                        C2524e() {
                        }
                    }

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: ss.o$g$a$e$c$f */
                    static final class f implements Function1<Modifier, Modifier> {

                        /* renamed from: a, reason: collision with root package name */
                        public static final f f161144a = new f();

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
                    /* renamed from: ss.o$g$a$e$c$g, reason: collision with other inner class name */
                    static final class C2525g implements Function2<Double, Double, Unit> {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ Function1<InterfaceC17023a, Unit> f161145a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ ProductCardDecorator f161146b;

                        /* JADX WARN: Multi-variable type inference failed */
                        C2525g(Function1<? super InterfaceC17023a, Unit> function1, ProductCardDecorator productCardDecorator) {
                            this.f161145a = function1;
                            this.f161146b = productCardDecorator;
                        }

                        public final void a(double d10, double d11) {
                            Function1<InterfaceC17023a, Unit> function1 = this.f161145a;
                            if (function1 != null) {
                                function1.invoke(new InterfaceC17023a.UpdateEntry(this.f161146b.getProduct(), d10));
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Double d10, Double d11) {
                            a(d10.doubleValue(), d11.doubleValue());
                            return Unit.f142422a;
                        }
                    }

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: ss.o$g$a$e$c$h */
                    static final class h implements Function0<Unit> {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ Function0<Unit> f161147a;

                        h(Function0<Unit> function0) {
                            this.f161147a = function0;
                        }

                        public final void a() {
                            this.f161147a.invoke();
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            a();
                            return Unit.f142422a;
                        }
                    }

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: ss.o$g$a$e$c$i */
                    static final class i implements Function1<C4039g, Unit> {

                        /* renamed from: a, reason: collision with root package name */
                        public static final i f161148a = new i();

                        public final void a(C4039g constrainAs) {
                            Intrinsics.j(constrainAs, "$this$constrainAs");
                            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                            a(c4039g);
                            return Unit.f142422a;
                        }

                        i() {
                        }
                    }

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: ss.o$g$a$e$c$j */
                    static final class j implements Function2<Double, Double, Unit> {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ Function1<InterfaceC17023a, Unit> f161149a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ ProductCardDecorator f161150b;

                        /* JADX WARN: Multi-variable type inference failed */
                        j(Function1<? super InterfaceC17023a, Unit> function1, ProductCardDecorator productCardDecorator) {
                            this.f161149a = function1;
                            this.f161150b = productCardDecorator;
                        }

                        public final void a(double d10, double d11) {
                            Function1<InterfaceC17023a, Unit> function1 = this.f161149a;
                            if (function1 != null) {
                                function1.invoke(new InterfaceC17023a.UpdateEntry(this.f161150b.getProduct(), d10));
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Double d10, Double d11) {
                            a(d10.doubleValue(), d11.doubleValue());
                            return Unit.f142422a;
                        }
                    }

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: ss.o$g$a$e$c$k */
                    public static final class k extends Lambda implements Function1<u, Unit> {

                        /* renamed from: f, reason: collision with root package name */
                        final /* synthetic */ A f161151f;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public k(A a10) {
                            super(1);
                            this.f161151f = a10;
                        }

                        public final void a(u semantics) {
                            Intrinsics.j(semantics, "$this$semantics");
                            C.a(semantics, this.f161151f);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(u uVar) {
                            a(uVar);
                            return Unit.f142422a;
                        }
                    }

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @SourceDebugExtension
                    /* renamed from: ss.o$g$a$e$c$l */
                    public static final class l extends Lambda implements Function2<Composer, Integer, Unit> {

                        /* renamed from: A, reason: collision with root package name */
                        final /* synthetic */ Function0 f161152A;

                        /* renamed from: B, reason: collision with root package name */
                        final /* synthetic */ double f161153B;

                        /* renamed from: f, reason: collision with root package name */
                        final /* synthetic */ int f161154f;

                        /* renamed from: g, reason: collision with root package name */
                        final /* synthetic */ L1.n f161155g;

                        /* renamed from: h, reason: collision with root package name */
                        final /* synthetic */ Function0 f161156h;

                        /* renamed from: i, reason: collision with root package name */
                        final /* synthetic */ LocalThemeScope f161157i;

                        /* renamed from: j, reason: collision with root package name */
                        final /* synthetic */ RegularPrice f161158j;

                        /* renamed from: k, reason: collision with root package name */
                        final /* synthetic */ boolean f161159k;

                        /* renamed from: l, reason: collision with root package name */
                        final /* synthetic */ ProductCardDecorator f161160l;

                        /* renamed from: m, reason: collision with root package name */
                        final /* synthetic */ boolean f161161m;

                        /* renamed from: n, reason: collision with root package name */
                        final /* synthetic */ boolean f161162n;

                        /* renamed from: o, reason: collision with root package name */
                        final /* synthetic */ float f161163o;

                        /* renamed from: p, reason: collision with root package name */
                        final /* synthetic */ boolean f161164p;

                        /* renamed from: q, reason: collision with root package name */
                        final /* synthetic */ Function0 f161165q;

                        /* renamed from: r, reason: collision with root package name */
                        final /* synthetic */ Function0 f161166r;

                        /* renamed from: s, reason: collision with root package name */
                        final /* synthetic */ boolean f161167s;

                        /* renamed from: t, reason: collision with root package name */
                        final /* synthetic */ ClippableCouponDecorator f161168t;

                        /* renamed from: u, reason: collision with root package name */
                        final /* synthetic */ Function1 f161169u;

                        /* renamed from: v, reason: collision with root package name */
                        final /* synthetic */ int f161170v;

                        /* renamed from: w, reason: collision with root package name */
                        final /* synthetic */ Function0 f161171w;

                        /* renamed from: x, reason: collision with root package name */
                        final /* synthetic */ boolean f161172x;

                        /* renamed from: y, reason: collision with root package name */
                        final /* synthetic */ Function0 f161173y;

                        /* renamed from: z, reason: collision with root package name */
                        final /* synthetic */ Function0 f161174z;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public l(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, RegularPrice regularPrice, boolean z10, ProductCardDecorator productCardDecorator, boolean z11, boolean z12, float f10, boolean z13, Function0 function02, Function0 function03, boolean z14, ClippableCouponDecorator clippableCouponDecorator, Function1 function1, int i11, Function0 function04, boolean z15, Function0 function05, Function0 function06, Function0 function07, double d10) {
                            super(2);
                            this.f161155g = nVar;
                            this.f161156h = function0;
                            this.f161157i = localThemeScope;
                            this.f161158j = regularPrice;
                            this.f161159k = z10;
                            this.f161160l = productCardDecorator;
                            this.f161161m = z11;
                            this.f161162n = z12;
                            this.f161163o = f10;
                            this.f161164p = z13;
                            this.f161165q = function02;
                            this.f161166r = function03;
                            this.f161167s = z14;
                            this.f161168t = clippableCouponDecorator;
                            this.f161169u = function1;
                            this.f161170v = i11;
                            this.f161171w = function04;
                            this.f161172x = z15;
                            this.f161173y = function05;
                            this.f161174z = function06;
                            this.f161152A = function07;
                            this.f161153B = d10;
                            this.f161154f = i10;
                        }

                        public final void a(Composer composer, int i10) {
                            int i11;
                            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                                composer.K();
                                return;
                            }
                            int helpersHashCode = this.f161155g.getHelpersHashCode();
                            this.f161155g.i();
                            L1.n nVar = this.f161155g;
                            composer.startReplaceGroup(1495935916);
                            n.b bVarM = nVar.m();
                            L1.h hVarA = bVarM.a();
                            L1.h hVarC = bVarM.c();
                            L1.h hVarD = bVarM.d();
                            L1.h hVarE = bVarM.e();
                            L1.h hVarF = bVarM.f();
                            LocalThemeScope localThemeScope = this.f161157i;
                            q1.Column imgColumn = this.f161158j.getContainers().getImgColumn();
                            Modifier modifier = this.f161158j.getContainers().getImgColumn().getModifier();
                            Modifier.Companion companion = Modifier.INSTANCE;
                            composer.startReplaceGroup(1849434622);
                            Object objB = composer.B();
                            Composer.Companion companion2 = Composer.INSTANCE;
                            if (objB == companion2.a()) {
                                objB = C2515a.f161092a;
                                composer.t(objB);
                            }
                            composer.P();
                            q1.Column columnY = q1.Column.y(imgColumn, modifier.then(nVar.k(companion, hVarA, (Function1) objB)), null, null, 6, null);
                            ComposableLambda composableLambdaC = ComposableLambdaKt.c(-1907484098, true, new b(this.f161160l, this.f161159k, this.f161162n, this.f161163o), composer, 54);
                            int i12 = LocalThemeScope.f15770g;
                            C16088n.e(localThemeScope, columnY, composableLambdaC, composer, i12 | 384 | (q1.Column.f139985d << 3));
                            LocalThemeScope localThemeScope2 = this.f161157i;
                            composer.startReplaceGroup(1849434622);
                            Object objB2 = composer.B();
                            if (objB2 == companion2.a()) {
                                objB2 = C2517c.f161098h;
                                composer.t(objB2);
                            }
                            composer.P();
                            Q.f(localThemeScope2, (Function1) objB2, ComposableLambdaKt.c(34545069, true, new d(this.f161157i, nVar, hVarF, hVarA, hVarC, this.f161160l, hVarD, this.f161163o, this.f161164p, this.f161165q, this.f161166r, this.f161167s, this.f161168t, this.f161169u, this.f161170v, this.f161171w, this.f161172x, this.f161173y), composer, 54), composer, i12 | 432);
                            composer.startReplaceGroup(1988216712);
                            if (!this.f161159k && this.f161160l.getIsEligibleForCart() && this.f161161m) {
                                composer.startReplaceGroup(1849434622);
                                Object objB3 = composer.B();
                                if (objB3 == companion2.a()) {
                                    objB3 = C2524e.f161143a;
                                    composer.t(objB3);
                                }
                                composer.P();
                                Modifier modifierK = nVar.k(companion, hVarD, (Function1) objB3);
                                boolean isStepperExpanded = this.f161160l.getIsStepperExpanded();
                                composer.startReplaceGroup(1849434622);
                                Object objB4 = composer.B();
                                if (objB4 == companion2.a()) {
                                    objB4 = f.f161144a;
                                    composer.t(objB4);
                                }
                                composer.P();
                                Modifier modifierF = C18299z.f(androidx.compose.foundation.layout.D.m(C17037o.R(modifierK, isStepperExpanded, (Function1) objB4), H1.h.p(4), 0.0f, 0.0f, 0.0f, 14, null), "quantityStepper", null, 2, null);
                                C5658d c5658d = C5658d.f48555a;
                                C5658d.m mVarH = c5658d.h();
                                e.Companion companion3 = P0.e.INSTANCE;
                                MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion3.k(), composer, 0);
                                int iA = C5717f.a(composer, 0);
                                InterfaceC5742s interfaceC5742sR = composer.r();
                                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierF);
                                InterfaceC5811g.Companion companion4 = InterfaceC5811g.INSTANCE;
                                Function0<InterfaceC5811g> function0A = companion4.a();
                                if (composer.k() == null) {
                                    C5717f.c();
                                }
                                composer.F();
                                if (composer.getInserting()) {
                                    composer.I(function0A);
                                } else {
                                    composer.s();
                                }
                                Composer composerA = D1.a(composer);
                                D1.c(composerA, measurePolicyA, companion4.e());
                                D1.c(composerA, interfaceC5742sR, companion4.g());
                                Function2<InterfaceC5811g, Integer, Unit> function2B = companion4.b();
                                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                                    composerA.t(Integer.valueOf(iA));
                                    composerA.n(Integer.valueOf(iA), function2B);
                                }
                                D1.c(composerA, modifierE, companion4.f());
                                C14815g c14815g = C14815g.f139108a;
                                double actualQuantity = this.f161160l.getActualQuantity();
                                double qtyIncrement = this.f161160l.getQtyIncrement();
                                String strC = C16193g.c(Bj.o.f2962B, composer, 0);
                                String strC2 = C16193g.c(Bj.o.f3047v, composer, 0);
                                String strC3 = C16193g.c(Bj.o.f2989O0, composer, 0);
                                LocalThemeScope localThemeScope3 = this.f161157i;
                                composer.startReplaceGroup(-1633490746);
                                boolean zD = composer.D(this.f161160l) | composer.V(this.f161169u);
                                Object objB5 = composer.B();
                                if (zD || objB5 == companion2.a()) {
                                    objB5 = new C2525g(this.f161169u, this.f161160l);
                                    composer.t(objB5);
                                }
                                Function2 function2 = (Function2) objB5;
                                composer.P();
                                composer.startReplaceGroup(5004770);
                                boolean zV = composer.V(this.f161174z);
                                Object objB6 = composer.B();
                                if (zV || objB6 == companion2.a()) {
                                    objB6 = new h(this.f161174z);
                                    composer.t(objB6);
                                }
                                composer.P();
                                i11 = helpersHashCode;
                                Kj.k.n(localThemeScope3, actualQuantity, function2, false, (Function0) objB6, this.f161152A, qtyIncrement, this.f161153B, AnimatedGradientTextView.ANIMATION_DURATION, strC, strC2, null, strC3, null, false, null, composer, i12 | 100666368, 0, 29696);
                                composer.v();
                                if (this.f161160l.getIsStepperExpanded()) {
                                    composer.startReplaceGroup(1849434622);
                                    Object objB7 = composer.B();
                                    if (objB7 == companion2.a()) {
                                        objB7 = i.f161148a;
                                        composer.t(objB7);
                                    }
                                    composer.P();
                                    Modifier modifierK2 = nVar.k(companion, hVarE, (Function1) objB7);
                                    MeasurePolicy measurePolicyA2 = C5665k.a(c5658d.h(), companion3.k(), composer, 0);
                                    int iA2 = C5717f.a(composer, 0);
                                    InterfaceC5742s interfaceC5742sR2 = composer.r();
                                    Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierK2);
                                    Function0<InterfaceC5811g> function0A2 = companion4.a();
                                    if (composer.k() == null) {
                                        C5717f.c();
                                    }
                                    composer.F();
                                    if (composer.getInserting()) {
                                        composer.I(function0A2);
                                    } else {
                                        composer.s();
                                    }
                                    Composer composerA2 = D1.a(composer);
                                    D1.c(composerA2, measurePolicyA2, companion4.e());
                                    D1.c(composerA2, interfaceC5742sR2, companion4.g());
                                    Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion4.b();
                                    if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                                        composerA2.t(Integer.valueOf(iA2));
                                        composerA2.n(Integer.valueOf(iA2), function2B2);
                                    }
                                    D1.c(composerA2, modifierE2, companion4.f());
                                    double actualQuantity2 = this.f161160l.getActualQuantity();
                                    boolean isStepperExpanded2 = this.f161160l.getIsStepperExpanded();
                                    double qtyIncrement2 = this.f161160l.getQtyIncrement();
                                    String strC4 = C16193g.c(Bj.o.f2962B, composer, 0);
                                    String strC5 = C16193g.c(Bj.o.f3047v, composer, 0);
                                    String strC6 = C16193g.c(Bj.o.f2989O0, composer, 0);
                                    LocalThemeScope localThemeScope4 = this.f161157i;
                                    composer.startReplaceGroup(-1633490746);
                                    boolean zV2 = composer.V(this.f161169u) | composer.D(this.f161160l);
                                    Object objB8 = composer.B();
                                    if (zV2 || objB8 == companion2.a()) {
                                        objB8 = new j(this.f161169u, this.f161160l);
                                        composer.t(objB8);
                                    }
                                    composer.P();
                                    Kj.k.n(localThemeScope4, actualQuantity2, (Function2) objB8, isStepperExpanded2, this.f161174z, this.f161152A, qtyIncrement2, this.f161153B, AnimatedGradientTextView.ANIMATION_DURATION, strC4, strC5, null, strC6, null, false, null, composer, i12 | 100663296, 0, 29696);
                                    composer.v();
                                }
                            } else {
                                i11 = helpersHashCode;
                            }
                            composer.P();
                            composer.P();
                            if (this.f161155g.getHelpersHashCode() != i11) {
                                this.f161156h.invoke();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            a(composer, num.intValue());
                            return Unit.f142422a;
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    c(LocalThemeScope localThemeScope, RegularPrice regularPrice, boolean z10, ProductCardDecorator productCardDecorator, boolean z11, boolean z12, float f10, boolean z13, Function0<Unit> function0, Function0<Unit> function02, boolean z14, ClippableCouponDecorator clippableCouponDecorator, Function1<? super InterfaceC17023a, Unit> function1, int i10, Function0<Unit> function03, boolean z15, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, double d10) {
                        this.f161072a = localThemeScope;
                        this.f161073b = regularPrice;
                        this.f161074c = z10;
                        this.f161075d = productCardDecorator;
                        this.f161076e = z11;
                        this.f161077f = z12;
                        this.f161078g = f10;
                        this.f161079h = z13;
                        this.f161080i = function0;
                        this.f161081j = function02;
                        this.f161082k = z14;
                        this.f161083l = clippableCouponDecorator;
                        this.f161084m = function1;
                        this.f161085n = i10;
                        this.f161086o = function03;
                        this.f161087p = z15;
                        this.f161088q = function04;
                        this.f161089r = function05;
                        this.f161090s = function06;
                        this.f161091t = d10;
                    }

                    public final void a(InterfaceC14800I AdsRow, Composer composer, int i10) {
                        L1.n nVar;
                        Intrinsics.j(AdsRow, "$this$AdsRow");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-2019029507, i10, -1, "com.meijer.mobile.ui.productcard.HorizontalProductCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductCard.kt:236)");
                        }
                        Modifier modifierF = J.f(Modifier.INSTANCE, 0.0f, 1, null);
                        LocalThemeScope localThemeScope = this.f161072a;
                        RegularPrice regularPrice = this.f161073b;
                        boolean z10 = this.f161074c;
                        ProductCardDecorator productCardDecorator = this.f161075d;
                        boolean z11 = this.f161076e;
                        boolean z12 = this.f161077f;
                        float f10 = this.f161078g;
                        boolean z13 = this.f161079h;
                        Function0<Unit> function0 = this.f161080i;
                        Function0<Unit> function02 = this.f161081j;
                        boolean z14 = this.f161082k;
                        ClippableCouponDecorator clippableCouponDecorator = this.f161083l;
                        Function1<InterfaceC17023a, Unit> function1 = this.f161084m;
                        int i11 = this.f161085n;
                        Function0<Unit> function03 = this.f161086o;
                        boolean z15 = this.f161087p;
                        Function0<Unit> function04 = this.f161088q;
                        Function0<Unit> function05 = this.f161089r;
                        Function0<Unit> function06 = this.f161090s;
                        double d10 = this.f161091t;
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
                        Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5730l0) objB3, a10, composer, 4544);
                        androidx.compose.ui.layout.A.a(C16705m.d(modifierF, false, new k(a10), 1, null), ComposableLambdaKt.composableLambda(composer, -819894182, true, new l(nVar, 6, pairH.b(), localThemeScope, regularPrice, z10, productCardDecorator, z11, z12, f10, z13, function0, function02, z14, clippableCouponDecorator, function1, i11, function03, z15, function04, function05, function06, d10)), pairH.a(), composer, 48, 0);
                        composer.U();
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

                /* JADX WARN: Multi-variable type inference failed */
                e(LocalThemeScope localThemeScope, RegularPrice regularPrice, ProductCardDecorator productCardDecorator, boolean z10, int i10, float f10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, Function0<Unit> function0, Function0<Unit> function02, boolean z19, ClippableCouponDecorator clippableCouponDecorator, Function1<? super InterfaceC17023a, Unit> function1, int i11, Function0<Unit> function03, boolean z20, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, double d10) {
                    this.f161039a = localThemeScope;
                    this.f161040b = regularPrice;
                    this.f161041c = productCardDecorator;
                    this.f161042d = z10;
                    this.f161043e = i10;
                    this.f161044f = f10;
                    this.f161045g = z11;
                    this.f161046h = z12;
                    this.f161047i = z13;
                    this.f161048j = z14;
                    this.f161049k = z15;
                    this.f161050l = z16;
                    this.f161051m = z17;
                    this.f161052n = z18;
                    this.f161053o = function0;
                    this.f161054p = function02;
                    this.f161055q = z19;
                    this.f161056r = clippableCouponDecorator;
                    this.f161057s = function1;
                    this.f161058t = i11;
                    this.f161059u = function03;
                    this.f161060v = z20;
                    this.f161061w = function04;
                    this.f161062x = function05;
                    this.f161063y = function06;
                    this.f161064z = d10;
                }

                public final void a(InterfaceC14814f AdsColumn, Composer composer, int i10) {
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
                        ComposerKt.U(-1011414906, i11, -1, "com.meijer.mobile.ui.productcard.HorizontalProductCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductCard.kt:187)");
                    }
                    LocalThemeScope localThemeScope = this.f161039a;
                    q1.Row tagRow = this.f161040b.getContainers().getTagRow();
                    Modifier modifier = this.f161040b.getContainers().getTagRow().getModifier();
                    Modifier.Companion companion = Modifier.INSTANCE;
                    float f10 = 4;
                    float f11 = 8;
                    Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, H1.h.p(f10), H1.h.p(16), H1.h.p(f11), 0.0f, 8, null);
                    boolean isStepperExpanded = this.f161041c.getIsStepperExpanded();
                    composer.startReplaceGroup(5004770);
                    float f12 = this.f161044f;
                    Object objB = composer.B();
                    if (objB == Composer.INSTANCE.a()) {
                        objB = new C2514a(f12);
                        composer.t(objB);
                    }
                    composer.P();
                    q1.Row rowY = q1.Row.y(tagRow, modifier.then(C17037o.R(modifierM, isStepperExpanded, (Function1) objB)), null, null, 6, null);
                    ComposableLambda composableLambdaC = ComposableLambdaKt.c(-1065444282, true, new b(this.f161045g, this.f161046h, this.f161047i, this.f161041c, this.f161048j, this.f161039a), composer, 54);
                    int i12 = LocalThemeScope.f15770g;
                    int i13 = q1.Row.f140137d;
                    C16088n.i(localThemeScope, rowY, composableLambdaC, composer, i12 | 384 | (i13 << 3));
                    C16088n.i(this.f161039a, q1.Row.y(this.f161040b.getContainers().getBodyRow(), androidx.compose.foundation.layout.D.l(companion, H1.h.p(f11), H1.h.p(0), H1.h.p(f11), H1.h.p(f11)), null, null, 6, null), ComposableLambdaKt.c(-2019029507, true, new c(this.f161039a, this.f161040b, this.f161049k, this.f161041c, this.f161050l, this.f161051m, this.f161044f, this.f161052n, this.f161053o, this.f161054p, this.f161055q, this.f161056r, this.f161057s, this.f161058t, this.f161059u, this.f161060v, this.f161061w, this.f161062x, this.f161063y, this.f161064z), composer, 54), composer, i12 | 384 | (i13 << 3));
                    if (this.f161042d) {
                        C14802K.a(J.i(companion, this.f161039a.getAdsSpacing().getFive().getDp()), composer, 0);
                        LocalThemeScope localThemeScope2 = this.f161039a;
                        ri.j.h(localThemeScope2, new q1.Label(androidx.compose.foundation.layout.D.k(androidx.compose.foundation.b.c(AdsColumn.c(companion, P0.e.INSTANCE.j()), this.f161039a.getAdsColors().l().l().getColor(), C16692i.c(H1.h.p(f10))), this.f161039a.getAdsSpacing().getTwo().getDp(), 0.0f, 2, null), this.f161039a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getHeadings().getNine(), null, 380, null), C6408b.a(AbstractC5607a.INSTANCE.d(Bj.o.f3046u0, Integer.valueOf(this.f161043e)), composer, AbstractC5607a.f45514b), null, composer, i12 | (q1.Label.f140080j << 3), 4);
                        C14802K.a(J.i(companion, this.f161039a.getAdsSpacing().getFive().getDp()), composer, 0);
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

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: ss.o$g$a$f */
            public static final class f extends Lambda implements Function1<u, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ A f161175f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public f(A a10) {
                    super(1);
                    this.f161175f = a10;
                }

                public final void a(u semantics) {
                    Intrinsics.j(semantics, "$this$semantics");
                    C.a(semantics, this.f161175f);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(u uVar) {
                    a(uVar);
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: ss.o$g$a$g, reason: collision with other inner class name */
            public static final class C2526g extends Lambda implements Function2<Composer, Integer, Unit> {

                /* renamed from: A, reason: collision with root package name */
                final /* synthetic */ Function0 f161176A;

                /* renamed from: B, reason: collision with root package name */
                final /* synthetic */ boolean f161177B;

                /* renamed from: C, reason: collision with root package name */
                final /* synthetic */ ClippableCouponDecorator f161178C;

                /* renamed from: D, reason: collision with root package name */
                final /* synthetic */ Function0 f161179D;

                /* renamed from: E, reason: collision with root package name */
                final /* synthetic */ boolean f161180E;

                /* renamed from: F, reason: collision with root package name */
                final /* synthetic */ Function0 f161181F;

                /* renamed from: G, reason: collision with root package name */
                final /* synthetic */ Function0 f161182G;

                /* renamed from: H, reason: collision with root package name */
                final /* synthetic */ Function0 f161183H;

                /* renamed from: I, reason: collision with root package name */
                final /* synthetic */ double f161184I;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ int f161185f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ L1.n f161186g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ Function0 f161187h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ boolean f161188i;

                /* renamed from: j, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f161189j;

                /* renamed from: k, reason: collision with root package name */
                final /* synthetic */ RegularPrice f161190k;

                /* renamed from: l, reason: collision with root package name */
                final /* synthetic */ boolean f161191l;

                /* renamed from: m, reason: collision with root package name */
                final /* synthetic */ boolean f161192m;

                /* renamed from: n, reason: collision with root package name */
                final /* synthetic */ Function1 f161193n;

                /* renamed from: o, reason: collision with root package name */
                final /* synthetic */ ProductCardDecorator f161194o;

                /* renamed from: p, reason: collision with root package name */
                final /* synthetic */ int f161195p;

                /* renamed from: q, reason: collision with root package name */
                final /* synthetic */ boolean f161196q;

                /* renamed from: r, reason: collision with root package name */
                final /* synthetic */ int f161197r;

                /* renamed from: s, reason: collision with root package name */
                final /* synthetic */ float f161198s;

                /* renamed from: t, reason: collision with root package name */
                final /* synthetic */ boolean f161199t;

                /* renamed from: u, reason: collision with root package name */
                final /* synthetic */ boolean f161200u;

                /* renamed from: v, reason: collision with root package name */
                final /* synthetic */ boolean f161201v;

                /* renamed from: w, reason: collision with root package name */
                final /* synthetic */ boolean f161202w;

                /* renamed from: x, reason: collision with root package name */
                final /* synthetic */ boolean f161203x;

                /* renamed from: y, reason: collision with root package name */
                final /* synthetic */ boolean f161204y;

                /* renamed from: z, reason: collision with root package name */
                final /* synthetic */ Function0 f161205z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2526g(L1.n nVar, int i10, Function0 function0, boolean z10, LocalThemeScope localThemeScope, RegularPrice regularPrice, boolean z11, boolean z12, Function1 function1, ProductCardDecorator productCardDecorator, int i11, boolean z13, int i12, float f10, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, Function0 function02, Function0 function03, boolean z20, ClippableCouponDecorator clippableCouponDecorator, Function0 function04, boolean z21, Function0 function05, Function0 function06, Function0 function07, double d10) {
                    super(2);
                    this.f161186g = nVar;
                    this.f161187h = function0;
                    this.f161188i = z10;
                    this.f161189j = localThemeScope;
                    this.f161190k = regularPrice;
                    this.f161191l = z11;
                    this.f161192m = z12;
                    this.f161193n = function1;
                    this.f161194o = productCardDecorator;
                    this.f161195p = i11;
                    this.f161196q = z13;
                    this.f161197r = i12;
                    this.f161198s = f10;
                    this.f161199t = z14;
                    this.f161200u = z15;
                    this.f161201v = z16;
                    this.f161202w = z17;
                    this.f161203x = z18;
                    this.f161204y = z19;
                    this.f161205z = function02;
                    this.f161176A = function03;
                    this.f161177B = z20;
                    this.f161178C = clippableCouponDecorator;
                    this.f161179D = function04;
                    this.f161180E = z21;
                    this.f161181F = function05;
                    this.f161182G = function06;
                    this.f161183H = function07;
                    this.f161184I = d10;
                    this.f161185f = i10;
                }

                public final void a(Composer composer, int i10) {
                    Modifier modifierM;
                    if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                        composer.K();
                        return;
                    }
                    int helpersHashCode = this.f161186g.getHelpersHashCode();
                    this.f161186g.i();
                    L1.n nVar = this.f161186g;
                    composer.startReplaceGroup(1795971378);
                    n.b bVarM = nVar.m();
                    L1.h hVarA = bVarM.a();
                    L1.h hVarC = bVarM.c();
                    composer.startReplaceGroup(612106639);
                    if (this.f161188i) {
                        Modifier modifierM2 = androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, this.f161189j.getAdsSpacing().getFive().getDp(), 0.0f, 0.0f, 0.0f, 14, null);
                        composer.startReplaceGroup(1849434622);
                        Object objB = composer.B();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objB == companion.a()) {
                            objB = C2513a.f161033a;
                            composer.t(objB);
                        }
                        composer.P();
                        Modifier modifierK = nVar.k(modifierM2, hVarA, (Function1) objB);
                        MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
                        int iA = C5717f.a(composer, 0);
                        InterfaceC5742s interfaceC5742sR = composer.r();
                        Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
                        InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                        Function0<InterfaceC5811g> function0A = companion2.a();
                        if (composer.k() == null) {
                            C5717f.c();
                        }
                        composer.F();
                        if (composer.getInserting()) {
                            composer.I(function0A);
                        } else {
                            composer.s();
                        }
                        Composer composerA = D1.a(composer);
                        D1.c(composerA, measurePolicyA, companion2.e());
                        D1.c(composerA, interfaceC5742sR, companion2.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        D1.c(composerA, modifierE, companion2.f());
                        C14815g c14815g = C14815g.f139108a;
                        LocalThemeScope localThemeScope = this.f161189j;
                        boolean z10 = this.f161191l;
                        boolean z11 = this.f161192m;
                        composer.startReplaceGroup(-1746271574);
                        boolean zV = composer.V(this.f161193n) | composer.D(this.f161194o) | composer.d(this.f161195p);
                        Object objB2 = composer.B();
                        if (zV || objB2 == companion.a()) {
                            objB2 = new b(this.f161193n, this.f161194o, this.f161195p);
                            composer.t(objB2);
                        }
                        composer.P();
                        Jj.b.b(localThemeScope, z10, null, z11, (Function1) objB2, composer, LocalThemeScope.f15770g, 2);
                        composer.v();
                    }
                    composer.P();
                    LocalThemeScope localThemeScope2 = this.f161189j;
                    q1.Column horizontalContainer = this.f161190k.getContainers().getHorizontalContainer();
                    Modifier modifier = this.f161190k.getContainers().getHorizontalContainer().getModifier();
                    if (this.f161188i) {
                        composer.startReplaceGroup(1796660879);
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        composer.startReplaceGroup(5004770);
                        boolean zV2 = composer.V(hVarA);
                        Object objB3 = composer.B();
                        if (zV2 || objB3 == Composer.INSTANCE.a()) {
                            objB3 = new c(hVarA);
                            composer.t(objB3);
                        }
                        composer.P();
                        modifierM = androidx.compose.foundation.layout.D.k(nVar.k(companion3, hVarC, (Function1) objB3), this.f161189j.getAdsSpacing().getFive().getDp(), 0.0f, 2, null);
                        composer.P();
                    } else {
                        composer.startReplaceGroup(1797113882);
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        composer.startReplaceGroup(1849434622);
                        Object objB4 = composer.B();
                        if (objB4 == Composer.INSTANCE.a()) {
                            objB4 = d.f161038a;
                            composer.t(objB4);
                        }
                        composer.P();
                        modifierM = androidx.compose.foundation.layout.D.m(nVar.k(companion4, hVarC, (Function1) objB4), 0.0f, 0.0f, this.f161189j.getAdsSpacing().getTwo().getDp(), 0.0f, 11, null);
                        composer.P();
                    }
                    C16088n.e(localThemeScope2, q1.Column.y(horizontalContainer, modifier.then(modifierM), null, null, 6, null), ComposableLambdaKt.c(-1011414906, true, new e(this.f161189j, this.f161190k, this.f161194o, this.f161196q, this.f161197r, this.f161198s, this.f161199t, this.f161200u, this.f161201v, this.f161202w, this.f161188i, this.f161203x, this.f161192m, this.f161204y, this.f161205z, this.f161176A, this.f161177B, this.f161178C, this.f161193n, this.f161195p, this.f161179D, this.f161180E, this.f161181F, this.f161182G, this.f161183H, this.f161184I), composer, 54), composer, LocalThemeScope.f15770g | 384 | (q1.Column.f139985d << 3));
                    composer.P();
                    if (this.f161186g.getHelpersHashCode() != helpersHashCode) {
                        this.f161187h.invoke();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    a(composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(boolean z10, LocalThemeScope localThemeScope, RegularPrice regularPrice, boolean z11, boolean z12, Function1<? super InterfaceC17023a, Unit> function1, ProductCardDecorator productCardDecorator, int i10, boolean z13, int i11, float f10, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, Function0<Unit> function0, Function0<Unit> function02, boolean z20, ClippableCouponDecorator clippableCouponDecorator, Function0<Unit> function03, boolean z21, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, double d10) {
                this.f161007a = z10;
                this.f161008b = localThemeScope;
                this.f161009c = regularPrice;
                this.f161010d = z11;
                this.f161011e = z12;
                this.f161012f = function1;
                this.f161013g = productCardDecorator;
                this.f161014h = i10;
                this.f161015i = z13;
                this.f161016j = i11;
                this.f161017k = f10;
                this.f161018l = z14;
                this.f161019m = z15;
                this.f161020n = z16;
                this.f161021o = z17;
                this.f161022p = z18;
                this.f161023q = z19;
                this.f161024r = function0;
                this.f161025s = function02;
                this.f161026t = z20;
                this.f161027u = clippableCouponDecorator;
                this.f161028v = function03;
                this.f161029w = z21;
                this.f161030x = function04;
                this.f161031y = function05;
                this.f161032z = function06;
                this.f161006A = d10;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(591555077, i10, -1, "com.meijer.mobile.ui.productcard.HorizontalProductCard.<anonymous>.<anonymous> (ProductCard.kt:137)");
                }
                Modifier modifierD = J.d(Modifier.INSTANCE, 0.0f, 1, null);
                boolean z10 = this.f161007a;
                LocalThemeScope localThemeScope = this.f161008b;
                RegularPrice regularPrice = this.f161009c;
                boolean z11 = this.f161010d;
                boolean z12 = this.f161011e;
                Function1<InterfaceC17023a, Unit> function1 = this.f161012f;
                ProductCardDecorator productCardDecorator = this.f161013g;
                int i11 = this.f161014h;
                boolean z13 = this.f161015i;
                int i12 = this.f161016j;
                float f10 = this.f161017k;
                boolean z14 = this.f161018l;
                boolean z15 = this.f161019m;
                boolean z16 = this.f161020n;
                boolean z17 = this.f161021o;
                boolean z18 = this.f161022p;
                boolean z19 = this.f161023q;
                Function0<Unit> function0 = this.f161024r;
                Function0<Unit> function02 = this.f161025s;
                boolean z20 = this.f161026t;
                ClippableCouponDecorator clippableCouponDecorator = this.f161027u;
                Function0<Unit> function03 = this.f161028v;
                boolean z21 = this.f161029w;
                Function0<Unit> function04 = this.f161030x;
                Function0<Unit> function05 = this.f161031y;
                Function0<Unit> function06 = this.f161032z;
                double d10 = this.f161006A;
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
                Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5730l0) objB3, a10, composer, 4544);
                androidx.compose.ui.layout.A.a(C16705m.d(modifierD, false, new f(a10), 1, null), ComposableLambdaKt.composableLambda(composer, -819894182, true, new C2526g(nVar, 6, pairH.b(), z10, localThemeScope, regularPrice, z11, z12, function1, productCardDecorator, i11, z13, i12, f10, z14, z15, z16, z17, z18, z19, function0, function02, z20, clippableCouponDecorator, function03, z21, function04, function05, function06, d10)), pairH.a(), composer, 48, 0);
                composer.U();
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

        /* JADX WARN: Multi-variable type inference failed */
        g(Function0<Unit> function0, boolean z10, LocalThemeScope localThemeScope, boolean z11, boolean z12, Function1<? super InterfaceC17023a, Unit> function1, ProductCardDecorator productCardDecorator, int i10, boolean z13, int i11, float f10, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, Function0<Unit> function02, boolean z20, ClippableCouponDecorator clippableCouponDecorator, Function0<Unit> function03, boolean z21, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, double d10) {
            this.f160980a = function0;
            this.f160981b = z10;
            this.f160982c = localThemeScope;
            this.f160983d = z11;
            this.f160984e = z12;
            this.f160985f = function1;
            this.f160986g = productCardDecorator;
            this.f160987h = i10;
            this.f160988i = z13;
            this.f160989j = i11;
            this.f160990k = f10;
            this.f160991l = z14;
            this.f160992m = z15;
            this.f160993n = z16;
            this.f160994o = z17;
            this.f160995p = z18;
            this.f160996q = z19;
            this.f160997r = function02;
            this.f160998s = z20;
            this.f160999t = clippableCouponDecorator;
            this.f161000u = function03;
            this.f161001v = z21;
            this.f161002w = function04;
            this.f161003x = function05;
            this.f161004y = function06;
            this.f161005z = d10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            return Unit.f142422a;
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
                ComposerKt.U(2001456555, i11, -1, "com.meijer.mobile.ui.productcard.HorizontalProductCard.<anonymous> (ProductCard.kt:129)");
            }
            float f10 = 0;
            RoundedCornerShape roundedCornerShapeC = C16692i.c(H1.h.p(f10));
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: ss.p
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C17037o.g.c((u) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Modifier modifierF = C18299z.f(androidx.compose.foundation.layout.D.i(C16705m.c(companion, true, (Function1) objB), H1.h.p(f10)), "productCard", null, 2, null);
            Function0<Unit> function0 = this.f160980a;
            C17985y.b(function0, modifierF, false, roundedCornerShapeC, 0L, 0L, null, 0.0f, null, ComposableLambdaKt.c(591555077, true, new a(this.f160981b, this.f160982c, Assemble, this.f160983d, this.f160984e, this.f160985f, this.f160986g, this.f160987h, this.f160988i, this.f160989j, this.f160990k, this.f160991l, this.f160992m, this.f160993n, this.f160994o, this.f160995p, this.f160996q, function0, this.f160997r, this.f160998s, this.f160999t, this.f161000u, this.f161001v, this.f161002w, this.f161003x, this.f161004y, this.f161005z), composer, 54), composer, 805306368, HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RegularPrice regularPrice, Composer composer, Integer num) {
            b(regularPrice, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ss.o$h */
    /* synthetic */ class h extends AdaptedFunctionReference implements Function1<LocalThemeScope, RegularPrice> {

        /* renamed from: h, reason: collision with root package name */
        public static final h f161206h = new h();

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
    /* renamed from: ss.o$i */
    static final class i implements Function3<RegularPrice, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f161207a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f161208b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f161209c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f161210d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f161211e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f161212f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: ss.o$i$a */
        static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC5607a f161213a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f161214b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC5607a f161215c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f161216d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ RegularPrice f161217e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ AbstractC5607a f161218f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ AbstractC5607a f161219g;

            a(AbstractC5607a abstractC5607a, boolean z10, AbstractC5607a abstractC5607a2, LocalThemeScope localThemeScope, RegularPrice regularPrice, AbstractC5607a abstractC5607a3, AbstractC5607a abstractC5607a4) {
                this.f161213a = abstractC5607a;
                this.f161214b = z10;
                this.f161215c = abstractC5607a2;
                this.f161216d = localThemeScope;
                this.f161217e = regularPrice;
                this.f161218f = abstractC5607a3;
                this.f161219g = abstractC5607a4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(String str, u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                r1.s.g0(semantics, str);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(String str, u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                r1.s.g0(semantics, str);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(String str, u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                r1.s.g0(semantics, str);
                return Unit.f142422a;
            }

            public final void d(InterfaceC14800I AdsRow, Composer composer, int i10) {
                q1.Label labelY;
                Intrinsics.j(AdsRow, "$this$AdsRow");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(2109366645, i10, -1, "com.meijer.mobile.ui.productcard.Price.<anonymous>.<anonymous> (ProductCard.kt:622)");
                }
                AbstractC5607a abstractC5607a = this.f161213a;
                int i11 = AbstractC5607a.f45514b;
                final String strA = C6408b.a(abstractC5607a, composer, i11);
                if (this.f161214b) {
                    composer.startReplaceGroup(475366561);
                    final String strA2 = C6408b.a(this.f161215c, composer, i11);
                    LocalThemeScope localThemeScope = this.f161216d;
                    q1.Label finalPrice = this.f161217e.getLabels().getFinalPrice();
                    Modifier.Companion companion = Modifier.INSTANCE;
                    composer.startReplaceGroup(5004770);
                    boolean zV = composer.V(strA);
                    Object objB = composer.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: ss.q
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C17037o.i.a.e(strA, (u) obj);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    q1.Label labelY2 = q1.Label.y(finalPrice, C16705m.d(companion, false, (Function1) objB, 1, null), null, null, null, 0, false, 0, this.f161217e.getThemeScope().getAdsTypography().getValues().getThree().d(this.f161217e.getThemeScope().getAdsColors().getAdsColorSavings()), null, 382, null);
                    String strA3 = C6408b.a(this.f161218f, composer, i11);
                    int i12 = LocalThemeScope.f15770g;
                    int i13 = q1.Label.f140080j;
                    ri.j.h(localThemeScope, labelY2, strA3, null, composer, (i13 << 3) | i12, 4);
                    LocalThemeScope localThemeScope2 = this.f161216d;
                    q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, this.f161217e.getThemeScope().getAdsTypography().getValues().getFive(), null, 383, null);
                    Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, this.f161216d.getAdsSpacing().getTwo().getDp(), 0.0f, 0.0f, 0.0f, 14, null);
                    composer.startReplaceGroup(5004770);
                    boolean zV2 = composer.V(strA2);
                    Object objB2 = composer.B();
                    if (zV2 || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function1() { // from class: ss.r
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C17037o.i.a.f(strA2, (u) obj);
                            }
                        };
                        composer.t(objB2);
                    }
                    composer.P();
                    ri.j.h(localThemeScope2, q1.Label.y(label, C16705m.d(modifierM, false, (Function1) objB2, 1, null), null, null, null, 0, false, 0, null, null, 510, null), C6408b.a(this.f161219g, composer, i11), null, composer, i12 | (i13 << 3), 4);
                    composer.P();
                } else {
                    composer.startReplaceGroup(476514460);
                    LocalThemeScope localThemeScope3 = this.f161216d;
                    composer.startReplaceGroup(-123174159);
                    if (Intrinsics.e(C6408b.a(this.f161218f, composer, i11), C16193g.c(C17042t.f161236h, composer, 0))) {
                        labelY = q1.Label.y(this.f161217e.getLabels().getFinalPrice(), null, null, null, null, 0, false, 0, this.f161217e.getThemeScope().getAdsTypography().getValues().getThree().d(this.f161217e.getThemeScope().getAdsColors().getAdsColorSavings()), null, 383, null);
                    } else {
                        q1.Label finalPrice2 = this.f161217e.getLabels().getFinalPrice();
                        Modifier modifier = this.f161217e.getLabels().getFinalPrice().getModifier();
                        composer.startReplaceGroup(5004770);
                        boolean zV3 = composer.V(strA);
                        Object objB3 = composer.B();
                        if (zV3 || objB3 == Composer.INSTANCE.a()) {
                            objB3 = new Function1() { // from class: ss.s
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return C17037o.i.a.g(strA, (u) obj);
                                }
                            };
                            composer.t(objB3);
                        }
                        composer.P();
                        labelY = q1.Label.y(finalPrice2, C16705m.d(modifier, false, (Function1) objB3, 1, null), null, null, null, 0, false, 0, null, null, 510, null);
                    }
                    composer.P();
                    q1.Label label2 = labelY;
                    ri.j.h(localThemeScope3, label2, C6408b.a(this.f161218f, composer, i11), null, composer, (q1.Label.f140080j << 3) | LocalThemeScope.f15770g, 4);
                    composer.P();
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                d(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        i(LocalThemeScope localThemeScope, AbstractC5607a abstractC5607a, boolean z10, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3, AbstractC5607a abstractC5607a4) {
            this.f161207a = localThemeScope;
            this.f161208b = abstractC5607a;
            this.f161209c = z10;
            this.f161210d = abstractC5607a2;
            this.f161211e = abstractC5607a3;
            this.f161212f = abstractC5607a4;
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
                ComposerKt.U(876682549, i10, -1, "com.meijer.mobile.ui.productcard.Price.<anonymous> (ProductCard.kt:613)");
            }
            C16088n.i(this.f161207a, q1.Row.y(Assemble.getContainers().getPriceRow(), Assemble.getContainers().getPriceRow().getModifier().then(androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, 0.0f, this.f161207a.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 13, null)), null, null, 6, null), ComposableLambdaKt.c(2109366645, true, new a(this.f161208b, this.f161209c, this.f161210d, this.f161207a, Assemble, this.f161211e, this.f161212f), composer, 54), composer, LocalThemeScope.f15770g | 384 | (q1.Row.f140137d << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RegularPrice regularPrice, Composer composer, Integer num) {
            a(regularPrice, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ss.o$j */
    /* synthetic */ class j extends AdaptedFunctionReference implements Function1<LocalThemeScope, RegularPrice> {

        /* renamed from: h, reason: collision with root package name */
        public static final j f161220h = new j();

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
    /* renamed from: ss.o$k */
    static final class k implements Function3<RegularPrice, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f161221a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f161222b;

        k(LocalThemeScope localThemeScope, String str) {
            this.f161221a = localThemeScope;
            this.f161222b = str;
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
                ComposerKt.U(-981139838, i11, -1, "com.meijer.mobile.ui.productcard.ProductName.<anonymous>.<anonymous> (ProductCard.kt:575)");
            }
            ri.j.h(this.f161221a, q1.Label.y(Assemble.getLabels().getProductHeading(), C18299z.f(Modifier.INSTANCE, "productName", null, 2, null), null, null, null, F1.t.INSTANCE.b(), false, 3, this.f161221a.getAdsTypography().getBodyCompact().getTwo(), null, HttpResponseStatus.REDIRECTION_FOUND, null), this.f161222b, null, composer, (q1.Label.f140080j << 3) | LocalThemeScope.f15770g, 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RegularPrice regularPrice, Composer composer, Integer num) {
            a(regularPrice, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ss.o$l */
    /* synthetic */ class l extends AdaptedFunctionReference implements Function1<LocalThemeScope, RegularPrice> {

        /* renamed from: h, reason: collision with root package name */
        public static final l f161223h = new l();

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
    /* renamed from: ss.o$m */
    static final class m implements Function3<RegularPrice, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f161224a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f161225b;

        m(LocalThemeScope localThemeScope, AbstractC5607a abstractC5607a) {
            this.f161224a = localThemeScope;
            this.f161225b = abstractC5607a;
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
                ComposerKt.U(1283033400, i11, -1, "com.meijer.mobile.ui.productcard.WeightSizePrice.<anonymous> (ProductCard.kt:554)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            C14802K.a(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, 0.0f, this.f161224a.getAdsSpacing().getTwo().getDp(), 7, null), composer, 0);
            LocalThemeScope localThemeScope = this.f161224a;
            q1.Label pricePerUnit = Assemble.getLabels().getPricePerUnit();
            String strA = C6408b.a(this.f161225b, composer, AbstractC5607a.f45514b);
            int i12 = LocalThemeScope.f15770g;
            int i13 = q1.Label.f140080j;
            ri.j.h(localThemeScope, pricePerUnit, strA, null, composer, i12 | (i13 << 3), 4);
            ri.j.h(this.f161224a, new q1.Label(null, null, null, null, 0, false, 0, this.f161224a.getAdsTypography().getDetail().getOne(), null, 383, null), C16193g.c(yr.Q.f171014w, composer, 0), null, composer, i12 | (i13 << 3), 4);
            C14802K.a(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, 0.0f, this.f161224a.getAdsSpacing().getTwo().getDp(), 7, null), composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RegularPrice regularPrice, Composer composer, Integer num) {
            a(regularPrice, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:349:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void v(Ji.LocalThemeScope r36, final ts.ProductCardDecorator r37, final int r38, kotlin.jvm.functions.Function1<? super ss.InterfaceC17023a, kotlin.Unit> r39, final boolean r40, final Hr.ClippableCouponDecorator r41, final kotlin.jvm.functions.Function0<kotlin.Unit> r42, final kotlin.jvm.functions.Function0<kotlin.Unit> r43, final kotlin.jvm.functions.Function0<kotlin.Unit> r44, final double r45, final boolean r47, final kotlin.jvm.functions.Function0<kotlin.Unit> r48, final kotlin.jvm.functions.Function0<kotlin.Unit> r49, Pp.b r50, boolean r51, boolean r52, boolean r53, final boolean r54, boolean r55, int r56, final boolean r57, final boolean r58, boolean r59, kotlin.jvm.functions.Function1<? super Ho.SponsoredData, kotlin.Unit> r60, androidx.compose.runtime.Composer r61, final int r62, final int r63, final int r64, final int r65) {
        /*
            Method dump skipped, instructions count: 1315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ss.C17037o.v(Ji.M, ts.a, int, kotlin.jvm.functions.Function1, boolean, Hr.a, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, double, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, Pp.b, boolean, boolean, boolean, boolean, boolean, int, boolean, boolean, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(final LocalThemeScope localThemeScope, final boolean z10, final AbstractC5607a abstractC5607a, final AbstractC5607a abstractC5607a2, final AbstractC5607a abstractC5607a3, final AbstractC5607a abstractC5607a4, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-976552262);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.a(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= (i10 & 512) == 0 ? composerStartRestartGroup.V(abstractC5607a) : composerStartRestartGroup.D(abstractC5607a) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) == 0 ? composerStartRestartGroup.V(abstractC5607a2) : composerStartRestartGroup.D(abstractC5607a2) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= (32768 & i10) == 0 ? composerStartRestartGroup.V(abstractC5607a3) : composerStartRestartGroup.D(abstractC5607a3) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= (262144 & i10) == 0 ? composerStartRestartGroup.V(abstractC5607a4) : composerStartRestartGroup.D(abstractC5607a4) ? 131072 : 65536;
        }
        int i12 = i11;
        if ((74899 & i12) == 74898 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-976552262, i12, -1, "com.meijer.mobile.ui.productcard.Price (ProductCard.kt:611)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = h.f161206h;
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            Q.f(localThemeScope, (Function1) objB, ComposableLambdaKt.c(876682549, true, new i(localThemeScope, abstractC5607a3, z10, abstractC5607a4, abstractC5607a, abstractC5607a2), composerStartRestartGroup, 54), composerStartRestartGroup, LocalThemeScope.f15770g | 432 | (i12 & 14));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: ss.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C17037o.B(localThemeScope, z10, abstractC5607a, abstractC5607a2, abstractC5607a3, abstractC5607a4, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(LocalThemeScope localThemeScope, boolean z10, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3, AbstractC5607a abstractC5607a4, int i10, Composer composer, int i11) {
        A(localThemeScope, z10, abstractC5607a, abstractC5607a2, abstractC5607a3, abstractC5607a4, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(LocalThemeScope localThemeScope, String str, Modifier modifier, int i10, Composer composer, int i11) {
        C(localThemeScope, str, modifier, composer, J0.a(i10 | 1));
        return Unit.f142422a;
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
    public static final void E(final Ji.LocalThemeScope r30, androidx.compose.ui.Modifier r31, final Gp.ProductRatings r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ss.C17037o.E(Ji.M, androidx.compose.ui.Modifier, Gp.c, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(String str, u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.g0(semantics, str);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(LocalThemeScope localThemeScope, Modifier modifier, ProductRatings productRatings, int i10, int i11, Composer composer, int i12) {
        E(localThemeScope, modifier, productRatings, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(LocalThemeScope localThemeScope, AbstractC5607a abstractC5607a, int i10, Composer composer, int i11) {
        H(localThemeScope, abstractC5607a, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    public static final Modifier R(Modifier modifier, boolean z10, Function1<? super Modifier, ? extends Modifier> then) {
        Intrinsics.j(modifier, "<this>");
        Intrinsics.j(then, "then");
        return z10 ? then.invoke(modifier) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean S(Boolean bool, Boolean bool2, boolean z10, boolean z11, boolean z12) {
        if (z11) {
            Boolean bool3 = Boolean.TRUE;
            if (Intrinsics.e(bool2, bool3) && Intrinsics.e(bool, bool3)) {
                return true;
            }
        }
        return z12 && z10 && Intrinsics.e(bool2, Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(LocalThemeScope localThemeScope, AbstractC5607a abstractC5607a, int i10, Composer composer, int i11) {
        n(localThemeScope, abstractC5607a, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(LocalThemeScope localThemeScope, AbstractC5607a abstractC5607a, int i10, Composer composer, int i11) {
        p(localThemeScope, abstractC5607a, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(LocalThemeScope localThemeScope, final boolean z10, Composer composer, final int i10) {
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
                ComposerKt.U(308506214, i11, -1, "com.meijer.mobile.ui.productcard.ExpressPickUpText (ProductCard.kt:513)");
            }
            if (z10) {
                Modifier.Companion companion = Modifier.INSTANCE;
                float f10 = 4;
                C14802K.a(J.i(companion, H1.h.p(f10)), composerStartRestartGroup, 6);
                MeasurePolicy measurePolicyB = G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composerStartRestartGroup, 0);
                int iA = C5717f.a(composerStartRestartGroup, 0);
                InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
                Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, companion);
                InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion2.a();
                if (composerStartRestartGroup.k() == null) {
                    C5717f.c();
                }
                composerStartRestartGroup.F();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.I(function0A);
                } else {
                    composerStartRestartGroup.s();
                }
                Composer composerA = D1.a(composerStartRestartGroup);
                D1.c(composerA, measurePolicyB, companion2.e());
                D1.c(composerA, interfaceC5742sR, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14801J c14801j = C14801J.f139030a;
                q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, localThemeScope2.getAdsTypography().getHeadings().getNine(), null, 383, null);
                String strC = C16193g.c(C17042t.f161232d, composerStartRestartGroup, 0);
                int i12 = LocalThemeScope.f15770g;
                int i13 = i11 & 14;
                int i14 = q1.Label.f140080j;
                ri.j.h(localThemeScope2, label, strC, null, composerStartRestartGroup, i12 | i13 | (i14 << 3), 4);
                ri.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getNine(), null, 383, null), C16193g.c(C17042t.f161230b, composerStartRestartGroup, 0), null, composerStartRestartGroup, i12 | i13 | (i14 << 3), 4);
                C14802K.a(J.z(companion, H1.h.p(f10)), composerStartRestartGroup, 6);
                localThemeScope2 = localThemeScope;
                ri.j.h(localThemeScope2, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getDetail().getOne(), null, 383, null), C16193g.c(C17042t.f161229a, composerStartRestartGroup, 0), null, composerStartRestartGroup, i12 | i13 | (i14 << 3), 4);
                composerStartRestartGroup.v();
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
                    return C17037o.s(localThemeScope2, z10, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(LocalThemeScope localThemeScope, boolean z10, int i10, Composer composer, int i11) {
        r(localThemeScope, z10, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(LocalThemeScope localThemeScope, boolean z10, Function0 function0, int i10, Composer composer, int i11) {
        t(localThemeScope, z10, function0, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(SponsoredData it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(LocalThemeScope localThemeScope, ProductCardDecorator productCardDecorator, int i10, Function1 function1, boolean z10, ClippableCouponDecorator clippableCouponDecorator, Function0 function0, Function0 function02, Function0 function03, double d10, boolean z11, Function0 function04, Function0 function05, Pp.b bVar, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i11, boolean z17, boolean z18, boolean z19, Function1 function12, int i12, int i13, int i14, int i15, Composer composer, int i16) {
        v(localThemeScope, productCardDecorator, i10, function1, z10, clippableCouponDecorator, function0, function02, function03, d10, z11, function04, function05, bVar, z12, z13, z14, z15, z16, i11, z17, z18, z19, function12, composer, J0.a(i12 | 1), J0.a(i13), J0.a(i14), i15);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(final LocalThemeScope localThemeScope, final String str, final Modifier modifier, Composer composer, final int i10) {
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
                ComposerKt.U(-473145263, i11, -1, "com.meijer.mobile.ui.productcard.ProductName (ProductCard.kt:572)");
            }
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composerStartRestartGroup, 0);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifier);
            InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyA, companion.e());
            D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14815g c14815g = C14815g.f139108a;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = j.f161220h;
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            Q.f(localThemeScope, (Function1) objB, ComposableLambdaKt.c(-981139838, true, new k(localThemeScope, str), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f15770g | 432);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: ss.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C17037o.D(localThemeScope, str, modifier, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(final LocalThemeScope localThemeScope, final AbstractC5607a abstractC5607a, Composer composer, final int i10) {
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
                zD = composerStartRestartGroup.V(abstractC5607a);
            } else {
                zD = composerStartRestartGroup.D(abstractC5607a);
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
                ComposerKt.U(-652000414, i11, -1, "com.meijer.mobile.ui.productcard.WeightSizePrice (ProductCard.kt:551)");
            }
            if (C6408b.a(abstractC5607a, composerStartRestartGroup, AbstractC5607a.f45514b | ((i11 >> 3) & 14)).length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objB = composerStartRestartGroup.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = l.f161223h;
                    composerStartRestartGroup.t(objB);
                }
                composerStartRestartGroup.P();
                Q.f(localThemeScope, (Function1) objB, ComposableLambdaKt.c(1283033400, true, new m(localThemeScope, abstractC5607a), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f15770g | 432);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: ss.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C17037o.I(localThemeScope, abstractC5607a, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(final LocalThemeScope localThemeScope, final AbstractC5607a abstractC5607a, Composer composer, final int i10) {
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
                zD = composerStartRestartGroup.V(abstractC5607a);
            } else {
                zD = composerStartRestartGroup.D(abstractC5607a);
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
                ComposerKt.U(2021235969, i11, -1, "com.meijer.mobile.ui.productcard.AmountSaved (ProductCard.kt:591)");
            }
            if (C6408b.a(abstractC5607a, composerStartRestartGroup, AbstractC5607a.f45514b | ((i11 >> 3) & 14)).length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objB = composerStartRestartGroup.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = a.f160969h;
                    composerStartRestartGroup.t(objB);
                }
                composerStartRestartGroup.P();
                Q.f(localThemeScope, (Function1) objB, ComposableLambdaKt.c(811089367, true, new b(localThemeScope, abstractC5607a), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f15770g | 432);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: ss.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C17037o.o(localThemeScope, abstractC5607a, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(final LocalThemeScope localThemeScope, final AbstractC5607a abstractC5607a, Composer composer, final int i10) {
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
                zD = composerStartRestartGroup.V(abstractC5607a);
            } else {
                zD = composerStartRestartGroup.D(abstractC5607a);
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
                ComposerKt.U(684570557, i11, -1, "com.meijer.mobile.ui.productcard.ComplexPromo (ProductCard.kt:537)");
            }
            if (C6408b.a(abstractC5607a, composerStartRestartGroup, AbstractC5607a.f45514b | ((i11 >> 3) & 14)).length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objB = composerStartRestartGroup.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = c.f160972h;
                    composerStartRestartGroup.t(objB);
                }
                composerStartRestartGroup.P();
                Q.f(localThemeScope, (Function1) objB, ComposableLambdaKt.c(1824731559, true, new d(localThemeScope, abstractC5607a), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f15770g | 432);
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
                    return C17037o.q(localThemeScope, abstractC5607a, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(final LocalThemeScope localThemeScope, final boolean z10, final Function0<Unit> function0, Composer composer, final int i10) {
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
                ComposerKt.U(869524093, i11, -1, "com.meijer.mobile.ui.productcard.FindSimilarButton (ProductCard.kt:492)");
            }
            if (z10) {
                Q.e(localThemeScope, C14900C.f139605a, ComposableLambdaKt.c(-986855364, true, new e(localThemeScope, function0), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f15770g | 384 | (C14900C.f139606b << 3));
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: ss.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C17037o.u(localThemeScope, z10, function0, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(ProductCardDecorator productCardDecorator, Function1 function1, Function1 function12, int i10) {
        if (productCardDecorator.getProduct().getIsSponsoredCriteo()) {
            function1.invoke(productCardDecorator.getProduct().getBeaconInfo());
        }
        if (function12 != null) {
            function12.invoke(new InterfaceC17023a.ProductItemClicked(productCardDecorator, i10));
        }
        return Unit.f142422a;
    }
}
