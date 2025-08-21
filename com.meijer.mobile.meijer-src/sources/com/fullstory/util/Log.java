package com.fullstory.util;

import com.fullstory.FS;

/* loaded from: classes.dex */
public class Log {
    private static FS.LogLevel FS_LEVEL = null;
    private static final FS.LogLevel FS_LEVEL_DEFAULT;
    private static FS.LogLevel LOGCAT_LEVEL = null;
    private static final FS.LogLevel LOGCAT_LEVEL_DEFAULT;
    public static final String TAG = "fullstory";
    public static boolean DISABLE_LOGGING = true;
    public static boolean API_TRACE = false;

    static {
        FS.LogLevel logLevel = FS.LogLevel.INFO;
        FS_LEVEL_DEFAULT = logLevel;
        FS.LogLevel logLevel2 = FS.LogLevel.OFF;
        LOGCAT_LEVEL_DEFAULT = logLevel2;
        FS_LEVEL = logLevel;
        LOGCAT_LEVEL = logLevel2;
    }

    private Log() {
    }

    public static int alwaysWarn(String str) {
        return android.util.Log.w(TAG, str);
    }

    public static int d(String str) {
        if (DISABLE_LOGGING) {
            return 0;
        }
        return android.util.Log.d(TAG, str);
    }

    public static int d(String str, Throwable th2) {
        if (DISABLE_LOGGING) {
            return 0;
        }
        return android.util.Log.d(TAG, str, th2);
    }

    public static int e(String str) {
        return android.util.Log.e(TAG, str);
    }

    public static int e(String str, Throwable th2) {
        return android.util.Log.e(TAG, str, th2);
    }

    public static FS.LogLevel getLevel() {
        return FS_LEVEL;
    }

    public static FS.LogLevel getLogcatLevel() {
        return LOGCAT_LEVEL;
    }

    public static int i(String str) {
        if (DISABLE_LOGGING) {
            return 0;
        }
        return android.util.Log.i(TAG, str);
    }

    public static int i(String str, Throwable th2) {
        if (DISABLE_LOGGING) {
            return 0;
        }
        return android.util.Log.i(TAG, str, th2);
    }

    private static boolean isLevelLoggable(FS.LogLevel logLevel, FS.LogLevel logLevel2) {
        int iOrdinal = logLevel.ordinal();
        return iOrdinal != 0 && logLevel2.ordinal() >= iOrdinal;
    }

    public static boolean isLogcatLoggable(FS.LogLevel logLevel) {
        return isLevelLoggable(LOGCAT_LEVEL, logLevel);
    }

    public static boolean isLoggable(FS.LogLevel logLevel) {
        return isLevelLoggable(FS_LEVEL, logLevel);
    }

    public static int logAlways(String str) {
        return android.util.Log.i(TAG, str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.fullstory.FS.LogLevel parseLevel(java.lang.String r1, com.fullstory.FS.LogLevel r2) {
        /*
            if (r1 == 0) goto L64
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L9
            goto L64
        L9:
            int r0 = r1.hashCode()
            switch(r0) {
                case 107332: goto L43;
                case 109935: goto L39;
                case 3237038: goto L2f;
                case 3641990: goto L25;
                case 95458899: goto L1b;
                case 96784904: goto L11;
                default: goto L10;
            }
        L10:
            goto L4d
        L11:
            java.lang.String r0 = "error"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L4d
            r1 = 4
            goto L4e
        L1b:
            java.lang.String r0 = "debug"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L4d
            r1 = 2
            goto L4e
        L25:
            java.lang.String r0 = "warn"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L4d
            r1 = 3
            goto L4e
        L2f:
            java.lang.String r0 = "info"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L4d
            r1 = 5
            goto L4e
        L39:
            java.lang.String r0 = "off"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L4d
            r1 = 0
            goto L4e
        L43:
            java.lang.String r0 = "log"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L4d
            r1 = 1
            goto L4e
        L4d:
            r1 = -1
        L4e:
            switch(r1) {
                case 0: goto L61;
                case 1: goto L5e;
                case 2: goto L5b;
                case 3: goto L58;
                case 4: goto L55;
                case 5: goto L52;
                default: goto L51;
            }
        L51:
            return r2
        L52:
            com.fullstory.FS$LogLevel r1 = com.fullstory.FS.LogLevel.INFO
            return r1
        L55:
            com.fullstory.FS$LogLevel r1 = com.fullstory.FS.LogLevel.ERROR
            return r1
        L58:
            com.fullstory.FS$LogLevel r1 = com.fullstory.FS.LogLevel.WARN
            return r1
        L5b:
            com.fullstory.FS$LogLevel r1 = com.fullstory.FS.LogLevel.DEBUG
            return r1
        L5e:
            com.fullstory.FS$LogLevel r1 = com.fullstory.FS.LogLevel.LOG
            return r1
        L61:
            com.fullstory.FS$LogLevel r1 = com.fullstory.FS.LogLevel.OFF
            return r1
        L64:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fullstory.util.Log.parseLevel(java.lang.String, com.fullstory.FS$LogLevel):com.fullstory.FS$LogLevel");
    }

    public static void printStackTrace(Throwable th2) {
        if (DISABLE_LOGGING) {
            return;
        }
        th2.printStackTrace();
    }

    public static void setLevel(String str) {
        FS_LEVEL = parseLevel(str, FS_LEVEL_DEFAULT);
    }

    public static void setLogcatLevel(String str) {
        LOGCAT_LEVEL = parseLevel(str, LOGCAT_LEVEL_DEFAULT);
    }

    public static int v(String str) {
        if (DISABLE_LOGGING) {
            return 0;
        }
        return android.util.Log.v(TAG, str);
    }

    public static int v(String str, Throwable th2) {
        if (DISABLE_LOGGING) {
            return 0;
        }
        return android.util.Log.v(TAG, str, th2);
    }

    public static int w(String str) {
        if (DISABLE_LOGGING) {
            return 0;
        }
        return android.util.Log.w(TAG, str);
    }

    public static int w(String str, Throwable th2) {
        if (DISABLE_LOGGING) {
            return 0;
        }
        return android.util.Log.w(TAG, str, th2);
    }

    public static int w(Throwable th2) {
        if (DISABLE_LOGGING) {
            return 0;
        }
        return android.util.Log.w(TAG, th2);
    }
}
