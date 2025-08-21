package N8;

import android.app.Activity;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import pv.InterfaceC16549B;
import pv.S;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0012\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0086@¢\u0006\u0004\b\u0001\u0010\u0002\"D\u0010\t\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010\u00040\u00032\u0016\u0010\u0005\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010\u00040\u00038\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0001\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroid/app/Activity;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lpv/B;", "Ljava/lang/ref/WeakReference;", "value", "Lpv/B;", "b", "()Lpv/B;", "currentActivityFlow", "core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static InterfaceC16549B<WeakReference<Activity>> f20728a = S.a(null);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.emarsys.EmarsysSdkInitializerKt", f = "EmarsysSdkInitializer.kt", l = {24}, m = "getCurrentActivity")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f20729a;

        /* renamed from: b, reason: collision with root package name */
        int f20730b;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f20729a = obj;
            this.f20730b |= Integer.MIN_VALUE;
            return f.a(this);
        }

        a(Continuation<? super a> continuation) {
            super(continuation);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "activityReference", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.emarsys.EmarsysSdkInitializerKt$getCurrentActivity$2", f = "EmarsysSdkInitializer.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<WeakReference<Activity>, Continuation<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f20731a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f20732b;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(continuation);
            bVar.f20732b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(WeakReference<Activity> weakReference, Continuation<? super Boolean> continuation) {
            return ((b) create(weakReference, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Activity activity;
            boolean z10;
            IntrinsicsKt.f();
            if (this.f20731a == 0) {
                ResultKt.b(obj);
                WeakReference weakReference = (WeakReference) this.f20732b;
                if (weakReference != null) {
                    activity = (Activity) weakReference.get();
                } else {
                    activity = null;
                }
                if (activity != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boxing.a(z10);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(kotlin.coroutines.Continuation<? super android.app.Activity> r5) {
        /*
            boolean r0 = r5 instanceof N8.f.a
            if (r0 == 0) goto L13
            r0 = r5
            N8.f$a r0 = (N8.f.a) r0
            int r1 = r0.f20730b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20730b = r1
            goto L18
        L13:
            N8.f$a r0 = new N8.f$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f20729a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f20730b
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            kotlin.ResultKt.b(r5)
            goto L45
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L32:
            kotlin.ResultKt.b(r5)
            pv.B<java.lang.ref.WeakReference<android.app.Activity>> r5 = N8.f.f20728a
            N8.f$b r2 = new N8.f$b
            r2.<init>(r3)
            r0.f20730b = r4
            java.lang.Object r5 = pv.C16563h.B(r5, r2, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5
            if (r5 == 0) goto L50
            java.lang.Object r5 = r5.get()
            android.app.Activity r5 = (android.app.Activity) r5
            return r5
        L50:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: N8.f.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final InterfaceC16549B<WeakReference<Activity>> b() {
        return f20728a;
    }
}
