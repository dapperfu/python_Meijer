package Z1;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import androidx.core.app.q;
import b2.C6327h;
import com.fullstory.FS;
import j2.C14927g;
import java.io.File;
import java.util.concurrent.Executor;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f43584a = new Object();

    static class d {
        static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
            return ((i10 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i10 & 1) : context.registerReceiver(broadcastReceiver, intentFilter, b.k(context), handler);
        }

        static ComponentName b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    public static Intent l(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i10) {
        return m(context, broadcastReceiver, intentFilter, null, null, i10);
    }

    static class a {
        static Drawable a(Context context, int i10) {
            return FS.Resources_getDrawable(context, i10);
        }

        static File b(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* renamed from: Z1.b$b, reason: collision with other inner class name */
    static class C0921b {
        static int a(Context context, int i10) {
            return context.getColor(i10);
        }

        static <T> T b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }
    }

    static class c {
        static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }
    }

    static class e {
        static Executor a(Context context) {
            return context.getMainExecutor();
        }
    }

    static class f {
        static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i10);
        }
    }

    public static int a(Context context, String str) {
        o2.c.d(str, "permission must be non-null");
        return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : q.f(context).a() ? 0 : -1;
    }

    public static Executor h(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? e.a(context) : C14927g.a(new Handler(context.getMainLooper()));
    }

    static String k(Context context) {
        String str = context.getApplicationContext().getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (Z1.e.c(context, str) == 0) {
            return str;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            str = context.getOpPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
            if (Z1.e.c(context, str) == 0) {
                return str;
            }
        }
        throw new RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    public static Intent m(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
        int i11 = i10 & 1;
        if (i11 != 0 && (i10 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i11 != 0) {
            i10 |= 2;
        }
        int i12 = i10;
        int i13 = i12 & 2;
        if (i13 == 0 && (i12 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i13 != 0 && (i12 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        int i14 = Build.VERSION.SDK_INT;
        return i14 >= 33 ? f.a(context, broadcastReceiver, intentFilter, str, handler, i12) : i14 >= 26 ? d.a(context, broadcastReceiver, intentFilter, str, handler, i12) : ((i12 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler) : context.registerReceiver(broadcastReceiver, intentFilter, k(context), handler);
    }

    public static void p(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            d.b(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static Context b(Context context) {
        return c.a(context);
    }

    public static int c(Context context, int i10) {
        return C0921b.a(context, i10);
    }

    public static ColorStateList d(Context context, int i10) {
        return C6327h.e(context.getResources(), i10, context.getTheme());
    }

    public static Drawable e(Context context, int i10) {
        return a.a(context, i10);
    }

    @Deprecated
    public static File[] f(Context context) {
        return context.getExternalCacheDirs();
    }

    @Deprecated
    public static File[] g(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    public static File i(Context context) {
        return a.b(context);
    }

    public static <T> T j(Context context, Class<T> cls) {
        return (T) C0921b.b(context, cls);
    }

    public static boolean n(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }

    @Deprecated
    public static void o(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }
}
