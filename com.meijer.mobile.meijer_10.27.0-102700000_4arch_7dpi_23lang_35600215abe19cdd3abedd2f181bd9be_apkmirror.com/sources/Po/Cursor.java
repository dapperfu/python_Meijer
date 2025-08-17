package Po;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001d\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!¨\u0006$"}, d2 = {"LPo/a;", "Landroid/os/Parcelable;", "", "nextCursor", "prevCursor", "", "hasNextPage", "hasPrevPage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getPrevCursor", "c", "Ljava/lang/Boolean;", "getHasNextPage", "()Ljava/lang/Boolean;", "d", "getHasPrevPage", "search_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Po.a, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class Cursor implements Parcelable {
    public static final Parcelable.Creator<Cursor> CREATOR = new C0660a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String nextCursor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String prevCursor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean hasNextPage;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean hasPrevPage;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Po.a$a, reason: collision with other inner class name */
    public static final class C0660a implements Parcelable.Creator<Cursor> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Cursor createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.j(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Cursor(string, string2, boolValueOf, boolValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Cursor[] newArray(int i10) {
            return new Cursor[i10];
        }
    }

    public Cursor() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Cursor)) {
            return false;
        }
        Cursor cursor = (Cursor) other;
        return Intrinsics.e(this.nextCursor, cursor.nextCursor) && Intrinsics.e(this.prevCursor, cursor.prevCursor) && Intrinsics.e(this.hasNextPage, cursor.hasNextPage) && Intrinsics.e(this.hasPrevPage, cursor.hasPrevPage);
    }

    public Cursor(String str, String str2, Boolean bool, Boolean bool2) {
        this.nextCursor = str;
        this.prevCursor = str2;
        this.hasNextPage = bool;
        this.hasPrevPage = bool2;
    }

    /* renamed from: a, reason: from getter */
    public final String getNextCursor() {
        return this.nextCursor;
    }

    public int hashCode() {
        String str = this.nextCursor;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.prevCursor;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.hasNextPage;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasPrevPage;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        return "Cursor(nextCursor=" + this.nextCursor + ", prevCursor=" + this.prevCursor + ", hasNextPage=" + this.hasNextPage + ", hasPrevPage=" + this.hasPrevPage + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.nextCursor);
        dest.writeString(this.prevCursor);
        Boolean bool = this.hasNextPage;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.hasPrevPage;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ Cursor(String str, String str2, Boolean bool, Boolean bool2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : bool, (i10 & 8) != 0 ? null : bool2);
    }
}
