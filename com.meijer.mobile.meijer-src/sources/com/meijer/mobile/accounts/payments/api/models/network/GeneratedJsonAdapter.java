package com.meijer.mobile.accounts.payments.api.models.network;

import com.google.android.gms.common.api.b;
import com.meijer.mobile.accounts.payments.api.models.network.AccountCreditCardDTOV2;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import gu.C14410c;
import io.constructor.data.local.PreferencesHelper;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/meijer/mobile/accounts/payments/api/models/network/AccountCreditCardDTOV2JsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/accounts/payments/api/models/network/AccountCreditCardDTOV2;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/accounts/payments/api/models/network/AccountCreditCardDTOV2;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/accounts/payments/api/models/network/AccountCreditCardDTOV2;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "", "longAdapter", "Lcom/squareup/moshi/h;", "stringAdapter", "", "nullableIntAdapter", "nullableStringAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.accounts.payments.api.models.network.AccountCreditCardDTOV2JsonAdapter, reason: from toString */
/* loaded from: classes8.dex */
public final class GeneratedJsonAdapter extends h<AccountCreditCardDTOV2> {
    private final h<Boolean> booleanAdapter;
    private volatile Constructor<AccountCreditCardDTOV2> constructorRef;
    private final h<Long> longAdapter;
    private final h<Integer> nullableIntAdapter;
    private final h<String> nullableStringAdapter;
    private final k.b options;
    private final h<String> stringAdapter;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("cardId", "accountId", "accountAddressId", "clientId", "profileId", "cardName", "cardLastFour", "cardType", "cardTypeName", "cardExpirationDate", "CardDescription", "cardGuid", "cardCcToken", "MperksFlag", "linkToMPerks", "isPreferred", "phoneNumber", "createDate", "createdBy", "updatedDate", "updatedBy", "cardTokenStoredOnFileAckDate", "cardCcTokenType");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<Long> hVarF = moshi.f(Long.TYPE, SetsKt.e(), PreferencesHelper.PREF_ID);
        Intrinsics.i(hVarF, "adapter(...)");
        this.longAdapter = hVarF;
        h<String> hVarF2 = moshi.f(String.class, SetsKt.e(), "cardName");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.stringAdapter = hVarF2;
        h<Integer> hVarF3 = moshi.f(Integer.class, SetsKt.e(), "cardType");
        Intrinsics.i(hVarF3, "adapter(...)");
        this.nullableIntAdapter = hVarF3;
        h<String> hVarF4 = moshi.f(String.class, SetsKt.e(), "cardTypeName");
        Intrinsics.i(hVarF4, "adapter(...)");
        this.nullableStringAdapter = hVarF4;
        h<Boolean> hVarF5 = moshi.f(Boolean.TYPE, SetsKt.e(), "mperksFlag");
        Intrinsics.i(hVarF5, "adapter(...)");
        this.booleanAdapter = hVarF5;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AccountCreditCardDTOV2 fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Long l10;
        int i10;
        Intrinsics.j(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.b();
        int i11 = -1;
        Long lFromJson = 0L;
        Long lFromJson2 = null;
        Long lFromJson3 = null;
        Long lFromJson4 = null;
        Boolean boolFromJson = bool;
        Boolean boolFromJson2 = boolFromJson;
        Boolean boolFromJson3 = boolFromJson2;
        Long lFromJson5 = null;
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        String strFromJson4 = null;
        String strFromJson5 = null;
        String strFromJson6 = null;
        String strFromJson7 = null;
        String strFromJson8 = null;
        String strFromJson9 = null;
        Integer numFromJson = null;
        String strFromJson10 = null;
        String strFromJson11 = null;
        String strFromJson12 = null;
        String strFromJson13 = null;
        String strFromJson14 = null;
        while (true) {
            Long l11 = lFromJson;
            Long l12 = lFromJson5;
            Long l13 = lFromJson2;
            Long l14 = lFromJson3;
            Long l15 = lFromJson4;
            if (!reader.hasNext()) {
                String str = strFromJson;
                reader.d();
                if (i11 == -7732638) {
                    String str2 = strFromJson6;
                    String str3 = strFromJson7;
                    long jLongValue = l11.longValue();
                    if (l12 == null) {
                        throw C14410c.o("digitalAccountId", "accountId", reader);
                    }
                    long jLongValue2 = l12.longValue();
                    long jLongValue3 = l13.longValue();
                    long jLongValue4 = l14.longValue();
                    long jLongValue5 = l15.longValue();
                    if (strFromJson8 == null) {
                        throw C14410c.o("cardName", "cardName", reader);
                    }
                    if (strFromJson9 == null) {
                        throw C14410c.o("lastFourDigits", "cardLastFour", reader);
                    }
                    if (strFromJson2 == null) {
                        throw C14410c.o("expirationDate", "cardExpirationDate", reader);
                    }
                    boolean zBooleanValue = boolFromJson.booleanValue();
                    boolean zBooleanValue2 = boolFromJson2.booleanValue();
                    boolean zBooleanValue3 = boolFromJson3.booleanValue();
                    if (str3 == null) {
                        throw C14410c.o("createDateString", "createDate", reader);
                    }
                    if (strFromJson11 != null) {
                        return new AccountCreditCardDTOV2(jLongValue, jLongValue2, jLongValue3, jLongValue4, jLongValue5, strFromJson8, strFromJson9, numFromJson, str, strFromJson2, strFromJson3, strFromJson4, strFromJson5, zBooleanValue, zBooleanValue2, zBooleanValue3, str2, str3, strFromJson10, strFromJson11, strFromJson12, strFromJson13, strFromJson14, null, 0, 25165824, null);
                    }
                    throw C14410c.o("updateDateString", "updatedDate", reader);
                }
                String str4 = strFromJson6;
                String str5 = strFromJson7;
                int i12 = i11;
                Constructor<AccountCreditCardDTOV2> declaredConstructor = this.constructorRef;
                if (declaredConstructor == null) {
                    Class cls = Integer.TYPE;
                    Class<?> cls2 = C14410c.f134472c;
                    Class cls3 = Long.TYPE;
                    Class cls4 = Boolean.TYPE;
                    l10 = l14;
                    declaredConstructor = AccountCreditCardDTOV2.class.getDeclaredConstructor(cls3, cls3, cls3, cls3, cls3, String.class, String.class, Integer.class, String.class, String.class, String.class, String.class, String.class, cls4, cls4, cls4, String.class, String.class, String.class, String.class, String.class, String.class, String.class, AccountCreditCardDTOV2.LinkState.class, cls, cls, cls2);
                    this.constructorRef = declaredConstructor;
                    Intrinsics.i(declaredConstructor, "also(...)");
                } else {
                    l10 = l14;
                }
                if (l12 == null) {
                    throw C14410c.o("digitalAccountId", "accountId", reader);
                }
                if (strFromJson8 == null) {
                    throw C14410c.o("cardName", "cardName", reader);
                }
                if (strFromJson9 == null) {
                    throw C14410c.o("lastFourDigits", "cardLastFour", reader);
                }
                if (strFromJson2 == null) {
                    throw C14410c.o("expirationDate", "cardExpirationDate", reader);
                }
                if (str5 == null) {
                    throw C14410c.o("createDateString", "createDate", reader);
                }
                if (strFromJson11 == null) {
                    throw C14410c.o("updateDateString", "updatedDate", reader);
                }
                AccountCreditCardDTOV2 accountCreditCardDTOV2NewInstance = declaredConstructor.newInstance(l11, l12, l13, l10, l15, strFromJson8, strFromJson9, numFromJson, str, strFromJson2, strFromJson3, strFromJson4, strFromJson5, boolFromJson, boolFromJson2, boolFromJson3, str4, str5, strFromJson10, strFromJson11, strFromJson12, strFromJson13, strFromJson14, null, 0, Integer.valueOf(i12), null);
                Intrinsics.i(accountCreditCardDTOV2NewInstance, "newInstance(...)");
                return accountCreditCardDTOV2NewInstance;
            }
            String str6 = strFromJson;
            switch (reader.z(this.options)) {
                case -1:
                    reader.H();
                    reader.skipValue();
                    lFromJson = l11;
                    lFromJson5 = l12;
                    lFromJson2 = l13;
                    lFromJson3 = l14;
                    lFromJson4 = l15;
                    strFromJson = str6;
                case 0:
                    lFromJson = this.longAdapter.fromJson(reader);
                    if (lFromJson == null) {
                        throw C14410c.w(PreferencesHelper.PREF_ID, "cardId", reader);
                    }
                    i11 &= -2;
                    lFromJson5 = l12;
                    lFromJson2 = l13;
                    lFromJson3 = l14;
                    lFromJson4 = l15;
                    strFromJson = str6;
                case 1:
                    lFromJson5 = this.longAdapter.fromJson(reader);
                    if (lFromJson5 == null) {
                        throw C14410c.w("digitalAccountId", "accountId", reader);
                    }
                    lFromJson = l11;
                    lFromJson2 = l13;
                    lFromJson3 = l14;
                    lFromJson4 = l15;
                    strFromJson = str6;
                case 2:
                    lFromJson2 = this.longAdapter.fromJson(reader);
                    if (lFromJson2 == null) {
                        throw C14410c.w("accountAddressId", "accountAddressId", reader);
                    }
                    i11 &= -5;
                    lFromJson = l11;
                    lFromJson5 = l12;
                    lFromJson3 = l14;
                    lFromJson4 = l15;
                    strFromJson = str6;
                case 3:
                    lFromJson3 = this.longAdapter.fromJson(reader);
                    if (lFromJson3 == null) {
                        throw C14410c.w("clientId", "clientId", reader);
                    }
                    i11 &= -9;
                    lFromJson = l11;
                    lFromJson5 = l12;
                    lFromJson2 = l13;
                    lFromJson4 = l15;
                    strFromJson = str6;
                case 4:
                    lFromJson4 = this.longAdapter.fromJson(reader);
                    if (lFromJson4 == null) {
                        throw C14410c.w("profileId", "profileId", reader);
                    }
                    i11 &= -17;
                    lFromJson = l11;
                    lFromJson5 = l12;
                    lFromJson2 = l13;
                    lFromJson3 = l14;
                    strFromJson = str6;
                case 5:
                    strFromJson8 = this.stringAdapter.fromJson(reader);
                    if (strFromJson8 == null) {
                        throw C14410c.w("cardName", "cardName", reader);
                    }
                    lFromJson = l11;
                    lFromJson5 = l12;
                    lFromJson2 = l13;
                    lFromJson3 = l14;
                    lFromJson4 = l15;
                    strFromJson = str6;
                case 6:
                    strFromJson9 = this.stringAdapter.fromJson(reader);
                    if (strFromJson9 == null) {
                        throw C14410c.w("lastFourDigits", "cardLastFour", reader);
                    }
                    lFromJson = l11;
                    lFromJson5 = l12;
                    lFromJson2 = l13;
                    lFromJson3 = l14;
                    lFromJson4 = l15;
                    strFromJson = str6;
                case 7:
                    numFromJson = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -129;
                    lFromJson = l11;
                    lFromJson5 = l12;
                    lFromJson2 = l13;
                    lFromJson3 = l14;
                    lFromJson4 = l15;
                    strFromJson = str6;
                case 8:
                    strFromJson = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -257;
                    lFromJson = l11;
                    lFromJson5 = l12;
                    lFromJson2 = l13;
                    lFromJson3 = l14;
                    lFromJson4 = l15;
                case 9:
                    strFromJson2 = this.stringAdapter.fromJson(reader);
                    if (strFromJson2 == null) {
                        throw C14410c.w("expirationDate", "cardExpirationDate", reader);
                    }
                    lFromJson = l11;
                    lFromJson5 = l12;
                    lFromJson2 = l13;
                    lFromJson3 = l14;
                    lFromJson4 = l15;
                    strFromJson = str6;
                case 10:
                    strFromJson3 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -1025;
                    lFromJson = l11;
                    lFromJson5 = l12;
                    lFromJson2 = l13;
                    lFromJson3 = l14;
                    lFromJson4 = l15;
                    strFromJson = str6;
                case 11:
                    strFromJson4 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -2049;
                    lFromJson = l11;
                    lFromJson5 = l12;
                    lFromJson2 = l13;
                    lFromJson3 = l14;
                    lFromJson4 = l15;
                    strFromJson = str6;
                case 12:
                    strFromJson5 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -4097;
                    lFromJson = l11;
                    lFromJson5 = l12;
                    lFromJson2 = l13;
                    lFromJson3 = l14;
                    lFromJson4 = l15;
                    strFromJson = str6;
                case 13:
                    boolFromJson = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson == null) {
                        throw C14410c.w("mperksFlag", "MperksFlag", reader);
                    }
                    i11 &= -8193;
                    lFromJson = l11;
                    lFromJson5 = l12;
                    lFromJson2 = l13;
                    lFromJson3 = l14;
                    lFromJson4 = l15;
                    strFromJson = str6;
                case 14:
                    boolFromJson2 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson2 == null) {
                        throw C14410c.w("linkToMPerks", "linkToMPerks", reader);
                    }
                    i11 &= -16385;
                    lFromJson = l11;
                    lFromJson5 = l12;
                    lFromJson2 = l13;
                    lFromJson3 = l14;
                    lFromJson4 = l15;
                    strFromJson = str6;
                case 15:
                    boolFromJson3 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson3 == null) {
                        throw C14410c.w("isPrimary", "isPreferred", reader);
                    }
                    i10 = -32769;
                    i11 &= i10;
                    lFromJson = l11;
                    lFromJson5 = l12;
                    lFromJson2 = l13;
                    lFromJson3 = l14;
                    lFromJson4 = l15;
                    strFromJson = str6;
                case 16:
                    strFromJson6 = this.nullableStringAdapter.fromJson(reader);
                    i10 = -65537;
                    i11 &= i10;
                    lFromJson = l11;
                    lFromJson5 = l12;
                    lFromJson2 = l13;
                    lFromJson3 = l14;
                    lFromJson4 = l15;
                    strFromJson = str6;
                case 17:
                    strFromJson7 = this.stringAdapter.fromJson(reader);
                    if (strFromJson7 == null) {
                        throw C14410c.w("createDateString", "createDate", reader);
                    }
                    lFromJson = l11;
                    lFromJson5 = l12;
                    lFromJson2 = l13;
                    lFromJson3 = l14;
                    lFromJson4 = l15;
                    strFromJson = str6;
                case 18:
                    strFromJson10 = this.nullableStringAdapter.fromJson(reader);
                    i10 = -262145;
                    i11 &= i10;
                    lFromJson = l11;
                    lFromJson5 = l12;
                    lFromJson2 = l13;
                    lFromJson3 = l14;
                    lFromJson4 = l15;
                    strFromJson = str6;
                case 19:
                    strFromJson11 = this.stringAdapter.fromJson(reader);
                    if (strFromJson11 == null) {
                        throw C14410c.w("updateDateString", "updatedDate", reader);
                    }
                    lFromJson = l11;
                    lFromJson5 = l12;
                    lFromJson2 = l13;
                    lFromJson3 = l14;
                    lFromJson4 = l15;
                    strFromJson = str6;
                case 20:
                    strFromJson12 = this.nullableStringAdapter.fromJson(reader);
                    i10 = -1048577;
                    i11 &= i10;
                    lFromJson = l11;
                    lFromJson5 = l12;
                    lFromJson2 = l13;
                    lFromJson3 = l14;
                    lFromJson4 = l15;
                    strFromJson = str6;
                case 21:
                    strFromJson13 = this.nullableStringAdapter.fromJson(reader);
                    i10 = -2097153;
                    i11 &= i10;
                    lFromJson = l11;
                    lFromJson5 = l12;
                    lFromJson2 = l13;
                    lFromJson3 = l14;
                    lFromJson4 = l15;
                    strFromJson = str6;
                case b.RECONNECTION_TIMED_OUT /* 22 */:
                    strFromJson14 = this.nullableStringAdapter.fromJson(reader);
                    i10 = -4194305;
                    i11 &= i10;
                    lFromJson = l11;
                    lFromJson5 = l12;
                    lFromJson2 = l13;
                    lFromJson3 = l14;
                    lFromJson4 = l15;
                    strFromJson = str6;
                default:
                    lFromJson = l11;
                    lFromJson5 = l12;
                    lFromJson2 = l13;
                    lFromJson3 = l14;
                    lFromJson4 = l15;
                    strFromJson = str6;
            }
        }
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, AccountCreditCardDTOV2 value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("cardId");
        this.longAdapter.toJson(writer, (q) Long.valueOf(value_.getId()));
        writer.l("accountId");
        this.longAdapter.toJson(writer, (q) Long.valueOf(value_.getDigitalAccountId()));
        writer.l("accountAddressId");
        this.longAdapter.toJson(writer, (q) Long.valueOf(value_.getAccountAddressId()));
        writer.l("clientId");
        this.longAdapter.toJson(writer, (q) Long.valueOf(value_.getClientId()));
        writer.l("profileId");
        this.longAdapter.toJson(writer, (q) Long.valueOf(value_.getProfileId()));
        writer.l("cardName");
        this.stringAdapter.toJson(writer, (q) value_.getCardName());
        writer.l("cardLastFour");
        this.stringAdapter.toJson(writer, (q) value_.getLastFourDigits());
        writer.l("cardType");
        this.nullableIntAdapter.toJson(writer, (q) value_.getCardType());
        writer.l("cardTypeName");
        this.nullableStringAdapter.toJson(writer, (q) value_.getCardTypeName());
        writer.l("cardExpirationDate");
        this.stringAdapter.toJson(writer, (q) value_.getExpirationDate());
        writer.l("CardDescription");
        this.nullableStringAdapter.toJson(writer, (q) value_.getDescription());
        writer.l("cardGuid");
        this.nullableStringAdapter.toJson(writer, (q) value_.getCardGuid());
        writer.l("cardCcToken");
        this.nullableStringAdapter.toJson(writer, (q) value_.getCardAuthToken());
        writer.l("MperksFlag");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getMperksFlag()));
        writer.l("linkToMPerks");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getLinkToMPerks()));
        writer.l("isPreferred");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getIsPrimary()));
        writer.l("phoneNumber");
        this.nullableStringAdapter.toJson(writer, (q) value_.getPhoneNumber());
        writer.l("createDate");
        this.stringAdapter.toJson(writer, (q) value_.getCreateDateString());
        writer.l("createdBy");
        this.nullableStringAdapter.toJson(writer, (q) value_.getCreatedBy());
        writer.l("updatedDate");
        this.stringAdapter.toJson(writer, (q) value_.getUpdateDateString());
        writer.l("updatedBy");
        this.nullableStringAdapter.toJson(writer, (q) value_.getUpdatedBy());
        writer.l("cardTokenStoredOnFileAckDate");
        this.nullableStringAdapter.toJson(writer, (q) value_.getTermsOfServiceAgreementDate());
        writer.l("cardCcTokenType");
        this.nullableStringAdapter.toJson(writer, (q) value_.getCardCcTokenType());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(44);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("AccountCreditCardDTOV2");
        sb2.append(')');
        return sb2.toString();
    }
}
