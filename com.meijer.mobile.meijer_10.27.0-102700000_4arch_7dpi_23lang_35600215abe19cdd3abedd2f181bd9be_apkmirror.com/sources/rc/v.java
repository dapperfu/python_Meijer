package rc;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;
import zc.InterfaceC18422d;

/* loaded from: classes4.dex */
abstract class v implements Closeable {

    interface a {
        v build();

        a setApplicationContext(Context context);
    }

    abstract InterfaceC18422d a();

    abstract u b();

    v() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a().close();
    }
}
