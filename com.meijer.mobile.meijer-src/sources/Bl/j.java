package Bl;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroid/content/Context;", "context", "", "action", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;", "featurenavigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j {
    public static final Intent a(Context context, String action) {
        Intrinsics.j(context, "context");
        Intrinsics.j(action, "action");
        Intent intent = new Intent(action).setPackage(context.getPackageName());
        Intrinsics.i(intent, "setPackage(...)");
        return intent;
    }
}
