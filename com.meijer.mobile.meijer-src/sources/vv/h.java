package vv;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B¶\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012U\u0010\r\u001aQ\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0005j\u0002`\f\u0012U\u0010\u0010\u001aQ\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005j\u0002`\u000f\u0012w\b\u0002\u0010\u0015\u001aq\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0011\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b0\u0005\u0018\u00010\u0005j\u0004\u0018\u0001`\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bRi\u0010\r\u001aQ\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0005j\u0002`\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001eRi\u0010\u0010\u001aQ\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005j\u0002`\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001f\u0010\u001eR\u0089\u0001\u0010\u0015\u001aq\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0011\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b0\u0005\u0018\u00010\u0005j\u0004\u0018\u0001`\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006 "}, d2 = {"Lvv/h;", "Q", "Lvv/g;", "", "clauseObject", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "Lvv/k;", "select", "param", "", "Lkotlinx/coroutines/selects/RegistrationFunction;", "regFunc", "clauseResult", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "processResFunc", "internalResult", "", "Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "onCancellationConstructor", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;)V", "a", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "b", "Lkotlin/jvm/functions/Function3;", "()Lkotlin/jvm/functions/Function3;", "c", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h<Q> implements g<Q> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object clauseObject;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function3<Object, k<?>, Object, Unit> regFunc;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Function3<Object, Object, Object, Object> processResFunc;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Function3<k<?>, Object, Object, Function3<Throwable, Object, CoroutineContext, Unit>> onCancellationConstructor;

    @Override // vv.i
    public Function3<Object, k<?>, Object, Unit> a() {
        return this.regFunc;
    }

    @Override // vv.i
    public Function3<k<?>, Object, Object, Function3<Throwable, Object, CoroutineContext, Unit>> b() {
        return this.onCancellationConstructor;
    }

    @Override // vv.i
    public Function3<Object, Object, Object, Object> c() {
        return this.processResFunc;
    }

    @Override // vv.i
    /* renamed from: d, reason: from getter */
    public Object getClauseObject() {
        return this.clauseObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(Object obj, Function3<Object, ? super k<?>, Object, Unit> function3, Function3<Object, Object, Object, ? extends Object> function32, Function3<? super k<?>, Object, Object, ? extends Function3<? super Throwable, Object, ? super CoroutineContext, Unit>> function33) {
        this.clauseObject = obj;
        this.regFunc = function3;
        this.processResFunc = function32;
        this.onCancellationConstructor = function33;
    }
}
