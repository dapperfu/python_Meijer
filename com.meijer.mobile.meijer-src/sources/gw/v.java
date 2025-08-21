package gw;

import gw.B;
import j$.nio.file.Files;
import j$.nio.file.LinkOption;
import j$.nio.file.Path;
import j$.nio.file.StandardCopyOption;
import j$.nio.file.attribute.BasicFileAttributes;
import j$.nio.file.attribute.FileTime;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.NoSuchFileException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\rH\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lgw/v;", "Lgw/u;", "<init>", "()V", "j$/nio/file/attribute/FileTime", "", "R", "(Lj$/nio/file/attribute/FileTime;)Ljava/lang/Long;", "Lgw/B;", "path", "Lgw/k;", "w", "(Lgw/B;)Lgw/k;", "j$/nio/file/Path", "nioPath", "O", "(Lj$/nio/file/Path;)Lgw/k;", "source", "target", "", "c", "(Lgw/B;Lgw/B;)V", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public class v extends u {
    protected final C14422k O(Path nioPath) {
        Intrinsics.j(nioPath, "nioPath");
        try {
            BasicFileAttributes attributes = Files.readAttributes(nioPath, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(nioPath) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            B bF = symbolicLink != null ? B.Companion.f(B.INSTANCE, symbolicLink, false, 1, null) : null;
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lR = fileTimeCreationTime != null ? R(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lR2 = fileTimeLastModifiedTime != null ? R(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new C14422k(zIsRegularFile, zIsDirectory, bF, lValueOf, lR, lR2, fileTimeLastAccessTime != null ? R(fileTimeLastAccessTime) : null, null, 128, null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // gw.u, gw.AbstractC14423l
    public void c(B source, B target) throws IOException {
        Intrinsics.j(source, "source");
        Intrinsics.j(target, "target");
        try {
            Files.move(source.B(), target.B(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e10) {
            throw new FileNotFoundException(e10.getMessage());
        }
    }

    @Override // gw.u
    public String toString() {
        return "NioSystemFileSystem";
    }

    @Override // gw.u, gw.AbstractC14423l
    public C14422k w(B path) {
        Intrinsics.j(path, "path");
        return O(path.B());
    }

    private final Long R(FileTime fileTime) {
        Long lValueOf = Long.valueOf(fileTime.toMillis());
        if (lValueOf.longValue() != 0) {
            return lValueOf;
        }
        return null;
    }
}
