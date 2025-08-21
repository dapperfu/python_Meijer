package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.sd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9528sd extends Gu0<C9528sd, C9635td> implements InterfaceC9352qv0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    public static final int zzi = 9;
    public static final int zzj = 10;
    public static final int zzk = 11;
    public static final int zzl = 12;
    public static final int zzm = 13;
    private static final Qu0<EnumC9317qe> zzn = new a();
    private static final C9528sd zzo;
    private static volatile InterfaceC9993wv0<C9528sd> zzp;
    private C9208pd zzA;
    private int zzB;
    private int zzC;
    private int zzD;
    private int zzE;
    private int zzF;
    private int zzG;
    private long zzH;
    private int zzu;
    private long zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private Ou0 zzz = Gu0.o();

    /* renamed from: com.google.android.gms.internal.ads.sd$a */
    class a implements Qu0<EnumC9317qe> {
        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0(long j10) {
        this.zzu |= RecyclerView.m.FLAG_MOVED;
        this.zzH = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0(int i10) {
        this.zzu |= 256;
        this.zzE = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0(long j10) {
        this.zzu |= 8;
        this.zzy = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x0(long j10) {
        this.zzu |= 4;
        this.zzx = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z0(long j10) {
        this.zzu |= 1;
        this.zzv = j10;
    }

    public long C0() {
        return this.zzv;
    }

    static {
        C9528sd c9528sd = new C9528sd();
        zzo = c9528sd;
        Gu0.E(C9528sd.class, c9528sd);
    }

    public static C9635td E0() {
        return zzo.n();
    }

    public static C9528sd G0(byte[] bArr) throws zzgyg {
        return (C9528sd) Gu0.M(zzo, bArr);
    }

    private void c0() {
        Ou0 ou0 = this.zzz;
        if (ou0.zzc()) {
            return;
        }
        this.zzz = Gu0.p(ou0);
    }

    public EnumC6881Ge D0() {
        EnumC6881Ge enumC6881GeA = EnumC6881Ge.a(this.zzw);
        return enumC6881GeA == null ? EnumC6881Ge.ENUM_FALSE : enumC6881GeA;
    }

    private C9528sd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B0(EnumC6881Ge enumC6881Ge) {
        this.zzB = enumC6881Ge.zza();
        this.zzu |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0(Iterable<? extends EnumC9317qe> iterable) {
        c0();
        Iterator<? extends EnumC9317qe> it = iterable.iterator();
        while (it.hasNext()) {
            this.zzz.zzi(it.next().zza());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0(EnumC6881Ge enumC6881Ge) {
        this.zzC = enumC6881Ge.zza();
        this.zzu |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0(EnumC6881Ge enumC6881Ge) {
        this.zzD = enumC6881Ge.zza();
        this.zzu |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0(EnumC9849vd enumC9849vd) {
        this.zzG = enumC9849vd.zza();
        this.zzu |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0(C9208pd c9208pd) {
        c9208pd.getClass();
        this.zzA = c9208pd;
        this.zzu |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v0(EnumC6881Ge enumC6881Ge) {
        this.zzF = enumC6881Ge.zza();
        this.zzu |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y0(EnumC6881Ge enumC6881Ge) {
        this.zzw = enumC6881Ge.zza();
        this.zzu |= 2;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9993wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C7220Qe c7220Qe = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9993wv0<C9528sd> interfaceC9993wv0 = zzp;
                                if (interfaceC9993wv0 == null) {
                                    synchronized (C9528sd.class) {
                                        try {
                                            bu0 = zzp;
                                            if (bu0 == null) {
                                                bu0 = new Bu0(zzo);
                                                zzp = bu0;
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
                        return zzo;
                    }
                    return new C9635td();
                }
                return new C9528sd();
            }
            return Gu0.x(zzo, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new Object[]{"zzu", "zzv", "zzw", EnumC6881Ge.b(), "zzx", "zzy", "zzz", EnumC9317qe.b(), "zzA", "zzB", EnumC6881Ge.b(), "zzC", EnumC6881Ge.b(), "zzD", EnumC6881Ge.b(), "zzE", "zzF", EnumC6881Ge.b(), "zzG", EnumC9849vd.b(), "zzH"});
        }
        return (byte) 1;
    }
}
