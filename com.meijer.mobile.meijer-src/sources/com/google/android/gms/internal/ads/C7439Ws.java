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
public final class C7439Ws extends AbstractC10198yr implements Pu0, SA0 {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f72015w = 0;

    /* renamed from: c, reason: collision with root package name */
    private final Context f72016c;

    /* renamed from: d, reason: collision with root package name */
    private final C6899Gs f72017d;

    /* renamed from: e, reason: collision with root package name */
    private final NG0 f72018e;

    /* renamed from: f, reason: collision with root package name */
    private final C6898Gr f72019f;

    /* renamed from: g, reason: collision with root package name */
    private final WeakReference f72020g;

    /* renamed from: h, reason: collision with root package name */
    private final HF0 f72021h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC8292gz0 f72022i;

    /* renamed from: j, reason: collision with root package name */
    private ByteBuffer f72023j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f72024k;

    /* renamed from: l, reason: collision with root package name */
    private InterfaceC10091xr f72025l;

    /* renamed from: m, reason: collision with root package name */
    private int f72026m;

    /* renamed from: n, reason: collision with root package name */
    private int f72027n;

    /* renamed from: o, reason: collision with root package name */
    private long f72028o;

    /* renamed from: p, reason: collision with root package name */
    private final String f72029p;

    /* renamed from: q, reason: collision with root package name */
    private final int f72030q;

    /* renamed from: s, reason: collision with root package name */
    private Integer f72032s;

    /* renamed from: t, reason: collision with root package name */
    private final ArrayList f72033t;

    /* renamed from: u, reason: collision with root package name */
    private volatile C6967Is f72034u;

    /* renamed from: r, reason: collision with root package name */
    private final Object f72031r = new Object();

    /* renamed from: v, reason: collision with root package name */
    private final Set f72035v = new HashSet();

    @Override // com.google.android.gms.internal.ads.AbstractC10198yr
    public final void C(InterfaceC10091xr interfaceC10091xr) {
        this.f72025l = interfaceC10091xr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10198yr
    public final void G(Integer num) {
        this.f72032s = num;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10198yr
    public final boolean M() {
        return this.f72022i != null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10198yr
    public final int N() {
        return this.f72027n;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10198yr
    public final long S() {
        return this.f72026m;
    }

    final /* synthetic */ InterfaceC9430rh0 W(String str, boolean z10) {
        C7439Ws c7439Ws = true != z10 ? null : this;
        C6898Gr c6898Gr = this.f72019f;
        return new C7538Zs(str, c7439Ws, c6898Gr.f68120d, c6898Gr.f68121e, c6898Gr.f68129m, c6898Gr.f68130n);
    }

    final /* synthetic */ InterfaceC9430rh0 X(String str, boolean z10) {
        C7439Ws c7439Ws = true != z10 ? null : this;
        C6898Gr c6898Gr = this.f72019f;
        C6865Fs c6865Fs = new C6865Fs(str, c7439Ws, c6898Gr.f68120d, c6898Gr.f68121e, c6898Gr.f68124h);
        this.f72035v.add(new WeakReference(c6865Fs));
        return c6865Fs;
    }

    @Override // com.google.android.gms.internal.ads.SA0
    public final /* synthetic */ void a(QA0 qa0, WE0 we0) {
    }

    @Override // com.google.android.gms.internal.ads.SA0
    public final /* synthetic */ void b(InterfaceC7619aj interfaceC7619aj, RA0 ra0) {
    }

    @Override // com.google.android.gms.internal.ads.Pu0
    public final void c(InterfaceC9430rh0 interfaceC9430rh0, C8155fk0 c8155fk0, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.SA0
    public final /* synthetic */ void h(QA0 qa0, int i10, long j10, long j11) {
    }

    @Override // com.google.android.gms.internal.ads.SA0
    public final void k(QA0 qa0, int i10, long j10) {
        this.f72027n += i10;
    }

    @Override // com.google.android.gms.internal.ads.Pu0
    public final void l(InterfaceC9430rh0 interfaceC9430rh0, C8155fk0 c8155fk0, boolean z10, int i10) {
        this.f72026m += i10;
    }

    @Override // com.google.android.gms.internal.ads.SA0
    public final /* synthetic */ void n(QA0 qa0, C7617ai c7617ai, C7617ai c7617ai2, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.SA0
    public final /* synthetic */ void o(QA0 qa0, My0 my0) {
    }

    @Override // com.google.android.gms.internal.ads.Pu0
    public final void p(InterfaceC9430rh0 interfaceC9430rh0, C8155fk0 c8155fk0, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10198yr
    public final Integer t() {
        return this.f72032s;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10198yr
    public final void w(Uri[] uriArr, String str) {
        x(uriArr, str, ByteBuffer.allocate(0), false);
    }

    private final boolean d0() {
        return this.f72034u != null && this.f72034u.q();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10198yr
    public final void A(int i10) {
        this.f72017d.k(i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10198yr
    public final void B(int i10) {
        this.f72017d.l(i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10198yr
    public final void D(int i10) {
        this.f72017d.m(i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10198yr
    public final void E(int i10) {
        this.f72017d.n(i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10198yr
    public final void F(boolean z10) {
        this.f72022i.E0(z10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10198yr
    public final void H(boolean z10) {
        if (this.f72022i == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            this.f72022i.zzx();
            if (i10 >= 2) {
                return;
            }
            NG0 ng0 = this.f72018e;
            AG0 ag0C = ng0.n().c();
            ag0C.q(i10, !z10);
            ng0.r(ag0C);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10198yr
    public final void I(int i10) throws SocketException {
        Iterator it = this.f72035v.iterator();
        while (it.hasNext()) {
            C6865Fs c6865Fs = (C6865Fs) ((WeakReference) it.next()).get();
            if (c6865Fs != null) {
                c6865Fs.m(i10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10198yr
    public final void J(Surface surface, boolean z10) {
        InterfaceC8292gz0 interfaceC8292gz0 = this.f72022i;
        if (interfaceC8292gz0 != null) {
            interfaceC8292gz0.a(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10198yr
    public final void K(float f10, boolean z10) {
        InterfaceC8292gz0 interfaceC8292gz0 = this.f72022i;
        if (interfaceC8292gz0 != null) {
            interfaceC8292gz0.s(f10);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10198yr
    public final void L() {
        this.f72022i.zzt();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10198yr
    public final int P() {
        return this.f72022i.zzf();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10198yr
    public final long R() {
        return this.f72022i.zzi();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10198yr
    public final long U() {
        return this.f72022i.zzk();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10198yr
    public final long V() {
        return this.f72022i.zzl();
    }

    final /* synthetic */ InterfaceC9430rh0 Y(String str, boolean z10) {
        Hl0 hl0 = new Hl0();
        hl0.e(str);
        hl0.d(true != z10 ? null : this);
        hl0.b(this.f72019f.f68120d);
        hl0.c(this.f72019f.f68121e);
        hl0.a(true);
        return hl0.zza();
    }

    final /* synthetic */ InterfaceC9430rh0 Z(InterfaceC7225Qg0 interfaceC7225Qg0) {
        InterfaceC9430rh0 interfaceC9430rh0Zza = interfaceC7225Qg0.zza();
        C7340Ts c7340Ts = new C7340Ts(this);
        return new C6967Is(this.f72016c, interfaceC9430rh0Zza, this.f72029p, this.f72030q, this, c7340Ts);
    }

    final InterfaceC7791cF0 a0(Uri uri) {
        E1 e12 = new E1();
        e12.b(uri);
        H7 h7C = e12.c();
        HF0 hf0 = this.f72021h;
        hf0.a(this.f72019f.f68122f);
        return hf0.b(h7C);
    }

    final /* synthetic */ void b0(boolean z10, long j10) {
        InterfaceC10091xr interfaceC10091xr = this.f72025l;
        if (interfaceC10091xr != null) {
            interfaceC10091xr.E(z10, j10);
        }
    }

    final /* synthetic */ FA0[] c0(Handler handler, F f10, FC0 fc0, InterfaceC8113fG0 interfaceC8113fG0, InterfaceC10139yE0 interfaceC10139yE0) {
        InterfaceC8535jE0 interfaceC8535jE0 = InterfaceC8535jE0.f76265a;
        Context context = this.f72016c;
        C9175pD0 c9175pD0 = new C9175pD0(context, new QD0(context), interfaceC8535jE0, false, handler, fc0, new XC0(context).d());
        Context context2 = this.f72016c;
        return new FA0[]{c9175pD0, new JH0(context2, new QD0(context2), interfaceC8535jE0, 0L, false, handler, f10, -1, 30.0f)};
    }

    @Override // com.google.android.gms.internal.ads.SA0
    public final void d(QA0 qa0, C9238ps c9238ps) {
        InterfaceC10091xr interfaceC10091xr = this.f72025l;
        if (interfaceC10091xr != null) {
            interfaceC10091xr.B(c9238ps.f78485a, c9238ps.f78486b);
        }
    }

    @Override // com.google.android.gms.internal.ads.SA0
    public final void e(QA0 qa0, int i10) {
        InterfaceC10091xr interfaceC10091xr = this.f72025l;
        if (interfaceC10091xr != null) {
            interfaceC10091xr.C(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.SA0
    public final void f(QA0 qa0, QE0 qe0, WE0 we0, IOException iOException, boolean z10) {
        InterfaceC10091xr interfaceC10091xr = this.f72025l;
        if (interfaceC10091xr != null) {
            if (this.f72019f.f68126j) {
                interfaceC10091xr.D("onLoadException", iOException);
            } else {
                interfaceC10091xr.F("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.SA0
    public final void g(QA0 qa0, C c10, Ny0 ny0) {
        InterfaceC6932Hr interfaceC6932Hr = (InterfaceC6932Hr) this.f72020g.get();
        if (!((Boolean) Oc.A.c().a(C8784lf.f77064Y1)).booleanValue() || interfaceC6932Hr == null) {
            return;
        }
        HashMap map = new HashMap();
        String str = c10.f66503n;
        if (str != null) {
            map.put("audioMime", str);
        }
        String str2 = c10.f66504o;
        if (str2 != null) {
            map.put("audioSampleMime", str2);
        }
        String str3 = c10.f66500k;
        if (str3 != null) {
            map.put("audioCodec", str3);
        }
        interfaceC6932Hr.L("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.SA0
    public final void i(QA0 qa0, C c10, Ny0 ny0) {
        InterfaceC6932Hr interfaceC6932Hr = (InterfaceC6932Hr) this.f72020g.get();
        if (!((Boolean) Oc.A.c().a(C8784lf.f77064Y1)).booleanValue() || interfaceC6932Hr == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("frameRate", String.valueOf(c10.f66513x));
        map.put("bitRate", String.valueOf(c10.f66499j));
        map.put("resolution", c10.f66511v + "x" + c10.f66512w);
        String str = c10.f66503n;
        if (str != null) {
            map.put("videoMime", str);
        }
        String str2 = c10.f66504o;
        if (str2 != null) {
            map.put("videoSampleMime", str2);
        }
        String str3 = c10.f66500k;
        if (str3 != null) {
            map.put("videoCodec", str3);
        }
        interfaceC6932Hr.L("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.SA0
    public final void j(QA0 qa0, Object obj, long j10) {
        InterfaceC10091xr interfaceC10091xr = this.f72025l;
        if (interfaceC10091xr != null) {
            interfaceC10091xr.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.SA0
    public final void m(QA0 qa0, zzbd zzbdVar) {
        InterfaceC10091xr interfaceC10091xr = this.f72025l;
        if (interfaceC10091xr != null) {
            interfaceC10091xr.F("onPlayerError", zzbdVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.Pu0
    public final void q(InterfaceC9430rh0 interfaceC9430rh0, C8155fk0 c8155fk0, boolean z10) {
        if (interfaceC9430rh0 instanceof InterfaceC9132os0) {
            synchronized (this.f72031r) {
                this.f72033t.add((InterfaceC9132os0) interfaceC9430rh0);
            }
        } else if (interfaceC9430rh0 instanceof C6967Is) {
            this.f72034u = (C6967Is) interfaceC9430rh0;
            final InterfaceC6932Hr interfaceC6932Hr = (InterfaceC6932Hr) this.f72020g.get();
            if (((Boolean) Oc.A.c().a(C8784lf.f77064Y1)).booleanValue() && interfaceC6932Hr != null && this.f72034u.n()) {
                final HashMap map = new HashMap();
                map.put("gcacheHit", String.valueOf(this.f72034u.p()));
                map.put("gcacheDownloaded", String.valueOf(this.f72034u.o()));
                Rc.D0.f32295l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Ss
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = C7439Ws.f72015w;
                        interfaceC6932Hr.L("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10198yr
    public final void x(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z10) {
        InterfaceC7791cF0 c9392rF0;
        if (this.f72022i != null) {
            this.f72023j = byteBuffer;
            this.f72024k = z10;
            int length = uriArr.length;
            if (length == 1) {
                c9392rF0 = a0(uriArr[0]);
            } else {
                InterfaceC7791cF0[] interfaceC7791cF0Arr = new InterfaceC7791cF0[length];
                for (int i10 = 0; i10 < uriArr.length; i10++) {
                    interfaceC7791cF0Arr[i10] = a0(uriArr[i10]);
                }
                c9392rF0 = new C9392rF0(false, false, new KE0(), interfaceC7791cF0Arr);
            }
            this.f72022i.b(c9392rF0);
            this.f72022i.zzp();
            AbstractC10198yr.v().incrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10198yr
    public final void y() {
        InterfaceC8292gz0 interfaceC8292gz0 = this.f72022i;
        if (interfaceC8292gz0 != null) {
            interfaceC8292gz0.d(this);
            this.f72022i.j();
            this.f72022i = null;
            AbstractC10198yr.v().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10198yr
    public final void z(long j10) {
        AbstractC9326qi0 abstractC9326qi0 = (AbstractC9326qi0) this.f72022i;
        abstractC9326qi0.e(abstractC9326qi0.zzd(), j10, 5, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C7439Ws(android.content.Context r4, com.google.android.gms.internal.ads.C6898Gr r5, com.google.android.gms.internal.ads.InterfaceC6932Hr r6, java.lang.Integer r7) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7439Ws.<init>(android.content.Context, com.google.android.gms.internal.ads.Gr, com.google.android.gms.internal.ads.Hr, java.lang.Integer):void");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10198yr
    public final long T() {
        if (d0() && this.f72034u.p()) {
            return Math.min(this.f72026m, this.f72034u.k());
        }
        return 0L;
    }

    public final void finalize() {
        AbstractC10198yr.u().decrementAndGet();
        if (Rc.p0.m()) {
            Rc.p0.k("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10198yr
    public final long r() {
        if (!d0()) {
            return this.f72026m;
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10198yr
    public final long s() {
        if (!d0()) {
            synchronized (this.f72031r) {
                while (!this.f72033t.isEmpty()) {
                    long j10 = this.f72028o;
                    Map mapZze = ((InterfaceC9132os0) this.f72033t.remove(0)).zze();
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
                                    if (entry.getKey() != null && C8571jf0.c("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                        j11 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                        break;
                                    }
                                } catch (NumberFormatException unused) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.f72028o = j10 + j11;
                }
            }
            return this.f72028o;
        }
        return this.f72034u.l();
    }
}
