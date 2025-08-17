package th;

import gk.BillingAddress;
import gk.CardHolderName;
import gk.PaymentOption;
import j$.time.LocalDateTime;
import j$.time.YearMonth;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import uh.AccountCreditCard;
import uh.EnumC17263e;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Luh/a;", "", "email", "Lgk/f;", "a", "(Luh/a;Ljava/lang/String;)Lgk/f;", "Luh/e;", "Lgk/h;", "b", "(Luh/e;)Lgk/h;", "payments_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class g {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC17263e.values().length];
            try {
                iArr[EnumC17263e.f162980c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC17263e.f162981d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC17263e.f162982e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC17263e.f162983f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC17263e.f162986i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC17263e.f162984g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC17263e.f162985h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC17263e.f162987j.ordinal()] = 8;
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
        gk.h hVarB = b(accountCreditCard.getCardType());
        String cardCVV = accountCreditCard.getCardCVV();
        boolean isPrimary = accountCreditCard.getIsPrimary();
        YearMonth yearMonthFrom = YearMonth.from(accountCreditCard.getExpirationDate());
        LocalDateTime termsOfServiceAgreementDate = accountCreditCard.getTermsOfServiceAgreementDate();
        return new PaymentOption(cardHolderName, billingAddress, cardLastFourDigits, hVarB, cardCVV, isPrimary, yearMonthFrom, termsOfServiceAgreementDate != null ? YearMonth.from(termsOfServiceAgreementDate) : null, String.valueOf(accountCreditCard.getCardId()), null, true, accountCreditCard.getProviderType(), accountCreditCard.getCardAuthToken());
    }

    public static final gk.h b(EnumC17263e enumC17263e) {
        Intrinsics.j(enumC17263e, "<this>");
        switch (a.$EnumSwitchMapping$0[enumC17263e.ordinal()]) {
            case 1:
                return gk.h.f133751f;
            case 2:
                return gk.h.f133750e;
            case 3:
                return gk.h.f133752g;
            case 4:
                return gk.h.f133756k;
            case 5:
                return gk.h.f133755j;
            case 6:
                return gk.h.f133753h;
            case 7:
            case 8:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
