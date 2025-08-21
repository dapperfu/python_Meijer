package Ag;

import Gd.G5;
import Gd.I5;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.os.SystemClock;
import com.google.android.gms.common.internal.r;
import java.nio.ByteBuffer;
import ug.InterfaceC17410h;

/* loaded from: classes8.dex */
public class a implements InterfaceC17410h {

    /* renamed from: a, reason: collision with root package name */
    private volatile Bitmap f338a;

    /* renamed from: b, reason: collision with root package name */
    private volatile ByteBuffer f339b;

    /* renamed from: c, reason: collision with root package name */
    private final int f340c;

    /* renamed from: d, reason: collision with root package name */
    private final int f341d;

    /* renamed from: e, reason: collision with root package name */
    private final int f342e;

    /* renamed from: f, reason: collision with root package name */
    private final int f343f;

    /* renamed from: g, reason: collision with root package name */
    private final Matrix f344g;

    private static int k(int i10) {
        boolean z10 = true;
        if (i10 != 0 && i10 != 90 && i10 != 180) {
            if (i10 == 270) {
                i10 = 270;
            } else {
                z10 = false;
            }
        }
        r.b(z10, "Invalid rotation. Only 0, 90, 180, 270 are supported currently.");
        return i10;
    }

    public Image g() {
        return null;
    }

    public Image.Plane[] h() {
        return null;
    }

    private static void l(int i10, int i11, long j10, int i12, int i13, int i14, int i15) {
        I5.a(G5.b("vision-common"), i10, i11, j10, i12, i13, i14, i15);
    }

    public Bitmap b() {
        return this.f338a;
    }

    public ByteBuffer c() {
        return this.f339b;
    }

    public Matrix d() {
        return this.f344g;
    }

    public int e() {
        return this.f343f;
    }

    public int f() {
        return this.f341d;
    }

    public int i() {
        return this.f342e;
    }

    public int j() {
        return this.f340c;
    }

    private a(Bitmap bitmap, int i10) {
        this.f338a = (Bitmap) r.l(bitmap);
        this.f340c = bitmap.getWidth();
        this.f341d = bitmap.getHeight();
        k(i10);
        this.f342e = i10;
        this.f343f = -1;
        this.f344g = null;
    }

    public static a a(Bitmap bitmap, int i10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        a aVar = new a(bitmap, i10);
        l(-1, 1, jElapsedRealtime, bitmap.getHeight(), bitmap.getWidth(), bitmap.getAllocationByteCount(), i10);
        return aVar;
    }
}
