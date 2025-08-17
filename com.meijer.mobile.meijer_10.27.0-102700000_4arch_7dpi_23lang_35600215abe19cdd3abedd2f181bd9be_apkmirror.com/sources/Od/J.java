package Od;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class J extends AbstractC15136a {
    public static final Parcelable.Creator<J> CREATOR = new K();

    /* renamed from: a, reason: collision with root package name */
    public final List f23568a;

    public static J B(G... gArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(gArr[0].zza()));
        return new J(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f23568a;
        int iA = C15137b.a(parcel);
        C15137b.p(parcel, 1, list, false);
        C15137b.b(parcel, iA);
    }

    J(List list) {
        this.f23568a = list;
    }
}
