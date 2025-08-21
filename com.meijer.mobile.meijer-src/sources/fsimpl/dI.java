package fsimpl;

import com.fullstory.instrumentation.Bootstrap;
import com.fullstory.util.Log;
import java.util.HashSet;

/* loaded from: classes15.dex */
public class dI {

    /* renamed from: a, reason: collision with root package name */
    private static final HashSet f133270a = new HashSet();

    public static void a(int i10, String str, Throwable th2) {
        Log.e(str, th2);
        C14232fy.a(th2);
        Bootstrap.fail(i10, str);
    }

    public static void a(String str, Throwable th2) {
        HashSet hashSet = f133270a;
        synchronized (hashSet) {
            if (hashSet.contains(str)) {
                return;
            }
            hashSet.add(str);
            Log.e(str, th2);
            C14232fy.a(th2);
        }
    }
}
