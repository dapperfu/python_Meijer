package com.google.android.gms.wallet;

import Kd.e;
import Vd.AbstractC5516j;
import Vd.InterfaceC5511e;
import android.app.PendingIntent;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
/* loaded from: classes6.dex */
final class b implements InterfaceC5511e, Runnable {

    /* renamed from: d, reason: collision with root package name */
    static final Handler f86973d = new e(Looper.getMainLooper());

    /* renamed from: e, reason: collision with root package name */
    static final SparseArray f86974e = new SparseArray(2);

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicInteger f86975f = new AtomicInteger();

    /* renamed from: a, reason: collision with root package name */
    int f86976a;

    /* renamed from: b, reason: collision with root package name */
    private zzd f86977b;

    /* renamed from: c, reason: collision with root package name */
    private AbstractC5516j f86978c;

    b() {
    }

    public final void b(zzd zzdVar) {
        if (this.f86977b == zzdVar) {
            this.f86977b = null;
        }
    }

    public static b a(AbstractC5516j abstractC5516j) {
        b bVar = new b();
        int iIncrementAndGet = f86975f.incrementAndGet();
        bVar.f86976a = iIncrementAndGet;
        f86974e.put(iIncrementAndGet, bVar);
        f86973d.postDelayed(bVar, a.f86971a);
        abstractC5516j.c(bVar);
        return bVar;
    }

    private final void e() throws PendingIntent.CanceledException {
        if (this.f86978c == null || this.f86977b == null) {
            return;
        }
        f86974e.delete(this.f86976a);
        f86973d.removeCallbacks(this);
        zzd zzdVar = this.f86977b;
        if (zzdVar != null) {
            zzdVar.b(this.f86978c);
        }
    }

    public final void c(zzd zzdVar) {
        this.f86977b = zzdVar;
        e();
    }

    @Override // Vd.InterfaceC5511e
    public final void onComplete(AbstractC5516j abstractC5516j) throws PendingIntent.CanceledException {
        this.f86978c = abstractC5516j;
        e();
    }

    @Override // java.lang.Runnable
    public final void run() {
        f86974e.delete(this.f86976a);
    }
}
