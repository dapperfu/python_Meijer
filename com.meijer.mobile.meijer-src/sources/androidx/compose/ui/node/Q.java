package androidx.compose.ui.node;

import androidx.compose.ui.layout.AbstractC5916a;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.LayoutNode;
import j1.C14920a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000e\b \u0018\u0000 o2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001pB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00020\n2\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0086\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\nH ¢\u0006\u0004\b!\u0010\u0005J\u0013\u0010#\u001a\u00020\n*\u00020\"H\u0004¢\u0006\u0004\b#\u0010$Jg\u00100\u001a\u00020/2\u0006\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u001d2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d0'2\u0019\u0010,\u001a\u0015\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\n\u0018\u00010)¢\u0006\u0002\b+2\u0017\u0010.\u001a\u0013\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\n0)¢\u0006\u0002\b+H\u0016¢\u0006\u0004\b0\u00101J\u0019\u00103\u001a\u00020\n2\b\u00102\u001a\u0004\u0018\u00010/H\u0000¢\u0006\u0004\b3\u00104R\u0018\u00107\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\"\u0010=\u001a\u00020\u00178\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010\u001aR\"\u0010A\u001a\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b>\u00109\u001a\u0004\b?\u0010;\"\u0004\b@\u0010\u001aR\"\u0010E\u001a\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bB\u00109\u001a\u0004\bC\u0010;\"\u0004\bD\u0010\u001aR\u0017\u0010J\u001a\u00020-8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001e\u0010N\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u001e\u0010P\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010MR0\u0010T\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u001a\u0010X\u001a\u00020U8&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0016\u0010[\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0016\u0010]\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010ZR\u0014\u0010_\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b^\u0010;R\u0014\u0010b\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0014\u0010f\u001a\u00020c8&X¦\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0011\u0010i\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0014\u0010l\u001a\u00020/8 X \u0004¢\u0006\u0006\u001a\u0004\bj\u0010kR\u0014\u0010n\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010;\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006q"}, d2 = {"Landroidx/compose/ui/node/Q;", "Landroidx/compose/ui/layout/f0;", "Landroidx/compose/ui/node/W;", "Landroidx/compose/ui/node/Z;", "<init>", "()V", "Landroidx/compose/ui/layout/k0;", "ruler", "l1", "(Landroidx/compose/ui/layout/k0;)Landroidx/compose/ui/node/Q;", "", "z1", "(Landroidx/compose/ui/layout/k0;)V", "Landroidx/compose/ui/node/p0;", "placeableResult", "h1", "(Landroidx/compose/ui/node/p0;)V", "LZ/X;", "Landroidx/compose/ui/node/F0;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNodes", "M1", "(LZ/X;)V", "", "newMFR", "R", "(Z)V", "Landroidx/compose/ui/layout/a;", "alignmentLine", "", "l0", "(Landroidx/compose/ui/layout/a;)I", "d1", "R1", "Landroidx/compose/ui/node/NodeCoordinator;", "y1", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "width", "height", "", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/l0;", "Lkotlin/ExtensionFunctionType;", "rulers", "Landroidx/compose/ui/layout/f0$a;", "placementBlock", "Landroidx/compose/ui/layout/J;", "O1", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/J;", "result", "j1", "(Landroidx/compose/ui/layout/J;)V", "f", "Landroidx/compose/ui/layout/l0;", "_rulerScope", "g", "Z", "A1", "()Z", "T1", "isPlacedUnderMotionFrameOfReference", "h", "J1", "X1", "isShallowPlacing", "i", "E1", "V1", "isPlacingForAlignment", "j", "Landroidx/compose/ui/layout/f0$a;", "v1", "()Landroidx/compose/ui/layout/f0$a;", "placementScope", "LZ/Q;", "k", "LZ/Q;", "rulerValues", "l", "rulerValuesCache", "LZ/W;", "m", "LZ/W;", "rulerReaders", "LH1/n;", "w1", "()J", "position", "m1", "()Landroidx/compose/ui/node/Q;", "child", "u1", "parent", "r1", "hasMeasureResult", "S1", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/layout/LayoutCoordinates;", "q1", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "x1", "()Landroidx/compose/ui/layout/l0;", "rulerScope", "s1", "()Landroidx/compose/ui/layout/J;", "measureResult", "v0", "isLookingAhead", "n", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class Q extends androidx.compose.ui.layout.f0 implements W, Z {

    /* renamed from: o, reason: collision with root package name */
    private static final Function1<PlaceableResult, Unit> f51575o = a.f51584f;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.ui.layout.l0 _rulerScope;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isPlacedUnderMotionFrameOfReference;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isShallowPlacing;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isPlacingForAlignment;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final f0.a placementScope = androidx.compose.ui.layout.g0.a(this);

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private Z.Q<androidx.compose.ui.layout.k0> rulerValues;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private Z.Q<androidx.compose.ui.layout.k0> rulerValuesCache;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private Z.W<androidx.compose.ui.layout.k0, Z.X<F0<LayoutNode>>> rulerReaders;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/p0;", "result", "", "a", "(Landroidx/compose/ui/node/p0;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<PlaceableResult, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f51584f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PlaceableResult p0Var) {
            a(p0Var);
            return Unit.f143329a;
        }

        public final void a(PlaceableResult p0Var) {
            if (p0Var.e1()) {
                p0Var.getPlaceable().h1(p0Var);
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ PlaceableResult f51585f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Q f51586g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(PlaceableResult p0Var, Q q10) {
            super(0);
            this.f51585f = p0Var;
            this.f51586g = q10;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Function1<androidx.compose.ui.layout.l0, Unit> function1T = this.f51585f.getResult().t();
            if (function1T != null) {
                function1T.invoke(this.f51586g.x1());
            }
        }
    }

    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR'\u0010\u0015\u001a\u0015\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010¢\u0006\u0002\b\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"androidx/compose/ui/node/Q$d", "Landroidx/compose/ui/layout/J;", "", "s", "()V", "", "getWidth", "()I", "width", "getHeight", "height", "", "Landroidx/compose/ui/layout/a;", "r", "()Ljava/util/Map;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/l0;", "Lkotlin/ExtensionFunctionType;", "t", "()Lkotlin/jvm/functions/Function1;", "rulers", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements androidx.compose.ui.layout.J {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f51587a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f51588b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map<AbstractC5916a, Integer> f51589c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.ui.layout.l0, Unit> f51590d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<f0.a, Unit> f51591e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Q f51592f;

        /* JADX WARN: Multi-variable type inference failed */
        d(int i10, int i11, Map<AbstractC5916a, Integer> map, Function1<? super androidx.compose.ui.layout.l0, Unit> function1, Function1<? super f0.a, Unit> function12, Q q10) {
            this.f51587a = i10;
            this.f51588b = i11;
            this.f51589c = map;
            this.f51590d = function1;
            this.f51591e = function12;
            this.f51592f = q10;
        }

        @Override // androidx.compose.ui.layout.J
        public int getHeight() {
            return this.f51588b;
        }

        @Override // androidx.compose.ui.layout.J
        public int getWidth() {
            return this.f51587a;
        }

        @Override // androidx.compose.ui.layout.J
        public Map<AbstractC5916a, Integer> r() {
            return this.f51589c;
        }

        @Override // androidx.compose.ui.layout.J
        public void s() {
            this.f51591e.invoke(this.f51592f.getPlacementScope());
        }

        @Override // androidx.compose.ui.layout.J
        public Function1<androidx.compose.ui.layout.l0, Unit> t() {
            return this.f51590d;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\b"}, d2 = {"androidx/compose/ui/node/Q$e", "Landroidx/compose/ui/layout/l0;", "", "getDensity", "()F", "density", "F1", "fontScale", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements androidx.compose.ui.layout.l0 {
        e() {
        }

        @Override // H1.l
        /* renamed from: F1 */
        public float getFontScale() {
            return Q.this.getFontScale();
        }

        @Override // H1.d
        public float getDensity() {
            return Q.this.getDensity();
        }
    }

    private final Q l1(androidx.compose.ui.layout.k0 ruler) {
        Q q10 = this;
        while (true) {
            Z.Q<androidx.compose.ui.layout.k0> q11 = q10.rulerValues;
            if (q11 != null && q11.a(ruler)) {
                return q10;
            }
            Q qU1 = q10.u1();
            if (qU1 == null) {
                return q10;
            }
            q10 = qU1;
        }
    }

    public abstract void R1();

    /* renamed from: S1 */
    public abstract LayoutNode getLayoutNode();

    public abstract int d1(AbstractC5916a alignmentLine);

    public abstract Q m1();

    public abstract LayoutCoordinates q1();

    public abstract boolean r1();

    public abstract androidx.compose.ui.layout.J s1();

    public abstract Q u1();

    @Override // androidx.compose.ui.layout.InterfaceC5933s
    public boolean v0() {
        return false;
    }

    /* renamed from: w1 */
    public abstract long getPosition();

    /* JADX WARN: Multi-variable type inference failed */
    private final void M1(Z.X<F0<LayoutNode>> layoutNodes) {
        LayoutNode layoutNode;
        Object[] objArr = layoutNodes.elements;
        long[] jArr = layoutNodes.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128 && (layoutNode = (LayoutNode) ((F0) objArr[(i10 << 3) + i12]).get()) != null) {
                        if (v0()) {
                            layoutNode.l1(false);
                        } else {
                            layoutNode.p1(false);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h1(androidx.compose.ui.node.PlaceableResult r28) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.Q.h1(androidx.compose.ui.node.p0):void");
    }

    /* renamed from: A1, reason: from getter */
    public boolean getIsPlacedUnderMotionFrameOfReference() {
        return this.isPlacedUnderMotionFrameOfReference;
    }

    /* renamed from: E1, reason: from getter */
    public final boolean getIsPlacingForAlignment() {
        return this.isPlacingForAlignment;
    }

    /* renamed from: J1, reason: from getter */
    public final boolean getIsShallowPlacing() {
        return this.isShallowPlacing;
    }

    @Override // androidx.compose.ui.layout.K
    public androidx.compose.ui.layout.J O1(int width, int height, Map<AbstractC5916a, Integer> alignmentLines, Function1<? super androidx.compose.ui.layout.l0, Unit> rulers, Function1<? super f0.a, Unit> placementBlock) {
        if (!((width & (-16777216)) == 0 && ((-16777216) & height) == 0)) {
            C14920a.b("Size(" + width + " x " + height + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new d(width, height, alignmentLines, rulers, placementBlock, this);
    }

    public void T1(boolean z10) {
        this.isPlacedUnderMotionFrameOfReference = z10;
    }

    public final void V1(boolean z10) {
        this.isPlacingForAlignment = z10;
    }

    public final void X1(boolean z10) {
        this.isShallowPlacing = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j1(androidx.compose.ui.layout.J r14) {
        /*
            r13 = this;
            if (r14 == 0) goto Lb
            androidx.compose.ui.node.p0 r0 = new androidx.compose.ui.node.p0
            r0.<init>(r14, r13)
            r13.h1(r0)
            return
        Lb:
            Z.W<androidx.compose.ui.layout.k0, Z.X<androidx.compose.ui.node.F0<androidx.compose.ui.node.LayoutNode>>> r14 = r13.rulerReaders
            if (r14 == 0) goto L54
            java.lang.Object[] r0 = r14.values
            long[] r14 = r14.metadata
            int r1 = r14.length
            int r1 = r1 + (-2)
            if (r1 < 0) goto L54
            r2 = 0
            r3 = r2
        L1a:
            r4 = r14[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L4f
            int r6 = r3 - r1
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r2
        L34:
            if (r8 >= r6) goto L4d
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L49
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            Z.X r9 = (Z.X) r9
            r13.M1(r9)
        L49:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L34
        L4d:
            if (r6 != r7) goto L54
        L4f:
            if (r3 == r1) goto L54
            int r3 = r3 + 1
            goto L1a
        L54:
            Z.W<androidx.compose.ui.layout.k0, Z.X<androidx.compose.ui.node.F0<androidx.compose.ui.node.LayoutNode>>> r14 = r13.rulerReaders
            if (r14 == 0) goto L5b
            r14.k()
        L5b:
            Z.Q<androidx.compose.ui.layout.k0> r14 = r13.rulerValues
            if (r14 == 0) goto L62
            r14.h()
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.Q.j1(androidx.compose.ui.layout.J):void");
    }

    /* renamed from: v1, reason: from getter */
    public final f0.a getPlacementScope() {
        return this.placementScope;
    }

    public final androidx.compose.ui.layout.l0 x1() {
        androidx.compose.ui.layout.l0 l0Var = this._rulerScope;
        return l0Var == null ? new e() : l0Var;
    }

    private final void z1(androidx.compose.ui.layout.k0 ruler) {
        Z.X<F0<LayoutNode>> xU;
        Z.W<androidx.compose.ui.layout.k0, Z.X<F0<LayoutNode>>> w10 = l1(ruler).rulerReaders;
        if (w10 != null) {
            xU = w10.u(ruler);
        } else {
            xU = null;
        }
        if (xU != null) {
            M1(xU);
        }
    }

    @Override // androidx.compose.ui.node.Z
    public void R(boolean newMFR) {
        LayoutNode layoutNode;
        LayoutNode.e eVarX;
        Q qU1 = u1();
        LayoutNode.e eVarX2 = null;
        if (qU1 != null) {
            layoutNode = qU1.getLayoutNode();
        } else {
            layoutNode = null;
        }
        if (Intrinsics.e(layoutNode, getLayoutNode())) {
            T1(newMFR);
            return;
        }
        if (layoutNode != null) {
            eVarX = layoutNode.X();
        } else {
            eVarX = null;
        }
        if (eVarX != LayoutNode.e.f51467c) {
            if (layoutNode != null) {
                eVarX2 = layoutNode.X();
            }
            if (eVarX2 != LayoutNode.e.f51468d) {
                return;
            }
        }
        T1(newMFR);
    }

    @Override // androidx.compose.ui.layout.L
    public final int l0(AbstractC5916a alignmentLine) {
        int iD1;
        if (!r1() || (iD1 = d1(alignmentLine)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return iD1 + H1.n.l(getApparentToRealOffset());
    }

    protected final void y1(NodeCoordinator nodeCoordinator) {
        LayoutNode layoutNode;
        AbstractC5941a abstractC5941aR;
        NodeCoordinator wrapped = nodeCoordinator.getWrapped();
        if (wrapped != null) {
            layoutNode = wrapped.getLayoutNode();
        } else {
            layoutNode = null;
        }
        if (!Intrinsics.e(layoutNode, nodeCoordinator.getLayoutNode())) {
            nodeCoordinator.C2().r().m();
            return;
        }
        InterfaceC5943b interfaceC5943bM = nodeCoordinator.C2().M();
        if (interfaceC5943bM != null && (abstractC5941aR = interfaceC5943bM.r()) != null) {
            abstractC5941aR.m();
        }
    }
}
