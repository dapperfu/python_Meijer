package com.meijer.mobile.home.service.models.mperks;

import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.squareup.moshi.x;
import gu.c;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/meijer/mobile/home/service/models/mperks/MperksDataDtoJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/home/service/models/mperks/MperksDataDto;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/home/service/models/mperks/MperksDataDto;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/home/service/models/mperks/MperksDataDto;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "", "Lcom/meijer/mobile/home/service/models/mperks/AvailableRewardCouponDto;", "listOfAvailableRewardCouponDtoAdapter", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/home/service/models/mperks/ClippedRewardCouponDto;", "listOfClippedRewardCouponDtoAdapter", "", "intAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.home.service.models.mperks.MperksDataDtoJsonAdapter, reason: from toString */
/* loaded from: classes9.dex */
public final class GeneratedJsonAdapter extends h<MperksDataDto> {
    private volatile Constructor<MperksDataDto> constructorRef;
    private final h<Integer> intAdapter;
    private final h<List<AvailableRewardCouponDto>> listOfAvailableRewardCouponDtoAdapter;
    private final h<List<ClippedRewardCouponDto>> listOfClippedRewardCouponDtoAdapter;
    private final k.b options;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("availableRewardCoupons", "clippedRewardCoupons", "pointBalance");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<List<AvailableRewardCouponDto>> hVarF = moshi.f(x.j(List.class, AvailableRewardCouponDto.class), SetsKt.e(), "availableCouponsDto");
        Intrinsics.i(hVarF, "adapter(...)");
        this.listOfAvailableRewardCouponDtoAdapter = hVarF;
        h<List<ClippedRewardCouponDto>> hVarF2 = moshi.f(x.j(List.class, ClippedRewardCouponDto.class), SetsKt.e(), "clippedRewardCouponsDto");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.listOfClippedRewardCouponDtoAdapter = hVarF2;
        h<Integer> hVarF3 = moshi.f(Integer.TYPE, SetsKt.e(), "pointBalance");
        Intrinsics.i(hVarF3, "adapter(...)");
        this.intAdapter = hVarF3;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public MperksDataDto fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(reader, "reader");
        Integer numFromJson = 0;
        reader.b();
        List<AvailableRewardCouponDto> listFromJson = null;
        List<ClippedRewardCouponDto> listFromJson2 = null;
        int i10 = -1;
        while (reader.hasNext()) {
            int iZ = reader.z(this.options);
            if (iZ == -1) {
                reader.H();
                reader.skipValue();
            } else if (iZ == 0) {
                listFromJson = this.listOfAvailableRewardCouponDtoAdapter.fromJson(reader);
                if (listFromJson == null) {
                    throw c.w("availableCouponsDto", "availableRewardCoupons", reader);
                }
                i10 &= -2;
            } else if (iZ == 1) {
                listFromJson2 = this.listOfClippedRewardCouponDtoAdapter.fromJson(reader);
                if (listFromJson2 == null) {
                    throw c.w("clippedRewardCouponsDto", "clippedRewardCoupons", reader);
                }
                i10 &= -3;
            } else if (iZ == 2) {
                numFromJson = this.intAdapter.fromJson(reader);
                if (numFromJson == null) {
                    throw c.w("pointBalance", "pointBalance", reader);
                }
                i10 &= -5;
            } else {
                continue;
            }
        }
        reader.d();
        if (i10 == -8) {
            Intrinsics.h(listFromJson, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.home.service.models.mperks.AvailableRewardCouponDto>");
            Intrinsics.h(listFromJson2, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.home.service.models.mperks.ClippedRewardCouponDto>");
            return new MperksDataDto(listFromJson, listFromJson2, numFromJson.intValue());
        }
        Constructor<MperksDataDto> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = MperksDataDto.class.getDeclaredConstructor(List.class, List.class, cls, cls, c.f134099c);
            this.constructorRef = declaredConstructor;
            Intrinsics.i(declaredConstructor, "also(...)");
        }
        MperksDataDto mperksDataDtoNewInstance = declaredConstructor.newInstance(listFromJson, listFromJson2, numFromJson, Integer.valueOf(i10), null);
        Intrinsics.i(mperksDataDtoNewInstance, "newInstance(...)");
        return mperksDataDtoNewInstance;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, MperksDataDto value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("availableRewardCoupons");
        this.listOfAvailableRewardCouponDtoAdapter.toJson(writer, (q) value_.a());
        writer.l("clippedRewardCoupons");
        this.listOfClippedRewardCouponDtoAdapter.toJson(writer, (q) value_.b());
        writer.l("pointBalance");
        this.intAdapter.toJson(writer, (q) Integer.valueOf(value_.getPointBalance()));
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("MperksDataDto");
        sb2.append(')');
        return sb2.toString();
    }
}
