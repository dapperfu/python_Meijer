package hs;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.g;
import androidx.databinding.p;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: hs.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C14574b<T extends p> extends RecyclerView.F {

    /* renamed from: a, reason: collision with root package name */
    public final T f136154a;

    public C14574b(T t10) {
        super(t10.getRoot());
        this.f136154a = t10;
    }

    public static <T extends p> C14574b<T> b(ViewGroup viewGroup, int i10) {
        return new C14574b<>(g.e(LayoutInflater.from(viewGroup.getContext()), i10, viewGroup, false));
    }
}
