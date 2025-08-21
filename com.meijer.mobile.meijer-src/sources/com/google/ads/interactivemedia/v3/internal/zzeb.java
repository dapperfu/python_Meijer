package com.google.ads.interactivemedia.v3.internal;

import android.os.AsyncTask;

/* loaded from: classes4.dex */
public abstract class zzeb extends AsyncTask {
    private zzec zza;
    protected final zzdt zzd;

    public final void zzb(zzec zzecVar) {
        this.zza = zzecVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        zzec zzecVar = this.zza;
        if (zzecVar != null) {
            zzecVar.zza(this);
        }
    }

    public zzeb(zzdt zzdtVar) {
        this.zzd = zzdtVar;
    }
}
