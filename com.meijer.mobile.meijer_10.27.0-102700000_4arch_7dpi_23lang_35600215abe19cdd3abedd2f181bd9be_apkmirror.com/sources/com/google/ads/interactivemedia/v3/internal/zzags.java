package com.google.ads.interactivemedia.v3.internal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public final class zzags {
    public static final zzags zza;
    public static final zzags zzb;
    public static final zzags zzc;
    public static final zzags zzd;
    public static final zzags zze;
    public static final zzags zzf;
    public static final zzags zzg;
    public static final zzags zzh;
    public static final zzags zzi;
    public static final zzags zzj;
    public static final zzags zzk;
    public static final zzags zzl;
    public static final zzags zzm;
    public static final zzags zzn;
    public static final zzags zzo;
    public static final zzags zzp;
    public static final zzags zzq;
    public static final zzags zzr;
    private static final /* synthetic */ zzags[] zzs;
    private final zzagt zzt;

    public final zzagt zza() {
        return this.zzt;
    }

    static {
        zzags zzagsVar = new zzags("DOUBLE", 0, zzagt.DOUBLE, 1);
        zza = zzagsVar;
        zzags zzagsVar2 = new zzags("FLOAT", 1, zzagt.FLOAT, 5);
        zzb = zzagsVar2;
        zzagt zzagtVar = zzagt.LONG;
        zzags zzagsVar3 = new zzags("INT64", 2, zzagtVar, 0);
        zzc = zzagsVar3;
        zzags zzagsVar4 = new zzags("UINT64", 3, zzagtVar, 0);
        zzd = zzagsVar4;
        zzagt zzagtVar2 = zzagt.INT;
        zzags zzagsVar5 = new zzags("INT32", 4, zzagtVar2, 0);
        zze = zzagsVar5;
        zzags zzagsVar6 = new zzags("FIXED64", 5, zzagtVar, 1);
        zzf = zzagsVar6;
        zzags zzagsVar7 = new zzags("FIXED32", 6, zzagtVar2, 5);
        zzg = zzagsVar7;
        zzags zzagsVar8 = new zzags("BOOL", 7, zzagt.BOOLEAN, 0);
        zzh = zzagsVar8;
        zzags zzagsVar9 = new zzags("STRING", 8, zzagt.STRING, 2);
        zzi = zzagsVar9;
        zzagt zzagtVar3 = zzagt.MESSAGE;
        zzags zzagsVar10 = new zzags("GROUP", 9, zzagtVar3, 3);
        zzj = zzagsVar10;
        zzags zzagsVar11 = new zzags("MESSAGE", 10, zzagtVar3, 2);
        zzk = zzagsVar11;
        zzags zzagsVar12 = new zzags("BYTES", 11, zzagt.BYTE_STRING, 2);
        zzl = zzagsVar12;
        zzags zzagsVar13 = new zzags("UINT32", 12, zzagtVar2, 0);
        zzm = zzagsVar13;
        zzags zzagsVar14 = new zzags("ENUM", 13, zzagt.ENUM, 0);
        zzn = zzagsVar14;
        zzags zzagsVar15 = new zzags("SFIXED32", 14, zzagtVar2, 5);
        zzo = zzagsVar15;
        zzags zzagsVar16 = new zzags("SFIXED64", 15, zzagtVar, 1);
        zzp = zzagsVar16;
        zzags zzagsVar17 = new zzags("SINT32", 16, zzagtVar2, 0);
        zzq = zzagsVar17;
        zzags zzagsVar18 = new zzags("SINT64", 17, zzagtVar, 0);
        zzr = zzagsVar18;
        zzs = new zzags[]{zzagsVar, zzagsVar2, zzagsVar3, zzagsVar4, zzagsVar5, zzagsVar6, zzagsVar7, zzagsVar8, zzagsVar9, zzagsVar10, zzagsVar11, zzagsVar12, zzagsVar13, zzagsVar14, zzagsVar15, zzagsVar16, zzagsVar17, zzagsVar18};
    }

    public static zzags[] values() {
        return (zzags[]) zzs.clone();
    }

    private zzags(String str, int i10, zzagt zzagtVar, int i11) {
        this.zzt = zzagtVar;
    }
}
