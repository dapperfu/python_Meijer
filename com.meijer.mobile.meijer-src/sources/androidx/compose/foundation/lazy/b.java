package androidx.compose.foundation.lazy;

import H1.c;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.D;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ&\u0010\u0011\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/foundation/lazy/b;", "Landroidx/compose/ui/node/D;", "Landroidx/compose/ui/Modifier$c;", "", "fraction", "Landroidx/compose/runtime/z1;", "", "widthState", "heightState", "<init>", "(FLandroidx/compose/runtime/z1;Landroidx/compose/runtime/z1;)V", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;", "o", "F", "getFraction", "()F", "K2", "(F)V", "p", "Landroidx/compose/runtime/z1;", "getWidthState", "()Landroidx/compose/runtime/z1;", "M2", "(Landroidx/compose/runtime/z1;)V", "q", "getHeightState", "L2", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class b extends Modifier.c implements D {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private float fraction;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private z1<Integer> widthState;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private z1<Integer> heightState;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ f0 f48966f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f0 f0Var) {
            super(1);
            this.f48966f = f0Var;
        }

        public final void a(f0.a aVar) {
            f0.a.h(aVar, this.f48966f, 0, 0, 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f143329a;
        }
    }

    public final void K2(float f10) {
        this.fraction = f10;
    }

    public final void L2(z1<Integer> z1Var) {
        this.heightState = z1Var;
    }

    public final void M2(z1<Integer> z1Var) {
        this.widthState = z1Var;
    }

    @Override // androidx.compose.ui.node.D
    public J a(K k10, I i10, long j10) {
        z1<Integer> z1Var = this.widthState;
        int iRound = (z1Var == null || z1Var.getValue().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(z1Var.getValue().floatValue() * this.fraction);
        z1<Integer> z1Var2 = this.heightState;
        int iRound2 = (z1Var2 == null || z1Var2.getValue().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(z1Var2.getValue().floatValue() * this.fraction);
        int iN = iRound != Integer.MAX_VALUE ? iRound : H1.b.n(j10);
        int iM = iRound2 != Integer.MAX_VALUE ? iRound2 : H1.b.m(j10);
        if (iRound == Integer.MAX_VALUE) {
            iRound = H1.b.l(j10);
        }
        if (iRound2 == Integer.MAX_VALUE) {
            iRound2 = H1.b.k(j10);
        }
        f0 f0VarK0 = i10.k0(c.a(iN, iRound, iM, iRound2));
        return K.G0(k10, f0VarK0.getWidth(), f0VarK0.getHeight(), null, new a(f0VarK0), 4, null);
    }

    public b(float f10, z1<Integer> z1Var, z1<Integer> z1Var2) {
        this.fraction = f10;
        this.widthState = z1Var;
        this.heightState = z1Var2;
    }
}
