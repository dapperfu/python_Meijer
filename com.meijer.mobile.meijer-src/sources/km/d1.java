package km;

import Ki.LocalThemeScope;
import Pk.Coupon;
import Pr.C4629i;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import el.SpecialOffer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a³\u0001\u0010\u0017\u001a\u00020\u000f*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000f0\u00122\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000f0\u00122\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LKi/M;", "", "Lel/b;", "specialOffers", "", "carouselTitle", "LPj/a;", "loadingState", "Landroidx/compose/ui/Modifier;", "modifier", "bannerResource", "", "bannerErrorImageResource", "totalCouponsCount", "Lkotlin/Function0;", "", "onViewAllClicked", "onRetryClicked", "Lkotlin/Function1;", "LPk/a;", "onCouponClicked", "onCouponActionButtonClicked", "onBannerClicked", "b", "(LKi/M;Ljava/util/List;Ljava/lang/String;LPj/a;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "ux_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d1 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f142929a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<SpecialOffer> f142930b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f142931c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Coupon, Unit> f142932d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<Coupon, Unit> f142933e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f142934f;

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, List<SpecialOffer> list, int i10, Function1<? super Coupon, Unit> function1, Function1<? super Coupon, Unit> function12, Function0<Unit> function0) {
            this.f142929a = localThemeScope;
            this.f142930b = list;
            this.f142931c = i10;
            this.f142932d = function1;
            this.f142933e = function12;
            this.f142934f = function0;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(545763987, i10, -1, "com.meijer.mobile.home.ux.views.SpecialOffersSection.<anonymous> (SpecialOffersSection.kt:55)");
            }
            LocalThemeScope localThemeScope = this.f142929a;
            C4629i.c(localThemeScope, androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, localThemeScope.getAdsSpacing().getFive().getDp(), this.f142929a.getAdsSpacing().getSeven().getDp(), this.f142929a.getAdsSpacing().getFive().getDp(), 0.0f, 8, null), this.f142930b, this.f142931c, this.f142932d, this.f142933e, this.f142934f, composer, LocalThemeScope.f17314g, 0);
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

    /* JADX WARN: Removed duplicated region for block: B:102:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ki.LocalThemeScope r27, final java.util.List<el.SpecialOffer> r28, final java.lang.String r29, final Pj.a r30, androidx.compose.ui.Modifier r31, java.lang.String r32, java.lang.Integer r33, int r34, final kotlin.jvm.functions.Function0<kotlin.Unit> r35, final kotlin.jvm.functions.Function0<kotlin.Unit> r36, final kotlin.jvm.functions.Function1<? super Pk.Coupon, kotlin.Unit> r37, final kotlin.jvm.functions.Function1<? super Pk.Coupon, kotlin.Unit> r38, kotlin.jvm.functions.Function0<kotlin.Unit> r39, androidx.compose.runtime.Composer r40, final int r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: km.d1.b(Ki.M, java.util.List, java.lang.String, Pj.a, androidx.compose.ui.Modifier, java.lang.String, java.lang.Integer, int, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, List list, String str, Pj.a aVar, Modifier modifier, String str2, Integer num, int i10, Function0 function0, Function0 function02, Function1 function1, Function1 function12, Function0 function03, int i11, int i12, int i13, Composer composer, int i14) {
        b(localThemeScope, list, str, aVar, modifier, str2, num, i10, function0, function02, function1, function12, function03, composer, androidx.compose.runtime.J0.a(i11 | 1), androidx.compose.runtime.J0.a(i12), i13);
        return Unit.f143329a;
    }
}
