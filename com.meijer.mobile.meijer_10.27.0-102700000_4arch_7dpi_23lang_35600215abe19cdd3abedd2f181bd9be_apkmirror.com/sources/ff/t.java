package ff;

import com.google.android.gms.common.api.a;

/* loaded from: classes7.dex */
public final class t {
    static int a(int i10) {
        if (i10 >= 3) {
            return i10 < 1073741824 ? (int) ((i10 / 0.75f) + 1.0f) : a.e.API_PRIORITY_OTHER;
        }
        C13887c.a(i10, "expectedSize");
        return i10 + 1;
    }
}
