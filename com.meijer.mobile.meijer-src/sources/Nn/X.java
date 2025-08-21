package Nn;

import android.view.View;
import android.widget.FrameLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* loaded from: classes10.dex */
public abstract class X extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final AppBarLayout f21722A;

    /* renamed from: B, reason: collision with root package name */
    public final DrawerLayout f21723B;

    /* renamed from: C, reason: collision with root package name */
    public final FrameLayout f21724C;

    /* renamed from: z, reason: collision with root package name */
    public final MaterialToolbar f21725z;

    protected X(Object obj, View view, int i10, MaterialToolbar materialToolbar, AppBarLayout appBarLayout, DrawerLayout drawerLayout, FrameLayout frameLayout) {
        super(obj, view, i10);
        this.f21725z = materialToolbar;
        this.f21722A = appBarLayout;
        this.f21723B = drawerLayout;
        this.f21724C = frameLayout;
    }
}
