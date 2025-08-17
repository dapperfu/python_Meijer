package androidx.core.view;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.List;
import q2.y;
import q2.z;

/* loaded from: classes.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static final View.AccessibilityDelegate f53913c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    private final View.AccessibilityDelegate f53914a;

    /* renamed from: b, reason: collision with root package name */
    private final View.AccessibilityDelegate f53915b;

    /* renamed from: androidx.core.view.a$a, reason: collision with other inner class name */
    static final class C1096a extends View.AccessibilityDelegate {

        /* renamed from: a, reason: collision with root package name */
        final a f53916a;

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f53916a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            z zVarB = this.f53916a.b(view);
            if (zVarB != null) {
                return (AccessibilityNodeProvider) zVarB.e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f53916a.f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f53916a.h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f53916a.i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f53916a.j(view, i10, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i10) {
            this.f53916a.l(view, i10);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f53916a.m(view, accessibilityEvent);
        }

        C1096a(a aVar) {
            this.f53916a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            y yVarG1 = y.g1(accessibilityNodeInfo);
            yVarG1.Q0(ViewCompat.V(view));
            yVarG1.B0(ViewCompat.Q(view));
            yVarG1.K0(ViewCompat.o(view));
            yVarG1.W0(ViewCompat.H(view));
            this.f53916a.g(view, yVarG1);
            yVarG1.f(accessibilityNodeInfo.getText(), view);
            List<y.a> listC = a.c(view);
            for (int i10 = 0; i10 < listC.size(); i10++) {
                yVarG1.b(listC.get(i10));
            }
        }
    }

    public a() {
        this(f53913c);
    }

    private boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpanArrR = y.r(view.createAccessibilityNodeInfo().getText());
            for (int i10 = 0; clickableSpanArrR != null && i10 < clickableSpanArrR.length; i10++) {
                if (clickableSpan.equals(clickableSpanArrR[i10])) {
                    return true;
                }
            }
        }
        return false;
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f53914a = accessibilityDelegate;
        this.f53915b = new C1096a(this);
    }

    static List<y.a> c(View view) {
        List<y.a> list = (List) view.getTag(Y1.e.f39978H);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    private boolean k(int i10, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(Y1.e.f39979I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i10)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f53914a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public z b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f53914a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new z(accessibilityNodeProvider);
        }
        return null;
    }

    View.AccessibilityDelegate d() {
        return this.f53915b;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f53914a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, y yVar) {
        this.f53914a.onInitializeAccessibilityNodeInfo(view, yVar.f1());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f53914a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f53914a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public void l(View view, int i10) {
        this.f53914a.sendAccessibilityEvent(view, i10);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f53914a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public boolean j(View view, int i10, Bundle bundle) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        List<y.a> listC = c(view);
        boolean zPerformAccessibilityAction = false;
        int i11 = 0;
        while (true) {
            if (i11 >= listC.size()) {
                break;
            }
            y.a aVar = listC.get(i11);
            if (aVar.b() == i10) {
                zPerformAccessibilityAction = aVar.d(view, bundle);
                break;
            }
            i11++;
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f53914a.performAccessibilityAction(view, i10, bundle);
        }
        if (!zPerformAccessibilityAction && i10 == Y1.e.f39991a && bundle != null) {
            return k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
        }
        return zPerformAccessibilityAction;
    }
}
