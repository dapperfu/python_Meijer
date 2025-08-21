package Nq;

import com.meijer.mobile.shoppinglist.teacherlists.service.response.classroom.ClassroomListResponse;
import com.meijer.mobile.shoppinglist.teacherlists.service.response.school.SchoolResponse;
import com.meijer.mobile.shoppinglist.teacherlists.service.response.supplies.SuppliesListResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.AbstractC15779K;
import mv.C15805i;
import mv.InterfaceC15783O;
import retrofit2.HttpException;
import retrofit2.Response;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0012\u0010\u000fJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001c¨\u0006\u001d"}, d2 = {"LNq/a;", "", "LOq/a;", "teacherListsAPI", "LOq/b;", "teacherListsSuppliesAPI", "Lmv/K;", "ioDispatcher", "<init>", "(LOq/a;LOq/b;Lmv/K;)V", "", "zipCode", "", "Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/school/SchoolResponse;", "d", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "schoolId", "Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/classroom/ClassroomListResponse;", "c", "classroomId", "storeId", "Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/supplies/SuppliesListResponse;", "e", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LOq/a;", "b", "LOq/b;", "Lmv/K;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Oq.a teacherListsAPI;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Oq.b teacherListsSuppliesAPI;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/classroom/ClassroomListResponse;", "<anonymous>", "(Lmv/O;)Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/classroom/ClassroomListResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.teacherlists.service.TeacherListsDataSource$getClassrooms$2", f = "TeacherListsDataSource.kt", l = {37}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: Nq.a$a, reason: collision with other inner class name */
    static final class C0375a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super ClassroomListResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f22596a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f22598c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0375a(int i10, Continuation<? super C0375a> continuation) {
            super(2, continuation);
            this.f22598c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new C0375a(this.f22598c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super ClassroomListResponse> continuation) {
            return ((C0375a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f22596a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Oq.a aVar = a.this.teacherListsAPI;
                int i11 = this.f22598c;
                this.f22596a = 1;
                obj = aVar.a(i11, this);
                if (obj == objF) {
                    return objF;
                }
            }
            Response response = (Response) obj;
            if (response.isSuccessful()) {
                ClassroomListResponse classroomListResponse = (ClassroomListResponse) response.body();
                if (classroomListResponse != null) {
                    return classroomListResponse;
                }
                throw new IllegalStateException("Response body was null");
            }
            throw new HttpException(response);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/school/SchoolResponse;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.teacherlists.service.TeacherListsDataSource$getSchools$2", f = "TeacherListsDataSource.kt", l = {29}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends SchoolResponse>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f22599a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f22601c;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends SchoolResponse>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super List<SchoolResponse>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f22601c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new b(this.f22601c, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<SchoolResponse>> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f22599a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Oq.a aVar = a.this.teacherListsAPI;
                int i11 = this.f22601c;
                this.f22599a = 1;
                obj = aVar.b(i11, this);
                if (obj == objF) {
                    return objF;
                }
            }
            Response response = (Response) obj;
            if (response.isSuccessful()) {
                List list = (List) response.body();
                if (list != null) {
                    return list;
                }
                throw new IllegalStateException("Response body was null");
            }
            throw new HttpException(response);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/supplies/SuppliesListResponse;", "<anonymous>", "(Lmv/O;)Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/supplies/SuppliesListResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.teacherlists.service.TeacherListsDataSource$getSupplies$2", f = "TeacherListsDataSource.kt", l = {45}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super SuppliesListResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f22602a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f22604c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f22605d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i10, int i11, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f22604c = i10;
            this.f22605d = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new c(this.f22604c, this.f22605d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super SuppliesListResponse> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f22602a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Oq.b bVar = a.this.teacherListsSuppliesAPI;
                int i11 = this.f22604c;
                int i12 = this.f22605d;
                this.f22602a = 1;
                obj = bVar.a(i11, i12, this);
                if (obj == objF) {
                    return objF;
                }
            }
            Response response = (Response) obj;
            if (response.isSuccessful()) {
                SuppliesListResponse suppliesListResponse = (SuppliesListResponse) response.body();
                if (suppliesListResponse != null) {
                    return suppliesListResponse;
                }
                throw new IllegalStateException("Response body was null");
            }
            throw new HttpException(response);
        }
    }

    public a(Oq.a teacherListsAPI, Oq.b teacherListsSuppliesAPI, AbstractC15779K ioDispatcher) {
        Intrinsics.j(teacherListsAPI, "teacherListsAPI");
        Intrinsics.j(teacherListsSuppliesAPI, "teacherListsSuppliesAPI");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.teacherListsAPI = teacherListsAPI;
        this.teacherListsSuppliesAPI = teacherListsSuppliesAPI;
        this.ioDispatcher = ioDispatcher;
    }

    public final Object c(int i10, Continuation<? super ClassroomListResponse> continuation) {
        return C15805i.g(this.ioDispatcher, new C0375a(i10, null), continuation);
    }

    public final Object d(int i10, Continuation<? super List<SchoolResponse>> continuation) {
        return C15805i.g(this.ioDispatcher, new b(i10, null), continuation);
    }

    public final Object e(int i10, int i11, Continuation<? super SuppliesListResponse> continuation) {
        return C15805i.g(this.ioDispatcher, new c(i10, i11, null), continuation);
    }
}
