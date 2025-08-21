package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.C5905f;
import androidx.compose.ui.layout.InterfaceC5923h;
import androidx.compose.ui.node.AbstractC5959m;
import androidx.compose.ui.node.C5946c0;
import androidx.compose.ui.node.C5952f0;
import androidx.compose.ui.node.C5957k;
import androidx.compose.ui.node.LayoutNode;
import j1.C14920a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0019\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004¢\u0006\u0002\b\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"T", "Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/f;", "direction", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/h$a;", "Lkotlin/ExtensionFunctionType;", "block", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.focus.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5900a {
    public static final <T> T a(FocusTargetNode focusTargetNode, int i10, Function1<? super InterfaceC5923h.a, ? extends T> function1) {
        Modifier.c cVarH;
        InterfaceC5923h interfaceC5923hS2;
        int iC;
        C5946c0 nodes;
        int iA = C5952f0.a(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            C14920a.b("visitAncestors called on an unattached node");
        }
        Modifier.c parent = focusTargetNode.getNode().getParent();
        LayoutNode layoutNodeO = C5957k.o(focusTargetNode);
        loop0: while (true) {
            if (layoutNodeO == null) {
                cVarH = null;
                break;
            }
            if ((layoutNodeO.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        cVarH = parent;
                        D0.c cVar = null;
                        while (cVarH != null) {
                            if (cVarH instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((cVarH.getKindSet() & iA) != 0 && (cVarH instanceof AbstractC5959m)) {
                                int i11 = 0;
                                for (Modifier.c delegate = ((AbstractC5959m) cVarH).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            cVarH = delegate;
                                        } else {
                                            if (cVar == null) {
                                                cVar = new D0.c(new Modifier.c[16], 0);
                                            }
                                            if (cVarH != null) {
                                                cVar.c(cVarH);
                                                cVarH = null;
                                            }
                                            cVar.c(delegate);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            cVarH = C5957k.h(cVar);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeO = layoutNodeO.getParent$ui_release();
            parent = (layoutNodeO == null || (nodes = layoutNodeO.getNodes()) == null) ? null : nodes.getTail();
        }
        FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarH;
        if ((focusTargetNode2 != null && Intrinsics.e(focusTargetNode2.S2(), focusTargetNode.S2())) || (interfaceC5923hS2 = focusTargetNode.S2()) == null) {
            return null;
        }
        C5905f.Companion companion = C5905f.INSTANCE;
        if (C5905f.l(i10, companion.h())) {
            iC = InterfaceC5923h.b.INSTANCE.a();
        } else if (C5905f.l(i10, companion.a())) {
            iC = InterfaceC5923h.b.INSTANCE.d();
        } else if (C5905f.l(i10, companion.d())) {
            iC = InterfaceC5923h.b.INSTANCE.e();
        } else if (C5905f.l(i10, companion.g())) {
            iC = InterfaceC5923h.b.INSTANCE.f();
        } else if (C5905f.l(i10, companion.e())) {
            iC = InterfaceC5923h.b.INSTANCE.b();
        } else {
            if (!C5905f.l(i10, companion.f())) {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout");
            }
            iC = InterfaceC5923h.b.INSTANCE.c();
        }
        return (T) interfaceC5923hS2.k0(iC, function1);
    }
}
