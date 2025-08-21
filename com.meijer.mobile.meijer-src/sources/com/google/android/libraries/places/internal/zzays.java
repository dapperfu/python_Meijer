package com.google.android.libraries.places.internal;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class zzays {
    public abstract void zza(byte[] bArr, int i10, int i11) throws IOException;

    static /* synthetic */ String zzb(int i10, int i11, byte b10, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + b10 + String.valueOf(i10).length());
        sb2.append(str);
        sb2.append(i11);
        sb2.append(str2);
        sb2.append(i10);
        return sb2.toString();
    }
}
