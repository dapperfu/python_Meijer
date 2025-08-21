package androidx.versionedparcelable;

import Z.C5603a;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
class a extends VersionedParcel {

    /* renamed from: d, reason: collision with root package name */
    private final SparseIntArray f59100d;

    /* renamed from: e, reason: collision with root package name */
    private final Parcel f59101e;

    /* renamed from: f, reason: collision with root package name */
    private final int f59102f;

    /* renamed from: g, reason: collision with root package name */
    private final int f59103g;

    /* renamed from: h, reason: collision with root package name */
    private final String f59104h;

    /* renamed from: i, reason: collision with root package name */
    private int f59105i;

    /* renamed from: j, reason: collision with root package name */
    private int f59106j;

    /* renamed from: k, reason: collision with root package name */
    private int f59107k;

    a(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C5603a(), new C5603a(), new C5603a());
    }

    private a(Parcel parcel, int i10, int i11, String str, C5603a<String, Method> c5603a, C5603a<String, Method> c5603a2, C5603a<String, Class> c5603a3) {
        super(c5603a, c5603a2, c5603a3);
        this.f59100d = new SparseIntArray();
        this.f59105i = -1;
        this.f59107k = -1;
        this.f59101e = parcel;
        this.f59102f = i10;
        this.f59103g = i11;
        this.f59106j = i10;
        this.f59104h = str;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f59101e.writeInt(-1);
        } else {
            this.f59101e.writeInt(bArr.length);
            this.f59101e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f59101e, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void E(int i10) {
        this.f59101e.writeInt(i10);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void G(Parcelable parcelable) {
        this.f59101e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void I(String str) {
        this.f59101e.writeString(str);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void a() {
        int i10 = this.f59105i;
        if (i10 >= 0) {
            int i11 = this.f59100d.get(i10);
            int iDataPosition = this.f59101e.dataPosition();
            this.f59101e.setDataPosition(i11);
            this.f59101e.writeInt(iDataPosition - i11);
            this.f59101e.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected VersionedParcel b() {
        Parcel parcel = this.f59101e;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.f59106j;
        if (i10 == this.f59102f) {
            i10 = this.f59103g;
        }
        return new a(parcel, iDataPosition, i10, this.f59104h + "  ", this.f59097a, this.f59098b, this.f59099c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean g() {
        return this.f59101e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] i() {
        int i10 = this.f59101e.readInt();
        if (i10 < 0) {
            return null;
        }
        byte[] bArr = new byte[i10];
        this.f59101e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f59101e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean m(int i10) {
        while (this.f59106j < this.f59103g) {
            int i11 = this.f59107k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f59101e.setDataPosition(this.f59106j);
            int i12 = this.f59101e.readInt();
            this.f59107k = this.f59101e.readInt();
            this.f59106j += i12;
        }
        return this.f59107k == i10;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int o() {
        return this.f59101e.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public <T extends Parcelable> T q() {
        return (T) this.f59101e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public String s() {
        return this.f59101e.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void y(boolean z10) {
        this.f59101e.writeInt(z10 ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void w(int i10) {
        a();
        this.f59105i = i10;
        this.f59100d.put(i10, this.f59101e.dataPosition());
        E(0);
        E(i10);
    }
}
