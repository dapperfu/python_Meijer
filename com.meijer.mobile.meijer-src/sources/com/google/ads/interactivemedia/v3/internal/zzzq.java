package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzzq implements zzwk {
    private final zzxl zza;
    private final zzxn zzb;
    private final zzyx zzc;
    private final List zzd;
    private final int zze;

    public zzzq(zzxl zzxlVar, int i10, zzxn zzxnVar, zzyx zzyxVar, List list) {
        this.zza = zzxlVar;
        this.zze = i10;
        this.zzb = zzxnVar;
        this.zzc = zzyxVar;
        this.zzd = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* bridge */ /* synthetic */ void zzb(Object obj, AccessibleObject accessibleObject) {
        if (true == Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!zzyf.zza(accessibleObject, obj)) {
            throw new zzvx(zzabp.zze(accessibleObject, true).concat(" is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b4  */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.ads.interactivemedia.v3.internal.zzzo zzc(com.google.ads.interactivemedia.v3.internal.zzvr r26, com.google.ads.interactivemedia.v3.internal.zzaca r27, java.lang.Class r28, boolean r29, boolean r30) throws com.google.ads.interactivemedia.v3.internal.zzvx, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzzq.zzc(com.google.ads.interactivemedia.v3.internal.zzvr, com.google.ads.interactivemedia.v3.internal.zzaca, java.lang.Class, boolean, boolean):com.google.ads.interactivemedia.v3.internal.zzzo");
    }

    private static IllegalArgumentException zzd(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + zzabp.zzd(field) + " and " + zzabp.zzd(field2) + "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#duplicate-fields");
    }

    private final boolean zze(Field field, boolean z10) {
        return !this.zzb.zzd(field, z10);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwk
    public final zzwj zza(zzvr zzvrVar, zzaca zzacaVar) {
        boolean z10;
        Class clsZzc = zzacaVar.zzc();
        if (!Object.class.isAssignableFrom(clsZzc)) {
            return null;
        }
        if (zzabp.zzj(clsZzc)) {
            return new zzzj(this);
        }
        int iZzb = zzyf.zzb(this.zzd, clsZzc);
        if (iZzb != 4) {
            if (iZzb == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = z10;
            if (zzabp.zzk(clsZzc)) {
                return new zzzp(clsZzc, zzc(zzvrVar, zzacaVar, clsZzc, z11, true), z11);
            }
            return new zzzn(this.zza.zza(zzacaVar), zzc(zzvrVar, zzacaVar, clsZzc, z11, false));
        }
        throw new zzvx("ReflectionAccessFilter does not permit using reflection for " + String.valueOf(clsZzc) + ". Register a TypeAdapter for this type or adjust the access filter.");
    }
}
