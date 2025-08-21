package Ok;

import Ki.K;
import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f24454a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static Function3<LocalThemeScope, Composer, Integer, Unit> f24455b = ComposableLambdaKt.composableLambdaInstance(2062268515, false, b.f24458a);

    /* renamed from: c, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f24456c = ComposableLambdaKt.composableLambdaInstance(-755905454, false, C0396a.f24457a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ok.a$a, reason: collision with other inner class name */
    static final class C0396a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0396a f24457a = new C0396a();

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-755905454, i10, -1, "com.meijer.mobile.coupon.dashboard.ComposableSingletons$CouponsDashboardActivityKt.lambda$-755905454.<anonymous> (CouponsDashboardActivity.kt:25)");
            }
            K.b(null, a.f24454a.b(), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }

        C0396a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f24458a = new b();

        public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
            Intrinsics.j(AdsTheme, "$this$AdsTheme");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2062268515, i10, -1, "com.meijer.mobile.coupon.dashboard.ComposableSingletons$CouponsDashboardActivityKt.lambda$2062268515.<anonymous> (CouponsDashboardActivity.kt:26)");
            }
            c.b(AdsTheme, null, composer, (i10 & 14) | LocalThemeScope.f17314g, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            a(localThemeScope, composer, num.intValue());
            return Unit.f143329a;
        }

        b() {
        }
    }

    public final Function2<Composer, Integer, Unit> a() {
        return f24456c;
    }

    public final Function3<LocalThemeScope, Composer, Integer, Unit> b() {
        return f24455b;
    }
}
