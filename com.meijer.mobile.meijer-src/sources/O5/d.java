package O5;

import M5.g;
import R5.K;
import R5.t;
import g6.C14334g;
import g6.C14335h;
import g6.i;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes4.dex */
class d {
    private File e(String str) {
        return new File(d(str).getPath() + File.separator + "rules.zip");
    }

    d() {
    }

    private boolean a(String str) {
        return !i.a(str);
    }

    boolean b(String str) throws NoSuchAlgorithmException {
        if (!a(str)) {
            return false;
        }
        File fileD = d(str);
        if (!fileD.exists() && !fileD.mkdirs()) {
            t.a("MobileCore", "RulesZipProcessingHelper", "Cannot access application cache directory to create temp dir.", new Object[0]);
            return false;
        }
        return true;
    }

    void c(String str) throws SecurityException {
        if (!a(str)) {
            return;
        }
        g.b(d(str), true);
    }

    File d(String str) throws NoSuchAlgorithmException {
        String strA = C14335h.a(str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(K.f().e().o().getPath());
        String str2 = File.separator;
        sb2.append(str2);
        sb2.append("aepsdktmp");
        sb2.append(str2);
        sb2.append(strA);
        return new File(sb2.toString());
    }

    boolean f(String str, InputStream inputStream) {
        if (!a(str)) {
            return false;
        }
        if (!g.h(e(str), inputStream, false)) {
            t.a("MobileCore", "RulesZipProcessingHelper", "Cannot read response content into temp dir.", new Object[0]);
            return false;
        }
        return true;
    }

    String g(String str) throws NoSuchAlgorithmException, IOException {
        if (!a(str)) {
            return null;
        }
        File fileD = d(str);
        if (!g.c(e(str), fileD.getPath())) {
            t.a("MobileCore", "RulesZipProcessingHelper", "Failed to extract rules response zip into temp dir.", new Object[0]);
            return null;
        }
        File file = new File(fileD.getPath() + File.separator + "rules.json");
        if (!file.exists()) {
            t.a("MobileCore", "RulesZipProcessingHelper", "Extract rules directory does not contain a rules.json file.", new Object[0]);
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                String strA = C14334g.a(fileInputStream);
                if (strA == null) {
                    t.a("MobileCore", "RulesZipProcessingHelper", "Null content from rules.json file.", new Object[0]);
                    fileInputStream.close();
                    return null;
                }
                fileInputStream.close();
                return strA;
            } finally {
            }
        } catch (IOException unused) {
            t.a("MobileCore", "RulesZipProcessingHelper", "Exception while processing rules from source %s", str);
            return null;
        }
    }
}
