package Dd;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: Dd.ma, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3224ma extends AbstractC15136a {
    public static final Parcelable.Creator<C3224ma> CREATOR = new Ga();

    /* renamed from: a, reason: collision with root package name */
    private final String f6179a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6180b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6181c;

    /* renamed from: d, reason: collision with root package name */
    private final String f6182d;

    /* renamed from: e, reason: collision with root package name */
    private final String f6183e;

    /* renamed from: f, reason: collision with root package name */
    private final String f6184f;

    /* renamed from: g, reason: collision with root package name */
    private final String f6185g;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f6179a;
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 1, str, false);
        C15137b.w(parcel, 2, this.f6180b, false);
        C15137b.w(parcel, 3, this.f6181c, false);
        C15137b.w(parcel, 4, this.f6182d, false);
        C15137b.w(parcel, 5, this.f6183e, false);
        C15137b.w(parcel, 6, this.f6184f, false);
        C15137b.w(parcel, 7, this.f6185g, false);
        C15137b.b(parcel, iA);
    }

    public C3224ma(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f6179a = str;
        this.f6180b = str2;
        this.f6181c = str3;
        this.f6182d = str4;
        this.f6183e = str5;
        this.f6184f = str6;
        this.f6185g = str7;
    }
}
