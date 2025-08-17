package Gs;

import Gs.c;
import Ji.LocalThemeScope;
import Ok.Coupon;
import Pk.a;
import Pr.C;
import Pr.C5037o;
import Pr.w;
import Xr.CouponListItemDecorator;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u001a=\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0001¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0017²\u0006\u000e\u0010\u0010\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0012\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0014\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002²\u0006\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00158\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "LGs/m;", "viewState", "Lkotlin/Function1;", "LPk/a;", "", "onCouponAction", "Lkotlin/Function0;", "onRetry", "b", "(LJi/M;LGs/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "LOk/a;", "a", "LOk/a;", "mockCoupon", "", "lastAction", "LOj/a;", "loadingState", "", "hasSpecialOffers", "", "couponsList", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final Coupon f11847a = new Coupon(12345678, false, false, null, null, false, false, "Buy 1, Get 2 Free", "when you buy TWO BOXES any flavor General Mills cereal listed: Cheerios™ • Cinnamon Toast Crunch™", null, null, null, null, false, false, null, null, "Void if altered, copied, sold, purchased, transferred, exchanged or where prohibited or restricted by law. ", false, null, null, null, null, null, false, false, "2017-10-07T23:59:00", null, null, false, 989724286, null);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<Modifier, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeeklyAdDetailsCouponState f11848a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f11849b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Pk.a, Unit> f11850c;

        /* JADX WARN: Multi-variable type inference failed */
        a(WeeklyAdDetailsCouponState weeklyAdDetailsCouponState, LocalThemeScope localThemeScope, Function1<? super Pk.a, Unit> function1) {
            this.f11848a = weeklyAdDetailsCouponState;
            this.f11849b = localThemeScope;
            this.f11850c = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(new a.ViewCouponList(Pk.c.f28336l, null, 2, null));
            return Unit.f142422a;
        }

        public final void b(Modifier it, Composer composer, int i10) {
            Intrinsics.j(it, "it");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1760233234, i10, -1, "com.meijer.mobile.weeklyad.compose.weeklyAdDetail.CouponsLayout.<anonymous> (CouponFrame.kt:40)");
            }
            composer.startReplaceGroup(-632975934);
            if (this.f11848a.getHasSpecialOffers()) {
                LocalThemeScope localThemeScope = this.f11849b;
                String specialOffersBannerUrl = this.f11848a.getSpecialOffersBannerUrl();
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f11850c);
                final Function1<Pk.a, Unit> function1 = this.f11850c;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Gs.b
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return c.a.c(function1);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                w.e(localThemeScope, null, specialOffersBannerUrl, null, null, true, (Function0) objB, composer, LocalThemeScope.f15770g | 196608, 13);
            }
            composer.P();
            List<CouponListItemDecorator> listC = this.f11848a.c();
            LocalThemeScope localThemeScope2 = this.f11849b;
            Function1<Pk.a, Unit> function12 = this.f11850c;
            Iterator<T> it2 = listC.iterator();
            while (it2.hasNext()) {
                C.f(localThemeScope2, J.D(Modifier.INSTANCE, null, false, 3, null), (CouponListItemDecorator) it2.next(), null, function12, composer, LocalThemeScope.f15770g | 48 | (CouponListItemDecorator.f39800n << 6), 4);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer, Integer num) {
            b(modifier, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public static final void b(LocalThemeScope localThemeScope, final WeeklyAdDetailsCouponState viewState, final Function1<? super Pk.a, Unit> onCouponAction, Function0<Unit> onRetry, Composer composer, final int i10) {
        int i11;
        LocalThemeScope localThemeScope2;
        final Function0<Unit> function0;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(viewState, "viewState");
        Intrinsics.j(onCouponAction, "onCouponAction");
        Intrinsics.j(onRetry, "onRetry");
        Composer composerStartRestartGroup = composer.startRestartGroup(876521212);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(viewState) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(onCouponAction) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(onRetry) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i11 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            localThemeScope2 = localThemeScope;
            function0 = onRetry;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(876521212, i11, -1, "com.meijer.mobile.weeklyad.compose.weeklyAdDetail.CouponsLayout (CouponFrame.kt:35)");
            }
            localThemeScope2 = localThemeScope;
            C5037o.k(localThemeScope2, viewState.getLoadingState(), null, onRetry, ComposableLambdaKt.c(1760233234, true, new a(viewState, localThemeScope, onCouponAction), composerStartRestartGroup, 54), composerStartRestartGroup, LocalThemeScope.f15770g | 24576 | (i11 & 14) | (Oj.a.f23966c << 3) | (i11 & 7168), 2);
            function0 = onRetry;
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            final LocalThemeScope localThemeScope3 = localThemeScope2;
            t0L.a(new Function2() { // from class: Gs.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return c.c(localThemeScope3, viewState, onCouponAction, function0, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, WeeklyAdDetailsCouponState weeklyAdDetailsCouponState, Function1 function1, Function0 function0, int i10, Composer composer, int i11) {
        b(localThemeScope, weeklyAdDetailsCouponState, function1, function0, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }
}
