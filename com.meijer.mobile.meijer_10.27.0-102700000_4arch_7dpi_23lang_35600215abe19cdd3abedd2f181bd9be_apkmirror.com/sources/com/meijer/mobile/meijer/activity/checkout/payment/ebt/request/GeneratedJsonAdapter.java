package com.meijer.mobile.meijer.activity.checkout.payment.ebt.request;

import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import gu.c;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/request/AcculynkRequestJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/request/AcculynkRequest;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/request/AcculynkRequest;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/request/AcculynkRequest;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "stringAdapter", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/request/AcculynkDeliveryAddress;", "acculynkDeliveryAddressAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.ebt.request.AcculynkRequestJsonAdapter, reason: from toString */
/* loaded from: classes9.dex */
public final class GeneratedJsonAdapter extends h<AcculynkRequest> {
    public static final int $stable = 8;
    private final h<AcculynkDeliveryAddress> acculynkDeliveryAddressAdapter;
    private volatile Constructor<AcculynkRequest> constructorRef;
    private final k.b options;
    private final h<String> stringAdapter;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("usrToken", "divInjectionId", "sapHost", "mjrHost", "transactionType", "transType", "amount", "previousTranId", "previousAmount", "deliveryAddress", "panToken", "panExpDate", "cartId", "orderId", "unitId", "style", "iframePanId", "iframePinPadResponse", "iframeUrl", "apiUrl", "mjrApp");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<String> hVarF = moshi.f(String.class, SetsKt.e(), "usrToken");
        Intrinsics.i(hVarF, "adapter(...)");
        this.stringAdapter = hVarF;
        h<AcculynkDeliveryAddress> hVarF2 = moshi.f(AcculynkDeliveryAddress.class, SetsKt.e(), "deliveryAddress");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.acculynkDeliveryAddressAdapter = hVarF2;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AcculynkRequest fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String str;
        int i10;
        Intrinsics.j(reader, "reader");
        reader.b();
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        String strFromJson4 = null;
        String strFromJson5 = null;
        String strFromJson6 = null;
        String strFromJson7 = null;
        String strFromJson8 = null;
        String strFromJson9 = null;
        String strFromJson10 = null;
        AcculynkDeliveryAddress acculynkDeliveryAddressFromJson = null;
        String strFromJson11 = null;
        String strFromJson12 = null;
        String strFromJson13 = null;
        String strFromJson14 = null;
        String strFromJson15 = null;
        String strFromJson16 = null;
        String strFromJson17 = null;
        String strFromJson18 = null;
        String strFromJson19 = null;
        int i11 = -1;
        String strFromJson20 = null;
        while (true) {
            String str2 = strFromJson10;
            if (!reader.hasNext()) {
                String str3 = strFromJson20;
                reader.d();
                if (i11 != -2097151) {
                    String str4 = strFromJson12;
                    String str5 = strFromJson;
                    String str6 = strFromJson9;
                    String str7 = strFromJson8;
                    String str8 = strFromJson7;
                    String str9 = strFromJson6;
                    String str10 = strFromJson5;
                    String str11 = strFromJson4;
                    String str12 = strFromJson3;
                    String str13 = strFromJson2;
                    String str14 = strFromJson14;
                    String str15 = strFromJson15;
                    String str16 = strFromJson16;
                    String str17 = strFromJson17;
                    String str18 = strFromJson18;
                    String str19 = strFromJson19;
                    Constructor<AcculynkRequest> declaredConstructor = this.constructorRef;
                    if (declaredConstructor == null) {
                        str = str6;
                        declaredConstructor = AcculynkRequest.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, AcculynkDeliveryAddress.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, c.f134099c);
                        this.constructorRef = declaredConstructor;
                        Intrinsics.i(declaredConstructor, "also(...)");
                    } else {
                        str = str6;
                    }
                    if (str4 == null) {
                        throw c.o("usrToken", "usrToken", reader);
                    }
                    AcculynkRequest acculynkRequestNewInstance = declaredConstructor.newInstance(str4, str13, str12, str11, str10, str9, str8, str7, str, acculynkDeliveryAddressFromJson, strFromJson11, str5, str3, str2, strFromJson13, str14, str15, str16, str17, str18, str19, Integer.valueOf(i11), null);
                    Intrinsics.i(acculynkRequestNewInstance, "newInstance(...)");
                    return acculynkRequestNewInstance;
                }
                if (strFromJson12 == null) {
                    throw c.o("usrToken", "usrToken", reader);
                }
                Intrinsics.h(strFromJson2, "null cannot be cast to non-null type kotlin.String");
                Intrinsics.h(strFromJson3, "null cannot be cast to non-null type kotlin.String");
                Intrinsics.h(strFromJson4, "null cannot be cast to non-null type kotlin.String");
                Intrinsics.h(strFromJson5, "null cannot be cast to non-null type kotlin.String");
                Intrinsics.h(strFromJson6, "null cannot be cast to non-null type kotlin.String");
                Intrinsics.h(strFromJson7, "null cannot be cast to non-null type kotlin.String");
                Intrinsics.h(strFromJson8, "null cannot be cast to non-null type kotlin.String");
                Intrinsics.h(strFromJson9, "null cannot be cast to non-null type kotlin.String");
                Intrinsics.h(acculynkDeliveryAddressFromJson, "null cannot be cast to non-null type com.meijer.mobile.meijer.activity.checkout.payment.ebt.request.AcculynkDeliveryAddress");
                Intrinsics.h(strFromJson11, "null cannot be cast to non-null type kotlin.String");
                Intrinsics.h(strFromJson, "null cannot be cast to non-null type kotlin.String");
                Intrinsics.h(str3, "null cannot be cast to non-null type kotlin.String");
                Intrinsics.h(str2, "null cannot be cast to non-null type kotlin.String");
                String str20 = strFromJson;
                Intrinsics.h(strFromJson13, "null cannot be cast to non-null type kotlin.String");
                String str21 = strFromJson14;
                Intrinsics.h(str21, "null cannot be cast to non-null type kotlin.String");
                String str22 = strFromJson15;
                Intrinsics.h(str22, "null cannot be cast to non-null type kotlin.String");
                String str23 = strFromJson16;
                Intrinsics.h(str23, "null cannot be cast to non-null type kotlin.String");
                String str24 = strFromJson17;
                Intrinsics.h(str24, "null cannot be cast to non-null type kotlin.String");
                String str25 = strFromJson18;
                Intrinsics.h(str25, "null cannot be cast to non-null type kotlin.String");
                String str26 = strFromJson19;
                Intrinsics.h(str26, "null cannot be cast to non-null type kotlin.String");
                String str27 = strFromJson9;
                String str28 = strFromJson8;
                String str29 = strFromJson7;
                String str30 = strFromJson6;
                String str31 = strFromJson5;
                String str32 = strFromJson4;
                return new AcculynkRequest(strFromJson12, strFromJson2, strFromJson3, str32, str31, str30, str29, str28, str27, acculynkDeliveryAddressFromJson, strFromJson11, str20, str3, str2, strFromJson13, str21, str22, str23, str24, str25, str26);
            }
            String str33 = strFromJson20;
            switch (reader.z(this.options)) {
                case -1:
                    reader.H();
                    reader.skipValue();
                    strFromJson20 = str33;
                    strFromJson10 = str2;
                case 0:
                    strFromJson12 = this.stringAdapter.fromJson(reader);
                    if (strFromJson12 == null) {
                        throw c.w("usrToken", "usrToken", reader);
                    }
                    strFromJson20 = str33;
                    strFromJson10 = str2;
                case 1:
                    strFromJson2 = this.stringAdapter.fromJson(reader);
                    if (strFromJson2 == null) {
                        throw c.w("divInjectionId", "divInjectionId", reader);
                    }
                    i11 &= -3;
                    strFromJson20 = str33;
                    strFromJson10 = str2;
                case 2:
                    strFromJson3 = this.stringAdapter.fromJson(reader);
                    if (strFromJson3 == null) {
                        throw c.w("sapHost", "sapHost", reader);
                    }
                    i11 &= -5;
                    strFromJson20 = str33;
                    strFromJson10 = str2;
                case 3:
                    strFromJson4 = this.stringAdapter.fromJson(reader);
                    if (strFromJson4 == null) {
                        throw c.w("mjrHost", "mjrHost", reader);
                    }
                    i11 &= -9;
                    strFromJson20 = str33;
                    strFromJson10 = str2;
                case 4:
                    strFromJson5 = this.stringAdapter.fromJson(reader);
                    if (strFromJson5 == null) {
                        throw c.w("transactionType", "transactionType", reader);
                    }
                    i11 &= -17;
                    strFromJson20 = str33;
                    strFromJson10 = str2;
                case 5:
                    strFromJson6 = this.stringAdapter.fromJson(reader);
                    if (strFromJson6 == null) {
                        throw c.w("transType", "transType", reader);
                    }
                    i11 &= -33;
                    strFromJson20 = str33;
                    strFromJson10 = str2;
                case 6:
                    strFromJson7 = this.stringAdapter.fromJson(reader);
                    if (strFromJson7 == null) {
                        throw c.w("amount", "amount", reader);
                    }
                    i11 &= -65;
                    strFromJson20 = str33;
                    strFromJson10 = str2;
                case 7:
                    strFromJson8 = this.stringAdapter.fromJson(reader);
                    if (strFromJson8 == null) {
                        throw c.w("previousTranId", "previousTranId", reader);
                    }
                    i11 &= -129;
                    strFromJson20 = str33;
                    strFromJson10 = str2;
                case 8:
                    strFromJson9 = this.stringAdapter.fromJson(reader);
                    if (strFromJson9 == null) {
                        throw c.w("previousAmount", "previousAmount", reader);
                    }
                    i11 &= -257;
                    strFromJson20 = str33;
                    strFromJson10 = str2;
                case 9:
                    acculynkDeliveryAddressFromJson = this.acculynkDeliveryAddressAdapter.fromJson(reader);
                    if (acculynkDeliveryAddressFromJson == null) {
                        throw c.w("deliveryAddress", "deliveryAddress", reader);
                    }
                    i11 &= -513;
                    strFromJson20 = str33;
                    strFromJson10 = str2;
                case 10:
                    strFromJson11 = this.stringAdapter.fromJson(reader);
                    if (strFromJson11 == null) {
                        throw c.w("panToken", "panToken", reader);
                    }
                    i11 &= -1025;
                    strFromJson20 = str33;
                    strFromJson10 = str2;
                case 11:
                    strFromJson = this.stringAdapter.fromJson(reader);
                    if (strFromJson == null) {
                        throw c.w("panExpDate", "panExpDate", reader);
                    }
                    i11 &= -2049;
                    strFromJson20 = str33;
                    strFromJson10 = str2;
                case 12:
                    strFromJson20 = this.stringAdapter.fromJson(reader);
                    if (strFromJson20 == null) {
                        throw c.w("cartId", "cartId", reader);
                    }
                    i11 &= -4097;
                    strFromJson10 = str2;
                case 13:
                    strFromJson10 = this.stringAdapter.fromJson(reader);
                    if (strFromJson10 == null) {
                        throw c.w("orderId", "orderId", reader);
                    }
                    i11 &= -8193;
                    strFromJson20 = str33;
                case 14:
                    strFromJson13 = this.stringAdapter.fromJson(reader);
                    if (strFromJson13 == null) {
                        throw c.w("unitId", "unitId", reader);
                    }
                    i11 &= -16385;
                    strFromJson20 = str33;
                    strFromJson10 = str2;
                case 15:
                    strFromJson14 = this.stringAdapter.fromJson(reader);
                    if (strFromJson14 == null) {
                        throw c.w("style", "style", reader);
                    }
                    i10 = -32769;
                    i11 &= i10;
                    strFromJson20 = str33;
                    strFromJson10 = str2;
                case 16:
                    strFromJson15 = this.stringAdapter.fromJson(reader);
                    if (strFromJson15 == null) {
                        throw c.w("iframePanId", "iframePanId", reader);
                    }
                    i10 = -65537;
                    i11 &= i10;
                    strFromJson20 = str33;
                    strFromJson10 = str2;
                case 17:
                    strFromJson16 = this.stringAdapter.fromJson(reader);
                    if (strFromJson16 == null) {
                        throw c.w("iframePinPadResponse", "iframePinPadResponse", reader);
                    }
                    i10 = -131073;
                    i11 &= i10;
                    strFromJson20 = str33;
                    strFromJson10 = str2;
                case 18:
                    strFromJson17 = this.stringAdapter.fromJson(reader);
                    if (strFromJson17 == null) {
                        throw c.w("iframeUrl", "iframeUrl", reader);
                    }
                    i10 = -262145;
                    i11 &= i10;
                    strFromJson20 = str33;
                    strFromJson10 = str2;
                case 19:
                    strFromJson18 = this.stringAdapter.fromJson(reader);
                    if (strFromJson18 == null) {
                        throw c.w("apiUrl", "apiUrl", reader);
                    }
                    i10 = -524289;
                    i11 &= i10;
                    strFromJson20 = str33;
                    strFromJson10 = str2;
                case 20:
                    strFromJson19 = this.stringAdapter.fromJson(reader);
                    if (strFromJson19 == null) {
                        throw c.w("mjrApp", "mjrApp", reader);
                    }
                    i10 = -1048577;
                    i11 &= i10;
                    strFromJson20 = str33;
                    strFromJson10 = str2;
                default:
                    strFromJson20 = str33;
                    strFromJson10 = str2;
            }
        }
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, AcculynkRequest value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("usrToken");
        this.stringAdapter.toJson(writer, (q) value_.getUsrToken());
        writer.l("divInjectionId");
        this.stringAdapter.toJson(writer, (q) value_.getDivInjectionId());
        writer.l("sapHost");
        this.stringAdapter.toJson(writer, (q) value_.getSapHost());
        writer.l("mjrHost");
        this.stringAdapter.toJson(writer, (q) value_.getMjrHost());
        writer.l("transactionType");
        this.stringAdapter.toJson(writer, (q) value_.getTransactionType());
        writer.l("transType");
        this.stringAdapter.toJson(writer, (q) value_.getTransType());
        writer.l("amount");
        this.stringAdapter.toJson(writer, (q) value_.getAmount());
        writer.l("previousTranId");
        this.stringAdapter.toJson(writer, (q) value_.getPreviousTranId());
        writer.l("previousAmount");
        this.stringAdapter.toJson(writer, (q) value_.getPreviousAmount());
        writer.l("deliveryAddress");
        this.acculynkDeliveryAddressAdapter.toJson(writer, (q) value_.getDeliveryAddress());
        writer.l("panToken");
        this.stringAdapter.toJson(writer, (q) value_.getPanToken());
        writer.l("panExpDate");
        this.stringAdapter.toJson(writer, (q) value_.getPanExpDate());
        writer.l("cartId");
        this.stringAdapter.toJson(writer, (q) value_.getCartId());
        writer.l("orderId");
        this.stringAdapter.toJson(writer, (q) value_.getOrderId());
        writer.l("unitId");
        this.stringAdapter.toJson(writer, (q) value_.getUnitId());
        writer.l("style");
        this.stringAdapter.toJson(writer, (q) value_.getStyle());
        writer.l("iframePanId");
        this.stringAdapter.toJson(writer, (q) value_.getIframePanId());
        writer.l("iframePinPadResponse");
        this.stringAdapter.toJson(writer, (q) value_.getIframePinPadResponse());
        writer.l("iframeUrl");
        this.stringAdapter.toJson(writer, (q) value_.getIframeUrl());
        writer.l("apiUrl");
        this.stringAdapter.toJson(writer, (q) value_.getApiUrl());
        writer.l("mjrApp");
        this.stringAdapter.toJson(writer, (q) value_.getMjrApp());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("AcculynkRequest");
        sb2.append(')');
        return sb2.toString();
    }
}
