package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
final class zzzk extends zzzm {
    final /* synthetic */ boolean zza;
    final /* synthetic */ Method zzb;
    final /* synthetic */ zzwj zzc;
    final /* synthetic */ zzwj zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ boolean zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzzk(zzzq zzzqVar, String str, Field field, boolean z10, Method method, zzwj zzwjVar, zzwj zzwjVar2, boolean z11, boolean z12) {
        super(str, field);
        this.zza = z10;
        this.zzb = method;
        this.zzc = zzwjVar;
        this.zzd = zzwjVar2;
        this.zze = z11;
        this.zzf = z12;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzzm
    final void zza(zzacc zzaccVar, int i10, Object[] objArr) throws zzwa, IOException {
        Object obj = this.zzd.read(zzaccVar);
        if (obj != null || !this.zze) {
            objArr[i10] = obj;
            return;
        }
        throw new zzwa("null is not allowed as value for record component '" + this.zzi + "' of primitive type; at path " + zzaccVar.zze());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzzm
    final void zzb(zzacc zzaccVar, Object obj) throws IllegalAccessException, IOException, IllegalArgumentException {
        Object obj2 = this.zzd.read(zzaccVar);
        if (obj2 == null && this.zze) {
            return;
        }
        if (this.zza) {
            zzzq.zzb(obj, this.zzh);
        } else if (this.zzf) {
            throw new zzvx("Cannot set value of 'static final' ".concat(zzabp.zze(this.zzh, false)));
        }
        this.zzh.set(obj, obj2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzzm
    final void zzc(zzace zzaceVar, Object obj) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke;
        if (this.zza) {
            Method method = this.zzb;
            if (method == null) {
                zzzq.zzb(obj, this.zzh);
            } else {
                zzzq.zzb(obj, method);
            }
        }
        Method method2 = this.zzb;
        if (method2 != null) {
            try {
                objInvoke = method2.invoke(obj, null);
            } catch (InvocationTargetException e10) {
                throw new zzvx("Accessor " + zzabp.zze(this.zzb, false) + " threw exception", e10.getCause());
            }
        } else {
            objInvoke = this.zzh.get(obj);
        }
        if (objInvoke == obj) {
            return;
        }
        zzaceVar.zzf(this.zzg);
        this.zzc.write(zzaceVar, objInvoke);
    }
}
