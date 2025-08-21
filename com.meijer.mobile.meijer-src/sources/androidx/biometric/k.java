package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;

/* loaded from: classes.dex */
class k {

    private static class a {
        static KeyguardManager a(Context context) {
            return (KeyguardManager) context.getSystemService(KeyguardManager.class);
        }

        static boolean b(KeyguardManager keyguardManager) {
            return keyguardManager.isDeviceSecure();
        }
    }

    static KeyguardManager a(Context context) {
        return a.a(context);
    }

    static boolean b(Context context) {
        KeyguardManager keyguardManagerA = a(context);
        if (keyguardManagerA == null) {
            return false;
        }
        return a.b(keyguardManagerA);
    }
}
