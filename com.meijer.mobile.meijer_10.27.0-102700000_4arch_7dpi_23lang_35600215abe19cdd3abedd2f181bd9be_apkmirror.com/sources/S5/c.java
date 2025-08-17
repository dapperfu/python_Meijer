package S5;

import Q5.t;
import R5.d;
import java.io.File;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.Map;

/* loaded from: classes4.dex */
public class c implements d {

    /* renamed from: a, reason: collision with root package name */
    private final a f33242a = new a("aepsdkcache");

    private R5.b c(String str) {
        try {
            return str == null ? R5.b.d() : R5.b.a(new Date(Long.parseLong(str)));
        } catch (NumberFormatException unused) {
            t.a("Services", "FileCacheService", "Failed to parse expiry from stored metadata. Marking as expired", new Object[0]);
            return R5.b.a(new Date(0L));
        }
    }

    @Override // R5.d
    public boolean a(String str, String str2, R5.a aVar) {
        if (this.f33242a.b(str) != null) {
            return this.f33242a.c(str, str2, aVar);
        }
        t.a("Services", "FileCacheService", "Could not set value for key: [%s] in cache: [%s].Cache creation failed.", new Object[0]);
        return false;
    }

    @Override // R5.d
    public R5.c b(String str, String str2) throws NoSuchAlgorithmException {
        File fileF = this.f33242a.f(str, str2);
        if (fileF == null) {
            return null;
        }
        Map<String, String> mapH = this.f33242a.h(str, str2);
        if (mapH == null) {
            t.a("Services", "FileCacheService", "Could not find metadata for key: [%s] in cache: [%s].", new Object[0]);
            d(str, str2);
            return null;
        }
        R5.b bVarC = c(mapH.get("expiryInMillis"));
        if (!bVarC.c()) {
            return new b(fileF, bVarC, mapH);
        }
        t.a("Services", "FileCacheService", "Cache entry for key: [%s] in cache: [%s] has expired.", new Object[0]);
        d(str, str2);
        return null;
    }

    public boolean d(String str, String str2) {
        return this.f33242a.e(str, str2);
    }
}
