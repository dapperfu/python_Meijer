package us;

import Co.ProductFullDetails;
import Ki.LocalThemeScope;
import Ki.T;
import android.content.Context;
import android.graphics.Rect;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5864h0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.Y0;
import androidx.compose.ui.Modifier;
import bk.AbstractC6392a;
import com.google.android.material.button.MaterialButton;
import com.meijer.mobile.core.design.widget.stepperview.CarouselItemStepperView;
import com.meijer.mobile.core.design.widget.stepperview.a;
import ki.m1;
import ki.q1;
import kk.EnumC15218a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import p1.C16338g;
import r1.C16819m;
import us.r;
import vs.InterfaceC17723c;
import vs.ProductListDecorator;
import wl.ProductEligibility;
import zi.EnumC18490a;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\u001aÍ\u0001\u0010\u0019\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\u001a\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e0\u000b2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\u000b28\b\u0002\u0010\u0018\u001a2\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u000e0\u000b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a3\u0010\u001d\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a1\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u00012\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\u000bH\u0007¢\u0006\u0004\b \u0010!\"\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%\"\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)\"\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00062²\u0006\u000e\u00100\u001a\u00020/8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001c\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00101\u001a\u00020\r8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Lvs/c;", "productDecorator", "", "shouldShowStepper", "isSponsoredProductBuyAgainEnabled", "isSponsoredProductFavOnSaleEnabled", "Landroidx/compose/ui/Modifier;", "modifier", "productListContainsTag", "shouldShowProductTags", "Lkotlin/Function2;", "LCo/h;", "", "", "productClickAction", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "productStepperAction", "LPk/c;", "Lkotlin/ParameterName;", "name", "coupon", "Lkk/a;", "carouselType", "productCouponButtonClicked", "l", "(LKi/M;Lvs/c;ZZZLandroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkk/a;Landroidx/compose/runtime/Composer;III)V", "isSponsored", "isSponsoredProductBuyAgain", "B", "(Lkk/a;Ljava/lang/Boolean;ZZ)Z", "decorator", "u", "(Lvs/c;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "", "Lzi/a;", "a", "[Lzi/a;", "couponStateArray", "Lnk/b;", "b", "Lnk/b;", "price", "Lvs/f;", "c", "Lvs/f;", "product1", "", "itemQuantity", "lastAction", "products_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private static final EnumC18490a[] f164487a = {EnumC18490a.f172799c, EnumC18490a.f172798b, EnumC18490a.f172801e};

    /* renamed from: b, reason: collision with root package name */
    private static final nk.b f164488b;

    /* renamed from: c, reason: collision with root package name */
    private static final ProductListDecorator f164489c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<m1.ProductCardTags, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f164490a;

        a(LocalThemeScope localThemeScope) {
            this.f164490a = localThemeScope;
        }

        public final void a(m1.ProductCardTags ModifiedProductCardTag, Composer composer, int i10) {
            Intrinsics.j(ModifiedProductCardTag, "$this$ModifiedProductCardTag");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(ModifiedProductCardTag) : composer.D(ModifiedProductCardTag) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1965402211, i10, -1, "com.meijer.mobile.ui.products.ProductCarouselItemComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductCarouselItemComposable.kt:159)");
            }
            Ii.h.h(this.f164490a, ModifiedProductCardTag.getSponsored(), C16338g.c(Cj.o.f5020H0, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Tag.f142423e << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(m1.ProductCardTags productCardTags, Composer composer, Integer num) {
            a(productCardTags, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<m1.ProductCardTags, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f164491a;

        b(LocalThemeScope localThemeScope) {
            this.f164491a = localThemeScope;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.w(semantics);
            return Unit.f143329a;
        }

        public final void b(m1.ProductCardTags ModifiedProductCardTag, Composer composer, int i10) {
            int i11;
            Intrinsics.j(ModifiedProductCardTag, "$this$ModifiedProductCardTag");
            if ((i10 & 6) == 0) {
                i11 = i10 | ((i10 & 8) == 0 ? composer.V(ModifiedProductCardTag) : composer.D(ModifiedProductCardTag) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(593922132, i11, -1, "com.meijer.mobile.ui.products.ProductCarouselItemComposable.<anonymous>.<anonymous>.<anonymous> (ProductCarouselItemComposable.kt:213)");
            }
            LocalThemeScope localThemeScope = this.f164491a;
            q1.Tag outOfStock = ModifiedProductCardTag.getOutOfStock();
            T adsColorTransparent = this.f164491a.getAdsColors().getAdsColorTransparent();
            Modifier modifier = ModifiedProductCardTag.getOutOfStock().getModifier();
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: us.s
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return r.b.c((r1.u) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Ii.h.i(localThemeScope, q1.Tag.y(outOfStock, adsColorTransparent, q1.Label.y(ModifiedProductCardTag.getOutOfStock().getLabel(), null, this.f164491a.getAdsColors().getAdsColorTransparent(), null, null, 0, false, 0, null, null, 509, null), null, C16819m.d(modifier, false, (Function1) objB, 1, null), 4, null), null, null, composer, LocalThemeScope.f17314g | 384 | (q1.Tag.f142423e << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(m1.ProductCardTags productCardTags, Composer composer, Integer num) {
            b(productCardTags, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"us/r$c", "LXj/a;", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "controlState", "Landroid/graphics/Rect;", "hitRect", "", "b", "(Lcom/meijer/mobile/core/design/widget/stepperview/a;Landroid/graphics/Rect;)V", "a", "products_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements Xj.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CarouselItemStepperView f164492a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC17723c f164493b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<ProductFullDetails, com.meijer.mobile.core.design.widget.stepperview.a, Unit> f164494c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5864h0 f164495d;

        /* JADX WARN: Multi-variable type inference failed */
        c(CarouselItemStepperView carouselItemStepperView, InterfaceC17723c interfaceC17723c, Function2<? super ProductFullDetails, ? super com.meijer.mobile.core.design.widget.stepperview.a, Unit> function2, InterfaceC5864h0 interfaceC5864h0) {
            this.f164492a = carouselItemStepperView;
            this.f164493b = interfaceC17723c;
            this.f164494c = function2;
            this.f164495d = interfaceC5864h0;
        }

        @Override // Xj.a
        public void a(com.meijer.mobile.core.design.widget.stepperview.a controlState, Rect hitRect) {
            Intrinsics.j(controlState, "controlState");
            Intrinsics.j(hitRect, "hitRect");
            if (controlState instanceof a.Loading) {
                return;
            }
            if (controlState instanceof a.NotAdded) {
                r.w(this.f164495d, ((a.NotAdded) controlState).getValueState().getQuantity());
                ((MaterialButton) this.f164492a.findViewById(Cj.k.f4907b)).setContentDescription("Add to Cart. Button for " + this.f164493b.getTitle());
                this.f164494c.invoke(this.f164493b.getProduct(), controlState);
                return;
            }
            if ((controlState instanceof a.SingleQuantity) || (controlState instanceof a.MultipleQuantity)) {
                r.w(this.f164495d, controlState.getValueState().getQuantity());
                this.f164494c.invoke(this.f164493b.getProduct(), controlState);
            } else {
                if (!(controlState instanceof a.ShowQuantity)) {
                    throw new NoWhenBranchMatchedException();
                }
                r.w(this.f164495d, ((a.ShowQuantity) controlState).getValueState().getQuantity());
                ((MaterialButton) this.f164492a.findViewById(Cj.k.f4870J)).setContentDescription(this.f164492a.getEntryCountButtonContentDescription() + ". Button for " + this.f164493b.getTitle());
                this.f164494c.invoke(this.f164493b.getProduct(), controlState);
            }
        }

        @Override // Xj.a
        public void b(com.meijer.mobile.core.design.widget.stepperview.a controlState, Rect hitRect) {
            Intrinsics.j(controlState, "controlState");
            Intrinsics.j(hitRect, "hitRect");
            if (controlState instanceof a.NotAdded) {
                ((MaterialButton) this.f164492a.findViewById(Cj.k.f4907b)).setContentDescription("Add to Cart. Button for " + this.f164493b.getTitle());
                return;
            }
            if (!(controlState instanceof a.ShowQuantity)) {
                if (!(controlState instanceof a.Loading) && !(controlState instanceof a.SingleQuantity) && !(controlState instanceof a.MultipleQuantity)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            ((MaterialButton) this.f164492a.findViewById(Cj.k.f4870J)).setContentDescription(this.f164492a.getEntryCountButtonContentDescription() + ". Button for " + this.f164493b.getTitle());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0897  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x08bc  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x08c5  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0908  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x09a3  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0aab  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0b18  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0beb  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0bff  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0c05  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0d67  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0d78  */
    /* JADX WARN: Removed duplicated region for block: B:416:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(final Ki.LocalThemeScope r59, final vs.InterfaceC17723c r60, final boolean r61, final boolean r62, final boolean r63, androidx.compose.ui.Modifier r64, boolean r65, boolean r66, final kotlin.jvm.functions.Function2<? super Co.ProductFullDetails, ? super java.lang.String, kotlin.Unit> r67, final kotlin.jvm.functions.Function2<? super Co.ProductFullDetails, ? super com.meijer.mobile.core.design.widget.stepperview.a, kotlin.Unit> r68, kotlin.jvm.functions.Function2<? super Pk.c, ? super kk.EnumC15218a, kotlin.Unit> r69, kk.EnumC15218a r70, androidx.compose.runtime.Composer r71, final int r72, final int r73, final int r74) {
        /*
            Method dump skipped, instructions count: 3482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: us.r.l(Ki.M, vs.c, boolean, boolean, boolean, androidx.compose.ui.Modifier, boolean, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kk.a, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC15218a.values().length];
            try {
                iArr[EnumC15218a.f142571e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        nk.b bVarE = Co.l.e("USD", null, 3.79d, "$3.79", 0.0d, null);
        f164488b = bVarE;
        ProductFullDetails productFullDetails = new ProductFullDetails(null, "Cinnamon Chex", 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, bVarE, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -33685507, 268435455, null);
        ProductEligibility.a.c cVar = ProductEligibility.a.c.f167271a;
        AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
        f164489c = new ProductListDecorator("1_product", false, "1234", "Cinnamon Chex", false, null, null, null, null, null, false, false, false, companion.c("$3.79"), companion.c("$3.79"), null, null, companion.c("each"), null, false, 0, null, productFullDetails, null, null, cVar, false, false, null, null, null, null, false, false, null, null, false, 0, null, false, null, -37904400, 511, null);
    }

    private static final boolean B(EnumC15218a enumC15218a, Boolean bool, boolean z10, boolean z11) {
        if (z10 && enumC15218a == EnumC15218a.f142567a && Intrinsics.e(bool, Boolean.TRUE)) {
            return true;
        }
        return z11 && enumC15218a == EnumC15218a.f142568b && Intrinsics.e(bool, Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(Pk.c cVar, EnumC15218a enumC15218a) {
        Intrinsics.j(cVar, "<unused var>");
        Intrinsics.j(enumC15218a, "<unused var>");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(String str, r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.g0(semantics, str);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(String str, r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.g0(semantics, str);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(Function2 function2, Pk.c cVar, EnumC15218a enumC15218a) {
        if (enumC15218a == null) {
            enumC15218a = EnumC15218a.f142572f;
        }
        function2.invoke(cVar, enumC15218a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(Function2 function2, Pk.c cVar, EnumC15218a enumC15218a) {
        if (enumC15218a == null) {
            enumC15218a = EnumC15218a.f142572f;
        }
        function2.invoke(cVar, enumC15218a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(LocalThemeScope localThemeScope, InterfaceC17723c interfaceC17723c, boolean z10, boolean z11, boolean z12, Modifier modifier, boolean z13, boolean z14, Function2 function2, Function2 function22, Function2 function23, EnumC15218a enumC15218a, int i10, int i11, int i12, Composer composer, int i13) {
        l(localThemeScope, interfaceC17723c, z10, z11, z12, modifier, z13, z14, function2, function22, function23, enumC15218a, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        return Unit.f143329a;
    }

    public static final void u(final InterfaceC17723c decorator, final Function2<? super ProductFullDetails, ? super com.meijer.mobile.core.design.widget.stepperview.a, Unit> productStepperAction, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(decorator, "decorator");
        Intrinsics.j(productStepperAction, "productStepperAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(1329301533);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(decorator) : composerStartRestartGroup.D(decorator) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(productStepperAction) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1329301533, i11, -1, "com.meijer.mobile.ui.products.QuantityStepper (ProductCarouselItemComposable.kt:370)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = Y0.a(RangesKt.d(decorator.getActualQuantity(), 0.0d));
                composerStartRestartGroup.t(objB);
            }
            final InterfaceC5864h0 interfaceC5864h0 = (InterfaceC5864h0) objB;
            composerStartRestartGroup.P();
            if (decorator.getResetStepperState() || !decorator.getInQtyStepperTransition()) {
                w(interfaceC5864h0, RangesKt.d(decorator.getActualQuantity(), 0.0d));
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion.a()) {
                objB2 = new Function1() { // from class: us.p
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return r.x((Context) obj);
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            Function1 function1 = (Function1) objB2;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean z10 = ((i11 & 14) == 4 || ((i11 & 8) != 0 && composerStartRestartGroup.D(decorator))) | ((i11 & 112) == 32);
            Object objB3 = composerStartRestartGroup.B();
            if (z10 || objB3 == companion.a()) {
                objB3 = new Function1() { // from class: us.q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return r.y(decorator, interfaceC5864h0, productStepperAction, (CarouselItemStepperView) obj);
                    }
                };
                composerStartRestartGroup.t(objB3);
            }
            composerStartRestartGroup.P();
            androidx.compose.ui.viewinterop.e.a(function1, null, (Function1) objB3, composerStartRestartGroup, 6, 2);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: us.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return r.z(decorator, productStepperAction, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CarouselItemStepperView x(Context context) {
        Intrinsics.j(context, "context");
        return new CarouselItemStepperView(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit y(vs.InterfaceC17723c r17, androidx.compose.runtime.InterfaceC5864h0 r18, kotlin.jvm.functions.Function2 r19, com.meijer.mobile.core.design.widget.stepperview.CarouselItemStepperView r20) {
        /*
            r0 = r20
            java.lang.String r1 = "stepperView"
            kotlin.jvm.internal.Intrinsics.j(r0, r1)
            boolean r1 = r17.getIsOutOfStock()
            r2 = 0
            if (r1 != 0) goto L10
            r1 = r2
            goto L12
        L10:
            r1 = 8
        L12:
            r0.setVisibility(r1)
            r1 = 1
            r0.setFocusable(r1)
            r0.setClickable(r1)
            Co.h r3 = r17.getProduct()
            java.lang.Integer r3 = r3.getMaxOrderQuantity()
            r4 = 0
            if (r3 == 0) goto L43
            int r3 = r3.intValue()
            double r5 = (double) r3
            java.lang.Double r3 = java.lang.Double.valueOf(r5)
            double r5 = r3.doubleValue()
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L3b
            r3 = r4
        L3b:
            if (r3 == 0) goto L43
            double r5 = r3.doubleValue()
        L41:
            r15 = r5
            goto L49
        L43:
            r5 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            goto L41
        L49:
            Co.h r3 = r17.getProduct()
            double r8 = r3.getQtyIncrement()
            double r10 = v(r18)
            Co.h r3 = r17.getProduct()
            java.lang.String r3 = r3.getUnit()
            if (r3 == 0) goto L65
            boolean r5 = kotlin.text.StringsKt.s0(r3)
            if (r5 == 0) goto L66
        L65:
            r2 = r1
        L66:
            if (r2 != 0) goto L69
            r4 = r3
        L69:
            if (r4 != 0) goto L6d
            java.lang.String r4 = "Each"
        L6d:
            r13 = r4
            boolean r14 = r17.getInQtyStepperTransition()
            Xj.t r7 = new Xj.t
            r12 = 0
            r7.<init>(r8, r10, r12, r13, r14, r15)
            r0.setValueState(r7)
            com.meijer.mobile.core.design.widget.stepperview.a r1 = r0.getControlState()
            boolean r1 = r1 instanceof com.meijer.mobile.core.design.widget.stepperview.a.NotAdded
            if (r1 == 0) goto La4
            int r1 = Cj.k.f4907b
            android.view.View r1 = r0.findViewById(r1)
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Add to Cart. Button for "
            r2.append(r3)
            java.lang.String r3 = r17.getTitle()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.setContentDescription(r2)
            goto Ld3
        La4:
            com.meijer.mobile.core.design.widget.stepperview.a r1 = r0.getControlState()
            boolean r1 = r1 instanceof com.meijer.mobile.core.design.widget.stepperview.a.ShowQuantity
            if (r1 == 0) goto Ld3
            int r1 = Cj.k.f4870J
            android.view.View r1 = r0.findViewById(r1)
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r0.getEntryCountButtonContentDescription()
            r2.append(r3)
            java.lang.String r3 = ". Button for "
            r2.append(r3)
            java.lang.String r3 = r17.getTitle()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.setContentDescription(r2)
        Ld3:
            us.r$c r1 = new us.r$c
            r2 = r17
            r3 = r18
            r4 = r19
            r1.<init>(r0, r2, r4, r3)
            r0.setOnActionListener(r1)
            kotlin.Unit r0 = kotlin.Unit.f143329a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: us.r.y(vs.c, androidx.compose.runtime.h0, kotlin.jvm.functions.Function2, com.meijer.mobile.core.design.widget.stepperview.CarouselItemStepperView):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(InterfaceC17723c interfaceC17723c, Function2 function2, int i10, Composer composer, int i11) {
        u(interfaceC17723c, function2, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Function2 function2, InterfaceC17723c interfaceC17723c, EnumC15218a enumC15218a) {
        int i10;
        String str;
        ProductFullDetails product = interfaceC17723c.getProduct();
        if (enumC15218a == null) {
            i10 = -1;
        } else {
            i10 = d.$EnumSwitchMapping$0[enumC15218a.ordinal()];
        }
        if (i10 == 1) {
            str = "PDP recommendation- criteo sponsored product";
        } else {
            str = null;
        }
        function2.invoke(product, str);
        return Unit.f143329a;
    }

    private static final double v(InterfaceC5864h0 interfaceC5864h0) {
        return interfaceC5864h0.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(InterfaceC5864h0 interfaceC5864h0, double d10) {
        interfaceC5864h0.s(d10);
    }
}
