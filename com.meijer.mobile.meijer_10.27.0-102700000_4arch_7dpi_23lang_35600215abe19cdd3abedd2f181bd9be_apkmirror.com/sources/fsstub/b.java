package fsstub;

import android.os.Build;
import com.fullstory.FSReason;
import com.fullstory.Reason;
import com.fullstory.instrumentation.CurrentPlatform;
import com.fullstory.instrumentation.InstrumentInjectorBridge;
import com.fullstory.util.Log;
import java.nio.ByteOrder;
import java.util.Locale;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f132389a = false;

    /* renamed from: b, reason: collision with root package name */
    public static FSReason f132390b;

    public static InstrumentInjectorBridge a() {
        if (b() && c()) {
            return d();
        }
        return null;
    }

    private static void a(int i10, String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        f132390b = new Reason(i10, str);
        Log.alwaysWarn(str);
    }

    private static void b(int i10, String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        f132390b = new Reason(i10, str);
        Log.e(str);
        f132389a = true;
    }

    private static boolean b() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 != CurrentPlatform.SDK_INT_FIXED) {
            a(Reason.OS_UNSUPPORTED_OTHER, "Not supported on this preview API version: %d preview %d", Integer.valueOf(i10), Integer.valueOf(Build.VERSION.PREVIEW_SDK_INT));
            return false;
        }
        if (i10 < 24) {
            a(Reason.OS_VERSION_TOO_LOW, "API Version %d lower than minimum supported version of %d", Integer.valueOf(i10), 24);
            return false;
        }
        if (i10 <= 36) {
            return true;
        }
        a(Reason.OS_VERSION_TOO_HIGH, "API Version %d greater than maximum supported version of %d", Integer.valueOf(i10), 36);
        return false;
    }

    private static boolean c() {
        if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
            return true;
        }
        a(Reason.ENDIANNESS_UNSUPPORTED, "Not supported on big endian devices", new Object[0]);
        return false;
    }

    private static InstrumentInjectorBridge d() {
        try {
            return (InstrumentInjectorBridge) Class.forName("com.fullstory.instrumentation.InstrumentInjectorBridgeImpl").newInstance();
        } catch (Throwable th2) {
            b(Reason.CLASS_LOAD_FAILURE, "Failed to load FS from the dex", new Object[0]);
            return null;
        }
    }
}
