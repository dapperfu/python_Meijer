package U3;

import android.os.Bundle;
import android.os.Parcel;
import c3.C6350a;
import d3.C13472g;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class d {
    public byte[] a(List<C6350a> list, long j10) {
        ArrayList<Bundle> arrayListB = C13472g.b(list, new Be.g() { // from class: U3.c
            @Override // Be.g
            public final Object apply(Object obj) {
                return ((C6350a) obj).d();
            }
        });
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayListB);
        bundle.putLong("d", j10);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
