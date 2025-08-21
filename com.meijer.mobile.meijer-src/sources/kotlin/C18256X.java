package kotlin;

import C1.t;
import androidx.collection.LruCache;
import androidx.compose.runtime.z1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u001e\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014¨\u0006\u0016"}, d2 = {"Ly1/X;", "", "<init>", "()V", "Ly1/W;", "typefaceRequest", "Lkotlin/Function1;", "Ly1/Y;", "", "resolveTypeface", "Landroidx/compose/runtime/z1;", "c", "(Ly1/W;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/z1;", "LC1/t;", "a", "LC1/t;", "b", "()LC1/t;", "lock", "Landroidx/collection/LruCache;", "Landroidx/collection/LruCache;", "resultCache", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: y1.X, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18256X {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t lock = new t();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final LruCache<TypefaceRequest, InterfaceC18257Y> resultCache = new LruCache<>(16);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly1/Y;", "finalResult", "", "a", "(Ly1/Y;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: y1.X$a */
    static final class a extends Lambda implements Function1<InterfaceC18257Y, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ TypefaceRequest f171090g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(TypefaceRequest typefaceRequest) {
            super(1);
            this.f171090g = typefaceRequest;
        }

        public final void a(InterfaceC18257Y interfaceC18257Y) {
            t lock = C18256X.this.getLock();
            C18256X c18256x = C18256X.this;
            TypefaceRequest typefaceRequest = this.f171090g;
            synchronized (lock) {
                try {
                    if (interfaceC18257Y.getCacheable()) {
                        c18256x.resultCache.f(typefaceRequest, interfaceC18257Y);
                    } else {
                        c18256x.resultCache.g(typefaceRequest);
                    }
                    Unit unit = Unit.f143329a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC18257Y interfaceC18257Y) {
            a(interfaceC18257Y);
            return Unit.f143329a;
        }
    }

    /* renamed from: b, reason: from getter */
    public final t getLock() {
        return this.lock;
    }

    public final z1<Object> c(TypefaceRequest typefaceRequest, Function1<? super Function1<? super InterfaceC18257Y, Unit>, ? extends InterfaceC18257Y> resolveTypeface) {
        synchronized (this.lock) {
            InterfaceC18257Y interfaceC18257YD = this.resultCache.d(typefaceRequest);
            if (interfaceC18257YD != null) {
                if (interfaceC18257YD.getCacheable()) {
                    return interfaceC18257YD;
                }
                this.resultCache.g(typefaceRequest);
            }
            try {
                InterfaceC18257Y interfaceC18257YInvoke = resolveTypeface.invoke(new a(typefaceRequest));
                synchronized (this.lock) {
                    try {
                        if (this.resultCache.d(typefaceRequest) == null && interfaceC18257YInvoke.getCacheable()) {
                            this.resultCache.f(typefaceRequest, interfaceC18257YInvoke);
                        }
                        Unit unit = Unit.f143329a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return interfaceC18257YInvoke;
            } catch (Exception e10) {
                throw new IllegalStateException("Could not load font", e10);
            }
        }
    }
}
