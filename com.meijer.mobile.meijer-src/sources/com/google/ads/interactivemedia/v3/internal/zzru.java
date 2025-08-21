package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes4.dex */
public final class zzru extends zzrp implements NavigableMap {
    private static final zzru zza;
    private final transient zzsl zzb;
    private final transient zzrm zzc;
    private final transient zzru zzd;

    zzru(zzsl zzslVar, zzrm zzrmVar, zzru zzruVar) {
        this.zzb = zzslVar;
        this.zzc = zzrmVar;
        this.zzd = zzruVar;
    }

    public static zzru zzo() {
        return zza;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return ((zzrv) this.zzb).zza;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrp, java.util.Map
    public final /* synthetic */ Set keySet() {
        return this.zzb;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.zzb;
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrp, java.util.Map
    public final /* synthetic */ Collection values() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrp
    /* renamed from: zzb */
    public final zzri values() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrp
    /* renamed from: zzj */
    public final /* synthetic */ zzrr keySet() {
        return this.zzb;
    }

    static {
        zzsl zzslVarZzs = zzrv.zzs(zzsb.zza);
        int i10 = zzrm.zzd;
        zza = new zzru(zzslVarZzs, zzse.zza, null);
    }

    static zzru zzm(Comparator comparator) {
        if (zzsb.zza.equals(comparator)) {
            return zza;
        }
        zzsl zzslVarZzs = zzrv.zzs(comparator);
        int i10 = zzrm.zzd;
        return new zzru(zzslVarZzs, zzse.zza, null);
    }

    private final zzru zzs(int i10, int i11) {
        if (i10 == 0) {
            if (i11 == this.zzc.size()) {
                return this;
            }
            i10 = 0;
        }
        if (i10 == i11) {
            return zzm(((zzrv) this.zzb).zza);
        }
        return new zzru(this.zzb.zzw(i10, i11), this.zzc.subList(i10, i11), null);
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet descendingKeySet() {
        return this.zzb.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        zzru zzruVar = this.zzd;
        if (zzruVar != null) {
            return zzruVar;
        }
        if (!isEmpty()) {
            return new zzru((zzsl) this.zzb.descendingSet(), this.zzc.zzh(), this);
        }
        Comparator comparator = ((zzrv) this.zzb).zza;
        return zzm((comparator instanceof zzsd ? (zzsd) comparator : new zzqu(comparator)).zza());
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.zzb.first();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0005  */
    @Override // com.google.ads.interactivemedia.v3.internal.zzrp, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r4) {
        /*
            r3 = this;
            com.google.ads.interactivemedia.v3.internal.zzsl r0 = r3.zzb
            r1 = -1
            if (r4 != 0) goto L7
        L5:
            r4 = r1
            goto L12
        L7:
            com.google.ads.interactivemedia.v3.internal.zzrm r2 = r0.zzd     // Catch: java.lang.ClassCastException -> L5
            java.util.Comparator r0 = r0.zza     // Catch: java.lang.ClassCastException -> L5
            int r4 = java.util.Collections.binarySearch(r2, r4, r0)     // Catch: java.lang.ClassCastException -> L5
            if (r4 >= 0) goto L12
            goto L5
        L12:
            if (r4 != r1) goto L16
            r4 = 0
            return r4
        L16:
            com.google.ads.interactivemedia.v3.internal.zzrm r0 = r3.zzc
            java.lang.Object r4 = r0.get(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzru.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.zzb.last();
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrp
    final zzri zza() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrp
    final zzrr zzh() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrp
    final boolean zzk() {
        return this.zzb.zzd.zzf() || this.zzc.zzf();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return zzrz.zza(ceilingEntry(obj));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrp, java.util.Map
    public final /* bridge */ /* synthetic */ Set entrySet() {
        return entrySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().zzd().get(0);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return zzrz.zza(floorEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return zzrz.zza(higherEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().zzd().get(this.zzc.size() - 1);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return zzrz.zza(lowerEntry(obj));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrp
    final zzrr zzg() {
        if (isEmpty()) {
            return zzsk.zza;
        }
        return new zzrt(this);
    }

    @Override // java.util.NavigableMap
    /* renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final zzru headMap(Object obj, boolean z10) {
        obj.getClass();
        return zzs(0, this.zzb.zzu(obj, z10));
    }

    @Override // java.util.NavigableMap
    /* renamed from: zzp, reason: merged with bridge method [inline-methods] */
    public final zzru subMap(Object obj, boolean z10, Object obj2, boolean z11) {
        obj.getClass();
        obj2.getClass();
        if (((zzrv) this.zzb).zza.compare(obj, obj2) <= 0) {
            return headMap(obj2, z11).tailMap(obj, z10);
        }
        throw new IllegalArgumentException(zzqm.zzb("expected fromKey <= toKey but %s > %s", obj, obj2));
    }

    @Override // java.util.NavigableMap
    /* renamed from: zzq, reason: merged with bridge method [inline-methods] */
    public final zzru tailMap(Object obj, boolean z10) {
        obj.getClass();
        return zzs(this.zzb.zzv(obj, z10), this.zzc.size());
    }
}
