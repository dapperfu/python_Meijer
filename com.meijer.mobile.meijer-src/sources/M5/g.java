package M5;

import R5.t;
import androidx.recyclerview.widget.RecyclerView;
import com.medallia.digital.mobilesdk.q2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\r\u0010\bJ)\u0010\u0011\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001f\u0010\u001eJ!\u0010\"\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u00042\u0006\u0010!\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"LM5/g;", "", "<init>", "()V", "Ljava/io/File;", "directory", "", "e", "(Ljava/io/File;)Z", "file", "", "g", "(Ljava/io/File;)Ljava/lang/String;", "d", "Ljava/io/InputStream;", "inputStream", "append", "h", "(Ljava/io/File;Ljava/io/InputStream;Z)Z", "zipFile", "outputDirectoryPath", "c", "(Ljava/io/File;Ljava/lang/String;)Z", "filePath", "i", "(Ljava/lang/String;)Ljava/lang/String;", "src", "dest", "", "a", "(Ljava/io/File;Ljava/io/File;)V", "f", "fileToDelete", "recursive", "b", "(Ljava/io/File;Z)Z", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f19668a = new g();

    @JvmStatic
    public static final void a(File src, File dest) throws Exception {
        Intrinsics.j(src, "src");
        Intrinsics.j(dest, "dest");
        FilesKt.m(src, dest, true, 0, 4, null);
    }

    @JvmStatic
    public static final boolean b(File fileToDelete, boolean recursive) throws SecurityException {
        if (fileToDelete == null) {
            return false;
        }
        return recursive ? FilesKt.n(fileToDelete) : fileToDelete.delete();
    }

    @JvmStatic
    public static final boolean c(File zipFile, String outputDirectoryPath) {
        Intrinsics.j(outputDirectoryPath, "outputDirectoryPath");
        if (zipFile == null) {
            return false;
        }
        File file = new File(outputDirectoryPath);
        if (!file.exists() && !file.mkdir()) {
            t.a("MobileCore", "FileUtils", "Could not create the output directory " + outputDirectoryPath, new Object[0]);
            return false;
        }
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFile));
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                String outputFolderCanonicalPath = file.getCanonicalPath();
                if (nextEntry == null) {
                    t.a("MobileCore", "FileUtils", "Zip file was invalid", new Object[0]);
                    CloseableKt.a(zipInputStream, null);
                    return false;
                }
                boolean zH = true;
                boolean z10 = true;
                while (nextEntry != null && zH) {
                    File file2 = new File(outputDirectoryPath + File.separator + nextEntry.getName());
                    String canonicalPath = file2.getCanonicalPath();
                    Intrinsics.i(canonicalPath, "newZipEntryFile.canonicalPath");
                    Intrinsics.i(outputFolderCanonicalPath, "outputFolderCanonicalPath");
                    if (!StringsKt.W(canonicalPath, outputFolderCanonicalPath, false, 2, null)) {
                        t.a("MobileCore", "FileUtils", "The zip file contained an invalid path. Verify that your zip file is formatted correctly and has not been tampered with.", new Object[0]);
                        CloseableKt.a(zipInputStream, null);
                        return false;
                    }
                    if (nextEntry.isDirectory()) {
                        zH = file2.exists() || file2.mkdirs();
                    } else {
                        File parentFile = file2.getParentFile();
                        if (parentFile == null || !(parentFile.exists() || parentFile.mkdirs())) {
                            t.a("MobileCore", "FileUtils", "Could not extract the file " + file2.getAbsolutePath(), new Object[0]);
                            CloseableKt.a(zipInputStream, null);
                            return false;
                        }
                        zH = h(file2, zipInputStream, false);
                    }
                    z10 = z10 && zH;
                    zipInputStream.closeEntry();
                    nextEntry = zipInputStream.getNextEntry();
                }
                zipInputStream.closeEntry();
                Unit unit = Unit.f143329a;
                CloseableKt.a(zipInputStream, null);
                return z10;
            } finally {
            }
        } catch (Exception e10) {
            t.a("MobileCore", "FileUtils", "Extraction failed - " + e10, new Object[0]);
            return false;
        }
    }

    @JvmStatic
    public static final boolean d(File file) {
        if (file != null) {
            try {
                if (file.exists() && file.canRead() && file.isFile()) {
                    return true;
                }
            } catch (SecurityException e10) {
                t.a("MobileCore", "FileUtils", "Failed to read file (" + e10 + ')', new Object[0]);
                return false;
            }
        }
        t.a("MobileCore", "FileUtils", "File does not exist or doesn't have read permission " + file, new Object[0]);
        return false;
    }

    @JvmStatic
    public static final boolean e(File directory) {
        return directory != null && directory.isDirectory() && directory.canWrite();
    }

    @JvmStatic
    public static final void f(File src, File dest) throws Exception {
        Intrinsics.j(src, "src");
        Intrinsics.j(dest, "dest");
        if (dest.getParentFile() != null && !dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }
        if (!dest.exists()) {
            dest.createNewFile();
        }
        a(src, dest);
        b(src, false);
    }

    @JvmStatic
    public static final boolean h(File file, InputStream inputStream, boolean append) {
        Intrinsics.j(inputStream, "inputStream");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, append);
            try {
                ByteStreamsKt.a(inputStream, fileOutputStream, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
                CloseableKt.a(fileOutputStream, null);
                return true;
            } finally {
            }
        } catch (Exception e10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unexpected exception while attempting to write to file: ");
            sb2.append(file != null ? file.getPath() : null);
            sb2.append(" (");
            sb2.append(e10);
            sb2.append(')');
            t.a("MobileCore", "FileUtils", sb2.toString(), new Object[0]);
            return false;
        }
    }

    @JvmStatic
    public static final String i(String filePath) {
        Intrinsics.j(filePath, "filePath");
        if (StringsKt.s0(filePath)) {
            return filePath;
        }
        return new Regex(q2.f93563c).k(new Regex("[/\\\\](\\.{2,})").k(new Regex("\\.[/\\\\]").k(filePath, "\\."), "_"), "");
    }

    private g() {
    }

    @JvmStatic
    public static final String g(File file) {
        if (!d(file)) {
            t.a("MobileCore", "FileUtils", "Failed to read file: (" + file + ')', new Object[0]);
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), Charsets.UTF_8));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        sb2.append(line);
                    } else {
                        Unit unit = Unit.f143329a;
                        CloseableKt.a(bufferedReader, null);
                        return sb2.toString();
                    }
                } finally {
                }
            }
        } catch (Exception e10) {
            t.a("MobileCore", "FileUtils", "Failed to read " + file + " contents. " + e10, new Object[0]);
            return null;
        }
    }
}
