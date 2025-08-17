package Pc;

import android.view.View;
import android.view.ViewParent;

/* renamed from: Pc.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4562d {
    public static boolean a(View view) {
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getClass().getName().startsWith("androidx.compose.ui")) {
                return true;
            }
        }
        return false;
    }
}
