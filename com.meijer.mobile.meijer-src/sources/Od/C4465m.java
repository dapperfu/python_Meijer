package Od;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Od.m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4465m extends AbstractC15707a {
    public static final Parcelable.Creator<C4465m> CREATOR = new b0();

    /* renamed from: a, reason: collision with root package name */
    private final String f23629a;

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        String str = this.f23629a;
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 2, str, false);
        C15708b.b(parcel, iA);
    }

    public C4465m(String str) {
        com.google.android.gms.common.internal.r.m(str, "json must not be null");
        this.f23629a = str;
    }
}
