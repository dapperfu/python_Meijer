package kotlin;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Lx0/t0;", "", "<init>", "()V", "LH1/h;", "defaultElevation", "pressedElevation", "hoveredElevation", "focusedElevation", "Lx0/u0;", "a", "(FFFFLandroidx/compose/runtime/Composer;II)Lx0/u0;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18042t0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C18042t0 f169756a = new C18042t0();

    /* renamed from: b, reason: collision with root package name */
    public static final int f169757b = 0;

    public final InterfaceC18044u0 a(float f10, float f11, float f12, float f13, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = H1.h.p(6);
        }
        float f14 = f10;
        if ((i11 & 2) != 0) {
            f11 = H1.h.p(12);
        }
        float f15 = f11;
        if ((i11 & 4) != 0) {
            f12 = H1.h.p(8);
        }
        float f16 = f12;
        if ((i11 & 8) != 0) {
            f13 = H1.h.p(8);
        }
        float f17 = f13;
        if (ComposerKt.M()) {
            ComposerKt.U(380403812, i10, -1, "androidx.compose.material.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:238)");
        }
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && composer.b(f14)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && composer.b(f15)) || (i10 & 48) == 32) | ((((i10 & 896) ^ 384) > 256 && composer.b(f16)) || (i10 & 384) == 256) | ((((i10 & 7168) ^ 3072) > 2048 && composer.b(f17)) || (i10 & 3072) == 2048);
        Object objB = composer.B();
        if (z10 || objB == Composer.INSTANCE.a()) {
            C17971T c17971t = new C17971T(f14, f15, f16, f17, null);
            composer.t(c17971t);
            objB = c17971t;
        }
        C17971T c17971t2 = (C17971T) objB;
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return c17971t2;
    }

    private C18042t0() {
    }
}
