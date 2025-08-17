package fsimpl;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes14.dex */
public class dO {
    public static SharedPreferences a(Context context, String str) {
        return context.getSharedPreferences(c(context, str), 0);
    }

    public static String a(Context context, String str, String str2) {
        SharedPreferences sharedPreferencesA = a(context, str);
        if (sharedPreferencesA != null) {
            return sharedPreferencesA.getString(a(str2), null);
        }
        return null;
    }

    private static String a(String str) {
        return "fs" + str;
    }

    public static boolean a(Context context, String str, String str2, Boolean bool) {
        if (bool == null) {
            return d(context, str, str2);
        }
        SharedPreferences.Editor editorD = d(context, str);
        if (editorD == null) {
            return false;
        }
        editorD.putBoolean(a(str2), bool.booleanValue());
        editorD.commit();
        return true;
    }

    public static boolean a(Context context, String str, String str2, Long l10) {
        if (l10 == null) {
            return d(context, str, str2);
        }
        SharedPreferences.Editor editorD = d(context, str);
        if (editorD == null) {
            return false;
        }
        editorD.putLong(a(str2), l10.longValue());
        editorD.commit();
        return true;
    }

    public static boolean a(Context context, String str, String str2, String str3) {
        if (str3 == null || str3.isEmpty()) {
            return d(context, str, str2);
        }
        SharedPreferences.Editor editorD = d(context, str);
        if (editorD == null) {
            return false;
        }
        editorD.putString(a(str2), str3);
        editorD.commit();
        return true;
    }

    public static Boolean b(Context context, String str, String str2) {
        SharedPreferences sharedPreferencesA = a(context, str);
        if (sharedPreferencesA == null) {
            return null;
        }
        String strA = a(str2);
        if (sharedPreferencesA.contains(strA)) {
            return Boolean.valueOf(sharedPreferencesA.getBoolean(strA, false));
        }
        return null;
    }

    public static boolean b(Context context, String str) {
        return context.deleteSharedPreferences(c(context, str));
    }

    public static Long c(Context context, String str, String str2) {
        SharedPreferences sharedPreferencesA = a(context, str);
        if (sharedPreferencesA == null) {
            return null;
        }
        String strA = a(str2);
        if (sharedPreferencesA.contains(strA)) {
            return Long.valueOf(sharedPreferencesA.getLong(strA, 0L));
        }
        return null;
    }

    private static String c(Context context, String str) {
        return context.getBasePackageName() + "." + str;
    }

    private static SharedPreferences.Editor d(Context context, String str) {
        SharedPreferences sharedPreferencesA = a(context, str);
        if (sharedPreferencesA != null) {
            return sharedPreferencesA.edit();
        }
        return null;
    }

    public static boolean d(Context context, String str, String str2) {
        SharedPreferences.Editor editorD = d(context, str);
        if (editorD == null) {
            return false;
        }
        editorD.remove(a(str2));
        editorD.commit();
        return true;
    }
}
