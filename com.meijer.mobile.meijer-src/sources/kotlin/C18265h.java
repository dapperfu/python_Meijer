package kotlin;

import C1.t;
import Z.W;
import Z.i0;
import androidx.collection.LruCache;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0016\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010JJ\u0010\u0014\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u001e\u0010\u0013\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000e0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010#\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Ly1/h;", "", "<init>", "()V", "Ly1/k;", "font", "Ly1/I;", "platformFontLoader", "result", "", "forever", "", "e", "(Ly1/k;Ly1/I;Ljava/lang/Object;Z)V", "Ly1/h$a;", "d", "(Ly1/k;Ly1/I;)Ly1/h$a;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "block", "g", "(Ly1/k;Ly1/I;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Ljava/lang/Object;", "PermanentFailure", "Landroidx/collection/LruCache;", "Ly1/h$b;", "b", "Landroidx/collection/LruCache;", "resultCache", "LZ/W;", "c", "LZ/W;", "permanentCache", "LC1/t;", "LC1/t;", "cacheLock", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: y1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18265h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object PermanentFailure = a.b(null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final LruCache<Key, a> resultCache = new LruCache<>(16);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final W<Key, a> permanentCache = i0.c();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t cacheLock = new t();

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081@\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0088\u0001\u0002\u0092\u0001\u0004\u0018\u00010\u0001¨\u0006\u0016"}, d2 = {"Ly1/h$a;", "", "result", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "f", "(Ljava/lang/Object;)Ljava/lang/String;", "", "d", "(Ljava/lang/Object;)I", "other", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getResult", "()Ljava/lang/Object;", "e", "(Ljava/lang/Object;)Z", "isPermanentFailure", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    /* renamed from: y1.h$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Object result;

        public static Object b(Object obj) {
            return obj;
        }

        public static final /* synthetic */ a a(Object obj) {
            return new a(obj);
        }

        public static boolean c(Object obj, Object obj2) {
            return (obj2 instanceof a) && Intrinsics.e(obj, ((a) obj2).getResult());
        }

        public static int d(Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public static final boolean e(Object obj) {
            return obj == null;
        }

        public static String f(Object obj) {
            return "AsyncTypefaceResult(result=" + obj + ')';
        }

        public boolean equals(Object obj) {
            return c(this.result, obj);
        }

        /* renamed from: g, reason: from getter */
        public final /* synthetic */ Object getResult() {
            return this.result;
        }

        public int hashCode() {
            return d(this.result);
        }

        public String toString() {
            return f(this.result);
        }

        private /* synthetic */ a(Object obj) {
            this.result = obj;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Ly1/h$b;", "", "Ly1/k;", "font", "loaderKey", "<init>", "(Ly1/k;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ly1/k;", "getFont", "()Ly1/k;", "b", "Ljava/lang/Object;", "getLoaderKey", "()Ljava/lang/Object;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: y1.h$b, reason: from toString */
    public static final /* data */ class Key {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final InterfaceC18268k font;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object loaderKey;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Key)) {
                return false;
            }
            Key key = (Key) other;
            return Intrinsics.e(this.font, key.font) && Intrinsics.e(this.loaderKey, key.loaderKey);
        }

        public int hashCode() {
            int iHashCode = this.font.hashCode() * 31;
            Object obj = this.loaderKey;
            return iHashCode + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            return "Key(font=" + this.font + ", loaderKey=" + this.loaderKey + ')';
        }

        public Key(InterfaceC18268k interfaceC18268k, Object obj) {
            this.font = interfaceC18268k;
            this.loaderKey = obj;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.text.font.AsyncTypefaceCache", f = "FontListFontFamilyTypefaceAdapter.kt", l = {HttpResponseStatus.ERROR_PRECONDITION_FAILED}, m = "runCached")
    /* renamed from: y1.h$c */
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f171137a;

        /* renamed from: b, reason: collision with root package name */
        Object f171138b;

        /* renamed from: c, reason: collision with root package name */
        boolean f171139c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f171140d;

        /* renamed from: f, reason: collision with root package name */
        int f171142f;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f171140d = obj;
            this.f171142f |= Integer.MIN_VALUE;
            return C18265h.this.g(null, null, false, null, this);
        }
    }

    public static /* synthetic */ void f(C18265h c18265h, InterfaceC18268k interfaceC18268k, InterfaceC18242I interfaceC18242I, Object obj, boolean z10, int i10, Object obj2) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        c18265h.e(interfaceC18268k, interfaceC18242I, obj, z10);
    }

    public final a d(InterfaceC18268k font, InterfaceC18242I platformFontLoader) {
        a aVarD;
        Key key = new Key(font, platformFontLoader.a());
        synchronized (this.cacheLock) {
            aVarD = this.resultCache.d(key);
            if (aVarD == null) {
                aVarD = this.permanentCache.e(key);
            }
        }
        return aVarD;
    }

    public final void e(InterfaceC18268k font, InterfaceC18242I platformFontLoader, Object result, boolean forever) {
        Key key = new Key(font, platformFontLoader.a());
        synchronized (this.cacheLock) {
            try {
                if (result == null) {
                    this.permanentCache.x(key, a.a(this.PermanentFailure));
                    Unit unit = Unit.f143329a;
                } else if (forever) {
                    this.permanentCache.x(key, a.a(a.b(result)));
                    Unit unit2 = Unit.f143329a;
                } else {
                    this.resultCache.f(key, a.a(a.b(result)));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(kotlin.InterfaceC18268k r5, kotlin.InterfaceC18242I r6, boolean r7, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<java.lang.Object>, ? extends java.lang.Object> r8, kotlin.coroutines.Continuation<java.lang.Object> r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof kotlin.C18265h.c
            if (r0 == 0) goto L13
            r0 = r9
            y1.h$c r0 = (kotlin.C18265h.c) r0
            int r1 = r0.f171142f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f171142f = r1
            goto L18
        L13:
            y1.h$c r0 = new y1.h$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f171140d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f171142f
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            boolean r7 = r0.f171139c
            java.lang.Object r5 = r0.f171138b
            y1.h$b r5 = (kotlin.C18265h.Key) r5
            java.lang.Object r6 = r0.f171137a
            y1.h r6 = (kotlin.C18265h) r6
            kotlin.ResultKt.b(r9)
            goto L7d
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            kotlin.ResultKt.b(r9)
            y1.h$b r9 = new y1.h$b
            java.lang.Object r6 = r6.a()
            r9.<init>(r5, r6)
            C1.t r5 = r4.cacheLock
            monitor-enter(r5)
            androidx.collection.LruCache<y1.h$b, y1.h$a> r6 = r4.resultCache     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r6 = r6.d(r9)     // Catch: java.lang.Throwable -> L5d
            y1.h$a r6 = (kotlin.C18265h.a) r6     // Catch: java.lang.Throwable -> L5d
            if (r6 != 0) goto L5f
            Z.W<y1.h$b, y1.h$a> r6 = r4.permanentCache     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r6 = r6.e(r9)     // Catch: java.lang.Throwable -> L5d
            y1.h$a r6 = (kotlin.C18265h.a) r6     // Catch: java.lang.Throwable -> L5d
            goto L5f
        L5d:
            r6 = move-exception
            goto Lb3
        L5f:
            if (r6 == 0) goto L67
            java.lang.Object r6 = r6.getResult()     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r5)
            return r6
        L67:
            kotlin.Unit r6 = kotlin.Unit.f143329a     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r5)
            r0.f171137a = r4
            r0.f171138b = r9
            r0.f171139c = r7
            r0.f171142f = r3
            java.lang.Object r5 = r8.invoke(r0)
            if (r5 != r1) goto L79
            return r1
        L79:
            r6 = r9
            r9 = r5
            r5 = r6
            r6 = r4
        L7d:
            C1.t r8 = r6.cacheLock
            monitor-enter(r8)
            if (r9 != 0) goto L90
            Z.W<y1.h$b, y1.h$a> r7 = r6.permanentCache     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r6 = r6.PermanentFailure     // Catch: java.lang.Throwable -> L8e
            y1.h$a r6 = kotlin.C18265h.a.a(r6)     // Catch: java.lang.Throwable -> L8e
            r7.x(r5, r6)     // Catch: java.lang.Throwable -> L8e
            goto Lad
        L8e:
            r5 = move-exception
            goto Lb1
        L90:
            if (r7 == 0) goto La0
            Z.W<y1.h$b, y1.h$a> r6 = r6.permanentCache     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r7 = kotlin.C18265h.a.b(r9)     // Catch: java.lang.Throwable -> L8e
            y1.h$a r7 = kotlin.C18265h.a.a(r7)     // Catch: java.lang.Throwable -> L8e
            r6.x(r5, r7)     // Catch: java.lang.Throwable -> L8e
            goto Lad
        La0:
            androidx.collection.LruCache<y1.h$b, y1.h$a> r6 = r6.resultCache     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r7 = kotlin.C18265h.a.b(r9)     // Catch: java.lang.Throwable -> L8e
            y1.h$a r7 = kotlin.C18265h.a.a(r7)     // Catch: java.lang.Throwable -> L8e
            r6.f(r5, r7)     // Catch: java.lang.Throwable -> L8e
        Lad:
            kotlin.Unit r5 = kotlin.Unit.f143329a     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r8)
            return r9
        Lb1:
            monitor-exit(r8)
            throw r5
        Lb3:
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C18265h.g(y1.k, y1.I, boolean, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
