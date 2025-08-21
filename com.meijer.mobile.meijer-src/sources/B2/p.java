package B2;

import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LB2/p;", "T", "LB2/m;", "LB2/O;", "Ljava/io/File;", "file", "LB2/D;", "serializer", "<init>", "(Ljava/io/File;LB2/D;)V", "value", "", "a", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class p<T> extends C2916m<T> implements O<T> {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.FileWriteScope", f = "FileStorage.kt", l = {HttpResponseStatus.SUCCESS_CREATED}, m = "writeData")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f2451a;

        /* renamed from: b, reason: collision with root package name */
        Object f2452b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f2453c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ p<T> f2454d;

        /* renamed from: e, reason: collision with root package name */
        int f2455e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p<T> pVar, Continuation<? super a> continuation) {
            super(continuation);
            this.f2454d = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2453c = obj;
            this.f2455e |= Integer.MIN_VALUE;
            return this.f2454d.a(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(File file, D<T> serializer) {
        super(file, serializer);
        Intrinsics.j(file, "file");
        Intrinsics.j(serializer, "serializer");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // B2.O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(T r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof B2.p.a
            if (r0 == 0) goto L13
            r0 = r7
            B2.p$a r0 = (B2.p.a) r0
            int r1 = r0.f2455e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2455e = r1
            goto L18
        L13:
            B2.p$a r0 = new B2.p$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f2453c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f2455e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.f2452b
            java.io.FileOutputStream r6 = (java.io.FileOutputStream) r6
            java.lang.Object r0 = r0.f2451a
            java.io.Closeable r0 = (java.io.Closeable) r0
            kotlin.ResultKt.b(r7)     // Catch: java.lang.Throwable -> L31
            goto L62
        L31:
            r6 = move-exception
            goto L74
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            kotlin.ResultKt.b(r7)
            r5.f()
            java.io.FileOutputStream r7 = new java.io.FileOutputStream
            java.io.File r2 = r5.getFile()
            r7.<init>(r2)
            B2.D r2 = r5.h()     // Catch: java.lang.Throwable -> L72
            B2.M r4 = new B2.M     // Catch: java.lang.Throwable -> L72
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L72
            r0.f2451a = r7     // Catch: java.lang.Throwable -> L72
            r0.f2452b = r7     // Catch: java.lang.Throwable -> L72
            r0.f2455e = r3     // Catch: java.lang.Throwable -> L72
            java.lang.Object r6 = r2.b(r6, r4, r0)     // Catch: java.lang.Throwable -> L72
            if (r6 != r1) goto L60
            return r1
        L60:
            r6 = r7
            r0 = r6
        L62:
            java.io.FileDescriptor r6 = r6.getFD()     // Catch: java.lang.Throwable -> L31
            r6.sync()     // Catch: java.lang.Throwable -> L31
            kotlin.Unit r6 = kotlin.Unit.f143329a     // Catch: java.lang.Throwable -> L31
            r6 = 0
            kotlin.io.CloseableKt.a(r0, r6)
            kotlin.Unit r6 = kotlin.Unit.f143329a
            return r6
        L72:
            r6 = move-exception
            r0 = r7
        L74:
            throw r6     // Catch: java.lang.Throwable -> L75
        L75:
            r7 = move-exception
            kotlin.io.CloseableKt.a(r0, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.p.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
