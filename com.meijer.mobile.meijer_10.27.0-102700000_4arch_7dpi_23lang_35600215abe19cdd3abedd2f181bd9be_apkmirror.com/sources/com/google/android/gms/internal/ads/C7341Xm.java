package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.Xm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7341Xm extends C7822dn {

    /* renamed from: c, reason: collision with root package name */
    private String f71390c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f71391d;

    /* renamed from: e, reason: collision with root package name */
    private int f71392e;

    /* renamed from: f, reason: collision with root package name */
    private int f71393f;

    /* renamed from: g, reason: collision with root package name */
    private int f71394g;

    /* renamed from: h, reason: collision with root package name */
    private int f71395h;

    /* renamed from: i, reason: collision with root package name */
    private int f71396i;

    /* renamed from: j, reason: collision with root package name */
    private int f71397j;

    /* renamed from: k, reason: collision with root package name */
    private final Object f71398k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC9008ot f71399l;

    /* renamed from: m, reason: collision with root package name */
    private final Activity f71400m;

    /* renamed from: n, reason: collision with root package name */
    private C8368iu f71401n;

    /* renamed from: o, reason: collision with root package name */
    private ImageView f71402o;

    /* renamed from: p, reason: collision with root package name */
    private LinearLayout f71403p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC7928en f71404q;

    /* renamed from: r, reason: collision with root package name */
    private PopupWindow f71405r;

    /* renamed from: s, reason: collision with root package name */
    private RelativeLayout f71406s;

    /* renamed from: t, reason: collision with root package name */
    private ViewGroup f71407t;

    public final void l(int i10, int i11) {
        this.f71392e = i10;
        this.f71393f = i11;
    }

    static {
        com.google.android.gms.common.util.g.f("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    }

    public C7341Xm(InterfaceC9008ot interfaceC9008ot, InterfaceC7928en interfaceC7928en) {
        super(interfaceC9008ot, "resize");
        this.f71390c = "top-right";
        this.f71391d = true;
        this.f71392e = 0;
        this.f71393f = 0;
        this.f71394g = -1;
        this.f71395h = 0;
        this.f71396i = 0;
        this.f71397j = -1;
        this.f71398k = new Object();
        this.f71399l = interfaceC9008ot;
        this.f71400m = interfaceC9008ot.zzi();
        this.f71404q = interfaceC7928en;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void j(boolean z10) throws JSONException {
        if (((Boolean) Mc.A.c().a(C8659lf.f76023Ja)).booleanValue()) {
            this.f71406s.removeView((View) this.f71399l);
            this.f71405r.dismiss();
        } else {
            this.f71405r.dismiss();
            this.f71406s.removeView((View) this.f71399l);
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f76037Ka)).booleanValue()) {
            ViewParent parent = ((View) this.f71399l).getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView((View) this.f71399l);
            }
        }
        ViewGroup viewGroup = this.f71407t;
        if (viewGroup != null) {
            viewGroup.removeView(this.f71402o);
            if (((Boolean) Mc.A.c().a(C8659lf.f76051La)).booleanValue()) {
                try {
                    this.f71407t.addView((View) this.f71399l);
                    this.f71399l.n0(this.f71401n);
                } catch (IllegalStateException e10) {
                    Qc.p.e("Unable to add webview back to view hierarchy.", e10);
                }
            } else {
                this.f71407t.addView((View) this.f71399l);
                this.f71399l.n0(this.f71401n);
            }
        }
        if (z10) {
            g("default");
            InterfaceC7928en interfaceC7928en = this.f71404q;
            if (interfaceC7928en != null) {
                interfaceC7928en.zzb();
            }
        }
        this.f71405r = null;
        this.f71406s = null;
        this.f71407t = null;
        this.f71403p = null;
    }

    public final void h(final boolean z10) {
        synchronized (this.f71398k) {
            try {
                if (this.f71405r != null) {
                    if (!((Boolean) Mc.A.c().a(C8659lf.f76009Ia)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        j(z10);
                    } else {
                        C6908Kq.f68179f.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.Vm
                            @Override // java.lang.Runnable
                            public final void run() throws JSONException {
                                this.f70916a.j(z10);
                            }
                        });
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0279 A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:11:0x0015, B:13:0x001d, B:14:0x0022, B:16:0x0024, B:18:0x0030, B:19:0x0035, B:21:0x0037, B:23:0x003f, B:24:0x0044, B:26:0x0046, B:28:0x0054, B:29:0x0065, B:31:0x0073, B:32:0x0084, B:34:0x0092, B:35:0x00a3, B:37:0x00b1, B:38:0x00c2, B:40:0x00d0, B:41:0x00de, B:43:0x00ec, B:44:0x00ee, B:46:0x00f2, B:48:0x00f6, B:50:0x00fe, B:53:0x0106, B:57:0x012f, B:63:0x013d, B:129:0x0279, B:130:0x027e, B:132:0x0280, B:134:0x02a0, B:136:0x02a4, B:138:0x02b1, B:140:0x02ed, B:172:0x03a9, B:179:0x03da, B:180:0x03f2, B:181:0x0413, B:183:0x041b, B:184:0x0422, B:185:0x0448, B:188:0x044b, B:190:0x0470, B:191:0x0485, B:173:0x03b0, B:174:0x03b7, B:175:0x03be, B:176:0x03c5, B:177:0x03cb, B:178:0x03d2, B:139:0x02ea, B:193:0x0487, B:194:0x048c, B:65:0x0147, B:67:0x014b, B:95:0x01ac, B:96:0x01b6, B:105:0x0209, B:107:0x020d, B:109:0x0211, B:112:0x0219, B:97:0x01ba, B:98:0x01c4, B:99:0x01cb, B:100:0x01d7, B:101:0x01df, B:102:0x01f3, B:103:0x01ff, B:113:0x0228, B:119:0x0254, B:125:0x0264, B:122:0x025a, B:124:0x0262, B:116:0x024c, B:118:0x0252, B:126:0x0269, B:127:0x0270, B:196:0x048e, B:197:0x0493, B:199:0x0495, B:200:0x049a), top: B:204:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0280 A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:11:0x0015, B:13:0x001d, B:14:0x0022, B:16:0x0024, B:18:0x0030, B:19:0x0035, B:21:0x0037, B:23:0x003f, B:24:0x0044, B:26:0x0046, B:28:0x0054, B:29:0x0065, B:31:0x0073, B:32:0x0084, B:34:0x0092, B:35:0x00a3, B:37:0x00b1, B:38:0x00c2, B:40:0x00d0, B:41:0x00de, B:43:0x00ec, B:44:0x00ee, B:46:0x00f2, B:48:0x00f6, B:50:0x00fe, B:53:0x0106, B:57:0x012f, B:63:0x013d, B:129:0x0279, B:130:0x027e, B:132:0x0280, B:134:0x02a0, B:136:0x02a4, B:138:0x02b1, B:140:0x02ed, B:172:0x03a9, B:179:0x03da, B:180:0x03f2, B:181:0x0413, B:183:0x041b, B:184:0x0422, B:185:0x0448, B:188:0x044b, B:190:0x0470, B:191:0x0485, B:173:0x03b0, B:174:0x03b7, B:175:0x03be, B:176:0x03c5, B:177:0x03cb, B:178:0x03d2, B:139:0x02ea, B:193:0x0487, B:194:0x048c, B:65:0x0147, B:67:0x014b, B:95:0x01ac, B:96:0x01b6, B:105:0x0209, B:107:0x020d, B:109:0x0211, B:112:0x0219, B:97:0x01ba, B:98:0x01c4, B:99:0x01cb, B:100:0x01d7, B:101:0x01df, B:102:0x01f3, B:103:0x01ff, B:113:0x0228, B:119:0x0254, B:125:0x0264, B:122:0x025a, B:124:0x0262, B:116:0x024c, B:118:0x0252, B:126:0x0269, B:127:0x0270, B:196:0x048e, B:197:0x0493, B:199:0x0495, B:200:0x049a), top: B:204:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019f A[PHI: r16
      0x019f: PHI (r16v13 int) = (r16v6 int), (r16v7 int), (r16v8 int), (r16v9 int), (r16v10 int), (r16v11 int), (r16v14 int) binds: [B:86:0x019b, B:83:0x018f, B:80:0x0183, B:77:0x0177, B:74:0x016b, B:71:0x015f, B:69:0x0154] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.util.Map r18) {
        /*
            Method dump skipped, instructions count: 1234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7341Xm.i(java.util.Map):void");
    }

    public final void k(int i10, int i11, boolean z10) {
        synchronized (this.f71398k) {
            this.f71392e = i10;
            this.f71393f = i11;
        }
    }

    public final boolean m() {
        boolean z10;
        synchronized (this.f71398k) {
            z10 = this.f71405r != null;
        }
        return z10;
    }
}
