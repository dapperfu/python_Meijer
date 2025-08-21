package Gs;

import Gs.c;
import Ki.LocalThemeScope;
import Pk.Coupon;
import Pr.C;
import Pr.C4635o;
import Pr.w;
import Qk.a;
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

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u001a=\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0001¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0017²\u0006\u000e\u0010\u0010\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0012\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0014\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002²\u0006\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00158\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "LGs/m;", "viewState", "Lkotlin/Function1;", "LQk/a;", "", "onCouponAction", "Lkotlin/Function0;", "onRetry", "b", "(LKi/M;LGs/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "LPk/a;", "a", "LPk/a;", "mockCoupon", "", "lastAction", "LPj/a;", "loadingState", "", "hasSpecialOffers", "", "couponsList", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final Coupon f13164a = new Coupon(12345678, false, false, null, null, false, false, "Buy 1, Get 2 Free", "when you buy TWO BOXES any flavor General Mills cereal listed: Cheerios™ • Cinnamon Toast Crunch™", null, null, null, null, false, false, null, null, "Void if altered, copied, sold, purchased, transferred, exchanged or where prohibited or restricted by law. ", false, null, null, null, null, null, false, false, "2017-10-07T23:59:00", null, null, false, 989724286, null);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<Modifier, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeeklyAdDetailsCouponState f13165a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f13166b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Qk.a, Unit> f13167c;

        /* JADX WARN: Multi-variable type inference failed */
        a(WeeklyAdDetailsCouponState weeklyAdDetailsCouponState, LocalThemeScope localThemeScope, Function1<? super Qk.a, Unit> function1) {
            this.f13165a = weeklyAdDetailsCouponState;
            this.f13166b = localThemeScope;
            this.f13167c = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(new a.ViewCouponList(Qk.c.f31048l, null, 2, null));
            return Unit.f143329a;
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
            if (this.f13165a.getHasSpecialOffers()) {
                LocalThemeScope localThemeScope = this.f13166b;
                String specialOffersBannerUrl = this.f13165a.getSpecialOffersBannerUrl();
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f13167c);
                final Function1<Qk.a, Unit> function1 = this.f13167c;
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
                w.e(localThemeScope, null, specialOffersBannerUrl, null, null, true, (Function0) objB, composer, LocalThemeScope.f17314g | 196608, 13);
            }
            composer.P();
            List<CouponListItemDecorator> listC = this.f13165a.c();
            LocalThemeScope localThemeScope2 = this.f13166b;
            Function1<Qk.a, Unit> function12 = this.f13167c;
            Iterator<T> it2 = listC.iterator();
            while (it2.hasNext()) {
                C.f(localThemeScope2, J.D(Modifier.INSTANCE, null, false, 3, null), (CouponListItemDecorator) it2.next(), null, function12, composer, LocalThemeScope.f17314g | 48 | (CouponListItemDecorator.f42649n << 6), 4);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer, Integer num) {
            b(modifier, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final void b(LocalThemeScope localThemeScope, final WeeklyAdDetailsCouponState viewState, final Function1<? super Qk.a, Unit> onCouponAction, Function0<Unit> onRetry, Composer composer, final int i10) {
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
            C4635o.k(localThemeScope2, viewState.getLoadingState(), null, onRetry, ComposableLambdaKt.c(1760233234, true, new a(viewState, localThemeScope, onCouponAction), composerStartRestartGroup, 54), composerStartRestartGroup, LocalThemeScope.f17314g | 24576 | (i11 & 14) | (Pj.a.f26096c << 3) | (i11 & 7168), 2);
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
        return Unit.f143329a;
    }
}
