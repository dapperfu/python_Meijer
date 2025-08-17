package fsimpl;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: fsimpl.p, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C14118p extends C14119q {
    private C14118p(AtomicReference atomicReference, View.AccessibilityDelegate accessibilityDelegate) {
        super(atomicReference, accessibilityDelegate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ AccessibilityNodeInfo a(View view) {
        return super.createAccessibilityNodeInfo(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ AccessibilityNodeInfo b(View view) {
        View.AccessibilityDelegate accessibilityDelegateA = a();
        return accessibilityDelegateA != null ? accessibilityDelegateA.createAccessibilityNodeInfo(view) : super.createAccessibilityNodeInfo(view);
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(final View view) {
        return (AccessibilityNodeInfo) handleValueEvent("createAccessibilityNodeInfo", new InterfaceC14121s() { // from class: fsimpl.p$$ExternalSyntheticLambda0
            @Override // fsimpl.InterfaceC14121s
            public final Object run() {
                return this.f$0.b(view);
            }
        }, new InterfaceC14121s() { // from class: fsimpl.p$$ExternalSyntheticLambda1
            @Override // fsimpl.InterfaceC14121s
            public final Object run() {
                return this.f$0.a(view);
            }
        }, view);
    }
}
