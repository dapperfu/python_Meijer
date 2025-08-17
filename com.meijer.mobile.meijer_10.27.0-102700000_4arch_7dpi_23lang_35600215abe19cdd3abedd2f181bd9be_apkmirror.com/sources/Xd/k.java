package Xd;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class k extends AbstractC15136a {
    public static final Parcelable.Creator<k> CREATOR = new p();

    /* renamed from: a, reason: collision with root package name */
    int f39264a;

    /* renamed from: b, reason: collision with root package name */
    String f39265b;

    private k() {
    }

    k(int i10, String str) {
        this.f39264a = i10;
        this.f39265b = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 2, this.f39264a);
        C15137b.w(parcel, 3, this.f39265b, false);
        C15137b.b(parcel, iA);
    }
}
