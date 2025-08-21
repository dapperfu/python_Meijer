package U3;

import android.os.Bundle;
import android.os.Parcel;
import c3.C6476a;
import d3.C13599a;
import d3.C13605g;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class b {
    public e a(long j10, byte[] bArr, int i10, int i11) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, i10, i11);
        parcelObtain.setDataPosition(0);
        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
        parcelObtain.recycle();
        return new e(C13605g.a(new De.g() { // from class: U3.a
            @Override // De.g
            public final Object apply(Object obj) {
                return C6476a.b((Bundle) obj);
            }
        }, (ArrayList) C13599a.e(bundle.getParcelableArrayList("c"))), j10, bundle.getLong("d"));
    }
}
