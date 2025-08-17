package Dd;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: Dd.v6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3320v6 extends AbstractC15136a {
    public static final Parcelable.Creator<C3320v6> CREATOR = new C3117e();

    /* renamed from: a, reason: collision with root package name */
    public int f6310a;

    /* renamed from: b, reason: collision with root package name */
    public String f6311b;

    public C3320v6() {
    }

    public C3320v6(int i10, String str) {
        this.f6310a = i10;
        this.f6311b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 2, this.f6310a);
        C15137b.w(parcel, 3, this.f6311b, false);
        C15137b.b(parcel, iA);
    }
}
