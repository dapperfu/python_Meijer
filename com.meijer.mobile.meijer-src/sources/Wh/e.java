package Wh;

import Gh.h;
import Ik.Validation;
import bk.AbstractC6392a;
import com.meijer.mobile.accounts.ux.payments.j;
import j$.time.Clock;
import j$.time.YearMonth;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import vh.AccountCreditCard;
import vh.EnumC17677e;
import wk.C17898a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lvh/a;", "LWh/d;", "b", "(Lvh/a;)LWh/d;", "a", "(LWh/d;)Lvh/a;", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class e {
    public static final AccountCreditCard a(PaymentsCardDecorator paymentsCardDecorator) {
        Intrinsics.j(paymentsCardDecorator, "<this>");
        AccountCreditCard accountCreditCard = paymentsCardDecorator.getAccountCreditCard();
        String strE = paymentsCardDecorator.getAddressFullName().c().e();
        String strE2 = paymentsCardDecorator.getAddressLine1().c().e();
        String strE3 = paymentsCardDecorator.getApartment().c().e();
        if (strE3.length() == 0) {
            strE3 = null;
        }
        String str = strE3;
        String strE4 = paymentsCardDecorator.getCity().c().e();
        String strE5 = paymentsCardDecorator.getState().c().e();
        String strE6 = paymentsCardDecorator.getZipCode().c().e();
        boolean isPrimary = paymentsCardDecorator.getIsPrimary();
        Integer numV = StringsKt.v(paymentsCardDecorator.getExpirationYear().c().e());
        int iIntValue = numV != null ? numV.intValue() : YearMonth.now(Clock.systemUTC()).getYear();
        Integer numV2 = StringsKt.v(StringsKt.N1(paymentsCardDecorator.getExpirationMonth().c().e(), 2));
        YearMonth yearMonthOf = YearMonth.of(iIntValue, numV2 != null ? numV2.intValue() : YearMonth.now(Clock.systemUTC()).getMonthValue());
        Intrinsics.i(yearMonthOf, "of(...)");
        return AccountCreditCard.b(accountCreditCard, 0L, null, null, null, null, yearMonthOf, null, null, null, false, isPrimary, null, null, null, null, 0L, 0L, strE, strE2, str, strE4, strE5, strE6, null, 0L, null, null, null, null, false, null, null, false, -8258593, 1, null);
    }

    public static final PaymentsCardDecorator b(AccountCreditCard accountCreditCard) {
        Intrinsics.j(accountCreditCard, "<this>");
        long cardId = accountCreditCard.getCardId();
        String str = accountCreditCard.getAddressContactFirstName() + ' ' + accountCreditCard.getAddressContactLastName();
        String addressName = accountCreditCard.getAddressName();
        if (addressName == null) {
            addressName = "";
        }
        j.FullName fullName = new j.FullName(new Validation(addressName, null, 2, null));
        String cardTypeName = accountCreditCard.getCardTypeName();
        Intrinsics.g(cardTypeName);
        AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
        AbstractC6392a abstractC6392aD = companion.d(h.f12685D, accountCreditCard.getCardLastFourDigits());
        AbstractC6392a abstractC6392aD2 = accountCreditCard.getExpirationDate().isBefore(YearMonth.now()) ? companion.d(h.f12678C, accountCreditCard.getExpirationDate().format(C17898a.NUMERIC_MONTH_YEAR_FULL)) : companion.d(h.f12664A, accountCreditCard.getExpirationDate().format(C17898a.NUMERIC_MONTH_YEAR_FULL));
        j.ExpirationYear expirationYear = new j.ExpirationYear(new Validation(String.valueOf(accountCreditCard.getExpirationDate().getYear()), null, 2, null));
        j.ExpirationMonth expirationMonth = new j.ExpirationMonth(new Validation(accountCreditCard.getExpirationDate().format(C17898a.f167225a.x()), null, 2, null));
        String cardLastFourDigits = accountCreditCard.getCardLastFourDigits();
        EnumC17677e cardType = accountCreditCard.getCardType();
        boolean isPrimary = accountCreditCard.getIsPrimary();
        boolean zIsBefore = accountCreditCard.getExpirationDate().isBefore(YearMonth.now());
        boolean linkToMPerks = accountCreditCard.getLinkToMPerks();
        AbstractC6392a abstractC6392a = abstractC6392aD2;
        j.StreetAddress streetAddress = new j.StreetAddress(new Validation(accountCreditCard.getAddressLine1(), null, 2, null));
        String addressLine2 = accountCreditCard.getAddressLine2();
        if (addressLine2 == null) {
            addressLine2 = "";
        }
        return new PaymentsCardDecorator(cardId, str, fullName, cardTypeName, abstractC6392aD, abstractC6392a, cardLastFourDigits, streetAddress, new j.Apartment(new Validation(addressLine2, null, 2, null)), new j.City(new Validation(accountCreditCard.getAddressCity(), null, 2, null)), new j.State(new Validation(accountCreditCard.getAddressState(), null, 2, null)), new j.ZipCode(new Validation(accountCreditCard.getAddressZipCode(), null, 2, null)), cardType, isPrimary, zIsBefore, linkToMPerks, expirationYear, expirationMonth, accountCreditCard, null, 524288, null);
    }
}
