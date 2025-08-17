package com.meijer.mobile.product.model.hybris.api.models.search;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ2\u0010\n\u001a\u00020\u00002\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/product/model/hybris/api/models/search/HybrisSortDescriptor;", "", "", "Lcom/meijer/mobile/product/model/fulldetails/models/search/SortCode;", "code", "name", "", "isSelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/meijer/mobile/product/model/hybris/api/models/search/HybrisSortDescriptor;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Z", "()Z", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class HybrisSortDescriptor {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSelected;

    public HybrisSortDescriptor() {
        this(null, null, false, 7, null);
    }

    public final HybrisSortDescriptor copy(@g(name = "code") String code, @g(name = "name") String name, @g(name = "selected") boolean isSelected) {
        Intrinsics.j(code, "code");
        Intrinsics.j(name, "name");
        return new HybrisSortDescriptor(code, name, isSelected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisSortDescriptor)) {
            return false;
        }
        HybrisSortDescriptor hybrisSortDescriptor = (HybrisSortDescriptor) other;
        return Intrinsics.e(this.code, hybrisSortDescriptor.code) && Intrinsics.e(this.name, hybrisSortDescriptor.name) && this.isSelected == hybrisSortDescriptor.isSelected;
    }

    public int hashCode() {
        return (((this.code.hashCode() * 31) + this.name.hashCode()) * 31) + Boolean.hashCode(this.isSelected);
    }

    public String toString() {
        return "HybrisSortDescriptor(code=" + this.code + ", name=" + this.name + ", isSelected=" + this.isSelected + ')';
    }

    public HybrisSortDescriptor(@g(name = "code") String code, @g(name = "name") String name, @g(name = "selected") boolean z10) {
        Intrinsics.j(code, "code");
        Intrinsics.j(name, "name");
        this.code = code;
        this.name = name;
        this.isSelected = z10;
    }

    /* renamed from: a, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public /* synthetic */ HybrisSortDescriptor(String str, String str2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? false : z10);
    }
}
