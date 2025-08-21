package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.f0;
import j0.EnumC14907k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000f\u001a\u00020\u000e*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/layout/n;", "Landroidx/compose/ui/node/D;", "Landroidx/compose/ui/Modifier$c;", "Lj0/k;", "direction", "", "fraction", "<init>", "(Lj0/k;F)V", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;", "o", "Lj0/k;", "getDirection", "()Lj0/k;", "K2", "(Lj0/k;)V", "p", "F", "getFraction", "()F", "L2", "(F)V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.layout.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5810n extends Modifier.c implements androidx.compose.ui.node.D {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private EnumC14907k direction;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private float fraction;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.layout.n$a */
    static final class a extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ f0 f48859f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f0 f0Var) {
            super(1);
            this.f48859f = f0Var;
        }

        public final void a(f0.a aVar) {
            f0.a.l(aVar, this.f48859f, 0, 0, 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f143329a;
        }
    }

    public final void K2(EnumC14907k enumC14907k) {
        this.direction = enumC14907k;
    }

    public final void L2(float f10) {
        this.fraction = f10;
    }

    public C5810n(EnumC14907k enumC14907k, float f10) {
        this.direction = enumC14907k;
        this.fraction = f10;
    }

    @Override // androidx.compose.ui.node.D
    public androidx.compose.ui.layout.J a(androidx.compose.ui.layout.K k10, androidx.compose.ui.layout.I i10, long j10) {
        int iN;
        int iL;
        int iK;
        int iK2;
        if (H1.b.h(j10) && this.direction != EnumC14907k.f139711a) {
            int iRound = Math.round(H1.b.l(j10) * this.fraction);
            int iN2 = H1.b.n(j10);
            iN = H1.b.l(j10);
            if (iRound < iN2) {
                iRound = iN2;
            }
            if (iRound <= iN) {
                iN = iRound;
            }
            iL = iN;
        } else {
            iN = H1.b.n(j10);
            iL = H1.b.l(j10);
        }
        if (H1.b.g(j10) && this.direction != EnumC14907k.f139712b) {
            int iRound2 = Math.round(H1.b.k(j10) * this.fraction);
            int iM = H1.b.m(j10);
            iK2 = H1.b.k(j10);
            if (iRound2 < iM) {
                iRound2 = iM;
            }
            if (iRound2 <= iK2) {
                iK2 = iRound2;
            }
            iK = iK2;
        } else {
            int iM2 = H1.b.m(j10);
            iK = H1.b.k(j10);
            iK2 = iM2;
        }
        f0 f0VarK0 = i10.k0(H1.c.a(iN, iL, iK2, iK));
        return androidx.compose.ui.layout.K.G0(k10, f0VarK0.getWidth(), f0VarK0.getHeight(), null, new a(f0VarK0), 4, null);
    }
}
