package com.meijer.mobile.core.models.coupon;

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

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/core/models/coupon/CouponAdJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/core/models/coupon/CouponAd;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/core/models/coupon/CouponAd;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/core/models/coupon/CouponAd;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "nullableStringAdapter", "Lcom/squareup/moshi/h;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.core.models.coupon.CouponAdJsonAdapter, reason: from toString */
/* loaded from: classes8.dex */
public final class GeneratedJsonAdapter extends h<CouponAd> {
    private volatile Constructor<CouponAd> constructorRef;
    private final h<String> nullableStringAdapter;
    private final k.b options;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("title", "imageUrl", "bundleTag", "analyticTag", "imageDescription");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<String> hVarF = moshi.f(String.class, SetsKt.e(), "title");
        Intrinsics.i(hVarF, "adapter(...)");
        this.nullableStringAdapter = hVarF;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public CouponAd fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(reader, "reader");
        reader.b();
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        String strFromJson4 = null;
        String strFromJson5 = null;
        int i10 = -1;
        while (reader.hasNext()) {
            int iZ = reader.z(this.options);
            if (iZ == -1) {
                reader.H();
                reader.skipValue();
            } else if (iZ == 0) {
                strFromJson = this.nullableStringAdapter.fromJson(reader);
                i10 &= -2;
            } else if (iZ == 1) {
                strFromJson2 = this.nullableStringAdapter.fromJson(reader);
                i10 &= -3;
            } else if (iZ == 2) {
                strFromJson3 = this.nullableStringAdapter.fromJson(reader);
                i10 &= -5;
            } else if (iZ == 3) {
                strFromJson4 = this.nullableStringAdapter.fromJson(reader);
                i10 &= -9;
            } else if (iZ == 4) {
                strFromJson5 = this.nullableStringAdapter.fromJson(reader);
                i10 &= -17;
            }
        }
        reader.d();
        if (i10 == -32) {
            String str = strFromJson5;
            String str2 = strFromJson4;
            return new CouponAd(strFromJson, strFromJson2, strFromJson3, str2, str);
        }
        String str3 = strFromJson5;
        String str4 = strFromJson4;
        String str5 = strFromJson3;
        String str6 = strFromJson2;
        String str7 = strFromJson;
        Constructor<CouponAd> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = CouponAd.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, Integer.TYPE, C14410c.f134472c);
            this.constructorRef = declaredConstructor;
            Intrinsics.i(declaredConstructor, "also(...)");
        }
        CouponAd couponAdNewInstance = declaredConstructor.newInstance(str7, str6, str5, str4, str3, Integer.valueOf(i10), null);
        Intrinsics.i(couponAdNewInstance, "newInstance(...)");
        return couponAdNewInstance;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, CouponAd value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("title");
        this.nullableStringAdapter.toJson(writer, (q) value_.getTitle());
        writer.l("imageUrl");
        this.nullableStringAdapter.toJson(writer, (q) value_.getImageURL());
        writer.l("bundleTag");
        this.nullableStringAdapter.toJson(writer, (q) value_.getBundleTag());
        writer.l("analyticTag");
        this.nullableStringAdapter.toJson(writer, (q) value_.getAnalyticTag());
        writer.l("imageDescription");
        this.nullableStringAdapter.toJson(writer, (q) value_.getImageDescription());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("CouponAd");
        sb2.append(')');
        return sb2.toString();
    }
}
