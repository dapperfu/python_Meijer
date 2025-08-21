package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* loaded from: classes4.dex */
final class zzzw<T> extends zzwj<T> {
    private final zzvr zza;
    private final zzwj zzb;
    private final Type zzc;

    zzzw(zzvr zzvrVar, zzwj zzwjVar, Type type) {
        this.zza = zzvrVar;
        this.zzb = zzwjVar;
        this.zzc = type;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final T read(zzacc zzaccVar) throws IOException {
        return (T) this.zzb.read(zzaccVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.reflect.Type] */
    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final void write(zzace zzaceVar, T t10) throws IOException {
        zzwj zzwjVarZza;
        ?? r02 = this.zzc;
        Class<?> cls = (t10 == null || !((r02 instanceof Class) || (r02 instanceof TypeVariable))) ? r02 : t10.getClass();
        zzwj zzwjVarZza2 = this.zzb;
        if (cls != r02) {
            zzwjVarZza2 = this.zza.zza(zzaca.zzb(cls));
            if (zzwjVarZza2 instanceof zzzl) {
                zzwj zzwjVar = this.zzb;
                while ((zzwjVar instanceof zzzr) && (zzwjVarZza = ((zzzr) zzwjVar).zza()) != zzwjVar) {
                    zzwjVar = zzwjVarZza;
                }
                if (!(zzwjVar instanceof zzzl)) {
                    zzwjVarZza2 = this.zzb;
                }
            }
        }
        zzwjVarZza2.write(zzaceVar, t10);
    }
}
