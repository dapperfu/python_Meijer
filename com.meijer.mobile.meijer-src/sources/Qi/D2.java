package Qi;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import j0.C14890K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.InterfaceC15433c;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class D2 {

    /* renamed from: a, reason: collision with root package name */
    public static final D2 f28441a = new D2();

    /* renamed from: b, reason: collision with root package name */
    private static Function3<InterfaceC15433c, Composer, Integer, Unit> f28442b = ComposableLambdaKt.composableLambdaInstance(141707594, false, a.f28443a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f28443a = new a();

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(141707594, i10, -1, "com.meijer.mobile.androidacres.showcase.components.ComposableSingletons$AnnotatedLabelShowcaseKt.lambda$141707594.<anonymous> (AnnotatedLabelShowcase.kt:114)");
            }
            C14890K.a(androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, H1.h.p(8)), composer, 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }

        a() {
        }
    }

    public final Function3<InterfaceC15433c, Composer, Integer, Unit> a() {
        return f28442b;
    }
}
