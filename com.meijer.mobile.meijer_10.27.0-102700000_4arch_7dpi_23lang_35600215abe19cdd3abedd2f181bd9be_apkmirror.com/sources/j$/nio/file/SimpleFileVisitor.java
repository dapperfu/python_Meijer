package j$.nio.file;

import j$.nio.file.attribute.BasicFileAttributes;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes3.dex */
public class SimpleFileVisitor<T> implements FileVisitor<T> {
    @Override // j$.nio.file.FileVisitor
    public FileVisitResult preVisitDirectory(T t10, BasicFileAttributes basicFileAttributes) {
        Objects.requireNonNull(t10);
        Objects.requireNonNull(basicFileAttributes);
        return FileVisitResult.CONTINUE;
    }

    @Override // j$.nio.file.FileVisitor
    public FileVisitResult visitFile(T t10, BasicFileAttributes basicFileAttributes) {
        Objects.requireNonNull(t10);
        Objects.requireNonNull(basicFileAttributes);
        return FileVisitResult.CONTINUE;
    }

    @Override // j$.nio.file.FileVisitor
    public final FileVisitResult b(Path path, IOException iOException) throws IOException {
        Objects.requireNonNull(path);
        throw iOException;
    }

    @Override // j$.nio.file.FileVisitor
    public final FileVisitResult a(Path path, IOException iOException) throws IOException {
        Objects.requireNonNull(path);
        if (iOException != null) {
            throw iOException;
        }
        return FileVisitResult.CONTINUE;
    }
}
