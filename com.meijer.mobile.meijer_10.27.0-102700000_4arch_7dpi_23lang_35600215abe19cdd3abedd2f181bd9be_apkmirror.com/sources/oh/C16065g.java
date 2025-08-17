package oh;

import java.util.UUID;

/* renamed from: oh.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C16065g {

    /* renamed from: a, reason: collision with root package name */
    final String f153723a = UUID.randomUUID().toString();

    /* renamed from: b, reason: collision with root package name */
    final String f153724b;

    C16065g(String str) {
        if (str == null) {
            this.f153724b = null;
        } else {
            this.f153724b = str.substring(Math.max(0, str.length() - 6));
        }
    }
}
