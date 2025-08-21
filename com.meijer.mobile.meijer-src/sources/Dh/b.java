package Dh;

import Cs.MeijerAccount;
import Eh.AbstractC3240d;
import Eh.AbstractC3244h;
import Eh.AccountAddress;
import Eh.AndroidPayLoyaltyCardInfoResponse;
import Eh.B;
import Eh.CustomerPreference;
import Eh.CustomerPropertiesResponse;
import Eh.EnumC3243g;
import Eh.Preference;
import Eh.RegisterNotificationDeviceResponse;
import Eh.UpdateConfirmationResponse;
import Eh.UpdateStoreResponse;
import Eh.ValidateEmailAvailability;
import Eh.ValidatePhoneAvailability;
import Eh.VehicleInformation;
import Eh.p;
import Eh.s;
import Fh.DiscretePreferenceChoice;
import com.meijer.mobile.accounts.service.models.network.AccountAddressJson;
import com.meijer.mobile.accounts.service.models.network.AccountAddressResponseJson;
import com.meijer.mobile.accounts.service.models.network.AccountJson;
import com.meijer.mobile.accounts.service.models.network.AddOrUpdateAccountAddressRequest;
import com.meijer.mobile.accounts.service.models.network.AddressSuggestionJson;
import com.meijer.mobile.accounts.service.models.network.AndroidPayLoyaltyCardInfoResponseJson;
import com.meijer.mobile.accounts.service.models.network.CreateAccountV2ResponseJson;
import com.meijer.mobile.accounts.service.models.network.CustomerPreferenceJson;
import com.meijer.mobile.accounts.service.models.network.CustomerPreferenceUpdateResponseJson;
import com.meijer.mobile.accounts.service.models.network.CustomerPropertiesResponseJson;
import com.meijer.mobile.accounts.service.models.network.DiscretePreferenceChoiceJson;
import com.meijer.mobile.accounts.service.models.network.MeijerAccountJson;
import com.meijer.mobile.accounts.service.models.network.PreferenceRequestJson;
import com.meijer.mobile.accounts.service.models.network.PreferenceResponseJson;
import com.meijer.mobile.accounts.service.models.network.RegisterNotificationDeviceResponseJson;
import com.meijer.mobile.accounts.service.models.network.UnverifiedAddressResponseJson;
import com.meijer.mobile.accounts.service.models.network.UpdateAccountRequestV2;
import com.meijer.mobile.accounts.service.models.network.UpdateConfirmationResponseJson;
import com.meijer.mobile.accounts.service.models.network.UpdateStoreResponseJson;
import com.meijer.mobile.accounts.service.models.network.ValidateEmailAvailabilityJson;
import com.meijer.mobile.accounts.service.models.network.ValidatePhoneAvailabilityJson;
import com.meijer.mobile.accounts.service.models.network.VehicleInformationJson;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.Year;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import sk.EnumC17080a;
import uh.j;
import wk.C17898a;
import wk.d;

@Metadata(d1 = {"\u0000 \u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0014\u001a\u00020\u0013*\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0017\u001a\u00020\u0013*\u00020\u0016H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001f\u001a\u00020\u001e*\u00020\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u0013\u0010#\u001a\u00020\"*\u00020!H\u0000¢\u0006\u0004\b#\u0010$\u001a\u0013\u0010'\u001a\u00020&*\u00020%H\u0000¢\u0006\u0004\b'\u0010(\u001a#\u0010-\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)2\b\b\u0002\u0010,\u001a\u00020+H\u0007¢\u0006\u0004\b-\u0010.\u001a\u0013\u00101\u001a\u000200*\u00020/H\u0000¢\u0006\u0004\b1\u00102\u001a\u0013\u00105\u001a\u000204*\u000203H\u0000¢\u0006\u0004\b5\u00106\u001a\u0013\u00107\u001a\u000203*\u000204H\u0000¢\u0006\u0004\b7\u00108\u001a\u0013\u0010;\u001a\u00020:*\u000209H\u0000¢\u0006\u0004\b;\u0010<\u001a\u0013\u0010?\u001a\u00020>*\u00020=H\u0000¢\u0006\u0004\b?\u0010@\u001a\u0013\u0010B\u001a\u00020A*\u00020>H\u0000¢\u0006\u0004\bB\u0010C\u001a\u0011\u0010E\u001a\u00020D*\u00020)¢\u0006\u0004\bE\u0010F\u001a\u0011\u0010G\u001a\u00020)*\u00020D¢\u0006\u0004\bG\u0010H\u001a\u0013\u0010J\u001a\u00020I*\u0004\u0018\u00010)¢\u0006\u0004\bJ\u0010K\u001a\u001f\u0010N\u001a\b\u0012\u0004\u0012\u00020)0M*\u00020I2\u0006\u0010L\u001a\u00020D¢\u0006\u0004\bN\u0010O\u001a\u0011\u0010Q\u001a\u00020P*\u000204¢\u0006\u0004\bQ\u0010R\u001a\u0011\u0010T\u001a\u000204*\u00020S¢\u0006\u0004\bT\u0010U\u001a\u0011\u0010W\u001a\u00020V*\u00020S¢\u0006\u0004\bW\u0010X\u001a\u0011\u0010Z\u001a\u00020V*\u00020Y¢\u0006\u0004\bZ\u0010[\u001a\u0011\u0010]\u001a\u000204*\u00020\\¢\u0006\u0004\b]\u0010^\u001a\u0013\u0010a\u001a\u00020`*\u00020_H\u0000¢\u0006\u0004\ba\u0010b\u001a\u0011\u0010d\u001a\u00020\u0001*\u00020c¢\u0006\u0004\bd\u0010e\u001a\u0011\u0010g\u001a\u00020f*\u00020c¢\u0006\u0004\bg\u0010h\u001a\u0011\u0010j\u001a\u00020i*\u00020\u0001¢\u0006\u0004\bj\u0010k¨\u0006l"}, d2 = {"Lcom/meijer/mobile/accounts/service/models/network/MeijerAccountJson;", "LCs/a;", "t", "(Lcom/meijer/mobile/accounts/service/models/network/MeijerAccountJson;)LCs/a;", "Lcom/meijer/mobile/accounts/service/models/network/VehicleInformationJson;", "LEh/J;", "F", "(Lcom/meijer/mobile/accounts/service/models/network/VehicleInformationJson;)LEh/J;", "Lcom/meijer/mobile/accounts/service/models/network/CustomerPreferenceJson;", "LEh/k;", "e", "(Lcom/meijer/mobile/accounts/service/models/network/CustomerPreferenceJson;)LEh/k;", "Lcom/meijer/mobile/accounts/service/models/network/DiscretePreferenceChoiceJson;", "LFh/b;", "f", "(Lcom/meijer/mobile/accounts/service/models/network/DiscretePreferenceChoiceJson;)LFh/b;", "Lcom/meijer/mobile/accounts/service/models/network/UpdateConfirmationResponseJson;", "Lsk/a;", "fallbackErrorType", "LEh/D;", "D", "(Lcom/meijer/mobile/accounts/service/models/network/UpdateConfirmationResponseJson;Lsk/a;)LEh/D;", "Lcom/meijer/mobile/accounts/service/models/network/CustomerPreferenceUpdateResponseJson;", "C", "(Lcom/meijer/mobile/accounts/service/models/network/CustomerPreferenceUpdateResponseJson;)LEh/D;", "Lcom/meijer/mobile/accounts/service/models/network/ValidateEmailAvailabilityJson;", "LEh/G;", "r", "(Lcom/meijer/mobile/accounts/service/models/network/ValidateEmailAvailabilityJson;)LEh/G;", "Lcom/meijer/mobile/accounts/service/models/network/UpdateStoreResponseJson;", "LEh/F;", "q", "(Lcom/meijer/mobile/accounts/service/models/network/UpdateStoreResponseJson;)LEh/F;", "Lcom/meijer/mobile/accounts/service/models/network/ValidatePhoneAvailabilityJson;", "LEh/H;", "s", "(Lcom/meijer/mobile/accounts/service/models/network/ValidatePhoneAvailabilityJson;)LEh/H;", "Lcom/meijer/mobile/accounts/service/models/network/CustomerPropertiesResponseJson;", "LEh/l;", "n", "(Lcom/meijer/mobile/accounts/service/models/network/CustomerPropertiesResponseJson;)LEh/l;", "", "savingsSinceDate", "j$/time/LocalDateTime", "startOfYear", "a", "(Ljava/lang/String;Lj$/time/LocalDateTime;)Lj$/time/LocalDateTime;", "Lcom/meijer/mobile/accounts/service/models/network/RegisterNotificationDeviceResponseJson;", "LEh/w;", "p", "(Lcom/meijer/mobile/accounts/service/models/network/RegisterNotificationDeviceResponseJson;)LEh/w;", "Lcom/meijer/mobile/accounts/service/models/network/AccountAddressJson;", "LEh/a;", "h", "(Lcom/meijer/mobile/accounts/service/models/network/AccountAddressJson;)LEh/a;", "u", "(LEh/a;)Lcom/meijer/mobile/accounts/service/models/network/AccountAddressJson;", "Lcom/meijer/mobile/accounts/service/models/network/AndroidPayLoyaltyCardInfoResponseJson;", "LEh/f;", "l", "(Lcom/meijer/mobile/accounts/service/models/network/AndroidPayLoyaltyCardInfoResponseJson;)LEh/f;", "Lcom/meijer/mobile/accounts/service/models/network/PreferenceResponseJson;", "LEh/o;", "o", "(Lcom/meijer/mobile/accounts/service/models/network/PreferenceResponseJson;)LEh/o;", "Lcom/meijer/mobile/accounts/service/models/network/PreferenceRequestJson;", "v", "(LEh/o;)Lcom/meijer/mobile/accounts/service/models/network/PreferenceRequestJson;", "LEh/p;", "x", "(Ljava/lang/String;)LEh/p;", "y", "(LEh/p;)Ljava/lang/String;", "", "A", "(Ljava/lang/String;)Z", "preferenceKey", "", "z", "(ZLEh/p;)Ljava/util/List;", "Lcom/meijer/mobile/accounts/service/models/network/AddOrUpdateAccountAddressRequest;", "d", "(LEh/a;)Lcom/meijer/mobile/accounts/service/models/network/AddOrUpdateAccountAddressRequest;", "Lcom/meijer/mobile/accounts/service/models/network/AccountAddressResponseJson;", "c", "(Lcom/meijer/mobile/accounts/service/models/network/AccountAddressResponseJson;)LEh/a;", "LEh/d;", "j", "(Lcom/meijer/mobile/accounts/service/models/network/AccountAddressResponseJson;)LEh/d;", "Lcom/meijer/mobile/accounts/service/models/network/UnverifiedAddressResponseJson;", "k", "(Lcom/meijer/mobile/accounts/service/models/network/UnverifiedAddressResponseJson;)LEh/d;", "Lcom/meijer/mobile/accounts/service/models/network/AddressSuggestionJson;", "i", "(Lcom/meijer/mobile/accounts/service/models/network/AddressSuggestionJson;)LEh/a;", "Lcom/meijer/mobile/accounts/service/models/network/CreateAccountV2ResponseJson;", "LEh/h;", "m", "(Lcom/meijer/mobile/accounts/service/models/network/CreateAccountV2ResponseJson;)LEh/h;", "Lcom/meijer/mobile/accounts/service/models/network/AccountJson;", "g", "(Lcom/meijer/mobile/accounts/service/models/network/AccountJson;)LCs/a;", "LEh/B;", "B", "(Lcom/meijer/mobile/accounts/service/models/network/AccountJson;)LEh/B;", "Lcom/meijer/mobile/accounts/service/models/network/UpdateAccountRequestV2;", "w", "(LCs/a;)Lcom/meijer/mobile/accounts/service/models/network/UpdateAccountRequestV2;", "service_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.f7584b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.f7585c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.f7586d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[p.f7587e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[p.f7588f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[p.f7589g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean A(String str) {
        if (Intrinsics.e(str, s.f7601b.getValue()) || Intrinsics.e(str, s.f7602c.getValue()) || Intrinsics.e(str, s.f7603d.getValue())) {
            return true;
        }
        Intrinsics.e(str, s.f7604e.getValue());
        return false;
    }

    public static final B B(AccountJson accountJson) throws NumberFormatException {
        Intrinsics.j(accountJson, "<this>");
        String accountId = accountJson.getAccountId();
        String firstName = accountJson.getFirstName();
        String lastName = accountJson.getLastName();
        String email = accountJson.getEmail();
        long j10 = Long.parseLong(accountJson.getPhone());
        String zip = accountJson.getZip();
        int preferredStoreId = accountJson.getPreferredStoreId();
        String birthdate = accountJson.getBirthdate();
        LocalDate localDate = birthdate != null ? (LocalDate) d.b(birthdate, C17898a.ISO_LOCAL_DATE, new Dh.a()) : null;
        String createdAt = accountJson.getCreatedAt();
        return new B.Success(new MeijerAccount(0L, accountId, email, null, null, null, null, null, firstName, lastName, zip, preferredStoreId, null, 0L, j10, null, 0, null, 0L, 0, null, null, null, localDate, createdAt != null ? (LocalDateTime) d.b(createdAt, C17898a.f167225a.s(), new j()) : null, null, 0L, 109031673, null));
    }

    public static final UpdateConfirmationResponse C(CustomerPreferenceUpdateResponseJson customerPreferenceUpdateResponseJson) {
        Intrinsics.j(customerPreferenceUpdateResponseJson, "<this>");
        return new UpdateConfirmationResponse(0, 0L, customerPreferenceUpdateResponseJson.getIsSuccess(), null, 3, null);
    }

    public static final UpdateConfirmationResponse D(UpdateConfirmationResponseJson updateConfirmationResponseJson, EnumC17080a enumC17080a) {
        String errorType;
        Intrinsics.j(updateConfirmationResponseJson, "<this>");
        int id2 = updateConfirmationResponseJson.getId();
        long accountId = updateConfirmationResponseJson.getAccountId();
        boolean isSuccess = updateConfirmationResponseJson.getIsSuccess();
        if (!updateConfirmationResponseJson.getIsSuccess() && (errorType = updateConfirmationResponseJson.getErrorType()) != null && !StringsKt.s0(errorType)) {
            enumC17080a = EnumC17080a.INSTANCE.a(updateConfirmationResponseJson.getErrorType());
        } else if (updateConfirmationResponseJson.getIsSuccess()) {
            enumC17080a = null;
        }
        return new UpdateConfirmationResponse(id2, accountId, isSuccess, enumC17080a);
    }

    public static /* synthetic */ UpdateConfirmationResponse E(UpdateConfirmationResponseJson updateConfirmationResponseJson, EnumC17080a enumC17080a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC17080a = null;
        }
        return D(updateConfirmationResponseJson, enumC17080a);
    }

    public static final VehicleInformation F(VehicleInformationJson vehicleInformationJson) {
        Intrinsics.j(vehicleInformationJson, "<this>");
        int vehicleId = vehicleInformationJson.getVehicleId();
        String vehicleDescription = vehicleInformationJson.getVehicleDescription();
        if (vehicleDescription == null) {
            vehicleDescription = "";
        }
        return new VehicleInformation(vehicleId, vehicleDescription);
    }

    public static final LocalDateTime a(String str, LocalDateTime startOfYear) {
        LocalDateTime localDateTime;
        Intrinsics.j(startOfYear, "startOfYear");
        LocalDateTime localDateTime2 = null;
        if (str != null) {
            if (StringsKt.s0(str)) {
                str = null;
            }
            if (str != null) {
                localDateTime2 = (LocalDateTime) d.b(str, C17898a.ISO_LOCAL_DATE_TIME, new j());
            }
        }
        return (localDateTime2 == null || (localDateTime = (LocalDateTime) RangesKt.h(localDateTime2, startOfYear)) == null) ? startOfYear : localDateTime;
    }

    public static /* synthetic */ LocalDateTime b(String str, LocalDateTime localDateTime, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            localDateTime = Year.now().atDay(1).atStartOfDay();
        }
        return a(str, localDateTime);
    }

    public static final AccountAddress c(AccountAddressResponseJson accountAddressResponseJson) {
        Intrinsics.j(accountAddressResponseJson, "<this>");
        return new AccountAddress(accountAddressResponseJson.getAccountAddressId(), 0L, null, accountAddressResponseJson.getStreetAddressLine1(), accountAddressResponseJson.getStreetAddressLine2(), accountAddressResponseJson.getCity(), accountAddressResponseJson.getState(), accountAddressResponseJson.getZip(), null, null, 0L, accountAddressResponseJson.getContactFirstName(), accountAddressResponseJson.getContactLastName(), null, null, accountAddressResponseJson.getIsPrimary(), null, null, null, null, 1009414, null);
    }

    public static final AddOrUpdateAccountAddressRequest d(AccountAddress accountAddress) {
        Intrinsics.j(accountAddress, "<this>");
        String name = accountAddress.getName();
        String firstName = accountAddress.getFirstName();
        String lastName = accountAddress.getLastName();
        String addressLine1 = accountAddress.getAddressLine1();
        Intrinsics.g(addressLine1);
        String addressLine2 = accountAddress.getAddressLine2();
        String city = accountAddress.getCity();
        Intrinsics.g(city);
        String state = accountAddress.getState();
        Intrinsics.g(state);
        String zipCode = accountAddress.getZipCode();
        Intrinsics.g(zipCode);
        return new AddOrUpdateAccountAddressRequest(name, firstName, lastName, addressLine1, addressLine2, city, state, zipCode, accountAddress.getIsPrimary());
    }

    public static final CustomerPreference e(CustomerPreferenceJson customerPreferenceJson) {
        Intrinsics.j(customerPreferenceJson, "<this>");
        String preferenceTypeName = customerPreferenceJson.getPreferenceTypeName();
        if (preferenceTypeName == null) {
            preferenceTypeName = "";
        }
        String owningProgramName = customerPreferenceJson.getOwningProgramName();
        if (owningProgramName == null) {
            owningProgramName = "";
        }
        String preferenceValue = customerPreferenceJson.getPreferenceValue();
        return new CustomerPreference(preferenceTypeName, owningProgramName, preferenceValue != null ? preferenceValue : "");
    }

    public static final DiscretePreferenceChoice f(DiscretePreferenceChoiceJson discretePreferenceChoiceJson) {
        Intrinsics.j(discretePreferenceChoiceJson, "<this>");
        return new DiscretePreferenceChoice(discretePreferenceChoiceJson.getChoiceId(), discretePreferenceChoiceJson.getChoiceValue());
    }

    public static final MeijerAccount g(AccountJson accountJson) throws NumberFormatException {
        Intrinsics.j(accountJson, "<this>");
        String accountId = accountJson.getAccountId();
        String firstName = accountJson.getFirstName();
        String lastName = accountJson.getLastName();
        String email = accountJson.getEmail();
        long j10 = Long.parseLong(accountJson.getPhone());
        String zip = accountJson.getZip();
        int preferredStoreId = accountJson.getPreferredStoreId();
        String birthdate = accountJson.getBirthdate();
        LocalDate localDate = birthdate != null ? (LocalDate) d.b(birthdate, C17898a.ISO_LOCAL_DATE, new Dh.a()) : null;
        String createdAt = accountJson.getCreatedAt();
        return new MeijerAccount(0L, accountId, email, null, null, null, null, null, firstName, lastName, zip, preferredStoreId, null, 0L, j10, null, 0, null, 0L, 0, null, null, null, localDate, createdAt != null ? (LocalDateTime) d.b(createdAt, C17898a.f167225a.s(), new j()) : null, null, 0L, 109031673, null);
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public static final Eh.AccountAddress h(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r27v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    public static final AccountAddress i(AddressSuggestionJson addressSuggestionJson) {
        Intrinsics.j(addressSuggestionJson, "<this>");
        return new AccountAddress(0L, 0L, addressSuggestionJson.getName(), addressSuggestionJson.getStreetAddressLine1(), addressSuggestionJson.getStreetAddressLine2(), addressSuggestionJson.getCity(), addressSuggestionJson.getState(), addressSuggestionJson.getZip(), null, null, 0L, addressSuggestionJson.getContactFirstName(), addressSuggestionJson.getContactLastName(), null, null, addressSuggestionJson.getIsPrimary(), null, null, null, null, 1009411, null);
    }

    public static final AbstractC3240d j(AccountAddressResponseJson accountAddressResponseJson) {
        Intrinsics.j(accountAddressResponseJson, "<this>");
        return new AbstractC3240d.Success(new AccountAddress(accountAddressResponseJson.getAccountAddressId(), 0L, null, accountAddressResponseJson.getStreetAddressLine1(), accountAddressResponseJson.getStreetAddressLine2(), accountAddressResponseJson.getCity(), accountAddressResponseJson.getState(), accountAddressResponseJson.getZip(), null, null, 0L, accountAddressResponseJson.getContactFirstName(), accountAddressResponseJson.getContactLastName(), null, null, accountAddressResponseJson.getIsPrimary(), null, null, null, null, 1009414, null));
    }

    public static final AbstractC3240d k(UnverifiedAddressResponseJson unverifiedAddressResponseJson) {
        Intrinsics.j(unverifiedAddressResponseJson, "<this>");
        return new AbstractC3240d.Select(i(unverifiedAddressResponseJson.getAddresses().getOriginal()), i(unverifiedAddressResponseJson.getAddresses().getSuggested()));
    }

    public static final AndroidPayLoyaltyCardInfoResponse l(AndroidPayLoyaltyCardInfoResponseJson androidPayLoyaltyCardInfoResponseJson) {
        Intrinsics.j(androidPayLoyaltyCardInfoResponseJson, "<this>");
        return new AndroidPayLoyaltyCardInfoResponse(androidPayLoyaltyCardInfoResponseJson.getBarcodeType(), androidPayLoyaltyCardInfoResponseJson.getBarcodeValue(), androidPayLoyaltyCardInfoResponseJson.getAccountID(), androidPayLoyaltyCardInfoResponseJson.getAccountName(), androidPayLoyaltyCardInfoResponseJson.getObjectID(), androidPayLoyaltyCardInfoResponseJson.getClassID(), androidPayLoyaltyCardInfoResponseJson.getIssuerName(), androidPayLoyaltyCardInfoResponseJson.getProgramName());
    }

    public static final AbstractC3244h m(CreateAccountV2ResponseJson createAccountV2ResponseJson) throws NumberFormatException {
        Intrinsics.j(createAccountV2ResponseJson, "<this>");
        String firstName = createAccountV2ResponseJson.getFirstName();
        String lastName = createAccountV2ResponseJson.getLastName();
        long j10 = Long.parseLong(createAccountV2ResponseJson.getPhone());
        int preferredStoreId = createAccountV2ResponseJson.getPreferredStoreId();
        return new AbstractC3244h.Success(new MeijerAccount(0L, null, createAccountV2ResponseJson.getEmail(), null, null, null, null, null, firstName, lastName, createAccountV2ResponseJson.getZip(), preferredStoreId, null, 0L, j10, null, 0, null, 0L, 0, null, null, null, null, null, null, 0L, 134197499, null));
    }

    public static final CustomerPropertiesResponse n(CustomerPropertiesResponseJson customerPropertiesResponseJson) {
        Intrinsics.j(customerPropertiesResponseJson, "<this>");
        return new CustomerPropertiesResponse(customerPropertiesResponseJson.getHasEmailVerified(), customerPropertiesResponseJson.getIsAdmin(), b(customerPropertiesResponseJson.getSavingsSinceDate(), null, 2, null));
    }

    public static final Preference o(PreferenceResponseJson preferenceResponseJson) {
        Intrinsics.j(preferenceResponseJson, "<this>");
        p pVarX = x(preferenceResponseJson.getPreferenceKey());
        String str = (String) CollectionsKt.u0(preferenceResponseJson.p());
        return new Preference(pVarX, str != null ? A(str) : false, preferenceResponseJson.getName(), preferenceResponseJson.getDescription());
    }

    public static final RegisterNotificationDeviceResponse p(RegisterNotificationDeviceResponseJson registerNotificationDeviceResponseJson) {
        Intrinsics.j(registerNotificationDeviceResponseJson, "<this>");
        return new RegisterNotificationDeviceResponse(registerNotificationDeviceResponseJson.getId(), registerNotificationDeviceResponseJson.getAccountId(), registerNotificationDeviceResponseJson.getSuccess());
    }

    public static final UpdateStoreResponse q(UpdateStoreResponseJson updateStoreResponseJson) {
        Intrinsics.j(updateStoreResponseJson, "<this>");
        return new UpdateStoreResponse(updateStoreResponseJson.getAccountId(), updateStoreResponseJson.getSuccess());
    }

    public static final ValidateEmailAvailability r(ValidateEmailAvailabilityJson validateEmailAvailabilityJson) {
        Intrinsics.j(validateEmailAvailabilityJson, "<this>");
        return new ValidateEmailAvailability(validateEmailAvailabilityJson.getConflictType() == 2 ? EnumC3243g.f7554c : EnumC3243g.f7553b, validateEmailAvailabilityJson.getName());
    }

    public static final ValidatePhoneAvailability s(ValidatePhoneAvailabilityJson validatePhoneAvailabilityJson) {
        Intrinsics.j(validatePhoneAvailabilityJson, "<this>");
        return new ValidatePhoneAvailability(validatePhoneAvailabilityJson.getConflictType() == 2 ? EnumC3243g.f7554c : EnumC3243g.f7553b, validatePhoneAvailabilityJson.getName());
    }

    public static final MeijerAccount t(MeijerAccountJson meijerAccountJson) {
        Intrinsics.j(meijerAccountJson, "<this>");
        long accountId = meijerAccountJson.getAccountId();
        String email = meijerAccountJson.getEmail();
        String password = meijerAccountJson.getPassword();
        String firstName = meijerAccountJson.getFirstName();
        String lastName = meijerAccountJson.getLastName();
        String zip = meijerAccountJson.getZip();
        int storeId = meijerAccountJson.getStoreId();
        String accountStatus = meijerAccountJson.getAccountStatus();
        long mPerksId = meijerAccountJson.getMPerksId();
        long mPerksPhone = meijerAccountJson.getMPerksPhone();
        int mPerksStoreId = meijerAccountJson.getMPerksStoreId();
        String mPerkStatus = meijerAccountJson.getMPerkStatus();
        long employeeId = meijerAccountJson.getEmployeeId();
        int employeeStoreId = meijerAccountJson.getEmployeeStoreId();
        String employeeStatus = meijerAccountJson.getEmployeeStatus();
        String createdBy = meijerAccountJson.getCreatedBy();
        String updatedBy = meijerAccountJson.getUpdatedBy();
        String birthDate = meijerAccountJson.getBirthDate();
        LocalDate localDate = birthDate != null ? (LocalDate) d.b(birthDate, C17898a.f167225a.s(), new Dh.a()) : null;
        String createdDate = meijerAccountJson.getCreatedDate();
        LocalDateTime localDateTime = createdDate != null ? (LocalDateTime) d.b(createdDate, C17898a.f167225a.s(), new j()) : null;
        String updatedDate = meijerAccountJson.getUpdatedDate();
        LocalDateTime localDateTime2 = updatedDate != null ? (LocalDateTime) d.b(updatedDate, C17898a.f167225a.s(), new j()) : null;
        String mPerksPin = meijerAccountJson.getMPerksPin();
        Long loyaltyCardNumber = meijerAccountJson.getLoyaltyCardNumber();
        return new MeijerAccount(accountId, null, email, password, null, null, null, null, firstName, lastName, zip, storeId, accountStatus, mPerksId, mPerksPhone, mPerksPin, mPerksStoreId, mPerkStatus, employeeId, employeeStoreId, employeeStatus, createdBy, updatedBy, localDate, localDateTime, localDateTime2, loyaltyCardNumber != null ? loyaltyCardNumber.longValue() : 0L, 242, null);
    }

    public static final AccountAddressJson u(AccountAddress accountAddress) {
        Intrinsics.j(accountAddress, "<this>");
        return new AccountAddressJson(accountAddress.getId(), accountAddress.getDigitalAccountId(), accountAddress.getName(), accountAddress.getAddressLine1(), accountAddress.getAddressLine2(), accountAddress.getCity(), accountAddress.getState(), accountAddress.getZipCode(), accountAddress.getAddressType().getValue() != 2 ? "ShippingAddress" : "BillingAddress", accountAddress.getAddressType().getValue(), accountAddress.getAddressValidationType().getValidationCode(), accountAddress.getContactId(), accountAddress.getFirstName(), accountAddress.getLastName(), null, accountAddress.getIsPrimary(), null, accountAddress.getCreatedBy(), null, accountAddress.getUpdatedBy(), 344064, null);
    }

    public static final PreferenceRequestJson v(Preference preference) {
        Intrinsics.j(preference, "<this>");
        return new PreferenceRequestJson(y(preference.getPreferenceKey()), z(preference.getIsEnabled(), preference.getPreferenceKey()));
    }

    public static final UpdateAccountRequestV2 w(MeijerAccount meijerAccount) {
        Intrinsics.j(meijerAccount, "<this>");
        String firstName = meijerAccount.getFirstName();
        if (firstName == null) {
            throw new IllegalArgumentException("First name cannot be null");
        }
        String lastName = meijerAccount.getLastName();
        if (lastName == null) {
            throw new IllegalArgumentException("Last name cannot be null");
        }
        String email = meijerAccount.getEmail();
        if (email == null) {
            throw new IllegalArgumentException("Email cannot be null");
        }
        String zip = meijerAccount.getZip();
        if (zip == null) {
            throw new IllegalArgumentException("Zip code cannot be null");
        }
        String strValueOf = String.valueOf(meijerAccount.getMPerksPhone());
        int storeId = meijerAccount.getStoreId();
        LocalDate birthDate = meijerAccount.getBirthDate();
        String str = birthDate != null ? birthDate.format(C17898a.ISO_LOCAL_DATE) : null;
        if (str == null) {
            str = "";
        }
        return new UpdateAccountRequestV2(firstName, lastName, email, strValueOf, zip, storeId, str);
    }

    public static final p x(String str) {
        Intrinsics.j(str, "<this>");
        p pVar = p.f7584b;
        if (!Intrinsics.e(str, pVar.getKey())) {
            p pVar2 = p.f7585c;
            if (Intrinsics.e(str, pVar2.getKey())) {
                return pVar2;
            }
            p pVar3 = p.f7586d;
            if (Intrinsics.e(str, pVar3.getKey())) {
                return pVar3;
            }
            p pVar4 = p.f7587e;
            if (Intrinsics.e(str, pVar4.getKey())) {
                return pVar4;
            }
            p pVar5 = p.f7588f;
            if (Intrinsics.e(str, pVar5.getKey())) {
                return pVar5;
            }
            p pVar6 = p.f7589g;
            if (Intrinsics.e(str, pVar6.getKey())) {
                return pVar6;
            }
        }
        return pVar;
    }

    public static final String y(p pVar) {
        Intrinsics.j(pVar, "<this>");
        switch (a.$EnumSwitchMapping$0[pVar.ordinal()]) {
            case 1:
                return p.f7584b.getKey();
            case 2:
                return p.f7585c.getKey();
            case 3:
                return p.f7586d.getKey();
            case 4:
                return p.f7587e.getKey();
            case 5:
                return p.f7588f.getKey();
            case 6:
                return p.f7589g.getKey();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final List<String> z(boolean z10, p preferenceKey) {
        Intrinsics.j(preferenceKey, "preferenceKey");
        int i10 = a.$EnumSwitchMapping$0[preferenceKey.ordinal()];
        if (i10 == 1) {
            return z10 ? CollectionsKt.e(s.f7601b.getValue()) : CollectionsKt.m();
        }
        if (i10 == 2) {
            return z10 ? CollectionsKt.e(s.f7601b.getValue()) : CollectionsKt.m();
        }
        if (i10 != 3) {
            return CollectionsKt.e((z10 ? s.f7603d : s.f7604e).getValue());
        }
        return z10 ? CollectionsKt.e(s.f7602c.getValue()) : CollectionsKt.m();
    }
}
