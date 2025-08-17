package Mn;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* renamed from: Mn.d0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC4217d0 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final FrameLayout f20513A;

    /* renamed from: z, reason: collision with root package name */
    public final MaterialToolbar f20514z;

    @Deprecated
    public static AbstractC4217d0 M0(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC4217d0) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99313B, null, false, obj);
    }

    protected AbstractC4217d0(Object obj, View view, int i10, MaterialToolbar materialToolbar, FrameLayout frameLayout) {
        super(obj, view, i10);
        this.f20514z = materialToolbar;
        this.f20513A = frameLayout;
    }

    public static AbstractC4217d0 K0(LayoutInflater layoutInflater) {
        return M0(layoutInflater, androidx.databinding.g.d());
    }
}
