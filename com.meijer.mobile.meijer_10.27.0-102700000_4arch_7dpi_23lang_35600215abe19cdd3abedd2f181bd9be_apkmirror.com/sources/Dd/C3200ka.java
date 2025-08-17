package Dd;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: Dd.ka, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3200ka extends AbstractC15136a {
    public static final Parcelable.Creator<C3200ka> CREATOR = new Aa();

    /* renamed from: a, reason: collision with root package name */
    private final int f6141a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6142b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6143c;

    /* renamed from: d, reason: collision with root package name */
    private final String f6144d;

    public C3200ka(int i10, String str, String str2, String str3) {
        this.f6141a = i10;
        this.f6142b = str;
        this.f6143c = str2;
        this.f6144d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, this.f6141a);
        C15137b.w(parcel, 2, this.f6142b, false);
        C15137b.w(parcel, 3, this.f6143c, false);
        C15137b.w(parcel, 4, this.f6144d, false);
        C15137b.b(parcel, iA);
    }
}
