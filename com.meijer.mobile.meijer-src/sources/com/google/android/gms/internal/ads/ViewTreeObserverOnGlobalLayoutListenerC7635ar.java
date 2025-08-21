package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.ar, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class ViewTreeObserverOnGlobalLayoutListenerC7635ar extends AbstractC7848cr implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f73396b;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) this.f73396b.get();
        if (onGlobalLayoutListener != null) {
            onGlobalLayoutListener.onGlobalLayout();
        } else {
            e();
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC7635ar(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        super(view);
        this.f73396b = new WeakReference(onGlobalLayoutListener);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7848cr
    protected final void a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7848cr
    protected final void b(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }
}
