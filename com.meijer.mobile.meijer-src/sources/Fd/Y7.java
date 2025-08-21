package Fd;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class Y7 extends AbstractC15707a {
    public static final Parcelable.Creator<Y7> CREATOR = new C3375h();

    /* renamed from: a, reason: collision with root package name */
    public String f9691a;

    /* renamed from: b, reason: collision with root package name */
    public String f9692b;

    /* renamed from: c, reason: collision with root package name */
    public int f9693c;

    public Y7() {
    }

    public Y7(String str, String str2, int i10) {
        this.f9691a = str;
        this.f9692b = str2;
        this.f9693c = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 2, this.f9691a, false);
        C15708b.w(parcel, 3, this.f9692b, false);
        C15708b.n(parcel, 4, this.f9693c);
        C15708b.b(parcel, iA);
    }
}
