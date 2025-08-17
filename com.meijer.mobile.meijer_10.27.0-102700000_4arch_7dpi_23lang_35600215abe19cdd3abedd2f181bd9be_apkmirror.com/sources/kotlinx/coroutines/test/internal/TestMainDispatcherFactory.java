package kotlinx.coroutines.test.internal;

import Cv.c;
import Cv.f;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.test.internal.TestMainDispatcherFactory;
import qv.AbstractC16618K;
import qv.L0;
import vv.C17664t;
import vv.C17666v;
import vv.InterfaceC17662r;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/test/internal/TestMainDispatcherFactory;", "Lvv/r;", "<init>", "()V", "", "allFactories", "Lqv/L0;", "b", "(Ljava/util/List;)Lqv/L0;", "", "c", "()I", "loadPriority", "kotlinx-coroutines-test"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class TestMainDispatcherFactory implements InterfaceC17662r {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void g() {
    }

    @Override // vv.InterfaceC17662r
    public int c() {
        return a.e.API_PRIORITY_OTHER;
    }

    @Override // vv.InterfaceC17662r
    public L0 b(List<? extends InterfaceC17662r> allFactories) {
        Object obj;
        final ArrayList arrayList = new ArrayList();
        for (Object obj2 : allFactories) {
            if (((InterfaceC17662r) obj2) != this) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
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
            obj = next;
        } else {
            obj = null;
        }
        final InterfaceC17662r interfaceC17662r = (InterfaceC17662r) obj;
        if (interfaceC17662r == null) {
            interfaceC17662r = C17666v.f165143a;
        }
        return new c(new Function0() { // from class: Cv.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TestMainDispatcherFactory.f(interfaceC17662r, arrayList, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC16618K f(InterfaceC17662r interfaceC17662r, List list, TestMainDispatcherFactory testMainDispatcherFactory) {
        Object objB;
        try {
            L0 l0E = C17664t.e(interfaceC17662r, list);
            if (!C17664t.c(l0E)) {
                return l0E;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                l0E.L0(l0E, new Runnable() { // from class: Cv.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        TestMainDispatcherFactory.g();
                    }
                });
                objB = Result.b(Unit.f142422a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
            }
            f.b(Result.e(objB));
            throw new KotlinNothingValueException();
        } catch (Throwable th3) {
            f.b(th3);
            throw new KotlinNothingValueException();
        }
    }

    @Override // vv.InterfaceC17662r
    public String a() {
        return InterfaceC17662r.a.a(this);
    }
}
