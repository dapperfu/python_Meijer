package com.meijer.mobile.instoreshopping.service.productimages.model.request;

import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.squareup.moshi.x;
import gu.C14410c;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/instoreshopping/service/productimages/model/request/EDaAProductImageRequestJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/instoreshopping/service/productimages/model/request/EDaAProductImageRequest;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/instoreshopping/service/productimages/model/request/EDaAProductImageRequest;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/instoreshopping/service/productimages/model/request/EDaAProductImageRequest;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "", "listOfStringAdapter", "Lcom/squareup/moshi/h;", "instoreshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.instoreshopping.service.productimages.model.request.EDaAProductImageRequestJsonAdapter, reason: from toString */
/* loaded from: classes10.dex */
public final class GeneratedJsonAdapter extends h<EDaAProductImageRequest> {
    private final h<List<String>> listOfStringAdapter;
    private final k.b options;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("ItemSku");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<List<String>> hVarF = moshi.f(x.j(List.class, String.class), SetsKt.e(), "itemSku");
        Intrinsics.i(hVarF, "adapter(...)");
        this.listOfStringAdapter = hVarF;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public EDaAProductImageRequest fromJson(k reader) throws IOException {
        Intrinsics.j(reader, "reader");
        reader.b();
        List<String> listFromJson = null;
        while (reader.hasNext()) {
            int iZ = reader.z(this.options);
            if (iZ == -1) {
                reader.H();
                reader.skipValue();
            } else if (iZ == 0 && (listFromJson = this.listOfStringAdapter.fromJson(reader)) == null) {
                throw C14410c.w("itemSku", "ItemSku", reader);
            }
        }
        reader.d();
        if (listFromJson != null) {
            return new EDaAProductImageRequest(listFromJson);
        }
        throw C14410c.o("itemSku", "ItemSku", reader);
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, EDaAProductImageRequest value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("ItemSku");
        this.listOfStringAdapter.toJson(writer, (q) value_.a());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(45);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("EDaAProductImageRequest");
        sb2.append(')');
        return sb2.toString();
    }
}
