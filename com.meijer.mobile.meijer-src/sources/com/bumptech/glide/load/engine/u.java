package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes4.dex */
class u {

    /* renamed from: a, reason: collision with root package name */
    private boolean f64847a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f64848b = new Handler(Looper.getMainLooper(), new a());

    private static final class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((Z6.c) message.obj).a();
            return true;
        }

        a() {
        }
    }

    synchronized void a(Z6.c<?> cVar, boolean z10) {
        try {
            if (this.f64847a || z10) {
                this.f64848b.obtainMessage(1, cVar).sendToTarget();
            } else {
                this.f64847a = true;
                cVar.a();
                this.f64847a = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    u() {
    }
}
