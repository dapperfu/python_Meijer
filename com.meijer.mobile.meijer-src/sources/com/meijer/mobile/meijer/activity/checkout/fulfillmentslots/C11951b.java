package com.meijer.mobile.meijer.activity.checkout.fulfillmentslots;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import bk.AbstractC6392a;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.AbstractC11980m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C11951b {

    /* renamed from: a, reason: collision with root package name */
    public static final C11951b f103738a = new C11951b();

    /* renamed from: b, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f103739b = ComposableLambdaKt.composableLambdaInstance(1548947037, false, c.f103744a);

    /* renamed from: c, reason: collision with root package name */
    private static Function3<LocalThemeScope, Composer, Integer, Unit> f103740c = ComposableLambdaKt.composableLambdaInstance(1122000002, false, C1462b.f103743a);

    /* renamed from: d, reason: collision with root package name */
    private static Function3<LocalThemeScope, Composer, Integer, Unit> f103741d = ComposableLambdaKt.composableLambdaInstance(-1938355279, false, a.f103742a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.b$a */
    static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f103742a = new a();

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
                ComposerKt.U(-1938355279, i11, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.ComposableSingletons$FulfillmentScreenRedesignedKt.lambda$-1938355279.<anonymous> (FulfillmentScreenRedesigned.kt:918)");
            }
            Q.P(AdsTheme, null, null, false, false, false, null, null, null, composer, LocalThemeScope.f17314g | (i11 & 14), l3.f93323c);
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
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.b$b, reason: collision with other inner class name */
    static final class C1462b implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C1462b f103743a = new C1462b();

        C1462b() {
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
                ComposerKt.U(1122000002, i10, -1, "com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.ComposableSingletons$FulfillmentScreenRedesignedKt.lambda$1122000002.<anonymous> (FulfillmentScreenRedesigned.kt:744)");
            }
            Q.V(AdsTheme, null, new AbstractC11980m.HeaderItem(AbstractC6392a.INSTANCE.c("Foo"), null, 2, null), composer, (i10 & 14) | LocalThemeScope.f17314g | (AbstractC6392a.f60445b << 6), 1);
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
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.b$c */
    static final class c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f103744a = new c();

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
            return Unit.f143329a;
        }
    }

    public final Function2<Composer, Integer, Unit> a() {
        return f103739b;
    }
}
