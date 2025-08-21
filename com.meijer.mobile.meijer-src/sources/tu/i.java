package tu;

import android.app.Application;
import android.app.Service;
import mu.C15768a;
import ru.InterfaceC16943d;
import wu.InterfaceC17927b;

/* loaded from: classes4.dex */
public final class i implements InterfaceC17927b<Object> {

    /* renamed from: a, reason: collision with root package name */
    private final Service f163424a;

    /* renamed from: b, reason: collision with root package name */
    private Object f163425b;

    public interface a {
        InterfaceC16943d j();
    }

    private Object a() {
        Application application = this.f163424a.getApplication();
        wu.d.d(application instanceof InterfaceC17927b, "Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", application.getClass());
        return ((a) C15768a.a(application, a.class)).j().a(this.f163424a).build();
    }

    @Override // wu.InterfaceC17927b
    public Object generatedComponent() {
        if (this.f163425b == null) {
            this.f163425b = a();
        }
        return this.f163425b;
    }

    public i(Service service) {
        this.f163424a = service;
    }
}
