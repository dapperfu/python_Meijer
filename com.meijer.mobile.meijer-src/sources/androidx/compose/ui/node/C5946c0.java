package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import j1.C14920a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0000\u0018\u00002\u00020\u0001:\u0002AEB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u0019\u001a\u00060\u0018R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJC\u0010!\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010 \u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b$\u0010\u000bJ\u0017\u0010%\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010\u000bJ\u001f\u0010(\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010+J'\u0010.\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\f2\u0006\u00101\u001a\u000200H\u0000¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\fH\u0000¢\u0006\u0004\b4\u0010\u000eJ\r\u00105\u001a\u00020\f¢\u0006\u0004\b5\u0010\u000eJ\r\u00106\u001a\u00020\f¢\u0006\u0004\b6\u0010\u000eJ\r\u00107\u001a\u00020\f¢\u0006\u0004\b7\u0010\u000eJ\u000f\u00108\u001a\u00020\fH\u0000¢\u0006\u0004\b8\u0010\u000eJ\u000f\u00109\u001a\u00020\fH\u0000¢\u0006\u0004\b9\u0010\u000eJ\u001e\u0010<\u001a\u00020\u00162\n\u0010;\u001a\u0006\u0012\u0002\b\u00030:H\u0000ø\u0001\u0000¢\u0006\u0004\b<\u0010=J\u000f\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b1\u0010CR\u001a\u0010I\u001a\u00020D8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR$\u0010O\u001a\u00020\u001c2\u0006\u0010J\u001a\u00020\u001c8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001a\u0010 \u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010\bR$\u0010\u000f\u001a\u00020\u00062\u0006\u0010J\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bS\u0010Q\u001a\u0004\bT\u0010\bR\u001e\u0010W\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u001e\u0010X\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010VR\u001c\u0010Z\u001a\b\u0018\u00010\u0018R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010YR\u0014\u0010]\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0014\u0010`\u001a\u00020\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006a"}, d2 = {"Landroidx/compose/ui/node/c0;", "", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "Landroidx/compose/ui/Modifier$c;", "u", "()Landroidx/compose/ui/Modifier$c;", "paddedHead", "D", "(Landroidx/compose/ui/Modifier$c;)Landroidx/compose/ui/Modifier$c;", "", "B", "()V", "head", "", "offset", "LD0/c;", "Landroidx/compose/ui/Modifier$b;", "before", "after", "", "shouldAttachOnInsert", "Landroidx/compose/ui/node/c0$a;", "j", "(Landroidx/compose/ui/Modifier$c;ILD0/c;LD0/c;Z)Landroidx/compose/ui/node/c0$a;", "start", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "v", "(Landroidx/compose/ui/Modifier$c;Landroidx/compose/ui/node/NodeCoordinator;)V", "tail", "A", "(ILD0/c;LD0/c;Landroidx/compose/ui/Modifier$c;Z)V", "node", "h", "w", "element", "parent", "g", "(Landroidx/compose/ui/Modifier$b;Landroidx/compose/ui/Modifier$c;)Landroidx/compose/ui/Modifier$c;", "q", "(Landroidx/compose/ui/Modifier$c;Landroidx/compose/ui/Modifier$c;)Landroidx/compose/ui/Modifier$c;", "prev", "next", "F", "(Landroidx/compose/ui/Modifier$b;Landroidx/compose/ui/Modifier$b;Landroidx/compose/ui/Modifier$c;)V", "Landroidx/compose/ui/Modifier;", "m", "E", "(Landroidx/compose/ui/Modifier;)V", "x", "C", "s", "y", "t", "z", "Landroidx/compose/ui/node/f0;", "type", "p", "(I)Z", "", "toString", "()Ljava/lang/String;", "a", "Landroidx/compose/ui/node/LayoutNode;", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/y;", "b", "Landroidx/compose/ui/node/y;", "l", "()Landroidx/compose/ui/node/y;", "innerCoordinator", "<set-?>", "c", "Landroidx/compose/ui/node/NodeCoordinator;", "n", "()Landroidx/compose/ui/node/NodeCoordinator;", "outerCoordinator", "d", "Landroidx/compose/ui/Modifier$c;", "o", "e", "k", "f", "LD0/c;", "current", "buffer", "Landroidx/compose/ui/node/c0$a;", "cachedDiffer", "i", "()I", "aggregateChildKindSet", "r", "()Z", "isUpdating", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.node.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5946c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final LayoutNode layoutNode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C5970y innerCoordinator;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private NodeCoordinator outerCoordinator;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Modifier.c tail;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Modifier.c head;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private D0.c<Modifier.b> current;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private D0.c<Modifier.b> buffer;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private a cachedDiffer;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u001c\b\u0082\u0004\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0017R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\u0014R(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$\"\u0004\b'\u0010&R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006."}, d2 = {"Landroidx/compose/ui/node/c0$a;", "Landroidx/compose/ui/node/q;", "Landroidx/compose/ui/Modifier$c;", "node", "", "offset", "LD0/c;", "Landroidx/compose/ui/Modifier$b;", "before", "after", "", "shouldAttachOnInsert", "<init>", "(Landroidx/compose/ui/node/c0;Landroidx/compose/ui/Modifier$c;ILD0/c;LD0/c;Z)V", "oldIndex", "newIndex", "a", "(II)Z", "", "b", "(I)V", "atIndex", "remove", "(II)V", "c", "Landroidx/compose/ui/Modifier$c;", "getNode", "()Landroidx/compose/ui/Modifier$c;", "f", "(Landroidx/compose/ui/Modifier$c;)V", "I", "getOffset", "()I", "g", "LD0/c;", "getBefore", "()LD0/c;", "e", "(LD0/c;)V", "d", "getAfter", "Z", "getShouldAttachOnInsert", "()Z", "h", "(Z)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.compose.ui.node.c0$a */
    private final class a implements InterfaceC5963q {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private Modifier.c node;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int offset;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private D0.c<Modifier.b> before;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private D0.c<Modifier.b> after;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean shouldAttachOnInsert;

        public a(Modifier.c cVar, int i10, D0.c<Modifier.b> cVar2, D0.c<Modifier.b> cVar3, boolean z10) {
            this.node = cVar;
            this.offset = i10;
            this.before = cVar2;
            this.after = cVar3;
            this.shouldAttachOnInsert = z10;
        }

        @Override // androidx.compose.ui.node.InterfaceC5963q
        public boolean a(int oldIndex, int newIndex) {
            D0.c<Modifier.b> cVar = this.before;
            int i10 = this.offset;
            return C5948d0.d(cVar.content[oldIndex + i10], this.after.content[i10 + newIndex]) != 0;
        }

        @Override // androidx.compose.ui.node.InterfaceC5963q
        public void b(int newIndex) {
            int i10 = this.offset + newIndex;
            this.node = C5946c0.this.g(this.after.content[i10], this.node);
            C5946c0.d(C5946c0.this);
            if (!this.shouldAttachOnInsert) {
                this.node.D2(true);
                return;
            }
            Modifier.c child = this.node.getChild();
            Intrinsics.g(child);
            NodeCoordinator coordinator = child.getCoordinator();
            Intrinsics.g(coordinator);
            D d10 = C5957k.d(this.node);
            if (d10 != null) {
                E e10 = new E(C5946c0.this.getLayoutNode(), d10);
                this.node.J2(e10);
                C5946c0.this.v(this.node, e10);
                e10.y3(coordinator.getWrappedBy());
                e10.x3(coordinator);
                coordinator.y3(e10);
            } else {
                this.node.J2(coordinator);
            }
            this.node.r2();
            this.node.x2();
            g0.a(this.node);
        }

        @Override // androidx.compose.ui.node.InterfaceC5963q
        public void c(int oldIndex, int newIndex) {
            Modifier.c child = this.node.getChild();
            Intrinsics.g(child);
            this.node = child;
            D0.c<Modifier.b> cVar = this.before;
            int i10 = this.offset;
            Modifier.b bVar = cVar.content[oldIndex + i10];
            Modifier.b bVar2 = this.after.content[i10 + newIndex];
            if (Intrinsics.e(bVar, bVar2)) {
                C5946c0.d(C5946c0.this);
            } else {
                C5946c0.this.F(bVar, bVar2, this.node);
                C5946c0.d(C5946c0.this);
            }
        }

        public final void d(D0.c<Modifier.b> cVar) {
            this.after = cVar;
        }

        public final void e(D0.c<Modifier.b> cVar) {
            this.before = cVar;
        }

        public final void f(Modifier.c cVar) {
            this.node = cVar;
        }

        public final void g(int i10) {
            this.offset = i10;
        }

        public final void h(boolean z10) {
            this.shouldAttachOnInsert = z10;
        }

        @Override // androidx.compose.ui.node.InterfaceC5963q
        public void remove(int atIndex, int oldIndex) {
            Modifier.c child = this.node.getChild();
            Intrinsics.g(child);
            C5946c0.d(C5946c0.this);
            if ((C5952f0.a(2) & child.getKindSet()) != 0) {
                NodeCoordinator coordinator = child.getCoordinator();
                Intrinsics.g(coordinator);
                NodeCoordinator nodeCoordinatorP2 = coordinator.getWrappedBy();
                NodeCoordinator nodeCoordinatorO2 = coordinator.getWrapped();
                Intrinsics.g(nodeCoordinatorO2);
                if (nodeCoordinatorP2 != null) {
                    nodeCoordinatorP2.x3(nodeCoordinatorO2);
                }
                nodeCoordinatorO2.y3(nodeCoordinatorP2);
                C5946c0.this.v(this.node, nodeCoordinatorO2);
            }
            this.node = C5946c0.this.h(child);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/c0$b;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.node.c0$b */
    public interface b {
    }

    private final void A(int offset, D0.c<Modifier.b> before, D0.c<Modifier.b> after, Modifier.c tail, boolean shouldAttachOnInsert) {
        C5944b0.e(before.getSize() - offset, after.getSize() - offset, j(tail, offset, before, after, shouldAttachOnInsert));
        B();
    }

    private final void B() {
        int kindSet = 0;
        for (Modifier.c parent = this.tail.getParent(); parent != null && parent != C5948d0.f51733a; parent = parent.getParent()) {
            kindSet |= parent.getKindSet();
            parent.z2(kindSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(Modifier.b prev, Modifier.b next, Modifier.c node) {
        if ((prev instanceof Y) && (next instanceof Y)) {
            C5948d0.f((Y) next, node);
            if (node.getIsAttached()) {
                g0.e(node);
                return;
            } else {
                node.H2(true);
                return;
            }
        }
        if (!(node instanceof C5945c)) {
            C14920a.b("Unknown Modifier.Node type");
            return;
        }
        ((C5945c) node).P2(next);
        if (node.getIsAttached()) {
            g0.e(node);
        } else {
            node.H2(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.c g(Modifier.b element, Modifier.c parent) {
        Modifier.c c5945c;
        if (element instanceof Y) {
            c5945c = ((Y) element).b();
            c5945c.E2(g0.h(c5945c));
        } else {
            c5945c = new C5945c(element);
        }
        if (c5945c.getIsAttached()) {
            C14920a.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        c5945c.D2(true);
        return q(c5945c, parent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int i() {
        return this.head.getAggregateChildKindSet();
    }

    private final a j(Modifier.c head, int offset, D0.c<Modifier.b> before, D0.c<Modifier.b> after, boolean shouldAttachOnInsert) {
        a aVar = this.cachedDiffer;
        if (aVar == null) {
            a aVar2 = new a(head, offset, before, after, shouldAttachOnInsert);
            this.cachedDiffer = aVar2;
            return aVar2;
        }
        aVar.f(head);
        aVar.g(offset);
        aVar.e(before);
        aVar.d(after);
        aVar.h(shouldAttachOnInsert);
        return aVar;
    }

    private final Modifier.c u() {
        if (!(this.head != C5948d0.f51733a)) {
            C14920a.b("padChain called on already padded chain");
        }
        Modifier.c cVar = this.head;
        cVar.G2(C5948d0.f51733a);
        C5948d0.f51733a.B2(cVar);
        return C5948d0.f51733a;
    }

    public final void C() {
        NodeCoordinator e10;
        NodeCoordinator nodeCoordinator = this.innerCoordinator;
        for (Modifier.c parent = this.tail.getParent(); parent != null; parent = parent.getParent()) {
            D d10 = C5957k.d(parent);
            if (d10 != null) {
                if (parent.getCoordinator() != null) {
                    NodeCoordinator coordinator = parent.getCoordinator();
                    Intrinsics.h(coordinator, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    e10 = (E) coordinator;
                    D dN3 = e10.getLayoutModifierNode();
                    e10.R3(d10);
                    if (dN3 != parent) {
                        e10.f3();
                    }
                } else {
                    e10 = new E(this.layoutNode, d10);
                    parent.J2(e10);
                }
                nodeCoordinator.y3(e10);
                e10.x3(nodeCoordinator);
                nodeCoordinator = e10;
            } else {
                parent.J2(nodeCoordinator);
            }
        }
        LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
        nodeCoordinator.y3(parent$ui_release != null ? parent$ui_release.P() : null);
        this.outerCoordinator = nodeCoordinator;
    }

    /* renamed from: k, reason: from getter */
    public final Modifier.c getHead() {
        return this.head;
    }

    /* renamed from: l, reason: from getter */
    public final C5970y getInnerCoordinator() {
        return this.innerCoordinator;
    }

    /* renamed from: m, reason: from getter */
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    /* renamed from: n, reason: from getter */
    public final NodeCoordinator getOuterCoordinator() {
        return this.outerCoordinator;
    }

    /* renamed from: o, reason: from getter */
    public final Modifier.c getTail() {
        return this.tail;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        if (this.head == this.tail) {
            sb2.append("]");
        } else {
            Modifier.c head = getHead();
            while (true) {
                if (head == null || head == getTail()) {
                    break;
                }
                sb2.append(String.valueOf(head));
                if (head.getChild() == this.tail) {
                    sb2.append("]");
                    break;
                }
                sb2.append(",");
                head = head.getChild();
            }
        }
        String string = sb2.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    public final void y() {
        NodeCoordinator nodeCoordinatorO2 = this.outerCoordinator;
        C5970y c5970y = this.innerCoordinator;
        while (nodeCoordinatorO2 != c5970y) {
            nodeCoordinatorO2.c3();
            nodeCoordinatorO2 = nodeCoordinatorO2.getWrapped();
            Intrinsics.g(nodeCoordinatorO2);
        }
        c5970y.c3();
        for (Modifier.c head = getHead(); head != null; head = head.getChild()) {
            head.x2();
            if (head.getInsertedNodeAwaitingAttachForInvalidation()) {
                g0.a(head);
            }
            if (head.getUpdatedNodeAwaitingAttachForInvalidation()) {
                g0.e(head);
            }
            head.D2(false);
            head.H2(false);
        }
    }

    public C5946c0(LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
        C5970y c5970y = new C5970y(layoutNode);
        this.innerCoordinator = c5970y;
        this.outerCoordinator = c5970y;
        x0 x0VarM3 = c5970y.N2();
        this.tail = x0VarM3;
        this.head = x0VarM3;
    }

    private final Modifier.c D(Modifier.c paddedHead) {
        boolean z10;
        boolean z11 = false;
        if (paddedHead == C5948d0.f51733a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C14920a.b("trimChain called on already trimmed chain");
        }
        Modifier.c child = C5948d0.f51733a.getChild();
        if (child == null) {
            child = this.tail;
        }
        child.G2(null);
        C5948d0.f51733a.B2(null);
        C5948d0.f51733a.z2(-1);
        C5948d0.f51733a.J2(null);
        if (child != C5948d0.f51733a) {
            z11 = true;
        }
        if (!z11) {
            C14920a.b("trimChain did not update the head");
        }
        return child;
    }

    public static final /* synthetic */ b d(C5946c0 c5946c0) {
        c5946c0.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.c h(Modifier.c node) {
        if (node.getIsAttached()) {
            g0.d(node);
            node.y2();
            node.s2();
        }
        return w(node);
    }

    private final Modifier.c q(Modifier.c node, Modifier.c parent) {
        Modifier.c child = parent.getChild();
        if (child != null) {
            child.G2(node);
            node.B2(child);
        }
        parent.B2(node);
        node.G2(parent);
        return node;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(Modifier.c start, NodeCoordinator coordinator) {
        NodeCoordinator nodeCoordinatorP;
        for (Modifier.c parent = start.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == C5948d0.f51733a) {
                LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
                if (parent$ui_release != null) {
                    nodeCoordinatorP = parent$ui_release.P();
                } else {
                    nodeCoordinatorP = null;
                }
                coordinator.y3(nodeCoordinatorP);
                this.outerCoordinator = coordinator;
                return;
            }
            if ((C5952f0.a(2) & parent.getKindSet()) != 0) {
                return;
            }
            parent.J2(coordinator);
        }
    }

    private final Modifier.c w(Modifier.c node) {
        Modifier.c child = node.getChild();
        Modifier.c parent = node.getParent();
        if (child != null) {
            child.G2(parent);
            node.B2(null);
        }
        if (parent != null) {
            parent.B2(child);
            node.G2(null);
        }
        Intrinsics.g(parent);
        return parent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        r9 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (r6 >= r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        if (r7 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        if (r9 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        r5 = r13;
        r5.A(r6, r7, r8, r9, !r13.layoutNode.E());
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        j1.C14920a.c("structuralUpdate requires a non-null tail");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0084, code lost:
    
        j1.C14920a.c("expected prior modifier list to be non-empty");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008d, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008e, code lost:
    
        r5 = r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(androidx.compose.ui.Modifier r14) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.C5946c0.E(androidx.compose.ui.Modifier):void");
    }

    public final boolean p(int type) {
        if ((type & i()) != 0) {
            return true;
        }
        return false;
    }

    public final boolean r() {
        if (C5948d0.f51733a.getChild() != null) {
            return true;
        }
        return false;
    }

    public final void s() {
        for (Modifier.c head = getHead(); head != null; head = head.getChild()) {
            head.r2();
        }
    }

    public final void t() {
        for (Modifier.c tail = getTail(); tail != null; tail = tail.getParent()) {
            if (tail.getIsAttached()) {
                tail.s2();
            }
        }
    }

    public final void x() {
        for (Modifier.c tail = getTail(); tail != null; tail = tail.getParent()) {
            if (tail.getIsAttached()) {
                tail.w2();
            }
        }
        z();
        t();
    }

    public final void z() {
        for (Modifier.c tail = getTail(); tail != null; tail = tail.getParent()) {
            if (tail.getIsAttached()) {
                tail.y2();
            }
        }
        NodeCoordinator nodeCoordinatorP2 = this.innerCoordinator;
        NodeCoordinator nodeCoordinator = this.outerCoordinator;
        while (nodeCoordinatorP2 != nodeCoordinator) {
            nodeCoordinatorP2.e3();
            nodeCoordinatorP2 = nodeCoordinatorP2.getWrappedBy();
            Intrinsics.g(nodeCoordinatorP2);
        }
        nodeCoordinator.e3();
    }
}
