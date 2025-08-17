package Dd;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class Y7 extends AbstractC15136a {
    public static final Parcelable.Creator<Y7> CREATOR = new C3153h();

    /* renamed from: a, reason: collision with root package name */
    public String f5658a;

    /* renamed from: b, reason: collision with root package name */
    public String f5659b;

    /* renamed from: c, reason: collision with root package name */
    public int f5660c;

    public Y7() {
    }

    public Y7(String str, String str2, int i10) {
        this.f5658a = str;
        this.f5659b = str2;
        this.f5660c = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 2, this.f5658a, false);
        C15137b.w(parcel, 3, this.f5659b, false);
        C15137b.n(parcel, 4, this.f5660c);
        C15137b.b(parcel, iA);
    }
}
