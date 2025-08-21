package kotlin;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.InterfaceC15878k;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lo0/C;", "state", "", "beyondViewportPageCount", "Ln0/k;", "a", "(Lo0/C;ILandroidx/compose/runtime/Composer;I)Ln0/k;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: o0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16047h {
    public static final InterfaceC15878k a(AbstractC16037C abstractC16037C, int i10, Composer composer, int i11) {
        boolean z10;
        if (ComposerKt.M()) {
            ComposerKt.U(373558254, i11, -1, "androidx.compose.foundation.pager.rememberPagerBeyondBoundsState (PagerBeyondBoundsModifier.kt:25)");
        }
        boolean z11 = false;
        if ((((i11 & 14) ^ 6) > 4 && composer.V(abstractC16037C)) || (i11 & 6) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((((i11 & 112) ^ 48) > 32 && composer.d(i10)) || (i11 & 48) == 32) {
            z11 = true;
        }
        boolean z12 = z10 | z11;
        Object objB = composer.B();
        if (z12 || objB == Composer.INSTANCE.a()) {
            objB = new C16048i(abstractC16037C, i10);
            composer.t(objB);
        }
        C16048i c16048i = (C16048i) objB;
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return c16048i;
    }
}
