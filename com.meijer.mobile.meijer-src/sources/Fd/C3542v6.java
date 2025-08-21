package Fd;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Fd.v6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3542v6 extends AbstractC15707a {
    public static final Parcelable.Creator<C3542v6> CREATOR = new C3339e();

    /* renamed from: a, reason: collision with root package name */
    public int f10343a;

    /* renamed from: b, reason: collision with root package name */
    public String f10344b;

    public C3542v6() {
    }

    public C3542v6(int i10, String str) {
        this.f10343a = i10;
        this.f10344b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 2, this.f10343a);
        C15708b.w(parcel, 3, this.f10344b, false);
        C15708b.b(parcel, iA);
    }
}
