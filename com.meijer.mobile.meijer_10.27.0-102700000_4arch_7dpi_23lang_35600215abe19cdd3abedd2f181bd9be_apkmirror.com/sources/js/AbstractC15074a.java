package js;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.L;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import x4.i;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Ljs/a;", "Landroidx/fragment/app/L;", "Landroid/view/ViewGroup;", "container", "", "position", "", "h", "(Landroid/view/ViewGroup;I)Ljava/lang/Object;", "object", "", "a", "(Landroid/view/ViewGroup;ILjava/lang/Object;)V", "Landroidx/fragment/app/Fragment;", "w", "(I)Landroidx/fragment/app/Fragment;", "x", "(I)V", "Landroidx/fragment/app/FragmentManager;", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Landroid/util/SparseArray;", "", "i", "Landroid/util/SparseArray;", "fragmentTags", "adapters_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: js.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC15074a extends L {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final FragmentManager fragmentManager;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final SparseArray<String> fragmentTags;

    @Override // androidx.fragment.app.L, androidx.viewpager.widget.a
    public void a(ViewGroup container, int position, Object object) {
        Intrinsics.j(container, "container");
        Intrinsics.j(object, "object");
        super.a(container, position, object);
        this.fragmentTags.remove(position);
    }

    @Override // androidx.fragment.app.L, androidx.viewpager.widget.a
    public Object h(ViewGroup container, int position) {
        Intrinsics.j(container, "container");
        Object objH = super.h(container, position);
        Intrinsics.h(objH, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        Fragment fragment = (Fragment) objH;
        this.fragmentTags.put(position, fragment.getTag());
        return fragment;
    }

    public final Fragment w(int position) {
        return this.fragmentManager.findFragmentByTag(this.fragmentTags.get(position));
    }

    public final void x(int position) {
        InterfaceC15075b interfaceC15075b;
        i iVarW = w(position);
        if (iVarW instanceof InterfaceC15075b) {
            interfaceC15075b = (InterfaceC15075b) iVarW;
        } else {
            interfaceC15075b = null;
        }
        if (interfaceC15075b != null) {
            interfaceC15075b.a(true);
        }
    }
}
