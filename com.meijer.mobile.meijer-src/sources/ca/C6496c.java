package ca;

import I9.o;
import K9.e;
import L9.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lca/c;", "Lca/a;", "Ljava/lang/Class;", "klass", "<init>", "(Ljava/lang/Class;)V", "LX8/a;", "completionListener", "", "a", "(LX8/a;)V", "Ljava/lang/Class;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ca.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6496c implements InterfaceC6494a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Class<?> klass;

    public C6496c(Class<?> klass) {
        Intrinsics.j(klass, "klass");
        this.klass = klass;
    }

    @Override // ca.InterfaceC6494a
    public void a(X8.a completionListener) {
        String strA = o.a();
        e.Companion companion = e.INSTANCE;
        Class<?> cls = this.klass;
        Intrinsics.g(strA);
        e.Companion.b(companion, new g(cls, strA, null), false, 2, null);
    }
}
