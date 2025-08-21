package M6;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public final class a<ListenerType> {

    /* renamed from: a, reason: collision with root package name */
    Map<ListenerType, WeakReference<ListenerType>> f19678a = new WeakHashMap();

    public void a(ListenerType listenertype) {
        this.f19678a.put(listenertype, new WeakReference<>(listenertype));
    }

    public boolean b(ListenerType listenertype) {
        return this.f19678a.containsKey(listenertype);
    }

    public Set<ListenerType> c() {
        return this.f19678a.keySet();
    }

    public void d(ListenerType listenertype) {
        if (b(listenertype)) {
            this.f19678a.remove(listenertype);
        }
    }
}
