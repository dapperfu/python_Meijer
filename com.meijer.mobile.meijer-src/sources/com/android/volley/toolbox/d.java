package com.android.volley.toolbox;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.volley.a;
import com.medallia.digital.mobilesdk.l3;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class d implements com.android.volley.a {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, a> f63803a;

    /* renamed from: b, reason: collision with root package name */
    private long f63804b;

    /* renamed from: c, reason: collision with root package name */
    private final c f63805c;

    /* renamed from: d, reason: collision with root package name */
    private final int f63806d;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        long f63807a;

        /* renamed from: b, reason: collision with root package name */
        final String f63808b;

        /* renamed from: c, reason: collision with root package name */
        final String f63809c;

        /* renamed from: d, reason: collision with root package name */
        final long f63810d;

        /* renamed from: e, reason: collision with root package name */
        final long f63811e;

        /* renamed from: f, reason: collision with root package name */
        final long f63812f;

        /* renamed from: g, reason: collision with root package name */
        final long f63813g;

        /* renamed from: h, reason: collision with root package name */
        final List<com.android.volley.e> f63814h;

        private a(String str, String str2, long j10, long j11, long j12, long j13, List<com.android.volley.e> list) {
            this.f63808b = str;
            this.f63809c = "".equals(str2) ? null : str2;
            this.f63810d = j10;
            this.f63811e = j11;
            this.f63812f = j12;
            this.f63813g = j13;
            this.f63814h = list;
        }

        private static List<com.android.volley.e> a(a.C1250a c1250a) {
            List<com.android.volley.e> list = c1250a.f63725h;
            return list != null ? list : e.h(c1250a.f63724g);
        }

        a.C1250a c(byte[] bArr) {
            a.C1250a c1250a = new a.C1250a();
            c1250a.f63718a = bArr;
            c1250a.f63719b = this.f63809c;
            c1250a.f63720c = this.f63810d;
            c1250a.f63721d = this.f63811e;
            c1250a.f63722e = this.f63812f;
            c1250a.f63723f = this.f63813g;
            c1250a.f63724g = e.i(this.f63814h);
            c1250a.f63725h = Collections.unmodifiableList(this.f63814h);
            return c1250a;
        }

        static a b(b bVar) throws IOException {
            if (d.n(bVar) == 538247942) {
                return new a(d.p(bVar), d.p(bVar), d.o(bVar), d.o(bVar), d.o(bVar), d.o(bVar), d.m(bVar));
            }
            throw new IOException();
        }

        boolean d(OutputStream outputStream) throws IOException {
            try {
                d.u(outputStream, 538247942);
                d.w(outputStream, this.f63808b);
                String str = this.f63809c;
                if (str == null) {
                    str = "";
                }
                d.w(outputStream, str);
                d.v(outputStream, this.f63810d);
                d.v(outputStream, this.f63811e);
                d.v(outputStream, this.f63812f);
                d.v(outputStream, this.f63813g);
                d.t(this.f63814h, outputStream);
                outputStream.flush();
                return true;
            } catch (IOException e10) {
                com.android.volley.n.b("%s", e10.toString());
                return false;
            }
        }

        a(String str, a.C1250a c1250a) {
            this(str, c1250a.f63719b, c1250a.f63720c, c1250a.f63721d, c1250a.f63722e, c1250a.f63723f, a(c1250a));
        }
    }

    static class b extends FilterInputStream implements InputStreamRetargetInterface {

        /* renamed from: a, reason: collision with root package name */
        private final long f63815a;

        /* renamed from: b, reason: collision with root package name */
        private long f63816b;

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int i10 = super.read();
            if (i10 != -1) {
                this.f63816b++;
            }
            return i10;
        }

        @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
        public /* synthetic */ long transferTo(OutputStream outputStream) {
            return DesugarInputStream.transferTo(this, outputStream);
        }

        long a() {
            return this.f63815a - this.f63816b;
        }

        b(InputStream inputStream, long j10) {
            super(inputStream);
            this.f63815a = j10;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = super.read(bArr, i10, i11);
            if (i12 != -1) {
                this.f63816b += i12;
            }
            return i12;
        }
    }

    public interface c {
        File get();
    }

    public d(c cVar, int i10) {
        this.f63803a = new LinkedHashMap(16, 0.75f, true);
        this.f63804b = 0L;
        this.f63805c = cVar;
        this.f63806d = i10;
    }

    static void v(OutputStream outputStream, long j10) throws IOException {
        outputStream.write((byte) j10);
        outputStream.write((byte) (j10 >>> 8));
        outputStream.write((byte) (j10 >>> 16));
        outputStream.write((byte) (j10 >>> 24));
        outputStream.write((byte) (j10 >>> 32));
        outputStream.write((byte) (j10 >>> 40));
        outputStream.write((byte) (j10 >>> 48));
        outputStream.write((byte) (j10 >>> 56));
    }

    @Override // com.android.volley.a
    public synchronized a.C1250a a(String str) {
        a aVar = this.f63803a.get(str);
        if (aVar == null) {
            return null;
        }
        File fileG = g(str);
        try {
            b bVar = new b(new BufferedInputStream(e(fileG)), fileG.length());
            try {
                a aVarB = a.b(bVar);
                if (TextUtils.equals(str, aVarB.f63808b)) {
                    return aVar.c(s(bVar, bVar.a()));
                }
                com.android.volley.n.b("%s: key=%s, found=%s", fileG.getAbsolutePath(), str, aVarB.f63808b);
                r(str);
                return null;
            } finally {
                bVar.close();
            }
        } catch (IOException e10) {
            com.android.volley.n.b("%s: %s", fileG.getAbsolutePath(), e10.toString());
            q(str);
            return null;
        }
    }

    @Override // com.android.volley.a
    public synchronized void b() {
        long length;
        b bVar;
        File file = this.f63805c.get();
        if (!file.exists()) {
            if (!file.mkdirs()) {
                com.android.volley.n.c("Unable to create cache dir %s", file.getAbsolutePath());
            }
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            try {
                length = file2.length();
                bVar = new b(new BufferedInputStream(e(file2)), length);
            } catch (IOException unused) {
                file2.delete();
            }
            try {
                a aVarB = a.b(bVar);
                aVarB.f63807a = length;
                k(aVarB.f63808b, aVarB);
                bVar.close();
            } catch (Throwable th2) {
                bVar.close();
                throw th2;
            }
        }
    }

    @Override // com.android.volley.a
    public synchronized void c(String str, boolean z10) {
        try {
            a.C1250a c1250aA = a(str);
            if (c1250aA != null) {
                c1250aA.f63723f = 0L;
                if (z10) {
                    c1250aA.f63722e = 0L;
                }
                d(str, c1250aA);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.android.volley.a
    public synchronized void d(String str, a.C1250a c1250a) {
        BufferedOutputStream bufferedOutputStream;
        a aVar;
        long j10 = this.f63804b;
        byte[] bArr = c1250a.f63718a;
        long length = j10 + bArr.length;
        int i10 = this.f63806d;
        if (length <= i10 || bArr.length <= i10 * 0.9f) {
            File fileG = g(str);
            try {
                bufferedOutputStream = new BufferedOutputStream(f(fileG));
                aVar = new a(str, c1250a);
            } catch (IOException unused) {
                if (!fileG.delete()) {
                    com.android.volley.n.b("Could not clean up file %s", fileG.getAbsolutePath());
                }
                i();
            }
            if (!aVar.d(bufferedOutputStream)) {
                bufferedOutputStream.close();
                com.android.volley.n.b("Failed to write header for %s", fileG.getAbsolutePath());
                throw new IOException();
            }
            bufferedOutputStream.write(c1250a.f63718a);
            bufferedOutputStream.close();
            aVar.f63807a = fileG.length();
            k(str, aVar);
            j();
        }
    }

    public synchronized void q(String str) {
        boolean zDelete = g(str).delete();
        r(str);
        if (!zDelete) {
            com.android.volley.n.b("Could not delete cache entry for key=%s, filename=%s", str, h(str));
        }
    }

    private void i() {
        if (this.f63805c.get().exists()) {
            return;
        }
        com.android.volley.n.b("Re-initializing cache after external clearing.", new Object[0]);
        this.f63803a.clear();
        this.f63804b = 0L;
        b();
    }

    private void j() {
        if (this.f63804b < this.f63806d) {
            return;
        }
        int i10 = 0;
        if (com.android.volley.n.f63782b) {
            com.android.volley.n.e("Pruning old cache entries.", new Object[0]);
        }
        long j10 = this.f63804b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Iterator<Map.Entry<String, a>> it = this.f63803a.entrySet().iterator();
        while (it.hasNext()) {
            a value = it.next().getValue();
            if (g(value.f63808b).delete()) {
                this.f63804b -= value.f63807a;
            } else {
                String str = value.f63808b;
                com.android.volley.n.b("Could not delete cache entry for key=%s, filename=%s", str, h(str));
            }
            it.remove();
            i10++;
            if (this.f63804b < this.f63806d * 0.9f) {
                break;
            }
        }
        if (com.android.volley.n.f63782b) {
            com.android.volley.n.e("pruned %d files, %d bytes, %d ms", Integer.valueOf(i10), Long.valueOf(this.f63804b - j10), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
        }
    }

    private void k(String str, a aVar) {
        if (this.f63803a.containsKey(str)) {
            this.f63804b += aVar.f63807a - this.f63803a.get(str).f63807a;
        } else {
            this.f63804b += aVar.f63807a;
        }
        this.f63803a.put(str, aVar);
    }

    private void r(String str) {
        a aVarRemove = this.f63803a.remove(str);
        if (aVarRemove != null) {
            this.f63804b -= aVarRemove.f63807a;
        }
    }

    static void t(List<com.android.volley.e> list, OutputStream outputStream) throws IOException {
        if (list == null) {
            u(outputStream, 0);
            return;
        }
        u(outputStream, list.size());
        for (com.android.volley.e eVar : list) {
            w(outputStream, eVar.a());
            w(outputStream, eVar.b());
        }
    }

    static void u(OutputStream outputStream, int i10) throws IOException {
        outputStream.write(i10 & l3.f93323c);
        outputStream.write((i10 >> 8) & l3.f93323c);
        outputStream.write((i10 >> 16) & l3.f93323c);
        outputStream.write((i10 >> 24) & l3.f93323c);
    }

    static void w(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        v(outputStream, bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    InputStream e(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    OutputStream f(File file) throws FileNotFoundException {
        return new FileOutputStream(file);
    }

    public File g(String str) {
        return new File(this.f63805c.get(), h(str));
    }

    private String h(String str) {
        int length = str.length() / 2;
        return String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode());
    }

    private static int l(InputStream inputStream) throws IOException {
        int i10 = inputStream.read();
        if (i10 != -1) {
            return i10;
        }
        throw new EOFException();
    }

    static List<com.android.volley.e> m(b bVar) throws IOException {
        List<com.android.volley.e> arrayList;
        int iN = n(bVar);
        if (iN >= 0) {
            if (iN == 0) {
                arrayList = Collections.EMPTY_LIST;
            } else {
                arrayList = new ArrayList<>();
            }
            for (int i10 = 0; i10 < iN; i10++) {
                arrayList.add(new com.android.volley.e(p(bVar).intern(), p(bVar).intern()));
            }
            return arrayList;
        }
        throw new IOException("readHeaderList size=" + iN);
    }

    static int n(InputStream inputStream) throws IOException {
        return (l(inputStream) << 24) | l(inputStream) | (l(inputStream) << 8) | (l(inputStream) << 16);
    }

    static long o(InputStream inputStream) throws IOException {
        return (l(inputStream) & 255) | ((l(inputStream) & 255) << 8) | ((l(inputStream) & 255) << 16) | ((l(inputStream) & 255) << 24) | ((l(inputStream) & 255) << 32) | ((l(inputStream) & 255) << 40) | ((l(inputStream) & 255) << 48) | ((255 & l(inputStream)) << 56);
    }

    static String p(b bVar) throws IOException {
        return new String(s(bVar, o(bVar)), "UTF-8");
    }

    static byte[] s(b bVar, long j10) throws IOException {
        long jA = bVar.a();
        if (j10 >= 0 && j10 <= jA) {
            int i10 = (int) j10;
            if (i10 == j10) {
                byte[] bArr = new byte[i10];
                new DataInputStream(bVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j10 + ", maxLength=" + jA);
    }

    public d(c cVar) {
        this(cVar, 5242880);
    }
}
