package hh;

import com.google.android.gms.common.api.a;
import java.nio.charset.Charset;

/* renamed from: hh.p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
abstract class AbstractC14469p {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f135043a = Charset.forName("UTF-8");

    static int a(int i10) {
        return i10 < 31 ? 1 << i10 : a.e.API_PRIORITY_OTHER;
    }
}
