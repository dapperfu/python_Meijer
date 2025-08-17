package V;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 (2\u00020\u0001:\u0002\u000b\rB-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u0015\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0016\u0010#\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u000eR\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, d2 = {"LV/a;", "", "Landroid/content/Context;", "context", "", "spanSlop", "minSpan", "LV/a$b;", "listener", "<init>", "(Landroid/content/Context;IILV/a$b;)V", "a", "Landroid/content/Context;", "b", "I", "c", "d", "LV/a$b;", "", "e", "Z", "isQuickZoomEnabled", "()Z", "setQuickZoomEnabled", "(Z)V", "f", "isStylusZoomEnabled", "setStylusZoomEnabled", "", "g", "F", "anchoredZoomStartX", "h", "anchoredZoomStartY", "i", "anchoredZoomMode", "Landroid/view/GestureDetector;", "j", "Landroid/view/GestureDetector;", "gestureDetector", "k", "camera-view_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int spanSlop;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int minSpan;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final b listener;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isQuickZoomEnabled;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isStylusZoomEnabled;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float anchoredZoomStartX;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private float anchoredZoomStartY;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int anchoredZoomMode;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private GestureDetector gestureDetector;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"LV/a$b;", "", "camera-view_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface b {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"V/a$c", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "Landroid/view/MotionEvent;", "e", "", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", "camera-view_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends GestureDetector.SimpleOnGestureListener {
        c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent e10) {
            Intrinsics.j(e10, "e");
            a.this.anchoredZoomStartX = e10.getX();
            a.this.anchoredZoomStartY = e10.getY();
            a.this.anchoredZoomMode = 1;
            return true;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    @SuppressLint({"ExecutorRegistration"})
    public a(Context context, b listener) {
        this(context, 0, 0, listener, 6, null);
        Intrinsics.j(context, "context");
        Intrinsics.j(listener, "listener");
    }

    @JvmOverloads
    @SuppressLint({"ExecutorRegistration"})
    public a(Context context, int i10, int i11, b listener) {
        Intrinsics.j(context, "context");
        Intrinsics.j(listener, "listener");
        this.context = context;
        this.spanSlop = i10;
        this.minSpan = i11;
        this.listener = listener;
        this.isQuickZoomEnabled = true;
        this.isStylusZoomEnabled = true;
        this.gestureDetector = new GestureDetector(context, new c());
    }

    public /* synthetic */ a(Context context, int i10, int i11, b bVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? ViewConfiguration.get(context).getScaledTouchSlop() * 2 : i10, (i12 & 4) != 0 ? 0 : i11, bVar);
    }
}
