package androidx.media3.exoplayer.upstream;

import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.b;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public class a implements b {

    /* renamed from: a, reason: collision with root package name */
    private final int f57209a;

    public a() {
        this(-1);
    }

    public a(int i10) {
        this.f57209a = i10;
    }

    @Override // androidx.media3.exoplayer.upstream.b
    public long a(b.a aVar) {
        IOException iOException = aVar.f57212c;
        if ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof HttpDataSource$CleartextNotPermittedException) || (iOException instanceof Loader.UnexpectedLoaderException) || DataSourceException.a(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((aVar.f57213d - 1) * 1000, 5000);
    }

    @Override // androidx.media3.exoplayer.upstream.b
    public int b(int i10) {
        int i11 = this.f57209a;
        return i11 == -1 ? i10 == 7 ? 6 : 3 : i11;
    }
}
