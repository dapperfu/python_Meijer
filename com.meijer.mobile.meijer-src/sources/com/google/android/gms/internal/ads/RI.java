package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class RI extends AbstractBinderC8255gh implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, InterfaceViewOnClickListenerC10040xJ {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f70692a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f70693b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map f70694c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map f70695d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private C9504sI f70696e;

    /* renamed from: f, reason: collision with root package name */
    private ViewOnAttachStateChangeListenerC10059xb f70697f;

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        C9504sI c9504sI = this.f70696e;
        if (c9504sI != null) {
            c9504sI.l(view, zzf(), zzl(), zzm(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        C9504sI c9504sI = this.f70696e;
        if (c9504sI != null) {
            c9504sI.j(zzf(), zzl(), zzm(), C9504sI.G(zzf()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        C9504sI c9504sI = this.f70696e;
        if (c9504sI != null) {
            c9504sI.j(zzf(), zzl(), zzm(), C9504sI.G(zzf()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        C9504sI c9504sI = this.f70696e;
        if (c9504sI != null) {
            c9504sI.t(view, motionEvent, zzf());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8362hh
    public final synchronized void p0(com.google.android.gms.dynamic.b bVar) {
        Object objC2 = com.google.android.gms.dynamic.d.c2(bVar);
        if (!(objC2 instanceof C9504sI)) {
            Sc.p.g("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        C9504sI c9504sI = this.f70696e;
        if (c9504sI != null) {
            c9504sI.B(this);
        }
        C9504sI c9504sI2 = (C9504sI) objC2;
        if (!c9504sI2.C()) {
            Sc.p.d("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
            return;
        }
        this.f70696e = c9504sI2;
        c9504sI2.A(this);
        this.f70696e.s(zzf());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC10040xJ
    public final synchronized View s(String str) {
        WeakReference weakReference = (WeakReference) this.f70695d.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8362hh
    public final synchronized void s3(com.google.android.gms.dynamic.b bVar) {
        try {
            if (this.f70696e != null) {
                Object objC2 = com.google.android.gms.dynamic.d.c2(bVar);
                if (!(objC2 instanceof View)) {
                    Sc.p.g("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                }
                this.f70696e.v((View) objC2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC10040xJ
    public final synchronized void t6(String str, View view, boolean z10) {
        this.f70695d.put(str, new WeakReference(view));
        if (!"1098".equals(str) && !"3011".equals(str)) {
            this.f70693b.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8362hh
    public final synchronized void zzd() {
        C9504sI c9504sI = this.f70696e;
        if (c9504sI != null) {
            c9504sI.B(this);
            this.f70696e = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC10040xJ
    public final FrameLayout zzh() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC10040xJ
    public final ViewOnAttachStateChangeListenerC10059xb zzi() {
        return this.f70697f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC10040xJ
    public final synchronized com.google.android.gms.dynamic.b zzj() {
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC10040xJ
    public final synchronized String zzk() {
        return "1007";
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC10040xJ
    public final synchronized Map zzl() {
        return this.f70695d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC10040xJ
    public final synchronized Map zzm() {
        return this.f70693b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC10040xJ
    public final synchronized Map zzn() {
        return this.f70694c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC10040xJ
    public final synchronized JSONObject zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC10040xJ
    public final synchronized JSONObject zzp() {
        C9504sI c9504sI = this.f70696e;
        if (c9504sI == null) {
            return null;
        }
        return c9504sI.W(zzf(), zzl(), zzm());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC10040xJ
    public final View zzf() {
        return (View) this.f70692a.get();
    }

    public RI(View view, HashMap map, HashMap map2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        Nc.v.B();
        C7536Zq.a(view, this);
        Nc.v.B();
        C7536Zq.b(view, this);
        this.f70692a = new WeakReference(view);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            View view2 = (View) entry.getValue();
            if (view2 != null) {
                this.f70693b.put(str, new WeakReference(view2));
                if (!"1098".equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.f70695d.putAll(this.f70693b);
        for (Map.Entry entry2 : map2.entrySet()) {
            View view3 = (View) entry2.getValue();
            if (view3 != null) {
                this.f70694c.put((String) entry2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.f70695d.putAll(this.f70694c);
        this.f70697f = new ViewOnAttachStateChangeListenerC10059xb(view.getContext(), view);
    }
}
