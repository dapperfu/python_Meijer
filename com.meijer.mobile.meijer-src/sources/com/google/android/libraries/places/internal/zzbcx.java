package com.google.android.libraries.places.internal;

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
/* loaded from: classes6.dex */
public final class zzbcx {
    public static final zzbcx zza;
    public static final zzbcx zzb;
    public static final zzbcx zzc;
    public static final zzbcx zzd;
    public static final zzbcx zze;
    public static final zzbcx zzf;
    public static final zzbcx zzg;
    public static final zzbcx zzh;
    public static final zzbcx zzi;
    public static final zzbcx zzj;
    public static final zzbcx zzk;
    public static final zzbcx zzl;
    public static final zzbcx zzm;
    public static final zzbcx zzn;
    public static final zzbcx zzo;
    public static final zzbcx zzp;
    public static final zzbcx zzq;
    public static final zzbcx zzr;
    private static final /* synthetic */ zzbcx[] zzt;
    private final zzbcy zzs;

    public final zzbcy zza() {
        return this.zzs;
    }

    static {
        zzbcx zzbcxVar = new zzbcx("DOUBLE", 0, zzbcy.DOUBLE, 1);
        zza = zzbcxVar;
        zzbcx zzbcxVar2 = new zzbcx("FLOAT", 1, zzbcy.FLOAT, 5);
        zzb = zzbcxVar2;
        zzbcy zzbcyVar = zzbcy.LONG;
        zzbcx zzbcxVar3 = new zzbcx("INT64", 2, zzbcyVar, 0);
        zzc = zzbcxVar3;
        zzbcx zzbcxVar4 = new zzbcx("UINT64", 3, zzbcyVar, 0);
        zzd = zzbcxVar4;
        zzbcy zzbcyVar2 = zzbcy.INT;
        zzbcx zzbcxVar5 = new zzbcx("INT32", 4, zzbcyVar2, 0);
        zze = zzbcxVar5;
        zzbcx zzbcxVar6 = new zzbcx("FIXED64", 5, zzbcyVar, 1);
        zzf = zzbcxVar6;
        zzbcx zzbcxVar7 = new zzbcx("FIXED32", 6, zzbcyVar2, 5);
        zzg = zzbcxVar7;
        zzbcx zzbcxVar8 = new zzbcx("BOOL", 7, zzbcy.BOOLEAN, 0);
        zzh = zzbcxVar8;
        zzbcx zzbcxVar9 = new zzbcx("STRING", 8, zzbcy.STRING, 2);
        zzi = zzbcxVar9;
        zzbcy zzbcyVar3 = zzbcy.MESSAGE;
        zzbcx zzbcxVar10 = new zzbcx("GROUP", 9, zzbcyVar3, 3);
        zzj = zzbcxVar10;
        zzbcx zzbcxVar11 = new zzbcx("MESSAGE", 10, zzbcyVar3, 2);
        zzk = zzbcxVar11;
        zzbcx zzbcxVar12 = new zzbcx("BYTES", 11, zzbcy.BYTE_STRING, 2);
        zzl = zzbcxVar12;
        zzbcx zzbcxVar13 = new zzbcx("UINT32", 12, zzbcyVar2, 0);
        zzm = zzbcxVar13;
        zzbcx zzbcxVar14 = new zzbcx("ENUM", 13, zzbcy.ENUM, 0);
        zzn = zzbcxVar14;
        zzbcx zzbcxVar15 = new zzbcx("SFIXED32", 14, zzbcyVar2, 5);
        zzo = zzbcxVar15;
        zzbcx zzbcxVar16 = new zzbcx("SFIXED64", 15, zzbcyVar, 1);
        zzp = zzbcxVar16;
        zzbcx zzbcxVar17 = new zzbcx("SINT32", 16, zzbcyVar2, 0);
        zzq = zzbcxVar17;
        zzbcx zzbcxVar18 = new zzbcx("SINT64", 17, zzbcyVar, 0);
        zzr = zzbcxVar18;
        zzt = new zzbcx[]{zzbcxVar, zzbcxVar2, zzbcxVar3, zzbcxVar4, zzbcxVar5, zzbcxVar6, zzbcxVar7, zzbcxVar8, zzbcxVar9, zzbcxVar10, zzbcxVar11, zzbcxVar12, zzbcxVar13, zzbcxVar14, zzbcxVar15, zzbcxVar16, zzbcxVar17, zzbcxVar18};
    }

    public static zzbcx[] values() {
        return (zzbcx[]) zzt.clone();
    }

    private zzbcx(String str, int i10, zzbcy zzbcyVar, int i11) {
        this.zzs = zzbcyVar;
    }
}
