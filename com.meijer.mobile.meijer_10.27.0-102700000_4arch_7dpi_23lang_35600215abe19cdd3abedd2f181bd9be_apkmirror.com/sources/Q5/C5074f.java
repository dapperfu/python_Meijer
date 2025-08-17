package Q5;

import android.content.Context;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: Q5.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C5074f implements InterfaceC5075g {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, InterfaceC5073e> f29809a = new HashMap();

    C5074f() {
    }

    private File b(String str) {
        Context applicationContext = K.f().a().getApplicationContext();
        if (applicationContext == null) {
            t.a("Services", "DataQueueService", "Failed to create DataQueue for database (%s), the ApplicationContext is null", str);
            return null;
        }
        String strI = L5.g.i(str);
        File databasePath = applicationContext.getDatabasePath(strI);
        if (!databasePath.exists()) {
            try {
                File fileO = K.f().e().o();
                if (fileO != null) {
                    File file = new File(fileO, strI);
                    if (file.exists()) {
                        L5.g.f(file, databasePath);
                        t.a("Services", "DataQueueService", "Successfully moved DataQueue for database (%s) from cache directory to database directory", str);
                    }
                }
            } catch (Exception unused) {
                t.a("Services", "DataQueueService", "Failed to move DataQueue for database (%s) from cache directory to database directory", str);
                return databasePath;
            }
        }
        return databasePath;
    }

    @Override // Q5.InterfaceC5075g
    public InterfaceC5073e a(String str) {
        if (f6.i.a(str)) {
            t.f("Services", "DataQueueService", "Failed to create DataQueue, database name is null", new Object[0]);
            return null;
        }
        InterfaceC5073e interfaceC5073e = this.f29809a.get(str);
        if (interfaceC5073e == null) {
            synchronized (this) {
                try {
                    InterfaceC5073e interfaceC5073e2 = this.f29809a.get(str);
                    if (interfaceC5073e2 == null) {
                        File fileB = b(str);
                        if (fileB == null) {
                            t.f("Services", "DataQueueService", "Failed to create DataQueue for database (%s).", str);
                            return null;
                        }
                        J j10 = new J(str, fileB.getPath());
                        this.f29809a.put(str, j10);
                        interfaceC5073e2 = j10;
                    }
                    return interfaceC5073e2;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return interfaceC5073e;
    }
}
