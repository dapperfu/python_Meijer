package androidx.compose.foundation.layout;

import H1.r;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5791s;
import androidx.compose.ui.layout.f0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u000e\u001a\u00020\n*\u00020\t2\u0006\u0010\r\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0010\u001a\u00020\n*\u00020\t2\u0006\u0010\r\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000fJ\u001e\u0010\u0011\u001a\u00020\n*\u00020\t2\u0006\u0010\r\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ\u001e\u0010\u0012\u001a\u00020\n*\u00020\t2\u0006\u0010\r\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000fJ&\u0010\u0018\u001a\u00020\u0017*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001e\u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010 \u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010\u001fJ#\u0010\"\u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\"\u0010\u001fJ#\u0010#\u001a\u00020\u001c*\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010\u001fR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"Landroidx/compose/foundation/layout/f;", "Landroidx/compose/ui/node/D;", "Landroidx/compose/ui/Modifier$c;", "", "aspectRatio", "", "matchHeightConstraintsFirst", "<init>", "(FZ)V", "LH1/b;", "LH1/r;", "K2", "(J)J", "enforceConstraints", "O2", "(JZ)J", "N2", "Q2", "P2", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;", "Landroidx/compose/ui/layout/s;", "Landroidx/compose/ui/layout/r;", "", "height", "J", "(Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/r;I)I", "N", "width", "F", "r", "o", "getAspectRatio", "()F", "L2", "(F)V", "p", "Z", "getMatchHeightConstraintsFirst", "()Z", "M2", "(Z)V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.layout.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5660f extends Modifier.c implements androidx.compose.ui.node.D {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private float aspectRatio;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean matchHeightConstraintsFirst;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.layout.f$a */
    static final class a extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ f0 f48586f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f0 f0Var) {
            super(1);
            this.f48586f = f0Var;
        }

        public final void a(f0.a aVar) {
            f0.a.l(aVar, this.f48586f, 0, 0, 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f142422a;
        }
    }

    private final long K2(long j10) {
        if (this.matchHeightConstraintsFirst) {
            long jN2 = N2(j10, true);
            r.Companion companion = H1.r.INSTANCE;
            if (!H1.r.e(jN2, companion.a())) {
                return jN2;
            }
            long jO2 = O2(j10, true);
            if (!H1.r.e(jO2, companion.a())) {
                return jO2;
            }
            long jP2 = P2(j10, true);
            if (!H1.r.e(jP2, companion.a())) {
                return jP2;
            }
            long jQ2 = Q2(j10, true);
            if (!H1.r.e(jQ2, companion.a())) {
                return jQ2;
            }
            long jN22 = N2(j10, false);
            if (!H1.r.e(jN22, companion.a())) {
                return jN22;
            }
            long jO22 = O2(j10, false);
            if (!H1.r.e(jO22, companion.a())) {
                return jO22;
            }
            long jP22 = P2(j10, false);
            if (!H1.r.e(jP22, companion.a())) {
                return jP22;
            }
            long jQ22 = Q2(j10, false);
            if (!H1.r.e(jQ22, companion.a())) {
                return jQ22;
            }
        } else {
            long jO23 = O2(j10, true);
            r.Companion companion2 = H1.r.INSTANCE;
            if (!H1.r.e(jO23, companion2.a())) {
                return jO23;
            }
            long jN23 = N2(j10, true);
            if (!H1.r.e(jN23, companion2.a())) {
                return jN23;
            }
            long jQ23 = Q2(j10, true);
            if (!H1.r.e(jQ23, companion2.a())) {
                return jQ23;
            }
            long jP23 = P2(j10, true);
            if (!H1.r.e(jP23, companion2.a())) {
                return jP23;
            }
            long jO24 = O2(j10, false);
            if (!H1.r.e(jO24, companion2.a())) {
                return jO24;
            }
            long jN24 = N2(j10, false);
            if (!H1.r.e(jN24, companion2.a())) {
                return jN24;
            }
            long jQ24 = Q2(j10, false);
            if (!H1.r.e(jQ24, companion2.a())) {
                return jQ24;
            }
            long jP24 = P2(j10, false);
            if (!H1.r.e(jP24, companion2.a())) {
                return jP24;
            }
        }
        return H1.r.INSTANCE.a();
    }

    public final void L2(float f10) {
        this.aspectRatio = f10;
    }

    public final void M2(boolean z10) {
        this.matchHeightConstraintsFirst = z10;
    }

    public C5660f(float f10, boolean z10) {
        this.aspectRatio = f10;
        this.matchHeightConstraintsFirst = z10;
    }

    private final long N2(long j10, boolean z10) {
        int iRound;
        int iK = H1.b.k(j10);
        if (iK != Integer.MAX_VALUE && (iRound = Math.round(iK * this.aspectRatio)) > 0 && (!z10 || C5659e.c(j10, iRound, iK))) {
            return H1.r.c((iRound << 32) | (iK & 4294967295L));
        }
        return H1.r.INSTANCE.a();
    }

    private final long O2(long j10, boolean z10) {
        int iRound;
        int iL = H1.b.l(j10);
        if (iL != Integer.MAX_VALUE && (iRound = Math.round(iL / this.aspectRatio)) > 0 && (!z10 || C5659e.c(j10, iL, iRound))) {
            return H1.r.c((iL << 32) | (iRound & 4294967295L));
        }
        return H1.r.INSTANCE.a();
    }

    private final long P2(long j10, boolean z10) {
        int iM = H1.b.m(j10);
        int iRound = Math.round(iM * this.aspectRatio);
        if (iRound > 0 && (!z10 || C5659e.c(j10, iRound, iM))) {
            return H1.r.c((iRound << 32) | (iM & 4294967295L));
        }
        return H1.r.INSTANCE.a();
    }

    private final long Q2(long j10, boolean z10) {
        int iN = H1.b.n(j10);
        int iRound = Math.round(iN / this.aspectRatio);
        if (iRound > 0 && (!z10 || C5659e.c(j10, iN, iRound))) {
            return H1.r.c((iN << 32) | (iRound & 4294967295L));
        }
        return H1.r.INSTANCE.a();
    }

    @Override // androidx.compose.ui.node.D
    public int F(InterfaceC5791s interfaceC5791s, androidx.compose.ui.layout.r rVar, int i10) {
        if (i10 != Integer.MAX_VALUE) {
            return Math.round(i10 / this.aspectRatio);
        }
        return rVar.W(i10);
    }

    @Override // androidx.compose.ui.node.D
    public int J(InterfaceC5791s interfaceC5791s, androidx.compose.ui.layout.r rVar, int i10) {
        if (i10 != Integer.MAX_VALUE) {
            return Math.round(i10 * this.aspectRatio);
        }
        return rVar.d0(i10);
    }

    @Override // androidx.compose.ui.node.D
    public int N(InterfaceC5791s interfaceC5791s, androidx.compose.ui.layout.r rVar, int i10) {
        if (i10 != Integer.MAX_VALUE) {
            return Math.round(i10 * this.aspectRatio);
        }
        return rVar.j0(i10);
    }

    @Override // androidx.compose.ui.node.D
    public androidx.compose.ui.layout.J a(androidx.compose.ui.layout.K k10, androidx.compose.ui.layout.I i10, long j10) {
        long jK2 = K2(j10);
        if (!H1.r.e(jK2, H1.r.INSTANCE.a())) {
            j10 = H1.b.INSTANCE.c((int) (jK2 >> 32), (int) (jK2 & 4294967295L));
        }
        f0 f0VarK0 = i10.k0(j10);
        return androidx.compose.ui.layout.K.G0(k10, f0VarK0.getWidth(), f0VarK0.getHeight(), null, new a(f0VarK0), 4, null);
    }

    @Override // androidx.compose.ui.node.D
    public int r(InterfaceC5791s interfaceC5791s, androidx.compose.ui.layout.r rVar, int i10) {
        if (i10 != Integer.MAX_VALUE) {
            return Math.round(i10 / this.aspectRatio);
        }
        return rVar.A(i10);
    }
}
