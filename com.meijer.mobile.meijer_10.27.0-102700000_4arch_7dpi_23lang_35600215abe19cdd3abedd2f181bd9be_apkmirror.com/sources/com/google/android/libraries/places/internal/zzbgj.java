package com.google.android.libraries.places.internal;

import Be.i;
import Be.p;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class zzbgj {
    static final i zza = i.g(',');
    private static final zzbgj zzb = new zzbgj(zzbfs.zza, false, new zzbgj(new zzbfr(), true, new zzbgj()));
    private final Map zzc;
    private final byte[] zzd;

    private zzbgj() {
        this.zzc = new LinkedHashMap(0);
        this.zzd = new byte[0];
    }

    public static zzbgj zza() {
        return zzb;
    }

    final byte[] zzb() {
        return this.zzd;
    }

    private zzbgj(zzbgh zzbghVar, boolean z10, zzbgj zzbgjVar) {
        String strZza = zzbghVar.zza();
        p.e(!strZza.contains(","), "Comma is currently not allowed in message encoding");
        int size = zzbgjVar.zzc.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(zzbgjVar.zzc.containsKey(zzbghVar.zza()) ? size : size + 1);
        for (zzbgi zzbgiVar : zzbgjVar.zzc.values()) {
            String strZza2 = zzbgiVar.zza.zza();
            if (!strZza2.equals(strZza)) {
                linkedHashMap.put(strZza2, new zzbgi(zzbgiVar.zza, zzbgiVar.zzb));
            }
        }
        linkedHashMap.put(strZza, new zzbgi(zzbghVar, z10));
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        this.zzc = mapUnmodifiableMap;
        i iVar = zza;
        HashSet hashSet = new HashSet(mapUnmodifiableMap.size());
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            if (((zzbgi) entry.getValue()).zzb) {
                hashSet.add((String) entry.getKey());
            }
        }
        this.zzd = iVar.e(Collections.unmodifiableSet(hashSet)).getBytes(Charset.forName("US-ASCII"));
    }

    public final zzbgh zzc(String str) {
        zzbgi zzbgiVar = (zzbgi) this.zzc.get(str);
        if (zzbgiVar != null) {
            return zzbgiVar.zza;
        }
        return null;
    }
}
