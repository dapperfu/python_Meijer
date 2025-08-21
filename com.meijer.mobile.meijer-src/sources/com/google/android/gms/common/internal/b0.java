package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import id.C14719b;

/* loaded from: classes4.dex */
final class b0 extends Ad.e {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC6646c f65670b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(AbstractC6646c abstractC6646c, Looper looper) {
        super(looper);
        this.f65670b = abstractC6646c;
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
        if (this.f65670b.zzd.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i10 = message.what;
        if ((i10 == 1 || i10 == 7 || ((i10 == 4 && !this.f65670b.enableLocalFallback()) || message.what == 5)) && !this.f65670b.isConnecting()) {
            a(message);
            return;
        }
        int i11 = message.what;
        if (i11 == 4) {
            this.f65670b.zzC = new C14719b(message.arg2);
            if (AbstractC6646c.zzo(this.f65670b)) {
                AbstractC6646c abstractC6646c = this.f65670b;
                if (!abstractC6646c.zzD) {
                    abstractC6646c.zzp(3, null);
                    return;
                }
            }
            AbstractC6646c abstractC6646c2 = this.f65670b;
            C14719b c14719b = abstractC6646c2.zzC != null ? abstractC6646c2.zzC : new C14719b(8);
            this.f65670b.zzc.b(c14719b);
            this.f65670b.onConnectionFailed(c14719b);
            return;
        }
        if (i11 == 5) {
            AbstractC6646c abstractC6646c3 = this.f65670b;
            C14719b c14719b2 = abstractC6646c3.zzC != null ? abstractC6646c3.zzC : new C14719b(8);
            this.f65670b.zzc.b(c14719b2);
            this.f65670b.onConnectionFailed(c14719b2);
            return;
        }
        if (i11 == 3) {
            Object obj = message.obj;
            C14719b c14719b3 = new C14719b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f65670b.zzc.b(c14719b3);
            this.f65670b.onConnectionFailed(c14719b3);
            return;
        }
        if (i11 == 6) {
            this.f65670b.zzp(5, null);
            AbstractC6646c abstractC6646c4 = this.f65670b;
            if (abstractC6646c4.zzw != null) {
                abstractC6646c4.zzw.onConnectionSuspended(message.arg2);
            }
            this.f65670b.onConnectionSuspended(message.arg2);
            AbstractC6646c.zzn(this.f65670b, 5, 1, null);
            return;
        }
        if (i11 == 2 && !this.f65670b.isConnected()) {
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
