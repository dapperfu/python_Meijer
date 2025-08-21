package com.google.android.libraries.places.internal;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes6.dex */
class zzbcg extends AbstractMap {
    private Object[] zza;
    private int zzb;
    private Map zzc;
    private boolean zzd;
    private volatile zzbcf zze;
    private Map zzf;

    private zzbcg() {
        Map map = Collections.EMPTY_MAP;
        this.zzc = map;
        this.zzf = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbcg)) {
            return super.equals(obj);
        }
        zzbcg zzbcgVar = (zzbcg) obj;
        int size = size();
        if (size != zzbcgVar.size()) {
            return false;
        }
        int i10 = this.zzb;
        if (i10 != zzbcgVar.zzb) {
            return entrySet().equals(zzbcgVar.entrySet());
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!zzd(i11).equals(zzbcgVar.zzd(i11))) {
                return false;
            }
        }
        if (i10 != size) {
            return this.zzc.equals(zzbcgVar.zzc);
        }
        return true;
    }

    public final boolean zzb() {
        return this.zzd;
    }

    public final int zzc() {
        return this.zzb;
    }

    final /* synthetic */ Object[] zzi() {
        return this.zza;
    }

    final /* synthetic */ int zzj() {
        return this.zzb;
    }

    final /* synthetic */ Map zzk() {
        return this.zzc;
    }

    private final int zzm(Comparable comparable) {
        int i10 = this.zzb;
        int i11 = i10 - 1;
        int i12 = 0;
        if (i11 >= 0) {
            int iCompareTo = comparable.compareTo(((zzbcd) this.zza[i11]).zza());
            if (iCompareTo > 0) {
                return -(i10 + 1);
            }
            if (iCompareTo == 0) {
                return i11;
            }
        }
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int iCompareTo2 = comparable.compareTo(((zzbcd) this.zza[i13]).zza());
            if (iCompareTo2 < 0) {
                i11 = i13 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i13;
                }
                i12 = i13 + 1;
            }
        }
        return -(i12 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final void zzh() {
        if (this.zzd) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zzm(comparable) >= 0 || this.zzc.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.zze == null) {
            this.zze = new zzbcf(this, null);
        }
        return this.zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iZzm = zzm(comparable);
        return iZzm >= 0 ? ((zzbcd) this.zza[iZzm]).getValue() : this.zzc.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i10 = this.zzb;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += this.zza[i11].hashCode();
        }
        return this.zzc.size() > 0 ? iHashCode + this.zzc.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzb + this.zzc.size();
    }

    public void zza() {
        if (this.zzd) {
            return;
        }
        this.zzc = this.zzc.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.zzc);
        this.zzf = this.zzf.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.zzf);
        this.zzd = true;
    }

    public final Map.Entry zzd(int i10) {
        if (i10 < this.zzb) {
            return (zzbcd) this.zza[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10);
    }

    public final Iterable zze() {
        return this.zzc.isEmpty() ? Collections.EMPTY_SET : this.zzc.entrySet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final Object zzg(int i10) {
        zzh();
        Object value = ((zzbcd) this.zza[i10]).getValue();
        Object[] objArr = this.zza;
        System.arraycopy(objArr, i10 + 1, objArr, i10, (this.zzb - i10) - 1);
        this.zzb--;
        if (!this.zzc.isEmpty()) {
            Iterator it = zzo().entrySet().iterator();
            Object[] objArr2 = this.zza;
            int i11 = this.zzb;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i11] = new zzbcd(this, (Comparable) entry.getKey(), entry.getValue());
            this.zzb++;
            it.remove();
        }
        return value;
    }

    private final SortedMap zzo() {
        zzh();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzh();
        if (this.zzb != 0) {
            this.zza = null;
            this.zzb = 0;
        }
        if (!this.zzc.isEmpty()) {
            this.zzc.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzh();
        Comparable comparable = (Comparable) obj;
        int iZzm = zzm(comparable);
        if (iZzm >= 0) {
            return zzg(iZzm);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        zzh();
        int iZzm = zzm(comparable);
        if (iZzm >= 0) {
            return ((zzbcd) this.zza[iZzm]).setValue(obj);
        }
        zzh();
        if (this.zza == null) {
            this.zza = new Object[16];
        }
        int i10 = -(iZzm + 1);
        if (i10 >= 16) {
            return zzo().put(comparable, obj);
        }
        if (this.zzb == 16) {
            zzbcd zzbcdVar = (zzbcd) this.zza[15];
            this.zzb = 15;
            zzo().put(zzbcdVar.zza(), zzbcdVar.getValue());
        }
        Object[] objArr = this.zza;
        int length = objArr.length;
        System.arraycopy(objArr, i10, objArr, i10 + 1, 15 - i10);
        this.zza[i10] = new zzbcd(this, comparable, obj);
        this.zzb++;
        return null;
    }

    /* synthetic */ zzbcg(byte[] bArr) {
        Map map = Collections.EMPTY_MAP;
        this.zzc = map;
        this.zzf = map;
    }
}
