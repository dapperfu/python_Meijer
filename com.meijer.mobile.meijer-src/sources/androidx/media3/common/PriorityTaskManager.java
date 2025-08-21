package androidx.media3.common;

import d3.P;
import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final class PriorityTaskManager {

    /* renamed from: a, reason: collision with root package name */
    private final Object f55561a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final PriorityQueue<Integer> f55562b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* renamed from: c, reason: collision with root package name */
    private int f55563c = Integer.MIN_VALUE;

    public static class PriorityTooLowException extends IOException {
    }

    public void a(int i10) {
        synchronized (this.f55561a) {
            this.f55562b.add(Integer.valueOf(i10));
            this.f55563c = Math.max(this.f55563c, i10);
        }
    }

    public void b(int i10) {
        synchronized (this.f55561a) {
            this.f55562b.remove(Integer.valueOf(i10));
            this.f55563c = this.f55562b.isEmpty() ? Integer.MIN_VALUE : ((Integer) P.h(this.f55562b.peek())).intValue();
            this.f55561a.notifyAll();
        }
    }
}
