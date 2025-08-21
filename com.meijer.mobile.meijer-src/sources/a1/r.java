package a1;

import V0.C5490r0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.C6034t0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a&\u0010\n\u001a\u00020\t*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a*\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a$\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001aD\u0010\u001f\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a'\u0010%\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b%\u0010&\u001a\u001b\u0010)\u001a\u00020#*\u00020#2\u0006\u0010(\u001a\u00020'H\u0000¢\u0006\u0004\b)\u0010*\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"La1/d;", "image", "La1/q;", "g", "(La1/d;Landroidx/compose/runtime/Composer;I)La1/q;", "LH1/d;", "LH1/h;", "defaultWidth", "defaultHeight", "LU0/k;", "e", "(LH1/d;FF)J", "defaultSize", "", "viewportWidth", "viewportHeight", "f", "(JFF)J", "LV0/q0;", "tintColor", "LV0/c0;", "tintBlendMode", "LV0/r0;", "b", "(JI)LV0/r0;", "viewportSize", "", "name", "intrinsicColorFilter", "", "autoMirror", "a", "(La1/q;JJLjava/lang/String;LV0/r0;Z)La1/q;", "density", "imageVector", "La1/c;", "root", "d", "(LH1/d;La1/d;La1/c;)La1/q;", "La1/n;", "currentGroup", "c", "(La1/c;La1/n;)La1/c;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class r {
    private static final C5490r0 b(long j10, int i10) {
        if (j10 != 16) {
            return C5490r0.INSTANCE.b(j10, i10);
        }
        return null;
    }

    public static final q a(q qVar, long j10, long j11, String str, C5490r0 c5490r0, boolean z10) {
        qVar.x(j10);
        qVar.t(z10);
        qVar.u(c5490r0);
        qVar.y(j11);
        qVar.w(str);
        return qVar;
    }

    public static final c c(c cVar, n nVar) {
        int iS = nVar.s();
        for (int i10 = 0; i10 < iS; i10++) {
            p pVarF = nVar.f(i10);
            if (pVarF instanceof s) {
                g gVar = new g();
                s sVar = (s) pVarF;
                gVar.k(sVar.k());
                gVar.l(sVar.getPathFillType());
                gVar.j(sVar.getName());
                gVar.h(sVar.getFill());
                gVar.i(sVar.getFillAlpha());
                gVar.m(sVar.getStroke());
                gVar.n(sVar.getStrokeAlpha());
                gVar.r(sVar.getStrokeLineWidth());
                gVar.o(sVar.getStrokeLineCap());
                gVar.p(sVar.getStrokeLineJoin());
                gVar.q(sVar.getStrokeLineMiter());
                gVar.u(sVar.getTrimPathStart());
                gVar.s(sVar.getTrimPathEnd());
                gVar.t(sVar.getTrimPathOffset());
                cVar.i(i10, gVar);
            } else if (pVarF instanceof n) {
                c cVar2 = new c();
                n nVar2 = (n) pVarF;
                cVar2.p(nVar2.getName());
                cVar2.s(nVar2.getRotation());
                cVar2.t(nVar2.getScaleX());
                cVar2.u(nVar2.getScaleY());
                cVar2.v(nVar2.getTranslationX());
                cVar2.w(nVar2.getTranslationY());
                cVar2.q(nVar2.getPivotX());
                cVar2.r(nVar2.getPivotY());
                cVar2.o(nVar2.h());
                c(cVar2, nVar2);
                cVar.i(i10, cVar2);
            }
        }
        return cVar;
    }

    public static final q d(H1.d dVar, d dVar2, c cVar) {
        long jE = e(dVar, dVar2.getDefaultWidth(), dVar2.getDefaultHeight());
        return a(new q(cVar), jE, f(jE, dVar2.getViewportWidth(), dVar2.getViewportHeight()), dVar2.getName(), b(dVar2.getTintColor(), dVar2.getTintBlendMode()), dVar2.getAutoMirror());
    }

    private static final long e(H1.d dVar, float f10, float f11) {
        float fI1 = dVar.I1(f10);
        float fI12 = dVar.I1(f11);
        return U0.k.d((Float.floatToRawIntBits(fI1) << 32) | (Float.floatToRawIntBits(fI12) & 4294967295L));
    }

    private static final long f(long j10, float f10, float f11) {
        if (Float.isNaN(f10)) {
            f10 = Float.intBitsToFloat((int) (j10 >> 32));
        }
        if (Float.isNaN(f11)) {
            f11 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        }
        return U0.k.d((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
    }

    public static final q g(d dVar, Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(1413834416, i10, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:169)");
        }
        H1.d dVar2 = (H1.d) composer.o(C6034t0.g());
        float genId = dVar.getGenId();
        float density = dVar2.getDensity();
        boolean zE = composer.e((Float.floatToRawIntBits(density) & 4294967295L) | (Float.floatToRawIntBits(genId) << 32));
        Object objB = composer.B();
        if (zE || objB == Composer.INSTANCE.a()) {
            c cVar = new c();
            c(cVar, dVar.getRoot());
            Unit unit = Unit.f143329a;
            objB = d(dVar2, dVar, cVar);
            composer.t(objB);
        }
        q qVar = (q) objB;
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return qVar;
    }
}
