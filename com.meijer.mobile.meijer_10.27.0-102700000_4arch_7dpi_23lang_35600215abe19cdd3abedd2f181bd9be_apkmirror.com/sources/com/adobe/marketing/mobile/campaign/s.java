package com.adobe.marketing.mobile.campaign;

import Q5.K;
import android.database.sqlite.SQLiteDatabase;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0015\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/adobe/marketing/mobile/campaign/s;", "", "<init>", "()V", "", "fileName", "", "a", "(Ljava/lang/String;)Z", "Ljava/io/File;", "file", "Ljava/io/InputStream;", "inputStream", "append", "d", "(Ljava/io/File;Ljava/io/InputStream;Z)Z", "zipFile", "outputDirectoryPath", "c", "(Ljava/io/File;Ljava/lang/String;)Z", "fileToDelete", "recursive", "b", "(Ljava/io/File;Z)Z", "campaign_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f62447a = new s();

    @JvmStatic
    public static final boolean a(String fileName) {
        try {
            File fileO = K.f().e().o();
            if (fileO != null && !f6.i.a(fileName)) {
                return SQLiteDatabase.deleteDatabase(new File(fileO, fileName));
            }
            return false;
        } catch (Exception e10) {
            Q5.t.a("Campaign", "FileUtils", "Failed to delete (%s) in cache folder, exception occurred: (%s)", fileName, e10.getLocalizedMessage());
            return false;
        }
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
            Q5.t.a("Campaign", "FileUtils", "Could not create the output directory " + outputDirectoryPath, new Object[0]);
            return false;
        }
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFile));
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                String outputFolderCanonicalPath = file.getCanonicalPath();
                if (nextEntry == null) {
                    Q5.t.a("Campaign", "FileUtils", "Zip file was invalid", new Object[0]);
                    CloseableKt.a(zipInputStream, null);
                    return false;
                }
                boolean zD = true;
                boolean z10 = true;
                while (nextEntry != null && zD) {
                    File file2 = new File(outputDirectoryPath + File.separator + nextEntry.getName());
                    String canonicalPath = file2.getCanonicalPath();
                    Intrinsics.i(canonicalPath, "newZipEntryFile.canonicalPath");
                    Intrinsics.i(outputFolderCanonicalPath, "outputFolderCanonicalPath");
                    if (!StringsKt.W(canonicalPath, outputFolderCanonicalPath, false, 2, null)) {
                        Q5.t.a("Campaign", "FileUtils", "The zip file contained an invalid path. Verify that your zip file is formatted correctly and has not been tampered with.", new Object[0]);
                        CloseableKt.a(zipInputStream, null);
                        return false;
                    }
                    if (nextEntry.isDirectory()) {
                        zD = file2.exists() || file2.mkdirs();
                    } else {
                        File parentFile = file2.getParentFile();
                        if (parentFile == null || !(parentFile.exists() || parentFile.mkdirs())) {
                            Q5.t.a("Campaign", "FileUtils", "Could not extract the file " + file2.getAbsolutePath(), new Object[0]);
                            CloseableKt.a(zipInputStream, null);
                            return false;
                        }
                        zD = d(file2, zipInputStream, false);
                    }
                    z10 = z10 && zD;
                    zipInputStream.closeEntry();
                    nextEntry = zipInputStream.getNextEntry();
                }
                zipInputStream.closeEntry();
                Unit unit = Unit.f142422a;
                CloseableKt.a(zipInputStream, null);
                return z10;
            } finally {
            }
        } catch (Exception e10) {
            Q5.t.a("Campaign", "FileUtils", "Extraction failed - " + e10, new Object[0]);
            return false;
        }
    }

    @JvmStatic
    public static final boolean d(File file, InputStream inputStream, boolean append) {
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
            Q5.t.a("Campaign", "FileUtils", sb2.toString(), new Object[0]);
            return false;
        }
    }

    private s() {
    }
}
