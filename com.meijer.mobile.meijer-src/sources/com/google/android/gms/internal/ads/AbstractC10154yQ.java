package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.common.internal.AbstractC6646c;
import id.C14719b;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.yQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10154yQ implements AbstractC6646c.a, AbstractC6646c.b {

    /* renamed from: a, reason: collision with root package name */
    protected final C7270Rq f81057a = new C7270Rq();

    /* renamed from: b, reason: collision with root package name */
    protected final Object f81058b = new Object();

    /* renamed from: c, reason: collision with root package name */
    protected boolean f81059c = false;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f81060d = false;

    /* renamed from: e, reason: collision with root package name */
    protected C9978wo f81061e;

    /* renamed from: f, reason: collision with root package name */
    protected C7533Zn f81062f;

    static void b(Context context, com.google.common.util.concurrent.q qVar, Executor executor) {
        if (((Boolean) C8039eg.f74763j.e()).booleanValue() || ((Boolean) C8039eg.f74761h.e()).booleanValue()) {
            Mj0.r(qVar, new C9833vQ(context), executor);
        }
    }

    protected final void a() {
        synchronized (this.f81058b) {
            try {
                this.f81060d = true;
                if (this.f81062f.isConnected() || this.f81062f.isConnecting()) {
                    this.f81062f.disconnect();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void onConnectionFailed(C14719b c14719b) {
        Sc.p.b("Disconnected from remote ad request service.");
        this.f81057a.c(new zzdyh(1));
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c.a
    public final void onConnectionSuspended(int i10) {
        Sc.p.b("Cannot connect to remote service, fallback to local instance.");
    }
}
