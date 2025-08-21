package ed;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.r;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* renamed from: ed.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C13789a {

    /* renamed from: c, reason: collision with root package name */
    private static final Lock f130073c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    private static C13789a f130074d;

    /* renamed from: a, reason: collision with root package name */
    private final Lock f130075a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f130076b;

    private static final String d(String str, String str2) {
        return str + ":" + str2;
    }

    public GoogleSignInAccount b() {
        String strC;
        String strC2 = c("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strC2) && (strC = c(d("googleSignInAccount", strC2))) != null) {
            try {
                return GoogleSignInAccount.a2(strC);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    protected final String c(String str) {
        this.f130075a.lock();
        try {
            return this.f130076b.getString(str, null);
        } finally {
            this.f130075a.unlock();
        }
    }

    C13789a(Context context) {
        this.f130076b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static C13789a a(Context context) {
        r.l(context);
        Lock lock = f130073c;
        lock.lock();
        try {
            if (f130074d == null) {
                f130074d = new C13789a(context.getApplicationContext());
            }
            C13789a c13789a = f130074d;
            lock.unlock();
            return c13789a;
        } catch (Throwable th2) {
            f130073c.unlock();
            throw th2;
        }
    }
}
