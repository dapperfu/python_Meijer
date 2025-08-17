package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityManager;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/d0;", "", "<init>", "()V", "Landroid/view/accessibility/AccessibilityManager;", "accessibilityManager", "", "originalTimeout", "uiContentFlags", "a", "(Landroid/view/accessibility/AccessibilityManager;II)I", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5845d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C5845d0 f52066a = new C5845d0();

    private C5845d0() {
    }

    public final int a(AccessibilityManager accessibilityManager, int originalTimeout, int uiContentFlags) {
        return accessibilityManager.getRecommendedTimeoutMillis(originalTimeout, uiContentFlags);
    }
}
