package Fd;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class pa extends AbstractC15707a {
    public static final Parcelable.Creator<pa> CREATOR = new Ja();

    /* renamed from: a, reason: collision with root package name */
    private final String f10253a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10254b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f10253a;
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 1, str, false);
        C15708b.w(parcel, 2, this.f10254b, false);
        C15708b.b(parcel, iA);
    }

    public pa(String str, String str2) {
        this.f10253a = str;
        this.f10254b = str2;
    }
}
