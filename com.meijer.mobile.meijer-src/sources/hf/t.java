package hf;

import com.google.android.gms.common.api.a;

/* loaded from: classes8.dex */
public final class t {
    static int a(int i10) {
        if (i10 >= 3) {
            return i10 < 1073741824 ? (int) ((i10 / 0.75f) + 1.0f) : a.e.API_PRIORITY_OTHER;
        }
        C14517c.a(i10, "expectedSize");
        return i10 + 1;
    }
}
