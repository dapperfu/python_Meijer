package com.google.android.gms.internal.pal;

import android.os.RemoteException;
import com.fullstory.FS;

/* loaded from: classes6.dex */
public final class T5 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f83728a;

    /* renamed from: b, reason: collision with root package name */
    private int f83729b;

    /* renamed from: c, reason: collision with root package name */
    private int f83730c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ U5 f83731d;

    /* synthetic */ T5(U5 u52, byte[] bArr, S5 s52) {
        this.f83731d = u52;
        this.f83728a = bArr;
    }

    public final T5 a(int i10) {
        this.f83730c = i10;
        return this;
    }

    public final T5 b(int i10) {
        this.f83729b = i10;
        return this;
    }

    public final synchronized void c() {
        try {
            U5 u52 = this.f83731d;
            if (u52.f83742b) {
                u52.f83741a.zzj(this.f83728a);
                this.f83731d.f83741a.zzi(this.f83729b);
                this.f83731d.f83741a.zzg(this.f83730c);
                this.f83731d.f83741a.zzh(null);
                this.f83731d.f83741a.zzf();
            }
        } catch (RemoteException e10) {
            FS.log_d("GASS", "Clearcut log failed", e10);
        }
    }
}
