package com.google.ads.interactivemedia.v3.internal;

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
/* loaded from: classes4.dex */
public final class zzaeh {
    public static final zzaeh zza;
    public static final zzaeh zzb;
    public static final zzaeh zzc;
    public static final zzaeh zzd;
    public static final zzaeh zze;
    public static final zzaeh zzf;
    public static final zzaeh zzg;
    public static final zzaeh zzh;
    public static final zzaeh zzi;
    public static final zzaeh zzj;
    private static final /* synthetic */ zzaeh[] zzk;
    private final Class zzl;

    public final Class zza() {
        return this.zzl;
    }

    static {
        zzaeh zzaehVar = new zzaeh("VOID", 0, Void.class, Void.class, null);
        zza = zzaehVar;
        Class cls = Integer.TYPE;
        zzaeh zzaehVar2 = new zzaeh("INT", 1, cls, Integer.class, 0);
        zzb = zzaehVar2;
        zzaeh zzaehVar3 = new zzaeh("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzaehVar3;
        zzaeh zzaehVar4 = new zzaeh("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzaehVar4;
        zzaeh zzaehVar5 = new zzaeh("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzaehVar5;
        zzaeh zzaehVar6 = new zzaeh("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzaehVar6;
        zzaeh zzaehVar7 = new zzaeh("STRING", 6, String.class, String.class, "");
        zzg = zzaehVar7;
        zzaeh zzaehVar8 = new zzaeh("BYTE_STRING", 7, zzacw.class, zzacw.class, zzacw.zzb);
        zzh = zzaehVar8;
        zzaeh zzaehVar9 = new zzaeh("ENUM", 8, cls, Integer.class, null);
        zzi = zzaehVar9;
        zzaeh zzaehVar10 = new zzaeh("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzaehVar10;
        zzk = new zzaeh[]{zzaehVar, zzaehVar2, zzaehVar3, zzaehVar4, zzaehVar5, zzaehVar6, zzaehVar7, zzaehVar8, zzaehVar9, zzaehVar10};
    }

    public static zzaeh[] values() {
        return (zzaeh[]) zzk.clone();
    }

    private zzaeh(String str, int i10, Class cls, Class cls2, Object obj) {
        this.zzl = cls2;
    }
}
