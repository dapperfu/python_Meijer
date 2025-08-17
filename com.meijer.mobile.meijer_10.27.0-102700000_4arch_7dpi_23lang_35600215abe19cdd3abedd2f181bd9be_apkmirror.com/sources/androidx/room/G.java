package androidx.room;

import A4.d;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import com.fullstory.FS;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmSuppressWildcards;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import o.C15957c;
import qv.AbstractC16618K;
import qv.C0;
import qv.C16623P;
import qv.C16669u0;
import qv.InterfaceC16622O;
import qv.X0;
import r4.C16719a;
import t4.C17059a;
import u4.InterfaceC17221a;
import v4.C17496b;
import v4.C17501g;
import v4.C17506l;
import v4.C17507m;
import v4.C17508n;
import w4.C17754b;
import w4.C17759g;
import w4.C17761i;
import z4.InterfaceC18380b;
import z4.InterfaceC18381c;

@Metadata(d1 = {"\u0000\u0090\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u001d\b&\u0018\u0000 °\u00012\u00020\u0001:\f±\u0001²\u0001³\u0001´\u0001µ\u0001¶\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0082\b¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u0003J#\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0007¢\u0006\u0004\b\u0013\u0010\u0016J#\u0010\u001b\u001a\u00020\t2\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0018\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b!\u0010\"J1\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\u001a\u0010&\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020%0\u0011\u0012\u0004\u0012\u00020%0$H\u0017¢\u0006\u0004\b)\u0010*J1\u0010+\u001a\b\u0012\u0004\u0012\u00020(0'2\u001a\u0010&\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020%0\u0015\u0012\u0004\u0012\u00020%0$H\u0017¢\u0006\u0004\b+\u0010*J\u0017\u0010-\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u001cH\u0015¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0015¢\u0006\u0004\b0\u00101J\u000f\u00103\u001a\u000202H$¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0007¢\u0006\u0004\b6\u00107J\u000f\u00109\u001a\u000208H\u0007¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u000208H\u0000¢\u0006\u0004\b;\u0010:J)\u0010=\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0011\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110'0$H\u0015¢\u0006\u0004\b=\u0010>J)\u0010?\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0015\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00150'0$H\u0015¢\u0006\u0004\b?\u0010>J\u001d\u0010A\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020%0\u00110@H\u0017¢\u0006\u0004\bA\u0010BJ\u001d\u0010C\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020%0\u00150@H\u0017¢\u0006\u0004\bC\u0010BJ\u000f\u0010D\u001a\u00020\tH'¢\u0006\u0004\bD\u0010\u0003J+\u0010J\u001a\u00020\t2\u0006\u0010F\u001a\u00020E2\u0012\u0010I\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0G\"\u00020HH\u0005¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\tH\u0016¢\u0006\u0004\bL\u0010\u0003J\u000f\u0010M\u001a\u00020\tH\u0017¢\u0006\u0004\bM\u0010\u0003J\u000f\u0010N\u001a\u00020\tH\u0017¢\u0006\u0004\bN\u0010\u0003JB\u0010W\u001a\u00028\u0000\"\u0004\b\u0000\u0010O2\u0006\u0010P\u001a\u00020E2\"\u0010T\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020R\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000S\u0012\u0006\u0012\u0004\u0018\u00010\u00010QH\u0080@¢\u0006\u0004\bU\u0010VJ\u000f\u0010Z\u001a\u00020EH\u0000¢\u0006\u0004\bX\u0010YJ+\u0010[\u001a\u00020]2\u0006\u0010[\u001a\u00020H2\u0012\u0010\\\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010GH\u0016¢\u0006\u0004\b[\u0010^J#\u0010[\u001a\u00020]2\u0006\u0010[\u001a\u00020_2\n\b\u0002\u0010a\u001a\u0004\u0018\u00010`H\u0017¢\u0006\u0004\b[\u0010bJ\u0017\u0010e\u001a\u00020d2\u0006\u0010c\u001a\u00020HH\u0016¢\u0006\u0004\be\u0010fJ\u000f\u0010g\u001a\u00020\tH\u0017¢\u0006\u0004\bg\u0010\u0003J\u000f\u0010h\u001a\u00020\tH\u0017¢\u0006\u0004\bh\u0010\u0003J\u000f\u0010i\u001a\u00020\tH\u0017¢\u0006\u0004\bi\u0010\u0003J\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020jH\u0016¢\u0006\u0004\b\u000f\u0010kJ#\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010l2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000mH\u0016¢\u0006\u0004\b\u000f\u0010nJ\u0017\u0010q\u001a\u00020\t2\u0006\u0010p\u001a\u00020oH\u0015¢\u0006\u0004\bq\u0010rJ\u0017\u0010q\u001a\u00020\t2\u0006\u0010t\u001a\u00020sH\u0005¢\u0006\u0004\bq\u0010uJ\u000f\u0010v\u001a\u00020EH\u0016¢\u0006\u0004\bv\u0010YR\u001e\u0010w\u001a\u0004\u0018\u00010o8\u0004@\u0004X\u0085\u000e¢\u0006\f\n\u0004\bw\u0010x\u0012\u0004\by\u0010\u0003R\u0016\u0010z\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bz\u0010{R\u0016\u0010|\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b|\u0010}R\u0017\u0010\u007f\u001a\u00020~8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0019\u0010\u0081\u0001\u001a\u00020~8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0080\u0001R\u0019\u0010\u0082\u0001\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0019\u0010\u0084\u0001\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R \u0010\u0087\u0001\u001a\u00030\u0086\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0019\u0010\u008b\u0001\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R)\u0010\u008e\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u008d\u0001\u0018\u00010'8\u0004@\u0004X\u0085\u000e¢\u0006\u000f\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u0012\u0005\b\u0090\u0001\u0010\u0003R\u001c\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R$\u0010\u0096\u0001\u001a\n\u0012\u0005\u0012\u00030\u0095\u00010\u0094\u00018G¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R(\u0010\u009b\u0001\u001a\u0013\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0015\u0012\u0004\u0012\u00020\u00010\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R(\u0010\u009d\u0001\u001a\u00020E8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u009d\u0001\u0010\u008c\u0001\u001a\u0005\b\u009e\u0001\u0010Y\"\u0006\b\u009f\u0001\u0010 \u0001R\u0017\u0010£\u0001\u001a\u00020~8VX\u0096\u0004¢\u0006\b\u001a\u0006\b¡\u0001\u0010¢\u0001R\u0017\u0010¥\u0001\u001a\u00020~8VX\u0096\u0004¢\u0006\b\u001a\u0006\b¤\u0001\u0010¢\u0001R\u0016\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004¢\u0006\b\u001a\u0006\b¦\u0001\u0010§\u0001R\u0016\u0010©\u0001\u001a\u0002028VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¨\u0001\u00104R0\u0010«\u0001\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0015\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00150'0$8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bª\u0001\u0010>R\u0016\u0010¬\u0001\u001a\u00020E8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¬\u0001\u0010YR\u0013\u0010\u00ad\u0001\u001a\u00020E8G¢\u0006\u0007\u001a\u0005\b\u00ad\u0001\u0010YR\u0016\u0010¯\u0001\u001a\u00020E8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b®\u0001\u0010Y¨\u0006·\u0001"}, d2 = {"Landroidx/room/G;", "", "<init>", "()V", "LA4/d;", "T", "openHelper", "unwrapOpenHelper", "(LA4/d;)LA4/d;", "", "onClosed", "internalBeginTransaction", "internalEndTransaction", "Lkotlin/Function0;", "body", "runInTransaction", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Ljava/lang/Class;", "klass", "getTypeConverter", "(Ljava/lang/Class;)Ljava/lang/Object;", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "kclass", "converter", "addTypeConverter$room_runtime_release", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)V", "addTypeConverter", "Landroidx/room/e;", "configuration", "init", "(Landroidx/room/e;)V", "Landroidx/room/z;", "createConnectionManager$room_runtime_release", "(Landroidx/room/e;)Landroidx/room/z;", "createConnectionManager", "", "Lu4/a;", "autoMigrationSpecs", "", "Lu4/b;", "getAutoMigrations", "(Ljava/util/Map;)Ljava/util/List;", "createAutoMigrations", "config", "createOpenHelper", "(Landroidx/room/e;)LA4/d;", "Landroidx/room/L;", "createOpenDelegate", "()Landroidx/room/L;", "Landroidx/room/q;", "createInvalidationTracker", "()Landroidx/room/q;", "Lqv/O;", "getCoroutineScope", "()Lqv/O;", "Lkotlin/coroutines/CoroutineContext;", "getQueryContext", "()Lkotlin/coroutines/CoroutineContext;", "getTransactionContext$room_runtime_release", "getTransactionContext", "getRequiredTypeConverters", "()Ljava/util/Map;", "getRequiredTypeConverterClasses", "", "getRequiredAutoMigrationSpecs", "()Ljava/util/Set;", "getRequiredAutoMigrationSpecClasses", "clearAllTables", "", "hasForeignKeys", "", "", "tableNames", "performClear", "(Z[Ljava/lang/String;)V", "close", "assertNotMainThread", "assertNotSuspendingTransaction", "R", "isReadOnly", "Lkotlin/Function2;", "Landroidx/room/X;", "Lkotlin/coroutines/Continuation;", "block", "useConnection$room_runtime_release", "(ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "useConnection", "inCompatibilityMode$room_runtime_release", "()Z", "inCompatibilityMode", "query", "args", "Landroid/database/Cursor;", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "LA4/f;", "Landroid/os/CancellationSignal;", "signal", "(LA4/f;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "sql", "LA4/g;", "compileStatement", "(Ljava/lang/String;)LA4/g;", "beginTransaction", "endTransaction", "setTransactionSuccessful", "Ljava/lang/Runnable;", "(Ljava/lang/Runnable;)V", "V", "Ljava/util/concurrent/Callable;", "(Ljava/util/concurrent/Callable;)Ljava/lang/Object;", "LA4/c;", "db", "internalInitInvalidationTracker", "(LA4/c;)V", "Lz4/b;", "connection", "(Lz4/b;)V", "inTransaction", "mDatabase", "LA4/c;", "getMDatabase$annotations", "coroutineScope", "Lqv/O;", "transactionContext", "Lkotlin/coroutines/CoroutineContext;", "Ljava/util/concurrent/Executor;", "internalQueryExecutor", "Ljava/util/concurrent/Executor;", "internalTransactionExecutor", "connectionManager", "Landroidx/room/z;", "internalTracker", "Landroidx/room/q;", "Lr4/a;", "closeBarrier", "Lr4/a;", "getCloseBarrier$room_runtime_release", "()Lr4/a;", "allowMainThreadQueries", "Z", "Landroidx/room/G$b;", "mCallbacks", "Ljava/util/List;", "getMCallbacks$annotations", "Lv4/b;", "autoCloser", "Lv4/b;", "Ljava/lang/ThreadLocal;", "", "suspendingTransactionId", "Ljava/lang/ThreadLocal;", "getSuspendingTransactionId", "()Ljava/lang/ThreadLocal;", "", "typeConverters", "Ljava/util/Map;", "useTempTrackingTable", "getUseTempTrackingTable$room_runtime_release", "setUseTempTrackingTable$room_runtime_release", "(Z)V", "getQueryExecutor", "()Ljava/util/concurrent/Executor;", "queryExecutor", "getTransactionExecutor", "transactionExecutor", "getOpenHelper", "()LA4/d;", "getInvalidationTracker", "invalidationTracker", "getRequiredTypeConverterClassesMap$room_runtime_release", "requiredTypeConverterClassesMap", "isOpen", "isOpenInternal", "isMainThread$room_runtime_release", "isMainThread", "Companion", "d", "a", "e", "b", "f", "c", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public abstract class G {
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;
    private C17496b autoCloser;
    private C6139z connectionManager;
    private InterfaceC16622O coroutineScope;
    private Executor internalQueryExecutor;
    private C6131q internalTracker;
    private Executor internalTransactionExecutor;

    @JvmField
    protected List<? extends b> mCallbacks;

    @JvmField
    protected volatile A4.c mDatabase;
    private CoroutineContext transactionContext;
    private final C16719a closeBarrier = new C16719a(new g(this));
    private final ThreadLocal<Integer> suspendingTransactionId = new ThreadLocal<>();
    private final Map<KClass<?>, Object> typeConverters = new LinkedHashMap();
    private boolean useTempTrackingTable = true;

    @Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B)\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010\"\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0017¢\u0006\u0004\b\u001b\u0010\u0016J\u001b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00028\u0000H\u0016¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010(R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010)R\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010+R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020 0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010-R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00030,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010-R\u0018\u00101\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00100R\u0018\u00102\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00100R\u0018\u00105\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00108\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010D\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001c\u0010Q\u001a\b\u0012\u0004\u0012\u00020N0M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020N0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010PR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020T0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010-R\u0016\u0010X\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u00107R\u0016\u0010Z\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u00107R\u0016\u0010\\\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u00107R\u0018\u0010^\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010)R\u0018\u0010b\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u001e\u0010g\u001a\n\u0012\u0004\u0012\u00020d\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010k\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0018\u0010o\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0016\u0010q\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u00107¨\u0006r"}, d2 = {"Landroidx/room/G$a;", "Landroidx/room/G;", "T", "", "Landroid/content/Context;", "context", "Ljava/lang/Class;", "klass", "", "name", "<init>", "(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)V", "LA4/d$c;", "factory", "g", "(LA4/d$c;)Landroidx/room/G$a;", "", "Lu4/b;", "migrations", "b", "([Lu4/b;)Landroidx/room/G$a;", "c", "()Landroidx/room/G$a;", "Ljava/util/concurrent/Executor;", "executor", "h", "(Ljava/util/concurrent/Executor;)Landroidx/room/G$a;", "e", "", "dropAllTables", "f", "(Z)Landroidx/room/G$a;", "Landroidx/room/G$b;", "callback", "a", "(Landroidx/room/G$b;)Landroidx/room/G$a;", "d", "()Landroidx/room/G;", "Lkotlin/reflect/KClass;", "Lkotlin/reflect/KClass;", "Landroid/content/Context;", "Ljava/lang/String;", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "", "Ljava/util/List;", "callbacks", "typeConverters", "Ljava/util/concurrent/Executor;", "queryExecutor", "transactionExecutor", "i", "LA4/d$c;", "supportOpenHelperFactory", "j", "Z", "allowMainThreadQueries", "Landroidx/room/G$d;", "k", "Landroidx/room/G$d;", "journalMode", "Landroid/content/Intent;", "l", "Landroid/content/Intent;", "multiInstanceInvalidationIntent", "", "m", "J", "autoCloseTimeout", "Ljava/util/concurrent/TimeUnit;", "n", "Ljava/util/concurrent/TimeUnit;", "autoCloseTimeUnit", "Landroidx/room/G$e;", "o", "Landroidx/room/G$e;", "migrationContainer", "", "", "p", "Ljava/util/Set;", "migrationsNotRequiredFrom", "q", "migrationStartAndEndVersions", "Lu4/a;", "r", "autoMigrationSpecs", "s", "requireMigration", "t", "allowDestructiveMigrationOnDowngrade", "u", "allowDestructiveMigrationForAllTables", "v", "copyFromAssetPath", "Ljava/io/File;", "w", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "x", "Ljava/util/concurrent/Callable;", "copyFromInputStream", "Lz4/c;", "y", "Lz4/c;", "driver", "Lkotlin/coroutines/CoroutineContext;", "z", "Lkotlin/coroutines/CoroutineContext;", "queryCoroutineContext", "A", "inMemoryTrackingTableMode", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static class a<T extends G> {

        /* renamed from: A, reason: collision with root package name and from kotlin metadata */
        private boolean inMemoryTrackingTableMode;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final KClass<T> klass;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Context context;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String name;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Function0<T> factory;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final List<b> callbacks;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final List<Object> typeConverters;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private Executor queryExecutor;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private Executor transactionExecutor;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private d.c supportOpenHelperFactory;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private boolean allowMainThreadQueries;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private d journalMode;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private Intent multiInstanceInvalidationIntent;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        private long autoCloseTimeout;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        private TimeUnit autoCloseTimeUnit;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final e migrationContainer;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        private Set<Integer> migrationsNotRequiredFrom;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        private final Set<Integer> migrationStartAndEndVersions;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        private final List<InterfaceC17221a> autoMigrationSpecs;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        private boolean requireMigration;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        private boolean allowDestructiveMigrationOnDowngrade;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata */
        private boolean allowDestructiveMigrationForAllTables;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata */
        private String copyFromAssetPath;

        /* renamed from: w, reason: collision with root package name and from kotlin metadata */
        private File copyFromFile;

        /* renamed from: x, reason: collision with root package name and from kotlin metadata */
        private Callable<InputStream> copyFromInputStream;

        /* renamed from: y, reason: collision with root package name and from kotlin metadata */
        private InterfaceC18381c driver;

        /* renamed from: z, reason: collision with root package name and from kotlin metadata */
        private CoroutineContext queryCoroutineContext;

        public a<T> c() {
            this.allowMainThreadQueries = true;
            return this;
        }

        @Deprecated
        public a<T> e() {
            this.requireMigration = false;
            this.allowDestructiveMigrationOnDowngrade = true;
            return this;
        }

        public final a<T> f(boolean dropAllTables) {
            this.requireMigration = false;
            this.allowDestructiveMigrationOnDowngrade = true;
            this.allowDestructiveMigrationForAllTables = dropAllTables;
            return this;
        }

        public a(Context context, Class<T> klass, String str) {
            Intrinsics.j(context, "context");
            Intrinsics.j(klass, "klass");
            this.callbacks = new ArrayList();
            this.typeConverters = new ArrayList();
            this.journalMode = d.f58356a;
            this.autoCloseTimeout = -1L;
            this.migrationContainer = new e();
            this.migrationsNotRequiredFrom = new LinkedHashSet();
            this.migrationStartAndEndVersions = new LinkedHashSet();
            this.autoMigrationSpecs = new ArrayList();
            this.requireMigration = true;
            this.inMemoryTrackingTableMode = true;
            this.klass = JvmClassMappingKt.e(klass);
            this.context = context;
            this.name = str;
            this.factory = null;
        }

        public a<T> a(b callback) {
            Intrinsics.j(callback, "callback");
            this.callbacks.add(callback);
            return this;
        }

        public a<T> b(u4.b... migrations) {
            Intrinsics.j(migrations, "migrations");
            for (u4.b bVar : migrations) {
                this.migrationStartAndEndVersions.add(Integer.valueOf(bVar.startVersion));
                this.migrationStartAndEndVersions.add(Integer.valueOf(bVar.endVersion));
            }
            this.migrationContainer.b((u4.b[]) Arrays.copyOf(migrations, migrations.length));
            return this;
        }

        public T d() {
            d.c c17508n;
            d.c cVar;
            T tInvoke;
            Executor executor = this.queryExecutor;
            if (executor == null && this.transactionExecutor == null) {
                Executor executorG = C15957c.g();
                this.transactionExecutor = executorG;
                this.queryExecutor = executorG;
            } else if (executor != null && this.transactionExecutor == null) {
                this.transactionExecutor = executor;
            } else if (executor == null) {
                this.queryExecutor = this.transactionExecutor;
            }
            H.b(this.migrationStartAndEndVersions, this.migrationsNotRequiredFrom);
            InterfaceC18381c interfaceC18381c = this.driver;
            if (interfaceC18381c == null && this.supportOpenHelperFactory == null) {
                c17508n = new B4.j();
            } else if (interfaceC18381c == null) {
                c17508n = this.supportOpenHelperFactory;
            } else {
                if (this.supportOpenHelperFactory != null) {
                    throw new IllegalArgumentException("A RoomDatabase cannot be configured with both a SQLiteDriver and a SupportOpenHelper.Factory.");
                }
                c17508n = null;
            }
            boolean z10 = this.autoCloseTimeout > 0;
            boolean z11 = (this.copyFromAssetPath == null && this.copyFromFile == null && this.copyFromInputStream == null) ? false : true;
            if (c17508n != null) {
                if (z10) {
                    if (this.name == null) {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                    }
                    long j10 = this.autoCloseTimeout;
                    TimeUnit timeUnit = this.autoCloseTimeUnit;
                    if (timeUnit == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    c17508n = new C17506l(c17508n, new C17496b(j10, timeUnit, null, 4, null));
                }
                if (z11) {
                    if (this.name == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    }
                    String str = this.copyFromAssetPath;
                    int i10 = str == null ? 0 : 1;
                    File file = this.copyFromFile;
                    int i11 = file == null ? 0 : 1;
                    Callable<InputStream> callable = this.copyFromInputStream;
                    if (i10 + i11 + (callable != null ? 1 : 0) != 1) {
                        throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                    }
                    c17508n = new C17508n(str, file, callable, c17508n);
                }
                cVar = c17508n;
            } else {
                cVar = null;
            }
            if (cVar == null) {
                if (z10) {
                    throw new IllegalArgumentException("Auto Closing Database is not supported when an SQLiteDriver is configured.");
                }
                if (z11) {
                    throw new IllegalArgumentException("Pre-Package Database is not supported when an SQLiteDriver is configured.");
                }
            }
            Context context = this.context;
            String str2 = this.name;
            e eVar = this.migrationContainer;
            List<b> list = this.callbacks;
            boolean z12 = this.allowMainThreadQueries;
            d dVarB = this.journalMode.b(context);
            Executor executor2 = this.queryExecutor;
            if (executor2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor3 = this.transactionExecutor;
            if (executor3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            C6119e c6119e = new C6119e(context, str2, cVar, eVar, list, z12, dVarB, executor2, executor3, this.multiInstanceInvalidationIntent, this.requireMigration, this.allowDestructiveMigrationOnDowngrade, this.migrationsNotRequiredFrom, this.copyFromAssetPath, this.copyFromFile, this.copyFromInputStream, null, this.typeConverters, this.autoMigrationSpecs, this.allowDestructiveMigrationForAllTables, this.driver, this.queryCoroutineContext);
            c6119e.f(this.inMemoryTrackingTableMode);
            Function0<T> function0 = this.factory;
            if (function0 == null || (tInvoke = function0.invoke()) == null) {
                tInvoke = (T) C17759g.b(JvmClassMappingKt.b(this.klass), null, 2, null);
            }
            tInvoke.init(c6119e);
            return tInvoke;
        }

        public a<T> g(d.c factory) {
            this.supportOpenHelperFactory = factory;
            return this;
        }

        public a<T> h(Executor executor) {
            Intrinsics.j(executor, "executor");
            if (this.queryCoroutineContext != null) {
                throw new IllegalArgumentException("This builder has already been configured with a CoroutineContext. A RoomDatabasecan only be configured with either an Executor or a CoroutineContext.");
            }
            this.queryExecutor = executor;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Landroidx/room/G$b;", "", "<init>", "()V", "LA4/c;", "db", "", "a", "(LA4/c;)V", "Lz4/b;", "connection", "b", "(Lz4/b;)V", "c", "d", "e", "f", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class b {
        public void a(A4.c db2) {
            Intrinsics.j(db2, "db");
        }

        public void c(A4.c db2) {
            Intrinsics.j(db2, "db");
        }

        public void e(A4.c db2) {
            Intrinsics.j(db2, "db");
        }

        public void b(InterfaceC18380b connection) {
            Intrinsics.j(connection, "connection");
            if (connection instanceof C17059a) {
                a(((C17059a) connection).getDb());
            }
        }

        public void d(InterfaceC18380b connection) {
            Intrinsics.j(connection, "connection");
            if (connection instanceof C17059a) {
                c(((C17059a) connection).getDb());
            }
        }

        public void f(InterfaceC18380b connection) {
            Intrinsics.j(connection, "connection");
            if (connection instanceof C17059a) {
                e(((C17059a) connection).getDb());
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\u0006j\u0002\b\t¨\u0006\n"}, d2 = {"Landroidx/room/G$d;", "", "<init>", "(Ljava/lang/String;I)V", "Landroid/content/Context;", "context", "b", "(Landroid/content/Context;)Landroidx/room/G$d;", "a", "c", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f58356a = new d("AUTOMATIC", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final d f58357b = new d("TRUNCATE", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final d f58358c = new d("WRITE_AHEAD_LOGGING", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ d[] f58359d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f58360e;

        private static final /* synthetic */ d[] a() {
            return new d[]{f58356a, f58357b, f58358c};
        }

        static {
            d[] dVarArrA = a();
            f58359d = dVarArrA;
            f58360e = EnumEntriesKt.a(dVarArrA);
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f58359d.clone();
        }

        public final d b(Context context) {
            Intrinsics.j(context, "context");
            if (this != f58356a) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            return (activityManager == null || activityManager.isLowRamDevice()) ? f58357b : f58358c;
        }

        private d(String str, int i10) {
        }
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r0\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00132\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010\u001e\u001a\"\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001d\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ7\u0010 \u001a\"\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001d\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u000eH\u0000¢\u0006\u0004\b \u0010\u001fR,\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#¨\u0006$"}, d2 = {"Landroidx/room/G$e;", "", "<init>", "()V", "", "Lu4/b;", "migrations", "", "b", "([Lu4/b;)V", "migration", "a", "(Lu4/b;)V", "", "", "e", "()Ljava/util/Map;", "start", "end", "", "d", "(II)Ljava/util/List;", "startVersion", "endVersion", "", "c", "(II)Z", "migrationStart", "Lkotlin/Pair;", "", "g", "(I)Lkotlin/Pair;", "f", "", "Ljava/util/TreeMap;", "Ljava/util/Map;", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static class e {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Map<Integer, TreeMap<Integer, u4.b>> migrations = new LinkedHashMap();

        public final void a(u4.b migration) {
            Intrinsics.j(migration, "migration");
            int i10 = migration.startVersion;
            int i11 = migration.endVersion;
            Map<Integer, TreeMap<Integer, u4.b>> map = this.migrations;
            Integer numValueOf = Integer.valueOf(i10);
            TreeMap<Integer, u4.b> treeMap = map.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                map.put(numValueOf, treeMap);
            }
            TreeMap<Integer, u4.b> treeMap2 = treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i11))) {
                FS.log_w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i11)) + " with " + migration);
            }
            treeMap2.put(Integer.valueOf(i11), migration);
        }

        public void b(u4.b... migrations) {
            Intrinsics.j(migrations, "migrations");
            for (u4.b bVar : migrations) {
                a(bVar);
            }
        }

        public Map<Integer, Map<Integer, u4.b>> e() {
            return this.migrations;
        }

        public final Pair<Map<Integer, u4.b>, Iterable<Integer>> f(int migrationStart) {
            TreeMap<Integer, u4.b> treeMap = this.migrations.get(Integer.valueOf(migrationStart));
            if (treeMap == null) {
                return null;
            }
            return TuplesKt.a(treeMap, treeMap.descendingKeySet());
        }

        public final Pair<Map<Integer, u4.b>, Iterable<Integer>> g(int migrationStart) {
            TreeMap<Integer, u4.b> treeMap = this.migrations.get(Integer.valueOf(migrationStart));
            if (treeMap == null) {
                return null;
            }
            return TuplesKt.a(treeMap, treeMap.keySet());
        }

        public final boolean c(int startVersion, int endVersion) {
            return C17761i.a(this, startVersion, endVersion);
        }

        public List<u4.b> d(int start, int end) {
            return C17761i.b(this, start, end);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/G$f;", "", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class f {
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class g extends FunctionReferenceImpl implements Function0<Unit> {
        g(Object obj) {
            super(0, obj, G.class, "onClosed", "onClosed()V", 0);
        }

        public final void a() {
            ((G) this.receiver).onClosed();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.room.RoomDatabase$performClear$1", f = "RoomDatabase.android.kt", l = {507}, m = "invokeSuspend")
    static final class h extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f58362a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f58364c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String[] f58365d;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/room/X;", "connection", "", "<anonymous>", "(Landroidx/room/X;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "androidx.room.RoomDatabase$performClear$1$1", f = "RoomDatabase.android.kt", l = {508, 509, 511, 517, 518, 519}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<X, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f58366a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f58367b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ G f58368c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f58369d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String[] f58370e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(G g10, boolean z10, String[] strArr, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f58368c = g10;
                this.f58369d = z10;
                this.f58370e = strArr;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f58368c, this.f58369d, this.f58370e, continuation);
                aVar.f58367b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(X x10, Continuation<? super Unit> continuation) {
                return ((a) create(x10, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/room/W;", "", "<anonymous>", "(Landroidx/room/W;)V"}, k = 3, mv = {2, 0, 0})
            @DebugMetadata(c = "androidx.room.RoomDatabase$performClear$1$1$1", f = "RoomDatabase.android.kt", l = {513, 515}, m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: androidx.room.G$h$a$a, reason: collision with other inner class name */
            static final class C1139a extends SuspendLambda implements Function2<W<Unit>, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                Object f58371a;

                /* renamed from: b, reason: collision with root package name */
                int f58372b;

                /* renamed from: c, reason: collision with root package name */
                int f58373c;

                /* renamed from: d, reason: collision with root package name */
                int f58374d;

                /* renamed from: e, reason: collision with root package name */
                private /* synthetic */ Object f58375e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ boolean f58376f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ String[] f58377g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1139a(boolean z10, String[] strArr, Continuation<? super C1139a> continuation) {
                    super(2, continuation);
                    this.f58376f = z10;
                    this.f58377g = strArr;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C1139a c1139a = new C1139a(this.f58376f, this.f58377g, continuation);
                    c1139a.f58375e = obj;
                    return c1139a;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final Object invoke(W<Unit> w10, Continuation<? super Unit> continuation) {
                    return ((C1139a) create(w10, continuation)).invokeSuspend(Unit.f142422a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
                
                    if (androidx.room.Z.b(r1, "PRAGMA defer_foreign_keys = TRUE", r9) == r0) goto L19;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
                
                    if (androidx.room.Z.b(r6, r10, r9) == r0) goto L19;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0077 -> B:20:0x007a). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                    /*
                        r9 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                        int r1 = r9.f58374d
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L2e
                        if (r1 == r3) goto L26
                        if (r1 != r2) goto L1e
                        int r1 = r9.f58373c
                        int r4 = r9.f58372b
                        java.lang.Object r5 = r9.f58371a
                        java.lang.String[] r5 = (java.lang.String[]) r5
                        java.lang.Object r6 = r9.f58375e
                        androidx.room.W r6 = (androidx.room.W) r6
                        kotlin.ResultKt.b(r10)
                        goto L7a
                    L1e:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r0)
                        throw r10
                    L26:
                        java.lang.Object r1 = r9.f58375e
                        androidx.room.W r1 = (androidx.room.W) r1
                        kotlin.ResultKt.b(r10)
                        goto L47
                    L2e:
                        kotlin.ResultKt.b(r10)
                        java.lang.Object r10 = r9.f58375e
                        r1 = r10
                        androidx.room.W r1 = (androidx.room.W) r1
                        boolean r10 = r9.f58376f
                        if (r10 == 0) goto L47
                        r9.f58375e = r1
                        r9.f58374d = r3
                        java.lang.String r10 = "PRAGMA defer_foreign_keys = TRUE"
                        java.lang.Object r10 = androidx.room.Z.b(r1, r10, r9)
                        if (r10 != r0) goto L47
                        goto L79
                    L47:
                        java.lang.String[] r10 = r9.f58377g
                        int r4 = r10.length
                        r5 = 0
                        r6 = r1
                        r1 = r4
                        r4 = r5
                        r5 = r10
                    L4f:
                        if (r4 >= r1) goto L7c
                        r10 = r5[r4]
                        java.lang.StringBuilder r7 = new java.lang.StringBuilder
                        r7.<init>()
                        java.lang.String r8 = "DELETE FROM `"
                        r7.append(r8)
                        r7.append(r10)
                        r10 = 96
                        r7.append(r10)
                        java.lang.String r10 = r7.toString()
                        r9.f58375e = r6
                        r9.f58371a = r5
                        r9.f58372b = r4
                        r9.f58373c = r1
                        r9.f58374d = r2
                        java.lang.Object r10 = androidx.room.Z.b(r6, r10, r9)
                        if (r10 != r0) goto L7a
                    L79:
                        return r0
                    L7a:
                        int r4 = r4 + r3
                        goto L4f
                    L7c:
                        kotlin.Unit r10 = kotlin.Unit.f142422a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.room.G.h.a.C1139a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:33:0x00b5, code lost:
            
                if (androidx.room.Z.b(r1, "VACUUM", r7) != r0) goto L35;
             */
            /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[PHI: r1
              0x0071: PHI (r1v7 androidx.room.X) = (r1v4 androidx.room.X), (r1v4 androidx.room.X), (r1v9 androidx.room.X) binds: [B:17:0x005d, B:19:0x006e, B:10:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0088 A[PHI: r1
              0x0088: PHI (r1v10 androidx.room.X) = (r1v7 androidx.room.X), (r1v12 androidx.room.X) binds: [B:22:0x0085, B:9:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0094 A[PHI: r1 r8
              0x0094: PHI (r1v13 androidx.room.X) = (r1v10 androidx.room.X), (r1v15 androidx.room.X) binds: [B:25:0x0091, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE]
              0x0094: PHI (r8v14 java.lang.Object) = (r8v13 java.lang.Object), (r8v0 java.lang.Object) binds: [B:25:0x0091, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r1 = r7.f58366a
                    r2 = 0
                    switch(r1) {
                        case 0: goto L41;
                        case 1: goto L39;
                        case 2: goto L31;
                        case 3: goto L29;
                        case 4: goto L20;
                        case 5: goto L17;
                        case 6: goto L12;
                        default: goto La;
                    }
                La:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L12:
                    kotlin.ResultKt.b(r8)
                    goto Lb8
                L17:
                    java.lang.Object r1 = r7.f58367b
                    androidx.room.X r1 = (androidx.room.X) r1
                    kotlin.ResultKt.b(r8)
                    goto Laa
                L20:
                    java.lang.Object r1 = r7.f58367b
                    androidx.room.X r1 = (androidx.room.X) r1
                    kotlin.ResultKt.b(r8)
                    goto L94
                L29:
                    java.lang.Object r1 = r7.f58367b
                    androidx.room.X r1 = (androidx.room.X) r1
                    kotlin.ResultKt.b(r8)
                    goto L88
                L31:
                    java.lang.Object r1 = r7.f58367b
                    androidx.room.X r1 = (androidx.room.X) r1
                    kotlin.ResultKt.b(r8)
                    goto L71
                L39:
                    java.lang.Object r1 = r7.f58367b
                    androidx.room.X r1 = (androidx.room.X) r1
                    kotlin.ResultKt.b(r8)
                    goto L57
                L41:
                    kotlin.ResultKt.b(r8)
                    java.lang.Object r8 = r7.f58367b
                    androidx.room.X r8 = (androidx.room.X) r8
                    r7.f58367b = r8
                    r1 = 1
                    r7.f58366a = r1
                    java.lang.Object r1 = r8.b(r7)
                    if (r1 != r0) goto L54
                    goto Lb7
                L54:
                    r6 = r1
                    r1 = r8
                    r8 = r6
                L57:
                    java.lang.Boolean r8 = (java.lang.Boolean) r8
                    boolean r8 = r8.booleanValue()
                    if (r8 != 0) goto L71
                    androidx.room.G r8 = r7.f58368c
                    androidx.room.q r8 = r8.getInvalidationTracker()
                    r7.f58367b = r1
                    r3 = 2
                    r7.f58366a = r3
                    java.lang.Object r8 = r8.D(r7)
                    if (r8 != r0) goto L71
                    goto Lb7
                L71:
                    androidx.room.X$a r8 = androidx.room.X.a.f58437b
                    androidx.room.G$h$a$a r3 = new androidx.room.G$h$a$a
                    boolean r4 = r7.f58369d
                    java.lang.String[] r5 = r7.f58370e
                    r3.<init>(r4, r5, r2)
                    r7.f58367b = r1
                    r4 = 3
                    r7.f58366a = r4
                    java.lang.Object r8 = r1.a(r8, r3, r7)
                    if (r8 != r0) goto L88
                    goto Lb7
                L88:
                    r7.f58367b = r1
                    r8 = 4
                    r7.f58366a = r8
                    java.lang.Object r8 = r1.b(r7)
                    if (r8 != r0) goto L94
                    goto Lb7
                L94:
                    java.lang.Boolean r8 = (java.lang.Boolean) r8
                    boolean r8 = r8.booleanValue()
                    if (r8 != 0) goto Lc1
                    r7.f58367b = r1
                    r8 = 5
                    r7.f58366a = r8
                    java.lang.String r8 = "PRAGMA wal_checkpoint(FULL)"
                    java.lang.Object r8 = androidx.room.Z.b(r1, r8, r7)
                    if (r8 != r0) goto Laa
                    goto Lb7
                Laa:
                    r7.f58367b = r2
                    r8 = 6
                    r7.f58366a = r8
                    java.lang.String r8 = "VACUUM"
                    java.lang.Object r8 = androidx.room.Z.b(r1, r8, r7)
                    if (r8 != r0) goto Lb8
                Lb7:
                    return r0
                Lb8:
                    androidx.room.G r8 = r7.f58368c
                    androidx.room.q r8 = r8.getInvalidationTracker()
                    r8.x()
                Lc1:
                    kotlin.Unit r8 = kotlin.Unit.f142422a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.room.G.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(boolean z10, String[] strArr, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f58364c = z10;
            this.f58365d = strArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return G.this.new h(this.f58364c, this.f58365d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f58362a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C6139z c6139z = G.this.connectionManager;
                if (c6139z == null) {
                    Intrinsics.y("connectionManager");
                    c6139z = null;
                }
                a aVar = new a(G.this, this.f58364c, this.f58365d, null);
                this.f58362a = 1;
                if (c6139z.K(false, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Deprecated
    protected static /* synthetic */ void getMCallbacks$annotations() {
    }

    @Deprecated
    protected static /* synthetic */ void getMDatabase$annotations() {
    }

    private final /* synthetic */ <T extends A4.d> T unwrapOpenHelper(A4.d openHelper) {
        if (openHelper == null) {
            return null;
        }
        while (true) {
            Intrinsics.n(3, "T");
            if (openHelper != null) {
                return (T) openHelper;
            }
            if (!(openHelper instanceof InterfaceC6120f)) {
                return null;
            }
            openHelper = (T) ((InterfaceC6120f) openHelper).getDelegate();
        }
    }

    public abstract void clearAllTables();

    protected abstract C6131q createInvalidationTracker();

    @Deprecated
    public <T> T getTypeConverter(Class<T> klass) {
        Intrinsics.j(klass, "klass");
        return (T) this.typeConverters.get(JvmClassMappingKt.e(klass));
    }

    @Deprecated
    protected void internalInitInvalidationTracker(A4.c db2) {
        Intrinsics.j(db2, "db");
        internalInitInvalidationTracker(new C17059a(db2));
    }

    @JvmOverloads
    public final Cursor query(A4.f query) {
        Intrinsics.j(query, "query");
        return query$default(this, query, null, 2, null);
    }

    public void runInTransaction(final Runnable body) {
        Intrinsics.j(body, "body");
        runInTransaction(new Function0() { // from class: androidx.room.A
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return G.runInTransaction$lambda$10(body);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit beginTransaction$lambda$8(G g10, A4.c it) {
        Intrinsics.j(it, "it");
        g10.internalBeginTransaction();
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A4.d createConnectionManager$lambda$1(G g10, C6119e config) {
        Intrinsics.j(config, "config");
        return g10.createOpenHelper(config);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit endTransaction$lambda$9(G g10, A4.c it) {
        Intrinsics.j(it, "it");
        g10.internalEndTransaction();
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosed() {
        InterfaceC16622O interfaceC16622O = this.coroutineScope;
        C6139z c6139z = null;
        if (interfaceC16622O == null) {
            Intrinsics.y("coroutineScope");
            interfaceC16622O = null;
        }
        C16623P.f(interfaceC16622O, null, 1, null);
        getInvalidationTracker().C();
        C6139z c6139z2 = this.connectionManager;
        if (c6139z2 == null) {
            Intrinsics.y("connectionManager");
        } else {
            c6139z = c6139z2;
        }
        c6139z.F();
    }

    public static /* synthetic */ Cursor query$default(G g10, A4.f fVar, CancellationSignal cancellationSignal, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i10 & 2) != 0) {
            cancellationSignal = null;
        }
        return g10.query(fVar, cancellationSignal);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object runInTransaction$lambda$12(Function0 function0, InterfaceC18380b it) {
        Intrinsics.j(it, "it");
        return function0.invoke();
    }

    public final void addTypeConverter$room_runtime_release(KClass<?> kclass, Object converter) {
        Intrinsics.j(kclass, "kclass");
        Intrinsics.j(converter, "converter");
        this.typeConverters.put(kclass, converter);
    }

    public void assertNotMainThread() {
        if (!this.allowMainThreadQueries && isMainThread$room_runtime_release()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void close() {
        this.closeBarrier.b();
    }

    public A4.g compileStatement(String sql) {
        Intrinsics.j(sql, "sql");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().D2().Y1(sql);
    }

    public List<u4.b> createAutoMigrations(Map<KClass<? extends InterfaceC17221a>, ? extends InterfaceC17221a> autoMigrationSpecs) {
        Intrinsics.j(autoMigrationSpecs, "autoMigrationSpecs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.f(autoMigrationSpecs.size()));
        Iterator<T> it = autoMigrationSpecs.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(JvmClassMappingKt.b((KClass) entry.getKey()), entry.getValue());
        }
        return getAutoMigrations(linkedHashMap);
    }

    public final C6139z createConnectionManager$room_runtime_release(C6119e configuration) {
        K k10;
        Intrinsics.j(configuration, "configuration");
        try {
            L lCreateOpenDelegate = createOpenDelegate();
            Intrinsics.h(lCreateOpenDelegate, "null cannot be cast to non-null type androidx.room.RoomOpenDelegate");
            k10 = (K) lCreateOpenDelegate;
        } catch (NotImplementedError unused) {
            k10 = null;
        }
        return k10 == null ? new C6139z(configuration, (Function1<? super C6119e, ? extends A4.d>) new Function1() { // from class: androidx.room.E
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return G.createConnectionManager$lambda$1(this.f58327a, (C6119e) obj);
            }
        }) : new C6139z(configuration, k10);
    }

    protected L createOpenDelegate() {
        throw new NotImplementedError(null, 1, null);
    }

    @Deprecated
    protected A4.d createOpenHelper(C6119e config) {
        Intrinsics.j(config, "config");
        throw new NotImplementedError(null, 1, null);
    }

    @Deprecated
    public void endTransaction() {
        C17496b c17496b = this.autoCloser;
        if (c17496b == null) {
            internalEndTransaction();
        } else {
            c17496b.h(new Function1() { // from class: androidx.room.B
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return G.endTransaction$lambda$9(this.f58324a, (A4.c) obj);
                }
            });
        }
    }

    @Deprecated
    @JvmSuppressWildcards
    public List<u4.b> getAutoMigrations(Map<Class<? extends InterfaceC17221a>, InterfaceC17221a> autoMigrationSpecs) {
        Intrinsics.j(autoMigrationSpecs, "autoMigrationSpecs");
        return CollectionsKt.m();
    }

    /* renamed from: getCloseBarrier$room_runtime_release, reason: from getter */
    public final C16719a getCloseBarrier() {
        return this.closeBarrier;
    }

    public final InterfaceC16622O getCoroutineScope() {
        InterfaceC16622O interfaceC16622O = this.coroutineScope;
        if (interfaceC16622O != null) {
            return interfaceC16622O;
        }
        Intrinsics.y("coroutineScope");
        return null;
    }

    public C6131q getInvalidationTracker() {
        C6131q c6131q = this.internalTracker;
        if (c6131q != null) {
            return c6131q;
        }
        Intrinsics.y("internalTracker");
        return null;
    }

    public A4.d getOpenHelper() {
        C6139z c6139z = this.connectionManager;
        if (c6139z == null) {
            Intrinsics.y("connectionManager");
            c6139z = null;
        }
        A4.d dVarG = c6139z.G();
        if (dVarG != null) {
            return dVarG;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    public final CoroutineContext getQueryContext() {
        InterfaceC16622O interfaceC16622O = this.coroutineScope;
        if (interfaceC16622O == null) {
            Intrinsics.y("coroutineScope");
            interfaceC16622O = null;
        }
        return interfaceC16622O.getCoroutineContext();
    }

    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        Intrinsics.y("internalQueryExecutor");
        return null;
    }

    public final ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.suspendingTransactionId;
    }

    public final CoroutineContext getTransactionContext$room_runtime_release() {
        CoroutineContext coroutineContext = this.transactionContext;
        if (coroutineContext != null) {
            return coroutineContext;
        }
        Intrinsics.y("transactionContext");
        return null;
    }

    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        Intrinsics.y("internalTransactionExecutor");
        return null;
    }

    public final <T> T getTypeConverter(KClass<T> klass) {
        Intrinsics.j(klass, "klass");
        T t10 = (T) this.typeConverters.get(klass);
        Intrinsics.h(t10, "null cannot be cast to non-null type T of androidx.room.RoomDatabase.getTypeConverter");
        return t10;
    }

    /* renamed from: getUseTempTrackingTable$room_runtime_release, reason: from getter */
    public final boolean getUseTempTrackingTable() {
        return this.useTempTrackingTable;
    }

    public final boolean inCompatibilityMode$room_runtime_release() {
        C6139z c6139z = this.connectionManager;
        if (c6139z == null) {
            Intrinsics.y("connectionManager");
            c6139z = null;
        }
        return c6139z.G() != null;
    }

    public void init(C6119e configuration) {
        CoroutineContext coroutineContext;
        Intrinsics.j(configuration, "configuration");
        this.useTempTrackingTable = configuration.getUseTempTrackingTable();
        this.connectionManager = createConnectionManager$room_runtime_release(configuration);
        this.internalTracker = createInvalidationTracker();
        H.a(this, configuration);
        H.c(this, configuration);
        CoroutineContext coroutineContext2 = configuration.queryCoroutineContext;
        InterfaceC16622O interfaceC16622O = null;
        if (coroutineContext2 != null) {
            CoroutineContext.Element elementG = coroutineContext2.g(ContinuationInterceptor.INSTANCE);
            Intrinsics.h(elementG, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
            AbstractC16618K abstractC16618K = (AbstractC16618K) elementG;
            Executor executorA = C16669u0.a(abstractC16618K);
            this.internalQueryExecutor = executorA;
            if (executorA == null) {
                Intrinsics.y("internalQueryExecutor");
                executorA = null;
            }
            this.internalTransactionExecutor = new V(executorA);
            this.coroutineScope = C16623P.a(configuration.queryCoroutineContext.m0(X0.a((C0) configuration.queryCoroutineContext.g(C0.INSTANCE))));
            if (inCompatibilityMode$room_runtime_release()) {
                InterfaceC16622O interfaceC16622O2 = this.coroutineScope;
                if (interfaceC16622O2 == null) {
                    Intrinsics.y("coroutineScope");
                    interfaceC16622O2 = null;
                }
                coroutineContext = interfaceC16622O2.getCoroutineContext().m0(abstractC16618K.S0(1));
            } else {
                InterfaceC16622O interfaceC16622O3 = this.coroutineScope;
                if (interfaceC16622O3 == null) {
                    Intrinsics.y("coroutineScope");
                    interfaceC16622O3 = null;
                }
                coroutineContext = interfaceC16622O3.getCoroutineContext();
            }
            this.transactionContext = coroutineContext;
        } else {
            this.internalQueryExecutor = configuration.queryExecutor;
            this.internalTransactionExecutor = new V(configuration.transactionExecutor);
            Executor executor = this.internalQueryExecutor;
            if (executor == null) {
                Intrinsics.y("internalQueryExecutor");
                executor = null;
            }
            InterfaceC16622O interfaceC16622OA = C16623P.a(C16669u0.b(executor).m0(X0.b(null, 1, null)));
            this.coroutineScope = interfaceC16622OA;
            if (interfaceC16622OA == null) {
                Intrinsics.y("coroutineScope");
                interfaceC16622OA = null;
            }
            CoroutineContext coroutineContext3 = interfaceC16622OA.getCoroutineContext();
            Executor executor2 = this.internalTransactionExecutor;
            if (executor2 == null) {
                Intrinsics.y("internalTransactionExecutor");
                executor2 = null;
            }
            this.transactionContext = coroutineContext3.m0(C16669u0.b(executor2));
        }
        this.allowMainThreadQueries = configuration.allowMainThreadQueries;
        C6139z c6139z = this.connectionManager;
        if (c6139z == null) {
            Intrinsics.y("connectionManager");
            c6139z = null;
        }
        A4.d dVarG = c6139z.G();
        if (dVarG != null) {
            while (!(dVarG instanceof C17507m)) {
                if (!(dVarG instanceof InterfaceC6120f)) {
                    dVarG = null;
                    break;
                }
                dVarG = ((InterfaceC6120f) dVarG).getDelegate();
            }
        } else {
            dVarG = null;
            break;
        }
        C17507m c17507m = (C17507m) dVarG;
        if (c17507m != null) {
            c17507m.c(configuration);
        }
        C6139z c6139z2 = this.connectionManager;
        if (c6139z2 == null) {
            Intrinsics.y("connectionManager");
            c6139z2 = null;
        }
        A4.d dVarG2 = c6139z2.G();
        if (dVarG2 != null) {
            while (!(dVarG2 instanceof C17501g)) {
                if (!(dVarG2 instanceof InterfaceC6120f)) {
                    dVarG2 = null;
                    break;
                }
                dVarG2 = ((InterfaceC6120f) dVarG2).getDelegate();
            }
        } else {
            dVarG2 = null;
            break;
        }
        C17501g c17501g = (C17501g) dVarG2;
        if (c17501g != null) {
            this.autoCloser = c17501g.getAutoCloser();
            C17496b c17496bA = c17501g.getAutoCloser();
            InterfaceC16622O interfaceC16622O4 = this.coroutineScope;
            if (interfaceC16622O4 == null) {
                Intrinsics.y("coroutineScope");
            } else {
                interfaceC16622O = interfaceC16622O4;
            }
            c17496bA.k(interfaceC16622O);
            getInvalidationTracker().B(c17501g.getAutoCloser());
        }
        if (configuration.multiInstanceInvalidationServiceIntent != null) {
            if (configuration.name == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            getInvalidationTracker().q(configuration.context, configuration.name, configuration.multiInstanceInvalidationServiceIntent);
        }
    }

    protected final void internalInitInvalidationTracker(InterfaceC18380b connection) {
        Intrinsics.j(connection, "connection");
        getInvalidationTracker().r(connection);
    }

    public boolean isOpen() {
        C17496b c17496b = this.autoCloser;
        if (c17496b != null) {
            return c17496b.m();
        }
        C6139z c6139z = this.connectionManager;
        if (c6139z == null) {
            Intrinsics.y("connectionManager");
            c6139z = null;
        }
        return c6139z.J();
    }

    public final boolean isOpenInternal() {
        C6139z c6139z = this.connectionManager;
        if (c6139z == null) {
            Intrinsics.y("connectionManager");
            c6139z = null;
        }
        return c6139z.J();
    }

    protected final void performClear(boolean hasForeignKeys, String... tableNames) {
        Intrinsics.j(tableNames, "tableNames");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        s4.n.a(new h(hasForeignKeys, tableNames, null));
    }

    public Cursor query(String query, Object[] args) {
        Intrinsics.j(query, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().D2().X2(new A4.a(query, args));
    }

    public <V> V runInTransaction(final Callable<V> body) {
        Intrinsics.j(body, "body");
        return (V) runInTransaction(new Function0() { // from class: androidx.room.C
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return body.call();
            }
        });
    }

    public final void setUseTempTrackingTable$room_runtime_release(boolean z10) {
        this.useTempTrackingTable = z10;
    }

    public final <R> Object useConnection$room_runtime_release(boolean z10, Function2<? super X, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        C6139z c6139z = this.connectionManager;
        if (c6139z == null) {
            Intrinsics.y("connectionManager");
            c6139z = null;
        }
        return c6139z.K(z10, function2, continuation);
    }

    private final void internalBeginTransaction() {
        assertNotMainThread();
        A4.c cVarD2 = getOpenHelper().D2();
        if (!cVarD2.j3()) {
            getInvalidationTracker().E();
        }
        if (cVarD2.A3()) {
            cVarD2.C0();
        } else {
            cVarD2.n();
        }
    }

    private final void internalEndTransaction() {
        getOpenHelper().D2().r();
        if (!inTransaction()) {
            getInvalidationTracker().y();
        }
    }

    private final <T> T runInTransaction(final Function0<? extends T> body) {
        if (inCompatibilityMode$room_runtime_release()) {
            beginTransaction();
            try {
                T tInvoke = body.invoke();
                setTransactionSuccessful();
                return tInvoke;
            } finally {
                endTransaction();
            }
        }
        return (T) C17754b.e(this, false, true, new Function1() { // from class: androidx.room.D
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return G.runInTransaction$lambda$12(body, (InterfaceC18380b) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runInTransaction$lambda$10(Runnable runnable) {
        runnable.run();
        return Unit.f142422a;
    }

    public void assertNotSuspendingTransaction() {
        if (inCompatibilityMode$room_runtime_release() && !inTransaction() && this.suspendingTransactionId.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public void beginTransaction() {
        assertNotMainThread();
        C17496b c17496b = this.autoCloser;
        if (c17496b == null) {
            internalBeginTransaction();
        } else {
            c17496b.h(new Function1() { // from class: androidx.room.F
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return G.beginTransaction$lambda$8(this.f58328a, (A4.c) obj);
                }
            });
        }
    }

    public Set<KClass<? extends InterfaceC17221a>> getRequiredAutoMigrationSpecClasses() {
        Set<Class<? extends InterfaceC17221a>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(requiredAutoMigrationSpecs, 10));
        Iterator<T> it = requiredAutoMigrationSpecs.iterator();
        while (it.hasNext()) {
            arrayList.add(JvmClassMappingKt.e((Class) it.next()));
        }
        return CollectionsKt.o1(arrayList);
    }

    @Deprecated
    public Set<Class<? extends InterfaceC17221a>> getRequiredAutoMigrationSpecs() {
        return SetsKt.e();
    }

    protected Map<KClass<?>, List<KClass<?>>> getRequiredTypeConverterClasses() {
        Set<Map.Entry<Class<?>, List<Class<?>>>> setEntrySet = getRequiredTypeConverters().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Class cls = (Class) entry.getKey();
            List list = (List) entry.getValue();
            KClass kClassE = JvmClassMappingKt.e(cls);
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(JvmClassMappingKt.e((Class) it2.next()));
            }
            Pair pairA = TuplesKt.a(kClassE, arrayList);
            linkedHashMap.put(pairA.c(), pairA.d());
        }
        return linkedHashMap;
    }

    public final Map<KClass<?>, List<KClass<?>>> getRequiredTypeConverterClassesMap$room_runtime_release() {
        return getRequiredTypeConverterClasses();
    }

    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return MapsKt.k();
    }

    public boolean inTransaction() {
        if (isOpenInternal() && getOpenHelper().D2().j3()) {
            return true;
        }
        return false;
    }

    public final boolean isMainThread$room_runtime_release() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    @Deprecated
    public void setTransactionSuccessful() {
        getOpenHelper().D2().q();
    }

    @JvmOverloads
    public Cursor query(A4.f query, CancellationSignal signal) {
        Intrinsics.j(query, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (signal != null) {
            return getOpenHelper().D2().M0(query, signal);
        }
        return getOpenHelper().D2().X2(query);
    }
}
