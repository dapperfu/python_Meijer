package kotlinx.coroutines.test.internal;

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
import mv.AbstractC15779K;
import mv.L0;
import rv.C16983t;
import rv.C16985v;
import rv.InterfaceC16981r;
import yv.C18377c;
import yv.C18380f;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/test/internal/TestMainDispatcherFactory;", "Lrv/r;", "<init>", "()V", "", "allFactories", "Lmv/L0;", "b", "(Ljava/util/List;)Lmv/L0;", "", "c", "()I", "loadPriority", "kotlinx-coroutines-test"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class TestMainDispatcherFactory implements InterfaceC16981r {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void g() {
    }

    @Override // rv.InterfaceC16981r
    public int c() {
        return a.e.API_PRIORITY_OTHER;
    }

    @Override // rv.InterfaceC16981r
    public L0 b(List<? extends InterfaceC16981r> allFactories) {
        Object obj;
        final ArrayList arrayList = new ArrayList();
        for (Object obj2 : allFactories) {
            if (((InterfaceC16981r) obj2) != this) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
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
            obj = next;
        } else {
            obj = null;
        }
        final InterfaceC16981r interfaceC16981r = (InterfaceC16981r) obj;
        if (interfaceC16981r == null) {
            interfaceC16981r = C16985v.f159677a;
        }
        return new C18377c(new Function0() { // from class: yv.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TestMainDispatcherFactory.f(interfaceC16981r, arrayList, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC15779K f(InterfaceC16981r interfaceC16981r, List list, TestMainDispatcherFactory testMainDispatcherFactory) {
        Object objB;
        try {
            L0 l0E = C16983t.e(interfaceC16981r, list);
            if (!C16983t.c(l0E)) {
                return l0E;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                l0E.J0(l0E, new Runnable() { // from class: yv.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        TestMainDispatcherFactory.g();
                    }
                });
                objB = Result.b(Unit.f143329a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
            }
            C18380f.b(Result.e(objB));
            throw new KotlinNothingValueException();
        } catch (Throwable th3) {
            C18380f.b(th3);
            throw new KotlinNothingValueException();
        }
    }

    @Override // rv.InterfaceC16981r
    public String a() {
        return InterfaceC16981r.a.a(this);
    }
}
