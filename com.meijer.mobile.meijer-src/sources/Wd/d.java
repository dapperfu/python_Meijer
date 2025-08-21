package Wd;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.fullstory.FS;

/* loaded from: classes6.dex */
public class d {
    public static int a(@RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (Log.isLoggable("Vision", 3)) {
            return FS.log_d("Vision", String.format(str, objArr));
        }
        return 0;
    }

    public static int b(@RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (Log.isLoggable("Vision", 6)) {
            return FS.log_e("Vision", String.format(str, objArr));
        }
        return 0;
    }

    @SuppressLint({"LogTagMismatch"})
    public static int c(@RecentlyNonNull Throwable th2, @RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (!Log.isLoggable("Vision", 6)) {
            return 0;
        }
        if (Log.isLoggable("Vision", 3)) {
            return FS.log_e("Vision", String.format(str, objArr), th2);
        }
        String str2 = String.format(str, objArr);
        String strValueOf = String.valueOf(th2);
        StringBuilder sb2 = new StringBuilder(str2.length() + 2 + strValueOf.length());
        sb2.append(str2);
        sb2.append(": ");
        sb2.append(strValueOf);
        return FS.log_e("Vision", sb2.toString());
    }

    public static int d(@RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (Log.isLoggable("Vision", 4)) {
            return FS.log_i("Vision", String.format(str, objArr));
        }
        return 0;
    }

    public static int e(@RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (Log.isLoggable("Vision", 2)) {
            return FS.log_v("Vision", String.format(str, objArr));
        }
        return 0;
    }
}
