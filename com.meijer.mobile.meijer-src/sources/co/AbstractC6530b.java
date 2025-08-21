package co;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \t2\u00020\u0001:\u0004\n\u000b\t\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lco/b;", "Landroid/os/Parcelable;", "", "value", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "d", "c", "Lco/b$b;", "Lco/b$c;", "Lco/b$d;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: co.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC6530b implements Parcelable {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String value;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lco/b$a;", "", "<init>", "()V", "", "value", "Lco/b;", "a", "(Ljava/lang/String;)Lco/b;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: co.b$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AbstractC6530b a(String value) {
            if (Intrinsics.e(value, "TotalBasket")) {
                return c.f62686c;
            }
            if (Intrinsics.e(value, "Fuel")) {
                return C1233b.f62685c;
            }
            if (value == null) {
                return null;
            }
            return new Unknown(value);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lco/b$b;", "Lco/b;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: co.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1233b extends AbstractC6530b {

        /* renamed from: c, reason: collision with root package name */
        public static final C1233b f62685c = new C1233b();
        public static final Parcelable.Creator<C1233b> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: co.b$b$a */
        public static final class a implements Parcelable.Creator<C1233b> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C1233b createFromParcel(Parcel parcel) {
                Intrinsics.j(parcel, "parcel");
                parcel.readInt();
                return C1233b.f62685c;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C1233b[] newArray(int i10) {
                return new C1233b[i10];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof C1233b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.j(dest, "dest");
            dest.writeInt(1);
        }

        private C1233b() {
            super("Fuel", null);
        }

        public String toString() {
            return "Fuel";
        }

        public int hashCode() {
            return -212273514;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lco/b$c;", "Lco/b;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: co.b$c */
    public static final /* data */ class c extends AbstractC6530b {

        /* renamed from: c, reason: collision with root package name */
        public static final c f62686c = new c();
        public static final Parcelable.Creator<c> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: co.b$c$a */
        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                Intrinsics.j(parcel, "parcel");
                parcel.readInt();
                return c.f62686c;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i10) {
                return new c[i10];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.j(dest, "dest");
            dest.writeInt(1);
        }

        private c() {
            super("TotalBasket", null);
        }

        public String toString() {
            return "TotalBasket";
        }

        public int hashCode() {
            return -1004343990;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000eJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, d2 = {"Lco/b$d;", "Lco/b;", "", "value", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "a", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: co.b$d, reason: from toString */
    public static final /* data */ class Unknown extends AbstractC6530b {
        public static final Parcelable.Creator<Unknown> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String value;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: co.b$d$a */
        public static final class a implements Parcelable.Creator<Unknown> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Unknown createFromParcel(Parcel parcel) {
                Intrinsics.j(parcel, "parcel");
                return new Unknown(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Unknown[] newArray(int i10) {
                return new Unknown[i10];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Unknown() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Unknown) && Intrinsics.e(this.value, ((Unknown) other).value);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.j(dest, "dest");
            dest.writeString(this.value);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unknown(String value) {
            super(value, null);
            Intrinsics.j(value, "value");
            this.value = value;
        }

        @Override // co.AbstractC6530b
        /* renamed from: a, reason: from getter */
        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "Unknown(value=" + this.value + ')';
        }

        public /* synthetic */ Unknown(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    public /* synthetic */ AbstractC6530b(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private AbstractC6530b(String str) {
        this.value = str;
    }

    /* renamed from: a, reason: from getter */
    public String getValue() {
        return this.value;
    }
}
