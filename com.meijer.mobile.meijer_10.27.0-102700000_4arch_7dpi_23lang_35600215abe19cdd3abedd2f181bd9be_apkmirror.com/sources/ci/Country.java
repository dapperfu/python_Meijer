package ci;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\t¨\u0006\u0014"}, d2 = {"Lci/b;", "", "", "Lcom/meijer/mobile/address/model/common/IsoCode;", "isoCode", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ci.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes7.dex */
public final /* data */ class Country {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String isoCode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    public Country(String isoCode, String str) {
        Intrinsics.j(isoCode, "isoCode");
        this.isoCode = isoCode;
        this.name = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Country)) {
            return false;
        }
        Country country = (Country) other;
        return Intrinsics.e(this.isoCode, country.isoCode) && Intrinsics.e(this.name, country.name);
    }

    /* renamed from: a, reason: from getter */
    public String getIsoCode() {
        return this.isoCode;
    }

    /* renamed from: b, reason: from getter */
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = this.isoCode.hashCode() * 31;
        String str = this.name;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "Country(isoCode=" + this.isoCode + ", name=" + this.name + ')';
    }

    public /* synthetic */ Country(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2);
    }
}
