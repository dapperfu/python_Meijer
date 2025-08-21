package com.google.android.libraries.places.internal;

import De.p;
import java.io.Closeable;

/* loaded from: classes6.dex */
public final class zzbsn implements Closeable, zzbmk {
    private zzbsk zza;
    private int zzb;
    private final zzbwg zzc;
    private final zzbwp zzd;
    private zzbgh zze;
    private boolean zzg;
    private zzbme zzh;
    private long zzj;
    private int zzm;
    private int zzp = 1;
    private int zzf = 5;
    private zzbme zzi = new zzbme();
    private boolean zzk = false;
    private int zzl = -1;
    private boolean zzn = false;
    private volatile boolean zzo = false;

    @Override // com.google.android.libraries.places.internal.zzbmk
    public final void zza(int i10) {
        this.zzb = i10;
    }

    @Override // com.google.android.libraries.places.internal.zzbmk
    public final void zzb(zzbgh zzbghVar) {
        p.x(true, "Already set full stream decompressor");
        this.zze = (zzbgh) p.r(zzbghVar, "Can't pass an empty decompressor");
    }

    @Override // com.google.android.libraries.places.internal.zzbmk
    public final void zzc(int i10) {
        p.e(true, "numMessages must be > 0");
        if (zzg()) {
            return;
        }
        this.zzj += i10;
        zzi();
    }

    final void zzf(zzbsk zzbskVar) {
        this.zza = zzbskVar;
    }

    public final boolean zzg() {
        return this.zzi == null;
    }

    private final boolean zzh() {
        return this.zzi.zzf() == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
    
        if (r4 <= 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006e, code lost:
    
        r13.zza.zzD(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0075, code lost:
    
        if (r13.zzp != 2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0077, code lost:
    
        r13.zzc.zzm(r4);
        r13.zzm += r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0082, code lost:
    
        r4 = r13.zzp;
        r5 = r4 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0087, code lost:
    
        if (r4 == 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0089, code lost:
    
        if (r5 == 0) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008b, code lost:
    
        if (r5 == 1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008f, code lost:
    
        if (r4 == 1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0091, code lost:
    
        r1 = "BODY";
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0094, code lost:
    
        r1 = "HEADER";
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0096, code lost:
    
        r5 = new java.lang.StringBuilder(r1.length() + 15);
        r5.append("Invalid state: ");
        r5.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ae, code lost:
    
        throw new java.lang.AssertionError(r5.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00af, code lost:
    
        r7 = r13.zzc;
        r8 = r13.zzl;
        r9 = r13.zzm;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ba, code lost:
    
        if (true == r13.zzg) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bc, code lost:
    
        r11 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00be, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bf, code lost:
    
        r7.zzi(r8, r9, r11);
        r13.zzm = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c6, code lost:
    
        if (r13.zzg == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c8, code lost:
    
        r3 = r13.zze;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00cc, code lost:
    
        if (r3 == com.google.android.libraries.places.internal.zzbfs.zza) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ce, code lost:
    
        r8 = r13.zzh;
        r9 = com.google.android.libraries.places.internal.zzbtx.zza;
        r8 = new com.google.android.libraries.places.internal.zzbsm(r3.zzc(new com.google.android.libraries.places.internal.zzbtv(r8)), r13.zzb, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e9, code lost:
    
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f7, code lost:
    
        throw new com.google.android.libraries.places.internal.zzbjy(com.google.android.libraries.places.internal.zzbjv.zzh.zze("Can't decode compressed gRPC message as compression not configured"), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f8, code lost:
    
        r7.zzl(r13.zzh.zzf());
        r3 = r13.zzh;
        r7 = com.google.android.libraries.places.internal.zzbtx.zza;
        r8 = new com.google.android.libraries.places.internal.zzbtv(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x010b, code lost:
    
        r13.zzh = null;
        r13.zza.zzn(new com.google.android.libraries.places.internal.zzbsl(r8, null));
        r13.zzp = 1;
        r13.zzf = 5;
        r13.zzj--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0123, code lost:
    
        r4 = r13.zzh.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x012b, code lost:
    
        if ((r4 & 254) != 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x012f, code lost:
    
        if (1 == (r4 & 1)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0131, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0133, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0134, code lost:
    
        r13.zzg = r4;
        r4 = r13.zzh;
        r4.zzd(4);
        r4 = r4.zzg() | (((r4.zzg() << 24) | (r4.zzg() << 16)) | (r4.zzg() << 8));
        r13.zzf = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0157, code lost:
    
        if (r4 < 0) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x015b, code lost:
    
        if (r4 > r13.zzb) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015d, code lost:
    
        r4 = r13.zzl + 1;
        r13.zzl = r4;
        r13.zzc.zzg(r4);
        r13.zzd.zzd();
        r13.zzp = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01a1, code lost:
    
        throw new com.google.android.libraries.places.internal.zzbjy(com.google.android.libraries.places.internal.zzbjv.zzh.zze("gRPC frame header malformed: reserved bits not zero"), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01bd, code lost:
    
        if (r13.zzn == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c3, code lost:
    
        if (zzh() == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c5, code lost:
    
        close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ca, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzi() {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbsn.zzi():void");
    }

    @Override // com.google.android.libraries.places.internal.zzbmk
    public final void zzd(zzbtu zzbtuVar) throws Throwable {
        p.r(zzbtuVar, "data");
        boolean z10 = true;
        try {
            if (!zzg() && !this.zzn) {
                this.zzi.zze(zzbtuVar);
                try {
                    zzi();
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    z10 = false;
                    if (z10) {
                        zzbtuVar.close();
                    }
                    throw th;
                }
            }
            zzbtuVar.close();
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public zzbsn(zzbsk zzbskVar, zzbgh zzbghVar, int i10, zzbwg zzbwgVar, zzbwp zzbwpVar) {
        this.zza = (zzbsk) p.r(zzbskVar, "sink");
        this.zze = (zzbgh) p.r(zzbghVar, "decompressor");
        this.zzb = i10;
        this.zzc = (zzbwg) p.r(zzbwgVar, "statsTraceCtx");
        this.zzd = (zzbwp) p.r(zzbwpVar, "transportTracer");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, com.google.android.libraries.places.internal.zzbmk
    public final void close() {
        if (zzg()) {
            return;
        }
        zzbme zzbmeVar = this.zzh;
        boolean z10 = false;
        if (zzbmeVar != null && zzbmeVar.zzf() > 0) {
            z10 = true;
        }
        try {
            zzbme zzbmeVar2 = this.zzi;
            if (zzbmeVar2 != null) {
                zzbmeVar2.close();
            }
            zzbme zzbmeVar3 = this.zzh;
            if (zzbmeVar3 != null) {
                zzbmeVar3.close();
            }
            this.zzi = null;
            this.zzh = null;
            this.zza.zzb(z10);
        } catch (Throwable th2) {
            this.zzi = null;
            this.zzh = null;
            throw th2;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbmk
    public final void zze() {
        if (zzg()) {
            return;
        }
        if (zzh()) {
            close();
        } else {
            this.zzn = true;
        }
    }
}
