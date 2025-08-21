package R6;

import android.content.pm.ApplicationInfo;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.io.CloseableKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"LR6/h;", "", "<init>", "()V", "Landroid/content/pm/ApplicationInfo;", "appInfo", "", "f", "(Landroid/content/pm/ApplicationInfo;)[B", "buildId", "signature", "", "d", "([B[B)V", "Ljava/util/zip/ZipFile;", "zip", "Ljava/util/zip/ZipEntry;", "dexEntry", "e", "(Ljava/util/zip/ZipFile;Ljava/util/zip/ZipEntry;)[B", "header", "", "g", "([B)Z", "", "c", "(Landroid/content/pm/ApplicationInfo;)Ljava/lang/String;", "Ljava/io/File;", "apk", "b", "(Ljava/io/File;)[B", "a", "([B)[B", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f31965a = new h();

    private final void d(byte[] buildId, byte[] signature) {
        int length = buildId.length;
        for (int i10 = 0; i10 < length; i10++) {
            buildId[i10] = (byte) (buildId[i10] ^ signature[i10]);
        }
    }

    private final boolean g(byte[] header) {
        return (header[0] & 255) == 100 && (header[1] & 255) == 101 && (header[2] & 255) == 120 && (header[3] & 255) == 10 && (header[7] & 255) == 0;
    }

    public final String c(ApplicationInfo appInfo) {
        try {
            byte[] bArrF = f(appInfo);
            if (bArrF == null) {
                return null;
            }
            return f.a(bArrF);
        } catch (Throwable unused) {
            return null;
        }
    }

    private final byte[] f(ApplicationInfo appInfo) {
        File file = new File(appInfo.sourceDir);
        if (file.canRead()) {
            return b(file);
        }
        return null;
    }

    public final byte[] b(File apk) {
        h hVar;
        byte[] bArrE;
        ZipFile zipFile = new ZipFile(apk, 1);
        try {
            ZipEntry entry = zipFile.getEntry("classes.dex");
            if (entry == null) {
                CloseableKt.a(zipFile, null);
                return null;
            }
            byte[] bArrE2 = f31965a.e(zipFile, entry);
            if (bArrE2 == null) {
                CloseableKt.a(zipFile, null);
                return null;
            }
            int i10 = 2;
            while (true) {
                ZipEntry entry2 = zipFile.getEntry("classes" + i10 + ".dex");
                if (entry2 == null || (bArrE = (hVar = f31965a).e(zipFile, entry2)) == null) {
                    break;
                }
                hVar.d(bArrE2, bArrE);
                i10++;
            }
            CloseableKt.a(zipFile, null);
            return bArrE2;
        } finally {
        }
    }

    private h() {
    }

    private final byte[] e(ZipFile zip, ZipEntry dexEntry) throws IOException {
        byte[] bArrA;
        InputStream inputStream = zip.getInputStream(dexEntry);
        try {
            byte[] bArr = new byte[32];
            if (inputStream.read(bArr, 0, 32) == 32) {
                bArrA = f31965a.a(bArr);
            } else {
                bArrA = null;
            }
            CloseableKt.a(inputStream, null);
            return bArrA;
        } finally {
        }
    }

    public final byte[] a(byte[] header) {
        if (!g(header)) {
            return null;
        }
        return ArraysKt.u(header, 12, 32);
    }
}
