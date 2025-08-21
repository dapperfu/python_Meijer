package d3;

import android.text.TextUtils;
import android.util.Log;
import com.fullstory.FS;
import java.net.UnknownHostException;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    private static int f127950b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f127951c = true;

    /* renamed from: a, reason: collision with root package name */
    private static final Object f127949a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static a f127952d = a.f127953a;

    public interface a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f127953a = new C2004a();

        void a(String str, String str2, Throwable th2);

        void b(String str, String str2, Throwable th2);

        void c(String str, String str2, Throwable th2);

        void d(String str, String str2, Throwable th2);

        /* renamed from: d3.r$a$a, reason: collision with other inner class name */
        class C2004a implements a {
            C2004a() {
            }

            @Override // d3.r.a
            public void a(String str, String str2, Throwable th2) {
                FS.log_d(str, r.a(str2, th2));
            }

            @Override // d3.r.a
            public void b(String str, String str2, Throwable th2) {
                FS.log_w(str, r.a(str2, th2));
            }

            @Override // d3.r.a
            public void c(String str, String str2, Throwable th2) {
                FS.log_e(str, r.a(str2, th2));
            }

            @Override // d3.r.a
            public void d(String str, String str2, Throwable th2) {
                FS.log_i(str, r.a(str2, th2));
            }
        }
    }

    public static void b(String str, String str2) {
        synchronized (f127949a) {
            try {
                if (f127950b == 0) {
                    f127952d.a(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void c(String str, String str2, Throwable th2) {
        synchronized (f127949a) {
            try {
                if (f127950b == 0) {
                    f127952d.a(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static void d(String str, String str2) {
        synchronized (f127949a) {
            try {
                if (f127950b <= 3) {
                    f127952d.c(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void e(String str, String str2, Throwable th2) {
        synchronized (f127949a) {
            try {
                if (f127950b <= 3) {
                    f127952d.c(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static String f(Throwable th2) {
        if (th2 == null) {
            return null;
        }
        synchronized (f127949a) {
            try {
                if (h(th2)) {
                    return "UnknownHostException (no network)";
                }
                if (f127951c) {
                    return Log.getStackTraceString(th2).trim().replace("\t", "    ");
                }
                return th2.getMessage();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static void g(String str, String str2) {
        synchronized (f127949a) {
            try {
                if (f127950b <= 1) {
                    f127952d.d(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static boolean h(Throwable th2) {
        while (th2 != null) {
            if (th2 instanceof UnknownHostException) {
                return true;
            }
            th2 = th2.getCause();
        }
        return false;
    }

    public static void i(String str, String str2) {
        synchronized (f127949a) {
            try {
                if (f127950b <= 2) {
                    f127952d.b(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void j(String str, String str2, Throwable th2) {
        synchronized (f127949a) {
            try {
                if (f127950b <= 2) {
                    f127952d.b(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static String a(String str, Throwable th2) {
        String strF = f(th2);
        if (!TextUtils.isEmpty(strF)) {
            return str + "\n  " + strF.replace("\n", "\n  ") + '\n';
        }
        return str;
    }
}
