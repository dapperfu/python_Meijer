package a3;

import android.os.Parcel;
import android.os.Parcelable;
import d3.C13466a;
import d3.P;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class o implements Comparator<b>, Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final b[] f43872a;

    /* renamed from: b, reason: collision with root package name */
    private int f43873b;

    /* renamed from: c, reason: collision with root package name */
    public final String f43874c;

    /* renamed from: d, reason: collision with root package name */
    public final int f43875d;

    class a implements Parcelable.Creator<o> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public o createFromParcel(Parcel parcel) {
            return new o(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o[] newArray(int i10) {
            return new o[i10];
        }

        a() {
        }
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private int f43876a;

        /* renamed from: b, reason: collision with root package name */
        public final UUID f43877b;

        /* renamed from: c, reason: collision with root package name */
        public final String f43878c;

        /* renamed from: d, reason: collision with root package name */
        public final String f43879d;

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f43880e;

        class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }

            a() {
            }
        }

        public b(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            this.f43877b = (UUID) C13466a.e(uuid);
            this.f43878c = str;
            this.f43879d = z.r((String) C13466a.e(str2));
            this.f43880e = bArr;
        }

        public b a(byte[] bArr) {
            return new b(this.f43877b, this.f43878c, this.f43879d, bArr);
        }

        public boolean b(UUID uuid) {
            return C5569i.f43832a.equals(this.f43877b) || uuid.equals(this.f43877b);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            return Objects.equals(this.f43878c, bVar.f43878c) && Objects.equals(this.f43879d, bVar.f43879d) && Objects.equals(this.f43877b, bVar.f43877b) && Arrays.equals(this.f43880e, bVar.f43880e);
        }

        public int hashCode() {
            if (this.f43876a == 0) {
                int iHashCode = this.f43877b.hashCode() * 31;
                String str = this.f43878c;
                this.f43876a = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f43879d.hashCode()) * 31) + Arrays.hashCode(this.f43880e);
            }
            return this.f43876a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f43877b.getMostSignificantBits());
            parcel.writeLong(this.f43877b.getLeastSignificantBits());
            parcel.writeString(this.f43878c);
            parcel.writeString(this.f43879d);
            parcel.writeByteArray(this.f43880e);
        }

        b(Parcel parcel) {
            this.f43877b = new UUID(parcel.readLong(), parcel.readLong());
            this.f43878c = parcel.readString();
            this.f43879d = (String) P.h(parcel.readString());
            this.f43880e = parcel.createByteArray();
        }
    }

    public o(List<b> list) {
        this(null, false, (b[]) list.toArray(new b[0]));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (Objects.equals(this.f43874c, oVar.f43874c) && Arrays.equals(this.f43872a, oVar.f43872a)) {
                return true;
            }
        }
        return false;
    }

    public o(b... bVarArr) {
        this(null, bVarArr);
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(b bVar, b bVar2) {
        UUID uuid = C5569i.f43832a;
        return uuid.equals(bVar.f43877b) ? uuid.equals(bVar2.f43877b) ? 0 : 1 : bVar.f43877b.compareTo(bVar2.f43877b);
    }

    public o b(String str) {
        return Objects.equals(this.f43874c, str) ? this : new o(str, false, this.f43872a);
    }

    public b c(int i10) {
        return this.f43872a[i10];
    }

    public int hashCode() {
        if (this.f43873b == 0) {
            String str = this.f43874c;
            this.f43873b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f43872a);
        }
        return this.f43873b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f43874c);
        parcel.writeTypedArray(this.f43872a, 0);
    }

    public o(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    private o(String str, boolean z10, b... bVarArr) {
        this.f43874c = str;
        bVarArr = z10 ? (b[]) bVarArr.clone() : bVarArr;
        this.f43872a = bVarArr;
        this.f43875d = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    o(Parcel parcel) {
        this.f43874c = parcel.readString();
        b[] bVarArr = (b[]) P.h((b[]) parcel.createTypedArray(b.CREATOR));
        this.f43872a = bVarArr;
        this.f43875d = bVarArr.length;
    }
}
