package ln;

import V0.C5346q0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import j0.InterfaceC14800I;
import kotlin.Metadata;
import kotlin.N1;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f148989a = new j();

    /* renamed from: b, reason: collision with root package name */
    private static Function3<InterfaceC14800I, Composer, Integer, Unit> f148990b = ComposableLambdaKt.composableLambdaInstance(1309544871, false, a.f148991a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f148991a = new a();

        public final void a(InterfaceC14800I OutlinedButton, Composer composer, int i10) {
            Intrinsics.j(OutlinedButton, "$this$OutlinedButton");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1309544871, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.ComposableSingletons$AppliedSavingsBottomSheetKt.lambda$1309544871.<anonymous> (AppliedSavingsBottomSheet.kt:237)");
            }
            N1.b("1", null, C5346q0.INSTANCE.a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 390, 0, 131066);
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
        return f148990b;
    }
}
