package ih;

import com.google.android.gms.common.api.a;
import java.nio.charset.Charset;

/* renamed from: ih.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
abstract class AbstractC14749p {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f137683a = Charset.forName("UTF-8");

    static int a(int i10) {
        return i10 < 31 ? 1 << i10 : a.e.API_PRIORITY_OTHER;
    }
}
