package Fs;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.g;
import androidx.databinding.p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a7\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/databinding/p;", "T", "Landroid/view/LayoutInflater;", "", "layoutRes", "Landroid/view/ViewGroup;", "parent", "", "attachToParent", "a", "(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroidx/databinding/p;", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a {
    public static final <T extends p> T a(LayoutInflater layoutInflater, int i10, ViewGroup viewGroup, boolean z10) {
        Intrinsics.j(layoutInflater, "<this>");
        T t10 = (T) g.e(layoutInflater, i10, viewGroup, z10);
        Intrinsics.i(t10, "inflate(...)");
        return t10;
    }
}
