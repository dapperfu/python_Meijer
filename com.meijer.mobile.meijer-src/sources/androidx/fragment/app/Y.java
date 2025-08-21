package androidx.fragment.app;

import com.fullstory.FS;
import java.io.Writer;

/* loaded from: classes.dex */
final class Y extends Writer {

    /* renamed from: a, reason: collision with root package name */
    private final String f55189a;

    /* renamed from: b, reason: collision with root package name */
    private StringBuilder f55190b = new StringBuilder(128);

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                a();
            } else {
                this.f55190b.append(c10);
            }
        }
    }

    private void a() {
        if (this.f55190b.length() > 0) {
            FS.log_d(this.f55189a, this.f55190b.toString());
            StringBuilder sb2 = this.f55190b;
            sb2.delete(0, sb2.length());
        }
    }

    Y(String str) {
        this.f55189a = str;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }
}
