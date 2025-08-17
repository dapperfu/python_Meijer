package com.meijer.mobile.meijer.activity.checkout.fulfillmentslots;

import Ji.LocalThemeScope;
import ak.AbstractC5607a;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.AbstractC11855m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11826b {

    /* renamed from: a, reason: collision with root package name */
    public static final C11826b f102883a = new C11826b();

    /* renamed from: b, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f102884b = ComposableLambdaKt.composableLambdaInstance(1548947037, false, c.f102889a);

    /* renamed from: c, reason: collision with root package name */
    private static Function3<LocalThemeScope, Composer, Integer, Unit> f102885c = ComposableLambdaKt.composableLambdaInstance(1122000002, false, C1453b.f102888a);

    /* renamed from: d, reason: collision with root package name */
    private static Function3<LocalThemeScope, Composer, Integer, Unit> f102886d = ComposableLambdaKt.composableLambdaInstance(-1938355279, false, a.f102887a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.b$a */
    static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f102887a = new a();

        a() {
        }

        public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
            int i11;
            Intrinsics.j(AdsTheme, "$this$AdsTheme");
            if ((i10 & 6) == 0) {
                i11 = ((i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1938355279, i11, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.ComposableSingletons$FulfillmentScreenRedesignedKt.lambda$-1938355279.<anonymous> (FulfillmentScreenRedesigned.kt:898)");
            }
            Q.P(AdsTheme, null, null, false, false, false, null, null, null, composer, LocalThemeScope.f15770g | (i11 & 14), l3.f92484c);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            a(localThemeScope, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.b$b, reason: collision with other inner class name */
    static final class C1453b implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C1453b f102888a = new C1453b();

        C1453b() {
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
                ComposerKt.U(1122000002, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.ComposableSingletons$FulfillmentScreenRedesignedKt.lambda$1122000002.<anonymous> (FulfillmentScreenRedesigned.kt:724)");
            }
            Q.V(AdsTheme, null, new AbstractC11855m.HeaderItem(AbstractC5607a.INSTANCE.c("Foo"), null, 2, null), composer, (i10 & 14) | LocalThemeScope.f15770g | (AbstractC5607a.f45514b << 6), 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            a(localThemeScope, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.b$c */
    static final class c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f102889a = new c();

        c() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1548947037, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.ComposableSingletons$FulfillmentScreenRedesignedKt.lambda$1548947037.<anonymous> (FulfillmentScreenRedesigned.kt:165)");
            }
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

    public final Function2<Composer, Integer, Unit> a() {
        return f102884b;
    }
}
