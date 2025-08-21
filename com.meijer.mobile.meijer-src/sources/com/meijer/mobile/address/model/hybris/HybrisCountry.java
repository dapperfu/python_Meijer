package com.meijer.mobile.address.model.hybris;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\f\b\u0001\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001a\u00020\u00002\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0015\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/address/model/hybris/HybrisCountry;", "", "", "Lcom/meijer/mobile/address/model/common/IsoCode;", "isoCode", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/address/model/hybris/HybrisCountry;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class HybrisCountry {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String isoCode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    public HybrisCountry(@g(name = "isocode") String isoCode, @g(name = "name") String str) {
        Intrinsics.j(isoCode, "isoCode");
        this.isoCode = isoCode;
        this.name = str;
    }

    public final HybrisCountry copy(@g(name = "isocode") String isoCode, @g(name = "name") String name) {
        Intrinsics.j(isoCode, "isoCode");
        return new HybrisCountry(isoCode, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisCountry)) {
            return false;
        }
        HybrisCountry hybrisCountry = (HybrisCountry) other;
        return Intrinsics.e(this.isoCode, hybrisCountry.isoCode) && Intrinsics.e(this.name, hybrisCountry.name);
    }

    public int hashCode() {
        int iHashCode = this.isoCode.hashCode() * 31;
        String str = this.name;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "HybrisCountry(isoCode=" + this.isoCode + ", name=" + this.name + ')';
    }

    /* renamed from: a, reason: from getter */
    public final String getIsoCode() {
        return this.isoCode;
    }

    /* renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public /* synthetic */ HybrisCountry(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2);
    }
}
