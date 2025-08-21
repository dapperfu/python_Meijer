package Yn;

import bo.EnumC6398b;
import bo.MCCOptInOutResponse;
import com.meijer.mobile.mperks.creditcard.api.models.MCCOptInOutResponseJson;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/mperks/creditcard/api/models/MCCOptInOutResponseJson;", "Lbo/a;", "a", "(Lcom/meijer/mobile/mperks/creditcard/api/models/MCCOptInOutResponseJson;)Lbo/a;", "creditcard_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class a {
    public static final MCCOptInOutResponse a(MCCOptInOutResponseJson mCCOptInOutResponseJson) {
        EnumC6398b next;
        Intrinsics.j(mCCOptInOutResponseJson, "<this>");
        Iterator<EnumC6398b> it = EnumC6398b.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int resultCode = next.getResultCode();
            Integer statusCode = mCCOptInOutResponseJson.getStatusCode();
            if (statusCode != null && resultCode == statusCode.intValue()) {
                break;
            }
        }
        return new MCCOptInOutResponse(next, mCCOptInOutResponseJson.getMessage());
    }
}
