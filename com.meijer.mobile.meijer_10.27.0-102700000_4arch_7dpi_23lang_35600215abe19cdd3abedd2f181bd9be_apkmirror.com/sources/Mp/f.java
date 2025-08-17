package Mp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ug.C17255b;
import ug.C17256c;
import ug.InterfaceC17254a;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"LMp/f;", "", "<init>", "()V", "Lug/a;", "a", "()Lug/a;", "Lug/b;", "b", "Lug/b;", "options", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f21185a = new f();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final C17255b options;

    /* renamed from: c, reason: collision with root package name */
    public static final int f21187c;

    static {
        C17255b c17255bA = new C17255b.a().c(512, 1024, 64, 32, 256, 2, 16).b().a();
        Intrinsics.i(c17255bA, "build(...)");
        options = c17255bA;
        f21187c = 8;
    }

    public final InterfaceC17254a a() {
        InterfaceC17254a interfaceC17254aA = C17256c.a(options);
        Intrinsics.i(interfaceC17254aA, "getClient(...)");
        return interfaceC17254aA;
    }

    private f() {
    }
}
