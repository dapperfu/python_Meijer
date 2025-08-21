package V0;

import V0.I1;
import android.graphics.Shader;
import android.os.Build;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0004"}, d2 = {"LV0/I1;", "Landroid/graphics/Shader$TileMode;", "a", "(I)Landroid/graphics/Shader$TileMode;", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Y {
    public static final Shader.TileMode a(int i10) {
        I1.Companion companion = I1.INSTANCE;
        return I1.f(i10, companion.a()) ? Shader.TileMode.CLAMP : I1.f(i10, companion.d()) ? Shader.TileMode.REPEAT : I1.f(i10, companion.c()) ? Shader.TileMode.MIRROR : I1.f(i10, companion.b()) ? Build.VERSION.SDK_INT >= 31 ? K1.f39281a.a() : Shader.TileMode.CLAMP : Shader.TileMode.CLAMP;
    }
}
