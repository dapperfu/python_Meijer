package com.meijer.mobile.product.model.hybris.api.models.nutrition;

import com.meijer.mobile.core.util.moshi.Stringable;
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

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/meijer/mobile/product/model/hybris/api/models/nutrition/HybrisNutritionLabelJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/product/model/hybris/api/models/nutrition/HybrisNutritionLabel;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/product/model/hybris/api/models/nutrition/HybrisNutritionLabel;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/product/model/hybris/api/models/nutrition/HybrisNutritionLabel;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "Lcom/meijer/mobile/product/model/hybris/api/models/nutrition/HybrisNutritionLabelHeader;", "hybrisNutritionLabelHeaderAtStringableAdapter", "Lcom/squareup/moshi/h;", "", "Lcom/meijer/mobile/product/model/hybris/api/models/nutrition/HybrisNutrient;", "listOfHybrisNutrientAtStringableAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.product.model.hybris.api.models.nutrition.HybrisNutritionLabelJsonAdapter, reason: from toString */
/* loaded from: classes11.dex */
public final class GeneratedJsonAdapter extends h<HybrisNutritionLabel> {
    private volatile Constructor<HybrisNutritionLabel> constructorRef;
    private final h<HybrisNutritionLabelHeader> hybrisNutritionLabelHeaderAtStringableAdapter;
    private final h<List<HybrisNutrient>> listOfHybrisNutrientAtStringableAdapter;
    private final k.b options;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("header", "main", "vitamins", "minerals", "micronutrients");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<HybrisNutritionLabelHeader> hVarF = moshi.f(HybrisNutritionLabelHeader.class, SetsKt.d(new Stringable() { // from class: com.meijer.mobile.product.model.hybris.api.models.nutrition.HybrisNutritionLabelJsonAdapter.a
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return Stringable.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return obj instanceof Stringable;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return 0;
            }

            @Override // java.lang.annotation.Annotation
            public final String toString() {
                return "@com.meijer.mobile.core.util.moshi.Stringable()";
            }
        }), "header");
        Intrinsics.i(hVarF, "adapter(...)");
        this.hybrisNutritionLabelHeaderAtStringableAdapter = hVarF;
        h<List<HybrisNutrient>> hVarF2 = moshi.f(x.j(List.class, HybrisNutrient.class), SetsKt.d(new Stringable() { // from class: com.meijer.mobile.product.model.hybris.api.models.nutrition.HybrisNutritionLabelJsonAdapter.a
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return Stringable.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return obj instanceof Stringable;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return 0;
            }

            @Override // java.lang.annotation.Annotation
            public final String toString() {
                return "@com.meijer.mobile.core.util.moshi.Stringable()";
            }
        }), "nutrients");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.listOfHybrisNutrientAtStringableAdapter = hVarF2;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public HybrisNutritionLabel fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(reader, "reader");
        reader.b();
        HybrisNutritionLabelHeader hybrisNutritionLabelHeaderFromJson = null;
        List<HybrisNutrient> listFromJson = null;
        List<HybrisNutrient> listFromJson2 = null;
        List<HybrisNutrient> listFromJson3 = null;
        List<HybrisNutrient> listFromJson4 = null;
        int i10 = -1;
        while (reader.hasNext()) {
            int iZ = reader.z(this.options);
            if (iZ == -1) {
                reader.H();
                reader.skipValue();
            } else if (iZ == 0) {
                hybrisNutritionLabelHeaderFromJson = this.hybrisNutritionLabelHeaderAtStringableAdapter.fromJson(reader);
                if (hybrisNutritionLabelHeaderFromJson == null) {
                    throw c.w("header_", "header", reader);
                }
                i10 &= -2;
            } else if (iZ == 1) {
                listFromJson = this.listOfHybrisNutrientAtStringableAdapter.fromJson(reader);
                if (listFromJson == null) {
                    throw c.w("nutrients", "main", reader);
                }
                i10 &= -3;
            } else if (iZ == 2) {
                listFromJson2 = this.listOfHybrisNutrientAtStringableAdapter.fromJson(reader);
                if (listFromJson2 == null) {
                    throw c.w("vitamins", "vitamins", reader);
                }
                i10 &= -5;
            } else if (iZ == 3) {
                listFromJson3 = this.listOfHybrisNutrientAtStringableAdapter.fromJson(reader);
                if (listFromJson3 == null) {
                    throw c.w("minerals", "minerals", reader);
                }
                i10 &= -9;
            } else if (iZ == 4) {
                listFromJson4 = this.listOfHybrisNutrientAtStringableAdapter.fromJson(reader);
                if (listFromJson4 == null) {
                    throw c.w("micronutrients", "micronutrients", reader);
                }
                i10 &= -17;
            } else {
                continue;
            }
        }
        reader.d();
        if (i10 != -32) {
            Constructor<HybrisNutritionLabel> declaredConstructor = this.constructorRef;
            if (declaredConstructor == null) {
                declaredConstructor = HybrisNutritionLabel.class.getDeclaredConstructor(HybrisNutritionLabelHeader.class, List.class, List.class, List.class, List.class, Integer.TYPE, c.f134099c);
                this.constructorRef = declaredConstructor;
                Intrinsics.i(declaredConstructor, "also(...)");
            }
            HybrisNutritionLabel hybrisNutritionLabelNewInstance = declaredConstructor.newInstance(hybrisNutritionLabelHeaderFromJson, listFromJson, listFromJson2, listFromJson3, listFromJson4, Integer.valueOf(i10), null);
            Intrinsics.i(hybrisNutritionLabelNewInstance, "newInstance(...)");
            return hybrisNutritionLabelNewInstance;
        }
        Intrinsics.h(hybrisNutritionLabelHeaderFromJson, "null cannot be cast to non-null type com.meijer.mobile.product.model.hybris.api.models.nutrition.HybrisNutritionLabelHeader");
        Intrinsics.h(listFromJson, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.product.model.hybris.api.models.nutrition.HybrisNutrient>");
        Intrinsics.h(listFromJson2, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.product.model.hybris.api.models.nutrition.HybrisNutrient>");
        Intrinsics.h(listFromJson3, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.product.model.hybris.api.models.nutrition.HybrisNutrient>");
        Intrinsics.h(listFromJson4, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.product.model.hybris.api.models.nutrition.HybrisNutrient>");
        List<HybrisNutrient> list = listFromJson4;
        List<HybrisNutrient> list2 = listFromJson3;
        return new HybrisNutritionLabel(hybrisNutritionLabelHeaderFromJson, listFromJson, listFromJson2, list2, list);
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, HybrisNutritionLabel value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("header");
        this.hybrisNutritionLabelHeaderAtStringableAdapter.toJson(writer, (q) value_.getHeader());
        writer.l("main");
        this.listOfHybrisNutrientAtStringableAdapter.toJson(writer, (q) value_.d());
        writer.l("vitamins");
        this.listOfHybrisNutrientAtStringableAdapter.toJson(writer, (q) value_.e());
        writer.l("minerals");
        this.listOfHybrisNutrientAtStringableAdapter.toJson(writer, (q) value_.c());
        writer.l("micronutrients");
        this.listOfHybrisNutrientAtStringableAdapter.toJson(writer, (q) value_.b());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(42);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("HybrisNutritionLabel");
        sb2.append(')');
        return sb2.toString();
    }
}
