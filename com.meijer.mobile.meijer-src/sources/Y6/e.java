package Y6;

import a7.InterfaceC5665b;
import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.fullstory.FS;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes4.dex */
class e {

    /* renamed from: f, reason: collision with root package name */
    private static final a f42968f = new a();

    /* renamed from: a, reason: collision with root package name */
    private final a f42969a;

    /* renamed from: b, reason: collision with root package name */
    private final d f42970b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC5665b f42971c;

    /* renamed from: d, reason: collision with root package name */
    private final ContentResolver f42972d;

    /* renamed from: e, reason: collision with root package name */
    private final List<ImageHeaderParser> f42973e;

    e(List<ImageHeaderParser> list, d dVar, InterfaceC5665b interfaceC5665b, ContentResolver contentResolver) {
        this(list, f42968f, dVar, interfaceC5665b, contentResolver);
    }

    e(List<ImageHeaderParser> list, a aVar, d dVar, InterfaceC5665b interfaceC5665b, ContentResolver contentResolver) {
        this.f42969a = aVar;
        this.f42970b = dVar;
        this.f42971c = interfaceC5665b;
        this.f42972d = contentResolver;
        this.f42973e = list;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x001b: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:28), block:B:11:0x001b */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String b(android.net.Uri r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            r1 = 0
            Y6.d r2 = r6.f42970b     // Catch: java.lang.Throwable -> L25 java.lang.SecurityException -> L27
            android.database.Cursor r2 = r2.a(r7)     // Catch: java.lang.Throwable -> L25 java.lang.SecurityException -> L27
            if (r2 == 0) goto L1f
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            if (r3 == 0) goto L1f
            r3 = 0
            java.lang.String r7 = r2.getString(r3)     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            r2.close()
            return r7
        L1a:
            r7 = move-exception
            r1 = r2
            goto L4a
        L1d:
            r3 = move-exception
            goto L29
        L1f:
            if (r2 == 0) goto L24
            r2.close()
        L24:
            return r1
        L25:
            r7 = move-exception
            goto L4a
        L27:
            r3 = move-exception
            r2 = r1
        L29:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L1a
            if (r4 == 0) goto L44
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a
            r4.<init>()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r5 = "Failed to query for thumbnail for Uri: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L1a
            r4.append(r7)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L1a
            com.fullstory.FS.log_d(r0, r7, r3)     // Catch: java.lang.Throwable -> L1a
        L44:
            if (r2 == 0) goto L49
            r2.close()
        L49:
            return r1
        L4a:
            if (r1 == 0) goto L4f
            r1.close()
        L4f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Y6.e.b(android.net.Uri):java.lang.String");
    }

    private boolean c(File file) {
        return this.f42969a.a(file) && 0 < this.f42969a.c(file);
    }

    int a(Uri uri) throws IOException {
        InputStream inputStreamOpenInputStream = null;
        try {
            try {
                inputStreamOpenInputStream = this.f42972d.openInputStream(uri);
                int iB = com.bumptech.glide.load.a.b(this.f42973e, inputStreamOpenInputStream, this.f42971c);
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return iB;
            } catch (Throwable th2) {
                if (0 != 0) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th2;
            }
        } catch (IOException | NullPointerException e10) {
            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                FS.log_d("ThumbStreamOpener", "Failed to open uri: " + uri, e10);
            }
            if (inputStreamOpenInputStream == null) {
                return -1;
            }
            try {
                inputStreamOpenInputStream.close();
                return -1;
            } catch (IOException unused3) {
                return -1;
            }
        }
    }

    public InputStream d(Uri uri) throws Throwable {
        String strB = b(uri);
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        File fileB = this.f42969a.b(strB);
        if (!c(fileB)) {
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileB);
        try {
            return this.f42972d.openInputStream(uriFromFile);
        } catch (NullPointerException e10) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e10));
        }
    }
}
