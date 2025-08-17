package Ch;

import Cs.MeijerAccount;
import Dh.AbstractC3371d;
import Dh.AbstractC3375h;
import Dh.AccountAddress;
import Dh.AndroidPayLoyaltyCardInfoResponse;
import Dh.CustomerPreference;
import Dh.CustomerPropertiesResponse;
import Dh.EnumC3374g;
import Dh.Preference;
import Dh.RegisterNotificationDeviceResponse;
import Dh.UpdateConfirmationResponse;
import Dh.UpdateStoreResponse;
import Dh.ValidateEmailAvailability;
import Dh.ValidatePhoneAvailability;
import Dh.VehicleInformation;
import Dh.p;
import Dh.s;
import Eh.DiscretePreferenceChoice;
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
import rk.EnumC16795a;
import th.j;
import vk.C17590a;
import vk.d;

@Metadata(d1 = {"\u0000\u0098\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0014\u001a\u00020\u0013*\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0017\u001a\u00020\u0013*\u00020\u0016H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001f\u001a\u00020\u001e*\u00020\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u0013\u0010#\u001a\u00020\"*\u00020!H\u0000¢\u0006\u0004\b#\u0010$\u001a\u0013\u0010'\u001a\u00020&*\u00020%H\u0000¢\u0006\u0004\b'\u0010(\u001a#\u0010-\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)2\b\b\u0002\u0010,\u001a\u00020+H\u0007¢\u0006\u0004\b-\u0010.\u001a\u0013\u00101\u001a\u000200*\u00020/H\u0000¢\u0006\u0004\b1\u00102\u001a\u0013\u00105\u001a\u000204*\u000203H\u0000¢\u0006\u0004\b5\u00106\u001a\u0013\u00107\u001a\u000203*\u000204H\u0000¢\u0006\u0004\b7\u00108\u001a\u0013\u0010;\u001a\u00020:*\u000209H\u0000¢\u0006\u0004\b;\u0010<\u001a\u0013\u0010?\u001a\u00020>*\u00020=H\u0000¢\u0006\u0004\b?\u0010@\u001a\u0013\u0010B\u001a\u00020A*\u00020>H\u0000¢\u0006\u0004\bB\u0010C\u001a\u0011\u0010E\u001a\u00020D*\u00020)¢\u0006\u0004\bE\u0010F\u001a\u0011\u0010G\u001a\u00020)*\u00020D¢\u0006\u0004\bG\u0010H\u001a\u0013\u0010J\u001a\u00020I*\u0004\u0018\u00010)¢\u0006\u0004\bJ\u0010K\u001a\u001f\u0010N\u001a\b\u0012\u0004\u0012\u00020)0M*\u00020I2\u0006\u0010L\u001a\u00020D¢\u0006\u0004\bN\u0010O\u001a\u0011\u0010Q\u001a\u00020P*\u000204¢\u0006\u0004\bQ\u0010R\u001a\u0011\u0010T\u001a\u000204*\u00020S¢\u0006\u0004\bT\u0010U\u001a\u0011\u0010W\u001a\u00020V*\u00020S¢\u0006\u0004\bW\u0010X\u001a\u0011\u0010Z\u001a\u00020V*\u00020Y¢\u0006\u0004\bZ\u0010[\u001a\u0011\u0010]\u001a\u000204*\u00020\\¢\u0006\u0004\b]\u0010^\u001a\u0013\u0010a\u001a\u00020`*\u00020_H\u0000¢\u0006\u0004\ba\u0010b\u001a\u0013\u0010d\u001a\u00020`*\u00020cH\u0000¢\u0006\u0004\bd\u0010e\u001a\u0011\u0010g\u001a\u00020\u0001*\u00020f¢\u0006\u0004\bg\u0010h¨\u0006i"}, d2 = {"Lcom/meijer/mobile/accounts/service/models/network/MeijerAccountJson;", "LCs/a;", "u", "(Lcom/meijer/mobile/accounts/service/models/network/MeijerAccountJson;)LCs/a;", "Lcom/meijer/mobile/accounts/service/models/network/VehicleInformationJson;", "LDh/I;", "E", "(Lcom/meijer/mobile/accounts/service/models/network/VehicleInformationJson;)LDh/I;", "Lcom/meijer/mobile/accounts/service/models/network/CustomerPreferenceJson;", "LDh/k;", "e", "(Lcom/meijer/mobile/accounts/service/models/network/CustomerPreferenceJson;)LDh/k;", "Lcom/meijer/mobile/accounts/service/models/network/DiscretePreferenceChoiceJson;", "LEh/b;", "f", "(Lcom/meijer/mobile/accounts/service/models/network/DiscretePreferenceChoiceJson;)LEh/b;", "Lcom/meijer/mobile/accounts/service/models/network/UpdateConfirmationResponseJson;", "Lrk/a;", "fallbackErrorType", "LDh/C;", "C", "(Lcom/meijer/mobile/accounts/service/models/network/UpdateConfirmationResponseJson;Lrk/a;)LDh/C;", "Lcom/meijer/mobile/accounts/service/models/network/CustomerPreferenceUpdateResponseJson;", "B", "(Lcom/meijer/mobile/accounts/service/models/network/CustomerPreferenceUpdateResponseJson;)LDh/C;", "Lcom/meijer/mobile/accounts/service/models/network/ValidateEmailAvailabilityJson;", "LDh/F;", "s", "(Lcom/meijer/mobile/accounts/service/models/network/ValidateEmailAvailabilityJson;)LDh/F;", "Lcom/meijer/mobile/accounts/service/models/network/UpdateStoreResponseJson;", "LDh/E;", "r", "(Lcom/meijer/mobile/accounts/service/models/network/UpdateStoreResponseJson;)LDh/E;", "Lcom/meijer/mobile/accounts/service/models/network/ValidatePhoneAvailabilityJson;", "LDh/G;", "t", "(Lcom/meijer/mobile/accounts/service/models/network/ValidatePhoneAvailabilityJson;)LDh/G;", "Lcom/meijer/mobile/accounts/service/models/network/CustomerPropertiesResponseJson;", "LDh/l;", "o", "(Lcom/meijer/mobile/accounts/service/models/network/CustomerPropertiesResponseJson;)LDh/l;", "", "savingsSinceDate", "j$/time/LocalDateTime", "startOfYear", "a", "(Ljava/lang/String;Lj$/time/LocalDateTime;)Lj$/time/LocalDateTime;", "Lcom/meijer/mobile/accounts/service/models/network/RegisterNotificationDeviceResponseJson;", "LDh/w;", "q", "(Lcom/meijer/mobile/accounts/service/models/network/RegisterNotificationDeviceResponseJson;)LDh/w;", "Lcom/meijer/mobile/accounts/service/models/network/AccountAddressJson;", "LDh/a;", "h", "(Lcom/meijer/mobile/accounts/service/models/network/AccountAddressJson;)LDh/a;", "v", "(LDh/a;)Lcom/meijer/mobile/accounts/service/models/network/AccountAddressJson;", "Lcom/meijer/mobile/accounts/service/models/network/AndroidPayLoyaltyCardInfoResponseJson;", "LDh/f;", "l", "(Lcom/meijer/mobile/accounts/service/models/network/AndroidPayLoyaltyCardInfoResponseJson;)LDh/f;", "Lcom/meijer/mobile/accounts/service/models/network/PreferenceResponseJson;", "LDh/o;", "p", "(Lcom/meijer/mobile/accounts/service/models/network/PreferenceResponseJson;)LDh/o;", "Lcom/meijer/mobile/accounts/service/models/network/PreferenceRequestJson;", "w", "(LDh/o;)Lcom/meijer/mobile/accounts/service/models/network/PreferenceRequestJson;", "LDh/p;", "x", "(Ljava/lang/String;)LDh/p;", "y", "(LDh/p;)Ljava/lang/String;", "", "A", "(Ljava/lang/String;)Z", "preferenceKey", "", "z", "(ZLDh/p;)Ljava/util/List;", "Lcom/meijer/mobile/accounts/service/models/network/AddOrUpdateAccountAddressRequest;", "d", "(LDh/a;)Lcom/meijer/mobile/accounts/service/models/network/AddOrUpdateAccountAddressRequest;", "Lcom/meijer/mobile/accounts/service/models/network/AccountAddressResponseJson;", "c", "(Lcom/meijer/mobile/accounts/service/models/network/AccountAddressResponseJson;)LDh/a;", "LDh/d;", "j", "(Lcom/meijer/mobile/accounts/service/models/network/AccountAddressResponseJson;)LDh/d;", "Lcom/meijer/mobile/accounts/service/models/network/UnverifiedAddressResponseJson;", "k", "(Lcom/meijer/mobile/accounts/service/models/network/UnverifiedAddressResponseJson;)LDh/d;", "Lcom/meijer/mobile/accounts/service/models/network/AddressSuggestionJson;", "i", "(Lcom/meijer/mobile/accounts/service/models/network/AddressSuggestionJson;)LDh/a;", "Lcom/meijer/mobile/accounts/service/models/network/CreateAccountV2ResponseJson;", "LDh/h;", "n", "(Lcom/meijer/mobile/accounts/service/models/network/CreateAccountV2ResponseJson;)LDh/h;", "LXj/b;", "m", "(LXj/b;)LDh/h;", "Lcom/meijer/mobile/accounts/service/models/network/AccountJson;", "g", "(Lcom/meijer/mobile/accounts/service/models/network/AccountJson;)LCs/a;", "service_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.f6558b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.f6559c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.f6560d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[p.f6561e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[p.f6562f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[p.f6563g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean A(String str) {
        if (Intrinsics.e(str, s.f6575b.getValue()) || Intrinsics.e(str, s.f6576c.getValue()) || Intrinsics.e(str, s.f6577d.getValue())) {
            return true;
        }
        Intrinsics.e(str, s.f6578e.getValue());
        return false;
    }

    public static final UpdateConfirmationResponse B(CustomerPreferenceUpdateResponseJson customerPreferenceUpdateResponseJson) {
        Intrinsics.j(customerPreferenceUpdateResponseJson, "<this>");
        return new UpdateConfirmationResponse(0, 0L, customerPreferenceUpdateResponseJson.getIsSuccess(), null, 3, null);
    }

    public static final UpdateConfirmationResponse C(UpdateConfirmationResponseJson updateConfirmationResponseJson, EnumC16795a enumC16795a) {
        String errorType;
        Intrinsics.j(updateConfirmationResponseJson, "<this>");
        int id2 = updateConfirmationResponseJson.getId();
        long accountId = updateConfirmationResponseJson.getAccountId();
        boolean isSuccess = updateConfirmationResponseJson.getIsSuccess();
        if (!updateConfirmationResponseJson.getIsSuccess() && (errorType = updateConfirmationResponseJson.getErrorType()) != null && !StringsKt.r0(errorType)) {
            enumC16795a = EnumC16795a.INSTANCE.a(updateConfirmationResponseJson.getErrorType());
        } else if (updateConfirmationResponseJson.getIsSuccess()) {
            enumC16795a = null;
        }
        return new UpdateConfirmationResponse(id2, accountId, isSuccess, enumC16795a);
    }

    public static /* synthetic */ UpdateConfirmationResponse D(UpdateConfirmationResponseJson updateConfirmationResponseJson, EnumC16795a enumC16795a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC16795a = null;
        }
        return C(updateConfirmationResponseJson, enumC16795a);
    }

    public static final VehicleInformation E(VehicleInformationJson vehicleInformationJson) {
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
            if (StringsKt.r0(str)) {
                str = null;
            }
            if (str != null) {
                localDateTime2 = (LocalDateTime) d.b(str, C17590a.ISO_LOCAL_DATE_TIME, new j());
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
        String birthDate = accountJson.getBirthDate();
        LocalDate localDate = birthDate != null ? (LocalDate) d.b(birthDate, C17590a.ISO_LOCAL_DATE, new Ch.a()) : null;
        String createdAt = accountJson.getCreatedAt();
        return new MeijerAccount(0L, accountId, email, null, null, null, null, null, firstName, lastName, zip, preferredStoreId, null, 0L, j10, null, 0, null, 0L, 0, null, null, null, localDate, createdAt != null ? (LocalDateTime) d.b(createdAt, C17590a.f164803a.s(), new j()) : null, null, 0L, 109031673, null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 Dh.a, still in use, count: 2, list:
          (r1v1 Dh.a) from 0x00a7: MOVE (r23v0 Dh.a) = (r1v1 Dh.a) (LINE:169)
          (r1v1 Dh.a) from 0x0081: MOVE (r23v4 Dh.a) = (r1v1 Dh.a) (LINE:131)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public static final Dh.AccountAddress h(com.meijer.mobile.accounts.service.models.network.AccountAddressJson r26) {
        /*
            java.lang.String r0 = "<this>"
            r1 = r26
            kotlin.jvm.internal.Intrinsics.j(r1, r0)
            Dh.a r1 = new Dh.a
            long r2 = r26.getId()
            long r4 = r26.getAccountId()
            java.lang.String r6 = r26.getName()
            java.lang.String r7 = r26.getAddressLine1()
            java.lang.String r8 = r26.getAddressLine2()
            java.lang.String r9 = r26.getCity()
            java.lang.String r10 = r26.getState()
            java.lang.String r11 = r26.getZipCode()
            Dh.e$a r0 = Dh.EnumC3372e.INSTANCE
            int r12 = r26.getAddressType()
            Dh.e r12 = r0.a(r12)
            long r13 = r26.getAddressValidationType()
            r15 = 0
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 != 0) goto L41
            uh.d r0 = uh.EnumC17262d.f162971b
        L3f:
            r13 = r0
            goto L5f
        L41:
            r15 = 1
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 != 0) goto L4a
            uh.d r0 = uh.EnumC17262d.f162972c
            goto L3f
        L4a:
            r15 = 2
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 != 0) goto L53
            uh.d r0 = uh.EnumC17262d.f162973d
            goto L3f
        L53:
            r15 = 3
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 != 0) goto L5c
            uh.d r0 = uh.EnumC17262d.f162974e
            goto L3f
        L5c:
            uh.d r0 = uh.EnumC17262d.f162971b
            goto L3f
        L5f:
            long r14 = r26.getContactId()
            java.lang.String r16 = r26.getFirstName()
            java.lang.String r17 = r26.getLastName()
            java.lang.String r18 = r26.getAddressNickname()
            java.lang.String r19 = r26.getPhoneNumber()
            boolean r20 = r26.getIsPrimary()
            java.lang.String r0 = r26.getCreateDate()
            r21 = 0
            if (r0 == 0) goto La7
            vk.a r22 = vk.C17590a.f164803a
            r23 = r1
            j$.time.format.DateTimeFormatter r1 = r22.s()
            r24 = r2
            th.j r2 = new th.j
            r2.<init>()
            java.lang.Object r0 = vk.d.b(r0, r1, r2)
            j$.time.LocalDateTime r0 = (j$.time.LocalDateTime) r0
            if (r0 == 0) goto Lab
            j$.time.ZoneId r1 = vk.e.EASTERN
            j$.time.ZonedDateTime r0 = r0.N(r1)
            if (r0 == 0) goto Lab
            j$.time.ZoneId r1 = j$.time.ZoneId.systemDefault()
            j$.time.ZonedDateTime r0 = r0.n(r1)
            goto Lad
        La7:
            r23 = r1
            r24 = r2
        Lab:
            r0 = r21
        Lad:
            java.lang.String r22 = r26.getCreatedBy()
            java.lang.String r1 = r26.getUpdateDate()
            if (r1 == 0) goto Lda
            vk.a r2 = vk.C17590a.f164803a
            j$.time.format.DateTimeFormatter r2 = r2.s()
            th.j r3 = new th.j
            r3.<init>()
            java.lang.Object r1 = vk.d.b(r1, r2, r3)
            j$.time.LocalDateTime r1 = (j$.time.LocalDateTime) r1
            if (r1 == 0) goto Lda
            j$.time.ZoneId r2 = vk.e.EASTERN
            j$.time.ZonedDateTime r1 = r1.N(r2)
            if (r1 == 0) goto Lda
            j$.time.ZoneId r2 = j$.time.ZoneId.systemDefault()
            j$.time.ZonedDateTime r21 = r1.n(r2)
        Lda:
            java.lang.String r1 = r26.getUpdatedBy()
            r2 = r24
            r24 = r1
            r1 = r23
            r23 = r21
            r21 = r0
            r1.<init>(r2, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Ch.b.h(com.meijer.mobile.accounts.service.models.network.AccountAddressJson):Dh.a");
    }

    public static final AccountAddress i(AddressSuggestionJson addressSuggestionJson) {
        Intrinsics.j(addressSuggestionJson, "<this>");
        return new AccountAddress(0L, 0L, addressSuggestionJson.getName(), addressSuggestionJson.getStreetAddressLine1(), addressSuggestionJson.getStreetAddressLine2(), addressSuggestionJson.getCity(), addressSuggestionJson.getState(), addressSuggestionJson.getZip(), null, null, 0L, addressSuggestionJson.getContactFirstName(), addressSuggestionJson.getContactLastName(), null, null, addressSuggestionJson.getIsPrimary(), null, null, null, null, 1009411, null);
    }

    public static final AbstractC3371d j(AccountAddressResponseJson accountAddressResponseJson) {
        Intrinsics.j(accountAddressResponseJson, "<this>");
        return new AbstractC3371d.Success(new AccountAddress(accountAddressResponseJson.getAccountAddressId(), 0L, null, accountAddressResponseJson.getStreetAddressLine1(), accountAddressResponseJson.getStreetAddressLine2(), accountAddressResponseJson.getCity(), accountAddressResponseJson.getState(), accountAddressResponseJson.getZip(), null, null, 0L, accountAddressResponseJson.getContactFirstName(), accountAddressResponseJson.getContactLastName(), null, null, accountAddressResponseJson.getIsPrimary(), null, null, null, null, 1009414, null));
    }

    public static final AbstractC3371d k(UnverifiedAddressResponseJson unverifiedAddressResponseJson) {
        Intrinsics.j(unverifiedAddressResponseJson, "<this>");
        return new AbstractC3371d.Select(i(unverifiedAddressResponseJson.getAddresses().getOriginal()), i(unverifiedAddressResponseJson.getAddresses().getSuggested()));
    }

    public static final AndroidPayLoyaltyCardInfoResponse l(AndroidPayLoyaltyCardInfoResponseJson androidPayLoyaltyCardInfoResponseJson) {
        Intrinsics.j(androidPayLoyaltyCardInfoResponseJson, "<this>");
        return new AndroidPayLoyaltyCardInfoResponse(androidPayLoyaltyCardInfoResponseJson.getBarcodeType(), androidPayLoyaltyCardInfoResponseJson.getBarcodeValue(), androidPayLoyaltyCardInfoResponseJson.getAccountID(), androidPayLoyaltyCardInfoResponseJson.getAccountName(), androidPayLoyaltyCardInfoResponseJson.getObjectID(), androidPayLoyaltyCardInfoResponseJson.getClassID(), androidPayLoyaltyCardInfoResponseJson.getIssuerName(), androidPayLoyaltyCardInfoResponseJson.getProgramName());
    }

    public static final AbstractC3375h m(Xj.b bVar) {
        Intrinsics.j(bVar, "<this>");
        return new AbstractC3375h.Conflict(bVar);
    }

    public static final AbstractC3375h n(CreateAccountV2ResponseJson createAccountV2ResponseJson) throws NumberFormatException {
        Intrinsics.j(createAccountV2ResponseJson, "<this>");
        String firstName = createAccountV2ResponseJson.getFirstName();
        String lastName = createAccountV2ResponseJson.getLastName();
        long j10 = Long.parseLong(createAccountV2ResponseJson.getPhone());
        int preferredStoreId = createAccountV2ResponseJson.getPreferredStoreId();
        return new AbstractC3375h.Success(new MeijerAccount(0L, null, createAccountV2ResponseJson.getEmail(), null, null, null, null, null, firstName, lastName, createAccountV2ResponseJson.getZip(), preferredStoreId, null, 0L, j10, null, 0, null, 0L, 0, null, null, null, null, null, null, 0L, 134197499, null));
    }

    public static final CustomerPropertiesResponse o(CustomerPropertiesResponseJson customerPropertiesResponseJson) {
        Intrinsics.j(customerPropertiesResponseJson, "<this>");
        return new CustomerPropertiesResponse(customerPropertiesResponseJson.getHasEmailVerified(), customerPropertiesResponseJson.getIsAdmin(), b(customerPropertiesResponseJson.getSavingsSinceDate(), null, 2, null));
    }

    public static final Preference p(PreferenceResponseJson preferenceResponseJson) {
        Intrinsics.j(preferenceResponseJson, "<this>");
        p pVarX = x(preferenceResponseJson.getPreferenceKey());
        String str = (String) CollectionsKt.u0(preferenceResponseJson.p());
        return new Preference(pVarX, str != null ? A(str) : false, preferenceResponseJson.getName(), preferenceResponseJson.getDescription());
    }

    public static final RegisterNotificationDeviceResponse q(RegisterNotificationDeviceResponseJson registerNotificationDeviceResponseJson) {
        Intrinsics.j(registerNotificationDeviceResponseJson, "<this>");
        return new RegisterNotificationDeviceResponse(registerNotificationDeviceResponseJson.getId(), registerNotificationDeviceResponseJson.getAccountId(), registerNotificationDeviceResponseJson.getSuccess());
    }

    public static final UpdateStoreResponse r(UpdateStoreResponseJson updateStoreResponseJson) {
        Intrinsics.j(updateStoreResponseJson, "<this>");
        return new UpdateStoreResponse(updateStoreResponseJson.getAccountId(), updateStoreResponseJson.getSuccess());
    }

    public static final ValidateEmailAvailability s(ValidateEmailAvailabilityJson validateEmailAvailabilityJson) {
        Intrinsics.j(validateEmailAvailabilityJson, "<this>");
        return new ValidateEmailAvailability(validateEmailAvailabilityJson.getConflictType() == 2 ? EnumC3374g.f6528c : EnumC3374g.f6527b, validateEmailAvailabilityJson.getName());
    }

    public static final ValidatePhoneAvailability t(ValidatePhoneAvailabilityJson validatePhoneAvailabilityJson) {
        Intrinsics.j(validatePhoneAvailabilityJson, "<this>");
        return new ValidatePhoneAvailability(validatePhoneAvailabilityJson.getConflictType() == 2 ? EnumC3374g.f6528c : EnumC3374g.f6527b, validatePhoneAvailabilityJson.getName());
    }

    public static final MeijerAccount u(MeijerAccountJson meijerAccountJson) {
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
        LocalDate localDate = birthDate != null ? (LocalDate) d.b(birthDate, C17590a.f164803a.s(), new Ch.a()) : null;
        String createdDate = meijerAccountJson.getCreatedDate();
        LocalDateTime localDateTime = createdDate != null ? (LocalDateTime) d.b(createdDate, C17590a.f164803a.s(), new j()) : null;
        String updatedDate = meijerAccountJson.getUpdatedDate();
        LocalDateTime localDateTime2 = updatedDate != null ? (LocalDateTime) d.b(updatedDate, C17590a.f164803a.s(), new j()) : null;
        String mPerksPin = meijerAccountJson.getMPerksPin();
        Long loyaltyCardNumber = meijerAccountJson.getLoyaltyCardNumber();
        return new MeijerAccount(accountId, null, email, password, null, null, null, null, firstName, lastName, zip, storeId, accountStatus, mPerksId, mPerksPhone, mPerksPin, mPerksStoreId, mPerkStatus, employeeId, employeeStoreId, employeeStatus, createdBy, updatedBy, localDate, localDateTime, localDateTime2, loyaltyCardNumber != null ? loyaltyCardNumber.longValue() : 0L, 242, null);
    }

    public static final AccountAddressJson v(AccountAddress accountAddress) {
        Intrinsics.j(accountAddress, "<this>");
        return new AccountAddressJson(accountAddress.getId(), accountAddress.getDigitalAccountId(), accountAddress.getName(), accountAddress.getAddressLine1(), accountAddress.getAddressLine2(), accountAddress.getCity(), accountAddress.getState(), accountAddress.getZipCode(), accountAddress.getAddressType().getValue() != 2 ? "ShippingAddress" : "BillingAddress", accountAddress.getAddressType().getValue(), accountAddress.getAddressValidationType().getValidationCode(), accountAddress.getContactId(), accountAddress.getFirstName(), accountAddress.getLastName(), null, accountAddress.getPhoneNumber(), accountAddress.getIsPrimary(), null, accountAddress.getCreatedBy(), null, accountAddress.getUpdatedBy(), 671744, null);
    }

    public static final PreferenceRequestJson w(Preference preference) {
        Intrinsics.j(preference, "<this>");
        return new PreferenceRequestJson(y(preference.getPreferenceKey()), z(preference.getIsEnabled(), preference.getPreferenceKey()));
    }

    public static final p x(String str) {
        Intrinsics.j(str, "<this>");
        p pVar = p.f6558b;
        if (!Intrinsics.e(str, pVar.getKey())) {
            p pVar2 = p.f6559c;
            if (Intrinsics.e(str, pVar2.getKey())) {
                return pVar2;
            }
            p pVar3 = p.f6560d;
            if (Intrinsics.e(str, pVar3.getKey())) {
                return pVar3;
            }
            p pVar4 = p.f6561e;
            if (Intrinsics.e(str, pVar4.getKey())) {
                return pVar4;
            }
            p pVar5 = p.f6562f;
            if (Intrinsics.e(str, pVar5.getKey())) {
                return pVar5;
            }
            p pVar6 = p.f6563g;
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
                return p.f6558b.getKey();
            case 2:
                return p.f6559c.getKey();
            case 3:
                return p.f6560d.getKey();
            case 4:
                return p.f6561e.getKey();
            case 5:
                return p.f6562f.getKey();
            case 6:
                return p.f6563g.getKey();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final List<String> z(boolean z10, p preferenceKey) {
        Intrinsics.j(preferenceKey, "preferenceKey");
        int i10 = a.$EnumSwitchMapping$0[preferenceKey.ordinal()];
        if (i10 == 1) {
            return z10 ? CollectionsKt.e(s.f6575b.getValue()) : CollectionsKt.m();
        }
        if (i10 == 2) {
            return z10 ? CollectionsKt.e(s.f6575b.getValue()) : CollectionsKt.m();
        }
        if (i10 != 3) {
            return CollectionsKt.e((z10 ? s.f6577d : s.f6578e).getValue());
        }
        return z10 ? CollectionsKt.e(s.f6576c.getValue()) : CollectionsKt.m();
    }
}
