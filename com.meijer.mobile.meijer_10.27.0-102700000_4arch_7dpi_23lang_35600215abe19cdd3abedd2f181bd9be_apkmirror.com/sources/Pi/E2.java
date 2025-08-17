package Pi;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import j0.InterfaceC14800I;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class E2 {

    /* renamed from: a, reason: collision with root package name */
    public static final E2 f25758a = new E2();

    /* renamed from: b, reason: collision with root package name */
    private static Function3<InterfaceC14800I, Composer, Integer, Unit> f25759b = ComposableLambdaKt.composableLambdaInstance(-406195119, false, a.f25761a);

    /* renamed from: c, reason: collision with root package name */
    private static Function3<InterfaceC14800I, Composer, Integer, Unit> f25760c = ComposableLambdaKt.composableLambdaInstance(2048404026, false, b.f25762a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f25761a = new a();

        public final void a(InterfaceC14800I Button, Composer composer, int i10) {
            Intrinsics.j(Button, "$this$Button");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-406195119, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ComposableSingletons$BadgeShowcaseKt.lambda$-406195119.<anonymous> (BadgeShowcase.kt:212)");
            }
            kotlin.N1.b("Decrease Count", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
            a(interfaceC14800I, composer, num.intValue());
            return Unit.f142422a;
        }

        a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f25762a = new b();

        public final void a(InterfaceC14800I Button, Composer composer, int i10) {
            Intrinsics.j(Button, "$this$Button");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2048404026, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ComposableSingletons$BadgeShowcaseKt.lambda$2048404026.<anonymous> (BadgeShowcase.kt:222)");
            }
            kotlin.N1.b("Increase Count", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
            a(interfaceC14800I, composer, num.intValue());
            return Unit.f142422a;
        }

        b() {
        }
    }

    public final Function3<InterfaceC14800I, Composer, Integer, Unit> a() {
        return f25759b;
    }

    public final Function3<InterfaceC14800I, Composer, Integer, Unit> b() {
        return f25760c;
    }
}
