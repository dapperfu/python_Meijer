package m5;

import androidx.view.AbstractC6165l;
import androidx.view.InterfaceC6157f;
import androidx.view.InterfaceC6171r;
import androidx.view.InterfaceC6172s;
import kotlin.Metadata;

@Metadata(d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\r\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lm5/g;", "Landroidx/lifecycle/l;", "<init>", "()V", "Landroidx/lifecycle/r;", "observer", "", "a", "(Landroidx/lifecycle/r;)V", "d", "", "toString", "()Ljava/lang/String;", "m5/g$a", "c", "Lm5/g$a;", "owner", "Landroidx/lifecycle/l$b;", "b", "()Landroidx/lifecycle/l$b;", "currentState", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: m5.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15668g extends AbstractC6165l {

    /* renamed from: b, reason: collision with root package name */
    public static final C15668g f150621b = new C15668g();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final a owner = new a();

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"m5/g$a", "Landroidx/lifecycle/s;", "Lm5/g;", "a", "()Lm5/g;", "lifecycle", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: m5.g$a */
    public static final class a implements InterfaceC6172s {
        @Override // androidx.view.InterfaceC6172s
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C15668g getLifecycle() {
            return C15668g.f150621b;
        }

        a() {
        }
    }

    @Override // androidx.view.AbstractC6165l
    public void d(InterfaceC6171r observer) {
    }

    @Override // androidx.view.AbstractC6165l
    public void a(InterfaceC6171r observer) {
        if (!(observer instanceof InterfaceC6157f)) {
            throw new IllegalArgumentException((observer + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        InterfaceC6157f interfaceC6157f = (InterfaceC6157f) observer;
        a aVar = owner;
        interfaceC6157f.onCreate(aVar);
        interfaceC6157f.onStart(aVar);
        interfaceC6157f.onResume(aVar);
    }

    @Override // androidx.view.AbstractC6165l
    public AbstractC6165l.b b() {
        return AbstractC6165l.b.f55503e;
    }

    public String toString() {
        return "coil.request.GlobalLifecycle";
    }

    private C15668g() {
    }
}
