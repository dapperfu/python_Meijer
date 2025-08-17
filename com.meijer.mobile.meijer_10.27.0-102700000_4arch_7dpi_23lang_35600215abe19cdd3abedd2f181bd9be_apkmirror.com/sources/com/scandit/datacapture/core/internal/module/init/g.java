package com.scandit.datacapture.core.internal.module.init;

import com.scandit.datacapture.core.internal.module.init.g;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.Unit;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes11.dex */
public abstract class g {
    public static final boolean a(File apkBaseDir, File file, String str, List list, d storeLog) throws IOException {
        int i10;
        int i11;
        Throwable th2;
        File extractionDir = file;
        String fullSoFilename = str;
        List<String> archs = list;
        Intrinsics.j(apkBaseDir, "apkBaseDir");
        Intrinsics.j(extractionDir, "extractionDir");
        Intrinsics.j(fullSoFilename, "fullSoFilename");
        Intrinsics.j(archs, "archs");
        Intrinsics.j(storeLog, "storeLog");
        File[] fileArrListFiles = apkBaseDir.listFiles(new FilenameFilter() { // from class: cu.a
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str2) {
                return g.a(file2, str2);
            }
        });
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            storeLog.invoke("\t\tNo \"*.apk\" files in " + apkBaseDir.getAbsolutePath());
            return false;
        }
        Intrinsics.g(fileArrListFiles);
        int length = fileArrListFiles.length;
        int i12 = 0;
        while (i12 < length) {
            ZipFile zipFile = new ZipFile(fileArrListFiles[i12]);
            if (!(archs instanceof Collection) || !archs.isEmpty()) {
                for (String str2 : archs) {
                    StringBuilder sb2 = new StringBuilder("lib");
                    String str3 = File.separator;
                    sb2.append(str3);
                    sb2.append(str2);
                    sb2.append(str3);
                    sb2.append(fullSoFilename);
                    String string = sb2.toString();
                    ZipEntry entry = zipFile.getEntry(string);
                    if (entry == null) {
                        storeLog.invoke("\t\tCannot find \"" + string + "\" inside " + zipFile.getName());
                    } else {
                        storeLog.invoke("\t\tFound \"" + string + "\" inside " + zipFile.getName());
                        if (extractionDir.exists() || extractionDir.mkdirs()) {
                            File file2 = new File(extractionDir, fullSoFilename);
                            if (file2.exists()) {
                                FilesKt.n(file2);
                            }
                            file2.createNewFile();
                            String fullSoPath = file2.getAbsolutePath();
                            try {
                                try {
                                    InputStream inputStream = zipFile.getInputStream(entry);
                                    try {
                                        try {
                                            FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                            try {
                                                Intrinsics.g(inputStream);
                                                i11 = length;
                                                i10 = i12;
                                                try {
                                                    long jB = ByteStreamsKt.b(inputStream, fileOutputStream, 0, 2, null);
                                                    fileOutputStream.flush();
                                                    Unit unit = Unit.f142422a;
                                                    CloseableKt.a(fileOutputStream, null);
                                                    CloseableKt.a(inputStream, null);
                                                    storeLog.invoke("\t\t\tExtracted " + entry.getName() + " into \"" + fullSoPath + "\", " + jB + " bytes");
                                                    try {
                                                        Intrinsics.g(fullSoPath);
                                                        Intrinsics.j(fullSoPath, "fullSoPath");
                                                        System.load(fullSoPath);
                                                        storeLog.invoke("\t\t\tSystem.load(" + fullSoPath + ") successful");
                                                        try {
                                                            file2.delete();
                                                        } catch (IOException unused) {
                                                            storeLog.invoke("\t\t\tError deleting extracted cache file \"" + fullSoPath + '\"');
                                                        }
                                                        return true;
                                                    } catch (Throwable th3) {
                                                        storeLog.invoke("\t\t\tSystem.load(" + fullSoPath + ") failed with message: " + th3.getMessage());
                                                        extractionDir = file;
                                                        fullSoFilename = str;
                                                        length = i11;
                                                        i12 = i10;
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    Throwable th5 = th;
                                                    try {
                                                        throw th5;
                                                    } catch (Throwable th6) {
                                                        CloseableKt.a(fileOutputStream, th5);
                                                        throw th6;
                                                    }
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                i11 = length;
                                                i10 = i12;
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            th2 = th;
                                            try {
                                                throw th2;
                                            } catch (Throwable th9) {
                                                CloseableKt.a(inputStream, th2);
                                                throw th9;
                                            }
                                        }
                                    } catch (Throwable th10) {
                                        th = th10;
                                        i11 = length;
                                        i10 = i12;
                                        th2 = th;
                                        throw th2;
                                    }
                                } catch (IOException e10) {
                                    e = e10;
                                    storeLog.invoke("\t\t\tError extracting " + entry.getName() + " into \"" + fullSoPath + "\" -> " + e.getMessage());
                                    extractionDir = file;
                                    fullSoFilename = str;
                                    length = i11;
                                    i12 = i10;
                                }
                            } catch (IOException e11) {
                                e = e11;
                                i11 = length;
                                i10 = i12;
                                storeLog.invoke("\t\t\tError extracting " + entry.getName() + " into \"" + fullSoPath + "\" -> " + e.getMessage());
                                extractionDir = file;
                                fullSoFilename = str;
                                length = i11;
                                i12 = i10;
                            }
                        } else {
                            storeLog.invoke("\t\t\tCannot create " + extractionDir);
                        }
                    }
                }
            }
            i11 = length;
            i10 = i12;
            i12 = i10 + 1;
            extractionDir = file;
            fullSoFilename = str;
            archs = list;
            length = i11;
        }
        return false;
    }

    public static final boolean a(File file, String str) {
        Intrinsics.g(str);
        return StringsKt.G(str, ".apk", false, 2, null);
    }
}
