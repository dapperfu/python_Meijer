package E2;

import F2.f;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a5\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a1\u0010\u000e\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a9\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00102\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\" \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroid/content/Context;", "context", "", "sharedPreferencesName", "", "keysToMigrate", "LD2/a;", "LF2/f;", "a", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;)LD2/a;", "Lkotlin/Function3;", "LD2/c;", "Lkotlin/coroutines/Continuation;", "", "d", "()Lkotlin/jvm/functions/Function3;", "Lkotlin/Function2;", "", "e", "(Ljava/util/Set;)Lkotlin/jvm/functions/Function2;", "Ljava/util/Set;", "c", "()Ljava/util/Set;", "MIGRATE_ALL_KEYS", "datastore-preferences_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final Set<String> f7008a = new LinkedHashSet();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LD2/c;", "sharedPrefs", "LF2/f;", "currentData", "<anonymous>", "(LD2/c;LF2/f;)LF2/f;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a extends SuspendLambda implements Function3<D2.c, F2.f, Continuation<? super F2.f>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f7009a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f7010b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f7011c;

        a(Continuation<? super a> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(D2.c cVar, F2.f fVar, Continuation<? super F2.f> continuation) {
            a aVar = new a(continuation);
            aVar.f7010b = cVar;
            aVar.f7011c = fVar;
            return aVar.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f7009a == 0) {
                ResultKt.b(obj);
                D2.c cVar = (D2.c) this.f7010b;
                F2.f fVar = (F2.f) this.f7011c;
                Set<f.a<?>> setKeySet = fVar.a().keySet();
                ArrayList arrayList = new ArrayList(CollectionsKt.x(setKeySet, 10));
                Iterator<T> it = setKeySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((f.a) it.next()).getName());
                }
                Map<String, Object> mapA = cVar.a();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, Object> entry : mapA.entrySet()) {
                    if (!arrayList.contains(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                F2.c cVarC = fVar.c();
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    String str = (String) entry2.getKey();
                    Object value = entry2.getValue();
                    if (value instanceof Boolean) {
                        cVarC.i(F2.i.a(str), value);
                    } else if (value instanceof Float) {
                        cVarC.i(F2.i.d(str), value);
                    } else if (value instanceof Integer) {
                        cVarC.i(F2.i.e(str), value);
                    } else if (value instanceof Long) {
                        cVarC.i(F2.i.f(str), value);
                    } else if (value instanceof String) {
                        cVarC.i(F2.i.g(str), value);
                    } else if (value instanceof Set) {
                        f.a<Set<String>> aVarH = F2.i.h(str);
                        Intrinsics.h(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                        cVarC.i(aVarH, (Set) value);
                    }
                }
                return cVarC.d();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LF2/f;", "prefs", "", "<anonymous>", "(LF2/f;)Z"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class b extends SuspendLambda implements Function2<F2.f, Continuation<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f7012a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f7013b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Set<String> f7014c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Set<String> set, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f7014c = set;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f7014c, continuation);
            bVar.f7013b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(F2.f fVar, Continuation<? super Boolean> continuation) {
            return ((b) create(fVar, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f7012a == 0) {
                ResultKt.b(obj);
                Set<f.a<?>> setKeySet = ((F2.f) this.f7013b).a().keySet();
                ArrayList arrayList = new ArrayList(CollectionsKt.x(setKeySet, 10));
                Iterator<T> it = setKeySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((f.a) it.next()).getName());
                }
                boolean z10 = true;
                if (this.f7014c != i.c()) {
                    Set<String> set = this.f7014c;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        z10 = false;
                    } else {
                        Iterator<T> it2 = set.iterator();
                        while (it2.hasNext()) {
                            if (!arrayList.contains((String) it2.next())) {
                                break;
                            }
                        }
                        z10 = false;
                    }
                }
                return Boxing.a(z10);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @JvmOverloads
    public static final D2.a<F2.f> a(Context context, String sharedPreferencesName, Set<String> keysToMigrate) {
        Intrinsics.j(context, "context");
        Intrinsics.j(sharedPreferencesName, "sharedPreferencesName");
        Intrinsics.j(keysToMigrate, "keysToMigrate");
        return keysToMigrate == f7008a ? new D2.a<>(context, sharedPreferencesName, null, e(keysToMigrate), d(), 4, null) : new D2.a<>(context, sharedPreferencesName, keysToMigrate, e(keysToMigrate), d());
    }

    public static /* synthetic */ D2.a b(Context context, String str, Set set, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            set = f7008a;
        }
        return a(context, str, set);
    }

    public static final Set<String> c() {
        return f7008a;
    }

    private static final Function3<D2.c, F2.f, Continuation<? super F2.f>, Object> d() {
        return new a(null);
    }

    private static final Function2<F2.f, Continuation<? super Boolean>, Object> e(Set<String> set) {
        return new b(set, null);
    }
}
