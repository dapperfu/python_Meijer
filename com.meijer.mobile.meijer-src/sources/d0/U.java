package d0;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5933s;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.u0;
import com.google.android.gms.common.api.a;
import kotlin.EnumC13937z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import r1.ScrollAxisRange;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ&\u0010\u0011\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u00020\u0015*\u00020\u00132\u0006\u0010\r\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001a\u001a\u00020\u0015*\u00020\u00132\u0006\u0010\r\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J#\u0010\u001b\u001a\u00020\u0015*\u00020\u00132\u0006\u0010\r\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u0018J#\u0010\u001c\u001a\u00020\u0015*\u00020\u00132\u0006\u0010\r\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u0018J\u0013\u0010\u001f\u001a\u00020\u001e*\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Ld0/U;", "Landroidx/compose/ui/node/D;", "Landroidx/compose/ui/node/u0;", "Landroidx/compose/ui/Modifier$c;", "Ld0/V;", "state", "", "reverseScrolling", "isVertical", "<init>", "(Ld0/V;ZZ)V", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;", "Landroidx/compose/ui/layout/s;", "Landroidx/compose/ui/layout/r;", "", "height", "J", "(Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/r;I)I", "width", "F", "N", "r", "Lr1/u;", "", "T1", "(Lr1/u;)V", "o", "Ld0/V;", "L2", "()Ld0/V;", "O2", "(Ld0/V;)V", "p", "Z", "K2", "()Z", "N2", "(Z)V", "q", "M2", "P2", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class U extends Modifier.c implements androidx.compose.ui.node.D, u0 {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private V state;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean reverseScrolling;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean isVertical;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function0<Float> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(U.this.getState().o());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    static final class b extends Lambda implements Function0<Float> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(U.this.getState().n());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class c extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f127700g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ f0 f127701h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends Lambda implements Function1<f0.a, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ f0 f127702f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f127703g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f127704h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f0 f0Var, int i10, int i11) {
                super(1);
                this.f127702f = f0Var;
                this.f127703g = i10;
                this.f127704h = i11;
            }

            public final void a(f0.a aVar) {
                f0.a.p(aVar, this.f127702f, this.f127703g, this.f127704h, 0.0f, null, 12, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
                a(aVar);
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i10, f0 f0Var) {
            super(1);
            this.f127700g = i10;
            this.f127701h = f0Var;
        }

        public final void a(f0.a aVar) {
            int iO = U.this.getState().o();
            int i10 = this.f127700g;
            if (iO < 0) {
                iO = 0;
            }
            if (iO <= i10) {
                i10 = iO;
            }
            int i11 = U.this.getReverseScrolling() ? i10 - this.f127700g : -i10;
            aVar.A(new a(this.f127701h, U.this.getIsVertical() ? 0 : i11, U.this.getIsVertical() ? i11 : 0));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f143329a;
        }
    }

    @Override // androidx.compose.ui.node.u0
    public void T1(r1.u uVar) {
        r1.s.H0(uVar, true);
        ScrollAxisRange scrollAxisRange = new ScrollAxisRange(new a(), new b(), this.reverseScrolling);
        if (this.isVertical) {
            r1.s.I0(uVar, scrollAxisRange);
        } else {
            r1.s.l0(uVar, scrollAxisRange);
        }
    }

    @Override // androidx.compose.ui.node.D
    public int F(InterfaceC5933s interfaceC5933s, androidx.compose.ui.layout.r rVar, int i10) {
        if (!this.isVertical) {
            i10 = a.e.API_PRIORITY_OTHER;
        }
        return rVar.W(i10);
    }

    @Override // androidx.compose.ui.node.D
    public int J(InterfaceC5933s interfaceC5933s, androidx.compose.ui.layout.r rVar, int i10) {
        if (this.isVertical) {
            i10 = a.e.API_PRIORITY_OTHER;
        }
        return rVar.d0(i10);
    }

    /* renamed from: K2, reason: from getter */
    public final boolean getReverseScrolling() {
        return this.reverseScrolling;
    }

    /* renamed from: L2, reason: from getter */
    public final V getState() {
        return this.state;
    }

    /* renamed from: M2, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    @Override // androidx.compose.ui.node.D
    public int N(InterfaceC5933s interfaceC5933s, androidx.compose.ui.layout.r rVar, int i10) {
        if (this.isVertical) {
            i10 = a.e.API_PRIORITY_OTHER;
        }
        return rVar.j0(i10);
    }

    public final void N2(boolean z10) {
        this.reverseScrolling = z10;
    }

    public final void O2(V v10) {
        this.state = v10;
    }

    public final void P2(boolean z10) {
        this.isVertical = z10;
    }

    @Override // androidx.compose.ui.node.D
    public androidx.compose.ui.layout.J a(androidx.compose.ui.layout.K k10, androidx.compose.ui.layout.I i10, long j10) {
        C13577k.a(j10, this.isVertical ? EnumC13937z.f131419a : EnumC13937z.f131420b);
        boolean z10 = this.isVertical;
        int iL = a.e.API_PRIORITY_OTHER;
        int iK = z10 ? Integer.MAX_VALUE : H1.b.k(j10);
        if (this.isVertical) {
            iL = H1.b.l(j10);
        }
        f0 f0VarK0 = i10.k0(H1.b.d(j10, 0, iL, 0, iK, 5, null));
        int iK2 = RangesKt.k(f0VarK0.getWidth(), H1.b.l(j10));
        int iK3 = RangesKt.k(f0VarK0.getHeight(), H1.b.k(j10));
        int height = f0VarK0.getHeight() - iK3;
        int width = f0VarK0.getWidth() - iK2;
        if (!this.isVertical) {
            height = width;
        }
        this.state.q(height);
        this.state.s(this.isVertical ? iK3 : iK2);
        return androidx.compose.ui.layout.K.G0(k10, iK2, iK3, null, new c(height, f0VarK0), 4, null);
    }

    @Override // androidx.compose.ui.node.D
    public int r(InterfaceC5933s interfaceC5933s, androidx.compose.ui.layout.r rVar, int i10) {
        if (!this.isVertical) {
            i10 = a.e.API_PRIORITY_OTHER;
        }
        return rVar.A(i10);
    }

    public U(V v10, boolean z10, boolean z11) {
        this.state = v10;
        this.reverseScrolling = z10;
        this.isVertical = z11;
    }
}
