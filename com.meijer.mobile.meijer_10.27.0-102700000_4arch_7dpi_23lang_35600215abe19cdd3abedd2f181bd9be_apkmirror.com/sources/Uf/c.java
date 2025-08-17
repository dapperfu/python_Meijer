package Uf;

import com.fullstory.FS;

/* loaded from: classes7.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    private static c f35998a;

    public static synchronized c c() {
        try {
            if (f35998a == null) {
                f35998a = new c();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f35998a;
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
