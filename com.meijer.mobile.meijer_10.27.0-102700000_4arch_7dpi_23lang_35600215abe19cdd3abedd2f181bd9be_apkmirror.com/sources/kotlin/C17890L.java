package kotlin;

import V0.C5346q0;
import V0.C5349s0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\r\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0011\u0010\u000f\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\n¨\u0006\u0010"}, d2 = {"Lx0/L;", "", "<init>", "()V", "", "highContrastAlpha", "lowContrastAlpha", "a", "(FFLandroidx/compose/runtime/Composer;I)F", "c", "(Landroidx/compose/runtime/Composer;I)F", "high", "d", "medium", "b", "disabled", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17890L {

    /* renamed from: a, reason: collision with root package name */
    public static final C17890L f167124a = new C17890L();

    /* renamed from: b, reason: collision with root package name */
    public static final int f167125b = 0;

    private C17890L() {
    }

    private final float a(float f10, float f11, Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(-1528360391, i10, -1, "androidx.compose.material.ContentAlpha.contentAlpha (ContentAlpha.kt:77)");
        }
        long value = ((C5346q0) composer.o(C17894N.a())).getValue();
        if (!C17877E0.f166879a.a(composer, 6).o() ? C5349s0.i(value) >= 0.5d : C5349s0.i(value) <= 0.5d) {
            f10 = f11;
        }
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return f10;
    }

    @JvmName
    public final float b(Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(621183615, i10, -1, "androidx.compose.material.ContentAlpha.<get-disabled> (ContentAlpha.kt:60)");
        }
        float fA = a(0.38f, 0.38f, composer, ((i10 << 6) & 896) | 54);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return fA;
    }

    @JvmName
    public final float c(Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(629162431, i10, -1, "androidx.compose.material.ContentAlpha.<get-high> (ContentAlpha.kt:36)");
        }
        float fA = a(1.0f, 0.87f, composer, ((i10 << 6) & 896) | 54);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return fA;
    }

    @JvmName
    public final float d(Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(1999054879, i10, -1, "androidx.compose.material.ContentAlpha.<get-medium> (ContentAlpha.kt:48)");
        }
        float fA = a(0.74f, 0.6f, composer, ((i10 << 6) & 896) | 54);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return fA;
    }
}
