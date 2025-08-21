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
public final class C7086Mf {

    /* renamed from: a, reason: collision with root package name */
    private androidx.browser.customtabs.f f69517a;

    /* renamed from: b, reason: collision with root package name */
    private androidx.browser.customtabs.c f69518b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.browser.customtabs.e f69519c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC7053Lf f69520d;

    public final void d() {
        this.f69518b = null;
        this.f69517a = null;
    }

    public final void e(InterfaceC7053Lf interfaceC7053Lf) {
        this.f69520d = interfaceC7053Lf;
    }

    public final androidx.browser.customtabs.f a() {
        androidx.browser.customtabs.c cVar = this.f69518b;
        if (cVar == null) {
            this.f69517a = null;
        } else if (this.f69517a == null) {
            this.f69517a = cVar.e(null);
        }
        return this.f69517a;
    }

    public final void b(Activity activity) {
        String strA;
        if (this.f69518b == null && (strA = C10320zy0.a(activity)) != null) {
            Ay0 ay0 = new Ay0(this);
            this.f69519c = ay0;
            androidx.browser.customtabs.c.a(activity, strA, ay0);
        }
    }

    public final void c(androidx.browser.customtabs.c cVar) {
        this.f69518b = cVar;
        cVar.g(0L);
        InterfaceC7053Lf interfaceC7053Lf = this.f69520d;
        if (interfaceC7053Lf != null) {
            interfaceC7053Lf.zza();
        }
    }

    public final void f(Activity activity) {
        androidx.browser.customtabs.e eVar = this.f69519c;
        if (eVar == null) {
            return;
        }
        activity.unbindService(eVar);
        this.f69518b = null;
        this.f69517a = null;
        this.f69519c = null;
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
                        return resolveInfoResolveActivity.activityInfo.packageName.equals(C10320zy0.a(context));
                    }
                }
            }
        }
        return false;
    }
}
