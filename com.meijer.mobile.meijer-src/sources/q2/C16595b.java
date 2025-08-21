package q2;

import android.annotation.SuppressLint;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: q2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16595b {
    @SuppressLint({"WrongConstant"})
    @Deprecated
    public static int a(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    @Deprecated
    public static void b(AccessibilityEvent accessibilityEvent, int i10) {
        accessibilityEvent.setContentChangeTypes(i10);
    }
}
