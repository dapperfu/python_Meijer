package Xd;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import kd.AbstractC15136a;
import kd.C15137b;
import kd.C15139d;

/* loaded from: classes6.dex */
public final class j extends AbstractC15136a implements InterfaceC5417a {
    public static final Parcelable.Creator<j> CREATOR = new o();

    /* renamed from: a, reason: collision with root package name */
    String f39256a;

    /* renamed from: b, reason: collision with root package name */
    C5419c f39257b;

    /* renamed from: c, reason: collision with root package name */
    UserAddress f39258c;

    /* renamed from: d, reason: collision with root package name */
    k f39259d;

    /* renamed from: e, reason: collision with root package name */
    String f39260e;

    /* renamed from: f, reason: collision with root package name */
    Bundle f39261f;

    /* renamed from: g, reason: collision with root package name */
    String f39262g;

    /* renamed from: h, reason: collision with root package name */
    Bundle f39263h;

    private j() {
    }

    j(String str, C5419c c5419c, UserAddress userAddress, k kVar, String str2, Bundle bundle, String str3, Bundle bundle2) {
        this.f39256a = str;
        this.f39257b = c5419c;
        this.f39258c = userAddress;
        this.f39259d = kVar;
        this.f39260e = str2;
        this.f39261f = bundle;
        this.f39262g = str3;
        this.f39263h = bundle2;
    }

    @Override // Xd.InterfaceC5417a
    public void h(Intent intent) {
        C15139d.b(this, intent, "com.google.android.gms.wallet.PaymentData");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 1, this.f39256a, false);
        C15137b.u(parcel, 2, this.f39257b, i10, false);
        C15137b.u(parcel, 3, this.f39258c, i10, false);
        C15137b.u(parcel, 4, this.f39259d, i10, false);
        C15137b.w(parcel, 5, this.f39260e, false);
        C15137b.e(parcel, 6, this.f39261f, false);
        C15137b.w(parcel, 7, this.f39262g, false);
        C15137b.e(parcel, 8, this.f39263h, false);
        C15137b.b(parcel, iA);
    }
}
