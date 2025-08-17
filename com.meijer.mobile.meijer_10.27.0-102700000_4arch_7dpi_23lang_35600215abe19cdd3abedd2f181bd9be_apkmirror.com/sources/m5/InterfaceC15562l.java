package m5;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import m5.AbstractC15553c;
import qv.C16658p;
import qv.InterfaceC16654n;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ)\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0015\u001a\u00020\u0014*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006 À\u0006\u0003"}, d2 = {"Lm5/l;", "Landroid/view/View;", "T", "Lm5/j;", "Lm5/i;", "getSize", "()Lm5/i;", "Lm5/c;", "getWidth", "()Lm5/c;", "getHeight", "", "paramSize", "viewSize", "paddingSize", "o", "(III)Lm5/c;", "Landroid/view/ViewTreeObserver;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "victim", "", "p", "(Landroid/view/ViewTreeObserver;Landroid/view/ViewTreeObserver$OnPreDrawListener;)V", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getView", "()Landroid/view/View;", "view", "", "q", "()Z", "subtractPadding", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: m5.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC15562l<T extends View> extends InterfaceC15560j {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: m5.l$a */
    static final class a implements Function1<Throwable, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC15562l<T> f149855a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewTreeObserver f149856b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f149857c;

        a(InterfaceC15562l<T> interfaceC15562l, ViewTreeObserver viewTreeObserver, b bVar) {
            this.f149855a = interfaceC15562l;
            this.f149856b = viewTreeObserver;
            this.f149857c = bVar;
        }

        public final void a(Throwable th2) {
            this.f149855a.p(this.f149856b, this.f149857c);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"m5/l$b", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "", "onPreDraw", "()Z", "a", "Z", "isResumed", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: m5.l$b */
    public static final class b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean isResumed;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC15562l<T> f149859b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewTreeObserver f149860c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC16654n<Size> f149861d;

        /* JADX WARN: Multi-variable type inference failed */
        b(InterfaceC15562l<T> interfaceC15562l, ViewTreeObserver viewTreeObserver, InterfaceC16654n<? super Size> interfaceC16654n) {
            this.f149859b = interfaceC15562l;
            this.f149860c = viewTreeObserver;
            this.f149861d = interfaceC16654n;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            Size size = this.f149859b.getSize();
            if (size != null) {
                this.f149859b.p(this.f149860c, this);
                if (!this.isResumed) {
                    this.isResumed = true;
                    this.f149861d.resumeWith(Result.b(size));
                }
            }
            return true;
        }
    }

    private default AbstractC15553c o(int paramSize, int viewSize, int paddingSize) {
        if (paramSize == -2) {
            return AbstractC15553c.b.f149837a;
        }
        int i10 = paramSize - paddingSize;
        if (i10 > 0) {
            return C15551a.a(i10);
        }
        int i11 = viewSize - paddingSize;
        if (i11 > 0) {
            return C15551a.a(i11);
        }
        return null;
    }

    T getView();

    default boolean q() {
        return true;
    }

    static /* synthetic */ <T extends View> Object c(InterfaceC15562l<T> interfaceC15562l, Continuation<? super Size> continuation) {
        Size size = interfaceC15562l.getSize();
        if (size != null) {
            return size;
        }
        C16658p c16658p = new C16658p(IntrinsicsKt.c(continuation), 1);
        c16658p.C();
        ViewTreeObserver viewTreeObserver = interfaceC15562l.getView().getViewTreeObserver();
        b bVar = new b(interfaceC15562l, viewTreeObserver, c16658p);
        viewTreeObserver.addOnPreDrawListener(bVar);
        c16658p.F(new a(interfaceC15562l, viewTreeObserver, bVar));
        Object objV = c16658p.v();
        if (objV == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objV;
    }

    private default AbstractC15553c getHeight() {
        int i10;
        int paddingTop;
        ViewGroup.LayoutParams layoutParams = getView().getLayoutParams();
        if (layoutParams != null) {
            i10 = layoutParams.height;
        } else {
            i10 = -1;
        }
        int height = getView().getHeight();
        if (q()) {
            paddingTop = getView().getPaddingTop() + getView().getPaddingBottom();
        } else {
            paddingTop = 0;
        }
        return o(i10, height, paddingTop);
    }

    /* JADX INFO: Access modifiers changed from: private */
    default Size getSize() {
        AbstractC15553c height;
        AbstractC15553c width = getWidth();
        if (width == null || (height = getHeight()) == null) {
            return null;
        }
        return new Size(width, height);
    }

    private default AbstractC15553c getWidth() {
        int i10;
        int paddingLeft;
        ViewGroup.LayoutParams layoutParams = getView().getLayoutParams();
        if (layoutParams != null) {
            i10 = layoutParams.width;
        } else {
            i10 = -1;
        }
        int width = getView().getWidth();
        if (q()) {
            paddingLeft = getView().getPaddingLeft() + getView().getPaddingRight();
        } else {
            paddingLeft = 0;
        }
        return o(i10, width, paddingLeft);
    }

    /* JADX INFO: Access modifiers changed from: private */
    default void p(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        } else {
            getView().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        }
    }

    @Override // m5.InterfaceC15560j
    default Object b(Continuation<? super Size> continuation) {
        return c(this, continuation);
    }
}
