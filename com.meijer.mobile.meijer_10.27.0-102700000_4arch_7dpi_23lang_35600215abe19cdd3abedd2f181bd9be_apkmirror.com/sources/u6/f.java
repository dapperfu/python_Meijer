package u6;

import com.fullstory.FS;
import g6.B;
import g6.C14205e;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public class f implements B {

    /* renamed from: a, reason: collision with root package name */
    private static final Set<String> f162696a = new HashSet();

    @Override // g6.B
    public void a(String str) {
        e(str, null);
    }

    @Override // g6.B
    public void b(String str) {
        d(str, null);
    }

    @Override // g6.B
    public void c(String str, Throwable th2) {
        if (C14205e.f132915a) {
            FS.log_d("LOTTIE", str, th2);
        }
    }

    @Override // g6.B
    public void d(String str, Throwable th2) {
        Set<String> set = f162696a;
        if (set.contains(str)) {
            return;
        }
        FS.log_w("LOTTIE", str, th2);
        set.add(str);
    }

    public void e(String str, Throwable th2) {
        if (C14205e.f132915a) {
            FS.log_d("LOTTIE", str, th2);
        }
    }
}
