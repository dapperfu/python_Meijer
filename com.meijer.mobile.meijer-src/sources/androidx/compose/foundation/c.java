package androidx.compose.foundation;

import H1.t;
import V0.AbstractC5467i0;
import V0.AbstractC5480m1;
import V0.C5483n1;
import V0.C5489q0;
import V0.D1;
import V0.x1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.C5966u;
import androidx.compose.ui.node.InterfaceC5965t;
import androidx.compose.ui.node.i0;
import androidx.compose.ui.node.j0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u000f*\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0011J\u000f\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R(\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u00103\u001a\u0002018\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b2\u0010\u001aR\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010:\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010<\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010,R\u0018\u0010>\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00109\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006?"}, d2 = {"Landroidx/compose/foundation/c;", "Landroidx/compose/ui/node/t;", "Landroidx/compose/ui/Modifier$c;", "Landroidx/compose/ui/node/i0;", "LV0/q0;", "color", "LV0/i0;", "brush", "", "alpha", "LV0/D1;", "shape", "<init>", "(JLV0/i0;FLV0/D1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "LX0/c;", "", "M2", "(LX0/c;)V", "L2", "LV0/m1;", "N2", "(LX0/c;)LV0/m1;", "I", "B0", "()V", "o", "J", "getColor-0d7_KjU", "()J", "Q2", "(J)V", "p", "LV0/i0;", "getBrush", "()LV0/i0;", "P2", "(LV0/i0;)V", "q", "F", "getAlpha", "()F", "d", "(F)V", "r", "LV0/D1;", "O2", "()LV0/D1;", "K1", "(LV0/D1;)V", "LU0/k;", "s", "lastSize", "LH1/t;", "t", "LH1/t;", "lastLayoutDirection", "u", "LV0/m1;", "lastOutline", "v", "lastShape", "w", "tmpOutline", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class c extends Modifier.c implements InterfaceC5965t, i0 {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private long color;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private AbstractC5467i0 brush;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private float alpha;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private D1 shape;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private long lastSize;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private t lastLayoutDirection;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private AbstractC5480m1 lastOutline;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private D1 lastShape;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private AbstractC5480m1 tmpOutline;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends Lambda implements Function0<Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ X0.c f48288g;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(X0.c cVar) {
            super(0);
            this.f48288g = cVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            c cVar = c.this;
            cVar.tmpOutline = cVar.getShape().a(this.f48288g.b(), this.f48288g.getLayoutDirection(), this.f48288g);
        }
    }

    public /* synthetic */ c(long j10, AbstractC5467i0 abstractC5467i0, float f10, D1 d12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, abstractC5467i0, f10, d12);
    }

    private c(long j10, AbstractC5467i0 abstractC5467i0, float f10, D1 d12) {
        this.color = j10;
        this.brush = abstractC5467i0;
        this.alpha = f10;
        this.shape = d12;
        this.lastSize = U0.k.INSTANCE.a();
    }

    private final void M2(X0.c cVar) {
        if (!C5489q0.s(this.color, C5489q0.INSTANCE.j())) {
            X0.f.i1(cVar, this.color, 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
        AbstractC5467i0 abstractC5467i0 = this.brush;
        if (abstractC5467i0 != null) {
            X0.f.m0(cVar, abstractC5467i0, 0L, 0L, this.alpha, null, null, 0, 118, null);
        }
    }

    @Override // androidx.compose.ui.node.i0
    public void B0() {
        this.lastSize = U0.k.INSTANCE.a();
        this.lastLayoutDirection = null;
        this.lastOutline = null;
        this.lastShape = null;
        C5966u.a(this);
    }

    @Override // androidx.compose.ui.node.InterfaceC5965t
    public void I(X0.c cVar) {
        if (this.shape == x1.a()) {
            M2(cVar);
        } else {
            L2(cVar);
        }
        cVar.a2();
    }

    public final void K1(D1 d12) {
        this.shape = d12;
    }

    /* renamed from: O2, reason: from getter */
    public final D1 getShape() {
        return this.shape;
    }

    public final void P2(AbstractC5467i0 abstractC5467i0) {
        this.brush = abstractC5467i0;
    }

    public final void Q2(long j10) {
        this.color = j10;
    }

    public final void d(float f10) {
        this.alpha = f10;
    }

    private final void L2(X0.c cVar) {
        X0.c cVar2;
        AbstractC5480m1 abstractC5480m1N2 = N2(cVar);
        if (!C5489q0.s(this.color, C5489q0.INSTANCE.j())) {
            cVar2 = cVar;
            C5483n1.e(cVar2, abstractC5480m1N2, this.color, 0.0f, null, null, 0, 60, null);
        } else {
            cVar2 = cVar;
        }
        AbstractC5467i0 abstractC5467i0 = this.brush;
        if (abstractC5467i0 != null) {
            C5483n1.c(cVar2, abstractC5480m1N2, abstractC5467i0, this.alpha, null, null, 0, 56, null);
        }
    }

    private final AbstractC5480m1 N2(X0.c cVar) {
        AbstractC5480m1 abstractC5480m1;
        if (U0.k.f(cVar.b(), this.lastSize) && cVar.getLayoutDirection() == this.lastLayoutDirection && Intrinsics.e(this.lastShape, this.shape)) {
            abstractC5480m1 = this.lastOutline;
            Intrinsics.g(abstractC5480m1);
        } else {
            j0.a(this, new a(cVar));
            abstractC5480m1 = this.tmpOutline;
            this.tmpOutline = null;
        }
        this.lastOutline = abstractC5480m1;
        this.lastSize = cVar.b();
        this.lastLayoutDirection = cVar.getLayoutDirection();
        this.lastShape = this.shape;
        Intrinsics.g(abstractC5480m1);
        return abstractC5480m1;
    }
}
