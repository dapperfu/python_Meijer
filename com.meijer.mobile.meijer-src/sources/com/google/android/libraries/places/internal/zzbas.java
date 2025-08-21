package com.google.android.libraries.places.internal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes6.dex */
public final class zzbas {
    public static final zzbas zza;
    public static final zzbas zzb;
    public static final zzbas zzc;
    public static final zzbas zzd;
    public static final zzbas zze;
    public static final zzbas zzf;
    public static final zzbas zzg;
    public static final zzbas zzh;
    public static final zzbas zzi;
    public static final zzbas zzj;
    private static final /* synthetic */ zzbas[] zzl;
    private final Class zzk;

    public final Class zza() {
        return this.zzk;
    }

    static {
        zzbas zzbasVar = new zzbas("VOID", 0, Void.class, Void.class, null);
        zza = zzbasVar;
        Class cls = Integer.TYPE;
        zzbas zzbasVar2 = new zzbas("INT", 1, cls, Integer.class, 0);
        zzb = zzbasVar2;
        zzbas zzbasVar3 = new zzbas("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzbasVar3;
        zzbas zzbasVar4 = new zzbas("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzbasVar4;
        zzbas zzbasVar5 = new zzbas("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzbasVar5;
        zzbas zzbasVar6 = new zzbas("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzbasVar6;
        zzbas zzbasVar7 = new zzbas("STRING", 6, String.class, String.class, "");
        zzg = zzbasVar7;
        zzbas zzbasVar8 = new zzbas("BYTE_STRING", 7, zzayz.class, zzayz.class, zzayz.zzb);
        zzh = zzbasVar8;
        zzbas zzbasVar9 = new zzbas("ENUM", 8, cls, Integer.class, null);
        zzi = zzbasVar9;
        zzbas zzbasVar10 = new zzbas("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzbasVar10;
        zzl = new zzbas[]{zzbasVar, zzbasVar2, zzbasVar3, zzbasVar4, zzbasVar5, zzbasVar6, zzbasVar7, zzbasVar8, zzbasVar9, zzbasVar10};
    }

    public static zzbas[] values() {
        return (zzbas[]) zzl.clone();
    }

    private zzbas(String str, int i10, Class cls, Class cls2, Object obj) {
        this.zzk = cls2;
    }
}
