package Zd;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import md.AbstractC15707a;
import md.C15708b;
import md.C15710d;

/* loaded from: classes6.dex */
public final class j extends AbstractC15707a implements InterfaceC5628a {
    public static final Parcelable.Creator<j> CREATOR = new o();

    /* renamed from: a, reason: collision with root package name */
    String f43734a;

    /* renamed from: b, reason: collision with root package name */
    C5630c f43735b;

    /* renamed from: c, reason: collision with root package name */
    UserAddress f43736c;

    /* renamed from: d, reason: collision with root package name */
    k f43737d;

    /* renamed from: e, reason: collision with root package name */
    String f43738e;

    /* renamed from: f, reason: collision with root package name */
    Bundle f43739f;

    /* renamed from: g, reason: collision with root package name */
    String f43740g;

    /* renamed from: h, reason: collision with root package name */
    Bundle f43741h;

    private j() {
    }

    j(String str, C5630c c5630c, UserAddress userAddress, k kVar, String str2, Bundle bundle, String str3, Bundle bundle2) {
        this.f43734a = str;
        this.f43735b = c5630c;
        this.f43736c = userAddress;
        this.f43737d = kVar;
        this.f43738e = str2;
        this.f43739f = bundle;
        this.f43740g = str3;
        this.f43741h = bundle2;
    }

    @Override // Zd.InterfaceC5628a
    public void h(Intent intent) {
        C15710d.b(this, intent, "com.google.android.gms.wallet.PaymentData");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 1, this.f43734a, false);
        C15708b.u(parcel, 2, this.f43735b, i10, false);
        C15708b.u(parcel, 3, this.f43736c, i10, false);
        C15708b.u(parcel, 4, this.f43737d, i10, false);
        C15708b.w(parcel, 5, this.f43738e, false);
        C15708b.e(parcel, 6, this.f43739f, false);
        C15708b.w(parcel, 7, this.f43740g, false);
        C15708b.e(parcel, 8, this.f43741h, false);
        C15708b.b(parcel, iA);
    }
}
