package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.k1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractRunnableC10446k1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final long f82230a;

    /* renamed from: b, reason: collision with root package name */
    final long f82231b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f82232c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C10544v1 f82233d;

    abstract void a() throws RemoteException;

    protected void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f82233d.l()) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e10) {
            this.f82233d.j(e10, false, this.f82232c);
            b();
        }
    }

    AbstractRunnableC10446k1(C10544v1 c10544v1, boolean z10) {
        Objects.requireNonNull(c10544v1);
        this.f82233d = c10544v1;
        this.f82230a = c10544v1.f82435b.a();
        this.f82231b = c10544v1.f82435b.c();
        this.f82232c = z10;
    }
}
