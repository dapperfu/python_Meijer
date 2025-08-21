package r7;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: r7.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16868a {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReference<byte[]> f159400a = new AtomicReference<>();

    /* renamed from: r7.a$a, reason: collision with other inner class name */
    private static class C2480a extends InputStream implements InputStreamRetargetInterface {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f159401a;

        /* renamed from: b, reason: collision with root package name */
        private int f159402b = -1;

        @Override // java.io.InputStream
        public synchronized void mark(int i10) {
            this.f159402b = this.f159401a.position();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f159401a.hasRemaining()) {
                return this.f159401a.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public synchronized void reset() throws IOException {
            int i10 = this.f159402b;
            if (i10 == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.f159401a.position(i10);
        }

        @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
        public /* synthetic */ long transferTo(OutputStream outputStream) {
            return DesugarInputStream.transferTo(this, outputStream);
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f159401a.remaining();
        }

        @Override // java.io.InputStream
        public long skip(long j10) {
            if (!this.f159401a.hasRemaining()) {
                return -1L;
            }
            long jMin = Math.min(j10, available());
            this.f159401a.position((int) (r0.position() + jMin));
            return jMin;
        }

        C2480a(ByteBuffer byteBuffer) {
            this.f159401a = byteBuffer;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            if (!this.f159401a.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i11, available());
            this.f159401a.get(bArr, i10, iMin);
            return iMin;
        }
    }

    public static ByteBuffer a(File file) throws Throwable {
        Throwable th2;
        RandomAccessFile randomAccessFile;
        FileChannel fileChannel = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                FileChannel channel = randomAccessFile.getChannel();
                try {
                    MappedByteBuffer mappedByteBufferLoad = channel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                    try {
                        channel.close();
                    } catch (IOException unused) {
                    }
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused2) {
                    }
                    return mappedByteBufferLoad;
                } catch (Throwable th3) {
                    th2 = th3;
                    fileChannel = channel;
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException unused3) {
                        }
                    }
                    if (randomAccessFile == null) {
                        throw th2;
                    }
                    try {
                        randomAccessFile.close();
                        throw th2;
                    } catch (IOException unused4) {
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                th2 = th4;
            }
        } catch (Throwable th5) {
            th2 = th5;
            randomAccessFile = null;
        }
    }

    public static ByteBuffer d(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    /* renamed from: r7.a$b */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        final int f159403a;

        /* renamed from: b, reason: collision with root package name */
        final int f159404b;

        /* renamed from: c, reason: collision with root package name */
        final byte[] f159405c;

        b(byte[] bArr, int i10, int i11) {
            this.f159405c = bArr;
            this.f159403a = i10;
            this.f159404b = i11;
        }
    }

    public static ByteBuffer b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] andSet = f159400a.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int i10 = inputStream.read(andSet);
            if (i10 < 0) {
                f159400a.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return d(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
            byteArrayOutputStream.write(andSet, 0, i10);
        }
    }

    public static InputStream g(ByteBuffer byteBuffer) {
        return new C2480a(byteBuffer);
    }

    private static b c(ByteBuffer byteBuffer) {
        if (!byteBuffer.isReadOnly() && byteBuffer.hasArray()) {
            return new b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        }
        return null;
    }

    public static byte[] e(ByteBuffer byteBuffer) {
        b bVarC = c(byteBuffer);
        if (bVarC != null && bVarC.f159403a == 0 && bVarC.f159404b == bVarC.f159405c.length) {
            return byteBuffer.array();
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.limit()];
        d(byteBufferAsReadOnlyBuffer);
        byteBufferAsReadOnlyBuffer.get(bArr);
        return bArr;
    }

    public static void f(ByteBuffer byteBuffer, File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        d(byteBuffer);
        FileChannel channel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                channel = randomAccessFile.getChannel();
                channel.write(byteBuffer);
                channel.force(false);
                channel.close();
                randomAccessFile.close();
                try {
                    channel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th2) {
                th = th2;
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                        throw th;
                    } catch (IOException unused4) {
                        throw th;
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
        }
    }
}
