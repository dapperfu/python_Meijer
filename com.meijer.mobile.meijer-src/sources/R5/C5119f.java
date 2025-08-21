package R5;

import android.content.Context;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: R5.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C5119f implements InterfaceC5120g {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, InterfaceC5118e> f31920a = new HashMap();

    C5119f() {
    }

    private File b(String str) {
        Context applicationContext = K.f().a().getApplicationContext();
        if (applicationContext == null) {
            t.a("Services", "DataQueueService", "Failed to create DataQueue for database (%s), the ApplicationContext is null", str);
            return null;
        }
        String strI = M5.g.i(str);
        File databasePath = applicationContext.getDatabasePath(strI);
        if (!databasePath.exists()) {
            try {
                File fileO = K.f().e().o();
                if (fileO != null) {
                    File file = new File(fileO, strI);
                    if (file.exists()) {
                        M5.g.f(file, databasePath);
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

    @Override // R5.InterfaceC5120g
    public InterfaceC5118e a(String str) {
        if (g6.i.a(str)) {
            t.f("Services", "DataQueueService", "Failed to create DataQueue, database name is null", new Object[0]);
            return null;
        }
        InterfaceC5118e interfaceC5118e = this.f31920a.get(str);
        if (interfaceC5118e == null) {
            synchronized (this) {
                try {
                    InterfaceC5118e interfaceC5118e2 = this.f31920a.get(str);
                    if (interfaceC5118e2 == null) {
                        File fileB = b(str);
                        if (fileB == null) {
                            t.f("Services", "DataQueueService", "Failed to create DataQueue for database (%s).", str);
                            return null;
                        }
                        J j10 = new J(str, fileB.getPath());
                        this.f31920a.put(str, j10);
                        interfaceC5118e2 = j10;
                    }
                    return interfaceC5118e2;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return interfaceC5118e;
    }
}
