package Nn;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* renamed from: Nn.d0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC4222d0 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final FrameLayout f21845A;

    /* renamed from: z, reason: collision with root package name */
    public final MaterialToolbar f21846z;

    @Deprecated
    public static AbstractC4222d0 N0(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC4222d0) androidx.databinding.p.i0(layoutInflater, com.meijer.mobile.meijer.V.f100169B, null, false, obj);
    }

    protected AbstractC4222d0(Object obj, View view, int i10, MaterialToolbar materialToolbar, FrameLayout frameLayout) {
        super(obj, view, i10);
        this.f21846z = materialToolbar;
        this.f21845A = frameLayout;
    }

    public static AbstractC4222d0 M0(LayoutInflater layoutInflater) {
        return N0(layoutInflater, androidx.databinding.g.d());
    }
}
