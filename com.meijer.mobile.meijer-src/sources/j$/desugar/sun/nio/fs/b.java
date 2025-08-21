package j$.desugar.sun.nio.fs;

import j$.nio.file.EnumC14854a;
import j$.nio.file.Path;
import j$.nio.file.attribute.BasicFileAttributes;
import j$.nio.file.attribute.FileTime;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class b implements j$.nio.file.attribute.d {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f139139b;

    /* renamed from: a, reason: collision with root package name */
    public final Path f139140a;

    @Override // j$.nio.file.attribute.d
    public final BasicFileAttributes readAttributes() {
        boolean z10;
        Path path = this.f139140a;
        path.getFileSystem().i().a(path, new EnumC14854a[0]);
        File file = path.toFile();
        long jLastModified = file.lastModified();
        Objects.requireNonNull(TimeUnit.MILLISECONDS, "unit");
        FileTime fileTime = new FileTime(jLastModified);
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        try {
            File file2 = file.getParent() == null ? file : new File(file.getParentFile().getCanonicalFile(), file.getName());
            z10 = !file2.getCanonicalFile().equals(file2.getAbsoluteFile());
        } catch (IOException unused) {
            z10 = false;
        }
        return new c(fileTime, fileTime, fileTime, zIsFile, zIsDirectory, z10, (zIsFile || zIsDirectory || z10) ? false : true, file.length(), Integer.valueOf(file.hashCode()));
    }

    @Override // j$.nio.file.attribute.d
    public final void a(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) {
        long jConvert;
        if (fileTime == null && fileTime2 == null) {
            return;
        }
        Path path = this.f139140a;
        path.getFileSystem().i().a(path, EnumC14854a.WRITE);
        File file = path.toFile();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        fileTime.getClass();
        Objects.requireNonNull(timeUnit, "unit");
        if (timeUnit != null) {
            jConvert = timeUnit.convert(fileTime.f139208a, timeUnit);
        } else {
            long jConvert2 = timeUnit.convert(fileTime.f139209b.getEpochSecond(), TimeUnit.SECONDS);
            if (jConvert2 == Long.MIN_VALUE || jConvert2 == Long.MAX_VALUE) {
                jConvert = jConvert2;
            } else {
                long jConvert3 = timeUnit.convert(fileTime.f139209b.getNano(), TimeUnit.NANOSECONDS);
                long j10 = jConvert2 + jConvert3;
                jConvert = ((jConvert3 ^ j10) & (jConvert2 ^ j10)) < 0 ? jConvert2 < 0 ? Long.MIN_VALUE : Long.MAX_VALUE : j10;
            }
        }
        if (file.setLastModified(jConvert)) {
            return;
        }
        throw new IOException("File.setLastModified did not succeed on " + path);
    }

    static {
        String[] strArr = {"size", "creationTime", "lastAccessTime", "lastModifiedTime", "fileKey", "isDirectory", "isRegularFile", "isSymbolicLink", "isOther"};
        Charset charset = q.f139181a;
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < 9; i10++) {
            hashSet.add(strArr[i10]);
        }
        f139139b = hashSet;
    }

    public b(Path path) {
        this.f139140a = path;
    }

    @Override // j$.nio.file.attribute.o
    public final String name() {
        return "basic";
    }
}
