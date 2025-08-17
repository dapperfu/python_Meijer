package uf;

import android.content.Context;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import lf.j;
import of.C16041i;

/* loaded from: classes7.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    final String f162915a;

    /* renamed from: b, reason: collision with root package name */
    private final File f162916b;

    /* renamed from: c, reason: collision with root package name */
    private final File f162917c;

    /* renamed from: d, reason: collision with root package name */
    private final File f162918d;

    /* renamed from: e, reason: collision with root package name */
    private final File f162919e;

    /* renamed from: f, reason: collision with root package name */
    private final File f162920f;

    /* renamed from: g, reason: collision with root package name */
    private final File f162921g;

    private void b(String str) {
        File file = new File(this.f162916b, str);
        if (file.exists() && u(file)) {
            lf.g.f().b("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    private void c(final String str) {
        String[] list;
        if (!this.f162916b.exists() || (list = this.f162916b.list(new FilenameFilter() { // from class: uf.f
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return str2.startsWith(str);
            }
        })) == null) {
            return;
        }
        for (String str2 : list) {
            b(str2);
        }
    }

    private File p(String str) {
        return t(new File(this.f162918d, str));
    }

    private static synchronized File s(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                lf.g.f().b("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                file.delete();
            }
            if (!file.mkdirs()) {
                lf.g.f().d("Could not create Crashlytics-specific directory: " + file);
            }
            return file;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static <T> List<T> v(T[] tArr) {
        return tArr == null ? Collections.EMPTY_LIST : Arrays.asList(tArr);
    }

    private boolean x() {
        return !this.f162915a.isEmpty();
    }

    public void d() {
        b(".com.google.firebase.crashlytics");
        b(".com.google.firebase.crashlytics-ndk");
        if (x()) {
            b(".com.google.firebase.crashlytics.files.v1");
            c(".com.google.firebase.crashlytics.files.v2" + File.pathSeparator);
        }
    }

    public boolean e(String str) {
        return u(new File(this.f162918d, str));
    }

    public List<String> f() {
        return v(this.f162918d.list());
    }

    public File g(String str) {
        return new File(this.f162917c, str);
    }

    public List<File> h(FilenameFilter filenameFilter) {
        return v(this.f162917c.listFiles(filenameFilter));
    }

    public File i(String str) {
        return new File(this.f162921g, str);
    }

    public List<File> j() {
        return v(this.f162921g.listFiles());
    }

    public File k(String str) {
        return t(new File(p(str), "native"));
    }

    public File l(String str) {
        return new File(this.f162920f, str);
    }

    public List<File> m() {
        return v(this.f162920f.listFiles());
    }

    public File n(String str) {
        return new File(this.f162919e, str);
    }

    public List<File> o() {
        return v(this.f162919e.listFiles());
    }

    public File q(String str, String str2) {
        return new File(p(str), str2);
    }

    public g(Context context) {
        String str;
        String strD = j.f148865a.e(context).d();
        this.f162915a = strD;
        File filesDir = context.getFilesDir();
        this.f162916b = filesDir;
        if (x()) {
            str = ".crashlytics.v3" + File.separator + w(strD);
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File fileS = s(new File(filesDir, str));
        this.f162917c = fileS;
        this.f162918d = s(new File(fileS, "open-sessions"));
        this.f162919e = s(new File(fileS, "reports"));
        this.f162920f = s(new File(fileS, "priority-reports"));
        this.f162921g = s(new File(fileS, "native-reports"));
    }

    private static File t(File file) {
        file.mkdirs();
        return file;
    }

    static boolean u(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                u(file2);
            }
        }
        return file.delete();
    }

    static String w(String str) {
        if (str.length() > 40) {
            return C16041i.A(str);
        }
        return str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    public List<File> r(String str, FilenameFilter filenameFilter) {
        return v(p(str).listFiles(filenameFilter));
    }
}
