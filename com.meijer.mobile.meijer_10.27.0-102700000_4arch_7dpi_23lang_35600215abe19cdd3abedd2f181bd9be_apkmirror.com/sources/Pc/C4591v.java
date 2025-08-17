package Pc;

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
import com.google.android.gms.internal.ads.C6908Kq;
import com.google.android.gms.internal.ads.C8659lf;
import com.google.android.gms.internal.ads.VO;
import com.google.android.gms.internal.ads.Xj0;
import com.google.android.gms.internal.ads.ZO;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: Pc.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4591v {

    /* renamed from: a, reason: collision with root package name */
    private final Context f25221a;

    /* renamed from: b, reason: collision with root package name */
    private final ZO f25222b;

    /* renamed from: c, reason: collision with root package name */
    private String f25223c;

    /* renamed from: d, reason: collision with root package name */
    private String f25224d;

    /* renamed from: e, reason: collision with root package name */
    private String f25225e;

    /* renamed from: f, reason: collision with root package name */
    private String f25226f;

    /* renamed from: g, reason: collision with root package name */
    private int f25227g;

    /* renamed from: h, reason: collision with root package name */
    private int f25228h;

    /* renamed from: i, reason: collision with root package name */
    private PointF f25229i;

    /* renamed from: j, reason: collision with root package name */
    private PointF f25230j;

    /* renamed from: k, reason: collision with root package name */
    private Handler f25231k;

    /* renamed from: l, reason: collision with root package name */
    private Runnable f25232l;

    public C4591v(Context context) {
        this.f25227g = 0;
        this.f25232l = new Runnable() { // from class: Pc.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f25141a.g();
            }
        };
        this.f25221a = context;
        this.f25228h = ViewConfiguration.get(context).getScaledTouchSlop();
        Lc.v.x().b();
        this.f25231k = Lc.v.x().a();
        this.f25222b = Lc.v.w().a();
    }

    private static final int u(List list, String str, boolean z10) {
        if (!z10) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    final /* synthetic */ void g() {
        this.f25227g = 4;
        r();
    }

    private final void s(Context context) {
        ArrayList arrayList = new ArrayList();
        int iU = u(arrayList, "None", true);
        final int iU2 = u(arrayList, "Shake", true);
        final int iU3 = u(arrayList, "Flick", true);
        int iOrdinal = this.f25222b.b().ordinal();
        final int i10 = iOrdinal != 1 ? iOrdinal != 2 ? iU : iU3 : iU2;
        Lc.v.t();
        AlertDialog.Builder builderL = D0.l(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i10);
        builderL.setTitle("Setup gesture");
        builderL.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i10, new DialogInterface.OnClickListener() { // from class: Pc.o
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                atomicInteger.set(i11);
            }
        });
        builderL.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: Pc.p
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                this.f25176a.r();
            }
        });
        builderL.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: Pc.q
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                this.f25177a.h(atomicInteger, i10, iU2, iU3, dialogInterface, i11);
            }
        });
        builderL.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: Pc.r
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f25182a.r();
            }
        });
        builderL.create().show();
    }

    private final boolean t(float f10, float f11, float f12, float f13) {
        return Math.abs(this.f25229i.x - f10) < ((float) this.f25228h) && Math.abs(this.f25229i.y - f11) < ((float) this.f25228h) && Math.abs(this.f25230j.x - f12) < ((float) this.f25228h) && Math.abs(this.f25230j.y - f13) < ((float) this.f25228h);
    }

    final /* synthetic */ void a() {
        s(this.f25221a);
    }

    final /* synthetic */ void c() {
        s(this.f25221a);
    }

    final /* synthetic */ void j(int i10, int i11, int i12, int i13, int i14, DialogInterface dialogInterface, int i15) {
        if (i15 != i10) {
            if (i15 == i11) {
                Qc.p.b("Debug mode [Creative Preview] selected.");
                C6908Kq.f68174a.execute(new Runnable() { // from class: Pc.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f25142a.l();
                    }
                });
                return;
            }
            if (i15 == i12) {
                Qc.p.b("Debug mode [Troubleshooting] selected.");
                C6908Kq.f68174a.execute(new Runnable() { // from class: Pc.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f25190a.k();
                    }
                });
                return;
            }
            if (i15 == i13) {
                ZO zo2 = this.f25222b;
                final Xj0 xj0 = C6908Kq.f68179f;
                Xj0 xj02 = C6908Kq.f68174a;
                if (zo2.r()) {
                    xj0.execute(new Runnable() { // from class: Pc.s
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f25183a.d();
                        }
                    });
                    return;
                } else {
                    xj02.execute(new Runnable() { // from class: Pc.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f25185a.e(xj0);
                        }
                    });
                    return;
                }
            }
            if (i15 == i14) {
                ZO zo3 = this.f25222b;
                final Xj0 xj03 = C6908Kq.f68179f;
                Xj0 xj04 = C6908Kq.f68174a;
                if (zo3.r()) {
                    xj03.execute(new Runnable() { // from class: Pc.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f25139a.a();
                        }
                    });
                    return;
                } else {
                    xj04.execute(new Runnable() { // from class: Pc.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f25158a.b(xj03);
                        }
                    });
                    return;
                }
            }
            return;
        }
        if (!(this.f25221a instanceof Activity)) {
            Qc.p.f("Can not create dialog without Activity Context");
            return;
        }
        String str = this.f25223c;
        final String str2 = "No debug information";
        if (!TextUtils.isEmpty(str)) {
            Uri uriBuild = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
            StringBuilder sb2 = new StringBuilder();
            Lc.v.t();
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
        Lc.v.t();
        AlertDialog.Builder builderL = D0.l(this.f25221a);
        builderL.setMessage(str2);
        builderL.setTitle("Ad Information");
        builderL.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: Pc.i
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i16) {
                this.f25144a.i(str2, dialogInterface2, i16);
            }
        });
        builderL.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: Pc.j
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i16) {
            }
        });
        builderL.create().show();
    }

    public final void n(String str) {
        this.f25224d = str;
    }

    public final void o(String str) {
        this.f25225e = str;
    }

    public final void p(String str) {
        this.f25223c = str;
    }

    public final void q(String str) {
        this.f25226f = str;
    }

    public final void r() {
        try {
            if (!(this.f25221a instanceof Activity)) {
                Qc.p.f("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(Lc.v.w().b())) {
                str = "Creative preview";
            }
            String str2 = true != Lc.v.w().m() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int iU = u(arrayList, "Ad information", true);
            final int iU2 = u(arrayList, str, true);
            final int iU3 = u(arrayList, str2, true);
            boolean zBooleanValue = ((Boolean) Mc.A.c().a(C8659lf.f76301d9)).booleanValue();
            final int iU4 = u(arrayList, "Open ad inspector", zBooleanValue);
            final int iU5 = u(arrayList, "Ad inspector settings", zBooleanValue);
            Lc.v.t();
            AlertDialog.Builder builderL = D0.l(this.f25221a);
            builderL.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: Pc.n
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    this.f25163a.j(iU, iU2, iU3, iU4, iU5, dialogInterface, i10);
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
        sb2.append(this.f25223c);
        sb2.append(",DebugSignal: ");
        sb2.append(this.f25226f);
        sb2.append(",AFMA Version: ");
        sb2.append(this.f25225e);
        sb2.append(",Ad Unit ID: ");
        sb2.append(this.f25224d);
        sb2.append("}");
        return sb2.toString();
    }

    final /* synthetic */ void b(Xj0 xj0) {
        if (!Lc.v.w().j(this.f25221a, this.f25224d, this.f25225e)) {
            Lc.v.w().d(this.f25221a, this.f25224d, this.f25225e);
        } else {
            xj0.execute(new Runnable() { // from class: Pc.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25152a.c();
                }
            });
        }
    }

    final /* synthetic */ void d() {
        Lc.v.w().c(this.f25221a);
    }

    final /* synthetic */ void e(Xj0 xj0) {
        if (!Lc.v.w().j(this.f25221a, this.f25224d, this.f25225e)) {
            Lc.v.w().d(this.f25221a, this.f25224d, this.f25225e);
        } else {
            xj0.execute(new Runnable() { // from class: Pc.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25150a.f();
                }
            });
        }
    }

    final /* synthetic */ void f() {
        Lc.v.w().c(this.f25221a);
    }

    final /* synthetic */ void h(AtomicInteger atomicInteger, int i10, int i11, int i12, DialogInterface dialogInterface, int i13) {
        if (atomicInteger.get() != i10) {
            if (atomicInteger.get() == i11) {
                this.f25222b.n(VO.SHAKE);
            } else if (atomicInteger.get() == i12) {
                this.f25222b.n(VO.FLICK);
            } else {
                this.f25222b.n(VO.NONE);
            }
        }
        r();
    }

    final /* synthetic */ void i(String str, DialogInterface dialogInterface, int i10) {
        Lc.v.t();
        D0.t(this.f25221a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    final /* synthetic */ void k() {
        C4595z c4595zW = Lc.v.w();
        String str = this.f25224d;
        String str2 = this.f25225e;
        String str3 = this.f25226f;
        boolean zM = c4595zW.m();
        Context context = this.f25221a;
        c4595zW.h(c4595zW.j(context, str, str2));
        if (c4595zW.m()) {
            if (!zM && !TextUtils.isEmpty(str3)) {
                c4595zW.e(context, str2, str3, str);
            }
            Qc.p.b("Device is linked for debug signals.");
            c4595zW.i(context, "The device is successfully linked for troubleshooting.", false, true);
            return;
        }
        c4595zW.d(context, str, str2);
    }

    final /* synthetic */ void l() {
        C4595z c4595zW = Lc.v.w();
        Context context = this.f25221a;
        String str = this.f25224d;
        String str2 = this.f25225e;
        if (!c4595zW.k(context, str, str2)) {
            c4595zW.i(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
            return;
        }
        if ("2".equals(c4595zW.f25253f)) {
            Qc.p.b("Creative is not pushed for this device.");
            c4595zW.i(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(c4595zW.f25253f)) {
            Qc.p.b("The app is not linked for creative preview.");
            c4595zW.d(context, str, str2);
        } else if ("0".equals(c4595zW.f25253f)) {
            Qc.p.b("Device is linked for in app preview.");
            c4595zW.i(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    public final void m(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f25227g = 0;
            this.f25229i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i10 = this.f25227g;
        if (i10 != -1) {
            if (i10 == 0) {
                if (actionMasked == 5) {
                    this.f25227g = 5;
                    this.f25230j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                    this.f25231k.postDelayed(this.f25232l, ((Long) Mc.A.c().a(C8659lf.f76017J4)).longValue());
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
                this.f25227g = -1;
                this.f25231k.removeCallbacks(this.f25232l);
            }
        }
    }

    public C4591v(Context context, String str) {
        this(context);
        this.f25223c = str;
    }
}
