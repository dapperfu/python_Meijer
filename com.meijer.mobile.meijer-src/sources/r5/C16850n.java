package r5;

import android.os.SystemClock;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lr5/n;", "", "<init>", "()V", "", "a", "()Z", "Lr5/s;", "logger", "b", "(Lr5/s;)Z", "Ljava/io/File;", "Ljava/io/File;", "fileDescriptorList", "", "c", "I", "decodesSinceLastFileDescriptorCheck", "", "d", "J", "lastFileDescriptorCheckTimestamp", "e", "Z", "hasAvailableFileDescriptors", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: r5.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C16850n {

    /* renamed from: a, reason: collision with root package name */
    public static final C16850n f159241a = new C16850n();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final File fileDescriptorList = new File("/proc/self/fd");

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static int decodesSinceLastFileDescriptorCheck = 30;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static long lastFileDescriptorCheckTimestamp = SystemClock.uptimeMillis();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static boolean hasAvailableFileDescriptors = true;

    public final synchronized boolean b(InterfaceC16855s logger) {
        try {
            if (a()) {
                decodesSinceLastFileDescriptorCheck = 0;
                lastFileDescriptorCheckTimestamp = SystemClock.uptimeMillis();
                String[] list = fileDescriptorList.list();
                if (list == null) {
                    list = new String[0];
                }
                int length = list.length;
                boolean z10 = length < 800;
                hasAvailableFileDescriptors = z10;
                if (!z10 && logger != null && logger.b() <= 5) {
                    logger.a("FileDescriptorCounter", 5, "Unable to allocate more hardware bitmaps. Number of used file descriptors: " + length, null);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return hasAvailableFileDescriptors;
    }

    private final boolean a() {
        int i10 = decodesSinceLastFileDescriptorCheck;
        decodesSinceLastFileDescriptorCheck = i10 + 1;
        return i10 >= 30 || SystemClock.uptimeMillis() > lastFileDescriptorCheckTimestamp + ((long) 30000);
    }

    private C16850n() {
    }
}
