package bd;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: bd.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6225d extends AbstractC15136a {
    public static final Parcelable.Creator<C6225d> CREATOR = new C6226e();

    /* renamed from: a, reason: collision with root package name */
    private final String f60109a;

    /* renamed from: b, reason: collision with root package name */
    private final String f60110b;

    public C6225d(String str, String str2) {
        this.f60109a = str;
        this.f60110b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 1, this.f60109a, false);
        C15137b.w(parcel, 2, this.f60110b, false);
        C15137b.b(parcel, iA);
    }
}
