package j$.adapter;

import android.os.StrictMode;
import j$.desugar.sun.nio.fs.d;
import j$.nio.file.spi.c;
import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.spi.FileSystemProvider;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final c f138546a;

    static {
        c aVar;
        if (a.f138544a) {
            FileSystemProvider fileSystemProviderProvider = FileSystems.getDefault().provider();
            int i10 = j$.nio.file.spi.a.f138672c;
            aVar = fileSystemProviderProvider == null ? null : fileSystemProviderProvider instanceof j$.nio.file.spi.b ? ((j$.nio.file.spi.b) fileSystemProviderProvider).f138675a : new j$.nio.file.spi.a(fileSystemProviderProvider);
        } else {
            if (a.f138545b) {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(StrictMode.getThreadPolicy()).permitDiskReads().build());
            }
            aVar = d.f138561a;
        }
        f138546a = aVar;
        aVar.j(URI.create("file:///"));
    }
}
