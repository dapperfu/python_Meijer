package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.k1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractRunnableC10571k1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final long f83070a;

    /* renamed from: b, reason: collision with root package name */
    final long f83071b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f83072c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C10669v1 f83073d;

    abstract void a() throws RemoteException;

    protected void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f83073d.l()) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e10) {
            this.f83073d.j(e10, false, this.f83072c);
            b();
        }
    }

    AbstractRunnableC10571k1(C10669v1 c10669v1, boolean z10) {
        Objects.requireNonNull(c10669v1);
        this.f83073d = c10669v1;
        this.f83070a = c10669v1.f83275b.a();
        this.f83071b = c10669v1.f83275b.c();
        this.f83072c = z10;
    }
}
