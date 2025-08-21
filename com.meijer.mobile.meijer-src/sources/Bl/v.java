package Bl;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LBl/v;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "deepLink", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;", "featurenavigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final v f3154a = new v();

    public final Intent a(Context context, String deepLink) {
        Intrinsics.j(context, "context");
        Intent intentA = j.a(context, "action.com.meijer.mobile.universaldeeplinkredirectintent");
        intentA.putExtra("push_notification_deeplink", deepLink);
        return intentA;
    }

    private v() {
    }
}
