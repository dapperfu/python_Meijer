package androidx.compose.ui.draw;

import H1.n;
import H1.r;
import U0.k;
import V0.C5347r0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.InterfaceC5784k;
import androidx.compose.ui.layout.InterfaceC5791s;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.layout.n0;
import androidx.compose.ui.node.D;
import androidx.compose.ui.node.InterfaceC5823t;
import com.google.android.gms.common.api.a;
import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b)\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BA\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0015J\u0016\u0010\u0019\u001a\u00020\u0006*\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\u00020\u0006*\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001aJ&\u0010 \u001a\u00020\u001f*\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b \u0010!J#\u0010&\u001a\u00020$*\u00020\"2\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J#\u0010(\u001a\u00020$*\u00020\"2\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b(\u0010'J#\u0010*\u001a\u00020$*\u00020\"2\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010)\u001a\u00020$H\u0016¢\u0006\u0004\b*\u0010'J#\u0010+\u001a\u00020$*\u00020\"2\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010)\u001a\u00020$H\u0016¢\u0006\u0004\b+\u0010'J\u0013\u0010.\u001a\u00020-*\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010*\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bU\u0010<R\u0014\u0010X\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010<\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Y"}, d2 = {"Landroidx/compose/ui/draw/e;", "Landroidx/compose/ui/node/D;", "Landroidx/compose/ui/Modifier$c;", "Landroidx/compose/ui/node/t;", "LZ0/c;", PlaceTypes.PAINTER, "", "sizeToIntrinsics", "LP0/e;", "alignment", "Landroidx/compose/ui/layout/k;", "contentScale", "", "alpha", "LV0/r0;", "colorFilter", "<init>", "(LZ0/c;ZLP0/e;Landroidx/compose/ui/layout/k;FLV0/r0;)V", "LU0/k;", "dstSize", "K2", "(J)J", "LH1/b;", "constraints", "Q2", "P2", "(J)Z", "O2", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;", "Landroidx/compose/ui/layout/s;", "Landroidx/compose/ui/layout/r;", "", "height", "J", "(Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/r;I)I", "N", "width", "F", "r", "LX0/c;", "", "I", "(LX0/c;)V", "", "toString", "()Ljava/lang/String;", "o", "LZ0/c;", "L2", "()LZ0/c;", "U2", "(LZ0/c;)V", "p", "Z", "M2", "()Z", "V2", "(Z)V", "q", "LP0/e;", "getAlignment", "()LP0/e;", "R2", "(LP0/e;)V", "Landroidx/compose/ui/layout/k;", "getContentScale", "()Landroidx/compose/ui/layout/k;", "T2", "(Landroidx/compose/ui/layout/k;)V", "s", "getAlpha", "()F", "d", "(F)V", "t", "LV0/r0;", "getColorFilter", "()LV0/r0;", "S2", "(LV0/r0;)V", "N2", "useIntrinsicSize", "o2", "shouldAutoInvalidate", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.draw.e, reason: from toString */
/* loaded from: classes.dex */
final class PainterModifier extends Modifier.c implements D, InterfaceC5823t {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private Z0.c painter;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean sizeToIntrinsics;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private P0.e alignment;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5784k contentScale;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private float alpha;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private C5347r0 colorFilter;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.draw.e$a */
    static final class a extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ f0 f50571f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f0 f0Var) {
            super(1);
            this.f50571f = f0Var;
        }

        public final void a(f0.a aVar) {
            f0.a.l(aVar, this.f50571f, 0, 0, 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f142422a;
        }
    }

    @Override // androidx.compose.ui.Modifier.c
    /* renamed from: o2 */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    private final boolean N2() {
        return this.sizeToIntrinsics && this.painter.k() != 9205357640488583168L;
    }

    private final boolean O2(long j10) {
        return !k.f(j10, k.INSTANCE.a()) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L))) & a.e.API_PRIORITY_OTHER) < 2139095040;
    }

    private final boolean P2(long j10) {
        return !k.f(j10, k.INSTANCE.a()) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 >> 32))) & a.e.API_PRIORITY_OTHER) < 2139095040;
    }

    @Override // androidx.compose.ui.node.InterfaceC5823t
    public void I(X0.c cVar) {
        long jK = this.painter.k();
        float fIntBitsToFloat = P2(jK) ? Float.intBitsToFloat((int) (jK >> 32)) : Float.intBitsToFloat((int) (cVar.b() >> 32));
        float fIntBitsToFloat2 = O2(jK) ? Float.intBitsToFloat((int) (jK & 4294967295L)) : Float.intBitsToFloat((int) (cVar.b() & 4294967295L));
        long jD = k.d((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
        long jB = (Float.intBitsToFloat((int) (cVar.b() >> 32)) == 0.0f || Float.intBitsToFloat((int) (cVar.b() & 4294967295L)) == 0.0f) ? k.INSTANCE.b() : n0.a(jD, this.contentScale.a(jD, cVar.b()));
        long jA = this.alignment.a(r.c((Math.round(Float.intBitsToFloat((int) (jB & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (jB >> 32))) << 32)), r.c((Math.round(Float.intBitsToFloat((int) (cVar.b() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (cVar.b() & 4294967295L))) & 4294967295L)), cVar.getLayoutDirection());
        float fK = n.k(jA);
        float fL = n.l(jA);
        cVar.getDrawContext().getTransform().d(fK, fL);
        try {
            this.painter.j(cVar, jB, this.alpha, this.colorFilter);
            cVar.getDrawContext().getTransform().d(-fK, -fL);
            cVar.a2();
        } catch (Throwable th2) {
            cVar.getDrawContext().getTransform().d(-fK, -fL);
            throw th2;
        }
    }

    /* renamed from: L2, reason: from getter */
    public final Z0.c getPainter() {
        return this.painter;
    }

    /* renamed from: M2, reason: from getter */
    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    public final void R2(P0.e eVar) {
        this.alignment = eVar;
    }

    public final void S2(C5347r0 c5347r0) {
        this.colorFilter = c5347r0;
    }

    public final void T2(InterfaceC5784k interfaceC5784k) {
        this.contentScale = interfaceC5784k;
    }

    public final void U2(Z0.c cVar) {
        this.painter = cVar;
    }

    public final void V2(boolean z10) {
        this.sizeToIntrinsics = z10;
    }

    public final void d(float f10) {
        this.alpha = f10;
    }

    public String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }

    public PainterModifier(Z0.c cVar, boolean z10, P0.e eVar, InterfaceC5784k interfaceC5784k, float f10, C5347r0 c5347r0) {
        this.painter = cVar;
        this.sizeToIntrinsics = z10;
        this.alignment = eVar;
        this.contentScale = interfaceC5784k;
        this.alpha = f10;
        this.colorFilter = c5347r0;
    }

    private final long K2(long dstSize) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        if (!N2()) {
            return dstSize;
        }
        if (!P2(this.painter.k())) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (dstSize >> 32));
        } else {
            fIntBitsToFloat = Float.intBitsToFloat((int) (this.painter.k() >> 32));
        }
        if (!O2(this.painter.k())) {
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (dstSize & 4294967295L));
        } else {
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.painter.k() & 4294967295L));
        }
        long jD = k.d((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
        if (Float.intBitsToFloat((int) (dstSize >> 32)) == 0.0f || Float.intBitsToFloat((int) (dstSize & 4294967295L)) == 0.0f) {
            return k.INSTANCE.b();
        }
        return n0.a(jD, this.contentScale.a(jD, dstSize));
    }

    private final long Q2(long constraints) {
        boolean z10;
        int iN;
        int iM;
        boolean z11 = false;
        if (H1.b.h(constraints) && H1.b.g(constraints)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (H1.b.j(constraints) && H1.b.i(constraints)) {
            z11 = true;
        }
        if ((!N2() && z10) || z11) {
            return H1.b.d(constraints, H1.b.l(constraints), 0, H1.b.k(constraints), 0, 10, null);
        }
        long jK = this.painter.k();
        if (P2(jK)) {
            iN = Math.round(Float.intBitsToFloat((int) (jK >> 32)));
        } else {
            iN = H1.b.n(constraints);
        }
        if (O2(jK)) {
            iM = Math.round(Float.intBitsToFloat((int) (jK & 4294967295L)));
        } else {
            iM = H1.b.m(constraints);
        }
        int iG = H1.c.g(constraints, iN);
        float f10 = H1.c.f(constraints, iM);
        long jK2 = K2(k.d((Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(iG) << 32)));
        return H1.b.d(constraints, H1.c.g(constraints, Math.round(Float.intBitsToFloat((int) (jK2 >> 32)))), 0, H1.c.f(constraints, Math.round(Float.intBitsToFloat((int) (jK2 & 4294967295L)))), 0, 10, null);
    }

    @Override // androidx.compose.ui.node.D
    public int F(InterfaceC5791s interfaceC5791s, androidx.compose.ui.layout.r rVar, int i10) {
        if (N2()) {
            long jQ2 = Q2(H1.c.b(0, i10, 0, 0, 13, null));
            return Math.max(H1.b.m(jQ2), rVar.W(i10));
        }
        return rVar.W(i10);
    }

    @Override // androidx.compose.ui.node.D
    public int J(InterfaceC5791s interfaceC5791s, androidx.compose.ui.layout.r rVar, int i10) {
        if (N2()) {
            long jQ2 = Q2(H1.c.b(0, 0, 0, i10, 7, null));
            return Math.max(H1.b.n(jQ2), rVar.d0(i10));
        }
        return rVar.d0(i10);
    }

    @Override // androidx.compose.ui.node.D
    public int N(InterfaceC5791s interfaceC5791s, androidx.compose.ui.layout.r rVar, int i10) {
        if (N2()) {
            long jQ2 = Q2(H1.c.b(0, 0, 0, i10, 7, null));
            return Math.max(H1.b.n(jQ2), rVar.j0(i10));
        }
        return rVar.j0(i10);
    }

    @Override // androidx.compose.ui.node.D
    public J a(K k10, I i10, long j10) {
        f0 f0VarK0 = i10.k0(Q2(j10));
        return K.G0(k10, f0VarK0.getWidth(), f0VarK0.getHeight(), null, new a(f0VarK0), 4, null);
    }

    @Override // androidx.compose.ui.node.D
    public int r(InterfaceC5791s interfaceC5791s, androidx.compose.ui.layout.r rVar, int i10) {
        if (N2()) {
            long jQ2 = Q2(H1.c.b(0, i10, 0, 0, 13, null));
            return Math.max(H1.b.m(jQ2), rVar.A(i10));
        }
        return rVar.A(i10);
    }
}
