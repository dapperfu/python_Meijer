package kotlin;

import H1.t;
import V0.AbstractC5480m1;
import V0.C5483n1;
import V0.D1;
import V0.W;
import V0.q1;
import V0.u1;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import r0.C16806i;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\r\u001a\u00020\f*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ;\u0010\u0015\u001a\u00020\f*\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u001a\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Lx0/o;", "LV0/D1;", "cutoutShape", "Lx0/o0;", "fabPlacement", "<init>", "(LV0/D1;Lx0/o0;)V", "LV0/q1;", "LH1/t;", "layoutDirection", "LH1/d;", "density", "", "b", "(LV0/q1;LH1/t;LH1/d;)V", "", "cutoutStartPosition", "cutoutEndPosition", "cutoutRadius", "roundedEdgeRadius", "verticalOffset", "c", "(LV0/q1;FFFFF)V", "LU0/k;", "size", "LV0/m1;", "a", "(JLH1/t;LH1/d;)LV0/m1;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LV0/D1;", "getCutoutShape", "()LV0/D1;", "Lx0/o0;", "getFabPlacement", "()Lx0/o0;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.o, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
final /* data */ class BottomAppBarCutoutShape implements D1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final D1 cutoutShape;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final C18028o0 fabPlacement;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BottomAppBarCutoutShape)) {
            return false;
        }
        BottomAppBarCutoutShape bottomAppBarCutoutShape = (BottomAppBarCutoutShape) other;
        return Intrinsics.e(this.cutoutShape, bottomAppBarCutoutShape.cutoutShape) && Intrinsics.e(this.fabPlacement, bottomAppBarCutoutShape.fabPlacement);
    }

    private final void c(q1 q1Var, float f10, float f11, float f12, float f13, float f14) {
        float f15 = -((float) Math.sqrt((f12 * f12) - (f14 * f14)));
        float f16 = f12 + f15;
        float f17 = f10 + f16;
        float f18 = f11 - f16;
        Pair<Float, Float> pairL = C18009i.l(f15 - 1.0f, f14, f12);
        float fFloatValue = pairL.a().floatValue() + f12;
        float fFloatValue2 = pairL.b().floatValue() - f14;
        q1Var.r(f17 - f13, 0.0f);
        q1Var.h(f17 - 1.0f, 0.0f, f10 + fFloatValue, fFloatValue2);
        q1Var.u(f11 - fFloatValue, fFloatValue2);
        q1Var.h(f18 + 1.0f, 0.0f, f13 + f18, 0.0f);
        q1Var.close();
    }

    public int hashCode() {
        return (this.cutoutShape.hashCode() * 31) + this.fabPlacement.hashCode();
    }

    public String toString() {
        return "BottomAppBarCutoutShape(cutoutShape=" + this.cutoutShape + ", fabPlacement=" + this.fabPlacement + ')';
    }

    public BottomAppBarCutoutShape(D1 d12, C18028o0 c18028o0) {
        this.cutoutShape = d12;
        this.fabPlacement = c18028o0;
    }

    private final void b(q1 q1Var, t tVar, H1.d dVar) {
        float fI1 = dVar.I1(C18009i.f169020e);
        float f10 = 2 * fI1;
        long jA = U0.l.a(this.fabPlacement.getWidth() + f10, this.fabPlacement.getHeight() + f10);
        float left = this.fabPlacement.getLeft() - fI1;
        float fI = left + U0.k.i(jA);
        float fG = U0.k.g(jA) / 2.0f;
        C5483n1.a(q1Var, this.cutoutShape.a(jA, tVar, dVar));
        q1Var.k(U0.g.a(left, -fG));
        if (Intrinsics.e(this.cutoutShape, C16806i.f())) {
            c(q1Var, left, fI, fG, dVar.I1(C18009i.f169021f), 0.0f);
        }
    }

    @Override // V0.D1
    public AbstractC5480m1 a(long size, t layoutDirection, H1.d density) {
        q1 q1VarA = W.a();
        q1.n(q1VarA, new Rect(0.0f, 0.0f, U0.k.i(size), U0.k.g(size)), null, 2, null);
        q1 q1VarA2 = W.a();
        b(q1VarA2, layoutDirection, density);
        q1VarA2.q(q1VarA, q1VarA2, u1.INSTANCE.a());
        return new AbstractC5480m1.a(q1VarA2);
    }
}
