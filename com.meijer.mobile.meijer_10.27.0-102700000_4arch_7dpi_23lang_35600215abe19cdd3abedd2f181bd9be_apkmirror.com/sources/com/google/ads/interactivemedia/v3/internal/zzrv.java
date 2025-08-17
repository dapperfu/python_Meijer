package com.google.ads.interactivemedia.v3.internal;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* loaded from: classes4.dex */
public abstract class zzrv extends zzrr implements NavigableSet, zzsq {
    final transient Comparator zza;
    transient zzrv zzb;

    @Override // java.util.SortedSet, com.google.ads.interactivemedia.v3.internal.zzsq
    public final Comparator comparator() {
        return this.zza;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        obj.getClass();
        return zzo(obj, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        obj.getClass();
        return zzr(obj, true);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrr, com.google.ads.interactivemedia.v3.internal.zzri, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zze */
    public abstract zzss iterator();

    abstract zzrv zzh();

    abstract zzrv zzo(Object obj, boolean z10);

    abstract zzrv zzq(Object obj, boolean z10, Object obj2, boolean z11);

    abstract zzrv zzr(Object obj, boolean z10);

    @Override // java.util.NavigableSet
    /* renamed from: zzt, reason: merged with bridge method [inline-methods] */
    public abstract zzss descendingIterator();

    static zzsl zzs(Comparator comparator) {
        if (zzsb.zza.equals(comparator)) {
            return zzsl.zzc;
        }
        int i10 = zzrm.zzd;
        return new zzsl(zzse.zza, comparator);
    }

    @Deprecated
    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    /* renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final zzrv descendingSet() {
        zzrv zzrvVar = this.zzb;
        if (zzrvVar != null) {
            return zzrvVar;
        }
        zzrv zzrvVarZzh = zzh();
        this.zzb = zzrvVarZzh;
        zzrvVarZzh.zzb = this;
        return zzrvVarZzh;
    }

    zzrv(Comparator comparator) {
        this.zza = comparator;
    }

    @Override // java.util.NavigableSet
    public Object ceiling(Object obj) {
        obj.getClass();
        return zzrw.zza(zzr(obj, true), null);
    }

    @Override // java.util.SortedSet
    public Object first() {
        return iterator().next();
    }

    @Override // java.util.NavigableSet
    public Object floor(Object obj) {
        obj.getClass();
        return zzry.zza(zzo(obj, true).descendingIterator(), null);
    }

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet
    public final /* synthetic */ NavigableSet headSet(Object obj, boolean z10) {
        obj.getClass();
        return zzo(obj, z10);
    }

    @Override // java.util.NavigableSet
    public Object higher(Object obj) {
        obj.getClass();
        return zzrw.zza(zzr(obj, false), null);
    }

    @Override // java.util.SortedSet
    public Object last() {
        return descendingIterator().next();
    }

    @Override // java.util.NavigableSet
    public Object lower(Object obj) {
        obj.getClass();
        return zzry.zza(zzo(obj, false).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    public final /* synthetic */ NavigableSet tailSet(Object obj, boolean z10) {
        obj.getClass();
        return zzr(obj, z10);
    }

    @Override // java.util.NavigableSet
    /* renamed from: zzp, reason: merged with bridge method [inline-methods] */
    public final zzrv subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        boolean z12;
        obj.getClass();
        obj2.getClass();
        if (this.zza.compare(obj, obj2) <= 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        zzqh.zzd(z12);
        return zzq(obj, z10, obj2, z11);
    }
}
