package ae;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: ae.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5686a extends AbstractC15707a {
    public static final Parcelable.Creator<C5686a> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    String f45379a;

    /* renamed from: b, reason: collision with root package name */
    int f45380b;

    /* renamed from: c, reason: collision with root package name */
    boolean f45381c;

    /* renamed from: d, reason: collision with root package name */
    String f45382d;

    /* renamed from: e, reason: collision with root package name */
    String f45383e;

    /* renamed from: f, reason: collision with root package name */
    String f45384f;

    /* renamed from: g, reason: collision with root package name */
    String f45385g;

    /* renamed from: h, reason: collision with root package name */
    String f45386h;

    /* renamed from: i, reason: collision with root package name */
    String f45387i;

    private C5686a() {
    }

    C5686a(String str, int i10, boolean z10, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f45379a = str;
        this.f45380b = i10;
        this.f45381c = z10;
        this.f45382d = str2;
        this.f45383e = str3;
        this.f45384f = str4;
        this.f45385g = str5;
        this.f45386h = str6;
        this.f45387i = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 1, this.f45379a, false);
        C15708b.n(parcel, 2, this.f45380b);
        C15708b.c(parcel, 3, this.f45381c);
        C15708b.w(parcel, 4, this.f45382d, false);
        C15708b.w(parcel, 5, this.f45383e, false);
        C15708b.w(parcel, 6, this.f45384f, false);
        C15708b.w(parcel, 7, this.f45385g, false);
        C15708b.w(parcel, 8, this.f45386h, false);
        C15708b.w(parcel, 9, this.f45387i, false);
        C15708b.b(parcel, iA);
    }
}
