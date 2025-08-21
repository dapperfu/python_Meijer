package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.ads.p7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9162p7 implements H6 {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC9055o7 f78337c;

    /* renamed from: a, reason: collision with root package name */
    private final Map f78335a = new LinkedHashMap(16, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    private long f78336b = 0;

    /* renamed from: d, reason: collision with root package name */
    private final int f78338d = 5242880;

    public C9162p7(InterfaceC9055o7 interfaceC9055o7, int i10) {
        this.f78337c = interfaceC9055o7;
    }

    static void i(OutputStream outputStream, long j10) throws IOException {
        outputStream.write((byte) j10);
        outputStream.write((byte) (j10 >>> 8));
        outputStream.write((byte) (j10 >>> 16));
        outputStream.write((byte) (j10 >>> 24));
        outputStream.write((byte) (j10 >>> 32));
        outputStream.write((byte) (j10 >>> 40));
        outputStream.write((byte) (j10 >>> 48));
        outputStream.write((byte) (j10 >>> 56));
    }

    @Override // com.google.android.gms.internal.ads.H6
    public final synchronized void a(String str, boolean z10) {
        G6 g6Zza = zza(str);
        if (g6Zza != null) {
            g6Zza.f67939f = 0L;
            g6Zza.f67938e = 0L;
            b(str, g6Zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.H6
    public final synchronized void b(String str, G6 g62) {
        try {
            long j10 = this.f78336b;
            int length = g62.f67934a.length;
            long j11 = j10 + length;
            int i10 = this.f78338d;
            if (j11 <= i10 || length <= i10 * 0.9f) {
                File fileE = e(str);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileE));
                    C8841m7 c8841m7 = new C8841m7(str, g62);
                    try {
                        h(bufferedOutputStream, 538247942);
                        j(bufferedOutputStream, c8841m7.f77573b);
                        String str2 = c8841m7.f77574c;
                        if (str2 == null) {
                            str2 = "";
                        }
                        j(bufferedOutputStream, str2);
                        i(bufferedOutputStream, c8841m7.f77575d);
                        i(bufferedOutputStream, c8841m7.f77576e);
                        i(bufferedOutputStream, c8841m7.f77577f);
                        i(bufferedOutputStream, c8841m7.f77578g);
                        List<P6> list = c8841m7.f77579h;
                        if (list != null) {
                            h(bufferedOutputStream, list.size());
                            for (P6 p62 : list) {
                                j(bufferedOutputStream, p62.a());
                                j(bufferedOutputStream, p62.b());
                            }
                        } else {
                            h(bufferedOutputStream, 0);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(g62.f67934a);
                        bufferedOutputStream.close();
                        c8841m7.f77572a = fileE.length();
                        m(str, c8841m7);
                        if (this.f78336b >= this.f78338d) {
                            if (C7987e7.f74612b) {
                                C7987e7.d("Pruning old cache entries.", new Object[0]);
                            }
                            long j12 = this.f78336b;
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it = this.f78335a.entrySet().iterator();
                            int i11 = 0;
                            while (it.hasNext()) {
                                C8841m7 c8841m72 = (C8841m7) ((Map.Entry) it.next()).getValue();
                                if (e(c8841m72.f77573b).delete()) {
                                    this.f78336b -= c8841m72.f77572a;
                                } else {
                                    String str3 = c8841m72.f77573b;
                                    C7987e7.a("Could not delete cache entry for key=%s, filename=%s", str3, o(str3));
                                }
                                it.remove();
                                i11++;
                                if (this.f78336b < this.f78338d * 0.9f) {
                                    break;
                                }
                            }
                            if (C7987e7.f74612b) {
                                C7987e7.d("pruned %d files, %d bytes, %d ms", Integer.valueOf(i11), Long.valueOf(this.f78336b - j12), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                            }
                        }
                    } catch (IOException e10) {
                        C7987e7.a("%s", e10.toString());
                        bufferedOutputStream.close();
                        C7987e7.a("Failed to write header for %s", fileE.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused) {
                    if (!fileE.delete()) {
                        C7987e7.a("Could not clean up file %s", fileE.getAbsolutePath());
                    }
                    if (!this.f78337c.zza().exists()) {
                        C7987e7.a("Re-initializing cache after external clearing.", new Object[0]);
                        this.f78335a.clear();
                        this.f78336b = 0L;
                        zzb();
                    }
                }
            }
        } finally {
        }
    }

    public final synchronized void g(String str) {
        boolean zDelete = e(str).delete();
        n(str);
        if (zDelete) {
            return;
        }
        C7987e7.a("Could not delete cache entry for key=%s, filename=%s", str, o(str));
    }

    @Override // com.google.android.gms.internal.ads.H6
    public final synchronized G6 zza(String str) {
        C8841m7 c8841m7 = (C8841m7) this.f78335a.get(str);
        if (c8841m7 == null) {
            return null;
        }
        File fileE = e(str);
        try {
            C8948n7 c8948n7 = new C8948n7(new BufferedInputStream(new FileInputStream(fileE)), fileE.length());
            try {
                C8841m7 c8841m7A = C8841m7.a(c8948n7);
                if (!TextUtils.equals(str, c8841m7A.f77573b)) {
                    C7987e7.a("%s: key=%s, found=%s", fileE.getAbsolutePath(), str, c8841m7A.f77573b);
                    n(str);
                    return null;
                }
                byte[] bArrK = k(c8948n7, c8948n7.a());
                G6 g62 = new G6();
                g62.f67934a = bArrK;
                g62.f67935b = c8841m7.f77574c;
                g62.f67936c = c8841m7.f77575d;
                g62.f67937d = c8841m7.f77576e;
                g62.f67938e = c8841m7.f77577f;
                g62.f67939f = c8841m7.f77578g;
                List<P6> list = c8841m7.f77579h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (P6 p62 : list) {
                    treeMap.put(p62.a(), p62.b());
                }
                g62.f67940g = treeMap;
                g62.f67941h = Collections.unmodifiableList(c8841m7.f77579h);
                return g62;
            } finally {
                c8948n7.close();
            }
        } catch (IOException e10) {
            C7987e7.a("%s: %s", fileE.getAbsolutePath(), e10.toString());
            g(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.H6
    public final synchronized void zzb() {
        File fileZza = this.f78337c.zza();
        if (fileZza.exists()) {
            File[] fileArrListFiles = fileZza.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    try {
                        long length = file.length();
                        C8948n7 c8948n7 = new C8948n7(new BufferedInputStream(new FileInputStream(file)), length);
                        try {
                            C8841m7 c8841m7A = C8841m7.a(c8948n7);
                            c8841m7A.f77572a = length;
                            m(c8841m7A.f77573b, c8841m7A);
                            c8948n7.close();
                        } catch (Throwable th2) {
                            c8948n7.close();
                            throw th2;
                        }
                    } catch (IOException unused) {
                        file.delete();
                    }
                }
            }
        } else if (!fileZza.mkdirs()) {
            C7987e7.b("Unable to create cache dir %s", fileZza.getAbsolutePath());
        }
    }

    public C9162p7(File file, int i10) {
        this.f78337c = new C8734l7(this, file);
    }

    static void h(OutputStream outputStream, int i10) throws IOException {
        outputStream.write(i10 & com.medallia.digital.mobilesdk.l3.f93323c);
        outputStream.write((i10 >> 8) & com.medallia.digital.mobilesdk.l3.f93323c);
        outputStream.write((i10 >> 16) & com.medallia.digital.mobilesdk.l3.f93323c);
        outputStream.write((i10 >> 24) & com.medallia.digital.mobilesdk.l3.f93323c);
    }

    static void j(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        i(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    static byte[] k(C8948n7 c8948n7, long j10) throws IOException {
        long jA = c8948n7.a();
        if (j10 >= 0 && j10 <= jA) {
            int i10 = (int) j10;
            if (i10 == j10) {
                byte[] bArr = new byte[i10];
                new DataInputStream(c8948n7).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j10 + ", maxLength=" + jA);
    }

    private final void m(String str, C8841m7 c8841m7) {
        if (this.f78335a.containsKey(str)) {
            this.f78336b += c8841m7.f77572a - ((C8841m7) this.f78335a.get(str)).f77572a;
        } else {
            this.f78336b += c8841m7.f77572a;
        }
        this.f78335a.put(str, c8841m7);
    }

    private final void n(String str) {
        C8841m7 c8841m7 = (C8841m7) this.f78335a.remove(str);
        if (c8841m7 != null) {
            this.f78336b -= c8841m7.f77572a;
        }
    }

    public final File e(String str) {
        return new File(this.f78337c.zza(), o(str));
    }

    static int c(InputStream inputStream) throws IOException {
        return (l(inputStream) << 24) | l(inputStream) | (l(inputStream) << 8) | (l(inputStream) << 16);
    }

    static long d(InputStream inputStream) throws IOException {
        return (l(inputStream) & 255) | ((l(inputStream) & 255) << 8) | ((l(inputStream) & 255) << 16) | ((l(inputStream) & 255) << 24) | ((l(inputStream) & 255) << 32) | ((l(inputStream) & 255) << 40) | ((l(inputStream) & 255) << 48) | ((l(inputStream) & 255) << 56);
    }

    static String f(C8948n7 c8948n7) throws IOException {
        return new String(k(c8948n7, d(c8948n7)), "UTF-8");
    }

    private static int l(InputStream inputStream) throws IOException {
        int i10 = inputStream.read();
        if (i10 != -1) {
            return i10;
        }
        throw new EOFException();
    }

    private static final String o(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }
}
