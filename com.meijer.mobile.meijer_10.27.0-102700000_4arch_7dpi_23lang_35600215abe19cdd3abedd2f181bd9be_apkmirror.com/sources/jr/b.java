package jr;

import Ji.LocalThemeScope;
import ak.AbstractC5607a;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import j0.InterfaceC14800I;
import jr.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f140993a = new b();

    /* renamed from: b, reason: collision with root package name */
    private static Function3<InterfaceC14800I, Composer, Integer, Unit> f140994b = ComposableLambdaKt.composableLambdaInstance(861462431, false, C2232b.f140997a);

    /* renamed from: c, reason: collision with root package name */
    private static Function3<LocalThemeScope, Composer, Integer, Unit> f140995c = ComposableLambdaKt.composableLambdaInstance(1042834413, false, a.f140996a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f140996a = new a();

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
                ComposerKt.U(1042834413, i10, -1, "com.meijer.mobile.subscription.ui.ComposableSingletons$SubscriptionToolbarKt.lambda$1042834413.<anonymous> (SubscriptionToolbar.kt:49)");
            }
            AbstractC5607a abstractC5607aC = AbstractC5607a.INSTANCE.c("back");
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
            m.c(AdsTheme, null, "Title", abstractC5607aC, null, (Function0) objB, null, composer, (i10 & 14) | 196992 | LocalThemeScope.f15770g | (AbstractC5607a.f45514b << 9), 41);
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
    /* renamed from: jr.b$b, reason: collision with other inner class name */
    static final class C2232b implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C2232b f140997a = new C2232b();

        public final void a(InterfaceC14800I interfaceC14800I, Composer composer, int i10) {
            Intrinsics.j(interfaceC14800I, "<this>");
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
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
            a(interfaceC14800I, composer, num.intValue());
            return Unit.f142422a;
        }

        C2232b() {
        }
    }

    public final Function3<InterfaceC14800I, Composer, Integer, Unit> a() {
        return f140994b;
    }
}
