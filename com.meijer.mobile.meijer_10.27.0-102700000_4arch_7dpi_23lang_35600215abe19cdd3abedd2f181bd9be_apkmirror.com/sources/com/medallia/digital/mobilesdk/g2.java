package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import android.util.Pair;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* loaded from: classes7.dex */
final class g2 {

    /* renamed from: a, reason: collision with root package name */
    protected static final String f92083a = "medalliaDigitalSDK";

    /* renamed from: b, reason: collision with root package name */
    protected static final String f92084b = "PreviewApp";

    /* renamed from: c, reason: collision with root package name */
    private static final String f92085c = "com.medallia.digital.previewapp";

    /* renamed from: d, reason: collision with root package name */
    protected static final String f92086d = "resources";

    /* renamed from: e, reason: collision with root package name */
    protected static final String f92087e = "targetRuleEngine";

    /* renamed from: f, reason: collision with root package name */
    protected static final String f92088f = "configuration";

    /* renamed from: g, reason: collision with root package name */
    protected static final String f92089g = "configurationPropertyForLocale";

    /* renamed from: h, reason: collision with root package name */
    private static final String f92090h = "templates";

    class a extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f92091a;

        a(String str) {
            this.f92091a = str;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            super.a();
            new File(this.f92091a).delete();
        }
    }

    g2() {
    }

    protected static synchronized Pair<String, Boolean> a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return b(new File(f(str)));
    }

    protected static double b() {
        File file = new File(d());
        if (file.exists() && file.isDirectory()) {
            return m1.a(c(file));
        }
        return 0.0d;
    }

    protected static double c() {
        return m1.a(c(new File(f(f92086d))));
    }

    protected static synchronized File d(String str) {
        if (str == null) {
            return null;
        }
        return new File(f(str));
    }

    protected static double e() {
        return m1.a(c(new File(f(f92087e))));
    }

    protected static double f() {
        return m1.a(c(new File(f(f92090h))));
    }

    protected static String g(String str) throws IOException {
        if (str == null) {
            return null;
        }
        String strF = f(str);
        StringBuilder sb2 = new StringBuilder();
        try {
            File file = new File(strF);
            byte[] bArr = new byte[(int) file.length()];
            new DataInputStream(new BufferedInputStream(new FileInputStream(file))).readFully(bArr);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gZIPInputStream, StandardCharsets.UTF_8));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb2.append(line);
            }
            bufferedReader.close();
            gZIPInputStream.close();
            byteArrayInputStream.close();
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
        return sb2.toString();
    }

    protected static boolean h(String str) throws IOException {
        if (str == null) {
            return false;
        }
        String strF = f("");
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(f(str))));
            byte[] bArr = new byte[1024];
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    return true;
                }
                String strB = b(nextEntry.getName(), new File(strF));
                if (strB == null) {
                    a4.c("ZIP entry tried to write outside destination directory");
                    return false;
                }
                if (nextEntry.isDirectory()) {
                    new File(strB).mkdirs();
                } else {
                    new File(strB).getParentFile().mkdirs();
                    FileOutputStream fileOutputStream = new FileOutputStream(strB);
                    while (true) {
                        int i10 = zipInputStream.read(bArr);
                        if (i10 == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, i10);
                    }
                    fileOutputStream.close();
                    zipInputStream.closeEntry();
                }
            }
        } catch (Exception e10) {
            a4.c("Could not unzip item " + e10.getMessage());
            return false;
        }
    }

    protected static synchronized File a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && str2 != null) {
            File file = new File(f(str));
            if (file.getParentFile() != null && !file.getParentFile().exists()) {
                a4.b("Directory for file was created = " + file.getParentFile().mkdirs());
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(str2.getBytes());
                fileOutputStream.close();
                return file;
            } catch (IOException e10) {
                a4.c("Failed to store to file " + e10.getMessage());
                return null;
            }
        }
        return null;
    }

    private static Pair<String, Boolean> b(File file) {
        File[] fileArrListFiles;
        if (!file.exists()) {
            return null;
        }
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                b(file2);
            }
        }
        boolean zDelete = file.delete();
        a4.b("File was deleted = " + zDelete);
        return new Pair<>(file.getPath(), Boolean.valueOf(zDelete));
    }

    private static long c(File file) {
        File[] fileArrListFiles;
        long jC = 0;
        if (file != null && file.exists() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                jC += file2.isDirectory() ? c(file2) : file2.length();
            }
        }
        return jC;
    }

    protected static String d() {
        String path = i4.c().b().getFilesDir().getPath();
        return (path.isEmpty() || !path.contains(f92085c)) ? String.format("%s/%s", path, f92083a) : String.format("%s/%s", path, f92084b);
    }

    protected static FileInputStream e(String str) {
        try {
            return new FileInputStream(new File(str));
        } catch (FileNotFoundException e10) {
            a4.c(e10.getMessage());
            return null;
        }
    }

    protected static String f(String str) {
        return (str == null || !str.startsWith(d())) ? (str == null || !str.startsWith(q2.f92724c)) ? String.format("%s/%s", d(), str) : String.format("%s%s", d(), str) : str;
    }

    protected static synchronized File a(String str, byte[] bArr) {
        try {
            if (!TextUtils.isEmpty(str) && bArr != null) {
                File file = new File(f(str));
                try {
                    if (file.getParentFile() != null && !file.getParentFile().exists()) {
                        a4.b("Directory for file was created = " + file.getParentFile().mkdirs());
                    }
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                    bufferedOutputStream.write(bArr);
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                    return file;
                } catch (IOException unused) {
                    return null;
                }
            }
            return null;
        } finally {
        }
    }

    protected static synchronized Boolean b(String str) {
        Boolean bool = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(f(str));
        if (!file.exists()) {
            return null;
        }
        if (!file.isDirectory()) {
            return Boolean.valueOf(file.delete());
        }
        Pair<String, Boolean> pairB = b(file);
        if (pairB != null) {
            bool = (Boolean) pairB.second;
        }
        return bool;
    }

    protected static void c(String str) {
        w7.b().a().execute(new a(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected static synchronized boolean d(java.io.File r1) {
        /*
            java.lang.Class<com.medallia.digital.mobilesdk.g2> r0 = com.medallia.digital.mobilesdk.g2.class
            monitor-enter(r0)
            if (r1 == 0) goto L10
            boolean r1 = r1.exists()     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto L10
            r1 = 1
            goto L11
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
        L10:
            r1 = 0
        L11:
            monitor-exit(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.g2.d(java.io.File):boolean");
    }

    protected static synchronized String e(File file) {
        if (file != null) {
            try {
            } catch (IOException e10) {
                a4.c(e10.getMessage());
            } finally {
            }
            if (file.exists()) {
                StringBuilder sb2 = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb2.append(line);
                }
                bufferedReader.close();
                return sb2.toString();
            }
        }
        return null;
    }

    protected static synchronized Boolean a(File file) {
        if (file == null) {
            return null;
        }
        return Boolean.valueOf(file.delete());
    }

    private static String b(String str, File file) throws IOException {
        String canonicalPath = new File(file, str).getCanonicalPath();
        if (canonicalPath.startsWith(file.getCanonicalPath())) {
            return canonicalPath;
        }
        return null;
    }

    protected static synchronized ArrayList<Pair<String, Boolean>> a(String str, File file) {
        Pair<String, Boolean> pairB;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList<Pair<String, Boolean>> arrayList = new ArrayList<>();
        File file2 = new File(f(str));
        if (!file2.exists() || !file2.isDirectory()) {
            return null;
        }
        File[] fileArrListFiles = file2.listFiles();
        if (fileArrListFiles != null) {
            for (File file3 : fileArrListFiles) {
                if (file3 != null && !file3.equals(file) && (pairB = b(file3)) != null) {
                    arrayList.add(pairB);
                }
            }
        }
        return arrayList;
    }

    protected static synchronized void a() {
        a4.a("Files");
        b(new File(d()));
    }
}
