package L6;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public final class a<ListenerType> {

    /* renamed from: a, reason: collision with root package name */
    Map<ListenerType, WeakReference<ListenerType>> f17895a = new WeakHashMap();

    public void a(ListenerType listenertype) {
        this.f17895a.put(listenertype, new WeakReference<>(listenertype));
    }

    public boolean b(ListenerType listenertype) {
        return this.f17895a.containsKey(listenertype);
    }

    public Set<ListenerType> c() {
        return this.f17895a.keySet();
    }

    public void d(ListenerType listenertype) {
        if (b(listenertype)) {
            this.f17895a.remove(listenertype);
        }
    }
}
