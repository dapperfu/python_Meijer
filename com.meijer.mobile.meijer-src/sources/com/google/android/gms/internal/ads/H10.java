package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Callable;
import sd.C17067f;

/* loaded from: classes6.dex */
public final class H10 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Xj0 f68164a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f68165b;

    /* renamed from: c, reason: collision with root package name */
    private final Sc.a f68166c;

    /* renamed from: d, reason: collision with root package name */
    private final String f68167d;

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 35;
    }

    final /* synthetic */ I10 a() throws Exception {
        boolean zG = C17067f.a(this.f68165b).g();
        Nc.v.t();
        boolean zF = Rc.D0.f(this.f68165b);
        String str = this.f68166c.f34479a;
        Nc.v.t();
        boolean zG2 = Rc.D0.g();
        Nc.v.t();
        ApplicationInfo applicationInfo = this.f68165b.getApplicationInfo();
        int i10 = applicationInfo == null ? 0 : applicationInfo.targetSdkVersion;
        Context context = this.f68165b;
        return new I10(zG, zF, str, zG2, i10, DynamiteModule.c(context, ModuleDescriptor.MODULE_ID), DynamiteModule.a(context, ModuleDescriptor.MODULE_ID), this.f68167d);
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return this.f68164a.k0(new Callable() { // from class: com.google.android.gms.internal.ads.G10
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f67901a.a();
            }
        });
    }

    H10(Xj0 xj0, Context context, Sc.a aVar, String str) {
        this.f68164a = xj0;
        this.f68165b = context;
        this.f68166c = aVar;
        this.f68167d = str;
    }
}
