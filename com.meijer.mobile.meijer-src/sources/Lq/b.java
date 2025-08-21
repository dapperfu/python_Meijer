package Lq;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010\u0007\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"LLq/b;", "LLq/a;", "LNq/a;", "dataSource", "<init>", "(LNq/a;)V", "LMq/b;", "request", "", "LKq/b;", "c", "(LMq/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LMq/a;", "LKq/a;", "b", "(LMq/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LMq/c;", "LKq/c;", "a", "(LMq/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LNq/a;", "domain_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements Lq.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Nq.a dataSource;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.teacherlists.domain.repository.TeacherListsRepositoryImpl", f = "TeacherListsRepositoryImpl.kt", l = {33}, m = "getClassrooms")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f19424a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f19425b;

        /* renamed from: d, reason: collision with root package name */
        int f19427d;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19425b = obj;
            this.f19427d |= Integer.MIN_VALUE;
            return b.this.b(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.teacherlists.domain.repository.TeacherListsRepositoryImpl", f = "TeacherListsRepositoryImpl.kt", l = {28}, m = "getSchools")
    /* renamed from: Lq.b$b, reason: collision with other inner class name */
    static final class C0339b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f19428a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f19429b;

        /* renamed from: d, reason: collision with root package name */
        int f19431d;

        C0339b(Continuation<? super C0339b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19429b = obj;
            this.f19431d |= Integer.MIN_VALUE;
            return b.this.c(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.teacherlists.domain.repository.TeacherListsRepositoryImpl", f = "TeacherListsRepositoryImpl.kt", l = {39}, m = "getSupplies")
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f19432a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f19433b;

        /* renamed from: d, reason: collision with root package name */
        int f19435d;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19433b = obj;
            this.f19435d |= Integer.MIN_VALUE;
            return b.this.a(null, this);
        }
    }

    public b(Nq.a dataSource) {
        Intrinsics.j(dataSource, "dataSource");
        this.dataSource = dataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Lq.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(Mq.TeacherListsSuppliesRequest r6, kotlin.coroutines.Continuation<? super Kq.Supplies> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Lq.b.c
            if (r0 == 0) goto L13
            r0 = r7
            Lq.b$c r0 = (Lq.b.c) r0
            int r1 = r0.f19435d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19435d = r1
            goto L18
        L13:
            Lq.b$c r0 = new Lq.b$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f19433b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f19435d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f19432a
            Mq.c r6 = (Mq.TeacherListsSuppliesRequest) r6
            kotlin.ResultKt.b(r7)
            goto L4d
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.ResultKt.b(r7)
            Nq.a r7 = r5.dataSource
            int r2 = r6.getClassroomId()
            int r4 = r6.getStoreId()
            r0.f19432a = r6
            r0.f19435d = r3
            java.lang.Object r7 = r7.e(r2, r4, r0)
            if (r7 != r1) goto L4d
            return r1
        L4d:
            com.meijer.mobile.shoppinglist.teacherlists.service.response.supplies.SuppliesListResponse r7 = (com.meijer.mobile.shoppinglist.teacherlists.service.response.supplies.SuppliesListResponse) r7
            Kq.c$a r6 = Kq.Supplies.INSTANCE
            Kq.c r6 = r6.a(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Lq.b.a(Mq.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Lq.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(Mq.TeacherListsClassroomsRequest r5, kotlin.coroutines.Continuation<? super java.util.List<Kq.Classroom>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof Lq.b.a
            if (r0 == 0) goto L13
            r0 = r6
            Lq.b$a r0 = (Lq.b.a) r0
            int r1 = r0.f19427d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19427d = r1
            goto L18
        L13:
            Lq.b$a r0 = new Lq.b$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f19425b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f19427d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f19424a
            Mq.a r5 = (Mq.TeacherListsClassroomsRequest) r5
            kotlin.ResultKt.b(r6)
            goto L49
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.b(r6)
            Nq.a r6 = r4.dataSource
            int r2 = r5.getSchoolId()
            r0.f19424a = r5
            r0.f19427d = r3
            java.lang.Object r6 = r6.c(r2, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            com.meijer.mobile.shoppinglist.teacherlists.service.response.classroom.ClassroomListResponse r6 = (com.meijer.mobile.shoppinglist.teacherlists.service.response.classroom.ClassroomListResponse) r6
            Kq.a$a r5 = Kq.Classroom.INSTANCE
            java.util.List r5 = r5.a(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Lq.b.b(Mq.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Lq.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(Mq.TeacherListsSchoolsRequest r5, kotlin.coroutines.Continuation<? super java.util.List<Kq.School>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof Lq.b.C0339b
            if (r0 == 0) goto L13
            r0 = r6
            Lq.b$b r0 = (Lq.b.C0339b) r0
            int r1 = r0.f19431d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19431d = r1
            goto L18
        L13:
            Lq.b$b r0 = new Lq.b$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f19429b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f19431d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f19428a
            Mq.b r5 = (Mq.TeacherListsSchoolsRequest) r5
            kotlin.ResultKt.b(r6)
            goto L49
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.b(r6)
            Nq.a r6 = r4.dataSource
            int r2 = r5.getZipCode()
            r0.f19428a = r5
            r0.f19431d = r3
            java.lang.Object r6 = r6.d(r2, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            java.util.List r6 = (java.util.List) r6
            Kq.b$a r5 = Kq.School.INSTANCE
            java.util.List r5 = r5.a(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Lq.b.c(Mq.b, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
