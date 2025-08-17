package Dd;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class oa extends AbstractC15136a {
    public static final Parcelable.Creator<oa> CREATOR = new Ia();

    /* renamed from: a, reason: collision with root package name */
    private final String f6207a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6208b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f6207a;
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 1, str, false);
        C15137b.w(parcel, 2, this.f6208b, false);
        C15137b.b(parcel, iA);
    }

    public oa(String str, String str2) {
        this.f6207a = str;
        this.f6208b = str2;
    }
}
