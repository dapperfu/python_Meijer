package Dd;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class pa extends AbstractC15136a {
    public static final Parcelable.Creator<pa> CREATOR = new Ja();

    /* renamed from: a, reason: collision with root package name */
    private final String f6220a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6221b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f6220a;
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 1, str, false);
        C15137b.w(parcel, 2, this.f6221b, false);
        C15137b.b(parcel, iA);
    }

    public pa(String str, String str2) {
        this.f6220a = str;
        this.f6221b = str2;
    }
}
