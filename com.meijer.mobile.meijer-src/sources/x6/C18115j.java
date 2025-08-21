package x6;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;

/* renamed from: x6.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18115j {

    /* renamed from: c, reason: collision with root package name */
    private static final C18115j f170575c = new C18115j();

    /* renamed from: a, reason: collision with root package name */
    WeakReference<Context> f170576a = null;

    /* renamed from: b, reason: collision with root package name */
    String f170577b = null;

    /* renamed from: x6.j$a */
    final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C18115j.d(C18115j.this);
        }
    }

    /* renamed from: x6.j$b */
    final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C18115j.this.h();
        }
    }

    static /* synthetic */ void d(C18115j c18115j) {
        r.c("SensorDataCache", "Initializing cache", new Throwable[0]);
        c18115j.e();
    }

    private synchronized void e() {
        Context context = this.f170576a.get();
        if (context == null) {
            r.d("SensorDataCache", "loadData: Context is null", new Throwable[0]);
        } else {
            this.f170577b = context.getSharedPreferences("com.akamai.botman.preferences", 0).getString("sensor_data", null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void h() {
        Context context = this.f170576a.get();
        if (context == null) {
            r.d("SensorDataCache", "saveData: Context is null", new Throwable[0]);
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.akamai.botman.preferences", 0).edit();
        editorEdit.putString("sensor_data", this.f170577b);
        editorEdit.commit();
    }

    public final synchronized void c(String str) {
        Context context = this.f170576a.get();
        if (context == null) {
            r.d("SensorDataCache", "savePoWResponse: Context is null", new Throwable[0]);
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.akamai.botman.preferences", 0).edit();
        editorEdit.putString("pow_response", str);
        editorEdit.commit();
    }

    public final synchronized void f(String str) {
        Context context = this.f170576a.get();
        if (context == null) {
            r.d("SensorDataCache", "saveServerSignal: Context is null", new Throwable[0]);
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.akamai.botman.preferences", 0).edit();
        editorEdit.putString("ss_signal", str);
        editorEdit.commit();
    }

    public static C18115j a() {
        return f170575c;
    }

    public final void b(Context context) {
        this.f170576a = new WeakReference<>(context);
        new Thread(new a()).start();
    }
}
