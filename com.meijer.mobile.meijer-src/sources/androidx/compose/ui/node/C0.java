package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import j1.C14920a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u00028\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a/\u0010\r\u001a\u00020\f*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000e\u001a/\u0010\u000f\u001a\u00020\f\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u00028\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000f\u0010\u0010\u001a/\u0010\u0012\u001a\u00020\f*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\t¢\u0006\u0004\b\u0012\u0010\u000e\u001a/\u0010\u0013\u001a\u00020\f\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u00028\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00110\t¢\u0006\u0004\b\u0013\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/node/j;", "", "key", "Landroidx/compose/ui/node/B0;", "a", "(Landroidx/compose/ui/node/j;Ljava/lang/Object;)Landroidx/compose/ui/node/B0;", "T", "b", "(Landroidx/compose/ui/node/B0;)Landroidx/compose/ui/node/B0;", "Lkotlin/Function1;", "", "block", "", "c", "(Landroidx/compose/ui/node/j;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "d", "(Landroidx/compose/ui/node/B0;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/node/A0;", "e", "f", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class C0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static final B0 a(InterfaceC5956j interfaceC5956j, Object obj) {
        C5946c0 nodes;
        int iA = C5952f0.a(262144);
        if (!interfaceC5956j.getNode().getIsAttached()) {
            C14920a.b("visitAncestors called on an unattached node");
        }
        Modifier.c parent = interfaceC5956j.getNode().getParent();
        LayoutNode layoutNodeO = C5957k.o(interfaceC5956j);
        while (layoutNodeO != null) {
            if ((layoutNodeO.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        AbstractC5959m abstractC5959mH = parent;
                        D0.c cVar = null;
                        while (abstractC5959mH != 0) {
                            if (abstractC5959mH instanceof B0) {
                                B0 b02 = (B0) abstractC5959mH;
                                if (Intrinsics.e(obj, b02.getTraverseKey())) {
                                    return b02;
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
                                            if (cVar == null) {
                                                cVar = new D0.c(new Modifier.c[16], 0);
                                            }
                                            if (abstractC5959mH != 0) {
                                                cVar.c(abstractC5959mH);
                                                abstractC5959mH = 0;
                                            }
                                            cVar.c(delegate);
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    abstractC5959mH = abstractC5959mH;
                                }
                                if (i10 == 1) {
                                }
                            }
                            abstractC5959mH = C5957k.h(cVar);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeO = layoutNodeO.getParent$ui_release();
            parent = (layoutNodeO == null || (nodes = layoutNodeO.getNodes()) == null) ? null : nodes.getTail();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final <T extends B0> T b(T t10) {
        C5946c0 nodes;
        int iA = C5952f0.a(262144);
        if (!t10.getNode().getIsAttached()) {
            C14920a.b("visitAncestors called on an unattached node");
        }
        Modifier.c parent = t10.getNode().getParent();
        LayoutNode layoutNodeO = C5957k.o(t10);
        while (layoutNodeO != null) {
            if ((layoutNodeO.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        AbstractC5959m abstractC5959mH = parent;
                        D0.c cVar = null;
                        while (abstractC5959mH != 0) {
                            if (abstractC5959mH instanceof B0) {
                                T t11 = (T) abstractC5959mH;
                                if (Intrinsics.e(t10.getTraverseKey(), t11.getTraverseKey()) && P0.d.a(t10, t11)) {
                                    return t11;
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
                                            if (cVar == null) {
                                                cVar = new D0.c(new Modifier.c[16], 0);
                                            }
                                            if (abstractC5959mH != 0) {
                                                cVar.c(abstractC5959mH);
                                                abstractC5959mH = 0;
                                            }
                                            cVar.c(delegate);
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    abstractC5959mH = abstractC5959mH;
                                }
                                if (i10 == 1) {
                                }
                            }
                            abstractC5959mH = C5957k.h(cVar);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeO = layoutNodeO.getParent$ui_release();
            parent = (layoutNodeO == null || (nodes = layoutNodeO.getNodes()) == null) ? null : nodes.getTail();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.Modifier$c] */
    public static final void c(InterfaceC5956j interfaceC5956j, Object obj, Function1<? super B0, Boolean> function1) {
        C5946c0 nodes;
        int iA = C5952f0.a(262144);
        if (!interfaceC5956j.getNode().getIsAttached()) {
            C14920a.b("visitAncestors called on an unattached node");
        }
        Modifier.c parent = interfaceC5956j.getNode().getParent();
        LayoutNode layoutNodeO = C5957k.o(interfaceC5956j);
        while (layoutNodeO != null) {
            if ((layoutNodeO.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        AbstractC5959m abstractC5959mH = parent;
                        D0.c cVar = null;
                        while (abstractC5959mH != 0) {
                            if (abstractC5959mH instanceof B0) {
                                B0 b02 = (B0) abstractC5959mH;
                                if (!(Intrinsics.e(obj, b02.getTraverseKey()) ? function1.invoke(b02).booleanValue() : true)) {
                                    return;
                                }
                            } else {
                                if (((abstractC5959mH.getKindSet() & iA) != 0) && (abstractC5959mH instanceof AbstractC5959m)) {
                                    Modifier.c delegate = abstractC5959mH.getDelegate();
                                    int i10 = 0;
                                    abstractC5959mH = abstractC5959mH;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iA) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                abstractC5959mH = delegate;
                                            } else {
                                                if (cVar == null) {
                                                    cVar = new D0.c(new Modifier.c[16], 0);
                                                }
                                                if (abstractC5959mH != 0) {
                                                    cVar.c(abstractC5959mH);
                                                    abstractC5959mH = 0;
                                                }
                                                cVar.c(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        abstractC5959mH = abstractC5959mH;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                            }
                            abstractC5959mH = C5957k.h(cVar);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeO = layoutNodeO.getParent$ui_release();
            parent = (layoutNodeO == null || (nodes = layoutNodeO.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.Modifier$c] */
    public static final <T extends B0> void d(T t10, Function1<? super T, Boolean> function1) {
        C5946c0 nodes;
        int iA = C5952f0.a(262144);
        if (!t10.getNode().getIsAttached()) {
            C14920a.b("visitAncestors called on an unattached node");
        }
        Modifier.c parent = t10.getNode().getParent();
        LayoutNode layoutNodeO = C5957k.o(t10);
        while (layoutNodeO != null) {
            if ((layoutNodeO.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        AbstractC5959m abstractC5959mH = parent;
                        D0.c cVar = null;
                        while (abstractC5959mH != 0) {
                            boolean zBooleanValue = true;
                            if (abstractC5959mH instanceof B0) {
                                B0 b02 = (B0) abstractC5959mH;
                                if (Intrinsics.e(t10.getTraverseKey(), b02.getTraverseKey()) && P0.d.a(t10, b02)) {
                                    zBooleanValue = function1.invoke(b02).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else {
                                if (((abstractC5959mH.getKindSet() & iA) != 0) && (abstractC5959mH instanceof AbstractC5959m)) {
                                    Modifier.c delegate = abstractC5959mH.getDelegate();
                                    int i10 = 0;
                                    abstractC5959mH = abstractC5959mH;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iA) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                abstractC5959mH = delegate;
                                            } else {
                                                if (cVar == null) {
                                                    cVar = new D0.c(new Modifier.c[16], 0);
                                                }
                                                if (abstractC5959mH != 0) {
                                                    cVar.c(abstractC5959mH);
                                                    abstractC5959mH = 0;
                                                }
                                                cVar.c(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        abstractC5959mH = abstractC5959mH;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                            }
                            abstractC5959mH = C5957k.h(cVar);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeO = layoutNodeO.getParent$ui_release();
            parent = (layoutNodeO == null || (nodes = layoutNodeO.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    public static final void e(InterfaceC5956j interfaceC5956j, Object obj, Function1<? super B0, ? extends A0> function1) {
        int iA = C5952f0.a(262144);
        if (!interfaceC5956j.getNode().getIsAttached()) {
            C14920a.b("visitSubtreeIf called on an unattached node");
        }
        D0.c cVar = new D0.c(new Modifier.c[16], 0);
        Modifier.c child = interfaceC5956j.getNode().getChild();
        if (child == null) {
            C5957k.c(cVar, interfaceC5956j.getNode(), false);
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
                            if (abstractC5959mH instanceof B0) {
                                B0 b02 = (B0) abstractC5959mH;
                                A0 a0Invoke = Intrinsics.e(obj, b02.getTraverseKey()) ? function1.invoke(b02) : A0.f51384a;
                                if (a0Invoke == A0.f51386c) {
                                    return;
                                }
                                if (a0Invoke == A0.f51385b) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    public static final <T extends B0> void f(T t10, Function1<? super T, ? extends A0> function1) {
        int iA = C5952f0.a(262144);
        if (!t10.getNode().getIsAttached()) {
            C14920a.b("visitSubtreeIf called on an unattached node");
        }
        D0.c cVar = new D0.c(new Modifier.c[16], 0);
        Modifier.c child = t10.getNode().getChild();
        if (child == null) {
            C5957k.c(cVar, t10.getNode(), false);
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
                            if (abstractC5959mH instanceof B0) {
                                B0 b02 = (B0) abstractC5959mH;
                                A0 a0Invoke = (Intrinsics.e(t10.getTraverseKey(), b02.getTraverseKey()) && P0.d.a(t10, b02)) ? function1.invoke(b02) : A0.f51384a;
                                if (a0Invoke == A0.f51386c) {
                                    return;
                                }
                                if (a0Invoke == A0.f51385b) {
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
}
