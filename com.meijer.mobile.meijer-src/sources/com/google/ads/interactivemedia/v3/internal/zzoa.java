package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.AbstractC6646c;
import id.C14719b;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
final class zzoa implements AbstractC6646c.a, AbstractC6646c.b {
    protected final zzoo zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;

    @Override // com.google.android.gms.common.internal.AbstractC6646c.b
    public final void onConnectionFailed(C14719b c14719b) throws InterruptedException {
        try {
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c.a
    public final void onConnectionSuspended(int i10) throws InterruptedException {
        try {
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    public final zzbp zzb(int i10) {
        zzbp zzbpVar;
        try {
            zzbpVar = (zzbp) this.zzd.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zzbpVar = null;
        }
        return zzbpVar == null ? zza() : zzbpVar;
    }

    public final void zzc() {
        zzoo zzooVar = this.zza;
        if (zzooVar != null) {
            if (zzooVar.isConnected() || this.zza.isConnecting()) {
                this.zza.disconnect();
            }
        }
    }

    protected final zzot zzd() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    public zzoa(Context context, String str, String str2) {
        this.zzb = str;
        this.zzc = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.zze = handlerThread;
        handlerThread.start();
        zzoo zzooVar = new zzoo(context, handlerThread.getLooper(), this, this, 9200000);
        this.zza = zzooVar;
        this.zzd = new LinkedBlockingQueue();
        zzooVar.checkAvailabilityAndConnect();
    }

    static zzbp zza() {
        zzan zzanVarZza = zzbp.zza();
        zzanVarZza.zzD(32768L);
        return (zzbp) zzanVarZza.zzal();
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c.a
    public final void onConnected(Bundle bundle) {
        zzot zzotVarZzd = zzd();
        if (zzotVarZzd != null) {
            try {
                try {
                    this.zzd.put(zzotVarZzd.zze(new zzop(this.zzb, this.zzc)).zza());
                } catch (Throwable unused) {
                    this.zzd.put(zza());
                }
            } catch (InterruptedException unused2) {
            } catch (Throwable th2) {
                zzc();
                this.zze.quit();
                throw th2;
            }
            zzc();
            this.zze.quit();
        }
    }
}
