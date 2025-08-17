package com.google.android.tv.ads.controls;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.request.target.d;
import com.google.android.gms.internal.atv_ads_framework.B1;
import com.google.android.gms.internal.atv_ads_framework.o2;
import com.google.android.gms.internal.atv_ads_framework.p2;

/* loaded from: classes4.dex */
final class c extends d {

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ SideDrawerFragment f88026g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(SideDrawerFragment sideDrawerFragment, ImageView imageView) {
        super(imageView);
        this.f88026g = sideDrawerFragment;
    }

    @Override // com.bumptech.glide.request.target.d
    protected final void d(Drawable drawable) {
        this.f88026g.f88020d.setImageDrawable(drawable);
    }

    @Override // com.bumptech.glide.request.target.j
    public final void onLoadFailed(Drawable drawable) {
        B1 b1A = B1.a(this.f88026g.requireContext());
        o2 o2VarQ = p2.q();
        o2VarQ.g(2);
        o2VarQ.j(2);
        o2VarQ.i(4);
        b1A.b((p2) o2VarQ.c());
        this.f88026g.t0();
    }

    @Override // com.bumptech.glide.request.target.j
    public final /* bridge */ /* synthetic */ void onResourceReady(Object obj, n7.b bVar) {
        B1 b1A = B1.a(this.f88026g.requireContext());
        o2 o2VarQ = p2.q();
        o2VarQ.g(2);
        o2VarQ.j(2);
        b1A.b((p2) o2VarQ.c());
        this.f88026g.f88020d.setImageDrawable((Drawable) obj);
    }
}
