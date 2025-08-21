package b7;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.fullstory.FS;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final int f60080a;

    /* renamed from: b, reason: collision with root package name */
    private final int f60081b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f60082c;

    /* renamed from: d, reason: collision with root package name */
    private final int f60083d;

    public static final class a {

        /* renamed from: i, reason: collision with root package name */
        static final int f60084i;

        /* renamed from: a, reason: collision with root package name */
        final Context f60085a;

        /* renamed from: b, reason: collision with root package name */
        ActivityManager f60086b;

        /* renamed from: c, reason: collision with root package name */
        c f60087c;

        /* renamed from: e, reason: collision with root package name */
        float f60089e;

        /* renamed from: d, reason: collision with root package name */
        float f60088d = 2.0f;

        /* renamed from: f, reason: collision with root package name */
        float f60090f = 0.4f;

        /* renamed from: g, reason: collision with root package name */
        float f60091g = 0.33f;

        /* renamed from: h, reason: collision with root package name */
        int f60092h = 4194304;

        static {
            f60084i = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public i a() {
            return new i(this);
        }

        public a(Context context) {
            this.f60089e = f60084i;
            this.f60085a = context;
            this.f60086b = (ActivityManager) context.getSystemService("activity");
            this.f60087c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && i.e(this.f60086b)) {
                this.f60089e = 0.0f;
            }
        }
    }

    private static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final DisplayMetrics f60093a;

        @Override // b7.i.c
        public int a() {
            return this.f60093a.heightPixels;
        }

        @Override // b7.i.c
        public int b() {
            return this.f60093a.widthPixels;
        }

        b(DisplayMetrics displayMetrics) {
            this.f60093a = displayMetrics;
        }
    }

    interface c {
        int a();

        int b();
    }

    private String f(int i10) {
        return Formatter.formatFileSize(this.f60082c, i10);
    }

    public int a() {
        return this.f60083d;
    }

    public int b() {
        return this.f60080a;
    }

    public int d() {
        return this.f60081b;
    }

    i(a aVar) {
        int i10;
        boolean z10;
        this.f60082c = aVar.f60085a;
        if (e(aVar.f60086b)) {
            i10 = aVar.f60092h / 2;
        } else {
            i10 = aVar.f60092h;
        }
        this.f60083d = i10;
        int iC = c(aVar.f60086b, aVar.f60090f, aVar.f60091g);
        float fB = aVar.f60087c.b() * aVar.f60087c.a() * 4;
        int iRound = Math.round(aVar.f60089e * fB);
        int iRound2 = Math.round(fB * aVar.f60088d);
        int i11 = iC - i10;
        int i12 = iRound2 + iRound;
        if (i12 <= i11) {
            this.f60081b = iRound2;
            this.f60080a = iRound;
        } else {
            float f10 = i11;
            float f11 = aVar.f60089e;
            float f12 = aVar.f60088d;
            float f13 = f10 / (f11 + f12);
            this.f60081b = Math.round(f12 * f13);
            this.f60080a = Math.round(f13 * aVar.f60089e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Calculation complete, Calculated memory cache size: ");
            sb2.append(f(this.f60081b));
            sb2.append(", pool size: ");
            sb2.append(f(this.f60080a));
            sb2.append(", byte array size: ");
            sb2.append(f(i10));
            sb2.append(", memory class limited? ");
            if (i12 > iC) {
                z10 = true;
            } else {
                z10 = false;
            }
            sb2.append(z10);
            sb2.append(", max size: ");
            sb2.append(f(iC));
            sb2.append(", memoryClass: ");
            sb2.append(aVar.f60086b.getMemoryClass());
            sb2.append(", isLowMemoryDevice: ");
            sb2.append(e(aVar.f60086b));
            FS.log_d("MemorySizeCalculator", sb2.toString());
        }
    }

    private static int c(ActivityManager activityManager, float f10, float f11) {
        float memoryClass = activityManager.getMemoryClass() * 1048576;
        if (e(activityManager)) {
            f10 = f11;
        }
        return Math.round(memoryClass * f10);
    }

    @TargetApi(19)
    static boolean e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }
}
