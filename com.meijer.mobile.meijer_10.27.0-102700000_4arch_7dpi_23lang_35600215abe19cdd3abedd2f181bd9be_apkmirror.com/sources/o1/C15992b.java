package o1;

import D0.c;
import H1.s;
import U0.l;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.AbstractC5817m;
import androidx.compose.ui.node.C5804c0;
import androidx.compose.ui.node.C5810f0;
import androidx.compose.ui.node.C5815k;
import androidx.compose.ui.node.InterfaceC5814j;
import androidx.compose.ui.node.LayoutNode;
import j1.C14832a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a(\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0012\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/j;", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "bounds", "", "a", "(Landroidx/compose/ui/node/j;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: o1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15992b {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/geometry/Rect;", "c", "()Landroidx/compose/ui/geometry/Rect;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: o1.b$a */
    static final class a extends Lambda implements Function0<Rect> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Rect> f153136f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LayoutCoordinates f153137g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0<Rect> function0, LayoutCoordinates layoutCoordinates) {
            super(0);
            this.f153136f = function0;
            this.f153137g = layoutCoordinates;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Rect invoke() {
            Rect rectInvoke;
            Function0<Rect> function0 = this.f153136f;
            if (function0 != null && (rectInvoke = function0.invoke()) != null) {
                return rectInvoke;
            }
            LayoutCoordinates layoutCoordinates = this.f153137g;
            if (!layoutCoordinates.isAttached()) {
                layoutCoordinates = null;
            }
            if (layoutCoordinates != null) {
                return l.c(s.d(layoutCoordinates.c()));
            }
            return null;
        }
    }

    public static /* synthetic */ Object b(InterfaceC5814j interfaceC5814j, Function0 function0, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function0 = null;
        }
        return a(interfaceC5814j, function0, continuation);
    }

    public static final Object a(InterfaceC5814j interfaceC5814j, Function0<Rect> function0, Continuation<? super Unit> continuation) {
        Object obj;
        C5804c0 nodes;
        if (!interfaceC5814j.getNode().getIsAttached()) {
            return Unit.f142422a;
        }
        int iA = C5810f0.a(524288);
        if (!interfaceC5814j.getNode().getIsAttached()) {
            C14832a.b("visitAncestors called on an unattached node");
        }
        Modifier.c parent = interfaceC5814j.getNode().getParent();
        LayoutNode layoutNodeO = C5815k.o(interfaceC5814j);
        loop0: while (true) {
            obj = null;
            if (layoutNodeO == null) {
                break;
            }
            if ((layoutNodeO.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        Modifier.c cVarH = parent;
                        c cVar = null;
                        while (cVarH != null) {
                            if (cVarH instanceof InterfaceC15991a) {
                                obj = cVarH;
                                break loop0;
                            }
                            if ((cVarH.getKindSet() & iA) != 0 && (cVarH instanceof AbstractC5817m)) {
                                int i10 = 0;
                                for (Modifier.c delegate = ((AbstractC5817m) cVarH).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            cVarH = delegate;
                                        } else {
                                            if (cVar == null) {
                                                cVar = new c(new Modifier.c[16], 0);
                                            }
                                            if (cVarH != null) {
                                                Boxing.a(cVar.c(cVarH));
                                                cVarH = null;
                                            }
                                            Boxing.a(cVar.c(delegate));
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            cVarH = C5815k.h(cVar);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeO = layoutNodeO.getParent$ui_release();
            if (layoutNodeO != null && (nodes = layoutNodeO.getNodes()) != null) {
                parent = nodes.getTail();
            } else {
                parent = null;
            }
        }
        InterfaceC15991a interfaceC15991a = (InterfaceC15991a) obj;
        if (interfaceC15991a == null) {
            return Unit.f142422a;
        }
        LayoutCoordinates layoutCoordinatesM = C5815k.m(interfaceC5814j);
        Object objJ0 = interfaceC15991a.J0(layoutCoordinatesM, new a(function0, layoutCoordinatesM), continuation);
        if (objJ0 == IntrinsicsKt.f()) {
            return objJ0;
        }
        return Unit.f142422a;
    }
}
