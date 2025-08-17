package sg;

import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: sg.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C16956a {

    /* renamed from: a, reason: collision with root package name */
    private final ReferenceQueue f160449a = new ReferenceQueue();

    /* renamed from: b, reason: collision with root package name */
    private final Set f160450b = Collections.synchronizedSet(new HashSet());

    /* renamed from: sg.a$a, reason: collision with other inner class name */
    public interface InterfaceC2503a {
        void a();
    }

    public static C16956a a() {
        C16956a c16956a = new C16956a();
        c16956a.b(c16956a, new Runnable() { // from class: sg.p
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
        final ReferenceQueue referenceQueue = c16956a.f160449a;
        final Set set = c16956a.f160450b;
        Thread thread = new Thread(new Runnable() { // from class: sg.q
            @Override // java.lang.Runnable
            public final void run() {
                ReferenceQueue referenceQueue2 = referenceQueue;
                while (!set.isEmpty()) {
                    try {
                        ((C16974s) referenceQueue2.remove()).a();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }, "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return c16956a;
    }

    public InterfaceC2503a b(Object obj, Runnable runnable) {
        C16974s c16974s = new C16974s(obj, this.f160449a, this.f160450b, runnable, null);
        this.f160450b.add(c16974s);
        return c16974s;
    }

    private C16956a() {
    }
}
