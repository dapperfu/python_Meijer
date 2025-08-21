package Fd;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Fd.ma, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3446ma extends AbstractC15707a {
    public static final Parcelable.Creator<C3446ma> CREATOR = new Ga();

    /* renamed from: a, reason: collision with root package name */
    private final String f10212a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10213b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10214c;

    /* renamed from: d, reason: collision with root package name */
    private final String f10215d;

    /* renamed from: e, reason: collision with root package name */
    private final String f10216e;

    /* renamed from: f, reason: collision with root package name */
    private final String f10217f;

    /* renamed from: g, reason: collision with root package name */
    private final String f10218g;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f10212a;
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 1, str, false);
        C15708b.w(parcel, 2, this.f10213b, false);
        C15708b.w(parcel, 3, this.f10214c, false);
        C15708b.w(parcel, 4, this.f10215d, false);
        C15708b.w(parcel, 5, this.f10216e, false);
        C15708b.w(parcel, 6, this.f10217f, false);
        C15708b.w(parcel, 7, this.f10218g, false);
        C15708b.b(parcel, iA);
    }

    public C3446ma(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f10212a = str;
        this.f10213b = str2;
        this.f10214c = str3;
        this.f10215d = str4;
        this.f10216e = str5;
        this.f10217f = str6;
        this.f10218g = str7;
    }
}
