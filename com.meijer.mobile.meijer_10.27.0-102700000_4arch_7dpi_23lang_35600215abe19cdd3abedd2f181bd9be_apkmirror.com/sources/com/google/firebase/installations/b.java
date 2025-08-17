package com.google.firebase.installations;

import com.fullstory.FS;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* loaded from: classes7.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private final FileChannel f88735a;

    /* renamed from: b, reason: collision with root package name */
    private final FileLock f88736b;

    /* JADX WARN: Removed duplicated region for block: B:33:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.google.firebase.installations.b a(android.content.Context r4, java.lang.String r5) throws java.io.IOException {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L2c java.lang.Error -> L30 java.io.IOException -> L32
            java.io.File r4 = r4.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L2c java.lang.Error -> L30 java.io.IOException -> L32
            r1.<init>(r4, r5)     // Catch: java.nio.channels.OverlappingFileLockException -> L2c java.lang.Error -> L30 java.io.IOException -> L32
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L2c java.lang.Error -> L30 java.io.IOException -> L32
            java.lang.String r5 = "rw"
            r4.<init>(r1, r5)     // Catch: java.nio.channels.OverlappingFileLockException -> L2c java.lang.Error -> L30 java.io.IOException -> L32
            java.nio.channels.FileChannel r4 = r4.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L2c java.lang.Error -> L30 java.io.IOException -> L32
            java.nio.channels.FileLock r5 = r4.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L25 java.lang.Error -> L28 java.io.IOException -> L2a
            com.google.firebase.installations.b r1 = new com.google.firebase.installations.b     // Catch: java.nio.channels.OverlappingFileLockException -> L1f java.lang.Error -> L21 java.io.IOException -> L23
            r1.<init>(r4, r5)     // Catch: java.nio.channels.OverlappingFileLockException -> L1f java.lang.Error -> L21 java.io.IOException -> L23
            return r1
        L1f:
            r1 = move-exception
            goto L34
        L21:
            r1 = move-exception
            goto L34
        L23:
            r1 = move-exception
            goto L34
        L25:
            r1 = move-exception
        L26:
            r5 = r0
            goto L34
        L28:
            r1 = move-exception
            goto L26
        L2a:
            r1 = move-exception
            goto L26
        L2c:
            r1 = move-exception
        L2d:
            r4 = r0
            r5 = r4
            goto L34
        L30:
            r1 = move-exception
            goto L2d
        L32:
            r1 = move-exception
            goto L2d
        L34:
            java.lang.String r2 = "CrossProcessLock"
            java.lang.String r3 = "encountered error while creating and acquiring the lock, ignoring"
            com.fullstory.FS.log_e(r2, r3, r1)
            if (r5 == 0) goto L40
            r5.release()     // Catch: java.io.IOException -> L40
        L40:
            if (r4 == 0) goto L45
            r4.close()     // Catch: java.io.IOException -> L45
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.b.a(android.content.Context, java.lang.String):com.google.firebase.installations.b");
    }

    void b() throws IOException {
        try {
            this.f88736b.release();
            this.f88735a.close();
        } catch (IOException e10) {
            FS.log_e("CrossProcessLock", "encountered error while releasing, ignoring", e10);
        }
    }

    private b(FileChannel fileChannel, FileLock fileLock) {
        this.f88735a = fileChannel;
        this.f88736b = fileLock;
    }
}
