package Xd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: Xd.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5419c extends AbstractC15136a {
    public static final Parcelable.Creator<C5419c> CREATOR = new y();

    /* renamed from: a, reason: collision with root package name */
    String f39207a;

    /* renamed from: b, reason: collision with root package name */
    String f39208b;

    /* renamed from: c, reason: collision with root package name */
    String f39209c;

    /* renamed from: d, reason: collision with root package name */
    int f39210d;

    /* renamed from: e, reason: collision with root package name */
    UserAddress f39211e;

    private C5419c() {
    }

    C5419c(String str, String str2, String str3, int i10, UserAddress userAddress) {
        this.f39207a = str;
        this.f39208b = str2;
        this.f39209c = str3;
        this.f39210d = i10;
        this.f39211e = userAddress;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 1, this.f39207a, false);
        C15137b.w(parcel, 2, this.f39208b, false);
        C15137b.w(parcel, 3, this.f39209c, false);
        C15137b.n(parcel, 4, this.f39210d);
        C15137b.u(parcel, 5, this.f39211e, i10, false);
        C15137b.b(parcel, iA);
    }
}
