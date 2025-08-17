package kw;

import java.io.RandomAccessFile;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lkw/t;", "Lkw/j;", "", "readWrite", "Ljava/io/RandomAccessFile;", "randomAccessFile", "<init>", "(ZLjava/io/RandomAccessFile;)V", "", "j", "()J", "fileOffset", "", "array", "", "arrayOffset", "byteCount", "i", "(J[BII)I", "", "h", "()V", "e", "Ljava/io/RandomAccessFile;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class t extends AbstractC15333j {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final RandomAccessFile randomAccessFile;

    @Override // kw.AbstractC15333j
    protected synchronized void h() {
        this.randomAccessFile.close();
    }

    @Override // kw.AbstractC15333j
    protected synchronized int i(long fileOffset, byte[] array, int arrayOffset, int byteCount) {
        Intrinsics.j(array, "array");
        this.randomAccessFile.seek(fileOffset);
        int i10 = 0;
        while (true) {
            if (i10 >= byteCount) {
                break;
            }
            int i11 = this.randomAccessFile.read(array, arrayOffset, byteCount - i10);
            if (i11 != -1) {
                i10 += i11;
            } else if (i10 == 0) {
                return -1;
            }
        }
        return i10;
    }

    @Override // kw.AbstractC15333j
    protected synchronized long j() {
        return this.randomAccessFile.length();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(boolean z10, RandomAccessFile randomAccessFile) {
        super(z10);
        Intrinsics.j(randomAccessFile, "randomAccessFile");
        this.randomAccessFile = randomAccessFile;
    }
}
