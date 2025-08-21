package j$.nio.file;

import java.security.PrivilegedAction;

/* renamed from: j$.nio.file.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14865i implements PrivilegedAction {
    @Override // java.security.PrivilegedAction
    public final Object run() {
        j$.nio.file.spi.c cVar = j$.adapter.b.f139135a;
        String property = System.getProperty("java.nio.file.spi.DefaultFileSystemProvider");
        if (property != null) {
            for (String str : property.split(",")) {
                try {
                    cVar = (j$.nio.file.spi.c) Class.forName(str, true, ClassLoader.getSystemClassLoader()).getDeclaredConstructor(j$.nio.file.spi.c.class).newInstance(cVar);
                    if (!cVar.l().equals("file")) {
                        throw new Error("Default provider must use scheme 'file'");
                    }
                } catch (Exception e10) {
                    throw new Error(e10);
                }
            }
        }
        return cVar;
    }
}
