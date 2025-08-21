package fsimpl;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.fullstory.util.Log;

/* loaded from: classes15.dex */
public class aV {

    /* renamed from: a, reason: collision with root package name */
    private final aP f132797a;

    /* renamed from: b, reason: collision with root package name */
    private final bV f132798b;

    /* renamed from: c, reason: collision with root package name */
    private final bU f132799c;

    /* renamed from: d, reason: collision with root package name */
    private final C14109bi f132800d;

    /* renamed from: e, reason: collision with root package name */
    private final Rect f132801e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    private final bS f132802f;

    public aV(aP aPVar, bV bVVar, bU bUVar, C14109bi c14109bi, bS bSVar) {
        this.f132797a = aPVar;
        this.f132798b = bVVar;
        this.f132799c = bUVar;
        this.f132800d = c14109bi;
        this.f132802f = bSVar;
    }

    private static int a(Bitmap bitmap) {
        Bitmap bitmapB;
        int pixel = 0;
        try {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, 1, 1, true);
            if (C14231fx.a(bitmap) && (bitmapB = C14231fx.b(bitmapCreateScaledBitmap)) != bitmapCreateScaledBitmap) {
                C14231fx.a(bitmapCreateScaledBitmap, bitmap);
                bitmap = bitmapCreateScaledBitmap;
                bitmapCreateScaledBitmap = bitmapB;
            }
            pixel = bitmapCreateScaledBitmap.getPixel(0, 0);
            C14231fx.a(bitmapCreateScaledBitmap, bitmap);
            return pixel;
        } catch (Throwable th2) {
            Log.e("Exception getting dominant color", th2);
            return pixel;
        }
    }

    private int a(gh ghVar, Bitmap bitmap) {
        try {
            this.f132802f.a(bitmap);
        } finally {
            try {
                return 0;
            } finally {
            }
        }
        if (!aP.a(bitmap)) {
            return C14160df.a(ghVar, bitmap.getWidth(), bitmap.getHeight(), 0, 0, 0, 0, bitmap.getDensity(), a(bitmap), 1);
        }
        Log.w("bitmap recycled after canvas checks and made it through to encoding, discarding from uploads");
        return 0;
    }

    private int a(gh ghVar, Bitmap bitmap, boolean z10) {
        String strA;
        try {
            this.f132802f.a(bitmap);
            if (!aP.a(bitmap)) {
                byte[] ninePatchChunk = null;
                String strA2 = z10 ? null : this.f132798b.a(bitmap);
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int density = bitmap.getDensity();
                if (strA2 != null) {
                    strA = "sha256:" + strA2;
                } else {
                    strA = z10 ? this.f132797a.a(bitmap, width, height) : this.f132797a.b(bitmap, width, height);
                    if (strA == null) {
                    }
                }
                int iA = ghVar.a(strA);
                if (aP.a(bitmap)) {
                    Log.w("bitmap recycled after canvas checks and made it through to encoding, discarding from uploads");
                } else {
                    ninePatchChunk = bitmap.getNinePatchChunk();
                }
                return C14160df.a(ghVar, width, height, 0, iA, 0, ninePatchChunk != null ? C14160df.a(ghVar, ninePatchChunk) : 0, density, 0, 0);
            }
            Log.w("bitmap recycled after canvas checks and made it through to encoding, discarding from uploads");
        } finally {
            try {
                return 0;
            } finally {
            }
        }
        return 0;
    }

    private int a(gh ghVar, String str, int i10, int i11, int i12) {
        return C14160df.a(ghVar, i10, i11, 0, ghVar.a(str), 0, 0, i12, 0, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0255 A[Catch: all -> 0x029f, TRY_LEAVE, TryCatch #9 {all -> 0x029f, blocks: (B:99:0x024f, B:101:0x0255), top: B:165:0x024f }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0294  */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r11v0, types: [fsimpl.bT] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r13v7, types: [int] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [android.graphics.Canvas] */
    /* JADX WARN: Type inference failed for: r6v22, types: [android.graphics.Canvas] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a(java.util.Map r22, java.util.Map r23, java.util.Map r24, java.util.Map r25, java.util.Map r26, java.util.Map r27, fsimpl.gh r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 883
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fsimpl.aV.a(java.util.Map, java.util.Map, java.util.Map, java.util.Map, java.util.Map, java.util.Map, fsimpl.gh):int");
    }
}
