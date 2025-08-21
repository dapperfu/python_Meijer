package com.meijer.mobile.meijer.activity.substitution;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.fullstory.compose.FullStoryAnnotationsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.substitution.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C12655a {

    /* renamed from: a, reason: collision with root package name */
    public static final C12655a f113692a = new C12655a();

    /* renamed from: b, reason: collision with root package name */
    private static Function3<LocalThemeScope, Composer, Integer, Unit> f113693b = ComposableLambdaKt.composableLambdaInstance(-150201486, false, C1797a.f113695a);

    /* renamed from: c, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f113694c = ComposableLambdaKt.composableLambdaInstance(1513998561, false, b.f113696a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.substitution.a$a, reason: collision with other inner class name */
    static final class C1797a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C1797a f113695a = new C1797a();

        C1797a() {
        }

        public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
            int i11;
            Intrinsics.j(AdsTheme, "$this$AdsTheme");
            if ((i10 & 6) == 0) {
                i11 = i10 | ((i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-150201486, i11, -1, "com.meijer.mobile.meijer.activity.substitution.ComposableSingletons$FindSubstitutionActivityKt.lambda$-150201486.<anonymous> (FindSubstitutionActivity.kt:165)");
            }
            Mj.g.l(AdsTheme, FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), true, false, false, false, false, false, false, false, false, null, null, null, null, null, null, null, null, null, composer, LocalThemeScope.f17314g | 384 | (i11 & 14), 0, 524284);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            a(localThemeScope, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.substitution.a$b */
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f113696a = new b();

        b() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1513998561, i10, -1, "com.meijer.mobile.meijer.activity.substitution.ComposableSingletons$FindSubstitutionActivityKt.lambda$1513998561.<anonymous> (FindSubstitutionActivity.kt:164)");
            }
            Ki.K.b(null, C12655a.f113692a.a(), composer, 48, 1);
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

    public final Function3<LocalThemeScope, Composer, Integer, Unit> a() {
        return f113693b;
    }

    public final Function2<Composer, Integer, Unit> b() {
        return f113694c;
    }
}
