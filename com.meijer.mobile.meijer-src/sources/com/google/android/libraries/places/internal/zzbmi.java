package com.google.android.libraries.places.internal;

import De.p;
import java.util.ArrayList;

/* loaded from: classes6.dex */
final class zzbmi {
    private ArrayList zza = new ArrayList();
    private volatile zzbfy zzb = zzbfy.IDLE;

    final void zza(zzbfy zzbfyVar) {
        p.r(zzbfyVar, "newState");
        if (this.zzb == zzbfyVar || this.zzb == zzbfy.SHUTDOWN) {
            return;
        }
        this.zzb = zzbfyVar;
        if (this.zza.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.zza;
        this.zza = new ArrayList();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    zzbmi() {
    }
}
