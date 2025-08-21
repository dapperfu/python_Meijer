package e5;

import android.os.StatFs;
import gw.AbstractC14423l;
import gw.B;
import java.io.Closeable;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import mv.AbstractC15779K;
import mv.C15800f0;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0003\u0010\u0005\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\n8&X§\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Le5/a;", "", "", "key", "Le5/a$c;", "b", "(Ljava/lang/String;)Le5/a$c;", "Le5/a$b;", "a", "(Ljava/lang/String;)Le5/a$b;", "Lgw/l;", "getFileSystem", "()Lgw/l;", "getFileSystem$annotations", "()V", "fileSystem", "c", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: e5.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC13772a {

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Le5/a$a;", "", "<init>", "()V", "Ljava/io/File;", "directory", "c", "(Ljava/io/File;)Le5/a$a;", "Lgw/B;", "b", "(Lgw/B;)Le5/a$a;", "", "percent", "d", "(D)Le5/a$a;", "Le5/a;", "a", "()Le5/a;", "Lgw/B;", "Lgw/l;", "Lgw/l;", "fileSystem", "D", "maxSizePercent", "", "J", "minimumMaxSizeBytes", "e", "maximumMaxSizeBytes", "f", "maxSizeBytes", "Lmv/K;", "g", "Lmv/K;", "cleanupDispatcher", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: e5.a$a, reason: collision with other inner class name */
    public static final class C2041a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private B directory;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private long maxSizeBytes;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private AbstractC14423l fileSystem = AbstractC14423l.f134581b;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private double maxSizePercent = 0.02d;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private long minimumMaxSizeBytes = 10485760;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private long maximumMaxSizeBytes = 262144000;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private AbstractC15779K cleanupDispatcher = C15800f0.b();

        public final InterfaceC13772a a() {
            long jP;
            B b10 = this.directory;
            if (b10 == null) {
                throw new IllegalStateException("directory == null");
            }
            if (this.maxSizePercent > 0.0d) {
                try {
                    File file = b10.toFile();
                    file.mkdir();
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    jP = RangesKt.p((long) (this.maxSizePercent * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.minimumMaxSizeBytes, this.maximumMaxSizeBytes);
                } catch (Exception unused) {
                    jP = this.minimumMaxSizeBytes;
                }
            } else {
                jP = this.maxSizeBytes;
            }
            return new e(jP, b10, this.fileSystem, this.cleanupDispatcher);
        }

        public final C2041a b(B directory) {
            this.directory = directory;
            return this;
        }

        public final C2041a c(File directory) {
            return b(B.Companion.d(B.INSTANCE, directory, false, 1, null));
        }

        public final C2041a d(double percent) {
            if (0.0d > percent || percent > 1.0d) {
                throw new IllegalArgumentException("size must be in the range [0.0, 1.0].");
            }
            this.maxSizeBytes = 0L;
            this.maxSizePercent = percent;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Le5/a$b;", "", "Le5/a$c;", "a", "()Le5/a$c;", "", "abort", "()V", "Lgw/B;", "k", "()Lgw/B;", "metadata", "getData", "data", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: e5.a$b */
    public interface b {
        c a();

        void abort();

        B getData();

        B k();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Le5/a$c;", "Ljava/io/Closeable;", "Lokio/Closeable;", "Le5/a$b;", "x2", "()Le5/a$b;", "Lgw/B;", "k", "()Lgw/B;", "metadata", "getData", "data", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: e5.a$c */
    public interface c extends Closeable {
        B getData();

        B k();

        b x2();
    }

    b a(String key);

    c b(String key);

    AbstractC14423l getFileSystem();
}
