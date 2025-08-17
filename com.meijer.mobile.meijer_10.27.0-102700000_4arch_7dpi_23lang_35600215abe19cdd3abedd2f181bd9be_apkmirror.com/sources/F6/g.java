package F6;

import F6.h;
import com.apollographql.apollo.exception.DefaultApolloException;
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
import kw.InterfaceC15330g;
import tv.C17154h;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;
import z6.C18397g;
import z6.k;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\"\u0018\u0010\r\u001a\u00020\n*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0018\u0010\u000f\u001a\u00020\n*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u0010"}, d2 = {"Lz6/k;", "response", "Ltv/f;", "Lkw/g;", "e", "(Lz6/k;)Ltv/f;", "", "contentType", "b", "(Ljava/lang/String;)Ljava/lang/String;", "", "d", "(Lz6/k;)Z", "isMultipart", "c", "isGraphQLResponse", "apollo-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class g {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltv/g;", "Lkw/g;", "", "<anonymous>", "(Ltv/g;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.apollographql.apollo.internal.MultipartKt$multipartBodyFlow$1", f = "multipart.kt", l = {29}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC17153g<? super InterfaceC15330g>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f10278a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f10279b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<h> f10280c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k f10281d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Ref.ObjectRef<h> objectRef, k kVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f10280c = objectRef;
            this.f10281d = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f10280c, this.f10281d, continuation);
            aVar.f10279b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super InterfaceC15330g> interfaceC17153g, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC17153g, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [F6.h, T] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IOException {
            InterfaceC17153g interfaceC17153g;
            InterfaceC15330g body;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f10278a;
            if (i10 != 0) {
                if (i10 == 1) {
                    interfaceC17153g = (InterfaceC17153g) this.f10279b;
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17153g interfaceC17153g2 = (InterfaceC17153g) this.f10279b;
                Ref.ObjectRef<h> objectRef = this.f10280c;
                InterfaceC15330g interfaceC15330gA = this.f10281d.a();
                Intrinsics.g(interfaceC15330gA);
                String strB = g.b(C18397g.a(this.f10281d.b(), "Content-Type"));
                if (strB != null) {
                    objectRef.f142835a = new h(interfaceC15330gA, strB);
                    interfaceC17153g = interfaceC17153g2;
                } else {
                    throw new DefaultApolloException("Expected the Content-Type to have a boundary parameter", null, 2, null);
                }
            }
            do {
                h hVar = this.f10280c.f142835a;
                Intrinsics.g(hVar);
                h.b bVarH = hVar.h();
                if (bVarH == null) {
                    return Unit.f142422a;
                }
                body = bVarH.getBody();
                this.f10279b = interfaceC17153g;
                this.f10278a = 1;
            } while (interfaceC17153g.emit(body, this) != objF);
            return objF;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltv/g;", "Lkw/g;", "", "it", "", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.apollographql.apollo.internal.MultipartKt$multipartBodyFlow$2", f = "multipart.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class b extends SuspendLambda implements Function3<InterfaceC17153g<? super InterfaceC15330g>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f10282a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f10283b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<h> f10284c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Ref.ObjectRef<h> objectRef, Continuation<? super b> continuation) {
            super(3, continuation);
            this.f10284c = objectRef;
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super InterfaceC15330g> interfaceC17153g, Throwable th2, Continuation<? super Unit> continuation) {
            b bVar = new b(this.f10284c, continuation);
            bVar.f10283b = interfaceC17153g;
            return bVar.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Unit unit;
            IntrinsicsKt.f();
            if (this.f10282a == 0) {
                ResultKt.b(obj);
                Ref.ObjectRef<h> objectRef = this.f10284c;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    h hVar = objectRef.f142835a;
                    if (hVar != null) {
                        hVar.close();
                        unit = Unit.f142422a;
                    } else {
                        unit = null;
                    }
                    Result.b(unit);
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.b(ResultKt.a(th2));
                }
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(String str) {
        Object next;
        List listZ0;
        String str2;
        if (str == null) {
            return null;
        }
        List listZ02 = StringsKt.Z0(str, new char[]{';'}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listZ02, 10));
        Iterator it = listZ02.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.y1((String) it.next()).toString());
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
        if (str3 == null || (listZ0 = StringsKt.Z0(str3, new char[]{'='}, false, 0, 6, null)) == null || (str2 = (String) CollectionsKt.v0(listZ0, 1)) == null) {
            return null;
        }
        return StringsKt.z1(str2, '\"', '\'');
    }

    public static final boolean c(k kVar) {
        Intrinsics.j(kVar, "<this>");
        String strA = C18397g.a(kVar.b(), "Content-Type");
        return strA != null && StringsKt.U(strA, "application/graphql-response+json", true);
    }

    public static final boolean d(k kVar) {
        Intrinsics.j(kVar, "<this>");
        String strA = C18397g.a(kVar.b(), "Content-Type");
        return strA != null && StringsKt.U(strA, "multipart/", true);
    }

    public static final InterfaceC17152f<InterfaceC15330g> e(k response) {
        Intrinsics.j(response, "response");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        return C17154h.N(C17154h.E(new a(objectRef, response, null)), new b(objectRef, null));
    }
}
