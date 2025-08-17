package Q0;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"LQ0/N;", "", "a", "LQ0/k;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface N {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f29445a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bo\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\bR\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u0017\u0010$\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b#\u0010\bR\u0017\u0010'\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR\u0017\u0010*\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\u0006\u001a\u0004\b)\u0010\bR\u0017\u0010-\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u0017\u00100\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b/\u0010\bR\u0017\u00103\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\bR\u0017\u00106\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010\u0006\u001a\u0004\b5\u0010\bR\u0017\u00109\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b8\u0010\bR\u0017\u0010<\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b:\u0010\u0006\u001a\u0004\b;\u0010\bR\u0017\u0010?\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b>\u0010\bR\u0017\u0010B\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b@\u0010\u0006\u001a\u0004\bA\u0010\bR\u0017\u0010E\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bC\u0010\u0006\u001a\u0004\bD\u0010\bR\u0017\u0010H\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bF\u0010\u0006\u001a\u0004\bG\u0010\bR\u0017\u0010K\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bI\u0010\u0006\u001a\u0004\bJ\u0010\bR\u0017\u0010N\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bL\u0010\u0006\u001a\u0004\bM\u0010\bR\u0017\u0010Q\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bO\u0010\u0006\u001a\u0004\bP\u0010\bR\u0017\u0010T\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bR\u0010\u0006\u001a\u0004\bS\u0010\bR\u0017\u0010W\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bU\u0010\u0006\u001a\u0004\bV\u0010\bR\u0017\u0010Z\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bX\u0010\u0006\u001a\u0004\bY\u0010\bR\u0017\u0010]\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b[\u0010\u0006\u001a\u0004\b\\\u0010\bR\u0017\u0010`\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b^\u0010\u0006\u001a\u0004\b_\u0010\bR\u0017\u0010c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\ba\u0010\u0006\u001a\u0004\bb\u0010\bR\u0017\u0010f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bd\u0010\u0006\u001a\u0004\be\u0010\bR\u0017\u0010i\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bg\u0010\u0006\u001a\u0004\bh\u0010\bR\u0017\u0010l\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bj\u0010\u0006\u001a\u0004\bk\u0010\bR\u0017\u0010o\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bm\u0010\u0006\u001a\u0004\bn\u0010\bR\u0017\u0010r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bp\u0010\u0006\u001a\u0004\bq\u0010\b¨\u0006s"}, d2 = {"LQ0/N$a;", "", "<init>", "()V", "LQ0/N;", "b", "LQ0/N;", "getUsername", "()LQ0/N;", "Username", "c", "a", "Password", "d", "getEmailAddress", "EmailAddress", "e", "getNewUsername", "NewUsername", "f", "getNewPassword", "NewPassword", "g", "getPostalAddress", "PostalAddress", "h", "getPostalCode", "PostalCode", "i", "getCreditCardNumber", "CreditCardNumber", "j", "getCreditCardSecurityCode", "CreditCardSecurityCode", "k", "getCreditCardExpirationDate", "CreditCardExpirationDate", "l", "getCreditCardExpirationMonth", "CreditCardExpirationMonth", "m", "getCreditCardExpirationYear", "CreditCardExpirationYear", "n", "getCreditCardExpirationDay", "CreditCardExpirationDay", "o", "getAddressCountry", "AddressCountry", "p", "getAddressRegion", "AddressRegion", "q", "getAddressLocality", "AddressLocality", "r", "getAddressStreet", "AddressStreet", "s", "getAddressAuxiliaryDetails", "AddressAuxiliaryDetails", "t", "getPostalCodeExtended", "PostalCodeExtended", "u", "getPersonFullName", "PersonFullName", "v", "getPersonFirstName", "PersonFirstName", "w", "getPersonLastName", "PersonLastName", "x", "getPersonMiddleName", "PersonMiddleName", "y", "getPersonMiddleInitial", "PersonMiddleInitial", "z", "getPersonNamePrefix", "PersonNamePrefix", "A", "getPersonNameSuffix", "PersonNameSuffix", "B", "getPhoneNumber", "PhoneNumber", "C", "getPhoneNumberDevice", "PhoneNumberDevice", "D", "getPhoneCountryCode", "PhoneCountryCode", "E", "getPhoneNumberNational", "PhoneNumberNational", "F", "getGender", "Gender", "G", "getBirthDateFull", "BirthDateFull", "H", "getBirthDateDay", "BirthDateDay", "I", "getBirthDateMonth", "BirthDateMonth", "J", "getBirthDateYear", "BirthDateYear", "K", "getSmsOtpCode", "SmsOtpCode", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Q0.N$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f29445a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final N Username = O.a("username");

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final N Password = O.a("password");

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final N EmailAddress = O.a("emailAddress");

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final N NewUsername = O.a("newUsername");

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final N NewPassword = O.a("newPassword");

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private static final N PostalAddress = O.a("postalAddress");

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private static final N PostalCode = O.a("postalCode");

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private static final N CreditCardNumber = O.a("creditCardNumber");

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private static final N CreditCardSecurityCode = O.a("creditCardSecurityCode");

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private static final N CreditCardExpirationDate = O.a("creditCardExpirationDate");

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private static final N CreditCardExpirationMonth = O.a("creditCardExpirationMonth");

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        private static final N CreditCardExpirationYear = O.a("creditCardExpirationYear");

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        private static final N CreditCardExpirationDay = O.a("creditCardExpirationDay");

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private static final N AddressCountry = O.a("addressCountry");

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        private static final N AddressRegion = O.a("addressRegion");

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        private static final N AddressLocality = O.a("addressLocality");

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        private static final N AddressStreet = O.a("streetAddress");

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        private static final N AddressAuxiliaryDetails = O.a("extendedAddress");

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        private static final N PostalCodeExtended = O.a("extendedPostalCode");

        /* renamed from: u, reason: collision with root package name and from kotlin metadata */
        private static final N PersonFullName = O.a("personName");

        /* renamed from: v, reason: collision with root package name and from kotlin metadata */
        private static final N PersonFirstName = O.a("personGivenName");

        /* renamed from: w, reason: collision with root package name and from kotlin metadata */
        private static final N PersonLastName = O.a("personFamilyName");

        /* renamed from: x, reason: collision with root package name and from kotlin metadata */
        private static final N PersonMiddleName = O.a("personMiddleName");

        /* renamed from: y, reason: collision with root package name and from kotlin metadata */
        private static final N PersonMiddleInitial = O.a("personMiddleInitial");

        /* renamed from: z, reason: collision with root package name and from kotlin metadata */
        private static final N PersonNamePrefix = O.a("personNamePrefix");

        /* renamed from: A, reason: collision with root package name and from kotlin metadata */
        private static final N PersonNameSuffix = O.a("personNameSuffix");

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private static final N PhoneNumber = O.a("phoneNumber");

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private static final N PhoneNumberDevice = O.a("phoneNumberDevice");

        /* renamed from: D, reason: collision with root package name and from kotlin metadata */
        private static final N PhoneCountryCode = O.a("phoneCountryCode");

        /* renamed from: E, reason: collision with root package name and from kotlin metadata */
        private static final N PhoneNumberNational = O.a("phoneNational");

        /* renamed from: F, reason: collision with root package name and from kotlin metadata */
        private static final N Gender = O.a("gender");

        /* renamed from: G, reason: collision with root package name and from kotlin metadata */
        private static final N BirthDateFull = O.a("birthDateFull");

        /* renamed from: H, reason: collision with root package name and from kotlin metadata */
        private static final N BirthDateDay = O.a("birthDateDay");

        /* renamed from: I, reason: collision with root package name and from kotlin metadata */
        private static final N BirthDateMonth = O.a("birthDateMonth");

        /* renamed from: J, reason: collision with root package name and from kotlin metadata */
        private static final N BirthDateYear = O.a("birthDateYear");

        /* renamed from: K, reason: collision with root package name and from kotlin metadata */
        private static final N SmsOtpCode = O.a("smsOTPCode");

        public final N a() {
            return Password;
        }

        private Companion() {
        }
    }
}
