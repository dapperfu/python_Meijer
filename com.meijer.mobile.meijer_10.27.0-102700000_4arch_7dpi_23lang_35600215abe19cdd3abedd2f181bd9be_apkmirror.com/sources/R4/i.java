package R4;

import N4.AbstractC4333v;
import R4.b;
import T4.n;
import android.os.Build;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C17342j;
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
import tv.C17154h;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"LR4/i;", "", "", "LS4/d;", "controllers", "<init>", "(Ljava/util/List;)V", "LT4/n;", "trackers", "(LT4/n;)V", "Landroidx/work/impl/model/WorkSpec;", "spec", "Ltv/f;", "LR4/b;", "b", "(Landroidx/work/impl/model/WorkSpec;)Ltv/f;", "workSpec", "", "a", "(Landroidx/work/impl/model/WorkSpec;)Z", "Ljava/util/List;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<S4.d> controllers;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LS4/d;", "it", "", "a", "(LS4/d;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
    static final class a extends Lambda implements Function1<S4.d, CharSequence> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f31890f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(S4.d it) {
            Intrinsics.j(it, "it");
            String simpleName = it.getClass().getSimpleName();
            Intrinsics.i(simpleName, "it.javaClass.simpleName");
            return simpleName;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static final class b implements InterfaceC17152f<R4.b> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f[] f31891a;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "c", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        static final class a extends Lambda implements Function0<R4.b[]> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC17152f[] f31892f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC17152f[] interfaceC17152fArr) {
                super(0);
                this.f31892f = interfaceC17152fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final R4.b[] invoke() {
                return new R4.b[this.f31892f.length];
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "R", "Ltv/g;", "", "it", "", "<anonymous>", "(Ltv/g;Lkotlin/Array;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3", f = "WorkConstraintsTracker.kt", l = {292}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: R4.i$b$b, reason: collision with other inner class name */
        public static final class C0719b extends SuspendLambda implements Function3<InterfaceC17153g<? super R4.b>, R4.b[], Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f31893a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f31894b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f31895c;

            public C0719b(Continuation continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC17153g<? super R4.b> interfaceC17153g, R4.b[] bVarArr, Continuation<? super Unit> continuation) {
                C0719b c0719b = new C0719b(continuation);
                c0719b.f31894b = interfaceC17153g;
                c0719b.f31895c = bVarArr;
                return c0719b.invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                R4.b bVar;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f31893a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17153g interfaceC17153g = (InterfaceC17153g) this.f31894b;
                    R4.b[] bVarArr = (R4.b[]) ((Object[]) this.f31895c);
                    int length = bVarArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length) {
                            bVar = bVarArr[i11];
                            if (!Intrinsics.e(bVar, b.a.f31860a)) {
                                break;
                            }
                            i11++;
                        } else {
                            bVar = null;
                            break;
                        }
                    }
                    if (bVar == null) {
                        bVar = b.a.f31860a;
                    }
                    this.f31893a = 1;
                    if (interfaceC17153g.emit(bVar, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        public b(InterfaceC17152f[] interfaceC17152fArr) {
            this.f31891a = interfaceC17152fArr;
        }

        @Override // tv.InterfaceC17152f
        public Object collect(InterfaceC17153g<? super R4.b> interfaceC17153g, Continuation continuation) {
            InterfaceC17152f[] interfaceC17152fArr = this.f31891a;
            Object objA = C17342j.a(interfaceC17153g, interfaceC17152fArr, new a(interfaceC17152fArr), new C0719b(null), continuation);
            return objA == IntrinsicsKt.f() ? objA : Unit.f142422a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(List<? extends S4.d> controllers) {
        Intrinsics.j(controllers, "controllers");
        this.controllers = controllers;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(n trackers) {
        this((List<? extends S4.d>) CollectionsKt.r(new S4.b(trackers.a()), new S4.c(trackers.getBatteryNotLowTracker()), new S4.i(trackers.e()), new S4.e(trackers.d()), new S4.h(trackers.d()), new S4.g(trackers.d()), new S4.f(trackers.d()), Build.VERSION.SDK_INT >= 28 ? j.a(trackers.getContext()) : null));
        Intrinsics.j(trackers, "trackers");
    }

    public final boolean a(WorkSpec workSpec) {
        Intrinsics.j(workSpec, "workSpec");
        List<S4.d> list = this.controllers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((S4.d) obj).a(workSpec)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            AbstractC4333v.e().a(j.f31896a, "Work " + workSpec.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String + " constrained by " + CollectionsKt.B0(arrayList, null, null, null, 0, null, a.f31890f, 31, null));
        }
        return arrayList.isEmpty();
    }

    public final InterfaceC17152f<R4.b> b(WorkSpec spec) {
        Intrinsics.j(spec, "spec");
        List<S4.d> list = this.controllers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((S4.d) obj).c(spec)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((S4.d) it.next()).b(spec.constraints));
        }
        return C17154h.r(new b((InterfaceC17152f[]) CollectionsKt.j1(arrayList2).toArray(new InterfaceC17152f[0])));
    }
}
