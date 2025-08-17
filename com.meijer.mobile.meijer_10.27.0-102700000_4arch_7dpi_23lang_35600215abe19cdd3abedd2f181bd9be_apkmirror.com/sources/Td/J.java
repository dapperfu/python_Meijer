package Td;

import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes6.dex */
final class J {

    /* renamed from: a, reason: collision with root package name */
    private final Object f34914a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private Queue f34915b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f34916c;

    public final void a(I i10) {
        synchronized (this.f34914a) {
            try {
                if (this.f34915b == null) {
                    this.f34915b = new ArrayDeque();
                }
                this.f34915b.add(i10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(AbstractC5232j abstractC5232j) {
        I i10;
        synchronized (this.f34914a) {
            if (this.f34915b != null && !this.f34916c) {
                this.f34916c = true;
                while (true) {
                    synchronized (this.f34914a) {
                        try {
                            i10 = (I) this.f34915b.poll();
                            if (i10 == null) {
                                this.f34916c = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    i10.a(abstractC5232j);
                }
            }
        }
    }

    J() {
    }
}
