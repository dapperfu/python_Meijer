package x4;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import x4.C18082b;
import y4.C18288b;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0011\nB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u000e2\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001c¨\u0006\u001e"}, d2 = {"Lx4/f;", "", "Ly4/b;", "impl", "<init>", "(Ly4/b;)V", "", "key", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "a", "(Ljava/lang/String;)Landroid/os/Bundle;", "Lx4/f$b;", "provider", "", "c", "(Ljava/lang/String;Lx4/f$b;)V", "b", "(Ljava/lang/String;)Lx4/f$b;", "e", "(Ljava/lang/String;)V", "Ljava/lang/Class;", "Lx4/f$a;", "clazz", "d", "(Ljava/lang/Class;)V", "Ly4/b;", "Lx4/b$b;", "Lx4/b$b;", "recreatorProvider", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: x4.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18086f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C18288b impl;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private C18082b.C2735b recreatorProvider;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lx4/f$a;", "", "Lx4/i;", "owner", "", "a", "(Lx4/i;)V", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: x4.f$a */
    public interface a {
        void a(InterfaceC18089i owner);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lx4/f$b;", "", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "saveState", "()Landroid/os/Bundle;", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: x4.f$b */
    public interface b {
        Bundle saveState();
    }

    public C18086f(C18288b impl) {
        Intrinsics.j(impl, "impl");
        this.impl = impl;
    }

    public final Bundle a(String key) {
        Intrinsics.j(key, "key");
        return this.impl.c(key);
    }

    public final b b(String key) {
        Intrinsics.j(key, "key");
        return this.impl.d(key);
    }

    public final void c(String key, b provider) {
        Intrinsics.j(key, "key");
        Intrinsics.j(provider, "provider");
        this.impl.j(key, provider);
    }

    public final void d(Class<? extends a> clazz) throws NoSuchMethodException, SecurityException {
        Intrinsics.j(clazz, "clazz");
        if (!this.impl.getIsAllowingSavingState()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C18082b.C2735b c2735b = this.recreatorProvider;
        if (c2735b == null) {
            c2735b = new C18082b.C2735b(this);
        }
        this.recreatorProvider = c2735b;
        try {
            clazz.getDeclaredConstructor(null);
            C18082b.C2735b c2735b2 = this.recreatorProvider;
            if (c2735b2 != null) {
                String name = clazz.getName();
                Intrinsics.i(name, "getName(...)");
                c2735b2.a(name);
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }

    public final void e(String key) {
        Intrinsics.j(key, "key");
        this.impl.k(key);
    }
}
