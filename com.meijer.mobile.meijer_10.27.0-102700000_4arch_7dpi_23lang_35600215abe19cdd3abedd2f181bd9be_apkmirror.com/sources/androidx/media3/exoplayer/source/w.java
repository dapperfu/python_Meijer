package androidx.media3.exoplayer.source;

import a3.InterfaceC5571k;
import android.net.Uri;
import i3.E1;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface w {

    public interface a {
        w a(E1 e12);
    }

    void a(long j10, long j11);

    void b();

    void c(InterfaceC5571k interfaceC5571k, Uri uri, Map<String, List<String>> map, long j10, long j11, x3.r rVar) throws IOException;

    int d(x3.I i10) throws IOException;

    long e();

    void release();
}
