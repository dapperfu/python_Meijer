package V0;

import V0.C5306c0;
import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0016\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"LV0/c0;", "Landroid/graphics/PorterDuff$Mode;", "b", "(I)Landroid/graphics/PorterDuff$Mode;", "Landroid/graphics/BlendMode;", "a", "(I)Landroid/graphics/BlendMode;", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class D {
    public static final BlendMode a(int i10) {
        C5306c0.Companion companion = C5306c0.INSTANCE;
        return C5306c0.E(i10, companion.a()) ? BlendMode.CLEAR : C5306c0.E(i10, companion.x()) ? BlendMode.SRC : C5306c0.E(i10, companion.g()) ? BlendMode.DST : C5306c0.E(i10, companion.B()) ? BlendMode.SRC_OVER : C5306c0.E(i10, companion.k()) ? BlendMode.DST_OVER : C5306c0.E(i10, companion.z()) ? BlendMode.SRC_IN : C5306c0.E(i10, companion.i()) ? BlendMode.DST_IN : C5306c0.E(i10, companion.A()) ? BlendMode.SRC_OUT : C5306c0.E(i10, companion.j()) ? BlendMode.DST_OUT : C5306c0.E(i10, companion.y()) ? BlendMode.SRC_ATOP : C5306c0.E(i10, companion.h()) ? BlendMode.DST_ATOP : C5306c0.E(i10, companion.C()) ? BlendMode.XOR : C5306c0.E(i10, companion.t()) ? BlendMode.PLUS : C5306c0.E(i10, companion.q()) ? BlendMode.MODULATE : C5306c0.E(i10, companion.v()) ? BlendMode.SCREEN : C5306c0.E(i10, companion.s()) ? BlendMode.OVERLAY : C5306c0.E(i10, companion.e()) ? BlendMode.DARKEN : C5306c0.E(i10, companion.o()) ? BlendMode.LIGHTEN : C5306c0.E(i10, companion.d()) ? BlendMode.COLOR_DODGE : C5306c0.E(i10, companion.c()) ? BlendMode.COLOR_BURN : C5306c0.E(i10, companion.m()) ? BlendMode.HARD_LIGHT : C5306c0.E(i10, companion.w()) ? BlendMode.SOFT_LIGHT : C5306c0.E(i10, companion.f()) ? BlendMode.DIFFERENCE : C5306c0.E(i10, companion.l()) ? BlendMode.EXCLUSION : C5306c0.E(i10, companion.r()) ? BlendMode.MULTIPLY : C5306c0.E(i10, companion.n()) ? BlendMode.HUE : C5306c0.E(i10, companion.u()) ? BlendMode.SATURATION : C5306c0.E(i10, companion.b()) ? BlendMode.COLOR : C5306c0.E(i10, companion.p()) ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final PorterDuff.Mode b(int i10) {
        C5306c0.Companion companion = C5306c0.INSTANCE;
        return C5306c0.E(i10, companion.a()) ? PorterDuff.Mode.CLEAR : C5306c0.E(i10, companion.x()) ? PorterDuff.Mode.SRC : C5306c0.E(i10, companion.g()) ? PorterDuff.Mode.DST : C5306c0.E(i10, companion.B()) ? PorterDuff.Mode.SRC_OVER : C5306c0.E(i10, companion.k()) ? PorterDuff.Mode.DST_OVER : C5306c0.E(i10, companion.z()) ? PorterDuff.Mode.SRC_IN : C5306c0.E(i10, companion.i()) ? PorterDuff.Mode.DST_IN : C5306c0.E(i10, companion.A()) ? PorterDuff.Mode.SRC_OUT : C5306c0.E(i10, companion.j()) ? PorterDuff.Mode.DST_OUT : C5306c0.E(i10, companion.y()) ? PorterDuff.Mode.SRC_ATOP : C5306c0.E(i10, companion.h()) ? PorterDuff.Mode.DST_ATOP : C5306c0.E(i10, companion.C()) ? PorterDuff.Mode.XOR : C5306c0.E(i10, companion.t()) ? PorterDuff.Mode.ADD : C5306c0.E(i10, companion.v()) ? PorterDuff.Mode.SCREEN : C5306c0.E(i10, companion.s()) ? PorterDuff.Mode.OVERLAY : C5306c0.E(i10, companion.e()) ? PorterDuff.Mode.DARKEN : C5306c0.E(i10, companion.o()) ? PorterDuff.Mode.LIGHTEN : C5306c0.E(i10, companion.q()) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}
