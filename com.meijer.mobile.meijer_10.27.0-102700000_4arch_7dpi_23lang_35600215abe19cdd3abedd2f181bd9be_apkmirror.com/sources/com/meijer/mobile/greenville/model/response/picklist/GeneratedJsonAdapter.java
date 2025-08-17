package com.meijer.mobile.greenville.model.response.picklist;

import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.squareup.moshi.x;
import gu.c;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/meijer/mobile/greenville/model/response/picklist/PickListItemListResponseJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/greenville/model/response/picklist/PickListItemListResponse;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/greenville/model/response/picklist/PickListItemListResponse;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/greenville/model/response/picklist/PickListItemListResponse;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "", "booleanAdapter", "Lcom/squareup/moshi/h;", "", "Lcom/meijer/mobile/greenville/model/response/picklist/PicklistItemResponse;", "listOfPicklistItemResponseAdapter", "Lcom/meijer/mobile/greenville/model/response/picklist/PicklistGroupResponse;", "listOfPicklistGroupResponseAdapter", "greenville_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.greenville.model.response.picklist.PickListItemListResponseJsonAdapter, reason: from toString */
/* loaded from: classes9.dex */
public final class GeneratedJsonAdapter extends h<PickListItemListResponse> {
    private final h<Boolean> booleanAdapter;
    private final h<List<PicklistGroupResponse>> listOfPicklistGroupResponseAdapter;
    private final h<List<PicklistItemResponse>> listOfPicklistItemResponseAdapter;
    private final k.b options;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("isSyncRequired", "items", "groups");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<Boolean> hVarF = moshi.f(Boolean.TYPE, SetsKt.e(), "isSyncRequired");
        Intrinsics.i(hVarF, "adapter(...)");
        this.booleanAdapter = hVarF;
        h<List<PicklistItemResponse>> hVarF2 = moshi.f(x.j(List.class, PicklistItemResponse.class), SetsKt.e(), "items");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.listOfPicklistItemResponseAdapter = hVarF2;
        h<List<PicklistGroupResponse>> hVarF3 = moshi.f(x.j(List.class, PicklistGroupResponse.class), SetsKt.e(), "groups");
        Intrinsics.i(hVarF3, "adapter(...)");
        this.listOfPicklistGroupResponseAdapter = hVarF3;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public PickListItemListResponse fromJson(k reader) throws IOException {
        Intrinsics.j(reader, "reader");
        reader.b();
        Boolean boolFromJson = null;
        List<PicklistItemResponse> listFromJson = null;
        List<PicklistGroupResponse> listFromJson2 = null;
        while (reader.hasNext()) {
            int iZ = reader.z(this.options);
            if (iZ == -1) {
                reader.H();
                reader.skipValue();
            } else if (iZ == 0) {
                boolFromJson = this.booleanAdapter.fromJson(reader);
                if (boolFromJson == null) {
                    throw c.w("isSyncRequired", "isSyncRequired", reader);
                }
            } else if (iZ == 1) {
                listFromJson = this.listOfPicklistItemResponseAdapter.fromJson(reader);
                if (listFromJson == null) {
                    throw c.w("items", "items", reader);
                }
            } else if (iZ == 2 && (listFromJson2 = this.listOfPicklistGroupResponseAdapter.fromJson(reader)) == null) {
                throw c.w("groups", "groups", reader);
            }
        }
        reader.d();
        if (boolFromJson == null) {
            throw c.o("isSyncRequired", "isSyncRequired", reader);
        }
        boolean zBooleanValue = boolFromJson.booleanValue();
        if (listFromJson == null) {
            throw c.o("items", "items", reader);
        }
        if (listFromJson2 != null) {
            return new PickListItemListResponse(zBooleanValue, listFromJson, listFromJson2);
        }
        throw c.o("groups", "groups", reader);
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, PickListItemListResponse value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("isSyncRequired");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getIsSyncRequired()));
        writer.l("items");
        this.listOfPicklistItemResponseAdapter.toJson(writer, (q) value_.b());
        writer.l("groups");
        this.listOfPicklistGroupResponseAdapter.toJson(writer, (q) value_.a());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("PickListItemListResponse");
        sb2.append(')');
        return sb2.toString();
    }
}
