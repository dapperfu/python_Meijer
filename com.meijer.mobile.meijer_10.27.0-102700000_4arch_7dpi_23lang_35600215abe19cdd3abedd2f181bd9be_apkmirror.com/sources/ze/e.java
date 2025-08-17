package ze;

import android.os.Parcelable;
import com.google.android.gms.internal.atv_ads_framework.F;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class e implements Parcelable {

    /* loaded from: classes5.dex */
    public static abstract class a {
        public abstract e a();
    }

    public abstract List<AbstractC18449d> b();

    public static a a(List<AbstractC18449d> list) {
        list.getClass();
        l lVar = new l();
        lVar.b(F.p(list));
        return lVar;
    }
}
