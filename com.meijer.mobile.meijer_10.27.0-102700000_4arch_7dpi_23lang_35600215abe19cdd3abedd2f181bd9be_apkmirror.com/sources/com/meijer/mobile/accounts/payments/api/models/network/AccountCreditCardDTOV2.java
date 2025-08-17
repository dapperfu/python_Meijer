package com.meijer.mobile.accounts.payments.api.models.network;

import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.accounts.payments.api.models.network.AccountCreditCardDTOV2;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.local.PreferencesHelper;
import j$.time.LocalDateTime;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import th.j;
import uh.EnumC17263e;
import vk.C17590a;
import vk.d;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0001^B\u0097\u0002\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\b\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\b\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\b\b\u0003\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0003\u0010\u0014\u001a\u00020\u0012\u0012\b\b\u0003\u0010\u0015\u001a\u00020\u0012\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\b\b\u0001\u0010\u0017\u001a\u00020\b\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\b\b\u0001\u0010\u0019\u001a\u00020\b\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000b¢\u0006\u0004\b \u0010!J \u0002\u0010\"\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\u000e\u001a\u00020\b2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\u0013\u001a\u00020\u00122\b\b\u0003\u0010\u0014\u001a\u00020\u00122\b\b\u0003\u0010\u0015\u001a\u00020\u00122\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\u0017\u001a\u00020\b2\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\u0019\u001a\u00020\b2\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00122\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010,\u001a\u0004\b3\u0010.R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010,\u001a\u0004\b5\u0010.R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010%R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b9\u00107\u001a\u0004\b:\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b8\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b<\u00107\u001a\u0004\b>\u0010%R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b>\u00107\u001a\u0004\b?\u0010%R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b3\u00107\u001a\u0004\b@\u0010%R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bA\u00107\u001a\u0004\b9\u0010%R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bB\u00107\u001a\u0004\b4\u0010%R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u0014\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b@\u0010D\u001a\u0004\bG\u0010FR\u0017\u0010\u0015\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b0\u0010D\u001a\u0004\bH\u0010FR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b?\u00107\u001a\u0004\bI\u0010%R\"\u0010\u0017\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u00107\u001a\u0004\bA\u0010%\"\u0004\bJ\u0010KR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\bB\u0010%R\u0017\u0010\u0019\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bG\u00107\u001a\u0004\bL\u0010%R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bE\u00107\u001a\u0004\bM\u0010%R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bI\u00107\u001a\u0004\bN\u0010%R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b5\u00107\u001a\u0004\b6\u0010%R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0017\u0010\u001f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bL\u0010R\u001a\u0004\bS\u0010'R\u001b\u0010X\u001a\u00020T8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bM\u0010U\u001a\u0004\bV\u0010WR\u001b\u0010Z\u001a\u00020T8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bH\u0010U\u001a\u0004\bY\u0010WR\u0011\u0010]\u001a\u00020[8F¢\u0006\u0006\u001a\u0004\bC\u0010\\¨\u0006_"}, d2 = {"Lcom/meijer/mobile/accounts/payments/api/models/network/AccountCreditCardDTOV2;", "", "", PreferencesHelper.PREF_ID, "digitalAccountId", "accountAddressId", "clientId", "profileId", "", "cardName", "lastFourDigits", "", "cardType", "cardTypeName", "expirationDate", "description", "cardGuid", "cardAuthToken", "", "mperksFlag", "linkToMPerks", "isPrimary", "phoneNumber", "createDateString", "createdBy", "updateDateString", "updatedBy", "termsOfServiceAgreementDate", "cardCcTokenType", "Lcom/meijer/mobile/accounts/payments/api/models/network/AccountCreditCardDTOV2$LinkState;", "linkState", "linkStateErrorMessageResourceId", "<init>", "(JJJJJLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/accounts/payments/api/models/network/AccountCreditCardDTOV2$LinkState;I)V", "copy", "(JJJJJLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/accounts/payments/api/models/network/AccountCreditCardDTOV2$LinkState;I)Lcom/meijer/mobile/accounts/payments/api/models/network/AccountCreditCardDTOV2;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "r", "()J", "b", "p", "c", "d", "k", "e", "w", "f", "Ljava/lang/String;", "h", "g", "s", "Ljava/lang/Integer;", "i", "()Ljava/lang/Integer;", "j", "q", "o", "l", "m", "n", "Z", "u", "()Z", "t", "A", "v", "setCreateDateString", "(Ljava/lang/String;)V", "y", "z", "x", "Lcom/meijer/mobile/accounts/payments/api/models/network/AccountCreditCardDTOV2$LinkState;", "getLinkState", "()Lcom/meijer/mobile/accounts/payments/api/models/network/AccountCreditCardDTOV2$LinkState;", "I", "getLinkStateErrorMessageResourceId", "j$/time/LocalDateTime", "Lkotlin/Lazy;", "getCreateDate", "()Lj$/time/LocalDateTime;", "createDate", "getUpdateDate", "updateDate", "Luh/e;", "()Luh/e;", "creditCardType", "LinkState", "payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AccountCreditCardDTOV2 {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final Lazy updateDate;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long digitalAccountId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long accountAddressId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final long clientId;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final long profileId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardName;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lastFourDigits;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer cardType;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardTypeName;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String expirationDate;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardGuid;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardAuthToken;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean mperksFlag;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean linkToMPerks;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPrimary;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phoneNumber;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private String createDateString;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final String createdBy;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final String updateDateString;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final String updatedBy;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final String termsOfServiceAgreementDate;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardCcTokenType;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private final transient LinkState linkState;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    private final transient int linkStateErrorMessageResourceId;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final Lazy createDate;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @i(generateAdapter = false)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/meijer/mobile/accounts/payments/api/models/network/AccountCreditCardDTOV2$LinkState;", "", "<init>", "(Ljava/lang/String;I)V", "LINKED_TO_ANOTHER_ACCOUNT", "LINKED", "UNLINKED", "payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LinkState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ LinkState[] $VALUES;
        public static final LinkState LINKED_TO_ANOTHER_ACCOUNT = new LinkState("LINKED_TO_ANOTHER_ACCOUNT", 0);
        public static final LinkState LINKED = new LinkState("LINKED", 1);
        public static final LinkState UNLINKED = new LinkState("UNLINKED", 2);

        private static final /* synthetic */ LinkState[] a() {
            return new LinkState[]{LINKED_TO_ANOTHER_ACCOUNT, LINKED, UNLINKED};
        }

        static {
            LinkState[] linkStateArrA = a();
            $VALUES = linkStateArrA;
            $ENTRIES = EnumEntriesKt.a(linkStateArrA);
        }

        public static LinkState valueOf(String str) {
            return (LinkState) Enum.valueOf(LinkState.class, str);
        }

        public static LinkState[] values() {
            return (LinkState[]) $VALUES.clone();
        }

        private LinkState(String str, int i10) {
        }
    }

    public AccountCreditCardDTOV2(@g(name = "cardId") long j10, @g(name = "accountId") long j11, @g(name = "accountAddressId") long j12, @g(name = "clientId") long j13, @g(name = "profileId") long j14, @g(name = "cardName") String cardName, @g(name = "cardLastFour") String lastFourDigits, @g(name = "cardType") Integer num, @g(name = "cardTypeName") String str, @g(name = "cardExpirationDate") String expirationDate, @g(name = "CardDescription") String str2, @g(name = "cardGuid") String str3, @g(name = "cardCcToken") String str4, @g(name = "MperksFlag") boolean z10, @g(name = "linkToMPerks") boolean z11, @g(name = "isPreferred") boolean z12, @g(name = "phoneNumber") String str5, @g(name = "createDate") String createDateString, @g(name = "createdBy") String str6, @g(name = "updatedDate") String updateDateString, @g(name = "updatedBy") String str7, @g(name = "cardTokenStoredOnFileAckDate") String str8, @g(name = "cardCcTokenType") String str9, LinkState linkState, int i10) {
        Intrinsics.j(cardName, "cardName");
        Intrinsics.j(lastFourDigits, "lastFourDigits");
        Intrinsics.j(expirationDate, "expirationDate");
        Intrinsics.j(createDateString, "createDateString");
        Intrinsics.j(updateDateString, "updateDateString");
        this.id = j10;
        this.digitalAccountId = j11;
        this.accountAddressId = j12;
        this.clientId = j13;
        this.profileId = j14;
        this.cardName = cardName;
        this.lastFourDigits = lastFourDigits;
        this.cardType = num;
        this.cardTypeName = str;
        this.expirationDate = expirationDate;
        this.description = str2;
        this.cardGuid = str3;
        this.cardAuthToken = str4;
        this.mperksFlag = z10;
        this.linkToMPerks = z11;
        this.isPrimary = z12;
        this.phoneNumber = str5;
        this.createDateString = createDateString;
        this.createdBy = str6;
        this.updateDateString = updateDateString;
        this.updatedBy = str7;
        this.termsOfServiceAgreementDate = str8;
        this.cardCcTokenType = str9;
        this.linkState = linkState;
        this.linkStateErrorMessageResourceId = i10;
        this.createDate = LazyKt.b(new Function0() { // from class: vh.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountCreditCardDTOV2.c(this.f164715a);
            }
        });
        this.updateDate = LazyKt.b(new Function0() { // from class: vh.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountCreditCardDTOV2.B(this.f164716a);
            }
        });
    }

    public final AccountCreditCardDTOV2 copy(@g(name = "cardId") long id2, @g(name = "accountId") long digitalAccountId, @g(name = "accountAddressId") long accountAddressId, @g(name = "clientId") long clientId, @g(name = "profileId") long profileId, @g(name = "cardName") String cardName, @g(name = "cardLastFour") String lastFourDigits, @g(name = "cardType") Integer cardType, @g(name = "cardTypeName") String cardTypeName, @g(name = "cardExpirationDate") String expirationDate, @g(name = "CardDescription") String description, @g(name = "cardGuid") String cardGuid, @g(name = "cardCcToken") String cardAuthToken, @g(name = "MperksFlag") boolean mperksFlag, @g(name = "linkToMPerks") boolean linkToMPerks, @g(name = "isPreferred") boolean isPrimary, @g(name = "phoneNumber") String phoneNumber, @g(name = "createDate") String createDateString, @g(name = "createdBy") String createdBy, @g(name = "updatedDate") String updateDateString, @g(name = "updatedBy") String updatedBy, @g(name = "cardTokenStoredOnFileAckDate") String termsOfServiceAgreementDate, @g(name = "cardCcTokenType") String cardCcTokenType, LinkState linkState, int linkStateErrorMessageResourceId) {
        Intrinsics.j(cardName, "cardName");
        Intrinsics.j(lastFourDigits, "lastFourDigits");
        Intrinsics.j(expirationDate, "expirationDate");
        Intrinsics.j(createDateString, "createDateString");
        Intrinsics.j(updateDateString, "updateDateString");
        return new AccountCreditCardDTOV2(id2, digitalAccountId, accountAddressId, clientId, profileId, cardName, lastFourDigits, cardType, cardTypeName, expirationDate, description, cardGuid, cardAuthToken, mperksFlag, linkToMPerks, isPrimary, phoneNumber, createDateString, createdBy, updateDateString, updatedBy, termsOfServiceAgreementDate, cardCcTokenType, linkState, linkStateErrorMessageResourceId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountCreditCardDTOV2)) {
            return false;
        }
        AccountCreditCardDTOV2 accountCreditCardDTOV2 = (AccountCreditCardDTOV2) other;
        return this.id == accountCreditCardDTOV2.id && this.digitalAccountId == accountCreditCardDTOV2.digitalAccountId && this.accountAddressId == accountCreditCardDTOV2.accountAddressId && this.clientId == accountCreditCardDTOV2.clientId && this.profileId == accountCreditCardDTOV2.profileId && Intrinsics.e(this.cardName, accountCreditCardDTOV2.cardName) && Intrinsics.e(this.lastFourDigits, accountCreditCardDTOV2.lastFourDigits) && Intrinsics.e(this.cardType, accountCreditCardDTOV2.cardType) && Intrinsics.e(this.cardTypeName, accountCreditCardDTOV2.cardTypeName) && Intrinsics.e(this.expirationDate, accountCreditCardDTOV2.expirationDate) && Intrinsics.e(this.description, accountCreditCardDTOV2.description) && Intrinsics.e(this.cardGuid, accountCreditCardDTOV2.cardGuid) && Intrinsics.e(this.cardAuthToken, accountCreditCardDTOV2.cardAuthToken) && this.mperksFlag == accountCreditCardDTOV2.mperksFlag && this.linkToMPerks == accountCreditCardDTOV2.linkToMPerks && this.isPrimary == accountCreditCardDTOV2.isPrimary && Intrinsics.e(this.phoneNumber, accountCreditCardDTOV2.phoneNumber) && Intrinsics.e(this.createDateString, accountCreditCardDTOV2.createDateString) && Intrinsics.e(this.createdBy, accountCreditCardDTOV2.createdBy) && Intrinsics.e(this.updateDateString, accountCreditCardDTOV2.updateDateString) && Intrinsics.e(this.updatedBy, accountCreditCardDTOV2.updatedBy) && Intrinsics.e(this.termsOfServiceAgreementDate, accountCreditCardDTOV2.termsOfServiceAgreementDate) && Intrinsics.e(this.cardCcTokenType, accountCreditCardDTOV2.cardCcTokenType) && this.linkState == accountCreditCardDTOV2.linkState && this.linkStateErrorMessageResourceId == accountCreditCardDTOV2.linkStateErrorMessageResourceId;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((Long.hashCode(this.id) * 31) + Long.hashCode(this.digitalAccountId)) * 31) + Long.hashCode(this.accountAddressId)) * 31) + Long.hashCode(this.clientId)) * 31) + Long.hashCode(this.profileId)) * 31) + this.cardName.hashCode()) * 31) + this.lastFourDigits.hashCode()) * 31;
        Integer num = this.cardType;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.cardTypeName;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.expirationDate.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cardGuid;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cardAuthToken;
        int iHashCode6 = (((((((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31) + Boolean.hashCode(this.mperksFlag)) * 31) + Boolean.hashCode(this.linkToMPerks)) * 31) + Boolean.hashCode(this.isPrimary)) * 31;
        String str5 = this.phoneNumber;
        int iHashCode7 = (((iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.createDateString.hashCode()) * 31;
        String str6 = this.createdBy;
        int iHashCode8 = (((iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.updateDateString.hashCode()) * 31;
        String str7 = this.updatedBy;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.termsOfServiceAgreementDate;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.cardCcTokenType;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        LinkState linkState = this.linkState;
        return ((iHashCode11 + (linkState != null ? linkState.hashCode() : 0)) * 31) + Integer.hashCode(this.linkStateErrorMessageResourceId);
    }

    public String toString() {
        return "AccountCreditCardDTOV2(id=" + this.id + ", digitalAccountId=" + this.digitalAccountId + ", accountAddressId=" + this.accountAddressId + ", clientId=" + this.clientId + ", profileId=" + this.profileId + ", cardName=" + this.cardName + ", lastFourDigits=" + this.lastFourDigits + ", cardType=" + this.cardType + ", cardTypeName=" + this.cardTypeName + ", expirationDate=" + this.expirationDate + ", description=" + this.description + ", cardGuid=" + this.cardGuid + ", cardAuthToken=" + this.cardAuthToken + ", mperksFlag=" + this.mperksFlag + ", linkToMPerks=" + this.linkToMPerks + ", isPrimary=" + this.isPrimary + ", phoneNumber=" + this.phoneNumber + ", createDateString=" + this.createDateString + ", createdBy=" + this.createdBy + ", updateDateString=" + this.updateDateString + ", updatedBy=" + this.updatedBy + ", termsOfServiceAgreementDate=" + this.termsOfServiceAgreementDate + ", cardCcTokenType=" + this.cardCcTokenType + ", linkState=" + this.linkState + ", linkStateErrorMessageResourceId=" + this.linkStateErrorMessageResourceId + ')';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocalDateTime B(AccountCreditCardDTOV2 accountCreditCardDTOV2) {
        return (LocalDateTime) d.a(accountCreditCardDTOV2.updateDateString, C17590a.f164803a.s(), new j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocalDateTime c(AccountCreditCardDTOV2 accountCreditCardDTOV2) {
        return (LocalDateTime) d.a(accountCreditCardDTOV2.createDateString, C17590a.f164803a.s(), new j());
    }

    /* renamed from: A, reason: from getter */
    public final boolean getIsPrimary() {
        return this.isPrimary;
    }

    /* renamed from: d, reason: from getter */
    public final long getAccountAddressId() {
        return this.accountAddressId;
    }

    /* renamed from: e, reason: from getter */
    public final String getCardAuthToken() {
        return this.cardAuthToken;
    }

    /* renamed from: f, reason: from getter */
    public final String getCardCcTokenType() {
        return this.cardCcTokenType;
    }

    /* renamed from: g, reason: from getter */
    public final String getCardGuid() {
        return this.cardGuid;
    }

    /* renamed from: h, reason: from getter */
    public final String getCardName() {
        return this.cardName;
    }

    /* renamed from: i, reason: from getter */
    public final Integer getCardType() {
        return this.cardType;
    }

    /* renamed from: j, reason: from getter */
    public final String getCardTypeName() {
        return this.cardTypeName;
    }

    /* renamed from: k, reason: from getter */
    public final long getClientId() {
        return this.clientId;
    }

    /* renamed from: l, reason: from getter */
    public final String getCreateDateString() {
        return this.createDateString;
    }

    /* renamed from: m, reason: from getter */
    public final String getCreatedBy() {
        return this.createdBy;
    }

    public final EnumC17263e n() {
        Integer num = this.cardType;
        return (num != null && num.intValue() == 1) ? EnumC17263e.f162980c : (num != null && num.intValue() == 2) ? EnumC17263e.f162981d : (num != null && num.intValue() == 3) ? EnumC17263e.f162982e : (num != null && num.intValue() == 4) ? EnumC17263e.f162983f : (num != null && num.intValue() == 5) ? EnumC17263e.f162984g : (num != null && num.intValue() == 6) ? EnumC17263e.f162985h : (num != null && num.intValue() == 7) ? EnumC17263e.f162986i : EnumC17263e.f162987j;
    }

    /* renamed from: o, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: p, reason: from getter */
    public final long getDigitalAccountId() {
        return this.digitalAccountId;
    }

    /* renamed from: q, reason: from getter */
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    /* renamed from: r, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: s, reason: from getter */
    public final String getLastFourDigits() {
        return this.lastFourDigits;
    }

    /* renamed from: t, reason: from getter */
    public final boolean getLinkToMPerks() {
        return this.linkToMPerks;
    }

    /* renamed from: u, reason: from getter */
    public final boolean getMperksFlag() {
        return this.mperksFlag;
    }

    /* renamed from: v, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: w, reason: from getter */
    public final long getProfileId() {
        return this.profileId;
    }

    /* renamed from: x, reason: from getter */
    public final String getTermsOfServiceAgreementDate() {
        return this.termsOfServiceAgreementDate;
    }

    /* renamed from: y, reason: from getter */
    public final String getUpdateDateString() {
        return this.updateDateString;
    }

    /* renamed from: z, reason: from getter */
    public final String getUpdatedBy() {
        return this.updatedBy;
    }

    public /* synthetic */ AccountCreditCardDTOV2(long j10, long j11, long j12, long j13, long j14, String str, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, boolean z10, boolean z11, boolean z12, String str8, String str9, String str10, String str11, String str12, String str13, String str14, LinkState linkState, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0L : j10, j11, (i11 & 4) != 0 ? 0L : j12, (i11 & 8) != 0 ? 0L : j13, (i11 & 16) != 0 ? 0L : j14, str, str2, (i11 & 128) != 0 ? null : num, (i11 & 256) != 0 ? null : str3, str4, (i11 & 1024) != 0 ? null : str5, (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? null : str6, (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str7, (i11 & 8192) != 0 ? false : z10, (i11 & 16384) != 0 ? false : z11, (32768 & i11) != 0 ? false : z12, (65536 & i11) != 0 ? null : str8, str9, (262144 & i11) != 0 ? null : str10, str11, (1048576 & i11) != 0 ? null : str12, (2097152 & i11) != 0 ? null : str13, (4194304 & i11) != 0 ? null : str14, (8388608 & i11) != 0 ? null : linkState, (i11 & 16777216) != 0 ? 0 : i10);
    }
}
