package p2;

import android.view.View;
import android.view.ViewParent;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\b"}, d2 = {"Landroid/view/View;", "Lkotlin/sequences/Sequence;", "Landroid/view/ViewParent;", "b", "(Landroid/view/View;)Lkotlin/sequences/Sequence;", "ancestors", "a", "allViews", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: p2.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16206d0 {

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Landroid/view/View;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {HttpResponseStatus.ERROR_GONE, HttpResponseStatus.ERROR_PRECONDITION_FAILED}, m = "invokeSuspend")
    /* renamed from: p2.d0$a */
    static final class a extends RestrictedSuspendLambda implements Function2<SequenceScope<? super View>, Continuation<? super Unit>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f155381b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f155382c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f155383d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f155383d = view;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f155383d, continuation);
            aVar.f155382c = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SequenceScope<? super View> sequenceScope, Continuation<? super Unit> continuation) {
            return ((a) create(sequenceScope, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
        
            if (r1.f(r5, r4) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r4.f155381b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r5)
                goto L4f
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                java.lang.Object r1 = r4.f155382c
                kotlin.sequences.SequenceScope r1 = (kotlin.sequences.SequenceScope) r1
                kotlin.ResultKt.b(r5)
                goto L37
            L22:
                kotlin.ResultKt.b(r5)
                java.lang.Object r5 = r4.f155382c
                r1 = r5
                kotlin.sequences.SequenceScope r1 = (kotlin.sequences.SequenceScope) r1
                android.view.View r5 = r4.f155383d
                r4.f155382c = r1
                r4.f155381b = r3
                java.lang.Object r5 = r1.c(r5, r4)
                if (r5 != r0) goto L37
                goto L4e
            L37:
                android.view.View r5 = r4.f155383d
                boolean r3 = r5 instanceof android.view.ViewGroup
                if (r3 == 0) goto L4f
                android.view.ViewGroup r5 = (android.view.ViewGroup) r5
                kotlin.sequences.Sequence r5 = p2.C16204c0.c(r5)
                r3 = 0
                r4.f155382c = r3
                r4.f155381b = r2
                java.lang.Object r5 = r1.f(r5, r4)
                if (r5 != r0) goto L4f
            L4e:
                return r0
            L4f:
                kotlin.Unit r5 = kotlin.Unit.f142422a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p2.C16206d0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: p2.d0$b */
    /* synthetic */ class b extends FunctionReferenceImpl implements Function1<ViewParent, ViewParent> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f155384b = new b();

        b() {
            super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ViewParent invoke(ViewParent viewParent) {
            return viewParent.getParent();
        }
    }

    public static final Sequence<View> a(View view) {
        return SequencesKt.b(new a(view, null));
    }

    public static final Sequence<ViewParent> b(View view) {
        return SequencesKt.q(view.getParent(), b.f155384b);
    }
}
