package j$.nio.file.spi;

import j$.desugar.sun.nio.fs.g;
import j$.nio.file.AbstractC14864h;
import j$.nio.file.C14860d;
import j$.nio.file.CopyOption;
import j$.nio.file.E;
import j$.nio.file.EnumC14854a;
import j$.nio.file.Files;
import j$.nio.file.LinkOption;
import j$.nio.file.Path;
import j$.nio.file.attribute.BasicFileAttributes;
import j$.nio.file.attribute.k;
import j$.nio.file.attribute.o;
import j$.nio.file.t;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.DirectoryStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f139265a = g.p(new Object[]{E.CREATE, E.TRUNCATE_EXISTING, E.WRITE});

    public abstract void A(Path path, String str, Object obj, LinkOption... linkOptionArr);

    public abstract void a(Path path, EnumC14854a... enumC14854aArr);

    public abstract void b(Path path, Path path2, CopyOption... copyOptionArr);

    public abstract void c(Path path, k... kVarArr);

    public abstract void d(Path path, Path path2);

    public abstract void e(Path path, Path path2, k... kVarArr);

    public abstract void f(Path path);

    public abstract boolean g(Path path);

    public abstract o h(Path path, Class cls, LinkOption... linkOptionArr);

    public abstract C14860d i(Path path);

    public abstract AbstractC14864h j(URI uri);

    public abstract Path k(URI uri);

    public abstract String l();

    public abstract boolean m(Path path);

    public abstract boolean n(Path path, Path path2);

    public abstract void o(Path path, Path path2, CopyOption... copyOptionArr);

    public abstract j$.nio.channels.a p(Path path, Set set, ExecutorService executorService, k... kVarArr);

    public abstract SeekableByteChannel q(Path path, Set set, k... kVarArr);

    public abstract DirectoryStream r(Path path, DirectoryStream.Filter filter);

    public abstract FileChannel s(Path path, Set set, k... kVarArr);

    public abstract AbstractC14864h u(URI uri, Map map);

    public abstract BasicFileAttributes x(Path path, Class cls, LinkOption... linkOptionArr);

    public abstract Map y(Path path, String str, LinkOption... linkOptionArr);

    public abstract Path z(Path path);

    public c() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new RuntimePermission("fileSystemProvider"));
        }
    }

    public AbstractC14864h t(Path path, Map map) {
        throw new UnsupportedOperationException();
    }

    public InputStream v(Path path, t... tVarArr) {
        Set set;
        if (tVarArr.length > 0) {
            for (t tVar : tVarArr) {
                if (tVar == E.APPEND || tVar == E.WRITE) {
                    throw new UnsupportedOperationException("'" + tVar + "' not allowed");
                }
            }
        }
        int i10 = Files.f139193a;
        if (tVarArr.length == 0) {
            set = Collections.EMPTY_SET;
        } else {
            HashSet hashSet = new HashSet();
            Collections.addAll(hashSet, tVarArr);
            set = hashSet;
        }
        return Channels.newInputStream(Files.b(path).q(path, set, new k[0]));
    }

    public OutputStream w(Path path, t... tVarArr) {
        Set set;
        if (tVarArr.length == 0) {
            set = f139265a;
        } else {
            HashSet hashSet = new HashSet();
            for (t tVar : tVarArr) {
                if (tVar == E.READ) {
                    throw new IllegalArgumentException("READ not allowed");
                }
                hashSet.add(tVar);
            }
            hashSet.add(E.WRITE);
            set = hashSet;
        }
        return Channels.newOutputStream(q(path, set, new k[0]));
    }
}
