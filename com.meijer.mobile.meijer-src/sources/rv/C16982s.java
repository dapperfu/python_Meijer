package rv;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import mv.L0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lrv/s;", "", "<init>", "()V", "Lmv/L0;", "a", "()Lmv/L0;", "b", "Lmv/L0;", "dispatcher", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: rv.s, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C16982s {

    /* renamed from: a, reason: collision with root package name */
    public static final C16982s f159673a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public static final L0 dispatcher;

    static {
        C16982s c16982s = new C16982s();
        f159673a = c16982s;
        C16951F.f("kotlinx.coroutines.fast.service.loader", true);
        dispatcher = c16982s.a();
    }

    private final L0 a() {
        Object next;
        L0 l0E;
        try {
            List listX = SequencesKt.X(SequencesKt.h(ServiceLoader.load(InterfaceC16981r.class, InterfaceC16981r.class.getClassLoader()).iterator()));
            Iterator it = listX.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iC = ((InterfaceC16981r) next).c();
                    do {
                        Object next2 = it.next();
                        int iC2 = ((InterfaceC16981r) next2).c();
                        if (iC < iC2) {
                            next = next2;
                            iC = iC2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            InterfaceC16981r interfaceC16981r = (InterfaceC16981r) next;
            if (interfaceC16981r != null && (l0E = C16983t.e(interfaceC16981r, listX)) != null) {
                return l0E;
            }
            return C16983t.b(null, null, 3, null);
        } catch (Throwable th2) {
            return C16983t.b(th2, null, 2, null);
        }
    }

    private C16982s() {
    }
}
