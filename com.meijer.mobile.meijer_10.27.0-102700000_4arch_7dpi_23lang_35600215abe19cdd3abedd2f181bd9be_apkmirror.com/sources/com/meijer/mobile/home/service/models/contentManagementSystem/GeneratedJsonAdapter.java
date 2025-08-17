package com.meijer.mobile.home.service.models.contentManagementSystem;

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

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/meijer/mobile/home/service/models/contentManagementSystem/HomeCMSBannerResponseJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/home/service/models/contentManagementSystem/HomeCMSBannerResponse;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/home/service/models/contentManagementSystem/HomeCMSBannerResponse;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/home/service/models/contentManagementSystem/HomeCMSBannerResponse;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "", "Lcom/meijer/mobile/home/service/models/contentManagementSystem/CMSBanner;", "nullableListOfCMSBannerAdapter", "Lcom/squareup/moshi/h;", "nullableCMSBannerAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.home.service.models.contentManagementSystem.HomeCMSBannerResponseJsonAdapter, reason: from toString */
/* loaded from: classes9.dex */
public final class GeneratedJsonAdapter extends h<HomeCMSBannerResponse> {
    private volatile Constructor<HomeCMSBannerResponse> constructorRef;
    private final h<CMSBanner> nullableCMSBannerAdapter;
    private final h<List<CMSBanner>> nullableListOfCMSBannerAdapter;
    private final h<String> nullableStringAdapter;
    private final k.b options;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("bottomBanners", "topBanner", "specialOffersBannerURL");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<List<CMSBanner>> hVarF = moshi.f(x.j(List.class, CMSBanner.class), SetsKt.e(), "bottomBanners");
        Intrinsics.i(hVarF, "adapter(...)");
        this.nullableListOfCMSBannerAdapter = hVarF;
        h<CMSBanner> hVarF2 = moshi.f(CMSBanner.class, SetsKt.e(), "topBanner");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.nullableCMSBannerAdapter = hVarF2;
        h<String> hVarF3 = moshi.f(String.class, SetsKt.e(), "specialOffersBannerURL");
        Intrinsics.i(hVarF3, "adapter(...)");
        this.nullableStringAdapter = hVarF3;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public HomeCMSBannerResponse fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(reader, "reader");
        reader.b();
        List<CMSBanner> listFromJson = null;
        CMSBanner cMSBannerFromJson = null;
        String strFromJson = null;
        int i10 = -1;
        while (reader.hasNext()) {
            int iZ = reader.z(this.options);
            if (iZ == -1) {
                reader.H();
                reader.skipValue();
            } else if (iZ == 0) {
                listFromJson = this.nullableListOfCMSBannerAdapter.fromJson(reader);
                i10 &= -2;
            } else if (iZ == 1) {
                cMSBannerFromJson = this.nullableCMSBannerAdapter.fromJson(reader);
                i10 &= -3;
            } else if (iZ == 2) {
                strFromJson = this.nullableStringAdapter.fromJson(reader);
                i10 &= -5;
            }
        }
        reader.d();
        if (i10 == -8) {
            return new HomeCMSBannerResponse(listFromJson, cMSBannerFromJson, strFromJson);
        }
        Constructor<HomeCMSBannerResponse> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = HomeCMSBannerResponse.class.getDeclaredConstructor(List.class, CMSBanner.class, String.class, Integer.TYPE, c.f134099c);
            this.constructorRef = declaredConstructor;
            Intrinsics.i(declaredConstructor, "also(...)");
        }
        HomeCMSBannerResponse homeCMSBannerResponseNewInstance = declaredConstructor.newInstance(listFromJson, cMSBannerFromJson, strFromJson, Integer.valueOf(i10), null);
        Intrinsics.i(homeCMSBannerResponseNewInstance, "newInstance(...)");
        return homeCMSBannerResponseNewInstance;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, HomeCMSBannerResponse value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("bottomBanners");
        this.nullableListOfCMSBannerAdapter.toJson(writer, (q) value_.a());
        writer.l("topBanner");
        this.nullableCMSBannerAdapter.toJson(writer, (q) value_.getTopBanner());
        writer.l("specialOffersBannerURL");
        this.nullableStringAdapter.toJson(writer, (q) value_.getSpecialOffersBannerURL());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(43);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("HomeCMSBannerResponse");
        sb2.append(')');
        return sb2.toString();
    }
}
