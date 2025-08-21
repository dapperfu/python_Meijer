package V6;

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
    private final File f39761a;

    /* renamed from: b, reason: collision with root package name */
    private final File f39762b;

    /* renamed from: c, reason: collision with root package name */
    private final File f39763c;

    /* renamed from: d, reason: collision with root package name */
    private final File f39764d;

    /* renamed from: e, reason: collision with root package name */
    private final int f39765e;

    /* renamed from: f, reason: collision with root package name */
    private long f39766f;

    /* renamed from: g, reason: collision with root package name */
    private final int f39767g;

    /* renamed from: i, reason: collision with root package name */
    private Writer f39769i;

    /* renamed from: k, reason: collision with root package name */
    private int f39771k;

    /* renamed from: h, reason: collision with root package name */
    private long f39768h = 0;

    /* renamed from: j, reason: collision with root package name */
    private final LinkedHashMap<String, d> f39770j = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: l, reason: collision with root package name */
    private long f39772l = 0;

    /* renamed from: m, reason: collision with root package name */
    final ThreadPoolExecutor f39773m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0854b(null));

    /* renamed from: n, reason: collision with root package name */
    private final Callable<Void> f39774n = new a();

    class a implements Callable<Void> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (b.this) {
                try {
                    if (b.this.f39769i == null) {
                        return null;
                    }
                    b.this.e0();
                    if (b.this.H()) {
                        b.this.T();
                        b.this.f39771k = 0;
                    }
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: V6.b$b, reason: collision with other inner class name */
    private static final class ThreadFactoryC0854b implements ThreadFactory {
        private ThreadFactoryC0854b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        /* synthetic */ ThreadFactoryC0854b(a aVar) {
            this();
        }
    }

    public final class c {

        /* renamed from: a, reason: collision with root package name */
        private final d f39776a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean[] f39777b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f39778c;

        /* synthetic */ c(b bVar, d dVar, a aVar) {
            this(dVar);
        }

        private c(d dVar) {
            this.f39776a = dVar;
            this.f39777b = dVar.f39784e ? null : new boolean[b.this.f39767g];
        }

        public void a() throws IOException {
            b.this.p(this, false);
        }

        public void b() {
            if (this.f39778c) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public void e() throws IOException {
            b.this.p(this, true);
            this.f39778c = true;
        }

        public File f(int i10) throws IOException {
            File fileK;
            synchronized (b.this) {
                try {
                    if (this.f39776a.f39785f != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f39776a.f39784e) {
                        this.f39777b[i10] = true;
                    }
                    fileK = this.f39776a.k(i10);
                    b.this.f39761a.mkdirs();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return fileK;
        }
    }

    private final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f39780a;

        /* renamed from: b, reason: collision with root package name */
        private final long[] f39781b;

        /* renamed from: c, reason: collision with root package name */
        File[] f39782c;

        /* renamed from: d, reason: collision with root package name */
        File[] f39783d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f39784e;

        /* renamed from: f, reason: collision with root package name */
        private c f39785f;

        /* renamed from: g, reason: collision with root package name */
        private long f39786g;

        /* synthetic */ d(b bVar, String str, a aVar) {
            this(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(String[] strArr) throws IOException {
            if (strArr.length != b.this.f39767g) {
                throw m(strArr);
            }
            for (int i10 = 0; i10 < strArr.length; i10++) {
                try {
                    this.f39781b[i10] = Long.parseLong(strArr[i10]);
                } catch (NumberFormatException unused) {
                    throw m(strArr);
                }
            }
        }

        private d(String str) {
            this.f39780a = str;
            this.f39781b = new long[b.this.f39767g];
            this.f39782c = new File[b.this.f39767g];
            this.f39783d = new File[b.this.f39767g];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i10 = 0; i10 < b.this.f39767g; i10++) {
                sb2.append(i10);
                this.f39782c[i10] = new File(b.this.f39761a, sb2.toString());
                sb2.append(".tmp");
                this.f39783d[i10] = new File(b.this.f39761a, sb2.toString());
                sb2.setLength(length);
            }
        }

        private IOException m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public File j(int i10) {
            return this.f39782c[i10];
        }

        public File k(int i10) {
            return this.f39783d[i10];
        }

        public String l() throws IOException {
            StringBuilder sb2 = new StringBuilder();
            for (long j10 : this.f39781b) {
                sb2.append(' ');
                sb2.append(j10);
            }
            return sb2.toString();
        }
    }

    public final class e {

        /* renamed from: a, reason: collision with root package name */
        private final String f39788a;

        /* renamed from: b, reason: collision with root package name */
        private final long f39789b;

        /* renamed from: c, reason: collision with root package name */
        private final long[] f39790c;

        /* renamed from: d, reason: collision with root package name */
        private final File[] f39791d;

        /* synthetic */ e(b bVar, String str, long j10, File[] fileArr, long[] jArr, a aVar) {
            this(str, j10, fileArr, jArr);
        }

        private e(String str, long j10, File[] fileArr, long[] jArr) {
            this.f39788a = str;
            this.f39789b = j10;
            this.f39791d = fileArr;
            this.f39790c = jArr;
        }

        public File a(int i10) {
            return this.f39791d[i10];
        }
    }

    private synchronized c A(String str, long j10) throws IOException {
        l();
        d dVar = this.f39770j.get(str);
        a aVar = null;
        if (j10 != -1 && (dVar == null || dVar.f39786g != j10)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, aVar);
            this.f39770j.put(str, dVar);
        } else if (dVar.f39785f != null) {
            return null;
        }
        c cVar = new c(this, dVar, aVar);
        dVar.f39785f = cVar;
        this.f39769i.append((CharSequence) "DIRTY");
        this.f39769i.append(' ');
        this.f39769i.append((CharSequence) str);
        this.f39769i.append('\n');
        B(this.f39769i);
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void T() throws IOException {
        try {
            Writer writer = this.f39769i;
            if (writer != null) {
                m(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f39763c), V6.d.f39799a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f39765e));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f39767g));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (d dVar : this.f39770j.values()) {
                    if (dVar.f39785f != null) {
                        bufferedWriter.write("DIRTY " + dVar.f39780a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + dVar.f39780a + dVar.l() + '\n');
                    }
                }
                m(bufferedWriter);
                if (this.f39762b.exists()) {
                    b0(this.f39762b, this.f39764d, true);
                }
                b0(this.f39763c, this.f39762b, false);
                this.f39764d.delete();
                this.f39769i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f39762b, true), V6.d.f39799a));
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
        d dVar = cVar.f39776a;
        if (dVar.f39785f != cVar) {
            throw new IllegalStateException();
        }
        if (z10 && !dVar.f39784e) {
            for (int i10 = 0; i10 < this.f39767g; i10++) {
                if (!cVar.f39777b[i10]) {
                    cVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                }
                if (!dVar.k(i10).exists()) {
                    cVar.a();
                    return;
                }
            }
        }
        for (int i11 = 0; i11 < this.f39767g; i11++) {
            File fileK = dVar.k(i11);
            if (!z10) {
                w(fileK);
            } else if (fileK.exists()) {
                File fileJ = dVar.j(i11);
                fileK.renameTo(fileJ);
                long j10 = dVar.f39781b[i11];
                long length = fileJ.length();
                dVar.f39781b[i11] = length;
                this.f39768h = (this.f39768h - j10) + length;
            }
        }
        this.f39771k++;
        dVar.f39785f = null;
        if (dVar.f39784e || z10) {
            dVar.f39784e = true;
            this.f39769i.append((CharSequence) "CLEAN");
            this.f39769i.append(' ');
            this.f39769i.append((CharSequence) dVar.f39780a);
            this.f39769i.append((CharSequence) dVar.l());
            this.f39769i.append('\n');
            if (z10) {
                long j11 = this.f39772l;
                this.f39772l = 1 + j11;
                dVar.f39786g = j11;
            }
        } else {
            this.f39770j.remove(dVar.f39780a);
            this.f39769i.append((CharSequence) "REMOVE");
            this.f39769i.append(' ');
            this.f39769i.append((CharSequence) dVar.f39780a);
            this.f39769i.append('\n');
        }
        B(this.f39769i);
        if (this.f39768h > this.f39766f || H()) {
            this.f39773m.submit(this.f39774n);
        }
    }

    public synchronized e D(String str) throws IOException {
        Throwable th2;
        try {
            try {
                l();
                d dVar = this.f39770j.get(str);
                if (dVar == null) {
                    return null;
                }
                if (!dVar.f39784e) {
                    return null;
                }
                for (File file : dVar.f39782c) {
                    try {
                        if (!file.exists()) {
                            return null;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                this.f39771k++;
                this.f39769i.append((CharSequence) "READ");
                this.f39769i.append(' ');
                this.f39769i.append((CharSequence) str);
                this.f39769i.append('\n');
                if (H()) {
                    this.f39773m.submit(this.f39774n);
                }
                return new e(this, str, dVar.f39786g, dVar.f39782c, dVar.f39781b, null);
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

    public synchronized boolean Y(String str) throws IOException {
        try {
            l();
            d dVar = this.f39770j.get(str);
            if (dVar != null && dVar.f39785f == null) {
                for (int i10 = 0; i10 < this.f39767g; i10++) {
                    File fileJ = dVar.j(i10);
                    if (fileJ.exists() && !fileJ.delete()) {
                        throw new IOException("failed to delete " + fileJ);
                    }
                    this.f39768h -= dVar.f39781b[i10];
                    dVar.f39781b[i10] = 0;
                }
                this.f39771k++;
                this.f39769i.append((CharSequence) "REMOVE");
                this.f39769i.append(' ');
                this.f39769i.append((CharSequence) str);
                this.f39769i.append('\n');
                this.f39770j.remove(str);
                if (H()) {
                    this.f39773m.submit(this.f39774n);
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
            if (this.f39769i == null) {
                return;
            }
            Iterator it = new ArrayList(this.f39770j.values()).iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar.f39785f != null) {
                    dVar.f39785f.a();
                }
            }
            e0();
            m(this.f39769i);
            this.f39769i = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private b(File file, int i10, int i11, long j10) {
        this.f39761a = file;
        this.f39765e = i10;
        this.f39762b = new File(file, "journal");
        this.f39763c = new File(file, "journal.tmp");
        this.f39764d = new File(file, "journal.bkp");
        this.f39767g = i11;
        this.f39766f = j10;
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
        int i10 = this.f39771k;
        return i10 >= 2000 && i10 >= this.f39770j.size();
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
                b0(file2, file3, false);
            }
        }
        b bVar = new b(file, i10, i11, j10);
        if (bVar.f39762b.exists()) {
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
        w(this.f39763c);
        Iterator<d> it = this.f39770j.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i10 = 0;
            if (next.f39785f == null) {
                while (i10 < this.f39767g) {
                    this.f39768h += next.f39781b[i10];
                    i10++;
                }
            } else {
                next.f39785f = null;
                while (i10 < this.f39767g) {
                    w(next.j(i10));
                    w(next.k(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    private void O() throws IOException {
        V6.c cVar = new V6.c(new FileInputStream(this.f39762b), V6.d.f39799a);
        try {
            String strD = cVar.d();
            String strD2 = cVar.d();
            String strD3 = cVar.d();
            String strD4 = cVar.d();
            String strD5 = cVar.d();
            if (!"libcore.io.DiskLruCache".equals(strD) || !"1".equals(strD2) || !Integer.toString(this.f39765e).equals(strD3) || !Integer.toString(this.f39767g).equals(strD4) || !"".equals(strD5)) {
                throw new IOException("unexpected journal header: [" + strD + ", " + strD2 + ", " + strD4 + ", " + strD5 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    R(cVar.d());
                    i10++;
                } catch (EOFException unused) {
                    this.f39771k = i10 - this.f39770j.size();
                    if (cVar.c()) {
                        T();
                    } else {
                        this.f39769i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f39762b, true), V6.d.f39799a));
                    }
                    V6.d.a(cVar);
                    return;
                }
            }
        } catch (Throwable th2) {
            V6.d.a(cVar);
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
                this.f39770j.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf2);
        }
        d dVar = this.f39770j.get(strSubstring);
        a aVar = null;
        if (dVar == null) {
            dVar = new d(this, strSubstring, aVar);
            this.f39770j.put(strSubstring, dVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            dVar.f39784e = true;
            dVar.f39785f = null;
            dVar.n(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f39785f = new c(this, dVar, aVar);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    private static void b0(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            w(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0() throws IOException {
        while (this.f39768h > this.f39766f) {
            Y(this.f39770j.entrySet().iterator().next().getKey());
        }
    }

    private void l() {
        if (this.f39769i == null) {
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
        V6.d.b(this.f39761a);
    }
}
