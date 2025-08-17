package com.medallia.digital.mobilesdk;

import android.content.Context;
import android.view.View;
import android.view.WindowInsets;
import android.widget.RelativeLayout;

/* loaded from: classes7.dex */
abstract class m4 extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    final l4 f92541a;

    /* renamed from: b, reason: collision with root package name */
    View f92542b;

    /* renamed from: c, reason: collision with root package name */
    RelativeLayout f92543c;

    /* renamed from: d, reason: collision with root package name */
    RelativeLayout f92544d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f92545e;

    /* renamed from: f, reason: collision with root package name */
    String f92546f;

    m4(l4 l4Var, Context context, String str) {
        super(context);
        this.f92541a = l4Var;
        this.f92546f = str;
        a(context);
    }

    private void a(Context context) {
        View viewInflate = View.inflate(context, R.layout.medallia_view_base_banner, this);
        this.f92542b = viewInflate;
        this.f92544d = (RelativeLayout) viewInflate.findViewById(R.id.medallia_banner_base_view);
        RelativeLayout relativeLayout = (RelativeLayout) this.f92542b.findViewById(R.id.medallia_shadow_view);
        this.f92543c = relativeLayout;
        relativeLayout.addView(b(context));
    }

    abstract void a();

    abstract RelativeLayout b(Context context);

    abstract boolean b();

    abstract boolean c();

    abstract boolean d();

    abstract View e();

    abstract View f();

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return super.onApplyWindowInsets(windowInsets);
    }
}
