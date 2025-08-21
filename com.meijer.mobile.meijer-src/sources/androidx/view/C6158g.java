package androidx.view;

import androidx.view.AbstractC6165l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/lifecycle/g;", "Landroidx/lifecycle/p;", "Landroidx/lifecycle/f;", "defaultLifecycleObserver", "lifecycleEventObserver", "<init>", "(Landroidx/lifecycle/f;Landroidx/lifecycle/p;)V", "Landroidx/lifecycle/s;", "source", "Landroidx/lifecycle/l$a;", "event", "", "onStateChanged", "(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V", "a", "Landroidx/lifecycle/f;", "b", "Landroidx/lifecycle/p;", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: androidx.lifecycle.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6158g implements InterfaceC6169p {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6157f defaultLifecycleObserver;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6169p lifecycleEventObserver;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.g$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AbstractC6165l.a.values().length];
            try {
                iArr[AbstractC6165l.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC6165l.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC6165l.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC6165l.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC6165l.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC6165l.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC6165l.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C6158g(InterfaceC6157f defaultLifecycleObserver, InterfaceC6169p interfaceC6169p) {
        Intrinsics.j(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.defaultLifecycleObserver = defaultLifecycleObserver;
        this.lifecycleEventObserver = interfaceC6169p;
    }

    @Override // androidx.view.InterfaceC6169p
    public void onStateChanged(InterfaceC6172s source, AbstractC6165l.a event) {
        Intrinsics.j(source, "source");
        Intrinsics.j(event, "event");
        switch (a.$EnumSwitchMapping$0[event.ordinal()]) {
            case 1:
                this.defaultLifecycleObserver.onCreate(source);
                break;
            case 2:
                this.defaultLifecycleObserver.onStart(source);
                break;
            case 3:
                this.defaultLifecycleObserver.onResume(source);
                break;
            case 4:
                this.defaultLifecycleObserver.onPause(source);
                break;
            case 5:
                this.defaultLifecycleObserver.onStop(source);
                break;
            case 6:
                this.defaultLifecycleObserver.onDestroy(source);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                throw new NoWhenBranchMatchedException();
        }
        InterfaceC6169p interfaceC6169p = this.lifecycleEventObserver;
        if (interfaceC6169p != null) {
            interfaceC6169p.onStateChanged(source, event);
        }
    }
}
