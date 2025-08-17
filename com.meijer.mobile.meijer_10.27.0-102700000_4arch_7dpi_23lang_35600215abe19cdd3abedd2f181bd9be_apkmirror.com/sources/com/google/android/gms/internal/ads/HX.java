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
    private final Xj0 f67451a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f67452b;

    /* renamed from: c, reason: collision with root package name */
    private final C9570u60 f67453c;

    /* renamed from: d, reason: collision with root package name */
    private final View f67454d;

    public HX(Xj0 xj0, Context context, C9570u60 c9570u60, ViewGroup viewGroup) {
        this.f67451a = xj0;
        this.f67452b = context;
        this.f67453c = c9570u60;
        this.f67454d = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 3;
    }

    final /* synthetic */ JX a() throws Exception {
        ArrayList arrayList = new ArrayList();
        View view = this.f67454d;
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
        return new JX(this.f67452b, this.f67453c.f78739e, arrayList);
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        C8659lf.a(this.f67452b);
        return this.f67451a.i0(new Callable() { // from class: com.google.android.gms.internal.ads.GX
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f67222a.a();
            }
        });
    }
}
