package nk;

import android.os.Parcel;
import android.os.Parcelable;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lnk/l;", "Landroid/os/Parcelable;", "<init>", "()V", "e", "f", "d", "c", "a", "b", "g", "h", "Lnk/l$a;", "Lnk/l$b;", "Lnk/l$c;", "Lnk/l$d;", "Lnk/l$e;", "Lnk/l$f;", "Lnk/l$g;", "Lnk/l$h;", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class l implements Parcelable {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001b\u0010\u0011¨\u0006\u001c"}, d2 = {"Lnk/l$a;", "Lnk/l;", "", "collectionId", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getName", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nk.l$a, reason: from toString */
    public static final /* data */ class BrowseCollection extends l {
        public static final Parcelable.Creator<BrowseCollection> CREATOR = new C2354a();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String collectionId;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: nk.l$a$a, reason: collision with other inner class name */
        public static final class C2354a implements Parcelable.Creator<BrowseCollection> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BrowseCollection createFromParcel(Parcel parcel) {
                Intrinsics.j(parcel, "parcel");
                return new BrowseCollection(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final BrowseCollection[] newArray(int i10) {
                return new BrowseCollection[i10];
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
            if (!(other instanceof BrowseCollection)) {
                return false;
            }
            BrowseCollection browseCollection = (BrowseCollection) other;
            return Intrinsics.e(this.collectionId, browseCollection.collectionId) && Intrinsics.e(this.name, browseCollection.name);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.j(dest, "dest");
            dest.writeString(this.collectionId);
            dest.writeString(this.name);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BrowseCollection(String collectionId, String name) {
            super(null);
            Intrinsics.j(collectionId, "collectionId");
            Intrinsics.j(name, "name");
            this.collectionId = collectionId;
            this.name = name;
        }

        /* renamed from: a, reason: from getter */
        public final String getCollectionId() {
            return this.collectionId;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return (this.collectionId.hashCode() * 31) + this.name.hashCode();
        }

        public String toString() {
            return "BrowseCollection(collectionId=" + this.collectionId + ", name=" + this.name + ')';
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lnk/l$b;", "Lnk/l;", "LPk/c;", "coupon", "<init>", "(LPk/c;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LPk/c;", "()LPk/c;", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nk.l$b, reason: from toString */
    public static final /* data */ class Coupon extends l {
        public static final Parcelable.Creator<Coupon> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Pk.c coupon;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: nk.l$b$a */
        public static final class a implements Parcelable.Creator<Coupon> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Coupon createFromParcel(Parcel parcel) {
                Intrinsics.j(parcel, "parcel");
                return new Coupon((Pk.c) parcel.readParcelable(Coupon.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Coupon[] newArray(int i10) {
                return new Coupon[i10];
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
            return (other instanceof Coupon) && Intrinsics.e(this.coupon, ((Coupon) other).coupon);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.j(dest, "dest");
            dest.writeParcelable(this.coupon, flags);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Coupon(Pk.c coupon) {
            super(null);
            Intrinsics.j(coupon, "coupon");
            this.coupon = coupon;
        }

        /* renamed from: a, reason: from getter */
        public final Pk.c getCoupon() {
            return this.coupon;
        }

        public int hashCode() {
            return this.coupon.hashCode();
        }

        public String toString() {
            return "Coupon(coupon=" + this.coupon + ')';
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001b\u0010\u0011¨\u0006\u001c"}, d2 = {"Lnk/l$c;", "Lnk/l;", "", PreferencesHelper.PREF_ID, "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getName", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nk.l$c, reason: from toString */
    public static final /* data */ class Department extends l {
        public static final Parcelable.Creator<Department> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: nk.l$c$a */
        public static final class a implements Parcelable.Creator<Department> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Department createFromParcel(Parcel parcel) {
                Intrinsics.j(parcel, "parcel");
                return new Department(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Department[] newArray(int i10) {
                return new Department[i10];
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
            if (!(other instanceof Department)) {
                return false;
            }
            Department department = (Department) other;
            return Intrinsics.e(this.id, department.id) && Intrinsics.e(this.name, department.name);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.j(dest, "dest");
            dest.writeString(this.id);
            dest.writeString(this.name);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Department(String id2, String name) {
            super(null);
            Intrinsics.j(id2, "id");
            Intrinsics.j(name, "name");
            this.id = id2;
            this.name = name;
        }

        /* renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.name.hashCode();
        }

        public String toString() {
            return "Department(id=" + this.id + ", name=" + this.name + ')';
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lnk/l$d;", "Lnk/l;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class d extends l {

        /* renamed from: a, reason: collision with root package name */
        public static final d f152504a = new d();
        public static final Parcelable.Creator<d> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                Intrinsics.j(parcel, "parcel");
                parcel.readInt();
                return d.f152504a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i10) {
                return new d[i10];
            }
        }

        private d() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.j(dest, "dest");
            dest.writeInt(1);
        }

        public String toString() {
            return "Favorites";
        }

        public int hashCode() {
            return 1406112130;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lnk/l$e;", "Lnk/l;", "Lnk/d;", "productType", "<init>", "(Lnk/d;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lnk/d;", "()Lnk/d;", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nk.l$e, reason: from toString */
    public static final /* data */ class Personalized extends l {
        public static final Parcelable.Creator<Personalized> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final nk.d productType;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: nk.l$e$a */
        public static final class a implements Parcelable.Creator<Personalized> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Personalized createFromParcel(Parcel parcel) {
                Intrinsics.j(parcel, "parcel");
                return new Personalized(nk.d.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Personalized[] newArray(int i10) {
                return new Personalized[i10];
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
            return (other instanceof Personalized) && this.productType == ((Personalized) other).productType;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.j(dest, "dest");
            dest.writeString(this.productType.name());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Personalized(nk.d productType) {
            super(null);
            Intrinsics.j(productType, "productType");
            this.productType = productType;
        }

        /* renamed from: a, reason: from getter */
        public final nk.d getProductType() {
            return this.productType;
        }

        public int hashCode() {
            return this.productType.hashCode();
        }

        public String toString() {
            return "Personalized(productType=" + this.productType + ')';
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000eJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0010¨\u0006\u0019"}, d2 = {"Lnk/l$f;", "Lnk/l;", "", "type", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nk.l$f, reason: from toString */
    public static final /* data */ class Recommendations extends l {
        public static final Parcelable.Creator<Recommendations> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String type;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: nk.l$f$a */
        public static final class a implements Parcelable.Creator<Recommendations> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Recommendations createFromParcel(Parcel parcel) {
                Intrinsics.j(parcel, "parcel");
                return new Recommendations(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Recommendations[] newArray(int i10) {
                return new Recommendations[i10];
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
            return (other instanceof Recommendations) && Intrinsics.e(this.type, ((Recommendations) other).type);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.j(dest, "dest");
            dest.writeString(this.type);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Recommendations(String type) {
            super(null);
            Intrinsics.j(type, "type");
            this.type = type;
        }

        /* renamed from: a, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        public String toString() {
            return "Recommendations(type=" + this.type + ')';
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011¨\u0006\u001b"}, d2 = {"Lnk/l$g;", "Lnk/l;", "", "rewardId", "rewardTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nk.l$g, reason: from toString */
    public static final /* data */ class Reward extends l {
        public static final Parcelable.Creator<Reward> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String rewardId;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String rewardTitle;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: nk.l$g$a */
        public static final class a implements Parcelable.Creator<Reward> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Reward createFromParcel(Parcel parcel) {
                Intrinsics.j(parcel, "parcel");
                return new Reward(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Reward[] newArray(int i10) {
                return new Reward[i10];
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
            if (!(other instanceof Reward)) {
                return false;
            }
            Reward reward = (Reward) other;
            return Intrinsics.e(this.rewardId, reward.rewardId) && Intrinsics.e(this.rewardTitle, reward.rewardTitle);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.j(dest, "dest");
            dest.writeString(this.rewardId);
            dest.writeString(this.rewardTitle);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Reward(String rewardId, String rewardTitle) {
            super(null);
            Intrinsics.j(rewardId, "rewardId");
            Intrinsics.j(rewardTitle, "rewardTitle");
            this.rewardId = rewardId;
            this.rewardTitle = rewardTitle;
        }

        /* renamed from: a, reason: from getter */
        public final String getRewardId() {
            return this.rewardId;
        }

        /* renamed from: b, reason: from getter */
        public final String getRewardTitle() {
            return this.rewardTitle;
        }

        public int hashCode() {
            return (this.rewardId.hashCode() * 31) + this.rewardTitle.hashCode();
        }

        public String toString() {
            return "Reward(rewardId=" + this.rewardId + ", rewardTitle=" + this.rewardTitle + ')';
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000eJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0010¨\u0006\u0019"}, d2 = {"Lnk/l$h;", "Lnk/l;", "", "searchTerm", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nk.l$h, reason: from toString */
    public static final /* data */ class Search extends l {
        public static final Parcelable.Creator<Search> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String searchTerm;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: nk.l$h$a */
        public static final class a implements Parcelable.Creator<Search> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Search createFromParcel(Parcel parcel) {
                Intrinsics.j(parcel, "parcel");
                return new Search(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Search[] newArray(int i10) {
                return new Search[i10];
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
            return (other instanceof Search) && Intrinsics.e(this.searchTerm, ((Search) other).searchTerm);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.j(dest, "dest");
            dest.writeString(this.searchTerm);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Search(String searchTerm) {
            super(null);
            Intrinsics.j(searchTerm, "searchTerm");
            this.searchTerm = searchTerm;
        }

        /* renamed from: a, reason: from getter */
        public final String getSearchTerm() {
            return this.searchTerm;
        }

        public int hashCode() {
            return this.searchTerm.hashCode();
        }

        public String toString() {
            return "Search(searchTerm=" + this.searchTerm + ')';
        }
    }

    public /* synthetic */ l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private l() {
    }
}
