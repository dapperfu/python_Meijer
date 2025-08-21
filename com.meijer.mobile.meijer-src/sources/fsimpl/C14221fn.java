package fsimpl;

import android.content.Context;
import com.fullstory.util.Log;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: fsimpl.fn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14221fn {

    /* renamed from: b, reason: collision with root package name */
    private static AbstractC14222fo f133519b;

    /* renamed from: a, reason: collision with root package name */
    static final SecureRandom f133518a = new SecureRandom();

    /* renamed from: c, reason: collision with root package name */
    private static final CountDownLatch f133520c = new CountDownLatch(1);

    public static AbstractC14222fo a() {
        try {
            if (!f133520c.await(5L, TimeUnit.SECONDS)) {
                Log.e("Timed out waiting to initialize encryption");
            }
        } catch (InterruptedException e10) {
            Log.e("Interrupted waiting to initialize encryption", e10);
        }
        return f133519b;
    }

    private static void a(Context context, KeyStore keyStore) {
        f133519b = C14223fp.c(keyStore);
    }

    private static void a(KeyStore keyStore) {
        C14223fp.a(keyStore);
    }

    public static synchronized boolean a(Context context) {
        if (f133520c.getCount() == 1) {
            b(context);
        }
        return f133519b != null;
    }

    private static void b(Context context) {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            try {
                a(context, keyStore);
            } catch (UnrecoverableKeyException e10) {
                Log.logAlways("Attempting to recover from key exception");
                Log.e("Attempting to recover from key exception", e10);
                a(keyStore);
                a(context, keyStore);
            }
            if (f133519b != null) {
                Log.d("Successfully initialized encryption");
            }
        } finally {
            try {
            } finally {
            }
        }
    }
}
