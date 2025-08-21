package fsimpl;

import com.fullstory.instrumentation.frameworks.compose.FSComposeKeyboardTypeCompanion;
import com.fullstory.util.Log;

/* loaded from: classes15.dex */
public class bF {

    /* renamed from: a, reason: collision with root package name */
    public static final FSComposeKeyboardTypeCompanion f133013a;

    static {
        Object objA = fT.a(fT.a(fT.a("androidx.compose.ui.text.input.KeyboardType"), "Companion"), (Object) null);
        if (objA instanceof FSComposeKeyboardTypeCompanion) {
            f133013a = (FSComposeKeyboardTypeCompanion) objA;
        } else {
            Log.printStackTrace(new RuntimeException("Failed to load KeyboardType.Companion"));
            f133013a = null;
        }
    }
}
