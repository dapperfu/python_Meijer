package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.mT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8749mT implements QH {

    /* renamed from: b, reason: collision with root package name */
    private static final List f76793b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    private final Handler f76794a;

    public C8749mT(Handler handler) {
        this.f76794a = handler;
    }

    static /* bridge */ /* synthetic */ void e(C8534kS c8534kS) {
        List list = f76793b;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(c8534kS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static C8534kS f() {
        C8534kS c8534kS;
        List list = f76793b;
        synchronized (list) {
            try {
                c8534kS = list.isEmpty() ? new C8534kS(null) : (C8534kS) list.remove(list.size() - 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c8534kS;
    }

    @Override // com.google.android.gms.internal.ads.QH
    public final InterfaceC9164qH a(int i10, Object obj) {
        Handler handler = this.f76794a;
        C8534kS c8534kSF = f();
        c8534kSF.a(handler.obtainMessage(i10, obj), this);
        return c8534kSF;
    }

    @Override // com.google.android.gms.internal.ads.QH
    public final boolean b(Runnable runnable) {
        return this.f76794a.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.QH
    public final InterfaceC9164qH c(int i10, int i11, int i12) {
        Handler handler = this.f76794a;
        C8534kS c8534kSF = f();
        c8534kSF.a(handler.obtainMessage(1, i11, i12), this);
        return c8534kSF;
    }

    @Override // com.google.android.gms.internal.ads.QH
    public final boolean d(InterfaceC9164qH interfaceC9164qH) {
        return ((C8534kS) interfaceC9164qH).b(this.f76794a);
    }

    @Override // com.google.android.gms.internal.ads.QH
    public final Looper zza() {
        return this.f76794a.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.QH
    public final InterfaceC9164qH zzb(int i10) {
        Handler handler = this.f76794a;
        C8534kS c8534kSF = f();
        c8534kSF.a(handler.obtainMessage(i10), this);
        return c8534kSF;
    }

    @Override // com.google.android.gms.internal.ads.QH
    public final void zze(Object obj) {
        this.f76794a.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.QH
    public final void zzf(int i10) {
        this.f76794a.removeMessages(i10);
    }

    @Override // com.google.android.gms.internal.ads.QH
    public final boolean zzg(int i10) {
        return this.f76794a.hasMessages(1);
    }

    @Override // com.google.android.gms.internal.ads.QH
    public final boolean zzi(int i10) {
        return this.f76794a.sendEmptyMessage(i10);
    }

    @Override // com.google.android.gms.internal.ads.QH
    public final boolean zzj(int i10, long j10) {
        return this.f76794a.sendEmptyMessageAtTime(2, j10);
    }
}
