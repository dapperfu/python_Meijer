package K8;

import M8.d;
import M8.j;
import android.view.Window;
import i8.C14693B;
import i8.x;
import w8.C17850a;
import z8.f;

/* loaded from: classes4.dex */
public class c implements j {

    /* renamed from: c, reason: collision with root package name */
    private static final String f16473c = x.f137411a + "TapMonitorFactory";

    /* renamed from: a, reason: collision with root package name */
    private final J8.b f16474a;

    /* renamed from: b, reason: collision with root package name */
    private final C14693B f16475b;

    @Override // M8.j
    public M8.c b() {
        return null;
    }

    @Override // M8.j
    public d a(Window window) {
        return new b(this.f16474a, new a(c()), this.f16475b);
    }

    public c(J8.b bVar, C14693B c14693b) {
        this.f16474a = bVar;
        this.f16475b = c14693b;
    }

    private static float c() {
        E8.a aVarK = C17850a.h().k();
        if (aVarK == null) {
            if (x.f137412b) {
                f.u(f16473c, "Cannot determine screen density as ScreenMetrics is null");
                return 1.0f;
            }
            return 1.0f;
        }
        return aVarK.d();
    }
}
