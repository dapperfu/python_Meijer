package T5;

import R5.t;
import S5.d;
import java.io.File;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.Map;

/* loaded from: classes4.dex */
public class c implements d {

    /* renamed from: a, reason: collision with root package name */
    private final a f35912a = new a("aepsdkcache");

    private S5.b c(String str) {
        try {
            return str == null ? S5.b.d() : S5.b.a(new Date(Long.parseLong(str)));
        } catch (NumberFormatException unused) {
            t.a("Services", "FileCacheService", "Failed to parse expiry from stored metadata. Marking as expired", new Object[0]);
            return S5.b.a(new Date(0L));
        }
    }

    @Override // S5.d
    public S5.c a(String str, String str2) throws NoSuchAlgorithmException {
        File fileF = this.f35912a.f(str, str2);
        if (fileF == null) {
            return null;
        }
        Map<String, String> mapH = this.f35912a.h(str, str2);
        if (mapH == null) {
            t.a("Services", "FileCacheService", "Could not find metadata for key: [%s] in cache: [%s].", new Object[0]);
            d(str, str2);
            return null;
        }
        S5.b bVarC = c(mapH.get("expiryInMillis"));
        if (!bVarC.c()) {
            return new b(fileF, bVarC, mapH);
        }
        t.a("Services", "FileCacheService", "Cache entry for key: [%s] in cache: [%s] has expired.", new Object[0]);
        d(str, str2);
        return null;
    }

    @Override // S5.d
    public boolean b(String str, String str2, S5.a aVar) {
        if (this.f35912a.b(str) != null) {
            return this.f35912a.c(str, str2, aVar);
        }
        t.a("Services", "FileCacheService", "Could not set value for key: [%s] in cache: [%s].Cache creation failed.", new Object[0]);
        return false;
    }

    public boolean d(String str, String str2) {
        return this.f35912a.e(str, str2);
    }
}
