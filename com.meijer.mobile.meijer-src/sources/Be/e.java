package Be;

import android.os.Parcelable;
import com.google.android.gms.internal.atv_ads_framework.F;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class e implements Parcelable {

    public static abstract class a {
        public abstract e a();
    }

    public abstract List<d> b();

    public static a a(List<d> list) {
        list.getClass();
        l lVar = new l();
        lVar.b(F.p(list));
        return lVar;
    }
}
