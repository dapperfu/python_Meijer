package com.google.ads.interactivemedia.v3.internal;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class zzcq extends zzct {

    @SuppressLint({"StaticFieldLeak"})
    private static final zzcq zzb = new zzcq();

    private zzcq() {
    }

    public static zzcq zza() {
        return zzb;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzct
    public final void zzb(boolean z10) {
        Iterator it = zzcr.zza().zzc().iterator();
        while (it.hasNext()) {
            ((com.google.ads.interactivemedia.omid.library.adsession.zze) it.next()).zzh().zzk(z10);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzct
    public final boolean zzc() {
        Iterator it = zzcr.zza().zzb().iterator();
        while (it.hasNext()) {
            View viewZzg = ((com.google.ads.interactivemedia.omid.library.adsession.zze) it.next()).zzg();
            if (viewZzg != null && viewZzg.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
