package go;

import com.meijer.mobile.mperks.networking.api.models.MperksErrorJson;
import com.meijer.mobile.mperks.networking.domain.models.errors.MperksError;
import com.meijer.mobile.mperks.networking.domain.models.errors.MperksErrorCode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/mperks/networking/api/models/MperksErrorJson;", "Lcom/meijer/mobile/mperks/networking/domain/models/errors/MperksError;", "a", "(Lcom/meijer/mobile/mperks/networking/api/models/MperksErrorJson;)Lcom/meijer/mobile/mperks/networking/domain/models/errors/MperksError;", "networking_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i {
    public static final MperksError a(MperksErrorJson mperksErrorJson) {
        Intrinsics.j(mperksErrorJson, "<this>");
        Integer code = mperksErrorJson.getCode();
        return new MperksError((code != null && code.intValue() == 10) ? MperksErrorCode.UNAUTH_ERROR : (code != null && code.intValue() == 30) ? MperksErrorCode.ALREADY_CLIPPED : (code != null && code.intValue() == 40) ? MperksErrorCode.NOT_AVAILABLE : (code != null && code.intValue() == 41) ? MperksErrorCode.NOT_FOUND : (code != null && code.intValue() == 43) ? MperksErrorCode.COUPON_EXPIRED : (code != null && code.intValue() == 52) ? MperksErrorCode.INSUFFICIENT_POINTS : (code != null && code.intValue() == 99) ? MperksErrorCode.SERVER_ERROR : MperksErrorCode.UNKNOWN_ERROR, mperksErrorJson.getError(), mperksErrorJson.getMessage());
    }
}
