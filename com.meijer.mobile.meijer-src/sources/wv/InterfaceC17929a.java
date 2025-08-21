package wv;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lwv/a;", "", "owner", "", "b", "(Ljava/lang/Object;)Z", "", "g", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "h", "(Ljava/lang/Object;)V", "c", "()Z", "isLocked", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wv.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC17929a {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wv.a$a, reason: collision with other inner class name */
    public static final class C2673a {
        public static /* synthetic */ Object a(InterfaceC17929a interfaceC17929a, Object obj, Continuation continuation, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            return interfaceC17929a.g(obj, continuation);
        }

        public static /* synthetic */ boolean b(InterfaceC17929a interfaceC17929a, Object obj, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            return interfaceC17929a.b(obj);
        }

        public static /* synthetic */ void c(InterfaceC17929a interfaceC17929a, Object obj, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            interfaceC17929a.h(obj);
        }
    }

    boolean b(Object owner);

    boolean c();

    Object g(Object obj, Continuation<? super Unit> continuation);

    void h(Object owner);
}
