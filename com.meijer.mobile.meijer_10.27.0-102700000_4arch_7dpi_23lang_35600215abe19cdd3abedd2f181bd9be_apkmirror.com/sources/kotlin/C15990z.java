package kotlin;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.InterfaceC15725K;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lo0/C;", "state", "", "isVertical", "Ln0/K;", "a", "(Lo0/C;ZLandroidx/compose/runtime/Composer;I)Ln0/K;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: o0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15990z {
    public static final InterfaceC15725K a(AbstractC15962C abstractC15962C, boolean z10, Composer composer, int i10) {
        boolean z11;
        if (ComposerKt.M()) {
            ComposerKt.U(-786344289, i10, -1, "androidx.compose.foundation.pager.rememberPagerSemanticState (PagerSemantics.kt:26)");
        }
        boolean z12 = false;
        if ((((i10 & 14) ^ 6) > 4 && composer.V(abstractC15962C)) || (i10 & 6) == 4) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((((i10 & 112) ^ 48) > 32 && composer.a(z10)) || (i10 & 48) == 32) {
            z12 = true;
        }
        boolean z13 = z11 | z12;
        Object objB = composer.B();
        if (z13 || objB == Composer.INSTANCE.a()) {
            objB = C15968d.a(abstractC15962C, z10);
            composer.t(objB);
        }
        InterfaceC15725K interfaceC15725K = (InterfaceC15725K) objB;
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return interfaceC15725K;
    }
}
