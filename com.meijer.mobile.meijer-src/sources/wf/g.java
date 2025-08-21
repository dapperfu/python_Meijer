package wf;

import android.content.Context;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import nf.j;
import qf.C16649i;

/* loaded from: classes8.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    final String f167124a;

    /* renamed from: b, reason: collision with root package name */
    private final File f167125b;

    /* renamed from: c, reason: collision with root package name */
    private final File f167126c;

    /* renamed from: d, reason: collision with root package name */
    private final File f167127d;

    /* renamed from: e, reason: collision with root package name */
    private final File f167128e;

    /* renamed from: f, reason: collision with root package name */
    private final File f167129f;

    /* renamed from: g, reason: collision with root package name */
    private final File f167130g;

    private void b(String str) {
        File file = new File(this.f167125b, str);
        if (file.exists() && u(file)) {
            nf.g.f().b("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    private void c(final String str) {
        String[] list;
        if (!this.f167125b.exists() || (list = this.f167125b.list(new FilenameFilter() { // from class: wf.f
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
        return t(new File(this.f167127d, str));
    }

    private static synchronized File s(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                nf.g.f().b("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                file.delete();
            }
            if (!file.mkdirs()) {
                nf.g.f().d("Could not create Crashlytics-specific directory: " + file);
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
        return !this.f167124a.isEmpty();
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
        return u(new File(this.f167127d, str));
    }

    public List<String> f() {
        return v(this.f167127d.list());
    }

    public File g(String str) {
        return new File(this.f167126c, str);
    }

    public List<File> h(FilenameFilter filenameFilter) {
        return v(this.f167126c.listFiles(filenameFilter));
    }

    public File i(String str) {
        return new File(this.f167130g, str);
    }

    public List<File> j() {
        return v(this.f167130g.listFiles());
    }

    public File k(String str) {
        return t(new File(p(str), "native"));
    }

    public File l(String str) {
        return new File(this.f167129f, str);
    }

    public List<File> m() {
        return v(this.f167129f.listFiles());
    }

    public File n(String str) {
        return new File(this.f167128e, str);
    }

    public List<File> o() {
        return v(this.f167128e.listFiles());
    }

    public File q(String str, String str2) {
        return new File(p(str), str2);
    }

    public g(Context context) {
        String str;
        String strD = j.f152436a.e(context).d();
        this.f167124a = strD;
        File filesDir = context.getFilesDir();
        this.f167125b = filesDir;
        if (x()) {
            str = ".crashlytics.v3" + File.separator + w(strD);
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File fileS = s(new File(filesDir, str));
        this.f167126c = fileS;
        this.f167127d = s(new File(fileS, "open-sessions"));
        this.f167128e = s(new File(fileS, "reports"));
        this.f167129f = s(new File(fileS, "priority-reports"));
        this.f167130g = s(new File(fileS, "native-reports"));
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
            return C16649i.A(str);
        }
        return str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    public List<File> r(String str, FilenameFilter filenameFilter) {
        return v(p(str).listFiles(filenameFilter));
    }
}
