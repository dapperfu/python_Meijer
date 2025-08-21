package com.meijer.mobile.product.model.hybris.api.models.nutrition;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/product/model/hybris/api/models/nutrition/HybrisServingSize;", "", "", "value", "unitOfMeasure", "", "index", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "copy", "(Ljava/lang/String;Ljava/lang/String;I)Lcom/meijer/mobile/product/model/hybris/api/models/nutrition/HybrisServingSize;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "I", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class HybrisServingSize {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String value;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String unitOfMeasure;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int index;

    public HybrisServingSize() {
        this(null, null, 0, 7, null);
    }

    public final HybrisServingSize copy(@g(name = "v") String value, @g(name = "u") String unitOfMeasure, @g(name = "i") int index) {
        Intrinsics.j(value, "value");
        Intrinsics.j(unitOfMeasure, "unitOfMeasure");
        return new HybrisServingSize(value, unitOfMeasure, index);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisServingSize)) {
            return false;
        }
        HybrisServingSize hybrisServingSize = (HybrisServingSize) other;
        return Intrinsics.e(this.value, hybrisServingSize.value) && Intrinsics.e(this.unitOfMeasure, hybrisServingSize.unitOfMeasure) && this.index == hybrisServingSize.index;
    }

    public int hashCode() {
        return (((this.value.hashCode() * 31) + this.unitOfMeasure.hashCode()) * 31) + Integer.hashCode(this.index);
    }

    public String toString() {
        return "HybrisServingSize(value=" + this.value + ", unitOfMeasure=" + this.unitOfMeasure + ", index=" + this.index + ')';
    }

    public HybrisServingSize(@g(name = "v") String value, @g(name = "u") String unitOfMeasure, @g(name = "i") int i10) {
        Intrinsics.j(value, "value");
        Intrinsics.j(unitOfMeasure, "unitOfMeasure");
        this.value = value;
        this.unitOfMeasure = unitOfMeasure;
        this.index = i10;
    }

    /* renamed from: a, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* renamed from: b, reason: from getter */
    public final String getUnitOfMeasure() {
        return this.unitOfMeasure;
    }

    /* renamed from: c, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public /* synthetic */ HybrisServingSize(String str, String str2, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? 0 : i10);
    }
}
