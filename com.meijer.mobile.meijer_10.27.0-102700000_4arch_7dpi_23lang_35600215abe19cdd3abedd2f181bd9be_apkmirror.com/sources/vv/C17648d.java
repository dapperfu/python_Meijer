package vv;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\"D\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00022\u0006\u0010\u0003\u001a\u00028\u00008@@@X\u0080\u000e¢\u0006\u0012\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"T", "Ljava/util/concurrent/atomic/AtomicReference;", "Lkotlinx/coroutines/internal/WorkaroundAtomicReference;", "value", "a", "(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Object;", "b", "(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;)V", "getValue$annotations", "(Ljava/util/concurrent/atomic/AtomicReference;)V", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: vv.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C17648d {
    public static final <T> T a(AtomicReference<T> atomicReference) {
        return atomicReference.get();
    }

    public static final <T> void b(AtomicReference<T> atomicReference, T t10) {
        atomicReference.set(t10);
    }
}
