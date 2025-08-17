package us;

import Co.ProductFullDetails;
import Ho.SponsoredData;
import Ji.C;
import Ji.LocalThemeScope;
import ak.AbstractC5607a;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.T;
import androidx.compose.ui.node.InterfaceC5811g;
import com.medallia.digital.mobilesdk.l3;
import j0.C14801J;
import java.util.List;
import jk.EnumC14984a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import us.C17303A;
import vl.ProductEligibility;
import vs.InterfaceC17607c;
import vs.ProductListDecorator;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001a¯\u0002\u0010%\u001a\u00020\u0014*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\u001a\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00140\u00112\u001e\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00140\u00162\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u001a28\b\u0002\u0010 \u001a2\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00140\u00112\u0014\b\u0002\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00140!2\u0014\b\u0002\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00140!H\u0007¢\u0006\u0004\b%\u0010&\u001a3\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040+2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b,\u0010-\"\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100\"\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104\"\u0014\u00107\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00104\"\u0014\u00109\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00104¨\u0006<²\u0006\f\u0010:\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\u0014\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "", "Lvs/c;", "productsDecoratorList", "", "isUserLoggedIn", "isSponsoredProductBuyAgain", "isSponsoredProductFavOnSaleEnabled", "Landroidx/compose/ui/Modifier;", "modifier", "shouldShowProductTags", "showProductCount", "Ljk/a;", "carouselType", "isViewAllButtonVisible", "isCarouselVisible", "isCarouselVisibleFavoritesOnSale", "Lkotlin/Function2;", "LCo/h;", "", "", "onProductClicked", "Lkotlin/Function3;", "", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "onEntryUpdate", "Lkotlin/Function0;", "onViewAllProductsClicked", "LOk/c;", "Lkotlin/ParameterName;", "name", "coupon", "productCouponButtonClicked", "Lkotlin/Function1;", "LHo/c;", "onViewBeaconAction", "onLoadBeaconAction", "e", "(LJi/M;Ljava/util/List;ZZZLandroidx/compose/ui/Modifier;ZZLjk/a;ZZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "", "viewportWidthPx", "Lkotlin/Pair;", "n", "(Landroidx/compose/ui/layout/LayoutCoordinates;FLjk/a;)Lkotlin/Pair;", "Lmk/b;", "a", "Lmk/b;", "price", "Lvs/f;", "b", "Lvs/f;", "product1", "c", "product2", "d", "product3", "productListContainsTag", "urls", "products_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: us.A, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C17303A {

    /* renamed from: a, reason: collision with root package name */
    private static final mk.b f163260a;

    /* renamed from: b, reason: collision with root package name */
    private static final ProductListDecorator f163261b;

    /* renamed from: c, reason: collision with root package name */
    private static final ProductListDecorator f163262c;

    /* renamed from: d, reason: collision with root package name */
    private static final ProductListDecorator f163263d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: us.A$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f163264a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<InterfaceC17607c> f163265b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f163266c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f163267d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f163268e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f163269f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f163270g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f163271h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ EnumC14984a f163272i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f163273j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function1<SponsoredData, Unit> f163274k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function1<SponsoredData, Unit> f163275l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f163276m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f163277n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f163278o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f163279p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Function2<ProductFullDetails, String, Unit> f163280q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function3<Integer, ProductFullDetails, com.meijer.mobile.core.design.widget.stepperview.a, Unit> f163281r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ Function2<Ok.c, EnumC14984a, Unit> f163282s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f163283t;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: us.A$a$a, reason: collision with other inner class name */
        static final class C2584a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<InterfaceC17607c> f163284a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f163285b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f163286c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f163287d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f163288e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f163289f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ float f163290g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ EnumC14984a f163291h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ boolean f163292i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ Function1<SponsoredData, Unit> f163293j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ Function1<SponsoredData, Unit> f163294k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ boolean f163295l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ boolean f163296m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ boolean f163297n;

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ boolean f163298o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ Function2<ProductFullDetails, String, Unit> f163299p;

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ Function3<Integer, ProductFullDetails, com.meijer.mobile.core.design.widget.stepperview.a, Unit> f163300q;

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ Function2<Ok.c, EnumC14984a, Unit> f163301r;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f163302s;

            /* JADX WARN: Multi-variable type inference failed */
            C2584a(List<? extends InterfaceC17607c> list, boolean z10, LocalThemeScope localThemeScope, boolean z11, Function0<Unit> function0, boolean z12, float f10, EnumC14984a enumC14984a, boolean z13, Function1<? super SponsoredData, Unit> function1, Function1<? super SponsoredData, Unit> function12, boolean z14, boolean z15, boolean z16, boolean z17, Function2<? super ProductFullDetails, ? super String, Unit> function2, Function3<? super Integer, ? super ProductFullDetails, ? super com.meijer.mobile.core.design.widget.stepperview.a, Unit> function3, Function2<? super Ok.c, ? super EnumC14984a, Unit> function22, InterfaceC5730l0<Boolean> interfaceC5730l0) {
                this.f163284a = list;
                this.f163285b = z10;
                this.f163286c = localThemeScope;
                this.f163287d = z11;
                this.f163288e = function0;
                this.f163289f = z12;
                this.f163290g = f10;
                this.f163291h = enumC14984a;
                this.f163292i = z13;
                this.f163293j = function1;
                this.f163294k = function12;
                this.f163295l = z14;
                this.f163296m = z15;
                this.f163297n = z16;
                this.f163298o = z17;
                this.f163299p = function2;
                this.f163300q = function3;
                this.f163301r = function22;
                this.f163302s = interfaceC5730l0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(boolean z10, float f10, EnumC14984a enumC14984a, InterfaceC17607c interfaceC17607c, boolean z11, Function1 function1, Function1 function12, boolean z12, boolean z13, LayoutCoordinates coordinates) {
                Intrinsics.j(coordinates, "coordinates");
                if (z10) {
                    boolean zBooleanValue = ((Boolean) C17303A.n(coordinates, f10, enumC14984a == null ? EnumC14984a.f140312a : enumC14984a).a()).booleanValue();
                    if (interfaceC17607c.getProduct().getIsSponsoredCriteo() && z11) {
                        if (zBooleanValue) {
                            function1.invoke(interfaceC17607c.getProduct().getBeaconInfo());
                        } else {
                            function12.invoke(interfaceC17607c.getProduct().getBeaconInfo());
                        }
                    }
                }
                if (z12) {
                    if (enumC14984a == null) {
                        enumC14984a = EnumC14984a.f140313b;
                    }
                    boolean zBooleanValue2 = ((Boolean) C17303A.n(coordinates, f10, enumC14984a).a()).booleanValue();
                    if (interfaceC17607c.getProduct().getIsSponsoredCriteo() && z13) {
                        if (zBooleanValue2) {
                            function1.invoke(interfaceC17607c.getProduct().getBeaconInfo());
                        } else {
                            function12.invoke(interfaceC17607c.getProduct().getBeaconInfo());
                        }
                    }
                }
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(Function3 function3, int i10, ProductFullDetails productDetails, com.meijer.mobile.core.design.widget.stepperview.a controlState) {
                Intrinsics.j(productDetails, "productDetails");
                Intrinsics.j(controlState, "controlState");
                function3.invoke(Integer.valueOf(i10), productDetails, controlState);
                return Unit.f142422a;
            }

            public final void d(Composer composer, int i10) {
                Object obj;
                final InterfaceC17607c interfaceC17607c;
                final boolean z10;
                final Function1<SponsoredData, Unit> function1;
                final Function1<SponsoredData, Unit> function12;
                final boolean z11;
                boolean z12;
                boolean z13;
                float f10;
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(444705678, i10, -1, "com.meijer.mobile.ui.products.ProductCarouselRecyclerView.<anonymous>.<anonymous>.<anonymous> (ProductCarouselRecyclerView.kt:95)");
                }
                composer.startReplaceGroup(-2134567897);
                List<InterfaceC17607c> list = this.f163284a;
                LocalThemeScope localThemeScope = this.f163286c;
                final boolean z14 = this.f163289f;
                float f11 = this.f163290g;
                EnumC14984a enumC14984a = this.f163291h;
                boolean z15 = this.f163292i;
                Function1<SponsoredData, Unit> function13 = this.f163293j;
                Function1<SponsoredData, Unit> function14 = this.f163294k;
                boolean z16 = this.f163295l;
                boolean z17 = this.f163296m;
                boolean z18 = this.f163297n;
                boolean z19 = this.f163298o;
                Function2<ProductFullDetails, String, Unit> function2 = this.f163299p;
                final Function3<Integer, ProductFullDetails, com.meijer.mobile.core.design.widget.stepperview.a, Unit> function3 = this.f163300q;
                Function2<Ok.c, EnumC14984a, Unit> function22 = this.f163301r;
                InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f163302s;
                final int i11 = 0;
                for (Object obj2 : list) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        CollectionsKt.w();
                    }
                    InterfaceC5730l0<Boolean> interfaceC5730l02 = interfaceC5730l0;
                    InterfaceC17607c interfaceC17607c2 = (InterfaceC17607c) obj2;
                    Function2<ProductFullDetails, String, Unit> function23 = function2;
                    Function2<Ok.c, EnumC14984a, Unit> function24 = function22;
                    final EnumC14984a enumC14984a2 = enumC14984a;
                    boolean z20 = z19;
                    Modifier modifierK = D.k(Modifier.INSTANCE, localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 2, null);
                    composer.startReplaceGroup(-1224400529);
                    boolean zA = composer.a(z14) | composer.b(f11) | composer.d(enumC14984a2 == null ? -1 : enumC14984a2.ordinal()) | composer.D(interfaceC17607c2) | composer.a(z15) | composer.V(function13) | composer.V(function14) | composer.a(z16) | composer.a(z17);
                    Object objB = composer.B();
                    if (zA || objB == Composer.INSTANCE.a()) {
                        interfaceC17607c = interfaceC17607c2;
                        z10 = z15;
                        function1 = function13;
                        function12 = function14;
                        final boolean z21 = z16;
                        z11 = z17;
                        z12 = z20;
                        final float f12 = f11;
                        obj = new Function1() { // from class: us.x
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                return C17303A.a.C2584a.e(z14, f12, enumC14984a2, interfaceC17607c, z10, function1, function12, z21, z11, (LayoutCoordinates) obj3);
                            }
                        };
                        enumC14984a = enumC14984a2;
                        z13 = z21;
                        f10 = f12;
                        composer.t(obj);
                    } else {
                        interfaceC17607c = interfaceC17607c2;
                        z10 = z15;
                        function1 = function13;
                        function12 = function14;
                        z11 = z17;
                        obj = objB;
                        z12 = z20;
                        enumC14984a = enumC14984a2;
                        f10 = f11;
                        z13 = z16;
                    }
                    composer.P();
                    Modifier modifierA = T.a(modifierK, (Function1) obj);
                    boolean z22 = z18 && interfaceC17607c.o();
                    boolean zK = C17303A.k(interfaceC5730l02);
                    composer.startReplaceGroup(-1633490746);
                    boolean zV = composer.V(function3) | composer.d(i11);
                    Object objB2 = composer.B();
                    if (zV || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function2() { // from class: us.y
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                return C17303A.a.C2584a.f(function3, i11, (ProductFullDetails) obj3, (com.meijer.mobile.core.design.widget.stepperview.a) obj4);
                            }
                        };
                        composer.t(objB2);
                    }
                    composer.P();
                    boolean z23 = z14;
                    function22 = function24;
                    r.l(localThemeScope, interfaceC17607c, z22, z23, z13, modifierA, zK, z12, function23, (Function2) objB2, function22, enumC14984a, composer, LocalThemeScope.f15770g, 0, 0);
                    function3 = function3;
                    z14 = z23;
                    z19 = z12;
                    function2 = function23;
                    z15 = z10;
                    function13 = function1;
                    function14 = function12;
                    z17 = z11;
                    i11 = i12;
                    interfaceC5730l0 = interfaceC5730l02;
                    z16 = z13;
                    f11 = f10;
                }
                composer.P();
                if (this.f163284a.size() > 5 && this.f163285b) {
                    LocalThemeScope localThemeScope2 = this.f163286c;
                    C.b.AbstractC0248b.a aVar = C.b.AbstractC0248b.a.f15384e;
                    AbstractC5607a abstractC5607aD = AbstractC5607a.INSTANCE.d(this.f163287d ? C17305C.f163320Q : C17305C.f163319P, Integer.valueOf(this.f163284a.size()));
                    Ji.T adsColorBrandPrimary = this.f163286c.getAdsColors().getAdsColorBrandPrimary();
                    composer.startReplaceGroup(5004770);
                    boolean zV2 = composer.V(this.f163288e);
                    final Function0<Unit> function0 = this.f163288e;
                    Object objB3 = composer.B();
                    if (zV2 || objB3 == Composer.INSTANCE.a()) {
                        objB3 = new Function0() { // from class: us.z
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return C17303A.a.C2584a.g(function0);
                            }
                        };
                        composer.t(objB3);
                    }
                    composer.P();
                    Fj.b.b(localThemeScope2, aVar, abstractC5607aD, adsColorBrandPrimary, null, (Function0) objB3, composer, LocalThemeScope.f15770g | (C.b.AbstractC0248b.a.f15385f << 3) | (AbstractC5607a.f45514b << 6) | (Ji.T.f15798b << 9), 8);
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                d(composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(Function0 function0) {
                function0.invoke();
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(Modifier modifier, List<? extends InterfaceC17607c> list, boolean z10, LocalThemeScope localThemeScope, boolean z11, Function0<Unit> function0, boolean z12, float f10, EnumC14984a enumC14984a, boolean z13, Function1<? super SponsoredData, Unit> function1, Function1<? super SponsoredData, Unit> function12, boolean z14, boolean z15, boolean z16, boolean z17, Function2<? super ProductFullDetails, ? super String, Unit> function2, Function3<? super Integer, ? super ProductFullDetails, ? super com.meijer.mobile.core.design.widget.stepperview.a, Unit> function3, Function2<? super Ok.c, ? super EnumC14984a, Unit> function22, InterfaceC5730l0<Boolean> interfaceC5730l0) {
            this.f163264a = modifier;
            this.f163265b = list;
            this.f163266c = z10;
            this.f163267d = localThemeScope;
            this.f163268e = z11;
            this.f163269f = function0;
            this.f163270g = z12;
            this.f163271h = f10;
            this.f163272i = enumC14984a;
            this.f163273j = z13;
            this.f163274k = function1;
            this.f163275l = function12;
            this.f163276m = z14;
            this.f163277n = z15;
            this.f163278o = z16;
            this.f163279p = z17;
            this.f163280q = function2;
            this.f163281r = function3;
            this.f163282s = function22;
            this.f163283t = interfaceC5730l0;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1196495475, i10, -1, "com.meijer.mobile.ui.products.ProductCarouselRecyclerView.<anonymous> (ProductCarouselRecyclerView.kt:93)");
            }
            Modifier modifierB = d0.T.b(this.f163264a, d0.T.c(0, composer, 0, 1), false, null, false, 14, null);
            List<InterfaceC17607c> list = this.f163265b;
            boolean z10 = this.f163266c;
            LocalThemeScope localThemeScope = this.f163267d;
            boolean z11 = this.f163268e;
            Function0<Unit> function0 = this.f163269f;
            boolean z12 = this.f163270g;
            float f10 = this.f163271h;
            EnumC14984a enumC14984a = this.f163272i;
            boolean z13 = this.f163273j;
            Function1<SponsoredData, Unit> function1 = this.f163274k;
            Function1<SponsoredData, Unit> function12 = this.f163275l;
            boolean z14 = this.f163276m;
            boolean z15 = this.f163277n;
            boolean z16 = this.f163278o;
            boolean z17 = this.f163279p;
            Function2<ProductFullDetails, String, Unit> function2 = this.f163280q;
            Function3<Integer, ProductFullDetails, com.meijer.mobile.core.design.widget.stepperview.a, Unit> function3 = this.f163281r;
            Function2<Ok.c, EnumC14984a, Unit> function22 = this.f163282s;
            InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f163283t;
            MeasurePolicy measurePolicyB = G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierB);
            InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion.a();
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
            D1.c(composerA, measurePolicyB, companion.e());
            D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14801J c14801j = C14801J.f139030a;
            Br.f.b(null, ComposableLambdaKt.c(444705678, true, new C2584a(list, z10, localThemeScope, z11, function0, z12, f10, enumC14984a, z13, function1, function12, z14, z15, z16, z17, function2, function3, function22, interfaceC5730l0), composer, 54), composer, 48, 1);
            composer.v();
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

    /* JADX WARN: Removed duplicated region for block: B:107:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:293:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final Ji.LocalThemeScope r39, final java.util.List<? extends vs.InterfaceC17607c> r40, final boolean r41, final boolean r42, final boolean r43, final androidx.compose.ui.Modifier r44, boolean r45, boolean r46, jk.EnumC14984a r47, boolean r48, boolean r49, boolean r50, final kotlin.jvm.functions.Function2<? super Co.ProductFullDetails, ? super java.lang.String, kotlin.Unit> r51, final kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super Co.ProductFullDetails, ? super com.meijer.mobile.core.design.widget.stepperview.a, kotlin.Unit> r52, final kotlin.jvm.functions.Function0<kotlin.Unit> r53, kotlin.jvm.functions.Function2<? super Ok.c, ? super jk.EnumC14984a, kotlin.Unit> r54, kotlin.jvm.functions.Function1<? super Ho.SponsoredData, kotlin.Unit> r55, kotlin.jvm.functions.Function1<? super Ho.SponsoredData, kotlin.Unit> r56, androidx.compose.runtime.Composer r57, final int r58, final int r59, final int r60) {
        /*
            Method dump skipped, instructions count: 1186
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: us.C17303A.e(Ji.M, java.util.List, boolean, boolean, boolean, androidx.compose.ui.Modifier, boolean, boolean, jk.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    static {
        mk.b bVarF = Co.l.f("USD", null, 3.79d, "$3.79", 1.0d, null, 34, null);
        f163260a = bVarF;
        ProductListDecorator.Companion companion = ProductListDecorator.INSTANCE;
        f163261b = ProductListDecorator.Companion.b(companion, new ProductFullDetails(null, "Cinnamon Chex", 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, bVarF, false, Co.l.c(false, null, null, null, 0.0d, null, null, 0, 1.0d, l3.f92484c, null), Co.l.f(null, null, 0.0d, "$3.79", 0.0d, null, 55, null), false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -1703939, 268435455, null), null, null, null, false, null, null, false, null, null, null, false, null, null, false, 0, 65534, null);
        f163262c = ProductListDecorator.Companion.b(companion, new ProductFullDetails(null, "Cinnamon Chex", 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, bVarF, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -131075, 268435455, null), null, null, null, false, null, null, false, null, null, null, false, null, null, false, 0, 65534, null);
        f163263d = ProductListDecorator.Companion.b(companion, new ProductFullDetails(null, "Fruity Chex", 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, bVarF, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -131075, 268435455, null), null, null, null, false, null, ProductEligibility.a.l.f164858a, false, null, null, null, false, null, null, false, 0, 65470, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(Ok.c cVar, EnumC14984a enumC14984a) {
        Intrinsics.j(cVar, "<unused var>");
        Intrinsics.j(enumC14984a, "<unused var>");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, List list, boolean z10, boolean z11, boolean z12, Modifier modifier, boolean z13, boolean z14, EnumC14984a enumC14984a, boolean z15, boolean z16, boolean z17, Function2 function2, Function3 function3, Function0 function0, Function2 function22, Function1 function1, Function1 function12, int i10, int i11, int i12, Composer composer, int i13) {
        e(localThemeScope, list, z10, z11, z12, modifier, z13, z14, enumC14984a, z15, z16, z17, function2, function3, function0, function22, function1, function12, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(SponsoredData it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(SponsoredData it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    private static final List<String> g(InterfaceC5730l0<List<String>> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair<Boolean, Boolean> n(LayoutCoordinates layoutCoordinates, float f10, EnumC14984a enumC14984a) {
        boolean z10;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (LayoutCoordinatesKt.f(layoutCoordinates) >> 32));
        int iC = (int) (layoutCoordinates.c() >> 32);
        boolean z11 = false;
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat < f10 && (enumC14984a == EnumC14984a.f140312a || enumC14984a == EnumC14984a.f140313b)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat < f10 && fIntBitsToFloat + (iC / 2) < f10 && (enumC14984a == EnumC14984a.f140312a || enumC14984a == EnumC14984a.f140313b)) {
            z11 = true;
        }
        return new Pair<>(Boolean.valueOf(z10), Boolean.valueOf(z11));
    }
}
