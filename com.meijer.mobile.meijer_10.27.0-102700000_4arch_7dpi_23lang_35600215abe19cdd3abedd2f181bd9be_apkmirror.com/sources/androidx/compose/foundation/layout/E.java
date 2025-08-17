package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.f0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0012\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R(\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R(\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R(\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R(\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, d2 = {"Landroidx/compose/foundation/layout/E;", "Landroidx/compose/ui/node/D;", "Landroidx/compose/ui/Modifier$c;", "LH1/h;", "start", "top", "end", "bottom", "", "rtlAware", "<init>", "(FFFFZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;", "o", "F", "L2", "()F", "Q2", "(F)V", "p", "M2", "R2", "q", "getEnd-D9Ej5fM", "O2", "r", "getBottom-D9Ej5fM", "N2", "s", "Z", "K2", "()Z", "P2", "(Z)V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class E extends Modifier.c implements androidx.compose.ui.node.D {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private float start;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private float top;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private float end;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private float bottom;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean rtlAware;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ f0 f48426g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.K f48427h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f0 f0Var, androidx.compose.ui.layout.K k10) {
            super(1);
            this.f48426g = f0Var;
            this.f48427h = k10;
        }

        public final void a(f0.a aVar) {
            if (E.this.getRtlAware()) {
                f0.a.l(aVar, this.f48426g, this.f48427h.E0(E.this.getStart()), this.f48427h.E0(E.this.getTop()), 0.0f, 4, null);
            } else {
                f0.a.h(aVar, this.f48426g, this.f48427h.E0(E.this.getStart()), this.f48427h.E0(E.this.getTop()), 0.0f, 4, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f142422a;
        }
    }

    public /* synthetic */ E(float f10, float f11, float f12, float f13, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, z10);
    }

    private E(float f10, float f11, float f12, float f13, boolean z10) {
        this.start = f10;
        this.top = f11;
        this.end = f12;
        this.bottom = f13;
        this.rtlAware = z10;
    }

    /* renamed from: K2, reason: from getter */
    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    /* renamed from: L2, reason: from getter */
    public final float getStart() {
        return this.start;
    }

    /* renamed from: M2, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    public final void N2(float f10) {
        this.bottom = f10;
    }

    public final void O2(float f10) {
        this.end = f10;
    }

    public final void P2(boolean z10) {
        this.rtlAware = z10;
    }

    public final void Q2(float f10) {
        this.start = f10;
    }

    public final void R2(float f10) {
        this.top = f10;
    }

    @Override // androidx.compose.ui.node.D
    public androidx.compose.ui.layout.J a(androidx.compose.ui.layout.K k10, androidx.compose.ui.layout.I i10, long j10) {
        int iE0 = k10.E0(this.start) + k10.E0(this.end);
        int iE02 = k10.E0(this.top) + k10.E0(this.bottom);
        f0 f0VarK0 = i10.k0(H1.c.i(j10, -iE0, -iE02));
        return androidx.compose.ui.layout.K.G0(k10, H1.c.g(j10, f0VarK0.getWidth() + iE0), H1.c.f(j10, f0VarK0.getHeight() + iE02), null, new a(f0VarK0, k10), 4, null);
    }
}
