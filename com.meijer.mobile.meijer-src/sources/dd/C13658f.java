package dd;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: dd.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13658f extends AbstractC15707a {
    public static final Parcelable.Creator<C13658f> CREATOR = new C13659g();

    /* renamed from: a, reason: collision with root package name */
    private final String f128346a;

    /* renamed from: b, reason: collision with root package name */
    private final int f128347b;

    public final int B() {
        return this.f128347b;
    }

    public final String T() {
        return this.f128346a;
    }

    public C13658f(String str, int i10) {
        this.f128346a = str;
        this.f128347b = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 1, this.f128346a, false);
        C15708b.n(parcel, 2, this.f128347b);
        C15708b.b(parcel, iA);
    }
}
