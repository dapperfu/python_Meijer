package fsimpl;

import com.fullstory.instrumentation.frameworks.compose.FSComposeKeyboardTypeCompanion;
import com.fullstory.util.Log;

/* loaded from: classes14.dex */
public class bF {

    /* renamed from: a, reason: collision with root package name */
    public static final FSComposeKeyboardTypeCompanion f131763a;

    static {
        Object objA = fT.a(fT.a(fT.a("androidx.compose.ui.text.input.KeyboardType"), "Companion"), (Object) null);
        if (objA instanceof FSComposeKeyboardTypeCompanion) {
            f131763a = (FSComposeKeyboardTypeCompanion) objA;
        } else {
            Log.printStackTrace(new RuntimeException("Failed to load KeyboardType.Companion"));
            f131763a = null;
        }
    }
}
