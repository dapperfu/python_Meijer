package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5933s;
import androidx.compose.ui.layout.f0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0012\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0018\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001b\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J#\u0010\u001c\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u0019J#\u0010\u001d\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u0019R(\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R(\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b&\u0010\u001b\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R(\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b)\u0010 \"\u0004\b*\u0010\"R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u00104\u001a\u00020\u000f*\u0002018BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b2\u00103\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00065"}, d2 = {"Landroidx/compose/foundation/layout/K;", "Landroidx/compose/ui/node/D;", "Landroidx/compose/ui/Modifier$c;", "LH1/h;", "minWidth", "minHeight", "maxWidth", "maxHeight", "", "enforceIncoming", "<init>", "(FFFFZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;", "Landroidx/compose/ui/layout/s;", "Landroidx/compose/ui/layout/r;", "", "height", "J", "(Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/r;I)I", "width", "F", "N", "r", "o", "getMinWidth-D9Ej5fM", "()F", "P2", "(F)V", "p", "getMinHeight-D9Ej5fM", "O2", "q", "getMaxWidth-D9Ej5fM", "N2", "getMaxHeight-D9Ej5fM", "M2", "s", "Z", "getEnforceIncoming", "()Z", "L2", "(Z)V", "LH1/d;", "K2", "(LH1/d;)J", "targetConstraints", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class K extends Modifier.c implements androidx.compose.ui.node.D {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private float minWidth;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private float minHeight;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private float maxWidth;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private float maxHeight;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean enforceIncoming;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ f0 f48716f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f0 f0Var) {
            super(1);
            this.f48716f = f0Var;
        }

        public final void a(f0.a aVar) {
            f0.a.l(aVar, this.f48716f, 0, 0, 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f143329a;
        }
    }

    public /* synthetic */ K(float f10, float f11, float f12, float f13, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, z10);
    }

    private K(float f10, float f11, float f12, float f13, boolean z10) {
        this.minWidth = f10;
        this.minHeight = f11;
        this.maxWidth = f12;
        this.maxHeight = f13;
        this.enforceIncoming = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long K2(H1.d r7) {
        /*
            r6 = this;
            float r0 = r6.maxWidth
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            if (r0 != 0) goto L16
            float r0 = r6.maxWidth
            int r0 = r7.E0(r0)
            if (r0 >= 0) goto L17
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            float r3 = r6.maxHeight
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L29
            float r3 = r6.maxHeight
            int r3 = r7.E0(r3)
            if (r3 >= 0) goto L2a
            r3 = r2
            goto L2a
        L29:
            r3 = r1
        L2a:
            float r4 = r6.minWidth
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L41
            float r4 = r6.minWidth
            int r4 = r7.E0(r4)
            if (r4 >= 0) goto L3b
            r4 = r2
        L3b:
            if (r4 <= r0) goto L3e
            r4 = r0
        L3e:
            if (r4 == r1) goto L41
            goto L42
        L41:
            r4 = r2
        L42:
            float r5 = r6.minHeight
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L59
            float r5 = r6.minHeight
            int r7 = r7.E0(r5)
            if (r7 >= 0) goto L53
            r7 = r2
        L53:
            if (r7 <= r3) goto L56
            r7 = r3
        L56:
            if (r7 == r1) goto L59
            r2 = r7
        L59:
            long r0 = H1.c.a(r4, r0, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.K.K2(H1.d):long");
    }

    public final void L2(boolean z10) {
        this.enforceIncoming = z10;
    }

    public final void M2(float f10) {
        this.maxHeight = f10;
    }

    public final void N2(float f10) {
        this.maxWidth = f10;
    }

    public final void O2(float f10) {
        this.minHeight = f10;
    }

    public final void P2(float f10) {
        this.minWidth = f10;
    }

    @Override // androidx.compose.ui.node.D
    public int F(InterfaceC5933s interfaceC5933s, androidx.compose.ui.layout.r rVar, int i10) {
        long jK2 = K2(interfaceC5933s);
        if (H1.b.i(jK2)) {
            return H1.b.k(jK2);
        }
        if (!this.enforceIncoming) {
            i10 = H1.c.g(jK2, i10);
        }
        return H1.c.f(jK2, rVar.W(i10));
    }

    @Override // androidx.compose.ui.node.D
    public int J(InterfaceC5933s interfaceC5933s, androidx.compose.ui.layout.r rVar, int i10) {
        long jK2 = K2(interfaceC5933s);
        if (H1.b.j(jK2)) {
            return H1.b.l(jK2);
        }
        if (!this.enforceIncoming) {
            i10 = H1.c.f(jK2, i10);
        }
        return H1.c.g(jK2, rVar.d0(i10));
    }

    @Override // androidx.compose.ui.node.D
    public int N(InterfaceC5933s interfaceC5933s, androidx.compose.ui.layout.r rVar, int i10) {
        long jK2 = K2(interfaceC5933s);
        if (H1.b.j(jK2)) {
            return H1.b.l(jK2);
        }
        if (!this.enforceIncoming) {
            i10 = H1.c.f(jK2, i10);
        }
        return H1.c.g(jK2, rVar.j0(i10));
    }

    @Override // androidx.compose.ui.node.D
    public androidx.compose.ui.layout.J a(androidx.compose.ui.layout.K k10, androidx.compose.ui.layout.I i10, long j10) {
        int iN;
        int iL;
        int iM;
        int iK;
        long jA;
        long jK2 = K2(k10);
        if (this.enforceIncoming) {
            jA = H1.c.e(j10, jK2);
        } else {
            if (!Float.isNaN(this.minWidth)) {
                iN = H1.b.n(jK2);
            } else {
                iN = H1.b.n(j10);
                int iL2 = H1.b.l(jK2);
                if (iN > iL2) {
                    iN = iL2;
                }
            }
            if (!Float.isNaN(this.maxWidth)) {
                iL = H1.b.l(jK2);
            } else {
                iL = H1.b.l(j10);
                int iN2 = H1.b.n(jK2);
                if (iL < iN2) {
                    iL = iN2;
                }
            }
            if (!Float.isNaN(this.minHeight)) {
                iM = H1.b.m(jK2);
            } else {
                iM = H1.b.m(j10);
                int iK2 = H1.b.k(jK2);
                if (iM > iK2) {
                    iM = iK2;
                }
            }
            if (!Float.isNaN(this.maxHeight)) {
                iK = H1.b.k(jK2);
            } else {
                iK = H1.b.k(j10);
                int iM2 = H1.b.m(jK2);
                if (iK < iM2) {
                    iK = iM2;
                }
            }
            jA = H1.c.a(iN, iL, iM, iK);
        }
        f0 f0VarK0 = i10.k0(jA);
        return androidx.compose.ui.layout.K.G0(k10, f0VarK0.getWidth(), f0VarK0.getHeight(), null, new a(f0VarK0), 4, null);
    }

    @Override // androidx.compose.ui.node.D
    public int r(InterfaceC5933s interfaceC5933s, androidx.compose.ui.layout.r rVar, int i10) {
        long jK2 = K2(interfaceC5933s);
        if (H1.b.i(jK2)) {
            return H1.b.k(jK2);
        }
        if (!this.enforceIncoming) {
            i10 = H1.c.g(jK2, i10);
        }
        return H1.c.f(jK2, rVar.A(i10));
    }
}
