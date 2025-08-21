package com.google.android.libraries.places.internal;

import java.io.IOException;

/* loaded from: classes6.dex */
class zzayy extends zzayx {
    protected final byte[] zza;

    zzayy(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.libraries.places.internal.zzayz
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzayz) || zzc() != ((zzayz) obj).zzc()) {
            return false;
        }
        if (zzc() == 0) {
            return true;
        }
        if (!(obj instanceof zzayy)) {
            return obj.equals(this);
        }
        zzayy zzayyVar = (zzayy) obj;
        int iZzi = zzi();
        int iZzi2 = zzayyVar.zzi();
        if (iZzi != 0 && iZzi2 != 0 && iZzi != iZzi2) {
            return false;
        }
        int iZzc = zzc();
        if (iZzc > zzayyVar.zzc()) {
            int iZzc2 = zzc();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzc).length() + 18 + String.valueOf(iZzc2).length());
            sb2.append("Length too large: ");
            sb2.append(iZzc);
            sb2.append(iZzc2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (iZzc > zzayyVar.zzc()) {
            int iZzc3 = zzayyVar.zzc();
            StringBuilder sb3 = new StringBuilder(String.valueOf(iZzc).length() + 27 + String.valueOf(iZzc3).length());
            sb3.append("Ran off end of other: 0, ");
            sb3.append(iZzc);
            sb3.append(", ");
            sb3.append(iZzc3);
            throw new IllegalArgumentException(sb3.toString());
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzayyVar.zza;
        zzayyVar.zzd();
        int i10 = 0;
        int i11 = 0;
        while (i10 < iZzc) {
            if (bArr[i10] != bArr2[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzayz
    public int zzc() {
        return this.zza.length;
    }

    protected int zzd() {
        return 0;
    }

    @Override // com.google.android.libraries.places.internal.zzayz
    public byte zza(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.libraries.places.internal.zzayz
    byte zzb(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.libraries.places.internal.zzayz
    protected final int zzg(int i10, int i11, int i12) {
        return zzbap.zzc(i10, this.zza, 0, i12);
    }

    @Override // com.google.android.libraries.places.internal.zzayz
    public final zzayz zze(int i10, int i11) {
        int iZzj = zzayz.zzj(0, i11, zzc());
        if (iZzj == 0) {
            return zzayz.zzb;
        }
        return new zzayv(this.zza, 0, iZzj);
    }

    @Override // com.google.android.libraries.places.internal.zzayz
    final void zzf(zzays zzaysVar) throws IOException {
        zzaysVar.zza(this.zza, 0, zzc());
    }
}
