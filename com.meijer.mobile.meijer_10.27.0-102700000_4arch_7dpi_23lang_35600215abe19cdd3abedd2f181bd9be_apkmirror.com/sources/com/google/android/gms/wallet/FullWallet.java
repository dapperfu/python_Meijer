package com.google.android.gms.wallet;

import Xd.C5422f;
import Xd.k;
import Xd.n;
import Xd.q;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class FullWallet extends AbstractC15136a implements ReflectedParcelable {
    public static final Parcelable.Creator<FullWallet> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    String f86109a;

    /* renamed from: b, reason: collision with root package name */
    String f86110b;

    /* renamed from: c, reason: collision with root package name */
    q f86111c;

    /* renamed from: d, reason: collision with root package name */
    String f86112d;

    /* renamed from: e, reason: collision with root package name */
    n f86113e;

    /* renamed from: f, reason: collision with root package name */
    n f86114f;

    /* renamed from: g, reason: collision with root package name */
    String[] f86115g;

    /* renamed from: h, reason: collision with root package name */
    UserAddress f86116h;

    /* renamed from: i, reason: collision with root package name */
    UserAddress f86117i;

    /* renamed from: j, reason: collision with root package name */
    C5422f[] f86118j;

    /* renamed from: k, reason: collision with root package name */
    k f86119k;

    private FullWallet() {
    }

    FullWallet(String str, String str2, q qVar, String str3, n nVar, n nVar2, String[] strArr, UserAddress userAddress, UserAddress userAddress2, C5422f[] c5422fArr, k kVar) {
        this.f86109a = str;
        this.f86110b = str2;
        this.f86111c = qVar;
        this.f86112d = str3;
        this.f86113e = nVar;
        this.f86114f = nVar2;
        this.f86115g = strArr;
        this.f86116h = userAddress;
        this.f86117i = userAddress2;
        this.f86118j = c5422fArr;
        this.f86119k = kVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 2, this.f86109a, false);
        C15137b.w(parcel, 3, this.f86110b, false);
        C15137b.u(parcel, 4, this.f86111c, i10, false);
        C15137b.w(parcel, 5, this.f86112d, false);
        C15137b.u(parcel, 6, this.f86113e, i10, false);
        C15137b.u(parcel, 7, this.f86114f, i10, false);
        C15137b.x(parcel, 8, this.f86115g, false);
        C15137b.u(parcel, 9, this.f86116h, i10, false);
        C15137b.u(parcel, 10, this.f86117i, i10, false);
        C15137b.z(parcel, 11, this.f86118j, i10, false);
        C15137b.u(parcel, 12, this.f86119k, i10, false);
        C15137b.b(parcel, iA);
    }
}
