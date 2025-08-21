package com.medallia.digital.mobilesdk;

import android.content.Context;
import android.view.View;
import android.view.WindowInsets;
import android.widget.RelativeLayout;

/* loaded from: classes8.dex */
abstract class m4 extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    final l4 f93380a;

    /* renamed from: b, reason: collision with root package name */
    View f93381b;

    /* renamed from: c, reason: collision with root package name */
    RelativeLayout f93382c;

    /* renamed from: d, reason: collision with root package name */
    RelativeLayout f93383d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f93384e;

    /* renamed from: f, reason: collision with root package name */
    String f93385f;

    m4(l4 l4Var, Context context, String str) {
        super(context);
        this.f93380a = l4Var;
        this.f93385f = str;
        a(context);
    }

    private void a(Context context) {
        View viewInflate = View.inflate(context, R.layout.medallia_view_base_banner, this);
        this.f93381b = viewInflate;
        this.f93383d = (RelativeLayout) viewInflate.findViewById(R.id.medallia_banner_base_view);
        RelativeLayout relativeLayout = (RelativeLayout) this.f93381b.findViewById(R.id.medallia_shadow_view);
        this.f93382c = relativeLayout;
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
