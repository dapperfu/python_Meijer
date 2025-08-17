package m0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.InterfaceC15751k;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lm0/I;", "state", "Ln0/k;", "a", "(Lm0/I;Landroidx/compose/runtime/Composer;I)Ln0/k;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: m0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15519e {
    public static final InterfaceC15751k a(C15512I c15512i, Composer composer, int i10) {
        boolean z10;
        if (ComposerKt.M()) {
            ComposerKt.U(2004349821, i10, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridBeyondBoundsState (LazyGridBeyondBoundsModifier.kt:24)");
        }
        if ((((i10 & 14) ^ 6) > 4 && composer.V(c15512i)) || (i10 & 6) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object objB = composer.B();
        if (z10 || objB == Composer.INSTANCE.a()) {
            objB = new C15520f(c15512i);
            composer.t(objB);
        }
        C15520f c15520f = (C15520f) objB;
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return c15520f;
    }
}
