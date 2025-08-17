package com.meijer.mobile.core.models.store;

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

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/core/models/store/StoreDeliveryPriceJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/core/models/store/StoreDeliveryPrice;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/core/models/store/StoreDeliveryPrice;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/core/models/store/StoreDeliveryPrice;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "", "Lcom/meijer/mobile/core/models/store/BunchaItem;", "listOfBunchaItemAdapter", "Lcom/squareup/moshi/h;", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.core.models.store.StoreDeliveryPriceJsonAdapter, reason: from toString */
/* loaded from: classes7.dex */
public final class GeneratedJsonAdapter extends h<StoreDeliveryPrice> {
    private final h<List<BunchaItem>> listOfBunchaItemAdapter;
    private final k.b options;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("BUNCHA");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<List<BunchaItem>> hVarF = moshi.f(x.j(List.class, BunchaItem.class), SetsKt.e(), "bunchaItems");
        Intrinsics.i(hVarF, "adapter(...)");
        this.listOfBunchaItemAdapter = hVarF;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public StoreDeliveryPrice fromJson(k reader) throws IOException {
        Intrinsics.j(reader, "reader");
        reader.b();
        List<BunchaItem> listFromJson = null;
        while (reader.hasNext()) {
            int iZ = reader.z(this.options);
            if (iZ == -1) {
                reader.H();
                reader.skipValue();
            } else if (iZ == 0 && (listFromJson = this.listOfBunchaItemAdapter.fromJson(reader)) == null) {
                throw c.w("bunchaItems", "BUNCHA", reader);
            }
        }
        reader.d();
        if (listFromJson != null) {
            return new StoreDeliveryPrice(listFromJson);
        }
        throw c.o("bunchaItems", "BUNCHA", reader);
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, StoreDeliveryPrice value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("BUNCHA");
        this.listOfBunchaItemAdapter.toJson(writer, (q) value_.a());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("StoreDeliveryPrice");
        sb2.append(')');
        return sb2.toString();
    }
}
