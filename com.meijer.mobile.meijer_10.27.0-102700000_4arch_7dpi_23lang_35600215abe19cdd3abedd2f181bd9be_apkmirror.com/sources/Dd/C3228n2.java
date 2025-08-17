package Dd;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: Dd.n2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3228n2 extends AbstractC15136a {
    public static final Parcelable.Creator<C3228n2> CREATOR = new M1();

    /* renamed from: a, reason: collision with root package name */
    public int f6186a;

    /* renamed from: b, reason: collision with root package name */
    public String[] f6187b;

    public C3228n2() {
    }

    public C3228n2(int i10, String[] strArr) {
        this.f6186a = i10;
        this.f6187b = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 2, this.f6186a);
        C15137b.x(parcel, 3, this.f6187b, false);
        C15137b.b(parcel, iA);
    }
}
