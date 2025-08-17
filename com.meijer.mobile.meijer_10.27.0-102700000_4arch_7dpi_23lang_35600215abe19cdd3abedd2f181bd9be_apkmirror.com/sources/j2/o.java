package j2;

import android.content.Context;
import android.os.UserManager;

/* loaded from: classes.dex */
public class o {

    static class a {
        static boolean a(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    public static boolean a(Context context) {
        return a.a(context);
    }
}
