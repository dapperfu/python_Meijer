package za;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.a;
import da.C13500b;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lza/e;", "", "<init>", "()V", "Landroid/content/Intent;", "remoteIntent", "Landroid/content/Context;", "context", "Landroid/app/PendingIntent;", "a", "(Landroid/content/Intent;Landroid/content/Context;)Landroid/app/PendingIntent;", "Lza/k;", "notificationData", "", "action", "b", "(Landroid/content/Context;Lza/k;Ljava/lang/String;)Landroid/content/Intent;", "d", "(Landroid/content/Context;Lza/k;Ljava/lang/String;)Landroid/app/PendingIntent;", "c", "(Landroid/content/Context;Lza/k;)Landroid/app/PendingIntent;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: za.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18409e {

    /* renamed from: a, reason: collision with root package name */
    public static final C18409e f171666a = new C18409e();

    @JvmStatic
    public static final PendingIntent a(Intent remoteIntent, Context context) {
        Bundle bundle;
        Intrinsics.j(remoteIntent, "remoteIntent");
        Intrinsics.j(context, "context");
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (remoteIntent.getExtras() != null && launchIntentForPackage != null) {
            Bundle extras = remoteIntent.getExtras();
            Intrinsics.g(extras);
            launchIntentForPackage.putExtras(extras);
        }
        G9.a aVar = G9.a.f11285a;
        if (aVar.h()) {
            ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
            if (aVar.g()) {
                activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(1);
            } else {
                activityOptionsMakeBasic.setPendingIntentCreatorBackgroundActivityStartMode(1);
            }
            bundle = activityOptionsMakeBasic.toBundle();
        } else {
            bundle = null;
        }
        if (launchIntentForPackage != null) {
            return PendingIntent.getActivity(context, 0, launchIntentForPackage, 201326592, bundle);
        }
        return null;
    }

    @JvmStatic
    public static final Intent b(Context context, NotificationData notificationData, String action) {
        Intrinsics.j(context, "context");
        Intrinsics.j(notificationData, "notificationData");
        Intent intent = new Intent(context, C13500b.b().j());
        if (action != null) {
            intent.setAction(action);
        }
        intent.putExtra("payload", notificationData);
        return intent;
    }

    @JvmStatic
    public static final PendingIntent d(Context context, NotificationData notificationData, String action) {
        Intrinsics.j(context, "context");
        Intrinsics.j(notificationData, "notificationData");
        PendingIntent activity = PendingIntent.getActivity(context, (int) (System.currentTimeMillis() % a.e.API_PRIORITY_OTHER), b(context, notificationData, action), 201326592);
        Intrinsics.i(activity, "getActivity(...)");
        return activity;
    }

    public final PendingIntent c(Context context, NotificationData notificationData) {
        Intrinsics.j(context, "context");
        Intrinsics.j(notificationData, "notificationData");
        return d(context, notificationData, null);
    }

    private C18409e() {
    }
}
