package java.nio.file;

import java.io.Closeable;
import java.util.Iterator;

/* loaded from: classes3.dex */
public interface DirectoryStream<T> extends Closeable, Iterable<T> {

    public interface Filter<T> {
        boolean accept(T t10);
    }

    Iterator<T> iterator();
}
