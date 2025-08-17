package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.internal.zzacg;
import com.google.ads.interactivemedia.v3.internal.zzach;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class zzach<MessageType extends zzach<MessageType, BuilderType>, BuilderType extends zzacg<MessageType, BuilderType>> implements zzafb {
    protected int zza = 0;

    int zzat(zzaft zzaftVar) {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafb
    public final zzacw zzau() {
        try {
            int iZzax = zzax();
            zzacw zzacwVar = zzacw.zzb;
            byte[] bArr = new byte[iZzax];
            zzadc zzadcVar = new zzadc(bArr, 0, iZzax);
            zzaR(zzadcVar);
            zzadcVar.zzB();
            return new zzacv(bArr);
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e10);
        }
    }

    public final byte[] zzav() {
        try {
            int iZzax = zzax();
            byte[] bArr = new byte[iZzax];
            zzadc zzadcVar = new zzadc(bArr, 0, iZzax);
            zzaR(zzadcVar);
            zzadcVar.zzB();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e10);
        }
    }
}
