package ni;

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
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public static final r1 f151787a = new r1();

    /* renamed from: b, reason: collision with root package name */
    private static Function3<InterfaceC14800I, Composer, Integer, Unit> f151788b = ComposableLambdaKt.composableLambdaInstance(1874006835, false, a.f151789a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f151789a = new a();

        public final void a(InterfaceC14800I interfaceC14800I, Composer composer, int i10) {
            Intrinsics.j(interfaceC14800I, "<this>");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1874006835, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.ComposableSingletons$ChipComposableKt.lambda$1874006835.<anonymous> (ChipComposable.kt:95)");
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

        a() {
        }
    }

    public final Function3<InterfaceC14800I, Composer, Integer, Unit> a() {
        return f151788b;
    }
}
