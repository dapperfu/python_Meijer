package O8;

import O8.EmarsysConfig;
import android.app.Application;
import android.content.SharedPreferences;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LO8/d;", "", "<init>", "()V", "Landroid/app/Application;", "application", "", "sharedPreferenceSource", "LO8/h$a;", "a", "(Landroid/app/Application;Ljava/lang/String;)LO8/h$a;", "emarsys-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d {
    public final EmarsysConfig.a a(Application application, String sharedPreferenceSource) {
        Intrinsics.j(application, "application");
        Intrinsics.j(sharedPreferenceSource, "sharedPreferenceSource");
        SharedPreferences sharedPreferences = application.getSharedPreferences(sharedPreferenceSource, 0);
        String string = sharedPreferences.getString("MOBILE_ENGAGE_APPLICATION_CODE", null);
        String string2 = sharedPreferences.getString("PREDICT_MERCHANT_ID", null);
        boolean z10 = sharedPreferences.getBoolean("ANDROID_DISABLE_AUTOMATIC_PUSH_TOKEN_SENDING", false);
        Set<String> stringSet = sharedPreferences.getStringSet("ANDROID_SHARED_PACKAGE_NAMES", new LinkedHashSet());
        String string3 = sharedPreferences.getString("ANDROID_SHARED_SECRET", null);
        boolean z11 = sharedPreferences.getBoolean("ANDROID_VERBOSE_CONSOLE_LOGGING_ENABLED", false);
        EmarsysConfig.a aVarF = new EmarsysConfig.a().a(application).b(string).f(string2);
        if (z10) {
            aVarF.d();
        }
        if (z11) {
            aVarF.e();
        }
        Set<String> set = stringSet;
        if (set != null && !set.isEmpty()) {
            aVarF.g(CollectionsKt.j1(stringSet));
        }
        if (string3 != null) {
            aVarF.h(string3);
        }
        return aVarF;
    }
}
