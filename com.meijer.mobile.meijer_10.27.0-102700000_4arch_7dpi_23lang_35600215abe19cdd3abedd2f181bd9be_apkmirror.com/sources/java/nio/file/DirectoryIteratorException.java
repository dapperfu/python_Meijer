package java.nio.file;

import java.io.IOException;
import java.util.ConcurrentModificationException;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class DirectoryIteratorException extends ConcurrentModificationException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectoryIteratorException(IOException iOException) {
        super(iOException);
        Objects.requireNonNull(iOException);
    }

    @Override // java.lang.Throwable
    public IOException getCause() {
        return (IOException) super.getCause();
    }
}
