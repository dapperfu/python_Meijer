package On;

import androidx.view.InterfaceC6015f;
import androidx.view.InterfaceC6030s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LOn/a;", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/s;", "lifecycleOwner", "LOn/b;", "appIconProvider", "<init>", "(Landroidx/lifecycle/s;LOn/b;)V", "", "a", "()V", "owner", "onStop", "(Landroidx/lifecycle/s;)V", "Landroidx/lifecycle/s;", "b", "LOn/b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class a implements InterfaceC6015f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6030s lifecycleOwner;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b appIconProvider;

    public a(InterfaceC6030s lifecycleOwner, b appIconProvider) {
        Intrinsics.j(lifecycleOwner, "lifecycleOwner");
        Intrinsics.j(appIconProvider, "appIconProvider");
        this.lifecycleOwner = lifecycleOwner;
        this.appIconProvider = appIconProvider;
    }

    public final void a() {
        this.lifecycleOwner.getLifecycle().a(this);
    }

    @Override // androidx.view.InterfaceC6015f
    public void onStop(InterfaceC6030s owner) {
        Intrinsics.j(owner, "owner");
        this.appIconProvider.a();
    }
}
