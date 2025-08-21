package Nn;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.material.appbar.MaterialToolbar;

/* renamed from: Nn.m, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC4263m extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final FrameLayout f22118A;

    /* renamed from: B, reason: collision with root package name */
    public final ImageView f22119B;

    /* renamed from: z, reason: collision with root package name */
    public final MaterialToolbar f22120z;

    @Deprecated
    public static AbstractC4263m N0(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC4263m) androidx.databinding.p.i0(layoutInflater, com.meijer.mobile.meijer.V.f100237g, null, false, obj);
    }

    protected AbstractC4263m(Object obj, View view, int i10, MaterialToolbar materialToolbar, FrameLayout frameLayout, ImageView imageView) {
        super(obj, view, i10);
        this.f22120z = materialToolbar;
        this.f22118A = frameLayout;
        this.f22119B = imageView;
    }

    public static AbstractC4263m M0(LayoutInflater layoutInflater) {
        return N0(layoutInflater, androidx.databinding.g.d());
    }
}
