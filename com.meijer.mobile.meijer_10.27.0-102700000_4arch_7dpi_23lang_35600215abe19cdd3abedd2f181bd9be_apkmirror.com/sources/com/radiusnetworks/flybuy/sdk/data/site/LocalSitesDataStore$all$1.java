package com.radiusnetworks.flybuy.sdk.data.site;

import com.radiusnetworks.flybuy.sdk.data.room.domain.Site;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import qv.C0;
import qv.C16623P;
import qv.C16639f0;
import qv.C16648k;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Site;", "<anonymous>", "(Lqv/O;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.data.site.LocalSitesDataStore$all$1", f = "LocalSitesDataStore.kt", l = {20}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class LocalSitesDataStore$all$1 extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super List<? extends Site>>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ LocalSitesDataStore this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.data.site.LocalSitesDataStore$all$1$1", f = "LocalSitesDataStore.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.radiusnetworks.flybuy.sdk.data.site.LocalSitesDataStore$all$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<List<Site>> $sites;
        int label;
        final /* synthetic */ LocalSitesDataStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.ObjectRef<List<Site>> objectRef, LocalSitesDataStore localSitesDataStore, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$sites = objectRef;
            this.this$0 = localSitesDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$sites, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [T, java.util.List] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.label == 0) {
                ResultKt.b(obj);
                this.$sites.f142835a = this.this$0.db.siteDao$core_defaultRelease().all();
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalSitesDataStore$all$1(LocalSitesDataStore localSitesDataStore, Continuation<? super LocalSitesDataStore$all$1> continuation) {
        super(2, continuation);
        this.this$0 = localSitesDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LocalSitesDataStore$all$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super List<? extends Site>> continuation) {
        return invoke2(interfaceC16622O, (Continuation<? super List<Site>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super List<Site>> continuation) {
        return ((LocalSitesDataStore$all$1) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef objectRef;
        Object objF = IntrinsicsKt.f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                objectRef = (Ref.ObjectRef) this.L$0;
                ResultKt.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.b(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            C0 c0D = C16648k.d(C16623P.a(C16639f0.b()), null, null, new AnonymousClass1(objectRef2, this.this$0, null), 3, null);
            this.L$0 = objectRef2;
            this.label = 1;
            if (c0D.n0(this) == objF) {
                return objF;
            }
            objectRef = objectRef2;
        }
        List list = (List) objectRef.f142835a;
        if (list == null) {
            return CollectionsKt.m();
        }
        return list;
    }
}
