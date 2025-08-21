package z8;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import com.fullstory.FS;
import i8.x;
import j$.net.URLEncoder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

@SuppressLint({"SimpleDateFormat"})
/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static final String f172629a = x.f137411a + "Utility";

    /* renamed from: b, reason: collision with root package name */
    private static AtomicInteger f172630b = new AtomicInteger(1);

    /* renamed from: c, reason: collision with root package name */
    private static AtomicLong f172631c = new AtomicLong(0);

    public static int c(Context context) {
        ApplicationInfo applicationInfo;
        if (context == null) {
            return 0;
        }
        try {
            applicationInfo = Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(0L)) : context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
        } catch (Exception unused) {
            applicationInfo = null;
        }
        if (applicationInfo != null) {
            return applicationInfo.targetSdkVersion;
        }
        return 0;
    }

    private static String k(String str) {
        String[] strArrSplit;
        String str2;
        String str3;
        if (str != null && (strArrSplit = str.split(":")) != null && strArrSplit.length > 1 && (str2 = strArrSplit[0]) != null) {
            if (str2.startsWith("Processor")) {
                String str4 = strArrSplit[1];
                if (str4 == null) {
                    return null;
                }
                return str4.replaceAll(" Processor ", " ").trim();
            }
            if (!strArrSplit[0].startsWith("vendor_id") || (str3 = strArrSplit[1]) == null) {
                return null;
            }
            return str3.trim();
        }
        return null;
    }

    public static int l(String str, String str2, int i10, int i11, int i12) {
        return m(str, str2, i10, i11, i12, false);
    }

    public static void a(String str, String str2) {
        if (x.f137412b) {
            u(str, str2);
        }
    }

    public static void b(String str, String str2, Throwable th2) {
        if (x.f137412b) {
            v(str, str2, th2);
        }
    }

    public static String d() throws Throwable {
        InputStream inputStream;
        InputStream inputStream2;
        Process processStart;
        String[] strArrSplit;
        String str = "";
        Process process = null;
        inputStream = null;
        InputStream inputStream3 = null;
        Process process2 = null;
        try {
            try {
                processStart = new ProcessBuilder("/system/bin/cat", "/proc/cpuinfo").start();
            } catch (IOException unused) {
            }
        } catch (IOException unused2) {
            inputStream2 = null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
        try {
            inputStream3 = processStart.getInputStream();
            byte[] bArr = new byte[1024];
            String str2 = "";
            while (inputStream3.read(bArr) != -1) {
                str2 = str2 + new String(bArr).trim();
            }
            strArrSplit = str2.split("\n");
        } catch (IOException unused3) {
            inputStream2 = inputStream3;
            process2 = processStart;
            if (process2 != null) {
                process2.destroy();
            }
            if (inputStream2 != null) {
                inputStream2.close();
            }
            return str;
        } catch (Throwable th3) {
            th = th3;
            inputStream = inputStream3;
            process = processStart;
            if (process != null) {
                process.destroy();
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
        if (strArrSplit != null && strArrSplit.length >= 1) {
            int length = strArrSplit.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                String strK = k(strArrSplit[i10]);
                if (strK != null) {
                    str = strK;
                    break;
                }
                i10++;
            }
            processStart.destroy();
            inputStream3.close();
            return str;
        }
        processStart.destroy();
        try {
            inputStream3.close();
        } catch (IOException unused5) {
        }
        return "";
    }

    public static long e() {
        return Build.VERSION.SDK_INT >= 36 ? Thread.currentThread().threadId() : Thread.currentThread().getId();
    }

    public static int f() {
        return f172630b.getAndIncrement();
    }

    public static long g() {
        return f172631c.incrementAndGet();
    }

    public static long h(Thread thread) {
        return Build.VERSION.SDK_INT >= 36 ? thread.threadId() : thread.getId();
    }

    public static boolean j() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Process.isIsolated();
        }
        try {
            return ((Boolean) Process.class.getDeclaredMethod("isIsolated", null).invoke(null, null)).booleanValue();
        } catch (Exception e10) {
            if (!x.f137412b) {
                return true;
            }
            v(f172629a, "Error occurred determining process isolation state", e10);
            return true;
        }
    }

    public static int m(String str, String str2, int i10, int i11, int i12, boolean z10) throws NumberFormatException {
        if (str2 != null && !str2.isEmpty()) {
            try {
                int i13 = Integer.parseInt(str2);
                if (i13 < i10) {
                    if (x.f137412b) {
                        u(f172629a, String.format("%s value of %s is not within the range of %s and %s", str, str2, Integer.valueOf(i10), Integer.valueOf(i11)));
                    }
                    if (!z10) {
                        return i10;
                    }
                } else {
                    if (i13 <= i11) {
                        return i13;
                    }
                    if (x.f137412b) {
                        u(f172629a, String.format("%s value of %s is not within the range of %s and %s", str, str2, Integer.valueOf(i10), Integer.valueOf(i11)));
                    }
                    if (!z10) {
                        return i11;
                    }
                }
            } catch (NumberFormatException e10) {
                if (x.f137412b) {
                    x(f172629a, str, e10);
                }
            }
        }
        return i12;
    }

    public static Map<String, String> p(String str) {
        HashMap map = new HashMap();
        for (String str2 : str.split("&")) {
            String[] strArrSplit = str2.split("=");
            if (strArrSplit.length != 2) {
                return null;
            }
            map.put(strArrSplit[0], strArrSplit[1]);
        }
        return map;
    }

    public static byte[] q(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    public static void r() {
        f172630b.set(1);
    }

    public static String s(String str, int i10) {
        if (str == null) {
            return null;
        }
        return str.length() > i10 ? str.substring(0, i10) : str;
    }

    public static String t(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            if (x.f137412b) {
                w(f172629a, e10.toString());
            }
            return str.replaceAll("&", "%26").replaceAll("=", "%3D");
        }
    }

    public static void u(String str, String str2) {
        String str3 = i() + str2;
        int length = (str3.length() - 1) / 4000;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 * 4000;
            i10++;
            FS.log_d(str, str3.substring(i11, i10 * 4000));
        }
        FS.log_d(str, str3.substring(i10 * 4000));
    }

    public static void v(String str, String str2, Throwable th2) {
        FS.log_d(str, i() + str2, th2);
    }

    public static void w(String str, String str2) {
        FS.log_e(str, i() + str2);
    }

    public static void x(String str, String str2, Throwable th2) {
        FS.log_e(str, i() + str2, th2);
    }

    public static void y(String str, String str2) {
        FS.log_i(str, i() + str2);
    }

    public static void z(String str, String str2) {
        FS.log_w(str, i() + str2);
    }

    @SuppressLint({"DefaultLocale"})
    private static String i() {
        return String.format("#%d.", Long.valueOf(e()));
    }

    public static int n(Map<String, String> map, String str, int i10, int i11, int i12) {
        return l(str, map.get(str), i10, i11, i12);
    }

    public static int o(Map<String, String> map, String str, int i10, int i11, int i12, boolean z10) {
        return m(str, map.get(str), i10, i11, i12, z10);
    }
}
