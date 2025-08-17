package Sq;

import Ji.K;
import Ji.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f34682a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static Function3<LocalThemeScope, Composer, Integer, Unit> f34683b = ComposableLambdaKt.composableLambdaInstance(1253217376, false, b.f34686a);

    /* renamed from: c, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f34684c = ComposableLambdaKt.composableLambdaInstance(-212875247, false, C0767a.f34685a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Sq.a$a, reason: collision with other inner class name */
    static final class C0767a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0767a f34685a = new C0767a();

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-212875247, i10, -1, "com.meijer.mobile.singlepagecheckout.wic.ComposableSingletons$AddWicActivityKt.lambda$-212875247.<anonymous> (AddWicActivity.kt:22)");
            }
            K.b(null, a.f34682a.b(), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }

        C0767a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f34686a = new b();

        public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
            Intrinsics.j(AdsTheme, "$this$AdsTheme");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1253217376, i10, -1, "com.meijer.mobile.singlepagecheckout.wic.ComposableSingletons$AddWicActivityKt.lambda$1253217376.<anonymous> (AddWicActivity.kt:23)");
            }
            e.d(composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            a(localThemeScope, composer, num.intValue());
            return Unit.f142422a;
        }

        b() {
        }
    }

    public final Function2<Composer, Integer, Unit> a() {
        return f34684c;
    }

    public final Function3<LocalThemeScope, Composer, Integer, Unit> b() {
        return f34683b;
    }
}
