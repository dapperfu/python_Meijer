package Eh;

import Dh.EmailVerificationSpiffs;
import com.meijer.mobile.accounts.service.models.network.EmailVerificationSpiffsResponse;
import com.meijer.mobile.accounts.service.models.network.SpiffItemJson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/accounts/service/models/network/EmailVerificationSpiffsResponse;", "LDh/m;", "a", "(Lcom/meijer/mobile/accounts/service/models/network/EmailVerificationSpiffsResponse;)LDh/m;", "service_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class c {
    public static final EmailVerificationSpiffs a(EmailVerificationSpiffsResponse emailVerificationSpiffsResponse) {
        Intrinsics.j(emailVerificationSpiffsResponse, "<this>");
        boolean emailVerified = emailVerificationSpiffsResponse.getEmailVerified();
        List<SpiffItemJson> listB = emailVerificationSpiffsResponse.b();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(e.a((SpiffItemJson) it.next()));
        }
        return new EmailVerificationSpiffs(true, emailVerified, arrayList);
    }
}
