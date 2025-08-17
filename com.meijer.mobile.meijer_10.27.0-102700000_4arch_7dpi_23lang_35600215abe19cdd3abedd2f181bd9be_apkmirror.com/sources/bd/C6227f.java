package bd;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: bd.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6227f extends AbstractC15136a {
    public static final Parcelable.Creator<C6227f> CREATOR = new C6228g();

    /* renamed from: a, reason: collision with root package name */
    private final String f60111a;

    /* renamed from: b, reason: collision with root package name */
    private final int f60112b;

    public final int B() {
        return this.f60112b;
    }

    public final String T() {
        return this.f60111a;
    }

    public C6227f(String str, int i10) {
        this.f60111a = str;
        this.f60112b = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 1, this.f60111a, false);
        C15137b.n(parcel, 2, this.f60112b);
        C15137b.b(parcel, iA);
    }
}
