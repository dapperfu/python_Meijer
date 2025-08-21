package com.radiusnetworks.flybuy.sdk.util;

import Z1.b;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.RecyclerView;
import com.radiusnetworks.flybuy.sdk.logging.LogExtensionsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0007\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0003H\u0007¨\u0006\t"}, d2 = {"appPermissions", "", "", "Landroid/content/Context;", "openDeepLink", "", "deepLinkUrl", "targetSdkVersion", "", "common_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class ContextExtensionsKt {
    @Keep
    public static final List<String> appPermissions(Context context) throws PackageManager.NameNotFoundException {
        Intrinsics.j(context, "<this>");
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
        ArrayList arrayList = new ArrayList();
        String[] strArr = packageInfo.requestedPermissions;
        if (strArr != null) {
            int length = strArr.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                String str = strArr[i10];
                int i12 = i11 + 1;
                int[] iArr = packageInfo.requestedPermissionsFlags;
                if (((iArr != null ? iArr[i11] : 0) & 2) != 0) {
                    Intrinsics.g(str);
                    arrayList.add(str);
                }
                i10++;
                i11 = i12;
            }
        }
        return arrayList;
    }

    @Keep
    public static final void openDeepLink(Context context, String deepLinkUrl) {
        Intrinsics.j(context, "<this>");
        Intrinsics.j(deepLinkUrl, "deepLinkUrl");
        if (deepLinkUrl.length() > 0) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(deepLinkUrl));
                intent.addFlags(268435456);
                b.o(context, intent, null);
            } catch (Exception e10) {
                LogExtensionsKt.loge$default(context, true, e10, null, new Object[0], 4, null);
            }
        }
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
