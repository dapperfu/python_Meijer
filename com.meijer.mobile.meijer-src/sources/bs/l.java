package bs;

import Co.ProductFullDetails;
import Ho.SponsoredData;
import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import bk.AbstractC6392a;
import fs.AbstractC14072a;
import java.util.Iterator;
import java.util.List;
import kk.EnumC15218a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.InterfaceC15783O;
import vs.InterfaceC17723c;
import vs.ProductListDecorator;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aï\u0002\u0010+\u001a\u00020\u0018*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u001a\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00180\u001b2\u001e\u0010 \u001a\u001a\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00180\u001e26\u0010%\u001a2\u0012\u0013\u0012\u00110!¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0013\u0012\u00110\n¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00180\u001b2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00180&2\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\"\b\u0002\u0010*\u001a\u001c\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001eH\u0007¢\u0006\u0004\b+\u0010,\u001a\u007f\u00104\u001a\u00020\u00182\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020-0\u00012\b\b\u0002\u0010.\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u00020\u00042\b\b\u0002\u00100\u001a\u00020\u00042\b\b\u0002\u00101\u001a\u00020\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00112\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00180&2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\n0\u0001H\u0003¢\u0006\u0004\b4\u00105\u001a;\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040;2\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u0002082\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010:\u001a\u00020\nH\u0002¢\u0006\u0004\b<\u0010=\"\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@\"\u0014\u0010D\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006F²\u0006\u000e\u0010.\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010/\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00100\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00101\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\f\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\r\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010E\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "", "Lvs/f;", "products", "", "isLoggedIn", "Lbk/a;", "carouselTitle", "LPj/a;", "loadingState", "Lkk/a;", "carouselType", "isSponsoredProductBuyAgain", "isSponsoredProductFavOnSaleEnabled", "Landroidx/compose/ui/Modifier;", "modifier", "isShowViewAllButton", "", "bannerResource", "", "bannerErrorImageResource", "onLoadBeaconUrl", "onViewBeaconUrl", "Lkotlin/Function0;", "", "onViewAllClicked", "onRetryClicked", "Lkotlin/Function2;", "LCo/h;", "onProductClicked", "Lkotlin/Function3;", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "onEntryUpdate", "LPk/c;", "Lkotlin/ParameterName;", "name", "coupon", "productCouponButtonClicked", "Lkotlin/Function1;", "Lfs/a;", "onCarouselBeaconTrackingAction", "onBannerClicked", "onProductClickedPosition", "d", "(LKi/M;Ljava/util/List;ZLbk/a;LPj/a;Lkk/a;ZZLandroidx/compose/ui/Modifier;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;IIII)V", "Lvs/c;", "isCarouselVisibleBuyAgain", "isCarouselHalfVisibleBuyAgain", "isCarouselVisibleFavoritesOnSale", "isCarouselHalfVisibleFavoritesOnSale", "onCarouselAction", "carouselTypes", "o", "(Ljava/util/List;ZZZZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "", "screenHeightInPx", "carouselTypeToCheck", "Lkotlin/Pair;", "v", "(Landroidx/compose/ui/layout/LayoutCoordinates;FLkk/a;Lkk/a;)Lkotlin/Pair;", "Lnk/b;", "a", "Lnk/b;", "price", "b", "Lvs/f;", "product1", "lastAction", "homescreen_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private static final nk.b f60570a;

    /* renamed from: b, reason: collision with root package name */
    private static final ProductListDecorator f60571b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f60572a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<ProductListDecorator> f60573b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f60574c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f60575d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f60576e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ EnumC15218a f60577f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f60578g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<ProductFullDetails, String, Unit> f60579h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function3<Integer, EnumC15218a, Boolean, Unit> f60580i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function3<ProductFullDetails, com.meijer.mobile.core.design.widget.stepperview.a, EnumC15218a, Unit> f60581j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f60582k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function2<Pk.c, EnumC15218a, Unit> f60583l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC14072a, Unit> f60584m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f60585n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f60586o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f60587p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f60588q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f60589r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f60590s;

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, List<ProductListDecorator> list, boolean z10, boolean z11, boolean z12, EnumC15218a enumC15218a, boolean z13, Function2<? super ProductFullDetails, ? super String, Unit> function2, Function3<? super Integer, ? super EnumC15218a, ? super Boolean, Unit> function3, Function3<? super ProductFullDetails, ? super com.meijer.mobile.core.design.widget.stepperview.a, ? super EnumC15218a, Unit> function32, Function0<Unit> function0, Function2<? super Pk.c, ? super EnumC15218a, Unit> function22, Function1<? super AbstractC14072a, Unit> function1, String str, String str2, InterfaceC5872l0<Boolean> interfaceC5872l0, InterfaceC5872l0<Boolean> interfaceC5872l02, InterfaceC5872l0<Boolean> interfaceC5872l03, InterfaceC5872l0<Boolean> interfaceC5872l04) {
            this.f60572a = localThemeScope;
            this.f60573b = list;
            this.f60574c = z10;
            this.f60575d = z11;
            this.f60576e = z12;
            this.f60577f = enumC15218a;
            this.f60578g = z13;
            this.f60579h = function2;
            this.f60580i = function3;
            this.f60581j = function32;
            this.f60582k = function0;
            this.f60583l = function22;
            this.f60584m = function1;
            this.f60585n = str;
            this.f60586o = str2;
            this.f60587p = interfaceC5872l0;
            this.f60588q = interfaceC5872l02;
            this.f60589r = interfaceC5872l03;
            this.f60590s = interfaceC5872l04;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Function3 function3, EnumC15218a enumC15218a, Function3 function32, int i10, ProductFullDetails productFullDetails, com.meijer.mobile.core.design.widget.stepperview.a controlState) {
            Intrinsics.j(productFullDetails, "productFullDetails");
            Intrinsics.j(controlState, "controlState");
            if (function3 != null) {
                function3.invoke(Integer.valueOf(i10 + 1), enumC15218a, Boolean.valueOf(productFullDetails.getIsSponsoredCriteo()));
            }
            function32.invoke(productFullDetails, controlState, enumC15218a);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(Function1 function1, List list, EnumC15218a enumC15218a, SponsoredData criteoSponsoredData) {
            Object next;
            Intrinsics.j(criteoSponsoredData, "criteoSponsoredData");
            List<String> listG = criteoSponsoredData.g();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((ProductListDecorator) next).getProduct().getIsSponsoredCriteo()) {
                    break;
                }
            }
            ProductListDecorator productListDecorator = (ProductListDecorator) next;
            function1.invoke(new AbstractC14072a.OnViewBeacon(listG, productListDecorator != null ? productListDecorator.getProduct() : null, false, enumC15218a));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(Function1 function1, List list, EnumC15218a enumC15218a, SponsoredData criteoSponsoredData) {
            Object next;
            Intrinsics.j(criteoSponsoredData, "criteoSponsoredData");
            String onLoadBeacon = criteoSponsoredData.getOnLoadBeacon();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((ProductListDecorator) next).getProduct().getIsSponsoredCriteo()) {
                    break;
                }
            }
            ProductListDecorator productListDecorator = (ProductListDecorator) next;
            function1.invoke(new AbstractC14072a.OnLoadBeacon(onLoadBeacon, productListDecorator != null ? productListDecorator.getProduct() : null, false, enumC15218a));
            return Unit.f143329a;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x011a  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x015d  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0161  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x017f  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0184  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x01a3  */
        /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void d(androidx.compose.runtime.Composer r24, int r25) {
            /*
                Method dump skipped, instructions count: 423
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: bs.l.a.d(androidx.compose.runtime.Composer, int):void");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            d(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.ui.homescreen.carousel.ProductCarouselKt$SendCarouselItemOnViewBeacon$1$1", f = "ProductCarousel.kt", l = {227, 263}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f60591a;

        /* renamed from: b, reason: collision with root package name */
        Object f60592b;

        /* renamed from: c, reason: collision with root package name */
        Object f60593c;

        /* renamed from: d, reason: collision with root package name */
        Object f60594d;

        /* renamed from: e, reason: collision with root package name */
        Object f60595e;

        /* renamed from: f, reason: collision with root package name */
        Object f60596f;

        /* renamed from: g, reason: collision with root package name */
        Object f60597g;

        /* renamed from: h, reason: collision with root package name */
        Object f60598h;

        /* renamed from: i, reason: collision with root package name */
        boolean f60599i;

        /* renamed from: j, reason: collision with root package name */
        boolean f60600j;

        /* renamed from: k, reason: collision with root package name */
        int f60601k;

        /* renamed from: l, reason: collision with root package name */
        int f60602l;

        /* renamed from: m, reason: collision with root package name */
        int f60603m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ List<EnumC15218a> f60604n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f60605o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ List<InterfaceC17723c> f60606p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ boolean f60607q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f60608r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC14072a, Unit> f60609s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f60610t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(List<? extends EnumC15218a> list, boolean z10, List<? extends InterfaceC17723c> list2, boolean z11, String str, Function1<? super AbstractC14072a, Unit> function1, String str2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f60604n = list;
            this.f60605o = z10;
            this.f60606p = list2;
            this.f60607q = z11;
            this.f60608r = str;
            this.f60609s = function1;
            this.f60610t = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f60604n, this.f60605o, this.f60606p, this.f60607q, this.f60608r, this.f60609s, this.f60610t, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:70:0x0252, code lost:
        
            r5 = r4;
            r4 = r6;
            r6 = r2;
            r10 = r19;
            r12 = r11;
            r3 = r15;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x013c  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0198 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0208  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0246  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0258  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0202 -> B:7:0x003a). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r30) {
            /*
                Method dump skipped, instructions count: 603
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: bs.l.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:314:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final Ki.LocalThemeScope r38, final java.util.List<vs.ProductListDecorator> r39, final boolean r40, final bk.AbstractC6392a r41, final Pj.a r42, final kk.EnumC15218a r43, final boolean r44, final boolean r45, androidx.compose.ui.Modifier r46, boolean r47, java.lang.String r48, java.lang.Integer r49, java.lang.String r50, java.lang.String r51, final kotlin.jvm.functions.Function0<kotlin.Unit> r52, final kotlin.jvm.functions.Function0<kotlin.Unit> r53, final kotlin.jvm.functions.Function2<? super Co.ProductFullDetails, ? super java.lang.String, kotlin.Unit> r54, final kotlin.jvm.functions.Function3<? super Co.ProductFullDetails, ? super com.meijer.mobile.core.design.widget.stepperview.a, ? super kk.EnumC15218a, kotlin.Unit> r55, final kotlin.jvm.functions.Function2<? super Pk.c, ? super kk.EnumC15218a, kotlin.Unit> r56, final kotlin.jvm.functions.Function1<? super fs.AbstractC14072a, kotlin.Unit> r57, kotlin.jvm.functions.Function0<kotlin.Unit> r58, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super kk.EnumC15218a, ? super java.lang.Boolean, kotlin.Unit> r59, androidx.compose.runtime.Composer r60, final int r61, final int r62, final int r63, final int r64) {
        /*
            Method dump skipped, instructions count: 1402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bs.l.d(Ki.M, java.util.List, boolean, bk.a, Pj.a, kk.a, boolean, boolean, androidx.compose.ui.Modifier, boolean, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, List list, boolean z10, AbstractC6392a abstractC6392a, Pj.a aVar, EnumC15218a enumC15218a, boolean z11, boolean z12, Modifier modifier, boolean z13, String str, Integer num, String str2, String str3, Function0 function0, Function0 function02, Function2 function2, Function3 function3, Function2 function22, Function1 function1, Function0 function03, Function3 function32, int i10, int i11, int i12, int i13, Composer composer, int i14) {
        d(localThemeScope, list, z10, abstractC6392a, aVar, enumC15218a, z11, z12, modifier, z13, str, num, str2, str3, function0, function02, function2, function3, function22, function1, function03, function32, composer, J0.a(i10 | 1), J0.a(i11), J0.a(i12), i13);
        return Unit.f143329a;
    }

    static {
        nk.b bVarE = Co.l.e("USD", null, 3.79d, "$3.79", 0.0d, null);
        f60570a = bVarE;
        ProductFullDetails productFullDetails = new ProductFullDetails(null, "Cinnamon Chex", 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, bVarE, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -131075, 268435455, null);
        AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
        f60571b = new ProductListDecorator("id_1", false, "2772918", "Cinnamon Chex", false, null, null, null, null, null, false, false, false, companion.c("$3.79"), companion.c("$3.79"), null, null, companion.c("2"), null, false, 0, null, productFullDetails, null, null, null, false, false, null, null, null, null, false, false, null, null, false, 0, null, false, null, -4349968, 511, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(float f10, EnumC15218a enumC15218a, InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, InterfaceC5872l0 interfaceC5872l03, InterfaceC5872l0 interfaceC5872l04, LayoutCoordinates coordinates) {
        Intrinsics.j(coordinates, "coordinates");
        Pair<Boolean, Boolean> pairV = v(coordinates, f10, enumC15218a, EnumC15218a.f142567a);
        boolean zBooleanValue = pairV.a().booleanValue();
        boolean zBooleanValue2 = pairV.b().booleanValue();
        Pair<Boolean, Boolean> pairV2 = v(coordinates, f10, enumC15218a, EnumC15218a.f142568b);
        boolean zBooleanValue3 = pairV2.a().booleanValue();
        boolean zBooleanValue4 = pairV2.b().booleanValue();
        j(interfaceC5872l0, zBooleanValue);
        l(interfaceC5872l02, zBooleanValue2);
        n(interfaceC5872l03, zBooleanValue3);
        g(interfaceC5872l04, zBooleanValue4);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(final java.util.List<? extends vs.InterfaceC17723c> r22, boolean r23, boolean r24, boolean r25, boolean r26, java.lang.String r27, java.lang.String r28, final kotlin.jvm.functions.Function1<? super fs.AbstractC14072a, kotlin.Unit> r29, final java.util.List<? extends kk.EnumC15218a> r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bs.l.o(java.util.List, boolean, boolean, boolean, boolean, java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, java.util.List, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(List list, boolean z10, boolean z11, boolean z12, boolean z13, String str, String str2, Function1 function1, List list2, int i10, int i11, Composer composer, int i12) {
        o(list, z10, z11, z12, z13, str, str2, function1, list2, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    private static final void g(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    private static final void j(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    private static final void l(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    private static final void n(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    private static final Pair<Boolean, Boolean> v(LayoutCoordinates layoutCoordinates, float f10, EnumC15218a enumC15218a, EnumC15218a enumC15218a2) {
        boolean z10;
        long jF = LayoutCoordinatesKt.f(layoutCoordinates);
        int iC = (int) (layoutCoordinates.c() & 4294967295L);
        int i10 = (int) (jF & 4294967295L);
        boolean z11 = false;
        if (Float.intBitsToFloat(i10) >= 0.0f && Float.intBitsToFloat(i10) < f10 && (enumC15218a == EnumC15218a.f142567a || enumC15218a == EnumC15218a.f142568b)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (Float.intBitsToFloat(i10) >= 0.0f && Float.intBitsToFloat(i10) < f10 && Float.intBitsToFloat(i10) + (iC / 2) < f10 && enumC15218a == enumC15218a2) {
            z11 = true;
        }
        return new Pair<>(Boolean.valueOf(z10), Boolean.valueOf(z11));
    }
}
