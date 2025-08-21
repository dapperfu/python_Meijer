package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.bj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7726bj {
    public static final ResolveInfo d(Intent intent, ArrayList arrayList, Context context, M9 m92, View view, C10123y60 c10123y60) {
        ResolveInfo resolveInfo = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= listQueryIntentActivities.size()) {
                        break;
                    }
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i10).activityInfo.name)) {
                        resolveInfo = resolveInfoResolveActivity;
                        break;
                    }
                    i10++;
                }
            }
            arrayList.addAll(listQueryIntentActivities);
            return resolveInfo;
        } catch (Throwable th2) {
            Nc.v.s().x(th2, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
            return resolveInfo;
        }
    }

    public static final Intent a(Uri uri, Context context, M9 m92, View view, C10123y60 c10123y60) {
        if (uri == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    public static final Intent b(Intent intent, ResolveInfo resolveInfo, Context context, M9 m92, View view, C10123y60 c10123y60) {
        Intent intent2 = new Intent(intent);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent2.setClassName(activityInfo.packageName, activityInfo.name);
        return intent2;
    }

    public static final ResolveInfo c(Intent intent, Context context, M9 m92, View view, C10123y60 c10123y60) {
        return d(intent, new ArrayList(), context, m92, view, c10123y60);
    }
}
