package Dh;

import com.meijer.mobile.accounts.service.models.network.CreateAccountV2Request;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDh/i;", "Lcom/meijer/mobile/accounts/service/models/network/CreateAccountV2Request;", "a", "(LDh/i;)Lcom/meijer/mobile/accounts/service/models/network/CreateAccountV2Request;", "service_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class j {
    public static final CreateAccountV2Request a(CreateAccountSubmission createAccountSubmission) {
        Intrinsics.j(createAccountSubmission, "<this>");
        String firstName = createAccountSubmission.getFirstName();
        String lastName = createAccountSubmission.getLastName();
        String phone = createAccountSubmission.getPhone();
        String email = createAccountSubmission.getEmail();
        String password = createAccountSubmission.getPassword();
        String pin = createAccountSubmission.getPin();
        String zip = createAccountSubmission.getZip();
        int storeId = createAccountSubmission.getStoreId();
        List<Preference> listG = createAccountSubmission.g();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listG, 10));
        Iterator<T> it = listG.iterator();
        while (it.hasNext()) {
            arrayList.add(Ch.b.w((Preference) it.next()));
        }
        return new CreateAccountV2Request(email, firstName, lastName, password, phone, pin, storeId, zip, arrayList);
    }
}
