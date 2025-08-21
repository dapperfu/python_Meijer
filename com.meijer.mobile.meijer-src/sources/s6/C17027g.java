package s6;

import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: s6.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17027g {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC17025e f160063a;

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

    Pair<EnumC17023c, InputStream> a(String str) {
        try {
            File fileC = c(str);
            if (fileC == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(fileC);
            EnumC17023c enumC17023c = fileC.getAbsolutePath().endsWith(".zip") ? EnumC17023c.ZIP : fileC.getAbsolutePath().endsWith(".gz") ? EnumC17023c.GZIP : EnumC17023c.JSON;
            v6.g.a("Cache hit for " + str + " at " + fileC.getAbsolutePath());
            return new Pair<>(enumC17023c, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    void f(String str, EnumC17023c enumC17023c) throws NoSuchAlgorithmException {
        File file = new File(e(), b(str, enumC17023c, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean zRenameTo = file.renameTo(file2);
        v6.g.a("Copying temp file to real file (" + file2 + ")");
        if (zRenameTo) {
            return;
        }
        v6.g.c("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
    }

    File g(String str, InputStream inputStream, EnumC17023c enumC17023c) throws NoSuchAlgorithmException, IOException {
        File file = new File(e(), b(str, enumC17023c, true));
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

    private static String b(String str, EnumC17023c enumC17023c, boolean z10) throws NoSuchAlgorithmException {
        String strB = z10 ? enumC17023c.b() : enumC17023c.f160062a;
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - strB.length();
        if (strReplaceAll.length() > length) {
            strReplaceAll = d(strReplaceAll, length);
        }
        return "lottie_cache_" + strReplaceAll + strB;
    }

    private File c(String str) throws FileNotFoundException {
        File file = new File(e(), b(str, EnumC17023c.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(e(), b(str, EnumC17023c.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(e(), b(str, EnumC17023c.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    private File e() {
        File fileG = this.f160063a.G();
        if (fileG.isFile()) {
            fileG.delete();
        }
        if (!fileG.exists()) {
            fileG.mkdirs();
        }
        return fileG;
    }

    public C17027g(InterfaceC17025e interfaceC17025e) {
        this.f160063a = interfaceC17025e;
    }
}
