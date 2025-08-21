package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import j1.C14920a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0019\u001a\u00028\u0000\"\b\b\u0000\u0010\u0017*\u00020\u00162\u0006\u0010\u0018\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0016H\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\u001e\u0010\u0003J\u000f\u0010\u001f\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0007H\u0010¢\u0006\u0004\b \u0010\u0003J\u000f\u0010!\u001a\u00020\u0007H\u0010¢\u0006\u0004\b!\u0010\u0003J\u000f\u0010\"\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\"\u0010\u0003R \u0010(\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010\u0003\u001a\u0004\b%\u0010&R$\u0010.\u001a\u0004\u0018\u00010\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010\u0015¨\u0006/"}, d2 = {"Landroidx/compose/ui/node/m;", "Landroidx/compose/ui/Modifier$c;", "<init>", "()V", "", "delegateKindSet", "delegateNode", "", "P2", "(ILandroidx/compose/ui/Modifier$c;)V", "newKindSet", "", "recalculateOwner", "O2", "(IZ)V", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "J2", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "owner", "A2", "(Landroidx/compose/ui/Modifier$c;)V", "Landroidx/compose/ui/node/j;", "T", "delegatableNode", "K2", "(Landroidx/compose/ui/node/j;)Landroidx/compose/ui/node/j;", "instance", "N2", "(Landroidx/compose/ui/node/j;)V", "r2", "x2", "y2", "s2", "w2", "o", "I", "M2", "()I", "getSelfKindSet$ui_release$annotations", "selfKindSet", "p", "Landroidx/compose/ui/Modifier$c;", "L2", "()Landroidx/compose/ui/Modifier$c;", "setDelegate$ui_release", "delegate", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.node.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5959m extends Modifier.c {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final int selfKindSet = g0.g(this);

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private Modifier.c delegate;

    /* renamed from: L2, reason: from getter */
    public final Modifier.c getDelegate() {
        return this.delegate;
    }

    /* renamed from: M2, reason: from getter */
    public final int getSelfKindSet() {
        return this.selfKindSet;
    }

    protected final void N2(InterfaceC5956j instance) {
        Modifier.c cVar = null;
        for (Modifier.c child = this.delegate; child != null; child = child.getChild()) {
            if (child == instance) {
                if (child.getIsAttached()) {
                    g0.d(child);
                    child.y2();
                    child.s2();
                }
                child.A2(child);
                child.z2(0);
                if (cVar == null) {
                    this.delegate = child.getChild();
                } else {
                    cVar.B2(child.getChild());
                }
                child.B2(null);
                child.G2(null);
                int kindSet = getKindSet();
                int iH = g0.h(this);
                O2(iH, true);
                if (getIsAttached() && (kindSet & C5952f0.a(2)) != 0 && (C5952f0.a(2) & iH) == 0) {
                    C5946c0 nodes = C5957k.o(this).getNodes();
                    getNode().J2(null);
                    nodes.C();
                    return;
                }
                return;
            }
            cVar = child;
        }
        throw new IllegalStateException(("Could not find delegate: " + instance).toString());
    }

    private final void O2(int newKindSet, boolean recalculateOwner) {
        int aggregateChildKindSet;
        Modifier.c child;
        int kindSet = getKindSet();
        E2(newKindSet);
        if (kindSet != newKindSet) {
            if (C5957k.g(this)) {
                z2(newKindSet);
            }
            if (getIsAttached()) {
                Modifier.c node = getNode();
                Modifier.c parent = this;
                while (parent != null) {
                    newKindSet |= parent.getKindSet();
                    parent.E2(newKindSet);
                    if (parent == node) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
                if (recalculateOwner && parent == node) {
                    newKindSet = g0.h(node);
                    node.E2(newKindSet);
                }
                if (parent != null && (child = parent.getChild()) != null) {
                    aggregateChildKindSet = child.getAggregateChildKindSet();
                } else {
                    aggregateChildKindSet = 0;
                }
                int kindSet2 = newKindSet | aggregateChildKindSet;
                while (parent != null) {
                    kindSet2 |= parent.getKindSet();
                    parent.z2(kindSet2);
                    parent = parent.getParent();
                }
            }
        }
    }

    private final void P2(int delegateKindSet, Modifier.c delegateNode) {
        int kindSet = getKindSet();
        if ((delegateKindSet & C5952f0.a(2)) != 0 && (C5952f0.a(2) & kindSet) != 0 && !(this instanceof D)) {
            C14920a.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + delegateNode);
        }
    }

    @Override // androidx.compose.ui.Modifier.c
    public void A2(Modifier.c owner) {
        super.A2(owner);
        for (Modifier.c delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.A2(owner);
        }
    }

    @Override // androidx.compose.ui.Modifier.c
    public void J2(NodeCoordinator coordinator) {
        super.J2(coordinator);
        for (Modifier.c delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.J2(coordinator);
        }
    }

    protected final <T extends InterfaceC5956j> T K2(T delegatableNode) {
        Modifier.c cVar;
        Modifier.c node = delegatableNode.getNode();
        Modifier.c parent = null;
        if (node != delegatableNode) {
            if (delegatableNode instanceof Modifier.c) {
                cVar = (Modifier.c) delegatableNode;
            } else {
                cVar = null;
            }
            if (cVar != null) {
                parent = cVar.getParent();
            }
            if (node == getNode() && Intrinsics.e(parent, this)) {
                return delegatableNode;
            }
            throw new IllegalStateException("Cannot delegate to an already delegated node");
        }
        if (node.getIsAttached()) {
            C14920a.b("Cannot delegate to an already attached node");
        }
        node.A2(getNode());
        int kindSet = getKindSet();
        int iH = g0.h(node);
        node.E2(iH);
        P2(iH, node);
        node.B2(this.delegate);
        this.delegate = node;
        node.G2(this);
        O2(getKindSet() | iH, false);
        if (getIsAttached()) {
            if ((iH & C5952f0.a(2)) != 0 && (kindSet & C5952f0.a(2)) == 0) {
                C5946c0 nodes = C5957k.o(this).getNodes();
                getNode().J2(null);
                nodes.C();
            } else {
                J2(getCoordinator());
            }
            node.r2();
            node.x2();
            g0.a(node);
        }
        return delegatableNode;
    }

    @Override // androidx.compose.ui.Modifier.c
    public void r2() {
        super.r2();
        for (Modifier.c delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.J2(getCoordinator());
            if (!delegate.getIsAttached()) {
                delegate.r2();
            }
        }
    }

    @Override // androidx.compose.ui.Modifier.c
    public void s2() {
        for (Modifier.c delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.s2();
        }
        super.s2();
    }

    @Override // androidx.compose.ui.Modifier.c
    public void w2() {
        super.w2();
        for (Modifier.c delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.w2();
        }
    }

    @Override // androidx.compose.ui.Modifier.c
    public void x2() {
        for (Modifier.c delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.x2();
        }
        super.x2();
    }

    @Override // androidx.compose.ui.Modifier.c
    public void y2() {
        super.y2();
        for (Modifier.c delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.y2();
        }
    }
}
