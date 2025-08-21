package com.google.android.gms.wallet;

import Zd.C5633f;
import Zd.C5634g;
import Zd.C5635h;
import Zd.n;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class MaskedWallet extends AbstractC15707a implements ReflectedParcelable {
    public static final Parcelable.Creator<MaskedWallet> CREATOR = new d();

    /* renamed from: a, reason: collision with root package name */
    String f86960a;

    /* renamed from: b, reason: collision with root package name */
    String f86961b;

    /* renamed from: c, reason: collision with root package name */
    String[] f86962c;

    /* renamed from: d, reason: collision with root package name */
    String f86963d;

    /* renamed from: e, reason: collision with root package name */
    n f86964e;

    /* renamed from: f, reason: collision with root package name */
    n f86965f;

    /* renamed from: g, reason: collision with root package name */
    C5634g[] f86966g;

    /* renamed from: h, reason: collision with root package name */
    C5635h[] f86967h;

    /* renamed from: i, reason: collision with root package name */
    UserAddress f86968i;

    /* renamed from: j, reason: collision with root package name */
    UserAddress f86969j;

    /* renamed from: k, reason: collision with root package name */
    C5633f[] f86970k;

    private MaskedWallet() {
    }

    MaskedWallet(String str, String str2, String[] strArr, String str3, n nVar, n nVar2, C5634g[] c5634gArr, C5635h[] c5635hArr, UserAddress userAddress, UserAddress userAddress2, C5633f[] c5633fArr) {
        this.f86960a = str;
        this.f86961b = str2;
        this.f86962c = strArr;
        this.f86963d = str3;
        this.f86964e = nVar;
        this.f86965f = nVar2;
        this.f86966g = c5634gArr;
        this.f86967h = c5635hArr;
        this.f86968i = userAddress;
        this.f86969j = userAddress2;
        this.f86970k = c5633fArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 2, this.f86960a, false);
        C15708b.w(parcel, 3, this.f86961b, false);
        C15708b.x(parcel, 4, this.f86962c, false);
        C15708b.w(parcel, 5, this.f86963d, false);
        C15708b.u(parcel, 6, this.f86964e, i10, false);
        C15708b.u(parcel, 7, this.f86965f, i10, false);
        C15708b.z(parcel, 8, this.f86966g, i10, false);
        C15708b.z(parcel, 9, this.f86967h, i10, false);
        C15708b.u(parcel, 10, this.f86968i, i10, false);
        C15708b.u(parcel, 11, this.f86969j, i10, false);
        C15708b.z(parcel, 12, this.f86970k, i10, false);
        C15708b.b(parcel, iA);
    }
}
