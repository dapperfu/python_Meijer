package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import i.C14575a;
import i.C14576b;
import i.C14578d;
import i.C14584j;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Context f46062a;

    public boolean h() {
        return true;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f46062a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f46062a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f46062a.getResources().getConfiguration();
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
        return this.f46062a.getResources().getDimensionPixelSize(C14578d.f136558b);
    }

    public int f() {
        TypedArray typedArrayObtainStyledAttributes = this.f46062a.obtainStyledAttributes(null, C14584j.f136799a, C14575a.f136524c, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(C14584j.f136844j, 0);
        Resources resources = this.f46062a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C14578d.f136557a));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.f46062a.getResources().getBoolean(C14576b.f136548a);
    }

    private a(Context context) {
        this.f46062a = context;
    }
}
