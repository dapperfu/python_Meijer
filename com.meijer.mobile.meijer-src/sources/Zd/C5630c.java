package Zd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Zd.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5630c extends AbstractC15707a {
    public static final Parcelable.Creator<C5630c> CREATOR = new y();

    /* renamed from: a, reason: collision with root package name */
    String f43685a;

    /* renamed from: b, reason: collision with root package name */
    String f43686b;

    /* renamed from: c, reason: collision with root package name */
    String f43687c;

    /* renamed from: d, reason: collision with root package name */
    int f43688d;

    /* renamed from: e, reason: collision with root package name */
    UserAddress f43689e;

    private C5630c() {
    }

    C5630c(String str, String str2, String str3, int i10, UserAddress userAddress) {
        this.f43685a = str;
        this.f43686b = str2;
        this.f43687c = str3;
        this.f43688d = i10;
        this.f43689e = userAddress;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 1, this.f43685a, false);
        C15708b.w(parcel, 2, this.f43686b, false);
        C15708b.w(parcel, 3, this.f43687c, false);
        C15708b.n(parcel, 4, this.f43688d);
        C15708b.u(parcel, 5, this.f43689e, i10, false);
        C15708b.b(parcel, iA);
    }
}
