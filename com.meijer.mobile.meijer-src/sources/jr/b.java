package jr;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import bk.AbstractC6392a;
import j0.InterfaceC14888I;
import jr.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f141194a = new b();

    /* renamed from: b, reason: collision with root package name */
    private static Function3<InterfaceC14888I, Composer, Integer, Unit> f141195b = ComposableLambdaKt.composableLambdaInstance(861462431, false, C2237b.f141198a);

    /* renamed from: c, reason: collision with root package name */
    private static Function3<LocalThemeScope, Composer, Integer, Unit> f141196c = ComposableLambdaKt.composableLambdaInstance(1042834413, false, a.f141197a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f141197a = new a();

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c() {
            return Unit.f143329a;
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
                ComposerKt.U(1042834413, i10, -1, "com.meijer.mobile.subscription.ui.ComposableSingletons$SubscriptionToolbarKt.lambda$1042834413.<anonymous> (SubscriptionToolbar.kt:49)");
            }
            AbstractC6392a abstractC6392aC = AbstractC6392a.INSTANCE.c("back");
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: jr.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return b.a.c();
                    }
                };
                composer.t(objB);
            }
            composer.P();
            m.c(AdsTheme, null, "Title", abstractC6392aC, null, (Function0) objB, null, composer, (i10 & 14) | 196992 | LocalThemeScope.f17314g | (AbstractC6392a.f60445b << 9), 41);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            b(localThemeScope, composer, num.intValue());
            return Unit.f143329a;
        }

        a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jr.b$b, reason: collision with other inner class name */
    static final class C2237b implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C2237b f141198a = new C2237b();

        public final void a(InterfaceC14888I interfaceC14888I, Composer composer, int i10) {
            Intrinsics.j(interfaceC14888I, "<this>");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(861462431, i10, -1, "com.meijer.mobile.subscription.ui.ComposableSingletons$SubscriptionToolbarKt.lambda$861462431.<anonymous> (SubscriptionToolbar.kt:27)");
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
            a(interfaceC14888I, composer, num.intValue());
            return Unit.f143329a;
        }

        C2237b() {
        }
    }

    public final Function3<InterfaceC14888I, Composer, Integer, Unit> a() {
        return f141195b;
    }
}
