package Qi;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import j0.InterfaceC14888I;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import r0.C16806i;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class B5 {

    /* renamed from: a, reason: collision with root package name */
    public static final B5 f28383a = new B5();

    /* renamed from: b, reason: collision with root package name */
    private static Function2<Composer, Integer, Unit> f28384b = ComposableLambdaKt.composableLambdaInstance(-1676081050, false, b.f28388a);

    /* renamed from: c, reason: collision with root package name */
    private static Function3<InterfaceC14888I, Composer, Integer, Unit> f28385c = ComposableLambdaKt.composableLambdaInstance(-1398118445, false, a.f28387a);

    /* renamed from: d, reason: collision with root package name */
    private static Function3<InterfaceC14888I, Composer, Integer, Unit> f28386d = ComposableLambdaKt.composableLambdaInstance(81769148, false, c.f28389a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f28387a = new a();

        public final void a(InterfaceC14888I Button, Composer composer, int i10) {
            Intrinsics.j(Button, "$this$Button");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1398118445, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ComposableSingletons$ProgressIndicatorShowcaseKt.lambda$-1398118445.<anonymous> (ProgressIndicatorShowcase.kt:294)");
            }
            kotlin.N1.b("Randomize price", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
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
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f28388a = new b();

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1676081050, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ComposableSingletons$ProgressIndicatorShowcaseKt.lambda$-1676081050.<anonymous> (ProgressIndicatorShowcase.kt:212)");
            }
            c5.v.a("https://upload.wikimedia.org/wikipedia/commons/d/d4/Cat_March_2010-1a.jpg", null, T0.e.a(Modifier.INSTANCE, C16806i.f()), null, null, null, null, 0.0f, null, 0, false, null, composer, 54, 0, 4088);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }

        b() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f28389a = new c();

        public final void a(InterfaceC14888I Button, Composer composer, int i10) {
            Intrinsics.j(Button, "$this$Button");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(81769148, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ComposableSingletons$ProgressIndicatorShowcaseKt.lambda$81769148.<anonymous> (ProgressIndicatorShowcase.kt:305)");
            }
            kotlin.N1.b("Randomize quantity", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
            a(interfaceC14888I, composer, num.intValue());
            return Unit.f143329a;
        }

        c() {
        }
    }

    public final Function3<InterfaceC14888I, Composer, Integer, Unit> a() {
        return f28385c;
    }

    public final Function2<Composer, Integer, Unit> b() {
        return f28384b;
    }

    public final Function3<InterfaceC14888I, Composer, Integer, Unit> c() {
        return f28386d;
    }
}
