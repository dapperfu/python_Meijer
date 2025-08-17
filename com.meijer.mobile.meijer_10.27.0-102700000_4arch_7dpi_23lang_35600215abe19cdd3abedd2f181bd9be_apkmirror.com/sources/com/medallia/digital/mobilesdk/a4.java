package com.medallia.digital.mobilesdk;

import android.util.Log;
import com.fullstory.FS;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes7.dex */
final class a4 implements m8 {

    /* renamed from: d, reason: collision with root package name */
    private static final String f91605d = "com.medallia.digital";

    /* renamed from: e, reason: collision with root package name */
    private static final int f91606e = 3;

    /* renamed from: f, reason: collision with root package name */
    protected static a4 f91607f;

    /* renamed from: c, reason: collision with root package name */
    private b f91610c;

    /* renamed from: b, reason: collision with root package name */
    private MDLogLevel f91609b = MDLogLevel.OFF;

    /* renamed from: a, reason: collision with root package name */
    private final SimpleDateFormat f91608a = new SimpleDateFormat("dd-MM HH:mm:ss.SSS", Locale.US);

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f91611a;

        static {
            int[] iArr = new int[MDLogLevel.values().length];
            f91611a = iArr;
            try {
                iArr[MDLogLevel.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f91611a[MDLogLevel.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f91611a[MDLogLevel.WARN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f91611a[MDLogLevel.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f91611a[MDLogLevel.FATAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    protected interface b {
        void a(String str);
    }

    private a4() {
    }

    protected static a4 a() {
        if (f91607f == null) {
            f91607f = new a4();
        }
        return f91607f;
    }

    private void c(MDLogLevel mDLogLevel, String str) {
        int i10 = a.f91611a[mDLogLevel.ordinal()];
        if (i10 == 1) {
            FS.log_d(f91605d, str);
            return;
        }
        if (i10 == 2) {
            FS.log_i(f91605d, str);
            return;
        }
        if (i10 == 3) {
            FS.log_w(f91605d, str);
        } else if (i10 == 4) {
            FS.log_e(f91605d, str);
        } else {
            if (i10 != 5) {
                return;
            }
            Log.wtf(f91605d, str);
        }
    }

    public static void d(String str) {
        a().b(MDLogLevel.FATAL, str);
    }

    public static void e(String str) {
        a().b(MDLogLevel.INFO, str);
    }

    public static void f(String str) {
        a().b(MDLogLevel.WARN, str);
    }

    protected MDLogLevel b() {
        return this.f91609b;
    }

    @Override // com.medallia.digital.mobilesdk.m8
    public void clearAndDisconnect() {
        a(a4.class.getSimpleName());
        f91607f = null;
    }

    private String a(MDLogLevel mDLogLevel, String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[3];
        return String.format(Locale.US, "%s [%s][%s][%s:%d]%s> %s", this.f91608a.format(new Date()), mDLogLevel.toString(), Thread.currentThread(), stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber()), stackTraceElement.getMethodName(), str);
    }

    private void b(MDLogLevel mDLogLevel, String str) {
        if (this.f91609b.equals(MDLogLevel.OFF) || this.f91609b.getLevel() < mDLogLevel.getLevel()) {
            return;
        }
        String strA = a(mDLogLevel, str);
        c(mDLogLevel, strA);
        b bVar = this.f91610c;
        if (bVar != null) {
            bVar.a(strA);
        }
    }

    public static void c(String str) {
        a().b(MDLogLevel.ERROR, str);
    }

    public static void b(String str) {
        a().b(MDLogLevel.DEBUG, str);
    }

    protected void a(MDLogLevel mDLogLevel) {
        this.f91609b = mDLogLevel;
    }

    protected void a(b bVar) {
        this.f91610c = bVar;
    }

    public static void a(String str) {
        a().b(MDLogLevel.DEBUG, "Clear and Disconnect - " + str);
    }
}
