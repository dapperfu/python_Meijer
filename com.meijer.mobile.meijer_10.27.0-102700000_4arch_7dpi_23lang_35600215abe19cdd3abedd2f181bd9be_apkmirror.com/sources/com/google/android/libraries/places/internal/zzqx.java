package com.google.android.libraries.places.internal;

import java.util.Arrays;
import java.util.Map;

/* loaded from: classes6.dex */
final class zzqx {
    private final int[] zza;
    private final zzqv zzb;
    private zzqv zzc;
    private int zzd;
    private int zze;
    private int zzf;

    private final boolean zzf(int i10, int i11, int i12, int i13) {
        if (i10 >= 0 && i12 >= 0) {
            int[] iArr = this.zza;
            int length = iArr.length;
            int iMin = Math.min(length, i11);
            if (iMin - i10 == Math.min(length, i13) - i12) {
                for (int i14 = i10; i14 <= iMin; i14++) {
                    if (iArr[i14] != iArr[(i12 + i14) - i10]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        r6 = r0.zzc.zzd;
        r8 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r6.containsKey(r8) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        r0.zzc.zzd.put(r8, new com.google.android.libraries.places.internal.zzqv(r1, 1073741824, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r5 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        r5.zzc = r0.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        if (r5 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        r5.zzc = r0.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        r0.zzd = r1;
        r0.zze++;
        r0.zzb();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.google.android.libraries.places.internal.zzqx zza(int[] r12) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzqx.zza(int[]):com.google.android.libraries.places.internal.zzqx");
    }

    private final void zze(zzqv zzqvVar, StringBuilder sb2) {
        for (zzqv zzqvVar2 : zzqvVar.zzd.values()) {
            sb2.append("  ");
            sb2.append(zzqvVar);
            sb2.append(" -> ");
            sb2.append(zzqvVar2);
            sb2.append(" [label=\"");
            int[] iArr = this.zza;
            sb2.append(Arrays.toString(Arrays.copyOfRange(iArr, zzqvVar2.zza, Math.min(iArr.length, zzqvVar2.zzb + 1))));
            sb2.append("\"]\n");
            zze(zzqvVar2, sb2);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("digraph {\n");
        zze(this.zzb, sb2);
        sb2.append("}");
        return sb2.toString();
    }

    final void zzb() {
        if (this.zze == 0) {
            return;
        }
        Map map = this.zzc.zzd;
        int[] iArr = this.zza;
        zzqv zzqvVar = (zzqv) map.get(Integer.valueOf(iArr[this.zzd]));
        while (true) {
            int i10 = (zzqvVar.zzb - zzqvVar.zza) + 1;
            int i11 = this.zze;
            if (i10 > i11) {
                return;
            }
            int i12 = this.zzd + i10;
            this.zzd = i12;
            this.zzc = zzqvVar;
            int i13 = i11 - i10;
            this.zze = i13;
            if (i13 > 0) {
                zzqvVar = (zzqv) zzqvVar.zzd.get(Integer.valueOf(iArr[i12]));
            }
        }
    }

    final void zzc() {
        zzqv zzqvVar = this.zzc.zzc;
        if (zzqvVar != null) {
            this.zzc = zzqvVar;
        } else {
            this.zzc = this.zzb;
            int i10 = this.zze;
            if (i10 > 0) {
                this.zze = i10 - 1;
            }
            if (this.zzf > 0) {
                this.zzd++;
            }
        }
        zzb();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.libraries.places.internal.zzqw zzd() {
        /*
            r12 = this;
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            com.google.android.libraries.places.internal.zzqu r1 = new com.google.android.libraries.places.internal.zzqu
            com.google.android.libraries.places.internal.zzqv r2 = r12.zzb
            r5 = -1
            r6 = 0
            r3 = 0
            r4 = -1
            r1.<init>(r2, r3, r4, r5, r6)
            r0.push(r1)
        L13:
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L7b
            java.lang.Object r3 = r0.pop()
            com.google.android.libraries.places.internal.zzqu r3 = (com.google.android.libraries.places.internal.zzqu) r3
            com.google.android.libraries.places.internal.zzqv r4 = r3.zzd
            java.util.Map r4 = r4.zzd
            java.util.Collection r4 = r4.values()
            java.util.Iterator r4 = r4.iterator()
        L2b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L13
            java.lang.Object r5 = r4.next()
            r7 = r5
            com.google.android.libraries.places.internal.zzqv r7 = (com.google.android.libraries.places.internal.zzqv) r7
            int r9 = r3.zzb
            int r10 = r3.zzc
            int r5 = r7.zza
            r6 = r10
            int r10 = r7.zzb
            boolean r5 = r12.zzf(r9, r6, r5, r10)
            if (r5 != 0) goto L5a
            java.util.Map r5 = r7.zzd
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L5c
            int r5 = r7.zza
            int r8 = r5 + r6
            int r8 = r8 - r9
            boolean r5 = r12.zzf(r9, r6, r5, r8)
            if (r5 == 0) goto L5c
        L5a:
            r10 = r6
            goto L66
        L5c:
            com.google.android.libraries.places.internal.zzqu r6 = new com.google.android.libraries.places.internal.zzqu
            int r9 = r7.zza
            r11 = 0
            r8 = 1
            r6.<init>(r7, r8, r9, r10, r11)
            goto L70
        L66:
            com.google.android.libraries.places.internal.zzqu r6 = new com.google.android.libraries.places.internal.zzqu
            int r5 = r3.zza
            int r8 = r5 + 1
            r11 = 0
            r6.<init>(r7, r8, r9, r10, r11)
        L70:
            int r5 = r1.zza
            int r7 = r6.zza
            if (r5 >= r7) goto L77
            r1 = r6
        L77:
            r0.push(r6)
            goto L2b
        L7b:
            int[] r0 = r12.zza
            int r3 = r1.zzc
            int r3 = r3 + 1
            int r4 = r0.length
            int r3 = java.lang.Math.min(r4, r3)
            r4 = 0
        L87:
            int r5 = r1.zzb
            int r6 = r3 - r5
            int r7 = r4 % r6
            int r7 = r7 + r5
            r7 = r0[r7]
            java.util.Map r2 = r2.zzd
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r2 = r2.get(r7)
            com.google.android.libraries.places.internal.zzqv r2 = (com.google.android.libraries.places.internal.zzqv) r2
            if (r2 != 0) goto L9f
            goto Lb8
        L9f:
            int r7 = r2.zza
        La1:
            int r8 = r2.zzb
            int r8 = r8 + 1
            if (r7 >= r8) goto L87
            int r8 = r0.length
            if (r7 >= r8) goto L87
            int r8 = r4 % r6
            int r8 = r8 + r5
            r8 = r0[r8]
            r9 = r0[r7]
            if (r8 != r9) goto Lb8
            int r4 = r4 + 1
            int r7 = r7 + 1
            goto La1
        Lb8:
            com.google.android.libraries.places.internal.zzqw r0 = new com.google.android.libraries.places.internal.zzqw
            int r4 = r4 / r6
            r0.<init>(r5, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzqx.zzd():com.google.android.libraries.places.internal.zzqw");
    }

    private zzqx(int[] iArr) {
        this.zza = iArr;
        zzqv zzqvVar = new zzqv(-1, -1, null);
        this.zzb = zzqvVar;
        this.zzc = zzqvVar;
    }
}
