package kotlin;

import androidx.compose.ui.geometry.Rect;
import i0.C14592e;
import java.util.concurrent.CancellationException;
import kotlin.C13920i;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import mv.InterfaceC15815n;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lf0/f;", "", "<init>", "()V", "Lf0/i$a;", "request", "", "c", "(Lf0/i$a;)Z", "", "d", "", "cause", "b", "(Ljava/lang/Throwable;)V", "LD0/c;", "a", "LD0/c;", "requests", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: f0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13917f {

    /* renamed from: b, reason: collision with root package name */
    public static final int f131187b = D0.c.f5876d;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final D0.c<C13920i.a> requests = new D0.c<>(new C13920i.a[16], 0);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: f0.f$a */
    static final class a extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C13920i.a f131190g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C13920i.a aVar) {
            super(1);
            this.f131190g = aVar;
        }

        public final void a(Throwable th2) {
            C13917f.this.requests.s(this.f131190g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f143329a;
        }
    }

    public final void b(Throwable cause) {
        D0.c<C13920i.a> cVar = this.requests;
        int size = cVar.getSize();
        InterfaceC15815n[] interfaceC15815nArr = new InterfaceC15815n[size];
        for (int i10 = 0; i10 < size; i10++) {
            interfaceC15815nArr[i10] = cVar.content[i10].a();
        }
        for (int i11 = 0; i11 < size; i11++) {
            interfaceC15815nArr[i11].N(cause);
        }
        if (this.requests.getSize() == 0) {
            return;
        }
        C14592e.c("uncancelled requests present");
    }

    public final void d() {
        IntRange intRangeX = RangesKt.x(0, this.requests.getSize());
        int first = intRangeX.getFirst();
        int last = intRangeX.getLast();
        if (first <= last) {
            while (true) {
                this.requests.content[first].a().resumeWith(Result.b(Unit.f143329a));
                if (first == last) {
                    break;
                } else {
                    first++;
                }
            }
        }
        this.requests.k();
    }

    public final boolean c(C13920i.a request) {
        Rect rectInvoke = request.b().invoke();
        if (rectInvoke == null) {
            InterfaceC15815n<Unit> interfaceC15815nA = request.a();
            Result.Companion companion = Result.INSTANCE;
            interfaceC15815nA.resumeWith(Result.b(Unit.f143329a));
            return false;
        }
        request.a().F(new a(request));
        IntRange intRangeX = RangesKt.x(0, this.requests.getSize());
        int first = intRangeX.getFirst();
        int last = intRangeX.getLast();
        if (first <= last) {
            while (true) {
                Rect rectInvoke2 = this.requests.content[last].b().invoke();
                if (rectInvoke2 != null) {
                    Rect rectP = rectInvoke.p(rectInvoke2);
                    if (Intrinsics.e(rectP, rectInvoke)) {
                        this.requests.a(last + 1, request);
                        return true;
                    }
                    if (!Intrinsics.e(rectP, rectInvoke2)) {
                        CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                        int size = this.requests.getSize() - 1;
                        if (size <= last) {
                            while (true) {
                                this.requests.content[last].a().N(cancellationException);
                                if (size == last) {
                                    break;
                                }
                                size++;
                            }
                        }
                    }
                }
                if (last == first) {
                    break;
                }
                last--;
            }
        }
        this.requests.a(0, request);
        return true;
    }
}
