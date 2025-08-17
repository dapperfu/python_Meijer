package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Mf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6961Mf {

    /* renamed from: a, reason: collision with root package name */
    private androidx.browser.customtabs.f f68677a;

    /* renamed from: b, reason: collision with root package name */
    private androidx.browser.customtabs.c f68678b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.browser.customtabs.e f68679c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC6928Lf f68680d;

    public final void d() {
        this.f68678b = null;
        this.f68677a = null;
    }

    public final void e(InterfaceC6928Lf interfaceC6928Lf) {
        this.f68680d = interfaceC6928Lf;
    }

    public final androidx.browser.customtabs.f a() {
        androidx.browser.customtabs.c cVar = this.f68678b;
        if (cVar == null) {
            this.f68677a = null;
        } else if (this.f68677a == null) {
            this.f68677a = cVar.e(null);
        }
        return this.f68677a;
    }

    public final void b(Activity activity) {
        String strA;
        if (this.f68678b == null && (strA = C10195zy0.a(activity)) != null) {
            Ay0 ay0 = new Ay0(this);
            this.f68679c = ay0;
            androidx.browser.customtabs.c.a(activity, strA, ay0);
        }
    }

    public final void c(androidx.browser.customtabs.c cVar) {
        this.f68678b = cVar;
        cVar.g(0L);
        InterfaceC6928Lf interfaceC6928Lf = this.f68680d;
        if (interfaceC6928Lf != null) {
            interfaceC6928Lf.zza();
        }
    }

    public final void f(Activity activity) {
        androidx.browser.customtabs.e eVar = this.f68679c;
        if (eVar == null) {
            return;
        }
        activity.unbindService(eVar);
        this.f68678b = null;
        this.f68677a = null;
        this.f68679c = null;
    }

    public static boolean g(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                for (int i10 = 0; i10 < listQueryIntentActivities.size(); i10++) {
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i10).activityInfo.name)) {
                        return resolveInfoResolveActivity.activityInfo.packageName.equals(C10195zy0.a(context));
                    }
                }
            }
        }
        return false;
    }
}
