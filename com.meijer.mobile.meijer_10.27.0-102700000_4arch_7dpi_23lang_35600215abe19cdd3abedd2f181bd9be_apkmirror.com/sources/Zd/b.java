package Zd;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class b extends AbstractC15136a {
    public static final Parcelable.Creator<b> CREATOR = new l();

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    String f42603a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    String f42604b;

    /* renamed from: c, reason: collision with root package name */
    final ArrayList f42605c;

    b(String str, String str2, ArrayList arrayList) {
        this.f42603a = str;
        this.f42604b = str2;
        this.f42605c = arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 2, this.f42603a, false);
        C15137b.w(parcel, 3, this.f42604b, false);
        C15137b.A(parcel, 4, this.f42605c, false);
        C15137b.b(parcel, iA);
    }
}
