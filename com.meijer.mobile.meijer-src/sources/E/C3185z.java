package E;

import C.H;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import androidx.camera.core.ImageCaptureException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;
import java.util.UUID;

/* renamed from: E.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3185z implements O.A<a, H.h> {

    /* renamed from: E.z$a */
    static abstract class a {
        abstract H.g a();

        abstract O.B<byte[]> b();

        static a c(O.B<byte[]> b10, H.g gVar) {
            return new C3164d(b10, gVar);
        }

        a() {
        }
    }

    static Uri k(File file, H.g gVar) throws ImageCaptureException {
        Uri uriB = null;
        try {
            try {
                if (i(gVar)) {
                    uriB = c(file, gVar);
                } else if (j(gVar)) {
                    OutputStream outputStreamE = gVar.e();
                    Objects.requireNonNull(outputStreamE);
                    d(file, outputStreamE);
                } else if (h(gVar)) {
                    File fileC = gVar.c();
                    Objects.requireNonNull(fileC);
                    uriB = b(file, fileC);
                }
                file.delete();
                return uriB;
            } catch (IOException unused) {
                throw new ImageCaptureException(1, "Failed to write to OutputStream.", null);
            }
        } catch (Throwable th2) {
            file.delete();
            throw th2;
        }
    }

    private static void d(File file, OutputStream outputStream) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i10 = fileInputStream.read(bArr);
                if (i10 <= 0) {
                    fileInputStream.close();
                    return;
                }
                outputStream.write(bArr, 0, i10);
            }
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static void l(ContentValues contentValues, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("is_pending", Integer.valueOf(i10));
        }
    }

    private static void n(Uri uri, ContentResolver contentResolver, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentValues contentValues = new ContentValues();
            l(contentValues, i10);
            contentResolver.update(uri, contentValues, null, null);
        }
    }

    private static void o(File file, byte[] bArr) throws ImageCaptureException, IOException {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr, 0, new M.c().b(bArr));
                fileOutputStream.close();
            } finally {
            }
        } catch (IOException e10) {
            throw new ImageCaptureException(1, "Failed to write to temp file", e10);
        }
    }

    C3185z() {
    }

    private static Uri b(File file, File file2) throws ImageCaptureException {
        if (file2.exists()) {
            file2.delete();
        }
        if (file.renameTo(file2)) {
            return Uri.fromFile(file2);
        }
        throw new ImageCaptureException(1, "Failed to overwrite the file: " + file2.getAbsolutePath(), null);
    }

    private static Uri c(File file, H.g gVar) throws Throwable {
        ContentValues contentValues;
        Uri uriInsert;
        ContentResolver contentResolverA = gVar.a();
        Objects.requireNonNull(contentResolverA);
        if (gVar.b() != null) {
            contentValues = new ContentValues(gVar.b());
        } else {
            contentValues = new ContentValues();
        }
        l(contentValues, 1);
        Uri uri = null;
        try {
            try {
                uriInsert = contentResolverA.insert(gVar.f(), contentValues);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e10) {
            e = e10;
        } catch (SecurityException e11) {
            e = e11;
        }
        try {
            if (uriInsert != null) {
                e(file, uriInsert, contentResolverA);
                n(uriInsert, contentResolverA, 0);
                return uriInsert;
            }
            throw new ImageCaptureException(1, "Failed to insert a MediaStore URI.", null);
        } catch (IOException e12) {
            e = e12;
            uri = uriInsert;
            throw new ImageCaptureException(1, "Failed to write to MediaStore URI: " + uri, e);
        } catch (SecurityException e13) {
            e = e13;
            uri = uriInsert;
            throw new ImageCaptureException(1, "Failed to write to MediaStore URI: " + uri, e);
        } catch (Throwable th3) {
            th = th3;
            uri = uriInsert;
            if (uri != null) {
                n(uri, contentResolverA, 0);
            }
            throw th;
        }
    }

    private static void e(File file, Uri uri, ContentResolver contentResolver) throws IOException {
        OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uri);
        try {
            if (outputStreamOpenOutputStream != null) {
                d(file, outputStreamOpenOutputStream);
                outputStreamOpenOutputStream.close();
            } else {
                throw new FileNotFoundException(uri + " cannot be resolved.");
            }
        } catch (Throwable th2) {
            if (outputStreamOpenOutputStream != null) {
                try {
                    outputStreamOpenOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    private static File f(H.g gVar) throws ImageCaptureException {
        try {
            File fileC = gVar.c();
            if (fileC != null) {
                return new File(fileC.getParent(), "CameraX" + UUID.randomUUID().toString() + g(fileC));
            }
            return File.createTempFile("CameraX", ".tmp");
        } catch (IOException e10) {
            throw new ImageCaptureException(1, "Failed to create temp file.", e10);
        }
    }

    private static String g(File file) {
        String name = file.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            return name.substring(iLastIndexOf);
        }
        return "";
    }

    private static boolean h(H.g gVar) {
        if (gVar.c() != null) {
            return true;
        }
        return false;
    }

    private static boolean i(H.g gVar) {
        if (gVar.f() != null && gVar.a() != null && gVar.b() != null) {
            return true;
        }
        return false;
    }

    private static boolean j(H.g gVar) {
        if (gVar.e() != null) {
            return true;
        }
        return false;
    }

    private static void m(File file, G.f fVar, H.g gVar, int i10) throws ImageCaptureException, NumberFormatException {
        try {
            G.f fVarE = G.f.e(file);
            fVar.d(fVarE);
            if (fVarE.n() == 0 && i10 != 0) {
                fVarE.u(i10);
            }
            gVar.d();
            throw null;
        } catch (IOException e10) {
            throw new ImageCaptureException(1, "Failed to update Exif data", e10);
        }
    }

    @Override // O.A
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public H.h apply(a aVar) throws ImageCaptureException, IOException, NumberFormatException {
        O.B<byte[]> b10 = aVar.b();
        H.g gVarA = aVar.a();
        File fileF = f(gVarA);
        o(fileF, b10.c());
        G.f fVarD = b10.d();
        Objects.requireNonNull(fVarD);
        m(fileF, fVarD, gVarA, b10.f());
        return new H.h(k(fileF, gVarA));
    }
}
