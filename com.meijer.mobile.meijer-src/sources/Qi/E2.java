package Qi;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import j0.InterfaceC14888I;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class E2 {

    /* renamed from: a, reason: collision with root package name */
    public static final E2 f28470a = new E2();

    /* renamed from: b, reason: collision with root package name */
    private static Function3<InterfaceC14888I, Composer, Integer, Unit> f28471b = ComposableLambdaKt.composableLambdaInstance(-406195119, false, a.f28473a);

    /* renamed from: c, reason: collision with root package name */
    private static Function3<InterfaceC14888I, Composer, Integer, Unit> f28472c = ComposableLambdaKt.composableLambdaInstance(2048404026, false, b.f28474a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f28473a = new a();

        public final void a(InterfaceC14888I Button, Composer composer, int i10) {
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
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
            a(interfaceC14888I, composer, num.intValue());
            return Unit.f143329a;
        }

        a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f28474a = new b();

        public final void a(InterfaceC14888I Button, Composer composer, int i10) {
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
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
            a(interfaceC14888I, composer, num.intValue());
            return Unit.f143329a;
        }

        b() {
        }
    }

    public final Function3<InterfaceC14888I, Composer, Integer, Unit> a() {
        return f28471b;
    }

    public final Function3<InterfaceC14888I, Composer, Integer, Unit> b() {
        return f28472c;
    }
}
