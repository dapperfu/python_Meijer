package com.meijer.mobile.core.util.moshi;

import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.w;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00000\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00018\u0000H\u0017¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/meijer/mobile/core/util/moshi/InterfaceToConcreteAdapter;", "TInterface", "TConcrete", "Lcom/squareup/moshi/h;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Ljava/lang/Object;", "Lcom/squareup/moshi/q;", "writer", "value", "", "toJson", "(Lcom/squareup/moshi/q;Ljava/lang/Object;)V", "a", "Lcom/squareup/moshi/h;", "adapter", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class InterfaceToConcreteAdapter<TInterface, TConcrete extends TInterface> extends h<TInterface> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h<TConcrete> adapter;

    @Override // com.squareup.moshi.h
    @f
    public TInterface fromJson(k reader) {
        Intrinsics.j(reader, "reader");
        return this.adapter.fromJson(reader);
    }

    @Override // com.squareup.moshi.h
    @w
    public void toJson(q writer, TInterface value) throws IOException {
        Intrinsics.j(writer, "writer");
        this.adapter.toJson(writer, (q) value);
    }
}
