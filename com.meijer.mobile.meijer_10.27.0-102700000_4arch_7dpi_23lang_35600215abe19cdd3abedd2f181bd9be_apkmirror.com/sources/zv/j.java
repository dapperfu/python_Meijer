package zv;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.InterfaceC16643h0;
import qv.InterfaceC16652m;
import qv.InterfaceC16654n;
import qv.h1;
import vv.AbstractC17628B;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0012\n\u0002\u0010!\n\u0002\b\u000b\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004:\u0001\u0010B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0000H\u0091@¢\u0006\u0004\b\t\u0010\nJ2\u0010\u0010\u001a\u00020\u000f*\u00020\u000b2\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u00040\fH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011JD\u0010\u0015\u001a\u00020\u000f\"\u0004\b\u0001\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00010\u00132\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001a\u001a\u00020\u000f*\f0\u0017R\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010$\u001a\u00020\u000f2\n\u0010!\u001a\u0006\u0012\u0002\b\u00030 2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0019\u0010'\u001a\u00020\u000f2\b\u0010&\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b'\u0010(J!\u0010+\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u00042\b\u0010*\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\u00020-2\u0006\u0010)\u001a\u00020\u00042\b\u0010*\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b.\u0010/J\u0019\u00102\u001a\u00020\u000f2\b\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b4\u0010\nJ\u0017\u00105\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u0004H\u0002¢\u0006\u0004\b5\u0010(J\u0010\u00106\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b6\u0010\nJ\u0017\u00107\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u0004H\u0002¢\u0006\u0004\b7\u0010(J!\u00108\u001a\u00020\"2\u0006\u0010)\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b8\u00109J#\u0010:\u001a\u000e\u0018\u00010\u0017R\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010)\u001a\u00020\u0004H\u0002¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b<\u0010\nJ!\u0010>\u001a\u00020\u000f2\u0010\u0010=\u001a\f0\u0017R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b>\u0010?R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010@\u001a\u0004\bA\u0010BR(\u0010E\u001a\u0014\u0012\u000e\u0012\f0\u0017R\b\u0012\u0004\u0012\u00028\u00000\u0000\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010DR\u0018\u0010G\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010FR\u0016\u0010I\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010HR\u0018\u0010&\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010FR\u0014\u0010L\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0011\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00040\u00048\u0002X\u0082\u0004¨\u0006N"}, d2 = {"Lzv/j;", "R", "Lqv/m;", "Lzv/d;", "", "Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "o", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lzv/e;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "block", "", "a", "(Lzv/e;Lkotlin/jvm/functions/Function1;)V", "Q", "Lzv/g;", "Lkotlin/Function2;", "b", "(Lzv/g;Lkotlin/jvm/functions/Function2;)V", "Lzv/j$a;", "", "reregister", "u", "(Lzv/j$a;Z)V", "Lqv/h0;", "disposableHandle", "n", "(Lqv/h0;)V", "Lvv/B;", "segment", "", "index", "f", "(Lvv/B;I)V", "internalResult", "d", "(Ljava/lang/Object;)V", "clauseObject", "result", "e", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "Lzv/m;", "x", "(Ljava/lang/Object;Ljava/lang/Object;)Lzv/m;", "", "cause", "c", "(Ljava/lang/Throwable;)V", "q", "k", "z", "w", "y", "(Ljava/lang/Object;Ljava/lang/Object;)I", "r", "(Ljava/lang/Object;)Lzv/j$a;", "m", "selectedClause", "l", "(Lzv/j$a;)V", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "", "Ljava/util/List;", "clauses", "Ljava/lang/Object;", "disposableHandleOrSegment", "I", "indexInSegment", "t", "()Z", "isSelected", "state", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@PublishedApi
@SourceDebugExtension
/* loaded from: classes13.dex */
public class j<R> implements InterfaceC16652m, d<R>, k, h1 {

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f173329f = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "state$volatile");

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext context;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Object disposableHandleOrSegment;
    private volatile /* synthetic */ Object state$volatile = l.f173349b;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private List<j<R>.a> clauses = new ArrayList(2);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int indexInSegment = -1;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Object internalResult = l.f173352e;

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001BÆ\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012U\u0010\u000b\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0002\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0006¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0003j\u0002`\n\u0012U\u0010\u000e\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0002\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0002`\r\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u0001\u0012u\u0010\u0014\u001aq\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0006¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0010\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u0003\u0018\u00010\u0003j\u0004\u0018\u0001`\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0019\u001a\u00020\u00182\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00028\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u0086@¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\t¢\u0006\u0004\b!\u0010\"J?\u0010#\u001a\u001e\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t\u0018\u00010\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0002\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010%Rc\u0010\u000b\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0002\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0006¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0003j\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010&Rc\u0010\u000e\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0002\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0002`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010&R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010%R\u0014\u0010\u000f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010%R\u0083\u0001\u0010\u0014\u001aq\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0006¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0010\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u0003\u0018\u00010\u0003j\u0004\u0018\u0001`\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b(\u0010%R\u0016\u0010-\u001a\u00020*8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, d2 = {"Lzv/j$a;", "", "clauseObject", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "Lzv/k;", "select", "param", "", "Lkotlinx/coroutines/selects/RegistrationFunction;", "regFunc", "clauseResult", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "processResFunc", "block", "internalResult", "", "Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "onCancellationConstructor", "<init>", "(Lzv/j;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "Lzv/j;", "", "e", "(Lzv/j;)Z", "result", "d", "(Ljava/lang/Object;)Ljava/lang/Object;", "argument", "c", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "()V", "a", "(Lzv/k;Ljava/lang/Object;)Lkotlin/jvm/functions/Function3;", "Ljava/lang/Object;", "Lkotlin/jvm/functions/Function3;", "f", "g", "disposableHandleOrSegment", "", "h", "I", "indexInSegment", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final Object clauseObject;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Function3<Object, k<?>, Object, Unit> regFunc;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Function3<Object, Object, Object, Object> processResFunc;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Object param;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final Object block;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final Function3<k<?>, Object, Object, Function3<Throwable, Object, CoroutineContext, Unit>> onCancellationConstructor;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public Object disposableHandleOrSegment;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public int indexInSegment = -1;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, Function3<Object, ? super k<?>, Object, Unit> function3, Function3<Object, Object, Object, ? extends Object> function32, Object obj2, Object obj3, Function3<? super k<?>, Object, Object, ? extends Function3<? super Throwable, Object, ? super CoroutineContext, Unit>> function33) {
            this.clauseObject = obj;
            this.regFunc = function3;
            this.processResFunc = function32;
            this.param = obj2;
            this.block = obj3;
            this.onCancellationConstructor = function33;
        }

        public final Function3<Throwable, Object, CoroutineContext, Unit> a(k<?> select, Object internalResult) {
            Function3<k<?>, Object, Object, Function3<Throwable, Object, CoroutineContext, Unit>> function3 = this.onCancellationConstructor;
            if (function3 != null) {
                return function3.invoke(select, this.param, internalResult);
            }
            return null;
        }

        public final void b() {
            Object obj = this.disposableHandleOrSegment;
            j<R> jVar = j.this;
            if (obj instanceof AbstractC17628B) {
                ((AbstractC17628B) obj).s(this.indexInSegment, null, jVar.getContext());
                return;
            }
            InterfaceC16643h0 interfaceC16643h0 = obj instanceof InterfaceC16643h0 ? (InterfaceC16643h0) obj : null;
            if (interfaceC16643h0 != null) {
                interfaceC16643h0.dispose();
            }
        }

        public final Object c(Object obj, Continuation<? super R> continuation) {
            Object obj2 = this.block;
            if (this.param == l.i()) {
                Intrinsics.h(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
                return ((Function1) obj2).invoke(continuation);
            }
            Intrinsics.h(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((Function2) obj2).invoke(obj, continuation);
        }

        public final Object d(Object result) {
            return this.processResFunc.invoke(this.clauseObject, this.param, result);
        }

        public final boolean e(j<R> select) {
            this.regFunc.invoke(this.clauseObject, select, this.param);
            return ((j) select).internalResult == l.f173352e;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", l = {453, 456}, m = "doSelectSuspend")
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f173344a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f173345b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j<R> f173346c;

        /* renamed from: d, reason: collision with root package name */
        int f173347d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(j<R> jVar, Continuation<? super b> continuation) {
            super(continuation);
            this.f173346c = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f173345b = obj;
            this.f173347d |= Integer.MIN_VALUE;
            return this.f173346c.q(this);
        }
    }

    private final void k(Object clauseObject) {
        List<j<R>.a> list = this.clauses;
        Intrinsics.g(list);
        List<j<R>.a> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (((a) it.next()).clauseObject == clauseObject) {
                throw new IllegalStateException(("Cannot use select clauses on the same object: " + clauseObject).toString());
            }
        }
    }

    private final void l(j<R>.a selectedClause) {
        List<j<R>.a> list = this.clauses;
        if (list == null) {
            return;
        }
        for (j<R>.a aVar : list) {
            if (aVar != selectedClause) {
                aVar.b();
            }
        }
        f173329f.set(this, l.f173350c);
        this.internalResult = l.f173352e;
        this.clauses = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(kotlin.coroutines.Continuation<? super R> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof zv.j.b
            if (r0 == 0) goto L13
            r0 = r6
            zv.j$b r0 = (zv.j.b) r0
            int r1 = r0.f173347d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f173347d = r1
            goto L18
        L13:
            zv.j$b r0 = new zv.j$b
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f173345b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f173347d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.b(r6)
            return r6
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f173344a
            zv.j r2 = (zv.j) r2
            kotlin.ResultKt.b(r6)
            goto L4b
        L3c:
            kotlin.ResultKt.b(r6)
            r0.f173344a = r5
            r0.f173347d = r4
            java.lang.Object r6 = r5.z(r0)
            if (r6 != r1) goto L4a
            goto L56
        L4a:
            r2 = r5
        L4b:
            r6 = 0
            r0.f173344a = r6
            r0.f173347d = r3
            java.lang.Object r6 = r2.m(r0)
            if (r6 != r1) goto L57
        L56:
            return r1
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zv.j.q(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final j<R>.a r(Object clauseObject) {
        List<j<R>.a> list = this.clauses;
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((a) next).clauseObject == clauseObject) {
                obj = next;
                break;
            }
        }
        j<R>.a aVar = (a) obj;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Clause with object " + clauseObject + " is not found").toString());
    }

    public static /* synthetic */ void v(j jVar, a aVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        jVar.u(aVar, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        r0 = r0.v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (r0 != kotlin.coroutines.intrinsics.IntrinsicsKt.f()) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        kotlin.coroutines.jvm.internal.DebugProbesKt.c(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (r0 != kotlin.coroutines.intrinsics.IntrinsicsKt.f()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        return kotlin.Unit.f142422a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object z(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            qv.p r0 = new qv.p
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.c(r6)
            r2 = 1
            r0.<init>(r1, r2)
            r0.C()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = i()
        L11:
            java.lang.Object r2 = r1.get(r5)
            vv.E r3 = zv.l.g()
            if (r2 != r3) goto L29
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = i()
            boolean r2 = androidx.concurrent.futures.b.a(r3, r5, r2, r0)
            if (r2 == 0) goto L11
            qv.C16662r.c(r0, r5)
            goto L62
        L29:
            boolean r3 = r2 instanceof java.util.List
            if (r3 == 0) goto L4f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = i()
            vv.E r4 = zv.l.g()
            boolean r3 = androidx.concurrent.futures.b.a(r3, r5, r2, r4)
            if (r3 == 0) goto L11
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L41:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L11
            java.lang.Object r3 = r2.next()
            j(r5, r3)
            goto L41
        L4f:
            boolean r1 = r2 instanceof zv.j.a
            if (r1 == 0) goto L79
            kotlin.Unit r1 = kotlin.Unit.f142422a
            zv.j$a r2 = (zv.j.a) r2
            java.lang.Object r3 = h(r5)
            kotlin.jvm.functions.Function3 r2 = r2.a(r5, r3)
            r0.U(r1, r2)
        L62:
            java.lang.Object r0 = r0.v()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            if (r0 != r1) goto L6f
            kotlin.coroutines.jvm.internal.DebugProbesKt.c(r6)
        L6f:
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            if (r0 != r6) goto L76
            return r0
        L76:
            kotlin.Unit r6 = kotlin.Unit.f142422a
            return r6
        L79:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "unexpected state: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zv.j.z(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // zv.d
    public void a(e eVar, Function1<? super Continuation<? super R>, ? extends Object> function1) {
        v(this, new a(eVar.getClauseObject(), eVar.a(), eVar.c(), l.i(), function1, eVar.b()), false, 1, null);
    }

    @Override // zv.d
    public <Q> void b(g<? extends Q> gVar, Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2) {
        v(this, new a(gVar.getClauseObject(), gVar.a(), gVar.c(), null, function2, gVar.b()), false, 1, null);
    }

    @Override // zv.k
    public void d(Object internalResult) {
        this.internalResult = internalResult;
    }

    @Override // qv.h1
    public void f(AbstractC17628B<?> segment, int index) {
        this.disposableHandleOrSegment = segment;
        this.indexInSegment = index;
    }

    @Override // zv.k
    public CoroutineContext getContext() {
        return this.context;
    }

    public void n(InterfaceC16643h0 disposableHandle) {
        this.disposableHandleOrSegment = disposableHandle;
    }

    public j(CoroutineContext coroutineContext) {
        this.context = coroutineContext;
    }

    private final Object m(Continuation<? super R> continuation) {
        Object obj = f173329f.get(this);
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        j<R>.a aVar = (a) obj;
        Object obj2 = this.internalResult;
        l(aVar);
        return aVar.c(aVar.d(obj2), continuation);
    }

    @PublishedApi
    static /* synthetic */ <R> Object p(j<R> jVar, Continuation<? super R> continuation) {
        if (jVar.t()) {
            return jVar.m(continuation);
        }
        return jVar.q(continuation);
    }

    private final boolean t() {
        return f173329f.get(this) instanceof a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(Object clauseObject) {
        j<R>.a aVarR = r(clauseObject);
        Intrinsics.g(aVarR);
        aVarR.disposableHandleOrSegment = null;
        aVarR.indexInSegment = -1;
        u(aVarR, true);
    }

    private final int y(Object clauseObject, Object internalResult) {
        while (true) {
            Object obj = f173329f.get(this);
            if (obj instanceof InterfaceC16654n) {
                j<R>.a aVarR = r(clauseObject);
                if (aVarR == null) {
                    continue;
                } else {
                    Function3<Throwable, Object, CoroutineContext, Unit> function3A = aVarR.a(this, internalResult);
                    if (androidx.concurrent.futures.b.a(f173329f, this, obj, aVarR)) {
                        this.internalResult = internalResult;
                        if (l.j((InterfaceC16654n) obj, function3A)) {
                            return 0;
                        }
                        this.internalResult = l.f173352e;
                        return 2;
                    }
                }
            } else if (!Intrinsics.e(obj, l.f173350c) && !(obj instanceof a)) {
                if (Intrinsics.e(obj, l.f173351d)) {
                    return 2;
                }
                if (Intrinsics.e(obj, l.f173349b)) {
                    if (androidx.concurrent.futures.b.a(f173329f, this, obj, CollectionsKt.e(clauseObject))) {
                        return 1;
                    }
                } else if (obj instanceof List) {
                    if (androidx.concurrent.futures.b.a(f173329f, this, obj, CollectionsKt.Q0((Collection) obj, clauseObject))) {
                        return 1;
                    }
                } else {
                    throw new IllegalStateException(("Unexpected state: " + obj).toString());
                }
            } else {
                return 3;
            }
        }
    }

    @Override // qv.InterfaceC16652m
    public void c(Throwable cause) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f173329f;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == l.f173350c) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, l.f173351d));
        List<j<R>.a> list = this.clauses;
        if (list == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((a) it.next()).b();
        }
        this.internalResult = l.f173352e;
        this.clauses = null;
    }

    @Override // zv.k
    public boolean e(Object clauseObject, Object result) {
        if (y(clauseObject, result) == 0) {
            return true;
        }
        return false;
    }

    @PublishedApi
    public Object o(Continuation<? super R> continuation) {
        return p(this, continuation);
    }

    @JvmName
    public final void u(j<R>.a aVar, boolean z10) {
        if (f173329f.get(this) instanceof a) {
            return;
        }
        if (!z10) {
            k(aVar.clauseObject);
        }
        if (aVar.e(this)) {
            if (!z10) {
                List<j<R>.a> list = this.clauses;
                Intrinsics.g(list);
                list.add(aVar);
            }
            aVar.disposableHandleOrSegment = this.disposableHandleOrSegment;
            aVar.indexInSegment = this.indexInSegment;
            this.disposableHandleOrSegment = null;
            this.indexInSegment = -1;
            return;
        }
        f173329f.set(this, aVar);
    }

    public final m x(Object clauseObject, Object result) {
        return l.a(y(clauseObject, result));
    }
}
