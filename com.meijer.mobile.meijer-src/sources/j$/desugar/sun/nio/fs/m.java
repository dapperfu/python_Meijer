package j$.desugar.sun.nio.fs;

import com.medallia.digital.mobilesdk.q2;
import j$.nio.file.AbstractC14864h;
import j$.nio.file.C14860d;
import j$.nio.file.CopyOption;
import j$.nio.file.E;
import j$.nio.file.EnumC14854a;
import j$.nio.file.Files;
import j$.nio.file.LinkOption;
import j$.nio.file.Path;
import j$.nio.file.StandardCopyOption;
import j$.nio.file.attribute.BasicFileAttributes;
import j$.nio.file.attribute.FileTime;
import j$.nio.file.t;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URI;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.NoSuchFileException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class m extends j$.nio.file.spi.c {

    /* renamed from: b, reason: collision with root package name */
    public final String f139167b;

    /* renamed from: c, reason: collision with root package name */
    public final String f139168c = q2.f93563c;

    /* renamed from: d, reason: collision with root package name */
    public volatile i f139169d;

    public m(String str) {
        this.f139167b = str;
    }

    @Override // j$.nio.file.spi.c
    public final String l() {
        return "file";
    }

    @Override // j$.nio.file.spi.c
    public final AbstractC14864h u(URI uri, Map map) {
        B(uri);
        throw new FileSystemAlreadyExistsException();
    }

    @Override // j$.nio.file.spi.c
    public final AbstractC14864h j(URI uri) {
        i iVar;
        B(uri);
        i iVar2 = this.f139169d;
        if (iVar2 != null) {
            return iVar2;
        }
        synchronized (this) {
            try {
                iVar = this.f139169d;
                if (iVar == null) {
                    iVar = new i(this, this.f139167b, this.f139168c);
                    this.f139169d = iVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iVar;
    }

    @Override // j$.nio.file.spi.c
    public final Path k(URI uri) {
        byte bA;
        i iVar = this.f139169d;
        String str = this.f139167b;
        String str2 = this.f139168c;
        char[] cArr = p.f139180c;
        if (!uri.isAbsolute()) {
            throw new IllegalArgumentException("URI is not absolute");
        }
        if (uri.isOpaque()) {
            throw new IllegalArgumentException("URI is not hierarchical");
        }
        String scheme = uri.getScheme();
        if (scheme == null || !scheme.equalsIgnoreCase("file")) {
            throw new IllegalArgumentException("URI scheme is not \"file\"");
        }
        if (uri.getRawAuthority() != null) {
            throw new IllegalArgumentException("URI has an authority component");
        }
        if (uri.getRawFragment() != null) {
            throw new IllegalArgumentException("URI has a fragment component");
        }
        if (uri.getRawQuery() != null) {
            throw new IllegalArgumentException("URI has a query component");
        }
        String rawPath = uri.getRawPath();
        int length = rawPath.length();
        if (length == 0) {
            throw new IllegalArgumentException("URI path component is empty");
        }
        if (rawPath.endsWith(q2.f93563c) && length > 1) {
            length--;
        }
        byte[] bArrCopyOf = new byte[length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i10 + 1;
            char cCharAt = rawPath.charAt(i10);
            if (cCharAt == '%') {
                int i13 = i10 + 2;
                i10 += 3;
                bA = (byte) ((p.a(rawPath.charAt(i12)) << 4) | p.a(rawPath.charAt(i13)));
                if (bA == 0) {
                    throw new IllegalArgumentException("Nul character not allowed");
                }
            } else {
                if (cCharAt == 0 || cCharAt >= 128) {
                    throw new IllegalArgumentException("Bad escape");
                }
                bA = (byte) cCharAt;
                i10 = i12;
            }
            bArrCopyOf[i11] = bA;
            i11++;
        }
        if (i11 != length) {
            bArrCopyOf = Arrays.copyOf(bArrCopyOf, i11);
        }
        return new o(iVar, new String(bArrCopyOf, q.f139181a), str, str2);
    }

    @Override // j$.nio.file.spi.c
    public final DirectoryStream r(Path path, DirectoryStream.Filter filter) {
        k kVar = new k();
        kVar.f139162a = new l(this, path, filter);
        return kVar;
    }

    @Override // j$.nio.file.spi.c
    public final void c(Path path, j$.nio.file.attribute.k... kVarArr) throws NoSuchFileException, FileAlreadyExistsException {
        if (path.getParent() != null && !Files.exists(path.getParent(), new LinkOption[0])) {
            throw new NoSuchFileException(path.toString());
        }
        if (!path.toFile().mkdirs()) {
            throw new FileAlreadyExistsException(path.toString());
        }
    }

    @Override // j$.nio.file.spi.c
    public final void f(Path path) throws NoSuchFileException {
        try {
            a(path, new EnumC14854a[0]);
            g(path);
        } catch (IOException unused) {
            throw new NoSuchFileException(path.toString());
        }
    }

    @Override // j$.nio.file.spi.c
    public final boolean g(Path path) {
        return path.toFile().delete();
    }

    @Override // j$.nio.file.spi.c
    public final SeekableByteChannel q(Path path, Set set, j$.nio.file.attribute.k... kVarArr) {
        return s(path, set, kVarArr);
    }

    @Override // j$.nio.file.spi.c
    public final FileChannel s(Path path, Set set, j$.nio.file.attribute.k... kVarArr) throws IOException {
        String str;
        if (!path.toFile().isDirectory()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((t) it.next()).getClass();
            }
            if (path.toFile().exists()) {
                if (set.contains(E.CREATE_NEW) && set.contains(E.WRITE)) {
                    throw new FileAlreadyExistsException(path.toString());
                }
            } else if (!set.contains(E.CREATE) && !set.contains(E.CREATE_NEW)) {
                throw new NoSuchFileException(path.toString());
            }
            if (set.contains(E.READ) && set.contains(E.APPEND)) {
                throw new IllegalArgumentException("READ + APPEND not allowed");
            }
            E e10 = E.APPEND;
            if (!set.contains(e10) || !set.contains(E.TRUNCATE_EXISTING)) {
                File file = path.toFile();
                E e11 = E.WRITE;
                if (!set.contains(e11) && !set.contains(e10)) {
                    str = "r";
                } else if (set.contains(E.SYNC)) {
                    str = "rws";
                } else if (set.contains(E.DSYNC)) {
                    str = "rwd";
                } else {
                    str = "rw";
                }
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, str);
                if (set.contains(E.TRUNCATE_EXISTING) && set.contains(e11)) {
                    randomAccessFile.setLength(0L);
                }
                if (!set.contains(e10) && !set.contains(E.DELETE_ON_CLOSE)) {
                    return randomAccessFile.getChannel();
                }
                FileChannel channel = randomAccessFile.getChannel();
                int i10 = e.f139151e;
                if (channel instanceof e) {
                    channel = ((e) channel).f139152a;
                }
                return new e(channel, set.contains(E.DELETE_ON_CLOSE), set.contains(e10), path);
            }
            throw new IllegalArgumentException("APPEND + TRUNCATE_EXISTING not allowed");
        }
        throw new UnsupportedOperationException("The desugar library does not support creating a file channel on a directory: " + path);
    }

    @Override // j$.nio.file.spi.c
    public final j$.nio.channels.a p(Path path, Set set, ExecutorService executorService, j$.nio.file.attribute.k... kVarArr) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.spi.c
    public final void d(Path path, Path path2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.spi.c
    public final void e(Path path, Path path2, j$.nio.file.attribute.k... kVarArr) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.spi.c
    public final Path z(Path path) {
        return new o(this.f139169d, path.toFile().getCanonicalPath(), this.f139167b, this.f139168c);
    }

    @Override // j$.nio.file.spi.c
    public final void b(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        if (!C(copyOptionArr, StandardCopyOption.REPLACE_EXISTING) && Files.exists(path2, new LinkOption[0])) {
            throw new FileAlreadyExistsException(path2.toString());
        }
        if (C(copyOptionArr, StandardCopyOption.ATOMIC_MOVE)) {
            throw new UnsupportedOperationException("Unsupported copy option");
        }
        FileInputStream fileInputStream = new FileInputStream(path.toFile());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path2.toFile());
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i10 = fileInputStream.read(bArr, 0, 8192);
                    if (i10 >= 0) {
                        fileOutputStream.write(bArr, 0, i10);
                    } else {
                        fileOutputStream.close();
                        fileInputStream.close();
                        return;
                    }
                }
            } finally {
            }
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // j$.nio.file.spi.c
    public final void o(Path path, Path path2, CopyOption... copyOptionArr) throws FileAlreadyExistsException {
        if (!C(copyOptionArr, StandardCopyOption.REPLACE_EXISTING) && Files.exists(path2, new LinkOption[0])) {
            throw new FileAlreadyExistsException(path2.toString());
        }
        if (C(copyOptionArr, StandardCopyOption.COPY_ATTRIBUTES)) {
            throw new UnsupportedOperationException("Unsupported copy option");
        }
        path.toFile().renameTo(path2.toFile());
    }

    public static boolean C(CopyOption[] copyOptionArr, StandardCopyOption standardCopyOption) {
        for (CopyOption copyOption : copyOptionArr) {
            if (copyOption == standardCopyOption) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.nio.file.spi.c
    public final boolean n(Path path, Path path2) throws IOException {
        if (path.equals(path2)) {
            return true;
        }
        a(path, new EnumC14854a[0]);
        a(path2, new EnumC14854a[0]);
        return path.toFile().equals(path2.toFile());
    }

    @Override // j$.nio.file.spi.c
    public final boolean m(Path path) {
        return path.toFile().isHidden();
    }

    @Override // j$.nio.file.spi.c
    public final C14860d i(Path path) {
        throw new SecurityException("getFileStore");
    }

    @Override // j$.nio.file.spi.c
    public final j$.nio.file.attribute.o h(Path path, Class cls, LinkOption... linkOptionArr) {
        cls.getClass();
        if (cls == j$.nio.file.attribute.d.class) {
            return (j$.nio.file.attribute.o) cls.cast(new b(path));
        }
        return null;
    }

    @Override // j$.nio.file.spi.c
    public final void a(Path path, EnumC14854a... enumC14854aArr) throws IOException {
        boolean zCanRead;
        File file = path.toFile();
        if (!file.exists()) {
            throw new NoSuchFileException(path.toString());
        }
        boolean z10 = true;
        for (EnumC14854a enumC14854a : enumC14854aArr) {
            int i10 = j.f139161a[enumC14854a.ordinal()];
            if (i10 == 1) {
                zCanRead = file.canRead();
            } else if (i10 == 2) {
                zCanRead = file.canWrite();
            } else if (i10 == 3) {
                zCanRead = file.canExecute();
            }
            z10 &= zCanRead;
        }
        if (!z10) {
            throw new IOException(String.format("Unable to access file %s", path));
        }
    }

    @Override // j$.nio.file.spi.c
    public final BasicFileAttributes x(Path path, Class cls, LinkOption... linkOptionArr) {
        if (cls != BasicFileAttributes.class) {
            throw new UnsupportedOperationException();
        }
        return (BasicFileAttributes) cls.cast(((j$.nio.file.attribute.d) h(path, j$.nio.file.attribute.d.class, linkOptionArr)).readAttributes());
    }

    @Override // j$.nio.file.spi.c
    public final Map y(Path path, String str, LinkOption... linkOptionArr) {
        String[] strArrSplit;
        int iIndexOf = str.indexOf(":");
        if (iIndexOf == -1) {
            strArrSplit = str.split(",");
        } else {
            String strSubstring = str.substring(0, iIndexOf);
            if ("basic".equals(strSubstring)) {
                strArrSplit = str.substring(iIndexOf + 1).split(",");
            } else {
                throw new UnsupportedOperationException("Requested attribute type for: " + strSubstring + " is not available.");
            }
        }
        b bVar = new b(path);
        Set set = b.f139139b;
        a aVar = new a();
        aVar.f139136a = new HashSet();
        aVar.f139137b = new HashMap();
        for (String str2 : strArrSplit) {
            if (str2.equals("*")) {
                aVar.f139138c = true;
            } else {
                if (!((HashSet) set).contains(str2)) {
                    throw new IllegalArgumentException("'" + str2 + "' not recognized");
                }
                ((HashSet) aVar.f139136a).add(str2);
            }
        }
        BasicFileAttributes attributes = bVar.readAttributes();
        if (aVar.b("size")) {
            aVar.a("size", Long.valueOf(((c) attributes).size()));
        }
        if (aVar.b("creationTime")) {
            aVar.a("creationTime", ((c) attributes).creationTime());
        }
        if (aVar.b("lastAccessTime")) {
            aVar.a("lastAccessTime", ((c) attributes).lastAccessTime());
        }
        if (aVar.b("lastModifiedTime")) {
            aVar.a("lastModifiedTime", ((c) attributes).lastModifiedTime());
        }
        if (aVar.b("fileKey")) {
            aVar.a("fileKey", ((c) attributes).fileKey());
        }
        if (aVar.b("isDirectory")) {
            aVar.a("isDirectory", Boolean.valueOf(((c) attributes).isDirectory()));
        }
        if (aVar.b("isRegularFile")) {
            aVar.a("isRegularFile", Boolean.valueOf(((c) attributes).isRegularFile()));
        }
        if (aVar.b("isSymbolicLink")) {
            aVar.a("isSymbolicLink", Boolean.valueOf(((c) attributes).isSymbolicLink()));
        }
        if (aVar.b("isOther")) {
            aVar.a("isOther", Boolean.valueOf(((c) attributes).isOther()));
        }
        return Collections.unmodifiableMap(aVar.f139137b);
    }

    @Override // j$.nio.file.spi.c
    public final void A(Path path, String str, Object obj, LinkOption... linkOptionArr) {
        int iIndexOf = str.indexOf(":");
        if (iIndexOf != -1) {
            String strSubstring = str.substring(0, iIndexOf);
            if (!"basic".equals(strSubstring)) {
                throw new UnsupportedOperationException("Requested attribute type for: " + strSubstring + " is not available.");
            }
            str = str.substring(iIndexOf + 1);
        }
        b bVar = new b(path);
        if (str.equals("lastModifiedTime")) {
            bVar.a((FileTime) obj, null, null);
            return;
        }
        if (str.equals("lastAccessTime")) {
            bVar.a(null, (FileTime) obj, null);
        } else {
            if (str.equals("creationTime")) {
                return;
            }
            throw new IllegalArgumentException("'basic:" + str + "' not recognized");
        }
    }

    public static void B(URI uri) {
        if (!uri.getScheme().equalsIgnoreCase("file")) {
            throw new IllegalArgumentException("URI does not match this provider");
        }
        if (uri.getRawAuthority() != null) {
            throw new IllegalArgumentException("Authority component present");
        }
        String path = uri.getPath();
        if (path == null) {
            throw new IllegalArgumentException("Path component is undefined");
        }
        if (!path.equals(q2.f93563c)) {
            throw new IllegalArgumentException("Path component should be '/'");
        }
        if (uri.getRawQuery() != null) {
            throw new IllegalArgumentException("Query component present");
        }
        if (uri.getRawFragment() != null) {
            throw new IllegalArgumentException("Fragment component present");
        }
    }
}
