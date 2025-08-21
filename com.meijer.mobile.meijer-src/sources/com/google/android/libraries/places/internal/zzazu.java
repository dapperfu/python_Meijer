package com.google.android.libraries.places.internal;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
final class zzazu {
    private static final zzazu zzd = new zzazu(true);
    final zzbcg zza = new zzbcc();
    private boolean zzb;
    private boolean zzc;

    private zzazu() {
    }

    public static zzazu zza() {
        return zzd;
    }

    public final boolean zzc() {
        return this.zzb;
    }

    private zzazu(boolean z10) {
        zzb();
        zzb();
    }

    private static Object zzm(Object obj) {
        if (obj instanceof zzbbq) {
            return ((zzbbq) obj).zzc();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzazu) {
            return this.zza.equals(((zzazu) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (this.zzb) {
            return;
        }
        zzbcg zzbcgVar = this.zza;
        int iZzc = zzbcgVar.zzc();
        for (int i10 = 0; i10 < iZzc; i10++) {
            Object value = zzbcgVar.zzd(i10).getValue();
            if (value instanceof zzbae) {
                ((zzbae) value).zzbi();
            }
        }
        Iterator it = zzbcgVar.zze().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzbae) {
                ((zzbae) value2).zzbi();
            }
        }
        zzbcgVar.zza();
        this.zzb = true;
    }

    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzazu clone() {
        zzazu zzazuVar = new zzazu();
        zzbcg zzbcgVar = this.zza;
        int iZzc = zzbcgVar.zzc();
        for (int i10 = 0; i10 < iZzc; i10++) {
            Map.Entry entryZzd = zzbcgVar.zzd(i10);
            zzazuVar.zzg((zzazt) ((zzbcd) entryZzd).zza(), entryZzd.getValue());
        }
        for (Map.Entry entry : zzbcgVar.zze()) {
            zzazuVar.zzg((zzazt) entry.getKey(), entry.getValue());
        }
        zzazuVar.zzc = this.zzc;
        return zzazuVar;
    }

    public final Iterator zze() {
        zzbcg zzbcgVar = this.zza;
        return zzbcgVar.isEmpty() ? Collections.emptyIterator() : this.zzc ? new zzbau(zzbcgVar.entrySet().iterator()) : zzbcgVar.entrySet().iterator();
    }

    public final Object zzf(zzazt zzaztVar) {
        Object obj = this.zza.get(zzaztVar);
        if (obj instanceof zzbav) {
            throw null;
        }
        return obj;
    }

    public final boolean zzh() {
        zzbcg zzbcgVar = this.zza;
        int iZzc = zzbcgVar.zzc();
        for (int i10 = 0; i10 < iZzc; i10++) {
            if (!zzl(zzbcgVar.zzd(i10))) {
                return false;
            }
        }
        Iterator it = zzbcgVar.zze().iterator();
        while (it.hasNext()) {
            if (!zzl((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void zzi(zzazu zzazuVar) {
        zzbcg zzbcgVar = zzazuVar.zza;
        int iZzc = zzbcgVar.zzc();
        for (int i10 = 0; i10 < iZzc; i10++) {
            zzn(zzbcgVar.zzd(i10));
        }
        Iterator it = zzbcgVar.zze().iterator();
        while (it.hasNext()) {
            zzn((Map.Entry) it.next());
        }
    }

    public final int zzj() {
        zzbcg zzbcgVar = this.zza;
        int iZzc = zzbcgVar.zzc();
        int iZzo = 0;
        for (int i10 = 0; i10 < iZzc; i10++) {
            iZzo += zzo(zzbcgVar.zzd(i10));
        }
        Iterator it = zzbcgVar.zze().iterator();
        while (it.hasNext()) {
            iZzo += zzo((Map.Entry) it.next());
        }
        return iZzo;
    }

    public static int zzk(zzazt zzaztVar, Object obj) {
        int iZzc;
        int iZzz;
        zzbcx zzbcxVarZzb = zzaztVar.zzb();
        zzaztVar.zza();
        zzaztVar.zzd();
        int iZzz2 = zzazi.zzz(-94933856);
        if (zzbcxVarZzb == zzbcx.zzj) {
            byte[] bArr = zzbap.zzb;
            if (!(((zzbbl) obj) instanceof zzayn)) {
                iZzz2 += iZzz2;
            } else {
                throw null;
            }
        }
        zzbcy zzbcyVar = zzbcy.INT;
        int iZzA = 4;
        switch (zzbcxVarZzb.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iZzA = 8;
                return iZzz2 + iZzA;
            case 1:
                ((Float) obj).getClass();
                return iZzz2 + iZzA;
            case 2:
                iZzA = zzazi.zzA(((Long) obj).longValue());
                return iZzz2 + iZzA;
            case 3:
                iZzA = zzazi.zzA(((Long) obj).longValue());
                return iZzz2 + iZzA;
            case 4:
                iZzA = zzazi.zzA(((Integer) obj).intValue());
                return iZzz2 + iZzA;
            case 5:
                ((Long) obj).getClass();
                iZzA = 8;
                return iZzz2 + iZzA;
            case 6:
                ((Integer) obj).getClass();
                return iZzz2 + iZzA;
            case 7:
                ((Boolean) obj).getClass();
                iZzA = 1;
                return iZzz2 + iZzA;
            case 8:
                if (obj instanceof zzayz) {
                    iZzc = ((zzayz) obj).zzc();
                    iZzz = zzazi.zzz(iZzc);
                    iZzA = iZzz + iZzc;
                    return iZzz2 + iZzA;
                }
                iZzA = zzazi.zzB((String) obj);
                return iZzz2 + iZzA;
            case 9:
                iZzA = ((zzbbl) obj).zzbl();
                return iZzz2 + iZzA;
            case 10:
                if (obj instanceof zzbav) {
                    iZzc = ((zzbav) obj).zzb();
                    iZzz = zzazi.zzz(iZzc);
                    iZzA = iZzz + iZzc;
                    return iZzz2 + iZzA;
                }
                iZzA = zzazi.zzC((zzbbl) obj);
                return iZzz2 + iZzA;
            case 11:
                if (obj instanceof zzayz) {
                    iZzc = ((zzayz) obj).zzc();
                    iZzz = zzazi.zzz(iZzc);
                } else {
                    iZzc = ((byte[]) obj).length;
                    iZzz = zzazi.zzz(iZzc);
                }
                iZzA = iZzz + iZzc;
                return iZzz2 + iZzA;
            case 12:
                iZzA = zzazi.zzz(((Integer) obj).intValue());
                return iZzz2 + iZzA;
            case 13:
                iZzA = obj instanceof zzbai ? zzazi.zzA(((zzbai) obj).zza()) : zzazi.zzA(((Integer) obj).intValue());
                return iZzz2 + iZzA;
            case 14:
                ((Integer) obj).getClass();
                return iZzz2 + iZzA;
            case 15:
                ((Long) obj).getClass();
                iZzA = 8;
                return iZzz2 + iZzA;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                iZzA = zzazi.zzz((iIntValue >> 31) ^ (iIntValue + iIntValue));
                return iZzz2 + iZzA;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                iZzA = zzazi.zzA((jLongValue >> 63) ^ (jLongValue + jLongValue));
                return iZzz2 + iZzA;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static boolean zzl(Map.Entry entry) {
        zzazt zzaztVar = (zzazt) entry.getKey();
        if (zzaztVar.zzc() != zzbcy.MESSAGE) {
            return true;
        }
        zzaztVar.zzd();
        Object value = entry.getValue();
        if (value instanceof zzbbm) {
            return ((zzbbm) value).zzbA();
        }
        if (value instanceof zzbav) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private final void zzn(Map.Entry entry) {
        zzbbl zzbblVarZzG;
        zzazt zzaztVar = (zzazt) entry.getKey();
        Object value = entry.getValue();
        boolean z10 = value instanceof zzbav;
        zzaztVar.zzd();
        if (zzaztVar.zzc() == zzbcy.MESSAGE) {
            Object objZzf = zzf(zzaztVar);
            if (objZzf == null) {
                this.zza.put(zzaztVar, zzm(value));
                if (z10) {
                    this.zzc = true;
                    return;
                }
                return;
            }
            if (!z10) {
                if (objZzf instanceof zzbbq) {
                    zzbblVarZzG = zzaztVar.zzg((zzbbq) objZzf, (zzbbq) value);
                } else {
                    zzbblVarZzG = zzaztVar.zzf(((zzbbl) objZzf).zzbx(), (zzbbl) value).zzG();
                }
                this.zza.put(zzaztVar, zzbblVarZzG);
                return;
            }
            throw null;
        }
        if (!z10) {
            this.zza.put(zzaztVar, zzm(value));
            return;
        }
        throw new IllegalStateException("Lazy fields must be message-valued");
    }

    private static final int zzo(Map.Entry entry) {
        int i10;
        int iZzz;
        int iZzz2;
        zzazt zzaztVar = (zzazt) entry.getKey();
        Object value = entry.getValue();
        if (zzaztVar.zzc() == zzbcy.MESSAGE) {
            zzaztVar.zzd();
            zzaztVar.zze();
            if (value instanceof zzbav) {
                ((zzazt) entry.getKey()).zza();
                int iZzz3 = zzazi.zzz(8);
                i10 = iZzz3 + iZzz3;
                iZzz = zzazi.zzz(16) + zzazi.zzz(525004180);
                int iZzz4 = zzazi.zzz(24);
                int iZzb = ((zzbav) value).zzb();
                iZzz2 = iZzz4 + zzazi.zzz(iZzb) + iZzb;
            } else {
                ((zzazt) entry.getKey()).zza();
                int iZzz5 = zzazi.zzz(8);
                i10 = iZzz5 + iZzz5;
                iZzz = zzazi.zzz(16) + zzazi.zzz(525004180);
                iZzz2 = zzazi.zzz(24) + zzazi.zzC((zzbbl) value);
            }
            return i10 + iZzz + iZzz2;
        }
        return zzk(zzaztVar, value);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if ((r4 instanceof com.google.android.libraries.places.internal.zzbai) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if ((r4 instanceof byte[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        if (r0 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if ((r4 instanceof com.google.android.libraries.places.internal.zzbav) == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzg(com.google.android.libraries.places.internal.zzazt r3, java.lang.Object r4) {
        /*
            r2 = this;
            r3.zzd()
            com.google.android.libraries.places.internal.zzbcx r0 = r3.zzb()
            byte[] r1 = com.google.android.libraries.places.internal.zzbap.zzb
            r4.getClass()
            com.google.android.libraries.places.internal.zzbcx r1 = com.google.android.libraries.places.internal.zzbcx.zza
            com.google.android.libraries.places.internal.zzbcy r1 = com.google.android.libraries.places.internal.zzbcy.INT
            com.google.android.libraries.places.internal.zzbcy r0 = r0.zza()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L46;
                case 1: goto L43;
                case 2: goto L40;
                case 3: goto L3d;
                case 4: goto L3a;
                case 5: goto L37;
                case 6: goto L2e;
                case 7: goto L25;
                case 8: goto L1c;
                default: goto L1b;
            }
        L1b:
            goto L57
        L1c:
            boolean r0 = r4 instanceof com.google.android.libraries.places.internal.zzbbl
            if (r0 != 0) goto L4a
            boolean r0 = r4 instanceof com.google.android.libraries.places.internal.zzbav
            if (r0 == 0) goto L57
            goto L4a
        L25:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 != 0) goto L4a
            boolean r0 = r4 instanceof com.google.android.libraries.places.internal.zzbai
            if (r0 == 0) goto L57
            goto L4a
        L2e:
            boolean r0 = r4 instanceof com.google.android.libraries.places.internal.zzayz
            if (r0 != 0) goto L4a
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L57
            goto L4a
        L37:
            boolean r0 = r4 instanceof java.lang.String
            goto L48
        L3a:
            boolean r0 = r4 instanceof java.lang.Boolean
            goto L48
        L3d:
            boolean r0 = r4 instanceof java.lang.Double
            goto L48
        L40:
            boolean r0 = r4 instanceof java.lang.Float
            goto L48
        L43:
            boolean r0 = r4 instanceof java.lang.Long
            goto L48
        L46:
            boolean r0 = r4 instanceof java.lang.Integer
        L48:
            if (r0 == 0) goto L57
        L4a:
            boolean r0 = r4 instanceof com.google.android.libraries.places.internal.zzbav
            if (r0 == 0) goto L51
            r0 = 1
            r2.zzc = r0
        L51:
            com.google.android.libraries.places.internal.zzbcg r0 = r2.zza
            r0.put(r3, r4)
            return
        L57:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r3.zza()
            r1 = 525004180(0x1f4aed94, float:4.2971684E-20)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.libraries.places.internal.zzbcx r3 = r3.zzb()
            com.google.android.libraries.places.internal.zzbcy r3 = r3.zza()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3, r4}
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzazu.zzg(com.google.android.libraries.places.internal.zzazt, java.lang.Object):void");
    }
}
