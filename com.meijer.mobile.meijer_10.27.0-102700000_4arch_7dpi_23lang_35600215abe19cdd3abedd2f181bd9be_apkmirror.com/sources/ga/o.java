package ga;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lga/o;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/app/PendingIntent;", "a", "()Landroid/app/PendingIntent;", "Landroid/content/Context;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public class o {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    public o(Context context) {
        Intrinsics.j(context, "context");
        this.context = context;
    }

    public PendingIntent a() {
        Intent intent = new Intent("com.emarsys.sdk.GEOFENCE_ACTION");
        intent.setPackage(this.context.getPackageName());
        if (G9.a.f11285a.f()) {
            PendingIntent broadcast = PendingIntent.getBroadcast(this.context, 0, intent, 167772160);
            Intrinsics.g(broadcast);
            return broadcast;
        }
        PendingIntent broadcast2 = PendingIntent.getBroadcast(this.context, 0, intent, 134217728);
        Intrinsics.g(broadcast2);
        return broadcast2;
    }
}
