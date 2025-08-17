package V0;

import android.graphics.DashPathEffect;
import android.graphics.PathEffect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LV0/r1;", "Landroid/graphics/PathEffect;", "b", "(LV0/r1;)Landroid/graphics/PathEffect;", "", "intervals", "", "phase", "a", "([FF)LV0/r1;", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class T {
    public static final r1 a(float[] fArr, float f10) {
        return new S(new DashPathEffect(fArr, f10));
    }

    public static final PathEffect b(r1 r1Var) {
        Intrinsics.h(r1Var, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        return ((S) r1Var).getNativePathEffect();
    }
}
