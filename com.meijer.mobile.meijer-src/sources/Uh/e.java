package Uh;

import Eh.CreateAccountSubmission;
import Eh.Preference;
import Eh.p;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LUh/d;", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "", "homeStoreZip", "LEh/i;", "a", "(LUh/d;ILjava/lang/String;)LEh/i;", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class e {
    public static final CreateAccountSubmission a(CreateAccountDecorator createAccountDecorator, int i10, String str) {
        Intrinsics.j(createAccountDecorator, "<this>");
        return new CreateAccountSubmission(createAccountDecorator.getFirstName().c().e(), createAccountDecorator.getLastName().c().e(), createAccountDecorator.getEmail().c().e(), createAccountDecorator.getPassword().getPassword(), createAccountDecorator.getPhoneNumber().c().e(), createAccountDecorator.getMPerksPin().c().e(), (str == null || str.length() == 0) ? createAccountDecorator.getZipCode().c().e() : str, i10, CollectionsKt.p(new Preference(p.f7584b, createAccountDecorator.getIsWeeklyAdChecked(), null, null, 12, null), new Preference(p.f7586d, createAccountDecorator.getIsTextMarketingChecked(), null, null, 12, null)));
    }
}
