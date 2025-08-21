package com.meijer.mobile.greenville.model.request.item.remove;

import com.meijer.mobile.greenville.model.request.trip.status.TransactionHeaderRequest;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import gu.C14410c;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/greenville/model/request/item/remove/RemoveItemRequestJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/greenville/model/request/item/remove/RemoveItemRequest;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/greenville/model/request/item/remove/RemoveItemRequest;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/greenville/model/request/item/remove/RemoveItemRequest;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "stringAdapter", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/greenville/model/request/trip/status/TransactionHeaderRequest;", "transactionHeaderRequestAdapter", "Lcom/meijer/mobile/greenville/model/request/item/remove/RemoveItemRequestEventData;", "removeItemRequestEventDataAdapter", "greenville_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.greenville.model.request.item.remove.RemoveItemRequestJsonAdapter, reason: from toString */
/* loaded from: classes10.dex */
public final class GeneratedJsonAdapter extends h<RemoveItemRequest> {
    private final k.b options;
    private final h<RemoveItemRequestEventData> removeItemRequestEventDataAdapter;
    private final h<String> stringAdapter;
    private final h<TransactionHeaderRequest> transactionHeaderRequestAdapter;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("type", "header", "eventData");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<String> hVarF = moshi.f(String.class, SetsKt.e(), "type");
        Intrinsics.i(hVarF, "adapter(...)");
        this.stringAdapter = hVarF;
        h<TransactionHeaderRequest> hVarF2 = moshi.f(TransactionHeaderRequest.class, SetsKt.e(), "header");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.transactionHeaderRequestAdapter = hVarF2;
        h<RemoveItemRequestEventData> hVarF3 = moshi.f(RemoveItemRequestEventData.class, SetsKt.e(), "eventData");
        Intrinsics.i(hVarF3, "adapter(...)");
        this.removeItemRequestEventDataAdapter = hVarF3;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public RemoveItemRequest fromJson(k reader) throws IOException {
        Intrinsics.j(reader, "reader");
        reader.b();
        String strFromJson = null;
        TransactionHeaderRequest transactionHeaderRequestFromJson = null;
        RemoveItemRequestEventData removeItemRequestEventDataFromJson = null;
        while (reader.hasNext()) {
            int iZ = reader.z(this.options);
            if (iZ == -1) {
                reader.H();
                reader.skipValue();
            } else if (iZ == 0) {
                strFromJson = this.stringAdapter.fromJson(reader);
                if (strFromJson == null) {
                    throw C14410c.w("type", "type", reader);
                }
            } else if (iZ == 1) {
                transactionHeaderRequestFromJson = this.transactionHeaderRequestAdapter.fromJson(reader);
                if (transactionHeaderRequestFromJson == null) {
                    throw C14410c.w("header_", "header", reader);
                }
            } else if (iZ == 2 && (removeItemRequestEventDataFromJson = this.removeItemRequestEventDataAdapter.fromJson(reader)) == null) {
                throw C14410c.w("eventData", "eventData", reader);
            }
        }
        reader.d();
        if (strFromJson == null) {
            throw C14410c.o("type", "type", reader);
        }
        if (transactionHeaderRequestFromJson == null) {
            throw C14410c.o("header_", "header", reader);
        }
        if (removeItemRequestEventDataFromJson != null) {
            return new RemoveItemRequest(strFromJson, transactionHeaderRequestFromJson, removeItemRequestEventDataFromJson);
        }
        throw C14410c.o("eventData", "eventData", reader);
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, RemoveItemRequest value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("type");
        this.stringAdapter.toJson(writer, (q) value_.getType());
        writer.l("header");
        this.transactionHeaderRequestAdapter.toJson(writer, (q) value_.getHeader());
        writer.l("eventData");
        this.removeItemRequestEventDataAdapter.toJson(writer, (q) value_.getEventData());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(39);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("RemoveItemRequest");
        sb2.append(')');
        return sb2.toString();
    }
}
