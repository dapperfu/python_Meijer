package androidx.compose.foundation.relocation;

import androidx.compose.ui.geometry.Rect;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p0.InterfaceC16183a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/relocation/a;", "Lp0/a;", "<init>", "()V", "Landroidx/compose/ui/geometry/Rect;", "rect", "", "b", "(Landroidx/compose/ui/geometry/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LD0/c;", "Landroidx/compose/foundation/relocation/d;", "a", "LD0/c;", "c", "()LD0/c;", "nodes", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class a implements InterfaceC16183a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final D0.c<d> nodes = new D0.c<>(new d[16], 0);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", f = "BringIntoViewRequester.kt", l = {HttpResponseStatus.INFORMATIONAL_CONTINUE}, m = "bringIntoView")
    /* renamed from: androidx.compose.foundation.relocation.a$a, reason: collision with other inner class name */
    static final class C1002a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f48899a;

        /* renamed from: b, reason: collision with root package name */
        Object f48900b;

        /* renamed from: c, reason: collision with root package name */
        int f48901c;

        /* renamed from: d, reason: collision with root package name */
        int f48902d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f48903e;

        /* renamed from: g, reason: collision with root package name */
        int f48905g;

        C1002a(Continuation<? super C1002a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f48903e = obj;
            this.f48905g |= Integer.MIN_VALUE;
            return a.this.b(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/geometry/Rect;", "c", "()Landroidx/compose/ui/geometry/Rect;"}, k = 3, mv = {1, 9, 0})
    static final class b extends Lambda implements Function0<Rect> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Rect f48906f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Rect rect) {
            super(0);
            this.f48906f = rect;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Rect invoke() {
            return this.f48906f;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0069 -> B:19:0x006c). Please report as a decompilation issue!!! */
    @Override // p0.InterfaceC16183a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(androidx.compose.ui.geometry.Rect r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.compose.foundation.relocation.a.C1002a
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.relocation.a$a r0 = (androidx.compose.foundation.relocation.a.C1002a) r0
            int r1 = r0.f48905g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f48905g = r1
            goto L18
        L13:
            androidx.compose.foundation.relocation.a$a r0 = new androidx.compose.foundation.relocation.a$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f48903e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f48905g
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r9 = r0.f48902d
            int r2 = r0.f48901c
            java.lang.Object r4 = r0.f48900b
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r5 = r0.f48899a
            androidx.compose.ui.geometry.Rect r5 = (androidx.compose.ui.geometry.Rect) r5
            kotlin.ResultKt.b(r10)
            r10 = r5
            goto L6c
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            kotlin.ResultKt.b(r10)
            D0.c<androidx.compose.foundation.relocation.d> r10 = r8.nodes
            T[] r2 = r10.content
            int r10 = r10.getSize()
            r4 = 0
            r7 = r10
            r10 = r9
            r9 = r7
            r7 = r4
            r4 = r2
            r2 = r7
        L50:
            if (r2 >= r9) goto L6e
            r5 = r4[r2]
            androidx.compose.foundation.relocation.d r5 = (androidx.compose.foundation.relocation.d) r5
            androidx.compose.foundation.relocation.a$b r6 = new androidx.compose.foundation.relocation.a$b
            r6.<init>(r10)
            r0.f48899a = r10
            r0.f48900b = r4
            r0.f48901c = r2
            r0.f48902d = r9
            r0.f48905g = r3
            java.lang.Object r5 = o1.C15992b.a(r5, r6, r0)
            if (r5 != r1) goto L6c
            return r1
        L6c:
            int r2 = r2 + r3
            goto L50
        L6e:
            kotlin.Unit r9 = kotlin.Unit.f142422a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.relocation.a.b(androidx.compose.ui.geometry.Rect, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final D0.c<d> c() {
        return this.nodes;
    }
}
