package G6;

import A6.k;
import G6.h;
import com.apollographql.apollo.exception.DefaultApolloException;
import gw.InterfaceC14418g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import pv.C16563h;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\"\u0018\u0010\r\u001a\u00020\n*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0018\u0010\u000f\u001a\u00020\n*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u0010"}, d2 = {"LA6/k;", "response", "Lpv/f;", "Lgw/g;", "e", "(LA6/k;)Lpv/f;", "", "contentType", "b", "(Ljava/lang/String;)Ljava/lang/String;", "", "d", "(LA6/k;)Z", "isMultipart", "c", "isGraphQLResponse", "apollo-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class g {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lpv/g;", "Lgw/g;", "", "<anonymous>", "(Lpv/g;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.apollographql.apollo.internal.MultipartKt$multipartBodyFlow$1", f = "multipart.kt", l = {29}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC16562g<? super InterfaceC14418g>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f11199a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f11200b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<h> f11201c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k f11202d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Ref.ObjectRef<h> objectRef, k kVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f11201c = objectRef;
            this.f11202d = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f11201c, this.f11202d, continuation);
            aVar.f11200b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super InterfaceC14418g> interfaceC16562g, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16562g, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [G6.h, T] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IOException {
            InterfaceC16562g interfaceC16562g;
            InterfaceC14418g body;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f11199a;
            if (i10 != 0) {
                if (i10 == 1) {
                    interfaceC16562g = (InterfaceC16562g) this.f11200b;
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16562g interfaceC16562g2 = (InterfaceC16562g) this.f11200b;
                Ref.ObjectRef<h> objectRef = this.f11201c;
                InterfaceC14418g interfaceC14418gA = this.f11202d.a();
                Intrinsics.g(interfaceC14418gA);
                String strB = g.b(A6.g.a(this.f11202d.b(), "Content-Type"));
                if (strB != null) {
                    objectRef.f143742a = new h(interfaceC14418gA, strB);
                    interfaceC16562g = interfaceC16562g2;
                } else {
                    throw new DefaultApolloException("Expected the Content-Type to have a boundary parameter", null, 2, null);
                }
            }
            do {
                h hVar = this.f11201c.f143742a;
                Intrinsics.g(hVar);
                h.b bVarH = hVar.h();
                if (bVarH == null) {
                    return Unit.f143329a;
                }
                body = bVarH.getBody();
                this.f11200b = interfaceC16562g;
                this.f11199a = 1;
            } while (interfaceC16562g.emit(body, this) != objF);
            return objF;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpv/g;", "Lgw/g;", "", "it", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.apollographql.apollo.internal.MultipartKt$multipartBodyFlow$2", f = "multipart.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class b extends SuspendLambda implements Function3<InterfaceC16562g<? super InterfaceC14418g>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f11203a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f11204b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<h> f11205c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Ref.ObjectRef<h> objectRef, Continuation<? super b> continuation) {
            super(3, continuation);
            this.f11205c = objectRef;
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super InterfaceC14418g> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
            b bVar = new b(this.f11205c, continuation);
            bVar.f11204b = interfaceC16562g;
            return bVar.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Unit unit;
            IntrinsicsKt.f();
            if (this.f11203a == 0) {
                ResultKt.b(obj);
                Ref.ObjectRef<h> objectRef = this.f11205c;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    h hVar = objectRef.f143742a;
                    if (hVar != null) {
                        hVar.close();
                        unit = Unit.f143329a;
                    } else {
                        unit = null;
                    }
                    Result.b(unit);
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.b(ResultKt.a(th2));
                }
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(String str) {
        Object next;
        List listA1;
        String str2;
        if (str == null) {
            return null;
        }
        List listA12 = StringsKt.a1(str, new char[]{';'}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listA12, 10));
        Iterator it = listA12.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.C1((String) it.next()).toString());
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (StringsKt.W((String) next, "boundary=", false, 2, null)) {
                break;
            }
        }
        String str3 = (String) next;
        if (str3 == null || (listA1 = StringsKt.a1(str3, new char[]{'='}, false, 0, 6, null)) == null || (str2 = (String) CollectionsKt.v0(listA1, 1)) == null) {
            return null;
        }
        return StringsKt.D1(str2, '\"', '\'');
    }

    public static final boolean c(k kVar) {
        Intrinsics.j(kVar, "<this>");
        String strA = A6.g.a(kVar.b(), "Content-Type");
        return strA != null && StringsKt.U(strA, "application/graphql-response+json", true);
    }

    public static final boolean d(k kVar) {
        Intrinsics.j(kVar, "<this>");
        String strA = A6.g.a(kVar.b(), "Content-Type");
        return strA != null && StringsKt.U(strA, "multipart/", true);
    }

    public static final InterfaceC16561f<InterfaceC14418g> e(k response) {
        Intrinsics.j(response, "response");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        return C16563h.N(C16563h.E(new a(objectRef, response, null)), new b(objectRef, null));
    }
}
