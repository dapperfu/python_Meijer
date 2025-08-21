package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes4.dex */
public final class zzxy extends AbstractMap implements Serializable {
    private static final Comparator zze = new zzxr();
    zzxx zza;
    int zzb;
    int zzc;
    final zzxx zzd;
    private final Comparator zzf;
    private final boolean zzg;
    private zzxt zzh;
    private zzxv zzi;

    public zzxy() {
        this(zze, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.zza = null;
        this.zzb = 0;
        this.zzc++;
        zzxx zzxxVar = this.zzd;
        zzxxVar.zze = zzxxVar;
        zzxxVar.zzd = zzxxVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzb;
    }

    final zzxx zzc(Object obj) {
        if (obj != null) {
            try {
                return zza(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    public zzxy(Comparator comparator, boolean z10) {
        this.zzb = 0;
        this.zzc = 0;
        this.zzf = comparator;
        this.zzg = z10;
        this.zzd = new zzxx(z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0080 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzf(com.google.ads.interactivemedia.v3.internal.zzxx r9, boolean r10) {
        /*
            r8 = this;
        L0:
            if (r9 == 0) goto L84
            com.google.ads.interactivemedia.v3.internal.zzxx r0 = r9.zzb
            com.google.ads.interactivemedia.v3.internal.zzxx r1 = r9.zzc
            r2 = 0
            if (r0 == 0) goto Lc
            int r3 = r0.zzi
            goto Ld
        Lc:
            r3 = r2
        Ld:
            if (r1 == 0) goto L12
            int r4 = r1.zzi
            goto L13
        L12:
            r4 = r2
        L13:
            int r5 = r3 - r4
            r6 = -2
            r7 = 1
            if (r5 != r6) goto L42
            com.google.ads.interactivemedia.v3.internal.zzxx r0 = r1.zzb
            com.google.ads.interactivemedia.v3.internal.zzxx r3 = r1.zzc
            if (r3 == 0) goto L22
            int r3 = r3.zzi
            goto L23
        L22:
            r3 = r2
        L23:
            if (r0 == 0) goto L28
            int r0 = r0.zzi
            goto L29
        L28:
            r0 = r2
        L29:
            int r0 = r0 - r3
            r3 = -1
            if (r0 == r3) goto L3a
            if (r0 != 0) goto L32
            if (r10 != 0) goto L33
            goto L3b
        L32:
            r7 = r10
        L33:
            r8.zzi(r1)
            r8.zzh(r9)
            goto L3f
        L3a:
            r2 = r10
        L3b:
            r8.zzh(r9)
            r7 = r2
        L3f:
            if (r7 != 0) goto L84
            goto L80
        L42:
            r1 = 2
            if (r5 != r1) goto L6d
            com.google.ads.interactivemedia.v3.internal.zzxx r1 = r0.zzb
            com.google.ads.interactivemedia.v3.internal.zzxx r3 = r0.zzc
            if (r3 == 0) goto L4e
            int r3 = r3.zzi
            goto L4f
        L4e:
            r3 = r2
        L4f:
            if (r1 == 0) goto L54
            int r1 = r1.zzi
            goto L55
        L54:
            r1 = r2
        L55:
            int r1 = r1 - r3
            if (r1 == r7) goto L65
            if (r1 != 0) goto L5d
            if (r10 != 0) goto L5e
            goto L66
        L5d:
            r7 = r10
        L5e:
            r8.zzh(r0)
            r8.zzi(r9)
            goto L6a
        L65:
            r2 = r10
        L66:
            r8.zzi(r9)
            r7 = r2
        L6a:
            if (r7 == 0) goto L80
            goto L84
        L6d:
            if (r5 != 0) goto L76
            int r3 = r3 + 1
            r9.zzi = r3
            if (r10 == 0) goto L80
            goto L84
        L76:
            int r0 = java.lang.Math.max(r3, r4)
            int r0 = r0 + r7
            r9.zzi = r0
            if (r10 != 0) goto L80
            goto L84
        L80:
            com.google.ads.interactivemedia.v3.internal.zzxx r9 = r9.zza
            goto L0
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzxy.zzf(com.google.ads.interactivemedia.v3.internal.zzxx, boolean):void");
    }

    private final void zzg(zzxx zzxxVar, zzxx zzxxVar2) {
        zzxx zzxxVar3 = zzxxVar.zza;
        zzxxVar.zza = null;
        if (zzxxVar2 != null) {
            zzxxVar2.zza = zzxxVar3;
        }
        if (zzxxVar3 == null) {
            this.zza = zzxxVar2;
        } else if (zzxxVar3.zzb == zzxxVar) {
            zzxxVar3.zzb = zzxxVar2;
        } else {
            zzxxVar3.zzc = zzxxVar2;
        }
    }

    private final void zzh(zzxx zzxxVar) {
        zzxx zzxxVar2 = zzxxVar.zzb;
        zzxx zzxxVar3 = zzxxVar.zzc;
        zzxx zzxxVar4 = zzxxVar3.zzb;
        zzxx zzxxVar5 = zzxxVar3.zzc;
        zzxxVar.zzc = zzxxVar4;
        if (zzxxVar4 != null) {
            zzxxVar4.zza = zzxxVar;
        }
        zzg(zzxxVar, zzxxVar3);
        zzxxVar3.zzb = zzxxVar;
        zzxxVar.zza = zzxxVar3;
        int iMax = Math.max(zzxxVar2 != null ? zzxxVar2.zzi : 0, zzxxVar4 != null ? zzxxVar4.zzi : 0) + 1;
        zzxxVar.zzi = iMax;
        zzxxVar3.zzi = Math.max(iMax, zzxxVar5 != null ? zzxxVar5.zzi : 0) + 1;
    }

    private final void zzi(zzxx zzxxVar) {
        zzxx zzxxVar2 = zzxxVar.zzb;
        zzxx zzxxVar3 = zzxxVar.zzc;
        zzxx zzxxVar4 = zzxxVar2.zzb;
        zzxx zzxxVar5 = zzxxVar2.zzc;
        zzxxVar.zzb = zzxxVar5;
        if (zzxxVar5 != null) {
            zzxxVar5.zza = zzxxVar;
        }
        zzg(zzxxVar, zzxxVar2);
        zzxxVar2.zzc = zzxxVar;
        zzxxVar.zza = zzxxVar2;
        int iMax = Math.max(zzxxVar3 != null ? zzxxVar3.zzi : 0, zzxxVar5 != null ? zzxxVar5.zzi : 0) + 1;
        zzxxVar.zzi = iMax;
        zzxxVar2.zzi = Math.max(iMax, zzxxVar4 != null ? zzxxVar4.zzi : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        zzxt zzxtVar = this.zzh;
        if (zzxtVar != null) {
            return zzxtVar;
        }
        zzxt zzxtVar2 = new zzxt(this);
        this.zzh = zzxtVar2;
        return zzxtVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        zzxv zzxvVar = this.zzi;
        if (zzxvVar != null) {
            return zzxvVar;
        }
        zzxv zzxvVar2 = new zzxv(this);
        this.zzi = zzxvVar2;
        return zzxvVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.zzg) {
            throw new NullPointerException("value == null");
        }
        zzxx zzxxVarZza = zza(obj, true);
        Object obj3 = zzxxVarZza.zzh;
        zzxxVarZza.zzh = obj2;
        return obj3;
    }

    final zzxx zza(Object obj, boolean z10) {
        int iCompareTo;
        zzxx zzxxVar;
        Comparator comparator = this.zzf;
        zzxx zzxxVar2 = this.zza;
        if (zzxxVar2 != null) {
            Comparable comparable = comparator == zze ? (Comparable) obj : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(zzxxVar2.zzf) : comparator.compare(obj, zzxxVar2.zzf);
                if (iCompareTo == 0) {
                    return zzxxVar2;
                }
                zzxx zzxxVar3 = iCompareTo < 0 ? zzxxVar2.zzb : zzxxVar2.zzc;
                if (zzxxVar3 == null) {
                    break;
                }
                zzxxVar2 = zzxxVar3;
            }
        } else {
            iCompareTo = 0;
        }
        int i10 = iCompareTo;
        if (!z10) {
            return null;
        }
        zzxx zzxxVar4 = this.zzd;
        if (zzxxVar2 != null) {
            zzxx zzxxVar5 = zzxxVar2;
            zzxxVar = new zzxx(this.zzg, zzxxVar5, obj, zzxxVar4, zzxxVar4.zze);
            if (i10 < 0) {
                zzxxVar5.zzb = zzxxVar;
            } else {
                zzxxVar5.zzc = zzxxVar;
            }
            zzf(zzxxVar5, true);
        } else {
            if (comparator == zze && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            zzxxVar = new zzxx(this.zzg, null, obj, zzxxVar4, zzxxVar4.zze);
            this.zza = zzxxVar;
        }
        this.zzb++;
        this.zzc++;
        return zzxxVar;
    }

    final void zze(zzxx zzxxVar, boolean z10) {
        zzxx zzxxVar2;
        zzxx zzxxVar3;
        int i10;
        if (z10) {
            zzxx zzxxVar4 = zzxxVar.zze;
            zzxxVar4.zzd = zzxxVar.zzd;
            zzxxVar.zzd.zze = zzxxVar4;
        }
        zzxx zzxxVar5 = zzxxVar.zzb;
        zzxx zzxxVar6 = zzxxVar.zzc;
        zzxx zzxxVar7 = zzxxVar.zza;
        int i11 = 0;
        if (zzxxVar5 == null || zzxxVar6 == null) {
            if (zzxxVar5 != null) {
                zzg(zzxxVar, zzxxVar5);
                zzxxVar.zzb = null;
            } else if (zzxxVar6 != null) {
                zzg(zzxxVar, zzxxVar6);
                zzxxVar.zzc = null;
            } else {
                zzg(zzxxVar, null);
            }
            zzf(zzxxVar7, false);
            this.zzb--;
            this.zzc++;
            return;
        }
        if (zzxxVar5.zzi > zzxxVar6.zzi) {
            do {
                zzxxVar3 = zzxxVar5;
                zzxxVar5 = zzxxVar5.zzc;
            } while (zzxxVar5 != null);
        } else {
            do {
                zzxxVar2 = zzxxVar6;
                zzxxVar6 = zzxxVar6.zzb;
            } while (zzxxVar6 != null);
            zzxxVar3 = zzxxVar2;
        }
        zze(zzxxVar3, false);
        zzxx zzxxVar8 = zzxxVar.zzb;
        if (zzxxVar8 != null) {
            i10 = zzxxVar8.zzi;
            zzxxVar3.zzb = zzxxVar8;
            zzxxVar8.zza = zzxxVar3;
            zzxxVar.zzb = null;
        } else {
            i10 = 0;
        }
        zzxx zzxxVar9 = zzxxVar.zzc;
        if (zzxxVar9 != null) {
            i11 = zzxxVar9.zzi;
            zzxxVar3.zzc = zzxxVar9;
            zzxxVar9.zza = zzxxVar3;
            zzxxVar.zzc = null;
        }
        zzxxVar3.zzi = Math.max(i10, i11) + 1;
        zzg(zzxxVar, zzxxVar3);
    }

    public zzxy(boolean z10) {
        this(zze, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (zzc(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        zzxx zzxxVarZzc = zzc(obj);
        if (zzxxVarZzc != null) {
            return zzxxVarZzc.zzh;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzxx zzxxVarZzd = zzd(obj);
        if (zzxxVarZzd != null) {
            return zzxxVarZzd.zzh;
        }
        return null;
    }

    final zzxx zzb(Map.Entry entry) {
        zzxx zzxxVarZzc = zzc(entry.getKey());
        if (zzxxVarZzc != null && Objects.equals(zzxxVarZzc.zzh, entry.getValue())) {
            return zzxxVarZzc;
        }
        return null;
    }

    final zzxx zzd(Object obj) {
        zzxx zzxxVarZzc = zzc(obj);
        if (zzxxVarZzc != null) {
            zze(zzxxVarZzc, true);
        }
        return zzxxVarZzc;
    }
}
