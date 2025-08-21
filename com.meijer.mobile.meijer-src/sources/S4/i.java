package S4;

import O4.AbstractC4373v;
import S4.b;
import U4.n;
import android.os.Build;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C16778j;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import pv.C16563h;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"LS4/i;", "", "", "LT4/d;", "controllers", "<init>", "(Ljava/util/List;)V", "LU4/n;", "trackers", "(LU4/n;)V", "Landroidx/work/impl/model/WorkSpec;", "spec", "Lpv/f;", "LS4/b;", "b", "(Landroidx/work/impl/model/WorkSpec;)Lpv/f;", "workSpec", "", "a", "(Landroidx/work/impl/model/WorkSpec;)Z", "Ljava/util/List;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<T4.d> controllers;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LT4/d;", "it", "", "a", "(LT4/d;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
    static final class a extends Lambda implements Function1<T4.d, CharSequence> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f34428f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(T4.d it) {
            Intrinsics.j(it, "it");
            String simpleName = it.getClass().getSimpleName();
            Intrinsics.i(simpleName, "it.javaClass.simpleName");
            return simpleName;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static final class b implements InterfaceC16561f<S4.b> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f[] f34429a;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "c", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        static final class a extends Lambda implements Function0<S4.b[]> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC16561f[] f34430f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC16561f[] interfaceC16561fArr) {
                super(0);
                this.f34430f = interfaceC16561fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final S4.b[] invoke() {
                return new S4.b[this.f34430f.length];
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "R", "Lpv/g;", "", "it", "", "<anonymous>", "(Lpv/g;Lkotlin/Array;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3", f = "WorkConstraintsTracker.kt", l = {292}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: S4.i$b$b, reason: collision with other inner class name */
        public static final class C0769b extends SuspendLambda implements Function3<InterfaceC16562g<? super S4.b>, S4.b[], Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f34431a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f34432b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f34433c;

            public C0769b(Continuation continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC16562g<? super S4.b> interfaceC16562g, S4.b[] bVarArr, Continuation<? super Unit> continuation) {
                C0769b c0769b = new C0769b(continuation);
                c0769b.f34432b = interfaceC16562g;
                c0769b.f34433c = bVarArr;
                return c0769b.invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                S4.b bVar;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f34431a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16562g interfaceC16562g = (InterfaceC16562g) this.f34432b;
                    S4.b[] bVarArr = (S4.b[]) ((Object[]) this.f34433c);
                    int length = bVarArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length) {
                            bVar = bVarArr[i11];
                            if (!Intrinsics.e(bVar, b.a.f34398a)) {
                                break;
                            }
                            i11++;
                        } else {
                            bVar = null;
                            break;
                        }
                    }
                    if (bVar == null) {
                        bVar = b.a.f34398a;
                    }
                    this.f34431a = 1;
                    if (interfaceC16562g.emit(bVar, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        public b(InterfaceC16561f[] interfaceC16561fArr) {
            this.f34429a = interfaceC16561fArr;
        }

        @Override // pv.InterfaceC16561f
        public Object collect(InterfaceC16562g<? super S4.b> interfaceC16562g, Continuation continuation) {
            InterfaceC16561f[] interfaceC16561fArr = this.f34429a;
            Object objA = C16778j.a(interfaceC16562g, interfaceC16561fArr, new a(interfaceC16561fArr), new C0769b(null), continuation);
            return objA == IntrinsicsKt.f() ? objA : Unit.f143329a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(List<? extends T4.d> controllers) {
        Intrinsics.j(controllers, "controllers");
        this.controllers = controllers;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(n trackers) {
        this((List<? extends T4.d>) CollectionsKt.r(new T4.b(trackers.a()), new T4.c(trackers.getBatteryNotLowTracker()), new T4.i(trackers.e()), new T4.e(trackers.d()), new T4.h(trackers.d()), new T4.g(trackers.d()), new T4.f(trackers.d()), Build.VERSION.SDK_INT >= 28 ? j.a(trackers.getContext()) : null));
        Intrinsics.j(trackers, "trackers");
    }

    public final boolean a(WorkSpec workSpec) {
        Intrinsics.j(workSpec, "workSpec");
        List<T4.d> list = this.controllers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((T4.d) obj).a(workSpec)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            AbstractC4373v.e().a(j.f34434a, "Work " + workSpec.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String + " constrained by " + CollectionsKt.B0(arrayList, null, null, null, 0, null, a.f34428f, 31, null));
        }
        return arrayList.isEmpty();
    }

    public final InterfaceC16561f<S4.b> b(WorkSpec spec) {
        Intrinsics.j(spec, "spec");
        List<T4.d> list = this.controllers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((T4.d) obj).c(spec)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((T4.d) it.next()).b(spec.constraints));
        }
        return C16563h.r(new b((InterfaceC16561f[]) CollectionsKt.j1(arrayList2).toArray(new InterfaceC16561f[0])));
    }
}
