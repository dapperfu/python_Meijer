package com.google.ads.interactivemedia.v3.internal;

import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes4.dex */
public final class zzyx implements zzwk {
    private static final zzwk zza;
    private static final zzwk zzb;
    private final zzxl zzc;
    private final ConcurrentMap zzd = new ConcurrentHashMap();

    static {
        zzyv zzyvVar = null;
        zza = new zzyw(zzyvVar);
        zzb = new zzyw(zzyvVar);
    }

    private final zzwk zzd(Class cls, zzwk zzwkVar) {
        zzwk zzwkVar2 = (zzwk) this.zzd.putIfAbsent(cls, zzwkVar);
        return zzwkVar2 != null ? zzwkVar2 : zzwkVar;
    }

    private static zzwl zze(Class cls) {
        return (zzwl) cls.getAnnotation(zzwl.class);
    }

    public zzyx(zzxl zzxlVar) {
        this.zzc = zzxlVar;
    }

    private static Object zzf(zzxl zzxlVar, Class cls) {
        return zzxlVar.zza(zzaca.zza(cls)).zza();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwk
    public final zzwj zza(zzvr zzvrVar, zzaca zzacaVar) {
        zzwl zzwlVarZze = zze(zzacaVar.zzc());
        if (zzwlVarZze == null) {
            return null;
        }
        return zzb(this.zzc, zzvrVar, zzacaVar, zzwlVarZze, true);
    }

    final zzwj zzb(zzxl zzxlVar, zzvr zzvrVar, zzaca zzacaVar, zzwl zzwlVar, boolean z10) {
        zzwd zzwdVar;
        zzwk zzwkVar;
        zzwj zzwjVarZza;
        Object objZzf = zzf(zzxlVar, zzwlVar.zza());
        boolean z11 = objZzf instanceof zzwj;
        boolean zZzb = zzwlVar.zzb();
        if (z11) {
            zzwjVarZza = (zzwj) objZzf;
        } else if (objZzf instanceof zzwk) {
            zzwk zzwkVarZzd = (zzwk) objZzf;
            if (z10) {
                zzwkVarZzd = zzd(zzacaVar.zzc(), zzwkVarZzd);
            }
            zzwjVarZza = zzwkVarZzd.zza(zzvrVar, zzacaVar);
        } else {
            zzvv zzvvVar = null;
            if (!(objZzf instanceof zzwd)) {
                if (objZzf instanceof zzvv) {
                    zzwdVar = null;
                } else {
                    throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objZzf.getClass().getName() + " as a @JsonAdapter for " + zzacaVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                }
            } else {
                zzwdVar = (zzwd) objZzf;
            }
            if (objZzf instanceof zzvv) {
                zzvvVar = (zzvv) objZzf;
            }
            zzvv zzvvVar2 = zzvvVar;
            if (z10) {
                zzwkVar = zza;
            } else {
                zzwkVar = zzb;
            }
            zzzv zzzvVar = new zzzv(zzwdVar, zzvvVar2, zzvrVar, zzacaVar, zzwkVar, zZzb);
            zZzb = false;
            zzwjVarZza = zzzvVar;
        }
        if (zzwjVarZza != null && zZzb) {
            return zzwjVarZza.nullSafe();
        }
        return zzwjVarZza;
    }

    public final boolean zzc(zzaca zzacaVar, zzwk zzwkVar) {
        Objects.requireNonNull(zzacaVar);
        Objects.requireNonNull(zzwkVar);
        if (zzwkVar == zza) {
            return true;
        }
        Class clsZzc = zzacaVar.zzc();
        zzwk zzwkVar2 = (zzwk) this.zzd.get(clsZzc);
        if (zzwkVar2 != null) {
            if (zzwkVar2 == zzwkVar) {
                return true;
            }
            return false;
        }
        zzwl zzwlVarZze = zze(clsZzc);
        if (zzwlVarZze == null) {
            return false;
        }
        Class clsZza = zzwlVarZze.zza();
        if (zzwk.class.isAssignableFrom(clsZza) && zzd(clsZzc, (zzwk) zzf(this.zzc, clsZza)) == zzwkVar) {
            return true;
        }
        return false;
    }
}
