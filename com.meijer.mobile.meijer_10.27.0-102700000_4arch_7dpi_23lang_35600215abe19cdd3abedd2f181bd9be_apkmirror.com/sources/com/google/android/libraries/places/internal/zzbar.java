package com.google.android.libraries.places.internal;

import java.io.IOException;

/* loaded from: classes6.dex */
public class zzbar extends IOException {
    private boolean zza;

    public zzbar(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    final void zza() {
        this.zza = true;
    }

    final boolean zzb() {
        return this.zza;
    }

    public zzbar(String str) {
        super(str);
    }
}
