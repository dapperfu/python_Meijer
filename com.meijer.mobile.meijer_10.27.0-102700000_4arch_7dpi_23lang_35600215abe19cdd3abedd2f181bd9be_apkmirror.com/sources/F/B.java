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
    private final Object f9885a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, InterfaceC3628z> f9886b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Set<InterfaceC3628z> f9887c = new HashSet();

    public LinkedHashSet<InterfaceC3628z> a() {
        LinkedHashSet<InterfaceC3628z> linkedHashSet;
        synchronized (this.f9885a) {
            linkedHashSet = new LinkedHashSet<>(this.f9886b.values());
        }
        return linkedHashSet;
    }

    public void b(InterfaceC3626x interfaceC3626x) throws InitializationException {
        synchronized (this.f9885a) {
            try {
                for (String str : interfaceC3626x.b()) {
                    C.P.a("CameraRepository", "Added camera: " + str);
                    this.f9886b.put(str, interfaceC3626x.a(str));
                }
            } catch (CameraUnavailableException e10) {
                throw new InitializationException(e10);
            }
        }
    }
}
