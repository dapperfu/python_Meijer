package wf;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import qf.C;
import qf.C16653m;
import sf.p;
import tf.AbstractC17251F;
import uf.j;

/* loaded from: classes8.dex */
public class e {

    /* renamed from: e, reason: collision with root package name */
    private static final Charset f167114e = Charset.forName("UTF-8");

    /* renamed from: f, reason: collision with root package name */
    private static final int f167115f = 15;

    /* renamed from: g, reason: collision with root package name */
    private static final j f167116g = new j();

    /* renamed from: h, reason: collision with root package name */
    private static final Comparator<? super File> f167117h = new Comparator() { // from class: wf.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((File) obj2).getName().compareTo(((File) obj).getName());
        }
    };

    /* renamed from: i, reason: collision with root package name */
    private static final FilenameFilter f167118i = new FilenameFilter() { // from class: wf.b
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith("event");
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f167119a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    private final g f167120b;

    /* renamed from: c, reason: collision with root package name */
    private final yf.j f167121c;

    /* renamed from: d, reason: collision with root package name */
    private final C16653m f167122d;

    private static String o(String str) {
        return str.substring(0, f167115f);
    }

    private void A(String str, long j10) {
        boolean z10;
        List<File> listR = this.f167120b.r(str, f167118i);
        if (listR.isEmpty()) {
            nf.g.f().i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(listR);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z10 = false;
            for (File file : listR) {
                try {
                    arrayList.add(f167116g.j(y(file)));
                } catch (IOException e10) {
                    nf.g.f().l("Could not add event to report for " + file, e10);
                }
                if (z10 || s(file.getName())) {
                    z10 = true;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            B(this.f167120b.q(str, "report"), arrayList, j10, z10, p.l(str, this.f167120b), this.f167122d.d(str));
        } else {
            nf.g.f().k("Could not parse event files for session " + str);
        }
    }

    private void B(File file, List<AbstractC17251F.e.d> list, long j10, boolean z10, String str, String str2) {
        try {
            j jVar = f167116g;
            AbstractC17251F abstractC17251FR = jVar.L(y(file)).v(j10, z10, str).p(str2).r(list);
            AbstractC17251F.e eVarN = abstractC17251FR.n();
            if (eVarN == null) {
                return;
            }
            nf.g.f().b("appQualitySessionId: " + str2);
            D(z10 ? this.f167120b.l(eVarN.i()) : this.f167120b.n(eVarN.i()), jVar.M(abstractC17251FR));
        } catch (IOException e10) {
            nf.g.f().l("Could not synthesize final report file for " + file, e10);
        }
    }

    private int C(String str, int i10) {
        List<File> listR = this.f167120b.r(str, new FilenameFilter() { // from class: wf.c
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return e.t(file, str2);
            }
        });
        Collections.sort(listR, new Comparator() { // from class: wf.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return e.v((File) obj, (File) obj2);
            }
        });
        return f(listR, i10);
    }

    private static void D(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f167114e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static void E(File file, String str, long j10) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f167114e);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(h(j10));
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private SortedSet<String> e(String str) {
        this.f167120b.d();
        SortedSet<String> sortedSetP = p();
        if (str != null) {
            sortedSetP.remove(str);
        }
        if (sortedSetP.size() > 8) {
            while (sortedSetP.size() > 8) {
                String strLast = sortedSetP.last();
                nf.g.f().b("Removing session over cap: " + strLast);
                this.f167120b.e(strLast);
                sortedSetP.remove(strLast);
            }
        }
        return sortedSetP;
    }

    private void g() {
        int i10 = this.f167121c.b().f171385a.f171397b;
        List<File> listN = n();
        int size = listN.size();
        if (size <= i10) {
            return;
        }
        Iterator<File> it = listN.subList(i10, size).iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    private static long h(long j10) {
        return j10 * 1000;
    }

    private static String m(int i10, boolean z10) {
        return "event" + String.format(Locale.US, "%010d", Integer.valueOf(i10)) + (z10 ? "_" : "");
    }

    private List<File> n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f167120b.m());
        arrayList.addAll(this.f167120b.j());
        Comparator<? super File> comparator = f167117h;
        Collections.sort(arrayList, comparator);
        List<File> listO = this.f167120b.o();
        Collections.sort(listO, comparator);
        arrayList.addAll(listO);
        return arrayList;
    }

    private static boolean s(String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean t(File file, String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    private static String y(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i10 = fileInputStream.read(bArr);
                if (i10 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f167114e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    private void z(File file, AbstractC17251F.d dVar, String str, AbstractC17251F.a aVar) {
        String strD = this.f167122d.d(str);
        try {
            j jVar = f167116g;
            D(this.f167120b.i(str), jVar.M(jVar.L(y(file)).u(dVar).q(aVar).p(strD)));
        } catch (IOException e10) {
            nf.g.f().l("Could not synthesize final native report file for " + file, e10);
        }
    }

    public void i() {
        j(this.f167120b.o());
        j(this.f167120b.m());
        j(this.f167120b.j());
    }

    public void l(String str, AbstractC17251F.d dVar, AbstractC17251F.a aVar) {
        File fileQ = this.f167120b.q(str, "report");
        nf.g.f().b("Writing native session report for " + str + " to file: " + fileQ);
        z(fileQ, dVar, str, aVar);
    }

    public SortedSet<String> p() {
        return new TreeSet(this.f167120b.f()).descendingSet();
    }

    public long q(String str) {
        return this.f167120b.q(str, "start-time").lastModified();
    }

    public boolean r() {
        return (this.f167120b.o().isEmpty() && this.f167120b.m().isEmpty() && this.f167120b.j().isEmpty()) ? false : true;
    }

    public void w(AbstractC17251F.e.d dVar, String str, boolean z10) {
        int i10 = this.f167121c.b().f171385a.f171396a;
        try {
            D(this.f167120b.q(str, m(this.f167119a.getAndIncrement(), z10)), f167116g.k(dVar));
        } catch (IOException e10) {
            nf.g.f().l("Could not persist event for session " + str, e10);
        }
        C(str, i10);
    }

    public e(g gVar, yf.j jVar, C16653m c16653m) {
        this.f167120b = gVar;
        this.f167121c = jVar;
        this.f167122d = c16653m;
    }

    private static int f(List<File> list, int i10) {
        int size = list.size();
        for (File file : list) {
            if (size <= i10) {
                break;
            }
            g.u(file);
            size--;
        }
        return size;
    }

    private void j(List<File> list) {
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int v(File file, File file2) {
        return o(file.getName()).compareTo(o(file2.getName()));
    }

    public void k(String str, long j10) {
        for (String str2 : e(str)) {
            nf.g.f().i("Finalizing report for session " + str2);
            A(str2, j10);
            this.f167120b.e(str2);
        }
        g();
    }

    public List<C> u() {
        List<File> listN = n();
        ArrayList arrayList = new ArrayList();
        for (File file : listN) {
            try {
                arrayList.add(C.a(f167116g.L(y(file)), file.getName(), file));
            } catch (IOException e10) {
                nf.g.f().l("Could not load report file " + file + "; deleting", e10);
                file.delete();
            }
        }
        return arrayList;
    }

    public void x(AbstractC17251F abstractC17251F) {
        AbstractC17251F.e eVarN = abstractC17251F.n();
        if (eVarN == null) {
            nf.g.f().b("Could not get session for report");
            return;
        }
        String strI = eVarN.i();
        try {
            D(this.f167120b.q(strI, "report"), f167116g.M(abstractC17251F));
            E(this.f167120b.q(strI, "start-time"), "", eVarN.l());
        } catch (IOException e10) {
            nf.g.f().c("Could not persist report for session " + strI, e10);
        }
    }
}
