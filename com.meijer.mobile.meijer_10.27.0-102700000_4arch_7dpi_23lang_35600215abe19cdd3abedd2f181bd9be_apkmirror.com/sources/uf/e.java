package uf;

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
import of.C;
import of.C16045m;
import qf.p;
import rf.AbstractC16777F;
import sf.j;

/* loaded from: classes7.dex */
public class e {

    /* renamed from: e, reason: collision with root package name */
    private static final Charset f162905e = Charset.forName("UTF-8");

    /* renamed from: f, reason: collision with root package name */
    private static final int f162906f = 15;

    /* renamed from: g, reason: collision with root package name */
    private static final j f162907g = new j();

    /* renamed from: h, reason: collision with root package name */
    private static final Comparator<? super File> f162908h = new Comparator() { // from class: uf.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((File) obj2).getName().compareTo(((File) obj).getName());
        }
    };

    /* renamed from: i, reason: collision with root package name */
    private static final FilenameFilter f162909i = new FilenameFilter() { // from class: uf.b
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith("event");
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f162910a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    private final g f162911b;

    /* renamed from: c, reason: collision with root package name */
    private final wf.j f162912c;

    /* renamed from: d, reason: collision with root package name */
    private final C16045m f162913d;

    private static String o(String str) {
        return str.substring(0, f162906f);
    }

    private void A(String str, long j10) {
        boolean z10;
        List<File> listR = this.f162911b.r(str, f162909i);
        if (listR.isEmpty()) {
            lf.g.f().i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(listR);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z10 = false;
            for (File file : listR) {
                try {
                    arrayList.add(f162907g.j(y(file)));
                } catch (IOException e10) {
                    lf.g.f().l("Could not add event to report for " + file, e10);
                }
                if (z10 || s(file.getName())) {
                    z10 = true;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            B(this.f162911b.q(str, "report"), arrayList, j10, z10, p.l(str, this.f162911b), this.f162913d.d(str));
        } else {
            lf.g.f().k("Could not parse event files for session " + str);
        }
    }

    private void B(File file, List<AbstractC16777F.e.d> list, long j10, boolean z10, String str, String str2) {
        try {
            j jVar = f162907g;
            AbstractC16777F abstractC16777FR = jVar.L(y(file)).v(j10, z10, str).p(str2).r(list);
            AbstractC16777F.e eVarN = abstractC16777FR.n();
            if (eVarN == null) {
                return;
            }
            lf.g.f().b("appQualitySessionId: " + str2);
            D(z10 ? this.f162911b.l(eVarN.i()) : this.f162911b.n(eVarN.i()), jVar.M(abstractC16777FR));
        } catch (IOException e10) {
            lf.g.f().l("Could not synthesize final report file for " + file, e10);
        }
    }

    private int C(String str, int i10) {
        List<File> listR = this.f162911b.r(str, new FilenameFilter() { // from class: uf.c
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return e.t(file, str2);
            }
        });
        Collections.sort(listR, new Comparator() { // from class: uf.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return e.v((File) obj, (File) obj2);
            }
        });
        return f(listR, i10);
    }

    private static void D(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f162905e);
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
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f162905e);
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
        this.f162911b.d();
        SortedSet<String> sortedSetP = p();
        if (str != null) {
            sortedSetP.remove(str);
        }
        if (sortedSetP.size() > 8) {
            while (sortedSetP.size() > 8) {
                String strLast = sortedSetP.last();
                lf.g.f().b("Removing session over cap: " + strLast);
                this.f162911b.e(strLast);
                sortedSetP.remove(strLast);
            }
        }
        return sortedSetP;
    }

    private void g() {
        int i10 = this.f162912c.b().f166063a.f166075b;
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
        arrayList.addAll(this.f162911b.m());
        arrayList.addAll(this.f162911b.j());
        Comparator<? super File> comparator = f162908h;
        Collections.sort(arrayList, comparator);
        List<File> listO = this.f162911b.o();
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
                    String str = new String(byteArrayOutputStream.toByteArray(), f162905e);
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

    private void z(File file, AbstractC16777F.d dVar, String str, AbstractC16777F.a aVar) {
        String strD = this.f162913d.d(str);
        try {
            j jVar = f162907g;
            D(this.f162911b.i(str), jVar.M(jVar.L(y(file)).u(dVar).q(aVar).p(strD)));
        } catch (IOException e10) {
            lf.g.f().l("Could not synthesize final native report file for " + file, e10);
        }
    }

    public void i() {
        j(this.f162911b.o());
        j(this.f162911b.m());
        j(this.f162911b.j());
    }

    public void l(String str, AbstractC16777F.d dVar, AbstractC16777F.a aVar) {
        File fileQ = this.f162911b.q(str, "report");
        lf.g.f().b("Writing native session report for " + str + " to file: " + fileQ);
        z(fileQ, dVar, str, aVar);
    }

    public SortedSet<String> p() {
        return new TreeSet(this.f162911b.f()).descendingSet();
    }

    public long q(String str) {
        return this.f162911b.q(str, "start-time").lastModified();
    }

    public boolean r() {
        return (this.f162911b.o().isEmpty() && this.f162911b.m().isEmpty() && this.f162911b.j().isEmpty()) ? false : true;
    }

    public void w(AbstractC16777F.e.d dVar, String str, boolean z10) {
        int i10 = this.f162912c.b().f166063a.f166074a;
        try {
            D(this.f162911b.q(str, m(this.f162910a.getAndIncrement(), z10)), f162907g.k(dVar));
        } catch (IOException e10) {
            lf.g.f().l("Could not persist event for session " + str, e10);
        }
        C(str, i10);
    }

    public e(g gVar, wf.j jVar, C16045m c16045m) {
        this.f162911b = gVar;
        this.f162912c = jVar;
        this.f162913d = c16045m;
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
            lf.g.f().i("Finalizing report for session " + str2);
            A(str2, j10);
            this.f162911b.e(str2);
        }
        g();
    }

    public List<C> u() {
        List<File> listN = n();
        ArrayList arrayList = new ArrayList();
        for (File file : listN) {
            try {
                arrayList.add(C.a(f162907g.L(y(file)), file.getName(), file));
            } catch (IOException e10) {
                lf.g.f().l("Could not load report file " + file + "; deleting", e10);
                file.delete();
            }
        }
        return arrayList;
    }

    public void x(AbstractC16777F abstractC16777F) {
        AbstractC16777F.e eVarN = abstractC16777F.n();
        if (eVarN == null) {
            lf.g.f().b("Could not get session for report");
            return;
        }
        String strI = eVarN.i();
        try {
            D(this.f162911b.q(strI, "report"), f162907g.M(abstractC16777F));
            E(this.f162911b.q(strI, "start-time"), "", eVarN.l());
        } catch (IOException e10) {
            lf.g.f().c("Could not persist report for session " + strI, e10);
        }
    }
}
