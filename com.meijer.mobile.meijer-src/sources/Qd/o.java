package Qd;

import android.content.Context;
import android.content.res.Resources;

/* loaded from: classes6.dex */
public final class o {
    public static final String b(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier("google_app_id", "string", str2);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static final Boolean c(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", str2);
        if (identifier == 0) {
            return null;
        }
        try {
            return Boolean.valueOf(resources.getBoolean(identifier));
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(id.k.f137544a);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }
}
