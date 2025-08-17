package r6;

import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes4.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private final e f157848a;

    private static String d(String str, int i10) throws NoSuchAlgorithmException {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : bArrDigest) {
                sb2.append(String.format("%02x", Byte.valueOf(b10)));
            }
            return sb2.toString();
        } catch (NoSuchAlgorithmException unused) {
            return str.substring(0, i10);
        }
    }

    Pair<EnumC16726c, InputStream> a(String str) {
        try {
            File fileC = c(str);
            if (fileC == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(fileC);
            EnumC16726c enumC16726c = fileC.getAbsolutePath().endsWith(".zip") ? EnumC16726c.ZIP : fileC.getAbsolutePath().endsWith(".gz") ? EnumC16726c.GZIP : EnumC16726c.JSON;
            u6.g.a("Cache hit for " + str + " at " + fileC.getAbsolutePath());
            return new Pair<>(enumC16726c, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    void f(String str, EnumC16726c enumC16726c) throws NoSuchAlgorithmException {
        File file = new File(e(), b(str, enumC16726c, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean zRenameTo = file.renameTo(file2);
        u6.g.a("Copying temp file to real file (" + file2 + ")");
        if (zRenameTo) {
            return;
        }
        u6.g.c("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
    }

    File g(String str, InputStream inputStream, EnumC16726c enumC16726c) throws NoSuchAlgorithmException, IOException {
        File file = new File(e(), b(str, enumC16726c, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i10 = inputStream.read(bArr);
                    if (i10 == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i10);
                }
            } catch (Throwable th2) {
                fileOutputStream.close();
                throw th2;
            }
        } finally {
            inputStream.close();
        }
    }

    private static String b(String str, EnumC16726c enumC16726c, boolean z10) throws NoSuchAlgorithmException {
        String strB = z10 ? enumC16726c.b() : enumC16726c.f157847a;
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - strB.length();
        if (strReplaceAll.length() > length) {
            strReplaceAll = d(strReplaceAll, length);
        }
        return "lottie_cache_" + strReplaceAll + strB;
    }

    private File c(String str) throws FileNotFoundException {
        File file = new File(e(), b(str, EnumC16726c.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(e(), b(str, EnumC16726c.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(e(), b(str, EnumC16726c.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    private File e() {
        File fileG = this.f157848a.G();
        if (fileG.isFile()) {
            fileG.delete();
        }
        if (!fileG.exists()) {
            fileG.mkdirs();
        }
        return fileG;
    }

    public g(e eVar) {
        this.f157848a = eVar;
    }
}
