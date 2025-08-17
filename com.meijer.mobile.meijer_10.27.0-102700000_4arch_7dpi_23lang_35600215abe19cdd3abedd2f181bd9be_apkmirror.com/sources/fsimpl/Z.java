package fsimpl;

import android.app.Activity;
import android.view.View;

/* loaded from: classes14.dex */
class Z implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f131451a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f131452b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Y f131453c;

    Z(Y y10, View view, Activity activity) {
        this.f131453c = y10;
        this.f131451a = view;
        this.f131452b = activity;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f131451a.removeOnAttachStateChangeListener(this);
        this.f131453c.a(this.f131452b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
    }
}
