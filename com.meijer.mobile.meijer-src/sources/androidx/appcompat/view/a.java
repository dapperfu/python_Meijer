package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import i.C14578a;
import i.C14579b;
import i.C14581d;
import i.C14587j;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Context f46286a;

    public boolean h() {
        return true;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f46286a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f46286a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f46286a.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i10 > 600) {
            return 5;
        }
        if (i10 > 960 && i11 > 720) {
            return 5;
        }
        if (i10 > 720 && i11 > 960) {
            return 5;
        }
        if (i10 >= 500) {
            return 4;
        }
        if (i10 > 640 && i11 > 480) {
            return 4;
        }
        if (i10 <= 480 || i11 <= 640) {
            return i10 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public int e() {
        return this.f46286a.getResources().getDimensionPixelSize(C14581d.f136315b);
    }

    public int f() {
        TypedArray typedArrayObtainStyledAttributes = this.f46286a.obtainStyledAttributes(null, C14587j.f136556a, C14578a.f136281c, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(C14587j.f136601j, 0);
        Resources resources = this.f46286a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C14581d.f136314a));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.f46286a.getResources().getBoolean(C14579b.f136305a);
    }

    private a(Context context) {
        this.f46286a = context;
    }
}
