package fsimpl;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.fullstory.instrumentation.CurrentPlatform;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: fsimpl.n, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC14241n extends View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f133611a;

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f133612b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference f133613c;

    /* renamed from: d, reason: collision with root package name */
    private final View.AccessibilityDelegate f133614d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f133615e;

    static {
        boolean z10 = true;
        f133611a = Build.VERSION.SDK_INT >= 31;
        if (CurrentPlatform.TARGET_SDK != -1 && CurrentPlatform.TARGET_SDK < 31) {
            z10 = false;
        }
        f133612b = z10;
    }

    private AbstractC14241n(AtomicReference atomicReference, View.AccessibilityDelegate accessibilityDelegate) {
        this.f133615e = new HashMap();
        this.f133613c = atomicReference;
        this.f133614d = accessibilityDelegate;
    }

    private static C14245r a(String str) {
        return new C14245r(Thread.currentThread().getId(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean a(View view, int i10, Bundle bundle) {
        View.AccessibilityDelegate accessibilityDelegateA = a();
        return Boolean.valueOf(accessibilityDelegateA != null ? accessibilityDelegateA.performAccessibilityAction(view, i10, bundle) : super.performAccessibilityAction(view, i10, bundle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        View.AccessibilityDelegate accessibilityDelegateA = a();
        return Boolean.valueOf(accessibilityDelegateA != null ? accessibilityDelegateA.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i10, View view) {
        G g10;
        if (i10 == 1) {
            a(view);
        } else if (i10 == 2 && (g10 = (G) this.f133613c.get()) != null) {
            g10.c(view);
        }
        View.AccessibilityDelegate accessibilityDelegateA = a();
        if (accessibilityDelegateA != null) {
            accessibilityDelegateA.sendAccessibilityEvent(view, i10);
        } else {
            super.sendAccessibilityEvent(view, i10);
        }
    }

    private void a(View view) {
        G g10 = (G) this.f133613c.get();
        if (g10 != null) {
            if (B.a(view)) {
                g10.a(view);
            } else {
                g10.b(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, AccessibilityEvent accessibilityEvent) {
        View.AccessibilityDelegate accessibilityDelegateA = a();
        if (accessibilityDelegateA != null) {
            accessibilityDelegateA.onInitializeAccessibilityEvent(view, accessibilityEvent);
        } else {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        View.AccessibilityDelegate accessibilityDelegateA = a();
        if (accessibilityDelegateA != null) {
            accessibilityDelegateA.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        } else {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        View.AccessibilityDelegate accessibilityDelegateA = a();
        if (accessibilityDelegateA != null) {
            accessibilityDelegateA.addExtraDataToAccessibilityNodeInfo(view, accessibilityNodeInfo, str, bundle);
        } else {
            super.addExtraDataToAccessibilityNodeInfo(view, accessibilityNodeInfo, str, bundle);
        }
    }

    private synchronized void a(C14245r c14245r) {
        this.f133615e.remove(c14245r);
    }

    private synchronized boolean a(C14245r c14245r, Object[] objArr) {
        Object[] objArr2 = (Object[]) this.f133615e.put(c14245r, objArr);
        if (objArr2 != null && objArr2.length == objArr.length) {
            for (int i10 = 0; i10 < objArr.length; i10++) {
                if (!fu$$ExternalSyntheticBackport0.m(objArr[i10], objArr2[i10])) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ AccessibilityNodeProvider b(View view) {
        View.AccessibilityDelegate accessibilityDelegateA = a();
        if (accessibilityDelegateA != null) {
            return accessibilityDelegateA.getAccessibilityNodeProvider(view);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean b() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view, AccessibilityEvent accessibilityEvent) {
        View.AccessibilityDelegate accessibilityDelegateA = a();
        if (accessibilityDelegateA != null) {
            accessibilityDelegateA.onPopulateAccessibilityEvent(view, accessibilityEvent);
        } else {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean c() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean c(View view, AccessibilityEvent accessibilityEvent) {
        View.AccessibilityDelegate accessibilityDelegateA = a();
        return Boolean.valueOf(accessibilityDelegateA != null ? accessibilityDelegateA.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent));
    }

    public static AbstractC14241n create(AtomicReference atomicReference, View.AccessibilityDelegate accessibilityDelegate) {
        C14242o c14242o = null;
        return (f133611a && f133612b) ? new C14244q(atomicReference, accessibilityDelegate) : new C14243p(atomicReference, accessibilityDelegate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean d() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view, AccessibilityEvent accessibilityEvent) {
        View.AccessibilityDelegate accessibilityDelegateA = a();
        if (accessibilityDelegateA != null) {
            accessibilityDelegateA.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        } else {
            super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    synchronized View.AccessibilityDelegate a() {
        return this.f133614d;
    }

    @Override // android.view.View.AccessibilityDelegate
    public void addExtraDataToAccessibilityNodeInfo(final View view, final AccessibilityNodeInfo accessibilityNodeInfo, final String str, final Bundle bundle) {
        handleEvent("addExtraDataToAccessibilityNodeInfo", new Runnable() { // from class: fsimpl.n$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(view, accessibilityNodeInfo, str, bundle);
            }
        }, view, accessibilityNodeInfo, str, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean dispatchPopulateAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
        return ((Boolean) handleValueEvent("dispatchPopulateAccessibilityEvent", new InterfaceC14246s() { // from class: fsimpl.n$$ExternalSyntheticLambda10
            @Override // fsimpl.InterfaceC14246s
            public final Object run() {
                return this.f$0.c(view, accessibilityEvent);
            }
        }, new InterfaceC14246s() { // from class: fsimpl.n$$ExternalSyntheticLambda11
            @Override // fsimpl.InterfaceC14246s
            public final Object run() {
                return AbstractC14241n.c();
            }
        }, view, accessibilityEvent)).booleanValue();
    }

    @Override // android.view.View.AccessibilityDelegate
    public AccessibilityNodeProvider getAccessibilityNodeProvider(final View view) {
        return (AccessibilityNodeProvider) handleValueEvent("getAccessibilityNodeProvider", new InterfaceC14246s() { // from class: fsimpl.n$$ExternalSyntheticLambda0
            @Override // fsimpl.InterfaceC14246s
            public final Object run() {
                return this.f$0.b(view);
            }
        }, null, view);
    }

    protected void handleEvent(String str, Runnable runnable, Object... objArr) {
        C14245r c14245rA = a(str);
        try {
            if (a(c14245rA, objArr)) {
                runnable.run();
            }
        } finally {
            a(c14245rA);
        }
    }

    protected Object handleValueEvent(String str, InterfaceC14246s interfaceC14246s, InterfaceC14246s interfaceC14246s2, Object... objArr) {
        C14245r c14245rA = a(str);
        try {
            return a(c14245rA, objArr) ? interfaceC14246s.run() : interfaceC14246s2.run();
        } finally {
            a(c14245rA);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
        handleEvent("onInitializeAccessibilityEvent", new Runnable() { // from class: fsimpl.n$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(view, accessibilityEvent);
            }
        }, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(final View view, final AccessibilityNodeInfo accessibilityNodeInfo) {
        handleEvent("onInitializeAccessibilityNodeInfo", new Runnable() { // from class: fsimpl.n$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(view, accessibilityNodeInfo);
            }
        }, view, accessibilityNodeInfo);
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onPopulateAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
        handleEvent("onPopulateAccessibilityEvent", new Runnable() { // from class: fsimpl.n$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(view, accessibilityEvent);
            }
        }, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean onRequestSendAccessibilityEvent(final ViewGroup viewGroup, final View view, final AccessibilityEvent accessibilityEvent) {
        return ((Boolean) handleValueEvent("onRequestSendAccessibilityEvent", new InterfaceC14246s() { // from class: fsimpl.n$$ExternalSyntheticLambda8
            @Override // fsimpl.InterfaceC14246s
            public final Object run() {
                return this.f$0.a(viewGroup, view, accessibilityEvent);
            }
        }, new InterfaceC14246s() { // from class: fsimpl.n$$ExternalSyntheticLambda9
            @Override // fsimpl.InterfaceC14246s
            public final Object run() {
                return AbstractC14241n.b();
            }
        }, viewGroup, view, accessibilityEvent)).booleanValue();
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean performAccessibilityAction(final View view, final int i10, final Bundle bundle) {
        return ((Boolean) handleValueEvent("performAccessibilityAction", new InterfaceC14246s() { // from class: fsimpl.n$$ExternalSyntheticLambda3
            @Override // fsimpl.InterfaceC14246s
            public final Object run() {
                return this.f$0.a(view, i10, bundle);
            }
        }, new InterfaceC14246s() { // from class: fsimpl.n$$ExternalSyntheticLambda4
            @Override // fsimpl.InterfaceC14246s
            public final Object run() {
                return AbstractC14241n.d();
            }
        }, view, Integer.valueOf(i10), bundle)).booleanValue();
    }

    @Override // android.view.View.AccessibilityDelegate
    public void sendAccessibilityEvent(final View view, final int i10) {
        handleEvent("sendAccessibilityEvent", new Runnable() { // from class: fsimpl.n$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(i10, view);
            }
        }, view, Integer.valueOf(i10));
    }

    @Override // android.view.View.AccessibilityDelegate
    public void sendAccessibilityEventUnchecked(final View view, final AccessibilityEvent accessibilityEvent) {
        handleEvent("sendAccessibilityEventUnchecked", new Runnable() { // from class: fsimpl.n$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.d(view, accessibilityEvent);
            }
        }, view, accessibilityEvent);
    }
}
