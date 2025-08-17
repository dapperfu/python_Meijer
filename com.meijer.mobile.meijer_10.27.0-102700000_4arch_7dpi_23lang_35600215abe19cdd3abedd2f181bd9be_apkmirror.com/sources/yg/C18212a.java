package yg;

import Ed.G5;
import Ed.I5;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.os.SystemClock;
import com.google.android.gms.common.internal.r;
import java.nio.ByteBuffer;
import sg.InterfaceC16963h;

/* renamed from: yg.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C18212a implements InterfaceC16963h {

    /* renamed from: a, reason: collision with root package name */
    private volatile Bitmap f170489a;

    /* renamed from: b, reason: collision with root package name */
    private volatile ByteBuffer f170490b;

    /* renamed from: c, reason: collision with root package name */
    private final int f170491c;

    /* renamed from: d, reason: collision with root package name */
    private final int f170492d;

    /* renamed from: e, reason: collision with root package name */
    private final int f170493e;

    /* renamed from: f, reason: collision with root package name */
    private final int f170494f;

    /* renamed from: g, reason: collision with root package name */
    private final Matrix f170495g;

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
        return this.f170489a;
    }

    public ByteBuffer c() {
        return this.f170490b;
    }

    public Matrix d() {
        return this.f170495g;
    }

    public int e() {
        return this.f170494f;
    }

    public int f() {
        return this.f170492d;
    }

    public int i() {
        return this.f170493e;
    }

    public int j() {
        return this.f170491c;
    }

    private C18212a(Bitmap bitmap, int i10) {
        this.f170489a = (Bitmap) r.l(bitmap);
        this.f170491c = bitmap.getWidth();
        this.f170492d = bitmap.getHeight();
        k(i10);
        this.f170493e = i10;
        this.f170494f = -1;
        this.f170495g = null;
    }

    public static C18212a a(Bitmap bitmap, int i10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C18212a c18212a = new C18212a(bitmap, i10);
        l(-1, 1, jElapsedRealtime, bitmap.getHeight(), bitmap.getWidth(), bitmap.getAllocationByteCount(), i10);
        return c18212a;
    }
}
