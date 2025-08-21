package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzyz extends zzacc {
    private static final Reader zzb = new zzyy();
    private static final Object zzc = new Object();
    private Object[] zzd;
    private int zze;
    private String[] zzf;
    private int[] zzg;

    private final String zzB() {
        return " at path ".concat(zzA(false));
    }

    private final String zzC(boolean z10) throws IOException {
        zzE(5);
        Map.Entry entry = (Map.Entry) ((Iterator) zzy()).next();
        String str = (String) entry.getKey();
        this.zzf[this.zze - 1] = true != z10 ? str : "<skipped>";
        zzD(entry.getValue());
        return str;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zzd = new Object[]{zzc};
        this.zze = 1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacc
    public final String zze() {
        return zzA(false);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacc
    public final String zzf() {
        return zzA(true);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacc
    public final String zzg() throws IOException {
        return zzC(false);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacc
    public final void zzi() throws IOException {
        zzE(1);
        zzD(((zzvu) zzy()).iterator());
        this.zzg[this.zze - 1] = 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacc
    public final void zzj() throws IOException {
        zzE(3);
        zzD(((zzvz) zzy()).zza().iterator());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacc
    public final void zzk() throws IOException {
        zzE(2);
        zzz();
        zzz();
        int i10 = this.zze;
        if (i10 > 0) {
            int[] iArr = this.zzg;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacc
    public final void zzl() throws IOException {
        zzE(4);
        this.zzf[this.zze - 1] = null;
        zzz();
        zzz();
        int i10 = this.zze;
        if (i10 > 0) {
            int[] iArr = this.zzg;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    public final void zzn() throws IOException {
        zzE(5);
        Map.Entry entry = (Map.Entry) ((Iterator) zzy()).next();
        zzD(entry.getValue());
        zzD(new zzwb((String) entry.getKey()));
    }

    public zzyz(zzvw zzvwVar) {
        super(zzb);
        this.zzd = new Object[32];
        this.zze = 0;
        this.zzf = new String[32];
        this.zzg = new int[32];
        zzD(zzvwVar);
    }

    private final String zzA(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = 0;
        while (true) {
            int i11 = this.zze;
            if (i10 >= i11) {
                return sb2.toString();
            }
            Object[] objArr = this.zzd;
            Object obj = objArr[i10];
            if (obj instanceof zzvu) {
                i10++;
                if (i10 < i11 && (objArr[i10] instanceof Iterator)) {
                    int i12 = this.zzg[i10];
                    if (z10 && i12 > 0 && (i10 == i11 - 1 || i10 == i11 - 2)) {
                        i12--;
                    }
                    sb2.append('[');
                    sb2.append(i12);
                    sb2.append(']');
                }
            } else if ((obj instanceof zzvz) && (i10 = i10 + 1) < i11 && (objArr[i10] instanceof Iterator)) {
                sb2.append('.');
                String str = this.zzf[i10];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i10++;
        }
    }

    private final void zzD(Object obj) {
        int i10 = this.zze;
        Object[] objArr = this.zzd;
        if (i10 == objArr.length) {
            int i11 = i10 + i10;
            this.zzd = Arrays.copyOf(objArr, i11);
            this.zzg = Arrays.copyOf(this.zzg, i11);
            this.zzf = (String[]) Arrays.copyOf(this.zzf, i11);
        }
        Object[] objArr2 = this.zzd;
        int i12 = this.zze;
        this.zze = i12 + 1;
        objArr2[i12] = obj;
    }

    private final Object zzy() {
        return this.zzd[this.zze - 1];
    }

    private final Object zzz() {
        Object[] objArr = this.zzd;
        int i10 = this.zze - 1;
        this.zze = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacc
    public final String toString() {
        return zzyz.class.getSimpleName().concat(zzB());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacc
    public final void zzm() throws IOException {
        zzE(9);
        zzz();
        int i10 = this.zze;
        if (i10 > 0) {
            int[] iArr = this.zzg;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacc
    public final boolean zzq() throws IOException {
        zzE(8);
        boolean zZzh = ((zzwb) zzz()).zzh();
        int i10 = this.zze;
        if (i10 > 0) {
            int[] iArr = this.zzg;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return zZzh;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacc
    public final int zzr() throws IOException {
        if (this.zze == 0) {
            return 10;
        }
        Object objZzy = zzy();
        if (objZzy instanceof Iterator) {
            boolean z10 = this.zzd[this.zze - 2] instanceof zzvz;
            Iterator it = (Iterator) objZzy;
            if (!it.hasNext()) {
                return z10 ? 4 : 2;
            }
            if (z10) {
                return 5;
            }
            zzD(it.next());
            return zzr();
        }
        if (objZzy instanceof zzvz) {
            return 3;
        }
        if (objZzy instanceof zzvu) {
            return 1;
        }
        if (objZzy instanceof zzwb) {
            zzwb zzwbVar = (zzwb) objZzy;
            if (zzwbVar.zzk()) {
                return 6;
            }
            if (zzwbVar.zzi()) {
                return 8;
            }
            if (zzwbVar.zzj()) {
                return 7;
            }
            throw new AssertionError();
        }
        if (objZzy instanceof zzvy) {
            return 9;
        }
        if (objZzy == zzc) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new zzacf("Custom JsonElement subclass " + objZzy.getClass().getName() + " is not supported");
    }

    private final void zzE(int i10) throws IOException {
        if (zzr() == i10) {
            return;
        }
        throw new IllegalStateException("Expected " + zzacd.zza(i10) + " but was " + zzacd.zza(zzr()) + zzB());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacc
    public final double zza() throws IOException {
        int iZzr = zzr();
        if (iZzr != 7 && iZzr != 6) {
            throw new IllegalStateException("Expected NUMBER but was " + zzacd.zza(iZzr) + zzB());
        }
        double dZza = ((zzwb) zzy()).zza();
        if (!zzx() && (Double.isNaN(dZza) || Double.isInfinite(dZza))) {
            throw new zzacf("JSON forbids NaN and infinities: " + dZza);
        }
        zzz();
        int i10 = this.zze;
        if (i10 > 0) {
            int[] iArr = this.zzg;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return dZza;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacc
    public final int zzb() throws IOException {
        int iZzr = zzr();
        if (iZzr != 7 && iZzr != 6) {
            throw new IllegalStateException("Expected NUMBER but was " + zzacd.zza(iZzr) + zzB());
        }
        int iZzb = ((zzwb) zzy()).zzb();
        zzz();
        int i10 = this.zze;
        if (i10 > 0) {
            int[] iArr = this.zzg;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return iZzb;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacc
    public final long zzc() throws IOException {
        int iZzr = zzr();
        if (iZzr != 7 && iZzr != 6) {
            throw new IllegalStateException("Expected NUMBER but was " + zzacd.zza(iZzr) + zzB());
        }
        long jZzc = ((zzwb) zzy()).zzc();
        zzz();
        int i10 = this.zze;
        if (i10 > 0) {
            int[] iArr = this.zzg;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return jZzc;
    }

    final zzvw zzd() throws IOException {
        int iZzr = zzr();
        if (iZzr != 5 && iZzr != 2 && iZzr != 4 && iZzr != 10) {
            zzvw zzvwVar = (zzvw) zzy();
            zzo();
            return zzvwVar;
        }
        throw new IllegalStateException("Unexpected " + zzacd.zza(iZzr) + " when reading a JsonElement.");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacc
    public final String zzh() throws IOException {
        int iZzr = zzr();
        if (iZzr != 6 && iZzr != 7) {
            throw new IllegalStateException("Expected STRING but was " + zzacd.zza(iZzr) + zzB());
        }
        String strZze = ((zzwb) zzz()).zze();
        int i10 = this.zze;
        if (i10 > 0) {
            int[] iArr = this.zzg;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return strZze;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacc
    public final void zzo() throws IOException {
        int iZzr = zzr() - 1;
        if (iZzr != 1) {
            if (iZzr != 9) {
                if (iZzr != 3) {
                    if (iZzr != 4) {
                        zzz();
                        int i10 = this.zze;
                        if (i10 > 0) {
                            int[] iArr = this.zzg;
                            int i11 = i10 - 1;
                            iArr[i11] = iArr[i11] + 1;
                            return;
                        }
                        return;
                    }
                    zzC(true);
                    return;
                }
                zzl();
                return;
            }
            return;
        }
        zzk();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacc
    public final boolean zzp() throws IOException {
        int iZzr = zzr();
        if (iZzr != 4 && iZzr != 2 && iZzr != 10) {
            return true;
        }
        return false;
    }
}
