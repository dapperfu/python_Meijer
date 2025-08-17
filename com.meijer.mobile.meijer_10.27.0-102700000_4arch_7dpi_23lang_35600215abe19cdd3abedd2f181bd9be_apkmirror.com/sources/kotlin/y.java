package kotlin;

import android.view.ViewConfiguration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.C5892t0;
import kotlin.C6288A;
import kotlin.InterfaceC6342y;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\u001b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"T", "Lc0/y;", "b", "(Landroidx/compose/runtime/Composer;I)Lc0/y;", "", "a", "F", "()F", "platformFlingScrollFriction", "animation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private static final float f59642a = ViewConfiguration.getScrollFriction();

    public static final float a() {
        return f59642a;
    }

    public static final <T> InterfaceC6342y<T> b(Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(904445851, i10, -1, "androidx.compose.animation.rememberSplineBasedDecay (SplineBasedFloatDecayAnimationSpec.android.kt:40)");
        }
        H1.d dVar = (H1.d) composer.o(C5892t0.g());
        boolean zB = composer.b(dVar.getDensity());
        Object objB = composer.B();
        if (zB || objB == Composer.INSTANCE.a()) {
            objB = C6288A.d(new x(dVar));
            composer.t(objB);
        }
        InterfaceC6342y<T> interfaceC6342y = (InterfaceC6342y) objB;
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return interfaceC6342y;
    }
}
