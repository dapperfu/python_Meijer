package d0;

import V0.AbstractC5467i0;
import V0.AbstractC5480m1;
import V0.C5490r0;
import V0.D1;
import V0.InterfaceC5459f1;
import V0.q1;
import X0.Stroke;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.AbstractC5959m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ3\u0010\u0013\u001a\u00020\u0012*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014JF\u0010\u001a\u001a\u00020\u0012*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR0\u0010'\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00028\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010\u000b\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R*\u00104\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, d2 = {"Ld0/g;", "Landroidx/compose/ui/node/m;", "LH1/h;", "widthParameter", "LV0/i0;", "brushParameter", "LV0/D1;", "shapeParameter", "<init>", "(FLV0/i0;LV0/D1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "LT0/d;", "brush", "LV0/m1$a;", "outline", "", "fillArea", "", "strokeWidth", "LT0/i;", "S2", "(LT0/d;LV0/i0;LV0/m1$a;ZF)LT0/i;", "LV0/m1$c;", "LU0/f;", "topLeft", "LU0/k;", "borderSize", "T2", "(LT0/d;LV0/i0;LV0/m1$c;JJZF)LT0/i;", "Ld0/e;", "q", "Ld0/e;", "borderCache", "value", "r", "F", "W2", "()F", "Y2", "(F)V", "width", "s", "LV0/i0;", "U2", "()LV0/i0;", "X2", "(LV0/i0;)V", "t", "LV0/D1;", "V2", "()LV0/D1;", "K1", "(LV0/D1;)V", "shape", "LT0/c;", "u", "LT0/c;", "drawWithCacheModifierNode", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: d0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13573g extends AbstractC5959m {

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private BorderCache borderCache;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private float width;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private AbstractC5467i0 brush;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private D1 shape;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final T0.c drawWithCacheModifierNode;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LX0/c;", "", "a", "(LX0/c;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: d0.g$a */
    static final class a extends Lambda implements Function1<X0.c, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AbstractC5480m1.a f127764f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ AbstractC5467i0 f127765g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC5480m1.a aVar, AbstractC5467i0 abstractC5467i0) {
            super(1);
            this.f127764f = aVar;
            this.f127765g = abstractC5467i0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(X0.c cVar) {
            a(cVar);
            return Unit.f143329a;
        }

        public final void a(X0.c cVar) {
            cVar.a2();
            X0.f.h0(cVar, this.f127764f.getPath(), this.f127765g, 0.0f, null, null, 0, 60, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LX0/c;", "", "a", "(LX0/c;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: d0.g$b */
    static final class b extends Lambda implements Function1<X0.c, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Rect f127766f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<InterfaceC5459f1> f127767g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f127768h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ C5490r0 f127769i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Rect rect, Ref.ObjectRef<InterfaceC5459f1> objectRef, long j10, C5490r0 c5490r0) {
            super(1);
            this.f127766f = rect;
            this.f127767g = objectRef;
            this.f127768h = j10;
            this.f127769i = c5490r0;
        }

        public final void a(X0.c cVar) {
            cVar.a2();
            float left = this.f127766f.getLeft();
            float top = this.f127766f.getTop();
            Ref.ObjectRef<InterfaceC5459f1> objectRef = this.f127767g;
            long j10 = this.f127768h;
            C5490r0 c5490r0 = this.f127769i;
            cVar.getDrawContext().getTransform().d(left, top);
            try {
                X0.f.e0(cVar, objectRef.f143742a, 0L, j10, 0L, 0L, 0.0f, null, c5490r0, 0, 0, 890, null);
            } finally {
                cVar.getDrawContext().getTransform().d(-left, -top);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(X0.c cVar) {
            a(cVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LX0/c;", "", "a", "(LX0/c;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: d0.g$c */
    static final class c extends Lambda implements Function1<X0.c, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f127770f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ AbstractC5467i0 f127771g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f127772h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f127773i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f127774j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ long f127775k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ long f127776l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Stroke f127777m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z10, AbstractC5467i0 abstractC5467i0, long j10, float f10, float f11, long j11, long j12, Stroke stroke) {
            super(1);
            this.f127770f = z10;
            this.f127771g = abstractC5467i0;
            this.f127772h = j10;
            this.f127773i = f10;
            this.f127774j = f11;
            this.f127775k = j11;
            this.f127776l = j12;
            this.f127777m = stroke;
        }

        public final void a(X0.c cVar) {
            cVar.a2();
            if (this.f127770f) {
                X0.f.t1(cVar, this.f127771g, 0L, 0L, this.f127772h, 0.0f, null, null, 0, 246, null);
                return;
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f127772h >> 32));
            float f10 = this.f127773i;
            if (fIntBitsToFloat >= f10) {
                X0.f.t1(cVar, this.f127771g, this.f127775k, this.f127776l, C13572f.n(this.f127772h, f10), 0.0f, this.f127777m, null, 0, 208, null);
                return;
            }
            float f11 = this.f127774j;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (cVar.b() >> 32)) - this.f127774j;
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (cVar.b() & 4294967295L)) - this.f127774j;
            int iA = androidx.compose.ui.graphics.b.INSTANCE.a();
            AbstractC5467i0 abstractC5467i0 = this.f127771g;
            long j10 = this.f127772h;
            X0.d drawContext = cVar.getDrawContext();
            long jB = drawContext.b();
            drawContext.g().save();
            try {
                drawContext.getTransform().c(f11, f11, fIntBitsToFloat2, fIntBitsToFloat3, iA);
                X0.f.t1(cVar, abstractC5467i0, 0L, 0L, j10, 0.0f, null, null, 0, 246, null);
            } finally {
                drawContext.g().i();
                drawContext.h(jB);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(X0.c cVar) {
            a(cVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LX0/c;", "", "a", "(LX0/c;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: d0.g$d */
    static final class d extends Lambda implements Function1<X0.c, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ q1 f127778f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ AbstractC5467i0 f127779g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(q1 q1Var, AbstractC5467i0 abstractC5467i0) {
            super(1);
            this.f127778f = q1Var;
            this.f127779g = abstractC5467i0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(X0.c cVar) {
            a(cVar);
            return Unit.f143329a;
        }

        public final void a(X0.c cVar) {
            cVar.a2();
            X0.f.h0(cVar, this.f127778f, this.f127779g, 0.0f, null, null, 0, 60, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LT0/d;", "LT0/i;", "a", "(LT0/d;)LT0/i;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: d0.g$e */
    static final class e extends Lambda implements Function1<T0.d, T0.i> {
        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T0.i invoke(T0.d dVar) {
            if (dVar.I1(C13573g.this.getWidth()) < 0.0f || U0.k.h(dVar.b()) <= 0.0f) {
                return C13572f.l(dVar);
            }
            float f10 = 2;
            float fMin = Math.min(H1.h.u(C13573g.this.getWidth(), H1.h.INSTANCE.a()) ? 1.0f : (float) Math.ceil(dVar.I1(C13573g.this.getWidth())), (float) Math.ceil(U0.k.h(dVar.b()) / f10));
            float f11 = fMin / f10;
            long jE = U0.f.e((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
            long jD = U0.k.d((Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.b() >> 32)) - fMin) << 32) | (4294967295L & Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.b() & 4294967295L)) - fMin)));
            boolean z10 = f10 * fMin > U0.k.h(dVar.b());
            AbstractC5480m1 abstractC5480m1A = C13573g.this.getShape().a(dVar.b(), dVar.getLayoutDirection(), dVar);
            if (abstractC5480m1A instanceof AbstractC5480m1.a) {
                C13573g c13573g = C13573g.this;
                return c13573g.S2(dVar, c13573g.getBrush(), (AbstractC5480m1.a) abstractC5480m1A, z10, fMin);
            }
            if (abstractC5480m1A instanceof AbstractC5480m1.c) {
                C13573g c13573g2 = C13573g.this;
                return c13573g2.T2(dVar, c13573g2.getBrush(), (AbstractC5480m1.c) abstractC5480m1A, jE, jD, z10, fMin);
            }
            if (abstractC5480m1A instanceof AbstractC5480m1.b) {
                return C13572f.m(dVar, C13573g.this.getBrush(), jE, jD, z10, fMin);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public /* synthetic */ C13573g(float f10, AbstractC5467i0 abstractC5467i0, D1 d12, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, abstractC5467i0, d12);
    }

    private C13573g(float f10, AbstractC5467i0 abstractC5467i0, D1 d12) {
        this.width = f10;
        this.brush = abstractC5467i0;
        this.shape = d12;
        this.drawWithCacheModifierNode = (T0.c) K2(androidx.compose.ui.draw.b.a(new e()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015f  */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, V0.f1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T0.i S2(T0.d r43, V0.AbstractC5467i0 r44, V0.AbstractC5480m1.a r45, boolean r46, float r47) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.C13573g.S2(T0.d, V0.i0, V0.m1$a, boolean, float):T0.i");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T0.i T2(T0.d dVar, AbstractC5467i0 abstractC5467i0, AbstractC5480m1.c cVar, long j10, long j11, boolean z10, float f10) {
        if (U0.j.h(cVar.getRoundRect())) {
            return dVar.q(new c(z10, abstractC5467i0, cVar.getRoundRect().getTopLeftCornerRadius(), f10 / 2, f10, j10, j11, new Stroke(f10, 0.0f, 0, 0, null, 30, null)));
        }
        if (this.borderCache == null) {
            this.borderCache = new BorderCache(null, null, null, null, 15, null);
        }
        BorderCache borderCache = this.borderCache;
        Intrinsics.g(borderCache);
        return dVar.q(new d(C13572f.k(borderCache.g(), cVar.getRoundRect(), f10, z10), abstractC5467i0));
    }

    public final void K1(D1 d12) {
        if (Intrinsics.e(this.shape, d12)) {
            return;
        }
        this.shape = d12;
        this.drawWithCacheModifierNode.c1();
    }

    /* renamed from: U2, reason: from getter */
    public final AbstractC5467i0 getBrush() {
        return this.brush;
    }

    /* renamed from: V2, reason: from getter */
    public final D1 getShape() {
        return this.shape;
    }

    /* renamed from: W2, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    public final void X2(AbstractC5467i0 abstractC5467i0) {
        if (Intrinsics.e(this.brush, abstractC5467i0)) {
            return;
        }
        this.brush = abstractC5467i0;
        this.drawWithCacheModifierNode.c1();
    }

    public final void Y2(float f10) {
        if (H1.h.u(this.width, f10)) {
            return;
        }
        this.width = f10;
        this.drawWithCacheModifierNode.c1();
    }
}
