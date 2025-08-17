package com.google.android.gms.internal.pal;

import android.os.RemoteException;
import com.fullstory.FS;

/* loaded from: classes6.dex */
public final class T5 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f82888a;

    /* renamed from: b, reason: collision with root package name */
    private int f82889b;

    /* renamed from: c, reason: collision with root package name */
    private int f82890c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ U5 f82891d;

    /* synthetic */ T5(U5 u52, byte[] bArr, S5 s52) {
        this.f82891d = u52;
        this.f82888a = bArr;
    }

    public final T5 a(int i10) {
        this.f82890c = i10;
        return this;
    }

    public final T5 b(int i10) {
        this.f82889b = i10;
        return this;
    }

    public final synchronized void c() {
        try {
            U5 u52 = this.f82891d;
            if (u52.f82902b) {
                u52.f82901a.zzj(this.f82888a);
                this.f82891d.f82901a.zzi(this.f82889b);
                this.f82891d.f82901a.zzg(this.f82890c);
                this.f82891d.f82901a.zzh(null);
                this.f82891d.f82901a.zzf();
            }
        } catch (RemoteException e10) {
            FS.log_d("GASS", "Clearcut log failed", e10);
        }
    }
}
