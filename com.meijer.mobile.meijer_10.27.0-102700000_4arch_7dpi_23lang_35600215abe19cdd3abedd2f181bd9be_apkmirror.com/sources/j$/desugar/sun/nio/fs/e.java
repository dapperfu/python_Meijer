package j$.desugar.sun.nio.fs;

import j$.nio.file.Path;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes3.dex */
public final class e extends FileChannel implements SeekableByteChannel {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f138562e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final FileChannel f138563a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f138564b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f138565c;

    /* renamed from: d, reason: collision with root package name */
    public final Path f138566d;

    public e(FileChannel fileChannel, boolean z10, boolean z11, Path path) {
        this.f138563a = fileChannel;
        this.f138564b = z10;
        this.f138565c = z11;
        this.f138566d = z10 ? path : null;
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.SeekableByteChannel, java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        return this.f138563a.read(byteBuffer);
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.ScatteringByteChannel
    public final long read(ByteBuffer[] byteBufferArr, int i10, int i11) {
        return this.f138563a.read(byteBufferArr, i10, i11);
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.SeekableByteChannel, java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (this.f138565c) {
            FileChannel fileChannel = this.f138563a;
            return fileChannel.write(byteBuffer, fileChannel.size());
        }
        return this.f138563a.write(byteBuffer);
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.GatheringByteChannel
    public final long write(ByteBuffer[] byteBufferArr, int i10, int i11) {
        return this.f138563a.write(byteBufferArr, i10, i11);
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.SeekableByteChannel
    public final long position() {
        return this.f138563a.position();
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.SeekableByteChannel
    public final FileChannel position(long j10) throws IOException {
        FileChannel fileChannelPosition = this.f138563a.position(j10);
        if (fileChannelPosition instanceof e) {
            return (e) fileChannelPosition;
        }
        return new e(fileChannelPosition, false, false, null);
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.SeekableByteChannel
    public final long size() {
        return this.f138563a.size();
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.SeekableByteChannel
    public final FileChannel truncate(long j10) throws IOException {
        FileChannel fileChannelTruncate = this.f138563a.truncate(j10);
        if (fileChannelTruncate instanceof e) {
            return (e) fileChannelTruncate;
        }
        return new e(fileChannelTruncate, false, false, null);
    }

    @Override // java.nio.channels.FileChannel
    public final void force(boolean z10) throws IOException {
        this.f138563a.force(z10);
    }

    @Override // java.nio.channels.FileChannel
    public final long transferTo(long j10, long j11, WritableByteChannel writableByteChannel) {
        return this.f138563a.transferTo(j10, j11, writableByteChannel);
    }

    @Override // java.nio.channels.FileChannel
    public final long transferFrom(ReadableByteChannel readableByteChannel, long j10, long j11) {
        return this.f138563a.transferFrom(readableByteChannel, j10, j11);
    }

    @Override // java.nio.channels.FileChannel
    public final int read(ByteBuffer byteBuffer, long j10) {
        return this.f138563a.read(byteBuffer, j10);
    }

    @Override // java.nio.channels.FileChannel
    public final int write(ByteBuffer byteBuffer, long j10) {
        return this.f138563a.write(byteBuffer, j10);
    }

    @Override // java.nio.channels.FileChannel
    public final MappedByteBuffer map(FileChannel.MapMode mapMode, long j10, long j11) {
        return this.f138563a.map(mapMode, j10, j11);
    }

    @Override // java.nio.channels.FileChannel
    public final FileLock lock(long j10, long j11, boolean z10) throws IOException {
        FileLock fileLockLock = this.f138563a.lock(j10, j11, z10);
        if (fileLockLock == null) {
            return null;
        }
        return new f(fileLockLock, this);
    }

    @Override // java.nio.channels.FileChannel
    public final FileLock tryLock(long j10, long j11, boolean z10) throws IOException {
        FileLock fileLockTryLock = this.f138563a.tryLock(j10, j11, z10);
        if (fileLockTryLock == null) {
            return null;
        }
        return new f(fileLockTryLock, this);
    }

    @Override // java.nio.channels.spi.AbstractInterruptibleChannel
    public final void implCloseChannel() {
        this.f138563a.close();
        if (this.f138564b) {
            this.f138566d.toFile().delete();
        }
    }
}
