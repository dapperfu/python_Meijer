package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.common.internal.AbstractC6521c;
import gd.C14243b;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.yQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10029yQ implements AbstractC6521c.a, AbstractC6521c.b {

    /* renamed from: a, reason: collision with root package name */
    protected final C7145Rq f80217a = new C7145Rq();

    /* renamed from: b, reason: collision with root package name */
    protected final Object f80218b = new Object();

    /* renamed from: c, reason: collision with root package name */
    protected boolean f80219c = false;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f80220d = false;

    /* renamed from: e, reason: collision with root package name */
    protected C9853wo f80221e;

    /* renamed from: f, reason: collision with root package name */
    protected C7408Zn f80222f;

    static void b(Context context, com.google.common.util.concurrent.q qVar, Executor executor) {
        if (((Boolean) C7914eg.f73923j.e()).booleanValue() || ((Boolean) C7914eg.f73921h.e()).booleanValue()) {
            Mj0.r(qVar, new C9708vQ(context), executor);
        }
    }

    protected final void a() {
        synchronized (this.f80218b) {
            try {
                this.f80220d = true;
                if (this.f80222f.isConnected() || this.f80222f.isConnecting()) {
                    this.f80222f.disconnect();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void onConnectionFailed(C14243b c14243b) {
        Qc.p.b("Disconnected from remote ad request service.");
        this.f80217a.c(new zzdyh(1));
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c.a
    public final void onConnectionSuspended(int i10) {
        Qc.p.b("Cannot connect to remote service, fallback to local instance.");
    }
}
