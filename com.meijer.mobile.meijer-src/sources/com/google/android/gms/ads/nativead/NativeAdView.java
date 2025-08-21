package com.google.android.gms.ads.nativead;

import Gc.i;
import Oc.A;
import Oc.C4440v1;
import Oc.C4447y;
import Sc.p;
import android.content.Context;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.C8784lf;
import com.google.android.gms.internal.ads.InterfaceC7828ch;

/* loaded from: classes4.dex */
public final class NativeAdView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final FrameLayout f65499a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7828ch f65500b;

    private final FrameLayout d(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    private final void f(String str, View view) {
        InterfaceC7828ch interfaceC7828ch = this.f65500b;
        if (interfaceC7828ch == null) {
            return;
        }
        try {
            interfaceC7828ch.F4(str, com.google.android.gms.dynamic.d.I2(view));
        } catch (RemoteException e10) {
            p.e("Unable to call setAssetView on delegate", e10);
        }
    }

    protected final View a(String str) {
        InterfaceC7828ch interfaceC7828ch = this.f65500b;
        if (interfaceC7828ch != null) {
            try {
                com.google.android.gms.dynamic.b bVarD = interfaceC7828ch.d(str);
                if (bVarD != null) {
                    return (View) com.google.android.gms.dynamic.d.c2(bVarD);
                }
            } catch (RemoteException e10) {
                p.e("Unable to call getAssetView on delegate", e10);
            }
        }
        return null;
    }

    final /* synthetic */ void b(i iVar) {
        InterfaceC7828ch interfaceC7828ch = this.f65500b;
        if (interfaceC7828ch == null) {
            return;
        }
        try {
            if (iVar instanceof C4440v1) {
                interfaceC7828ch.J5(((C4440v1) iVar).b());
            } else if (iVar == null) {
                interfaceC7828ch.J5(null);
            } else {
                p.b("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e10) {
            p.e("Unable to call setMediaContent on delegate", e10);
        }
    }

    final /* synthetic */ void c(ImageView.ScaleType scaleType) {
        InterfaceC7828ch interfaceC7828ch = this.f65500b;
        if (interfaceC7828ch == null || scaleType == null) {
            return;
        }
        try {
            interfaceC7828ch.t2(com.google.android.gms.dynamic.d.I2(scaleType));
        } catch (RemoteException e10) {
            p.e("Unable to call setMediaViewImageScaleType on delegate", e10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f65500b != null) {
            if (((Boolean) A.c().a(C8784lf.f77367tb)).booleanValue()) {
                try {
                    this.f65500b.l0(com.google.android.gms.dynamic.d.I2(motionEvent));
                } catch (RemoteException e10) {
                    p.e("Unable to call handleTouchEvent on delegate", e10);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public AdChoicesView getAdChoicesView() {
        View viewA = a("3011");
        if (viewA instanceof AdChoicesView) {
            return (AdChoicesView) viewA;
        }
        return null;
    }

    public final View getAdvertiserView() {
        return a("3005");
    }

    public final View getBodyView() {
        return a("3004");
    }

    public final View getCallToActionView() {
        return a("3002");
    }

    public final View getHeadlineView() {
        return a("3001");
    }

    public final View getIconView() {
        return a("3003");
    }

    public final View getImageView() {
        return a("3008");
    }

    public final MediaView getMediaView() {
        View viewA = a("3010");
        if (viewA instanceof MediaView) {
            return (MediaView) viewA;
        }
        if (viewA == null) {
            return null;
        }
        p.b("View is not an instance of MediaView");
        return null;
    }

    public final View getPriceView() {
        return a("3007");
    }

    public final View getStarRatingView() {
        return a("3009");
    }

    public final View getStoreView() {
        return a("3006");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f65499a == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(AdChoicesView adChoicesView) {
        f("3011", adChoicesView);
    }

    public final void setAdvertiserView(View view) {
        f("3005", view);
    }

    public final void setBodyView(View view) {
        f("3004", view);
    }

    public final void setCallToActionView(View view) {
        f("3002", view);
    }

    public final void setClickConfirmingView(View view) {
        InterfaceC7828ch interfaceC7828ch = this.f65500b;
        if (interfaceC7828ch == null) {
            return;
        }
        try {
            interfaceC7828ch.f8(com.google.android.gms.dynamic.d.I2(view));
        } catch (RemoteException e10) {
            p.e("Unable to call setClickConfirmingView on delegate", e10);
        }
    }

    public final void setHeadlineView(View view) {
        f("3001", view);
    }

    public final void setIconView(View view) {
        f("3003", view);
    }

    public final void setImageView(View view) {
        f("3008", view);
    }

    public final void setMediaView(MediaView mediaView) {
        f("3010", mediaView);
        if (mediaView == null) {
            return;
        }
        mediaView.a(new c(this));
        mediaView.b(new d(this));
    }

    public void setNativeAd(NativeAd nativeAd) {
        InterfaceC7828ch interfaceC7828ch = this.f65500b;
        if (interfaceC7828ch == null) {
            return;
        }
        try {
            interfaceC7828ch.c3((com.google.android.gms.dynamic.b) nativeAd.d());
        } catch (RemoteException e10) {
            p.e("Unable to call setNativeAd on delegate", e10);
        }
    }

    public final void setPriceView(View view) {
        f("3007", view);
    }

    public final void setStarRatingView(View view) {
        f("3009", view);
    }

    public final void setStoreView(View view) {
        f("3006", view);
    }

    public NativeAdView(Context context) {
        super(context);
        this.f65499a = d(context);
        this.f65500b = e();
    }

    private final InterfaceC7828ch e() {
        if (isInEditMode()) {
            return null;
        }
        FrameLayout frameLayout = this.f65499a;
        return C4447y.a().h(frameLayout.getContext(), this, frameLayout);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        super.bringChildToFront(this.f65499a);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f65499a;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        InterfaceC7828ch interfaceC7828ch = this.f65500b;
        if (interfaceC7828ch == null) {
            return;
        }
        try {
            interfaceC7828ch.f2(com.google.android.gms.dynamic.d.I2(view), i10);
        } catch (RemoteException e10) {
            p.e("Unable to call onVisibilityChanged on delegate", e10);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f65499a);
    }
}
