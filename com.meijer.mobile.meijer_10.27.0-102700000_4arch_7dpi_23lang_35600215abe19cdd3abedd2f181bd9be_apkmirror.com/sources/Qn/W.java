package Qn;

import android.app.AlarmManager;
import android.app.PendingIntent;
import com.google.android.gms.common.internal.AbstractC6521c;
import com.medallia.digital.mobilesdk.l8;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/app/AlarmManager;", "Landroid/app/PendingIntent;", AbstractC6521c.KEY_PENDING_INTENT, "", "alarmTimeMillis", "", "b", "(Landroid/app/AlarmManager;Landroid/app/PendingIntent;J)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class W {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(AlarmManager alarmManager, PendingIntent pendingIntent, long j10) {
        if (pendingIntent != null) {
            alarmManager.setWindow(0, j10, l8.b.f92525b, pendingIntent);
        }
    }
}
