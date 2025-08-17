package com.radiusnetworks.flybuy.sdk.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0003H\u0007¨\u0006\u0006"}, d2 = {"appPermissions", "", "", "Landroid/content/Context;", "targetSdkVersion", "", "common_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class ContextExtensionsKt {
    @Keep
    public static final List<String> appPermissions(Context context) throws PackageManager.NameNotFoundException {
        Intrinsics.j(context, "<this>");
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
        ArrayList arrayList = new ArrayList();
        String[] requestedPermissions = packageInfo.requestedPermissions;
        Intrinsics.i(requestedPermissions, "requestedPermissions");
        int length = requestedPermissions.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            String str = requestedPermissions[i10];
            int i12 = i11 + 1;
            if ((packageInfo.requestedPermissionsFlags[i11] & 2) != 0) {
                Intrinsics.g(str);
                arrayList.add(str);
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @Keep
    public static final int targetSdkVersion(Context context) {
        Intrinsics.j(context, "<this>");
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion;
        } catch (Exception unused) {
            return 0;
        }
    }
}
