package D2;

import B2.InterfaceC2909f;
import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010#\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u001eB\u0089\u0001\b\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012$\b\u0002\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t\u0012(\u0010\u0010\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0014\u0010\u0015By\b\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012$\b\u0002\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t\u0012(\u0010\u0010\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000e¢\u0006\u0004\b\u0014\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b\u001f\u0010 R0\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010!R6\u0010\u0010\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\"R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010#R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010$R\u001b\u0010(\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u001c\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"LD2/a;", "T", "LB2/f;", "Lkotlin/Function0;", "Landroid/content/SharedPreferences;", "produceSharedPreferences", "", "", "keysToMigrate", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "shouldRunMigration", "Lkotlin/Function3;", "LD2/c;", "migrate", "Landroid/content/Context;", "context", "name", "<init>", "(Lkotlin/jvm/functions/Function0;Ljava/util/Set;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroid/content/Context;Ljava/lang/String;)V", "sharedPreferencesName", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)V", "", "d", "(Landroid/content/Context;Ljava/lang/String;)V", "currentData", "a", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function3;", "Landroid/content/Context;", "Ljava/lang/String;", "e", "Lkotlin/Lazy;", "()Landroid/content/SharedPreferences;", "sharedPrefs", "", "f", "Ljava/util/Set;", "keySet", "datastore_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class a<T> implements InterfaceC2909f<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function2<T, Continuation<? super Boolean>, Object> shouldRunMigration;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function3<D2.c, T, Continuation<? super T>, Object> migrate;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Lazy sharedPrefs;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Set<String> keySet;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T", "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.migrations.SharedPreferencesMigration$3", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
    /* renamed from: D2.a$a, reason: collision with other inner class name */
    public static final class C0106a extends SuspendLambda implements Function2<T, Continuation<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f5906a;

        C0106a(Continuation<? super C0106a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C0106a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(T t10, Continuation<? super Boolean> continuation) {
            return ((C0106a) create(t10, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f5906a == 0) {
                ResultKt.b(obj);
                return Boxing.a(true);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Landroid/content/SharedPreferences;", "c", "()Landroid/content/SharedPreferences;"}, k = 3, mv = {1, 8, 0})
    static final class b extends Lambda implements Function0<SharedPreferences> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Context f5907f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f5908g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, String str) {
            super(0);
            this.f5907f = context;
            this.f5908g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            SharedPreferences sharedPreferences = this.f5907f.getSharedPreferences(this.f5908g, 0);
            Intrinsics.i(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
            return sharedPreferences;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LD2/a$c;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "name", "", "a", "(Landroid/content/Context;Ljava/lang/String;)Z", "datastore_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f5909a = new c();

        @JvmStatic
        public static final boolean a(Context context, String name) {
            Intrinsics.j(context, "context");
            Intrinsics.j(name, "name");
            return context.deleteSharedPreferences(name);
        }

        private c() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.migrations.SharedPreferencesMigration", f = "SharedPreferencesMigration.android.kt", l = {151}, m = "shouldMigrate")
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f5910a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f5911b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a<T> f5912c;

        /* renamed from: d, reason: collision with root package name */
        int f5913d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(a<T> aVar, Continuation<? super d> continuation) {
            super(continuation);
            this.f5912c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5911b = obj;
            this.f5913d |= Integer.MIN_VALUE;
            return this.f5912c.a(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private a(Function0<? extends SharedPreferences> function0, Set<String> set, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, Function3<? super D2.c, ? super T, ? super Continuation<? super T>, ? extends Object> function3, Context context, String str) {
        this.shouldRunMigration = function2;
        this.migrate = function3;
        this.context = context;
        this.name = str;
        this.sharedPrefs = LazyKt.b(function0);
        this.keySet = set == D2.b.a() ? null : CollectionsKt.n1(set);
    }

    private final SharedPreferences e() {
        return (SharedPreferences) this.sharedPrefs.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // B2.InterfaceC2909f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(T r5, kotlin.coroutines.Continuation<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof D2.a.d
            if (r0 == 0) goto L13
            r0 = r6
            D2.a$d r0 = (D2.a.d) r0
            int r1 = r0.f5913d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5913d = r1
            goto L18
        L13:
            D2.a$d r0 = new D2.a$d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f5911b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f5913d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f5910a
            D2.a r5 = (D2.a) r5
            kotlin.ResultKt.b(r6)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.b(r6)
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r6 = r4.shouldRunMigration
            r0.f5910a = r4
            r0.f5913d = r3
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r5 = r4
        L46:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r0 = 0
            if (r6 != 0) goto L54
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.a(r0)
            return r5
        L54:
            java.util.Set<java.lang.String> r6 = r5.keySet
            if (r6 != 0) goto L6e
            android.content.SharedPreferences r5 = r5.e()
            java.util.Map r5 = r5.getAll()
            java.lang.String r6 = "sharedPrefs.all"
            kotlin.jvm.internal.Intrinsics.i(r5, r6)
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L6c
            goto L98
        L6c:
            r3 = r0
            goto L98
        L6e:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            android.content.SharedPreferences r5 = r5.e()
            boolean r1 = r6 instanceof java.util.Collection
            if (r1 == 0) goto L82
            r1 = r6
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L82
            goto L6c
        L82:
            java.util.Iterator r6 = r6.iterator()
        L86:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L6c
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r5.contains(r1)
            if (r1 == 0) goto L86
        L98:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: D2.a.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // B2.InterfaceC2909f
    public Object c(T t10, Continuation<? super T> continuation) {
        return this.migrate.invoke(new D2.c(e(), this.keySet), t10, continuation);
    }

    private final void d(Context context, String name) {
        c.a(context, name);
    }

    @Override // B2.InterfaceC2909f
    public Object b(Continuation<? super Unit> continuation) throws IOException {
        Context context;
        String str;
        SharedPreferences.Editor editorEdit = e().edit();
        Set<String> set = this.keySet;
        if (set == null) {
            editorEdit.clear();
        } else {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (editorEdit.commit()) {
            if (e().getAll().isEmpty() && (context = this.context) != null && (str = this.name) != null) {
                d(context, str);
            }
            Set<String> set2 = this.keySet;
            if (set2 != null) {
                set2.clear();
            }
            return Unit.f143329a;
        }
        throw new IOException("Unable to delete migrated keys from SharedPreferences.");
    }

    public /* synthetic */ a(Context context, String str, Set set, Function2 function2, Function3 function3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i10 & 4) != 0 ? D2.b.a() : set, (i10 & 8) != 0 ? new C0106a(null) : function2, function3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public a(Context context, String sharedPreferencesName, Set<String> keysToMigrate, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> shouldRunMigration, Function3<? super D2.c, ? super T, ? super Continuation<? super T>, ? extends Object> migrate) {
        this(new b(context, sharedPreferencesName), keysToMigrate, shouldRunMigration, migrate, context, sharedPreferencesName);
        Intrinsics.j(context, "context");
        Intrinsics.j(sharedPreferencesName, "sharedPreferencesName");
        Intrinsics.j(keysToMigrate, "keysToMigrate");
        Intrinsics.j(shouldRunMigration, "shouldRunMigration");
        Intrinsics.j(migrate, "migrate");
    }
}
