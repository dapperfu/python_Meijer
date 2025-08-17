package com.google.android.libraries.places.internal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zza' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes6.dex */
public final class zzbpd {
    public static final zzbpd zza;
    public static final zzbpd zzb;
    public static final zzbpd zzc;
    public static final zzbpd zzd;
    public static final zzbpd zze;
    public static final zzbpd zzf;
    public static final zzbpd zzg;
    public static final zzbpd zzh;
    public static final zzbpd zzi;
    public static final zzbpd zzj;
    public static final zzbpd zzk;
    public static final zzbpd zzl;
    public static final zzbpd zzm;
    public static final zzbpd zzn;
    private static final zzbpd[] zzo;
    private static final /* synthetic */ zzbpd[] zzr;
    private final int zzp;
    private final zzbjv zzq;

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkArrayForEach(LoopRegionVisitor.java:230)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkForIndexedLoop(LoopRegionVisitor.java:144)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.processLoopRegion(LoopRegionVisitor.java:81)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.enterRegion(LoopRegionVisitor.java:65)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:55)
        */
    static {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbpd.<clinit>():void");
    }

    public static zzbpd[] values() {
        return (zzbpd[]) zzr.clone();
    }

    public static zzbjv zza(long j10) {
        zzbpd[] zzbpdVarArr = zzo;
        zzbpd zzbpdVar = null;
        if (j10 < zzbpdVarArr.length && j10 >= 0) {
            zzbpdVar = zzbpdVarArr[(int) j10];
        }
        if (zzbpdVar != null) {
            return zzbpdVar.zzq;
        }
        zzbjv zzbjvVarZza = zzbjv.zza(zzc.zzq.zzg().zza());
        StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 32);
        sb2.append("Unrecognized HTTP/2 error code: ");
        sb2.append(j10);
        return zzbjvVarZza.zze(sb2.toString());
    }

    private zzbpd(String str, int i10, int i11, zzbjv zzbjvVar) {
        this.zzp = i11;
        String strConcat = "HTTP/2 error code: ".concat(String.valueOf(name()));
        if (zzbjvVar.zzh() != null) {
            String strZzh = zzbjvVar.zzh();
            StringBuilder sb2 = new StringBuilder(strConcat.length() + 2 + String.valueOf(strZzh).length() + 1);
            sb2.append(strConcat);
            sb2.append(" (");
            sb2.append(strZzh);
            sb2.append(")");
            strConcat = sb2.toString();
        }
        this.zzq = zzbjvVar.zze(strConcat);
    }
}
