package y8;

import android.app.Application;
import android.os.Build;

/* renamed from: y8.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C18188a {
    String a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        try {
            return (String) Class.forName("android.app.ActivityThread").getMethod("currentProcessName", null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean b() {
        String strA = a();
        if (strA != null && strA.contains(":dynatrace_replay_service")) {
            return true;
        }
        return false;
    }
}
