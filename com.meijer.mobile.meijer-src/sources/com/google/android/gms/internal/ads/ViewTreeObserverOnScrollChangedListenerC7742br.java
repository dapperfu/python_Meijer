package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.br, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class ViewTreeObserverOnScrollChangedListenerC7742br extends AbstractC7848cr implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f73719b;

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = (ViewTreeObserver.OnScrollChangedListener) this.f73719b.get();
        if (onScrollChangedListener != null) {
            onScrollChangedListener.onScrollChanged();
        } else {
            e();
        }
    }

    public ViewTreeObserverOnScrollChangedListenerC7742br(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        super(view);
        this.f73719b = new WeakReference(onScrollChangedListener);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7848cr
    protected final void a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7848cr
    protected final void b(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this);
    }
}
