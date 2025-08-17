package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC6521c;
import gd.C14243b;

/* renamed from: com.google.android.gms.internal.ads.oc0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8975oc0 implements AbstractC6521c.a, AbstractC6521c.b {

    /* renamed from: a, reason: collision with root package name */
    private final C6855Jc0 f77403a;

    /* renamed from: b, reason: collision with root package name */
    private final C6685Ec0 f77404b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f77405c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private boolean f77406d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f77407e = false;

    @Override // com.google.android.gms.common.internal.AbstractC6521c.b
    public final void onConnectionFailed(C14243b c14243b) {
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c.a
    public final void onConnectionSuspended(int i10) {
    }

    private final void b() {
        synchronized (this.f77405c) {
            try {
                if (this.f77403a.isConnected() || this.f77403a.isConnecting()) {
                    this.f77403a.disconnect();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final void a() {
        synchronized (this.f77405c) {
            try {
                if (!this.f77406d) {
                    this.f77406d = true;
                    this.f77403a.checkAvailabilityAndConnect();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c.a
    public final void onConnected(Bundle bundle) {
        synchronized (this.f77405c) {
            try {
                if (this.f77407e) {
                    return;
                }
                this.f77407e = true;
                try {
                    this.f77403a.c().f6(new C6787Hc0(this.f77404b.j()));
                } catch (Exception unused) {
                } catch (Throwable th2) {
                    b();
                    throw th2;
                }
                b();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    C8975oc0(Context context, Looper looper, C6685Ec0 c6685Ec0) {
        this.f77404b = c6685Ec0;
        this.f77403a = new C6855Jc0(context, looper, this, this, 12800000);
    }
}
