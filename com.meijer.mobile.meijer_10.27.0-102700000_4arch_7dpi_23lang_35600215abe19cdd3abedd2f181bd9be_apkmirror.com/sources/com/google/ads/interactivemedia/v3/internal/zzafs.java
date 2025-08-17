package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes4.dex */
final class zzafs extends zzacw {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, a.e.API_PRIORITY_OTHER};
    private final int zzc;
    private final zzacw zzd;
    private final zzacw zze;
    private final int zzf;
    private final int zzg;

    @Override // com.google.ads.interactivemedia.v3.internal.zzacw
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzacw)) {
            return false;
        }
        zzacw zzacwVar = (zzacw) obj;
        if (this.zzc != zzacwVar.zzd()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int iZzn = zzn();
        int iZzn2 = zzacwVar.zzn();
        if (iZzn != 0 && iZzn2 != 0 && iZzn != iZzn2) {
            return false;
        }
        zzafp zzafpVar = null;
        zzafq zzafqVar = new zzafq(this, zzafpVar);
        zzacu zzacuVarZza = zzafqVar.next();
        zzafq zzafqVar2 = new zzafq(zzacwVar, zzafpVar);
        zzacu zzacuVarZza2 = zzafqVar2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int iZzd = zzacuVarZza.zzd() - i10;
            int iZzd2 = zzacuVarZza2.zzd() - i11;
            int iMin = Math.min(iZzd, iZzd2);
            if (!(i10 == 0 ? zzacuVarZza.zzg(zzacuVarZza2, i11, iMin) : zzacuVarZza2.zzg(zzacuVarZza, i10, iMin))) {
                return false;
            }
            i12 += iMin;
            int i13 = this.zzc;
            if (i12 >= i13) {
                if (i12 == i13) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iZzd) {
                zzacuVarZza = zzafqVar.next();
                i10 = 0;
            } else {
                i10 += iMin;
                zzacuVarZza = zzacuVarZza;
            }
            if (iMin == iZzd2) {
                zzacuVarZza2 = zzafqVar2.next();
                i11 = 0;
            } else {
                i11 += iMin;
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacw
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacw
    protected final int zzf() {
        return this.zzg;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacw
    public final zzada zzk() {
        throw null;
    }

    private zzafs(zzacw zzacwVar, zzacw zzacwVar2) {
        this.zzd = zzacwVar;
        this.zze = zzacwVar2;
        int iZzd = zzacwVar.zzd();
        this.zzf = iZzd;
        this.zzc = iZzd + zzacwVar2.zzd();
        this.zzg = Math.max(zzacwVar.zzf(), zzacwVar2.zzf()) + 1;
    }

    static int zzc(int i10) {
        int[] iArr = zza;
        int length = iArr.length;
        return i10 >= 47 ? a.e.API_PRIORITY_OTHER : iArr[i10];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacw, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzafm(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacw
    public final byte zza(int i10) {
        zzacw.zzr(i10, this.zzc);
        return zzb(i10);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacw
    final byte zzb(int i10) {
        int i11 = this.zzf;
        return i10 < i11 ? this.zzd.zzb(i10) : this.zze.zzb(i10 - i11);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacw
    protected final void zze(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.zzf;
        if (i13 <= i14) {
            this.zzd.zze(bArr, i10, i11, i12);
        } else {
            if (i10 >= i14) {
                this.zze.zze(bArr, i10 - i14, i11, i12);
                return;
            }
            int i15 = i14 - i10;
            this.zzd.zze(bArr, i10, i11, i15);
            this.zze.zze(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacw
    protected final boolean zzh() {
        return this.zzc >= zzc(this.zzg);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacw
    protected final int zzi(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.zzf;
        if (i13 <= i14) {
            return this.zzd.zzi(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.zze.zzi(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.zze.zzi(this.zzd.zzi(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacw
    public final zzacw zzj(int i10, int i11) {
        int iZzm = zzacw.zzm(i10, i11, this.zzc);
        if (iZzm == 0) {
            return zzacw.zzb;
        }
        if (iZzm == this.zzc) {
            return this;
        }
        int i12 = this.zzf;
        if (i11 <= i12) {
            return this.zzd.zzj(i10, i11);
        }
        if (i10 >= i12) {
            return this.zze.zzj(i10 - i12, i11 - i12);
        }
        zzacw zzacwVar = this.zzd;
        return new zzafs(zzacwVar.zzj(i10, zzacwVar.zzd()), this.zze.zzj(0, i11 - this.zzf));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacw
    final void zzl(zzaco zzacoVar) throws IOException {
        this.zzd.zzl(zzacoVar);
        this.zze.zzl(zzacoVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacw
    /* renamed from: zzo */
    public final zzacs iterator() {
        return new zzafm(this);
    }

    static zzacw zzv(zzacw zzacwVar, zzacw zzacwVar2) {
        if (zzacwVar2.zzd() == 0) {
            return zzacwVar;
        }
        if (zzacwVar.zzd() == 0) {
            return zzacwVar2;
        }
        int iZzd = zzacwVar.zzd() + zzacwVar2.zzd();
        if (iZzd < 128) {
            return zzw(zzacwVar, zzacwVar2);
        }
        if (zzacwVar instanceof zzafs) {
            zzafs zzafsVar = (zzafs) zzacwVar;
            if (zzafsVar.zze.zzd() + zzacwVar2.zzd() < 128) {
                return new zzafs(zzafsVar.zzd, zzw(zzafsVar.zze, zzacwVar2));
            }
            if (zzafsVar.zzd.zzf() > zzafsVar.zze.zzf() && zzafsVar.zzg > zzacwVar2.zzf()) {
                return new zzafs(zzafsVar.zzd, new zzafs(zzafsVar.zze, zzacwVar2));
            }
        }
        if (iZzd >= zzc(Math.max(zzacwVar.zzf(), zzacwVar2.zzf()) + 1)) {
            return new zzafs(zzacwVar, zzacwVar2);
        }
        return zzafo.zza(new zzafo(null), zzacwVar, zzacwVar2);
    }

    private static zzacw zzw(zzacw zzacwVar, zzacw zzacwVar2) {
        int iZzd = zzacwVar.zzd();
        int iZzd2 = zzacwVar2.zzd();
        byte[] bArr = new byte[iZzd + iZzd2];
        zzacwVar.zzs(bArr, 0, 0, iZzd);
        zzacwVar2.zzs(bArr, 0, iZzd, iZzd2);
        return new zzacv(bArr);
    }
}
