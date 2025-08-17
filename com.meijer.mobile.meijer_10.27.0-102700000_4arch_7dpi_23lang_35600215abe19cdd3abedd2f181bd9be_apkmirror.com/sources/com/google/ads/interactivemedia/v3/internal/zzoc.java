package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.AbstractC6521c;
import gd.C14243b;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
final class zzoc implements AbstractC6521c.a, AbstractC6521c.b {
    protected final zzoo zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;
    private final zznt zzf;
    private final long zzg;
    private final int zzh;

    public final zzpa zza(int i10) {
        zzpa zzpaVar;
        try {
            zzpaVar = (zzpa) this.zzd.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            zzd(2009, this.zzg, e10);
            zzpaVar = null;
        }
        zzd(3004, this.zzg, null);
        if (zzpaVar != null) {
            if (zzpaVar.zzc == 7) {
                zznt.zzg(3);
            } else {
                zznt.zzg(2);
            }
        }
        return zzpaVar == null ? new zzpa(null, 1) : zzpaVar;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c.b
    public final void onConnectionFailed(C14243b c14243b) throws InterruptedException {
        try {
            zzd(4012, this.zzg, null);
            this.zzd.put(new zzpa(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c.a
    public final void onConnectionSuspended(int i10) throws InterruptedException {
        try {
            zzd(4011, this.zzg, null);
            this.zzd.put(new zzpa(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    public final void zzb() {
        zzoo zzooVar = this.zza;
        if (zzooVar != null) {
            if (zzooVar.isConnected() || this.zza.isConnecting()) {
                this.zza.disconnect();
            }
        }
    }

    protected final zzot zzc() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    public zzoc(Context context, int i10, int i11, String str, String str2, String str3, zznt zzntVar) {
        this.zzb = str;
        this.zzh = i11;
        this.zzc = str2;
        this.zzf = zzntVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.zze = handlerThread;
        handlerThread.start();
        this.zzg = System.currentTimeMillis();
        zzoo zzooVar = new zzoo(context, handlerThread.getLooper(), this, this, 19621000);
        this.zza = zzooVar;
        this.zzd = new LinkedBlockingQueue();
        zzooVar.checkAvailabilityAndConnect();
    }

    private final void zzd(int i10, long j10, Exception exc) {
        this.zzf.zzc(i10, System.currentTimeMillis() - j10, exc);
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c.a
    public final void onConnected(Bundle bundle) {
        zzot zzotVarZzc = zzc();
        if (zzotVarZzc != null) {
            try {
                zzpa zzpaVarZzf = zzotVarZzc.zzf(new zzoy(1, this.zzh, this.zzb, this.zzc));
                zzd(5011, this.zzg, null);
                this.zzd.put(zzpaVarZzf);
            } finally {
                try {
                } finally {
                }
            }
        }
    }
}
