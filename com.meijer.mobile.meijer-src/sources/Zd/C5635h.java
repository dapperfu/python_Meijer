package Zd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Zd.h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5635h extends AbstractC15707a {
    public static final Parcelable.Creator<C5635h> CREATOR = new G();

    /* renamed from: a, reason: collision with root package name */
    private final int f43729a;

    /* renamed from: b, reason: collision with root package name */
    String f43730b;

    /* renamed from: c, reason: collision with root package name */
    String f43731c;

    /* renamed from: d, reason: collision with root package name */
    CommonWalletObject f43732d;

    C5635h() {
        this.f43729a = 3;
    }

    C5635h(int i10, String str, String str2, CommonWalletObject commonWalletObject) {
        this.f43729a = i10;
        this.f43731c = str2;
        if (i10 >= 3) {
            this.f43732d = commonWalletObject;
            return;
        }
        com.google.android.gms.wallet.wobs.a aVarB = CommonWalletObject.B();
        aVarB.a(str);
        this.f43732d = aVarB.b();
    }

    public int B() {
        return this.f43729a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, B());
        C15708b.w(parcel, 2, this.f43730b, false);
        C15708b.w(parcel, 3, this.f43731c, false);
        C15708b.u(parcel, 4, this.f43732d, i10, false);
        C15708b.b(parcel, iA);
    }
}
