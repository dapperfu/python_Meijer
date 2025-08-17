package w6;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;

/* renamed from: w6.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17788j {

    /* renamed from: c, reason: collision with root package name */
    private static final C17788j f165930c = new C17788j();

    /* renamed from: a, reason: collision with root package name */
    WeakReference<Context> f165931a = null;

    /* renamed from: b, reason: collision with root package name */
    String f165932b = null;

    /* renamed from: w6.j$a */
    final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C17788j.d(C17788j.this);
        }
    }

    /* renamed from: w6.j$b */
    final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C17788j.this.h();
        }
    }

    static /* synthetic */ void d(C17788j c17788j) {
        r.c("SensorDataCache", "Initializing cache", new Throwable[0]);
        c17788j.e();
    }

    private synchronized void e() {
        Context context = this.f165931a.get();
        if (context == null) {
            r.d("SensorDataCache", "loadData: Context is null", new Throwable[0]);
        } else {
            this.f165932b = context.getSharedPreferences("com.akamai.botman.preferences", 0).getString("sensor_data", null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void h() {
        Context context = this.f165931a.get();
        if (context == null) {
            r.d("SensorDataCache", "saveData: Context is null", new Throwable[0]);
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.akamai.botman.preferences", 0).edit();
        editorEdit.putString("sensor_data", this.f165932b);
        editorEdit.commit();
    }

    public final synchronized void c(String str) {
        Context context = this.f165931a.get();
        if (context == null) {
            r.d("SensorDataCache", "savePoWResponse: Context is null", new Throwable[0]);
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.akamai.botman.preferences", 0).edit();
        editorEdit.putString("pow_response", str);
        editorEdit.commit();
    }

    public final synchronized void f(String str) {
        Context context = this.f165931a.get();
        if (context == null) {
            r.d("SensorDataCache", "saveServerSignal: Context is null", new Throwable[0]);
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.akamai.botman.preferences", 0).edit();
        editorEdit.putString("ss_signal", str);
        editorEdit.commit();
    }

    public static C17788j a() {
        return f165930c;
    }

    public final void b(Context context) {
        this.f165931a = new WeakReference<>(context);
        new Thread(new a()).start();
    }
}
