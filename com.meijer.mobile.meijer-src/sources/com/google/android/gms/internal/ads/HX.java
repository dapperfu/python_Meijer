package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public final class HX implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Xj0 f68291a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f68292b;

    /* renamed from: c, reason: collision with root package name */
    private final C9695u60 f68293c;

    /* renamed from: d, reason: collision with root package name */
    private final View f68294d;

    public HX(Xj0 xj0, Context context, C9695u60 c9695u60, ViewGroup viewGroup) {
        this.f68291a = xj0;
        this.f68292b = context;
        this.f68293c = c9695u60;
        this.f68294d = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 3;
    }

    final /* synthetic */ JX a() throws Exception {
        ArrayList arrayList = new ArrayList();
        View view = this.f68294d;
        while (view != null) {
            Object parent = view.getParent();
            if (parent == null) {
                break;
            }
            int iIndexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", iIndexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return new JX(this.f68292b, this.f68293c.f79579e, arrayList);
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        C8784lf.a(this.f68292b);
        return this.f68291a.k0(new Callable() { // from class: com.google.android.gms.internal.ads.GX
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f68062a.a();
            }
        });
    }
}
