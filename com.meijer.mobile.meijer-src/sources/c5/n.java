package c5;

import V0.C5490r0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.InterfaceC5926k;
import androidx.compose.ui.layout.InterfaceC5933s;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.layout.m0;
import androidx.compose.ui.layout.n0;
import androidx.compose.ui.node.InterfaceC5965t;
import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0013J#\u0010\u001b\u001a\u00020\u001a*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010!\u001a\u00020\u001f*\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J#\u0010#\u001a\u00020\u001f*\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b#\u0010\"J#\u0010%\u001a\u00020\u001f*\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u001fH\u0016¢\u0006\u0004\b%\u0010\"J#\u0010&\u001a\u00020\u001f*\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010\"J\u0013\u0010)\u001a\u00020(*\u00020'H\u0016¢\u0006\u0004\b)\u0010*R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010%\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0014\u0010J\u001a\u00020G8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006K"}, d2 = {"Lc5/n;", "Landroidx/compose/ui/Modifier$c;", "Landroidx/compose/ui/node/t;", "Landroidx/compose/ui/node/D;", "LZ0/c;", PlaceTypes.PAINTER, "LP0/e;", "alignment", "Landroidx/compose/ui/layout/k;", "contentScale", "", "alpha", "LV0/r0;", "colorFilter", "<init>", "(LZ0/c;LP0/e;Landroidx/compose/ui/layout/k;FLV0/r0;)V", "LU0/k;", "dstSize", "L2", "(J)J", "LH1/b;", "constraints", "O2", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;", "Landroidx/compose/ui/layout/s;", "Landroidx/compose/ui/layout/r;", "", "height", "J", "(Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/r;I)I", "N", "width", "F", "r", "LX0/c;", "", "I", "(LX0/c;)V", "o", "LZ0/c;", "M2", "()LZ0/c;", "S2", "(LZ0/c;)V", "p", "LP0/e;", "getAlignment", "()LP0/e;", "P2", "(LP0/e;)V", "q", "Landroidx/compose/ui/layout/k;", "getContentScale", "()Landroidx/compose/ui/layout/k;", "R2", "(Landroidx/compose/ui/layout/k;)V", "getAlpha", "()F", "d", "(F)V", "s", "LV0/r0;", "getColorFilter", "()LV0/r0;", "Q2", "(LV0/r0;)V", "", "o2", "()Z", "shouldAutoInvalidate", "coil-compose-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class n extends Modifier.c implements InterfaceC5965t, androidx.compose.ui.node.D {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Z0.c painter;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private P0.e alignment;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5926k contentScale;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private float alpha;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private C5490r0 colorFilter;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N2(f0 f0Var, f0.a aVar) {
        f0.a.l(aVar, f0Var, 0, 0, 0.0f, 4, null);
        return Unit.f143329a;
    }

    @Override // androidx.compose.ui.Modifier.c
    /* renamed from: o2 */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.D
    public int F(InterfaceC5933s interfaceC5933s, androidx.compose.ui.layout.r rVar, int i10) {
        if (this.painter.k() == U0.k.INSTANCE.a()) {
            return rVar.W(i10);
        }
        int iW = rVar.W(H1.b.l(O2(H1.c.b(0, i10, 0, 0, 13, null))));
        return Math.max(MathKt.d(U0.k.g(L2(U0.l.a(i10, iW)))), iW);
    }

    @Override // androidx.compose.ui.node.D
    public int J(InterfaceC5933s interfaceC5933s, androidx.compose.ui.layout.r rVar, int i10) {
        if (this.painter.k() == U0.k.INSTANCE.a()) {
            return rVar.d0(i10);
        }
        int iD0 = rVar.d0(H1.b.k(O2(H1.c.b(0, 0, 0, i10, 7, null))));
        return Math.max(MathKt.d(U0.k.i(L2(U0.l.a(iD0, i10)))), iD0);
    }

    /* renamed from: M2, reason: from getter */
    public final Z0.c getPainter() {
        return this.painter;
    }

    @Override // androidx.compose.ui.node.D
    public int N(InterfaceC5933s interfaceC5933s, androidx.compose.ui.layout.r rVar, int i10) {
        if (this.painter.k() == U0.k.INSTANCE.a()) {
            return rVar.j0(i10);
        }
        int iJ0 = rVar.j0(H1.b.k(O2(H1.c.b(0, 0, 0, i10, 7, null))));
        return Math.max(MathKt.d(U0.k.i(L2(U0.l.a(iJ0, i10)))), iJ0);
    }

    public final void P2(P0.e eVar) {
        this.alignment = eVar;
    }

    public final void Q2(C5490r0 c5490r0) {
        this.colorFilter = c5490r0;
    }

    public final void R2(InterfaceC5926k interfaceC5926k) {
        this.contentScale = interfaceC5926k;
    }

    public final void S2(Z0.c cVar) {
        this.painter = cVar;
    }

    public final void d(float f10) {
        this.alpha = f10;
    }

    @Override // androidx.compose.ui.node.D
    public int r(InterfaceC5933s interfaceC5933s, androidx.compose.ui.layout.r rVar, int i10) {
        if (this.painter.k() == U0.k.INSTANCE.a()) {
            return rVar.A(i10);
        }
        int iA = rVar.A(H1.b.l(O2(H1.c.b(0, i10, 0, 0, 13, null))));
        return Math.max(MathKt.d(U0.k.g(L2(U0.l.a(i10, iA)))), iA);
    }

    public n(Z0.c cVar, P0.e eVar, InterfaceC5926k interfaceC5926k, float f10, C5490r0 c5490r0) {
        this.painter = cVar;
        this.alignment = eVar;
        this.contentScale = interfaceC5926k;
        this.alpha = f10;
        this.colorFilter = c5490r0;
    }

    private final long L2(long dstSize) {
        if (U0.k.k(dstSize)) {
            return U0.k.INSTANCE.b();
        }
        long jK = this.painter.k();
        if (jK == U0.k.INSTANCE.a()) {
            return dstSize;
        }
        float fI = U0.k.i(jK);
        if (Float.isInfinite(fI) || Float.isNaN(fI)) {
            fI = U0.k.i(dstSize);
        }
        float fG = U0.k.g(jK);
        if (Float.isInfinite(fG) || Float.isNaN(fG)) {
            fG = U0.k.g(dstSize);
        }
        long jA = U0.l.a(fI, fG);
        long jA2 = this.contentScale.a(jA, dstSize);
        float fB = m0.b(jA2);
        if (!Float.isInfinite(fB) && !Float.isNaN(fB)) {
            float fC = m0.c(jA2);
            if (!Float.isInfinite(fC) && !Float.isNaN(fC)) {
                return n0.b(jA2, jA);
            }
            return dstSize;
        }
        return dstSize;
    }

    private final long O2(long constraints) {
        boolean z10;
        float fN;
        int iM;
        float fD;
        boolean zJ = H1.b.j(constraints);
        boolean zI = H1.b.i(constraints);
        if (!zJ || !zI) {
            if (H1.b.h(constraints) && H1.b.g(constraints)) {
                z10 = true;
            } else {
                z10 = false;
            }
            long jK = this.painter.k();
            if (jK == U0.k.INSTANCE.a()) {
                if (z10) {
                    return H1.b.d(constraints, H1.b.l(constraints), 0, H1.b.k(constraints), 0, 10, null);
                }
            } else {
                if (z10 && (zJ || zI)) {
                    fN = H1.b.l(constraints);
                    iM = H1.b.k(constraints);
                } else {
                    float fI = U0.k.i(jK);
                    float fG = U0.k.g(jK);
                    if (!Float.isInfinite(fI) && !Float.isNaN(fI)) {
                        fN = F.e(constraints, fI);
                    } else {
                        fN = H1.b.n(constraints);
                    }
                    if (!Float.isInfinite(fG) && !Float.isNaN(fG)) {
                        fD = F.d(constraints, fG);
                        long jL2 = L2(U0.l.a(fN, fD));
                        return H1.b.d(constraints, H1.c.g(constraints, MathKt.d(U0.k.i(jL2))), 0, H1.c.f(constraints, MathKt.d(U0.k.g(jL2))), 0, 10, null);
                    }
                    iM = H1.b.m(constraints);
                }
                fD = iM;
                long jL22 = L2(U0.l.a(fN, fD));
                return H1.b.d(constraints, H1.c.g(constraints, MathKt.d(U0.k.i(jL22))), 0, H1.c.f(constraints, MathKt.d(U0.k.g(jL22))), 0, 10, null);
            }
        }
        return constraints;
    }

    @Override // androidx.compose.ui.node.InterfaceC5965t
    public void I(X0.c cVar) {
        long jL2 = L2(cVar.b());
        long jA = this.alignment.a(F.n(jL2), F.n(cVar.b()), cVar.getLayoutDirection());
        float fD = H1.n.d(jA);
        float fE = H1.n.e(jA);
        cVar.getDrawContext().getTransform().d(fD, fE);
        this.painter.j(cVar, jL2, this.alpha, this.colorFilter);
        cVar.getDrawContext().getTransform().d(-fD, -fE);
        cVar.a2();
    }

    @Override // androidx.compose.ui.node.D
    public J a(K k10, I i10, long j10) {
        final f0 f0VarK0 = i10.k0(O2(j10));
        return K.G0(k10, f0VarK0.getWidth(), f0VarK0.getHeight(), null, new Function1() { // from class: c5.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.N2(f0VarK0, (f0.a) obj);
            }
        }, 4, null);
    }
}
