package com.google.android.libraries.places.internal;

import Be.p;
import android.graphics.Bitmap;

/* loaded from: classes6.dex */
public final class zzkb {
    private Bitmap zza;

    public final zzkb zzb(Bitmap bitmap) {
        this.zza = bitmap;
        return this;
    }

    public final zzkc zza() {
        p.x(this.zza != null, "Photo must be set to non-null value.");
        return new zzkc(this.zza, null);
    }
}
