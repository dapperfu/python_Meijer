package Qd;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class J extends AbstractC15707a {
    public static final Parcelable.Creator<J> CREATOR = new K();

    /* renamed from: a, reason: collision with root package name */
    public final List f28056a;

    public static J B(G... gArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(gArr[0].zza()));
        return new J(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f28056a;
        int iA = C15708b.a(parcel);
        C15708b.p(parcel, 1, list, false);
        C15708b.b(parcel, iA);
    }

    J(List list) {
        this.f28056a = list;
    }
}
