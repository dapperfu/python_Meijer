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
public final class RI extends AbstractBinderC8130gh implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, InterfaceViewOnClickListenerC9915xJ {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f69852a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f69853b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map f69854c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map f69855d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private C9379sI f69856e;

    /* renamed from: f, reason: collision with root package name */
    private ViewOnAttachStateChangeListenerC9934xb f69857f;

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC9915xJ
    public final synchronized void f6(String str, View view, boolean z10) {
        this.f69855d.put(str, new WeakReference(view));
        if (!"1098".equals(str) && !"3011".equals(str)) {
            this.f69853b.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8237hh
    public final synchronized void k3(com.google.android.gms.dynamic.b bVar) {
        try {
            if (this.f69856e != null) {
                Object objB2 = com.google.android.gms.dynamic.d.b2(bVar);
                if (!(objB2 instanceof View)) {
                    Qc.p.g("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                }
                this.f69856e.v((View) objB2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8237hh
    public final synchronized void o0(com.google.android.gms.dynamic.b bVar) {
        Object objB2 = com.google.android.gms.dynamic.d.b2(bVar);
        if (!(objB2 instanceof C9379sI)) {
            Qc.p.g("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        C9379sI c9379sI = this.f69856e;
        if (c9379sI != null) {
            c9379sI.B(this);
        }
        C9379sI c9379sI2 = (C9379sI) objB2;
        if (!c9379sI2.C()) {
            Qc.p.d("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
            return;
        }
        this.f69856e = c9379sI2;
        c9379sI2.A(this);
        this.f69856e.s(zzf());
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        C9379sI c9379sI = this.f69856e;
        if (c9379sI != null) {
            c9379sI.l(view, zzf(), zzl(), zzm(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        C9379sI c9379sI = this.f69856e;
        if (c9379sI != null) {
            c9379sI.j(zzf(), zzl(), zzm(), C9379sI.G(zzf()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        C9379sI c9379sI = this.f69856e;
        if (c9379sI != null) {
            c9379sI.j(zzf(), zzl(), zzm(), C9379sI.G(zzf()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        C9379sI c9379sI = this.f69856e;
        if (c9379sI != null) {
            c9379sI.t(view, motionEvent, zzf());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC9915xJ
    public final synchronized View s(String str) {
        WeakReference weakReference = (WeakReference) this.f69855d.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8237hh
    public final synchronized void zzd() {
        C9379sI c9379sI = this.f69856e;
        if (c9379sI != null) {
            c9379sI.B(this);
            this.f69856e = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC9915xJ
    public final FrameLayout zzh() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC9915xJ
    public final ViewOnAttachStateChangeListenerC9934xb zzi() {
        return this.f69857f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC9915xJ
    public final synchronized com.google.android.gms.dynamic.b zzj() {
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC9915xJ
    public final synchronized String zzk() {
        return "1007";
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC9915xJ
    public final synchronized Map zzl() {
        return this.f69855d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC9915xJ
    public final synchronized Map zzm() {
        return this.f69853b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC9915xJ
    public final synchronized Map zzn() {
        return this.f69854c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC9915xJ
    public final synchronized JSONObject zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC9915xJ
    public final synchronized JSONObject zzp() {
        C9379sI c9379sI = this.f69856e;
        if (c9379sI == null) {
            return null;
        }
        return c9379sI.W(zzf(), zzl(), zzm());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC9915xJ
    public final View zzf() {
        return (View) this.f69852a.get();
    }

    public RI(View view, HashMap map, HashMap map2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        Lc.v.B();
        C7411Zq.a(view, this);
        Lc.v.B();
        C7411Zq.b(view, this);
        this.f69852a = new WeakReference(view);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            View view2 = (View) entry.getValue();
            if (view2 != null) {
                this.f69853b.put(str, new WeakReference(view2));
                if (!"1098".equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.f69855d.putAll(this.f69853b);
        for (Map.Entry entry2 : map2.entrySet()) {
            View view3 = (View) entry2.getValue();
            if (view3 != null) {
                this.f69854c.put((String) entry2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.f69855d.putAll(this.f69854c);
        this.f69857f = new ViewOnAttachStateChangeListenerC9934xb(view.getContext(), view);
    }
}
