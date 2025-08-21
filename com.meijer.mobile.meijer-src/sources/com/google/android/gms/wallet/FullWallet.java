package com.google.android.gms.wallet;

import Zd.C5633f;
import Zd.k;
import Zd.n;
import Zd.q;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class FullWallet extends AbstractC15707a implements ReflectedParcelable {
    public static final Parcelable.Creator<FullWallet> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    String f86949a;

    /* renamed from: b, reason: collision with root package name */
    String f86950b;

    /* renamed from: c, reason: collision with root package name */
    q f86951c;

    /* renamed from: d, reason: collision with root package name */
    String f86952d;

    /* renamed from: e, reason: collision with root package name */
    n f86953e;

    /* renamed from: f, reason: collision with root package name */
    n f86954f;

    /* renamed from: g, reason: collision with root package name */
    String[] f86955g;

    /* renamed from: h, reason: collision with root package name */
    UserAddress f86956h;

    /* renamed from: i, reason: collision with root package name */
    UserAddress f86957i;

    /* renamed from: j, reason: collision with root package name */
    C5633f[] f86958j;

    /* renamed from: k, reason: collision with root package name */
    k f86959k;

    private FullWallet() {
    }

    FullWallet(String str, String str2, q qVar, String str3, n nVar, n nVar2, String[] strArr, UserAddress userAddress, UserAddress userAddress2, C5633f[] c5633fArr, k kVar) {
        this.f86949a = str;
        this.f86950b = str2;
        this.f86951c = qVar;
        this.f86952d = str3;
        this.f86953e = nVar;
        this.f86954f = nVar2;
        this.f86955g = strArr;
        this.f86956h = userAddress;
        this.f86957i = userAddress2;
        this.f86958j = c5633fArr;
        this.f86959k = kVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 2, this.f86949a, false);
        C15708b.w(parcel, 3, this.f86950b, false);
        C15708b.u(parcel, 4, this.f86951c, i10, false);
        C15708b.w(parcel, 5, this.f86952d, false);
        C15708b.u(parcel, 6, this.f86953e, i10, false);
        C15708b.u(parcel, 7, this.f86954f, i10, false);
        C15708b.x(parcel, 8, this.f86955g, false);
        C15708b.u(parcel, 9, this.f86956h, i10, false);
        C15708b.u(parcel, 10, this.f86957i, i10, false);
        C15708b.z(parcel, 11, this.f86958j, i10, false);
        C15708b.u(parcel, 12, this.f86959k, i10, false);
        C15708b.b(parcel, iA);
    }
}
