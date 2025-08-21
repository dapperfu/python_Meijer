package Wf;

import com.fullstory.FS;

/* loaded from: classes8.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    private static c f41023a;

    public static synchronized c c() {
        try {
            if (f41023a == null) {
                f41023a = new c();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f41023a;
    }

    void a(String str) {
        FS.log_d("FirebasePerformance", str);
    }

    void b(String str) {
        FS.log_e("FirebasePerformance", str);
    }

    void d(String str) {
        FS.log_i("FirebasePerformance", str);
    }

    void e(String str) {
        FS.log_w("FirebasePerformance", str);
    }

    private c() {
    }
}
