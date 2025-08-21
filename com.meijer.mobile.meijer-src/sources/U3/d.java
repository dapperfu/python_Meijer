package U3;

import android.os.Bundle;
import android.os.Parcel;
import c3.C6476a;
import d3.C13605g;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class d {
    public byte[] a(List<C6476a> list, long j10) {
        ArrayList<Bundle> arrayListB = C13605g.b(list, new De.g() { // from class: U3.c
            @Override // De.g
            public final Object apply(Object obj) {
                return ((C6476a) obj).d();
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
