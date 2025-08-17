package Xd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: Xd.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5421e extends AbstractC15136a {
    public static final Parcelable.Creator<C5421e> CREATOR = new C();

    /* renamed from: a, reason: collision with root package name */
    CommonWalletObject f39217a;

    /* renamed from: b, reason: collision with root package name */
    String f39218b;

    /* renamed from: c, reason: collision with root package name */
    String f39219c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    String f39220d;

    /* renamed from: e, reason: collision with root package name */
    long f39221e;

    /* renamed from: f, reason: collision with root package name */
    String f39222f;

    /* renamed from: g, reason: collision with root package name */
    long f39223g;

    /* renamed from: h, reason: collision with root package name */
    String f39224h;

    C5421e() {
        this.f39217a = CommonWalletObject.B().b();
    }

    C5421e(CommonWalletObject commonWalletObject, String str, String str2, String str3, long j10, String str4, long j11, String str5) {
        CommonWalletObject.B();
        this.f39217a = commonWalletObject;
        this.f39218b = str;
        this.f39219c = str2;
        this.f39221e = j10;
        this.f39222f = str4;
        this.f39223g = j11;
        this.f39224h = str5;
        this.f39220d = str3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.u(parcel, 2, this.f39217a, i10, false);
        C15137b.w(parcel, 3, this.f39218b, false);
        C15137b.w(parcel, 4, this.f39219c, false);
        C15137b.w(parcel, 5, this.f39220d, false);
        C15137b.s(parcel, 6, this.f39221e);
        C15137b.w(parcel, 7, this.f39222f, false);
        C15137b.s(parcel, 8, this.f39223g);
        C15137b.w(parcel, 9, this.f39224h, false);
        C15137b.b(parcel, iA);
    }
}
