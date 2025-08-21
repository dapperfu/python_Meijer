package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.f;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final AssetManager f58012a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f58013b;

    /* renamed from: c, reason: collision with root package name */
    private final f.c f58014c;

    /* renamed from: e, reason: collision with root package name */
    private final File f58016e;

    /* renamed from: f, reason: collision with root package name */
    private final String f58017f;

    /* renamed from: g, reason: collision with root package name */
    private final String f58018g;

    /* renamed from: h, reason: collision with root package name */
    private final String f58019h;

    /* renamed from: j, reason: collision with root package name */
    private c[] f58021j;

    /* renamed from: k, reason: collision with root package name */
    private byte[] f58022k;

    /* renamed from: i, reason: collision with root package name */
    private boolean f58020i = false;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f58015d = d();

    private b b(c[] cVarArr, byte[] bArr) throws IOException {
        InputStream inputStreamG;
        try {
            inputStreamG = g(this.f58012a, this.f58019h);
        } catch (FileNotFoundException e10) {
            this.f58014c.a(9, e10);
        } catch (IOException e11) {
            this.f58014c.a(7, e11);
        } catch (IllegalStateException e12) {
            this.f58021j = null;
            this.f58014c.a(8, e12);
        }
        if (inputStreamG == null) {
            if (inputStreamG != null) {
                inputStreamG.close();
            }
            return null;
        }
        try {
            this.f58021j = g.r(inputStreamG, g.p(inputStreamG, g.f58042b), bArr, cVarArr);
            inputStreamG.close();
            return this;
        } catch (Throwable th2) {
            try {
                inputStreamG.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private c[] i(InputStream inputStream) throws IOException {
        try {
            try {
                try {
                    c[] cVarArrX = g.x(inputStream, g.p(inputStream, g.f58041a), this.f58017f);
                    try {
                        inputStream.close();
                        return cVarArrX;
                    } catch (IOException e10) {
                        this.f58014c.a(7, e10);
                        return cVarArrX;
                    }
                } catch (IllegalStateException e11) {
                    this.f58014c.a(8, e11);
                    return null;
                }
            } catch (IOException e12) {
                this.f58014c.a(7, e12);
                return null;
            }
        } finally {
            try {
                inputStream.close();
            } catch (IOException e13) {
                this.f58014c.a(7, e13);
            }
        }
    }

    private void c() {
        if (!this.f58020i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    private static byte[] d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            return i.f58054a;
        }
        switch (i10) {
            case 24:
            case 25:
                return i.f58058e;
            case 26:
                return i.f58057d;
            case 27:
                return i.f58056c;
            case 28:
            case 29:
            case 30:
                return i.f58055b;
            default:
                return null;
        }
    }

    private InputStream f(AssetManager assetManager) {
        try {
            return g(assetManager, this.f58018g);
        } catch (FileNotFoundException e10) {
            this.f58014c.a(6, e10);
            return null;
        } catch (IOException e11) {
            this.f58014c.a(7, e11);
            return null;
        }
    }

    private static boolean j() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 31 || i10 == 24 || i10 == 25;
    }

    private void k(final int i10, final Object obj) {
        this.f58013b.execute(new Runnable() { // from class: p4.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f156152a.f58014c.a(i10, obj);
            }
        });
    }

    public boolean e() {
        if (this.f58015d == null) {
            k(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f58016e.exists()) {
            try {
                if (!this.f58016e.createNewFile()) {
                    k(4, null);
                    return false;
                }
            } catch (IOException unused) {
                k(4, null);
                return false;
            }
        } else if (!this.f58016e.canWrite()) {
            k(4, null);
            return false;
        }
        this.f58020i = true;
        return true;
    }

    public b l() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        c[] cVarArr = this.f58021j;
        byte[] bArr = this.f58015d;
        if (cVarArr != null && bArr != null) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    g.F(byteArrayOutputStream, bArr);
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException e10) {
                this.f58014c.a(7, e10);
            } catch (IllegalStateException e11) {
                this.f58014c.a(8, e11);
            }
            if (!g.C(byteArrayOutputStream, bArr, cVarArr)) {
                this.f58014c.a(5, null);
                this.f58021j = null;
                byteArrayOutputStream.close();
                return this;
            }
            this.f58022k = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.f58021j = null;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean m() {
        byte[] bArr = this.f58022k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f58016e);
                    try {
                        FileChannel channel = fileOutputStream.getChannel();
                        try {
                            FileLock fileLockTryLock = channel.tryLock();
                            try {
                                d.l(byteArrayInputStream, fileOutputStream, fileLockTryLock);
                                k(1, null);
                                if (fileLockTryLock != null) {
                                    fileLockTryLock.close();
                                }
                                channel.close();
                                fileOutputStream.close();
                                byteArrayInputStream.close();
                                return true;
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (FileNotFoundException e10) {
                k(6, e10);
                return false;
            } catch (IOException e11) {
                k(7, e11);
                return false;
            }
        } finally {
            this.f58022k = null;
            this.f58021j = null;
        }
    }

    public b(AssetManager assetManager, Executor executor, f.c cVar, String str, String str2, String str3, File file) {
        this.f58012a = assetManager;
        this.f58013b = executor;
        this.f58014c = cVar;
        this.f58017f = str;
        this.f58018g = str2;
        this.f58019h = str3;
        this.f58016e = file;
    }

    private InputStream g(AssetManager assetManager, String str) throws IOException {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f58014c.b(5, null);
            }
            return null;
        }
    }

    public b h() {
        b bVarB;
        c();
        if (this.f58015d != null) {
            InputStream inputStreamF = f(this.f58012a);
            if (inputStreamF != null) {
                this.f58021j = i(inputStreamF);
            }
            c[] cVarArr = this.f58021j;
            if (cVarArr != null && j() && (bVarB = b(cVarArr, this.f58015d)) != null) {
                return bVarB;
            }
        }
        return this;
    }
}
