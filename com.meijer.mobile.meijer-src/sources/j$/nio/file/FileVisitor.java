package j$.nio.file;

import j$.nio.file.attribute.BasicFileAttributes;
import java.io.IOException;

/* loaded from: classes3.dex */
public interface FileVisitor<T> {
    FileVisitResult a(Path path, IOException iOException);

    FileVisitResult b(Path path, IOException iOException);

    FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes);

    FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes);
}
