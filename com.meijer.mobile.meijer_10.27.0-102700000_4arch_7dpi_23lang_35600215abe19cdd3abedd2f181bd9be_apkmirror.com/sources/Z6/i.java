package Z6;

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
    private final int f42413a;

    /* renamed from: b, reason: collision with root package name */
    private final int f42414b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f42415c;

    /* renamed from: d, reason: collision with root package name */
    private final int f42416d;

    public static final class a {

        /* renamed from: i, reason: collision with root package name */
        static final int f42417i;

        /* renamed from: a, reason: collision with root package name */
        final Context f42418a;

        /* renamed from: b, reason: collision with root package name */
        ActivityManager f42419b;

        /* renamed from: c, reason: collision with root package name */
        c f42420c;

        /* renamed from: e, reason: collision with root package name */
        float f42422e;

        /* renamed from: d, reason: collision with root package name */
        float f42421d = 2.0f;

        /* renamed from: f, reason: collision with root package name */
        float f42423f = 0.4f;

        /* renamed from: g, reason: collision with root package name */
        float f42424g = 0.33f;

        /* renamed from: h, reason: collision with root package name */
        int f42425h = 4194304;

        static {
            f42417i = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public i a() {
            return new i(this);
        }

        public a(Context context) {
            this.f42422e = f42417i;
            this.f42418a = context;
            this.f42419b = (ActivityManager) context.getSystemService("activity");
            this.f42420c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && i.e(this.f42419b)) {
                this.f42422e = 0.0f;
            }
        }
    }

    private static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final DisplayMetrics f42426a;

        @Override // Z6.i.c
        public int a() {
            return this.f42426a.heightPixels;
        }

        @Override // Z6.i.c
        public int b() {
            return this.f42426a.widthPixels;
        }

        b(DisplayMetrics displayMetrics) {
            this.f42426a = displayMetrics;
        }
    }

    interface c {
        int a();

        int b();
    }

    private String f(int i10) {
        return Formatter.formatFileSize(this.f42415c, i10);
    }

    public int a() {
        return this.f42416d;
    }

    public int b() {
        return this.f42413a;
    }

    public int d() {
        return this.f42414b;
    }

    i(a aVar) {
        int i10;
        boolean z10;
        this.f42415c = aVar.f42418a;
        if (e(aVar.f42419b)) {
            i10 = aVar.f42425h / 2;
        } else {
            i10 = aVar.f42425h;
        }
        this.f42416d = i10;
        int iC = c(aVar.f42419b, aVar.f42423f, aVar.f42424g);
        float fB = aVar.f42420c.b() * aVar.f42420c.a() * 4;
        int iRound = Math.round(aVar.f42422e * fB);
        int iRound2 = Math.round(fB * aVar.f42421d);
        int i11 = iC - i10;
        int i12 = iRound2 + iRound;
        if (i12 <= i11) {
            this.f42414b = iRound2;
            this.f42413a = iRound;
        } else {
            float f10 = i11;
            float f11 = aVar.f42422e;
            float f12 = aVar.f42421d;
            float f13 = f10 / (f11 + f12);
            this.f42414b = Math.round(f12 * f13);
            this.f42413a = Math.round(f13 * aVar.f42422e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Calculation complete, Calculated memory cache size: ");
            sb2.append(f(this.f42414b));
            sb2.append(", pool size: ");
            sb2.append(f(this.f42413a));
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
            sb2.append(aVar.f42419b.getMemoryClass());
            sb2.append(", isLowMemoryDevice: ");
            sb2.append(e(aVar.f42419b));
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
