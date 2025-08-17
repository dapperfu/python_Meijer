package com.meijer.mobile.address.model.hybris;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ>\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0014\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/address/model/hybris/HybrisRegion;", "", "", "isoCode", "name", "isoCodeShort", "countryIso", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/address/model/hybris/HybrisRegion;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class HybrisRegion {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String isoCode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String isoCodeShort;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String countryIso;

    public HybrisRegion(@g(name = "isocode") String isoCode, @g(name = "name") String str, @g(name = "isocodeShort") String str2, @g(name = "countryIso") String str3) {
        Intrinsics.j(isoCode, "isoCode");
        this.isoCode = isoCode;
        this.name = str;
        this.isoCodeShort = str2;
        this.countryIso = str3;
    }

    public final HybrisRegion copy(@g(name = "isocode") String isoCode, @g(name = "name") String name, @g(name = "isocodeShort") String isoCodeShort, @g(name = "countryIso") String countryIso) {
        Intrinsics.j(isoCode, "isoCode");
        return new HybrisRegion(isoCode, name, isoCodeShort, countryIso);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisRegion)) {
            return false;
        }
        HybrisRegion hybrisRegion = (HybrisRegion) other;
        return Intrinsics.e(this.isoCode, hybrisRegion.isoCode) && Intrinsics.e(this.name, hybrisRegion.name) && Intrinsics.e(this.isoCodeShort, hybrisRegion.isoCodeShort) && Intrinsics.e(this.countryIso, hybrisRegion.countryIso);
    }

    public int hashCode() {
        int iHashCode = this.isoCode.hashCode() * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.isoCodeShort;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.countryIso;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "HybrisRegion(isoCode=" + this.isoCode + ", name=" + this.name + ", isoCodeShort=" + this.isoCodeShort + ", countryIso=" + this.countryIso + ')';
    }

    /* renamed from: a, reason: from getter */
    public final String getCountryIso() {
        return this.countryIso;
    }

    /* renamed from: b, reason: from getter */
    public final String getIsoCode() {
        return this.isoCode;
    }

    /* renamed from: c, reason: from getter */
    public final String getIsoCodeShort() {
        return this.isoCodeShort;
    }

    /* renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public /* synthetic */ HybrisRegion(String str, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4);
    }
}
