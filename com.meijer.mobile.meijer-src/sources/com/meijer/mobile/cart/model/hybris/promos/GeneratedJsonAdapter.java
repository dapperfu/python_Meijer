package com.meijer.mobile.cart.model.hybris.promos;

import com.meijer.mobile.cart.model.hybris.Cart;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import gu.C14410c;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/promos/HybrisApplyPromoCodeResponseJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/cart/model/hybris/promos/HybrisApplyPromoCodeResponse;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/cart/model/hybris/promos/HybrisApplyPromoCodeResponse;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/cart/model/hybris/promos/HybrisApplyPromoCodeResponse;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "Lcom/meijer/mobile/cart/model/hybris/Cart;", "cartAdapter", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/cart/model/hybris/promos/HybrisPromoCodeResponse;", "hybrisPromoCodeResponseAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.cart.model.hybris.promos.HybrisApplyPromoCodeResponseJsonAdapter, reason: from toString */
/* loaded from: classes8.dex */
public final class GeneratedJsonAdapter extends h<HybrisApplyPromoCodeResponse> {
    private final h<Cart> cartAdapter;
    private volatile Constructor<HybrisApplyPromoCodeResponse> constructorRef;
    private final h<HybrisPromoCodeResponse> hybrisPromoCodeResponseAdapter;
    private final k.b options;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("cart", "promo");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<Cart> hVarF = moshi.f(Cart.class, SetsKt.e(), "cart");
        Intrinsics.i(hVarF, "adapter(...)");
        this.cartAdapter = hVarF;
        h<HybrisPromoCodeResponse> hVarF2 = moshi.f(HybrisPromoCodeResponse.class, SetsKt.e(), "promo");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.hybrisPromoCodeResponseAdapter = hVarF2;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public HybrisApplyPromoCodeResponse fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(reader, "reader");
        reader.b();
        Cart cartFromJson = null;
        HybrisPromoCodeResponse hybrisPromoCodeResponseFromJson = null;
        int i10 = -1;
        while (reader.hasNext()) {
            int iZ = reader.z(this.options);
            if (iZ == -1) {
                reader.H();
                reader.skipValue();
            } else if (iZ == 0) {
                cartFromJson = this.cartAdapter.fromJson(reader);
                if (cartFromJson == null) {
                    throw C14410c.w("cart", "cart", reader);
                }
            } else if (iZ == 1) {
                hybrisPromoCodeResponseFromJson = this.hybrisPromoCodeResponseAdapter.fromJson(reader);
                if (hybrisPromoCodeResponseFromJson == null) {
                    throw C14410c.w("promo", "promo", reader);
                }
                i10 = -3;
            } else {
                continue;
            }
        }
        reader.d();
        if (i10 == -3) {
            if (cartFromJson == null) {
                throw C14410c.o("cart", "cart", reader);
            }
            Intrinsics.h(hybrisPromoCodeResponseFromJson, "null cannot be cast to non-null type com.meijer.mobile.cart.model.hybris.promos.HybrisPromoCodeResponse");
            return new HybrisApplyPromoCodeResponse(cartFromJson, hybrisPromoCodeResponseFromJson);
        }
        Constructor<HybrisApplyPromoCodeResponse> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = HybrisApplyPromoCodeResponse.class.getDeclaredConstructor(Cart.class, HybrisPromoCodeResponse.class, Integer.TYPE, C14410c.f134472c);
            this.constructorRef = declaredConstructor;
            Intrinsics.i(declaredConstructor, "also(...)");
        }
        if (cartFromJson == null) {
            throw C14410c.o("cart", "cart", reader);
        }
        HybrisApplyPromoCodeResponse hybrisApplyPromoCodeResponseNewInstance = declaredConstructor.newInstance(cartFromJson, hybrisPromoCodeResponseFromJson, Integer.valueOf(i10), null);
        Intrinsics.i(hybrisApplyPromoCodeResponseNewInstance, "newInstance(...)");
        return hybrisApplyPromoCodeResponseNewInstance;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, HybrisApplyPromoCodeResponse value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("cart");
        this.cartAdapter.toJson(writer, (q) value_.getCart());
        writer.l("promo");
        this.hybrisPromoCodeResponseAdapter.toJson(writer, (q) value_.getPromo());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(50);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("HybrisApplyPromoCodeResponse");
        sb2.append(')');
        return sb2.toString();
    }
}
