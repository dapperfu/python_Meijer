package T6;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class b implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final File f34828a;

    /* renamed from: b, reason: collision with root package name */
    private final File f34829b;

    /* renamed from: c, reason: collision with root package name */
    private final File f34830c;

    /* renamed from: d, reason: collision with root package name */
    private final File f34831d;

    /* renamed from: e, reason: collision with root package name */
    private final int f34832e;

    /* renamed from: f, reason: collision with root package name */
    private long f34833f;

    /* renamed from: g, reason: collision with root package name */
    private final int f34834g;

    /* renamed from: i, reason: collision with root package name */
    private Writer f34836i;

    /* renamed from: k, reason: collision with root package name */
    private int f34838k;

    /* renamed from: h, reason: collision with root package name */
    private long f34835h = 0;

    /* renamed from: j, reason: collision with root package name */
    private final LinkedHashMap<String, d> f34837j = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: l, reason: collision with root package name */
    private long f34839l = 0;

    /* renamed from: m, reason: collision with root package name */
    final ThreadPoolExecutor f34840m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0775b(null));

    /* renamed from: n, reason: collision with root package name */
    private final Callable<Void> f34841n = new a();

    class a implements Callable<Void> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (b.this) {
                try {
                    if (b.this.f34836i == null) {
                        return null;
                    }
                    b.this.e0();
                    if (b.this.H()) {
                        b.this.T();
                        b.this.f34838k = 0;
                    }
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: T6.b$b, reason: collision with other inner class name */
    private static final class ThreadFactoryC0775b implements ThreadFactory {
        private ThreadFactoryC0775b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        /* synthetic */ ThreadFactoryC0775b(a aVar) {
            this();
        }
    }

    public final class c {

        /* renamed from: a, reason: collision with root package name */
        private final d f34843a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean[] f34844b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f34845c;

        /* synthetic */ c(b bVar, d dVar, a aVar) {
            this(dVar);
        }

        private c(d dVar) {
            this.f34843a = dVar;
            this.f34844b = dVar.f34851e ? null : new boolean[b.this.f34834g];
        }

        public void a() throws IOException {
            b.this.p(this, false);
        }

        public void b() {
            if (this.f34845c) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public void e() throws IOException {
            b.this.p(this, true);
            this.f34845c = true;
        }

        public File f(int i10) throws IOException {
            File fileK;
            synchronized (b.this) {
                try {
                    if (this.f34843a.f34852f != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f34843a.f34851e) {
                        this.f34844b[i10] = true;
                    }
                    fileK = this.f34843a.k(i10);
                    b.this.f34828a.mkdirs();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return fileK;
        }
    }

    private final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f34847a;

        /* renamed from: b, reason: collision with root package name */
        private final long[] f34848b;

        /* renamed from: c, reason: collision with root package name */
        File[] f34849c;

        /* renamed from: d, reason: collision with root package name */
        File[] f34850d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f34851e;

        /* renamed from: f, reason: collision with root package name */
        private c f34852f;

        /* renamed from: g, reason: collision with root package name */
        private long f34853g;

        /* synthetic */ d(b bVar, String str, a aVar) {
            this(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(String[] strArr) throws IOException {
            if (strArr.length != b.this.f34834g) {
                throw m(strArr);
            }
            for (int i10 = 0; i10 < strArr.length; i10++) {
                try {
                    this.f34848b[i10] = Long.parseLong(strArr[i10]);
                } catch (NumberFormatException unused) {
                    throw m(strArr);
                }
            }
        }

        private d(String str) {
            this.f34847a = str;
            this.f34848b = new long[b.this.f34834g];
            this.f34849c = new File[b.this.f34834g];
            this.f34850d = new File[b.this.f34834g];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i10 = 0; i10 < b.this.f34834g; i10++) {
                sb2.append(i10);
                this.f34849c[i10] = new File(b.this.f34828a, sb2.toString());
                sb2.append(".tmp");
                this.f34850d[i10] = new File(b.this.f34828a, sb2.toString());
                sb2.setLength(length);
            }
        }

        private IOException m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public File j(int i10) {
            return this.f34849c[i10];
        }

        public File k(int i10) {
            return this.f34850d[i10];
        }

        public String l() throws IOException {
            StringBuilder sb2 = new StringBuilder();
            for (long j10 : this.f34848b) {
                sb2.append(' ');
                sb2.append(j10);
            }
            return sb2.toString();
        }
    }

    public final class e {

        /* renamed from: a, reason: collision with root package name */
        private final String f34855a;

        /* renamed from: b, reason: collision with root package name */
        private final long f34856b;

        /* renamed from: c, reason: collision with root package name */
        private final long[] f34857c;

        /* renamed from: d, reason: collision with root package name */
        private final File[] f34858d;

        /* synthetic */ e(b bVar, String str, long j10, File[] fileArr, long[] jArr, a aVar) {
            this(str, j10, fileArr, jArr);
        }

        private e(String str, long j10, File[] fileArr, long[] jArr) {
            this.f34855a = str;
            this.f34856b = j10;
            this.f34858d = fileArr;
            this.f34857c = jArr;
        }

        public File a(int i10) {
            return this.f34858d[i10];
        }
    }

    private synchronized c A(String str, long j10) throws IOException {
        l();
        d dVar = this.f34837j.get(str);
        a aVar = null;
        if (j10 != -1 && (dVar == null || dVar.f34853g != j10)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, aVar);
            this.f34837j.put(str, dVar);
        } else if (dVar.f34852f != null) {
            return null;
        }
        c cVar = new c(this, dVar, aVar);
        dVar.f34852f = cVar;
        this.f34836i.append((CharSequence) "DIRTY");
        this.f34836i.append(' ');
        this.f34836i.append((CharSequence) str);
        this.f34836i.append('\n');
        B(this.f34836i);
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void T() throws IOException {
        try {
            Writer writer = this.f34836i;
            if (writer != null) {
                m(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f34830c), T6.d.f34866a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f34832e));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f34834g));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (d dVar : this.f34837j.values()) {
                    if (dVar.f34852f != null) {
                        bufferedWriter.write("DIRTY " + dVar.f34847a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + dVar.f34847a + dVar.l() + '\n');
                    }
                }
                m(bufferedWriter);
                if (this.f34829b.exists()) {
                    c0(this.f34829b, this.f34831d, true);
                }
                c0(this.f34830c, this.f34829b, false);
                this.f34831d.delete();
                this.f34836i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f34829b, true), T6.d.f34866a));
            } catch (Throwable th2) {
                m(bufferedWriter);
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void p(c cVar, boolean z10) throws IOException {
        d dVar = cVar.f34843a;
        if (dVar.f34852f != cVar) {
            throw new IllegalStateException();
        }
        if (z10 && !dVar.f34851e) {
            for (int i10 = 0; i10 < this.f34834g; i10++) {
                if (!cVar.f34844b[i10]) {
                    cVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                }
                if (!dVar.k(i10).exists()) {
                    cVar.a();
                    return;
                }
            }
        }
        for (int i11 = 0; i11 < this.f34834g; i11++) {
            File fileK = dVar.k(i11);
            if (!z10) {
                w(fileK);
            } else if (fileK.exists()) {
                File fileJ = dVar.j(i11);
                fileK.renameTo(fileJ);
                long j10 = dVar.f34848b[i11];
                long length = fileJ.length();
                dVar.f34848b[i11] = length;
                this.f34835h = (this.f34835h - j10) + length;
            }
        }
        this.f34838k++;
        dVar.f34852f = null;
        if (dVar.f34851e || z10) {
            dVar.f34851e = true;
            this.f34836i.append((CharSequence) "CLEAN");
            this.f34836i.append(' ');
            this.f34836i.append((CharSequence) dVar.f34847a);
            this.f34836i.append((CharSequence) dVar.l());
            this.f34836i.append('\n');
            if (z10) {
                long j11 = this.f34839l;
                this.f34839l = 1 + j11;
                dVar.f34853g = j11;
            }
        } else {
            this.f34837j.remove(dVar.f34847a);
            this.f34836i.append((CharSequence) "REMOVE");
            this.f34836i.append(' ');
            this.f34836i.append((CharSequence) dVar.f34847a);
            this.f34836i.append('\n');
        }
        B(this.f34836i);
        if (this.f34835h > this.f34833f || H()) {
            this.f34840m.submit(this.f34841n);
        }
    }

    public synchronized e D(String str) throws IOException {
        Throwable th2;
        try {
            try {
                l();
                d dVar = this.f34837j.get(str);
                if (dVar == null) {
                    return null;
                }
                if (!dVar.f34851e) {
                    return null;
                }
                for (File file : dVar.f34849c) {
                    try {
                        if (!file.exists()) {
                            return null;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                this.f34838k++;
                this.f34836i.append((CharSequence) "READ");
                this.f34836i.append(' ');
                this.f34836i.append((CharSequence) str);
                this.f34836i.append('\n');
                if (H()) {
                    this.f34840m.submit(this.f34841n);
                }
                return new e(this, str, dVar.f34853g, dVar.f34849c, dVar.f34848b, null);
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    public synchronized boolean Z(String str) throws IOException {
        try {
            l();
            d dVar = this.f34837j.get(str);
            if (dVar != null && dVar.f34852f == null) {
                for (int i10 = 0; i10 < this.f34834g; i10++) {
                    File fileJ = dVar.j(i10);
                    if (fileJ.exists() && !fileJ.delete()) {
                        throw new IOException("failed to delete " + fileJ);
                    }
                    this.f34835h -= dVar.f34848b[i10];
                    dVar.f34848b[i10] = 0;
                }
                this.f34838k++;
                this.f34836i.append((CharSequence) "REMOVE");
                this.f34836i.append(' ');
                this.f34836i.append((CharSequence) str);
                this.f34836i.append('\n');
                this.f34837j.remove(str);
                if (H()) {
                    this.f34840m.submit(this.f34841n);
                }
                return true;
            }
            return false;
        } finally {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.f34836i == null) {
                return;
            }
            Iterator it = new ArrayList(this.f34837j.values()).iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar.f34852f != null) {
                    dVar.f34852f.a();
                }
            }
            e0();
            m(this.f34836i);
            this.f34836i = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private b(File file, int i10, int i11, long j10) {
        this.f34828a = file;
        this.f34832e = i10;
        this.f34829b = new File(file, "journal");
        this.f34830c = new File(file, "journal.tmp");
        this.f34831d = new File(file, "journal.bkp");
        this.f34834g = i11;
        this.f34833f = j10;
    }

    @TargetApi(26)
    private static void B(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean H() {
        int i10 = this.f34838k;
        return i10 >= 2000 && i10 >= this.f34837j.size();
    }

    public static b J(File file, int i10, int i11, long j10) throws IOException {
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                c0(file2, file3, false);
            }
        }
        b bVar = new b(file, i10, i11, j10);
        if (bVar.f34829b.exists()) {
            try {
                bVar.O();
                bVar.K();
                return bVar;
            } catch (IOException e10) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                bVar.u();
            }
        }
        file.mkdirs();
        b bVar2 = new b(file, i10, i11, j10);
        bVar2.T();
        return bVar2;
    }

    private void K() throws IOException {
        w(this.f34830c);
        Iterator<d> it = this.f34837j.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i10 = 0;
            if (next.f34852f == null) {
                while (i10 < this.f34834g) {
                    this.f34835h += next.f34848b[i10];
                    i10++;
                }
            } else {
                next.f34852f = null;
                while (i10 < this.f34834g) {
                    w(next.j(i10));
                    w(next.k(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    private void O() throws IOException {
        T6.c cVar = new T6.c(new FileInputStream(this.f34829b), T6.d.f34866a);
        try {
            String strD = cVar.d();
            String strD2 = cVar.d();
            String strD3 = cVar.d();
            String strD4 = cVar.d();
            String strD5 = cVar.d();
            if (!"libcore.io.DiskLruCache".equals(strD) || !"1".equals(strD2) || !Integer.toString(this.f34832e).equals(strD3) || !Integer.toString(this.f34834g).equals(strD4) || !"".equals(strD5)) {
                throw new IOException("unexpected journal header: [" + strD + ", " + strD2 + ", " + strD4 + ", " + strD5 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    R(cVar.d());
                    i10++;
                } catch (EOFException unused) {
                    this.f34838k = i10 - this.f34837j.size();
                    if (cVar.c()) {
                        T();
                    } else {
                        this.f34836i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f34829b, true), T6.d.f34866a));
                    }
                    T6.d.a(cVar);
                    return;
                }
            }
        } catch (Throwable th2) {
            T6.d.a(cVar);
            throw th2;
        }
    }

    private void R(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i10 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i10);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i10);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.f34837j.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf2);
        }
        d dVar = this.f34837j.get(strSubstring);
        a aVar = null;
        if (dVar == null) {
            dVar = new d(this, strSubstring, aVar);
            this.f34837j.put(strSubstring, dVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            dVar.f34851e = true;
            dVar.f34852f = null;
            dVar.n(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f34852f = new c(this, dVar, aVar);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    private static void c0(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            w(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0() throws IOException {
        while (this.f34835h > this.f34833f) {
            Z(this.f34837j.entrySet().iterator().next().getKey());
        }
    }

    private void l() {
        if (this.f34836i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @TargetApi(26)
    private static void m(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public c z(String str) throws IOException {
        return A(str, -1L);
    }

    private static void w(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public void u() throws IOException {
        close();
        T6.d.b(this.f34828a);
    }
}
