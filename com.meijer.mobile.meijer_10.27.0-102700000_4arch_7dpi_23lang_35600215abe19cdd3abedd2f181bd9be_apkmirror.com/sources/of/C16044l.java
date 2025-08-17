package of;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* renamed from: of.l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C16044l {

    /* renamed from: d, reason: collision with root package name */
    private static final FilenameFilter f153521d = new FilenameFilter() { // from class: of.j
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith("aqs.");
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private static final Comparator<File> f153522e = new Comparator() { // from class: of.k
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final uf.g f153523a;

    /* renamed from: b, reason: collision with root package name */
    private String f153524b = null;

    /* renamed from: c, reason: collision with root package name */
    private String f153525c = null;

    public synchronized String c(String str) {
        if (Objects.equals(this.f153524b, str)) {
            return this.f153525c;
        }
        return e(this.f153523a, str);
    }

    public synchronized void f(String str) {
        if (!Objects.equals(this.f153525c, str)) {
            d(this.f153523a, this.f153524b, str);
            this.f153525c = str;
        }
    }

    public synchronized void g(String str) {
        if (!Objects.equals(this.f153524b, str)) {
            d(this.f153523a, str, this.f153525c);
            this.f153524b = str;
        }
    }

    private static void d(uf.g gVar, String str, String str2) throws IOException {
        if (str == null || str2 == null) {
            return;
        }
        try {
            gVar.q(str, "aqs." + str2).createNewFile();
        } catch (IOException e10) {
            lf.g.f().l("Failed to persist App Quality Sessions session id.", e10);
        }
    }

    static String e(uf.g gVar, String str) {
        List<File> listR = gVar.r(str, f153521d);
        if (!listR.isEmpty()) {
            return ((File) Collections.min(listR, f153522e)).getName().substring(4);
        }
        lf.g.f().k("Unable to read App Quality Sessions session id.");
        return null;
    }

    C16044l(uf.g gVar) {
        this.f153523a = gVar;
    }
}
