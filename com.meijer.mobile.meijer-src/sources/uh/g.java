package uh;

import hk.BillingAddress;
import hk.CardHolderName;
import hk.PaymentOption;
import j$.time.LocalDateTime;
import j$.time.YearMonth;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import vh.AccountCreditCard;
import vh.EnumC17677e;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lvh/a;", "", "email", "Lhk/f;", "a", "(Lvh/a;Ljava/lang/String;)Lhk/f;", "Lvh/e;", "Lhk/h;", "b", "(Lvh/e;)Lhk/h;", "payments_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class g {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC17677e.values().length];
            try {
                iArr[EnumC17677e.f165881c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC17677e.f165882d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC17677e.f165883e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC17677e.f165884f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC17677e.f165887i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC17677e.f165885g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC17677e.f165886h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC17677e.f165888j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final PaymentOption a(AccountCreditCard accountCreditCard, String email) {
        Intrinsics.j(accountCreditCard, "<this>");
        Intrinsics.j(email, "email");
        CardHolderName cardHolderName = new CardHolderName(accountCreditCard.getAddressContactFirstName(), accountCreditCard.getAddressContactLastName(), null, 4, null);
        BillingAddress billingAddress = new BillingAddress(new CardHolderName(accountCreditCard.getAddressContactFirstName(), accountCreditCard.getAddressContactLastName(), null, 4, null), email, accountCreditCard.getAddressLine1(), accountCreditCard.getAddressLine2(), accountCreditCard.getAddressCity(), accountCreditCard.getAddressState(), accountCreditCard.getAddressZipCode(), "US");
        String cardLastFourDigits = accountCreditCard.getCardLastFourDigits();
        hk.h hVarB = b(accountCreditCard.getCardType());
        String cardCVV = accountCreditCard.getCardCVV();
        boolean isPrimary = accountCreditCard.getIsPrimary();
        YearMonth yearMonthFrom = YearMonth.from(accountCreditCard.getExpirationDate());
        LocalDateTime termsOfServiceAgreementDate = accountCreditCard.getTermsOfServiceAgreementDate();
        return new PaymentOption(cardHolderName, billingAddress, cardLastFourDigits, hVarB, cardCVV, isPrimary, yearMonthFrom, termsOfServiceAgreementDate != null ? YearMonth.from(termsOfServiceAgreementDate) : null, String.valueOf(accountCreditCard.getCardId()), null, true, accountCreditCard.getProviderType(), accountCreditCard.getCardAuthToken());
    }

    public static final hk.h b(EnumC17677e enumC17677e) {
        Intrinsics.j(enumC17677e, "<this>");
        switch (a.$EnumSwitchMapping$0[enumC17677e.ordinal()]) {
            case 1:
                return hk.h.f135817f;
            case 2:
                return hk.h.f135816e;
            case 3:
                return hk.h.f135818g;
            case 4:
                return hk.h.f135822k;
            case 5:
                return hk.h.f135821j;
            case 6:
                return hk.h.f135819h;
            case 7:
            case 8:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
