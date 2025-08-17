package s4;

import androidx.room.G;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import tv.C17154h;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;
import z4.InterfaceC18380b;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\bH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"R", "Landroidx/room/G;", "db", "", "inTransaction", "", "", "tableNames", "Lkotlin/Function1;", "Lz4/b;", "block", "Ltv/f;", "a", "(Landroidx/room/G;Z[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ltv/f;", "room-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class j {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a<R> implements InterfaceC17152f<R> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f f160114a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ G f160115b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f160116c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f160117d;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        @SourceDebugExtension
        /* renamed from: s4.j$a$a, reason: collision with other inner class name */
        public static final class C2497a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC17153g f160118a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ G f160119b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f160120c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function1 f160121d;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1$2", f = "FlowBuilder.kt", l = {224, 223}, m = "emit")
            /* renamed from: s4.j$a$a$a, reason: collision with other inner class name */
            public static final class C2498a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f160122a;

                /* renamed from: b, reason: collision with root package name */
                int f160123b;

                /* renamed from: c, reason: collision with root package name */
                Object f160124c;

                public C2498a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f160122a = obj;
                    this.f160123b |= Integer.MIN_VALUE;
                    return C2497a.this.emit(null, this);
                }
            }

            public C2497a(InterfaceC17153g interfaceC17153g, G g10, boolean z10, Function1 function1) {
                this.f160118a = interfaceC17153g;
                this.f160119b = g10;
                this.f160120c = z10;
                this.f160121d = function1;
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
            
                if (r8.emit(r9, r0) == r1) goto L22;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // tv.InterfaceC17153g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof s4.j.a.C2497a.C2498a
                    if (r0 == 0) goto L13
                    r0 = r9
                    s4.j$a$a$a r0 = (s4.j.a.C2497a.C2498a) r0
                    int r1 = r0.f160123b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f160123b = r1
                    goto L18
                L13:
                    s4.j$a$a$a r0 = new s4.j$a$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f160122a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f160123b
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    kotlin.ResultKt.b(r9)
                    goto L63
                L2c:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L34:
                    java.lang.Object r8 = r0.f160124c
                    tv.g r8 = (tv.InterfaceC17153g) r8
                    kotlin.ResultKt.b(r9)
                    goto L57
                L3c:
                    kotlin.ResultKt.b(r9)
                    tv.g r9 = r7.f160118a
                    java.util.Set r8 = (java.util.Set) r8
                    androidx.room.G r8 = r7.f160119b
                    boolean r2 = r7.f160120c
                    kotlin.jvm.functions.Function1 r5 = r7.f160121d
                    r0.f160124c = r9
                    r0.f160123b = r4
                    java.lang.Object r8 = w4.C17754b.f(r8, r4, r2, r5, r0)
                    if (r8 != r1) goto L54
                    goto L62
                L54:
                    r6 = r9
                    r9 = r8
                    r8 = r6
                L57:
                    r2 = 0
                    r0.f160124c = r2
                    r0.f160123b = r3
                    java.lang.Object r8 = r8.emit(r9, r0)
                    if (r8 != r1) goto L63
                L62:
                    return r1
                L63:
                    kotlin.Unit r8 = kotlin.Unit.f142422a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: s4.j.a.C2497a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(InterfaceC17152f interfaceC17152f, G g10, boolean z10, Function1 function1) {
            this.f160114a = interfaceC17152f;
            this.f160115b = g10;
            this.f160116c = z10;
            this.f160117d = function1;
        }

        @Override // tv.InterfaceC17152f
        public Object collect(InterfaceC17153g interfaceC17153g, Continuation continuation) {
            Object objCollect = this.f160114a.collect(new C2497a(interfaceC17153g, this.f160115b, this.f160116c, this.f160117d), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
        }
    }

    public static final <R> InterfaceC17152f<R> a(G db2, boolean z10, String[] tableNames, Function1<? super InterfaceC18380b, ? extends R> block) {
        Intrinsics.j(db2, "db");
        Intrinsics.j(tableNames, "tableNames");
        Intrinsics.j(block, "block");
        return new a(C17154h.o(db2.getInvalidationTracker().l((String[]) Arrays.copyOf(tableNames, tableNames.length), true)), db2, z10, block);
    }
}
