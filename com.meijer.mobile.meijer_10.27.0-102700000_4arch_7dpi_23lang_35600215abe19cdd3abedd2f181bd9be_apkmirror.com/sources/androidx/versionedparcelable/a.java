package androidx.versionedparcelable;

import Z.C5503a;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
class a extends VersionedParcel {

    /* renamed from: d, reason: collision with root package name */
    private final SparseIntArray f58914d;

    /* renamed from: e, reason: collision with root package name */
    private final Parcel f58915e;

    /* renamed from: f, reason: collision with root package name */
    private final int f58916f;

    /* renamed from: g, reason: collision with root package name */
    private final int f58917g;

    /* renamed from: h, reason: collision with root package name */
    private final String f58918h;

    /* renamed from: i, reason: collision with root package name */
    private int f58919i;

    /* renamed from: j, reason: collision with root package name */
    private int f58920j;

    /* renamed from: k, reason: collision with root package name */
    private int f58921k;

    a(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C5503a(), new C5503a(), new C5503a());
    }

    private a(Parcel parcel, int i10, int i11, String str, C5503a<String, Method> c5503a, C5503a<String, Method> c5503a2, C5503a<String, Class> c5503a3) {
        super(c5503a, c5503a2, c5503a3);
        this.f58914d = new SparseIntArray();
        this.f58919i = -1;
        this.f58921k = -1;
        this.f58915e = parcel;
        this.f58916f = i10;
        this.f58917g = i11;
        this.f58920j = i10;
        this.f58918h = str;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f58915e.writeInt(-1);
        } else {
            this.f58915e.writeInt(bArr.length);
            this.f58915e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f58915e, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void E(int i10) {
        this.f58915e.writeInt(i10);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void G(Parcelable parcelable) {
        this.f58915e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void I(String str) {
        this.f58915e.writeString(str);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void a() {
        int i10 = this.f58919i;
        if (i10 >= 0) {
            int i11 = this.f58914d.get(i10);
            int iDataPosition = this.f58915e.dataPosition();
            this.f58915e.setDataPosition(i11);
            this.f58915e.writeInt(iDataPosition - i11);
            this.f58915e.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected VersionedParcel b() {
        Parcel parcel = this.f58915e;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.f58920j;
        if (i10 == this.f58916f) {
            i10 = this.f58917g;
        }
        return new a(parcel, iDataPosition, i10, this.f58918h + "  ", this.f58911a, this.f58912b, this.f58913c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean g() {
        return this.f58915e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] i() {
        int i10 = this.f58915e.readInt();
        if (i10 < 0) {
            return null;
        }
        byte[] bArr = new byte[i10];
        this.f58915e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f58915e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean m(int i10) {
        while (this.f58920j < this.f58917g) {
            int i11 = this.f58921k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f58915e.setDataPosition(this.f58920j);
            int i12 = this.f58915e.readInt();
            this.f58921k = this.f58915e.readInt();
            this.f58920j += i12;
        }
        return this.f58921k == i10;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int o() {
        return this.f58915e.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public <T extends Parcelable> T q() {
        return (T) this.f58915e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public String s() {
        return this.f58915e.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void y(boolean z10) {
        this.f58915e.writeInt(z10 ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void w(int i10) {
        a();
        this.f58919i = i10;
        this.f58914d.put(i10, this.f58915e.dataPosition());
        E(0);
        E(i10);
    }
}
