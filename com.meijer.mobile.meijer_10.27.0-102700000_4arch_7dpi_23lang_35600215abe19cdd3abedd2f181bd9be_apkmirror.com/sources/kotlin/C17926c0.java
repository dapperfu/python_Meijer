package kotlin;

import V0.C5346q0;
import V0.D1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.n0;
import r0.AbstractC16684a;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\u000f\u001a\u00020\u000b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00108Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0017\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0018\u001a\u00020\u00108Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\f\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Lx0/c0;", "", "<init>", "()V", "Lc0/n0;", "", "b", "Lc0/n0;", "getAnimationSpec", "()Lc0/n0;", "AnimationSpec", "LH1/h;", "c", "F", "()F", "Elevation", "LV0/q0;", "a", "(Landroidx/compose/runtime/Composer;I)J", "backgroundColor", "LV0/D1;", "d", "(Landroidx/compose/runtime/Composer;I)LV0/D1;", "shape", "scrimColor", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17926c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C17926c0 f167725a = new C17926c0();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final n0<Float> AnimationSpec = new n0<>(256, 0, null, 6, null);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float Elevation = H1.h.p(16);

    public final float b() {
        return Elevation;
    }

    private C17926c0() {
    }

    @JvmName
    public final long a(Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(-788676020, i10, -1, "androidx.compose.material.DrawerDefaults.<get-backgroundColor> (Drawer.kt:708)");
        }
        long jN = C17877E0.f166879a.a(composer, 6).n();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return jN;
    }

    @JvmName
    public final long c(Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(617225966, i10, -1, "androidx.compose.material.DrawerDefaults.<get-scrimColor> (Drawer.kt:719)");
        }
        long jQ = C5346q0.q(C17877E0.f166879a.a(composer, 6).i(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return jQ;
    }

    @JvmName
    public final D1 d(Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(2041803618, i10, -1, "androidx.compose.material.DrawerDefaults.<get-shape> (Drawer.kt:715)");
        }
        AbstractC16684a large = C17877E0.f166879a.b(composer, 6).getLarge();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return large;
    }
}
