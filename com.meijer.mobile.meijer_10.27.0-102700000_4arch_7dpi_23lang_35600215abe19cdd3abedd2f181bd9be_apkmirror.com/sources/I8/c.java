package I8;

import K8.d;
import K8.j;
import android.view.Window;
import g8.C14217B;
import g8.x;
import u8.C17233a;
import x8.f;

/* loaded from: classes4.dex */
public class c implements j {

    /* renamed from: c, reason: collision with root package name */
    private static final String f13727c = x.f133195a + "TapMonitorFactory";

    /* renamed from: a, reason: collision with root package name */
    private final H8.b f13728a;

    /* renamed from: b, reason: collision with root package name */
    private final C14217B f13729b;

    @Override // K8.j
    public K8.c b() {
        return null;
    }

    @Override // K8.j
    public d a(Window window) {
        return new b(this.f13728a, new a(c()), this.f13729b);
    }

    public c(H8.b bVar, C14217B c14217b) {
        this.f13728a = bVar;
        this.f13729b = c14217b;
    }

    private static float c() {
        C8.a aVarK = C17233a.h().k();
        if (aVarK == null) {
            if (x.f133196b) {
                f.u(f13727c, "Cannot determine screen density as ScreenMetrics is null");
                return 1.0f;
            }
            return 1.0f;
        }
        return aVarK.d();
    }
}
