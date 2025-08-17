package xe;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.fullstory.FS;
import java.util.IllegalFormatException;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final String f169562a;

    private static String f(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e10) {
                FS.log_e("PlayCore", "Unable to format ".concat(str2), e10);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return str + " : " + str2;
    }

    public final int a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            return FS.log_d("PlayCore", f(this.f169562a, "Already connected to the service.", objArr));
        }
        return 0;
    }

    public final int b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return FS.log_e("PlayCore", f(this.f169562a, "Play Store app is either not installed or not the official version", objArr));
        }
        return 0;
    }

    public final int c(Throwable th2, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return FS.log_e("PlayCore", f(this.f169562a, str, objArr), th2);
        }
        return 0;
    }

    public final int d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return FS.log_i("PlayCore", f(this.f169562a, str, objArr));
        }
        return 0;
    }

    public final int e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return FS.log_w("PlayCore", f(this.f169562a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
        }
        return 0;
    }

    public i(String str) {
        this.f169562a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }
}
