package U3;

import android.os.Bundle;
import android.os.Parcel;
import c3.C6350a;
import d3.C13466a;
import d3.C13472g;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class b {
    public e a(long j10, byte[] bArr, int i10, int i11) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, i10, i11);
        parcelObtain.setDataPosition(0);
        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
        parcelObtain.recycle();
        return new e(C13472g.a(new Be.g() { // from class: U3.a
            @Override // Be.g
            public final Object apply(Object obj) {
                return C6350a.b((Bundle) obj);
            }
        }, (ArrayList) C13466a.e(bundle.getParcelableArrayList("c"))), j10, bundle.getLong("d"));
    }
}
