package com.google.android.gms.internal.ads;

import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.Sc0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7160Sc0 {
    public static boolean e(File file, byte[] bArr) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                if (Build.VERSION.SDK_INT >= 34) {
                    file.setReadOnly();
                }
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                com.google.android.gms.common.util.l.a(fileOutputStream2);
                return true;
            } catch (IOException unused) {
                fileOutputStream = fileOutputStream2;
                com.google.android.gms.common.util.l.a(fileOutputStream);
                return false;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                com.google.android.gms.common.util.l.a(fileOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static File a(File file, boolean z10) {
        if (z10 && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File b(String str, String str2, File file) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return new File(c(str, file), str2);
        }
        return null;
    }

    public static File c(String str, File file) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        a(file2, false);
        return file2;
    }

    public static boolean d(File file) {
        boolean z10;
        if (!file.exists()) {
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            z10 = true;
            for (File file2 : fileArrListFiles) {
                if (file2 != null && d(file2) && z10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
        } else {
            z10 = true;
        }
        if (file.delete() && z10) {
            return true;
        }
        return false;
    }
}
