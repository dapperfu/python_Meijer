package com.meijer.mobile.greenville.model.request.trip.status;

import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import gu.c;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/greenville/model/request/trip/status/TransactionHeaderRequestJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/greenville/model/request/trip/status/TransactionHeaderRequest;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/greenville/model/request/trip/status/TransactionHeaderRequest;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/greenville/model/request/trip/status/TransactionHeaderRequest;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "stringAdapter", "Lcom/squareup/moshi/h;", "", "intAdapter", "greenville_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.greenville.model.request.trip.status.TransactionHeaderRequestJsonAdapter, reason: from toString */
/* loaded from: classes9.dex */
public final class GeneratedJsonAdapter extends h<TransactionHeaderRequest> {
    private final h<Integer> intAdapter;
    private final k.b options;
    private final h<String> stringAdapter;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("transactionDateTime", "transactionDateTimeUTC", "storeId", "terminal", "eventTimeStamp", "eventTimeStampUTC", "deviceId", "deviceOS", "deviceAppVersion", "deviceOSVersion", "transactionStatus", "transactionId", "trackingId", "transactionNumber");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<String> hVarF = moshi.f(String.class, SetsKt.e(), "transactionDateTime");
        Intrinsics.i(hVarF, "adapter(...)");
        this.stringAdapter = hVarF;
        h<Integer> hVarF2 = moshi.f(Integer.TYPE, SetsKt.e(), "storeId");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.intAdapter = hVarF2;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public TransactionHeaderRequest fromJson(k reader) throws IOException {
        Intrinsics.j(reader, "reader");
        reader.b();
        Integer numFromJson = null;
        Integer numFromJson2 = null;
        String strFromJson = null;
        String strFromJson2 = null;
        Integer numFromJson3 = null;
        String strFromJson3 = null;
        String strFromJson4 = null;
        String strFromJson5 = null;
        String strFromJson6 = null;
        String strFromJson7 = null;
        String strFromJson8 = null;
        String strFromJson9 = null;
        String strFromJson10 = null;
        String strFromJson11 = null;
        while (true) {
            Integer num = numFromJson;
            Integer num2 = numFromJson2;
            String str = strFromJson;
            String str2 = strFromJson2;
            Integer num3 = numFromJson3;
            String str3 = strFromJson3;
            String str4 = strFromJson4;
            String str5 = strFromJson5;
            String str6 = strFromJson6;
            String str7 = strFromJson7;
            String str8 = strFromJson8;
            String str9 = strFromJson9;
            String str10 = strFromJson10;
            if (!reader.hasNext()) {
                reader.d();
                if (str == null) {
                    throw c.o("transactionDateTime", "transactionDateTime", reader);
                }
                if (str2 == null) {
                    throw c.o("transactionDateTimeUTC", "transactionDateTimeUTC", reader);
                }
                if (num == null) {
                    throw c.o("storeId", "storeId", reader);
                }
                int iIntValue = num.intValue();
                if (num2 == null) {
                    throw c.o("terminal", "terminal", reader);
                }
                int iIntValue2 = num2.intValue();
                if (str3 == null) {
                    throw c.o("eventTimeStamp", "eventTimeStamp", reader);
                }
                if (str4 == null) {
                    throw c.o("eventTimeStampUTC", "eventTimeStampUTC", reader);
                }
                if (str5 == null) {
                    throw c.o("deviceId", "deviceId", reader);
                }
                if (str6 == null) {
                    throw c.o("deviceOS", "deviceOS", reader);
                }
                if (str7 == null) {
                    throw c.o("deviceAppVersion", "deviceAppVersion", reader);
                }
                if (str8 == null) {
                    throw c.o("deviceOSVersion", "deviceOSVersion", reader);
                }
                if (str9 == null) {
                    throw c.o("transactionStatus", "transactionStatus", reader);
                }
                if (str10 == null) {
                    throw c.o("transactionId", "transactionId", reader);
                }
                if (strFromJson11 == null) {
                    throw c.o("trackingId", "trackingId", reader);
                }
                if (num3 != null) {
                    return new TransactionHeaderRequest(str, str2, iIntValue, iIntValue2, str3, str4, str5, str6, str7, str8, str9, str10, strFromJson11, num3.intValue());
                }
                throw c.o("transactionNumber", "transactionNumber", reader);
            }
            switch (reader.z(this.options)) {
                case -1:
                    reader.H();
                    reader.skipValue();
                    numFromJson = num;
                    numFromJson2 = num2;
                    strFromJson = str;
                    strFromJson2 = str2;
                    numFromJson3 = num3;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                    strFromJson9 = str9;
                    strFromJson10 = str10;
                case 0:
                    strFromJson = this.stringAdapter.fromJson(reader);
                    if (strFromJson == null) {
                        throw c.w("transactionDateTime", "transactionDateTime", reader);
                    }
                    numFromJson = num;
                    numFromJson2 = num2;
                    strFromJson2 = str2;
                    numFromJson3 = num3;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                    strFromJson9 = str9;
                    strFromJson10 = str10;
                case 1:
                    strFromJson2 = this.stringAdapter.fromJson(reader);
                    if (strFromJson2 == null) {
                        throw c.w("transactionDateTimeUTC", "transactionDateTimeUTC", reader);
                    }
                    numFromJson = num;
                    numFromJson2 = num2;
                    strFromJson = str;
                    numFromJson3 = num3;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                    strFromJson9 = str9;
                    strFromJson10 = str10;
                case 2:
                    numFromJson = this.intAdapter.fromJson(reader);
                    if (numFromJson == null) {
                        throw c.w("storeId", "storeId", reader);
                    }
                    numFromJson2 = num2;
                    strFromJson = str;
                    strFromJson2 = str2;
                    numFromJson3 = num3;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                    strFromJson9 = str9;
                    strFromJson10 = str10;
                case 3:
                    numFromJson2 = this.intAdapter.fromJson(reader);
                    if (numFromJson2 == null) {
                        throw c.w("terminal", "terminal", reader);
                    }
                    numFromJson = num;
                    strFromJson = str;
                    strFromJson2 = str2;
                    numFromJson3 = num3;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                    strFromJson9 = str9;
                    strFromJson10 = str10;
                case 4:
                    strFromJson3 = this.stringAdapter.fromJson(reader);
                    if (strFromJson3 == null) {
                        throw c.w("eventTimeStamp", "eventTimeStamp", reader);
                    }
                    numFromJson = num;
                    numFromJson2 = num2;
                    strFromJson = str;
                    strFromJson2 = str2;
                    numFromJson3 = num3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                    strFromJson9 = str9;
                    strFromJson10 = str10;
                case 5:
                    strFromJson4 = this.stringAdapter.fromJson(reader);
                    if (strFromJson4 == null) {
                        throw c.w("eventTimeStampUTC", "eventTimeStampUTC", reader);
                    }
                    numFromJson = num;
                    numFromJson2 = num2;
                    strFromJson = str;
                    strFromJson2 = str2;
                    numFromJson3 = num3;
                    strFromJson3 = str3;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                    strFromJson9 = str9;
                    strFromJson10 = str10;
                case 6:
                    strFromJson5 = this.stringAdapter.fromJson(reader);
                    if (strFromJson5 == null) {
                        throw c.w("deviceId", "deviceId", reader);
                    }
                    numFromJson = num;
                    numFromJson2 = num2;
                    strFromJson = str;
                    strFromJson2 = str2;
                    numFromJson3 = num3;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson6 = str6;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                    strFromJson9 = str9;
                    strFromJson10 = str10;
                case 7:
                    strFromJson6 = this.stringAdapter.fromJson(reader);
                    if (strFromJson6 == null) {
                        throw c.w("deviceOS", "deviceOS", reader);
                    }
                    numFromJson = num;
                    numFromJson2 = num2;
                    strFromJson = str;
                    strFromJson2 = str2;
                    numFromJson3 = num3;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                    strFromJson9 = str9;
                    strFromJson10 = str10;
                case 8:
                    strFromJson7 = this.stringAdapter.fromJson(reader);
                    if (strFromJson7 == null) {
                        throw c.w("deviceAppVersion", "deviceAppVersion", reader);
                    }
                    numFromJson = num;
                    numFromJson2 = num2;
                    strFromJson = str;
                    strFromJson2 = str2;
                    numFromJson3 = num3;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    strFromJson8 = str8;
                    strFromJson9 = str9;
                    strFromJson10 = str10;
                case 9:
                    strFromJson8 = this.stringAdapter.fromJson(reader);
                    if (strFromJson8 == null) {
                        throw c.w("deviceOSVersion", "deviceOSVersion", reader);
                    }
                    numFromJson = num;
                    numFromJson2 = num2;
                    strFromJson = str;
                    strFromJson2 = str2;
                    numFromJson3 = num3;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    strFromJson7 = str7;
                    strFromJson9 = str9;
                    strFromJson10 = str10;
                case 10:
                    strFromJson9 = this.stringAdapter.fromJson(reader);
                    if (strFromJson9 == null) {
                        throw c.w("transactionStatus", "transactionStatus", reader);
                    }
                    numFromJson = num;
                    numFromJson2 = num2;
                    strFromJson = str;
                    strFromJson2 = str2;
                    numFromJson3 = num3;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                    strFromJson10 = str10;
                case 11:
                    strFromJson10 = this.stringAdapter.fromJson(reader);
                    if (strFromJson10 == null) {
                        throw c.w("transactionId", "transactionId", reader);
                    }
                    numFromJson = num;
                    numFromJson2 = num2;
                    strFromJson = str;
                    strFromJson2 = str2;
                    numFromJson3 = num3;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                    strFromJson9 = str9;
                case 12:
                    strFromJson11 = this.stringAdapter.fromJson(reader);
                    if (strFromJson11 == null) {
                        throw c.w("trackingId", "trackingId", reader);
                    }
                    numFromJson = num;
                    numFromJson2 = num2;
                    strFromJson = str;
                    strFromJson2 = str2;
                    numFromJson3 = num3;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                    strFromJson9 = str9;
                    strFromJson10 = str10;
                case 13:
                    numFromJson3 = this.intAdapter.fromJson(reader);
                    if (numFromJson3 == null) {
                        throw c.w("transactionNumber", "transactionNumber", reader);
                    }
                    numFromJson = num;
                    numFromJson2 = num2;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                    strFromJson9 = str9;
                    strFromJson10 = str10;
                default:
                    numFromJson = num;
                    numFromJson2 = num2;
                    strFromJson = str;
                    strFromJson2 = str2;
                    numFromJson3 = num3;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    strFromJson7 = str7;
                    strFromJson8 = str8;
                    strFromJson9 = str9;
                    strFromJson10 = str10;
            }
        }
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, TransactionHeaderRequest value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("transactionDateTime");
        this.stringAdapter.toJson(writer, (q) value_.getTransactionDateTime());
        writer.l("transactionDateTimeUTC");
        this.stringAdapter.toJson(writer, (q) value_.getTransactionDateTimeUTC());
        writer.l("storeId");
        this.intAdapter.toJson(writer, (q) Integer.valueOf(value_.getStoreId()));
        writer.l("terminal");
        this.intAdapter.toJson(writer, (q) Integer.valueOf(value_.getTerminal()));
        writer.l("eventTimeStamp");
        this.stringAdapter.toJson(writer, (q) value_.getEventTimeStamp());
        writer.l("eventTimeStampUTC");
        this.stringAdapter.toJson(writer, (q) value_.getEventTimeStampUTC());
        writer.l("deviceId");
        this.stringAdapter.toJson(writer, (q) value_.getDeviceId());
        writer.l("deviceOS");
        this.stringAdapter.toJson(writer, (q) value_.getDeviceOS());
        writer.l("deviceAppVersion");
        this.stringAdapter.toJson(writer, (q) value_.getDeviceAppVersion());
        writer.l("deviceOSVersion");
        this.stringAdapter.toJson(writer, (q) value_.getDeviceOSVersion());
        writer.l("transactionStatus");
        this.stringAdapter.toJson(writer, (q) value_.getTransactionStatus());
        writer.l("transactionId");
        this.stringAdapter.toJson(writer, (q) value_.getTransactionId());
        writer.l("trackingId");
        this.stringAdapter.toJson(writer, (q) value_.getTrackingId());
        writer.l("transactionNumber");
        this.intAdapter.toJson(writer, (q) Integer.valueOf(value_.getTransactionNumber()));
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("TransactionHeaderRequest");
        sb2.append(')');
        return sb2.toString();
    }
}
