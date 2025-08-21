package com.meijer.mobile.accounts.payments.api.models.network;

import androidx.recyclerview.widget.RecyclerView;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.local.PreferencesHelper;
import j$.time.LocalDateTime;
import j$.time.format.DateTimeFormatter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import vh.AccountCreditCard;
import vh.EnumC17675c;
import wk.C17898a;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\bU\b\u0081\b\u0018\u0000 52\u00020\u0001:\u00014B\u0089\u0003\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\u0012\u001a\u00020\t\u0012\b\b\u0003\u0010\u0013\u001a\u00020\t\u0012\b\b\u0003\u0010\u0014\u001a\u00020\t\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u0005\u0012\b\b\u0001\u0010 \u001a\u00020\u0005\u0012\b\b\u0001\u0010!\u001a\u00020\u0005\u0012\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010(\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b)\u0010*J\u0092\u0003\u0010+\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\f\u001a\u00020\u000b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u000e\u001a\u00020\u00052\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0003\u0010\u0013\u001a\u00020\t2\b\b\u0003\u0010\u0014\u001a\u00020\t2\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0016\u001a\u00020\u00052\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0018\u001a\u00020\u00052\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u001b\u001a\u00020\u00022\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u001d\u001a\u00020\u00052\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u001f\u001a\u00020\u00052\b\b\u0003\u0010 \u001a\u00020\u00052\b\b\u0003\u0010!\u001a\u00020\u00052\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00102\u001a\u00020\t2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u00105\u001a\u0004\b9\u00107R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010.R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b=\u0010;\u001a\u0004\b>\u0010.R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b?\u0010;\u001a\u0004\b@\u0010.R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u00100R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bH\u0010;\u001a\u0004\bI\u0010.R\u0017\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bJ\u0010;\u001a\u0004\bK\u0010.R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bL\u0010;\u001a\u0004\bM\u0010.R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b<\u0010;\u001a\u0004\bL\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bG\u0010;\u001a\u0004\bH\u0010.R\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bI\u0010B\u001a\u0004\bN\u0010DR\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bO\u0010B\u001a\u0004\bP\u0010DR\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bQ\u0010B\u001a\u0004\bF\u0010DR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bR\u0010;\u001a\u0004\bS\u0010.R\"\u0010\u0016\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010;\u001a\u0004\bR\u0010.\"\u0004\bU\u0010VR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bM\u0010;\u001a\u0004\bT\u0010.R\u0017\u0010\u0018\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b9\u0010;\u001a\u0004\bW\u0010.R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bK\u0010;\u001a\u0004\bX\u0010.R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b6\u0010;\u001a\u0004\bY\u0010.R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u00105\u001a\u0004\b4\u00107R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bP\u0010;\u001a\u0004\b=\u0010.R\u0017\u0010\u001d\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bN\u0010;\u001a\u0004\b8\u0010.R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bZ\u0010;\u001a\u0004\b:\u0010.R\u0017\u0010\u001f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b[\u0010;\u001a\u0004\bQ\u0010.R\u0017\u0010 \u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bS\u0010;\u001a\u0004\b\\\u0010.R\u0017\u0010!\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bC\u0010;\u001a\u0004\b]\u0010.R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b@\u0010;\u001a\u0004\bE\u0010.R\u0019\u0010#\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\\\u0010^\u001a\u0004\bA\u0010_R\u0019\u0010$\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bY\u0010;\u001a\u0004\bZ\u0010.R\u0019\u0010%\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bW\u0010;\u001a\u0004\b[\u0010.R\u0019\u0010&\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bX\u0010;\u001a\u0004\b?\u0010.R\u0019\u0010'\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b]\u0010;\u001a\u0004\bO\u0010.R\u0019\u0010(\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bF\u0010;\u001a\u0004\bJ\u0010.¨\u0006`"}, d2 = {"Lcom/meijer/mobile/accounts/payments/api/models/network/PaymentUpdateDTO;", "", "", PreferencesHelper.PREF_ID, "digitalAccountId", "", "cardName", "lastFourDigits", "securityCode", "", "saveCardEnabled", "", "cardType", "cardTypeName", "expirationDate", "description", "cardGuid", "cardAuthToken", "mperksFlag", "linkToMPerks", "isPrimary", "phoneNumber", "createDate", "createdBy", "updateDate", "updatedBy", "termsOfServiceAgreementDate", "accountAddressId", "addressName", "addressLine1", "addressLine2", "city", "state", "zipCode", "addressTypeString", "addressTypeId", "nameFirst", "nameLast", "addressNickname", "cartCode", "cardCcTokenType", "<init>", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/accounts/payments/api/models/network/PaymentUpdateDTO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "u", "()J", "b", "s", "c", "Ljava/lang/String;", "k", "d", "v", "e", "C", "f", "Z", "B", "()Z", "g", "I", "l", "h", "m", "i", "t", "j", "r", "x", "n", "w", "o", "p", "A", "q", "setCreateDate", "(Ljava/lang/String;)V", "F", "G", "E", "y", "z", "D", "H", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PaymentUpdateDTO {

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: A, reason: collision with root package name and from kotlin metadata and from toString */
    private final String state;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata and from toString */
    private final String zipCode;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressTypeString;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer addressTypeId;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata and from toString */
    private final String nameFirst;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata and from toString */
    private final String nameLast;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressNickname;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cartCode;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardCcTokenType;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long digitalAccountId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lastFourDigits;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String securityCode;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean saveCardEnabled;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int cardType;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardTypeName;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String expirationDate;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardGuid;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardAuthToken;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean mperksFlag;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean linkToMPerks;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPrimary;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phoneNumber;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private String createDate;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final String createdBy;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final String updateDate;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final String updatedBy;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final String termsOfServiceAgreementDate;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final long accountAddressId;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressName;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressLine1;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressLine2;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
    private final String city;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/accounts/payments/api/models/network/PaymentUpdateDTO$a;", "", "<init>", "()V", "Lvh/a;", "creditCard", "", "saveCardEnabled", "j$/time/LocalDateTime", "currentTime", "", "cartCode", "Lcom/meijer/mobile/accounts/payments/api/models/network/PaymentUpdateDTO;", "a", "(Lvh/a;ZLj$/time/LocalDateTime;Ljava/lang/String;)Lcom/meijer/mobile/accounts/payments/api/models/network/PaymentUpdateDTO;", "payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.accounts.payments.api.models.network.PaymentUpdateDTO$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PaymentUpdateDTO a(AccountCreditCard creditCard, boolean saveCardEnabled, LocalDateTime currentTime, String cartCode) {
            Intrinsics.j(creditCard, "creditCard");
            Intrinsics.j(currentTime, "currentTime");
            long cardId = creditCard.getCardId();
            String cardCVV = creditCard.getCardCVV();
            String str = !StringsKt.s0(cardCVV) ? cardCVV : null;
            long digitalAccountId = creditCard.getDigitalAccountId();
            long addressId = creditCard.getAddressId();
            String cardName = creditCard.getCardName();
            String cardLastFourDigits = creditCard.getCardLastFourDigits();
            int value = creditCard.getCardType().getValue();
            String cardTypeName = creditCard.getCardTypeName();
            String str2 = creditCard.getExpirationDate().format(C17898a.NUMERIC_MONTH_YEAR_FULL);
            Intrinsics.i(str2, "format(...)");
            String cardDescription = creditCard.getCardDescription();
            String cardGuid = creditCard.getCardGuid();
            String cardAuthToken = creditCard.getCardAuthToken();
            boolean mperksFlag = creditCard.getMperksFlag();
            boolean linkToMPerks = creditCard.getLinkToMPerks();
            boolean isPrimary = creditCard.getIsPrimary();
            String phoneNumber = creditCard.getPhoneNumber();
            LocalDateTime cardCreateDate = creditCard.getCardCreateDate();
            LocalDateTime localDateTime = cardCreateDate == null ? currentTime : cardCreateDate;
            DateTimeFormatter dateTimeFormatter = C17898a.ISO_LOCAL_DATE_TIME;
            String str3 = localDateTime.format(dateTimeFormatter);
            Intrinsics.i(str3, "format(...)");
            String strValueOf = String.valueOf(creditCard.getDigitalAccountId());
            String str4 = currentTime.format(dateTimeFormatter);
            Intrinsics.i(str4, "format(...)");
            String strValueOf2 = String.valueOf(creditCard.getDigitalAccountId());
            LocalDateTime termsOfServiceAgreementDate = creditCard.getTermsOfServiceAgreementDate();
            String str5 = termsOfServiceAgreementDate != null ? termsOfServiceAgreementDate.format(dateTimeFormatter) : null;
            String addressName = creditCard.getAddressName();
            String addressLine1 = creditCard.getAddressLine1();
            String addressLine2 = creditCard.getAddressLine2();
            String addressCity = creditCard.getAddressCity();
            String addressState = creditCard.getAddressState();
            String addressZipCode = creditCard.getAddressZipCode();
            EnumC17675c enumC17675c = EnumC17675c.f165865c;
            return new PaymentUpdateDTO(cardId, digitalAccountId, cardName, cardLastFourDigits, str, saveCardEnabled, value, cardTypeName, str2, cardDescription, cardGuid, cardAuthToken, mperksFlag, linkToMPerks, isPrimary, phoneNumber, str3, strValueOf, str4, strValueOf2, str5, addressId, addressName, addressLine1, addressLine2, addressCity, addressState, addressZipCode, enumC17675c.getTypeName(), Integer.valueOf(enumC17675c.getTypeId()), creditCard.getAddressContactFirstName(), creditCard.getAddressContactLastName(), creditCard.getAddressContactNickname(), cartCode, creditCard.getProviderType());
        }
    }

    public PaymentUpdateDTO(@g(name = "cardId") long j10, @g(name = "accountId") long j11, @g(name = "cardName") String cardName, @g(name = "cardLastFour") String lastFourDigits, @g(name = "securityCode") String str, @g(name = "saveCardEnabled") boolean z10, @g(name = "cardType") int i10, @g(name = "cardTypeName") String str2, @g(name = "cardExpirationDate") String expirationDate, @g(name = "CardDescription") String str3, @g(name = "cardGuid") String str4, @g(name = "cardCcToken") String str5, @g(name = "MperksFlag") boolean z11, @g(name = "linkToMPerks") boolean z12, @g(name = "isPreferred") boolean z13, @g(name = "phoneNumber") String str6, @g(name = "createDate") String createDate, @g(name = "createdBy") String str7, @g(name = "updateDate") String updateDate, @g(name = "updatedBy") String str8, @g(name = "cardTokenStoredOnFileAckDate") String str9, @g(name = "accountAddressId") long j12, @g(name = "addressName") String str10, @g(name = "addressLine1") String addressLine1, @g(name = "addressLine2") String str11, @g(name = "city") String city, @g(name = "state") String state, @g(name = "zip") String zipCode, @g(name = "addressType") String str12, @g(name = "addressTypeId") Integer num, @g(name = "addressContactFirstName") String str13, @g(name = "addressContactLastName") String str14, @g(name = "addressContactNickName") String str15, @g(name = "cartCode") String str16, @g(name = "cardCcTokenType") String str17) {
        Intrinsics.j(cardName, "cardName");
        Intrinsics.j(lastFourDigits, "lastFourDigits");
        Intrinsics.j(expirationDate, "expirationDate");
        Intrinsics.j(createDate, "createDate");
        Intrinsics.j(updateDate, "updateDate");
        Intrinsics.j(addressLine1, "addressLine1");
        Intrinsics.j(city, "city");
        Intrinsics.j(state, "state");
        Intrinsics.j(zipCode, "zipCode");
        this.id = j10;
        this.digitalAccountId = j11;
        this.cardName = cardName;
        this.lastFourDigits = lastFourDigits;
        this.securityCode = str;
        this.saveCardEnabled = z10;
        this.cardType = i10;
        this.cardTypeName = str2;
        this.expirationDate = expirationDate;
        this.description = str3;
        this.cardGuid = str4;
        this.cardAuthToken = str5;
        this.mperksFlag = z11;
        this.linkToMPerks = z12;
        this.isPrimary = z13;
        this.phoneNumber = str6;
        this.createDate = createDate;
        this.createdBy = str7;
        this.updateDate = updateDate;
        this.updatedBy = str8;
        this.termsOfServiceAgreementDate = str9;
        this.accountAddressId = j12;
        this.addressName = str10;
        this.addressLine1 = addressLine1;
        this.addressLine2 = str11;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.addressTypeString = str12;
        this.addressTypeId = num;
        this.nameFirst = str13;
        this.nameLast = str14;
        this.addressNickname = str15;
        this.cartCode = str16;
        this.cardCcTokenType = str17;
    }

    public final PaymentUpdateDTO copy(@g(name = "cardId") long id2, @g(name = "accountId") long digitalAccountId, @g(name = "cardName") String cardName, @g(name = "cardLastFour") String lastFourDigits, @g(name = "securityCode") String securityCode, @g(name = "saveCardEnabled") boolean saveCardEnabled, @g(name = "cardType") int cardType, @g(name = "cardTypeName") String cardTypeName, @g(name = "cardExpirationDate") String expirationDate, @g(name = "CardDescription") String description, @g(name = "cardGuid") String cardGuid, @g(name = "cardCcToken") String cardAuthToken, @g(name = "MperksFlag") boolean mperksFlag, @g(name = "linkToMPerks") boolean linkToMPerks, @g(name = "isPreferred") boolean isPrimary, @g(name = "phoneNumber") String phoneNumber, @g(name = "createDate") String createDate, @g(name = "createdBy") String createdBy, @g(name = "updateDate") String updateDate, @g(name = "updatedBy") String updatedBy, @g(name = "cardTokenStoredOnFileAckDate") String termsOfServiceAgreementDate, @g(name = "accountAddressId") long accountAddressId, @g(name = "addressName") String addressName, @g(name = "addressLine1") String addressLine1, @g(name = "addressLine2") String addressLine2, @g(name = "city") String city, @g(name = "state") String state, @g(name = "zip") String zipCode, @g(name = "addressType") String addressTypeString, @g(name = "addressTypeId") Integer addressTypeId, @g(name = "addressContactFirstName") String nameFirst, @g(name = "addressContactLastName") String nameLast, @g(name = "addressContactNickName") String addressNickname, @g(name = "cartCode") String cartCode, @g(name = "cardCcTokenType") String cardCcTokenType) {
        Intrinsics.j(cardName, "cardName");
        Intrinsics.j(lastFourDigits, "lastFourDigits");
        Intrinsics.j(expirationDate, "expirationDate");
        Intrinsics.j(createDate, "createDate");
        Intrinsics.j(updateDate, "updateDate");
        Intrinsics.j(addressLine1, "addressLine1");
        Intrinsics.j(city, "city");
        Intrinsics.j(state, "state");
        Intrinsics.j(zipCode, "zipCode");
        return new PaymentUpdateDTO(id2, digitalAccountId, cardName, lastFourDigits, securityCode, saveCardEnabled, cardType, cardTypeName, expirationDate, description, cardGuid, cardAuthToken, mperksFlag, linkToMPerks, isPrimary, phoneNumber, createDate, createdBy, updateDate, updatedBy, termsOfServiceAgreementDate, accountAddressId, addressName, addressLine1, addressLine2, city, state, zipCode, addressTypeString, addressTypeId, nameFirst, nameLast, addressNickname, cartCode, cardCcTokenType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentUpdateDTO)) {
            return false;
        }
        PaymentUpdateDTO paymentUpdateDTO = (PaymentUpdateDTO) other;
        return this.id == paymentUpdateDTO.id && this.digitalAccountId == paymentUpdateDTO.digitalAccountId && Intrinsics.e(this.cardName, paymentUpdateDTO.cardName) && Intrinsics.e(this.lastFourDigits, paymentUpdateDTO.lastFourDigits) && Intrinsics.e(this.securityCode, paymentUpdateDTO.securityCode) && this.saveCardEnabled == paymentUpdateDTO.saveCardEnabled && this.cardType == paymentUpdateDTO.cardType && Intrinsics.e(this.cardTypeName, paymentUpdateDTO.cardTypeName) && Intrinsics.e(this.expirationDate, paymentUpdateDTO.expirationDate) && Intrinsics.e(this.description, paymentUpdateDTO.description) && Intrinsics.e(this.cardGuid, paymentUpdateDTO.cardGuid) && Intrinsics.e(this.cardAuthToken, paymentUpdateDTO.cardAuthToken) && this.mperksFlag == paymentUpdateDTO.mperksFlag && this.linkToMPerks == paymentUpdateDTO.linkToMPerks && this.isPrimary == paymentUpdateDTO.isPrimary && Intrinsics.e(this.phoneNumber, paymentUpdateDTO.phoneNumber) && Intrinsics.e(this.createDate, paymentUpdateDTO.createDate) && Intrinsics.e(this.createdBy, paymentUpdateDTO.createdBy) && Intrinsics.e(this.updateDate, paymentUpdateDTO.updateDate) && Intrinsics.e(this.updatedBy, paymentUpdateDTO.updatedBy) && Intrinsics.e(this.termsOfServiceAgreementDate, paymentUpdateDTO.termsOfServiceAgreementDate) && this.accountAddressId == paymentUpdateDTO.accountAddressId && Intrinsics.e(this.addressName, paymentUpdateDTO.addressName) && Intrinsics.e(this.addressLine1, paymentUpdateDTO.addressLine1) && Intrinsics.e(this.addressLine2, paymentUpdateDTO.addressLine2) && Intrinsics.e(this.city, paymentUpdateDTO.city) && Intrinsics.e(this.state, paymentUpdateDTO.state) && Intrinsics.e(this.zipCode, paymentUpdateDTO.zipCode) && Intrinsics.e(this.addressTypeString, paymentUpdateDTO.addressTypeString) && Intrinsics.e(this.addressTypeId, paymentUpdateDTO.addressTypeId) && Intrinsics.e(this.nameFirst, paymentUpdateDTO.nameFirst) && Intrinsics.e(this.nameLast, paymentUpdateDTO.nameLast) && Intrinsics.e(this.addressNickname, paymentUpdateDTO.addressNickname) && Intrinsics.e(this.cartCode, paymentUpdateDTO.cartCode) && Intrinsics.e(this.cardCcTokenType, paymentUpdateDTO.cardCcTokenType);
    }

    public int hashCode() {
        int iHashCode = ((((((Long.hashCode(this.id) * 31) + Long.hashCode(this.digitalAccountId)) * 31) + this.cardName.hashCode()) * 31) + this.lastFourDigits.hashCode()) * 31;
        String str = this.securityCode;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.saveCardEnabled)) * 31) + Integer.hashCode(this.cardType)) * 31;
        String str2 = this.cardTypeName;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.expirationDate.hashCode()) * 31;
        String str3 = this.description;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cardGuid;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.cardAuthToken;
        int iHashCode6 = (((((((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + Boolean.hashCode(this.mperksFlag)) * 31) + Boolean.hashCode(this.linkToMPerks)) * 31) + Boolean.hashCode(this.isPrimary)) * 31;
        String str6 = this.phoneNumber;
        int iHashCode7 = (((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.createDate.hashCode()) * 31;
        String str7 = this.createdBy;
        int iHashCode8 = (((iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.updateDate.hashCode()) * 31;
        String str8 = this.updatedBy;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.termsOfServiceAgreementDate;
        int iHashCode10 = (((iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31) + Long.hashCode(this.accountAddressId)) * 31;
        String str10 = this.addressName;
        int iHashCode11 = (((iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31) + this.addressLine1.hashCode()) * 31;
        String str11 = this.addressLine2;
        int iHashCode12 = (((((((iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31) + this.city.hashCode()) * 31) + this.state.hashCode()) * 31) + this.zipCode.hashCode()) * 31;
        String str12 = this.addressTypeString;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num = this.addressTypeId;
        int iHashCode14 = (iHashCode13 + (num == null ? 0 : num.hashCode())) * 31;
        String str13 = this.nameFirst;
        int iHashCode15 = (iHashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.nameLast;
        int iHashCode16 = (iHashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.addressNickname;
        int iHashCode17 = (iHashCode16 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.cartCode;
        int iHashCode18 = (iHashCode17 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.cardCcTokenType;
        return iHashCode18 + (str17 != null ? str17.hashCode() : 0);
    }

    public String toString() {
        return "PaymentUpdateDTO(id=" + this.id + ", digitalAccountId=" + this.digitalAccountId + ", cardName=" + this.cardName + ", lastFourDigits=" + this.lastFourDigits + ", securityCode=" + this.securityCode + ", saveCardEnabled=" + this.saveCardEnabled + ", cardType=" + this.cardType + ", cardTypeName=" + this.cardTypeName + ", expirationDate=" + this.expirationDate + ", description=" + this.description + ", cardGuid=" + this.cardGuid + ", cardAuthToken=" + this.cardAuthToken + ", mperksFlag=" + this.mperksFlag + ", linkToMPerks=" + this.linkToMPerks + ", isPrimary=" + this.isPrimary + ", phoneNumber=" + this.phoneNumber + ", createDate=" + this.createDate + ", createdBy=" + this.createdBy + ", updateDate=" + this.updateDate + ", updatedBy=" + this.updatedBy + ", termsOfServiceAgreementDate=" + this.termsOfServiceAgreementDate + ", accountAddressId=" + this.accountAddressId + ", addressName=" + this.addressName + ", addressLine1=" + this.addressLine1 + ", addressLine2=" + this.addressLine2 + ", city=" + this.city + ", state=" + this.state + ", zipCode=" + this.zipCode + ", addressTypeString=" + this.addressTypeString + ", addressTypeId=" + this.addressTypeId + ", nameFirst=" + this.nameFirst + ", nameLast=" + this.nameLast + ", addressNickname=" + this.addressNickname + ", cartCode=" + this.cartCode + ", cardCcTokenType=" + this.cardCcTokenType + ')';
    }

    /* renamed from: A, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: B, reason: from getter */
    public final boolean getSaveCardEnabled() {
        return this.saveCardEnabled;
    }

    /* renamed from: C, reason: from getter */
    public final String getSecurityCode() {
        return this.securityCode;
    }

    /* renamed from: D, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* renamed from: E, reason: from getter */
    public final String getTermsOfServiceAgreementDate() {
        return this.termsOfServiceAgreementDate;
    }

    /* renamed from: F, reason: from getter */
    public final String getUpdateDate() {
        return this.updateDate;
    }

    /* renamed from: G, reason: from getter */
    public final String getUpdatedBy() {
        return this.updatedBy;
    }

    /* renamed from: H, reason: from getter */
    public final String getZipCode() {
        return this.zipCode;
    }

    /* renamed from: I, reason: from getter */
    public final boolean getIsPrimary() {
        return this.isPrimary;
    }

    /* renamed from: a, reason: from getter */
    public final long getAccountAddressId() {
        return this.accountAddressId;
    }

    /* renamed from: b, reason: from getter */
    public final String getAddressLine1() {
        return this.addressLine1;
    }

    /* renamed from: c, reason: from getter */
    public final String getAddressLine2() {
        return this.addressLine2;
    }

    /* renamed from: d, reason: from getter */
    public final String getAddressName() {
        return this.addressName;
    }

    /* renamed from: e, reason: from getter */
    public final String getAddressNickname() {
        return this.addressNickname;
    }

    /* renamed from: f, reason: from getter */
    public final Integer getAddressTypeId() {
        return this.addressTypeId;
    }

    /* renamed from: g, reason: from getter */
    public final String getAddressTypeString() {
        return this.addressTypeString;
    }

    /* renamed from: h, reason: from getter */
    public final String getCardAuthToken() {
        return this.cardAuthToken;
    }

    /* renamed from: i, reason: from getter */
    public final String getCardCcTokenType() {
        return this.cardCcTokenType;
    }

    /* renamed from: j, reason: from getter */
    public final String getCardGuid() {
        return this.cardGuid;
    }

    /* renamed from: k, reason: from getter */
    public final String getCardName() {
        return this.cardName;
    }

    /* renamed from: l, reason: from getter */
    public final int getCardType() {
        return this.cardType;
    }

    /* renamed from: m, reason: from getter */
    public final String getCardTypeName() {
        return this.cardTypeName;
    }

    /* renamed from: n, reason: from getter */
    public final String getCartCode() {
        return this.cartCode;
    }

    /* renamed from: o, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* renamed from: p, reason: from getter */
    public final String getCreateDate() {
        return this.createDate;
    }

    /* renamed from: q, reason: from getter */
    public final String getCreatedBy() {
        return this.createdBy;
    }

    /* renamed from: r, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: s, reason: from getter */
    public final long getDigitalAccountId() {
        return this.digitalAccountId;
    }

    /* renamed from: t, reason: from getter */
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    /* renamed from: u, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: v, reason: from getter */
    public final String getLastFourDigits() {
        return this.lastFourDigits;
    }

    /* renamed from: w, reason: from getter */
    public final boolean getLinkToMPerks() {
        return this.linkToMPerks;
    }

    /* renamed from: x, reason: from getter */
    public final boolean getMperksFlag() {
        return this.mperksFlag;
    }

    /* renamed from: y, reason: from getter */
    public final String getNameFirst() {
        return this.nameFirst;
    }

    /* renamed from: z, reason: from getter */
    public final String getNameLast() {
        return this.nameLast;
    }

    public /* synthetic */ PaymentUpdateDTO(long j10, long j11, String str, String str2, String str3, boolean z10, int i10, String str4, String str5, String str6, String str7, String str8, boolean z11, boolean z12, boolean z13, String str9, String str10, String str11, String str12, String str13, String str14, long j12, String str15, String str16, String str17, String str18, String str19, String str20, String str21, Integer num, String str22, String str23, String str24, String str25, String str26, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0L : j10, j11, str, str2, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? true : z10, i10, (i11 & 128) != 0 ? null : str4, str5, (i11 & 512) != 0 ? null : str6, (i11 & 1024) != 0 ? null : str7, (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? null : str8, (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? false : z11, (i11 & 8192) != 0 ? false : z12, (i11 & 16384) != 0 ? false : z13, (32768 & i11) != 0 ? null : str9, str10, (131072 & i11) != 0 ? null : str11, str12, (524288 & i11) != 0 ? null : str13, (1048576 & i11) != 0 ? null : str14, j12, (4194304 & i11) != 0 ? null : str15, str16, (16777216 & i11) != 0 ? null : str17, str18, str19, str20, (268435456 & i11) != 0 ? null : str21, (536870912 & i11) != 0 ? null : num, (1073741824 & i11) != 0 ? null : str22, (i11 & Integer.MIN_VALUE) != 0 ? null : str23, (i12 & 1) != 0 ? null : str24, (i12 & 2) != 0 ? null : str25, (i12 & 4) != 0 ? null : str26);
    }
}
