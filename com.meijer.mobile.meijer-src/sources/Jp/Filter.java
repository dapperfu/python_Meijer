package Jp;

import android.os.Parcel;
import android.os.Parcelable;
import com.bazaarvoice.bvandroidsdk.EqualityOperator;
import com.bazaarvoice.bvandroidsdk.ReviewOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b$\u0010\u0015R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001c\u0010\u0013¨\u0006&"}, d2 = {"LJp/a;", "Landroid/os/Parcelable;", "Lcom/bazaarvoice/bvandroidsdk/ReviewOptions$Filter;", "filter", "Lcom/bazaarvoice/bvandroidsdk/EqualityOperator;", "operator", "", "value", "", "description", "<init>", "(Lcom/bazaarvoice/bvandroidsdk/ReviewOptions$Filter;Lcom/bazaarvoice/bvandroidsdk/EqualityOperator;Ljava/lang/String;I)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/bazaarvoice/bvandroidsdk/ReviewOptions$Filter;", "b", "()Lcom/bazaarvoice/bvandroidsdk/ReviewOptions$Filter;", "Lcom/bazaarvoice/bvandroidsdk/EqualityOperator;", "c", "()Lcom/bazaarvoice/bvandroidsdk/EqualityOperator;", "Ljava/lang/String;", "d", "I", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Jp.a, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class Filter implements Parcelable {
    public static final Parcelable.Creator<Filter> CREATOR = new C0267a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ReviewOptions.Filter filter;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final EqualityOperator operator;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String value;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int description;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Jp.a$a, reason: collision with other inner class name */
    public static final class C0267a implements Parcelable.Creator<Filter> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Filter createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new Filter(ReviewOptions.Filter.valueOf(parcel.readString()), EqualityOperator.valueOf(parcel.readString()), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Filter[] newArray(int i10) {
            return new Filter[i10];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Filter)) {
            return false;
        }
        Filter filter = (Filter) other;
        return this.filter == filter.filter && this.operator == filter.operator && Intrinsics.e(this.value, filter.value) && this.description == filter.description;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.filter.name());
        dest.writeString(this.operator.name());
        dest.writeString(this.value);
        dest.writeInt(this.description);
    }

    public Filter(ReviewOptions.Filter filter, EqualityOperator operator, String value, int i10) {
        Intrinsics.j(filter, "filter");
        Intrinsics.j(operator, "operator");
        Intrinsics.j(value, "value");
        this.filter = filter;
        this.operator = operator;
        this.value = value;
        this.description = i10;
    }

    /* renamed from: a, reason: from getter */
    public final int getDescription() {
        return this.description;
    }

    /* renamed from: b, reason: from getter */
    public final ReviewOptions.Filter getFilter() {
        return this.filter;
    }

    /* renamed from: c, reason: from getter */
    public final EqualityOperator getOperator() {
        return this.operator;
    }

    /* renamed from: d, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((((this.filter.hashCode() * 31) + this.operator.hashCode()) * 31) + this.value.hashCode()) * 31) + Integer.hashCode(this.description);
    }

    public String toString() {
        return "Filter(filter=" + this.filter + ", operator=" + this.operator + ", value=" + this.value + ", description=" + this.description + ')';
    }
}
