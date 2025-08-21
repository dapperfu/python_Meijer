package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.f0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u0013\u001a\u00020\u0012*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R(\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010&\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"Landroidx/compose/foundation/layout/B;", "Landroidx/compose/ui/node/D;", "Landroidx/compose/ui/Modifier$c;", "LH1/h;", "x", "y", "", "rtlAware", "<init>", "(FFZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "N2", "(FFZ)V", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;", "o", "F", "L2", "()F", "setX-0680j_4", "(F)V", "p", "M2", "setY-0680j_4", "q", "Z", "K2", "()Z", "setRtlAware", "(Z)V", "r", "o2", "shouldAutoInvalidate", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class B extends Modifier.c implements androidx.compose.ui.node.D {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private float x;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private float y;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean rtlAware;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ f0 f48625g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.K f48626h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f0 f0Var, androidx.compose.ui.layout.K k10) {
            super(1);
            this.f48625g = f0Var;
            this.f48626h = k10;
        }

        public final void a(f0.a aVar) {
            if (B.this.getRtlAware()) {
                f0.a.l(aVar, this.f48625g, this.f48626h.E0(B.this.getX()), this.f48626h.E0(B.this.getY()), 0.0f, 4, null);
            } else {
                f0.a.h(aVar, this.f48625g, this.f48626h.E0(B.this.getX()), this.f48626h.E0(B.this.getY()), 0.0f, 4, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f143329a;
        }
    }

    public /* synthetic */ B(float f10, float f11, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, z10);
    }

    private B(float f10, float f11, boolean z10) {
        this.x = f10;
        this.y = f11;
        this.rtlAware = z10;
    }

    /* renamed from: K2, reason: from getter */
    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    /* renamed from: L2, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* renamed from: M2, reason: from getter */
    public final float getY() {
        return this.y;
    }

    public final void N2(float x10, float y10, boolean rtlAware) {
        if (!H1.h.u(this.x, x10) || !H1.h.u(this.y, y10) || this.rtlAware != rtlAware) {
            androidx.compose.ui.node.G.c(this);
        }
        this.x = x10;
        this.y = y10;
        this.rtlAware = rtlAware;
    }

    @Override // androidx.compose.ui.Modifier.c
    /* renamed from: o2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.node.D
    public androidx.compose.ui.layout.J a(androidx.compose.ui.layout.K k10, androidx.compose.ui.layout.I i10, long j10) {
        f0 f0VarK0 = i10.k0(j10);
        return androidx.compose.ui.layout.K.G0(k10, f0VarK0.getWidth(), f0VarK0.getHeight(), null, new a(f0VarK0, k10), 4, null);
    }
}
