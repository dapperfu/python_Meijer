package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static final androidx.concurrent.futures.f<c> f58043a = androidx.concurrent.futures.f.I();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f58044b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static c f58045c = null;

    static class b {

        /* renamed from: a, reason: collision with root package name */
        final int f58046a;

        /* renamed from: b, reason: collision with root package name */
        final int f58047b;

        /* renamed from: c, reason: collision with root package name */
        final long f58048c;

        /* renamed from: d, reason: collision with root package name */
        final long f58049d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof b)) {
                b bVar = (b) obj;
                if (this.f58047b == bVar.f58047b && this.f58048c == bVar.f58048c && this.f58046a == bVar.f58046a && this.f58049d == bVar.f58049d) {
                    return true;
                }
            }
            return false;
        }

        static b a(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } finally {
            }
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f58047b), Long.valueOf(this.f58048c), Integer.valueOf(this.f58046a), Long.valueOf(this.f58049d));
        }

        b(int i10, int i11, long j10, long j11) {
            this.f58046a = i10;
            this.f58047b = i11;
            this.f58048c = j10;
            this.f58049d = j11;
        }

        void b(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f58046a);
                dataOutputStream.writeInt(this.f58047b);
                dataOutputStream.writeLong(this.f58048c);
                dataOutputStream.writeLong(this.f58049d);
                dataOutputStream.close();
            } catch (Throwable th2) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    private static class a {
        static PackageInfo a(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        final int f58050a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f58051b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f58052c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f58053d;

        c(int i10, boolean z10, boolean z11, boolean z12) {
            this.f58050a = i10;
            this.f58052c = z11;
            this.f58051b = z10;
            this.f58053d = z12;
        }
    }

    private static c b(int i10, boolean z10, boolean z11, boolean z12) {
        c cVar = new c(i10, z10, z11, z12);
        f58045c = cVar;
        f58043a.E(cVar);
        return f58045c;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static androidx.profileinstaller.h.c c(android.content.Context r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.h.c(android.content.Context, boolean):androidx.profileinstaller.h$c");
    }

    private static long a(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return a.a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }
}
