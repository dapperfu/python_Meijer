package Cn;

import Uj.WalkthroughPage;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.P;
import com.meijer.mobile.core.design.widget.howTo.WalkthroughFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LCn/a;", "Landroidx/fragment/app/P;", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", "LUj/e;", "walkthroughs", "<init>", "(Landroidx/fragment/app/FragmentManager;Ljava/util/List;)V", "", "position", "Landroidx/fragment/app/Fragment;", "t", "(I)Landroidx/fragment/app/Fragment;", "d", "()I", "j", "Ljava/util/List;", "getWalkthroughs", "()Ljava/util/List;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class a extends P {

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final List<WalkthroughPage> walkthroughs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(FragmentManager fragmentManager, List<WalkthroughPage> walkthroughs) {
        super(fragmentManager, 1);
        Intrinsics.j(fragmentManager, "fragmentManager");
        Intrinsics.j(walkthroughs, "walkthroughs");
        this.walkthroughs = walkthroughs;
    }

    @Override // androidx.viewpager.widget.a
    public int d() {
        return this.walkthroughs.size();
    }

    @Override // androidx.fragment.app.P
    public Fragment t(int position) {
        return WalkthroughFragment.INSTANCE.a(this.walkthroughs.get(position));
    }
}
