package fsimpl;

import android.app.Activity;
import android.view.View;

/* loaded from: classes15.dex */
class Z implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f132701a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f132702b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Y f132703c;

    Z(Y y10, View view, Activity activity) {
        this.f132703c = y10;
        this.f132701a = view;
        this.f132702b = activity;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f132701a.removeOnAttachStateChangeListener(this);
        this.f132703c.a(this.f132702b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
    }
}
