package l5;

import androidx.view.AbstractC6023l;
import androidx.view.InterfaceC6015f;
import androidx.view.InterfaceC6029r;
import androidx.view.InterfaceC6030s;
import kotlin.Metadata;

@Metadata(d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\r\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Ll5/g;", "Landroidx/lifecycle/l;", "<init>", "()V", "Landroidx/lifecycle/r;", "observer", "", "a", "(Landroidx/lifecycle/r;)V", "d", "", "toString", "()Ljava/lang/String;", "l5/g$a", "c", "Ll5/g$a;", "owner", "Landroidx/lifecycle/l$b;", "b", "()Landroidx/lifecycle/l$b;", "currentState", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: l5.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15371g extends AbstractC6023l {

    /* renamed from: b, reason: collision with root package name */
    public static final C15371g f148551b = new C15371g();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final a owner = new a();

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"l5/g$a", "Landroidx/lifecycle/s;", "Ll5/g;", "a", "()Ll5/g;", "lifecycle", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: l5.g$a */
    public static final class a implements InterfaceC6030s {
        @Override // androidx.view.InterfaceC6030s
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C15371g getLifecycle() {
            return C15371g.f148551b;
        }

        a() {
        }
    }

    @Override // androidx.view.AbstractC6023l
    public void d(InterfaceC6029r observer) {
    }

    @Override // androidx.view.AbstractC6023l
    public void a(InterfaceC6029r observer) {
        if (!(observer instanceof InterfaceC6015f)) {
            throw new IllegalArgumentException((observer + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        InterfaceC6015f interfaceC6015f = (InterfaceC6015f) observer;
        a aVar = owner;
        interfaceC6015f.onCreate(aVar);
        interfaceC6015f.onStart(aVar);
        interfaceC6015f.onResume(aVar);
    }

    @Override // androidx.view.AbstractC6023l
    public AbstractC6023l.b b() {
        return AbstractC6023l.b.f55279e;
    }

    public String toString() {
        return "coil.request.GlobalLifecycle";
    }

    private C15371g() {
    }
}
