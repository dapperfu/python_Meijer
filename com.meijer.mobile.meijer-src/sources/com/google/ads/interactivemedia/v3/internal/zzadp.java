package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
final class zzadp {
    private static final zzadp zzb = new zzadp(true);
    final zzagd zza = new zzafw();
    private boolean zzc;
    private boolean zzd;

    private zzadp() {
    }

    public static zzadp zzd() {
        return zzb;
    }

    private zzadp(boolean z10) {
        zzf();
        zzf();
    }

    static int zza(zzags zzagsVar, int i10, Object obj) {
        zzadf.zzz(i10 << 3);
        if (zzags.zzj == null) {
            byte[] bArr = zzaee.zzb;
            if (((zzafb) obj) instanceof zzaci) {
                throw null;
            }
        }
        zzagt zzagtVar = zzagt.INT;
        throw null;
    }

    private static boolean zzj(Object obj) {
        if (obj instanceof zzafc) {
            return ((zzafc) obj).zzaT();
        }
        if (obj instanceof zzael) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzadp zzadpVar = new zzadp();
        int iZzc = this.zza.zzc();
        for (int i10 = 0; i10 < iZzc; i10++) {
            Map.Entry entryZzg = this.zza.zzg(i10);
            zzadpVar.zzg((zzado) ((zzafx) entryZzg).zza(), entryZzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzd()) {
            zzadpVar.zzg((zzado) entry.getKey(), entry.getValue());
        }
        zzadpVar.zzd = this.zzd;
        return zzadpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzadp) {
            return this.zza.equals(((zzadp) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzc() {
        int iZzc = this.zza.zzc();
        int iZzk = 0;
        for (int i10 = 0; i10 < iZzc; i10++) {
            iZzk += zzk(this.zza.zzg(i10));
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            iZzk += zzk((Map.Entry) it.next());
        }
        return iZzk;
    }

    public final Iterator zze() {
        return this.zza.isEmpty() ? Collections.emptyIterator() : this.zzd ? new zzaek(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zzf() {
        if (this.zzc) {
            return;
        }
        int iZzc = this.zza.zzc();
        for (int i10 = 0; i10 < iZzc; i10++) {
            Map.Entry entryZzg = this.zza.zzg(i10);
            if (entryZzg.getValue() instanceof zzady) {
                ((zzady) entryZzg.getValue()).zzaK();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final boolean zzh() {
        int iZzc = this.zza.zzc();
        for (int i10 = 0; i10 < iZzc; i10++) {
            if (!zzi(this.zza.zzg(i10))) {
                return false;
            }
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            if (!zzi((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static int zzb(zzado zzadoVar, Object obj) {
        zzags zzagsVarZzb = zzadoVar.zzb();
        int iZza = zzadoVar.zza();
        if (zzadoVar.zze()) {
            List list = (List) obj;
            int size = list.size();
            if (zzadoVar.zzd()) {
                if (list.isEmpty()) {
                    return 0;
                }
                if (size <= 0) {
                    return zzadf.zzz(iZza << 3) + zzadf.zzz(0);
                }
                list.get(0);
                zzags zzagsVar = zzags.zza;
                zzagt zzagtVar = zzagt.INT;
                throw null;
            }
            int iZza2 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                iZza2 += zza(zzagsVarZzb, iZza, list.get(i10));
            }
            return iZza2;
        }
        return zza(zzagsVarZzb, iZza, obj);
    }

    private static boolean zzi(Map.Entry entry) {
        zzado zzadoVar = (zzado) entry.getKey();
        if (zzadoVar.zzc() == zzagt.MESSAGE) {
            if (zzadoVar.zze()) {
                List list = (List) entry.getValue();
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (!zzj(list.get(i10))) {
                        return false;
                    }
                }
                return true;
            }
            return zzj(entry.getValue());
        }
        return true;
    }

    private static final int zzk(Map.Entry entry) {
        int i10;
        int iZzz;
        int iZzz2;
        int iZzax;
        int iZzz3;
        zzado zzadoVar = (zzado) entry.getKey();
        Object value = entry.getValue();
        if (zzadoVar.zzc() == zzagt.MESSAGE && !zzadoVar.zze() && !zzadoVar.zzd()) {
            if (value instanceof zzael) {
                int iZza = ((zzado) entry.getKey()).zza();
                int iZzz4 = zzadf.zzz(8);
                i10 = iZzz4 + iZzz4;
                iZzz = zzadf.zzz(16) + zzadf.zzz(iZza);
                iZzz2 = zzadf.zzz(24);
                iZzax = ((zzael) value).zza();
                iZzz3 = zzadf.zzz(iZzax);
            } else {
                int iZza2 = ((zzado) entry.getKey()).zza();
                int iZzz5 = zzadf.zzz(8);
                i10 = iZzz5 + iZzz5;
                iZzz = zzadf.zzz(16) + zzadf.zzz(iZza2);
                iZzz2 = zzadf.zzz(24);
                iZzax = ((zzafb) value).zzax();
                iZzz3 = zzadf.zzz(iZzax);
            }
            return i10 + iZzz + iZzz2 + iZzz3 + iZzax;
        }
        return zzb(zzadoVar, value);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void zzl(com.google.ads.interactivemedia.v3.internal.zzado r2, java.lang.Object r3) {
        /*
            com.google.ads.interactivemedia.v3.internal.zzags r0 = r2.zzb()
            byte[] r1 = com.google.ads.interactivemedia.v3.internal.zzaee.zzb
            r3.getClass()
            com.google.ads.interactivemedia.v3.internal.zzags r1 = com.google.ads.interactivemedia.v3.internal.zzags.zza
            com.google.ads.interactivemedia.v3.internal.zzagt r1 = com.google.ads.interactivemedia.v3.internal.zzagt.INT
            com.google.ads.interactivemedia.v3.internal.zzagt r0 = r0.zza()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L43;
                case 1: goto L40;
                case 2: goto L3d;
                case 3: goto L3a;
                case 4: goto L37;
                case 5: goto L34;
                case 6: goto L2b;
                case 7: goto L22;
                case 8: goto L19;
                default: goto L18;
            }
        L18:
            goto L48
        L19:
            boolean r0 = r3 instanceof com.google.ads.interactivemedia.v3.internal.zzafb
            if (r0 != 0) goto L21
            boolean r0 = r3 instanceof com.google.ads.interactivemedia.v3.internal.zzael
            if (r0 == 0) goto L48
        L21:
            return
        L22:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 != 0) goto L2a
            boolean r0 = r3 instanceof com.google.ads.interactivemedia.v3.internal.zzaea
            if (r0 == 0) goto L48
        L2a:
            return
        L2b:
            boolean r0 = r3 instanceof com.google.ads.interactivemedia.v3.internal.zzacw
            if (r0 != 0) goto L33
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto L48
        L33:
            return
        L34:
            boolean r0 = r3 instanceof java.lang.String
            goto L45
        L37:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L45
        L3a:
            boolean r0 = r3 instanceof java.lang.Double
            goto L45
        L3d:
            boolean r0 = r3 instanceof java.lang.Float
            goto L45
        L40:
            boolean r0 = r3 instanceof java.lang.Long
            goto L45
        L43:
            boolean r0 = r3 instanceof java.lang.Integer
        L45:
            if (r0 == 0) goto L48
            return
        L48:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r2.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.ads.interactivemedia.v3.internal.zzags r2 = r2.zzb()
            com.google.ads.interactivemedia.v3.internal.zzagt r2 = r2.zza()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r3 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzadp.zzl(com.google.ads.interactivemedia.v3.internal.zzado, java.lang.Object):void");
    }

    public final void zzg(zzado zzadoVar, Object obj) {
        if (zzadoVar.zze()) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj2 = list.get(i10);
                    zzl(zzadoVar, obj2);
                    arrayList.add(obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            zzl(zzadoVar, obj);
        }
        if (obj instanceof zzael) {
            this.zzd = true;
        }
        this.zza.put(zzadoVar, obj);
    }
}
