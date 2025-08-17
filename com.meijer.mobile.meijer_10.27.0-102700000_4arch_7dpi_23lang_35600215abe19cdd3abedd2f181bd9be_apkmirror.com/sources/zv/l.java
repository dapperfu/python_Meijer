package zv;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import qv.InterfaceC16654n;
import vv.C17631E;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aj\u0010\r\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00010\u00002O\u0010\u000b\u001aK\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\"c\u0010\u0019\u001aQ\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0014\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0015\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002j\u0002`\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018\"\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001f\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001c\"\u0014\u0010!\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001c\"\u0014\u0010#\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001c\"\u001a\u0010'\u001a\u00020\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010&*¢\u0001\b\u0007\u0010*\"M\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0014\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030(¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b()\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00010\u00022M\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0014\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030(¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b()\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00010\u0002*¢\u0001\b\u0007\u0010+\"M\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0014\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0015\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00022M\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0014\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0015\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002*Ú\u0001\b\u0007\u0010-\"i\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030(¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b()\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0015\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(,\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u00020\u00022i\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030(¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b()\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0015\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(,\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u00020\u0002¨\u0006."}, d2 = {"Lqv/n;", "", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "cause", "", "value", "Lkotlin/coroutines/CoroutineContext;", "context", "onCancellation", "", "j", "(Lqv/n;Lkotlin/jvm/functions/Function3;)Z", "", "trySelectInternalResult", "Lzv/m;", "a", "(I)Lzv/m;", "clauseObject", "param", "clauseResult", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "Lkotlin/jvm/functions/Function3;", "DUMMY_PROCESS_RESULT_FUNCTION", "Lvv/E;", "b", "Lvv/E;", "STATE_REG", "c", "STATE_COMPLETED", "d", "STATE_CANCELLED", "e", "NO_RESULT", "f", "i", "()Lvv/E;", "PARAM_CLAUSE_0", "Lzv/k;", "select", "RegistrationFunction", "ProcessResultFunction", "internalResult", "OnCancellationConstructor", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private static final Function3<Object, Object, Object, Object> f173348a = a.f173354a;

    /* renamed from: b, reason: collision with root package name */
    private static final C17631E f173349b = new C17631E("STATE_REG");

    /* renamed from: c, reason: collision with root package name */
    private static final C17631E f173350c = new C17631E("STATE_COMPLETED");

    /* renamed from: d, reason: collision with root package name */
    private static final C17631E f173351d = new C17631E("STATE_CANCELLED");

    /* renamed from: e, reason: collision with root package name */
    private static final C17631E f173352e = new C17631E("NO_RESULT");

    /* renamed from: f, reason: collision with root package name */
    private static final C17631E f173353f = new C17631E("PARAM_CLAUSE_0");

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f173354a = new a();

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj, Object obj2, Object obj3) {
            return null;
        }

        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m a(int i10) {
        if (i10 == 0) {
            return m.f173355a;
        }
        if (i10 == 1) {
            return m.f173356b;
        }
        if (i10 == 2) {
            return m.f173357c;
        }
        if (i10 == 3) {
            return m.f173358d;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i10).toString());
    }

    public static final C17631E i() {
        return f173353f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(InterfaceC16654n<? super Unit> interfaceC16654n, Function3<? super Throwable, Object, ? super CoroutineContext, Unit> function3) {
        Object objW = interfaceC16654n.W(Unit.f142422a, null, function3);
        if (objW == null) {
            return false;
        }
        interfaceC16654n.X(objW);
        return true;
    }
}
