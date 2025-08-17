package r4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\r¨\u0006\u000f"}, d2 = {"Lr4/c;", "", "", "filename", "<init>", "(Ljava/lang/String;)V", "", "a", "()V", "b", "Ljava/lang/String;", "lockFilename", "Ljava/nio/channels/FileChannel;", "Ljava/nio/channels/FileChannel;", "lockChannel", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: r4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16721c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String lockFilename;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private FileChannel lockChannel;

    public C16721c(String filename) {
        Intrinsics.j(filename, "filename");
        this.lockFilename = filename + ".lck";
    }

    public final void a() throws IOException {
        if (this.lockChannel != null) {
            return;
        }
        try {
            File file = new File(this.lockFilename);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.lockChannel = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th2) {
            FileChannel fileChannel = this.lockChannel;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.lockChannel = null;
            throw new IllegalStateException("Unable to lock file: '" + this.lockFilename + "'.", th2);
        }
    }

    public final void b() {
        FileChannel fileChannel = this.lockChannel;
        if (fileChannel == null) {
            return;
        }
        try {
            fileChannel.close();
        } finally {
            this.lockChannel = null;
        }
    }
}
