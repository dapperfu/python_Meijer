package kotlin;

import V0.C5489q0;
import V0.C5492s0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.SelectionColors;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\n\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a*\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a*\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a2\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\"\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Lx0/D;", "colors", "Lw0/V;", "e", "(Lx0/D;Landroidx/compose/runtime/Composer;I)Lw0/V;", "LV0/q0;", "selectionColor", "textColor", "backgroundColor", "d", "(JJJ)J", "", "a", "(JJJ)F", "selectionColorAlpha", "c", "(JFJJ)F", "foreground", "background", "b", "(JJ)F", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.D0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17941D0 {
    private static final float a(long j10, long j11, long j12) {
        int i10 = 0;
        float f10 = 0.2f;
        float f11 = 0.4f;
        float f12 = 0.4f;
        while (i10 < 7) {
            long j13 = j10;
            long j14 = j11;
            long j15 = j12;
            float fC = (c(j13, f11, j14, j15) / 4.5f) - 1.0f;
            if (0.0f <= fC && fC <= 0.01f) {
                return f11;
            }
            if (fC < 0.0f) {
                f12 = f11;
            } else {
                f10 = f11;
            }
            f11 = (f12 + f10) / 2.0f;
            i10++;
            j10 = j13;
            j11 = j14;
            j12 = j15;
        }
        return f11;
    }

    private static final float c(long j10, float f10, long j11, long j12) {
        long jG = C5492s0.g(C5489q0.q(j10, f10, 0.0f, 0.0f, 0.0f, 14, null), j12);
        return b(C5492s0.g(j11, jG), jG);
    }

    public static final SelectionColors e(Colors colors, Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(-721696685, i10, -1, "androidx.compose.material.rememberTextSelectionColors (MaterialTextSelectionColors.kt:35)");
        }
        long j10 = colors.j();
        long jC = colors.c();
        composer.startReplaceGroup(1102762852);
        long jA = C17942E.a(colors, jC);
        if (jA == 16) {
            jA = ((C5489q0) composer.o(C17960N.a())).getValue();
        }
        long j11 = jA;
        composer.P();
        long jQ = C5489q0.q(j11, C17956L.f168212a.d(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        boolean zE = composer.e(j10) | composer.e(jC) | composer.e(jQ);
        Object objB = composer.B();
        if (zE || objB == Composer.INSTANCE.a()) {
            SelectionColors selectionColors = new SelectionColors(colors.j(), d(j10, jQ, jC), null);
            composer.t(selectionColors);
            objB = selectionColors;
        }
        SelectionColors selectionColors2 = (SelectionColors) objB;
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return selectionColors2;
    }

    public static final float b(long j10, long j11) {
        float fI = C5492s0.i(j10) + 0.05f;
        float fI2 = C5492s0.i(j11) + 0.05f;
        return Math.max(fI, fI2) / Math.min(fI, fI2);
    }

    public static final long d(long j10, long j11, long j12) {
        float fA;
        float fC = c(j10, 0.4f, j11, j12);
        float fC2 = c(j10, 0.2f, j11, j12);
        if (fC >= 4.5f) {
            fA = 0.4f;
        } else if (fC2 < 4.5f) {
            fA = 0.2f;
        } else {
            fA = a(j10, j11, j12);
        }
        return C5489q0.q(j10, fA, 0.0f, 0.0f, 0.0f, 14, null);
    }
}
