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
public final class UI extends AbstractBinderC7615ah implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, InterfaceViewOnClickListenerC10040xJ {

    /* renamed from: o, reason: collision with root package name */
    public static final AbstractC8042eh0 f71413o = AbstractC8042eh0.x("2011", "1009", "3010");

    /* renamed from: a, reason: collision with root package name */
    private final String f71414a;

    /* renamed from: c, reason: collision with root package name */
    private FrameLayout f71416c;

    /* renamed from: d, reason: collision with root package name */
    private FrameLayout f71417d;

    /* renamed from: e, reason: collision with root package name */
    private final Xj0 f71418e;

    /* renamed from: f, reason: collision with root package name */
    private View f71419f;

    /* renamed from: h, reason: collision with root package name */
    private C9504sI f71421h;

    /* renamed from: i, reason: collision with root package name */
    private ViewOnAttachStateChangeListenerC10059xb f71422i;

    /* renamed from: k, reason: collision with root package name */
    private InterfaceC7360Ug f71424k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f71425l;

    /* renamed from: n, reason: collision with root package name */
    private GestureDetector f71427n;

    /* renamed from: b, reason: collision with root package name */
    private Map f71415b = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    private com.google.android.gms.dynamic.b f71423j = null;

    /* renamed from: m, reason: collision with root package name */
    private boolean f71426m = false;

    /* renamed from: g, reason: collision with root package name */
    private final int f71420g = 244410000;

    private final synchronized void x5(String str) {
        DisplayMetrics displayMetrics;
        try {
            View frameLayout = new FrameLayout(this.f71417d.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Context context = this.f71417d.getContext();
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
                        Sc.p.h("Encountered invalid base64 watermark.", e10);
                    }
                }
            }
            this.f71417d.addView(frameLayout);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized void zzu() {
        this.f71418e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.TI
            @Override // java.lang.Runnable
            public final void run() {
                this.f71188a.D9();
            }
        });
    }

    private final synchronized void zzv() {
        if (!((Boolean) Oc.A.c().a(C8784lf.f77367tb)).booleanValue() || this.f71421h.I() == 0) {
            return;
        }
        this.f71427n = new GestureDetector(this.f71416c.getContext(), new GestureDetectorOnGestureListenerC7797cJ(this.f71421h, this));
    }

    public final FrameLayout C9() {
        return this.f71416c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7828ch
    public final synchronized void F4(String str, com.google.android.gms.dynamic.b bVar) {
        t6(str, (View) com.google.android.gms.dynamic.d.c2(bVar), true);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7828ch
    public final synchronized void J5(InterfaceC7360Ug interfaceC7360Ug) {
        if (!this.f71426m) {
            this.f71425l = true;
            this.f71424k = interfaceC7360Ug;
            C9504sI c9504sI = this.f71421h;
            if (c9504sI != null) {
                c9504sI.P().b(interfaceC7360Ug);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7828ch
    public final synchronized void c3(com.google.android.gms.dynamic.b bVar) {
        if (this.f71426m) {
            return;
        }
        Object objC2 = com.google.android.gms.dynamic.d.c2(bVar);
        if (!(objC2 instanceof C9504sI)) {
            Sc.p.g("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        C9504sI c9504sI = this.f71421h;
        if (c9504sI != null) {
            c9504sI.B(this);
        }
        zzu();
        C9504sI c9504sI2 = (C9504sI) objC2;
        this.f71421h = c9504sI2;
        c9504sI2.A(this);
        this.f71421h.s(this.f71416c);
        this.f71421h.Z(this.f71417d);
        if (this.f71425l) {
            this.f71421h.P().b(this.f71424k);
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f77066Y3)).booleanValue() && !TextUtils.isEmpty(this.f71421h.T())) {
            x5(this.f71421h.T());
        }
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7828ch
    public final synchronized com.google.android.gms.dynamic.b d(String str) {
        return com.google.android.gms.dynamic.d.I2(s(str));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7828ch
    public final synchronized void f2(com.google.android.gms.dynamic.b bVar, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7828ch
    public final synchronized void f8(com.google.android.gms.dynamic.b bVar) {
        this.f71421h.v((View) com.google.android.gms.dynamic.d.c2(bVar));
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        C9504sI c9504sI = this.f71421h;
        if (c9504sI == null || !c9504sI.D()) {
            return;
        }
        this.f71421h.a0();
        this.f71421h.l(view, this.f71416c, zzl(), zzm(), false);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        C9504sI c9504sI = this.f71421h;
        if (c9504sI != null) {
            FrameLayout frameLayout = this.f71416c;
            c9504sI.j(frameLayout, zzl(), zzm(), C9504sI.G(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        C9504sI c9504sI = this.f71421h;
        if (c9504sI != null) {
            FrameLayout frameLayout = this.f71416c;
            c9504sI.j(frameLayout, zzl(), zzm(), C9504sI.G(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        C9504sI c9504sI = this.f71421h;
        if (c9504sI != null) {
            c9504sI.t(view, motionEvent, this.f71416c);
            if (((Boolean) Oc.A.c().a(C8784lf.f77367tb)).booleanValue() && this.f71427n != null && this.f71421h.I() != 0) {
                this.f71427n.onTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC10040xJ
    public final synchronized View s(String str) {
        WeakReference weakReference;
        if (!this.f71426m && (weakReference = (WeakReference) this.f71415b.get(str)) != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7828ch
    public final synchronized void t2(com.google.android.gms.dynamic.b bVar) {
        if (this.f71426m) {
            return;
        }
        this.f71423j = bVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC10040xJ
    public final synchronized void t6(String str, View view, boolean z10) {
        if (!this.f71426m) {
            if (view == null) {
                this.f71415b.remove(str);
                return;
            }
            this.f71415b.put(str, new WeakReference(view));
            if (!"1098".equals(str) && !"3011".equals(str)) {
                if (Rc.X.i(this.f71420g)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7828ch
    public final synchronized void zzc() {
        try {
            if (this.f71426m) {
                return;
            }
            C9504sI c9504sI = this.f71421h;
            if (c9504sI != null) {
                c9504sI.B(this);
                this.f71421h = null;
            }
            this.f71415b.clear();
            this.f71416c.removeAllViews();
            this.f71417d.removeAllViews();
            this.f71415b = null;
            this.f71416c = null;
            this.f71417d = null;
            this.f71419f = null;
            this.f71422i = null;
            this.f71426m = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC10040xJ
    public final /* synthetic */ View zzf() {
        return this.f71416c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC10040xJ
    public final FrameLayout zzh() {
        return this.f71417d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC10040xJ
    public final ViewOnAttachStateChangeListenerC10059xb zzi() {
        return this.f71422i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC10040xJ
    public final com.google.android.gms.dynamic.b zzj() {
        return this.f71423j;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC10040xJ
    public final synchronized String zzk() {
        return this.f71414a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC10040xJ
    public final synchronized Map zzl() {
        return this.f71415b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC10040xJ
    public final synchronized Map zzm() {
        return this.f71415b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC10040xJ
    public final synchronized Map zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC10040xJ
    public final synchronized JSONObject zzo() {
        C9504sI c9504sI = this.f71421h;
        if (c9504sI == null) {
            return null;
        }
        return c9504sI.V(this.f71416c, zzl(), zzm());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC10040xJ
    public final synchronized JSONObject zzp() {
        C9504sI c9504sI = this.f71421h;
        if (c9504sI == null) {
            return null;
        }
        return c9504sI.W(this.f71416c, zzl(), zzm());
    }

    final /* synthetic */ void D9() {
        if (this.f71419f == null) {
            View view = new View(this.f71416c.getContext());
            this.f71419f = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.f71416c != this.f71419f.getParent()) {
            this.f71416c.addView(this.f71419f);
        }
    }

    public UI(FrameLayout frameLayout, FrameLayout frameLayout2, int i10) {
        String str;
        this.f71416c = frameLayout;
        this.f71417d = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.f71414a = str;
        Nc.v.B();
        C7536Zq.a(frameLayout, this);
        Nc.v.B();
        C7536Zq.b(frameLayout, this);
        this.f71418e = C7033Kq.f69019f;
        this.f71422i = new ViewOnAttachStateChangeListenerC10059xb(this.f71416c.getContext(), this.f71416c);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7828ch
    public final void l0(com.google.android.gms.dynamic.b bVar) {
        onTouch(this.f71416c, (MotionEvent) com.google.android.gms.dynamic.d.c2(bVar));
    }
}
