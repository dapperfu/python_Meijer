package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.mT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8874mT implements QH {

    /* renamed from: b, reason: collision with root package name */
    private static final List f77633b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    private final Handler f77634a;

    public C8874mT(Handler handler) {
        this.f77634a = handler;
    }

    static /* bridge */ /* synthetic */ void e(C8659kS c8659kS) {
        List list = f77633b;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(c8659kS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static C8659kS f() {
        C8659kS c8659kS;
        List list = f77633b;
        synchronized (list) {
            try {
                c8659kS = list.isEmpty() ? new C8659kS(null) : (C8659kS) list.remove(list.size() - 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c8659kS;
    }

    @Override // com.google.android.gms.internal.ads.QH
    public final InterfaceC9289qH a(int i10, Object obj) {
        Handler handler = this.f77634a;
        C8659kS c8659kSF = f();
        c8659kSF.a(handler.obtainMessage(i10, obj), this);
        return c8659kSF;
    }

    @Override // com.google.android.gms.internal.ads.QH
    public final boolean b(Runnable runnable) {
        return this.f77634a.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.QH
    public final InterfaceC9289qH c(int i10, int i11, int i12) {
        Handler handler = this.f77634a;
        C8659kS c8659kSF = f();
        c8659kSF.a(handler.obtainMessage(1, i11, i12), this);
        return c8659kSF;
    }

    @Override // com.google.android.gms.internal.ads.QH
    public final boolean d(InterfaceC9289qH interfaceC9289qH) {
        return ((C8659kS) interfaceC9289qH).b(this.f77634a);
    }

    @Override // com.google.android.gms.internal.ads.QH
    public final Looper zza() {
        return this.f77634a.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.QH
    public final InterfaceC9289qH zzb(int i10) {
        Handler handler = this.f77634a;
        C8659kS c8659kSF = f();
        c8659kSF.a(handler.obtainMessage(i10), this);
        return c8659kSF;
    }

    @Override // com.google.android.gms.internal.ads.QH
    public final void zze(Object obj) {
        this.f77634a.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.QH
    public final void zzf(int i10) {
        this.f77634a.removeMessages(i10);
    }

    @Override // com.google.android.gms.internal.ads.QH
    public final boolean zzg(int i10) {
        return this.f77634a.hasMessages(1);
    }

    @Override // com.google.android.gms.internal.ads.QH
    public final boolean zzi(int i10) {
        return this.f77634a.sendEmptyMessage(i10);
    }

    @Override // com.google.android.gms.internal.ads.QH
    public final boolean zzj(int i10, long j10) {
        return this.f77634a.sendEmptyMessageAtTime(2, j10);
    }
}
