package androidx.compose.ui.viewinterop;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.C5905f;
import androidx.compose.ui.focus.C5911l;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.InterfaceC5906g;
import androidx.compose.ui.focus.J;
import androidx.compose.ui.focus.K;
import androidx.compose.ui.focus.s;
import androidx.compose.ui.focus.u;
import androidx.compose.ui.focus.w;
import androidx.compose.ui.node.AbstractC5959m;
import androidx.compose.ui.node.C5952f0;
import androidx.compose.ui.node.C5957k;
import androidx.compose.ui.node.C5958l;
import androidx.compose.ui.node.Owner;
import j1.C14920a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0005J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0005R$\u0010\u001b\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010#\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010+\u001a\u0013\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000b0$¢\u0006\u0002\b&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R(\u0010.\u001a\u0013\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000b0$¢\u0006\u0002\b&8\u0006¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010*¨\u0006/"}, d2 = {"Landroidx/compose/ui/viewinterop/g;", "Landroidx/compose/ui/Modifier$c;", "Landroidx/compose/ui/focus/w;", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "<init>", "()V", "Landroidx/compose/ui/focus/FocusTargetNode;", "K2", "()Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/u;", "focusProperties", "", "j1", "(Landroidx/compose/ui/focus/u;)V", "Landroid/view/View;", "oldFocus", "newFocus", "onGlobalFocusChanged", "(Landroid/view/View;Landroid/view/View;)V", "t2", "u2", "o", "Landroid/view/View;", "L2", "()Landroid/view/View;", "setFocusedChild", "(Landroid/view/View;)V", "focusedChild", "Landroid/view/ViewTreeObserver;", "p", "Landroid/view/ViewTreeObserver;", "getAttachedViewTreeObserver", "()Landroid/view/ViewTreeObserver;", "setAttachedViewTreeObserver", "(Landroid/view/ViewTreeObserver;)V", "attachedViewTreeObserver", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/g;", "Lkotlin/ExtensionFunctionType;", "q", "Lkotlin/jvm/functions/Function1;", "getOnEnter", "()Lkotlin/jvm/functions/Function1;", "onEnter", "r", "getOnExit", "onExit", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class g extends Modifier.c implements w, ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private View focusedChild;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private ViewTreeObserver attachedViewTreeObserver;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Function1<InterfaceC5906g, Unit> onEnter = new a();

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final Function1<InterfaceC5906g, Unit> onExit = new b();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/focus/g;", "", "a", "(Landroidx/compose/ui/focus/g;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<InterfaceC5906g, Unit> {
        a() {
            super(1);
        }

        public final void a(InterfaceC5906g interfaceC5906g) {
            View viewG = f.g(g.this);
            if (viewG.isFocused() || viewG.hasFocus()) {
                return;
            }
            if (C5911l.b(viewG, C5911l.c(interfaceC5906g.getRequestedFocusDirection()), f.f(C5957k.p(g.this).getFocusOwner(), C5958l.a(g.this), viewG))) {
                return;
            }
            interfaceC5906g.a();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5906g interfaceC5906g) {
            a(interfaceC5906g);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/focus/g;", "", "a", "(Landroidx/compose/ui/focus/g;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class b extends Lambda implements Function1<InterfaceC5906g, Unit> {
        b() {
            super(1);
        }

        public final void a(InterfaceC5906g interfaceC5906g) {
            View viewFindNextFocusFromRect;
            View viewG = f.g(g.this);
            if (P0.h.isViewFocusFixEnabled) {
                if (viewG.hasFocus() || viewG.isFocused()) {
                    viewG.clearFocus();
                    return;
                }
                return;
            }
            if (viewG.hasFocus()) {
                s focusOwner = C5957k.p(g.this).getFocusOwner();
                View viewA = C5958l.a(g.this);
                if (!(viewG instanceof ViewGroup)) {
                    if (!viewA.requestFocus()) {
                        throw new IllegalStateException("host view did not take focus");
                    }
                    return;
                }
                Rect rectF = f.f(focusOwner, viewA, viewG);
                Integer numC = C5911l.c(interfaceC5906g.getRequestedFocusDirection());
                int iIntValue = numC != null ? numC.intValue() : 130;
                FocusFinder focusFinder = FocusFinder.getInstance();
                g gVar = g.this;
                if (gVar.getFocusedChild() != null) {
                    Intrinsics.h(viewA, "null cannot be cast to non-null type android.view.ViewGroup");
                    viewFindNextFocusFromRect = focusFinder.findNextFocus((ViewGroup) viewA, gVar.getFocusedChild(), iIntValue);
                } else {
                    Intrinsics.h(viewA, "null cannot be cast to non-null type android.view.ViewGroup");
                    viewFindNextFocusFromRect = focusFinder.findNextFocusFromRect((ViewGroup) viewA, rectF, iIntValue);
                }
                if (viewFindNextFocusFromRect == null || !f.d(viewG, viewFindNextFocusFromRect)) {
                    if (!viewA.requestFocus()) {
                        throw new IllegalStateException("host view did not take focus");
                    }
                } else {
                    viewFindNextFocusFromRect.requestFocus(iIntValue, rectF);
                    interfaceC5906g.a();
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5906g interfaceC5906g) {
            a(interfaceC5906g);
            return Unit.f143329a;
        }
    }

    @Override // androidx.compose.ui.focus.w
    public void j1(u focusProperties) {
        focusProperties.g(false);
        focusProperties.h(this.onEnter);
        focusProperties.m(this.onExit);
    }

    private final FocusTargetNode K2() {
        int iA = C5952f0.a(1024);
        if (!getNode().getIsAttached()) {
            C14920a.b("visitLocalDescendants called on an unattached node");
        }
        Modifier.c node = getNode();
        if ((node.getAggregateChildKindSet() & iA) != 0) {
            boolean z10 = false;
            for (Modifier.c child = node.getChild(); child != null; child = child.getChild()) {
                if ((child.getKindSet() & iA) != 0) {
                    Modifier.c cVarH = child;
                    D0.c cVar = null;
                    while (cVarH != null) {
                        if (cVarH instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) cVarH;
                            if (z10) {
                                return focusTargetNode;
                            }
                            z10 = true;
                        } else if ((cVarH.getKindSet() & iA) != 0 && (cVarH instanceof AbstractC5959m)) {
                            int i10 = 0;
                            for (Modifier.c delegate = ((AbstractC5959m) cVarH).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                if ((delegate.getKindSet() & iA) != 0) {
                                    i10++;
                                    if (i10 == 1) {
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
                            if (i10 == 1) {
                            }
                        }
                        cVarH = C5957k.h(cVar);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    /* renamed from: L2, reason: from getter */
    public final View getFocusedChild() {
        return this.focusedChild;
    }

    @Override // androidx.compose.ui.Modifier.c
    public void u2() {
        ViewTreeObserver viewTreeObserver = this.attachedViewTreeObserver;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.attachedViewTreeObserver = null;
        C5958l.a(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.focusedChild = null;
        super.u2();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(View oldFocus, View newFocus) {
        boolean z10;
        boolean z11;
        if (C5957k.o(this).getOwner() != null) {
            View viewG = f.g(this);
            s focusOwner = C5957k.p(this).getFocusOwner();
            Owner ownerP = C5957k.p(this);
            if (oldFocus != null && !Intrinsics.e(oldFocus, ownerP) && f.d(viewG, oldFocus)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (newFocus != null && !Intrinsics.e(newFocus, ownerP) && f.d(viewG, newFocus)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                this.focusedChild = newFocus;
                return;
            }
            if (z11) {
                this.focusedChild = newFocus;
                FocusTargetNode focusTargetNodeK2 = K2();
                if (!focusTargetNodeK2.d0().b()) {
                    if (P0.h.isTrackFocusEnabled) {
                        K.j(focusTargetNodeK2);
                        return;
                    }
                    J jD = focusOwner.d();
                    try {
                        if (jD.getOngoingTransaction()) {
                            jD.f();
                        }
                        jD.e();
                        K.j(focusTargetNodeK2);
                        jD.g();
                        return;
                    } catch (Throwable th2) {
                        jD.g();
                        throw th2;
                    }
                }
                return;
            }
            if (z10) {
                this.focusedChild = null;
                if (K2().d0().a()) {
                    focusOwner.n(false, true, false, C5905f.INSTANCE.c());
                    return;
                }
                return;
            }
            this.focusedChild = null;
        }
    }

    @Override // androidx.compose.ui.Modifier.c
    public void t2() {
        super.t2();
        ViewTreeObserver viewTreeObserver = C5958l.a(this).getViewTreeObserver();
        this.attachedViewTreeObserver = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }
}
