package ph;

import java.util.UUID;

/* renamed from: ph.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C16430g {

    /* renamed from: a, reason: collision with root package name */
    final String f156483a = UUID.randomUUID().toString();

    /* renamed from: b, reason: collision with root package name */
    final String f156484b;

    C16430g(String str) {
        if (str == null) {
            this.f156484b = null;
        } else {
            this.f156484b = str.substring(Math.max(0, str.length() - 6));
        }
    }
}
