package vv;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import qv.L0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lvv/s;", "", "<init>", "()V", "Lqv/L0;", "a", "()Lqv/L0;", "b", "Lqv/L0;", "dispatcher", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: vv.s, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C17663s {

    /* renamed from: a, reason: collision with root package name */
    public static final C17663s f165139a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public static final L0 dispatcher;

    static {
        C17663s c17663s = new C17663s();
        f165139a = c17663s;
        C17632F.f("kotlinx.coroutines.fast.service.loader", true);
        dispatcher = c17663s.a();
    }

    private final L0 a() {
        Object next;
        L0 l0E;
        try {
            List listW = SequencesKt.W(SequencesKt.h(ServiceLoader.load(InterfaceC17662r.class, InterfaceC17662r.class.getClassLoader()).iterator()));
            Iterator it = listW.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iC = ((InterfaceC17662r) next).c();
                    do {
                        Object next2 = it.next();
                        int iC2 = ((InterfaceC17662r) next2).c();
                        if (iC < iC2) {
                            next = next2;
                            iC = iC2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            InterfaceC17662r interfaceC17662r = (InterfaceC17662r) next;
            if (interfaceC17662r != null && (l0E = C17664t.e(interfaceC17662r, listW)) != null) {
                return l0E;
            }
            return C17664t.b(null, null, 3, null);
        } catch (Throwable th2) {
            return C17664t.b(th2, null, 2, null);
        }
    }

    private C17663s() {
    }
}
