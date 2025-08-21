package go;

import co.AbstractC6530b;
import com.meijer.mobile.mperks.networking.api.models.MperksAccountInfoResponse;
import com.meijer.mobile.mperks.networking.domain.models.AutoClaimAccountInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/mperks/networking/api/models/MperksAccountInfoResponse;", "Lcom/meijer/mobile/mperks/networking/domain/models/AutoClaimAccountInfo;", "a", "(Lcom/meijer/mobile/mperks/networking/api/models/MperksAccountInfoResponse;)Lcom/meijer/mobile/mperks/networking/domain/models/AutoClaimAccountInfo;", "networking_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f {
    public static final AutoClaimAccountInfo a(MperksAccountInfoResponse mperksAccountInfoResponse) {
        Intrinsics.j(mperksAccountInfoResponse, "<this>");
        return new AutoClaimAccountInfo(AbstractC6530b.INSTANCE.a(mperksAccountInfoResponse.getAutoClaimType()), mperksAccountInfoResponse.getAutoClaimAmount());
    }
}
