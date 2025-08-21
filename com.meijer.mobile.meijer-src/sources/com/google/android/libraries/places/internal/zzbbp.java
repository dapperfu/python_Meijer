package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
final class zzbbp implements zzbbz {
    private final zzbbl zza;
    private final zzbcm zzb;
    private final boolean zzc;
    private final zzazq zzd;

    private zzbbp(zzbcm zzbcmVar, zzazq zzazqVar, zzbbl zzbblVar) {
        this.zzb = zzbcmVar;
        this.zzc = zzbblVar instanceof zzbab;
        this.zzd = zzazqVar;
        this.zza = zzbblVar;
    }

    static zzbbp zzj(zzbcm zzbcmVar, zzazq zzazqVar, zzbbl zzbblVar) {
        return new zzbbp(zzbcmVar, zzazqVar, zzbblVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbbz
    public final boolean zzb(Object obj, Object obj2) {
        if (!((zzbae) obj).zzc.equals(((zzbae) obj2).zzc)) {
            return false;
        }
        if (this.zzc) {
            return ((zzbab) obj).zzb.equals(((zzbab) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzbbz
    public final int zzc(Object obj) {
        int iHashCode = ((zzbae) obj).zzc.hashCode();
        return this.zzc ? (iHashCode * 53) + ((zzbab) obj).zzb.zza.hashCode() : iHashCode;
    }

    @Override // com.google.android.libraries.places.internal.zzbbz
    public final int zze(Object obj) {
        int iZzh = ((zzbae) obj).zzc.zzh();
        return this.zzc ? iZzh + ((zzbab) obj).zzb.zzj() : iZzh;
    }

    @Override // com.google.android.libraries.places.internal.zzbbz
    public final void zzf(Object obj, zzbcz zzbczVar) throws IOException {
        Iterator itZze = ((zzbab) obj).zzb.zze();
        while (itZze.hasNext()) {
            Map.Entry entry = (Map.Entry) itZze.next();
            zzazt zzaztVar = (zzazt) entry.getKey();
            if (zzaztVar.zzc() != zzbcy.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            zzaztVar.zzd();
            zzaztVar.zze();
            if (entry instanceof zzbat) {
                zzaztVar.zza();
                zzbczVar.zzv(525004180, ((zzbat) entry).zza().zzc());
            } else {
                zzaztVar.zza();
                zzbczVar.zzv(525004180, entry.getValue());
            }
        }
        ((zzbae) obj).zzc.zzf(zzbczVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbbz
    public final Object zza() {
        zzbbl zzbblVar = this.zza;
        return zzbblVar instanceof zzbae ? ((zzbae) zzbblVar).zzbg() : zzbblVar.zzby().zzF();
    }

    @Override // com.google.android.libraries.places.internal.zzbbz
    public final void zzd(Object obj, Object obj2) {
        zzbcb.zzD(this.zzb, obj, obj2);
        if (this.zzc) {
            zzbcb.zzC(this.zzd, obj, obj2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        return;
     */
    @Override // com.google.android.libraries.places.internal.zzbbz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzg(java.lang.Object r17, com.google.android.libraries.places.internal.zzbby r18, com.google.android.libraries.places.internal.zzazp r19) throws java.io.IOException {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r0 = r18
            r3 = r19
            com.google.android.libraries.places.internal.zzazq r4 = r1.zzd
            com.google.android.libraries.places.internal.zzbcm r5 = r1.zzb
            java.lang.Object r6 = r5.zzh(r2)
            com.google.android.libraries.places.internal.zzazu r7 = r4.zza(r2)
        L14:
            int r8 = r0.zzb()     // Catch: java.lang.Throwable -> L3a
            r9 = 2147483647(0x7fffffff, float:NaN)
            if (r8 != r9) goto L1e
            goto L49
        L1e:
            int r8 = r0.zzc()     // Catch: java.lang.Throwable -> L3a
            r10 = 11
            r11 = 0
            if (r8 == r10) goto L4d
            r9 = r8 & 7
            r10 = 2
            if (r9 != r10) goto L42
            com.google.android.libraries.places.internal.zzbbl r9 = r1.zza     // Catch: java.lang.Throwable -> L3a
            int r8 = r8 >>> 3
            com.google.android.libraries.places.internal.zzbad r8 = r3.zzb(r9, r8)     // Catch: java.lang.Throwable -> L3a
            if (r8 == 0) goto L3d
            r4.zzd(r0, r8, r3, r7)     // Catch: java.lang.Throwable -> L3a
            goto L14
        L3a:
            r0 = move-exception
            goto Lca
        L3d:
            boolean r8 = r5.zzk(r6, r0, r11)     // Catch: java.lang.Throwable -> L3a
            goto L46
        L42:
            boolean r8 = r0.zzd()     // Catch: java.lang.Throwable -> L3a
        L46:
            if (r8 == 0) goto L49
            goto L14
        L49:
            r5.zzi(r2, r6)
            return
        L4d:
            r8 = 0
            r10 = r8
            r13 = r10
            r12 = r11
        L51:
            int r14 = r0.zzb()     // Catch: java.lang.Throwable -> L3a
            r15 = 12
            if (r14 != r9) goto L5a
            goto L87
        L5a:
            int r14 = r0.zzc()     // Catch: java.lang.Throwable -> L3a
            r9 = 16
            if (r14 != r9) goto L70
            int r12 = r0.zzt()     // Catch: java.lang.Throwable -> L3a
            com.google.android.libraries.places.internal.zzbbl r9 = r1.zza     // Catch: java.lang.Throwable -> L3a
            com.google.android.libraries.places.internal.zzbad r10 = r3.zzb(r9, r12)     // Catch: java.lang.Throwable -> L3a
        L6c:
            r9 = 2147483647(0x7fffffff, float:NaN)
            goto L51
        L70:
            r9 = 26
            if (r14 != r9) goto L7f
            if (r10 == 0) goto L7a
            r4.zzd(r0, r10, r3, r7)     // Catch: java.lang.Throwable -> L3a
            goto L6c
        L7a:
            com.google.android.libraries.places.internal.zzayz r13 = r0.zzs()     // Catch: java.lang.Throwable -> L3a
            goto L6c
        L7f:
            if (r14 == r15) goto L87
            boolean r9 = r0.zzd()     // Catch: java.lang.Throwable -> L3a
            if (r9 != 0) goto L6c
        L87:
            int r9 = r0.zzc()     // Catch: java.lang.Throwable -> L3a
            if (r9 != r15) goto Lc2
            if (r13 == 0) goto L14
            if (r10 == 0) goto Lbd
            com.google.android.libraries.places.internal.zzbbl r9 = r10.zza     // Catch: java.lang.Throwable -> L3a
            com.google.android.libraries.places.internal.zzbae r9 = (com.google.android.libraries.places.internal.zzbae) r9     // Catch: java.lang.Throwable -> L3a
            r12 = 5
            java.lang.Object r8 = r9.zzb(r12, r8, r8)     // Catch: java.lang.Throwable -> L3a
            com.google.android.libraries.places.internal.zzazy r8 = (com.google.android.libraries.places.internal.zzazy) r8     // Catch: java.lang.Throwable -> L3a
            r9 = r13
            com.google.android.libraries.places.internal.zzayy r9 = (com.google.android.libraries.places.internal.zzayy) r9     // Catch: java.lang.Throwable -> L3a
            byte[] r9 = r9.zza     // Catch: java.lang.Throwable -> L3a
            com.google.android.libraries.places.internal.zzayy r13 = (com.google.android.libraries.places.internal.zzayy) r13     // Catch: java.lang.Throwable -> L3a
            int r12 = r13.zzc()     // Catch: java.lang.Throwable -> L3a
            r13 = 1
            com.google.android.libraries.places.internal.zzazc r9 = com.google.android.libraries.places.internal.zzazc.zzH(r9, r11, r12, r13)     // Catch: java.lang.Throwable -> L3a
            r8.zzx(r9, r3)     // Catch: java.lang.Throwable -> L3a
            com.google.android.libraries.places.internal.zzbac r10 = r10.zzb     // Catch: java.lang.Throwable -> L3a
            com.google.android.libraries.places.internal.zzbbl r8 = r8.zzF()     // Catch: java.lang.Throwable -> L3a
            r7.zzg(r10, r8)     // Catch: java.lang.Throwable -> L3a
            r9.zzb(r11)     // Catch: java.lang.Throwable -> L3a
            goto L14
        Lbd:
            r5.zzd(r6, r12, r13)     // Catch: java.lang.Throwable -> L3a
            goto L14
        Lc2:
            com.google.android.libraries.places.internal.zzbar r0 = new com.google.android.libraries.places.internal.zzbar     // Catch: java.lang.Throwable -> L3a
            java.lang.String r3 = "Protocol message end-group tag did not match expected tag."
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L3a
            throw r0     // Catch: java.lang.Throwable -> L3a
        Lca:
            r5.zzi(r2, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbbp.zzg(java.lang.Object, com.google.android.libraries.places.internal.zzbby, com.google.android.libraries.places.internal.zzazp):void");
    }

    @Override // com.google.android.libraries.places.internal.zzbbz
    public final void zzh(Object obj) {
        this.zzb.zzj(obj);
        this.zzd.zzb(obj);
    }

    @Override // com.google.android.libraries.places.internal.zzbbz
    public final boolean zzi(Object obj) {
        return ((zzbab) obj).zzb.zzh();
    }
}
