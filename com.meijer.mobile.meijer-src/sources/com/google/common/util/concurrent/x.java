package com.google.common.util.concurrent;

/* loaded from: classes6.dex */
final class x {
    static void a(Throwable th2) {
        De.p.q(th2);
        if (th2 instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
