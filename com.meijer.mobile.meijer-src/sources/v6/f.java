package v6;

import com.fullstory.FS;
import h6.B;
import h6.C14474e;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public class f implements B {

    /* renamed from: a, reason: collision with root package name */
    private static final Set<String> f165625a = new HashSet();

    @Override // h6.B
    public void a(String str) {
        e(str, null);
    }

    @Override // h6.B
    public void b(String str) {
        d(str, null);
    }

    @Override // h6.B
    public void c(String str, Throwable th2) {
        if (C14474e.f135091a) {
            FS.log_d("LOTTIE", str, th2);
        }
    }

    @Override // h6.B
    public void d(String str, Throwable th2) {
        Set<String> set = f165625a;
        if (set.contains(str)) {
            return;
        }
        FS.log_w("LOTTIE", str, th2);
        set.add(str);
    }

    public void e(String str, Throwable th2) {
        if (C14474e.f135091a) {
            FS.log_d("LOTTIE", str, th2);
        }
    }
}
