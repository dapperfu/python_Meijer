package Zd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Zd.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5632e extends AbstractC15707a {
    public static final Parcelable.Creator<C5632e> CREATOR = new C();

    /* renamed from: a, reason: collision with root package name */
    CommonWalletObject f43695a;

    /* renamed from: b, reason: collision with root package name */
    String f43696b;

    /* renamed from: c, reason: collision with root package name */
    String f43697c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    String f43698d;

    /* renamed from: e, reason: collision with root package name */
    long f43699e;

    /* renamed from: f, reason: collision with root package name */
    String f43700f;

    /* renamed from: g, reason: collision with root package name */
    long f43701g;

    /* renamed from: h, reason: collision with root package name */
    String f43702h;

    C5632e() {
        this.f43695a = CommonWalletObject.B().b();
    }

    C5632e(CommonWalletObject commonWalletObject, String str, String str2, String str3, long j10, String str4, long j11, String str5) {
        CommonWalletObject.B();
        this.f43695a = commonWalletObject;
        this.f43696b = str;
        this.f43697c = str2;
        this.f43699e = j10;
        this.f43700f = str4;
        this.f43701g = j11;
        this.f43702h = str5;
        this.f43698d = str3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.u(parcel, 2, this.f43695a, i10, false);
        C15708b.w(parcel, 3, this.f43696b, false);
        C15708b.w(parcel, 4, this.f43697c, false);
        C15708b.w(parcel, 5, this.f43698d, false);
        C15708b.s(parcel, 6, this.f43699e);
        C15708b.w(parcel, 7, this.f43700f, false);
        C15708b.s(parcel, 8, this.f43701g);
        C15708b.w(parcel, 9, this.f43702h, false);
        C15708b.b(parcel, iA);
    }
}
