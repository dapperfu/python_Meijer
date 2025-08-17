package xu;

import android.app.Application;
import android.app.Service;
import qu.C16607a;
import vu.InterfaceC17624d;

/* loaded from: classes11.dex */
public final class i implements Au.b<Object> {

    /* renamed from: a, reason: collision with root package name */
    private final Service f169956a;

    /* renamed from: b, reason: collision with root package name */
    private Object f169957b;

    public interface a {
        InterfaceC17624d j();
    }

    private Object a() {
        Application application = this.f169956a.getApplication();
        Au.d.d(application instanceof Au.b, "Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", application.getClass());
        return ((a) C16607a.a(application, a.class)).j().a(this.f169956a).build();
    }

    @Override // Au.b
    public Object generatedComponent() {
        if (this.f169957b == null) {
            this.f169957b = a();
        }
        return this.f169957b;
    }

    public i(Service service) {
        this.f169956a = service;
    }
}
