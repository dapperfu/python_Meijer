package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.sd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9403sd extends Gu0<C9403sd, C9510td> implements InterfaceC9227qv0 {
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
    private static final Qu0<EnumC9192qe> zzn = new a();
    private static final C9403sd zzo;
    private static volatile InterfaceC9868wv0<C9403sd> zzp;
    private C9083pd zzA;
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
    class a implements Qu0<EnumC9192qe> {
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
        C9403sd c9403sd = new C9403sd();
        zzo = c9403sd;
        Gu0.E(C9403sd.class, c9403sd);
    }

    public static C9510td E0() {
        return zzo.n();
    }

    public static C9403sd G0(byte[] bArr) throws zzgyg {
        return (C9403sd) Gu0.M(zzo, bArr);
    }

    private void c0() {
        Ou0 ou0 = this.zzz;
        if (ou0.zzc()) {
            return;
        }
        this.zzz = Gu0.p(ou0);
    }

    public EnumC6756Ge D0() {
        EnumC6756Ge enumC6756GeA = EnumC6756Ge.a(this.zzw);
        return enumC6756GeA == null ? EnumC6756Ge.ENUM_FALSE : enumC6756GeA;
    }

    private C9403sd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B0(EnumC6756Ge enumC6756Ge) {
        this.zzB = enumC6756Ge.zza();
        this.zzu |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0(Iterable<? extends EnumC9192qe> iterable) {
        c0();
        Iterator<? extends EnumC9192qe> it = iterable.iterator();
        while (it.hasNext()) {
            this.zzz.zzi(it.next().zza());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0(EnumC6756Ge enumC6756Ge) {
        this.zzC = enumC6756Ge.zza();
        this.zzu |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0(EnumC6756Ge enumC6756Ge) {
        this.zzD = enumC6756Ge.zza();
        this.zzu |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0(EnumC9724vd enumC9724vd) {
        this.zzG = enumC9724vd.zza();
        this.zzu |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0(C9083pd c9083pd) {
        c9083pd.getClass();
        this.zzA = c9083pd;
        this.zzu |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v0(EnumC6756Ge enumC6756Ge) {
        this.zzF = enumC6756Ge.zza();
        this.zzu |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y0(EnumC6756Ge enumC6756Ge) {
        this.zzw = enumC6756Ge.zza();
        this.zzu |= 2;
    }

    @Override // com.google.android.gms.internal.ads.Gu0
    protected final Object W(Fu0 fu0, Object obj, Object obj2) {
        InterfaceC9868wv0 bu0;
        int iOrdinal = fu0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C7095Qe c7095Qe = null;
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 6) {
                                InterfaceC9868wv0<C9403sd> interfaceC9868wv0 = zzp;
                                if (interfaceC9868wv0 == null) {
                                    synchronized (C9403sd.class) {
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
                                return interfaceC9868wv0;
                            }
                            throw null;
                        }
                        return zzo;
                    }
                    return new C9510td();
                }
                return new C9403sd();
            }
            return Gu0.x(zzo, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new Object[]{"zzu", "zzv", "zzw", EnumC6756Ge.b(), "zzx", "zzy", "zzz", EnumC9192qe.b(), "zzA", "zzB", EnumC6756Ge.b(), "zzC", EnumC6756Ge.b(), "zzD", EnumC6756Ge.b(), "zzE", "zzF", EnumC6756Ge.b(), "zzG", EnumC9724vd.b(), "zzH"});
        }
        return (byte) 1;
    }
}
