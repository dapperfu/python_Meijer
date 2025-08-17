package androidx.room;

import android.content.Context;
import android.content.Intent;
import androidx.view.AbstractC5985A;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.InterfaceC16622O;
import tv.C17154h;
import tv.InterfaceC17152f;
import v4.C17496b;
import z4.InterfaceC18380b;

@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 G2\u00020\u0001:\u0002IEBX\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u001d\u0010\t\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\b\b0\u0004\u0012\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\n\"\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0007H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0000¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u000eH\u0080@¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u000eH\u0001¢\u0006\u0004\b(\u0010\u0010J\r\u0010)\u001a\u00020\u000e¢\u0006\u0004\b)\u0010\u0010J9\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070,2\u0012\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\n\"\u00020\u00052\b\b\u0002\u0010+\u001a\u00020\u0013H\u0007¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b1\u00100J\u0017\u00102\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b2\u00100J\u0017\u00103\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b3\u00100J\u000f\u00104\u001a\u00020\u000eH\u0016¢\u0006\u0004\b4\u0010\u0010J\u001d\u00105\u001a\u00020\u000e2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0000¢\u0006\u0004\b5\u0010\u001dJC\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:\"\u0004\b\u0000\u001062\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\n2\u0006\u00107\u001a\u00020\u00132\u000e\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u000008H\u0017¢\u0006\u0004\b;\u0010<J'\u0010B\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020\u00052\u0006\u0010A\u001a\u00020@H\u0000¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u000eH\u0000¢\u0006\u0004\bD\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR+\u0010\t\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\b\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010JR\"\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR \u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020U0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010JR\u0018\u0010\\\u001a\u00060Xj\u0002`Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010]R\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020\u000e0^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010_R\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020\u000e0^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010_R\u0014\u0010d\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010cR\u0018\u0010f\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010eR\u0018\u0010i\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010hR\u0014\u0010k\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010j¨\u0006l"}, d2 = {"Landroidx/room/q;", "", "Landroidx/room/G;", "database", "", "", "shadowTablesMap", "", "Lkotlin/jvm/JvmSuppressWildcards;", "viewTables", "", "tableNames", "<init>", "(Landroidx/room/G;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V", "", "u", "()V", "Landroidx/room/q$b;", "observer", "", "i", "(Landroidx/room/q$b;)Z", "A", "", "n", "()Ljava/util/List;", "", "tableIds", "s", "(Ljava/util/Set;)V", "Lv4/b;", "autoCloser", "B", "(Lv4/b;)V", "Lz4/b;", "connection", "r", "(Lz4/b;)V", "D", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "E", "x", "tables", "emitInitialState", "Ltv/f;", "l", "([Ljava/lang/String;Z)Ltv/f;", "h", "(Landroidx/room/q$b;)V", "j", "k", "z", "y", "t", "T", "inTransaction", "Ljava/util/concurrent/Callable;", "computeFunction", "Landroidx/lifecycle/A;", "m", "([Ljava/lang/String;ZLjava/util/concurrent/Callable;)Landroidx/lifecycle/A;", "Landroid/content/Context;", "context", "name", "Landroid/content/Intent;", "serviceIntent", "q", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V", "C", "a", "Landroidx/room/G;", "o", "()Landroidx/room/G;", "b", "Ljava/util/Map;", "c", "d", "[Ljava/lang/String;", "p", "()[Ljava/lang/String;", "Landroidx/room/c0;", "e", "Landroidx/room/c0;", "implementation", "", "Landroidx/room/u;", "f", "observerMap", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroidx/room/concurrent/ReentrantLock;", "g", "Ljava/util/concurrent/locks/ReentrantLock;", "observerMapLock", "Lv4/b;", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "onRefreshScheduled", "onRefreshCompleted", "Landroidx/room/m;", "Landroidx/room/m;", "invalidationLiveDataContainer", "Landroid/content/Intent;", "multiInstanceInvalidationIntent", "Landroidx/room/r;", "Landroidx/room/r;", "multiInstanceInvalidationClient", "Ljava/lang/Object;", "trackerLock", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.room.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6131q {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final G database;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, String> shadowTablesMap;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Set<String>> viewTables;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String[] tableNames;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final c0 implementation;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Map<b, C6134u> observerMap;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ReentrantLock observerMapLock;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private C17496b autoCloser;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> onRefreshScheduled;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> onRefreshCompleted;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final C6127m invalidationLiveDataContainer;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private Intent multiInstanceInvalidationIntent;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private r multiInstanceInvalidationClient;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Object trackerLock;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/room/q$b;", "", "", "", "tables", "<init>", "([Ljava/lang/String;)V", "", "", "c", "(Ljava/util/Set;)V", "a", "[Ljava/lang/String;", "()[Ljava/lang/String;", "", "b", "()Z", "isRemote", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.room.q$b */
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String[] tables;

        public boolean b() {
            return false;
        }

        public abstract void c(Set<String> tables);

        public b(String[] tables) {
            Intrinsics.j(tables, "tables");
            this.tables = tables;
        }

        /* renamed from: a, reason: from getter */
        public final String[] getTables() {
            return this.tables;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.room.InvalidationTracker$addObserver$1", f = "InvalidationTracker.android.kt", l = {253}, m = "invokeSuspend")
    /* renamed from: androidx.room.q$c */
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f58604a;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C6131q.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f58604a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                c0 c0Var = C6131q.this.implementation;
                this.f58604a = 1;
                if (c0Var.x(this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.room.q$d */
    /* synthetic */ class d extends FunctionReferenceImpl implements Function1<Set<? extends Integer>, Unit> {
        d(Object obj) {
            super(1, obj, C6131q.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0);
        }

        public final void a(Set<Integer> p02) {
            Intrinsics.j(p02, "p0");
            ((C6131q) this.receiver).s(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Set<? extends Integer> set) {
            a(set);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.room.InvalidationTracker$removeObserver$1", f = "InvalidationTracker.android.kt", l = {310}, m = "invokeSuspend")
    /* renamed from: androidx.room.q$e */
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f58606a;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C6131q.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f58606a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                c0 c0Var = C6131q.this.implementation;
                this.f58606a = 1;
                if (c0Var.x(this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.room.q$f */
    /* synthetic */ class f extends FunctionReferenceImpl implements Function0<Unit> {
        f(Object obj) {
            super(0, obj, C6131q.class, "onAutoCloseCallback", "onAutoCloseCallback()V", 0);
        }

        public final void a() {
            ((C6131q) this.receiver).u();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.room.InvalidationTracker$syncBlocking$1", f = "InvalidationTracker.android.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
    /* renamed from: androidx.room.q$g */
    static final class g extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f58608a;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C6131q.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f58608a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C6131q c6131q = C6131q.this;
                this.f58608a = 1;
                if (c6131q.D(this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    public C6131q(G database, Map<String, String> shadowTablesMap, Map<String, Set<String>> viewTables, String... tableNames) {
        Intrinsics.j(database, "database");
        Intrinsics.j(shadowTablesMap, "shadowTablesMap");
        Intrinsics.j(viewTables, "viewTables");
        Intrinsics.j(tableNames, "tableNames");
        this.database = database;
        this.shadowTablesMap = shadowTablesMap;
        this.viewTables = viewTables;
        this.tableNames = tableNames;
        c0 c0Var = new c0(database, shadowTablesMap, viewTables, tableNames, database.getUseTempTrackingTable(), new d(this));
        this.implementation = c0Var;
        this.observerMap = new LinkedHashMap();
        this.observerMapLock = new ReentrantLock();
        this.onRefreshScheduled = new Function0() { // from class: androidx.room.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C6131q.w(this.f58585a);
            }
        };
        this.onRefreshCompleted = new Function0() { // from class: androidx.room.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C6131q.v(this.f58586a);
            }
        };
        this.invalidationLiveDataContainer = new C6127m(database);
        this.trackerLock = new Object();
        c0Var.u(new Function0() { // from class: androidx.room.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C6131q.d(this.f58587a));
            }
        });
    }

    private final boolean A(b observer) {
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            C6134u c6134uRemove = this.observerMap.remove(observer);
            return c6134uRemove != null && this.implementation.q(c6134uRemove.getTableIds());
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(C6131q c6131q) {
        return !c6131q.database.inCompatibilityMode$room_runtime_release() || c6131q.database.isOpenInternal();
    }

    private final boolean i(b observer) {
        Pair<String[], int[]> pairY = this.implementation.y(observer.getTables());
        String[] strArrA = pairY.a();
        int[] iArrB = pairY.b();
        C6134u c6134u = new C6134u(observer, iArrB, strArrA);
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            C6134u c6134uPut = this.observerMap.containsKey(observer) ? (C6134u) MapsKt.l(this.observerMap, observer) : this.observerMap.put(observer, c6134u);
            reentrantLock.unlock();
            return c6134uPut == null && this.implementation.p(iArrB);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    private final List<b> n() {
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            return CollectionsKt.j1(this.observerMap.keySet());
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(Set<Integer> tableIds) {
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            List listJ1 = CollectionsKt.j1(this.observerMap.values());
            reentrantLock.unlock();
            Iterator it = listJ1.iterator();
            while (it.hasNext()) {
                ((C6134u) it.next()).c(tableIds);
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        synchronized (this.trackerLock) {
            try {
                r rVar = this.multiInstanceInvalidationClient;
                if (rVar != null) {
                    List<b> listN = n();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listN) {
                        if (!((b) obj).b()) {
                            arrayList.add(obj);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        rVar.l();
                    }
                }
                this.implementation.s();
                Unit unit = Unit.f142422a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(C6131q c6131q) {
        C17496b c17496b = c6131q.autoCloser;
        if (c17496b != null) {
            c17496b.g();
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(C6131q c6131q) {
        C17496b c17496b = c6131q.autoCloser;
        if (c17496b != null) {
            c17496b.j();
        }
        return Unit.f142422a;
    }

    public final void B(C17496b autoCloser) {
        Intrinsics.j(autoCloser, "autoCloser");
        this.autoCloser = autoCloser;
        autoCloser.n(new f(this));
    }

    public final void C() {
        r rVar = this.multiInstanceInvalidationClient;
        if (rVar != null) {
            rVar.l();
        }
    }

    public final Object D(Continuation<? super Unit> continuation) throws Throwable {
        if (this.database.inCompatibilityMode$room_runtime_release() && !this.database.isOpenInternal()) {
            return Unit.f142422a;
        }
        Object objX = this.implementation.x(continuation);
        return objX == IntrinsicsKt.f() ? objX : Unit.f142422a;
    }

    public final void E() {
        s4.n.a(new g(null));
    }

    public void h(b observer) {
        Intrinsics.j(observer, "observer");
        if (i(observer)) {
            s4.n.a(new c(null));
        }
    }

    public final void j(b observer) {
        Intrinsics.j(observer, "observer");
        if (!observer.b()) {
            throw new IllegalStateException("isRemote was false of observer argument");
        }
        i(observer);
    }

    public void k(b observer) {
        Intrinsics.j(observer, "observer");
        h(new d0(this, observer));
    }

    @JvmOverloads
    public final InterfaceC17152f<Set<String>> l(String[] tables, boolean emitInitialState) {
        Intrinsics.j(tables, "tables");
        Pair<String[], int[]> pairY = this.implementation.y(tables);
        String[] strArrA = pairY.a();
        InterfaceC17152f<Set<String>> interfaceC17152fM = this.implementation.m(strArrA, pairY.b(), emitInitialState);
        r rVar = this.multiInstanceInvalidationClient;
        InterfaceC17152f<Set<String>> interfaceC17152fH = rVar != null ? rVar.h(strArrA) : null;
        return interfaceC17152fH != null ? C17154h.M(interfaceC17152fM, interfaceC17152fH) : interfaceC17152fM;
    }

    public <T> AbstractC5985A<T> m(String[] tableNames, boolean inTransaction, Callable<T> computeFunction) {
        Intrinsics.j(tableNames, "tableNames");
        Intrinsics.j(computeFunction, "computeFunction");
        this.implementation.y(tableNames);
        return this.invalidationLiveDataContainer.a(tableNames, inTransaction, computeFunction);
    }

    /* renamed from: o, reason: from getter */
    public final G getDatabase() {
        return this.database;
    }

    /* renamed from: p, reason: from getter */
    public final String[] getTableNames() {
        return this.tableNames;
    }

    public final void q(Context context, String name, Intent serviceIntent) {
        Intrinsics.j(context, "context");
        Intrinsics.j(name, "name");
        Intrinsics.j(serviceIntent, "serviceIntent");
        this.multiInstanceInvalidationIntent = serviceIntent;
        this.multiInstanceInvalidationClient = new r(context, name, this);
    }

    public final void r(InterfaceC18380b connection) {
        Intrinsics.j(connection, "connection");
        this.implementation.l(connection);
        synchronized (this.trackerLock) {
            try {
                r rVar = this.multiInstanceInvalidationClient;
                if (rVar != null) {
                    Intent intent = this.multiInstanceInvalidationIntent;
                    if (intent == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    rVar.k(intent);
                    Unit unit = Unit.f142422a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void t(Set<String> tables) {
        Intrinsics.j(tables, "tables");
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            List<C6134u> listJ1 = CollectionsKt.j1(this.observerMap.values());
            reentrantLock.unlock();
            for (C6134u c6134u : listJ1) {
                if (!c6134u.getObserver().b()) {
                    c6134u.d(tables);
                }
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void x() {
        this.implementation.r(this.onRefreshScheduled, this.onRefreshCompleted);
    }

    public void y() {
        this.implementation.r(this.onRefreshScheduled, this.onRefreshCompleted);
    }

    public void z(b observer) {
        Intrinsics.j(observer, "observer");
        if (A(observer)) {
            s4.n.a(new e(null));
        }
    }
}
