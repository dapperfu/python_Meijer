package androidx.room;

import A4.d;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.G;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import u4.InterfaceC17221a;
import w4.C17761i;
import z4.InterfaceC18381c;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\b\u0016\u0018\u00002\u00020\u0001Bí\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\n\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\n\u0012\u0006\u0010&\u001a\u00020\r\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\r2\u0006\u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u0019H\u0016¢\u0006\u0004\b/\u00100J\u009f\u0002\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\r2\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\n2\b\b\u0002\u0010&\u001a\u00020\r2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)H\u0007¢\u0006\u0004\b1\u00102R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u00103R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010:R\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0013\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010@R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0016\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bD\u0010<R\u0014\u0010\u0017\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010<R\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\b6\u0010HR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bI\u00105R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001c\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bN\u0010:R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bO\u0010:R\u0014\u0010&\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bP\u0010<R\u0016\u0010(\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010*\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bU\u0010<R\"\u0010Z\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bW\u0010<\u001a\u0004\b8\u0010X\"\u0004\b;\u0010Y¨\u0006["}, d2 = {"Landroidx/room/e;", "", "Landroid/content/Context;", "context", "", "name", "LA4/d$c;", "sqliteOpenHelperFactory", "Landroidx/room/G$e;", "migrationContainer", "", "Landroidx/room/G$b;", "callbacks", "", "allowMainThreadQueries", "Landroidx/room/G$d;", "journalMode", "Ljava/util/concurrent/Executor;", "queryExecutor", "transactionExecutor", "Landroid/content/Intent;", "multiInstanceInvalidationServiceIntent", "requireMigration", "allowDestructiveMigrationOnDowngrade", "", "", "migrationNotRequiredFrom", "copyFromAssetPath", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "copyFromInputStream", "Landroidx/room/G$f;", "prepackagedDatabaseCallback", "typeConverters", "Lu4/a;", "autoMigrationSpecs", "allowDestructiveMigrationForAllTables", "Lz4/c;", "sqliteDriver", "Lkotlin/coroutines/CoroutineContext;", "queryCoroutineContext", "<init>", "(Landroid/content/Context;Ljava/lang/String;LA4/d$c;Landroidx/room/G$e;Ljava/util/List;ZLandroidx/room/G$d;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/G$f;Ljava/util/List;Ljava/util/List;ZLz4/c;Lkotlin/coroutines/CoroutineContext;)V", "fromVersion", "toVersion", "e", "(II)Z", "a", "(Landroid/content/Context;Ljava/lang/String;LA4/d$c;Landroidx/room/G$e;Ljava/util/List;ZLandroidx/room/G$d;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/G$f;Ljava/util/List;Ljava/util/List;ZLz4/c;Lkotlin/coroutines/CoroutineContext;)Landroidx/room/e;", "Landroid/content/Context;", "b", "Ljava/lang/String;", "c", "LA4/d$c;", "d", "Landroidx/room/G$e;", "Ljava/util/List;", "f", "Z", "g", "Landroidx/room/G$d;", "h", "Ljava/util/concurrent/Executor;", "i", "j", "Landroid/content/Intent;", "k", "l", "m", "Ljava/util/Set;", "()Ljava/util/Set;", "n", "o", "Ljava/io/File;", "p", "Ljava/util/concurrent/Callable;", "q", "r", "s", "t", "Lz4/c;", "u", "Lkotlin/coroutines/CoroutineContext;", "v", "multiInstanceInvalidation", "w", "()Z", "(Z)V", "useTempTrackingTable", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: androidx.room.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6119e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final String name;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final d.c sqliteOpenHelperFactory;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final G.e migrationContainer;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final List<G.b> callbacks;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final boolean allowMainThreadQueries;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final G.d journalMode;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final Executor queryExecutor;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final Executor transactionExecutor;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final Intent multiInstanceInvalidationServiceIntent;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final boolean requireMigration;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final boolean allowDestructiveMigrationOnDowngrade;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Set<Integer> migrationNotRequiredFrom;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final String copyFromAssetPath;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final File copyFromFile;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final Callable<InputStream> copyFromInputStream;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final List<Object> typeConverters;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final List<InterfaceC17221a> autoMigrationSpecs;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final boolean allowDestructiveMigrationForAllTables;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final InterfaceC18381c sqliteDriver;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final CoroutineContext queryCoroutineContext;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final boolean multiInstanceInvalidation;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean useTempTrackingTable;

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"LambdaLast"})
    public C6119e(Context context, String str, d.c cVar, G.e migrationContainer, List<? extends G.b> list, boolean z10, G.d journalMode, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z11, boolean z12, Set<Integer> set, String str2, File file, Callable<InputStream> callable, G.f fVar, List<? extends Object> typeConverters, List<? extends InterfaceC17221a> autoMigrationSpecs, boolean z13, InterfaceC18381c interfaceC18381c, CoroutineContext coroutineContext) {
        Intrinsics.j(context, "context");
        Intrinsics.j(migrationContainer, "migrationContainer");
        Intrinsics.j(journalMode, "journalMode");
        Intrinsics.j(queryExecutor, "queryExecutor");
        Intrinsics.j(transactionExecutor, "transactionExecutor");
        Intrinsics.j(typeConverters, "typeConverters");
        Intrinsics.j(autoMigrationSpecs, "autoMigrationSpecs");
        this.context = context;
        this.name = str;
        this.sqliteOpenHelperFactory = cVar;
        this.migrationContainer = migrationContainer;
        this.callbacks = list;
        this.allowMainThreadQueries = z10;
        this.journalMode = journalMode;
        this.queryExecutor = queryExecutor;
        this.transactionExecutor = transactionExecutor;
        this.multiInstanceInvalidationServiceIntent = intent;
        this.requireMigration = z11;
        this.allowDestructiveMigrationOnDowngrade = z12;
        this.migrationNotRequiredFrom = set;
        this.copyFromAssetPath = str2;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.typeConverters = typeConverters;
        this.autoMigrationSpecs = autoMigrationSpecs;
        this.allowDestructiveMigrationForAllTables = z13;
        this.sqliteDriver = interfaceC18381c;
        this.queryCoroutineContext = coroutineContext;
        this.multiInstanceInvalidation = intent != null;
        this.useTempTrackingTable = true;
    }

    public static /* synthetic */ C6119e b(C6119e c6119e, Context context, String str, d.c cVar, G.e eVar, List list, boolean z10, G.d dVar, Executor executor, Executor executor2, Intent intent, boolean z11, boolean z12, Set set, String str2, File file, Callable callable, G.f fVar, List list2, List list3, boolean z13, InterfaceC18381c interfaceC18381c, CoroutineContext coroutineContext, int i10, Object obj) {
        G.f fVar2;
        CoroutineContext coroutineContext2;
        InterfaceC18381c interfaceC18381c2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        Context context2 = (i10 & 1) != 0 ? c6119e.context : context;
        String str3 = (i10 & 2) != 0 ? c6119e.name : str;
        d.c cVar2 = (i10 & 4) != 0 ? c6119e.sqliteOpenHelperFactory : cVar;
        G.e eVar2 = (i10 & 8) != 0 ? c6119e.migrationContainer : eVar;
        List list4 = (i10 & 16) != 0 ? c6119e.callbacks : list;
        boolean z14 = (i10 & 32) != 0 ? c6119e.allowMainThreadQueries : z10;
        G.d dVar2 = (i10 & 64) != 0 ? c6119e.journalMode : dVar;
        Executor executor3 = (i10 & 128) != 0 ? c6119e.queryExecutor : executor;
        Executor executor4 = (i10 & 256) != 0 ? c6119e.transactionExecutor : executor2;
        Intent intent2 = (i10 & 512) != 0 ? c6119e.multiInstanceInvalidationServiceIntent : intent;
        boolean z15 = (i10 & 1024) != 0 ? c6119e.requireMigration : z11;
        boolean z16 = (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? c6119e.allowDestructiveMigrationOnDowngrade : z12;
        Set set2 = (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? c6119e.migrationNotRequiredFrom : set;
        String str4 = (i10 & 8192) != 0 ? c6119e.copyFromAssetPath : str2;
        Context context3 = context2;
        File file2 = (i10 & 16384) != 0 ? c6119e.copyFromFile : file;
        Callable callable2 = (i10 & 32768) != 0 ? c6119e.copyFromInputStream : callable;
        if ((i10 & 65536) != 0) {
            c6119e.getClass();
            fVar2 = null;
        } else {
            fVar2 = fVar;
        }
        Callable callable3 = callable2;
        List list5 = (i10 & 131072) != 0 ? c6119e.typeConverters : list2;
        List list6 = (i10 & 262144) != 0 ? c6119e.autoMigrationSpecs : list3;
        boolean z17 = (i10 & 524288) != 0 ? c6119e.allowDestructiveMigrationForAllTables : z13;
        InterfaceC18381c interfaceC18381c3 = (i10 & 1048576) != 0 ? c6119e.sqliteDriver : interfaceC18381c;
        if ((i10 & 2097152) != 0) {
            interfaceC18381c2 = interfaceC18381c3;
            coroutineContext2 = c6119e.queryCoroutineContext;
        } else {
            coroutineContext2 = coroutineContext;
            interfaceC18381c2 = interfaceC18381c3;
        }
        return c6119e.a(context3, str3, cVar2, eVar2, list4, z14, dVar2, executor3, executor4, intent2, z15, z16, set2, str4, file2, callable3, fVar2, list5, list6, z17, interfaceC18381c2, coroutineContext2);
    }

    public final C6119e a(Context context, String name, d.c sqliteOpenHelperFactory, G.e migrationContainer, List<? extends G.b> callbacks, boolean allowMainThreadQueries, G.d journalMode, Executor queryExecutor, Executor transactionExecutor, Intent multiInstanceInvalidationServiceIntent, boolean requireMigration, boolean allowDestructiveMigrationOnDowngrade, Set<Integer> migrationNotRequiredFrom, String copyFromAssetPath, File copyFromFile, Callable<InputStream> copyFromInputStream, G.f prepackagedDatabaseCallback, List<? extends Object> typeConverters, List<? extends InterfaceC17221a> autoMigrationSpecs, boolean allowDestructiveMigrationForAllTables, InterfaceC18381c sqliteDriver, CoroutineContext queryCoroutineContext) {
        Intrinsics.j(context, "context");
        Intrinsics.j(migrationContainer, "migrationContainer");
        Intrinsics.j(journalMode, "journalMode");
        Intrinsics.j(queryExecutor, "queryExecutor");
        Intrinsics.j(transactionExecutor, "transactionExecutor");
        Intrinsics.j(typeConverters, "typeConverters");
        Intrinsics.j(autoMigrationSpecs, "autoMigrationSpecs");
        return new C6119e(context, name, sqliteOpenHelperFactory, migrationContainer, callbacks, allowMainThreadQueries, journalMode, queryExecutor, transactionExecutor, multiInstanceInvalidationServiceIntent, requireMigration, allowDestructiveMigrationOnDowngrade, migrationNotRequiredFrom, copyFromAssetPath, copyFromFile, copyFromInputStream, prepackagedDatabaseCallback, typeConverters, autoMigrationSpecs, allowDestructiveMigrationForAllTables, sqliteDriver, queryCoroutineContext);
    }

    public final Set<Integer> c() {
        return this.migrationNotRequiredFrom;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getUseTempTrackingTable() {
        return this.useTempTrackingTable;
    }

    public final void f(boolean z10) {
        this.useTempTrackingTable = z10;
    }

    public boolean e(int fromVersion, int toVersion) {
        return C17761i.d(this, fromVersion, toVersion);
    }
}
