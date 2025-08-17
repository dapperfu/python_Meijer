package g1;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\u0017\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\b¢\u0006\u0004\b \u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010#R\u0016\u0010%\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010#R\u0016\u0010&\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010#R\u0016\u0010'\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010#R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010(R\u001a\u0010.\u001a\u00020*8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010-R \u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00063"}, d2 = {"Lg1/e;", "", "Landroidx/compose/ui/layout/LayoutCoordinates;", "rootCoordinates", "<init>", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/ui/Modifier$c;", "pointerInputNode", "", "g", "(Landroidx/compose/ui/Modifier$c;)V", "", "pointerId", "LZ/T;", "Lg1/m;", "hitNodes", "f", "(JLZ/T;)V", "Lg1/A;", "", "pointerInputNodes", "", "prunePointerIdsAndChangesNotInNodesList", "b", "(JLjava/util/List;Z)V", "Lg1/g;", "internalPointerEvent", "isInBounds", "d", "(Lg1/g;Z)Z", "c", "()V", "e", "a", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Z", "dispatchingEvent", "dispatchCancelAfterDispatchedEvent", "clearNodeCacheAfterDispatchedEvent", "removeSpecificNodesAfterDispatchedEvent", "LZ/T;", "nodesToRemove", "Lg1/n;", "Lg1/n;", "getRoot$ui_release", "()Lg1/n;", "root", "LZ/O;", "h", "LZ/O;", "hitPointerIdsAndNodes", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: g1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14173e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final LayoutCoordinates rootCoordinates;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean dispatchingEvent;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean dispatchCancelAfterDispatchedEvent;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean clearNodeCacheAfterDispatchedEvent;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean removeSpecificNodesAfterDispatchedEvent;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Z.T<Modifier.c> nodesToRemove = new Z.T<>(0, 1, null);

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final C14182n root = new C14182n();

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Z.O<Z.T<Node>> hitPointerIdsAndNodes = new Z.O<>(10);

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: g1.e$a */
    static final class a extends Lambda implements Function0<Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier.c f132644g;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Modifier.c cVar) {
            super(0);
            this.f132644g = cVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C14173e.this.g(this.f132644g);
        }
    }

    private final void f(long pointerId, Z.T<Node> hitNodes) {
        this.root.h(pointerId, hitNodes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(Modifier.c pointerInputNode) {
        if (!this.dispatchingEvent) {
            this.root.i(pointerInputNode);
        } else {
            this.removeSpecificNodesAfterDispatchedEvent = true;
            this.nodesToRemove.n(pointerInputNode);
        }
    }

    public final void b(long pointerId, List<? extends Modifier.c> pointerInputNodes, boolean prunePointerIdsAndChangesNotInNodesList) {
        Node node;
        C14182n c14182n = this.root;
        this.hitPointerIdsAndNodes.g();
        int size = pointerInputNodes.size();
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            Modifier.c cVar = pointerInputNodes.get(i10);
            if (cVar.getIsAttached()) {
                cVar.C2(new a(cVar));
                if (z10) {
                    D0.c<Node> cVarG = c14182n.g();
                    Node[] nodeArr = cVarG.content;
                    int size2 = cVarG.getSize();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size2) {
                            node = null;
                            break;
                        }
                        node = nodeArr[i11];
                        if (Intrinsics.e(node.getModifierNode(), cVar)) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                    Node node2 = node;
                    if (node2 != null) {
                        node2.n();
                        node2.getPointerIds().a(pointerId);
                        Z.O<Z.T<Node>> o10 = this.hitPointerIdsAndNodes;
                        Z.T<Node> tB = o10.b(pointerId);
                        if (tB == null) {
                            tB = new Z.T<>(0, 1, null);
                            o10.r(pointerId, tB);
                        }
                        tB.n(node2);
                        c14182n = node2;
                    } else {
                        z10 = false;
                    }
                }
                Node node3 = new Node(cVar);
                node3.getPointerIds().a(pointerId);
                Z.O<Z.T<Node>> o11 = this.hitPointerIdsAndNodes;
                Z.T<Node> tB2 = o11.b(pointerId);
                if (tB2 == null) {
                    tB2 = new Z.T<>(0, 1, null);
                    o11.r(pointerId, tB2);
                }
                tB2.n(node3);
                c14182n.g().c(node3);
                c14182n = node3;
            }
        }
        if (!prunePointerIdsAndChangesNotInNodesList) {
            return;
        }
        Z.O<Z.T<Node>> o12 = this.hitPointerIdsAndNodes;
        long[] jArr = o12.keys;
        Object[] objArr = o12.values;
        long[] jArr2 = o12.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            long j10 = jArr2[i12];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8 - ((~(i12 - length)) >>> 31);
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((255 & j10) < 128) {
                        int i15 = (i12 << 3) + i14;
                        f(jArr[i15], (Z.T) objArr[i15]);
                    }
                    j10 >>= 8;
                }
                if (i13 != 8) {
                    return;
                }
            }
            if (i12 == length) {
                return;
            } else {
                i12++;
            }
        }
    }

    public final void c() {
        if (this.clearNodeCacheAfterDispatchedEvent) {
            this.clearNodeCacheAfterDispatchedEvent = true;
        } else {
            this.root.c();
        }
    }

    public final boolean d(C14175g internalPointerEvent, boolean isInBounds) {
        if (!this.root.a(internalPointerEvent.b(), this.rootCoordinates, internalPointerEvent, isInBounds)) {
            return false;
        }
        boolean z10 = true;
        this.dispatchingEvent = true;
        boolean zF = this.root.f(internalPointerEvent.b(), this.rootCoordinates, internalPointerEvent, isInBounds);
        if (!this.root.e(internalPointerEvent) && !zF) {
            z10 = false;
        }
        this.dispatchingEvent = false;
        if (this.removeSpecificNodesAfterDispatchedEvent) {
            this.removeSpecificNodesAfterDispatchedEvent = false;
            int i10 = this.nodesToRemove.get_size();
            for (int i11 = 0; i11 < i10; i11++) {
                g(this.nodesToRemove.d(i11));
            }
            this.nodesToRemove.t();
        }
        if (this.dispatchCancelAfterDispatchedEvent) {
            this.dispatchCancelAfterDispatchedEvent = false;
            e();
        }
        if (this.clearNodeCacheAfterDispatchedEvent) {
            this.clearNodeCacheAfterDispatchedEvent = false;
            c();
        }
        return z10;
    }

    public final void e() {
        if (this.dispatchingEvent) {
            this.dispatchCancelAfterDispatchedEvent = true;
        } else {
            this.root.d();
            c();
        }
    }

    public C14173e(LayoutCoordinates layoutCoordinates) {
        this.rootCoordinates = layoutCoordinates;
    }
}
