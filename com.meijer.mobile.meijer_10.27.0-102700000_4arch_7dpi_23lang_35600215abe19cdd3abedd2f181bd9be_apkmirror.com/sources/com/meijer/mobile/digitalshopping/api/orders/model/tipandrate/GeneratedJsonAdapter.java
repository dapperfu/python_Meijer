package com.meijer.mobile.digitalshopping.api.orders.model.tipandrate;

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
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/orders/model/tipandrate/UpdateTipNotificationRequestJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/digitalshopping/api/orders/model/tipandrate/UpdateTipNotificationRequest;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/digitalshopping/api/orders/model/tipandrate/UpdateTipNotificationRequest;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/digitalshopping/api/orders/model/tipandrate/UpdateTipNotificationRequest;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "stringAdapter", "Lcom/squareup/moshi/h;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.digitalshopping.api.orders.model.tipandrate.UpdateTipNotificationRequestJsonAdapter, reason: from toString */
/* loaded from: classes9.dex */
public final class GeneratedJsonAdapter extends h<UpdateTipNotificationRequest> {
    private volatile Constructor<UpdateTipNotificationRequest> constructorRef;
    private final k.b options;
    private final h<String> stringAdapter;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("externalShopperId", "orderId", "modalState");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<String> hVarF = moshi.f(String.class, SetsKt.e(), "externalShopperId");
        Intrinsics.i(hVarF, "adapter(...)");
        this.stringAdapter = hVarF;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public UpdateTipNotificationRequest fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(reader, "reader");
        reader.b();
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        int i10 = -1;
        while (reader.hasNext()) {
            int iZ = reader.z(this.options);
            if (iZ == -1) {
                reader.H();
                reader.skipValue();
            } else if (iZ == 0) {
                strFromJson = this.stringAdapter.fromJson(reader);
                if (strFromJson == null) {
                    throw c.w("externalShopperId", "externalShopperId", reader);
                }
            } else if (iZ == 1) {
                strFromJson2 = this.stringAdapter.fromJson(reader);
                if (strFromJson2 == null) {
                    throw c.w("orderId", "orderId", reader);
                }
            } else if (iZ == 2) {
                strFromJson3 = this.stringAdapter.fromJson(reader);
                if (strFromJson3 == null) {
                    throw c.w("modalState", "modalState", reader);
                }
                i10 = -5;
            } else {
                continue;
            }
        }
        reader.d();
        if (i10 == -5) {
            if (strFromJson == null) {
                throw c.o("externalShopperId", "externalShopperId", reader);
            }
            if (strFromJson2 == null) {
                throw c.o("orderId", "orderId", reader);
            }
            Intrinsics.h(strFromJson3, "null cannot be cast to non-null type kotlin.String");
            return new UpdateTipNotificationRequest(strFromJson, strFromJson2, strFromJson3);
        }
        Constructor<UpdateTipNotificationRequest> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = UpdateTipNotificationRequest.class.getDeclaredConstructor(String.class, String.class, String.class, Integer.TYPE, c.f134099c);
            this.constructorRef = declaredConstructor;
            Intrinsics.i(declaredConstructor, "also(...)");
        }
        if (strFromJson == null) {
            throw c.o("externalShopperId", "externalShopperId", reader);
        }
        if (strFromJson2 == null) {
            throw c.o("orderId", "orderId", reader);
        }
        UpdateTipNotificationRequest updateTipNotificationRequestNewInstance = declaredConstructor.newInstance(strFromJson, strFromJson2, strFromJson3, Integer.valueOf(i10), null);
        Intrinsics.i(updateTipNotificationRequestNewInstance, "newInstance(...)");
        return updateTipNotificationRequestNewInstance;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, UpdateTipNotificationRequest value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("externalShopperId");
        this.stringAdapter.toJson(writer, (q) value_.getExternalShopperId());
        writer.l("orderId");
        this.stringAdapter.toJson(writer, (q) value_.getOrderId());
        writer.l("modalState");
        this.stringAdapter.toJson(writer, (q) value_.getModalState());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(50);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("UpdateTipNotificationRequest");
        sb2.append(')');
        return sb2.toString();
    }
}
