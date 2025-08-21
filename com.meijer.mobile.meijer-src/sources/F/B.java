package F;

import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    private final Object f8652a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, InterfaceC3290z> f8653b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Set<InterfaceC3290z> f8654c = new HashSet();

    public LinkedHashSet<InterfaceC3290z> a() {
        LinkedHashSet<InterfaceC3290z> linkedHashSet;
        synchronized (this.f8652a) {
            linkedHashSet = new LinkedHashSet<>(this.f8653b.values());
        }
        return linkedHashSet;
    }

    public void b(InterfaceC3288x interfaceC3288x) throws InitializationException {
        synchronized (this.f8652a) {
            try {
                for (String str : interfaceC3288x.b()) {
                    C.P.a("CameraRepository", "Added camera: " + str);
                    this.f8653b.put(str, interfaceC3288x.a(str));
                }
            } catch (CameraUnavailableException e10) {
                throw new InitializationException(e10);
            }
        }
    }
}
