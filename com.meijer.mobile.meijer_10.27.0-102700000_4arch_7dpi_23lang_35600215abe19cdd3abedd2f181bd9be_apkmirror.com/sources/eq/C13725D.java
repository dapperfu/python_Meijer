package eq;

import Ji.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import eq.C13725D;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: eq.D, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13725D {

    /* renamed from: a, reason: collision with root package name */
    public static final C13725D f129474a = new C13725D();

    /* renamed from: b, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f129475b = ComposableLambdaKt.composableLambdaInstance(-2114733400, false, b.f129478a);

    /* renamed from: c, reason: collision with root package name */
    private static Function3<LocalThemeScope, Composer, Integer, Unit> f129476c = ComposableLambdaKt.composableLambdaInstance(-205900217, false, a.f129477a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: eq.D$a */
    static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f129477a = new a();

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c() {
            return Unit.f142422a;
        }

        public final void b(LocalThemeScope AdsTheme, Composer composer, int i10) {
            Intrinsics.j(AdsTheme, "$this$AdsTheme");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-205900217, i10, -1, "com.meijer.mobile.shopandscan.presentation.component.ComposableSingletons$CheckoutButtonComponentKt.lambda$-205900217.<anonymous> (CheckoutButtonComponent.kt:101)");
            }
            Modifier modifierI = androidx.compose.foundation.layout.J.i(androidx.compose.foundation.layout.J.z(Modifier.INSTANCE, H1.h.p(240)), H1.h.p(48));
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: eq.C
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C13725D.a.c();
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C13747w.c(AdsTheme, modifierI, true, (Function0) objB, composer, LocalThemeScope.f15770g | 3504 | (i10 & 14), 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            b(localThemeScope, composer, num.intValue());
            return Unit.f142422a;
        }

        a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: eq.D$b */
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f129478a = new b();

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2114733400, i10, -1, "com.meijer.mobile.shopandscan.presentation.component.ComposableSingletons$CheckoutButtonComponentKt.lambda$-2114733400.<anonymous> (CheckoutButtonComponent.kt:92)");
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

        b() {
        }
    }

    public final Function2<Composer, Integer, Unit> a() {
        return f129475b;
    }
}
