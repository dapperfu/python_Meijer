package Dd;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class S4 extends AbstractC15136a {
    public static final Parcelable.Creator<S4> CREATOR = new C3081b();

    /* renamed from: a, reason: collision with root package name */
    public int f5516a;

    /* renamed from: b, reason: collision with root package name */
    public String f5517b;

    /* renamed from: c, reason: collision with root package name */
    public String f5518c;

    /* renamed from: d, reason: collision with root package name */
    public String f5519d;

    public S4() {
    }

    public S4(int i10, String str, String str2, String str3) {
        this.f5516a = i10;
        this.f5517b = str;
        this.f5518c = str2;
        this.f5519d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 2, this.f5516a);
        C15137b.w(parcel, 3, this.f5517b, false);
        C15137b.w(parcel, 4, this.f5518c, false);
        C15137b.w(parcel, 5, this.f5519d, false);
        C15137b.b(parcel, iA);
    }
}
