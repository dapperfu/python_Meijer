package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.d90, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7886d90 extends Gu0 implements InterfaceC9352qv0 {
    private static final C7886d90 zza;
    private static volatile InterfaceC9993wv0 zzb;
    private int zzA;
    private int zzE;
    private int zzF;
    private int zzG;
    private long zzH;
    private int zzI;
    private int zzP;
    private int zzQ;
    private int zzS;
    private long zzab;
    private int zzad;
    private int zzae;
    private int zzaf;
    private C90 zzag;
    private int zzah;
    private C10236z90 zzai;
    private C8739l90 zzaj;
    private C9487s90 zzak;
    private C9060o90 zzal;
    private int zzc;
    private int zzd;
    private int zze;
    private long zzg;
    private long zzh;
    private long zzi;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private String zzf = "";
    private Ou0 zzj = Gu0.o();
    private String zzu = "";
    private String zzv = "";
    private String zzw = "";
    private String zzx = "";
    private String zzy = "";
    private String zzz = "";
    private String zzB = "";
    private String zzC = "";
    private Ru0 zzD = Gu0.q();
    private String zzJ = "";
    private String zzK = "";
    private String zzL = "";
    private String zzM = "";
    private String zzN = "";
    private String zzO = "";
    private String zzR = "";
    private String zzT = "";
    private String zzU = "";
    private String zzV = "";
    private String zzW = "";
    private String zzX = "";
    private String zzY = "";
    private String zzZ = "";
    private String zzaa = "";
    private String zzac = "";

    static /* synthetic */ void w0(C7886d90 c7886d90, int i10) {
        if (i10 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        c7886d90.zzI = i10 - 2;
    }

    static /* synthetic */ void y0(C7886d90 c7886d90, int i10) {
        if (i10 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        c7886d90.zzE = i10 - 2;
    }

    static {
        C7886d90 c7886d90 = new C7886d90();
        zza = c7886d90;
        Gu0.E(C7886d90.class, c7886d90);
    }

    public static C7566a90 b0() {
        return (C7566a90) zza.n();
    }

    static /* synthetic */ void d0(C7886d90 c7886d90, Iterable iterable) {
        Ru0 ru0 = c7886d90.zzD;
        if (!ru0.zzc()) {
            c7886d90.zzD = Gu0.r(ru0);
        }
        Ht0.g(iterable, c7886d90.zzD);
    }

    private C7886d90() {
    }

    static /* synthetic */ void e0(C7886d90 c7886d90, String str) {
        str.getClass();
        c7886d90.zzx = str;
    }

    static /* synthetic */ void f0(C7886d90 c7886d90, String str) {
        str.getClass();
        c7886d90.zzJ = str;
    }

    static /* synthetic */ void g0(C7886d90 c7886d90, String str) {
        str.getClass();
        c7886d90.zzaa = str;
    }

    static /* synthetic */ void i0(C7886d90 c7886d90, String str) {
        str.getClass();
        c7886d90.zzK = str;
    }

    static /* synthetic */ void k0(C7886d90 c7886d90, String str) {
        str.getClass();
        c7886d90.zzV = str;
    }

    static /* synthetic */ void n0(C7886d90 c7886d90, String str) {
        str.getClass();
        c7886d90.zzz = str;
    }

    static /* synthetic */ void o0(C7886d90 c7886d90, String str) {
        str.getClass();
        c7886d90.zzX = str;
    }

    static /* synthetic */ void q0(C7886d90 c7886d90, String str) {
        str.getClass();
        c7886d90.zzu = str;
    }

    static /* synthetic */ void r0(C7886d90 c7886d90, String str) {
        str.getClass();
        c7886d90.zzZ = str;
    }

    static /* synthetic */ void v0(C7886d90 c7886d90, String str) {
        str.getClass();
        c7886d90.zzY = str;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9993wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C7779c90 c7779c90 = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9993wv0 interfaceC9993wv0 = zzb;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (C7886d90.class) {
                                        try {
                                            bu0 = zzb;
                                            if (bu0 == null) {
                                                bu0 = new Bu0(zza);
                                                zzb = bu0;
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                    return bu0;
                                }
                                return interfaceC9993wv0;
                            }
                            throw null;
                        }
                        return zza;
                    }
                    return new C7566a90(c7779c90);
                }
                return new C7886d90();
            }
            return Gu0.x(zza, "\u00049\u0000\u0001\u000199\u0000\u0002\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015Ȉ\u0016Ȉ\u0017Ȉ\u0018Ȉ\u0019%\u001aȈ\u001bȈ\u001cȈ\u001d\u0002\u001eȈ\u001f\u0002 \u0002!\u0002\"\u0002#\u0002$\u0002%,&\f'\f(\f)ဉ\u0001*ဉ\u0002+\u0004,Ȉ-Ȉ.Ȉ/\f0\u00041\u00042Ȉ3Ȉ4ဉ\u00035\f6ဉ\u00047Ȉ8\u00049ဉ\u0000", new Object[]{"zzc", "zzd", "zzk", "zzl", "zzp", "zzu", "zzx", "zzz", "zzA", "zzE", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzV", "zzW", "zzX", "zzY", "zzZ", "zzaa", "zzv", "zzw", "zzB", "zzC", "zzD", "zzL", "zzM", "zzU", "zzab", "zzf", "zzg", "zzh", "zzi", "zzm", "zzn", "zzo", "zzj", "zzae", "zzaf", "zze", "zzai", "zzaj", "zzP", "zzR", "zzO", "zzN", "zzah", "zzQ", "zzS", "zzT", "zzy", "zzak", "zzF", "zzal", "zzac", "zzad", "zzag"});
        }
        return (byte) 1;
    }
}
