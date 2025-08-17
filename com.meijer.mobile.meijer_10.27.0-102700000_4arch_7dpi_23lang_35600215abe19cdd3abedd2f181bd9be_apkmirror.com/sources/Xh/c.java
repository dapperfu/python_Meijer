package Xh;

import Cs.MeijerAccount;
import Fh.h;
import Hk.Validation;
import Zh.b;
import ak.AbstractC5607a;
import j$.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0003\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\n\u001a\u00020\u0005*\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "firstName", "lastName", "c", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "LXh/b;", "LCs/a;", "meijerAccount", "Lak/a;", "loadingErrorMessage", "b", "(LXh/b;LCs/a;Lak/a;)LXh/b;", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String c(String str, String str2) {
        if (str == null || StringsKt.r0(str)) {
            str = null;
        }
        if (str2 == null || StringsKt.r0(str2)) {
            str2 = null;
        }
        return CollectionsKt.B0(CollectionsKt.r(str, str2), " ", null, null, 0, null, null, 62, null);
    }

    public static final BasicInformationDecorator b(BasicInformationDecorator basicInformationDecorator, MeijerAccount meijerAccount, AbstractC5607a abstractC5607a) {
        String str;
        Intrinsics.j(basicInformationDecorator, "<this>");
        if (meijerAccount == null) {
            return BasicInformationDecorator.g(basicInformationDecorator, null, null, null, null, null, null, null, null, false, abstractC5607a, null, 1535, null).e();
        }
        String firstName = meijerAccount.getFirstName();
        if (firstName == null) {
            firstName = "";
        }
        b.FirstName c0916b = new b.FirstName(new Validation(firstName, null, 2, null));
        str = "";
        String lastName = meijerAccount.getLastName();
        if (lastName == null) {
            lastName = str;
        }
        b.LastName cVar = new b.LastName(new Validation(lastName, null, 2, null));
        b.BirthDate aVar = new b.BirthDate(new Validation(meijerAccount.getBirthDate(), null, 2, null));
        b.PhoneNumber dVar = new b.PhoneNumber(new Validation(String.valueOf(meijerAccount.getMPerksPhone()), null, 2, null));
        String zip = meijerAccount.getZip();
        b.ZipCode eVar = new b.ZipCode(new Validation(zip != null ? zip : "", null, 2, null));
        AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
        int i10 = h.f10587Q1;
        LocalDateTime createdDate = meijerAccount.getCreatedDate();
        return BasicInformationDecorator.g(basicInformationDecorator, c0916b, cVar, dVar, eVar, aVar, companion.d(i10, String.valueOf(createdDate != null ? Integer.valueOf(createdDate.getYear()) : null)), null, basicInformationDecorator.getPhoneConflictError(), false, null, null, 1856, null).e();
    }
}
