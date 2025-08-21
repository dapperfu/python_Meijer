package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
public final class zzahv extends zzahw {
    private static final zzahv zzc = new zzahv(null, null);
    public final Object zza;
    public final Object zzb;

    public zzahv(Object obj, Object obj2) {
        this.zza = obj;
        this.zzb = obj2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzahw
    public final Object zza() {
        return this.zza;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzahw
    public final Object zzb() {
        return this.zzb;
    }

    public static zzahv zzc(Object obj, Object obj2) {
        return (obj == null && obj2 == null) ? zzc : new zzahv(obj, obj2);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
