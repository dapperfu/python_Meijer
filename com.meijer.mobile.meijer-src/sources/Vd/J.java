package Vd;

import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes6.dex */
final class J {

    /* renamed from: a, reason: collision with root package name */
    private final Object f39847a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private Queue f39848b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f39849c;

    public final void a(I i10) {
        synchronized (this.f39847a) {
            try {
                if (this.f39848b == null) {
                    this.f39848b = new ArrayDeque();
                }
                this.f39848b.add(i10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(AbstractC5516j abstractC5516j) {
        I i10;
        synchronized (this.f39847a) {
            if (this.f39848b != null && !this.f39849c) {
                this.f39849c = true;
                while (true) {
                    synchronized (this.f39847a) {
                        try {
                            i10 = (I) this.f39848b.poll();
                            if (i10 == null) {
                                this.f39849c = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    i10.a(abstractC5516j);
                }
            }
        }
    }

    J() {
    }
}
