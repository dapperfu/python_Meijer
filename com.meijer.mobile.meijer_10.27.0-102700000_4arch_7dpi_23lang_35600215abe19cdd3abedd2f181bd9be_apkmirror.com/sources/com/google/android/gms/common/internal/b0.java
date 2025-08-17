package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import gd.C14243b;

/* loaded from: classes4.dex */
final class b0 extends yd.e {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC6521c f64830b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(AbstractC6521c abstractC6521c, Looper looper) {
        super(looper);
        this.f64830b = abstractC6521c;
    }

    private static final void a(Message message) {
        c0 c0Var = (c0) message.obj;
        c0Var.b();
        c0Var.e();
    }

    private static final boolean b(Message message) {
        int i10 = message.what;
        return i10 == 2 || i10 == 1 || i10 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f64830b.zzd.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i10 = message.what;
        if ((i10 == 1 || i10 == 7 || ((i10 == 4 && !this.f64830b.enableLocalFallback()) || message.what == 5)) && !this.f64830b.isConnecting()) {
            a(message);
            return;
        }
        int i11 = message.what;
        if (i11 == 4) {
            this.f64830b.zzC = new C14243b(message.arg2);
            if (AbstractC6521c.zzo(this.f64830b)) {
                AbstractC6521c abstractC6521c = this.f64830b;
                if (!abstractC6521c.zzD) {
                    abstractC6521c.zzp(3, null);
                    return;
                }
            }
            AbstractC6521c abstractC6521c2 = this.f64830b;
            C14243b c14243b = abstractC6521c2.zzC != null ? abstractC6521c2.zzC : new C14243b(8);
            this.f64830b.zzc.b(c14243b);
            this.f64830b.onConnectionFailed(c14243b);
            return;
        }
        if (i11 == 5) {
            AbstractC6521c abstractC6521c3 = this.f64830b;
            C14243b c14243b2 = abstractC6521c3.zzC != null ? abstractC6521c3.zzC : new C14243b(8);
            this.f64830b.zzc.b(c14243b2);
            this.f64830b.onConnectionFailed(c14243b2);
            return;
        }
        if (i11 == 3) {
            Object obj = message.obj;
            C14243b c14243b3 = new C14243b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f64830b.zzc.b(c14243b3);
            this.f64830b.onConnectionFailed(c14243b3);
            return;
        }
        if (i11 == 6) {
            this.f64830b.zzp(5, null);
            AbstractC6521c abstractC6521c4 = this.f64830b;
            if (abstractC6521c4.zzw != null) {
                abstractC6521c4.zzw.onConnectionSuspended(message.arg2);
            }
            this.f64830b.onConnectionSuspended(message.arg2);
            AbstractC6521c.zzn(this.f64830b, 5, 1, null);
            return;
        }
        if (i11 == 2 && !this.f64830b.isConnected()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((c0) message.obj).c();
            return;
        }
        Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
    }
}
