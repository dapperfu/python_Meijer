package s4;

import android.database.SQLException;
import androidx.room.W;
import androidx.room.X;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import io.constructor.data.local.PreferencesHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import r4.C16836d;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0003-! B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJO\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2-\u0010\u0011\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f¢\u0006\u0002\b\u0010H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J2\u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0006\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00028\u00000\u001cH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJM\u0010 \u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0006\u0010\u000b\u001a\u00020\n2-\u0010\u0011\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f¢\u0006\u0002\b\u0010H\u0096@¢\u0006\u0004\b \u0010\u0013J\u0010\u0010!\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0014¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b \u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00103\u001a\u000600j\u0002`18\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00102R\u0014\u00105\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u0010*R\u0014\u00108\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u00107¨\u00069"}, d2 = {"Ls4/l;", "Landroidx/room/X;", "Ls4/m;", "Ls4/i;", "delegate", "", "isReadOnly", "<init>", "(Ls4/i;Z)V", "R", "Landroidx/room/X$a;", "type", "Lkotlin/Function2;", "Landroidx/room/W;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "o", "(Landroidx/room/X$a;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "i", "(Landroidx/room/X$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "success", "j", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "sql", "Lkotlin/Function1;", "LA4/d;", "d", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "n", "()V", "Ls4/i;", "k", "()Ls4/i;", "Z", "l", "()Z", "Lkotlin/collections/ArrayDeque;", "Ls4/l$c;", "c", "Lkotlin/collections/ArrayDeque;", "transactionStack", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroidx/room/concurrent/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "_isRecycled", "m", "isRecycled", "LA4/b;", "()LA4/b;", "rawConnection", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
final class l implements X, m {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C17018i delegate;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isReadOnly;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ArrayDeque<c> transactionStack;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean _isRecycled;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010\u0019J\u000f\u0010 \u001a\u00020\u001aH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\tH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010#R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"Ls4/l$a;", "LA4/d;", "delegate", "<init>", "(Ls4/l;LA4/d;)V", "", "index", "", "value", "", "o", "(ID)V", "", "C", "(IJ)V", "", "u0", "(ILjava/lang/String;)V", "I", "(I)V", "getDouble", "(I)D", "getLong", "(I)J", "O2", "(I)Ljava/lang/String;", "", "isNull", "(I)Z", "getColumnCount", "()I", "getColumnName", "N3", "()Z", "reset", "()V", "close", "a", "LA4/d;", "b", "J", "threadId", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    private final class a implements A4.d {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final A4.d delegate;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long threadId;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f160018c;

        public a(l lVar, A4.d delegate) {
            Intrinsics.j(delegate, "delegate");
            this.f160018c = lVar;
            this.delegate = delegate;
            this.threadId = C16836d.b();
        }

        @Override // A4.d
        public void C(int index, long value) {
            if (this.f160018c.m()) {
                A4.a.b(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == C16836d.b()) {
                this.delegate.C(index, value);
            } else {
                A4.a.b(21, "Attempted to use statement on a different thread");
                throw new KotlinNothingValueException();
            }
        }

        @Override // A4.d
        public void I(int index) {
            if (this.f160018c.m()) {
                A4.a.b(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == C16836d.b()) {
                this.delegate.I(index);
            } else {
                A4.a.b(21, "Attempted to use statement on a different thread");
                throw new KotlinNothingValueException();
            }
        }

        @Override // A4.d
        public boolean N3() {
            if (this.f160018c.m()) {
                A4.a.b(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == C16836d.b()) {
                return this.delegate.N3();
            }
            A4.a.b(21, "Attempted to use statement on a different thread");
            throw new KotlinNothingValueException();
        }

        @Override // A4.d
        public String O2(int index) {
            if (this.f160018c.m()) {
                A4.a.b(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == C16836d.b()) {
                return this.delegate.O2(index);
            }
            A4.a.b(21, "Attempted to use statement on a different thread");
            throw new KotlinNothingValueException();
        }

        @Override // A4.d, java.lang.AutoCloseable
        public void close() {
            if (this.f160018c.m()) {
                A4.a.b(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == C16836d.b()) {
                this.delegate.close();
            } else {
                A4.a.b(21, "Attempted to use statement on a different thread");
                throw new KotlinNothingValueException();
            }
        }

        @Override // A4.d
        public int getColumnCount() {
            if (this.f160018c.m()) {
                A4.a.b(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == C16836d.b()) {
                return this.delegate.getColumnCount();
            }
            A4.a.b(21, "Attempted to use statement on a different thread");
            throw new KotlinNothingValueException();
        }

        @Override // A4.d
        public String getColumnName(int index) {
            if (this.f160018c.m()) {
                A4.a.b(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == C16836d.b()) {
                return this.delegate.getColumnName(index);
            }
            A4.a.b(21, "Attempted to use statement on a different thread");
            throw new KotlinNothingValueException();
        }

        @Override // A4.d
        public double getDouble(int index) {
            if (this.f160018c.m()) {
                A4.a.b(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == C16836d.b()) {
                return this.delegate.getDouble(index);
            }
            A4.a.b(21, "Attempted to use statement on a different thread");
            throw new KotlinNothingValueException();
        }

        @Override // A4.d
        public long getLong(int index) {
            if (this.f160018c.m()) {
                A4.a.b(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == C16836d.b()) {
                return this.delegate.getLong(index);
            }
            A4.a.b(21, "Attempted to use statement on a different thread");
            throw new KotlinNothingValueException();
        }

        @Override // A4.d
        public boolean isNull(int index) {
            if (this.f160018c.m()) {
                A4.a.b(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == C16836d.b()) {
                return this.delegate.isNull(index);
            }
            A4.a.b(21, "Attempted to use statement on a different thread");
            throw new KotlinNothingValueException();
        }

        @Override // A4.d
        public void o(int index, double value) {
            if (this.f160018c.m()) {
                A4.a.b(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == C16836d.b()) {
                this.delegate.o(index, value);
            } else {
                A4.a.b(21, "Attempted to use statement on a different thread");
                throw new KotlinNothingValueException();
            }
        }

        @Override // A4.d
        public void reset() {
            if (this.f160018c.m()) {
                A4.a.b(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == C16836d.b()) {
                this.delegate.reset();
            } else {
                A4.a.b(21, "Attempted to use statement on a different thread");
                throw new KotlinNothingValueException();
            }
        }

        @Override // A4.d
        public void u0(int index, String value) {
            Intrinsics.j(value, "value");
            if (this.f160018c.m()) {
                A4.a.b(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == C16836d.b()) {
                this.delegate.u0(index, value);
            } else {
                A4.a.b(21, "Attempted to use statement on a different thread");
                throw new KotlinNothingValueException();
            }
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\f\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00010\tH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Ls4/l$b;", "T", "Landroidx/room/W;", "Ls4/m;", "<init>", "(Ls4/l;)V", "R", "", "sql", "Lkotlin/Function1;", "LA4/d;", "block", "d", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LA4/b;", "c", "()LA4/b;", "rawConnection", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    private final class b<T> implements W<T>, m {
        public b() {
        }

        @Override // s4.m
        public A4.b c() {
            return l.this.c();
        }

        @Override // androidx.room.InterfaceC6277v
        public <R> Object d(String str, Function1<? super A4.d, ? extends R> function1, Continuation<? super R> continuation) {
            return l.this.d(str, function1, continuation);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ls4/l$c;", "", "", PreferencesHelper.PREF_ID, "", "shouldRollback", "<init>", "(IZ)V", "a", "I", "()I", "b", "Z", "()Z", "setShouldRollback", "(Z)V", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int id;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean shouldRollback;

        /* renamed from: a, reason: from getter */
        public final int getId() {
            return this.id;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getShouldRollback() {
            return this.shouldRollback;
        }

        public c(int i10, boolean z10) {
            this.id = i10;
            this.shouldRollback = z10;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", l = {562}, m = "beginTransaction")
    static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f160022a;

        /* renamed from: b, reason: collision with root package name */
        Object f160023b;

        /* renamed from: c, reason: collision with root package name */
        Object f160024c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f160025d;

        /* renamed from: f, reason: collision with root package name */
        int f160027f;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f160025d = obj;
            this.f160027f |= Integer.MIN_VALUE;
            return l.this.i(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", l = {562}, m = "endTransaction")
    static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f160028a;

        /* renamed from: b, reason: collision with root package name */
        Object f160029b;

        /* renamed from: c, reason: collision with root package name */
        boolean f160030c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f160031d;

        /* renamed from: f, reason: collision with root package name */
        int f160033f;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f160031d = obj;
            this.f160033f |= Integer.MIN_VALUE;
            return l.this.j(false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", l = {395, 399, HttpResponseStatus.ERROR_PRECONDITION_FAILED, HttpResponseStatus.ERROR_PRECONDITION_FAILED, HttpResponseStatus.ERROR_PRECONDITION_FAILED}, m = "transaction")
    static final class g<R> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f160034a;

        /* renamed from: b, reason: collision with root package name */
        Object f160035b;

        /* renamed from: c, reason: collision with root package name */
        int f160036c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f160037d;

        /* renamed from: f, reason: collision with root package name */
        int f160039f;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f160037d = obj;
            this.f160039f |= Integer.MIN_VALUE;
            return l.this.o(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", l = {573}, m = "usePrepared")
    static final class h<R> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f160040a;

        /* renamed from: b, reason: collision with root package name */
        Object f160041b;

        /* renamed from: c, reason: collision with root package name */
        Object f160042c;

        /* renamed from: d, reason: collision with root package name */
        Object f160043d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f160044e;

        /* renamed from: g, reason: collision with root package name */
        int f160046g;

        h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f160044e = obj;
            this.f160046g |= Integer.MIN_VALUE;
            return l.this.d(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[X.a.values().length];
            try {
                iArr[X.a.f58660a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[X.a.f58661b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[X.a.f58662c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public l(C17018i delegate, boolean z10) {
        Intrinsics.j(delegate, "delegate");
        this.delegate = delegate;
        this.isReadOnly = z10;
        this.transactionStack = new ArrayDeque<>();
        this._isRecycled = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v14, types: [wv.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(androidx.room.X.a r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof s4.l.e
            if (r0 == 0) goto L13
            r0 = r7
            s4.l$e r0 = (s4.l.e) r0
            int r1 = r0.f160027f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f160027f = r1
            goto L18
        L13:
            s4.l$e r0 = new s4.l$e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f160025d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f160027f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r6 = r0.f160024c
            wv.a r6 = (wv.InterfaceC17929a) r6
            java.lang.Object r1 = r0.f160023b
            androidx.room.X$a r1 = (androidx.room.X.a) r1
            java.lang.Object r0 = r0.f160022a
            s4.l r0 = (s4.l) r0
            kotlin.ResultKt.b(r7)
            r7 = r6
            r6 = r1
            goto L55
        L38:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L40:
            kotlin.ResultKt.b(r7)
            s4.i r7 = r5.delegate
            r0.f160022a = r5
            r0.f160023b = r6
            r0.f160024c = r7
            r0.f160027f = r3
            java.lang.Object r0 = r7.g(r4, r0)
            if (r0 != r1) goto L54
            return r1
        L54:
            r0 = r5
        L55:
            kotlin.collections.ArrayDeque<s4.l$c> r1 = r0.transactionStack     // Catch: java.lang.Throwable -> L7b
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L7b
            kotlin.collections.ArrayDeque<s4.l$c> r2 = r0.transactionStack     // Catch: java.lang.Throwable -> L7b
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L7b
            if (r2 == 0) goto L93
            int[] r2 = s4.l.d.$EnumSwitchMapping$0     // Catch: java.lang.Throwable -> L7b
            int r6 = r6.ordinal()     // Catch: java.lang.Throwable -> L7b
            r6 = r2[r6]     // Catch: java.lang.Throwable -> L7b
            if (r6 == r3) goto L8b
            r2 = 2
            if (r6 == r2) goto L83
            r2 = 3
            if (r6 != r2) goto L7d
            s4.i r6 = r0.delegate     // Catch: java.lang.Throwable -> L7b
            java.lang.String r2 = "BEGIN EXCLUSIVE TRANSACTION"
            A4.a.a(r6, r2)     // Catch: java.lang.Throwable -> L7b
            goto Lae
        L7b:
            r6 = move-exception
            goto Lbf
        L7d:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Throwable -> L7b
            r6.<init>()     // Catch: java.lang.Throwable -> L7b
            throw r6     // Catch: java.lang.Throwable -> L7b
        L83:
            s4.i r6 = r0.delegate     // Catch: java.lang.Throwable -> L7b
            java.lang.String r2 = "BEGIN IMMEDIATE TRANSACTION"
            A4.a.a(r6, r2)     // Catch: java.lang.Throwable -> L7b
            goto Lae
        L8b:
            s4.i r6 = r0.delegate     // Catch: java.lang.Throwable -> L7b
            java.lang.String r2 = "BEGIN DEFERRED TRANSACTION"
            A4.a.a(r6, r2)     // Catch: java.lang.Throwable -> L7b
            goto Lae
        L93:
            s4.i r6 = r0.delegate     // Catch: java.lang.Throwable -> L7b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7b
            r2.<init>()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = "SAVEPOINT '"
            r2.append(r3)     // Catch: java.lang.Throwable -> L7b
            r2.append(r1)     // Catch: java.lang.Throwable -> L7b
            r3 = 39
            r2.append(r3)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L7b
            A4.a.a(r6, r2)     // Catch: java.lang.Throwable -> L7b
        Lae:
            kotlin.collections.ArrayDeque<s4.l$c> r6 = r0.transactionStack     // Catch: java.lang.Throwable -> L7b
            s4.l$c r0 = new s4.l$c     // Catch: java.lang.Throwable -> L7b
            r2 = 0
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L7b
            r6.addLast(r0)     // Catch: java.lang.Throwable -> L7b
            kotlin.Unit r6 = kotlin.Unit.f143329a     // Catch: java.lang.Throwable -> L7b
            r7.h(r4)
            return r6
        Lbf:
            r7.h(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.l.i(androidx.room.X$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(boolean r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof s4.l.f
            if (r0 == 0) goto L13
            r0 = r7
            s4.l$f r0 = (s4.l.f) r0
            int r1 = r0.f160033f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f160033f = r1
            goto L18
        L13:
            s4.l$f r0 = new s4.l$f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f160031d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f160033f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            boolean r6 = r0.f160030c
            java.lang.Object r1 = r0.f160029b
            wv.a r1 = (wv.InterfaceC17929a) r1
            java.lang.Object r0 = r0.f160028a
            s4.l r0 = (s4.l) r0
            kotlin.ResultKt.b(r7)
            goto L52
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            kotlin.ResultKt.b(r7)
            s4.i r7 = r5.delegate
            r0.f160028a = r5
            r0.f160029b = r7
            r0.f160030c = r6
            r0.f160033f = r3
            java.lang.Object r0 = r7.g(r4, r0)
            if (r0 != r1) goto L50
            return r1
        L50:
            r0 = r5
            r1 = r7
        L52:
            kotlin.collections.ArrayDeque<s4.l$c> r7 = r0.transactionStack     // Catch: java.lang.Throwable -> L7c
            boolean r7 = r7.isEmpty()     // Catch: java.lang.Throwable -> L7c
            if (r7 != 0) goto Lcf
            kotlin.collections.ArrayDeque<s4.l$c> r7 = r0.transactionStack     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r7 = kotlin.collections.CollectionsKt.M(r7)     // Catch: java.lang.Throwable -> L7c
            s4.l$c r7 = (s4.l.c) r7     // Catch: java.lang.Throwable -> L7c
            r2 = 39
            if (r6 == 0) goto L9c
            boolean r6 = r7.getShouldRollback()     // Catch: java.lang.Throwable -> L7c
            if (r6 != 0) goto L9c
            kotlin.collections.ArrayDeque<s4.l$c> r6 = r0.transactionStack     // Catch: java.lang.Throwable -> L7c
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L7c
            if (r6 == 0) goto L7e
            s4.i r6 = r0.delegate     // Catch: java.lang.Throwable -> L7c
            java.lang.String r7 = "END TRANSACTION"
            A4.a.a(r6, r7)     // Catch: java.lang.Throwable -> L7c
            goto Lc9
        L7c:
            r6 = move-exception
            goto Ld7
        L7e:
            s4.i r6 = r0.delegate     // Catch: java.lang.Throwable -> L7c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            r0.<init>()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r3 = "RELEASE SAVEPOINT '"
            r0.append(r3)     // Catch: java.lang.Throwable -> L7c
            int r7 = r7.getId()     // Catch: java.lang.Throwable -> L7c
            r0.append(r7)     // Catch: java.lang.Throwable -> L7c
            r0.append(r2)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r7 = r0.toString()     // Catch: java.lang.Throwable -> L7c
            A4.a.a(r6, r7)     // Catch: java.lang.Throwable -> L7c
            goto Lc9
        L9c:
            kotlin.collections.ArrayDeque<s4.l$c> r6 = r0.transactionStack     // Catch: java.lang.Throwable -> L7c
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L7c
            if (r6 == 0) goto Lac
            s4.i r6 = r0.delegate     // Catch: java.lang.Throwable -> L7c
            java.lang.String r7 = "ROLLBACK TRANSACTION"
            A4.a.a(r6, r7)     // Catch: java.lang.Throwable -> L7c
            goto Lc9
        Lac:
            s4.i r6 = r0.delegate     // Catch: java.lang.Throwable -> L7c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            r0.<init>()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r3 = "ROLLBACK TRANSACTION TO SAVEPOINT '"
            r0.append(r3)     // Catch: java.lang.Throwable -> L7c
            int r7 = r7.getId()     // Catch: java.lang.Throwable -> L7c
            r0.append(r7)     // Catch: java.lang.Throwable -> L7c
            r0.append(r2)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r7 = r0.toString()     // Catch: java.lang.Throwable -> L7c
            A4.a.a(r6, r7)     // Catch: java.lang.Throwable -> L7c
        Lc9:
            kotlin.Unit r6 = kotlin.Unit.f143329a     // Catch: java.lang.Throwable -> L7c
            r1.h(r4)
            return r6
        Lcf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L7c
            java.lang.String r7 = "Not in a transaction"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L7c
            throw r6     // Catch: java.lang.Throwable -> L7c
        Ld7:
            r1.h(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.l.j(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean m() {
        return this._isRecycled.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(1:(2:22|23)(1:(2:15|16)(4:17|78|18|68)))(6:24|80|25|(1:42)|43|(1:63)(1:46)))(1:29))(5:30|(1:32)|33|(1:36)|63)|76|37|(4:40|(0)|43|(0))|63|(2:(1:71)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a4, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a5, code lost:
    
        r13 = r12;
        r12 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ac, code lost:
    
        r12 = r12.getResult();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b2, code lost:
    
        r0.f160034a = r12;
        r0.f160035b = null;
        r0.f160039f = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bc, code lost:
    
        if (r13.j(false, r0) == r1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bf, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c2, code lost:
    
        throw r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c3, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c4, code lost:
    
        r9 = r12;
        r12 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c6, code lost:
    
        r0.f160034a = r9;
        r0.f160035b = r12;
        r0.f160039f = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d0, code lost:
    
        if (r13.j(false, r0) != r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d3, code lost:
    
        r14 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d4, code lost:
    
        r13 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d7, code lost:
    
        kotlin.ExceptionsKt.a(r13, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00db, code lost:
    
        throw r14;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ac A[Catch: all -> 0x00c0, TRY_LEAVE, TryCatch #1 {all -> 0x00c0, blocks: (B:49:0x00a8, B:51:0x00ac), top: B:72:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <R> java.lang.Object o(androidx.room.X.a r12, kotlin.jvm.functions.Function2<? super androidx.room.W<R>, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r13, kotlin.coroutines.Continuation<? super R> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.l.o(androidx.room.X$a, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // s4.m
    public A4.b c() {
        return this.delegate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v12, types: [wv.a] */
    @Override // androidx.room.InterfaceC6277v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <R> java.lang.Object d(java.lang.String r7, kotlin.jvm.functions.Function1<? super A4.d, ? extends R> r8, kotlin.coroutines.Continuation<? super R> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof s4.l.h
            if (r0 == 0) goto L13
            r0 = r9
            s4.l$h r0 = (s4.l.h) r0
            int r1 = r0.f160046g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f160046g = r1
            goto L18
        L13:
            s4.l$h r0 = new s4.l$h
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f160044e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f160046g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r7 = r0.f160043d
            wv.a r7 = (wv.InterfaceC17929a) r7
            java.lang.Object r8 = r0.f160042c
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            java.lang.Object r1 = r0.f160041b
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f160040a
            s4.l r0 = (s4.l) r0
            kotlin.ResultKt.b(r9)
            r9 = r7
            r7 = r1
            goto L77
        L3c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L44:
            kotlin.ResultKt.b(r9)
            boolean r9 = g(r6)
            r2 = 21
            if (r9 != 0) goto La5
            kotlin.coroutines.CoroutineContext r9 = r0.getF143270a()
            s4.a$a r5 = s4.C17010a.INSTANCE
            kotlin.coroutines.CoroutineContext$Element r9 = r9.g(r5)
            s4.a r9 = (s4.C17010a) r9
            if (r9 == 0) goto L9a
            s4.l r9 = r9.getConnectionWrapper()
            if (r9 != r6) goto L9a
            s4.i r9 = r6.delegate
            r0.f160040a = r6
            r0.f160041b = r7
            r0.f160042c = r8
            r0.f160043d = r9
            r0.f160046g = r3
            java.lang.Object r0 = r9.g(r4, r0)
            if (r0 != r1) goto L76
            return r1
        L76:
            r0 = r6
        L77:
            s4.l$a r1 = new s4.l$a     // Catch: java.lang.Throwable -> L8d
            s4.i r2 = r0.delegate     // Catch: java.lang.Throwable -> L8d
            A4.d r7 = r2.S3(r7)     // Catch: java.lang.Throwable -> L8d
            r1.<init>(r0, r7)     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r7 = r8.invoke(r1)     // Catch: java.lang.Throwable -> L8f
            kotlin.jdk7.AutoCloseableKt.a(r1, r4)     // Catch: java.lang.Throwable -> L8d
            r9.h(r4)
            return r7
        L8d:
            r7 = move-exception
            goto L96
        L8f:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L91
        L91:
            r8 = move-exception
            kotlin.jdk7.AutoCloseableKt.a(r1, r7)     // Catch: java.lang.Throwable -> L8d
            throw r8     // Catch: java.lang.Throwable -> L8d
        L96:
            r9.h(r4)
            throw r7
        L9a:
            java.lang.String r7 = "Attempted to use connection on a different coroutine"
            A4.a.b(r2, r7)
            kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException
            r7.<init>()
            throw r7
        La5:
            java.lang.String r7 = "Connection is recycled"
            A4.a.b(r2, r7)
            kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.l.d(java.lang.String, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: k, reason: from getter */
    public final C17018i getDelegate() {
        return this.delegate;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getIsReadOnly() {
        return this.isReadOnly;
    }

    public final void n() {
        if (this._isRecycled.compareAndSet(false, true)) {
            try {
                A4.a.a(this.delegate, "ROLLBACK TRANSACTION");
            } catch (SQLException unused) {
            }
        }
    }

    @Override // androidx.room.X
    public <R> Object a(X.a aVar, Function2<? super W<R>, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        if (!m()) {
            C17010a c17010a = (C17010a) continuation.getF143270a().g(C17010a.INSTANCE);
            if (c17010a != null && c17010a.getConnectionWrapper() == this) {
                return o(aVar, function2, continuation);
            }
            A4.a.b(21, "Attempted to use connection on a different coroutine");
            throw new KotlinNothingValueException();
        }
        A4.a.b(21, "Connection is recycled");
        throw new KotlinNothingValueException();
    }

    @Override // androidx.room.X
    public Object b(Continuation<? super Boolean> continuation) {
        if (!m()) {
            C17010a c17010a = (C17010a) continuation.getF143270a().g(C17010a.INSTANCE);
            if (c17010a != null && c17010a.getConnectionWrapper() == this) {
                return Boxing.a(!this.transactionStack.isEmpty());
            }
            A4.a.b(21, "Attempted to use connection on a different coroutine");
            throw new KotlinNothingValueException();
        }
        A4.a.b(21, "Connection is recycled");
        throw new KotlinNothingValueException();
    }
}
