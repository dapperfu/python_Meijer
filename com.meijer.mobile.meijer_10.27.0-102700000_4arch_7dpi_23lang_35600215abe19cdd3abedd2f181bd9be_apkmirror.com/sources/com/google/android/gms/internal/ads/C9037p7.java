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
public final class C9037p7 implements H6 {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC8930o7 f77497c;

    /* renamed from: a, reason: collision with root package name */
    private final Map f77495a = new LinkedHashMap(16, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    private long f77496b = 0;

    /* renamed from: d, reason: collision with root package name */
    private final int f77498d = 5242880;

    public C9037p7(InterfaceC8930o7 interfaceC8930o7, int i10) {
        this.f77497c = interfaceC8930o7;
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
            g6Zza.f67099f = 0L;
            g6Zza.f67098e = 0L;
            b(str, g6Zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.H6
    public final synchronized void b(String str, G6 g62) {
        try {
            long j10 = this.f77496b;
            int length = g62.f67094a.length;
            long j11 = j10 + length;
            int i10 = this.f77498d;
            if (j11 <= i10 || length <= i10 * 0.9f) {
                File fileE = e(str);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileE));
                    C8716m7 c8716m7 = new C8716m7(str, g62);
                    try {
                        h(bufferedOutputStream, 538247942);
                        j(bufferedOutputStream, c8716m7.f76733b);
                        String str2 = c8716m7.f76734c;
                        if (str2 == null) {
                            str2 = "";
                        }
                        j(bufferedOutputStream, str2);
                        i(bufferedOutputStream, c8716m7.f76735d);
                        i(bufferedOutputStream, c8716m7.f76736e);
                        i(bufferedOutputStream, c8716m7.f76737f);
                        i(bufferedOutputStream, c8716m7.f76738g);
                        List<P6> list = c8716m7.f76739h;
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
                        bufferedOutputStream.write(g62.f67094a);
                        bufferedOutputStream.close();
                        c8716m7.f76732a = fileE.length();
                        m(str, c8716m7);
                        if (this.f77496b >= this.f77498d) {
                            if (C7862e7.f73772b) {
                                C7862e7.d("Pruning old cache entries.", new Object[0]);
                            }
                            long j12 = this.f77496b;
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it = this.f77495a.entrySet().iterator();
                            int i11 = 0;
                            while (it.hasNext()) {
                                C8716m7 c8716m72 = (C8716m7) ((Map.Entry) it.next()).getValue();
                                if (e(c8716m72.f76733b).delete()) {
                                    this.f77496b -= c8716m72.f76732a;
                                } else {
                                    String str3 = c8716m72.f76733b;
                                    C7862e7.a("Could not delete cache entry for key=%s, filename=%s", str3, o(str3));
                                }
                                it.remove();
                                i11++;
                                if (this.f77496b < this.f77498d * 0.9f) {
                                    break;
                                }
                            }
                            if (C7862e7.f73772b) {
                                C7862e7.d("pruned %d files, %d bytes, %d ms", Integer.valueOf(i11), Long.valueOf(this.f77496b - j12), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                            }
                        }
                    } catch (IOException e10) {
                        C7862e7.a("%s", e10.toString());
                        bufferedOutputStream.close();
                        C7862e7.a("Failed to write header for %s", fileE.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused) {
                    if (!fileE.delete()) {
                        C7862e7.a("Could not clean up file %s", fileE.getAbsolutePath());
                    }
                    if (!this.f77497c.zza().exists()) {
                        C7862e7.a("Re-initializing cache after external clearing.", new Object[0]);
                        this.f77495a.clear();
                        this.f77496b = 0L;
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
        C7862e7.a("Could not delete cache entry for key=%s, filename=%s", str, o(str));
    }

    @Override // com.google.android.gms.internal.ads.H6
    public final synchronized G6 zza(String str) {
        C8716m7 c8716m7 = (C8716m7) this.f77495a.get(str);
        if (c8716m7 == null) {
            return null;
        }
        File fileE = e(str);
        try {
            C8823n7 c8823n7 = new C8823n7(new BufferedInputStream(new FileInputStream(fileE)), fileE.length());
            try {
                C8716m7 c8716m7A = C8716m7.a(c8823n7);
                if (!TextUtils.equals(str, c8716m7A.f76733b)) {
                    C7862e7.a("%s: key=%s, found=%s", fileE.getAbsolutePath(), str, c8716m7A.f76733b);
                    n(str);
                    return null;
                }
                byte[] bArrK = k(c8823n7, c8823n7.a());
                G6 g62 = new G6();
                g62.f67094a = bArrK;
                g62.f67095b = c8716m7.f76734c;
                g62.f67096c = c8716m7.f76735d;
                g62.f67097d = c8716m7.f76736e;
                g62.f67098e = c8716m7.f76737f;
                g62.f67099f = c8716m7.f76738g;
                List<P6> list = c8716m7.f76739h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (P6 p62 : list) {
                    treeMap.put(p62.a(), p62.b());
                }
                g62.f67100g = treeMap;
                g62.f67101h = Collections.unmodifiableList(c8716m7.f76739h);
                return g62;
            } finally {
                c8823n7.close();
            }
        } catch (IOException e10) {
            C7862e7.a("%s: %s", fileE.getAbsolutePath(), e10.toString());
            g(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.H6
    public final synchronized void zzb() {
        File fileZza = this.f77497c.zza();
        if (fileZza.exists()) {
            File[] fileArrListFiles = fileZza.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    try {
                        long length = file.length();
                        C8823n7 c8823n7 = new C8823n7(new BufferedInputStream(new FileInputStream(file)), length);
                        try {
                            C8716m7 c8716m7A = C8716m7.a(c8823n7);
                            c8716m7A.f76732a = length;
                            m(c8716m7A.f76733b, c8716m7A);
                            c8823n7.close();
                        } catch (Throwable th2) {
                            c8823n7.close();
                            throw th2;
                        }
                    } catch (IOException unused) {
                        file.delete();
                    }
                }
            }
        } else if (!fileZza.mkdirs()) {
            C7862e7.b("Unable to create cache dir %s", fileZza.getAbsolutePath());
        }
    }

    public C9037p7(File file, int i10) {
        this.f77497c = new C8609l7(this, file);
    }

    static void h(OutputStream outputStream, int i10) throws IOException {
        outputStream.write(i10 & com.medallia.digital.mobilesdk.l3.f92484c);
        outputStream.write((i10 >> 8) & com.medallia.digital.mobilesdk.l3.f92484c);
        outputStream.write((i10 >> 16) & com.medallia.digital.mobilesdk.l3.f92484c);
        outputStream.write((i10 >> 24) & com.medallia.digital.mobilesdk.l3.f92484c);
    }

    static void j(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        i(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    static byte[] k(C8823n7 c8823n7, long j10) throws IOException {
        long jA = c8823n7.a();
        if (j10 >= 0 && j10 <= jA) {
            int i10 = (int) j10;
            if (i10 == j10) {
                byte[] bArr = new byte[i10];
                new DataInputStream(c8823n7).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j10 + ", maxLength=" + jA);
    }

    private final void m(String str, C8716m7 c8716m7) {
        if (this.f77495a.containsKey(str)) {
            this.f77496b += c8716m7.f76732a - ((C8716m7) this.f77495a.get(str)).f76732a;
        } else {
            this.f77496b += c8716m7.f76732a;
        }
        this.f77495a.put(str, c8716m7);
    }

    private final void n(String str) {
        C8716m7 c8716m7 = (C8716m7) this.f77495a.remove(str);
        if (c8716m7 != null) {
            this.f77496b -= c8716m7.f76732a;
        }
    }

    public final File e(String str) {
        return new File(this.f77497c.zza(), o(str));
    }

    static int c(InputStream inputStream) throws IOException {
        return (l(inputStream) << 24) | l(inputStream) | (l(inputStream) << 8) | (l(inputStream) << 16);
    }

    static long d(InputStream inputStream) throws IOException {
        return (l(inputStream) & 255) | ((l(inputStream) & 255) << 8) | ((l(inputStream) & 255) << 16) | ((l(inputStream) & 255) << 24) | ((l(inputStream) & 255) << 32) | ((l(inputStream) & 255) << 40) | ((l(inputStream) & 255) << 48) | ((l(inputStream) & 255) << 56);
    }

    static String f(C8823n7 c8823n7) throws IOException {
        return new String(k(c8823n7, d(c8823n7)), "UTF-8");
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
