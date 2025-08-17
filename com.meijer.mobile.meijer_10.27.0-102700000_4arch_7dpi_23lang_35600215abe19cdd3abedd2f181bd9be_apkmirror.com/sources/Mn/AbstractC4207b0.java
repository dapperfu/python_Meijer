package Mn;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Spinner;
import com.google.android.material.appbar.MaterialToolbar;
import com.meijer.mobile.meijer.activity.shoppinglist.view.ShoppingListFavoritesView;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* renamed from: Mn.b0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC4207b0 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ShoppingListFavoritesView f20479A;

    /* renamed from: B, reason: collision with root package name */
    public final Spinner f20480B;

    /* renamed from: C, reason: collision with root package name */
    public final ProgressView f20481C;

    /* renamed from: z, reason: collision with root package name */
    public final MaterialToolbar f20482z;

    @Deprecated
    public static AbstractC4207b0 M0(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC4207b0) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99311A, null, false, obj);
    }

    protected AbstractC4207b0(Object obj, View view, int i10, MaterialToolbar materialToolbar, ShoppingListFavoritesView shoppingListFavoritesView, Spinner spinner, ProgressView progressView) {
        super(obj, view, i10);
        this.f20482z = materialToolbar;
        this.f20479A = shoppingListFavoritesView;
        this.f20480B = spinner;
        this.f20481C = progressView;
    }

    public static AbstractC4207b0 K0(LayoutInflater layoutInflater) {
        return M0(layoutInflater, androidx.databinding.g.d());
    }
}
