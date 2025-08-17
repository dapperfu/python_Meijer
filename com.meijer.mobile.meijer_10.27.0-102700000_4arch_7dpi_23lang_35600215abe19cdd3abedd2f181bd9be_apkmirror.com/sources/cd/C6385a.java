package cd;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.r;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* renamed from: cd.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6385a {

    /* renamed from: c, reason: collision with root package name */
    private static final Lock f61691c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    private static C6385a f61692d;

    /* renamed from: a, reason: collision with root package name */
    private final Lock f61693a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f61694b;

    private static final String d(String str, String str2) {
        return str + ":" + str2;
    }

    public GoogleSignInAccount b() {
        String strC;
        String strC2 = c("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strC2) && (strC = c(d("googleSignInAccount", strC2))) != null) {
            try {
                return GoogleSignInAccount.b2(strC);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    protected final String c(String str) {
        this.f61693a.lock();
        try {
            return this.f61694b.getString(str, null);
        } finally {
            this.f61693a.unlock();
        }
    }

    C6385a(Context context) {
        this.f61694b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static C6385a a(Context context) {
        r.l(context);
        Lock lock = f61691c;
        lock.lock();
        try {
            if (f61692d == null) {
                f61692d = new C6385a(context.getApplicationContext());
            }
            C6385a c6385a = f61692d;
            lock.unlock();
            return c6385a;
        } catch (Throwable th2) {
            f61691c.unlock();
            throw th2;
        }
    }
}
