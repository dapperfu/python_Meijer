package com.medallia.digital.mobilesdk;

/* loaded from: classes7.dex */
class v4 implements Runnable {
    v4() {
    }

    public void a() {
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            a();
        } catch (AssertionError | Exception e10) {
            a4.c(e10.getMessage() != null ? e10.getMessage() : "Unknown error occurred");
        }
    }
}
