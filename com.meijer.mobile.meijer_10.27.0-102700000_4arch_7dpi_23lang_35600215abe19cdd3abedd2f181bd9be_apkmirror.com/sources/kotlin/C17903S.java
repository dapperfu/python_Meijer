package kotlin;

import V0.C5349s0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0017ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"Lx0/S;", "Lx0/j0;", "<init>", "()V", "LV0/q0;", "color", "LH1/h;", "elevation", "a", "(JFLandroidx/compose/runtime/Composer;I)J", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C17903S implements InterfaceC17947j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C17903S f167408a = new C17903S();

    private C17903S() {
    }

    @Override // kotlin.InterfaceC17947j0
    public long a(long j10, float f10, Composer composer, int i10) {
        composer.startReplaceGroup(-1687113661);
        if (ComposerKt.M()) {
            ComposerKt.U(-1687113661, i10, -1, "androidx.compose.material.DefaultElevationOverlay.apply (ElevationOverlay.kt:67)");
        }
        Colors colorsA = C17877E0.f166879a.a(composer, 6);
        if (H1.h.o(f10, H1.h.p(0)) > 0 && !colorsA.o()) {
            composer.startReplaceGroup(1169017931);
            j10 = C5349s0.g(C17950k0.b(j10, f10, composer, i10 & 126), j10);
            composer.P();
        } else {
            composer.startReplaceGroup(1169156439);
            composer.P();
        }
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return j10;
    }
}
