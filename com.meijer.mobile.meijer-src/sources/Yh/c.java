package Yh;

import Cs.MeijerAccount;
import Gh.h;
import Ik.Validation;
import ai.AbstractC5692b;
import bk.AbstractC6392a;
import j$.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0003\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\n\u001a\u00020\u0005*\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "firstName", "lastName", "c", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "LYh/b;", "LCs/a;", "meijerAccount", "Lbk/a;", "loadingErrorMessage", "b", "(LYh/b;LCs/a;Lbk/a;)LYh/b;", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String c(String str, String str2) {
        if (str == null || StringsKt.s0(str)) {
            str = null;
        }
        if (str2 == null || StringsKt.s0(str2)) {
            str2 = null;
        }
        return CollectionsKt.B0(CollectionsKt.r(str, str2), " ", null, null, 0, null, null, 62, null);
    }

    public static final BasicInformationDecorator b(BasicInformationDecorator basicInformationDecorator, MeijerAccount meijerAccount, AbstractC6392a abstractC6392a) {
        String str;
        Intrinsics.j(basicInformationDecorator, "<this>");
        if (meijerAccount == null) {
            return BasicInformationDecorator.g(basicInformationDecorator, null, null, null, null, null, null, null, null, false, abstractC6392a, null, 1535, null).e();
        }
        String firstName = meijerAccount.getFirstName();
        if (firstName == null) {
            firstName = "";
        }
        AbstractC5692b.FirstName c0952b = new AbstractC5692b.FirstName(new Validation(firstName, null, 2, null));
        str = "";
        String lastName = meijerAccount.getLastName();
        if (lastName == null) {
            lastName = str;
        }
        AbstractC5692b.LastName cVar = new AbstractC5692b.LastName(new Validation(lastName, null, 2, null));
        AbstractC5692b.BirthDate aVar = new AbstractC5692b.BirthDate(new Validation(meijerAccount.getBirthDate(), null, 2, null));
        AbstractC5692b.PhoneNumber dVar = new AbstractC5692b.PhoneNumber(new Validation(String.valueOf(meijerAccount.getMPerksPhone()), null, 2, null));
        String zip = meijerAccount.getZip();
        AbstractC5692b.ZipCode eVar = new AbstractC5692b.ZipCode(new Validation(zip != null ? zip : "", null, 2, null));
        AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
        int i10 = h.f12778Q1;
        LocalDateTime createdDate = meijerAccount.getCreatedDate();
        return BasicInformationDecorator.g(basicInformationDecorator, c0952b, cVar, dVar, eVar, aVar, companion.d(i10, String.valueOf(createdDate != null ? Integer.valueOf(createdDate.getYear()) : null)), null, basicInformationDecorator.getPhoneConflictError(), false, null, null, 1856, null).e();
    }
}
