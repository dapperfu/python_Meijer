package Xd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: Xd.h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5424h extends AbstractC15136a {
    public static final Parcelable.Creator<C5424h> CREATOR = new G();

    /* renamed from: a, reason: collision with root package name */
    private final int f39251a;

    /* renamed from: b, reason: collision with root package name */
    String f39252b;

    /* renamed from: c, reason: collision with root package name */
    String f39253c;

    /* renamed from: d, reason: collision with root package name */
    CommonWalletObject f39254d;

    C5424h() {
        this.f39251a = 3;
    }

    C5424h(int i10, String str, String str2, CommonWalletObject commonWalletObject) {
        this.f39251a = i10;
        this.f39253c = str2;
        if (i10 >= 3) {
            this.f39254d = commonWalletObject;
            return;
        }
        com.google.android.gms.wallet.wobs.a aVarB = CommonWalletObject.B();
        aVarB.a(str);
        this.f39254d = aVarB.b();
    }

    public int B() {
        return this.f39251a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, B());
        C15137b.w(parcel, 2, this.f39252b, false);
        C15137b.w(parcel, 3, this.f39253c, false);
        C15137b.u(parcel, 4, this.f39254d, i10, false);
        C15137b.b(parcel, iA);
    }
}
