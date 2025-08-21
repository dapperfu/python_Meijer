package x6;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.util.Base64;

/* renamed from: x6.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C18108c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f170514a = "c";

    public static String b(Application application) {
        try {
            Context baseContext = application.getBaseContext();
            if (baseContext == null) {
                r.d(f170514a, "Installation timestamp", new Throwable[0]);
                return "";
            }
            SharedPreferences sharedPreferences = baseContext.getSharedPreferences("com.akamai.botman.preferences", 0);
            if (sharedPreferences.getString("installation_Timestamp", "").isEmpty()) {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString("installation_Timestamp", Base64.encodeToString(String.valueOf(SystemClock.uptimeMillis()).getBytes(), 0));
                editorEdit.commit();
            }
            return new String(Base64.decode(sharedPreferences.getString("installation_Timestamp", "-1"), 0));
        } catch (Exception e10) {
            r.d(f170514a, e10.getMessage(), new Throwable[0]);
            return "-1";
        }
    }

    public static String a() {
        return String.valueOf(SystemClock.uptimeMillis());
    }
}
