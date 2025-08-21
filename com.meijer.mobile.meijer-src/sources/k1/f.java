package k1;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.AbstractC5959m;
import androidx.compose.ui.node.C5945c;
import androidx.compose.ui.node.C5952f0;
import androidx.compose.ui.node.C5957k;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import j1.C14920a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0011J!\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u0015\u0010\u0014J!\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u001e\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001bR\u001e\u0010 \u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\"¨\u0006$"}, d2 = {"Lk1/f;", "", "Landroidx/compose/ui/node/Owner;", "owner", "<init>", "(Landroidx/compose/ui/node/Owner;)V", "Landroidx/compose/ui/Modifier$c;", "node", "Lk1/c;", "key", "", "Landroidx/compose/ui/node/c;", "set", "", "c", "(Landroidx/compose/ui/Modifier$c;Lk1/c;Ljava/util/Set;)V", "b", "()V", "e", "f", "(Landroidx/compose/ui/node/c;Lk1/c;)V", "a", "d", "Landroidx/compose/ui/node/Owner;", "getOwner", "()Landroidx/compose/ui/node/Owner;", "LD0/c;", "LD0/c;", "inserted", "insertedLocal", "Landroidx/compose/ui/node/LayoutNode;", "removed", "removedLocal", "", "Z", "invalidated", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Owner owner;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final D0.c<C5945c> inserted = new D0.c<>(new C5945c[16], 0);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final D0.c<c<?>> insertedLocal = new D0.c<>(new c[16], 0);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final D0.c<LayoutNode> removed = new D0.c<>(new LayoutNode[16], 0);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final D0.c<c<?>> removedLocal = new D0.c<>(new c[16], 0);

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean invalidated;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends Lambda implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        a() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            f.this.e();
        }
    }

    public final void e() {
        this.invalidated = false;
        HashSet hashSet = new HashSet();
        D0.c<LayoutNode> cVar = this.removed;
        LayoutNode[] layoutNodeArr = cVar.content;
        int size = cVar.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            LayoutNode layoutNode = layoutNodeArr[i10];
            c<?> cVar2 = this.removedLocal.content[i10];
            if (layoutNode.getNodes().getHead().getIsAttached()) {
                c(layoutNode.getNodes().getHead(), cVar2, hashSet);
            }
        }
        this.removed.k();
        this.removedLocal.k();
        D0.c<C5945c> cVar3 = this.inserted;
        C5945c[] c5945cArr = cVar3.content;
        int size2 = cVar3.getSize();
        for (int i11 = 0; i11 < size2; i11++) {
            C5945c c5945c = c5945cArr[i11];
            c<?> cVar4 = this.insertedLocal.content[i11];
            if (c5945c.getIsAttached()) {
                c(c5945c, cVar4, hashSet);
            }
        }
        this.inserted.k();
        this.insertedLocal.k();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C5945c) it.next()).S2();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.Set, java.util.Set<androidx.compose.ui.node.c>] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    private final void c(Modifier.c node, c<?> key, Set<C5945c> set) {
        int iA = C5952f0.a(32);
        if (!node.getNode().getIsAttached()) {
            C14920a.b("visitSubtreeIf called on an unattached node");
        }
        D0.c cVar = new D0.c(new Modifier.c[16], 0);
        Modifier.c child = node.getNode().getChild();
        if (child == null) {
            C5957k.c(cVar, node.getNode(), false);
        } else {
            cVar.c(child);
        }
        while (cVar.getSize() != 0) {
            Modifier.c cVar2 = (Modifier.c) cVar.u(cVar.getSize() - 1);
            if ((cVar2.getAggregateChildKindSet() & iA) != 0) {
                for (Modifier.c child2 = cVar2; child2 != null; child2 = child2.getChild()) {
                    if ((child2.getKindSet() & iA) != 0) {
                        AbstractC5959m abstractC5959mH = child2;
                        D0.c cVar3 = null;
                        while (abstractC5959mH != 0) {
                            if (abstractC5959mH instanceof h) {
                                h hVar = (h) abstractC5959mH;
                                if (hVar instanceof C5945c) {
                                    C5945c c5945c = (C5945c) hVar;
                                    if ((c5945c.getElement() instanceof d) && c5945c.M2().contains(key)) {
                                        set.add(hVar);
                                    }
                                }
                                if (hVar.t0().a(key)) {
                                    break;
                                }
                            } else if ((abstractC5959mH.getKindSet() & iA) != 0 && (abstractC5959mH instanceof AbstractC5959m)) {
                                Modifier.c delegate = abstractC5959mH.getDelegate();
                                int i10 = 0;
                                abstractC5959mH = abstractC5959mH;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            abstractC5959mH = delegate;
                                        } else {
                                            if (cVar3 == null) {
                                                cVar3 = new D0.c(new Modifier.c[16], 0);
                                            }
                                            if (abstractC5959mH != 0) {
                                                cVar3.c(abstractC5959mH);
                                                abstractC5959mH = 0;
                                            }
                                            cVar3.c(delegate);
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    abstractC5959mH = abstractC5959mH;
                                }
                                if (i10 == 1) {
                                }
                            }
                            abstractC5959mH = C5957k.h(cVar3);
                        }
                    }
                }
            }
            C5957k.c(cVar, cVar2, false);
        }
    }

    public final void a(C5945c node, c<?> key) {
        this.inserted.c(node);
        this.insertedLocal.c(key);
        b();
    }

    public final void b() {
        if (this.invalidated) {
            return;
        }
        this.invalidated = true;
        this.owner.C(new a());
    }

    public final void d(C5945c node, c<?> key) {
        this.removed.c(C5957k.o(node));
        this.removedLocal.c(key);
        b();
    }

    public final void f(C5945c node, c<?> key) {
        this.inserted.c(node);
        this.insertedLocal.c(key);
        b();
    }

    public f(Owner owner) {
        this.owner = owner;
    }
}
