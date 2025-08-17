package androidx.room;

import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import tv.InterfaceC17140B;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/room/t;", "", "", "size", "<init>", "(I)V", "", "tableIds", "", "b", "(Ljava/util/Set;)V", "Ltv/g;", "", "collector", "", "a", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ltv/B;", "Ltv/B;", "versions", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.room.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6133t {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<int[]> versions;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.ObservedTableVersions", f = "InvalidationTracker.kt", l = {602}, m = "collect")
    /* renamed from: androidx.room.t$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f58645a;

        /* renamed from: c, reason: collision with root package name */
        int f58647c;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f58645a = obj;
            this.f58647c |= Integer.MIN_VALUE;
            return C6133t.this.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(tv.InterfaceC17153g<? super int[]> r5, kotlin.coroutines.Continuation<?> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.room.C6133t.a
            if (r0 == 0) goto L13
            r0 = r6
            androidx.room.t$a r0 = (androidx.room.C6133t.a) r0
            int r1 = r0.f58647c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58647c = r1
            goto L18
        L13:
            androidx.room.t$a r0 = new androidx.room.t$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f58645a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f58647c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            kotlin.ResultKt.b(r6)
            goto L3f
        L31:
            kotlin.ResultKt.b(r6)
            tv.B<int[]> r6 = r4.versions
            r0.f58647c = r3
            java.lang.Object r5 = r6.collect(r5, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.C6133t.a(tv.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b(Set<Integer> tableIds) {
        int[] value;
        int[] iArr;
        Intrinsics.j(tableIds, "tableIds");
        if (tableIds.isEmpty()) {
            return;
        }
        InterfaceC17140B<int[]> interfaceC17140B = this.versions;
        do {
            value = interfaceC17140B.getValue();
            int[] iArr2 = value;
            int length = iArr2.length;
            iArr = new int[length];
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = tableIds.contains(Integer.valueOf(i10)) ? iArr2[i10] + 1 : iArr2[i10];
            }
        } while (!interfaceC17140B.e(value, iArr));
    }

    public C6133t(int i10) {
        this.versions = tv.S.a(new int[i10]);
    }
}
