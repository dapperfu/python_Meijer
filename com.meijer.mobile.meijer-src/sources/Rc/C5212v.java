package Rc;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.C7033Kq;
import com.google.android.gms.internal.ads.C8784lf;
import com.google.android.gms.internal.ads.VO;
import com.google.android.gms.internal.ads.Xj0;
import com.google.android.gms.internal.ads.ZO;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: Rc.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5212v {

    /* renamed from: a, reason: collision with root package name */
    private final Context f32435a;

    /* renamed from: b, reason: collision with root package name */
    private final ZO f32436b;

    /* renamed from: c, reason: collision with root package name */
    private String f32437c;

    /* renamed from: d, reason: collision with root package name */
    private String f32438d;

    /* renamed from: e, reason: collision with root package name */
    private String f32439e;

    /* renamed from: f, reason: collision with root package name */
    private String f32440f;

    /* renamed from: g, reason: collision with root package name */
    private int f32441g;

    /* renamed from: h, reason: collision with root package name */
    private int f32442h;

    /* renamed from: i, reason: collision with root package name */
    private PointF f32443i;

    /* renamed from: j, reason: collision with root package name */
    private PointF f32444j;

    /* renamed from: k, reason: collision with root package name */
    private Handler f32445k;

    /* renamed from: l, reason: collision with root package name */
    private Runnable f32446l;

    public C5212v(Context context) {
        this.f32441g = 0;
        this.f32446l = new Runnable() { // from class: Rc.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f32355a.g();
            }
        };
        this.f32435a = context;
        this.f32442h = ViewConfiguration.get(context).getScaledTouchSlop();
        Nc.v.x().b();
        this.f32445k = Nc.v.x().a();
        this.f32436b = Nc.v.w().a();
    }

    private static final int u(List list, String str, boolean z10) {
        if (!z10) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    final /* synthetic */ void g() {
        this.f32441g = 4;
        r();
    }

    private final void s(Context context) {
        ArrayList arrayList = new ArrayList();
        int iU = u(arrayList, "None", true);
        final int iU2 = u(arrayList, "Shake", true);
        final int iU3 = u(arrayList, "Flick", true);
        int iOrdinal = this.f32436b.b().ordinal();
        final int i10 = iOrdinal != 1 ? iOrdinal != 2 ? iU : iU3 : iU2;
        Nc.v.t();
        AlertDialog.Builder builderL = D0.l(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i10);
        builderL.setTitle("Setup gesture");
        builderL.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i10, new DialogInterface.OnClickListener() { // from class: Rc.o
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                atomicInteger.set(i11);
            }
        });
        builderL.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: Rc.p
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                this.f32390a.r();
            }
        });
        builderL.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: Rc.q
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                this.f32391a.h(atomicInteger, i10, iU2, iU3, dialogInterface, i11);
            }
        });
        builderL.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: Rc.r
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f32396a.r();
            }
        });
        builderL.create().show();
    }

    private final boolean t(float f10, float f11, float f12, float f13) {
        return Math.abs(this.f32443i.x - f10) < ((float) this.f32442h) && Math.abs(this.f32443i.y - f11) < ((float) this.f32442h) && Math.abs(this.f32444j.x - f12) < ((float) this.f32442h) && Math.abs(this.f32444j.y - f13) < ((float) this.f32442h);
    }

    final /* synthetic */ void a() {
        s(this.f32435a);
    }

    final /* synthetic */ void c() {
        s(this.f32435a);
    }

    final /* synthetic */ void j(int i10, int i11, int i12, int i13, int i14, DialogInterface dialogInterface, int i15) {
        if (i15 != i10) {
            if (i15 == i11) {
                Sc.p.b("Debug mode [Creative Preview] selected.");
                C7033Kq.f69014a.execute(new Runnable() { // from class: Rc.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f32356a.l();
                    }
                });
                return;
            }
            if (i15 == i12) {
                Sc.p.b("Debug mode [Troubleshooting] selected.");
                C7033Kq.f69014a.execute(new Runnable() { // from class: Rc.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f32404a.k();
                    }
                });
                return;
            }
            if (i15 == i13) {
                ZO zo2 = this.f32436b;
                final Xj0 xj0 = C7033Kq.f69019f;
                Xj0 xj02 = C7033Kq.f69014a;
                if (zo2.r()) {
                    xj0.execute(new Runnable() { // from class: Rc.s
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f32397a.d();
                        }
                    });
                    return;
                } else {
                    xj02.execute(new Runnable() { // from class: Rc.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f32399a.e(xj0);
                        }
                    });
                    return;
                }
            }
            if (i15 == i14) {
                ZO zo3 = this.f32436b;
                final Xj0 xj03 = C7033Kq.f69019f;
                Xj0 xj04 = C7033Kq.f69014a;
                if (zo3.r()) {
                    xj03.execute(new Runnable() { // from class: Rc.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f32353a.a();
                        }
                    });
                    return;
                } else {
                    xj04.execute(new Runnable() { // from class: Rc.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f32372a.b(xj03);
                        }
                    });
                    return;
                }
            }
            return;
        }
        if (!(this.f32435a instanceof Activity)) {
            Sc.p.f("Can not create dialog without Activity Context");
            return;
        }
        String str = this.f32437c;
        final String str2 = "No debug information";
        if (!TextUtils.isEmpty(str)) {
            Uri uriBuild = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
            StringBuilder sb2 = new StringBuilder();
            Nc.v.t();
            Map mapP = D0.p(uriBuild);
            for (String str3 : mapP.keySet()) {
                sb2.append(str3);
                sb2.append(" = ");
                sb2.append((String) mapP.get(str3));
                sb2.append("\n\n");
            }
            String strTrim = sb2.toString().trim();
            if (!TextUtils.isEmpty(strTrim)) {
                str2 = strTrim;
            }
        }
        Nc.v.t();
        AlertDialog.Builder builderL = D0.l(this.f32435a);
        builderL.setMessage(str2);
        builderL.setTitle("Ad Information");
        builderL.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: Rc.i
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i16) {
                this.f32358a.i(str2, dialogInterface2, i16);
            }
        });
        builderL.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: Rc.j
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i16) {
            }
        });
        builderL.create().show();
    }

    public final void n(String str) {
        this.f32438d = str;
    }

    public final void o(String str) {
        this.f32439e = str;
    }

    public final void p(String str) {
        this.f32437c = str;
    }

    public final void q(String str) {
        this.f32440f = str;
    }

    public final void r() {
        try {
            if (!(this.f32435a instanceof Activity)) {
                Sc.p.f("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(Nc.v.w().b())) {
                str = "Creative preview";
            }
            String str2 = true != Nc.v.w().m() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int iU = u(arrayList, "Ad information", true);
            final int iU2 = u(arrayList, str, true);
            final int iU3 = u(arrayList, str2, true);
            boolean zBooleanValue = ((Boolean) Oc.A.c().a(C8784lf.f77141d9)).booleanValue();
            final int iU4 = u(arrayList, "Open ad inspector", zBooleanValue);
            final int iU5 = u(arrayList, "Ad inspector settings", zBooleanValue);
            Nc.v.t();
            AlertDialog.Builder builderL = D0.l(this.f32435a);
            builderL.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: Rc.n
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    this.f32377a.j(iU, iU2, iU3, iU4, iU5, dialogInterface, i10);
                }
            });
            builderL.create().show();
        } catch (WindowManager.BadTokenException e10) {
            p0.l("", e10);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append("{Dialog: ");
        sb2.append(this.f32437c);
        sb2.append(",DebugSignal: ");
        sb2.append(this.f32440f);
        sb2.append(",AFMA Version: ");
        sb2.append(this.f32439e);
        sb2.append(",Ad Unit ID: ");
        sb2.append(this.f32438d);
        sb2.append("}");
        return sb2.toString();
    }

    final /* synthetic */ void b(Xj0 xj0) {
        if (!Nc.v.w().j(this.f32435a, this.f32438d, this.f32439e)) {
            Nc.v.w().d(this.f32435a, this.f32438d, this.f32439e);
        } else {
            xj0.execute(new Runnable() { // from class: Rc.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32366a.c();
                }
            });
        }
    }

    final /* synthetic */ void d() {
        Nc.v.w().c(this.f32435a);
    }

    final /* synthetic */ void e(Xj0 xj0) {
        if (!Nc.v.w().j(this.f32435a, this.f32438d, this.f32439e)) {
            Nc.v.w().d(this.f32435a, this.f32438d, this.f32439e);
        } else {
            xj0.execute(new Runnable() { // from class: Rc.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32364a.f();
                }
            });
        }
    }

    final /* synthetic */ void f() {
        Nc.v.w().c(this.f32435a);
    }

    final /* synthetic */ void h(AtomicInteger atomicInteger, int i10, int i11, int i12, DialogInterface dialogInterface, int i13) {
        if (atomicInteger.get() != i10) {
            if (atomicInteger.get() == i11) {
                this.f32436b.n(VO.SHAKE);
            } else if (atomicInteger.get() == i12) {
                this.f32436b.n(VO.FLICK);
            } else {
                this.f32436b.n(VO.NONE);
            }
        }
        r();
    }

    final /* synthetic */ void i(String str, DialogInterface dialogInterface, int i10) {
        Nc.v.t();
        D0.t(this.f32435a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    final /* synthetic */ void k() {
        C5216z c5216zW = Nc.v.w();
        String str = this.f32438d;
        String str2 = this.f32439e;
        String str3 = this.f32440f;
        boolean zM = c5216zW.m();
        Context context = this.f32435a;
        c5216zW.h(c5216zW.j(context, str, str2));
        if (c5216zW.m()) {
            if (!zM && !TextUtils.isEmpty(str3)) {
                c5216zW.e(context, str2, str3, str);
            }
            Sc.p.b("Device is linked for debug signals.");
            c5216zW.i(context, "The device is successfully linked for troubleshooting.", false, true);
            return;
        }
        c5216zW.d(context, str, str2);
    }

    final /* synthetic */ void l() {
        C5216z c5216zW = Nc.v.w();
        Context context = this.f32435a;
        String str = this.f32438d;
        String str2 = this.f32439e;
        if (!c5216zW.k(context, str, str2)) {
            c5216zW.i(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
            return;
        }
        if ("2".equals(c5216zW.f32467f)) {
            Sc.p.b("Creative is not pushed for this device.");
            c5216zW.i(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(c5216zW.f32467f)) {
            Sc.p.b("The app is not linked for creative preview.");
            c5216zW.d(context, str, str2);
        } else if ("0".equals(c5216zW.f32467f)) {
            Sc.p.b("Device is linked for in app preview.");
            c5216zW.i(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    public final void m(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f32441g = 0;
            this.f32443i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i10 = this.f32441g;
        if (i10 != -1) {
            if (i10 == 0) {
                if (actionMasked == 5) {
                    this.f32441g = 5;
                    this.f32444j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                    this.f32445k.postDelayed(this.f32446l, ((Long) Oc.A.c().a(C8784lf.f76857J4)).longValue());
                    return;
                }
                return;
            }
            if (i10 == 5) {
                if (pointerCount == 2) {
                    if (actionMasked == 2) {
                        boolean z10 = false;
                        for (int i11 = 0; i11 < historySize; i11++) {
                            z10 |= !t(motionEvent.getHistoricalX(0, i11), motionEvent.getHistoricalY(0, i11), motionEvent.getHistoricalX(1, i11), motionEvent.getHistoricalY(1, i11));
                        }
                        if (t(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z10) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.f32441g = -1;
                this.f32445k.removeCallbacks(this.f32446l);
            }
        }
    }

    public C5212v(Context context, String str) {
        this(context);
        this.f32437c = str;
    }
}
