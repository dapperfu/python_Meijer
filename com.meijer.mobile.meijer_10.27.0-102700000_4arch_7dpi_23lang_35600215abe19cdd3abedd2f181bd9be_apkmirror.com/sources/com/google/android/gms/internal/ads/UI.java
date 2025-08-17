package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class UI extends AbstractBinderC7490ah implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, InterfaceViewOnClickListenerC9915xJ {

    /* renamed from: o, reason: collision with root package name */
    public static final AbstractC7917eh0 f70573o = AbstractC7917eh0.x("2011", "1009", "3010");

    /* renamed from: a, reason: collision with root package name */
    private final String f70574a;

    /* renamed from: c, reason: collision with root package name */
    private FrameLayout f70576c;

    /* renamed from: d, reason: collision with root package name */
    private FrameLayout f70577d;

    /* renamed from: e, reason: collision with root package name */
    private final Xj0 f70578e;

    /* renamed from: f, reason: collision with root package name */
    private View f70579f;

    /* renamed from: h, reason: collision with root package name */
    private C9379sI f70581h;

    /* renamed from: i, reason: collision with root package name */
    private ViewOnAttachStateChangeListenerC9934xb f70582i;

    /* renamed from: k, reason: collision with root package name */
    private InterfaceC7235Ug f70584k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f70585l;

    /* renamed from: n, reason: collision with root package name */
    private GestureDetector f70587n;

    /* renamed from: b, reason: collision with root package name */
    private Map f70575b = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    private com.google.android.gms.dynamic.b f70583j = null;

    /* renamed from: m, reason: collision with root package name */
    private boolean f70586m = false;

    /* renamed from: g, reason: collision with root package name */
    private final int f70580g = 244410000;

    private final synchronized void p5(String str) {
        DisplayMetrics displayMetrics;
        try {
            View frameLayout = new FrameLayout(this.f70577d.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Context context = this.f70577d.getContext();
            frameLayout.setClickable(false);
            frameLayout.setFocusable(false);
            if (!TextUtils.isEmpty(str)) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    try {
                        byte[] bArrDecode = Base64.decode(str, 0);
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
                        bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                        bitmapDrawable.setTileModeXY(tileMode, tileMode);
                        frameLayout.setBackground(bitmapDrawable);
                    } catch (IllegalArgumentException e10) {
                        Qc.p.h("Encountered invalid base64 watermark.", e10);
                    }
                }
            }
            this.f70577d.addView(frameLayout);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized void zzu() {
        this.f70578e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.TI
            @Override // java.lang.Runnable
            public final void run() {
                this.f70348a.D9();
            }
        });
    }

    private final synchronized void zzv() {
        if (!((Boolean) Mc.A.c().a(C8659lf.f76527tb)).booleanValue() || this.f70581h.I() == 0) {
            return;
        }
        this.f70587n = new GestureDetector(this.f70576c.getContext(), new GestureDetectorOnGestureListenerC7672cJ(this.f70581h, this));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7703ch
    public final synchronized void B5(InterfaceC7235Ug interfaceC7235Ug) {
        if (!this.f70586m) {
            this.f70585l = true;
            this.f70584k = interfaceC7235Ug;
            C9379sI c9379sI = this.f70581h;
            if (c9379sI != null) {
                c9379sI.P().b(interfaceC7235Ug);
            }
        }
    }

    public final FrameLayout C9() {
        return this.f70576c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7703ch
    public final synchronized void X2(com.google.android.gms.dynamic.b bVar) {
        if (this.f70586m) {
            return;
        }
        Object objB2 = com.google.android.gms.dynamic.d.b2(bVar);
        if (!(objB2 instanceof C9379sI)) {
            Qc.p.g("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        C9379sI c9379sI = this.f70581h;
        if (c9379sI != null) {
            c9379sI.B(this);
        }
        zzu();
        C9379sI c9379sI2 = (C9379sI) objB2;
        this.f70581h = c9379sI2;
        c9379sI2.A(this);
        this.f70581h.s(this.f70576c);
        this.f70581h.Z(this.f70577d);
        if (this.f70585l) {
            this.f70581h.P().b(this.f70584k);
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f76226Y3)).booleanValue() && !TextUtils.isEmpty(this.f70581h.T())) {
            p5(this.f70581h.T());
        }
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7703ch
    public final synchronized com.google.android.gms.dynamic.b d(String str) {
        return com.google.android.gms.dynamic.d.F2(s(str));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7703ch
    public final synchronized void d2(com.google.android.gms.dynamic.b bVar, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC9915xJ
    public final synchronized void f6(String str, View view, boolean z10) {
        if (!this.f70586m) {
            if (view == null) {
                this.f70575b.remove(str);
                return;
            }
            this.f70575b.put(str, new WeakReference(view));
            if (!"1098".equals(str) && !"3011".equals(str)) {
                if (Pc.X.i(this.f70580g)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7703ch
    public final synchronized void i8(com.google.android.gms.dynamic.b bVar) {
        this.f70581h.v((View) com.google.android.gms.dynamic.d.b2(bVar));
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        C9379sI c9379sI = this.f70581h;
        if (c9379sI == null || !c9379sI.D()) {
            return;
        }
        this.f70581h.a0();
        this.f70581h.l(view, this.f70576c, zzl(), zzm(), false);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        C9379sI c9379sI = this.f70581h;
        if (c9379sI != null) {
            FrameLayout frameLayout = this.f70576c;
            c9379sI.j(frameLayout, zzl(), zzm(), C9379sI.G(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        C9379sI c9379sI = this.f70581h;
        if (c9379sI != null) {
            FrameLayout frameLayout = this.f70576c;
            c9379sI.j(frameLayout, zzl(), zzm(), C9379sI.G(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        C9379sI c9379sI = this.f70581h;
        if (c9379sI != null) {
            c9379sI.t(view, motionEvent, this.f70576c);
            if (((Boolean) Mc.A.c().a(C8659lf.f76527tb)).booleanValue() && this.f70587n != null && this.f70581h.I() != 0) {
                this.f70587n.onTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7703ch
    public final synchronized void q2(com.google.android.gms.dynamic.b bVar) {
        if (this.f70586m) {
            return;
        }
        this.f70583j = bVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC9915xJ
    public final synchronized View s(String str) {
        WeakReference weakReference;
        if (!this.f70586m && (weakReference = (WeakReference) this.f70575b.get(str)) != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7703ch
    public final synchronized void s4(String str, com.google.android.gms.dynamic.b bVar) {
        f6(str, (View) com.google.android.gms.dynamic.d.b2(bVar), true);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7703ch
    public final synchronized void zzc() {
        try {
            if (this.f70586m) {
                return;
            }
            C9379sI c9379sI = this.f70581h;
            if (c9379sI != null) {
                c9379sI.B(this);
                this.f70581h = null;
            }
            this.f70575b.clear();
            this.f70576c.removeAllViews();
            this.f70577d.removeAllViews();
            this.f70575b = null;
            this.f70576c = null;
            this.f70577d = null;
            this.f70579f = null;
            this.f70582i = null;
            this.f70586m = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC9915xJ
    public final /* synthetic */ View zzf() {
        return this.f70576c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC9915xJ
    public final FrameLayout zzh() {
        return this.f70577d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC9915xJ
    public final ViewOnAttachStateChangeListenerC9934xb zzi() {
        return this.f70582i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC9915xJ
    public final com.google.android.gms.dynamic.b zzj() {
        return this.f70583j;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC9915xJ
    public final synchronized String zzk() {
        return this.f70574a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC9915xJ
    public final synchronized Map zzl() {
        return this.f70575b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC9915xJ
    public final synchronized Map zzm() {
        return this.f70575b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC9915xJ
    public final synchronized Map zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC9915xJ
    public final synchronized JSONObject zzo() {
        C9379sI c9379sI = this.f70581h;
        if (c9379sI == null) {
            return null;
        }
        return c9379sI.V(this.f70576c, zzl(), zzm());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC9915xJ
    public final synchronized JSONObject zzp() {
        C9379sI c9379sI = this.f70581h;
        if (c9379sI == null) {
            return null;
        }
        return c9379sI.W(this.f70576c, zzl(), zzm());
    }

    final /* synthetic */ void D9() {
        if (this.f70579f == null) {
            View view = new View(this.f70576c.getContext());
            this.f70579f = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.f70576c != this.f70579f.getParent()) {
            this.f70576c.addView(this.f70579f);
        }
    }

    public UI(FrameLayout frameLayout, FrameLayout frameLayout2, int i10) {
        String str;
        this.f70576c = frameLayout;
        this.f70577d = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.f70574a = str;
        Lc.v.B();
        C7411Zq.a(frameLayout, this);
        Lc.v.B();
        C7411Zq.b(frameLayout, this);
        this.f70578e = C6908Kq.f68179f;
        this.f70582i = new ViewOnAttachStateChangeListenerC9934xb(this.f70576c.getContext(), this.f70576c);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7703ch
    public final void i0(com.google.android.gms.dynamic.b bVar) {
        onTouch(this.f70576c, (MotionEvent) com.google.android.gms.dynamic.d.b2(bVar));
    }
}
