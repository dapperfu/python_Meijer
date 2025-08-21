package Pp;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u0014\"\u0004\b\u001c\u0010\u001dR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b\u001e\u0010&\"\u0004\b'\u0010(¨\u0006)"}, d2 = {"LPp/a;", "Landroid/os/Parcelable;", "", "queryString", "LPp/b;", "searchType", "", "isScannedUPC", "<init>", "(Ljava/lang/String;LPp/b;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "setQueryString", "(Ljava/lang/String;)V", "b", "LPp/b;", "getSearchType", "()LPp/b;", "setSearchType", "(LPp/b;)V", "c", "Z", "()Z", "setScannedUPC", "(Z)V", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Pp.a, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class SearchQuery implements Parcelable {
    public static final Parcelable.Creator<SearchQuery> CREATOR = new C0481a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private String queryString;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private b searchType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean isScannedUPC;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Pp.a$a, reason: collision with other inner class name */
    public static final class C0481a implements Parcelable.Creator<SearchQuery> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SearchQuery createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new SearchQuery(parcel.readString(), b.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SearchQuery[] newArray(int i10) {
            return new SearchQuery[i10];
        }
    }

    public SearchQuery() {
        this(null, null, false, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchQuery)) {
            return false;
        }
        SearchQuery searchQuery = (SearchQuery) other;
        return Intrinsics.e(this.queryString, searchQuery.queryString) && this.searchType == searchQuery.searchType && this.isScannedUPC == searchQuery.isScannedUPC;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.queryString);
        dest.writeString(this.searchType.name());
        dest.writeInt(this.isScannedUPC ? 1 : 0);
    }

    public SearchQuery(String str, b searchType, boolean z10) {
        Intrinsics.j(searchType, "searchType");
        this.queryString = str;
        this.searchType = searchType;
        this.isScannedUPC = z10;
    }

    /* renamed from: a, reason: from getter */
    public final String getQueryString() {
        return this.queryString;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsScannedUPC() {
        return this.isScannedUPC;
    }

    public int hashCode() {
        String str = this.queryString;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.searchType.hashCode()) * 31) + Boolean.hashCode(this.isScannedUPC);
    }

    public String toString() {
        return "SearchQuery(queryString=" + this.queryString + ", searchType=" + this.searchType + ", isScannedUPC=" + this.isScannedUPC + ')';
    }

    public /* synthetic */ SearchQuery(String str, b bVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? b.f26238a : bVar, (i10 & 4) != 0 ? false : z10);
    }
}
