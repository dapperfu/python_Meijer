package lf;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;

/* renamed from: lf.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C15487a {

    /* renamed from: a, reason: collision with root package name */
    public static final BigInteger f149589a;

    /* renamed from: b, reason: collision with root package name */
    public static final BigInteger f149590b;

    /* renamed from: c, reason: collision with root package name */
    public static final BigInteger f149591c;

    /* renamed from: d, reason: collision with root package name */
    public static final BigInteger f149592d;

    /* renamed from: e, reason: collision with root package name */
    public static final BigInteger f149593e;

    /* renamed from: f, reason: collision with root package name */
    public static final BigInteger f149594f;

    /* renamed from: g, reason: collision with root package name */
    public static final BigInteger f149595g;

    /* renamed from: h, reason: collision with root package name */
    public static final BigInteger f149596h;

    /* renamed from: i, reason: collision with root package name */
    public static final File[] f149597i;

    public static FileOutputStream c(File file) throws IOException {
        return d(file, false);
    }

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1024L);
        f149589a = bigIntegerValueOf;
        BigInteger bigIntegerMultiply = bigIntegerValueOf.multiply(bigIntegerValueOf);
        f149590b = bigIntegerMultiply;
        BigInteger bigIntegerMultiply2 = bigIntegerValueOf.multiply(bigIntegerMultiply);
        f149591c = bigIntegerMultiply2;
        BigInteger bigIntegerMultiply3 = bigIntegerValueOf.multiply(bigIntegerMultiply2);
        f149592d = bigIntegerMultiply3;
        BigInteger bigIntegerMultiply4 = bigIntegerValueOf.multiply(bigIntegerMultiply3);
        f149593e = bigIntegerMultiply4;
        f149594f = bigIntegerValueOf.multiply(bigIntegerMultiply4);
        BigInteger bigIntegerMultiply5 = BigInteger.valueOf(1024L).multiply(BigInteger.valueOf(1152921504606846976L));
        f149595g = bigIntegerMultiply5;
        f149596h = bigIntegerValueOf.multiply(bigIntegerMultiply5);
        f149597i = new File[0];
    }

    public static void a(InputStream inputStream, File file) throws IOException {
        try {
            b(inputStream, file);
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th4) {
                        th2.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
    }

    public static void b(InputStream inputStream, File file) throws IOException {
        try {
            FileOutputStream fileOutputStreamC = c(file);
            try {
                C15488b.a(inputStream, fileOutputStreamC);
                if (fileOutputStreamC != null) {
                    fileOutputStreamC.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            } finally {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th4) {
                        th2.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
    }

    public static FileOutputStream d(File file, boolean z10) throws IOException {
        if (file.exists()) {
            if (!file.isDirectory()) {
                if (!file.canWrite()) {
                    throw new IOException("File '" + file + "' cannot be written to");
                }
            } else {
                throw new IOException("File '" + file + "' exists but is a directory");
            }
        } else {
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
                throw new IOException("Directory '" + parentFile + "' could not be created");
            }
        }
        return new FileOutputStream(file, z10);
    }
}
