package go;

import com.meijer.mobile.mperks.networking.api.models.ExpiringPointsResponse;
import com.meijer.mobile.mperks.networking.domain.models.ExpiringPoints;
import j$.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import wk.C17898a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/mperks/networking/api/models/ExpiringPointsResponse;", "Lcom/meijer/mobile/mperks/networking/domain/models/ExpiringPoints;", "a", "(Lcom/meijer/mobile/mperks/networking/api/models/ExpiringPointsResponse;)Lcom/meijer/mobile/mperks/networking/domain/models/ExpiringPoints;", "networking_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e {
    public static final ExpiringPoints a(ExpiringPointsResponse expiringPointsResponse) {
        Intrinsics.j(expiringPointsResponse, "<this>");
        int points = expiringPointsResponse.getPoints();
        String expiresOn = expiringPointsResponse.getExpiresOn();
        return new ExpiringPoints(points, expiresOn != null ? (LocalDate) wk.d.b(expiresOn, C17898a.ISO_LOCAL_DATE, new Dh.a()) : null);
    }
}
