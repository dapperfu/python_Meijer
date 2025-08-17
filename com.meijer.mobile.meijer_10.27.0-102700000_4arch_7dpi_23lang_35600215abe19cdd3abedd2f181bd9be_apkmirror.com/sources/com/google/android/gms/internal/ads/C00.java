package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public final class C00 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Xj0 f65677a;

    /* renamed from: b, reason: collision with root package name */
    private final ViewGroup f65678b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f65679c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f65680d;

    public C00(Xj0 xj0, ViewGroup viewGroup, Context context, Set set) {
        this.f65677a = xj0;
        this.f65680d = set;
        this.f65678b = viewGroup;
        this.f65679c = context;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 22;
    }

    final /* synthetic */ D00 a() throws Exception {
        if (((Boolean) Mc.A.c().a(C8659lf.f76060M5)).booleanValue() && this.f65678b != null && this.f65680d.contains("banner")) {
            return new D00(Boolean.valueOf(this.f65678b.isHardwareAccelerated()));
        }
        Boolean boolValueOf = null;
        if (((Boolean) Mc.A.c().a(C8659lf.f76074N5)).booleanValue() && this.f65680d.contains("native")) {
            Context context = this.f65679c;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                    try {
                        boolValueOf = Boolean.valueOf((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) != 0);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                } else {
                    boolValueOf = Boolean.TRUE;
                }
                return new D00(boolValueOf);
            }
        }
        return new D00(null);
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return this.f65677a.i0(new Callable() { // from class: com.google.android.gms.internal.ads.B00
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f65401a.a();
            }
        });
    }
}
