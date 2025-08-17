package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Ws, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7314Ws extends AbstractC10073yr implements Pu0, SA0 {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f71175w = 0;

    /* renamed from: c, reason: collision with root package name */
    private final Context f71176c;

    /* renamed from: d, reason: collision with root package name */
    private final C6774Gs f71177d;

    /* renamed from: e, reason: collision with root package name */
    private final NG0 f71178e;

    /* renamed from: f, reason: collision with root package name */
    private final C6773Gr f71179f;

    /* renamed from: g, reason: collision with root package name */
    private final WeakReference f71180g;

    /* renamed from: h, reason: collision with root package name */
    private final HF0 f71181h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC8167gz0 f71182i;

    /* renamed from: j, reason: collision with root package name */
    private ByteBuffer f71183j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f71184k;

    /* renamed from: l, reason: collision with root package name */
    private InterfaceC9966xr f71185l;

    /* renamed from: m, reason: collision with root package name */
    private int f71186m;

    /* renamed from: n, reason: collision with root package name */
    private int f71187n;

    /* renamed from: o, reason: collision with root package name */
    private long f71188o;

    /* renamed from: p, reason: collision with root package name */
    private final String f71189p;

    /* renamed from: q, reason: collision with root package name */
    private final int f71190q;

    /* renamed from: s, reason: collision with root package name */
    private Integer f71192s;

    /* renamed from: t, reason: collision with root package name */
    private final ArrayList f71193t;

    /* renamed from: u, reason: collision with root package name */
    private volatile C6842Is f71194u;

    /* renamed from: r, reason: collision with root package name */
    private final Object f71191r = new Object();

    /* renamed from: v, reason: collision with root package name */
    private final Set f71195v = new HashSet();

    @Override // com.google.android.gms.internal.ads.AbstractC10073yr
    public final void C(InterfaceC9966xr interfaceC9966xr) {
        this.f71185l = interfaceC9966xr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10073yr
    public final void G(Integer num) {
        this.f71192s = num;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10073yr
    public final boolean M() {
        return this.f71182i != null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10073yr
    public final int N() {
        return this.f71187n;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10073yr
    public final long S() {
        return this.f71186m;
    }

    final /* synthetic */ InterfaceC9305rh0 W(String str, boolean z10) {
        C7314Ws c7314Ws = true != z10 ? null : this;
        C6773Gr c6773Gr = this.f71179f;
        return new C7413Zs(str, c7314Ws, c6773Gr.f67280d, c6773Gr.f67281e, c6773Gr.f67289m, c6773Gr.f67290n);
    }

    final /* synthetic */ InterfaceC9305rh0 X(String str, boolean z10) {
        C7314Ws c7314Ws = true != z10 ? null : this;
        C6773Gr c6773Gr = this.f71179f;
        C6740Fs c6740Fs = new C6740Fs(str, c7314Ws, c6773Gr.f67280d, c6773Gr.f67281e, c6773Gr.f67284h);
        this.f71195v.add(new WeakReference(c6740Fs));
        return c6740Fs;
    }

    @Override // com.google.android.gms.internal.ads.SA0
    public final /* synthetic */ void a(QA0 qa0, WE0 we0) {
    }

    @Override // com.google.android.gms.internal.ads.SA0
    public final /* synthetic */ void b(InterfaceC7494aj interfaceC7494aj, RA0 ra0) {
    }

    @Override // com.google.android.gms.internal.ads.Pu0
    public final void c(InterfaceC9305rh0 interfaceC9305rh0, C8030fk0 c8030fk0, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.SA0
    public final /* synthetic */ void h(QA0 qa0, int i10, long j10, long j11) {
    }

    @Override // com.google.android.gms.internal.ads.SA0
    public final void k(QA0 qa0, int i10, long j10) {
        this.f71187n += i10;
    }

    @Override // com.google.android.gms.internal.ads.Pu0
    public final void l(InterfaceC9305rh0 interfaceC9305rh0, C8030fk0 c8030fk0, boolean z10, int i10) {
        this.f71186m += i10;
    }

    @Override // com.google.android.gms.internal.ads.SA0
    public final /* synthetic */ void n(QA0 qa0, C7492ai c7492ai, C7492ai c7492ai2, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.SA0
    public final /* synthetic */ void o(QA0 qa0, My0 my0) {
    }

    @Override // com.google.android.gms.internal.ads.Pu0
    public final void p(InterfaceC9305rh0 interfaceC9305rh0, C8030fk0 c8030fk0, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10073yr
    public final Integer t() {
        return this.f71192s;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10073yr
    public final void w(Uri[] uriArr, String str) {
        x(uriArr, str, ByteBuffer.allocate(0), false);
    }

    private final boolean d0() {
        return this.f71194u != null && this.f71194u.q();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10073yr
    public final void A(int i10) {
        this.f71177d.k(i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10073yr
    public final void B(int i10) {
        this.f71177d.l(i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10073yr
    public final void D(int i10) {
        this.f71177d.m(i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10073yr
    public final void E(int i10) {
        this.f71177d.n(i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10073yr
    public final void F(boolean z10) {
        this.f71182i.B0(z10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10073yr
    public final void H(boolean z10) {
        if (this.f71182i == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            this.f71182i.zzx();
            if (i10 >= 2) {
                return;
            }
            NG0 ng0 = this.f71178e;
            AG0 ag0C = ng0.n().c();
            ag0C.q(i10, !z10);
            ng0.r(ag0C);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10073yr
    public final void I(int i10) throws SocketException {
        Iterator it = this.f71195v.iterator();
        while (it.hasNext()) {
            C6740Fs c6740Fs = (C6740Fs) ((WeakReference) it.next()).get();
            if (c6740Fs != null) {
                c6740Fs.m(i10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10073yr
    public final void J(Surface surface, boolean z10) {
        InterfaceC8167gz0 interfaceC8167gz0 = this.f71182i;
        if (interfaceC8167gz0 != null) {
            interfaceC8167gz0.a(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10073yr
    public final void K(float f10, boolean z10) {
        InterfaceC8167gz0 interfaceC8167gz0 = this.f71182i;
        if (interfaceC8167gz0 != null) {
            interfaceC8167gz0.s(f10);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10073yr
    public final void L() {
        this.f71182i.zzt();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10073yr
    public final int P() {
        return this.f71182i.zzf();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10073yr
    public final long R() {
        return this.f71182i.zzi();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10073yr
    public final long U() {
        return this.f71182i.zzk();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10073yr
    public final long V() {
        return this.f71182i.zzl();
    }

    final /* synthetic */ InterfaceC9305rh0 Y(String str, boolean z10) {
        Hl0 hl0 = new Hl0();
        hl0.e(str);
        hl0.d(true != z10 ? null : this);
        hl0.b(this.f71179f.f67280d);
        hl0.c(this.f71179f.f67281e);
        hl0.a(true);
        return hl0.zza();
    }

    final /* synthetic */ InterfaceC9305rh0 Z(InterfaceC7100Qg0 interfaceC7100Qg0) {
        InterfaceC9305rh0 interfaceC9305rh0Zza = interfaceC7100Qg0.zza();
        C7215Ts c7215Ts = new C7215Ts(this);
        return new C6842Is(this.f71176c, interfaceC9305rh0Zza, this.f71189p, this.f71190q, this, c7215Ts);
    }

    final InterfaceC7666cF0 a0(Uri uri) {
        E1 e12 = new E1();
        e12.b(uri);
        H7 h7C = e12.c();
        HF0 hf0 = this.f71181h;
        hf0.a(this.f71179f.f67282f);
        return hf0.b(h7C);
    }

    final /* synthetic */ void b0(boolean z10, long j10) {
        InterfaceC9966xr interfaceC9966xr = this.f71185l;
        if (interfaceC9966xr != null) {
            interfaceC9966xr.E(z10, j10);
        }
    }

    final /* synthetic */ FA0[] c0(Handler handler, F f10, FC0 fc0, InterfaceC7988fG0 interfaceC7988fG0, InterfaceC10014yE0 interfaceC10014yE0) {
        InterfaceC8410jE0 interfaceC8410jE0 = InterfaceC8410jE0.f75425a;
        Context context = this.f71176c;
        C9050pD0 c9050pD0 = new C9050pD0(context, new QD0(context), interfaceC8410jE0, false, handler, fc0, new XC0(context).d());
        Context context2 = this.f71176c;
        return new FA0[]{c9050pD0, new JH0(context2, new QD0(context2), interfaceC8410jE0, 0L, false, handler, f10, -1, 30.0f)};
    }

    @Override // com.google.android.gms.internal.ads.SA0
    public final void d(QA0 qa0, C9113ps c9113ps) {
        InterfaceC9966xr interfaceC9966xr = this.f71185l;
        if (interfaceC9966xr != null) {
            interfaceC9966xr.B(c9113ps.f77645a, c9113ps.f77646b);
        }
    }

    @Override // com.google.android.gms.internal.ads.SA0
    public final void e(QA0 qa0, int i10) {
        InterfaceC9966xr interfaceC9966xr = this.f71185l;
        if (interfaceC9966xr != null) {
            interfaceC9966xr.C(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.SA0
    public final void f(QA0 qa0, QE0 qe0, WE0 we0, IOException iOException, boolean z10) {
        InterfaceC9966xr interfaceC9966xr = this.f71185l;
        if (interfaceC9966xr != null) {
            if (this.f71179f.f67286j) {
                interfaceC9966xr.D("onLoadException", iOException);
            } else {
                interfaceC9966xr.F("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.SA0
    public final void g(QA0 qa0, C c10, Ny0 ny0) {
        InterfaceC6807Hr interfaceC6807Hr = (InterfaceC6807Hr) this.f71180g.get();
        if (!((Boolean) Mc.A.c().a(C8659lf.f76224Y1)).booleanValue() || interfaceC6807Hr == null) {
            return;
        }
        HashMap map = new HashMap();
        String str = c10.f65663n;
        if (str != null) {
            map.put("audioMime", str);
        }
        String str2 = c10.f65664o;
        if (str2 != null) {
            map.put("audioSampleMime", str2);
        }
        String str3 = c10.f65660k;
        if (str3 != null) {
            map.put("audioCodec", str3);
        }
        interfaceC6807Hr.L("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.SA0
    public final void i(QA0 qa0, C c10, Ny0 ny0) {
        InterfaceC6807Hr interfaceC6807Hr = (InterfaceC6807Hr) this.f71180g.get();
        if (!((Boolean) Mc.A.c().a(C8659lf.f76224Y1)).booleanValue() || interfaceC6807Hr == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("frameRate", String.valueOf(c10.f65673x));
        map.put("bitRate", String.valueOf(c10.f65659j));
        map.put("resolution", c10.f65671v + "x" + c10.f65672w);
        String str = c10.f65663n;
        if (str != null) {
            map.put("videoMime", str);
        }
        String str2 = c10.f65664o;
        if (str2 != null) {
            map.put("videoSampleMime", str2);
        }
        String str3 = c10.f65660k;
        if (str3 != null) {
            map.put("videoCodec", str3);
        }
        interfaceC6807Hr.L("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.SA0
    public final void j(QA0 qa0, Object obj, long j10) {
        InterfaceC9966xr interfaceC9966xr = this.f71185l;
        if (interfaceC9966xr != null) {
            interfaceC9966xr.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.SA0
    public final void m(QA0 qa0, zzbd zzbdVar) {
        InterfaceC9966xr interfaceC9966xr = this.f71185l;
        if (interfaceC9966xr != null) {
            interfaceC9966xr.F("onPlayerError", zzbdVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.Pu0
    public final void q(InterfaceC9305rh0 interfaceC9305rh0, C8030fk0 c8030fk0, boolean z10) {
        if (interfaceC9305rh0 instanceof InterfaceC9007os0) {
            synchronized (this.f71191r) {
                this.f71193t.add((InterfaceC9007os0) interfaceC9305rh0);
            }
        } else if (interfaceC9305rh0 instanceof C6842Is) {
            this.f71194u = (C6842Is) interfaceC9305rh0;
            final InterfaceC6807Hr interfaceC6807Hr = (InterfaceC6807Hr) this.f71180g.get();
            if (((Boolean) Mc.A.c().a(C8659lf.f76224Y1)).booleanValue() && interfaceC6807Hr != null && this.f71194u.n()) {
                final HashMap map = new HashMap();
                map.put("gcacheHit", String.valueOf(this.f71194u.p()));
                map.put("gcacheDownloaded", String.valueOf(this.f71194u.o()));
                Pc.D0.f25081l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Ss
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = C7314Ws.f71175w;
                        interfaceC6807Hr.L("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10073yr
    public final void x(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z10) {
        InterfaceC7666cF0 c9267rF0;
        if (this.f71182i != null) {
            this.f71183j = byteBuffer;
            this.f71184k = z10;
            int length = uriArr.length;
            if (length == 1) {
                c9267rF0 = a0(uriArr[0]);
            } else {
                InterfaceC7666cF0[] interfaceC7666cF0Arr = new InterfaceC7666cF0[length];
                for (int i10 = 0; i10 < uriArr.length; i10++) {
                    interfaceC7666cF0Arr[i10] = a0(uriArr[i10]);
                }
                c9267rF0 = new C9267rF0(false, false, new KE0(), interfaceC7666cF0Arr);
            }
            this.f71182i.b(c9267rF0);
            this.f71182i.zzp();
            AbstractC10073yr.v().incrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10073yr
    public final void y() {
        InterfaceC8167gz0 interfaceC8167gz0 = this.f71182i;
        if (interfaceC8167gz0 != null) {
            interfaceC8167gz0.d(this);
            this.f71182i.j();
            this.f71182i = null;
            AbstractC10073yr.v().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10073yr
    public final void z(long j10) {
        AbstractC9201qi0 abstractC9201qi0 = (AbstractC9201qi0) this.f71182i;
        abstractC9201qi0.e(abstractC9201qi0.zzd(), j10, 5, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C7314Ws(android.content.Context r4, com.google.android.gms.internal.ads.C6773Gr r5, com.google.android.gms.internal.ads.InterfaceC6807Hr r6, java.lang.Integer r7) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7314Ws.<init>(android.content.Context, com.google.android.gms.internal.ads.Gr, com.google.android.gms.internal.ads.Hr, java.lang.Integer):void");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10073yr
    public final long T() {
        if (d0() && this.f71194u.p()) {
            return Math.min(this.f71186m, this.f71194u.k());
        }
        return 0L;
    }

    public final void finalize() {
        AbstractC10073yr.u().decrementAndGet();
        if (Pc.p0.m()) {
            Pc.p0.k("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10073yr
    public final long r() {
        if (!d0()) {
            return this.f71186m;
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10073yr
    public final long s() {
        if (!d0()) {
            synchronized (this.f71191r) {
                while (!this.f71193t.isEmpty()) {
                    long j10 = this.f71188o;
                    Map mapZze = ((InterfaceC9007os0) this.f71193t.remove(0)).zze();
                    long j11 = 0;
                    if (mapZze != null) {
                        Iterator it = mapZze.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (entry != null) {
                                try {
                                    if (entry.getKey() != null && C8446jf0.c("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                        j11 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                        break;
                                    }
                                } catch (NumberFormatException unused) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.f71188o = j10 + j11;
                }
            }
            return this.f71188o;
        }
        return this.f71194u.l();
    }
}
