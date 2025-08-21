package Sa;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* loaded from: classes4.dex */
public class a extends d {
    public boolean a(Context context) {
        if (context == null) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }
}
