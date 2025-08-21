package ug;

import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ug.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C17403a {

    /* renamed from: a, reason: collision with root package name */
    private final ReferenceQueue f163935a = new ReferenceQueue();

    /* renamed from: b, reason: collision with root package name */
    private final Set f163936b = Collections.synchronizedSet(new HashSet());

    /* renamed from: ug.a$a, reason: collision with other inner class name */
    public interface InterfaceC2596a {
        void a();
    }

    public static C17403a a() {
        C17403a c17403a = new C17403a();
        c17403a.b(c17403a, new Runnable() { // from class: ug.p
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
        final ReferenceQueue referenceQueue = c17403a.f163935a;
        final Set set = c17403a.f163936b;
        Thread thread = new Thread(new Runnable() { // from class: ug.q
            @Override // java.lang.Runnable
            public final void run() {
                ReferenceQueue referenceQueue2 = referenceQueue;
                while (!set.isEmpty()) {
                    try {
                        ((C17421s) referenceQueue2.remove()).a();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }, "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return c17403a;
    }

    public InterfaceC2596a b(Object obj, Runnable runnable) {
        C17421s c17421s = new C17421s(obj, this.f163935a, this.f163936b, runnable, null);
        this.f163936b.add(c17421s);
        return c17421s;
    }

    private C17403a() {
    }
}
