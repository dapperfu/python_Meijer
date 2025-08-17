package kotlin.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\u001a-\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000f\"\u0015\u0010\u0012\u001a\u00020\r*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0015\u0010\u0014\u001a\u00020\r*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, d2 = {"Ljava/io/File;", "target", "", "overwrite", "", "bufferSize", "l", "(Ljava/io/File;Ljava/io/File;ZI)Ljava/io/File;", "n", "(Ljava/io/File;)Z", "relative", "q", "(Ljava/io/File;Ljava/io/File;)Ljava/io/File;", "", "r", "(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;", "o", "(Ljava/io/File;)Ljava/lang/String;", "extension", "p", "nameWithoutExtension", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/io/FilesKt")
@SourceDebugExtension
/* loaded from: classes6.dex */
public class d extends c {
    public static final File l(File file, File target, boolean z10, int i10) throws FileSystemException {
        Intrinsics.j(file, "<this>");
        Intrinsics.j(target, "target");
        if (!file.exists()) {
            throw new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null);
        }
        if (target.exists()) {
            if (!z10) {
                throw new FileAlreadyExistsException(file, target, "The destination file already exists.");
            }
            if (!target.delete()) {
                throw new FileAlreadyExistsException(file, target, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (file.isDirectory()) {
            if (target.mkdirs()) {
                return target;
            }
            throw new FileSystemException(file, target, "Failed to create target directory.");
        }
        File parentFile = target.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(target);
            try {
                ByteStreamsKt.a(fileInputStream, fileOutputStream, i10);
                CloseableKt.a(fileOutputStream, null);
                CloseableKt.a(fileInputStream, null);
                return target;
            } finally {
            }
        } finally {
        }
    }

    public static /* synthetic */ File m(File file, File file2, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 8192;
        }
        return l(file, file2, z10, i10);
    }

    public static boolean n(File file) {
        Intrinsics.j(file, "<this>");
        while (true) {
            boolean z10 = true;
            for (File file2 : c.k(file)) {
                if (!file2.delete() && file2.exists()) {
                    z10 = false;
                } else {
                    if (z10) {
                        break;
                    }
                    z10 = false;
                }
            }
            return z10;
        }
    }

    public static String o(File file) {
        Intrinsics.j(file, "<this>");
        String name = file.getName();
        Intrinsics.i(name, "getName(...)");
        return StringsKt.l1(name, '.', "");
    }

    public static String p(File file) {
        Intrinsics.j(file, "<this>");
        String name = file.getName();
        Intrinsics.i(name, "getName(...)");
        return StringsKt.w1(name, ".", null, 2, null);
    }

    public static File q(File file, File relative) {
        Intrinsics.j(file, "<this>");
        Intrinsics.j(relative, "relative");
        if (a.b(relative)) {
            return relative;
        }
        String string = file.toString();
        Intrinsics.i(string, "toString(...)");
        if (string.length() != 0) {
            char c10 = File.separatorChar;
            if (!StringsKt.f0(string, c10, false, 2, null)) {
                return new File(string + c10 + relative);
            }
        }
        return new File(string + relative);
    }

    public static File r(File file, String relative) {
        Intrinsics.j(file, "<this>");
        Intrinsics.j(relative, "relative");
        return q(file, new File(relative));
    }
}
