package com.meijer.mobile.greenville.model.response;

import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.squareup.moshi.x;
import gu.C14410c;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/meijer/mobile/greenville/model/response/TransactionResponseJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/greenville/model/response/TransactionResponse;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/greenville/model/response/TransactionResponse;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/greenville/model/response/TransactionResponse;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "Lcom/meijer/mobile/greenville/model/response/TransactionHeaderResponse;", "nullableTransactionHeaderResponseAdapter", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/greenville/model/response/TransactionObjectResponse;", "nullableTransactionObjectResponseAdapter", "", "Lcom/meijer/mobile/greenville/model/response/SpecialItemResponse;", "nullableListOfSpecialItemResponseAdapter", "Lcom/meijer/mobile/greenville/model/response/RejectedBarcodeResponse;", "nullableRejectedBarcodeResponseAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "greenville_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.greenville.model.response.TransactionResponseJsonAdapter, reason: from toString */
/* loaded from: classes10.dex */
public final class GeneratedJsonAdapter extends h<TransactionResponse> {
    private volatile Constructor<TransactionResponse> constructorRef;
    private final h<List<SpecialItemResponse>> nullableListOfSpecialItemResponseAdapter;
    private final h<RejectedBarcodeResponse> nullableRejectedBarcodeResponseAdapter;
    private final h<String> nullableStringAdapter;
    private final h<TransactionHeaderResponse> nullableTransactionHeaderResponseAdapter;
    private final h<TransactionObjectResponse> nullableTransactionObjectResponseAdapter;
    private final k.b options;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("transactionHeader", "transactionObject", "specialItems", "customerMessage", "error");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<TransactionHeaderResponse> hVarF = moshi.f(TransactionHeaderResponse.class, SetsKt.e(), "transactionHeader");
        Intrinsics.i(hVarF, "adapter(...)");
        this.nullableTransactionHeaderResponseAdapter = hVarF;
        h<TransactionObjectResponse> hVarF2 = moshi.f(TransactionObjectResponse.class, SetsKt.e(), "transactionObject");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.nullableTransactionObjectResponseAdapter = hVarF2;
        h<List<SpecialItemResponse>> hVarF3 = moshi.f(x.j(List.class, SpecialItemResponse.class), SetsKt.e(), "specialItems");
        Intrinsics.i(hVarF3, "adapter(...)");
        this.nullableListOfSpecialItemResponseAdapter = hVarF3;
        h<RejectedBarcodeResponse> hVarF4 = moshi.f(RejectedBarcodeResponse.class, SetsKt.e(), "rejectedBarcode");
        Intrinsics.i(hVarF4, "adapter(...)");
        this.nullableRejectedBarcodeResponseAdapter = hVarF4;
        h<String> hVarF5 = moshi.f(String.class, SetsKt.e(), "error");
        Intrinsics.i(hVarF5, "adapter(...)");
        this.nullableStringAdapter = hVarF5;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public TransactionResponse fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(reader, "reader");
        reader.b();
        TransactionHeaderResponse transactionHeaderResponseFromJson = null;
        TransactionObjectResponse transactionObjectResponseFromJson = null;
        List<SpecialItemResponse> listFromJson = null;
        RejectedBarcodeResponse rejectedBarcodeResponseFromJson = null;
        String strFromJson = null;
        int i10 = -1;
        while (reader.hasNext()) {
            int iZ = reader.z(this.options);
            if (iZ == -1) {
                reader.H();
                reader.skipValue();
            } else if (iZ == 0) {
                transactionHeaderResponseFromJson = this.nullableTransactionHeaderResponseAdapter.fromJson(reader);
                i10 &= -2;
            } else if (iZ == 1) {
                transactionObjectResponseFromJson = this.nullableTransactionObjectResponseAdapter.fromJson(reader);
                i10 &= -3;
            } else if (iZ == 2) {
                listFromJson = this.nullableListOfSpecialItemResponseAdapter.fromJson(reader);
                i10 &= -5;
            } else if (iZ == 3) {
                rejectedBarcodeResponseFromJson = this.nullableRejectedBarcodeResponseAdapter.fromJson(reader);
                i10 &= -9;
            } else if (iZ == 4) {
                strFromJson = this.nullableStringAdapter.fromJson(reader);
                i10 &= -17;
            }
        }
        reader.d();
        if (i10 == -32) {
            String str = strFromJson;
            RejectedBarcodeResponse rejectedBarcodeResponse = rejectedBarcodeResponseFromJson;
            return new TransactionResponse(transactionHeaderResponseFromJson, transactionObjectResponseFromJson, listFromJson, rejectedBarcodeResponse, str);
        }
        String str2 = strFromJson;
        RejectedBarcodeResponse rejectedBarcodeResponse2 = rejectedBarcodeResponseFromJson;
        List<SpecialItemResponse> list = listFromJson;
        TransactionObjectResponse transactionObjectResponse = transactionObjectResponseFromJson;
        TransactionHeaderResponse transactionHeaderResponse = transactionHeaderResponseFromJson;
        Constructor<TransactionResponse> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = TransactionResponse.class.getDeclaredConstructor(TransactionHeaderResponse.class, TransactionObjectResponse.class, List.class, RejectedBarcodeResponse.class, String.class, Integer.TYPE, C14410c.f134472c);
            this.constructorRef = declaredConstructor;
            Intrinsics.i(declaredConstructor, "also(...)");
        }
        TransactionResponse transactionResponseNewInstance = declaredConstructor.newInstance(transactionHeaderResponse, transactionObjectResponse, list, rejectedBarcodeResponse2, str2, Integer.valueOf(i10), null);
        Intrinsics.i(transactionResponseNewInstance, "newInstance(...)");
        return transactionResponseNewInstance;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, TransactionResponse value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("transactionHeader");
        this.nullableTransactionHeaderResponseAdapter.toJson(writer, (q) value_.getTransactionHeader());
        writer.l("transactionObject");
        this.nullableTransactionObjectResponseAdapter.toJson(writer, (q) value_.getTransactionObject());
        writer.l("specialItems");
        this.nullableListOfSpecialItemResponseAdapter.toJson(writer, (q) value_.c());
        writer.l("customerMessage");
        this.nullableRejectedBarcodeResponseAdapter.toJson(writer, (q) value_.getRejectedBarcode());
        writer.l("error");
        this.nullableStringAdapter.toJson(writer, (q) value_.getError());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("TransactionResponse");
        sb2.append(')');
        return sb2.toString();
    }
}
