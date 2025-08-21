package q2;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: q2.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C16592A {
    @Deprecated
    public static void a(AccessibilityRecord accessibilityRecord, int i10) {
        accessibilityRecord.setMaxScrollX(i10);
    }

    @Deprecated
    public static void b(AccessibilityRecord accessibilityRecord, int i10) {
        accessibilityRecord.setMaxScrollY(i10);
    }

    @Deprecated
    public static void c(AccessibilityRecord accessibilityRecord, View view, int i10) {
        accessibilityRecord.setSource(view, i10);
    }
}
