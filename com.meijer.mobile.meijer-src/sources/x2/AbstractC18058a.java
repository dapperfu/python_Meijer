package x2;

import Z.o0;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.List;
import q2.C16592A;
import q2.C16595b;
import q2.y;
import q2.z;
import x2.C18059b;

/* renamed from: x2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC18058a extends androidx.core.view.a {

    /* renamed from: n, reason: collision with root package name */
    private static final Rect f170083n = new Rect(a.e.API_PRIORITY_OTHER, a.e.API_PRIORITY_OTHER, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o, reason: collision with root package name */
    private static final C18059b.a<y> f170084o = new C2727a();

    /* renamed from: p, reason: collision with root package name */
    private static final C18059b.InterfaceC2728b<o0<y>, y> f170085p = new b();

    /* renamed from: h, reason: collision with root package name */
    private final AccessibilityManager f170090h;

    /* renamed from: i, reason: collision with root package name */
    private final View f170091i;

    /* renamed from: j, reason: collision with root package name */
    private c f170092j;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f170086d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    private final Rect f170087e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    private final Rect f170088f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    private final int[] f170089g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    int f170093k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    int f170094l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    private int f170095m = Integer.MIN_VALUE;

    /* renamed from: x2.a$c */
    private class c extends z {
        @Override // q2.z
        public y d(int i10) {
            int i11 = i10 == 2 ? AbstractC18058a.this.f170093k : AbstractC18058a.this.f170094l;
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i11);
        }

        c() {
        }

        @Override // q2.z
        public y b(int i10) {
            return y.d0(AbstractC18058a.this.J(i10));
        }

        @Override // q2.z
        public boolean f(int i10, int i11, Bundle bundle) {
            return AbstractC18058a.this.R(i10, i11, bundle);
        }
    }

    private boolean G(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f170091i.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.f170091i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    private boolean S(int i10, int i11, Bundle bundle) {
        return i11 != 1 ? i11 != 2 ? i11 != 64 ? i11 != 128 ? L(i10, i11, bundle) : n(i10) : U(i10) : o(i10) : V(i10);
    }

    private AccessibilityEvent q(int i10, int i11) {
        return i10 != -1 ? r(i10, i11) : s(i11);
    }

    protected abstract int B(float f10, float f11);

    protected abstract void C(List<Integer> list);

    public final void E(int i10) {
        F(i10, 0);
    }

    y J(int i10) {
        return i10 == -1 ? u() : t(i10);
    }

    protected abstract boolean L(int i10, int i11, Bundle bundle);

    protected void M(AccessibilityEvent accessibilityEvent) {
    }

    protected void N(int i10, AccessibilityEvent accessibilityEvent) {
    }

    protected void O(y yVar) {
    }

    protected abstract void P(int i10, y yVar);

    protected void Q(int i10, boolean z10) {
    }

    boolean R(int i10, int i11, Bundle bundle) {
        return i10 != -1 ? S(i10, i11, bundle) : T(i11, bundle);
    }

    /* renamed from: x2.a$a, reason: collision with other inner class name */
    class C2727a implements C18059b.a<y> {
        C2727a() {
        }

        @Override // x2.C18059b.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(y yVar, Rect rect) {
            yVar.n(rect);
        }
    }

    /* renamed from: x2.a$b */
    class b implements C18059b.InterfaceC2728b<o0<y>, y> {
        b() {
        }

        @Override // x2.C18059b.InterfaceC2728b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public y a(o0<y> o0Var, int i10) {
            return o0Var.n(i10);
        }

        @Override // x2.C18059b.InterfaceC2728b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int b(o0<y> o0Var) {
            return o0Var.m();
        }
    }

    private static int H(int i10) {
        if (i10 == 19) {
            return 33;
        }
        if (i10 != 21) {
            return i10 != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean T(int i10, Bundle bundle) {
        return this.f170091i.performAccessibilityAction(i10, bundle);
    }

    private boolean U(int i10) {
        int i11;
        if (!this.f170090h.isEnabled() || !this.f170090h.isTouchExplorationEnabled() || (i11 = this.f170093k) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            n(i11);
        }
        this.f170093k = i10;
        this.f170091i.invalidate();
        W(i10, 32768);
        return true;
    }

    private void Y(int i10) {
        int i11 = this.f170095m;
        if (i11 == i10) {
            return;
        }
        this.f170095m = i10;
        W(i10, 128);
        W(i11, 256);
    }

    private boolean n(int i10) {
        if (this.f170093k != i10) {
            return false;
        }
        this.f170093k = Integer.MIN_VALUE;
        this.f170091i.invalidate();
        W(i10, 65536);
        return true;
    }

    private boolean p() {
        int i10 = this.f170094l;
        return i10 != Integer.MIN_VALUE && L(i10, 16, null);
    }

    private y u() {
        y yVarC0 = y.c0(this.f170091i);
        ViewCompat.a0(this.f170091i, yVarC0);
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        if (yVarC0.p() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            yVarC0.d(this.f170091i, ((Integer) arrayList.get(i10)).intValue());
        }
        return yVarC0;
    }

    private o0<y> y() {
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        o0<y> o0Var = new o0<>();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            o0Var.j(arrayList.get(i10).intValue(), t(arrayList.get(i10).intValue()));
        }
        return o0Var;
    }

    public final int A() {
        return this.f170094l;
    }

    public final void F(int i10, int i11) {
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f170090h.isEnabled() || (parent = this.f170091i.getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventQ = q(i10, RecyclerView.m.FLAG_MOVED);
        C16595b.b(accessibilityEventQ, i11);
        parent.requestSendAccessibilityEvent(this.f170091i, accessibilityEventQ);
    }

    public final void K(boolean z10, int i10, Rect rect) {
        int i11 = this.f170094l;
        if (i11 != Integer.MIN_VALUE) {
            o(i11);
        }
        if (z10) {
            I(i10, rect);
        }
    }

    public final boolean V(int i10) {
        int i11;
        if ((!this.f170091i.isFocused() && !this.f170091i.requestFocus()) || (i11 = this.f170094l) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            o(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.f170094l = i10;
        Q(i10, true);
        W(i10, 8);
        return true;
    }

    public final boolean W(int i10, int i11) {
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f170090h.isEnabled() || (parent = this.f170091i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f170091i, q(i10, i11));
    }

    @Override // androidx.core.view.a
    public z b(View view) {
        if (this.f170092j == null) {
            this.f170092j = new c();
        }
        return this.f170092j;
    }

    public final boolean o(int i10) {
        if (this.f170094l != i10) {
            return false;
        }
        this.f170094l = Integer.MIN_VALUE;
        Q(i10, false);
        W(i10, 8);
        return true;
    }

    public final boolean v(MotionEvent motionEvent) {
        if (this.f170090h.isEnabled() && this.f170090h.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action != 10 || this.f170095m == Integer.MIN_VALUE) {
                    return false;
                }
                Y(Integer.MIN_VALUE);
                return true;
            }
            int iB = B(motionEvent.getX(), motionEvent.getY());
            Y(iB);
            if (iB != Integer.MIN_VALUE) {
                return true;
            }
        }
        return false;
    }

    public final int x() {
        return this.f170093k;
    }

    public AbstractC18058a(View view) {
        if (view != null) {
            this.f170091i = view;
            this.f170090h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    private static Rect D(View view, int i10, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 == 130) {
                        rect.set(0, -1, width, -1);
                        return rect;
                    }
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                rect.set(-1, 0, -1, height);
                return rect;
            }
            rect.set(0, height, width, height);
            return rect;
        }
        rect.set(width, 0, width, height);
        return rect;
    }

    private boolean I(int i10, Rect rect) {
        y yVarE;
        y yVar;
        o0<y> o0VarY = y();
        int i11 = this.f170094l;
        int i12 = Integer.MIN_VALUE;
        if (i11 == Integer.MIN_VALUE) {
            yVarE = null;
        } else {
            yVarE = o0VarY.e(i11);
        }
        y yVar2 = yVarE;
        boolean z10 = true;
        if (i10 != 1 && i10 != 2) {
            if (i10 != 17 && i10 != 33 && i10 != 66 && i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i13 = this.f170094l;
            if (i13 != Integer.MIN_VALUE) {
                z(i13, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.f170091i, i10, rect2);
            }
            yVar = (y) C18059b.c(o0VarY, f170085p, f170084o, yVar2, rect2, i10);
        } else {
            if (this.f170091i.getLayoutDirection() != 1) {
                z10 = false;
            }
            yVar = (y) C18059b.d(o0VarY, f170085p, f170084o, yVar2, i10, z10, false);
        }
        if (yVar != null) {
            i12 = o0VarY.i(o0VarY.g(yVar));
        }
        return V(i12);
    }

    private AccessibilityEvent r(int i10, int i11) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i11);
        y yVarJ = J(i10);
        accessibilityEventObtain.getText().add(yVarJ.C());
        accessibilityEventObtain.setContentDescription(yVarJ.t());
        accessibilityEventObtain.setScrollable(yVarJ.W());
        accessibilityEventObtain.setPassword(yVarJ.V());
        accessibilityEventObtain.setEnabled(yVarJ.O());
        accessibilityEventObtain.setChecked(yVarJ.L());
        N(i10, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(yVarJ.q());
        C16592A.c(accessibilityEventObtain, this.f170091i, i10);
        accessibilityEventObtain.setPackageName(this.f170091i.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    private AccessibilityEvent s(int i10) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i10);
        this.f170091i.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    private y t(int i10) {
        boolean z10;
        y yVarB0 = y.b0();
        yVarB0.x0(true);
        yVarB0.z0(true);
        yVarB0.p0("android.view.View");
        Rect rect = f170083n;
        yVarB0.l0(rect);
        yVarB0.m0(rect);
        yVarB0.L0(this.f170091i);
        P(i10, yVarB0);
        if (yVarB0.C() == null && yVarB0.t() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        yVarB0.m(this.f170087e);
        yVarB0.n(this.f170086d);
        if (this.f170087e.equals(rect) && this.f170086d.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds or screen bounds in populateNodeForVirtualViewId()");
        }
        int iK = yVarB0.k();
        if ((iK & 64) == 0) {
            if ((iK & 128) == 0) {
                yVarB0.J0(this.f170091i.getContext().getPackageName());
                yVarB0.V0(this.f170091i, i10);
                if (this.f170093k == i10) {
                    yVarB0.i0(true);
                    yVarB0.a(128);
                } else {
                    yVarB0.i0(false);
                    yVarB0.a(64);
                }
                if (this.f170094l == i10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    yVarB0.a(2);
                } else if (yVarB0.Q()) {
                    yVarB0.a(1);
                }
                yVarB0.A0(z10);
                this.f170091i.getLocationOnScreen(this.f170089g);
                if (this.f170086d.equals(rect)) {
                    X(yVarB0, this.f170087e);
                    yVarB0.n(this.f170086d);
                }
                if (this.f170091i.getLocalVisibleRect(this.f170088f)) {
                    this.f170088f.offset(this.f170089g[0] - this.f170091i.getScrollX(), this.f170089g[1] - this.f170091i.getScrollY());
                    if (this.f170086d.intersect(this.f170088f)) {
                        yVarB0.m0(this.f170086d);
                        if (G(this.f170086d)) {
                            yVarB0.e1(true);
                        }
                    }
                }
                return yVarB0;
            }
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
    }

    private void z(int i10, Rect rect) {
        J(i10).n(rect);
    }

    public final void X(y yVar, Rect rect) {
        yVar.l0(rect);
        Rect rect2 = new Rect();
        rect2.set(rect);
        if (yVar.f157813b != -1) {
            y yVarB0 = y.b0();
            Rect rect3 = new Rect();
            for (int i10 = yVar.f157813b; i10 != -1; i10 = yVarB0.f157813b) {
                yVarB0.M0(this.f170091i, -1);
                yVarB0.l0(f170083n);
                P(i10, yVarB0);
                yVarB0.m(rect3);
                rect2.offset(rect3.left, rect3.top);
            }
            yVarB0.f0();
        }
        this.f170091i.getLocationOnScreen(this.f170089g);
        rect2.offset(this.f170089g[0] - this.f170091i.getScrollX(), this.f170089g[1] - this.f170091i.getScrollY());
        yVar.m0(rect2);
    }

    @Override // androidx.core.view.a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        M(accessibilityEvent);
    }

    @Override // androidx.core.view.a
    public void g(View view, y yVar) {
        super.g(view, yVar);
        O(yVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean w(android.view.KeyEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getAction()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L5d
            int r0 = r7.getKeyCode()
            r3 = 61
            r4 = 0
            if (r0 == r3) goto L46
            r3 = 66
            if (r0 == r3) goto L36
            switch(r0) {
                case 19: goto L19;
                case 20: goto L19;
                case 21: goto L19;
                case 22: goto L19;
                case 23: goto L36;
                default: goto L18;
            }
        L18:
            goto L5d
        L19:
            boolean r3 = r7.hasNoModifiers()
            if (r3 == 0) goto L5d
            int r0 = H(r0)
            int r7 = r7.getRepeatCount()
            int r7 = r7 + r2
            r3 = r1
        L29:
            if (r1 >= r7) goto L35
            boolean r5 = r6.I(r0, r4)
            if (r5 == 0) goto L35
            int r1 = r1 + 1
            r3 = r2
            goto L29
        L35:
            return r3
        L36:
            boolean r0 = r7.hasNoModifiers()
            if (r0 == 0) goto L5d
            int r7 = r7.getRepeatCount()
            if (r7 != 0) goto L5d
            r6.p()
            return r2
        L46:
            boolean r0 = r7.hasNoModifiers()
            if (r0 == 0) goto L52
            r7 = 2
            boolean r7 = r6.I(r7, r4)
            return r7
        L52:
            boolean r7 = r7.hasModifiers(r2)
            if (r7 == 0) goto L5d
            boolean r7 = r6.I(r2, r4)
            return r7
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.AbstractC18058a.w(android.view.KeyEvent):boolean");
    }
}
