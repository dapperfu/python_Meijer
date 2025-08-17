package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5791s;
import androidx.compose.ui.layout.f0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000e\u001a\u00020\r*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J#\u0010\u0018\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0015J#\u0010\u0019\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0015R(\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/foundation/layout/L;", "Landroidx/compose/ui/node/D;", "Landroidx/compose/ui/Modifier$c;", "LH1/h;", "minWidth", "minHeight", "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;", "Landroidx/compose/ui/layout/s;", "Landroidx/compose/ui/layout/r;", "", "height", "J", "(Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/r;I)I", "N", "width", "F", "r", "o", "getMinWidth-D9Ej5fM", "()F", "L2", "(F)V", "p", "getMinHeight-D9Ej5fM", "K2", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class L extends Modifier.c implements androidx.compose.ui.node.D {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private float minWidth;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private float minHeight;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ f0 f48495f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f0 f0Var) {
            super(1);
            this.f48495f = f0Var;
        }

        public final void a(f0.a aVar) {
            f0.a.l(aVar, this.f48495f, 0, 0, 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f142422a;
        }
    }

    public /* synthetic */ L(float f10, float f11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11);
    }

    private L(float f10, float f11) {
        this.minWidth = f10;
        this.minHeight = f11;
    }

    public final void K2(float f10) {
        this.minHeight = f10;
    }

    public final void L2(float f10) {
        this.minWidth = f10;
    }

    @Override // androidx.compose.ui.node.D
    public androidx.compose.ui.layout.J a(androidx.compose.ui.layout.K k10, androidx.compose.ui.layout.I i10, long j10) {
        int iN;
        int iM;
        if (Float.isNaN(this.minWidth) || H1.b.n(j10) != 0) {
            iN = H1.b.n(j10);
        } else {
            int iE0 = k10.E0(this.minWidth);
            iN = H1.b.l(j10);
            if (iE0 < 0) {
                iE0 = 0;
            }
            if (iE0 <= iN) {
                iN = iE0;
            }
        }
        int iL = H1.b.l(j10);
        if (Float.isNaN(this.minHeight) || H1.b.m(j10) != 0) {
            iM = H1.b.m(j10);
        } else {
            int iE02 = k10.E0(this.minHeight);
            iM = H1.b.k(j10);
            int i11 = iE02 >= 0 ? iE02 : 0;
            if (i11 <= iM) {
                iM = i11;
            }
        }
        f0 f0VarK0 = i10.k0(H1.c.a(iN, iL, iM, H1.b.k(j10)));
        return androidx.compose.ui.layout.K.G0(k10, f0VarK0.getWidth(), f0VarK0.getHeight(), null, new a(f0VarK0), 4, null);
    }

    @Override // androidx.compose.ui.node.D
    public int F(InterfaceC5791s interfaceC5791s, androidx.compose.ui.layout.r rVar, int i10) {
        int iE0;
        int iW = rVar.W(i10);
        if (!Float.isNaN(this.minHeight)) {
            iE0 = interfaceC5791s.E0(this.minHeight);
        } else {
            iE0 = 0;
        }
        if (iW < iE0) {
            return iE0;
        }
        return iW;
    }

    @Override // androidx.compose.ui.node.D
    public int J(InterfaceC5791s interfaceC5791s, androidx.compose.ui.layout.r rVar, int i10) {
        int iE0;
        int iD0 = rVar.d0(i10);
        if (!Float.isNaN(this.minWidth)) {
            iE0 = interfaceC5791s.E0(this.minWidth);
        } else {
            iE0 = 0;
        }
        if (iD0 < iE0) {
            return iE0;
        }
        return iD0;
    }

    @Override // androidx.compose.ui.node.D
    public int N(InterfaceC5791s interfaceC5791s, androidx.compose.ui.layout.r rVar, int i10) {
        int iE0;
        int iJ0 = rVar.j0(i10);
        if (!Float.isNaN(this.minWidth)) {
            iE0 = interfaceC5791s.E0(this.minWidth);
        } else {
            iE0 = 0;
        }
        if (iJ0 < iE0) {
            return iE0;
        }
        return iJ0;
    }

    @Override // androidx.compose.ui.node.D
    public int r(InterfaceC5791s interfaceC5791s, androidx.compose.ui.layout.r rVar, int i10) {
        int iE0;
        int iA = rVar.A(i10);
        if (!Float.isNaN(this.minHeight)) {
            iE0 = interfaceC5791s.E0(this.minHeight);
        } else {
            iE0 = 0;
        }
        if (iA < iE0) {
            return iE0;
        }
        return iA;
    }
}
