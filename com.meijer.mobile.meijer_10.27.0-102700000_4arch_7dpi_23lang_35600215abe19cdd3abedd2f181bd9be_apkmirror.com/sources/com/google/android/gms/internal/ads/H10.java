package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Callable;
import qd.C16519f;

/* loaded from: classes6.dex */
public final class H10 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Xj0 f67324a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f67325b;

    /* renamed from: c, reason: collision with root package name */
    private final Qc.a f67326c;

    /* renamed from: d, reason: collision with root package name */
    private final String f67327d;

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 35;
    }

    final /* synthetic */ I10 a() throws Exception {
        boolean zG = C16519f.a(this.f67325b).g();
        Lc.v.t();
        boolean zF = Pc.D0.f(this.f67325b);
        String str = this.f67326c.f29929a;
        Lc.v.t();
        boolean zG2 = Pc.D0.g();
        Lc.v.t();
        ApplicationInfo applicationInfo = this.f67325b.getApplicationInfo();
        int i10 = applicationInfo == null ? 0 : applicationInfo.targetSdkVersion;
        Context context = this.f67325b;
        return new I10(zG, zF, str, zG2, i10, DynamiteModule.c(context, ModuleDescriptor.MODULE_ID), DynamiteModule.a(context, ModuleDescriptor.MODULE_ID), this.f67327d);
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return this.f67324a.i0(new Callable() { // from class: com.google.android.gms.internal.ads.G10
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f67061a.a();
            }
        });
    }

    H10(Xj0 xj0, Context context, Qc.a aVar, String str) {
        this.f67324a = xj0;
        this.f67325b = context;
        this.f67326c = aVar;
        this.f67327d = str;
    }
}
