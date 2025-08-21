package u1;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.C6034t0;
import kotlin.AbstractC18269l;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0006\u001a\u00020\u00008\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, d2 = {"", "cacheSize", "Landroidx/compose/ui/text/w;", "a", "(ILandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/w;", "I", "DefaultCacheSize", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private static final int f163679a = 8;

    public static final androidx.compose.ui.text.w a(int i10, Composer composer, int i11, int i12) {
        boolean z10 = true;
        if ((i12 & 1) != 0) {
            i10 = f163679a;
        }
        if (ComposerKt.M()) {
            ComposerKt.U(1538166871, i11, -1, "androidx.compose.ui.text.rememberTextMeasurer (TextMeasurerHelper.kt:41)");
        }
        AbstractC18269l.b bVar = (AbstractC18269l.b) composer.o(C6034t0.i());
        H1.d dVar = (H1.d) composer.o(C6034t0.g());
        H1.t tVar = (H1.t) composer.o(C6034t0.m());
        boolean zV = composer.V(bVar) | composer.V(dVar) | composer.V(tVar);
        if ((((i11 & 14) ^ 6) <= 4 || !composer.d(i10)) && (i11 & 6) != 4) {
            z10 = false;
        }
        boolean z11 = zV | z10;
        Object objB = composer.B();
        if (z11 || objB == Composer.INSTANCE.a()) {
            objB = new androidx.compose.ui.text.w(bVar, dVar, tVar, i10);
            composer.t(objB);
        }
        androidx.compose.ui.text.w wVar = (androidx.compose.ui.text.w) objB;
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return wVar;
    }
}
