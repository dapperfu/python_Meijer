package a3;

import android.os.Parcel;
import android.os.Parcelable;
import d3.C13599a;
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
    private final b[] f44690a;

    /* renamed from: b, reason: collision with root package name */
    private int f44691b;

    /* renamed from: c, reason: collision with root package name */
    public final String f44692c;

    /* renamed from: d, reason: collision with root package name */
    public final int f44693d;

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
        private int f44694a;

        /* renamed from: b, reason: collision with root package name */
        public final UUID f44695b;

        /* renamed from: c, reason: collision with root package name */
        public final String f44696c;

        /* renamed from: d, reason: collision with root package name */
        public final String f44697d;

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f44698e;

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
            this.f44695b = (UUID) C13599a.e(uuid);
            this.f44696c = str;
            this.f44697d = z.r((String) C13599a.e(str2));
            this.f44698e = bArr;
        }

        public b a(byte[] bArr) {
            return new b(this.f44695b, this.f44696c, this.f44697d, bArr);
        }

        public boolean b(UUID uuid) {
            return C5652i.f44650a.equals(this.f44695b) || uuid.equals(this.f44695b);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            return Objects.equals(this.f44696c, bVar.f44696c) && Objects.equals(this.f44697d, bVar.f44697d) && Objects.equals(this.f44695b, bVar.f44695b) && Arrays.equals(this.f44698e, bVar.f44698e);
        }

        public int hashCode() {
            if (this.f44694a == 0) {
                int iHashCode = this.f44695b.hashCode() * 31;
                String str = this.f44696c;
                this.f44694a = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f44697d.hashCode()) * 31) + Arrays.hashCode(this.f44698e);
            }
            return this.f44694a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f44695b.getMostSignificantBits());
            parcel.writeLong(this.f44695b.getLeastSignificantBits());
            parcel.writeString(this.f44696c);
            parcel.writeString(this.f44697d);
            parcel.writeByteArray(this.f44698e);
        }

        b(Parcel parcel) {
            this.f44695b = new UUID(parcel.readLong(), parcel.readLong());
            this.f44696c = parcel.readString();
            this.f44697d = (String) P.h(parcel.readString());
            this.f44698e = parcel.createByteArray();
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
            if (Objects.equals(this.f44692c, oVar.f44692c) && Arrays.equals(this.f44690a, oVar.f44690a)) {
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
        UUID uuid = C5652i.f44650a;
        return uuid.equals(bVar.f44695b) ? uuid.equals(bVar2.f44695b) ? 0 : 1 : bVar.f44695b.compareTo(bVar2.f44695b);
    }

    public o b(String str) {
        return Objects.equals(this.f44692c, str) ? this : new o(str, false, this.f44690a);
    }

    public b c(int i10) {
        return this.f44690a[i10];
    }

    public int hashCode() {
        if (this.f44691b == 0) {
            String str = this.f44692c;
            this.f44691b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f44690a);
        }
        return this.f44691b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f44692c);
        parcel.writeTypedArray(this.f44690a, 0);
    }

    public o(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    private o(String str, boolean z10, b... bVarArr) {
        this.f44692c = str;
        bVarArr = z10 ? (b[]) bVarArr.clone() : bVarArr;
        this.f44690a = bVarArr;
        this.f44693d = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    o(Parcel parcel) {
        this.f44692c = parcel.readString();
        b[] bVarArr = (b[]) P.h((b[]) parcel.createTypedArray(b.CREATOR));
        this.f44690a = bVarArr;
        this.f44693d = bVarArr.length;
    }
}
