package r9;

import android.app.Activity;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import q9.InterfaceC16614a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B!\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00038\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lr9/a;", "Lq9/a;", "Landroid/app/Activity;", "Ljava/lang/ref/WeakReference;", "activityWeakReference", "Lr9/c;", "fallbackActivityProvider", "<init>", "(Ljava/lang/ref/WeakReference;Lr9/c;)V", "a", "()Landroid/app/Activity;", "value", "", "c", "(Landroid/app/Activity;)V", "Ljava/lang/ref/WeakReference;", "b", "Lr9/c;", "()Lr9/c;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: r9.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16874a implements InterfaceC16614a<Activity> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private WeakReference<Activity> activityWeakReference;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C16876c fallbackActivityProvider;

    public C16874a(WeakReference<Activity> activityWeakReference, C16876c fallbackActivityProvider) {
        Intrinsics.j(activityWeakReference, "activityWeakReference");
        Intrinsics.j(fallbackActivityProvider, "fallbackActivityProvider");
        this.activityWeakReference = activityWeakReference;
        this.fallbackActivityProvider = fallbackActivityProvider;
    }

    public Activity a() {
        if (this.activityWeakReference.get() == null) {
            this.activityWeakReference = new WeakReference<>(getFallbackActivityProvider().a());
        }
        return this.activityWeakReference.get();
    }

    /* renamed from: b, reason: from getter */
    public C16876c getFallbackActivityProvider() {
        return this.fallbackActivityProvider;
    }

    @Override // q9.InterfaceC16615b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void set(Activity value) {
        this.activityWeakReference = new WeakReference<>(value);
    }

    public /* synthetic */ C16874a(WeakReference weakReference, C16876c c16876c, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new WeakReference(null) : weakReference, c16876c);
    }
}
