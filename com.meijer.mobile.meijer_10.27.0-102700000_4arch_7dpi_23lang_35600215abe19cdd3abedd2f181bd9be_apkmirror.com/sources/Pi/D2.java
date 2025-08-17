package Pi;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import j0.C14802K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.InterfaceC15343c;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class D2 {

    /* renamed from: a, reason: collision with root package name */
    public static final D2 f25729a = new D2();

    /* renamed from: b, reason: collision with root package name */
    private static Function3<InterfaceC15343c, Composer, Integer, Unit> f25730b = ComposableLambdaKt.composableLambdaInstance(141707594, false, a.f25731a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f25731a = new a();

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(141707594, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ComposableSingletons$AnnotatedLabelShowcaseKt.lambda$141707594.<anonymous> (AnnotatedLabelShowcase.kt:114)");
            }
            C14802K.a(androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, H1.h.p(8)), composer, 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }

        a() {
        }
    }

    public final Function3<InterfaceC15343c, Composer, Integer, Unit> a() {
        return f25730b;
    }
}
