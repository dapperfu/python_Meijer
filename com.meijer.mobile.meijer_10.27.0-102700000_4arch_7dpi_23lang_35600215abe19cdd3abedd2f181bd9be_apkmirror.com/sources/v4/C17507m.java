package v4;

import android.content.Context;
import androidx.room.C6119e;
import androidx.room.InterfaceC6120f;
import com.fullstory.FS;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import w4.C17754b;
import w4.C17757e;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u0015J\u000f\u0010\u001d\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010#R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010$R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010%R\u001c\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010\u000e\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00104\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00108\u001a\u0002058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Lv4/m;", "LA4/d;", "Landroidx/room/f;", "Landroid/content/Context;", "context", "", "copyFromAssetPath", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "copyFromInputStream", "", "databaseVersion", "delegate", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;ILA4/d;)V", "", "writable", "", "d", "(Z)V", "destinationFile", "a", "(Ljava/io/File;Z)V", "databaseFile", "b", "enabled", "setWriteAheadLoggingEnabled", "close", "()V", "Landroidx/room/e;", "databaseConfiguration", "c", "(Landroidx/room/e;)V", "Landroid/content/Context;", "Ljava/lang/String;", "Ljava/io/File;", "Ljava/util/concurrent/Callable;", "e", "I", "f", "LA4/d;", "getDelegate", "()LA4/d;", "g", "Landroidx/room/e;", "h", "Z", "verified", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "LA4/c;", "D2", "()LA4/c;", "writableDatabase", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: v4.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17507m implements A4.d, InterfaceC6120f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String copyFromAssetPath;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final File copyFromFile;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Callable<InputStream> copyFromInputStream;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int databaseVersion;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final A4.d delegate;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private C6119e databaseConfiguration;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean verified;

    @Override // A4.d, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        getDelegate().close();
        this.verified = false;
    }

    public C17507m(Context context, String str, File file, Callable<InputStream> callable, int i10, A4.d delegate) {
        Intrinsics.j(context, "context");
        Intrinsics.j(delegate, "delegate");
        this.context = context;
        this.copyFromAssetPath = str;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.databaseVersion = i10;
        this.delegate = delegate;
    }

    private final void a(File destinationFile, boolean writable) throws IOException {
        ReadableByteChannel readableByteChannelNewChannel;
        if (this.copyFromAssetPath != null) {
            readableByteChannelNewChannel = Channels.newChannel(this.context.getAssets().open(this.copyFromAssetPath));
        } else if (this.copyFromFile != null) {
            readableByteChannelNewChannel = new FileInputStream(this.copyFromFile).getChannel();
        } else {
            Callable<InputStream> callable = this.copyFromInputStream;
            if (callable == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                readableByteChannelNewChannel = Channels.newChannel(callable.call());
            } catch (Exception e10) {
                throw new IOException("inputStreamCallable exception on call", e10);
            }
        }
        File fileCreateTempFile = File.createTempFile("room-copy-helper", ".tmp", this.context.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        FileChannel channel = new FileOutputStream(fileCreateTempFile).getChannel();
        Intrinsics.g(channel);
        C17757e.a(readableByteChannelNewChannel, channel);
        File parentFile = destinationFile.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + destinationFile.getAbsolutePath());
        }
        Intrinsics.g(fileCreateTempFile);
        b(fileCreateTempFile, writable);
        if (fileCreateTempFile.renameTo(destinationFile)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + fileCreateTempFile.getAbsolutePath() + ") to destination (" + destinationFile.getAbsolutePath() + ").");
    }

    private final void b(File databaseFile, boolean writable) {
        C6119e c6119e = this.databaseConfiguration;
        if (c6119e == null) {
            Intrinsics.y("databaseConfiguration");
            c6119e = null;
        }
        c6119e.getClass();
    }

    private final void d(boolean writable) throws IOException {
        String databaseName = getDatabaseName();
        if (databaseName == null) {
            throw new IllegalStateException("Required value was null.");
        }
        File databasePath = this.context.getDatabasePath(databaseName);
        C6119e c6119e = this.databaseConfiguration;
        C6119e c6119e2 = null;
        if (c6119e == null) {
            Intrinsics.y("databaseConfiguration");
            c6119e = null;
        }
        C4.a aVar = new C4.a(databaseName, this.context.getFilesDir(), c6119e.multiInstanceInvalidation);
        try {
            C4.a.c(aVar, false, 1, null);
            if (!databasePath.exists()) {
                try {
                    Intrinsics.g(databasePath);
                    a(databasePath, writable);
                    aVar.d();
                    return;
                } catch (IOException e10) {
                    throw new RuntimeException("Unable to copy database file.", e10);
                }
            }
            try {
                Intrinsics.g(databasePath);
                int iH = C17754b.h(databasePath);
                if (iH == this.databaseVersion) {
                    aVar.d();
                    return;
                }
                C6119e c6119e3 = this.databaseConfiguration;
                if (c6119e3 == null) {
                    Intrinsics.y("databaseConfiguration");
                } else {
                    c6119e2 = c6119e3;
                }
                if (c6119e2.e(iH, this.databaseVersion)) {
                    aVar.d();
                    return;
                }
                if (this.context.deleteDatabase(databaseName)) {
                    try {
                        a(databasePath, writable);
                        Unit unit = Unit.f142422a;
                    } catch (IOException e11) {
                        FS.log_w("ROOM", "Unable to copy database file.", e11);
                    }
                } else {
                    FS.log_w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                aVar.d();
                return;
            } catch (IOException e12) {
                FS.log_w("ROOM", "Unable to read database version.", e12);
                aVar.d();
                return;
            }
        } catch (Throwable th2) {
            aVar.d();
            throw th2;
        }
        aVar.d();
        throw th2;
    }

    @Override // A4.d
    public A4.c D2() throws IOException {
        if (!this.verified) {
            d(true);
            this.verified = true;
        }
        return getDelegate().D2();
    }

    public final void c(C6119e databaseConfiguration) {
        Intrinsics.j(databaseConfiguration, "databaseConfiguration");
        this.databaseConfiguration = databaseConfiguration;
    }

    @Override // androidx.room.InterfaceC6120f
    public A4.d getDelegate() {
        return this.delegate;
    }

    @Override // A4.d
    public String getDatabaseName() {
        return getDelegate().getDatabaseName();
    }

    @Override // A4.d
    public void setWriteAheadLoggingEnabled(boolean enabled) {
        getDelegate().setWriteAheadLoggingEnabled(enabled);
    }
}
