package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC6646c;
import id.C14719b;

/* renamed from: com.google.android.gms.internal.ads.oc0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9100oc0 implements AbstractC6646c.a, AbstractC6646c.b {

    /* renamed from: a, reason: collision with root package name */
    private final C6980Jc0 f78243a;

    /* renamed from: b, reason: collision with root package name */
    private final C6810Ec0 f78244b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f78245c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private boolean f78246d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f78247e = false;

    @Override // com.google.android.gms.common.internal.AbstractC6646c.b
    public final void onConnectionFailed(C14719b c14719b) {
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c.a
    public final void onConnectionSuspended(int i10) {
    }

    private final void b() {
        synchronized (this.f78245c) {
            try {
                if (this.f78243a.isConnected() || this.f78243a.isConnecting()) {
                    this.f78243a.disconnect();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final void a() {
        synchronized (this.f78245c) {
            try {
                if (!this.f78246d) {
                    this.f78246d = true;
                    this.f78243a.checkAvailabilityAndConnect();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c.a
    public final void onConnected(Bundle bundle) {
        synchronized (this.f78245c) {
            try {
                if (this.f78247e) {
                    return;
                }
                this.f78247e = true;
                try {
                    this.f78243a.c().t6(new C6912Hc0(this.f78244b.j()));
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

    C9100oc0(Context context, Looper looper, C6810Ec0 c6810Ec0) {
        this.f78244b = c6810Ec0;
        this.f78243a = new C6980Jc0(context, looper, this, this, 12800000);
    }
}
