package qf;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* renamed from: qf.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C16652l {

    /* renamed from: d, reason: collision with root package name */
    private static final FilenameFilter f158373d = new FilenameFilter() { // from class: qf.j
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith("aqs.");
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private static final Comparator<File> f158374e = new Comparator() { // from class: qf.k
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final wf.g f158375a;

    /* renamed from: b, reason: collision with root package name */
    private String f158376b = null;

    /* renamed from: c, reason: collision with root package name */
    private String f158377c = null;

    public synchronized String c(String str) {
        if (Objects.equals(this.f158376b, str)) {
            return this.f158377c;
        }
        return e(this.f158375a, str);
    }

    public synchronized void f(String str) {
        if (!Objects.equals(this.f158377c, str)) {
            d(this.f158375a, this.f158376b, str);
            this.f158377c = str;
        }
    }

    public synchronized void g(String str) {
        if (!Objects.equals(this.f158376b, str)) {
            d(this.f158375a, str, this.f158377c);
            this.f158376b = str;
        }
    }

    private static void d(wf.g gVar, String str, String str2) throws IOException {
        if (str == null || str2 == null) {
            return;
        }
        try {
            gVar.q(str, "aqs." + str2).createNewFile();
        } catch (IOException e10) {
            nf.g.f().l("Failed to persist App Quality Sessions session id.", e10);
        }
    }

    static String e(wf.g gVar, String str) {
        List<File> listR = gVar.r(str, f158373d);
        if (!listR.isEmpty()) {
            return ((File) Collections.min(listR, f158374e)).getName().substring(4);
        }
        nf.g.f().k("Unable to read App Quality Sessions session id.");
        return null;
    }

    C16652l(wf.g gVar) {
        this.f158375a = gVar;
    }
}
