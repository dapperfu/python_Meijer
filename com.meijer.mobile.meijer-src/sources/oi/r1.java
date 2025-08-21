package oi;

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
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public static final r1 f154246a = new r1();

    /* renamed from: b, reason: collision with root package name */
    private static Function3<InterfaceC14888I, Composer, Integer, Unit> f154247b = ComposableLambdaKt.composableLambdaInstance(1874006835, false, a.f154248a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f154248a = new a();

        public final void a(InterfaceC14888I interfaceC14888I, Composer composer, int i10) {
            Intrinsics.j(interfaceC14888I, "<this>");
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
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
            a(interfaceC14888I, composer, num.intValue());
            return Unit.f143329a;
        }

        a() {
        }
    }

    public final Function3<InterfaceC14888I, Composer, Integer, Unit> a() {
        return f154247b;
    }
}
