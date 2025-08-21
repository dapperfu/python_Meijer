package com.meijer.mobile.singlepagecheckout;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.singlepagecheckout.i, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13056i {

    /* renamed from: a, reason: collision with root package name */
    public static final C13056i f119228a = new C13056i();

    /* renamed from: b, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f119229b = ComposableLambdaKt.composableLambdaInstance(-699889955, false, a.f119231a);

    /* renamed from: c, reason: collision with root package name */
    private static Function3<LocalThemeScope, Composer, Integer, Unit> f119230c = ComposableLambdaKt.composableLambdaInstance(1045983605, false, b.f119232a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.singlepagecheckout.i$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f119231a = new a();

        a() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-699889955, i10, -1, "com.meijer.mobile.singlepagecheckout.ComposableSingletons$FulfillmentSlotsCardKt.lambda$-699889955.<anonymous> (FulfillmentSlotsCard.kt:63)");
            }
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.singlepagecheckout.i$b */
    static final class b implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f119232a = new b();

        b() {
        }

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
                ComposerKt.U(1045983605, i10, -1, "com.meijer.mobile.singlepagecheckout.ComposableSingletons$FulfillmentSlotsCardKt.lambda$1045983605.<anonymous> (FulfillmentSlotsCard.kt:172)");
            }
            C13066l0.f(AdsTheme, Modifier.INSTANCE, "Error Title", "Something went wrong. Please try again later.", composer, LocalThemeScope.f17314g | 3504 | (i10 & 14), 0);
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

    public final Function2<Composer, Integer, Unit> a() {
        return f119229b;
    }
}
