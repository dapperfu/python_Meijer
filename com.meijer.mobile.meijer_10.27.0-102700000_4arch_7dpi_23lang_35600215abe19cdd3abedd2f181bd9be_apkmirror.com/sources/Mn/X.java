package Mn;

import android.view.View;
import android.widget.FrameLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* loaded from: classes9.dex */
public abstract class X extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final AppBarLayout f20390A;

    /* renamed from: B, reason: collision with root package name */
    public final DrawerLayout f20391B;

    /* renamed from: C, reason: collision with root package name */
    public final FrameLayout f20392C;

    /* renamed from: z, reason: collision with root package name */
    public final MaterialToolbar f20393z;

    protected X(Object obj, View view, int i10, MaterialToolbar materialToolbar, AppBarLayout appBarLayout, DrawerLayout drawerLayout, FrameLayout frameLayout) {
        super(obj, view, i10);
        this.f20393z = materialToolbar;
        this.f20390A = appBarLayout;
        this.f20391B = drawerLayout;
        this.f20392C = frameLayout;
    }
}
