package com.google.android.gms.wallet;

import Xd.C5422f;
import Xd.C5423g;
import Xd.C5424h;
import Xd.n;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class MaskedWallet extends AbstractC15136a implements ReflectedParcelable {
    public static final Parcelable.Creator<MaskedWallet> CREATOR = new d();

    /* renamed from: a, reason: collision with root package name */
    String f86120a;

    /* renamed from: b, reason: collision with root package name */
    String f86121b;

    /* renamed from: c, reason: collision with root package name */
    String[] f86122c;

    /* renamed from: d, reason: collision with root package name */
    String f86123d;

    /* renamed from: e, reason: collision with root package name */
    n f86124e;

    /* renamed from: f, reason: collision with root package name */
    n f86125f;

    /* renamed from: g, reason: collision with root package name */
    C5423g[] f86126g;

    /* renamed from: h, reason: collision with root package name */
    C5424h[] f86127h;

    /* renamed from: i, reason: collision with root package name */
    UserAddress f86128i;

    /* renamed from: j, reason: collision with root package name */
    UserAddress f86129j;

    /* renamed from: k, reason: collision with root package name */
    C5422f[] f86130k;

    private MaskedWallet() {
    }

    MaskedWallet(String str, String str2, String[] strArr, String str3, n nVar, n nVar2, C5423g[] c5423gArr, C5424h[] c5424hArr, UserAddress userAddress, UserAddress userAddress2, C5422f[] c5422fArr) {
        this.f86120a = str;
        this.f86121b = str2;
        this.f86122c = strArr;
        this.f86123d = str3;
        this.f86124e = nVar;
        this.f86125f = nVar2;
        this.f86126g = c5423gArr;
        this.f86127h = c5424hArr;
        this.f86128i = userAddress;
        this.f86129j = userAddress2;
        this.f86130k = c5422fArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 2, this.f86120a, false);
        C15137b.w(parcel, 3, this.f86121b, false);
        C15137b.x(parcel, 4, this.f86122c, false);
        C15137b.w(parcel, 5, this.f86123d, false);
        C15137b.u(parcel, 6, this.f86124e, i10, false);
        C15137b.u(parcel, 7, this.f86125f, i10, false);
        C15137b.z(parcel, 8, this.f86126g, i10, false);
        C15137b.z(parcel, 9, this.f86127h, i10, false);
        C15137b.u(parcel, 10, this.f86128i, i10, false);
        C15137b.u(parcel, 11, this.f86129j, i10, false);
        C15137b.z(parcel, 12, this.f86130k, i10, false);
        C15137b.b(parcel, iA);
    }
}
