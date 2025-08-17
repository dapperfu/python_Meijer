package m9;

import U8.ChannelSettings;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import androidx.core.app.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lm9/j;", "", "Landroid/app/NotificationManager;", "notificationManager", "Landroidx/core/app/q;", "notificationManagerCompat", "<init>", "(Landroid/app/NotificationManager;Landroidx/core/app/q;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroid/app/NotificationManager;", "b", "Landroidx/core/app/q;", "()Z", "areNotificationsEnabled", "importance", "", "LU8/a;", "c", "()Ljava/util/List;", "notificationChannels", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public class j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final NotificationManager notificationManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q notificationManagerCompat;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && Intrinsics.e(getClass(), other.getClass())) {
            j jVar = (j) other;
            if (Intrinsics.e(this.notificationManager, jVar.notificationManager) && Intrinsics.e(this.notificationManagerCompat, jVar.notificationManagerCompat) && a() == jVar.a()) {
                return true;
            }
        }
        return false;
    }

    public j(NotificationManager notificationManager, q notificationManagerCompat) {
        Intrinsics.j(notificationManager, "notificationManager");
        Intrinsics.j(notificationManagerCompat, "notificationManagerCompat");
        this.notificationManager = notificationManager;
        this.notificationManagerCompat = notificationManagerCompat;
    }

    public boolean a() {
        return this.notificationManagerCompat.a();
    }

    public int b() {
        return this.notificationManagerCompat.h();
    }

    public List<ChannelSettings> c() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.notificationManager.getNotificationChannels().iterator();
        while (it.hasNext()) {
            NotificationChannel notificationChannelA = c.a(it.next());
            String id2 = notificationChannelA.getId();
            Intrinsics.i(id2, "getId(...)");
            arrayList.add(new ChannelSettings(id2, notificationChannelA.getImportance(), notificationChannelA.canBypassDnd(), notificationChannelA.canShowBadge(), notificationChannelA.shouldVibrate(), notificationChannelA.shouldShowLights()));
        }
        return arrayList;
    }

    public int hashCode() {
        return Objects.hash(this.notificationManager, this.notificationManagerCompat, Boolean.valueOf(a()));
    }
}
