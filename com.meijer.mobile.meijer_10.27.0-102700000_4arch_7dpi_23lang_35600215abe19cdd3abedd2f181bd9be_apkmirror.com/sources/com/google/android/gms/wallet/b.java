package com.google.android.gms.wallet;

import Id.e;
import Td.AbstractC5232j;
import Td.InterfaceC5227e;
import android.app.PendingIntent;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
/* loaded from: classes6.dex */
final class b implements InterfaceC5227e, Runnable {

    /* renamed from: d, reason: collision with root package name */
    static final Handler f86133d = new e(Looper.getMainLooper());

    /* renamed from: e, reason: collision with root package name */
    static final SparseArray f86134e = new SparseArray(2);

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicInteger f86135f = new AtomicInteger();

    /* renamed from: a, reason: collision with root package name */
    int f86136a;

    /* renamed from: b, reason: collision with root package name */
    private zzd f86137b;

    /* renamed from: c, reason: collision with root package name */
    private AbstractC5232j f86138c;

    b() {
    }

    public final void b(zzd zzdVar) {
        if (this.f86137b == zzdVar) {
            this.f86137b = null;
        }
    }

    public static b a(AbstractC5232j abstractC5232j) {
        b bVar = new b();
        int iIncrementAndGet = f86135f.incrementAndGet();
        bVar.f86136a = iIncrementAndGet;
        f86134e.put(iIncrementAndGet, bVar);
        f86133d.postDelayed(bVar, a.f86131a);
        abstractC5232j.c(bVar);
        return bVar;
    }

    private final void e() throws PendingIntent.CanceledException {
        if (this.f86138c == null || this.f86137b == null) {
            return;
        }
        f86134e.delete(this.f86136a);
        f86133d.removeCallbacks(this);
        zzd zzdVar = this.f86137b;
        if (zzdVar != null) {
            zzdVar.b(this.f86138c);
        }
    }

    public final void c(zzd zzdVar) {
        this.f86137b = zzdVar;
        e();
    }

    @Override // Td.InterfaceC5227e
    public final void onComplete(AbstractC5232j abstractC5232j) throws PendingIntent.CanceledException {
        this.f86138c = abstractC5232j;
        e();
    }

    @Override // java.lang.Runnable
    public final void run() {
        f86134e.delete(this.f86136a);
    }
}
