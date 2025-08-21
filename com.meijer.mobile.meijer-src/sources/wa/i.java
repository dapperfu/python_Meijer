package wa;

import Ba.NotificationData;
import android.app.Activity;
import fa.C13973b;
import java.io.File;
import java.io.IOException;
import ka.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lwa/i;", "Ljava/lang/Runnable;", "LBa/k;", "notificationData", "<init>", "(LBa/k;)V", "", "campaignId", "html", "sid", "url", "", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "run", "()V", "LBa/k;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final NotificationData notificationData;

    public i(NotificationData notificationData) {
        Intrinsics.j(notificationData, "notificationData");
        this.notificationData = notificationData;
    }

    private final void a(String campaignId, String html, String sid, String url) {
        m mVar = new m(C13973b.b().J(), campaignId, html, sid, url, C13973b.b().T(), 0, false, null, 448, null);
        Activity activityA = C13973b.b().W().a();
        if (activityA == null) {
            C13973b.b().x().c(mVar);
        } else {
            mVar.a(activityA);
        }
    }

    @Override // java.lang.Runnable
    public void run() throws IOException {
        String strK;
        try {
            if (this.notificationData.getInapp() != null) {
                JSONObject jSONObject = new JSONObject(this.notificationData.getInapp());
                String strD = I9.i.d(jSONObject, "campaignId");
                String strD2 = I9.i.d(jSONObject, "url");
                String strD3 = I9.i.d(jSONObject, "fileUrl");
                if (strD3 != null) {
                    strK = C13973b.b().I().i(strD3);
                    new File(strD3).delete();
                } else {
                    strK = null;
                }
                if (strK == null && strD2 != null) {
                    strK = C13973b.b().I().k(strD2);
                }
                if (strD == null || strK == null) {
                    return;
                }
                a(strD, strK, this.notificationData.getSid(), strD2);
            }
        } catch (JSONException unused) {
        }
    }
}
