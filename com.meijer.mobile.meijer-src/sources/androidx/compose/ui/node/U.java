package androidx.compose.ui.node;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import j1.C14920a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001:\u00016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u0005J\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0005J\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010\u0018J\u001b\u0010\u001c\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\t¢\u0006\u0004\b!\u0010\u001dJ\u001f\u0010\"\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\t¢\u0006\u0004\b\"\u0010\u001dJ\u001f\u0010#\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\t¢\u0006\u0004\b#\u0010\u001dJ\u001f\u0010$\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\t¢\u0006\u0004\b$\u0010\u001dJ\u0015\u0010%\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b%\u0010\u0005J\u001f\u0010(\u001a\u00020\t2\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010&¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\r¢\u0006\u0004\b*\u0010\u0011J \u0010+\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u0015\u0010/\u001a\u00020\r2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u001d\u00101\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b1\u0010\u0018J\u0017\u00103\u001a\u00020\r2\b\b\u0002\u00102\u001a\u00020\t¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b5\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00109R\"\u0010?\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u00104R\u0016\u0010A\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010;R\u0014\u0010D\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010CR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020-0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010FR$\u0010M\u001a\u00020H2\u0006\u0010I\u001a\u00020H8F@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020N0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010FR\u001e\u0010Q\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b1\u0010PR\u0016\u0010T\u001a\u0004\u0018\u00010R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010SR\u0018\u0010W\u001a\u00020\t*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0018\u0010Y\u001a\u00020\t*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u0010VR\u0018\u0010[\u001a\u00020\t*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010VR\u0018\u0010]\u001a\u00020\t*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010VR\u0018\u0010_\u001a\u00020\t*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b^\u0010VR\u0011\u0010a\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b`\u0010=R\u0011\u0010c\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bb\u0010=\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006d"}, d2 = {"Landroidx/compose/ui/node/U;", "", "Landroidx/compose/ui/node/LayoutNode;", "root", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "layoutNode", "LH1/b;", "constraints", "", "e", "(Landroidx/compose/ui/node/LayoutNode;LH1/b;)Z", "f", "", "C", "h", "b", "()V", "affectsLookahead", "relayoutNeeded", "A", "(Landroidx/compose/ui/node/LayoutNode;ZZ)Z", "g", "D", "(Landroidx/compose/ui/node/LayoutNode;Z)V", "node", "y", "j", "w", "(Landroidx/compose/ui/node/LayoutNode;Z)Z", "K", "(J)V", "forced", "F", "I", "E", "H", "G", "Lkotlin/Function0;", "onLayout", "t", "(Lkotlin/jvm/functions/Function0;)Z", "v", "u", "(Landroidx/compose/ui/node/LayoutNode;J)V", "Landroidx/compose/ui/node/Owner$b;", "listener", "z", "(Landroidx/compose/ui/node/Owner$b;)V", "i", "forceDispatch", "c", "(Z)V", "x", "a", "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/p;", "Landroidx/compose/ui/node/p;", "relayoutNodes", "Z", "m", "()Z", "setDuringMeasureLayout$ui_release", "duringMeasureLayout", "d", "duringFullMeasureLayoutPass", "Landroidx/compose/ui/node/l0;", "Landroidx/compose/ui/node/l0;", "onPositionedDispatcher", "LD0/c;", "LD0/c;", "onLayoutCompletedListeners", "", "<set-?>", "J", "s", "()J", "measureIteration", "Landroidx/compose/ui/node/U$a;", "postponedMeasureRequests", "LH1/b;", "rootConstraints", "Landroidx/compose/ui/node/O;", "Landroidx/compose/ui/node/O;", "consistencyChecker", "p", "(Landroidx/compose/ui/node/LayoutNode;)Z", "measureAffectsParent", "r", "measureAffectsPlacedParent", "l", "canAffectPlacedParent", "k", "canAffectParentInLookahead", "q", "measureAffectsParentLookahead", "n", "hasPendingMeasureOrLayout", "o", "hasPendingOnPositionedCallbacks", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final LayoutNode root;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C5962p relayoutNodes;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean duringMeasureLayout;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean duringFullMeasureLayoutPass;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final l0 onPositionedDispatcher;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final D0.c<Owner.b> onLayoutCompletedListeners;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private long measureIteration;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final D0.c<a> postponedMeasureRequests;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private H1.b rootConstraints;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final O consistencyChecker;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\f\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/node/U$a;", "", "Landroidx/compose/ui/node/LayoutNode;", "node", "", "isLookahead", "isForced", "<init>", "(Landroidx/compose/ui/node/LayoutNode;ZZ)V", "a", "Landroidx/compose/ui/node/LayoutNode;", "()Landroidx/compose/ui/node/LayoutNode;", "b", "Z", "c", "()Z", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final LayoutNode node;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isLookahead;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean isForced;

        /* renamed from: a, reason: from getter */
        public final LayoutNode getNode() {
            return this.node;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getIsForced() {
            return this.isForced;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getIsLookahead() {
            return this.isLookahead;
        }

        public a(LayoutNode layoutNode, boolean z10, boolean z11) {
            this.node = layoutNode;
            this.isLookahead = z10;
            this.isForced = z11;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutNode.e.values().length];
            try {
                iArr[LayoutNode.e.f51466b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutNode.e.f51465a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LayoutNode.e.f51468d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LayoutNode.e.f51467c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LayoutNode.e.f51469e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final boolean f(LayoutNode layoutNode, H1.b constraints) {
        boolean zF1 = constraints != null ? layoutNode.f1(constraints) : LayoutNode.g1(layoutNode, null, 1, null);
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        if (zF1 && parent$ui_release != null) {
            if (layoutNode.g0() == LayoutNode.g.f51473a) {
                LayoutNode.s1(parent$ui_release, false, false, false, 3, null);
                return zF1;
            }
            if (layoutNode.g0() == LayoutNode.g.f51474b) {
                LayoutNode.q1(parent$ui_release, false, 1, null);
            }
        }
        return zF1;
    }

    static /* synthetic */ boolean B(U u10, LayoutNode layoutNode, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            z11 = true;
        }
        return u10.A(layoutNode, z10, z11);
    }

    public static /* synthetic */ boolean J(U u10, LayoutNode layoutNode, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return u10.I(layoutNode, z10);
    }

    private final void b() {
        D0.c<Owner.b> cVar = this.onLayoutCompletedListeners;
        Owner.b[] bVarArr = cVar.content;
        int iO = cVar.getSize();
        for (int i10 = 0; i10 < iO; i10++) {
            bVarArr[i10].j();
        }
        this.onLayoutCompletedListeners.k();
    }

    public static /* synthetic */ void d(U u10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        u10.c(z10);
    }

    private final void g() {
        if (this.postponedMeasureRequests.getSize() != 0) {
            D0.c<a> cVar = this.postponedMeasureRequests;
            a[] aVarArr = cVar.content;
            int iO = cVar.getSize();
            for (int i10 = 0; i10 < iO; i10++) {
                a aVar = aVarArr[i10];
                if (aVar.getNode().isAttached()) {
                    if (aVar.getIsLookahead()) {
                        LayoutNode.o1(aVar.getNode(), aVar.getIsForced(), false, false, 2, null);
                    } else {
                        LayoutNode.s1(aVar.getNode(), aVar.getIsForced(), false, false, 2, null);
                    }
                }
            }
            this.postponedMeasureRequests.k();
        }
    }

    private final boolean w(LayoutNode layoutNode, boolean z10) {
        return z10 ? layoutNode.Z() : layoutNode.e0();
    }

    public final void G(LayoutNode layoutNode) {
        this.onPositionedDispatcher.d(layoutNode);
    }

    public final void K(long constraints) {
        H1.b bVar = this.rootConstraints;
        if (bVar == null ? false : H1.b.f(bVar.getValue(), constraints)) {
            return;
        }
        if (this.duringMeasureLayout) {
            C14920a.a("updateRootConstraints called while measuring");
        }
        this.rootConstraints = H1.b.a(constraints);
        if (this.root.getLookaheadRoot() != null) {
            this.root.O0();
        }
        this.root.P0();
        C5962p c5962p = this.relayoutNodes;
        LayoutNode layoutNode = this.root;
        c5962p.c(layoutNode, layoutNode.getLookaheadRoot() != null);
    }

    public final void c(boolean forceDispatch) {
        if (forceDispatch) {
            this.onPositionedDispatcher.e(this.root);
        }
        this.onPositionedDispatcher.a();
    }

    public final void i(LayoutNode layoutNode, boolean affectsLookahead) {
        if (!this.duringMeasureLayout) {
            C14920a.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (w(layoutNode, affectsLookahead)) {
            C14920a.a("node not yet measured");
        }
        j(layoutNode, affectsLookahead);
    }

    /* renamed from: m, reason: from getter */
    public final boolean getDuringMeasureLayout() {
        return this.duringMeasureLayout;
    }

    public final boolean n() {
        return this.relayoutNodes.h();
    }

    public final boolean o() {
        return this.onPositionedDispatcher.c();
    }

    public final long s() {
        if (!this.duringMeasureLayout) {
            C14920a.a("measureIteration should be only used during the measure/layout pass");
        }
        return this.measureIteration;
    }

    public final boolean t(Function0<Unit> onLayout) throws Throwable {
        U u10;
        Throwable th2;
        boolean z10;
        LayoutNode layoutNodeD;
        if (!this.root.isAttached()) {
            C14920a.a("performMeasureAndLayout called with unattached root");
        }
        if (!this.root.f()) {
            C14920a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.duringMeasureLayout) {
            C14920a.a("performMeasureAndLayout called during measure layout");
        }
        boolean z11 = false;
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            this.duringFullMeasureLayoutPass = true;
            try {
                if (this.relayoutNodes.h()) {
                    C5962p c5962p = this.relayoutNodes;
                    z10 = false;
                    while (c5962p.h()) {
                        boolean zC = c5962p.lookaheadSet.c();
                        boolean z12 = !zC;
                        if (zC) {
                            layoutNodeD = c5962p.set.d();
                        } else {
                            try {
                                layoutNodeD = c5962p.lookaheadSet.d();
                            } catch (Throwable th3) {
                                th2 = th3;
                                u10 = this;
                                u10.duringMeasureLayout = false;
                                u10.duringFullMeasureLayoutPass = false;
                                throw th2;
                            }
                        }
                        LayoutNode layoutNode = layoutNodeD;
                        u10 = this;
                        try {
                            boolean zB = B(u10, layoutNode, z12, false, 4, null);
                            if (layoutNode == this.root && zB) {
                                z10 = true;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            th2 = th;
                            u10.duringMeasureLayout = false;
                            u10.duringFullMeasureLayoutPass = false;
                            throw th2;
                        }
                    }
                    u10 = this;
                    if (onLayout != null) {
                        onLayout.invoke();
                    }
                } else {
                    u10 = this;
                    z10 = false;
                }
                u10.duringMeasureLayout = false;
                u10.duringFullMeasureLayoutPass = false;
                O o10 = u10.consistencyChecker;
                if (o10 != null) {
                    o10.a();
                }
                z11 = z10;
            } catch (Throwable th5) {
                th = th5;
                u10 = this;
            }
        }
        b();
        return z11;
    }

    public final void v() {
        if (this.relayoutNodes.h()) {
            if (!this.root.isAttached()) {
                C14920a.a("performMeasureAndLayout called with unattached root");
            }
            if (!this.root.f()) {
                C14920a.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.duringMeasureLayout) {
                C14920a.a("performMeasureAndLayout called during measure layout");
            }
            if (this.rootConstraints != null) {
                this.duringMeasureLayout = true;
                this.duringFullMeasureLayoutPass = false;
                try {
                    if (!this.relayoutNodes.g(true)) {
                        if (this.root.getLookaheadRoot() != null) {
                            D(this.root, true);
                        } else {
                            C(this.root);
                        }
                    }
                    D(this.root, false);
                    this.duringMeasureLayout = false;
                    this.duringFullMeasureLayoutPass = false;
                    O o10 = this.consistencyChecker;
                    if (o10 != null) {
                        o10.a();
                    }
                } catch (Throwable th2) {
                    this.duringMeasureLayout = false;
                    this.duringFullMeasureLayoutPass = false;
                    throw th2;
                }
            }
        }
    }

    public final void x(LayoutNode node) {
        this.relayoutNodes.i(node);
        this.onPositionedDispatcher.f(node);
    }

    public final void z(Owner.b listener) {
        this.onLayoutCompletedListeners.c(listener);
    }

    public U(LayoutNode layoutNode) {
        O o10;
        this.root = layoutNode;
        Owner.Companion companion = Owner.INSTANCE;
        C5962p c5962p = new C5962p(companion.a());
        this.relayoutNodes = c5962p;
        this.onPositionedDispatcher = new l0();
        this.onLayoutCompletedListeners = new D0.c<>(new Owner.b[16], 0);
        this.measureIteration = 1L;
        D0.c<a> cVar = new D0.c<>(new a[16], 0);
        this.postponedMeasureRequests = cVar;
        if (companion.a()) {
            o10 = new O(layoutNode, c5962p, cVar.i());
        } else {
            o10 = null;
        }
        this.consistencyChecker = o10;
    }

    private final boolean A(LayoutNode layoutNode, boolean affectsLookahead, boolean relayoutNeeded) {
        H1.b bVar;
        boolean zF;
        LayoutNode parent$ui_release;
        boolean zE = false;
        if (layoutNode.getIsDeactivated()) {
            return false;
        }
        if (!layoutNode.f() && !layoutNode.G0() && !l(layoutNode) && !Intrinsics.e(layoutNode.H0(), Boolean.TRUE) && !k(layoutNode) && !layoutNode.D()) {
            return false;
        }
        if (layoutNode == this.root) {
            bVar = this.rootConstraints;
            Intrinsics.g(bVar);
        } else {
            bVar = null;
        }
        if (affectsLookahead) {
            if (layoutNode.Z()) {
                zE = e(layoutNode, bVar);
            }
            if (relayoutNeeded && ((zE || layoutNode.Y()) && Intrinsics.e(layoutNode.H0(), Boolean.TRUE))) {
                layoutNode.L0();
            }
        } else {
            if (layoutNode.e0()) {
                zF = f(layoutNode, bVar);
            } else {
                zF = false;
            }
            if (relayoutNeeded && layoutNode.W() && (layoutNode == this.root || ((parent$ui_release = layoutNode.getParent$ui_release()) != null && parent$ui_release.f() && layoutNode.G0()))) {
                if (layoutNode == this.root) {
                    layoutNode.c1(0, 0);
                } else {
                    layoutNode.j1();
                }
                this.onPositionedDispatcher.d(layoutNode);
                L.b(layoutNode).getRectManager().i(layoutNode);
                O o10 = this.consistencyChecker;
                if (o10 != null) {
                    o10.a();
                }
            }
            zE = zF;
        }
        g();
        return zE;
    }

    private final void C(LayoutNode layoutNode) {
        D0.c<LayoutNode> cVarT0 = layoutNode.t0();
        LayoutNode[] layoutNodeArr = cVarT0.content;
        int iO = cVarT0.getSize();
        for (int i10 = 0; i10 < iO; i10++) {
            LayoutNode layoutNode2 = layoutNodeArr[i10];
            if (p(layoutNode2)) {
                if (N.a(layoutNode2)) {
                    D(layoutNode2, true);
                } else {
                    C(layoutNode2);
                }
            }
        }
    }

    private final void D(LayoutNode layoutNode, boolean affectsLookahead) {
        H1.b bVar;
        if (layoutNode.getIsDeactivated()) {
            return;
        }
        if (layoutNode == this.root) {
            bVar = this.rootConstraints;
            Intrinsics.g(bVar);
        } else {
            bVar = null;
        }
        if (affectsLookahead) {
            e(layoutNode, bVar);
        } else {
            f(layoutNode, bVar);
        }
    }

    private final boolean e(LayoutNode layoutNode, H1.b constraints) {
        boolean zK0;
        if (layoutNode.getLookaheadRoot() == null) {
            return false;
        }
        if (constraints != null) {
            zK0 = layoutNode.J0(constraints);
        } else {
            zK0 = LayoutNode.K0(layoutNode, null, 1, null);
        }
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        if (zK0 && parent$ui_release != null) {
            if (parent$ui_release.getLookaheadRoot() == null) {
                LayoutNode.s1(parent$ui_release, false, false, false, 3, null);
                return zK0;
            }
            if (layoutNode.h0() == LayoutNode.g.f51473a) {
                LayoutNode.o1(parent$ui_release, false, false, false, 3, null);
                return zK0;
            }
            if (layoutNode.h0() == LayoutNode.g.f51474b) {
                LayoutNode.m1(parent$ui_release, false, 1, null);
            }
        }
        return zK0;
    }

    private final void h(LayoutNode layoutNode) {
        D0.c<LayoutNode> cVarT0 = layoutNode.t0();
        LayoutNode[] layoutNodeArr = cVarT0.content;
        int iO = cVarT0.getSize();
        for (int i10 = 0; i10 < iO; i10++) {
            LayoutNode layoutNode2 = layoutNodeArr[i10];
            if (Intrinsics.e(layoutNode2.H0(), Boolean.TRUE) && !layoutNode2.getIsDeactivated()) {
                if (this.relayoutNodes.e(layoutNode2, true)) {
                    layoutNode2.L0();
                }
                h(layoutNode2);
            }
        }
    }

    private final void j(LayoutNode layoutNode, boolean affectsLookahead) {
        D0.c<LayoutNode> cVarT0 = layoutNode.t0();
        LayoutNode[] layoutNodeArr = cVarT0.content;
        int iO = cVarT0.getSize();
        for (int i10 = 0; i10 < iO; i10++) {
            LayoutNode layoutNode2 = layoutNodeArr[i10];
            if ((!affectsLookahead && p(layoutNode2)) || (affectsLookahead && q(layoutNode2))) {
                if (N.a(layoutNode2) && !affectsLookahead) {
                    if (layoutNode2.Z() && this.relayoutNodes.e(layoutNode2, true)) {
                        A(layoutNode2, true, false);
                    } else {
                        i(layoutNode2, true);
                    }
                }
                y(layoutNode2, affectsLookahead);
                if (!w(layoutNode2, affectsLookahead)) {
                    j(layoutNode2, affectsLookahead);
                }
            }
        }
        y(layoutNode, affectsLookahead);
    }

    private final boolean k(LayoutNode layoutNode) {
        if (layoutNode.Z() && q(layoutNode)) {
            return true;
        }
        return false;
    }

    private final boolean l(LayoutNode layoutNode) {
        if (layoutNode.e0() && r(layoutNode)) {
            return true;
        }
        return false;
    }

    private final boolean p(LayoutNode layoutNode) {
        if (layoutNode.g0() != LayoutNode.g.f51473a && !layoutNode.getLayoutDelegate().c().getAlignmentLines().k()) {
            return false;
        }
        return true;
    }

    private final boolean q(LayoutNode layoutNode) {
        InterfaceC5943b interfaceC5943bP;
        AbstractC5941a abstractC5941aR;
        if (layoutNode.h0() == LayoutNode.g.f51473a || ((interfaceC5943bP = layoutNode.getLayoutDelegate().p()) != null && (abstractC5941aR = interfaceC5943bP.getAlignmentLines()) != null && abstractC5941aR.k())) {
            return true;
        }
        return false;
    }

    private final boolean r(LayoutNode layoutNode) {
        LayoutNode.e eVarX;
        do {
            if (!p(layoutNode)) {
                LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
                if (parent$ui_release != null) {
                    eVarX = parent$ui_release.X();
                } else {
                    eVarX = null;
                }
                if (eVarX != LayoutNode.e.f51465a) {
                    return false;
                }
            }
            layoutNode = layoutNode.getParent$ui_release();
            if (layoutNode == null) {
                return false;
            }
        } while (!layoutNode.f());
        return true;
    }

    private final void y(LayoutNode node, boolean affectsLookahead) {
        if (w(node, affectsLookahead)) {
            A(node, affectsLookahead, false);
        }
    }

    public final boolean E(LayoutNode layoutNode, boolean forced) {
        int i10 = b.$EnumSwitchMapping$0[layoutNode.X().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4 && i10 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            if ((layoutNode.Z() || layoutNode.Y()) && !forced) {
                O o10 = this.consistencyChecker;
                if (o10 != null) {
                    o10.a();
                }
                return false;
            }
            layoutNode.N0();
            layoutNode.M0();
            if (layoutNode.getIsDeactivated()) {
                return false;
            }
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            if (Intrinsics.e(layoutNode.H0(), Boolean.TRUE) && ((parent$ui_release == null || !parent$ui_release.Z()) && (parent$ui_release == null || !parent$ui_release.Y()))) {
                this.relayoutNodes.c(layoutNode, true);
            } else if (layoutNode.f() && ((parent$ui_release == null || !parent$ui_release.W()) && (parent$ui_release == null || !parent$ui_release.e0()))) {
                this.relayoutNodes.c(layoutNode, false);
            }
            if (this.duringFullMeasureLayoutPass) {
                return false;
            }
            return true;
        }
        O o11 = this.consistencyChecker;
        if (o11 != null) {
            o11.a();
        }
        return false;
    }

    public final boolean F(LayoutNode layoutNode, boolean forced) {
        boolean z10;
        LayoutNode parent$ui_release;
        LayoutNode parent$ui_release2;
        if (layoutNode.getLookaheadRoot() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C14920a.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int i10 = b.$EnumSwitchMapping$0[layoutNode.X().ordinal()];
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3 && i10 != 4) {
                if (i10 == 5) {
                    if (layoutNode.Z() && !forced) {
                        return false;
                    }
                    layoutNode.O0();
                    layoutNode.P0();
                    if (layoutNode.getIsDeactivated()) {
                        return false;
                    }
                    if ((!Intrinsics.e(layoutNode.H0(), Boolean.TRUE) && !k(layoutNode)) || ((parent$ui_release = layoutNode.getParent$ui_release()) != null && parent$ui_release.Z())) {
                        if ((layoutNode.f() || l(layoutNode)) && ((parent$ui_release2 = layoutNode.getParent$ui_release()) == null || !parent$ui_release2.e0())) {
                            this.relayoutNodes.c(layoutNode, false);
                        }
                    } else {
                        this.relayoutNodes.c(layoutNode, true);
                    }
                    if (this.duringFullMeasureLayoutPass) {
                        return false;
                    }
                    return true;
                }
                throw new NoWhenBranchMatchedException();
            }
            this.postponedMeasureRequests.c(new a(layoutNode, true, forced));
            O o10 = this.consistencyChecker;
            if (o10 != null) {
                o10.a();
            }
        }
        return false;
    }

    public final boolean H(LayoutNode layoutNode, boolean forced) {
        boolean z10;
        int i10 = b.$EnumSwitchMapping$0[layoutNode.X().ordinal()];
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            if (i10 == 5) {
                LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
                if (parent$ui_release != null && !parent$ui_release.f()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!forced && (layoutNode.e0() || (layoutNode.W() && layoutNode.f() == z10 && layoutNode.f() == layoutNode.G0()))) {
                    O o10 = this.consistencyChecker;
                    if (o10 != null) {
                        o10.a();
                    }
                    return false;
                }
                layoutNode.M0();
                if (!layoutNode.getIsDeactivated() && layoutNode.G0() && z10) {
                    if ((parent$ui_release == null || !parent$ui_release.W()) && (parent$ui_release == null || !parent$ui_release.e0())) {
                        this.relayoutNodes.c(layoutNode, false);
                    }
                    if (!this.duringFullMeasureLayoutPass) {
                        return true;
                    }
                }
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }
        O o11 = this.consistencyChecker;
        if (o11 != null) {
            o11.a();
        }
        return false;
    }

    public final boolean I(LayoutNode layoutNode, boolean forced) {
        int i10 = b.$EnumSwitchMapping$0[layoutNode.X().ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3 && i10 != 4) {
                if (i10 == 5) {
                    if (layoutNode.e0() && !forced) {
                        return false;
                    }
                    layoutNode.P0();
                    if (layoutNode.getIsDeactivated()) {
                        return false;
                    }
                    if (!layoutNode.f() && !l(layoutNode)) {
                        return false;
                    }
                    LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
                    if (parent$ui_release == null || !parent$ui_release.e0()) {
                        this.relayoutNodes.c(layoutNode, false);
                    }
                    if (this.duringFullMeasureLayoutPass) {
                        return false;
                    }
                    return true;
                }
                throw new NoWhenBranchMatchedException();
            }
            this.postponedMeasureRequests.c(new a(layoutNode, false, forced));
            O o10 = this.consistencyChecker;
            if (o10 != null) {
                o10.a();
            }
        }
        return false;
    }

    public final void u(LayoutNode layoutNode, long constraints) {
        if (layoutNode.getIsDeactivated()) {
            return;
        }
        if (Intrinsics.e(layoutNode, this.root)) {
            C14920a.a("measureAndLayout called on root");
        }
        if (!this.root.isAttached()) {
            C14920a.a("performMeasureAndLayout called with unattached root");
        }
        if (!this.root.f()) {
            C14920a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.duringMeasureLayout) {
            C14920a.a("performMeasureAndLayout called during measure layout");
        }
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            this.duringFullMeasureLayoutPass = false;
            try {
                this.relayoutNodes.i(layoutNode);
                if (e(layoutNode, H1.b.a(constraints)) || layoutNode.Y()) {
                    if (Intrinsics.e(layoutNode.H0(), Boolean.TRUE)) {
                        layoutNode.L0();
                    }
                }
                h(layoutNode);
                f(layoutNode, H1.b.a(constraints));
                if (layoutNode.W() && layoutNode.f()) {
                    layoutNode.j1();
                    this.onPositionedDispatcher.d(layoutNode);
                }
                g();
                this.duringMeasureLayout = false;
                this.duringFullMeasureLayoutPass = false;
                O o10 = this.consistencyChecker;
                if (o10 != null) {
                    o10.a();
                }
            } catch (Throwable th2) {
                this.duringMeasureLayout = false;
                this.duringFullMeasureLayoutPass = false;
                throw th2;
            }
        }
        b();
    }
}
