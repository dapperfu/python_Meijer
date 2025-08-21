package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import com.fullstory.FS;

/* loaded from: classes.dex */
public final class k {
    public static Intent a(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        String strC = c(activity);
        if (strC == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, strC);
        try {
            if (d(activity, componentName) == null) {
                return Intent.makeMainActivity(componentName);
            }
            return new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            FS.log_e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strC + "' in manifest");
            return null;
        }
    }

    public static Intent b(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strD = d(context, componentName);
        if (strD == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strD);
        if (d(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    public static String c(Activity activity) {
        try {
            return d(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static String d(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        int i10;
        String string;
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 29) {
            i10 = 269222528;
        } else {
            i10 = 787072;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i10);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) == '.') {
            return context.getPackageName() + string;
        }
        return string;
    }

    @Deprecated
    public static void e(Activity activity, Intent intent) {
        activity.navigateUpTo(intent);
    }

    @Deprecated
    public static boolean f(Activity activity, Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }
}
